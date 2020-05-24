package com.example.daggerpracticetwo.di.modules;

import com.example.daggerpracticetwo.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Rahul on 24/05/20.
 */

@Module
public abstract class ActivityBuildModule {

    @ContributesAndroidInjector
   abstract AuthActivity authActivity();

}
