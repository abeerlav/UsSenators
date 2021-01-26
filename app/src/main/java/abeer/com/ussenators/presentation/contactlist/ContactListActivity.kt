package abeer.com.ussenators.presentation.contactlist

import abeer.com.ussenators.R
import abeer.com.ussenators.UsSenatorsApp
import abeer.com.ussenators.model.UsSenatorObject
import abeer.com.ussenators.model.parser.JsonParserHelper
import android.app.Activity
import android.os.Bundle
import javax.inject.Inject

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
class ContactListActivity : Activity(), ContactListContract.View {

    @Inject
    lateinit var contactListPresenter: ContactListPresenter
    @Inject
    lateinit var jsonParserHelper: JsonParserHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as UsSenatorsApp).appComponent?.inject(this)
        setContentView(R.layout.activity_contact_list)
        super.onCreate(savedInstanceState)
        contactListPresenter.attach(this)
        contactListPresenter.loadContractList()
    }

    override fun onContractListFetched(items: List<UsSenatorObject>?) {

    }


}
