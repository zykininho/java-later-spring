package ru.practicum.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration // помечает класс как java-config для контекста приложения
@PropertySource("classpath:application.properties")
@EnableWebMvc  // призывает импортировать дополнительную конфигурацию для веб-приложений
public class WebConfig {
}