package com.example.sakshamspc.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sakshamspc.swoosh.Utilities.EXTRA_LEAGUE
import com.example.sakshamspc.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity(){

     var selectedLeague=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
//disabling the toggle buttons other than which is selected
    fun onMensClicked(view: View){
        if(selectedLeague=="Mens"){
            mensLeagueBtn.isChecked=true
            womensLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false

        }else {
            womensLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
            selectedLeague = "Mens"
        }
    }

    fun onWomensClicked(view: View){
        if(selectedLeague=="Womens"){
            womensLeagueBtn.isChecked=true
            mensLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false

        }
        else {
            mensLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
            selectedLeague = "Womens"
        }

    }

    fun onCoedClicked(view: View){
        if(selectedLeague=="Co-Ed"){
            coedLeagueBtn.isChecked=true
            mensLeagueBtn.isChecked = false
            womensLeagueBtn.isChecked = false

        }
        else {
            mensLeagueBtn.isChecked = false
            womensLeagueBtn.isChecked = false
            selectedLeague = "Co-Ed"
        }
    }
    //When the Next button is pressed data is passed to SkillActivity with Activity Change
    fun leagueNextClicked(view:View){
        if(selectedLeague !="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this,"Please select the League...",Toast.LENGTH_SHORT).show()
        }
    }
}
