package insta.kek.ui.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import insta.kek.R


class LoginActivity : AppCompatActivity() {

    private val Tag = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        Log.d(Tag, "create")
    }
}
