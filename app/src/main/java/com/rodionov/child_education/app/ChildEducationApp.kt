package com.rodionov.child_education.app

import android.app.Application
import android.content.Context
import com.rodionov.child_education.app.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ChildEducationApp: Application() {

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        startKoin {
            androidContext(this@ChildEducationApp)
            androidLogger()
            modules(listOf(viewModelModule))
        }
    }

}