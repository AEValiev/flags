package uz.evkalipt.flagquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_levels.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var mInterstitialAd: InterstitialAd
    lateinit var mAdView : AdView
    private var doubleBackToExitPressedOnce = false
    var list: ArrayList<Country>? = null
    var count = 0
    var country: Country? = null
    var boolean = false
    var topCountryName: String = ""
    var list2: ArrayList<Int>? = null
    var heart = 0
    var card:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        MySharedPreference.init(this)

        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713")

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        mInterstitialAd.adListener = object : AdListener(){
            override fun onAdClosed() {
                var intent = Intent(this@MainActivity2, LevelsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        setList()

        card = intent.getStringExtra("card")

        if (card == "europa1"){
            europe1()
            dropNumber.setText("/18")
        }else if (card == "europa2"){
            europe2()
            dropNumber.setText("/15")
        }else if (card == "northAmerica"){
            northAmerica()
            dropNumber.setText("/12")
        }else if (card == "southAmerica"){
            southAmerica()
            dropNumber.setText("/12")
        }else if (card == "asia1"){
            asia1()
            dropNumber.setText("/20")
        }else if (card == "asia2"){
            asia2()
            dropNumber.setText("/19")
        }else if (card == "africa1"){
            africa1()
            dropNumber.setText("/20")
        }else if (card == "africa2"){
            africa2()
            dropNumber.setText("/14")
        }else if (card == "allFlags"){
            allFlags()
            dropNumber.setText("/130")
        }

        setElement(count)

        mAdView.adListener = object: AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdFailedToLoad(adError : LoadAdError) {
                // Code to be executed when an ad request fails.
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            override fun onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        }
    }

    fun europe1() {
        list = ArrayList()

        list?.add(Country(R.drawable.belgium_ev1, "BELGIUM"))
        list?.add(Country(R.drawable.belorus_ev1, "BELORUS"))
        list?.add(Country(R.drawable.czech_ev1, "CZECH"))
        list?.add(Country(R.drawable.denmark_ev1, "DENMARK"))
        list?.add(Country(R.drawable.estonia_ev1, "ESTONIA"))
        list?.add(Country(R.drawable.finland_ev1, "FINLAND"))
        list?.add(Country(R.drawable.germany_ev1, "GERMANY"))
        list?.add(Country(R.drawable.hungary_ev1, "HUNGARY"))
        list?.add(Country(R.drawable.ireland_ev1, "IRELAND"))
        list?.add(Country(R.drawable.latvia_ev1, "LATVIA"))
        list?.add(Country(R.drawable.lithuania_ev1, "LITHUANIA"))
        list?.add(Country(R.drawable.moldova_ev1, "MOLDOVA"))
        list?.add(Country(R.drawable.netherlands_ev1, "NETHERLANDS"))
        list?.add(Country(R.drawable.norwey_ev1, "NORWEY"))
        list?.add(Country(R.drawable.poland_ev1, "POLAND"))
        list?.add(Country(R.drawable.romania_ev1, "ROMANIA"))
        list?.add(Country(R.drawable.slovakia_ev1, "SLOVAKIA"))
        list?.add(Country(R.drawable.sweden_ev1, "SWEDEN"))

        list?.shuffle()
    }

    fun europe2() {
        list = ArrayList()

        list?.add(Country(R.drawable.albania_ev2, "ALBANIA"))
        list?.add(Country(R.drawable.austria_ev2, "AUSTRIA"))
        list?.add(Country(R.drawable.bulgaria_ev2, "BULGARIA"))
        list?.add(Country(R.drawable.croatia_ev2, "CROATIA"))
        list?.add(Country(R.drawable.france_ev2, "FRANCE"))
        list?.add(Country(R.drawable.greece_ev2, "GREECE"))
        list?.add(Country(R.drawable.italy_ev2, "ITALY"))
        list?.add(Country(R.drawable.macedonia_ev2, "MACEDONIA"))
        list?.add(Country(R.drawable.portugal_ev2, "PORTUGAL"))
        list?.add(Country(R.drawable.serbia_ev2, "SERBIA"))
        list?.add(Country(R.drawable.slovenia_ev2, "SLOVENIA"))
        list?.add(Country(R.drawable.spain_ev2, "SPAIN"))
        list?.add(Country(R.drawable.switzerland_ev2, "SWITZERLAND"))
        list?.add(Country(R.drawable.ukraine_ev2, "UKRAINE"))
        list?.add(Country(R.drawable.unitedkingdom_ev2, "UNITEDKINGDOM"))

        list?.shuffle()
    }

    fun northAmerica() {
        list = ArrayList()

        list?.add(Country(R.drawable.belize_sa, "BELIZE"))
        list?.add(Country(R.drawable.canada_sa, "CANADA"))
        list?.add(Country(R.drawable.costarica_sa, "COSTARICA"))
        list?.add(Country(R.drawable.cuba_sa, "CUBA"))
        list?.add(Country(R.drawable.guatemala_sa, "GUATEMALA"))
        list?.add(Country(R.drawable.haiti_sa, "HAITI"))
        list?.add(Country(R.drawable.honduras_sa, "HONDURAS"))
        list?.add(Country(R.drawable.jamaica_sa, "JAMAICA"))
        list?.add(Country(R.drawable.mexico_sa, "MEXICO"))
        list?.add(Country(R.drawable.nicaragua_sa, "NICARAGUA"))
        list?.add(Country(R.drawable.panama_sa, "PANAMA"))
        list?.add(Country(R.drawable.usa_sa, "USA"))

        list?.shuffle()
    }

    fun southAmerica(){
        list = ArrayList()

        list?.add(Country(R.drawable.argentina_ya, "ARGENTINA"))
        list?.add(Country(R.drawable.bolivia_ya, "BOLIVIA"))
        list?.add(Country(R.drawable.brazil_ya, "BRAZIL"))
        list?.add(Country(R.drawable.chile_ya, "CHILE"))
        list?.add(Country(R.drawable.colombia_ya, "COLOMBIA"))
        list?.add(Country(R.drawable.ecuador_ya, "ECUADOR"))
        list?.add(Country(R.drawable.paraguay_ya, "PARAGUAY"))
        list?.add(Country(R.drawable.peru_ya, "PERU"))
        list?.add(Country(R.drawable.suriname_ya, "SURINAME"))
        list?.add(Country(R.drawable.uruguay_ya, "URUGUAY"))
        list?.add(Country(R.drawable.venezuela_ya, "VENEZUELA"))
        list?.add(Country(R.drawable.guyana_ya, "GUYANA"))

        list?.shuffle()
    }

    private fun asia1() {
        list = ArrayList()

        list?.add(Country(R.drawable.uzb2, "UZBEKISTAN"))
        list?.add(Country(R.drawable.india2, "INDIA"))
        list?.add(Country(R.drawable.indonesia2, "INDONESIA"))
        list?.add(Country(R.drawable.iraq2, "IRAQ"))
        list?.add(Country(R.drawable.iran2, "IRAN"))
        list?.add(Country(R.drawable.kazak2, "KAZAKHSTAN"))
        list?.add(Country(R.drawable.kirgiz2, "KYRGYZSTAN"))
        list?.add(Country(R.drawable.kitay2, "CHINA"))
        list?.add(Country(R.drawable.malaysia2, "MALAYSIA"))
        list?.add(Country(R.drawable.mongolia2, "MONGOLIA"))
        list?.add(Country(R.drawable.pakistan2, "PAKISTAN"))
        list?.add(Country(R.drawable.russia2, "RUSSIA"))
        list?.add(Country(R.drawable.severnaya_korea2, "NORTHKOREA"))
        list?.add(Country(R.drawable.tadjik2, "TADJIKISTAN"))
        list?.add(Country(R.drawable.thailand2, "THAILAND"))
        list?.add(Country(R.drawable.turkmen2, "TURKMENISTAN"))
        list?.add(Country(R.drawable.vietnam2, "VIETNAM"))
        list?.add(Country(R.drawable.yapon2, "JAPAN"))
        list?.add(Country(R.drawable.yujnaya_korea2, "SOUTHKOREA"))
        list?.add(Country(R.drawable.australia2, "AUSTRALIA"))

        list?.shuffle()
    }

    fun asia2(){
        list = ArrayList()

        list?.add(Country(R.drawable.afghanistan_osiyo2, "AFGHANISTAN"))
        list?.add(Country(R.drawable.armenia_osiyo2, "ARMENIA"))
        list?.add(Country(R.drawable.azerbaijan_osiyo2, "AZERBAIJAN"))
        list?.add(Country(R.drawable.bangladesh_osiyo2, "BANGLADESH"))
        list?.add(Country(R.drawable.burma_osiyo2, "BURMA"))
        list?.add(Country(R.drawable.cambodia_osiyo2, "CAMBODIA"))
        list?.add(Country(R.drawable.georgia_osiyo2, "GEORGIA"))
        list?.add(Country(R.drawable.israel_osiyo2, "ISRAEL"))
        list?.add(Country(R.drawable.jordan_osiyo2, "JORDAN"))
        list?.add(Country(R.drawable.laos_osiyo2, "LAOS"))
        list?.add(Country(R.drawable.lebanon_osiyo2, "LEBANON"))
        list?.add(Country(R.drawable.nepal_osiyo2, "NEPAL"))
        list?.add(Country(R.drawable.oman_osiyo2, "OMAN"))
        list?.add(Country(R.drawable.philippines_osiyo2, "PHILIPPINES"))
        list?.add(Country(R.drawable.saudiarabia_osiyo2, "SAUDIARABIA"))
        list?.add(Country(R.drawable.srilanka_osiyo2, "SRILANKA"))
        list?.add(Country(R.drawable.syria_osiyo2, "SYRIA"))
        list?.add(Country(R.drawable.turkey_osiyo2, "TURKEY"))
        list?.add(Country(R.drawable.yemen_osiyo2, "YEMEN"))

        list?.shuffle()
    }

    fun africa1(){
        list = ArrayList()

        list?.add(Country(R.drawable.algeria_af1, "ALGERIA"))
        list?.add(Country(R.drawable.benin_af1, "BENIN"))
        list?.add(Country(R.drawable.cameroon_af1, "CAMEROON"))
        list?.add(Country(R.drawable.chad_af1, "CHAD"))
        list?.add(Country(R.drawable.egypt_af1, "EGYPT"))
        list?.add(Country(R.drawable.eritrea_af1, "ERITREA"))
        list?.add(Country(R.drawable.ethiopia_af1, "ATHIOPIA"))
        list?.add(Country(R.drawable.ghana_af1, "GHANA"))
        list?.add(Country(R.drawable.guinea_af1, "GUINEA"))
        list?.add(Country(R.drawable.liberia_af1, "LIBERIA"))
        list?.add(Country(R.drawable.libya_af1, "LIBYA"))
        list?.add(Country(R.drawable.mali_af1, "MALI"))
        list?.add(Country(R.drawable.morocco_af1, "MOROCCO"))
        list?.add(Country(R.drawable.muritania_af1, "MURITANIA"))
        list?.add(Country(R.drawable.niger_af1, "NIGER"))
        list?.add(Country(R.drawable.nigeria_af1, "NIGERIA"))
        list?.add(Country(R.drawable.senegal_af1, "SENEGAL"))
        list?.add(Country(R.drawable.somalia_af1, "SOMALIA"))
        list?.add(Country(R.drawable.sudan_af1, "SUDAN"))
        list?.add(Country(R.drawable.togo_af1, "TOGO"))

        list?.shuffle()
    }

    fun africa2(){
        list = ArrayList()

        list?.add(Country(R.drawable.angola_af2, "ANGOLA"))
        list?.add(Country(R.drawable.botswana_af2, "BOTSWANA"))
        list?.add(Country(R.drawable.gabon_af2, "GABON"))
        list?.add(Country(R.drawable.kenya_af2, "KENYA"))
        list?.add(Country(R.drawable.madagascar_af2, "MADAGASCAR"))
        list?.add(Country(R.drawable.malawi_af2, "MALAWI"))
        list?.add(Country(R.drawable.mozambique_af2, "MOZAMBIQUE"))
        list?.add(Country(R.drawable.namibia_af2, "NAMIBIA"))
        list?.add(Country(R.drawable.southafrica_af2, "SOUTHAFRICA"))
        list?.add(Country(R.drawable.tanzania_af2, "TANZANIA"))
        list?.add(Country(R.drawable.tunisia_af2, "TUNISIA"))
        list?.add(Country(R.drawable.uganda_af2, "UGANDA"))
        list?.add(Country(R.drawable.zambia_af2, "ZAMBIA"))
        list?.add(Country(R.drawable.zimbabwe_af2, "ZIMBABWE"))

        list?.shuffle()
    }

    fun allFlags(){
        list = ArrayList()

        list?.add(Country(R.drawable.belgium_ev1, "BELGIUM"))
        list?.add(Country(R.drawable.belorus_ev1, "BELORUS"))
        list?.add(Country(R.drawable.czech_ev1, "CZECH"))
        list?.add(Country(R.drawable.denmark_ev1, "DENMARK"))
        list?.add(Country(R.drawable.estonia_ev1, "ESTONIA"))
        list?.add(Country(R.drawable.finland_ev1, "FINLAND"))
        list?.add(Country(R.drawable.germany_ev1, "GERMANY"))
        list?.add(Country(R.drawable.hungary_ev1, "HUNGARY"))
        list?.add(Country(R.drawable.ireland_ev1, "IRELAND"))
        list?.add(Country(R.drawable.latvia_ev1, "LATVIA"))
        list?.add(Country(R.drawable.lithuania_ev1, "LITHUANIA"))
        list?.add(Country(R.drawable.moldova_ev1, "MOLDOVA"))
        list?.add(Country(R.drawable.netherlands_ev1, "NETHERLANDS"))
        list?.add(Country(R.drawable.norwey_ev1, "NORWEY"))
        list?.add(Country(R.drawable.poland_ev1, "POLAND"))
        list?.add(Country(R.drawable.romania_ev1, "ROMANIA"))
        list?.add(Country(R.drawable.slovakia_ev1, "SLOVAKIA"))
        list?.add(Country(R.drawable.sweden_ev1, "SWEDEN"))
        list?.add(Country(R.drawable.albania_ev2, "ALBANIA"))
        list?.add(Country(R.drawable.austria_ev2, "AUSTRIA"))
        list?.add(Country(R.drawable.bulgaria_ev2, "BULGARIA"))
        list?.add(Country(R.drawable.croatia_ev2, "CROATIA"))
        list?.add(Country(R.drawable.france_ev2, "FRANCE"))
        list?.add(Country(R.drawable.greece_ev2, "GREECE"))
        list?.add(Country(R.drawable.italy_ev2, "ITALY"))
        list?.add(Country(R.drawable.macedonia_ev2, "MACEDONIA"))
        list?.add(Country(R.drawable.portugal_ev2, "PORTUGAL"))
        list?.add(Country(R.drawable.serbia_ev2, "SERBIA"))
        list?.add(Country(R.drawable.slovenia_ev2, "SLOVENIA"))
        list?.add(Country(R.drawable.spain_ev2, "SPAIN"))
        list?.add(Country(R.drawable.switzerland_ev2, "SWITZERLAND"))
        list?.add(Country(R.drawable.ukraine_ev2, "UKRAINE"))
        list?.add(Country(R.drawable.unitedkingdom_ev2, "UNITEDKINGDOM"))
        list?.add(Country(R.drawable.belize_sa, "BELIZE"))
        list?.add(Country(R.drawable.canada_sa, "CANADA"))
        list?.add(Country(R.drawable.costarica_sa, "COSTARICA"))
        list?.add(Country(R.drawable.cuba_sa, "CUBA"))
        list?.add(Country(R.drawable.guatemala_sa, "GUATEMALA"))
        list?.add(Country(R.drawable.haiti_sa, "HAITI"))
        list?.add(Country(R.drawable.honduras_sa, "HONDURAS"))
        list?.add(Country(R.drawable.jamaica_sa, "JAMAICA"))
        list?.add(Country(R.drawable.mexico_sa, "MEXICO"))
        list?.add(Country(R.drawable.nicaragua_sa, "NICARAGUA"))
        list?.add(Country(R.drawable.panama_sa, "PANAMA"))
        list?.add(Country(R.drawable.usa_sa, "USA"))
        list?.add(Country(R.drawable.argentina_ya, "ARGENTINA"))
        list?.add(Country(R.drawable.bolivia_ya, "BOLIVIA"))
        list?.add(Country(R.drawable.brazil_ya, "BRAZIL"))
        list?.add(Country(R.drawable.chile_ya, "CHILE"))
        list?.add(Country(R.drawable.colombia_ya, "COLOMBIA"))
        list?.add(Country(R.drawable.ecuador_ya, "ECUADOR"))
        list?.add(Country(R.drawable.paraguay_ya, "PARAGUAY"))
        list?.add(Country(R.drawable.peru_ya, "PERU"))
        list?.add(Country(R.drawable.suriname_ya, "SURINAME"))
        list?.add(Country(R.drawable.uruguay_ya, "URUGUAY"))
        list?.add(Country(R.drawable.venezuela_ya, "VENEZUELA"))
        list?.add(Country(R.drawable.guyana_ya, "GUYANA"))
        list?.add(Country(R.drawable.uzb2, "UZBEKISTAN"))
        list?.add(Country(R.drawable.india2, "INDIA"))
        list?.add(Country(R.drawable.indonesia2, "INDONESIA"))
        list?.add(Country(R.drawable.iraq2, "IRAQ"))
        list?.add(Country(R.drawable.iran2, "IRAN"))
        list?.add(Country(R.drawable.kazak2, "KAZAKHSTAN"))
        list?.add(Country(R.drawable.kirgiz2, "KYRGYZSTAN"))
        list?.add(Country(R.drawable.kitay2, "CHINA"))
        list?.add(Country(R.drawable.malaysia2, "MALAYSIA"))
        list?.add(Country(R.drawable.mongolia2, "MONGOLIA"))
        list?.add(Country(R.drawable.pakistan2, "PAKISTAN"))
        list?.add(Country(R.drawable.russia2, "RUSSIA"))
        list?.add(Country(R.drawable.severnaya_korea2, "NORTHKOREA"))
        list?.add(Country(R.drawable.tadjik2, "TADJIKISTAN"))
        list?.add(Country(R.drawable.thailand2, "THAILAND"))
        list?.add(Country(R.drawable.turkmen2, "TURKMENISTAN"))
        list?.add(Country(R.drawable.vietnam2, "VIETNAM"))
        list?.add(Country(R.drawable.yapon2, "JAPAN"))
        list?.add(Country(R.drawable.yujnaya_korea2, "SOUTHKOREA"))
        list?.add(Country(R.drawable.australia2, "AUSTRALIA"))
        list?.add(Country(R.drawable.afghanistan_osiyo2, "AFGHANISTAN"))
        list?.add(Country(R.drawable.armenia_osiyo2, "ARMENIA"))
        list?.add(Country(R.drawable.azerbaijan_osiyo2, "AZERBAIJAN"))
        list?.add(Country(R.drawable.bangladesh_osiyo2, "BANGLADESH"))
        list?.add(Country(R.drawable.burma_osiyo2, "BURMA"))
        list?.add(Country(R.drawable.cambodia_osiyo2, "CAMBODIA"))
        list?.add(Country(R.drawable.georgia_osiyo2, "GEORGIA"))
        list?.add(Country(R.drawable.israel_osiyo2, "ISRAEL"))
        list?.add(Country(R.drawable.jordan_osiyo2, "JORDAN"))
        list?.add(Country(R.drawable.laos_osiyo2, "LAOS"))
        list?.add(Country(R.drawable.lebanon_osiyo2, "LEBANON"))
        list?.add(Country(R.drawable.nepal_osiyo2, "NEPAL"))
        list?.add(Country(R.drawable.oman_osiyo2, "OMAN"))
        list?.add(Country(R.drawable.philippines_osiyo2, "PHILIPPINES"))
        list?.add(Country(R.drawable.saudiarabia_osiyo2, "SAUDIARABIA"))
        list?.add(Country(R.drawable.srilanka_osiyo2, "SRILANKA"))
        list?.add(Country(R.drawable.syria_osiyo2, "SYRIA"))
        list?.add(Country(R.drawable.turkey_osiyo2, "TURKEY"))
        list?.add(Country(R.drawable.yemen_osiyo2, "YEMEN"))
        list?.add(Country(R.drawable.algeria_af1, "ALGERIA"))
        list?.add(Country(R.drawable.benin_af1, "BENIN"))
        list?.add(Country(R.drawable.cameroon_af1, "CAMEROON"))
        list?.add(Country(R.drawable.chad_af1, "CHAD"))
        list?.add(Country(R.drawable.egypt_af1, "EGYPT"))
        list?.add(Country(R.drawable.eritrea_af1, "ERITREA"))
        list?.add(Country(R.drawable.ethiopia_af1, "ATHIOPIA"))
        list?.add(Country(R.drawable.ghana_af1, "GHANA"))
        list?.add(Country(R.drawable.guinea_af1, "GUINEA"))
        list?.add(Country(R.drawable.liberia_af1, "LIBERIA"))
        list?.add(Country(R.drawable.libya_af1, "LIBYA"))
        list?.add(Country(R.drawable.mali_af1, "MALI"))
        list?.add(Country(R.drawable.morocco_af1, "MOROCCO"))
        list?.add(Country(R.drawable.muritania_af1, "MURITANIA"))
        list?.add(Country(R.drawable.niger_af1, "NIGER"))
        list?.add(Country(R.drawable.nigeria_af1, "NIGERIA"))
        list?.add(Country(R.drawable.senegal_af1, "SENEGAL"))
        list?.add(Country(R.drawable.somalia_af1, "SOMALIA"))
        list?.add(Country(R.drawable.sudan_af1, "SUDAN"))
        list?.add(Country(R.drawable.togo_af1, "TOGO"))
        list?.add(Country(R.drawable.angola_af2, "ANGOLA"))
        list?.add(Country(R.drawable.botswana_af2, "BOTSWANA"))
        list?.add(Country(R.drawable.gabon_af2, "GABON"))
        list?.add(Country(R.drawable.kenya_af2, "KENYA"))
        list?.add(Country(R.drawable.madagascar_af2, "MADAGASCAR"))
        list?.add(Country(R.drawable.malawi_af2, "MALAWI"))
        list?.add(Country(R.drawable.mozambique_af2, "MOZAMBIQUE"))
        list?.add(Country(R.drawable.namibia_af2, "NAMIBIA"))
        list?.add(Country(R.drawable.southafrica_af2, "SOUTHAFRICA"))
        list?.add(Country(R.drawable.tanzania_af2, "TANZANIA"))
        list?.add(Country(R.drawable.tunisia_af2, "TUNISIA"))
        list?.add(Country(R.drawable.uganda_af2, "UGANDA"))
        list?.add(Country(R.drawable.zambia_af2, "ZAMBIA"))
        list?.add(Country(R.drawable.zimbabwe_af2, "ZIMBABWE"))

        list?.shuffle()
    }

    fun setList(){
        list2 = ArrayList()
        for (i in 0 until 16){
            list2?.add(-1)
        }
    }

    private fun setElement(c: Int) {
        help.setOnClickListener(this)
        country = list?.get(c)
        val randomCountryName = randomCountryName(country?.name.toString())
        imageViev.setImageResource(country?.image!!)
        var length = country?.name.toString().length
        for (i in 0 until length) {
            var button1 = Button(this)
            button1.setBackgroundResource(R.drawable.button_background_top)
            button1.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f
            )
            button1.setOnClickListener(this)
            topLinear2.addView(button1)
        }

        for (i in 0 until 8) {
            var button2 = Button(this)
            button2.setText(randomCountryName[i])
            button2.setBackgroundResource(R.drawable.button_background_top)
            button2.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT, 1.0f
            )
            button2.setOnClickListener(this)
            middleLinear2.addView(button2)
        }

        for (i in 8 until 16) {
            var button2 = Button(this)
            button2.setText(randomCountryName[i])
            button2.setBackgroundResource(R.drawable.button_background_top)
            button2.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT, 1.0f
            )
            button2.setOnClickListener(this)
            bottomLinear2.addView(button2)
        }

    }

    fun randomCountryName(str: String): List<String> {
        var list = ArrayList<String>()
        var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        var alphabetList = ArrayList<String>()
        for (i in 0 until alphabet.length) {
            alphabetList.add(alphabet.substring(i, i + 1))
        }
        alphabetList.shuffle()
        var lengthStr = str.length
        var l = 16 - lengthStr
        for (i in 0 until str.length) {
            list.add(str.substring(i, i + 1))
        }
        for (i in 0 until l) {
            list.add(alphabetList[i])
        }
        list.shuffle()
        return list
    }

    override fun onClick(v: View?) {
        var length = country?.name?.length
        var button = v as Button
        if (v?.parent == middleLinear2) {
            if (button.text != "") {
                val indexOfChild = middleLinear2.indexOfChild(button)
                for (i in 0 until length!!) {
                    val btn = topLinear2.getChildAt(i) as Button
                    if (btn.text == "") {
                        btn.text = button.text
                        list2?.set(indexOfChild, i)
                        button.text = ""
                        break
                    }
                }
            }
        } else if (v?.parent == bottomLinear2) {
            if (button.text != "") {
                val indexOfChild = bottomLinear2.indexOfChild(button)
                var index = indexOfChild + 8
                for (i in 0 until length!!) {
                    val btn = topLinear2.getChildAt(i) as Button
                    if (btn.text == "") {
                        btn.text = button.text
                        list2?.set(index, i)
                        button.text = ""
                        break
                    }
                }
            }
        } else if (v?.parent == topLinear2) {
            if (button.text != "") {
                val topButtonIndex = topLinear2.indexOfChild(button)
                for (i in 0 until list2!!.size) {
                    if (list2!![i] == topButtonIndex) {
                        if (i < 8) {
                            val button1 = middleLinear2.getChildAt(i) as Button
                            button1.text = button.text
                            list2!![i] = -1
                            button.text = ""
                            break
                        } else {
                            val button1 = bottomLinear2.getChildAt(i - 8) as Button
                            button1.text = button.text
                            list2!![i] = -1
                            button.text = ""
                            break
                        }
                    }
                }
            }
        } else if (v.id == help.id) {
            when (heart) {
                0 -> {
                    topCountryName = ""
                    heart1.visibility = View.INVISIBLE
                    val countryName = country?.name.toString()
                    for (i in 0 until countryName.length) {
                        val button1 = topLinear2.getChildAt(i) as Button
                        button1.text = countryName.substring(i, i + 1)
                    }
                }
                1 -> {
                    topCountryName = ""
                    heart2.visibility = View.INVISIBLE
                    val countryName = country?.name.toString()
                    for (i in 0 until countryName.length) {
                        val button1 = topLinear2.getChildAt(i) as Button
                        button1.text = countryName.substring(i, i + 1)
                    }
                }
                2 -> {
                    topCountryName = ""
                    heart3.visibility = View.INVISIBLE
                    val countryName = country?.name.toString()
                    for (i in 0 until countryName.length) {
                        val button1 = topLinear2.getChildAt(i) as Button
                        button1.text = countryName.substring(i, i + 1)
                    }
                }
                3 -> {
                    topCountryName = ""
                    heart4.visibility = View.INVISIBLE
                    val countryName = country?.name.toString()
                    for (i in 0 until countryName.length) {
                        val button1 = topLinear2.getChildAt(i) as Button
                        button1.text = countryName.substring(i, i + 1)
                    }
                    help.visibility = View.GONE
                }
            }
            heart++
        }
        for (i in 0 until length!!) {
            val button1 = topLinear2.getChildAt(i) as Button
            if (button1.text != "") {
                topCountryName += button1.text
                if (topCountryName.length == length) {
                    boolean = true
                    break
                }
            } else {
                topCountryName = ""
                boolean = false
                break
            }
        }
        if (boolean) {
            finishPage(country?.name.toString(), topCountryName)
        }
    }


    private fun finishPage(str1: String, str2: String) {
        if ((card == "europa1" && count == 17) || (card == "europa2" && count == 14) || (card == "northAmerica" && count == 11) ||
            (card == "southAmerica" && count == 11) || (card == "asia1" && count == 19) || (card == "asia2" && count == 18) ||
            (card == "africa1" && count == 19) || (card == "africa2" && count == 13)) {
            if (card == "europa1"){
                MySharedPreference.europe2sp = true
                if (heart == 0) {
                    stars5.visibility = View.VISIBLE
                    MySharedPreference.euro1CountStars = "5"
                } else if (heart == 1) {
                    stars4.visibility = View.VISIBLE
                    MySharedPreference.euro1CountStars = "4"
                } else if (heart == 2) {
                    stars3.visibility = View.VISIBLE
                    MySharedPreference.euro1CountStars = "3"
                } else if (heart == 3) {
                    stars2.visibility = View.VISIBLE
                    MySharedPreference.euro1CountStars = "2"
                } else if (heart == 4) {
                    stars.visibility = View.VISIBLE
                    MySharedPreference.euro1CountStars = "1"
                }
                Toast.makeText(this, "level 2 unlocked", Toast.LENGTH_SHORT).show()
            }else if (card == "europa2"){
                MySharedPreference.northAmericasp = true
                if (heart == 0) {
                    stars5.visibility = View.VISIBLE
                    MySharedPreference.euro2CountStars = "5"
                } else if (heart == 1) {
                    stars4.visibility = View.VISIBLE
                    MySharedPreference.euro2CountStars = "4"
                } else if (heart == 2) {
                    stars3.visibility = View.VISIBLE
                    MySharedPreference.euro2CountStars = "3"
                } else if (heart == 3) {
                    stars2.visibility = View.VISIBLE
                    MySharedPreference.euro2CountStars = "2"
                } else if (heart == 4) {
                    stars.visibility = View.VISIBLE
                    MySharedPreference.euro2CountStars = "1"
                }
                Toast.makeText(this, "level 3 unlocked", Toast.LENGTH_SHORT).show()
            }else if (card == "northAmerica"){
                MySharedPreference.southAmericasp = true
                if (heart == 0) {
                    stars5.visibility = View.VISIBLE
                    MySharedPreference.northAmericaCountStars = "5"
                } else if (heart == 1) {
                    stars4.visibility = View.VISIBLE
                    MySharedPreference.northAmericaCountStars = "4"
                } else if (heart == 2) {
                    stars3.visibility = View.VISIBLE
                    MySharedPreference.northAmericaCountStars = "3"
                } else if (heart == 3) {
                    stars2.visibility = View.VISIBLE
                    MySharedPreference.northAmericaCountStars = "2"
                } else if (heart == 4) {
                    stars.visibility = View.VISIBLE
                    MySharedPreference.northAmericaCountStars = "1"
                }
                Toast.makeText(this, "level 4 unlocked", Toast.LENGTH_SHORT).show()
            }else if (card == "southAmerica"){
                MySharedPreference.asia1sp = true
                if (heart == 0) {
                    stars5.visibility = View.VISIBLE
                    MySharedPreference.southAmericaCountStars = "5"
                } else if (heart == 1) {
                    stars4.visibility = View.VISIBLE
                    MySharedPreference.southAmericaCountStars = "4"
                } else if (heart == 2) {
                    stars3.visibility = View.VISIBLE
                    MySharedPreference.southAmericaCountStars = "3"
                } else if (heart == 3) {
                    stars2.visibility = View.VISIBLE
                    MySharedPreference.southAmericaCountStars = "2"
                } else if (heart == 4) {
                    stars.visibility = View.VISIBLE
                    MySharedPreference.southAmericaCountStars = "1"
                }
                Toast.makeText(this, "level 5 unlocked", Toast.LENGTH_SHORT).show()
            }else if (card =="asia1"){
                MySharedPreference.asia2sp = true
                if (heart == 0) {
                    stars5.visibility = View.VISIBLE
                    MySharedPreference.asia1CountStars = "5"
                } else if (heart == 1) {
                    stars4.visibility = View.VISIBLE
                    MySharedPreference.asia1CountStars = "4"
                } else if (heart == 2) {
                    stars3.visibility = View.VISIBLE
                    MySharedPreference.asia1CountStars = "3"
                } else if (heart == 3) {
                    stars2.visibility = View.VISIBLE
                    MySharedPreference.asia1CountStars = "2"
                } else if (heart == 4) {
                    stars.visibility = View.VISIBLE
                    MySharedPreference.asia1CountStars = "1"
                }
                Toast.makeText(this, "level 6 unlocked", Toast.LENGTH_SHORT).show()
            }else if (card == "asia2"){
                MySharedPreference.africa1sp = true
                if (heart == 0) {
                    stars5.visibility = View.VISIBLE
                    MySharedPreference.asia2CountStars = "5"
                } else if (heart == 1) {
                    stars4.visibility = View.VISIBLE
                    MySharedPreference.asia2CountStars = "4"
                } else if (heart == 2) {
                    stars3.visibility = View.VISIBLE
                    MySharedPreference.asia2CountStars = "3"
                } else if (heart == 3) {
                    stars2.visibility = View.VISIBLE
                    MySharedPreference.asia2CountStars = "2"
                } else if (heart == 4) {
                    stars.visibility = View.VISIBLE
                    MySharedPreference.asia2CountStars = "1"
                }
                Toast.makeText(this, "level 7 unlocked", Toast.LENGTH_SHORT).show()
            }else if (card == "africa1"){
                MySharedPreference.africa2sp = true
                if (heart == 0) {
                    stars5.visibility = View.VISIBLE
                    MySharedPreference.africa1CountStars = "5"
                } else if (heart == 1) {
                    stars4.visibility = View.VISIBLE
                    MySharedPreference.africa1CountStars = "4"
                } else if (heart == 2) {
                    stars3.visibility = View.VISIBLE
                    MySharedPreference.africa1CountStars = "3"
                } else if (heart == 3) {
                    stars2.visibility = View.VISIBLE
                    MySharedPreference.africa1CountStars = "2"
                } else if (heart == 4) {
                    stars.visibility = View.VISIBLE
                    MySharedPreference.africa1CountStars = "1"
                }
                Toast.makeText(this, "level 8 unlocked", Toast.LENGTH_SHORT).show()
            }else if (card == "africa2"){
                MySharedPreference.allFlagssp = true
                if (heart == 0) {
                    stars5.visibility = View.VISIBLE
                    MySharedPreference.africa2CountStars = "5"
                } else if (heart == 1) {
                    stars4.visibility = View.VISIBLE
                    MySharedPreference.africa2CountStars = "4"
                } else if (heart == 2) {
                    stars3.visibility = View.VISIBLE
                    MySharedPreference.africa2CountStars = "3"
                } else if (heart == 3) {
                    stars2.visibility = View.VISIBLE
                    MySharedPreference.africa2CountStars = "2"
                } else if (heart == 4) {
                    stars.visibility = View.VISIBLE
                    MySharedPreference.africa2CountStars = "1"
                }
                Toast.makeText(this, "level 9 unlocked", Toast.LENGTH_SHORT).show()
            }else if (card == "allFlags"){
                if (heart == 0) {
                    stars5.visibility = View.VISIBLE
                    MySharedPreference.allFlagsCountStars = "5"
                } else if (heart == 1) {
                    stars4.visibility = View.VISIBLE
                    MySharedPreference.allFlagsCountStars = "4"
                } else if (heart == 2) {
                    stars3.visibility = View.VISIBLE
                    MySharedPreference.allFlagsCountStars = "3"
                } else if (heart == 3) {
                    stars2.visibility = View.VISIBLE
                    MySharedPreference.allFlagsCountStars = "2"
                } else if (heart == 4) {
                    stars.visibility = View.VISIBLE
                    MySharedPreference.allFlagsCountStars = "1"
                }
            }
            enabledViews(false)
            back.visibility = View.VISIBLE
            touWin.visibility = View.VISIBLE

        } else {
            if (str1 == str2) {
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
                enabledViews(false)
                nextButton.visibility = View.VISIBLE
                count++
            } else {
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun enabledViews(boolean1: Boolean) {
        help.isEnabled = boolean1
        for (i in 0 until 8) {
            val button1 = middleLinear2.getChildAt(i) as Button
            val button2 = bottomLinear2.getChildAt(i) as Button
            button1.isEnabled = boolean1
            button2.isEnabled = boolean1
        }
        for (i in 0 until country?.name.toString().length) {
            val button = topLinear2.getChildAt(i) as Button
            button.isEnabled = boolean1
        }

    }

    fun onClickNext(view: View) {
        tvNumberOriginal.text = (count + 1).toString()
        topCountryName = ""
        topLinear2.removeAllViews()
        middleLinear2.removeAllViews()
        bottomLinear2.removeAllViews()
        val button = view as Button
        button.visibility = View.GONE
        setList()
        setElement(count)
        help.isEnabled = true
    }

    fun onClickBack(view: View) {
        if (mInterstitialAd.isLoaded){
            mInterstitialAd.show()
        }else {
            var intent = Intent(this, LevelsActivity::class.java)
            startActivity(intent)
            back.visibility = View.INVISIBLE
            finish()
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            if (mInterstitialAd.isLoaded){
                mInterstitialAd.show()
            }else{
                var intent = Intent(this@MainActivity2, LevelsActivity::class.java)
                startActivity(intent)
                finish()
            }
            super.onBackPressed()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable {
            doubleBackToExitPressedOnce = false
        }, 2000)
    }
}
