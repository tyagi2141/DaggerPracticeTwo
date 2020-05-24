package com.example.daggerpracticetwo.di.modules;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.daggerpracticetwo.R;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rahul on 24/05/20.
 */

@Module
public class AppModule {


    @Singleton
    @Provides
    RequestOptions providerRequestOptions() {
        return RequestOptions.placeholderOf(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);
    }

    @Singleton
    @Provides
    RequestManager providerRequestManager(Application application, RequestOptions requestOptions) {

        return Glide.with(application).setDefaultRequestOptions(requestOptions);
    }

    @Singleton
    @Provides
    Drawable provideDrawable(Application application) {

        return ContextCompat.getDrawable(application, R.mipmap.ic_launcher);
    }

}
