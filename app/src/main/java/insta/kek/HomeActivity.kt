package insta.kek

import android.os.Bundle
import android.util.Log

class HomeActivity : BaseActivity(0) {

    private val Tag = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        setupBottomNavigation()
        Log.d(Tag, "create")


    }
}
