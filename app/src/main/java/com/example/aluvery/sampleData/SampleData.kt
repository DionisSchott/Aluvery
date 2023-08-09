package com.example.aluvery.sampleData

import com.example.aluvery.R
import com.example.aluvery.model.Product
import java.math.BigDecimal


val sampleProducts = listOf(
    (Product(name = "Porção mista", price = BigDecimal("49.99"), image = R.drawable.imagens_1_)),
    (Product(name = "Pastel", price = BigDecimal("9.99"), image = R.drawable.imagens_2_)),
    (Product(name = "Pastel", price = BigDecimal("10.99"), image = R.drawable.imagens_3_))
)