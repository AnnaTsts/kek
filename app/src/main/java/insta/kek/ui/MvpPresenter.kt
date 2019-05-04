package insta.kek.ui

interface MvpPresenter<in T : MvpView> {

    /**
     * method for passing View to the presenter. Those. View will call it and pass it on.
     * @param mvpView
     */
    abstract fun attachView(MvpView: T)

    /**
     *signal to the presenter that View is ready to go. The presenter may begin to load data.
     */
    abstract fun viewIsReady()

    /**
     *
    The presenter should reset the link to the Activity.
     */
    abstract fun detachView()

    abstract fun destroy()
}