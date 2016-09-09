package gq.baijie.onetab;

import javax.annotation.Nonnull;

import rx.Observable;

public interface StorageService {

  String TYPE_DEFAULT = "default";

  @Nonnull
  Observable<ProgressOrResult<Void, Throwable>> save(
      @Nonnull String type, @Nonnull WebArchive webArchive);

  @Nonnull
  Observable<ProgressOrResult<WebArchive, Throwable>> retrieve(@Nonnull String type);

}