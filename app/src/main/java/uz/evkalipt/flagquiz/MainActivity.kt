package uz.evkalipt.flagquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var handler:Handler? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler = Handler()

        handler?.postDelayed(Runnable {
            play.visibility = View.VISIBLE
            exit.visibility = View.VISIBLE
            progressBar.visibility = View.INVISIBLE
        },2000)

        play.setOnClickListener {
            var intent = Intent(this,LevelsActivity::class.java)
            startActivity(intent)
        }

        exit.setOnClickListener {
            System.exit(0)
        }

    }
}