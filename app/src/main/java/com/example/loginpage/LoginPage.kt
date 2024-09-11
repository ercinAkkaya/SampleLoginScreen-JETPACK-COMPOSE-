package com.example.loginpage

import android.util.Log
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginpage.components.DefaultButton
import com.example.loginpage.components.DefaultInput

@Preview
@Composable
fun LoginPage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E1E1E))
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center)
        ) {
            Image(
                painter = painterResource(id = R.drawable.coffee),
                contentDescription = "coffee",
                modifier = Modifier
                    .size(100.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "WELCOME TO COFFEE APP",
                color = Color.White,
                fontSize = 27.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Login To Your Account",
                color = Color.White,
                fontSize = 22.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(24.dp))
            DefaultInput(
                hintText = "Email",
                onValueChange = {},
                icon = painterResource(id = R.drawable.email),
                inputType = KeyboardType.Email
            )
            Spacer(modifier = Modifier.height(12.dp))
            DefaultInput(
                hintText = "Password",
                onValueChange = {},
                icon = painterResource(id = R.drawable.lock),
                inputType = KeyboardType.Password,
                suffixIcon = painterResource(id = R.drawable.visibility)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Şifremi Unuttum",
                color = Color.White,
                fontSize = 16.sp,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .align(Alignment.End)
                    .clickable {
                        Log.e("Şifremi Unuttum", "Şifremi Unuttum tıklandı")
                    }
            )
            Spacer(modifier = Modifier.height(16.dp))
            DefaultButton(
                buttonText = "Giriş Yap",
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Divider(
                    color = Color.White,
                    thickness = 1.dp,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = "veya",
                    color = Color.White,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
                Divider(
                    color = Color.White,
                    thickness = 1.dp,
                    modifier = Modifier.weight(1f)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 80.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(22.dp))
                        .background(color = Color(0xff23232C))
                        .clickable {
                            Log.e("Google", "Google tıklandı")
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "googleIcon",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable {
                                Log.e("Google", "Google tıklandı")
                            }
                    )
                }
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(22.dp))
                        .background(color = Color(0xff23232C))
                        .clickable {
                            Log.e("apple", "apple tıklandı")
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.apple),
                        contentDescription = "appleIcon",
                        colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.White),
                        modifier = Modifier.size(40.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Bir Hesabın Yok Mu?",
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                text = "CoffeeApp©  2024",
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )

        }
    }
}