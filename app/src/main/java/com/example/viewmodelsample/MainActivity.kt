package com.example.viewmodelsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewmodelsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel:MainActivityViewModel = MainActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 指定したレイアウトに関連したバインディングを取得
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // バインディングのviewModelに変数viewModelを設定
        binding.viewModel = viewModel
        // バインディングのlifecycleOwnerにMainActivityを設定,LiveDataの監視ができるようになる
        binding.lifecycleOwner = this
    }
}