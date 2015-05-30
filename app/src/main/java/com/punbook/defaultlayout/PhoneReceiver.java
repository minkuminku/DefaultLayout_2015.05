package com.punbook.defaultlayout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by admin on 5/23/2015.
 */
public class PhoneReceiver extends BroadcastReceiver {


    public PhoneReceiver() {
        super();
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle extras = intent.getExtras();
        if(extras!=null) {
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            Log.d("Phone Receiver", state);

            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String phoneNumber = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.d("Phone Receiver",phoneNumber);
            }
        }

    }

    @Override
    public IBinder peekService(Context myContext, Intent service) {
        return super.peekService(myContext, service);
    }
}

