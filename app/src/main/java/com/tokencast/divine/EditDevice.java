package com.tokencast.divine;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

public class RegisterDevice {

    public static RegisterDevice registerDevice = null;
    public Dialog mDialog;

    public static RegisterDevice getInstance() {
        if (registerDevice == null) {
            registerDevice = new RegisterDevice();
        }
        return registerDevice;
    }

    public void showRegisterDialog(Context context) {
        mDialog = new Dialog(context);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.WHITE)));
        mDialog.setContentView(R.layout.registerdevice_layout);
        mDialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        mDialog.getWindow().setGravity(Gravity.TOP);
        mDialog.setCancelable(true);
        mDialog.show();
    }

    public void hideDialog() {
        if (mDialog != null) {
            mDialog.dismiss();
            mDialog = null;
        }
    }
}
