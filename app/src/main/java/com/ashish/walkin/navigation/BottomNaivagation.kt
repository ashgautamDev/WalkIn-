package com.ashish.walkin.navigation

import android.util.Log
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ashish.walkin.model.BottomNavItem
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun BottomNavigationBar(navController: NavHostController) {

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        modifier = Modifier.height(80.dp)
    ) {

        val navBackStackEntry by navController.currentBackStackEntryAsState()

        val currentRoute = navBackStackEntry?.destination?.route

        val scope = rememberCoroutineScope()
        BottomNavItem.bottomNavItem.forEach { navItem ->

            BottomNavigationItem(
                selected = currentRoute == navItem.route,
                onClick = {
                    Log.d("Bottom", "BottomNavigationBar: $currentRoute and ${navItem.icon}")
                    scope.launch {
                        delay(100L)
                    navController.navigate(navItem.route)
                    }
                },
                icon = {

                        Image(
                            painter = painterResource(id = if (currentRoute == navItem.route) navItem.activeIcon else navItem.icon),
                            contentDescription = navItem.label
                        )
                       },



                label = {
                    Text(text = navItem.label)
                },
                alwaysShowLabel = true,
                unselectedContentColor = MaterialTheme.colors.onSecondary,
                selectedContentColor = MaterialTheme.colors.primary,
            )
        }
    }
}