package com.retailservices.camcp.ctbook.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by camcp on 27-05-2017.
 */

public class Preferences {

    //region Variables
        /*Variable encargada de almacenar todas las preferencias*/
        public static final String STRING_PREFERENCES = "CTBook.Preferences";

        /*Variables encargadas de almacenar cada dato*/
        //region Boolean
        public static final String PREFERENCE_ESTADO_BUTTON_SESION = "estado.button.sesion";
        //endregion

        //region String
        public static final String PREFERENCE_ID_USUARIO_LOGIN = "usuario.id.login";
        //endregion
    //endregion

    //region Methods
        /*Metodo encargado de guardar valores booleanos*/
        public static void savePreferenceBoolean(Context c, boolean b, String key){
            SharedPreferences preferences = c.getSharedPreferences(STRING_PREFERENCES, c.MODE_PRIVATE);
            preferences.edit().putBoolean(key, b).apply();
        }

        /*Metodo encargado de guardar valores String*/
        public static void savePreferenceString(Context c, String b, String key){
            SharedPreferences preferences = c.getSharedPreferences(STRING_PREFERENCES, c.MODE_PRIVATE);
            preferences.edit().putString(key, b).apply();
        }

        /*Metodo encargado de obtener valores booleanos*/
        public static boolean obtenerPreferenceBoolean(Context c, String key){
            SharedPreferences preferences = c.getSharedPreferences(STRING_PREFERENCES, c.MODE_PRIVATE);
            return preferences.getBoolean(key, false);//Si es que nunca que ha guardado nada en esta key retornara false
        }

        /*Metodo encargado de obtener valores String*/
        public static String obtenerPreferenceString(Context c, String key){
            SharedPreferences preferences = c.getSharedPreferences(STRING_PREFERENCES, c.MODE_PRIVATE);
            return preferences.getString(key, "");//Si es que nunca que ha guardado nada en esta key retornara false
        }
    //endregion
}
