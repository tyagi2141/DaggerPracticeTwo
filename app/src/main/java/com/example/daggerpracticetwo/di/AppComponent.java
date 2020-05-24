package com.example.daggerpracticetwo.di;

import android.app.Application;

import com.example.daggerpracticetwo.di.modules.ActivityBuildModule;
import com.example.daggerpracticetwo.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Rahul on 24/05/20.
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityBuildModule.class,
        AppModule.class,
})
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
     interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent builder();

    }
}
