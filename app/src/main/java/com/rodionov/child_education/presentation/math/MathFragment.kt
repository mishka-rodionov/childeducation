package com.rodionov.child_education.presentation.math

import android.content.res.Resources
import android.os.Handler
import com.rodionov.child_education.R
import com.rodionov.child_education.app.extension.observe
import com.rodionov.child_education.app.extension.onDone
import com.rodionov.child_education.app.platform.BaseFragment
import com.rodionov.child_education.app.platform.BaseViewModel
import kotlinx.android.synthetic.main.fragment_math.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MathFragment : BaseFragment(R.layout.fragment_math) {

    private val viewModel: MathViewModel by viewModel()

    override val screenViewModel by lazy { viewModel }

    override fun initViews() {
        setupObservers()
        viewModel.numberCalculate()
        btnAccept.setOnClickListener { acceptAnswer() }
        etAnswer.onDone { acceptAnswer() }
    }

    private fun acceptAnswer() {
        viewModel.checkResult(etAnswer.text.toString())
        Handler().postDelayed({
            etAnswer.setText("")
            tilAnswer.boxStrokeColor = resources.getColor(R.color.colorPrimary)
            tilAnswer.helperText = ""
            viewModel.numberCalculate()
            showSoftKeyboard()
        }, 2000)
    }

    private fun setupObservers() {
        observe(viewModel.firstNumber) { tvFirstNumber.text = it.toString() }
        observe(viewModel.secondNumber) { tvSecondNumber.text = it.toString() }
        observe(viewModel.resultStatus) {
            it?.let {
                when (it) {
                    true -> tilAnswer.boxStrokeColor = resources.getColor(R.color.colorSuccess)
                    false -> {
                        tilAnswer.boxStrokeColor = resources.getColor(R.color.colorError)
                        tilAnswer.helperText = viewModel.result.toString()
                    }
                }
            }
        }
    }

}