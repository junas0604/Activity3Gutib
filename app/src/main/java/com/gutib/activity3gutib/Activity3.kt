package com.gutib.activity3gutib


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gutib.activity3gutib.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {

    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val ListofItems = listOf(
            RecyAdapter.MyModel(
                "Alex Turner",
                "Software Developer Application",
                "Hi, I'm Alex Turner, and I'm eager to join your team as a Software Developer. I have a strong passion for coding and creating innovative software solutions. Let's work together to build amazing applications!"
            ),
            RecyAdapter.MyModel(
                "Sophia Johnson",
                "Mobile App Developer Application",
                "I'm Sophia Johnson, a Mobile App Developer with a passion for creating user-friendly and feature-rich mobile applications. Let's build apps that users can't live without!"
            ),
            RecyAdapter.MyModel(
                "Emily Parker",
                "Senior Backend Developer Application",
                "I'm Emily Parker, a Senior Backend Developer with extensive experience in building robust server-side solutions. Let's tackle complex challenges together and create efficient backends!"
            ),
            RecyAdapter.MyModel(
                "Michael Scott",
                "UI/UX Designer Application",
                "I'm Michael Scott, and I have a flair for creating visually appealing and user-friendly interfaces. Let's work together to make your applications stand out with beautiful design!"
            ),
            RecyAdapter.MyModel(
                "Olivia Smith",
                "Frontend Developer Application",
                "I'm Olivia Smith, a Frontend Developer who loves crafting responsive and engaging user interfaces. Let's create web applications that leave a lasting impression on users!"
            ),
            RecyAdapter.MyModel(
                "William Turner",
                "Full-stack Developer Application",
                "I'm William Turner, and I can handle both frontend and backend development with ease. Let's build versatile software solutions that cover all aspects of your projects!"
            ),
            RecyAdapter.MyModel(
                "Sophia Johnson",
                "Mobile App Developer Application",
                "I'm Sophia Johnson, a Mobile App Developer with a passion for creating user-friendly and feature-rich mobile applications. Let's build apps that users can't live without!"
            ),
            RecyAdapter.MyModel(
                "Daniel Brown",
                "Database Administrator Application",
                "I'm Daniel Brown, an experienced Database Administrator. I'm skilled in maintaining secure and efficient databases. Let's ensure your data infrastructure is rock-solid!"
            ),
            RecyAdapter.MyModel(
                "Alex Turner",
                "Software Developer Application",
                "Hi, I'm Alex Turner, and I'm eager to join your team as a Software Developer. I have a strong passion for coding and creating innovative software solutions. Let's work together to build amazing applications!"
            ),
            RecyAdapter.MyModel(
                "Oliver Davis",
                "DevOps Engineer Application",
                "I'm Oliver Davis, a DevOps Engineer with expertise in streamlining development and deployment processes. Let's ensure your software sails smoothly through CI/CD pipelines!"
            ),
            RecyAdapter.MyModel(
                "Liam Miller",
                "Data Scientist Application",
                "I'm Liam Miller, a Data Scientist with a talent for uncovering valuable insights from data. Let's harness the power of data to drive your organization's success!"
            ),
            RecyAdapter.MyModel(
                "Isabella White",
                "Software Quality Assurance Application",
                "I'm Isabella White, a Software Quality Assurance specialist dedicated to delivering bug-free software. Let's work together to make your applications flawless!"
            ),
            RecyAdapter.MyModel(
                "Mason Taylor",
                "Cybersecurity Analyst Application",
                "I'm Mason Taylor, a Cybersecurity Analyst who's passionate about keeping digital assets safe. Let's protect your software and data from any potential threats!"
            ),
            RecyAdapter.MyModel(
                "Sophia Turner",
                "Lead Software Architect Application",
                "I'm Sophia Turner, and I'm ready to lead your team as a Software Architect. Let's design software solutions that stand the test of time and deliver outstanding performance!"
            ),
            RecyAdapter.MyModel(
                "Ethan Johnson",
                "QA Tester Application",
                "I'm Ethan Johnson, and I have a sharp eye for spotting issues in software. Let's ensure that your applications are always ready for a flawless performance!"
            ),
            RecyAdapter.MyModel(
                "Ava Smith",
                "Stealthy Backend Developer Application",
                "I'm Ava Smith, and I can develop backend solutions with the precision and stealth of a ninja. Let's navigate the complexities of server-side development together!"
            ),
            RecyAdapter.MyModel(
                "Noah Davis",
                "Machine Learning Engineer Application",
                "I'm Noah Davis, a Machine Learning Engineer who's passionate about building intelligent software. Let's make your applications learn and adapt to user needs!"
            ),
            RecyAdapter.MyModel(
                "Olivia Brown",
                "Lead Software Engineer Application",
                "I'm Olivia Brown, and I'm ready to lead your team as a Lead Software Engineer. Let's forge a path to software excellence and build an empire of code!"
            ),
            RecyAdapter.MyModel(
                "Liam Miller",
                "Data Scientist Application",
                "I'm Liam Miller, a Data Scientist with a talent for uncovering valuable insights from data. Let's harness the power of data to drive your organization's success!"
            )
        )

        val adapter = RecyAdapter(ListofItems, ::onItemClick)

        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@Activity3)
            this.adapter = adapter
        }
    }

    private fun onItemClick(item: RecyAdapter.MyModel) {
        val intent = Intent(this, ActivityDetail::class.java).apply {
            putExtra("NAME_PARAMS", item.name)
            putExtra("SUBJECT_PARAMS", item.subject)
            putExtra("MESSAGE_PARAMS", item.body)
        }
        startActivity(intent)
    }
}
