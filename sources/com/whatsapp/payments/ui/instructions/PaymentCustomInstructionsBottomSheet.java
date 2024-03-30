package com.whatsapp.payments.ui.instructions;

import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass1A5;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass6ZA;
import X.C131606Ps;
import X.C19730wQ;
import X.C203049nB;
import X.C20810yC;
import X.C23075B3f;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PaymentCustomInstructionsBottomSheet extends Hilt_PaymentCustomInstructionsBottomSheet {
    public C19730wQ A00;
    public AnonymousClass1A5 A01;
    public C20810yC A02;
    public AnonymousClass11F A03;
    public AnonymousClass6ZA A04 = new AnonymousClass6ZA();
    public AnonymousClass1EV A05;
    public C23075B3f A06;
    public AnonymousClass1FR A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public String A0C;

    public static void A03(PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet, Integer num, int i) {
        C131606Ps r2 = new C131606Ps((String) null, new C131606Ps[0]);
        r2.A03("payment_method", "cpi");
        C203049nB.A03(r2, paymentCustomInstructionsBottomSheet.A06, num, "payment_instructions_prompt", paymentCustomInstructionsBottomSheet.A0C, i);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String A0J;
        Bundle A0b = A0b();
        this.A09 = A0b.getString("PayInstructionsKey", "");
        this.A03 = (AnonymousClass11F) A0b.getParcelable("merchantJid");
        this.A0C = A0b.getString("referral_screen");
        AnonymousClass11F r1 = this.A03;
        if (r1 == null) {
            A0J = null;
        } else {
            AnonymousClass141 A012 = this.A01.A01(r1);
            if (A012.A0K() != null) {
                A0J = A012.A0K();
            } else {
                A0J = A012.A0J();
            }
        }
        this.A08 = A0J;
        this.A0A = A0b.getString("total_amount");
        A03(this, (Integer) null, 0);
        this.A0B = this.A05.A02.A0E(7238);
        return super.A1G(bundle, layoutInflater, viewGroup);
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.A04.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A04.onDismiss(dialogInterface);
    }
}
