package insta.kek.ui.home

import android.os.Bundle
import android.util.Log
import insta.kek.R
import insta.kek.ui.BaseActivity

class HomeActivity : BaseActivity(0) {

    private val Tag = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        setupBottomNavigation()
        Log.d(Tag, "create")


    }
}
