package com.example.middleexam.data

// Teacher 数据类
data class Teacher(
    val id: Int,
    val name: String,
    val subject: String,
    val experience: Int,
    val rating: Float
)

// Student 数据类
data class Student(
    val id: Int,
    val name: String,
    val grade: String,
    val attendance: Int,
    val score: Float
)

val teachers = listOf(
    Teacher(1, "张老师", "数学", 10, 4.5f),
    // ... 其他教师数据
)

val students = listOf(
    Student(1, "小明", "一年级", 95, 90.5f),
    // ... 其他学生数据
)

