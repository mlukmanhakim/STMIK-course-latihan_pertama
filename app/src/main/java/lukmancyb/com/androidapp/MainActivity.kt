package lukmancyb.com.androidapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val TAG = "Main Activity"
    private val pesan = "M Lukman Hakim"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", pesan)

        val text = "Halo bersulang!"
        val durasi = Toast.LENGTH_SHORT
        val toast = Toast.makeText (this, text, durasi)
        toast.show ()
        toast.setGravity (Gravity.TOP or Gravity.START, 0, 0)


        lihat_detail.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            R.id.profile->{
                Log.d(TAG, "profile clicked")
                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("nama", "M LUKMAN HAKIM")
                startActivity(intent)
            }
        }
        return true
    }



}
