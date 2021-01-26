package abeer.com.ussenators.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
data class UsSenatorObject(
    @SerializedName("caucus") val caucus: String,
    @SerializedName("congress_numbers") val congress_numbers: List<Int>,
    @SerializedName("current") val current: Boolean,
    @SerializedName("description") val description: String,
    @SerializedName("district") val district: String,
    @SerializedName("enddate") val enddate: String,
    @SerializedName("extra") val extra: Extra,
    @SerializedName("leadership_title") val leadership_title: String,
    @SerializedName("party") val party: String,
    @SerializedName("person") val person: Person,
    @SerializedName("phone") val phone: String,
    @SerializedName("role_type") val role_type: String,
    @SerializedName("role_type_label") val role_type_label: String,
    @SerializedName("senator_class") val senator_class: String,
    @SerializedName("senator_class_label") val senator_class_label: String,
    @SerializedName("senator_rank") val senator_rank: String,
    @SerializedName("senator_rank_label") val senator_rank_label: String,
    @SerializedName("startdate") val startdate: String,
    @SerializedName("state") val state: String,
    @SerializedName("title") val title: String,
    @SerializedName("title_long") val title_long: String,
    @SerializedName("website") val website: String
)