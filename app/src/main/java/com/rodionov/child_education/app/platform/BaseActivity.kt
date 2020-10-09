package com.rodionov.child_education.app.platform

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.rodionov.child_education.R
import com.rodionov.child_education.app.extension.getCompatColor
import com.rodionov.child_education.app.extension.setStatusBarColor
import com.rodionov.child_education.app.extension.setStatusBarLightMode


abstract class BaseActivity(@LayoutRes private val layout: Int) : AppCompatActivity(layout) {

    open val screenViewModel: BaseViewModel?
        get() = null

    open val statusBarColor = R.color.colorStatusBar
    open val statusBarLightMode = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setStatusBarColor(this.getCompatColor(statusBarColor))
        this.setStatusBarLightMode(statusBarLightMode)
        initViews()
    }

    abstract fun initViews()

}