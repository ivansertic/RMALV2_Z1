package hr.ferit.ivansertic.lv2z1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val quotesList:MutableList<String> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpUi()
    }

    private fun setUpUi() {
        showListId.setOnClickListener{
            navigateToList()
        }
        addPersonId.setOnClickListener {
            addPersonToAList()
        }
        addQuote.setOnClickListener {
            addQuoteToAList()
        }
    }

    private fun addQuoteToAList() {
        val quote: String = editQuotesId.text.toString()
        quotesList.add(quote)
        Toast.makeText(applicationContext,"Quote added", Toast.LENGTH_LONG).show()
    }

    private fun addPersonToAList() {
        val id: Int = PeopleRepository.people.size
        val name: String = editNameId.text.toString()
        val birth: String = editDateOfBirth.text.toString()
        val death: String = editDateOfDeath.text.toString()
        val description: String = editDescriptionID.text.toString()
        val pictureLink: String = editPictureLinkId.text.toString()
        val personQuotes: MutableList<String> = mutableListOf()

        quotesList.forEach { quote ->
            personQuotes.add(quote)
        }

        quotesList.clear()
        val newPerson: InspiringPerson = InspiringPerson(id,name,birth,death,description,personQuotes, pictureLink)
        PeopleRepository.add(newPerson)

        Toast.makeText(applicationContext,"Successfully added new person", Toast.LENGTH_LONG).show()
    }

    private fun navigateToList() {
        val listIntent: Intent = Intent(this, ShowPeopleActivity::class.java)
        startActivity(listIntent)
    }
}
