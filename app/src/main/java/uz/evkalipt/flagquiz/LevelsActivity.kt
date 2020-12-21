package uz.evkalipt.flagquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_levels.*

class LevelsActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_levels)
        MySharedPreference.init(this)

        if (MySharedPreference.europe2sp){
            clockLevel2.visibility = View.INVISIBLE
        }
        if (MySharedPreference.northAmericasp){
            clockLevel3.visibility = View.INVISIBLE
        }
        if (MySharedPreference.southAmericasp){
            clockLevel4.visibility = View.INVISIBLE
        }
        if (MySharedPreference.asia1sp){
            clockLevel5.visibility = View.INVISIBLE
        }
        if (MySharedPreference.asia2sp){
            clockLevel6.visibility = View.INVISIBLE
        }
        if (MySharedPreference.africa1sp){
            clockLevel7.visibility = View.INVISIBLE
        }
        if (MySharedPreference.africa2sp){
            clockLevel8.visibility = View.INVISIBLE
        }
        if (MySharedPreference.allFlagssp){
            clockLevel9.visibility = View.INVISIBLE
        }

        evrope1.setOnClickListener(this)
        evrope2.setOnClickListener(this)
        northAmerica.setOnClickListener(this)
        southAmerica.setOnClickListener(this)
        asia1.setOnClickListener(this)
        asia2.setOnClickListener(this)
        africa1.setOnClickListener(this)
        africa2.setOnClickListener(this)
        allFlags.setOnClickListener(this)

        if (MySharedPreference.euro1CountStars == "1"){
            cardStarsEv11.visibility = View.VISIBLE
            cardStarsEv12.visibility = View.INVISIBLE
            cardStarsEv13.visibility = View.INVISIBLE
            cardStarsEv14.visibility = View.INVISIBLE
            cardStarsEv15.visibility = View.INVISIBLE
        }else if (MySharedPreference.euro1CountStars == "2"){
            cardStarsEv11.visibility = View.INVISIBLE
            cardStarsEv12.visibility = View.VISIBLE
            cardStarsEv13.visibility = View.INVISIBLE
            cardStarsEv14.visibility = View.INVISIBLE
            cardStarsEv15.visibility = View.INVISIBLE
        }else if (MySharedPreference.euro1CountStars == "3"){
            cardStarsEv11.visibility = View.INVISIBLE
            cardStarsEv12.visibility = View.INVISIBLE
            cardStarsEv13.visibility = View.VISIBLE
            cardStarsEv14.visibility = View.INVISIBLE
            cardStarsEv15.visibility = View.INVISIBLE
        }else if (MySharedPreference.euro1CountStars == "4"){
            cardStarsEv11.visibility = View.INVISIBLE
            cardStarsEv12.visibility = View.INVISIBLE
            cardStarsEv13.visibility = View.INVISIBLE
            cardStarsEv14.visibility = View.VISIBLE
            cardStarsEv15.visibility = View.INVISIBLE
        }else if (MySharedPreference.euro1CountStars == "5"){
            cardStarsEv11.visibility = View.INVISIBLE
            cardStarsEv12.visibility = View.INVISIBLE
            cardStarsEv13.visibility = View.INVISIBLE
            cardStarsEv14.visibility = View.INVISIBLE
            cardStarsEv15.visibility = View.VISIBLE
        }

        if (MySharedPreference.euro2CountStars == "1"){
            cardStarsEv21.visibility = View.VISIBLE
            cardStarsEv22.visibility = View.INVISIBLE
            cardStarsEv23.visibility = View.INVISIBLE
            cardStarsEv24.visibility = View.INVISIBLE
            cardStarsEv25.visibility = View.INVISIBLE
        }else if (MySharedPreference.euro2CountStars == "2"){
            cardStarsEv21.visibility = View.INVISIBLE
            cardStarsEv22.visibility = View.VISIBLE
            cardStarsEv23.visibility =View.INVISIBLE
            cardStarsEv24.visibility = View.INVISIBLE
            cardStarsEv25.visibility = View.INVISIBLE
        }else if (MySharedPreference.euro2CountStars == "3"){
            cardStarsEv21.visibility = View.INVISIBLE
            cardStarsEv22.visibility = View.INVISIBLE
            cardStarsEv23.visibility = View.VISIBLE
            cardStarsEv24.visibility = View.INVISIBLE
            cardStarsEv25.visibility = View.INVISIBLE
        }else if (MySharedPreference.euro2CountStars == "4"){
            cardStarsEv21.visibility = View.INVISIBLE
            cardStarsEv22.visibility = View.INVISIBLE
            cardStarsEv23.visibility = View.INVISIBLE
            cardStarsEv24.visibility = View.VISIBLE
            cardStarsEv25.visibility = View.INVISIBLE
        }else if (MySharedPreference.euro2CountStars == "5"){
            cardStarsEv21.visibility = View.INVISIBLE
            cardStarsEv22.visibility = View.INVISIBLE
            cardStarsEv23.visibility = View.INVISIBLE
            cardStarsEv24.visibility = View.INVISIBLE
            cardStarsEv25.visibility = View.VISIBLE
        }

        if (MySharedPreference.northAmericaCountStars == "1"){
            cardStarsNorthAmerica1.visibility = View.VISIBLE
            cardStarsNorthAmerica2.visibility = View.INVISIBLE
            cardStarsNorthAmerica3.visibility = View.INVISIBLE
            cardStarsNorthAmerica4.visibility = View.INVISIBLE
            cardStarsNorthAmerica5.visibility = View.INVISIBLE
        }else if (MySharedPreference.northAmericaCountStars == "2"){
            cardStarsNorthAmerica1.visibility = View.INVISIBLE
            cardStarsNorthAmerica2.visibility = View.VISIBLE
            cardStarsNorthAmerica3.visibility = View.INVISIBLE
            cardStarsNorthAmerica4.visibility = View.INVISIBLE
            cardStarsNorthAmerica5.visibility = View.INVISIBLE
        }else if (MySharedPreference.northAmericaCountStars == "3"){
            cardStarsNorthAmerica1.visibility = View.INVISIBLE
            cardStarsNorthAmerica2.visibility = View.INVISIBLE
            cardStarsNorthAmerica3.visibility = View.VISIBLE
            cardStarsNorthAmerica4.visibility = View.INVISIBLE
            cardStarsNorthAmerica5.visibility = View.INVISIBLE
        }else if (MySharedPreference.northAmericaCountStars == "4"){
            cardStarsNorthAmerica1.visibility = View.INVISIBLE
            cardStarsNorthAmerica2.visibility = View.INVISIBLE
            cardStarsNorthAmerica3.visibility = View.INVISIBLE
            cardStarsNorthAmerica4.visibility = View.VISIBLE
            cardStarsNorthAmerica5.visibility = View.INVISIBLE
        }else if (MySharedPreference.northAmericaCountStars == "5"){
            cardStarsNorthAmerica1.visibility = View.INVISIBLE
            cardStarsNorthAmerica2.visibility = View.INVISIBLE
            cardStarsNorthAmerica3.visibility = View.INVISIBLE
            cardStarsNorthAmerica4.visibility = View.INVISIBLE
            cardStarsNorthAmerica5.visibility = View.VISIBLE
        }

        if (MySharedPreference.southAmericaCountStars == "1"){
            cardStarsSouthAmerica1.visibility = View.VISIBLE
            cardStarsSouthAmerica2.visibility = View.INVISIBLE
            cardStarsSouthAmerica3.visibility = View.INVISIBLE
            cardStarsSouthAmerica4.visibility = View.INVISIBLE
            cardStarsSouthAmerica5.visibility = View.INVISIBLE
        }else if (MySharedPreference.southAmericaCountStars == "2"){
            cardStarsSouthAmerica1.visibility = View.INVISIBLE
            cardStarsSouthAmerica2.visibility = View.VISIBLE
            cardStarsSouthAmerica3.visibility = View.INVISIBLE
            cardStarsSouthAmerica4.visibility = View.INVISIBLE
            cardStarsSouthAmerica5.visibility = View.INVISIBLE
        }else if (MySharedPreference.southAmericaCountStars == "3"){
            cardStarsSouthAmerica1.visibility = View.INVISIBLE
            cardStarsSouthAmerica2.visibility = View.INVISIBLE
            cardStarsSouthAmerica3.visibility = View.VISIBLE
            cardStarsSouthAmerica4.visibility = View.INVISIBLE
            cardStarsSouthAmerica5.visibility = View.INVISIBLE
        }else if (MySharedPreference.southAmericaCountStars == "4"){
            cardStarsSouthAmerica1.visibility = View.INVISIBLE
            cardStarsSouthAmerica2.visibility = View.INVISIBLE
            cardStarsSouthAmerica3.visibility = View.INVISIBLE
            cardStarsSouthAmerica4.visibility = View.VISIBLE
            cardStarsSouthAmerica5.visibility = View.INVISIBLE
        }else if (MySharedPreference.southAmericaCountStars == "5"){
            cardStarsSouthAmerica1.visibility = View.INVISIBLE
            cardStarsSouthAmerica2.visibility = View.INVISIBLE
            cardStarsSouthAmerica3.visibility = View.INVISIBLE
            cardStarsSouthAmerica4.visibility = View.INVISIBLE
            cardStarsSouthAmerica5.visibility = View.VISIBLE
        }

        if (MySharedPreference.asia1CountStars == "1"){
            cardStarsAsia11.visibility = View.VISIBLE
            cardStarsAsia12.visibility = View.INVISIBLE
            cardStarsAsia13.visibility = View.INVISIBLE
            cardStarsAsia14.visibility = View.INVISIBLE
            cardStarsAsia15.visibility = View.INVISIBLE
        }else if (MySharedPreference.asia1CountStars == "2"){
            cardStarsAsia11.visibility = View.INVISIBLE
            cardStarsAsia12.visibility = View.VISIBLE
            cardStarsAsia13.visibility = View.INVISIBLE
            cardStarsAsia14.visibility = View.INVISIBLE
            cardStarsAsia15.visibility = View.INVISIBLE
        }else if (MySharedPreference.asia1CountStars == "3"){
            cardStarsAsia11.visibility = View.INVISIBLE
            cardStarsAsia12.visibility = View.INVISIBLE
            cardStarsAsia13.visibility = View.VISIBLE
            cardStarsAsia14.visibility = View.INVISIBLE
            cardStarsAsia15.visibility = View.INVISIBLE
        }else if (MySharedPreference.asia1CountStars == "4"){
            cardStarsAsia11.visibility = View.INVISIBLE
            cardStarsAsia12.visibility = View.INVISIBLE
            cardStarsAsia13.visibility = View.INVISIBLE
            cardStarsAsia14.visibility = View.VISIBLE
            cardStarsAsia15.visibility = View.INVISIBLE
        }else if (MySharedPreference.asia1CountStars == "5"){
            cardStarsAsia11.visibility = View.INVISIBLE
            cardStarsAsia12.visibility = View.INVISIBLE
            cardStarsAsia13.visibility = View.INVISIBLE
            cardStarsAsia14.visibility = View.INVISIBLE
            cardStarsAsia15.visibility = View.VISIBLE
        }

        if (MySharedPreference.asia2CountStars == "1"){
            cardStarsAsia21.visibility = View.VISIBLE
            cardStarsAsia22.visibility = View.INVISIBLE
            cardStarsAsia23.visibility = View.INVISIBLE
            cardStarsAsia24.visibility = View.INVISIBLE
            cardStarsAsia25.visibility = View.INVISIBLE
        }else if (MySharedPreference.asia2CountStars == "2"){
            cardStarsAsia21.visibility = View.INVISIBLE
            cardStarsAsia22.visibility = View.VISIBLE
            cardStarsAsia23.visibility = View.INVISIBLE
            cardStarsAsia24.visibility = View.INVISIBLE
            cardStarsAsia25.visibility = View.INVISIBLE
        }else if (MySharedPreference.asia2CountStars == "3"){
            cardStarsAsia21.visibility = View.INVISIBLE
            cardStarsAsia22.visibility = View.INVISIBLE
            cardStarsAsia23.visibility = View.VISIBLE
            cardStarsAsia24.visibility = View.INVISIBLE
            cardStarsAsia25.visibility = View.INVISIBLE
        }else if (MySharedPreference.asia2CountStars == "4"){
            cardStarsAsia21.visibility = View.INVISIBLE
            cardStarsAsia22.visibility = View.INVISIBLE
            cardStarsAsia23.visibility = View.INVISIBLE
            cardStarsAsia24.visibility = View.VISIBLE
            cardStarsAsia25.visibility = View.INVISIBLE
        }else if (MySharedPreference.asia2CountStars == "5"){
            cardStarsAsia21.visibility = View.INVISIBLE
            cardStarsAsia22.visibility = View.INVISIBLE
            cardStarsAsia23.visibility = View.INVISIBLE
            cardStarsAsia24.visibility = View.INVISIBLE
            cardStarsAsia25.visibility = View.VISIBLE
        }

        if (MySharedPreference.africa1CountStars == "1"){
            cardStarsAfrica11.visibility = View.VISIBLE
            cardStarsAfrica12.visibility = View.INVISIBLE
            cardStarsAfrica13.visibility = View.INVISIBLE
            cardStarsAfrica14.visibility = View.INVISIBLE
            cardStarsAfrica15.visibility = View.INVISIBLE
        }else if (MySharedPreference.africa1CountStars == "2"){
            cardStarsAfrica11.visibility = View.INVISIBLE
            cardStarsAfrica12.visibility = View.VISIBLE
            cardStarsAfrica13.visibility = View.INVISIBLE
            cardStarsAfrica14.visibility = View.INVISIBLE
            cardStarsAfrica15.visibility = View.INVISIBLE
        }else if (MySharedPreference.africa1CountStars == "3"){
            cardStarsAfrica11.visibility = View.INVISIBLE
            cardStarsAfrica12.visibility = View.INVISIBLE
            cardStarsAfrica13.visibility = View.VISIBLE
            cardStarsAfrica14.visibility = View.INVISIBLE
            cardStarsAfrica15.visibility = View.INVISIBLE
        }else if (MySharedPreference.africa1CountStars == "4"){
            cardStarsAfrica11.visibility = View.INVISIBLE
            cardStarsAfrica12.visibility = View.INVISIBLE
            cardStarsAfrica13.visibility = View.INVISIBLE
            cardStarsAfrica14.visibility = View.VISIBLE
            cardStarsAfrica15.visibility = View.INVISIBLE
        }else if (MySharedPreference.africa1CountStars == "5"){
            cardStarsAfrica11.visibility = View.INVISIBLE
            cardStarsAfrica12.visibility = View.INVISIBLE
            cardStarsAfrica13.visibility = View.INVISIBLE
            cardStarsAfrica14.visibility = View.INVISIBLE
            cardStarsAfrica15.visibility = View.VISIBLE
        }

        if (MySharedPreference.africa2CountStars == "1"){
            cardStarsAfrica21.visibility = View.VISIBLE
            cardStarsAfrica22.visibility = View.INVISIBLE
            cardStarsAfrica23.visibility = View.INVISIBLE
            cardStarsAfrica24.visibility = View.INVISIBLE
            cardStarsAfrica25.visibility = View.INVISIBLE
        }else if (MySharedPreference.africa2CountStars == "2"){
            cardStarsAfrica21.visibility = View.INVISIBLE
            cardStarsAfrica22.visibility = View.VISIBLE
            cardStarsAfrica23.visibility = View.INVISIBLE
            cardStarsAfrica24.visibility = View.INVISIBLE
            cardStarsAfrica25.visibility = View.INVISIBLE
        }else if (MySharedPreference.africa2CountStars == "3"){
            cardStarsAfrica21.visibility = View.INVISIBLE
            cardStarsAfrica22.visibility = View.INVISIBLE
            cardStarsAfrica23.visibility = View.VISIBLE
            cardStarsAfrica24.visibility = View.INVISIBLE
            cardStarsAfrica25.visibility = View.INVISIBLE
        }else if (MySharedPreference.africa2CountStars == "4"){
            cardStarsAfrica21.visibility = View.INVISIBLE
            cardStarsAfrica22.visibility = View.INVISIBLE
            cardStarsAfrica23.visibility = View.INVISIBLE
            cardStarsAfrica24.visibility = View.VISIBLE
            cardStarsAfrica25.visibility = View.INVISIBLE
        }else if (MySharedPreference.africa2CountStars == "5"){
            cardStarsAfrica21.visibility = View.INVISIBLE
            cardStarsAfrica22.visibility = View.INVISIBLE
            cardStarsAfrica23.visibility = View.INVISIBLE
            cardStarsAfrica24.visibility = View.INVISIBLE
            cardStarsAfrica25.visibility = View.VISIBLE
        }

        if (MySharedPreference.allFlagsCountStars == "1"){
            cardStarsAllFlags1.visibility = View.VISIBLE
            cardStarsAllFlags2.visibility = View.INVISIBLE
            cardStarsAllFlags3.visibility = View.INVISIBLE
            cardStarsAllFlags4.visibility = View.INVISIBLE
            cardStarsAllFlags5.visibility = View.INVISIBLE
        }else if (MySharedPreference.allFlagsCountStars == "2"){
            cardStarsAllFlags1.visibility = View.INVISIBLE
            cardStarsAllFlags2.visibility = View.VISIBLE
            cardStarsAllFlags3.visibility = View.INVISIBLE
            cardStarsAllFlags4.visibility = View.INVISIBLE
            cardStarsAllFlags5.visibility = View.INVISIBLE
        }else if (MySharedPreference.allFlagsCountStars == "3"){
            cardStarsAllFlags1.visibility = View.INVISIBLE
            cardStarsAllFlags2.visibility = View.INVISIBLE
            cardStarsAllFlags3.visibility = View.VISIBLE
            cardStarsAllFlags4.visibility = View.INVISIBLE
            cardStarsAllFlags5.visibility = View.INVISIBLE
        }else if (MySharedPreference.allFlagsCountStars == "4"){
            cardStarsAllFlags1.visibility = View.INVISIBLE
            cardStarsAllFlags2.visibility = View.INVISIBLE
            cardStarsAllFlags3.visibility = View.INVISIBLE
            cardStarsAllFlags4.visibility = View.VISIBLE
            cardStarsAllFlags5.visibility = View.INVISIBLE
        }else if (MySharedPreference.allFlagsCountStars == "5"){
            cardStarsAllFlags1.visibility = View.INVISIBLE
            cardStarsAllFlags2.visibility = View.INVISIBLE
            cardStarsAllFlags3.visibility = View.INVISIBLE
            cardStarsAllFlags4.visibility = View.INVISIBLE
            cardStarsAllFlags5.visibility = View.VISIBLE
        }



    }

    override fun onClick(v: View?) {
        var id = v?.id
        var intent = Intent(this, MainActivity2::class.java)
        when(id){
            R.id.evrope1->{
                intent.putExtra("card", "europa1")
                startActivity(intent)
                finish()
            }
            R.id.evrope2 -> {
                if (MySharedPreference.europe2sp) {
                    intent.putExtra("card", "europa2")
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Locked", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.northAmerica->{
                if (MySharedPreference.northAmericasp) {
                    intent.putExtra("card", "northAmerica")
                    startActivity(intent)
                    finish()
                }else{
                    Toast.makeText(this, "Locked", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.southAmerica->{
                if (MySharedPreference.southAmericasp) {
                    intent.putExtra("card", "southAmerica")
                    startActivity(intent)
                    finish()
                }else{
                    Toast.makeText(this, "Locked", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.asia1->{
                if (MySharedPreference.asia1sp) {
                    intent.putExtra("card", "asia1")
                    startActivity(intent)
                    finish()
                }else{
                    Toast.makeText(this, "Locked", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.asia2->{
                if (MySharedPreference.asia2sp) {
                    intent.putExtra("card", "asia2")
                    startActivity(intent)
                    finish()
                }else{
                    Toast.makeText(this, "Locked", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.africa1->{
                if (MySharedPreference.africa1sp) {
                    intent.putExtra("card", "africa1")
                    startActivity(intent)
                    finish()
                }else{
                    Toast.makeText(this, "Locked", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.africa2->{
                if (MySharedPreference.africa2sp) {
                    intent.putExtra("card", "africa2")
                    startActivity(intent)
                    finish()
                }else{
                    Toast.makeText(this, "Locked", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.allFlags->{
                if (MySharedPreference.allFlagssp) {
                    intent.putExtra("card", "allFlags")
                    startActivity(intent)
                    finish()
                }else{
                    Toast.makeText(this, "Locked", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }



}