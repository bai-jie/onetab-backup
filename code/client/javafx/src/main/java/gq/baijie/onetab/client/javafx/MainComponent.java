package gq.baijie.onetab.client.javafx;

import javax.inject.Singleton;

import dagger.Component;
import gq.baijie.onetab.StorageService;
import gq.baijie.onetab.internal.storage.StorageModule;

@Singleton
@Component(modules = StorageModule.class)
public interface MainComponent {

  StorageService storageService();

  Controller newController();

}
