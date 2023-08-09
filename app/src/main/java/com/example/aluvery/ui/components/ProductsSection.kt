package com.example.aluvery.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.model.Product
import com.example.aluvery.sampleData.sampleProducts

@Composable
fun ProductsSection(
    title: String,
    product: List<Product>,
) {


    Column {
        Text(
            text = title,
            Modifier.padding(start = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(state = ScrollState(rememberScrollState().value))
                .padding(top = 8.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),


            ) {
            Spacer(Modifier)

            for (p in product) {
                ProductItem(product = p)
            }

            Spacer(Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductSectionPreview() {

    ProductsSection(title = "Promoções", product = sampleProducts)

}

