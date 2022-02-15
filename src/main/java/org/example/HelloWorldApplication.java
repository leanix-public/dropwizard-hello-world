package org.example;

import dagger.internal.DaggerGenerated;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    HelloWorldComponent helloWorldComponent;

    public static void main(final String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloWorld";
    }

    @Override
    public void initialize(final Bootstrap<HelloWorldConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloWorldConfiguration configuration,
                    final Environment environment) {

        HelloWorldModule helloWorldModule = new HelloWorldModule();
        helloWorldComponent = DaggerHelloWorldComponent.builder()
                .helloWorldModule(helloWorldModule)
                .build();

        environment.jersey().register(helloWorldComponent.provideHelloWorldResource());
    }

}
