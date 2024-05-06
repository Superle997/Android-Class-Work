package com.example.middleexam

import android.view.View
import androidx.activity.ComponentActivity

class IndexActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        // 显示教师和学生信息的数量
        val teacherCount = DemoData.teachers.size
        val studentCount = DemoData.students.size

        // 更新 UI 以显示数量
        // ...
    }
    fun logout(view: View) {
        // 实现退出登录的逻辑
        // 例如，清除登录状态，返回登录页面等
    }
}
