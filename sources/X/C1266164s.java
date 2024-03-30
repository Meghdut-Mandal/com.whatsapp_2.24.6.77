package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.64s  reason: invalid class name and case insensitive filesystem */
public final class C1266164s {
    public final C20690y0 A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass1D8 A02;
    public final C34931hs A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;

    public C1266164s(C20690y0 r1, AnonymousClass17Y r2, AnonymousClass1D8 r3, C34931hs r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8) {
        C36321k7.A1B(r2, r1, r3, r4, r5);
        C36321k7.A13(r6, r7, r8);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A04 = r7;
        this.A06 = r8;
    }

    public final void A00(AnonymousClass6CZ r19, String str, List list, List list2, List list3) {
        String str2;
        C18740tg.A0B(!C224714l.A02());
        ArrayList A0I = AnonymousClass001.A0I();
        List list4 = list;
        int size = list4.size();
        for (int i = 0; i < size; i++) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(((AnonymousClass3T1) list4.get(i)).A0I + 86400000);
            List list5 = list2;
            if (list2 != null) {
                str2 = C36401kF.A0s(list5, i);
            } else {
                str2 = null;
            }
            A0I.add(new C127996Al(str2, seconds));
        }
        String str3 = str;
        List list6 = list3;
        C1272667p r9 = new C1272667p(r19, this, str3, list4, list6);
        ArrayList A0J = C36321k7.A0J(list4);
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            C90464aC.A1T(A0J, it);
        }
        AnonymousClass6R9.A00(this.A01, this.A03, this.A05, A0J, list6, 1);
        C130276Kl r4 = (C130276Kl) this.A07.get();
        C160777lZ r0 = C131336Oq.A00().A00;
        byte[] B7p = r0.B7p();
        byte[] generatePublicKey = r0.generatePublicKey(B7p);
        AnonymousClass00C.A08(generatePublicKey);
        AnonymousClass00C.A08(B7p);
        C1508977e r5 = new C1508977e(generatePublicKey, B7p);
        if (!C224714l.A02()) {
            WfalManager wfalManager = r4.A01;
            wfalManager.A01.A01(new C145516u1(r9, r4, r5, str3, A0I, list6));
            return;
        }
        throw AnonymousClass001.A09("Check failed.");
    }
}
