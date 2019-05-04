package insta.kek.ui.chat

import android.os.Bundle
import android.util.Log
import insta.kek.R
import insta.kek.ui.BaseActivity

class ChatActivity : BaseActivity(1) {

    private val Tag = "ChatActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        setupBottomNavigation()
        Log.d(Tag, "Chat_create")
    }
}
