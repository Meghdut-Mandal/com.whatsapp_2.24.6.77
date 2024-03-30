package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3ha  reason: invalid class name and case insensitive filesystem */
public class C71943ha implements C88764Ty {
    public final /* synthetic */ C1040958g A00;
    public final /* synthetic */ C124825yr A01;
    public final /* synthetic */ AtomicBoolean A02;

    public void BTM(C588431g r1) {
    }

    public void BVI(C66753Xe r1, AnonymousClass11F r2) {
    }

    public C71943ha(C1040958g r1, C124825yr r2, AtomicBoolean atomicBoolean) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = atomicBoolean;
    }

    public void BTL(C588331f r6) {
        Iterator it = r6.A00.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((C80193v0) it.next()).A00.A0I;
        }
        this.A00.A01 = Long.valueOf((j / 10000000) * 10000000);
        this.A02.set(true);
        this.A01.A07.A07.remove(this);
    }

    public C71943ha() {
    }
}
