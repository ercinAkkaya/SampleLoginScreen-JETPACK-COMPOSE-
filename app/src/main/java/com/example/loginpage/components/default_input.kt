package com.example.loginpage.components
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DefaultInput(
    hintText: String,
    onValueChange: (String) -> Unit,
    icon: Painter? = null,
    suffixIcon: Painter? = null,
    inputType: KeyboardType = KeyboardType.Text
) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    var isFocused by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            if (icon != null) {
                Icon(
                    painter = icon,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.padding(end = 8.dp)
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                if (text.text.isEmpty() && !isFocused) {
                    Text(
                        text = hintText,
                        color = Color.Gray,
                        fontSize = 16.sp
                    )
                }
                BasicTextField(
                    value = text,
                    onValueChange = { value ->
                        text = value
                        onValueChange(value.text)
                    },
                    textStyle = TextStyle(color = Color.White, fontSize = 16.sp),
                    keyboardOptions = KeyboardOptions(keyboardType = inputType),
                    visualTransformation = if (inputType == KeyboardType.Password) PasswordVisualTransformation() else VisualTransformation.None,
                    modifier = Modifier
                        .fillMaxWidth()
                        .onFocusChanged { focusState ->
                            isFocused = focusState.isFocused
                        }
                )
            }
            if (suffixIcon != null) {
                Icon(
                    painter = suffixIcon,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
        Divider(color = Color.White, thickness = 1.dp, modifier = Modifier.padding(top = 8.dp))
    }
}