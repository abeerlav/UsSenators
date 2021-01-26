package abeer.com.ussenators.presentation.base

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
class BaseContract {

    interface Presenter<in T> {
        fun subscribe()
        fun unsubscribe()
        fun attach(view: T)
    }

    interface View {

    }
}