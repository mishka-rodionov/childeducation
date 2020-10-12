package com.rodionov.child_education.presentation.start

import androidx.fragment.app.Fragment
import com.rodionov.child_education.R
import com.rodionov.child_education.app.platform.BaseFragment
import com.rodionov.child_education.app.platform.BaseViewModel
import kotlinx.android.synthetic.main.fragment_start.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class StartFragment: BaseFragment(R.layout.fragment_start) {

    private val viewModel: StartViewModel by viewModel()

    override val screenViewModel by lazy { viewModel }

    override fun initViews() {
        tvNameFirst.setOnClickListener {
            viewModel.navigateToSubjectSelect(R.id.subjectSelectFragment)
        }
    }

}