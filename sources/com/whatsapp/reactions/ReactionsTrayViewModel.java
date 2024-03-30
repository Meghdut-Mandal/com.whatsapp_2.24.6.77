package com.whatsapp.reactions;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04R;
import X.AnonymousClass1XQ;
import X.AnonymousClass3A4;
import X.AnonymousClass3GR;
import X.AnonymousClass3IU;
import X.AnonymousClass3T1;
import X.AnonymousClass3T3;
import X.AnonymousClass3TY;
import X.AnonymousClass3UO;
import X.C18740tg;
import X.C19730wQ;
import X.C19770wU;
import X.C19890wg;
import X.C19970wo;
import X.C20810yC;
import X.C21060yb;
import X.C220412q;
import X.C25361Fz;
import X.C29721Xs;
import X.C34831hi;
import X.C36341k9;
import X.C36371kC;
import X.C36441kJ;
import X.C56352w9;
import X.C63873Lt;
import X.C64933Qa;
import X.C65753Ti;
import X.C79593ty;
import X.C80313vC;
import X.C88944Uq;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public class ReactionsTrayViewModel extends AnonymousClass04R {
    public static final int A0H;
    public static final List A0I;
    public int A00;
    public int A01 = 0;
    public List A02 = A0I;
    public boolean A03;
    public final C21060yb A04;
    public final C19970wo A05;
    public final C220412q A06;
    public final C20810yC A07;
    public final C25361Fz A08;
    public final C19890wg A09;
    public final C29721Xs A0A;
    public final C34831hi A0B = C36441kJ.A0s(-1);
    public final C34831hi A0C = C36441kJ.A0s(false);
    public final C34831hi A0D = C36441kJ.A0s(new AnonymousClass3GR((String) null, (String) null, false));
    public final C19770wU A0E;
    public final C19730wQ A0F;
    public volatile AnonymousClass3T1 A0G;

    public void A0S(int i) {
        if (i == 0) {
            this.A03 = AnonymousClass000.A1S(C36341k9.A07(this.A0B), 2);
        }
        C34831hi r1 = this.A0B;
        if (C36341k9.A07(r1) == i) {
            return;
        }
        if (i != 1) {
            C36341k9.A16(r1, i);
            return;
        }
        throw AnonymousClass001.A08("Use setDisplayStateToTrayOpen instead of setDisplayState(DisplayState.TRAY_OPEN)");
    }

    public void A0V(String str) {
        A0S(0);
        AnonymousClass3T3.A04(this.A04);
        C34831hi r3 = this.A0D;
        if (!str.equals(((AnonymousClass3GR) r3.A04()).A00)) {
            r3.A0D(new AnonymousClass3GR(((AnonymousClass3GR) r3.A04()).A00, str, true));
        }
    }

    static {
        List list = C56352w9.A00;
        A0I = list;
        A0H = list.size();
    }

    public void A0T(int i) {
        if (this.A0G != null) {
            C79593ty r2 = new C79593ty();
            C80313vC.A01(this.A0E, this, r2, 18);
            r2.A0A(new AnonymousClass3IU(this, i, 3));
        }
    }

    public void A0U(AnonymousClass3T1 r10) {
        String A012;
        boolean z;
        C88944Uq r4 = r10.A0J;
        String str = null;
        if (r4 != null) {
            if (C64933Qa.A04(r10)) {
                AnonymousClass3A4 A0Z = r10.A0Z();
                if (A0Z != null) {
                    str = A0Z.A05;
                }
            } else {
                str = r4.BGU(C36371kC.A0e(this.A0F), r10.A1N);
            }
        }
        this.A0G = r10;
        String A032 = C65753Ti.A03(str);
        this.A0D.A0D(new AnonymousClass3GR(A032, A032, false));
        if (TextUtils.isEmpty(str)) {
            A012 = null;
            z = false;
        } else {
            C18740tg.A06(str);
            A012 = C63873Lt.A01(AnonymousClass3UO.A07(new AnonymousClass1XQ(str).A00));
            z = true;
        }
        List list = A0I;
        this.A02 = C36441kJ.A14(list.size() + 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C2 = AnonymousClass001.A0C(it);
            if (A0C2.equals(A012)) {
                this.A02.add(str);
                z = false;
            } else {
                int[] iArr = new AnonymousClass1XQ(A0C2).A00;
                if (AnonymousClass3UO.A03(iArr)) {
                    C19890wg r42 = this.A09;
                    if (r42.A00("emoji_modifiers").contains(AnonymousClass3TY.A01(iArr))) {
                        this.A02.add(new AnonymousClass1XQ(AnonymousClass3TY.A05(r42, iArr)).toString());
                    }
                }
                this.A02.add(A0C2);
            }
        }
        if (z) {
            this.A02.add(str);
        }
    }

    public ReactionsTrayViewModel(C19730wQ r4, C21060yb r5, C19970wo r6, C220412q r7, C20810yC r8, C25361Fz r9, C19890wg r10, C29721Xs r11, C19770wU r12) {
        this.A05 = r6;
        this.A07 = r8;
        this.A0E = r12;
        this.A0F = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A0A = r11;
        this.A09 = r10;
        this.A08 = r9;
    }
}
