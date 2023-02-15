package com.blogspot.devofandroid.firebaserealtimedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database= FirebaseDatabase.getInstance()
        val refKisiler =database.getReference("kisiler")

        /*val kisi= Kisiler("ahmet",10)
        refKisiler.push().setValue(kisi)

        refKisiler.child("-NOK9YJdsViw2s2pF5uH").removeValue()

        val updateInfo = HashMap<String,Any>()
        updateInfo["kisi_ad"] = "Yeni mehmet"
        updateInfo["kisi_yas"] = 15
        refKisiler.child("-NOK9YJdsViw2s2pF5uH").updateChildren(updateInfo)

        refKisiler.addValueEventListener(object : ValueEventListener{


            override fun onDataChange(ds: DataSnapshot) {

                for(p in ds.children){
                    val kisi = p.getValue(Kisiler::class.java)
                    if(kisi != null){
                        val key =p.key
                        Log.e("Kişi ad",kisi.kisi_ad.toString())
                        Log.e("Kişi yaş",(kisi.kisi_yas).toString())
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }
        } )

         */

    }
}