package com.guren.jetpackcompose

sealed class Screen(val route:String){
    object MainScreen   : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")
    object RealstateScreen : Screen("realstate_screen")

    fun withArgs(vararg args:String): String{
        return buildString {
            append(route)
            args.forEach { args ->
                append("/$args")
            }
        }

    }
}
