package com.plcoding.contactscomposemultiplatform.core.presentations

import androidx.compose.runtime.Composable

expect fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor:Boolean,
    content: @Composable () -> Unit
)