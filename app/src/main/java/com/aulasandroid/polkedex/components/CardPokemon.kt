package com.aulasandroid.polkedex.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import com.aulasandroid.polkedex.model.Pokemon

@Composable
fun CardPokemon (pokemon: Pokemon) {
    Card(
        modifier = Modifier
            .width(165.dp)
            .height(180.dp)
            .padding(16.dp)
            .border(2.dp, Color(94, 190, 80, 255), RoundedCornerShape(12.dp)),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(6.dp),
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "#001",
                    color = Color(94, 190, 80, 255)
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(Color(94, 190, 80, 255)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Bulbasaur",
                    color = Color.White,
                    fontWeight = Bold
                )
            }
        }
    }
}