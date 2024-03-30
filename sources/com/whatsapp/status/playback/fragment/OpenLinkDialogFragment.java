package com.whatsapp.status.playback.fragment;

import X.AnonymousClass00C;
import X.AnonymousClass17Y;
import X.C20380xT;
import X.C21060yb;
import X.C29731Xt;
import X.C32691e2;
import X.C88574Tf;
import android.content.DialogInterface;

public abstract class OpenLinkDialogFragment extends Hilt_OpenLinkDialogFragment {
    public AnonymousClass17Y A00;
    public C32691e2 A01;
    public C21060yb A02;
    public C29731Xt A03;
    public C88574Tf A04;
    public C20380xT A05;

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C88574Tf r0 = this.A04;
        if (r0 != null) {
            r0.BVf();
        }
    }
}
