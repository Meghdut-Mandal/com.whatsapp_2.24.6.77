package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.2kW  reason: invalid class name and case insensitive filesystem */
public final class C50292kW extends C132446Tt {
    public boolean A00;
    public final WfalManager A01;
    public final AnonymousClass1HT A02;
    public final AnonymousClass16F A03;
    public final AnonymousClass16E A04;
    public final C62213Ff A05;
    public final AnonymousClass1CR A06;
    public final C29731Xt A07;
    public final C88194Rt A08;
    public final C28781Ua A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        int i2;
        C46812bi r11;
        C21690ze r3 = this.A07.A09;
        r3.markerStart(453128091, 2);
        r3.markerPoint(453128091, 2, "REFRESH_TASK_START");
        if (this.A00) {
            this.A02.A04();
        }
        ArrayList A092 = this.A04.A09();
        C65663Sz r16 = null;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        ArrayList A0I3 = AnonymousClass001.A0I();
        LinkedHashMap A1G = C36431kI.A1G();
        LinkedHashMap A1G2 = C36431kI.A1G();
        LinkedHashMap A1G3 = C36431kI.A1G();
        Iterator it = A092.iterator();
        while (it.hasNext()) {
            C65663Sz A0h = C36441kJ.A0h(it);
            AnonymousClass00C.A0B(A0h);
            AnonymousClass1HT r10 = this.A02;
            UserJid userJid = A0h.A09;
            AnonymousClass3T1 A022 = r10.A02(userJid);
            if ((A022 instanceof C46812bi) && (r11 = (C46812bi) A022) != null) {
                this.A05.A01(r11);
            }
            if (A0h.A0B()) {
                if (this.A09.A00()) {
                    C35071i6.A00((C35071i6) this.A0B.get());
                }
                r16 = A0h;
            } else if (this.A06.A0l(userJid)) {
                A0I3.add(A0h);
            } else if (A0h.A03() > 0) {
                A0I.add(A0h);
            } else {
                A0I2.add(A0h);
            }
            if (userJid instanceof C177638e7) {
                Iterator it2 = r10.A03(userJid).iterator();
                while (it2.hasNext()) {
                    AnonymousClass3T1 A0l = C36391kE.A0l(it2);
                    String str = this.A03.A00(A0l).A04;
                    if (str != null) {
                        String str2 = A0l.A1J.A01;
                        AnonymousClass00C.A07(str2);
                        int i3 = 0;
                        if (A1G2.get(str2) == null) {
                            if (A1G3.containsKey(str)) {
                                i = C36381kD.A07(A1G3.get(str));
                                i2 = i + 1;
                            } else {
                                i = 0;
                                i2 = 1;
                            }
                            C36341k9.A1K(str, A1G3, i2);
                            C36341k9.A1K(str2, A1G2, i);
                        }
                        boolean containsKey = A1G.containsKey(str);
                        int A0D = A0h.A0D(A0l);
                        if (containsKey) {
                            if (A0D != 0) {
                                Number A10 = C36441kJ.A10(str, A1G);
                                if (A10 != null) {
                                    i3 = A10.intValue();
                                }
                                A0D = i3 + 1;
                            }
                        }
                        C36341k9.A1K(str, A1G, A0D);
                    }
                }
            }
        }
        return new AnonymousClass3P0(r16, A0I, A0I2, A0I3, A1G, A1G2);
    }

    public void A09() {
        this.A07.A09.markerEnd(453128091, 2, 4);
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        this.A07.A09.markerEnd(453128091, 2, 4);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3P0 r5 = (AnonymousClass3P0) obj;
        AnonymousClass00C.A0D(r5, 0);
        C21690ze r3 = this.A07.A09;
        r3.markerPoint(453128091, 2, "REFRESH_TASK_END");
        C88194Rt r0 = (C88194Rt) A07(C17510rX.class);
        if (!(r0 == null && (r0 = this.A08) == null)) {
            r0.Bhb(r5);
        }
        r3.markerPoint(453128091, 2, "REFRESH_TASK_POPULATED");
        r3.markerEnd(453128091, 2, 2);
    }

    public C50292kW(WfalManager wfalManager, AnonymousClass1HT r2, AnonymousClass16F r3, AnonymousClass16E r4, C62213Ff r5, AnonymousClass1CR r6, C29731Xt r7, C88194Rt r8, C28781Ua r9, AnonymousClass005 r10, AnonymousClass005 r11, boolean z) {
        this.A04 = r4;
        this.A09 = r9;
        this.A06 = r6;
        this.A01 = wfalManager;
        this.A02 = r2;
        this.A07 = r7;
        this.A03 = r3;
        this.A05 = r5;
        this.A0A = r10;
        this.A0B = r11;
        this.A08 = r8;
        this.A00 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50292kW(WfalManager wfalManager, AnonymousClass1HT r3, AnonymousClass16F r4, AnonymousClass16E r5, C62213Ff r6, AnonymousClass1CR r7, C29731Xt r8, C17510rX r9, C28781Ua r10, AnonymousClass005 r11, AnonymousClass005 r12) {
        super(r9, true);
        AnonymousClass00C.A0D(r5, 1);
        C36321k7.A19(r10, r7, wfalManager, r3);
        C36321k7.A1C(r8, r4, r6, r11, r12);
        this.A04 = r5;
        this.A09 = r10;
        this.A01 = wfalManager;
        this.A06 = r7;
        this.A02 = r3;
        this.A07 = r8;
        this.A03 = r4;
        this.A05 = r6;
        this.A0A = r11;
        this.A0B = r12;
        this.A08 = null;
    }
}
