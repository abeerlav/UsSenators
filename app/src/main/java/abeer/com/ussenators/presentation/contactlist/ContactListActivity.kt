package abeer.com.ussenators.presentation.contactlist

import abeer.com.ussenators.R
import abeer.com.ussenators.UsSenatorsApp
import abeer.com.ussenators.model.UsSenatorObject
import abeer.com.ussenators.model.parser.JsonParserHelper
import abeer.com.ussenators.presentation.contactlist.recycler.ContactListAdapter
import abeer.com.ussenators.presentation.display.DisplayActivity
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_contact_list.*
import javax.inject.Inject

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
class ContactListActivity : Activity(), ContactListContract.View {

    @Inject
    lateinit var contactListPresenter: ContactListPresenter

    private lateinit var contactListAdapter: ContactListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as UsSenatorsApp).appComponent?.inject(this)
        setContentView(R.layout.activity_contact_list)
        contactListPresenter.attach(this)

        recyclerview.apply {
            contactListAdapter = ContactListAdapter()
            contactListAdapter.setOnRiskClickListener { navigateToDisplayScreen(it) }
            layoutManager = LinearLayoutManager(this@ContactListActivity)
            adapter = contactListAdapter
        }

        contactListPresenter.loadContractList()
    }

    private fun navigateToDisplayScreen(it: UsSenatorObject?) {
        startActivity(DisplayActivity.getIntent(this, it))
    }

    override fun onContractListFetched(items: List<UsSenatorObject>?) {
        items?.let { contactListAdapter.diffUpdate(it) }
    }


}
