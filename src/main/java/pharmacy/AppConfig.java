package pharmacy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pharmacy.adapter.AllowXSSFilter;

@Configuration
public class AppConfig {

    @Bean
    public AllowXSSFilter allowXssFilter() {
        return new AllowXSSFilter();
    }

}
