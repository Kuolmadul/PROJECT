package net.ezra.ui.shop


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.ui.theme.AppTheme
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ShopScreen(navController: NavHostController) {
//

    Scaffold(

        topBar = {

            TopAppBar(

                title = {

                    Text(text = "Glamour Store ",
                        //Modifier.padding(10.dp),
                        textAlign=TextAlign.Center,
                        style = MaterialTheme.typography.headlineLarge,

                        )
Spacer(modifier = Modifier.height(5.dp))
                },

                backgroundColor = Color.Transparent,

               // contentColor = Color.White,

                )

        },

        content = {
Box {
    Image(painter = painterResource(id = R.drawable.g2),
        contentDescription = "Logo",
        modifier = Modifier
            .fillMaxSize(),
        contentScale= ContentScale.Crop
    )
}
            Column(

                modifier = Modifier

                    .fillMaxSize()

                    .padding(16.dp),

                verticalArrangement = Arrangement.Center,

                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Text(
                    color = Color.White,
                    textAlign=TextAlign.Center,
                    text = "Welcome to Glamour Store",

                    style = MaterialTheme.typography.headlineLarge,

                    modifier = Modifier.padding(bottom = 16.dp)

                )
                
                Spacer(modifier = Modifier.height(30.dp))

                Button(

                    onClick = {navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_SHOP) { inclusive = true }
                    }},

                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(15.dp),
                    colors=ButtonDefaults.buttonColors(Color.Gray)

                    ) {

//                    Text(text = "View our items!!"
//                    )


                    Text(
                        color = Color.White,
                        textAlign=TextAlign.Center,
                        text = "View Our Products!!",

                        style = MaterialTheme.typography.headlineLarge,

                        modifier = Modifier.padding(bottom = 16.dp)

                    )

                }

            }

        }

    )

}










































//    Column {
//
//        Text(text = "This is the shop screen")
//
//        Text(text = stringResource(id = R.string.mit))
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_HOME) {
//                        popUpTo(ROUTE_SHOP) { inclusive = true }
//                    }
//                },
//            text = "go to home screen",
//            textAlign = TextAlign.Center,
//            color = MaterialTheme.colorScheme.onSurface
//        )
 //   }





@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ShopScreen(rememberNavController())
}

