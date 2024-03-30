package X;

import android.util.LruCache;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.A2d  reason: case insensitive filesystem */
public final class C20989A2d implements B5Y {
    public final LruCache A00;
    public final HashMap A01 = AnonymousClass001.A0J();
    public final HashMap A02 = AnonymousClass001.A0J();
    public final List A03 = new CopyOnWriteArrayList();

    public synchronized NavigableSet B0R(B2F b2f, String str) {
        throw AnonymousClass001.A0E("MemoryCache does not support key listeners");
    }

    public void B0T(String str) {
    }

    public synchronized void B38(File file) {
    }

    public synchronized void B39(C21664AUg aUg, byte[] bArr) {
        HashMap hashMap = this.A01;
        String str = aUg.A07;
        TreeSet treeSet = (TreeSet) hashMap.get(str);
        if (treeSet == null) {
            treeSet = new TreeSet();
            hashMap.put(str, treeSet);
        }
        treeSet.add(aUg);
        this.A00.put(A01(aUg), bArr);
    }

    public synchronized long B97() {
        return (long) this.A00.size();
    }

    public synchronized NavigableSet B9B(String str) {
        TreeSet treeSet;
        TreeSet treeSet2 = (TreeSet) this.A01.get(str);
        if (treeSet2 == null) {
            treeSet = null;
        } else {
            treeSet = new TreeSet(treeSet2);
        }
        return treeSet;
    }

    public synchronized Set BDP() {
        return C90524aI.A0k(this.A01.keySet());
    }

    public synchronized long BIR(String str) {
        long j;
        Long l = (Long) this.A02.get(str);
        if (l == null) {
            j = -1;
        } else {
            j = l.longValue();
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean BLH(java.lang.String r11, long r12, long r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.HashMap r0 = r10.A01     // Catch:{ all -> 0x0058 }
            java.lang.Object r6 = r0.get(r11)     // Catch:{ all -> 0x0058 }
            java.util.TreeSet r6 = (java.util.TreeSet) r6     // Catch:{ all -> 0x0058 }
            r8 = 0
            if (r6 == 0) goto L_0x0056
            X.AUg r0 = X.C202829mj.A02(r11, r12)     // Catch:{ all -> 0x0058 }
            java.lang.Object r5 = r6.floor(r0)     // Catch:{ all -> 0x0058 }
            X.AUg r5 = (X.C21664AUg) r5     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0056
            long r1 = r5.A05     // Catch:{ all -> 0x0058 }
            long r3 = r5.A04     // Catch:{ all -> 0x0058 }
            long r1 = r1 + r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0056
            long r12 = r12 + r14
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            boolean r0 = r10.A02(r5)     // Catch:{ all -> 0x0058 }
            goto L_0x0054
        L_0x002b:
            java.util.NavigableSet r0 = r6.tailSet(r5, r8)     // Catch:{ all -> 0x0058 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0058 }
        L_0x0033:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x0058 }
            X.AUg r7 = (X.C21664AUg) r7     // Catch:{ all -> 0x0058 }
            long r5 = r7.A05     // Catch:{ all -> 0x0058 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0056
            long r3 = r7.A04     // Catch:{ all -> 0x0058 }
            long r5 = r5 + r3
            long r1 = java.lang.Math.max(r1, r5)     // Catch:{ all -> 0x0058 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0033
            boolean r0 = r10.A02(r7)     // Catch:{ all -> 0x0058 }
        L_0x0054:
            monitor-exit(r10)
            return r0
        L_0x0056:
            monitor-exit(r10)
            return r8
        L_0x0058:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20989A2d.BLH(java.lang.String, long, long):boolean");
    }

    public boolean BMG(String str) {
        return true;
    }

    public synchronized byte[] Bmu(C21664AUg aUg) {
        return (byte[]) this.A00.get(A01(aUg));
    }

    public synchronized void BnP(C21664AUg aUg) {
    }

    public synchronized void Bnn(B2F b2f, String str) {
        throw AnonymousClass001.A0E("MemoryCache does not support key listeners");
    }

    public synchronized void Bny(C21664AUg aUg) {
        Bnz(aUg, "not_provided");
    }

    public synchronized void Bnz(C21664AUg aUg, String str) {
        HashMap hashMap = this.A01;
        String str2 = aUg.A07;
        TreeSet treeSet = (TreeSet) hashMap.get(str2);
        if (treeSet != null) {
            treeSet.remove(aUg);
            if (treeSet.isEmpty()) {
                hashMap.remove(str2);
                this.A02.remove(str2);
            }
        }
        this.A00.remove(A01(aUg));
    }

    public synchronized void BsX(String str, long j) {
        C36421kH.A1K(str, this.A02, j);
    }

    public synchronized File BuU(String str, long j, long j2) {
        return null;
    }

    public synchronized C21664AUg Buj(Integer num, String str, long j) {
        return A00(C202829mj.A02(str, j));
    }

    public synchronized C21664AUg Buk(Integer num, String str, long j, long j2) {
        return A00(C202829mj.A02(str, j));
    }

    public synchronized C21664AUg Bul(Integer num, String str, long j) {
        return A00(C202829mj.A02(str, j));
    }

    private C21664AUg A00(C21664AUg aUg) {
        C21664AUg aUg2 = aUg;
        String str = aUg2.A07;
        long j = aUg2.A05;
        TreeSet treeSet = (TreeSet) this.A01.get(str);
        if (treeSet != null) {
            C21664AUg aUg3 = (C21664AUg) treeSet.floor(aUg2);
            if (aUg3 != null) {
                long j2 = aUg3.A05;
                if (j2 <= j && j < j2 + aUg3.A04) {
                    if (A02(aUg3)) {
                        return aUg3;
                    }
                    return A00(aUg2);
                }
            }
            C21664AUg aUg4 = (C21664AUg) treeSet.ceiling(aUg2);
            if (aUg4 != null) {
                return new C21664AUg((File) null, str, j, aUg4.A05 - j, -1, false);
            }
        }
        return new C21664AUg((File) null, str, j, -1, -1, false);
    }

    public C20989A2d(int i) {
        int i2 = i * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        B6p b6p = new B6p(this, i2, 0);
        this.A00 = b6p;
        b6p.maxSize();
    }

    public static String A01(C21664AUg aUg) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(aUg.A07);
        A0u.append(".");
        return C36411kG.A11(A0u, aUg.A05);
    }

    private boolean A02(C21664AUg aUg) {
        if (this.A00.get(A01(aUg)) != null) {
            return true;
        }
        ((AbstractCollection) this.A01.get(aUg.A07)).remove(aUg);
        return false;
    }

    public boolean BLI(String str, long j, long j2) {
        return BLH(str, j, j2);
    }
}
