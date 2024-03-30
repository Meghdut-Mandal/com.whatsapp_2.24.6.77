package com.whatsapp.phonematching;

import X.AnonymousClass01I;
import X.AnonymousClass01z;
import X.AnonymousClass09Y;
import X.AnonymousClass1CF;
import X.AnonymousClass3DY;
import X.AnonymousClass3LW;
import X.AnonymousClass3UV;
import X.C163297py;
import X.C163437qC;
import X.C18740tg;
import X.C19600wD;
import X.C19770wU;
import X.C20830yE;
import X.C21060yb;
import X.C39001qm;
import X.C90484aE;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ConnectionUnavailableDialogFragment extends Hilt_ConnectionUnavailableDialogFragment {
    public AnonymousClass3DY A00;
    public C19600wD A01;
    public C21060yb A02;
    public C20830yE A03;
    public AnonymousClass1CF A04;
    public AnonymousClass3UV A05;
    public C19770wU A06;

    public void A1f(AnonymousClass01z r2, String str) {
        C90484aE.A19(new AnonymousClass09Y(r2), this, str);
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0h = A0h();
        C18740tg.A06(A0h);
        C39001qm A002 = AnonymousClass3LW.A00(A0h);
        A002.A0c(R.string.f12nameremoved);
        A002.A0h(new C163437qC(A0h, this, 13), R.string.f12nameremoved);
        C163297py.A00(A002, this, 40, R.string.f12nameremoved);
        return A002.create();
    }
}
