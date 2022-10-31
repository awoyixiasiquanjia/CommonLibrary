package com.example.commonlibrary

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.jeremyliao.liveeventbus.LiveEventBus

/**
 * @author sujinbiao
 * @date 2022/10/31
 * @description 跨进程通信
 */

  object  RxEventBus :RxEventInterface{

    override fun <T> post(key: String, value: T) {
        LiveEventBus.get<T>(key).post(value)
    }

    override fun <T> postAcrossProcess(key: String, value: T) {
        LiveEventBus.get<T>(key).postAcrossProcess(value)
    }

    override fun <T> postAcrossApp(key: String, value: T) {
        LiveEventBus.get<T>(key).postAcrossApp(value)
    }

    override fun <T> inject(key: String,cls: Class<T>, owner: LifecycleOwner, observer: Observer<T>){
       LiveEventBus.get<T>(key,cls).observe(owner,observer)
   }



}