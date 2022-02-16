package org.example.resources;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class HelloWorldResource_Factory implements Factory<HelloWorldResource> {
  private final Provider<UserService> userServiceImplProvider;

  public HelloWorldResource_Factory(Provider<UserService> userServiceImplProvider) {
    this.userServiceImplProvider = userServiceImplProvider;
  }

  @Override
  public HelloWorldResource get() {
    return newInstance(userServiceImplProvider.get());
  }

  public static HelloWorldResource_Factory create(Provider<UserService> userServiceImplProvider) {
    return new HelloWorldResource_Factory(userServiceImplProvider);
  }

  public static HelloWorldResource newInstance(UserService userServiceImpl) {
    return new HelloWorldResource(userServiceImpl);
  }
}
