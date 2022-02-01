package com.example.viewmodelsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    // btn1の有効無効を格納する変数
    private val _isBtn1Enabled:MutableLiveData<Boolean> = MutableLiveData<Boolean>(true)
    // btn1の有効無効を格納する変数
    private val _isBtn2Enabled:MutableLiveData<Boolean> = MutableLiveData<Boolean>(false)
    //TextViewの値を格納する変数
    private val _text:MutableLiveData<String> = MutableLiveData<String>("")


    //上記で受け取ったMutableLiveDataを保存しておく変数たち
    val isBtn1Enabled: LiveData<Boolean> = _isBtn1Enabled
    val isBtn2Enabled: LiveData<Boolean> = _isBtn2Enabled
    val text: LiveData<String> = _text

    //EditTextの値を格納する変数
    val editText: MutableLiveData<String> = MutableLiveData<String>("")

    //ボタン1のクリックイベント
    fun onBtn1Clicked() {
        if (_isBtn1Enabled.value == true) {
            _isBtn1Enabled.value = false
            _isBtn2Enabled.value = true
        }
    }

    // ボタン2のクリックイベント
    fun onBtn2Clicked() {
        if (_isBtn2Enabled.value == true) {
            _isBtn1Enabled.value = true
            _isBtn2Enabled.value = false
        }
    }

    // 送信ボタンのクリックイベント
    fun onSendBtnClicked() {
        _text.value = editText.value.toString()
    }
}