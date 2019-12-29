package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Module
import dagger.Provides


//@Retention(AnnotationRetention.BINARY)
//@Qualifier
//annotation class RegistrationStorage
//
//@Retention(AnnotationRetention.BINARY)
//@Qualifier
//annotation class LoginStorage

// Tells Dagger this is a Dagger module
@Module
class StorageModule {


//    @Binds
//    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage

    // @Provides tell Dagger how to create instances of the type that this function
    // returns (i.e. Storage).
    // Function parameters are the dependencies of this type (i.e. Context).
    // Implementations of an interface (although @Binds is recommended
    // because it generates less code and therefore it's more efficient).
    @Provides
    fun provideStorage(context: Context): Storage {
        // Whenever Dagger needs to provide an instance of type Storage,
        // this code (the one inside the @Provides method) will be run.
        return SharedPreferencesStorage(context)
    }

//    @RegistrationStorage
//    @Provides
//    fun provideRegistrationStorage(context: Context): Storage {
//        return SharedPreferencesStorage("registration", context)
//    }
//
//    @LoginStorage
//    @Provides
//    fun provideLoginStorage(context: Context): Storage {
//        return SharedPreferencesStorage("login", context)
//    }

}