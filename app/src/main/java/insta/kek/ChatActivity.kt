package insta.kek

import android.os.Bundle
import android.util.Log

class ChatActivity : BaseActivity(1) {

    private val Tag = "ChatActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        setupBottomNavigation()
        Log.d(Tag, "Chat_create")
    }
}
