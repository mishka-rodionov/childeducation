package com.rodionov.child_education.app.extension

import androidx.lifecycle.MutableLiveData

fun <T : Any?> MutableLiveData<T>.refresh() = apply { setValue(value) }
