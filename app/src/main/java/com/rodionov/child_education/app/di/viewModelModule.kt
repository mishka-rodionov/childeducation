package com.rodionov.child_education.app.di

import com.rodionov.child_education.presentation.math.MathViewModel
import com.rodionov.child_education.presentation.start.StartViewModel
import com.rodionov.child_education.presentation.subject_select.SubjectSelectViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { StartViewModel() }
    viewModel { SubjectSelectViewModel() }
    viewModel { MathViewModel() }
}