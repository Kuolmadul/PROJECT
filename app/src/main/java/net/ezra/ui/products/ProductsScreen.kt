package net.ezra.ui.products














import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP











@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductsScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "GLAMOUR STORE",Modifier.padding(50.dp))
                },
                navigationIcon = {
                    IconButton(onClick = {  navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                    }}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
//                backgroundColor = MaterialTheme.colors.primary,
//                contentColor = Color.White,
//                elevation = 10.dp
            )
        },

        content = {

            Box {
                Image(painter = painterResource(id = R.drawable.bib), contentDescription = "",
                    modifier= Modifier
////        .background(Color.Cyan)
                        .fillMaxSize()
////                .clip(RoundedCornerShape(50))
                        .size(200.dp),
//
////    colorFilter = ColorFilter.tint(Color.Red),
                    contentScale= ContentScale.Crop
                    //contentScale = ContentScale.FillBounds

                )


            }

            Spacer(modifier = Modifier.height(20.dp))


            LazyColumn() {
                item() {

                    LazyRow {
                        item {
                            Card {
                                Image(painter = painterResource(id = R.drawable.f1), contentDescription = "")

                                Text(text = "F1")
                            }



                        }



                    }




                }
            }













        },

        bottomBar = { BottomBar(navController) }




    )



}


@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp, backgroundColor = Color.Transparent) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"",

                modifier= Modifier
                    .background(Color.Transparent)
                    .shadow(10.dp)
                    .size(30.dp)
                    .clip(RoundedCornerShape(30.dp))
            )
        },
            label = { Text(text = "Home", color = Color.White) }, selected = (selectedIndex.value == 0), onClick = {

                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                }
            })



        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"",

                modifier= Modifier
                    .background(Color.Transparent)
                    .size(30.dp)
            )
        },
            label = { Text(text = "Favorite", color = Color.White) }, selected = (selectedIndex.value == 1), onClick = {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                }

            })



        BottomNavigationItem(icon = {



            Icon(imageVector = Icons.Default.ShoppingCart, "",

                modifier= Modifier
                    .background(Color.Transparent)
                    .clip(RoundedCornerShape(50.dp))
                    .size(30.dp)
            )
        },
            label = { Text(text = "Cart", color = Color.White) }, selected = (selectedIndex.value == 2), onClick = {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                }
            })






        BottomNavigationItem(icon = {
//            Icon(
//                imageVector = Icons.Filled.AccountCircle,
//                contentDescription = "Account Icon"
//            )


            Icon(imageVector = Icons.Default.Person, "",

                modifier= Modifier
                    .background(Color.Transparent)
                    .size(30.dp)

            )
        },
            label = { Text(text = "Profile", color = Color.White) }, selected = (selectedIndex.value == 2), onClick = {
                navController.navigate(ROUTE_LOGIN) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
            })















    }
}
















@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}

