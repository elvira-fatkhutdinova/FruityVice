package com.elvirafatkhutdinova.fruityvice.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.elvirafatkhutdinova.fruityvice.domain.model.Fruit

@Composable
fun FruityViceCard(
    fruit: Fruit,
) {
    Box {
        Card(
            modifier = Modifier,
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = fruit.name,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = fruit.family,
                    style = MaterialTheme.typography.bodyMedium,
                )
                Text(
                    text = fruit.genus,
                    style = MaterialTheme.typography.bodyMedium,
                )
                Text(
                    text = fruit.order,
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        }
    }
}