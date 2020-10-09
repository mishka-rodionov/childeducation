package com.rodionov.child_education.app.platform

sealed class Failure {
    object AuthError : Failure()
}