package com.rodionov.child_education.presentation.start

import com.rodionov.child_education.app.platform.BaseViewModel
import com.rodionov.child_education.app.platform.NavigationEvent

class StartViewModel: BaseViewModel() {

    fun navigateToSubjectSelect(action: Int) {
        navigate(NavigationEvent.PushFragment(action = action))
    }

}