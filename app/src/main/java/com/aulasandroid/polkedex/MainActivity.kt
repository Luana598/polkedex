package com.aulasandroid.polkedex

import android.R.attr.shape
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.polkedex.ui.theme.PolkedexTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PolkedexTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TelaInicial(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

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

        Card(modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .border(5.dp, Color(177, 229, 113, 255), shape = RoundedCornerShape(15.dp)),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFFFFF)
            ),
            elevation = CardDefaults.cardElevation(4.dp)
            ) {
            Column(modifier = Modifier
                .background(Color.White)
                .width(200.dp)
                .height(150.dp)) {
                Text(text = "#001",
                    color = Color(177, 229, 113, 255)
                )
            }

            Column(modifier = Modifier
                .background(Color(177, 229, 113, 255), )
                    .width(200.dp)
                    .height(50.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,

            ) {
                Text(text = "Bulbasaur",
                    color = Color.White,
                    fontWeight = Bold)
            }

    }

    }
}

