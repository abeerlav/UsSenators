package abeer.com.ussenators.domain.dagger

import abeer.com.ussenators.UsSenatorsApp
import abeer.com.ussenators.presentation.contactlist.ContactListActivity
import abeer.com.ussenators.presentation.display.DisplayActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
@Singleton
@Component(modules = [AndroidModule::class])
interface ApplicationComponent {

    fun inject(application: UsSenatorsApp?)

    fun inject(contactListActivity: ContactListActivity?)

}