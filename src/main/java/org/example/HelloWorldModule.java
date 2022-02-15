package org.example;

import dagger.Module;
import dagger.Provides;
import org.example.core.service.UserService;
import org.example.core.service.UserServiceImpl;

@Module
public class HelloWorldModule {

    @Provides
    UserService provideUserServiceImpl() {
        return new UserServiceImpl();
    }

    @Provides
    HelloWorldConfiguration provideHelloWorldConfiguration() {
        return new HelloWorldConfiguration();
    }
}
