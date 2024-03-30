package com.whatsapp.voipcalling.dialogs;

import X.AnonymousClass00T;
import X.AnonymousClass1MK;
import X.AnonymousClass3LW;
import X.AnonymousClass3TE;
import X.AnonymousClass4ST;
import X.AnonymousClass4XQ;
import X.C36331k8;
import X.C36371kC;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class MessageDialogFragment extends Hilt_MessageDialogFragment {
    public AnonymousClass1MK A00;
    public AnonymousClass4ST A01;

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass4ST r0;
        AnonymousClass1MK r02 = this.A00;
        if (r02 == null) {
            throw C36331k8.A0d("voipCallState");
        } else if (!r02.A00() && (r0 = this.A01) != null) {
            r0.dismiss();
        }
    }

    public Dialog A1a(Bundle bundle) {
        Context A0a = A0a();
        A0b();
        AnonymousClass00T A012 = AnonymousClass3TE.A01(this, "message");
        C39001qm A002 = AnonymousClass3LW.A00(A0a);
        C39001qm.A09(A002, C36431kI.A1E(A012));
        A002.A0h(new AnonymousClass4XQ(this, 25), R.string.f12nameremoved);
        return C36371kC.A0O(A002);
    }
}
