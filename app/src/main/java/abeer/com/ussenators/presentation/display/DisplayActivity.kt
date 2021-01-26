package abeer.com.ussenators.presentation.display

import abeer.com.ussenators.R
import abeer.com.ussenators.UsSenatorsApp
import abeer.com.ussenators.model.UsSenatorObject
import abeer.com.ussenators.model.parser.JsonParserHelper
import abeer.com.ussenators.presentation.contactlist.ContactListContract
import abeer.com.ussenators.presentation.contactlist.ContactListPresenter
import abeer.com.ussenators.presentation.contactlist.recycler.ContactListAdapter
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_contact_list.*
import kotlinx.android.synthetic.main.activity_display.*
import kotlinx.android.synthetic.main.viewholder_contact_item.*
import javax.inject.Inject

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
public class DisplayActivity : Activity(){

    private val usSenatorObject: UsSenatorObject? get() = intent.extras?.getParcelable<UsSenatorObject>(KEY_US_SENATOR)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        usSenatorObject?.getPartyType()?.imagRes?.let { imageview_image.setImageResource(it) }
        textview_address.text = usSenatorObject?.extra?.address
        textview_bio_guide_id.text = usSenatorObject?.person?.bioguideid
        textview_birthday.text = usSenatorObject?.person?.birthday
        textview_enddate.text = usSenatorObject?.enddate
        textview_person_name.text = usSenatorObject?.person?.name
        textview_fullname.text = usSenatorObject?.person?.firstname+" "+usSenatorObject?.person?.lastname
        textview_link.text= usSenatorObject?.person?.link
        textview_gender.text = usSenatorObject?.person?.gender
        textview_office.text = usSenatorObject?.extra?.office
        textview_phone.text =usSenatorObject?.phone
        textview_website.text = usSenatorObject?.website
        textview_sort_name.text = usSenatorObject?.person?.sortname
    }

    companion object {

        const val KEY_US_SENATOR = "KEY_US_SENATOR"

        fun getIntent(context: Context?,  usSenatorObject: UsSenatorObject?): Intent? =
            Intent(context, DisplayActivity::class.java)
                .apply {
                    putExtra(KEY_US_SENATOR, usSenatorObject)
                }
    }

}
