package com.guren.jetpackcompose.module

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.guren.jetpackcompose.Screen
import com.guren.jetpackcompose.network.RealStateService
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception

@Composable
fun MainScreen(navController: NavController){

    val service = Retrofit.Builder()
        .baseUrl("http://upscale-properties.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RealStateService::class.java)

    val remberScope = rememberCoroutineScope()
    remberScope.launch {

        try {
            val response = service.getRealState(
                token = ""
            )
            Log.d("MainActivity", "MainScreen: ${response[0].realstate_name}")
        }
        catch (e: Exception){
            Log.d("MainActivity", "MainScreen: $e")
        }

    }

    var text by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)

    ) {
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier =  Modifier.fillMaxWidth(),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            navController.navigate(Screen.DetailScreen.withArgs(text))
        },
            modifier = Modifier.align(Alignment.End)) {
            Text(text = "Detail Screen")
        }
    }
}