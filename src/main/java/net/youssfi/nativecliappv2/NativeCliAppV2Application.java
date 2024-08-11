package net.youssfi.nativecliappv2;

import net.youssfi.nativecliappv2.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.command.annotation.CommandScan;
import org.springframework.shell.command.annotation.EnableCommand;

@SpringBootApplication
public class NativeCliAppV2Application {

    public static void main(String[] args) {
        SpringApplication.run(NativeCliAppV2Application.class, args);
    }

}
