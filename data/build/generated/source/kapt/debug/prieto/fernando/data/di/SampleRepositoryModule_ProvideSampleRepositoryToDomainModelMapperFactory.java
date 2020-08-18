package prieto.fernando.data.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapper;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SampleRepositoryModule_ProvideSampleRepositoryToDomainModelMapperFactory implements Factory<SampleRepositoryToDomainModelMapper> {
  private final SampleRepositoryModule module;

  public SampleRepositoryModule_ProvideSampleRepositoryToDomainModelMapperFactory(
      SampleRepositoryModule module) {
    this.module = module;
  }

  @Override
  public SampleRepositoryToDomainModelMapper get() {
    return provideSampleRepositoryToDomainModelMapper(module);
  }

  public static SampleRepositoryModule_ProvideSampleRepositoryToDomainModelMapperFactory create(
      SampleRepositoryModule module) {
    return new SampleRepositoryModule_ProvideSampleRepositoryToDomainModelMapperFactory(module);
  }

  public static SampleRepositoryToDomainModelMapper provideSampleRepositoryToDomainModelMapper(
      SampleRepositoryModule instance) {
    return Preconditions.checkNotNull(instance.provideSampleRepositoryToDomainModelMapper(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
