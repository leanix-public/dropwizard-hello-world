package org.example.core.service;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class UserServiceImpl_Factory implements Factory<UserServiceImpl> {
  @Override
  public UserServiceImpl get() {
    return newInstance();
  }

  public static UserServiceImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserServiceImpl newInstance() {
    return new UserServiceImpl();
  }

  private static final class InstanceHolder {
    private static final UserServiceImpl_Factory INSTANCE = new UserServiceImpl_Factory();
  }
}
