package abeer.com.ussenators

import abeer.com.ussenators.domain.dagger.AndroidModule
import abeer.com.ussenators.domain.dagger.ApplicationComponent
import abeer.com.ussenators.domain.dagger.DaggerApplicationComponent
import android.app.Application

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
public class UsSenatorsApp : Application() {

    var appComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()
        appComponent =
            DaggerApplicationComponent.builder().androidModule(AndroidModule(this)).build()
        appComponent?.inject(this)
    }

}