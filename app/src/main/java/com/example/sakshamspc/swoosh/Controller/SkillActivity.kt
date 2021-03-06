package com.example.sakshamspc.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sakshamspc.swoosh.Utilities.EXTRA_LEAGUE
import com.example.sakshamspc.swoosh.R
import com.example.sakshamspc.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
     var league=""
     var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league=intent.getStringExtra(EXTRA_LEAGUE)

    }

    fun onBeginnerClicked(view:View){
        if(skill==="Beginner"){
            beginnerSkillBtn.isChecked=true
            expertSkillBtn.isChecked=false
        }
        else{
            expertSkillBtn.isChecked=false
            skill="Beginner"
        }
    }
    fun onExpertClicked(view:View){
        if(skill==="Expert"){
            beginnerSkillBtn.isChecked=false
            expertSkillBtn.isChecked=true
        }
        else{
            beginnerSkillBtn.isChecked=false
            skill="Expert"
        }
    }

    fun onSkillFinishClicked(view: View){
        if(skill!="") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        }
        else{
            Toast.makeText(this,"Please Select a Skill Level",Toast.LENGTH_SHORT).show()
        }
    }
}
