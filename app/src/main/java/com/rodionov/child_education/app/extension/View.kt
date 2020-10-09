package com.rodionov.child_education.app.extension

import android.content.Context.INPUT_METHOD_SERVICE
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import com.rodionov.child_education.R

fun TextView.setTextOrHide(value: String?) {
    if (value.isNullOrEmpty()) {
        gone()
    } else {
        show()
        text = value
    }
}

fun View.show() = run { visibility = View.VISIBLE }

fun View.gone() = run { visibility = View.GONE }

fun View.hideKeyboard() {
    val inputMethodManager = context.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}

fun TextView.setSpannablePrimaryText(primaryText: String, text: String, addSpace: Boolean) {
    val string = primaryText + if (addSpace) text.padStart(text.length + 1) else text
    val ssb = SpannableStringBuilder(string)
    ssb.setSpan(
        ForegroundColorSpan(context.getCompatColor(R.color.colorPrimary)),
        0,
        primaryText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    ssb.setSpan(
        UnderlineSpan(),
        0,
        primaryText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    setText(ssb)
}