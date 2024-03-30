package com.whatsapp.payments.ui;

import X.AnonymousClass6ZA;
import X.AnonymousClass9v1;
import X.C012005e;
import X.C131606Ps;
import X.C193159Kb;
import X.C203049nB;
import X.C20810yC;
import X.C21060yb;
import X.C22984Aza;
import X.C23075B3f;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class AddPaymentMethodBottomSheet extends Hilt_AddPaymentMethodBottomSheet {
    public C21060yb A00;
    public C20810yC A01;
    public C23075B3f A02;
    public C193159Kb A03;
    public C22984Aza A04;
    public final AnonymousClass6ZA A05 = new AnonymousClass6ZA();

    public void onCancel(DialogInterface dialogInterface) {
        this.A05.onDismiss(dialogInterface);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView A0P;
        TextView A0P2;
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        C193159Kb r0 = this.A03;
        if (r0 != null) {
            int i = r0.A02;
            if (!(i == 0 || (A0P2 = C36391kE.A0P(A0E, R.id.add_payment_method_bottom_sheet_title)) == null)) {
                A0P2.setText(i);
            }
            int i2 = this.A03.A01;
            TextEmojiLabel A0P3 = C36401kF.A0P(A0E, R.id.add_payment_method_bottom_sheet_desc);
            if (A0P3 != null) {
                C36331k8.A16(A0P3, this.A00);
                C36331k8.A1A(this.A01, A0P3);
                A0P3.setText(i2);
            }
            int i3 = this.A03.A00;
            if (!(i3 == 0 || (A0P = C36391kE.A0P(A0E, R.id.add_payment_method)) == null)) {
                A0P.setText(i3);
            }
        }
        String string = A0b().getString("referral_screen");
        C203049nB.A04((C131606Ps) null, this.A02, "get_started", string);
        C012005e.A02(A0E, R.id.add_payment_method).setOnClickListener(new AnonymousClass9v1(15, string, this));
        return A0E;
    }
}
