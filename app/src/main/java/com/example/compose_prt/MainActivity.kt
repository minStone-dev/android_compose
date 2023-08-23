package com.example.compose_prt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.compose_prt.ui.theme.Compose_prtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { // setContent : 표시될 화면들
            Compose_prtTheme {
                Text("Hellow")// 이런 방식으로도 view를 그릴수 있다.
                Greeting(name = "Compose") // 함수를 사용해 view를 그리는 것이 일반적이다.
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//  Text(text = "Hello $name",) //기본적인 text 사용법
    // 1. Text의 색상을 지정하는 방법
//  Text(color = Color.Blue , text = "Hellow $name")
//  Text(color = Color(0xffffffff) , text = "Hellow $name") // 해쉬값으로 색상 지정
    // 2. Text의 폰트 크기 변경법
//  Text(text = "Hellow $name", fontSize = 10.sp) // fontSize는 TextUnit을 사용하는데 sp,em만 지원한다.
//  Text(text = "Hellow $name", fontSize = 10.dp) // (X)error fontSize는 dp를 지원하지 않는다.
    // 3. 폰트 조정 방법
//  Text(text = "Hellow $name", fontWeight = FontWeight.Bold) // 글자의 두께 조절
//  Text(text = "Hellow $name", fontFamily = FontFamily.SansSerif) // 글씨체 조정
    // 4. 자간 조정 방법
//  Text(text = "Hellow $name", letterSpacing = 3.sp) // 글자마다 3sp씩 띄운다
    // 5. 최대 라인 제한
//  Text(text = "Hellow $name\nHellow $name\nHellow $name\n", maxLines = 2)
    // 6. Text 꾸미기
//  Text(text = "Hellow $name", textDecoration = TextDecoration.Underline) // 밑줄을 만든다
//  Text(text = "Hellow $name", textDecoration = TextDecoration.LineThrough) // 중앙선을 만든다
    // Text 정렬
//  Text(text = "Hellow $name", TextAlign = textAlign.Center)// text 중앙정렬
//  Text(text = "Hellow $name", TextAlign = textAlign.End)// text 오른쪽정렬
    Text(text = "Hellow $name",modifier = Modifier.width(300.dp),textAlign = TextAlign.Start)// text 왼쪽정렬
}

@Preview(showBackground = true)

@Composable
fun GreetingPreview() {
    Compose_prtTheme {
        Greeting(name = "Compose")
    }
}