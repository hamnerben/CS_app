package com.ben.hamner.usu_cs_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ben.hamner.usu_cs_app.databinding.FragmentResearchBinding


data class Research(
    val name: String,
    val description: String,
    val facultyEngaged: String
)

class ResearchFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentResearchBinding.inflate(inflater, container, false)

        val research1 = Research("Artificial Intelligence", "Multi-agent systems, physics informed deep learning, criticality in natural systems, automatic differentiation, deep neural networks, AI for social impact, robotics, decision science, precision apiculture, precision agriculture, assistive technology, PIV/PTV, and computability.","Faculty: Vicki Allan, Nick Flann, Hamid Karimi, Mario Harper, and Vladimir Kulyukin")
        val research2 = Research("Algorithms", "Planning algorithms, optimization algorithms, simulation, and computational geometry.", "Faculty: John Edwards, Mario Harper, and Haitao Wang")
        val research3 = Research("Augmented Virtual Reality","3D user interfaces, human perception and cognition in VR and AR.", "Faculty: Isaac Cho")
        val research4 = Research("Computer Science Education", "Educational data mining, keystroke analysis, and educational psychology.", "Faculty: John Edwards")
        val research5 = Research("Computer Vision", "Computer vision, pattern recognition, breast ultrasound (BUS) image processing, pavement crack detection/classification, uncertainty theories & new logics,  meta-learning, deep learning for medical Information processing, medical image segmentation, deep learning-based object detection & recognition, morphed face detection,  graph-based deep learning, and machine learning.", "Faculty: Hengda Cheng and Xiaojun Qi")
        val research6 = Research("Cybersecurity", "Human aspects of security, and privacy perceptions of users.","Faculty: Mahdi Nasrullah Al-Ameen")
        val research7 = Research("Data Science and Data Mining","Applied data mining for space weather research and pattern discovery from large time series data, social network analysis, graph mining, social media mining, educational data mining, machine learning, deep learning, representation learning of graphs and multivariate time series, ML cyberinfrastructure development, deep learning and its applications in anomaly detection, and natural language processing.","Faculty: Soukaina Filali Boubrahimi, Hamid Karimi, Shah Muhammad Hamdi, and Shuhan Yuan")
        val research8 = Research("Data Visualization and Visual Analytics", "Decision-making and sense making, user behavior analytics, text analytics, and data analytics.", "Faculty: Isaac Cho")
        val research9 = Research("Database Systems", "Temporal databases, hierarchical databases, and biodiversity databases.", "Faculty: Curtis Dyreson")
        val research10 = Research("High Performance Computing and Scientific Visualization", "Big data analysis and visualization, distributed and parallel computing, topological analysis, cyberinfrastructure, cloud computing, and simulation visualization.", "Faculty:  John Edwards, Steve Petruzza")
        val research11 = Research("Information and Communication Technology for Development (ICT4D)", "Usability issues and privacy concerns around digital technology use in developing countries.", "Faculty: Mahdi Nasrullah Al-Ameen")
        val research12 = Research("Human Computer Interaction", "User behavior and challenges in technology use and corresponding workarounds, virtual reality, augmented reality, and 3D user interfaces.", "Faculty: Mahdi Nasrullah Al-Ameen, Isaac Cho")

        val researches = mutableListOf<Research>(research1, research2, research10, research3, research4, research5, research6, research7, research8, research9, research11, research12)

        binding.researchRecycler.adapter = ResearchAdapter(researches)
        binding.researchRecycler.layoutManager = LinearLayoutManager(context)
        return binding.root

    }

}