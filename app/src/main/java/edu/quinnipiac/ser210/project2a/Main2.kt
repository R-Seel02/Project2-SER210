/*
Ryan Seely
Feb 17 2025
This project creates an awesome movie poster for the best movie every SPvW
 */


import Country
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CountryList(modifier: Modifier = Modifier
) {
    CountryListLColumn(countryList = CountryList, modifier)
}



@Composable
fun CountryListLColumn(countryList:List<Country>,modifier: Modifier = Modifier  //creates the lazy column
) {
    LazyColumn(modifier=modifier) {
        items(items= countryList){ country ->
            CountryItem(country = country, modifier)

        }
    }
}


@Composable
fun CountryItem(country: Country, modifier: Modifier = Modifier //all the components of the text and images
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.Cyan)
    ) {
        Image(
            painter = painterResource(id = country.flag),
            contentDescription = "Flag of ${country.name}",
            modifier = Modifier.size(50.dp).padding(4.dp)
        )
        Text(
            text = country.name,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(4.dp)
        )
        Text(
            text = "Currency: ${country.currency}",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(4.dp)
        )
        Text(
            text = "Fun Fact: ${country.fact}",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(4.dp)
        )
    }
}

@Preview
@Composable
private fun CountryListPreview() {
    CountryList()
}