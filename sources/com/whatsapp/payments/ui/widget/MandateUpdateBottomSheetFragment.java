package com.whatsapp.payments.ui.widget;

import X.AE0;
import X.AF7;
import X.AnonymousClass16X;
import X.AnonymousClass9IL;
import X.C012005e;
import X.C167517yB;
import X.C175928bI;
import X.C18740tg;
import X.C198629dt;
import X.C201459je;
import X.C201599jw;
import X.C202319lY;
import X.C202699mR;
import X.C206289t2;
import X.C224514j;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C90514aH;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class MandateUpdateBottomSheetFragment extends Hilt_MandateUpdateBottomSheetFragment {
    public Button A00;
    public Button A01;
    public LinearLayout A02;
    public TextView A03;
    public C202319lY A04;
    public AE0 A05;
    public AF7 A06;
    public C167517yB A07;
    public C202699mR A08;
    public C198629dt A09;

    public void A1S(Bundle bundle, View view) {
        int i;
        AnonymousClass16X r2;
        this.A06.BOn(C36381kD.A0m(), (Integer) null, "approve_mandate_update_request_prompt", "payment_transaction_details", true);
        this.A07 = (C167517yB) C36381kD.A0P(this).A00(C167517yB.class);
        View view2 = view;
        C36421kH.A12(C012005e.A02(view2, R.id.close), this, 40);
        String A0B = this.A05.A0B();
        if (!TextUtils.isEmpty(A0B)) {
            AnonymousClass9IL.A00(C36401kF.A0G(view2, R.id.psp_logo), this.A09, A0B, (String) null);
        }
        this.A04 = ((C206289t2) A0b().getParcelable("transaction")).A00;
        this.A02.setVisibility(0);
        C175928bI r4 = (C175928bI) this.A04.A0A;
        C201599jw r0 = r4.A0G;
        C18740tg.A06(r0);
        C201459je r1 = r0.A0C;
        boolean equals = r1.A09.equals("PENDING");
        TextView textView = this.A03;
        int i2 = R.string.f12nameremoved;
        if (equals) {
            i2 = R.string.f12nameremoved;
        }
        textView.setText(i2);
        long j = r1.A00;
        int i3 = (j > r4.A0G.A01 ? 1 : (j == r4.A0G.A01 ? 0 : -1));
        boolean z = false;
        int i4 = R.string.f12nameremoved;
        if (i3 != 0) {
            z = true;
            i4 = R.string.f12nameremoved;
        }
        String A0n = A0n(i4);
        String A052 = this.A08.A05(j);
        LinearLayout linearLayout = this.A02;
        if (z) {
            i = C224514j.A00(linearLayout.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        } else {
            i = R.color.f6nameremoved;
        }
        linearLayout.addView(A00(linearLayout, A0n, A052, i, false));
        boolean equals2 = this.A04.A08.equals(r1.A00());
        int i5 = R.string.f12nameremoved;
        if (equals2) {
            i5 = R.string.f12nameremoved;
        }
        String A0n2 = A0n(i5);
        C202699mR r3 = this.A08;
        if (r1.A00() != null) {
            r2 = r1.A00();
        } else {
            r2 = this.A04.A08;
        }
        String str = r1.A07;
        if (str == null) {
            str = r4.A0G.A0G;
        }
        String A062 = r3.A06(r2, str);
        LinearLayout linearLayout2 = this.A02;
        linearLayout2.addView(A00(linearLayout2, A0n2, A062, C224514j.A00(A1D(), R.attr.f4nameremoved, R.color.f6nameremoved), true));
        if (!r1.A09.equals("INIT") || !r1.A08.equals("UNKNOWN")) {
            this.A00.setVisibility(8);
            this.A01.setVisibility(8);
            return;
        }
        C36421kH.A12(this.A00, this, 41);
        this.A01.setVisibility(0);
        C36421kH.A12(this.A01, this, 42);
    }

    private LinearLayout A00(LinearLayout linearLayout, CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        LinearLayout linearLayout2 = (LinearLayout) C36361kB.A0E(LayoutInflater.from(A0h()), linearLayout, R.layout.f9nameremoved);
        TextView A0O = C36391kE.A0O(linearLayout2, R.id.left_text);
        TextView A0O2 = C36391kE.A0O(linearLayout2, R.id.right_text);
        A0O.setText(charSequence);
        A0O2.setText(charSequence2);
        if (z) {
            A0O.setTypeface(A0O.getTypeface(), 1);
            A0O2.setTypeface(A0O2.getTypeface(), 1);
        }
        C36331k8.A0r(A0O.getContext(), A0O, i);
        C36331k8.A0r(A0O2.getContext(), A0O2, i);
        return linearLayout2;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A03 = C36391kE.A0O(A0E, R.id.title);
        this.A02 = C90514aH.A0U(A0E, R.id.update_mandate_container);
        this.A00 = (Button) C012005e.A02(A0E, R.id.positive_button);
        this.A01 = (Button) C012005e.A02(A0E, R.id.negative_button);
        return A0E;
    }
}
