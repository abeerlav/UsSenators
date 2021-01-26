package abeer.com.ussenators.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
data class Extra(
    @SerializedName("address") val address: String,
    @SerializedName("contact_form") val contact_form: String,
    @SerializedName("fax") val fax: String,
    @SerializedName("office") val office: String,
    @SerializedName("rss_url") val rss_url: String
)