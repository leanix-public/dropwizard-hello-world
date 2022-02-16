package org.example;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import org.example.core.service.UserService;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HelloWorldModule_ProvideUserServiceImplFactory implements Factory<UserService> {
  private final HelloWorldModule module;

  public HelloWorldModule_ProvideUserServiceImplFactory(HelloWorldModule module) {
    this.module = module;
  }

  @Override
  public UserService get() {
    return provideUserServiceImpl(module);
  }

  public static HelloWorldModule_ProvideUserServiceImplFactory create(HelloWorldModule module) {
    return new HelloWorldModule_ProvideUserServiceImplFactory(module);
  }

  public static UserService provideUserServiceImpl(HelloWorldModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserServiceImpl());
  }
}
