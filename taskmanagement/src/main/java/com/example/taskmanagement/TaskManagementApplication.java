package com.example.taskmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class TaskManagementApplication {

    // Método principal que arranca la aplicación Spring Boot
    public static void main(String[] args) {
        // Arranca la aplicación Spring Boot
        SpringApplication.run(TaskManagementApplication.class, args);

        // Intentar abrir el navegador web en la URL http://localhost:8080
        openBrowser("http://localhost:8080");
    }

    // Método para abrir el navegador utilizando ProcessBuilder
    public static void openBrowser(String url) {
        String os = System.getProperty("os.name").toLowerCase();
        Runtime rt = Runtime.getRuntime();

        try {
            if (os.contains("win")) {
                rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else if (os.contains("mac")) {
                rt.exec("open " + url);
            } else if (os.contains("nix") || os.contains("nux")) {
                String[] browsers = {"xdg-open", "google-chrome", "firefox"};
                String browser = null;

                for (String b : browsers) {
                    if (rt.exec(new String[]{"which", b}).getInputStream().read() != -1) {
                        browser = b;
                        break;
                    }
                }

                if (browser != null) {
                    rt.exec(new String[]{browser, url});
                } else {
                    System.out.println("Navegador no encontrado. No se puede abrir el navegador automáticamente.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
