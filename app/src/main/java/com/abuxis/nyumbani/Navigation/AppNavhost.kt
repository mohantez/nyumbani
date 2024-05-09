package com.abuxis.nyumbani.Navigation

//import com.abuxis.nyumbani.ui.theme.screens.Products.ViewProductsScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abuxis.nyumbani.SplashScreen
import com.abuxis.nyumbani.ui.theme.screens.Home.HomeScreen
import com.abuxis.nyumbani.ui.theme.screens.Products.AddProductsScreen
import com.abuxis.nyumbani.ui.theme.screens.Products.ViewuploadsScreen
import com.abuxis.nyumbani.ui.theme.screens.Register.RegisterScreen
import com.abuxis.nyumbani.ui.theme.screens.login.LoginScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController= rememberNavController(), startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_Splashscreen){
            SplashScreen(navController)
        }
        composable(ROUTE_VIEW_UPLOADS){
            ViewuploadsScreen(navController)
        }
    }

}