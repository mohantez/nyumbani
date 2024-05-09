package com.abuxis.nyumbani.ui.theme.screens.Products

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.abuxis.nyumbani.R

@Composable
    fun ViewuploadsScreen(navController:NavHostController) {
        val uploads = remember { mutableStateListOf<android.net.Uri>() }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Button to add sample uploads for demonstration
            Button(onClick = {
                // Add sample upload URIs
                uploads.addAll(listOf(
                    android.net.Uri.parse("content://media/external/images/media/1"),
                    android.net.Uri.parse("content://media/external/images/media/2"),
                    android.net.Uri.parse("content://media/external/images/media/3")
                ))
            }) {
                Text(text = "Add Sample Uploads")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Display uploads using RecyclerView
            UploadsList(uploads = uploads)
        }
    }

    @Composable
    fun UploadsList(uploads: List<android.net.Uri>) {
        LazyColumn {
            items(uploads.size) { index ->
                UploadItem(uploadUri = uploads[index])
            }
        }
    }

    @Composable
    fun UploadItem(uploadUri: android.net.Uri) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "Upload Image",
                modifier = Modifier
                    .size(50.dp)
                    .padding(4.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Upload Name or Description", modifier = Modifier.weight(1f))

        }
    }

@Preview
@Composable
private fun uploads() {
    ViewuploadsScreen(navController = rememberNavController())

}