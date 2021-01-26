package abeer.com.ussenators.presentation.contactlist.recycler

import abeer.com.ussenators.R
import abeer.com.ussenators.model.UsSenatorObject
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


/**
 * Created by Abeer Alkhars on 26/01/2021.
 */

class ContactListAdapter() : RecyclerView.Adapter<ContactListViewHolder>() {

    private val items: MutableList<UsSenatorObject> = mutableListOf()
    private var onItemClickListener: ((usSenatorObject: UsSenatorObject) -> Unit)? = null

    fun diffUpdate(newData: List<UsSenatorObject>) {
        val calculateDiff = DiffUtil.calculateDiff(ContactListDiffUtilCallback(items, newData))
        items.clear()
        items.addAll(newData)

        calculateDiff.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListViewHolder =
        ContactListViewHolder.newInstance(parent)

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ContactListViewHolder, position: Int) {
        val usSenatorObject = items[position]
        holder.nameTextView.text = usSenatorObject.person?.name
        holder.descriptionTextView.text = usSenatorObject.description
        holder.partyTextView.text = usSenatorObject.party
        usSenatorObject.getPartyType()?.imagRes?.let { holder.imageViewPhoto.setImageResource(it) }
        holder.itemView.setOnClickListener { onItemClickListener?.invoke(usSenatorObject) }
    }

    fun setOnRiskClickListener(listener: (usSenatorObject: UsSenatorObject) -> Unit) {
        this.onItemClickListener = listener
    }
}

class ContactListViewHolder(containerView: View) : RecyclerView.ViewHolder(containerView) {

    var nameTextView: TextView = containerView.findViewById(R.id.textview_name)
    var partyTextView: TextView = containerView.findViewById(R.id.textview_party)
    var descriptionTextView: TextView = containerView.findViewById(R.id.textview_description)
    var imageViewPhoto: ImageView = containerView.findViewById(R.id.textview_profile_image)

    companion object {
        fun newInstance(container: ViewGroup): ContactListViewHolder {
            return ContactListViewHolder(
                LayoutInflater.from(container.context)
                .inflate(R.layout.viewholder_contact_item, container, false))
        }
    }
}
