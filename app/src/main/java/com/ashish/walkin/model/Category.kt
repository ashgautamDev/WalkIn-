package com.ashish.walkin.model

data class Category(
    val icon: String?,
    val id: Int,
    val is_subcat: String,
    val name: String?,
    val type: String
) {
    companion object {
        val fakeCategory = listOf(
            Category(
                id = 7,
                name = "Malls",
                icon = "http://appsinvodevlopment.com/walk_in/public/category_images/2.png",
                is_subcat = "1",
                type = "0"
            ),
            Category(
                id = 1,
                name = "Beauty",
                icon = "http://appsinvodevlopment.com/walk_in/public/category_images/4.png",
                is_subcat = "0",
                type = "0"
            ),
            Category(
                id = 2,
                name = "Restuarant",
                icon = "http://appsinvodevlopment.com/walk_in/public/category_images/1.png",
                is_subcat = "0",
                type = "0"
            ),
            Category(
                id = 4,
                name = "Food Court",
                icon = "http://appsinvodevlopment.com/walk_in/public/category_images/1.png",
                is_subcat = "0",
                type = "1"
            )
        )
    }
}