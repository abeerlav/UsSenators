package abeer.com.ussenators.domain.dagger

import abeer.com.ussenators.UsSenatorsApp
import abeer.com.ussenators.domain.repository.UsSenatorsRepository
import abeer.com.ussenators.model.parser.JsonParserHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Abeer Alkhars on 26/01/2021.
 */
@Module
public class AndroidModule constructor(private val usSenatorsApp: UsSenatorsApp) {

    @Provides
    @Singleton
    fun provideApplicationContext() = usSenatorsApp

    @Provides
    fun provideJsonParserHelper() = JsonParserHelper(usSenatorsApp)

    @Provides
    fun provideUsSenatorsRepository(jsonParserHelper: JsonParserHelper) =
        UsSenatorsRepository(jsonParserHelper = jsonParserHelper)
}

