package com.codecollection.toasting;

import android.content.Context;
import android.widget.Toast;

public class Toasting {
    public static void setMessage(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
