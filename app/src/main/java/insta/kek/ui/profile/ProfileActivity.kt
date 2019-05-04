package insta.kek.ui.profile

import android.os.Bundle
import android.text.Html
import insta.kek.R
import insta.kek.ui.BaseActivity
import kotlinx.android.synthetic.main.profile_activity.*

class ProfileActivity : BaseActivity(4), ProfileMvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)
        setupBottomNavigation()
        setButtonValue();


        /*
        geting photo from presenter and seting to the profile
        profile_img.setImageResource(R.drawable.pepe)
        */

        /*
        geting username from presenter and seting
        username.setText("Anna Tsystyluik")
        */

        /*

         */

    }

    fun setUsername() {

    }

    fun setButtonValue() {
        //get subscriber , group , subscribtion
        val subscriber: Int = 10
        val group: Int = 20
        val subscribtion: Int = 30

        //

        subscriptions_button.setText(Html.fromHtml("<font color=\"grey\"><big>subscribtion<big></font><br/><big>" + subscribtion + "<big>"))
        subscriber_button.setText(Html.fromHtml("<font color=\"grey\"><big>subscriber<big></font><br/><big>" + subscriber + "<big>"))
        group_button.setText(Html.fromHtml("<font color=\"grey\"><big>group<big></font><br/><big>" + group + "<big>"))
    }
}
