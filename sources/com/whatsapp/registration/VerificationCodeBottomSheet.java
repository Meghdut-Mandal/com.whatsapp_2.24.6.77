package com.whatsapp.registration;

import X.AnonymousClass001;
import X.AnonymousClass14B;
import X.AnonymousClass2O0;
import X.AnonymousClass3Y6;
import X.C012005e;
import X.C16550pQ;
import X.C18740tg;
import X.C18820ts;
import X.C19420v0;
import X.C20810yC;
import X.C21010yW;
import X.C25271Fq;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class VerificationCodeBottomSheet extends Hilt_VerificationCodeBottomSheet implements C16550pQ {
    public C25271Fq A00;
    public C19420v0 A01;
    public C18820ts A02;
    public C20810yC A03;
    public C21010yW A04;

    public static VerificationCodeBottomSheet A03(String str) {
        VerificationCodeBottomSheet verificationCodeBottomSheet = new VerificationCodeBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("code", str);
        verificationCodeBottomSheet.A17(A07);
        return verificationCodeBottomSheet;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        char charAt;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        if (this.A03.A0E(3159)) {
            C36391kE.A0O(inflate, R.id.header).setText(R.string.f12nameremoved);
            C36391kE.A0O(inflate, R.id.description).setGravity(17);
            Context A1D = A1D();
            TextView A0O = C36391kE.A0O(inflate, R.id.description);
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = AnonymousClass14B.A03(A1D, C36391kE.A04(A1D));
            A0O.setText(AnonymousClass14B.A01(A1D, A0L, R.string.f12nameremoved));
        }
        AnonymousClass3Y6.A00(C012005e.A02(inflate, R.id.close_button), this, 32);
        ViewGroup A0O2 = C36411kG.A0O(inflate, R.id.code_container);
        String string = A0b().getString("code", "");
        C18740tg.A0E(!string.isEmpty(), "Invalid code");
        int length = string.length();
        for (int i = 0; i <= length; i++) {
            int i2 = length;
            Context A1D2 = A1D();
            WaTextView waTextView = new WaTextView(A1D2);
            waTextView.setTextAppearance(A1D2, R.style.f13nameremoved);
            if (!C36351kA.A1Y(this.A02)) {
                i2 = 0;
            }
            if (i != i2) {
                LinearLayout.LayoutParams A0N = C36371kC.A0N();
                A0N.setMargins(0, 0, C36341k9.A0F(waTextView).getDimensionPixelSize(R.dimen.f7nameremoved), 0);
                waTextView.setLayoutParams(A0N);
            }
            int i3 = length / 2;
            if (i == i3) {
                charAt = '-';
            } else {
                int i4 = i - 1;
                if (i < i3) {
                    i4 = i;
                }
                if (C36401kF.A1X(this.A02)) {
                    i4 = (length - i4) - 1;
                }
                charAt = string.charAt(i4);
            }
            waTextView.setText(String.valueOf(charAt));
            A0O2.addView(waTextView);
        }
        C19420v0 r3 = this.A01;
        C25271Fq r2 = this.A00;
        C36321k7.A0w(r3, r2);
        C36341k9.A0u(C19420v0.A00(r3), "device_switching_code");
        C36341k9.A0u(C19420v0.A00(r3), "device_switching_code_expiry");
        r2.A03(53, "CodeDisplayed");
        AnonymousClass2O0 r1 = new AnonymousClass2O0();
        r1.A00 = this.A01.A0e();
        this.A04.Bly(r1);
        return inflate;
    }
}
