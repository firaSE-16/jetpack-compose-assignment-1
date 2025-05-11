// Course.kt
package com.example.courselist.model

data class Course(
    val id: Int,
    val code: String,
    val title: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: List<String>,
    val department: String,
    val semester: Int,
    val isMandatory: Boolean,
    val instructor: String? = null // Make optional for backward compatibility
)