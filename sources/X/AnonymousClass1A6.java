package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1A6  reason: invalid class name */
public class AnonymousClass1A6 {
    public final AnonymousClass1A7 A00 = new AnonymousClass1A7();
    public final AnonymousClass1A7 A01 = new AnonymousClass1A7();
    public final C220412q A02;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = r5.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.AnonymousClass1A6 r5, X.AnonymousClass11F r6, X.AnonymousClass11F r7, long r8) {
        /*
            boolean r0 = r6 instanceof X.C28981Uw
            r3 = 0
            if (r0 != 0) goto L_0x0012
            X.12q r4 = r5.A02
            X.3Qp r0 = r4.A09(r6, r3)
            if (r0 == 0) goto L_0x0013
            int r1 = r0.A02
            r0 = 5
            if (r1 != r0) goto L_0x0013
        L_0x0012:
            return r3
        L_0x0013:
            X.3Qp r1 = r4.A09(r6, r3)
            if (r1 == 0) goto L_0x0028
            boolean r0 = r1.A0o
            if (r0 != 0) goto L_0x0012
            X.11F r0 = r1.A06()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0028
            return r3
        L_0x0028:
            X.1A7 r2 = r5.A01
            monitor-enter(r2)
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x0047 }
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass6SZ.A00(r7)     // Catch:{ all -> 0x0047 }
            int r1 = r4.A06(r0)     // Catch:{ all -> 0x0047 }
            r0 = 1
            if (r1 != r0) goto L_0x0041
            X.3I6 r0 = r2.A01(r6)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x003f
            r3 = 1
        L_0x003f:
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            return r3
        L_0x0041:
            boolean r0 = r2.A03(r6, r7, r8)     // Catch:{ all -> 0x0047 }
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            return r0
        L_0x0047:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A6.A00(X.1A6, X.11F, X.11F, long):boolean");
    }

    public int A01() {
        int i;
        C220412q r4 = this.A02;
        C220412q.A00(r4);
        AnonymousClass1A7 r3 = this.A01;
        synchronized (r3) {
            Iterator it = r3.iterator();
            i = 0;
            while (it.hasNext()) {
                if (r4.A0N(((AnonymousClass3I6) it.next()).A01)) {
                    i++;
                }
            }
        }
        return i;
    }

    public int A02() {
        int size;
        C220412q.A00(this.A02);
        AnonymousClass1A7 r1 = this.A01;
        synchronized (r1) {
            size = r1.A01.size();
        }
        return size;
    }

    public int A03() {
        int i;
        C220412q r5 = this.A02;
        C220412q.A00(r5);
        AnonymousClass1A7 r4 = this.A01;
        synchronized (r4) {
            Iterator it = r4.iterator();
            i = 0;
            while (it.hasNext()) {
                AnonymousClass11F r1 = ((AnonymousClass3I6) it.next()).A01;
                if (!r5.A0N(r1) && !r5.A0Q(r1)) {
                    i++;
                }
            }
        }
        return i;
    }

    public ArrayList A04() {
        ArrayList arrayList;
        C220412q.A00(this.A02);
        AnonymousClass1A7 r3 = this.A01;
        synchronized (r3) {
            arrayList = new ArrayList(r3.A01.size());
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                arrayList.add(((AnonymousClass3I6) it.next()).A01);
            }
        }
        return arrayList;
    }

    public ArrayList A05() {
        C220412q r5 = this.A02;
        C220412q.A00(r5);
        ArrayList arrayList = new ArrayList();
        AnonymousClass1A7 r3 = this.A01;
        synchronized (r3) {
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r1 = ((AnonymousClass3I6) it.next()).A01;
                if (r5.A0N(r1)) {
                    arrayList.add(r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A06() {
        ArrayList arrayList;
        C220412q.A00(this.A02);
        AnonymousClass1A7 r4 = this.A01;
        synchronized (r4) {
            arrayList = new ArrayList();
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r1 = ((AnonymousClass3I6) it.next()).A01;
                if (AnonymousClass143.A0G(r1) || (r1 instanceof C177538dx)) {
                    arrayList.add((AnonymousClass144) r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A07() {
        C220412q.A00(this.A02);
        ArrayList arrayList = new ArrayList();
        AnonymousClass1A7 r2 = this.A00;
        synchronized (r2) {
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AnonymousClass3I6) it.next()).A01);
            }
        }
        return arrayList;
    }

    public ArrayList A08() {
        C220412q r5 = this.A02;
        C220412q.A00(r5);
        ArrayList arrayList = new ArrayList();
        AnonymousClass1A7 r3 = this.A01;
        synchronized (r3) {
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r1 = ((AnonymousClass3I6) it.next()).A01;
                if (r5.A0Q(r1)) {
                    arrayList.add(r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A09() {
        C220412q r5 = this.A02;
        C220412q.A00(r5);
        AnonymousClass1A7 r4 = this.A01;
        ArrayList arrayList = new ArrayList(r4.A01.size());
        synchronized (r4) {
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r1 = ((AnonymousClass3I6) it.next()).A01;
                if (!r5.A0N(r1) && !r5.A0Q(r1)) {
                    arrayList.add(r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A0A() {
        ArrayList arrayList;
        C220412q.A00(this.A02);
        AnonymousClass1A7 r4 = this.A01;
        synchronized (r4) {
            arrayList = new ArrayList();
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r1 = ((AnonymousClass3I6) it.next()).A01;
                if (r1 instanceof UserJid) {
                    arrayList.add((UserJid) r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A0B(AnonymousClass1CR r9) {
        C220412q r6 = this.A02;
        C220412q.A00(r6);
        AnonymousClass1A7 r7 = this.A01;
        ArrayList arrayList = new ArrayList(r7.A01.size());
        Set A0X = r9.A0X();
        ArrayList arrayList2 = new ArrayList();
        synchronized (r7) {
            Iterator it = r7.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r1 = ((AnonymousClass3I6) it.next()).A01;
                if (!r6.A0Q(r1)) {
                    arrayList2.add(r1);
                }
            }
        }
        A0X.retainAll(arrayList2);
        arrayList.addAll(A0X);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AnonymousClass11F r12 = (AnonymousClass11F) it2.next();
            if (!r6.A0N(r12) && !A0X.contains(r12)) {
                arrayList.add(r12);
            }
        }
        return arrayList;
    }

    public HashSet A0C() {
        HashSet hashSet;
        C220412q.A00(this.A02);
        AnonymousClass1A7 r3 = this.A01;
        synchronized (r3) {
            hashSet = new HashSet(r3.A01.size());
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                hashSet.add(((AnonymousClass3I6) it.next()).A01);
            }
        }
        return hashSet;
    }

    public void A0D(AnonymousClass11F r3) {
        if (r3 != null) {
            C220412q.A00(this.A02);
            if (AnonymousClass143.A0H(r3)) {
                AnonymousClass1A7 r1 = this.A00;
                synchronized (r1) {
                    r1.A01(r3);
                }
                return;
            }
            AnonymousClass1A7 r12 = this.A01;
            synchronized (r12) {
                r12.A01(r3);
            }
        }
    }

    public boolean A0E(AnonymousClass11F r4) {
        boolean z;
        boolean z2;
        if (r4 == null) {
            return false;
        }
        C220412q.A00(this.A02);
        if (AnonymousClass143.A0H(r4)) {
            AnonymousClass1A7 r1 = this.A00;
            synchronized (r1) {
                z2 = false;
                if (AnonymousClass1A7.A00(r1, r4) >= 0) {
                    z2 = true;
                }
            }
            return z2;
        }
        AnonymousClass1A7 r12 = this.A01;
        synchronized (r12) {
            z = false;
            if (AnonymousClass1A7.A00(r12, r4) >= 0) {
                z = true;
            }
        }
        return z;
    }

    public boolean A0F(AnonymousClass11F r3, long j) {
        boolean A03;
        C220412q.A00(this.A02);
        if (!AnonymousClass143.A0H(r3)) {
            return A00(this, r3, r3, j);
        }
        AnonymousClass1A7 r1 = this.A00;
        synchronized (r1) {
            A03 = r1.A03(r3, r3, j);
        }
        return A03;
    }

    public AnonymousClass1A6(C220412q r2) {
        this.A02 = r2;
    }
}
