import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SimpleTypo(){
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ){
        Text("Simple Text", fontSize = 20.sp, color = Color.Blue)
    }

}

@Preview(showSystemUi = true)
@Composable
fun SimpleTextPreview(){
    SimpleTypo()
}
