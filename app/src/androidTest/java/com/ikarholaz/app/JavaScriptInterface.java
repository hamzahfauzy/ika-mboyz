package com.ikarholaz.app;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JavaScriptInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    JavaScriptInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void pushNotif(String title, String message, String url) {
        Toast.makeText(mContext, title, Toast.LENGTH_SHORT).show();
    }
}
