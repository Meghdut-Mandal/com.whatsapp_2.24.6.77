package com.whatsapp.status;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass02E;
import X.AnonymousClass3LW;
import X.C022509m;
import X.C36371kC;
import X.C36381kD;
import X.C39001qm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public final class StatusCompanionModeUnavailableDialogFragment extends WaDialogFragment {
    public C022509m A00;

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C022509m r0 = this.A00;
        if (r0 != null) {
            r0.BVg(this, false);
        }
    }

    public Dialog A1a(Bundle bundle) {
        C022509m r0 = this.A00;
        if (r0 != null) {
            r0.BVg(this, true);
        }
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            C39001qm A002 = AnonymousClass3LW.A00(A0h);
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            A002.A0r(true);
            C39001qm.A0F(A002, this, 40, R.string.f12nameremoved);
            return C36371kC.A0O(A002);
        }
        throw C36381kD.A0k();
    }

    public void A1H() {
        super.A1H();
        this.A00 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        try {
            AnonymousClass02E A0f = A0f();
            AnonymousClass00C.A0E(A0f, "null cannot be cast to non-null type com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment.Host");
            this.A00 = (C022509m) A0f;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
