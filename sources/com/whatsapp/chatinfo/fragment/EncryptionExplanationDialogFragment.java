package com.whatsapp.chatinfo.fragment;

import X.AnonymousClass000;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass1CF;
import X.AnonymousClass1H2;
import X.AnonymousClass3LW;
import X.AnonymousClass3RB;
import X.AnonymousClass3RR;
import X.AnonymousClass3UG;
import X.AnonymousClass4XL;
import X.C177618e5;
import X.C18740tg;
import X.C20380xT;
import X.C20500xf;
import X.C20810yC;
import X.C24801Dv;
import X.C36321k7;
import X.C36421kH;
import X.C39001qm;
import X.C89714Xp;
import X.C89784Xw;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.Objects;

public class EncryptionExplanationDialogFragment extends Hilt_EncryptionExplanationDialogFragment {
    public C24801Dv A00;
    public AnonymousClass16D A01;
    public AnonymousClass1H2 A02;
    public C20500xf A03;
    public AnonymousClass1CF A04;
    public C20380xT A05;

    public Dialog A1a(Bundle bundle) {
        int i;
        String str;
        int i2;
        Object[] objArr;
        Bundle A0b = A0b();
        String string = A0b.getString("jid");
        String string2 = A0b.getString("display_name");
        int i3 = A0b.getInt("provider_category", 0);
        AnonymousClass16D r1 = this.A01;
        AnonymousClass11F A0N = C36421kH.A0N(string);
        C18740tg.A07(A0N, string);
        AnonymousClass141 A0D = r1.A0D(A0N);
        C20810yC r2 = this.A02;
        AnonymousClass1CF r0 = this.A04;
        AnonymousClass01I A0i = A0i();
        AnonymousClass11F r8 = A0D.A0H;
        Objects.requireNonNull(r8);
        C20500xf r12 = this.A03;
        if (r0.A02(r8) || AnonymousClass3RR.A00(r2, r8)) {
            i = R.string.f12nameremoved;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    C18740tg.A06(string2);
                    i2 = R.string.f12nameremoved;
                } else if (i3 == 3 || i3 == 4) {
                    C18740tg.A06(string2);
                    boolean A002 = AnonymousClass3RB.A00(r12, r8);
                    i2 = R.string.f12nameremoved;
                    if (A002) {
                        i2 = R.string.f12nameremoved;
                        objArr = new Object[]{string2};
                        str = A0i.getString(i2, objArr);
                        C39001qm A032 = AnonymousClass3LW.A03(this);
                        A032.A0p(AnonymousClass3UG.A05(A0i(), this.A02, str));
                        A032.A0r(true);
                        A032.A0f(AnonymousClass4XL.A00(this, 37), R.string.f12nameremoved);
                        A032.A0g(new C89784Xw(this, i3, 0), R.string.f12nameremoved);
                        if (!A0D.A0G() && !(A0D.A0H instanceof C177618e5) && i3 == 1) {
                            A032.setPositiveButton(R.string.f12nameremoved, new C89714Xp(A0D, this, 2));
                        }
                        return A032.create();
                    }
                } else {
                    C36321k7.A1S("providerCategoryToModal unexpected argument value for providerCategory: ", AnonymousClass000.A0u(), i3);
                }
                objArr = new Object[]{string2, string2};
                str = A0i.getString(i2, objArr);
                C39001qm A0322 = AnonymousClass3LW.A03(this);
                A0322.A0p(AnonymousClass3UG.A05(A0i(), this.A02, str));
                A0322.A0r(true);
                A0322.A0f(AnonymousClass4XL.A00(this, 37), R.string.f12nameremoved);
                A0322.A0g(new C89784Xw(this, i3, 0), R.string.f12nameremoved);
                A0322.setPositiveButton(R.string.f12nameremoved, new C89714Xp(A0D, this, 2));
                return A0322.create();
            }
            i = R.string.f12nameremoved;
        }
        str = A0i.getString(i);
        C39001qm A03222 = AnonymousClass3LW.A03(this);
        A03222.A0p(AnonymousClass3UG.A05(A0i(), this.A02, str));
        A03222.A0r(true);
        A03222.A0f(AnonymousClass4XL.A00(this, 37), R.string.f12nameremoved);
        A03222.A0g(new C89784Xw(this, i3, 0), R.string.f12nameremoved);
        A03222.setPositiveButton(R.string.f12nameremoved, new C89714Xp(A0D, this, 2));
        return A03222.create();
    }
}
