package abeer.com.ussenators.domain.repository

import abeer.com.ussenators.model.UsSenatorObject
import abeer.com.ussenators.model.parser.JsonParserHelper

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
class UsSenatorsRepository constructor(val jsonParserHelper: JsonParserHelper) {

    fun getUsSenatorObjectList(): List<UsSenatorObject>? =
        jsonParserHelper.parseUsSenatorsJosnFile()
}