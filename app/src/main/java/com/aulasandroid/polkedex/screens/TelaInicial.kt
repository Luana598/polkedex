package com.aulasandroid.polkedex.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.polkedex.R

@Composable
fun TelaInicial(modifier: Modifier = Modifier) {

    var nome by remember {
        mutableStateOf("")
    }

    Column(modifier = modifier.fillMaxWidth()) {

        Row(modifier = Modifier
            .background(Color(220, 57, 57, 255))
            .fillMaxWidth()
            .height(100.dp)
            .padding(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(R.drawable.pokebola),
                contentDescription = "quiz icon",
                modifier = Modifier
                    .size(60.dp)
                    .padding(10.dp)
            )

            Text(text = "Pokédex",
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = Bold)
        }

        OutlinedTextField(
            value = nome,
            onValueChange = {
                    novoValor -> Log.i("teste", novoValor)
                nome = novoValor
            },
            label = {
                Text(text = "Nome ou ID")
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "")
            },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = (Color(192, 192, 192, 255)),
                unfocusedBorderColor = (Color(192, 192, 192, 255))
            ),
            singleLine = true,
            shape = RoundedCornerShape(25.dp),
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)

        )



    }
}