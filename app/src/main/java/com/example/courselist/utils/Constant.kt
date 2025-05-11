// Constants.kt
package com.example.courselist.utils

import com.example.courselist.model.Course

object Constants {
    val sampleCourses = listOf(
        Course(
            id = 1,
            code = "SENG 101",
            title = "Introduction to Software Engineering",
            creditHours = 3,
            description = "Fundamental concepts of software engineering including software processes, requirements engineering, design, construction, testing, and maintenance.",
            prerequisites = listOf("None"),
            department = "Software Engineering",
            semester = 1,
            isMandatory = true,
            instructor = "Dr. Alemayehu Hailu"
        ),
        Course(
            id = 2,
            code = "COMP 202",
            title = "Data Structures and Algorithms",
            creditHours = 4,
            description = "Study of fundamental data structures and algorithms including arrays, linked lists, trees, graphs, sorting, and searching techniques.",
            prerequisites = listOf("COMP 101", "MATH 104"),
            department = "Computer Science",
            semester = 2,
            isMandatory = true,
            instructor = "Dr. Selamawit Yilma"
        ),
        Course(
            id = 3,
            code = "ELEC 301",
            title = "Digital Signal Processing",
            creditHours = 3,
            description = "Introduction to discrete-time signals and systems, sampling theorem, DFT, FFT, digital filter design and applications.",
            prerequisites = listOf("MATH 203", "ELEC 202"),
            department = "Electrical Engineering",
            semester = 3,
            isMandatory = false,
            instructor = "Dr. Tesfaye Bekele"
        ),
        Course(
            id = 4,
            code = "CIVL 401",
            title = "Structural Analysis",
            creditHours = 4,
            description = "Analysis of determinate and indeterminate structures, influence lines, approximate analysis methods, introduction to matrix methods.",
            prerequisites = listOf("MATH 205", "CIVL 302"),
            department = "Civil Engineering",
            semester = 4,
            isMandatory = true,
            instructor = "Dr. Wondimu Legesse"
        ),
        Course(
            id = 5,
            code = "CHEM 102",
            title = "Organic Chemistry",
            creditHours = 3,
            description = "Structure, properties, composition, reactions, and preparation of carbon-containing compounds.",
            prerequisites = listOf("CHEM 101"),
            department = "Chemistry",
            semester = 2,
            isMandatory = false,
            instructor = "Dr. Genet Asefa"
        ),
        Course(
            id = 6,
            code = "MATH 201",
            title = "Linear Algebra",
            creditHours = 3,
            description = "Vector spaces, linear transformations, matrices, determinants, eigenvalues and eigenvectors.",
            prerequisites = listOf("MATH 102"),
            department = "Mathematics",
            semester = 2,
            isMandatory = true,
            instructor = "Dr. Daniel Mekonnen"
        ),
        Course(
            id = 7,
            code = "PHYS 301",
            title = "Quantum Mechanics",
            creditHours = 4,
            description = "Introduction to quantum theory, Schrödinger equation, operators, hydrogen atom, spin, and perturbation theory.",
            prerequisites = listOf("PHYS 202", "MATH 203"),
            department = "Physics",
            semester = 3,
            isMandatory = true,
            instructor = "Dr. Helen Teshome"
        ),
        Course(
            id = 8,
            code = "BIOL 202",
            title = "Genetics",
            creditHours = 3,
            description = "Principles of heredity and variation in plants and animals, including molecular genetics and population genetics.",
            prerequisites = listOf("BIOL 101"),
            department = "Biology",
            semester = 2,
            isMandatory = false,
            instructor = "Dr. Samuel Wolde"
        )
    )
}