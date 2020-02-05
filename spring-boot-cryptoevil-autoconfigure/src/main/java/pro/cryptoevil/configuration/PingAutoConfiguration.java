package pro.cryptoevil.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.cryptoevil.service.PingService;

@Configuration
@ConditionalOnClass(PingService.class)
@ConditionalOnMissingBean(PingService.class)
public class PingAutoConfiguration {

    @Bean
    PingService pingService() {
        return new PingService();
    }
}
