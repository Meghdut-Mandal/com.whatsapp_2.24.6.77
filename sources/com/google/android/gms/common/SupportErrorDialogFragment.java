package com.google.android.gms.common;

import X.AnonymousClass006;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog A00;
    public DialogInterface.OnCancelListener A01;
    public Dialog A02;

    public Dialog A1a(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog != null) {
            return dialog;
        }
        this.A0A = false;
        Dialog dialog2 = this.A02;
        if (dialog2 != null) {
            return dialog2;
        }
        Context A1D = A1D();
        AnonymousClass006.A01(A1D);
        AlertDialog create = new AlertDialog.Builder(A1D).create();
        this.A02 = create;
        return create;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A01;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
