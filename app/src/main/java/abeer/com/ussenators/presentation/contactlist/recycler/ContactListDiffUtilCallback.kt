package abeer.com.ussenators.presentation.contactlist.recycler

import abeer.com.ussenators.model.UsSenatorObject
import androidx.recyclerview.widget.DiffUtil

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
class ContactListDiffUtilCallback (private val oldList: List<UsSenatorObject>,
                                   private val newList: List<UsSenatorObject>) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition].person == newList[newItemPosition].person

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition] == newList[newItemPosition]

}