package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3Sn  reason: invalid class name and case insensitive filesystem */
public final class C65553Sn {
    public static final C133136Wx A06 = new C133136Wx(13);
    public static final C133136Wx A07 = new C133136Wx(0);
    public static final C133136Wx A08 = new C133136Wx(21);
    public AnonymousClass2bU A00;
    public Integer A01;
    public final C20810yC A02;
    public final AnonymousClass1ST A03;
    public final ArrayList A04 = AnonymousClass001.A0I();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();

    public static final void A00(C133136Wx r2, AnonymousClass2bU r3, C65553Sn r4) {
        ConcurrentHashMap concurrentHashMap = r4.A05;
        AnonymousClass333 r0 = (AnonymousClass333) concurrentHashMap.get(r3);
        if (r0 != null) {
            r0.A00.A00 = r2;
            concurrentHashMap.remove(r3);
        }
    }

    public final void A02() {
        Log.i("statusdownload/cancel-all-status-downloads");
        AnonymousClass1ST r3 = this.A03;
        Iterator it = r3.A0B().iterator();
        while (it.hasNext()) {
            AnonymousClass2bU A0r = C36441kJ.A0r(it);
            if (A0r.A1J.A00 instanceof C177528dw) {
                r3.A0E(A0r);
            }
        }
        this.A04.clear();
        this.A00 = null;
        this.A01 = null;
    }

    public C65553Sn(C20810yC r2, AnonymousClass1ST r3) {
        C36321k7.A0x(r2, r3);
        this.A02 = r2;
        this.A03 = r3;
    }

    public static final void A01(AnonymousClass2bU r3, C65553Sn r4, int i) {
        Integer num;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("statusdownload/queue-status-download ");
        A0u.append(r3.A1J.A01);
        A0u.append(' ');
        A0u.append(r3.A0J());
        C36321k7.A1T(", mode = ", A0u, i);
        if (!r3.equals(r4.A00) || ((num = r4.A01) != null && i < num.intValue())) {
            r4.A00 = r3;
            r4.A01 = Integer.valueOf(i);
            r4.A03.A0C(new C89894Yh(r3, r4, 1), r3, i);
        }
    }
}
