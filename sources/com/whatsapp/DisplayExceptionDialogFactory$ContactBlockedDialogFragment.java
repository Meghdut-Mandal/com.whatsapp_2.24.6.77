package com.whatsapp;

import X.AnonymousClass01I;
import X.AnonymousClass1NG;
import X.AnonymousClass4XI;
import X.C18740tg;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class DisplayExceptionDialogFactory$ContactBlockedDialogFragment extends Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment {
    public AnonymousClass1NG A00;

    public Dialog A1a(Bundle bundle) {
        Log.w("home/dialog contact-blocked");
        Bundle A0b = A0b();
        String A17 = C36431kI.A17(A0b, "message");
        ArrayList parcelableArrayList = A0b.getParcelableArrayList("jids");
        C18740tg.A06(parcelableArrayList);
        AnonymousClass01I A0i = A0i();
        AnonymousClass1NG r4 = this.A00;
        C39001qm A01 = C39001qm.A01(A0i, A17);
        C39001qm.A03(new AnonymousClass4XI(A0i, r4, parcelableArrayList, 0), A01, R.string.f12nameremoved);
        return A01.create();
    }
}
