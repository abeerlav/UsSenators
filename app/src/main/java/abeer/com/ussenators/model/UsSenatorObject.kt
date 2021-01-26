package abeer.com.ussenators.model

import abeer.com.ussenators.R
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
@Parcelize
data class UsSenatorObject(
    @SerializedName("description") val description: String?,
    @SerializedName("enddate") val enddate: String?,
    @SerializedName("extra") val extra: Extra?,
    @SerializedName("party") val party: String?,
    @SerializedName("person") val person: Person?,
    @SerializedName("phone") val phone: String?,
    @SerializedName("state") val state: String?,
    @SerializedName("title") val title: String?,
    @SerializedName("website") val website: String?
) : Parcelable {
    enum class PartyType(val imagRes: Int?, val party: String?) {
        REPULBLICAN(R.drawable.ic_republican_logo, "republican"),
        DEMOCRAT(R.drawable.ic_democrat_logo, "democrat")
    }

    public fun getPartyType(): PartyType? {
        if (party?.toLowerCase().equals("republican"))
            return PartyType.REPULBLICAN
        return PartyType.DEMOCRAT
    }
}