package com.whatsapp;

import X.AnonymousClass1H2;
import X.AnonymousClass3P9;
import android.content.DialogInterface;

@Deprecated
public class LegacyMessageDialogFragment extends Hilt_LegacyMessageDialogFragment {
    public DialogInterface.OnClickListener A00;
    public DialogInterface.OnClickListener A01;
    public AnonymousClass1H2 A02;

    public static AnonymousClass3P9 A03(Object[] objArr, int i) {
        AnonymousClass3P9 r0 = new AnonymousClass3P9();
        r0.A01 = i;
        r0.A0A = objArr;
        return r0;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
