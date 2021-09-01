package com.guren.jetpackcompose.module




import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.guren.jetpackcompose.R
import com.guren.jetpackcompose.model.RealStateModelItem


@Composable
fun RealstateCard(
    realstate: RealStateModelItem,
    onClick: () -> Unit
){

    Card(
        shape = MaterialTheme.shapes.medium, modifier = Modifier
            .padding(bottom = 2.dp, top = 2.dp)
            .fillMaxWidth()
            .clickable(onClick = onClick), elevation = 8.dp
    ) {
        Column() {
            realstate.let {
                Image(painterResource(R.drawable.placeholder_home),
                    contentDescription = "Realstate Placeholder ")
            }
            realstate.realstate_id.let {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 12.dp,
                        bottom = 12.dp,
                        start = 12.dp,
                        end = 12.dp
                    )) {

                    Text(
                        text = realstate.realstate_name,
                        modifier = Modifier
                            .fillMaxWidth(0.85f)
                            .wrapContentWidth(Alignment.Start),
                        style = MaterialTheme.typography.h5
                    )
                    Text(
                        text = realstate.realstate_price,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.End)
                            .align(Alignment.CenterVertically),
                        style = MaterialTheme.typography.h5)
                }
            }
        }
      
    }    
}


