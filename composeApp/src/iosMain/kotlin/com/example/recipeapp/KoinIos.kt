import org.koin.dsl.module
import com.example.recipeapp.dbFactory.DatabaseFactory
import com.example.recipeapp.di.initKoin
import com.example.recipeapp.preferences.MultiplatformSettingsFactory

val iosModules = module {
    single { DatabaseFactory() }
    single { MultiplatformSettingsFactory() }
}

fun initKoinIOS() = initKoin(additionalModules = listOf(iosModules))