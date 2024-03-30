package com.whatsapp.status.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass02R;
import X.AnonymousClass040;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass0A2;
import X.AnonymousClass11F;
import X.AnonymousClass16E;
import X.AnonymousClass16J;
import X.AnonymousClass1CR;
import X.AnonymousClass1HT;
import X.AnonymousClass2L1;
import X.AnonymousClass335;
import X.AnonymousClass3P0;
import X.AnonymousClass4YW;
import X.C001700s;
import X.C004702c;
import X.C005502l;
import X.C007103b;
import X.C007403e;
import X.C023109s;
import X.C023509x;
import X.C10810fG;
import X.C109325Xd;
import X.C15590na;
import X.C17170qq;
import X.C19420v0;
import X.C19770wU;
import X.C19930wk;
import X.C19970wo;
import X.C20810yC;
import X.C24371Ce;
import X.C28331Sf;
import X.C28781Ua;
import X.C29731Xt;
import X.C33301f4;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C50292kW;
import X.C61193Ax;
import X.C61203Ay;
import X.C61953Ed;
import X.C71843hQ;
import X.C88194Rt;
import X.C90414a7;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class StatusesViewModel extends AnonymousClass04R implements AnonymousClass01Y, C88194Rt {
    public C50292kW A00;
    public AnonymousClass2L1 A01;
    public Set A02;
    public C007403e A03;
    public final C001700s A04;
    public final C001700s A05;
    public final C90414a7 A06 = new C90414a7(this, 1);
    public final AnonymousClass16J A07;
    public final AnonymousClass1HT A08;
    public final AnonymousClass16E A09;
    public final C28331Sf A0A;
    public final C24371Ce A0B;
    public final C29731Xt A0C;
    public final C61203Ay A0D;
    public final AnonymousClass335 A0E;
    public final C71843hQ A0F = new C71843hQ(this);
    public final AtomicBoolean A0G;
    public final C005502l A0H;
    public final C17170qq A0I = new C15590na();
    public final boolean A0J;
    public final C33301f4 A0K;
    public final C19970wo A0L;
    public final C19420v0 A0M;
    public final C61193Ax A0N;
    public final C19770wU A0O;

    public StatusesViewModel(C19970wo r6, C19420v0 r7, AnonymousClass16J r8, AnonymousClass1HT r9, AnonymousClass16E r10, C28331Sf r11, C24371Ce r12, C29731Xt r13, C61193Ax r14, C61203Ay r15, AnonymousClass335 r16, C19770wU r17, C005502l r18, boolean z) {
        AnonymousClass00C.A0D(r6, 1);
        C19770wU r3 = r17;
        C36321k7.A19(r3, r10, r8, r9);
        C36321k7.A13(r12, r7, r13);
        AnonymousClass00C.A0D(r14, 9);
        AnonymousClass00C.A0D(r11, 12);
        C005502l r1 = r18;
        AnonymousClass00C.A0D(r1, 13);
        this.A0L = r6;
        this.A0O = r3;
        this.A09 = r10;
        this.A07 = r8;
        this.A08 = r9;
        this.A0B = r12;
        this.A0M = r7;
        this.A0C = r13;
        this.A0N = r14;
        this.A0D = r15;
        this.A0E = r16;
        this.A0A = r11;
        this.A0H = r1;
        this.A0J = z;
        this.A0K = new C33301f4(new C19930wk(r3, true));
        this.A04 = C36431kI.A0S();
        this.A05 = C36431kI.A0S();
        this.A02 = C004702c.A00;
        this.A0G = new AtomicBoolean(false);
    }

    private final void A02() {
        if (!C36411kG.A1Y(this.A0A)) {
            C36331k8.A1E(this.A00);
            C61193Ax r0 = this.A0N;
            boolean A042 = A04(this);
            AnonymousClass16E r5 = r0.A03;
            C28781Ua r10 = r0.A07;
            AnonymousClass1CR r7 = r0.A05;
            C50292kW r1 = new C50292kW(r0.A00, r0.A01, r0.A02, r5, r0.A04, r7, r0.A06, this, r10, r0.A08, r0.A09, A042);
            C36331k8.A1F(r1, this.A0O);
            this.A00 = r1;
            return;
        }
        C007403e r12 = this.A03;
        boolean A1V = AnonymousClass000.A1V(r12);
        if (r12 != null) {
            r12.B2S((CancellationException) null);
        }
        AnonymousClass040 A002 = C109325Xd.A00(this);
        this.A03 = AnonymousClass0A2.A02(C023109s.A00, this.A0H, new StatusesViewModel$refreshStatuses$1(this, (C023509x) null, A1V), A002);
    }

    public C61953Ed A0S(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        Map map = (Map) this.A04.A04();
        if (map != null) {
            return (C61953Ed) map.get(userJid);
        }
        return null;
    }

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        int A062 = C36431kI.A06(r4, 1);
        if (A062 == 2) {
            if (this.A0J) {
                this.A07.registerObserver(this.A0F);
                this.A0B.registerObserver(this.A06);
            }
            this.A0G.set(false);
            A02();
        } else if (A062 == 3) {
            if (!C36411kG.A1Y(this.A0A)) {
                C50292kW r0 = this.A00;
                if (r0 != null) {
                    r0.A0D(true);
                }
                C36351kA.A1H(this.A01);
            }
            if (this.A0J) {
                this.A07.unregisterObserver(this.A0F);
                this.A0B.unregisterObserver(this.A06);
            }
        }
    }

    public static final String A01(StatusesViewModel statusesViewModel) {
        AnonymousClass3P0 r0 = (AnonymousClass3P0) statusesViewModel.A05.A04();
        if (r0 != null) {
            Map map = r0.A05;
            if (!map.isEmpty()) {
                return AnonymousClass02R.A09(",", "", "", map.keySet().toArray(new String[0]));
            }
        }
        return null;
    }

    public static final boolean A04(StatusesViewModel statusesViewModel) {
        C20810yC r1 = statusesViewModel.A0A.A00;
        if (r1.A0E(7266)) {
            int A072 = r1.A07(8023);
            C19420v0 r6 = statusesViewModel.A0M;
            if (C19970wo.A00(statusesViewModel.A0L) - r6.A0V("pref_regenerate_status_info_last_timestamp") > C36371kC.A07(A072)) {
                r6.A1Z("pref_regenerate_status_info_last_timestamp");
                return true;
            }
        }
        return false;
    }

    public List A0T() {
        C10810fG r3 = new C10810fG();
        if (C36411kG.A1Y(this.A0A)) {
            r3.element = C36441kJ.A15(this.A02);
            C36331k8.A1T(new StatusesViewModel$consumeNewStatusesEvent$1(this, (C023509x) null, r3), C109325Xd.A00(this));
        } else {
            synchronized (this) {
                r3.element = C36441kJ.A15(this.A02);
                this.A02 = C004702c.A00;
            }
        }
        return (List) r3.element;
    }

    public final void A0U(AnonymousClass11F r14, Integer num, Integer num2) {
        UserJid A0b;
        String str;
        int intValue;
        AnonymousClass3P0 r3 = (AnonymousClass3P0) this.A05.A04();
        if (r3 != null && (A0b = C36401kF.A0b(r14)) != null) {
            C29731Xt r4 = this.A0C;
            boolean z = true;
            Integer num3 = num;
            if (!(num == null || (intValue = num.intValue()) == 4 || intValue == 1 || intValue == 3 || intValue == 2)) {
                z = false;
                r4.A09(false);
            }
            List list = r3.A02;
            List list2 = r3.A03;
            List list3 = r3.A01;
            Map map = null;
            if (z) {
                map = r3.A05;
                str = A01(this);
            } else {
                str = null;
            }
            r4.A07(A0b, num3, num2, str, list, list2, list3, map);
        }
    }

    public void Bhb(AnonymousClass3P0 r5) {
        this.A05.A0C(r5);
        List list = r5.A01;
        ArrayList A0J2 = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0J2.add(C36441kJ.A0h(it).A09);
        }
        Set A0f = C007103b.A0f(A0J2);
        C36351kA.A1H(this.A01);
        AnonymousClass2L1 r2 = new AnonymousClass2L1(this);
        AnonymousClass4YW.A00(r2, this.A0K, A0f, this, 3);
        this.A01 = r2;
    }

    public static final void A03(Jid jid, StatusesViewModel statusesViewModel) {
        UserJid A0b = C36401kF.A0b(jid);
        if (A0b != null) {
            if (C36411kG.A1Y(statusesViewModel.A0A)) {
                C36331k8.A1T(new StatusesViewModel$onStatusChanged$1$1(A0b, statusesViewModel, (C023509x) null), C109325Xd.A00(statusesViewModel));
            } else {
                synchronized (statusesViewModel) {
                    List A11 = C36371kC.A11(A0b);
                    Set A0e = C007103b.A0e(statusesViewModel.A02);
                    A0e.addAll(A11);
                    statusesViewModel.A02 = A0e;
                }
            }
        }
        statusesViewModel.A02();
    }
}
