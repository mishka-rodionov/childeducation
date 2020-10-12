package com.rodionov.child_education.presentation.subject_select

import com.rodionov.child_education.app.platform.BaseViewModel
import com.rodionov.child_education.app.platform.NavigationEvent

class SubjectSelectViewModel: BaseViewModel() {

    fun navigateToMath(action: Int) {
        navigate(NavigationEvent.PushFragment(action = action))
    }

}