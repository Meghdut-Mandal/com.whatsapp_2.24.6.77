package X;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.6SP  reason: invalid class name */
public final class AnonymousClass6SP {
    public List A00 = Collections.synchronizedList(AnonymousClass001.A0I());
    public final C19700wN A01;
    public final C19630wG A02;
    public final C20810yC A03;
    public final C19770wU A04;
    public final ReadWriteLock A05 = new ReentrantReadWriteLock();
    public final C19970wo A06;
    public final Map A07;

    public AnonymousClass6SP(C19700wN r7, C19970wo r8, C19630wG r9, C20810yC r10, C19770wU r11) {
        int A042 = C36361kB.A04(r10, r8, 1);
        C36321k7.A17(r7, r9, r11, 3);
        this.A03 = r10;
        this.A06 = r8;
        this.A01 = r7;
        this.A02 = r9;
        this.A04 = r11;
        AnonymousClass011[] r5 = new AnonymousClass011[A042];
        C36341k9.A1J(0, AnonymousClass5X0.A02(AnonymousClass51l.A02, 16), r5, 0);
        C36341k9.A1J(1, AnonymousClass5X0.A02(AnonymousClass51k.A01, 17), r5, 1);
        this.A07 = C000400e.A07(r5);
    }

    public static final File A00(AnonymousClass6SP r1) {
        File A0w = C36441kJ.A0w(C90514aH.A0j(r1.A02), "business_search");
        C90474aD.A15(A0w);
        return C36441kJ.A0w(A0w, "business_search_history");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        com.whatsapp.util.Log.e("BusinessSearchRecentSearchManager/getRecentSearches/Failed!", r0);
        r9.A01.A0E("BusinessSearchRecentSearchManager/getRecentSearches/Failed!", r0.getMessage(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass6SP r9) {
        /*
            java.io.File r0 = A00(r9)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0097
            java.util.concurrent.locks.ReadWriteLock r3 = r9.A05
            java.util.concurrent.locks.Lock r0 = r3.readLock()
            r0.lock()
            java.io.File r0 = A00(r9)
            java.io.BufferedReader r2 = X.C90504aG.A0Z(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
        L_0x001f:
            java.lang.String r0 = r2.readLine()
            if (r0 == 0) goto L_0x002e
            r1.append(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            goto L_0x001f
        L_0x002e:
            r2.close()
            java.util.concurrent.locks.Lock r0 = r3.readLock()
            r0.unlock()
            java.lang.String r1 = r1.toString()
            r8 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0097
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0097
            java.util.List r7 = r9.A00     // Catch:{ Exception -> 0x0088 }
            X.AnonymousClass00C.A07(r7)     // Catch:{ Exception -> 0x0088 }
            monitor-enter(r7)     // Catch:{ Exception -> 0x0088 }
            r7.clear()     // Catch:{ all -> 0x0085 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ all -> 0x0085 }
            r6.<init>(r1)     // Catch:{ all -> 0x0085 }
            int r4 = r6.length()     // Catch:{ all -> 0x0085 }
        L_0x0058:
            if (r8 >= r4) goto L_0x0083
            org.json.JSONObject r3 = r6.getJSONObject(r8)     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = "type"
            r0 = -1
            int r2 = r3.optInt(r1, r0)     // Catch:{ all -> 0x0085 }
            java.util.Map r1 = r9.A07     // Catch:{ all -> 0x0085 }
            boolean r0 = X.C90484aE.A1Y(r1, r2)     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = X.C36371kC.A0r(r1, r2)     // Catch:{ all -> 0x0085 }
            X.02t r0 = (X.C006302t) r0     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r0.invoke(r3)     // Catch:{ all -> 0x0085 }
            X.60m r0 = (X.C1255960m) r0     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0080
            r7.add(r0)     // Catch:{ all -> 0x0085 }
        L_0x0080:
            int r8 = r8 + 1
            goto L_0x0058
        L_0x0083:
            monitor-exit(r7)     // Catch:{ Exception -> 0x0088 }
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ Exception -> 0x0088 }
            throw r0     // Catch:{ Exception -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            java.lang.String r2 = "BusinessSearchRecentSearchManager/getRecentSearches/Failed!"
            com.whatsapp.util.Log.e(r2, r0)
            X.0wN r1 = r9.A01
            java.lang.String r0 = r0.getMessage()
            r1.A0E(r2, r0, r5)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6SP.A01(X.6SP):void");
    }
}
