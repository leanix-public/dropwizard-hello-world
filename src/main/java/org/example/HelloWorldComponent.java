package org.example;

import dagger.Component;
import org.example.resources.HelloWorldResource;

@Component(modules = HelloWorldModule.class)
public interface HelloWorldComponent {

    HelloWorldResource provideHelloWorldResource();
}
