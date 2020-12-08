package tr.gov.csb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Nufus ve Vatandaslik Web Servisini kullanarak girilen verilerin dogrulugunu kontrol eden uygulamadir.
 */
@SpringBootApplication
public class KimlikDogrulamaApplication {
    public static void main(String[] args) {
        SpringApplication.run(KimlikDogrulamaApplication.class, args);
    }
}