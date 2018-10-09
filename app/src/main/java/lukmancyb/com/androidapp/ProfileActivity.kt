package lukmancyb.com.androidapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*

/**
 * Created by #PemimpinMuda on 10/5/2018.
 */
class ProfileActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

       val nama = intent.getStringExtra("nama")
        txt_nama.text = nama

        camera.setOnClickListener{
            val phoneNumber = "081210841382"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber))
            startActivity(dialPhoneIntent)
        }
    }

}