package com.ashish.walkin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ashish.walkin.ui.sceens.HomeScreen
import com.ashish.walkin.ui.sceens.MyBookingScreen
import com.ashish.walkin.ui.sceens.MyQRScreen
import com.ashish.walkin.ui.sceens.ProfileScreen
import com.ashish.walkin.ui.sceens.ScanScreen
import com.ashish.walkin.viewmodel.MainViewModel

@Composable
fun NavGraph(viewModel: MainViewModel , navController : NavHostController) {


    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(viewModel)
        }
        composable("profile") {
            ProfileScreen()
        }
        composable("myQR") {
            MyQRScreen()
        }
        composable("scan") {
            ScanScreen()
        }
        composable("booking") {
            MyBookingScreen()
        }

    }
}