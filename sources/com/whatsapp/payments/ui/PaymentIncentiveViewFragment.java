package com.whatsapp.payments.ui;

import X.AVY;
import X.AnonymousClass001;
import X.AnonymousClass16X;
import X.AnonymousClass1N3;
import X.AnonymousClass6O3;
import X.C117675me;
import X.C198299dE;
import X.C19970wo;
import X.C203049nB;
import X.C20810yC;
import X.C21060yb;
import X.C23075B3f;
import X.C32681e1;
import X.C36331k8;
import X.C36401kF;
import X.C90514aH;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class PaymentIncentiveViewFragment extends Hilt_PaymentIncentiveViewFragment {
    public AnonymousClass1N3 A00;
    public C21060yb A01;
    public C19970wo A02;
    public C20810yC A03;
    public C117675me A04;
    public C32681e1 A05;
    public final C23075B3f A06;
    public final AnonymousClass6O3 A07;

    public PaymentIncentiveViewFragment(C23075B3f b3f, AnonymousClass6O3 r2) {
        this.A07 = r2;
        this.A06 = b3f;
    }

    public void A19() {
        super.A19();
        this.A04 = null;
    }

    public void A1S(Bundle bundle, View view) {
        TextEmojiLabel textEmojiLabel;
        CharSequence charSequence;
        super.A1S(bundle, view);
        AnonymousClass6O3 r2 = this.A07;
        C198299dE r6 = r2.A01;
        C203049nB.A04(C203049nB.A01(this.A02, (AnonymousClass16X) null, r2, (String) null, true), this.A06, "incentive_details", "new_payment");
        if (r6 == null) {
            Log.e("PAY: PaymentIncentiveViewFragment/PaymentIncentiveOfferInfo is null or has null items in it");
            return;
        }
        this.A02.setText(r6.A0F);
        String str = r6.A0C;
        if (!TextUtils.isEmpty(str)) {
            C32681e1 r7 = this.A05;
            Context context = this.A00.getContext();
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = r6.A0B;
            String[] strArr = new String[1];
            C90514aH.A1Q(this.A00.A00(str), strArr, 0);
            charSequence = r7.A01(context, C36401kF.A0q(this, "learn-more", A0M, 1, R.string.f12nameremoved), new Runnable[]{new AVY(this, 32)}, new String[]{"learn-more"}, strArr);
            C36331k8.A16(this.A00, this.A01);
            C36331k8.A1A(this.A03, this.A00);
            textEmojiLabel = this.A00;
        } else {
            textEmojiLabel = this.A00;
            charSequence = r6.A0B;
        }
        textEmojiLabel.setText(charSequence);
    }
}
