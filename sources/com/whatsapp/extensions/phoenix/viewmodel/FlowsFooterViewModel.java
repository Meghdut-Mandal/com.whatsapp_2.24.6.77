package com.whatsapp.extensions.phoenix.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass16D;
import X.AnonymousClass185;
import X.AnonymousClass3L0;
import X.C001700s;
import X.C110795bF;
import X.C19770wU;
import X.C20810yC;
import X.C27761Ps;
import X.C36321k7;
import X.C36361kB;
import X.C36431kI;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class FlowsFooterViewModel extends AnonymousClass04R {
    public AnonymousClass16D A00;
    public final C001700s A01 = C36431kI.A0S();
    public final AnonymousClass185 A02;
    public final C27761Ps A03;
    public final C20810yC A04;
    public final C19770wU A05;

    public final String A0S(Context context, UserJid userJid) {
        String str;
        String str2;
        AnonymousClass185 r5 = this.A02;
        AnonymousClass3L0 A012 = r5.A01(userJid);
        if (!(A012 == null || (str = A012.A08) == null)) {
            String string = context.getResources().getString(R.string.f12nameremoved, C36431kI.A1Z(str, 1));
            AnonymousClass00C.A08(string);
            C20810yC r3 = this.A04;
            int A07 = r3.A07(5275);
            if (r3.A0E(5936)) {
                return string;
            }
            AnonymousClass3L0 A013 = r5.A01(userJid);
            if (A013 != null) {
                str2 = A013.A08;
            } else {
                str2 = null;
            }
            if (!r3.A0E(4078) || str2 == null || str2.length() == 0 || string.length() <= A07) {
                return string;
            }
            String valueOf = String.valueOf(C110795bF.A00(string, A07));
            if (valueOf != null) {
                return valueOf;
            }
        }
        return C36361kB.A0m(context, R.string.f12nameremoved);
    }

    public FlowsFooterViewModel(AnonymousClass16D r2, AnonymousClass185 r3, C27761Ps r4, C20810yC r5, C19770wU r6) {
        C36321k7.A1B(r5, r3, r6, r4, r2);
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = r2;
    }
}
