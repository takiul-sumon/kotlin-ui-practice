import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink

@Composable
fun AnnotatedStringWithListenerSample(){
    val uriHandler= LocalUriHandler.current
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center ){
        Text(buildAnnotatedString { append("Build better apps ")
            val link = LinkAnnotation.Url("https://translate.google.com/",
                TextLinkStyles(SpanStyle(color = Color.Blue))){
                val url = (it as  LinkAnnotation.Url).url
                uriHandler.openUri(url)
            }
            withLink(link){
                append("jetpack compose")
            }
        })
    }


}