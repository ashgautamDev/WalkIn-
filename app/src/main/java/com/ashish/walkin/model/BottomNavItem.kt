package com.ashish.walkin.model

import com.ashish.walkin.R

data class BottomNavItem(
    val label: String,
    val icon: Int,
    val activeIcon : Int,
    val route:String,
){
    companion object{
        val bottomNavItem = listOf(
            BottomNavItem(
                label = "Bookings" ,
                icon = R.drawable.booking_ic ,
                activeIcon = R.drawable.scan_active ,
                route = "booking"
            ),BottomNavItem(
                label = "Scan QR" ,
                icon = R.drawable.scan_ic ,
                activeIcon = R.drawable.scan_active ,
                route = "scan"
            ),BottomNavItem(
                label = "Home" ,
                icon = R.drawable.home_ic ,
                activeIcon = R.drawable.home_active ,
                route = "home"
            ),BottomNavItem(
                label = "My QR" ,
                icon = R.drawable.qr_ic ,
                activeIcon = R.drawable.qr_active ,
                route = "myQR"
            ),
            BottomNavItem(
                label = "Profile",
                icon = R.drawable.profile_ic,
                activeIcon = R.drawable.profile_active ,
                route = "profile"
            ),

        )
    }
}

