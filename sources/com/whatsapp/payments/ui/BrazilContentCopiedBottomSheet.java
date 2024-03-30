package com.whatsapp.payments.ui;

import X.AnonymousClass00C;
import X.AnonymousClass6ZA;
import X.C131606Ps;
import X.C203049nB;
import X.C23075B3f;
import X.C36331k8;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class BrazilContentCopiedBottomSheet extends Hilt_BrazilContentCopiedBottomSheet {
    public AnonymousClass6ZA A00 = new AnonymousClass6ZA();
    public C23075B3f A01;
    public String A02;

    public static final void A03(BrazilContentCopiedBottomSheet brazilContentCopiedBottomSheet, Integer num, int i) {
        C131606Ps r2 = new C131606Ps((String) null, new C131606Ps[0]);
        r2.A03("payment_method", "pix");
        String str = brazilContentCopiedBottomSheet.A02;
        C23075B3f b3f = brazilContentCopiedBottomSheet.A01;
        if (b3f != null) {
            C203049nB.A03(r2, b3f, num, "pix_payment_instructions_prompt", str, i);
            return;
        }
        throw C36331k8.A0d("fieldStatEventLogger");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        this.A02 = A0b().getString("referral_screen");
        A03(this, (Integer) null, 0);
        return super.A1G(bundle, layoutInflater, viewGroup);
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onCancel(dialogInterface);
        this.A00.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        this.A00.onDismiss(dialogInterface);
    }
}
