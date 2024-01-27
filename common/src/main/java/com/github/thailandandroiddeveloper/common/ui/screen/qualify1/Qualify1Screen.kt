package com.github.thailandandroiddeveloper.common.ui.screen.qualify1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme
import com.github.thailandandroiddeveloper.common.ui.theme.LightColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Qualify1Screen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            modifier = Modifier.size(48.dp),
                            painter = painterResource(id = R.drawable.ic_qualify_1_menu),
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            modifier = Modifier.size(48.dp),
                            painter = painterResource(id = R.drawable.ic_qualify_1_profile),
                            contentDescription = "Localized description"
                        )
                    }
                },
            )
        },
    ) {
        Box(
            modifier = Modifier
                .padding(it)
        ) {
            Image(
                modifier = Modifier
                    .padding(16.dp)
                    .clip(shape = RoundedCornerShape(16.dp)),
                painter = painterResource(id = R.drawable.img_qualify_1_profile),
                contentDescription = "Localized description"
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .size(192.dp)
                    .clip(
                        RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp)
                    )
                    .background(LightColors.Primary.copy(alpha = .75f))
                    .align(Alignment.BottomCenter)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(bottom = 8.dp),
                        text = "John Doe",
                        style = MaterialTheme.typography.headlineMedium,
                        color = LightColors.OnPrimary
                    )
                    Row(
                        modifier = Modifier.padding(bottom = 8.dp),
                    ) {
                        Image(
                            modifier = Modifier.padding(end = 8.dp),
                            painter = painterResource(id = R.drawable.ic_qualify_1_gender_male),
                            contentDescription = ""
                        )
                        Text(
                            text = "Male",
                            style = MaterialTheme.typography.bodyMedium,
                            color = LightColors.OnPrimary
                        )
                    }
                    Text(
                        modifier = Modifier.padding(bottom = 8.dp),
                        text = "Lorem ipsum dolor sit amet, cd nulla lacinia, quis fringilla lorem imperdiet. Proin in quam vel odio iaculis fringilla.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = LightColors.OnPrimary
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.BottomCenter)
                    .offset(y = 24.dp)
            ) {
                Spacer(modifier = Modifier.weight(.5f))
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = LightColors.ErrorContainer),
                    onClick = { /* Handle button click */ },
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp)
                        .width(120.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_qualify_1_thumb_down),
                        contentDescription = ""
                    )
                }
                Spacer(modifier = Modifier.weight(.5f))
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = LightColors.PrimaryContainer),
                    onClick = { /* Handle button click */ },
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp)
                        .width(120.dp),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_qualify_1_thumb_up),
                        contentDescription = ""
                    )
                }
                Spacer(modifier = Modifier.weight(.5f))
            }
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify1ScreenPreview() = AppTheme {
    Qualify1Screen()
}
// endregion