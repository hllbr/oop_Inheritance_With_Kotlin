package com.hllbr.oopinheritancekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var james =Musicians("james","Guitar",58)
        /*
        Inheritance == Kalıtım
        Eğer 10 fonksiyon yazmam gerekirse ve bunlardan 7 adet fonksiyon ortak ise bir sınıf oluşturup tüm fonksiyonları bunun içinde tanımlayıp
        Bütün sınıflarımızla ordan kalıtım alıp inheritance'tan faydalanıp tüm özelliklere ulaşabilirim.

         */
    }
}