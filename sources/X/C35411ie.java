package X;

import com.whatsapp.jid.DeviceJid;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1ie  reason: invalid class name and case insensitive filesystem */
public class C35411ie implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public C35411ie(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = z;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public final void run() {
        switch (this.A05) {
            case 0:
                C20310xM r5 = (C20310xM) this.A00;
                Collection collection = (Collection) this.A01;
                boolean z = this.A04;
                HashMap hashMap = (HashMap) this.A02;
                Set<AnonymousClass11F> set = (Set) this.A03;
                AnonymousClass16J r0 = r5.A0Z;
                if (!z) {
                    hashMap = null;
                }
                r0.A08(collection, hashMap);
                for (AnonymousClass11F A022 : set) {
                    r5.A0G.A02(A022, false);
                }
                return;
            case 1:
                AnonymousClass147 r2 = (AnonymousClass147) this.A02;
                boolean z2 = this.A04;
                C20350xQ.A0C((C20350xQ) this.A00, (DeviceJid) this.A03, r2, (C207209uj) this.A01, z2);
                return;
            case 2:
                AnonymousClass1ST r52 = (AnonymousClass1ST) this.A00;
                C129166Fp r4 = (C129166Fp) this.A01;
                AnonymousClass2bU r3 = (AnonymousClass2bU) this.A02;
                boolean z3 = this.A04;
                AnonymousClass1ST.A02(r4, r52, r3, false);
                AnonymousClass1SU r1 = r52.A0E;
                C65013Qj r02 = r3.A01;
                HashMap hashMap2 = r1.A00;
                synchronized (hashMap2) {
                    hashMap2.remove(r02);
                }
                C18740tg.A06(r4.A01());
                AnonymousClass1ST.A05(r52, r3, r4.A01().A01, z3);
                return;
            default:
                C29931Yo r42 = (C29931Yo) this.A00;
                AnonymousClass7hG r32 = (AnonymousClass7hG) this.A01;
                C135106c9 r22 = (C135106c9) this.A02;
                File file = (File) this.A03;
                boolean z4 = this.A04;
                if (r32 != null) {
                    r32.BRH(r22, file);
                }
                if (!z4) {
                    C29941Yp r03 = r42.A0B;
                    if (file != null) {
                        r03.A00();
                        return;
                    }
                    Iterator it = r03.getObservers().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                return;
        }
    }
}
