package com.aulasandroid.polkedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.polkedex.ui.theme.PolkedexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PolkedexTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    TelaInicial(
//                        modifier = Modifier.padding(innerPadding)
//                    )

                    TelaPokemon(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TelaPokemon(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(Color(94, 190, 80, 255))
    ){

        Box(  modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)

        ) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.End) {
                Image(painter = painterResource(R.drawable.pokebola_background),
                    contentDescription = "pokebola background",
                    alpha = 0.2f,
                    modifier = Modifier
                        .size(350.dp)
                )
            }

            Row(modifier = Modifier.padding(24.dp)){

                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "",
                        tint = Color.White
                    )

                Spacer(modifier = Modifier.size(24.dp))

                    Text(text = "Bulbasaur",
                        color = Color.White,
                        fontSize = 26.sp,
                        fontWeight = Bold)

                Row(modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End) {
                    Text(text = "#001",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = Bold)
                }
            }
        }

        Box() {

            Card(modifier = Modifier
                .width(300.dp)
                .height(350.dp),
                colors = CardDefaults.cardColors(
                    Color.White
                )) { }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(R.drawable.pokemon),
                    contentDescription = "pokemon",
                    modifier = Modifier
                        .size(125.dp)
                        .fillMaxSize()
                )
            }
        }

    }


}

