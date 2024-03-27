package com.example.madlab


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.madlab.ui.theme.MADLABTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MADLABTheme {
                // A surface container using the 'background' color from the theme
                var navController = rememberNavController()
                navController = navController, startDestination= "SplashScreen"
            }
        }
    }
}

@Composable
fun MyWeatherApp()
{
    SplashScreen()
    LaunchedEffect(Unit){
        delay(3000)
    }
}



@Composable
fun SplashScreen()
{
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(1f)
    ){
        Image(painter = painterResource(id = R.drawable.map), contentDescription = "logo")
        Text(text = "Sky Sight")
    }
}

@Composable
fun CitySelectionScreen()
{
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(.7f)
    ){
        Text(text = "Select City")
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo")
        Image(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "map",
            modifier = Modifier.fillMaxSize(.7f)

        )

        TextField(value = "Enter City Name", onValueChange = {})
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Show Weather")

        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WeatherDetailScreen()
{

    Text(text = "Weather Details", Modifier.padding(55.dp))
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(1f)
    ) {

        Text(text = "City Name: Karachi",
            fontSize = 25.sp,
            )


    }
}

/*@Composable
fun TempDetails()
{
    Row {

    }
}*/






//LaunchedEffect(Unit) {
//
//    delay(3000) // Wait for 3 seconds
//
//    // code to be called after 3 seconds
//
//}
//
//
//
//Get Dynamic Data from Strings
//
//val weatherInfo: List<String> = run {
//
//    val resourceId = resources.getIdentifier("weather_info_${cityName.lowercase()}", "array", context.packageName)
//
//    if (resourceId != 0) resources.getStringArray(resourceId).toList() else listOf("Info not available")
//
//}