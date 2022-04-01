package com.saurabhpatel.coreui

import android.content.res.Configuration
import android.content.res.Resources
import android.util.DisplayMetrics
import androidx.compose.material.Text
import androidx.compose.ui.res.stringResource
import app.cash.paparazzi.Paparazzi
import com.saurabhpatel.coreui.common.TopAppBarCommon
import com.saurabhpatel.coreui.common.theme.ComposedemoTheme
import org.junit.Rule
import org.junit.Test
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    public fun test_TopAppBarCommonWithText_Short() {
        val res: Resources = paparazzi.context.getResources()
        val dm: DisplayMetrics = res.getDisplayMetrics()
        val conf: Configuration = res.getConfiguration()
        conf.setLocale(Locale.GERMAN) // API 17+ only.
        res.updateConfiguration(conf, dm)
        paparazzi.snapshot(name = "Short Text English") {
            ComposedemoTheme {
                TopAppBarCommon(title = { Text(stringResource(R.string.in_progress_test)) })
            }
        }
    }

/*    @Test
    public fun test_TopAppBarCommonWithText_Long() {
        paparazzi.snapshot(name = "Long Long Long Long Long Text") {
            ComposedemoTheme {
                TopAppBarCommon(title = { Text("Long Long Long Long Long Text") })
            }
        }
    }

    @Test
    public fun test_TopAppBarCommonWithText_DifferentLocale() {
        paparazzi.snapshot(name = "Long Long Long Long Long Text") {
            ComposedemoTheme {
                TopAppBarCommon(title = { Text("DifferentLocale Text") })
            }
        }
    }*/
}