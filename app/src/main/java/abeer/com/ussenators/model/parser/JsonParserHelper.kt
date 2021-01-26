package abeer.com.ussenators.model.parser

import abeer.com.ussenators.model.UsSenator
import abeer.com.ussenators.model.UsSenatorObject
import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import javax.inject.Inject

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */

class JsonParserHelper @Inject constructor(private val context: Context) {

    private val US_SENATORS_JSON_FILE_NAME = "us-senators.json"

    private fun getJsonDataFromAsset(fileName: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

    fun parseUsSenatorsJosnFile(): List<UsSenatorObject> {
        val jsonFileString = getJsonDataFromAsset(US_SENATORS_JSON_FILE_NAME)
        return Gson().fromJson(jsonFileString, UsSenator::class.java).objects
    }
}