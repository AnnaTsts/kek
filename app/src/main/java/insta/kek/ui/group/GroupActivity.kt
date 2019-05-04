package insta.kek.ui.group

import android.os.Bundle
import insta.kek.R
import insta.kek.ui.BaseActivity

class GroupActivity : BaseActivity(3) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        setupBottomNavigation()
    }


}
