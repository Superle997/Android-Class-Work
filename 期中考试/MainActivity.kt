package com.example.middleexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.middleexam.ui.theme.MiddleExamTheme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiddleExamTheme {
        Greeting("Android")
    }
}

// MainActivity.kt
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 设置导航栏点击事件
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_a -> {
                    startActivity(Intent(this, ActivityA::class.java))
                    true
                }
                R.id.action_b -> {
                    startActivity(Intent(this, ActivityB::class.java))
                    true
                }
                R.id.action_c -> {
                    startActivity(Intent(this, ActivityC::class.java))
                    true
                }
                else -> false
            }
        }

        fun login() {
            // 这里应该有实际的登录逻辑，例如检查用户名和密码
            // 假设用户符合条件，跳转到 IndexActivity
            val intent = Intent(this, IndexActivity::class.java)
            startActivity(intent)
        }
    }
}
