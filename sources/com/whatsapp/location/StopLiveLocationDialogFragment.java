package com.whatsapp.location;

import X.AnonymousClass1P5;
import X.AnonymousClass3LW;
import X.C18740tg;
import X.C19770wU;
import X.C36411kG;
import X.C36431kI;
import X.C39001qm;
import X.C89624Xg;
import android.app.Dialog;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;

public class StopLiveLocationDialogFragment extends Hilt_StopLiveLocationDialogFragment {
    public AnonymousClass1P5 A00;
    public C19770wU A01;

    public Dialog A1a(Bundle bundle) {
        String A17 = C36431kI.A17(A0b(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A0x = C36411kG.A0x(this);
        C18740tg.A06(A0x);
        C39001qm A03 = AnonymousClass3LW.A03(this);
        A03.A0c(R.string.f12nameremoved);
        C39001qm.A03(new C89624Xg(this, A17, A0x, 0), A03, R.string.f12nameremoved);
        return A03.create();
    }
}
