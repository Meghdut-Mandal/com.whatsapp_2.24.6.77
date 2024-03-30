package com.whatsapp.conversation;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass3LW;
import X.AnonymousClass4AR;
import X.AnonymousClass4AS;
import X.C000800j;
import X.C001400p;
import X.C023509x;
import X.C36331k8;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C39001qm;
import X.C58212zV;
import X.C84904Fa;
import X.C88554Td;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class CustomStickerConfirmationDialog extends Hilt_CustomStickerConfirmationDialog {
    public View A00;
    public C58212zV A01;
    public final AnonymousClass00T A02 = C001400p.A00(C000800j.NONE, new C84904Fa(this));
    public final AnonymousClass00T A03 = C36431kI.A1I(new AnonymousClass4AR(this));
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass4AS(this));

    public void A1J() {
        this.A00 = null;
        super.A1J();
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        C36331k8.A1T(new CustomStickerConfirmationDialog$onViewCreated$1(this, (C023509x) null), C36411kG.A0T(this));
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A042 = AnonymousClass3LW.A04(this);
        View A0K = C36381kD.A0K(C36381kD.A0J(this), R.layout.f9nameremoved);
        this.A00 = A0K;
        A042.A0j(A0K);
        A042.A0l(this, new C88554Td(this, 12), R.string.f12nameremoved);
        A042.A0m(this, new C88554Td(this, 11), R.string.f12nameremoved);
        return C36371kC.A0O(A042);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.A00;
    }
}
