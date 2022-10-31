package com.example.commonlibrary

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer

  interface RxEventInterface {

    //进程内发送消息
    fun <T> post(key:String,value:T)

    //进程内发送跨进程消息
    fun <T> postAcrossProcess(key: String,value: T)

    //app之间发送消息
    fun <T> postAcrossApp(key: String,value: T)

    //注册监听消息
    fun <T> inject(key: String, cls: Class<T>, owner: LifecycleOwner, observer: Observer<T>)
}