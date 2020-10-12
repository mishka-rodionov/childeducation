package com.rodionov.child_education.presentation.math

import androidx.lifecycle.MutableLiveData
import com.rodionov.child_education.app.platform.BaseViewModel

class MathViewModel : BaseViewModel() {

    val firstNumber = MutableLiveData<Int>()
    val secondNumber = MutableLiveData<Int>()
    val resultStatus = MutableLiveData<Boolean>()
    var result = 0

    fun numberCalculate() {
        val first = (0..20).random()
        val second = (0..20).random()
        result = first + second
        firstNumber.value = first
        secondNumber.value = second
    }

    fun checkResult(ans: String) {
        val answer = ans.toInt()
        resultStatus.value = answer == result
    }

}