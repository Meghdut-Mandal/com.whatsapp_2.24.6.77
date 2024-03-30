package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3UD;
import X.AnonymousClass655;
import X.AnonymousClass68F;
import X.C105545Fb;
import X.C124725yh;
import X.C1512478u;
import X.C19730wQ;
import X.C20810yC;
import X.C27631Pa;
import X.C28201Rs;
import X.C34831hi;
import X.C36441kJ;
import X.C47872fu;
import X.C61243Bc;
import X.C90474aD;
import X.C90524aI;
import X.C95504lc;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InCallBannerViewModel extends C95504lc {
    public boolean A00 = false;
    public final C19730wQ A01;
    public final C27631Pa A02;
    public final C1512478u A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass171 A05;
    public final C20810yC A06;
    public final C34831hi A07;
    public final C28201Rs A08;
    public final C28201Rs A09;
    public final C28201Rs A0A;
    public final C28201Rs A0B;
    public final C28201Rs A0C;
    public final C28201Rs A0D;
    public final C105545Fb A0E;

    public static C124725yh A06(InCallBannerViewModel inCallBannerViewModel, List list, int i) {
        C61243Bc A042 = AnonymousClass3UD.A04(inCallBannerViewModel.A04, inCallBannerViewModel.A05, list, 3, true);
        Objects.requireNonNull(A042);
        Object[] objArr = {A042};
        C47872fu r4 = new C47872fu(objArr, R.plurals.f10nameremoved, list.size());
        AnonymousClass655 r1 = new AnonymousClass655(A042, new C47872fu(new Object[0], R.plurals.f10nameremoved, list.size()), 3, i);
        r1.A06 = true;
        r1.A05 = true;
        r1.A03.addAll(list);
        r1.A04 = true;
        r1.A02 = r4;
        return r1.A00();
    }

    public static C124725yh A07(InCallBannerViewModel inCallBannerViewModel, List list, int i) {
        C61243Bc A042 = AnonymousClass3UD.A04(inCallBannerViewModel.A04, inCallBannerViewModel.A05, list, 3, true);
        Objects.requireNonNull(A042);
        AnonymousClass655 r1 = new AnonymousClass655(A042, new C47872fu(C90524aI.A0w(), R.plurals.f10nameremoved, list.size()), 2, i);
        r1.A05 = true;
        r1.A03.addAll(list);
        r1.A04 = true;
        return r1.A00();
    }

    private C124725yh A08(C124725yh r6, C124725yh r7) {
        int i = r6.A01;
        if (i != r7.A01) {
            return null;
        }
        ArrayList A15 = C36441kJ.A15(r6.A07);
        for (Object A1H : r7.A07) {
            C90474aD.A1H(A1H, A15);
        }
        if (i == 3) {
            return A06(this, A15, r7.A00);
        }
        if (i == 2) {
            return A07(this, A15, r7.A00);
        }
        return null;
    }

    public static void A09(InCallBannerViewModel inCallBannerViewModel, C124725yh r6) {
        if (!inCallBannerViewModel.A00) {
            C1512478u r4 = inCallBannerViewModel.A03;
            if (r4.isEmpty()) {
                r4.add(r6);
            } else {
                C124725yh r1 = (C124725yh) r4.get(0);
                C124725yh A082 = inCallBannerViewModel.A08(r1, r6);
                if (A082 != null) {
                    r4.set(A082, 0);
                } else {
                    int i = r1.A01;
                    int i2 = r6.A01;
                    if (i >= i2) {
                        r4.set(r6, 0);
                    } else {
                        for (int i3 = 1; i3 < r4.size(); i3++) {
                            if (i2 < ((C124725yh) r4.get(i3)).A01) {
                                r4.add(i3, r6);
                                return;
                            }
                            C124725yh A083 = inCallBannerViewModel.A08((C124725yh) r4.get(i3), r6);
                            if (A083 != null) {
                                r4.set(A083, i3);
                                return;
                            }
                        }
                        r4.add(r6);
                        return;
                    }
                }
            }
            inCallBannerViewModel.A0C.A0C(r4.get(0));
        }
    }

    public void A0R() {
        this.A0E.unregisterObserver(this);
    }

    public InCallBannerViewModel(C19730wQ r7, C27631Pa r8, C105545Fb r9, AnonymousClass16D r10, AnonymousClass171 r11, C20810yC r12) {
        C28201Rs A0t = C36441kJ.A0t();
        this.A0C = A0t;
        C28201Rs A0t2 = C36441kJ.A0t();
        this.A0B = A0t2;
        C28201Rs A0t3 = C36441kJ.A0t();
        this.A0D = A0t3;
        C28201Rs A0t4 = C36441kJ.A0t();
        this.A08 = A0t4;
        this.A09 = C36441kJ.A0t();
        this.A0A = C36441kJ.A0t();
        this.A07 = C36441kJ.A0s(new AnonymousClass68F());
        this.A06 = r12;
        this.A01 = r7;
        this.A04 = r10;
        this.A05 = r11;
        A0t3.A0D(false);
        A0t4.A0D(false);
        A0t2.A0D(AnonymousClass001.A0I());
        A0t.A0D((Object) null);
        this.A03 = new C1512478u(this);
        this.A0E = r9;
        this.A02 = r8;
        r9.registerObserver(this);
    }
}
