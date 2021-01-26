package abeer.com.ussenators.presentation.contactlist

import abeer.com.ussenators.model.UsSenator
import abeer.com.ussenators.model.UsSenatorObject
import abeer.com.ussenators.presentation.base.BaseContract

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
interface ContactListContract {

    interface View : BaseContract.View {

        fun onContractListFetched(items: List<UsSenatorObject>?)
    }

    interface Presenter : BaseContract.Presenter<ContactListContract.View> {
        fun loadContractList()
    }
}