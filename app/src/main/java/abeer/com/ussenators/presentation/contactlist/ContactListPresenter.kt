package abeer.com.ussenators.presentation.contactlist

import abeer.com.ussenators.domain.repository.UsSenatorsRepository
import javax.inject.Inject

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
public class ContactListPresenter @Inject constructor(private val usSenatorsRepository: UsSenatorsRepository) :
    ContactListContract.Presenter {

    private lateinit var view: ContactListContract.View

    override fun loadContractList() {
        view.onContractListFetched(usSenatorsRepository.getUsSenatorObjectList())
    }

    override fun subscribe() {
        TODO("Not yet implemented")
    }

    override fun unsubscribe() {
        TODO("Not yet implemented")
    }

    override fun attach(view: ContactListContract.View) {
        this.view = view
    }
}