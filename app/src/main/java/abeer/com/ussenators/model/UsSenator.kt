package abeer.com.ussenators.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
data class UsSenator(

    @SerializedName("objects") val objects: List<UsSenatorObject>
)