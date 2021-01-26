package abeer.com.ussenators.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
@Parcelize
data class Person(
    @SerializedName("bioguideid") val bioguideid: String?,
    @SerializedName("birthday") val birthday: String?,
    @SerializedName("firstname") val firstname: String?,
    @SerializedName("gender") val gender: String?,
    @SerializedName("lastname") val lastname: String?,
    @SerializedName("link") val link: String?,
    @SerializedName("middlename") val middlename: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("namemod") val namemod: String?,
    @SerializedName("sortname") val sortname: String?
): Parcelable