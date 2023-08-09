package com.example.aluvery.ui.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.sampleData.sampleProducts
import com.example.aluvery.ui.components.ProductsSection
import com.example.compose.AppTheme


@Composable
fun HomeScreen() {
    AppTheme {
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(state = ScrollState(rememberScrollState().value)),
            verticalArrangement = Arrangement.spacedBy(16.dp)

        ) {
            Spacer(Modifier)
            ProductsSection("Promoções", sampleProducts)
            ProductsSection("Doces", sampleProducts)
            ProductsSection("Bebidas", sampleProducts)
            Spacer(Modifier)
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}