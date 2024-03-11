package com.junhe.status;

import org.apache.cordova.*;
import android.app.Activity;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;
import android.widget.Toast;

/**
 * This class echoes a string called from JavaScript.
 */
public class PhoneBackStatus extends CordovaPlugin {

     public static CallbackContext sCallbackContext;
     public static String sArgs;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("onBackPressed")) {
            String message = args.getString(0);
            this.onBackPressed(callbackContext, message);
            return true;
        } else if (action.equals("botBarHeight")) {
            this.botBarHeight(callbackContext);
            return true;
        } else if (action.equals("testPhoneStatus")) {
             String message = args.getString(0);
             this.testPhoneStatus(callbackContext, message);
             return true;
        } else {
            return false;
        }
    }

    private void onBackPressed(CallbackContext callbackContext, String args) {
        PhoneBackStatus.sCallbackContext = callbackContext;
        PhoneBackStatus.sArgs = args;
        Log.e("cdq", PhoneBackStatus.sArgs.toString());
    }

   private void botBarHeight(CallbackContext callbackContext) {
        PhoneBackStatus.sCallbackContext = callbackContext;
        Log.e("cdq", PhoneBackStatus.sArgs.toString());
   }

   private void testPhoneStatus(CallbackContext callbackContext, String msg) {
        Activity activity = this.cordova.getActivity();
        Context context = this.cordova.getActivity().getApplicationContext();
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
   }

}
