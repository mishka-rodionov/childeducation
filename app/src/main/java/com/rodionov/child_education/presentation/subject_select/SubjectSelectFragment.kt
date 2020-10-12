package com.rodionov.child_education.presentation.subject_select

import com.rodionov.child_education.R
import com.rodionov.child_education.app.platform.BaseFragment
import com.rodionov.child_education.app.platform.BaseViewModel
import kotlinx.android.synthetic.main.fragment_subject_select.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SubjectSelectFragment: BaseFragment(R.layout.fragment_subject_select) {

    private val viewModel: SubjectSelectViewModel by viewModel()

    override val screenViewModel by lazy { viewModel }

    override fun initViews() {
        btnMath.setOnClickListener {
            viewModel.navigateToMath(R.id.mathFragment)
        }
    }

}