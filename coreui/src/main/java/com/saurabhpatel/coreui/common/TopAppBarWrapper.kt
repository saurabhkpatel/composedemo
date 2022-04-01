package com.saurabhpatel.coreui.common

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopAppBarCommon(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
) {
    Box {
        TopAppBar(
            title = title,
            navigationIcon = {
                // navigation icon is use for drawer icon.
                IconButton(onClick = { }) {
                    // below line is use to specify navigation icon.
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "test"
                    )
                }
            }
        )
    }
}


@Preview
@Composable
fun TopAppBarPreview() {
    TopAppBarCommon(title = { Text("Preview App Bar") })
}

@Preview
@Composable
fun TopAppBarPreviewDark() {
    TopAppBarCommon(title = { Text("Preview App Bar 2") })
}