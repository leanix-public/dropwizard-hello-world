package org.example;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

/**
 * This class loads any configuration from config.yaml
 */
@Data
public class HelloWorldConfiguration extends Configuration {

    @NotEmpty
    private String env;

}
