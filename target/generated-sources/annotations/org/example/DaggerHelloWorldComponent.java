package org.example;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import org.example.resources.HelloWorldResource;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerHelloWorldComponent implements HelloWorldComponent {
  private final HelloWorldModule helloWorldModule;

  private final DaggerHelloWorldComponent helloWorldComponent = this;

  private DaggerHelloWorldComponent(HelloWorldModule helloWorldModuleParam) {
    this.helloWorldModule = helloWorldModuleParam;

  }

  public static Builder builder() {
    return new Builder();
  }

  public static HelloWorldComponent create() {
    return new Builder().build();
  }

  @Override
  public HelloWorldResource provideHelloWorldResource() {
    return new HelloWorldResource(HelloWorldModule_ProvideUserServiceImplFactory.provideUserServiceImpl(helloWorldModule));
  }

  public static final class Builder {
    private HelloWorldModule helloWorldModule;

    private Builder() {
    }

    public Builder helloWorldModule(HelloWorldModule helloWorldModule) {
      this.helloWorldModule = Preconditions.checkNotNull(helloWorldModule);
      return this;
    }

    public HelloWorldComponent build() {
      if (helloWorldModule == null) {
        this.helloWorldModule = new HelloWorldModule();
      }
      return new DaggerHelloWorldComponent(helloWorldModule);
    }
  }
}
