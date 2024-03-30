package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.176  reason: invalid class name */
public class AnonymousClass176 extends AnonymousClass12N {
    public final C220412q A00;
    public final AnonymousClass177 A01 = new AnonymousClass177();
    public final Map A02 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final AtomicBoolean A04 = new AtomicBoolean();
    public final int A05;

    public void A09(AnonymousClass4QH r4) {
        AnonymousClass177 r2 = this.A01;
        synchronized (r2) {
            for (AnonymousClass3T1 BwV : r2.A01.A06().values()) {
                r4.BwV(BwV);
            }
            for (Map.Entry value : r2.A02.entrySet()) {
                AnonymousClass3T1 r0 = (AnonymousClass3T1) ((WeakReference) value.getValue()).get();
                if (r0 != null) {
                    r4.BwV(r0);
                }
            }
        }
        for (AnonymousClass3T1 BwV2 : this.A02.values()) {
            r4.BwV(BwV2);
        }
        for (C65073Qp r02 : this.A00.A0F()) {
            AnonymousClass3T1 r03 = r02.A0d;
            if (r03 != null) {
                r4.BwV(r03);
            }
        }
    }

    public void A0A(AnonymousClass11F r7) {
        AnonymousClass177 r5 = this.A01;
        synchronized (r5) {
            C002000v r3 = r5.A01;
            Iterator it = new HashSet(r3.A06().keySet()).iterator();
            while (it.hasNext()) {
                C64933Qa r1 = (C64933Qa) it.next();
                if (r7.equals(r1.A00)) {
                    r3.A05(r1);
                }
            }
            ArrayList arrayList = new ArrayList();
            Map map = r5.A02;
            for (C64933Qa r12 : map.keySet()) {
                if (r7.equals(r12.A00)) {
                    arrayList.add(r12);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                map.remove((C64933Qa) it2.next());
            }
        }
        Map map2 = this.A02;
        Iterator it3 = new HashSet(map2.keySet()).iterator();
        while (it3.hasNext()) {
            C64933Qa r13 = (C64933Qa) it3.next();
            if (r7.equals(r13.A00)) {
                map2.remove(r13);
            }
        }
        C65073Qp A09 = this.A00.A09(r7, false);
        if (A09 != null) {
            A09.A0d = null;
            A09.A0c = null;
        }
    }

    public void A0B(AnonymousClass3T1 r5) {
        AnonymousClass177 r0 = this.A01;
        C64933Qa r3 = r5.A1J;
        r0.A01(r5, r3);
        C220412q r2 = this.A00;
        synchronized (r2) {
            C65073Qp A09 = r2.A09(r3.A00, false);
            if (A09 != null) {
                AnonymousClass3T1 r02 = A09.A0d;
                if (r02 != null && r02.A1J.equals(r3)) {
                    A09.A0d = r5;
                }
                AnonymousClass3T1 r03 = A09.A0c;
                if (r03 != null && r03.A1J.equals(r3)) {
                    A09.A0c = r5;
                }
            }
        }
        this.A03.remove(r3);
    }

    public void A0C(C64933Qa r2) {
        this.A01.A02(r2);
        this.A02.remove(r2);
        this.A00.A0L(r2);
        this.A03.remove(r2);
    }

    public String BHv() {
        int A022;
        StringBuilder sb = new StringBuilder();
        sb.append("MessageCache/");
        AnonymousClass177 r2 = this.A01;
        synchronized (r2) {
            A022 = r2.A01.A02() + r2.A02.size();
        }
        sb.append(A022);
        return sb.toString();
    }

    public AnonymousClass176(C220412q r3, C20810yC r4, C220112n r5) {
        super(r5);
        this.A00 = r3;
        int A002 = C20800yB.A00(C21000yV.A02, r4, 7810);
        this.A05 = A002;
        if (A002 >= 0) {
            A08();
        }
    }

    public void Bjh(AnonymousClass5SK r4, boolean z) {
        if (r4.ordinal() >= this.A05) {
            AnonymousClass177 r2 = this.A01;
            synchronized (r2) {
                r2.A01.A07(-1);
                r2.A02.clear();
            }
        }
    }
}
