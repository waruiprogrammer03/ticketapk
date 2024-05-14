package com.example.ticcketapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ticcketapp.ui.theme.screens.home.HomeScreen
import com.example.ticcketapp.ui.theme.screens.localevents.ConcertScreen
import com.example.ticcketapp.ui.theme.screens.localevents.EventsScreen
import com.example.ticcketapp.ui.theme.screens.localevents.Moviesscreen
import com.example.ticcketapp.ui.theme.screens.localevents.SportsScreen
import com.example.ticcketapp.ui.theme.screens.login.LoginScreen
import com.example.ticcketapp.ui.theme.screens.signup.SignupScreen
import com.example.ticcketapp.ui.theme.screens.splash.SplashScreen
import com.example.ticcketapp.ui.theme.screens.tickets.AddTicketssScreen
import com.example.ticcketapp.ui.theme.screens.welcome.Welcomescreen



@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = ADD_TICKETS_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(WELCOME_URL){
            Welcomescreen(navController = rememberNavController())
        }
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen((rememberNavController()))
        }
        composable(SPLASH_URL){
            SplashScreen(rememberNavController())
        }
        composable(MOVIES_URL){
            Moviesscreen()
        }
        composable(SPORTS_URL){
            SportsScreen()
        }
        composable(ADD_TICKETS_URL){
            AddTicketssScreen(navController = rememberNavController())
        }
        composable(CONCERT_URL){
            ConcertScreen(rememberNavController())
        }
        composable(EVENTS_URL){
            EventsScreen(rememberNavController())
        }
    }
}