package X;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3cm  reason: invalid class name and case insensitive filesystem */
public class C68983cm implements C88944Uq {
    public final C19730wQ A00;
    public final Map A01 = new ConcurrentHashMap();
    public final Map A02 = new ConcurrentHashMap();
    public final TreeSet A03 = new TreeSet();

    public synchronized void B0j(AnonymousClass2bM r14) {
        C80173uy r0;
        TreeSet treeSet;
        String str;
        if (!(r14 instanceof C180868mY)) {
            str = "Wrong message add on passed into MessageReactionsImpl";
        } else {
            C19730wQ r4 = this.A00;
            AnonymousClass11F A0n = C36441kJ.A0n(r4);
            if (A0n == null) {
                str = "myUserJid is null. User logged out?";
            } else {
                C180868mY r142 = (C180868mY) r14;
                Map map = this.A02;
                C64933Qa r1 = r142.A1J;
                map.put(r1.A01, r142);
                if (!r1.A02) {
                    A0n = r142.A0L();
                    C18740tg.A06(A0n);
                }
                C80143uv r3 = new C80143uv(r4, A0n, r142.A01, r142.A00, r142.A0I, r142.A01);
                String A002 = A00(r3.A05);
                if (!TextUtils.isEmpty(A002)) {
                    Map map2 = this.A01;
                    if (!map2.containsKey(A002)) {
                        r0 = new C80173uy(r4, r3, A002);
                        map2.put(A002, r0);
                        treeSet = this.A03;
                    } else {
                        Object obj = map2.get(A002);
                        C18740tg.A06(obj);
                        r0 = (C80173uy) obj;
                        treeSet = this.A03;
                        treeSet.remove(r0);
                        r0.A01(r3);
                    }
                    treeSet.add(r0);
                }
            }
        }
        C18740tg.A0D(false, str);
    }

    public synchronized C80173uy B8N(String str) {
        return (C80173uy) this.A01.get(str);
    }

    public synchronized Iterator B8O() {
        return this.A03.descendingIterator();
    }

    public synchronized int B8P() {
        return this.A03.size();
    }

    public synchronized Collection B8Y() {
        return this.A02.values();
    }

    public synchronized int BGT() {
        int i;
        i = 0;
        Iterator B8O = B8O();
        while (B8O.hasNext()) {
            C80173uy r1 = (C80173uy) B8O.next();
            if (!TextUtils.isEmpty(r1.A02)) {
                i += r1.A00();
            }
        }
        return i;
    }

    public synchronized String BGU(AnonymousClass11F r4, long j) {
        String str;
        Iterator B8O = B8O();
        while (true) {
            if (!B8O.hasNext()) {
                str = null;
                break;
            }
            C80143uv r0 = (C80143uv) ((C80173uy) B8O.next()).A03.get(C36441kJ.A0Q(r4, Long.valueOf(j)));
            if (r0 != null) {
                str = r0.A05;
                break;
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r11.A1J.A02 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void BoC(X.AnonymousClass2bM r11, X.AnonymousClass2bM r12, boolean r13) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            boolean r0 = r11 instanceof X.C180868mY     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009b
            boolean r0 = r12 instanceof X.C180868mY     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009b
            X.3Qa r0 = r12.A1J     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x001a
            X.3Qa r0 = r11.A1J     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x009b
            if (r13 != 0) goto L_0x0020
            goto L_0x009b
        L_0x001a:
            X.3Qa r0 = r11.A1J     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009b
        L_0x0020:
            X.8mY r11 = (X.C180868mY) r11     // Catch:{ all -> 0x00a3 }
            X.8mY r12 = (X.C180868mY) r12     // Catch:{ all -> 0x00a3 }
            X.0wQ r0 = r10.A00     // Catch:{ all -> 0x0099 }
            com.whatsapp.jid.PhoneUserJid r8 = X.C36441kJ.A0n(r0)     // Catch:{ all -> 0x0099 }
            if (r8 != 0) goto L_0x0033
            java.lang.String r1 = "myUserJid is null. User logged out?"
            r0 = 0
            X.C18740tg.A0D(r0, r1)     // Catch:{ all -> 0x0099 }
            goto L_0x0095
        L_0x0033:
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x0099 }
            java.lang.String r6 = A00(r0)     // Catch:{ all -> 0x0099 }
            java.util.Map r5 = r10.A01     // Catch:{ all -> 0x0099 }
            java.lang.Object r4 = r5.get(r6)     // Catch:{ all -> 0x0099 }
            X.3uy r4 = (X.C80173uy) r4     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0095
            java.util.TreeSet r3 = r10.A03     // Catch:{ all -> 0x0099 }
            r3.remove(r4)     // Catch:{ all -> 0x0099 }
            X.3Qa r2 = r11.A1J     // Catch:{ all -> 0x0099 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0055
            com.whatsapp.jid.UserJid r8 = r11.A0L()     // Catch:{ all -> 0x0099 }
            X.C18740tg.A06(r8)     // Catch:{ all -> 0x0099 }
        L_0x0055:
            long r0 = r11.A01     // Catch:{ all -> 0x0099 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0099 }
            android.util.Pair r7 = X.C36441kJ.A0Q(r8, r0)     // Catch:{ all -> 0x0099 }
            java.util.HashMap r0 = r4.A03     // Catch:{ all -> 0x0099 }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x0099 }
            if (r1 == 0) goto L_0x007d
            r0.remove(r7)     // Catch:{ all -> 0x0099 }
            java.util.TreeSet r0 = r4.A04     // Catch:{ all -> 0x0099 }
            r0.remove(r1)     // Catch:{ all -> 0x0099 }
            X.0wQ r0 = r4.A01     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.A0M(r8)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x007d
            int r0 = r4.A00     // Catch:{ all -> 0x0099 }
            int r0 = r0 + -1
            r4.A00 = r0     // Catch:{ all -> 0x0099 }
        L_0x007d:
            int r0 = r4.A00()     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0091
            r3.remove(r4)     // Catch:{ all -> 0x0099 }
            r5.remove(r6)     // Catch:{ all -> 0x0099 }
        L_0x0089:
            java.util.Map r1 = r10.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0099 }
            r1.remove(r0)     // Catch:{ all -> 0x0099 }
            goto L_0x0095
        L_0x0091:
            r3.add(r4)     // Catch:{ all -> 0x0099 }
            goto L_0x0089
        L_0x0095:
            r10.B0j(r12)     // Catch:{ all -> 0x00a3 }
            goto L_0x00a1
        L_0x0099:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x009b:
            java.lang.String r1 = "Wrong message add on passed into MessageReactionsImpl"
            r0 = 0
            X.C18740tg.A0D(r0, r1)     // Catch:{ all -> 0x00a3 }
        L_0x00a1:
            monitor-exit(r9)
            return
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68983cm.BoC(X.2bM, X.2bM, boolean):void");
    }

    public C88944Uq B4P() {
        return new C68983cm(this.A00, C36441kJ.A15(B8Y()));
    }

    public boolean isEmpty() {
        return this.A02.isEmpty();
    }

    public C68983cm(C19730wQ r3, List list) {
        this.A00 = r3;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B0j((AnonymousClass2bM) it.next());
        }
    }

    public static String A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C18740tg.A06(str);
        if (!AnonymousClass3TC.A03(str)) {
            return AnonymousClass3PG.A00;
        }
        return C63873Lt.A01(AnonymousClass3UO.A07(new AnonymousClass1XQ(AnonymousClass3TC.A00(str)).A00));
    }
}
