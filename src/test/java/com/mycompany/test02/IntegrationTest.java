package com.mycompany.test02;

import com.mycompany.test02.Test02App;
import com.mycompany.test02.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { Test02App.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
