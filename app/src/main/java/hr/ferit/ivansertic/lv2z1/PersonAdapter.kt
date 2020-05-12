package hr.ferit.ivansertic.lv2z1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(
    persons: MutableList<InspiringPerson>
):RecyclerView.Adapter<PersonHolder>() {
    private val persons: MutableList<InspiringPerson>

    init {
        this.persons = mutableListOf()
        this.persons.addAll(persons)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        val personView = LayoutInflater.from(parent.context)
            .inflate(R.layout.person,parent,false)
        val personHolder = PersonHolder(personView)
        return personHolder
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        val person = persons[position]
        holder.bind(person)
    }
}