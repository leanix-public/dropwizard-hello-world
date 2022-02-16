package org.example;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HelloWorldModule_ProvideHelloWorldConfigurationFactory implements Factory<HelloWorldConfiguration> {
  private final HelloWorldModule module;

  public HelloWorldModule_ProvideHelloWorldConfigurationFactory(HelloWorldModule module) {
    this.module = module;
  }

  @Override
  public HelloWorldConfiguration get() {
    return provideHelloWorldConfiguration(module);
  }

  public static HelloWorldModule_ProvideHelloWorldConfigurationFactory create(
      HelloWorldModule module) {
    return new HelloWorldModule_ProvideHelloWorldConfigurationFactory(module);
  }

  public static HelloWorldConfiguration provideHelloWorldConfiguration(HelloWorldModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideHelloWorldConfiguration());
  }
}
