package hr.ferit.ivansertic.lv2z1


import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.person.view.*

class PersonHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(person:InspiringPerson){
        itemView.personName.text = person.name
        itemView.personBirth.text = person.dateOfBirth
        itemView.personDeath.text = person.dateOfDeath
        itemView.personDescription.text = person.description
        Picasso.get().load(Uri.parse(person.pictureLink)).fit().placeholder(R.drawable.missing).error(android.R.drawable.stat_notify_error).into(itemView.pictureId)
        itemView.pictureId.setOnClickListener {
            if (person.quotes.isEmpty())
            {
                Toast.makeText(itemView.context,"No quotes to show!", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(itemView.context, person.quotes.random(), Toast.LENGTH_LONG).show()
            }
        }
    }
}