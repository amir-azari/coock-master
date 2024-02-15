package com.example.recipeapp.utils

object Constants {

    const val BASE_URL_API1 = "https://api.spoonacular.com/"
    //Emulator Gateway = 10.0.2.2
//    const val BASE_URL_API2 = "https://10.0.2.2:8443/api/users/"
    const val BASE_URL_API2 = "https://192.168.137.1:8443/api/users/"
    const val BASE_URL_IMAGE_INGREDIENTS = "https://spoonacular.com/cdn/ingredients_100x100/"
    const val BASE_URL_IMAGE_RECIPE = "https://spoonacular.com/recipeImages/"
    const val CONNECTION_TIME = 60L



//    const val MY_API_KEY = "7fa354c2e9804b2382cf77bd76fcdb0d"
//    const val MY_API_KEY = "82fcc55478d84819a25c948c8b9f663a"
//    const val MY_API_KEY = "bcd815a84baf41cb92ff9cfd3d526250"
//    const val MY_API_KEY = "75b83222e61d49e1a87047693650017a"
//    const val MY_API_KEY = "47797d34e62d46aa867ef99fec83692f"
//    const val MY_API_KEY = "fd80793063ce4faea1e5515031576a77"
    const val MY_API_KEY = "407dcc52c9704291afc63f2c2a6910e5"

    //APIs key
    const val API_KEY = "apiKey"
    const val NUMBER = "number"
    const val ADD_RECIPE_INFORMATION = "addRecipeInformation"
    const val SORT = "sort"
    const val TYPE = "type"
    const val INCLUDE_TAGS = "include-tags"
    const val DIET = "diet"
    const val QUERY = "query"
    const val CUISINE = "cuisine"
    const val ORDER = "sortDirection"
    const val MAXREADYTIME = "maxReadyTime"
    const val OFFSET = "offset"

    //APIS value
    const val POPULARITY = "popularity"
    const val DESCENDING = "desc"
    const val TRUE = "true"
    const val MAIN_COURSE = "main course"
    const val GLUTEN_FREE = "Gluten Free"
    const val AFRICAN = "African"


    //Register datastore
    const val REGISTER_USER_INFO = "register_user_info"
    const val USER_INFO = "user_info"
    const val LOGIN_USER_INFO = "login_user_info"
    const val REGISTER_USERNAME = "register_username"
    const val REGISTER_HASH = "register_hash"

    //Menu datastore
    const val MENU_DATASTORE = "menu_datastore"
    const val MENU_MEAL_TITLE_KEY = "menu_meal_title_key"
    const val MENU_MEAL_ID_KEY = "menu_meal_id_key"
    const val MENU_DIET_TITLE_KEY = "menu_diet_title_key"
    const val MENU_DIET_ID_KEY = "menu_diet_id_key"
    const val MENU_CUISINE_TITLE_KEY = "menu_cuisine_title_key"
    const val MENU_CUISINE_ID_KEY = "menu_cuisine_id_key"
    const val MENU_SORTING_TITLE_KEY = "menu_sorting_title_key"
    const val MENU_SORTING_ID_KEY = "menu_sorting_id_key"
    const val MENU_ORDER_TITLE_KEY = "menu_order_title_key"
    const val MENU_ORDER_ID_KEY = "menu_order_id_key"
    const val MENU_HOUR_KEY = "menu_hour_key"
    const val MENU_MINUTE_KEY = "menu_minute_key"

    //Search Menu datastore
    const val SEARCH_MENU_DATASTORE = "search_menu_datastore"
    const val SEARCH_MENU_SORTING_TITLE_KEY = "search_menu_sorting_title_key"
    const val SEARCH_MENU_SORTING_ID_KEY = "search_menu_sorting_id_key"
    const val SEARCH_MENU_ORDER_TITLE_KEY = "search_menu_order_title_key"
    const val SEARCH_MENU_ORDER_ID_KEY = "search_menu_order_id_key"
    const val SEARCH_MENU_HOUR_KEY = "search_menu_hour_key"
    const val SEARCH_MENU_MINUTE_KEY = "search_menu_minute_key"
    //Menu datastore
    const val LUCKY_MENU_DATASTORE = "lucky_menu_datastore"
    const val LUCKY_MENU_MEAL_TITLE_KEY = "lucky_menu_meal_title_key"
    const val LUCKY_MENU_MEAL_ID_KEY = "lucky_menu_meal_id_key"
    const val LUCKY_MENU_DIET_TITLE_KEY = "lucky_menu_diet_title_key"
    const val LUCKY_MENU_DIET_ID_KEY = "lucky_menu_diet_id_key"
    const val LUCKY_MENU_CUISINE_TITLE_KEY = "lucky_menu_cuisine_title_key"
    const val LUCKY_MENU_CUISINE_ID_KEY = "lucky_menu_cuisine_id_key"
    //Database
    const val RECIPE_TABLE_NAME = "recipe_table_name"
    const val RECENT_RECIPE_TABLE_NAME = "recent_recipe_table_name"
    const val DATABASE_NAME = "database_name"
    const val DETAIL_TABLE_NAME = "detail_table_name"
    const val FAVORITE_TABLE_NAME = "favorite_table_name"

    //Other
    const val OLD_IMAGE_SIZE = "312x231.jpg"
    const val NEW_IMAGE_SIZE = "636x393.jpg"
    const val REPEAT_TIME = 100
    const val DELAY_TIME = 5000L
    const val LIMITED_COUNT = 10
    const val FULL_COUNT = 50
    var STEPS_COUNT = 0
    val DEFAULT_SEARCH_QUERY = "default_search_query"
}
