package com.example.trymvvm.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.trymvvm.R
import com.example.trymvvm.databinding.ActivityTempBinding

class Temp : AppCompatActivity() {

    private lateinit var binding : ActivityTempBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)

        binding = ActivityTempBinding.inflate(layoutInflater)
       val rv : RecyclerView = findViewById(R.id.listDiaries)
        // findViewById의 문제점
        // 1. 우선 너무 길어진다.
        // 2. findViewById에 잘못된 아이디를 집어넣고 다른 자료형의 변수랑 연결시키면림-> 바로 null값이 들어가면서 앱이 터져버림
        // 3. xml에는 프레임레이아웃인데 코드에서 텍스트 뷰로 자료형을 설정하면 컴파일 에러가 안난다. => xml과 코드의 뷰 속성이 다를떄
        // 4. findViewById 는 null unsafe 하고 type unsafe 합니다.

        // 이런 단점을 개선하고자 viewBinding과 dataBinding이 나옴
        // dataBinding이 더 큰개념인데 신기하게 dataBinding이 더 먼저나옴
        // dataBinding 쓰려면 xml에 layout필요하고
        // dataBinidng은 xml에 코드를 칠수 있다.
        // dataBinding쓰려면 gradle에 kapt 사용해야된다.
        // 근데 굳이 저거 안 쓴다면 viewBinding만 쓰면된다.
        // viewBinding은 기능 축소버전(평가판)
        // 평가판과 프로판 둘다 사용하면된다.
    }
}