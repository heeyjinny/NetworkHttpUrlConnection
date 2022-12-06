package com.heeyjinny.networkhttpurlconnection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heeyjinny.networkhttpurlconnection.databinding.ActivityMainBinding

/**웹 페이지 주소를 입력하여 서버로부터 응답받은 웹 페이지 코드를 화면에 출력하는 앱 만들기**/

//1
//인터넷 접근 권한 명세
//AndroidManifest.xml 작성

//2
//주소 입력받을 editText, 요청 Button
//응답 받은 코드 출력할 textView 추가
//activity_main.xml 작성

class MainActivity : AppCompatActivity() {

    //뷰바인딩
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }//onCreate
}//MainActivity