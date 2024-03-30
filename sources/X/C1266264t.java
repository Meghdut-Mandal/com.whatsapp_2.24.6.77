package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.64t  reason: invalid class name and case insensitive filesystem */
public final class C1266264t {
    public final C20690y0 A00;
    public final AnonymousClass17Y A01;
    public final C35021i1 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;

    public final void A00(C160237kg r11, String str, List list, List list2) {
        C134876bk r1;
        C18740tg.A0B(!C224714l.A02());
        ArrayList A0I = AnonymousClass001.A0I();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(((AnonymousClass3T1) list.get(i)).A0I + 86400000);
            if (list2 != null) {
                r1 = (C134876bk) list2.get(i);
            } else {
                r1 = null;
            }
            A0I.add(new C128036Ap(r1, seconds));
        }
        String str2 = str;
        AnonymousClass63j r5 = new AnonymousClass63j(r11, this, str, list);
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C90464aC.A1T(A0J, it);
        }
        AnonymousClass6Y4.A06(this.A01, this.A02, this.A05, A0J, 1);
        C130296Kn r6 = (C130296Kn) this.A07.get();
        C160777lZ r0 = C131336Oq.A00().A00;
        byte[] B7p = r0.B7p();
        byte[] generatePublicKey = r0.generatePublicKey(B7p);
        AnonymousClass00C.A08(generatePublicKey);
        AnonymousClass00C.A08(B7p);
        C1509077f r7 = new C1509077f(generatePublicKey, B7p);
        AnonymousClass695 A002 = r6.A00.A00(AnonymousClass1US.ELIGIBILITY);
        if (A002 == null) {
            r5.A00(-5, (Integer) null);
            return;
        }
        C130296Kn.A00(new C128936Ee(3, AnonymousClass6MQ.A01), A002.A00, r5, r6, r7, str2, A0I);
    }

    public C1266264t(C20690y0 r1, AnonymousClass17Y r2, C35021i1 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8) {
        C36321k7.A1B(r2, r1, r3, r4, r5);
        C36321k7.A13(r6, r7, r8);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A04 = r7;
        this.A03 = r8;
    }
}
