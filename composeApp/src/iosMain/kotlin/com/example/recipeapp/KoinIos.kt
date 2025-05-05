import org.koin.dsl.module
import com.example.recipeapp.dbFactory.DatabaseFactory
import com.example.recipeapp.di.initKoin

val iosModules = module {
    single { DatabaseFactory() }
//    single { MultiplatformSettingsFactory() }
}

fun initKoinIOS() = initKoin(additionalModules = listOf(iosModules))