package com.abuxis.nyumbani.ui.theme.screens.Home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.abuxis.nyumbani.Navigation.ROUTE_ADD_PRODUCT
import com.abuxis.nyumbani.Navigation.ROUTE_VIEW_PRODUCTS
import com.abuxis.nyumbani.Navigation.ROUTE_VIEW_UPLOADS

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var context = LocalContext.current
//        var productdata=productviewmodel(navController,context)

        Text(
            text = "WELCOME TO NYUMBANI APP",
            color = Color.Cyan,
            fontFamily = FontFamily.Default,
            fontSize = 26.sp
        )
        Text(
            text = "WHERE WE VALUE OUR CUSTOMERS",
            color = Color.Cyan,
            fontFamily = FontFamily.Default,
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCT)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add Product")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
           navController.navigate(ROUTE_VIEW_PRODUCTS)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "View Product")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate(ROUTE_VIEW_UPLOADS)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "View uploads")
        }


    }

}





@Preview
@Composable
fun Homepreview() {
    HomeScreen(rememberNavController())}
