package com.closet.xavier.ui.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.closet.xavier.ui.navigation.models.RootNavItem
import com.closet.xavier.ui.presentation.main.state.AppThemeState


@Composable
fun RootNavGraph(
    navController: NavHostController,
    onThemeUpdated: () -> Unit,
    themeState: AppThemeState
) {
    NavHost(
        navController = navController,
        startDestination = RootNavItem.Authentication.id.toString(),
        route = RootNavItem.RootNavigation.route
    ) {
        authenticationGraph(navController = navController)
        bottomNavGraph(navController = navController,onThemeUpdated=onThemeUpdated,themeState=themeState)
    }
}