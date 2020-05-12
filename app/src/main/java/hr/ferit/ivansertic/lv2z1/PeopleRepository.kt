package hr.ferit.ivansertic.lv2z1

object PeopleRepository {
    val people: MutableList<InspiringPerson>

    init {
        people = retrievePeople()
    }

    private fun retrievePeople(): MutableList<InspiringPerson> {
        val quotesAlan:MutableList<String> = mutableListOf();
        quotesAlan.add("Sometimes it is the people no one can imagine anything of who do the things no one can imagine.")
        quotesAlan.add("We can only see a short distance ahead, but we can see plenty there that needs to be done.")
        quotesAlan.add("I'm afraid that the following syllogism may be used by some in the future.")

        val quotesLinus:MutableList<String> = mutableListOf()
        quotesLinus.add("Talk is cheap. Show me the code.")
        quotesLinus.add("Software is like sex: it's better when it's free.")
        quotesLinus.add("Microsoft isn't evil, they just make really crappy operating systems.")

        return mutableListOf(
            InspiringPerson(0,"Alan Turing","23.6.1912.", "7.6.1954"
                            ,"lan Mathison Turing OBE FRS was an English mathematician, computer scientist, logician, cryptanalyst, philosopher, and theoretical biologist.", quotesAlan,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Alan_Turing_Aged_16.jpg/176px-Alan_Turing_Aged_16.jpg"),
            InspiringPerson(1, "Linus Torvalds","28.12.1969","Still alive","Linus Benedict Torvalds is a Finnish–American software engineer who is the creator and, historically, the principal developer of the Linux kernel, which is the kernel for Linux operating systems and other operating systems such as Android and Chrome OS.",
                             quotesLinus, "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/LinuxCon_Europe_Linus_Torvalds_03_%28cropped%29.jpg/172px-LinuxCon_Europe_Linus_Torvalds_03_%28cropped%29.jpg")
        )
    }

    fun remove(id:Int) = people.removeAll{person -> person.id == id}
    fun get(id:Int): InspiringPerson? = people.find { person -> person.id == id }
    fun add(person:InspiringPerson) = people.add(person)
}