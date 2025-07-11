package com.outsystems.plugins.inappbrowser.osinappbrowserlib

import com.outsystems.plugins.inappbrowser.osinappbrowserlib.models.OSIABThemeMode
import com.outsystems.plugins.inappbrowser.osinappbrowserlib.models.OSIABWebViewOptions
import org.junit.Assert.assertEquals
import org.junit.Test

class OSIABThemeModeTests {

    @Test
    fun test_OSIABWebViewOptions_defaultMode_isSystem() {
        val options = OSIABWebViewOptions()
        assertEquals(OSIABThemeMode.SYSTEM, options.theme)
    }

    @Test
    fun test_OSIABWebViewOptions_withLightMode() {
        val options = OSIABWebViewOptions(theme = OSIABThemeMode.LIGHT)
        assertEquals(OSIABThemeMode.LIGHT, options.theme)
    }

    @Test
    fun test_OSIABWebViewOptions_withDarkMode() {
        val options = OSIABWebViewOptions(theme = OSIABThemeMode.DARK)
        assertEquals(OSIABThemeMode.DARK, options.theme)
    }
} 