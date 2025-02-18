package edu.quinnipiac.ser210.project2a
/*
Ryan Seely
Feb 17 2025
This project uses lazyColumn to make a list of countries, their flags and a fun fact.
 */


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.shape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.material3.Border
import edu.quinnipiac.ser210.project2a.ui.theme.Project2aTheme
import org.intellij.lang.annotations.Language

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project2aTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MovieBanner(
                        name = "Scott Pilgrim vs the World",
                        length = 1.52,
                        lang = "English",
                        rating = 9.9,
                        reviews = 4,

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MovieBanner(name: String, length: Double, lang: String, rating: Double, reviews: Int,  modifier: Modifier = Modifier) {
    Box(modifier=Modifier.fillMaxSize()) {
        ScottPosterSection()
        MovieJargon(name, length, lang, rating, reviews)
    }
}



@Composable
fun ScottPosterSection(modifier: Modifier = Modifier) {
    Box {
        Image(
            painterResource(R.drawable.scottp1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(500.dp)
                .border(
                    border = BorderStroke(2.dp, Color.Yellow), shape = RoundedCornerShape(5.dp)

                )
        )

        Image(
            painterResource(R.drawable.scottp2),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .offset(x = 10.dp, y = 90.dp)
                .size(120.dp)
                .align(Alignment.BottomStart)
                .border(
                    border = BorderStroke(2.dp, Color.Red), shape = RoundedCornerShape(5.dp)

                )


        )
    }

}

@Composable
fun MovieJargon(name: String, length: Double, lang: String, rating: Double, reviews: Int,  modifier: Modifier = Modifier){
    Row(modifier = Modifier){
        Text(
            text = name,
            modifier = modifier
            .offset(x=140.dp, 548.dp)
        )
        Column(modifier = Modifier){
            Row {
                Icon(
                    Icons.Rounded.Star,
                    tint = Color.Yellow,
                    modifier = modifier.offset(x=15.dp, 600.dp),
                    contentDescription = null
                )
                Icon(
                    Icons.Rounded.Star,
                    tint = Color.Yellow,
                    modifier = modifier.offset(x=15.dp, 600.dp),
                    contentDescription = null
                )
                Icon(
                    Icons.Rounded.Star,
                    tint = Color.Yellow,
                    modifier = modifier.offset(x=15.dp, 600.dp),
                    contentDescription = null
                )
                Icon(
                    Icons.Rounded.Star,
                    tint = Color.Yellow,
                    modifier = modifier.offset(x=15.dp, 600.dp),
                    contentDescription = null
                )
                Icon(
                    Icons.Rounded.Star,
                    tint = Color.Yellow,
                    modifier = modifier.offset(x=15.dp, 600.dp),
                    contentDescription = null
                )
            }

        }

    }

    Column {
        Row(modifier = modifier,Arrangement.SpaceEvenly) {
            Text(text = "Length: \n $length",
                modifier = modifier
                    .offset(x=10.dp,y=680.dp)
                    .padding(15.dp)
            )
            Text(text = "Language: \n $lang ",
                modifier = modifier
                    .offset(x=10.dp,y=680.dp)
                    .padding(15.dp)
            )
            Text(text = "Rating: \n $rating%",
                modifier = modifier
                    .offset(x=10.dp,y=680.dp)
                    .padding(15.dp)
            )
            Text(text = "Reviews: \n $reviews",
                modifier = modifier
                    .offset(x=10.dp,y=680.dp)
                    .padding(15.dp)



            )

        }
    }




}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Project2aTheme {
        MovieBanner("Android",
        length = 0.0,
        lang = "",
        rating = 0.0,
        reviews = 1,
        modifier = Modifier
        )
    }
}