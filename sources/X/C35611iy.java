package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.1iy  reason: invalid class name and case insensitive filesystem */
public class C35611iy implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06;

    public C35611iy(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2) {
        this.A06 = i2;
        this.A01 = obj;
        this.A04 = str;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = str2;
        this.A00 = i;
    }

    public final void run() {
        String str;
        int i;
        C64933Qa r6;
        AnonymousClass1KJ r5;
        C180828mU r4;
        switch (this.A06) {
            case 0:
                AnonymousClass11F r9 = (AnonymousClass11F) this.A01;
                String str2 = this.A04;
                String str3 = this.A05;
                int i2 = this.A00;
                C64933Qa r52 = new C64933Qa(r9, str2, false);
                AnonymousClass1KJ r42 = ((AnonymousClass1KH) this.A02).A05;
                C19970wo r3 = r42.A01;
                C180828mU r1 = new C180828mU(new C64933Qa(r9, C237919w.A00(r42.A00, r3), true), C19970wo.A00(r3));
                r1.A02 = (AnonymousClass91F) this.A03;
                r1.A04 = str3;
                r1.A03 = r52;
                if ((i2 & 8388608) != 0) {
                    r1.A0j(8388608);
                }
                r42.A02.A0h(r1);
                return;
            case 1:
                AnonymousClass11F r43 = (AnonymousClass11F) this.A01;
                String str4 = this.A04;
                AnonymousClass1KH r2 = (AnonymousClass1KH) this.A02;
                AbstractCollection abstractCollection = (AbstractCollection) this.A03;
                str = this.A05;
                i = this.A00;
                AnonymousClass00C.A0D(r2, 2);
                AnonymousClass00C.A0D(abstractCollection, 3);
                r6 = new C64933Qa(r43, str4, false);
                r5 = r2.A05;
                C19970wo r32 = r5.A01;
                r4 = new C180828mU(new C64933Qa(r43, C237919w.A00(r5.A00, r32), true), C19970wo.A00(r32));
                Iterator it = abstractCollection.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += (long) ((C52752q7) it.next()).value;
                }
                r4.A00 = j;
                break;
            default:
                AnonymousClass11F r44 = (AnonymousClass11F) this.A01;
                String str5 = this.A04;
                AbstractCollection abstractCollection2 = (AbstractCollection) this.A03;
                str = this.A05;
                i = this.A00;
                AnonymousClass00C.A0D(abstractCollection2, 3);
                r6 = new C64933Qa(r44, str5, false);
                r5 = ((AnonymousClass1KH) this.A02).A05;
                C19970wo r33 = r5.A01;
                r4 = new C180828mU(new C64933Qa(r44, C237919w.A00(r5.A00, r33), true), C19970wo.A00(r33));
                Iterator it2 = abstractCollection2.iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    j2 += (long) ((C52632pv) it2.next()).value;
                }
                r4.A01 = j2;
                break;
        }
        r4.A04 = str;
        r4.A03 = r6;
        if ((i & 8388608) != 0) {
            r4.A0j(8388608);
        }
        r5.A02.A0h(r4);
    }
}
