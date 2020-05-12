package hr.ferit.ivansertic.lv2z1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_show_people.*
import kotlinx.android.synthetic.main.person.*

class ShowPeopleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_people)
        setUpUi()
    }

    private fun setUpUi(){
        personDisplay.layoutManager= LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        personDisplay.itemAnimator = DefaultItemAnimator()
        personDisplay.addItemDecoration(DividerItemDecoration(this,RecyclerView.VERTICAL))
        displayData()
    }


    private fun displayData() {
        personDisplay.adapter = PersonAdapter(PeopleRepository.people)
    }
}
