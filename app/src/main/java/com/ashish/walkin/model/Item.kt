package com.ashish.walkin.model

import com.ashish.walkin.R

data class Item(val itemImage: Int, val itemName: String) {

    companion object {
        val staySafeList = listOf(
            Item(R.drawable.mask_logo, "Always wear \n a mask"),
            Item(R.drawable.wash_logo, "Wash hand"),
            Item(R.drawable.distance_logo, "Keep distance \n with other person")
        )
    }
}
