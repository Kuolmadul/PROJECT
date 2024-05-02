package net.ezra.ui.services



import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image 
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource 
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.ui.theme.AppTheme
import net.ezra.R

@Composable
fun ServicesScreen(navController: NavHostController) {

Column (modifier=Modifier
    .fillMaxSize()

){


Row {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        //.padding(16.dp)
                        .clickable { },
                    shape = RoundedCornerShape(8.dp),
                   // elevation = 8.dp
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                           // .padding(16.dp),
                       // contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.flannel),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )


                    }

                       Text(text = "Flannels")
                }



    }






}

















    Column {
        Text(text = "services screen")



        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_SERVICES) { inclusive = true }
                    }
                },
            text = "Home",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
    }





}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ServicesScreen(rememberNavController())
}

