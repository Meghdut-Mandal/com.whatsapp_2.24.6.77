package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.12q  reason: invalid class name and case insensitive filesystem */
public class C220412q {
    public boolean A00;
    public final HashSet A01 = new HashSet();
    public final AnonymousClass12J A02;
    public final C20810yC A03;
    public final ConcurrentHashMap A04;
    public volatile AnonymousClass14C A05;
    public volatile boolean A06;

    public int A04(AnonymousClass11F r6, AnonymousClass11F r7) {
        if (r6 == null && r7 == null) {
            return 0;
        }
        if (r6 != null) {
            if (r7 != null) {
                C65073Qp A09 = A09(r6, false);
                C65073Qp A092 = A09(r7, false);
                if (A09 == null) {
                    if (A092 == null) {
                        return 0;
                    }
                } else if (A092 != null) {
                    return Long.compare(A092.A03(), A09.A03());
                }
            }
            return 1;
        }
        return -1;
    }

    public AnonymousClass3T1 A0C(AnonymousClass11F r4) {
        if (r4 == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C65073Qp A09 = A09(r4, false);
        if (A09 != null) {
            return A09.A0d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/last/message/no chat for ");
        sb.append(r4);
        Log.w(sb.toString());
        return null;
    }

    public String A0D(AnonymousClass11F r3) {
        C65073Qp r0;
        if (r3 == null || (r0 = (C65073Qp) A00(this).get(r3)) == null) {
            return null;
        }
        return r0.A0h;
    }

    public synchronized Collection A0F() {
        return A00(this).values();
    }

    public synchronized Set A0G() {
        return A00(this).keySet();
    }

    public synchronized void A0I(C65073Qp r2, AnonymousClass11F r3) {
        if (r3 != null) {
            A00(this).put(r3, r2);
            if (r2.A0j) {
                this.A01.add(r3);
            }
        }
    }

    public synchronized void A0J(AnonymousClass11F r2) {
        if (r2 != null) {
            A00(this).remove(r2);
            this.A01.remove(r2);
        }
    }

    public synchronized void A0K(AnonymousClass3T1 r7) {
        C65073Qp A09 = A09(r7.A1J.A00, false);
        if (A09 != null) {
            AnonymousClass3T1 r0 = A09.A0d;
            if (r0 != null && r0.A1N == r7.A1N) {
                A09.A0d = r7;
            }
            AnonymousClass3T1 r02 = A09.A0c;
            if (r02 != null && r02.A1N == r7.A1N) {
                A09.A0c = r7;
            }
        }
    }

    public synchronized void A0L(C64933Qa r4) {
        C65073Qp A09 = A09(r4.A00, false);
        if (A09 != null) {
            AnonymousClass3T1 r0 = A09.A0d;
            if (r0 != null && r0.A1J.equals(r4)) {
                A09.A0d = null;
            }
            AnonymousClass3T1 r02 = A09.A0c;
            if (r02 != null && r02.A1J.equals(r4)) {
                A09.A0c = null;
            }
            AnonymousClass35M r03 = A09.A0f;
            if (r03 != null && r03.A00.A1J.equals(r4)) {
                A09.A0f = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = (X.C65073Qp) A00(r2).get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Q(X.AnonymousClass11F r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L_0x0014
            java.util.concurrent.ConcurrentHashMap r0 = A00(r2)
            java.lang.Object r0 = r0.get(r3)
            X.3Qp r0 = (X.C65073Qp) r0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x0014
            r1 = 1
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220412q.A0Q(X.11F):boolean");
    }

    public boolean A0T(AnonymousClass11F r4, int i) {
        String str;
        C65073Qp A09 = A09(r4, false);
        if (!(A09 == null || (str = A09.A0g) == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("\"");
            sb.append(i);
            sb.append("\"");
            if (str.contains(sb.toString())) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x01e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ConcurrentHashMap A00(X.C220412q r15) {
        /*
            X.14C r0 = r15.A05
            if (r0 != 0) goto L_0x000b
            boolean r0 = r15.A06
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            java.util.concurrent.ConcurrentHashMap r0 = r15.A04
            return r0
        L_0x000b:
            monitor-enter(r15)
            X.14C r1 = r15.A05     // Catch:{ all -> 0x01e9 }
            if (r1 == 0) goto L_0x01e2
            r5 = 1
            r15.A06 = r5     // Catch:{ all -> 0x01e9 }
            r0 = 0
            r15.A05 = r0     // Catch:{ all -> 0x01e9 }
            r3 = 0
            X.12t r0 = r1.A00     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.005 r6 = r0.A01     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.Object r0 = r6.get()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.12P r0 = r0.A0H     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r0.A06()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            boolean r0 = r0.A08     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r0 = r6.get()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.11e r0 = r0.A0T     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.String r2 = "ChatManager_loadChats"
            r0.A09(r2)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.Object r0 = r6.get()     // Catch:{ IllegalStateException -> 0x009a }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ IllegalStateException -> 0x009a }
            X.12P r0 = r0.A0H     // Catch:{ IllegalStateException -> 0x009a }
            X.1M0 r11 = r0.get()     // Catch:{ IllegalStateException -> 0x009a }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0090 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ all -> 0x0090 }
            X.163 r0 = r0.A0C     // Catch:{ all -> 0x0090 }
            java.util.HashMap r4 = r0.A0C()     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0090 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ all -> 0x0090 }
            X.1Eu r0 = r0.A0D     // Catch:{ all -> 0x0090 }
            r0.A01(r4)     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0090 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ all -> 0x0090 }
            X.1Ja r10 = r0.A0I     // Catch:{ all -> 0x0090 }
            java.util.List r0 = r10.A04()     // Catch:{ all -> 0x0090 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0090 }
        L_0x006a:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0090 }
            X.2La r8 = (X.C44072La) r8     // Catch:{ all -> 0x0090 }
            X.12q r7 = r10.A02     // Catch:{ all -> 0x0090 }
            X.11F r0 = r8.A0q     // Catch:{ all -> 0x0090 }
            r7.A0I(r8, r0)     // Catch:{ all -> 0x0090 }
            goto L_0x006a
        L_0x007e:
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0090 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ all -> 0x0090 }
            X.1LV r0 = r0.A03     // Catch:{ all -> 0x0090 }
            r0.A07()     // Catch:{ all -> 0x0090 }
            X.AnonymousClass14C.A00(r1)     // Catch:{ all -> 0x0090 }
            r11.close()     // Catch:{ IllegalStateException -> 0x009a }
            goto L_0x00e0
        L_0x0090:
            r4 = move-exception
            r11.close()     // Catch:{ all -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x009a }
        L_0x0099:
            throw r4     // Catch:{ IllegalStateException -> 0x009a }
        L_0x009a:
            r4 = move-exception
            java.lang.String r0 = "msgstore-manager/finish"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x01c3 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x01c3 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ all -> 0x01c3 }
            X.12P r0 = r0.A0H     // Catch:{ all -> 0x01c3 }
            r0.A06()     // Catch:{ all -> 0x01c3 }
            X.12f r0 = r0.A02     // Catch:{ all -> 0x01c3 }
            r0.close()     // Catch:{ all -> 0x01c3 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x01c3 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ all -> 0x01c3 }
            X.1Ej r0 = r0.A0L     // Catch:{ all -> 0x01c3 }
            r0.A01()     // Catch:{ all -> 0x01c3 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x01c3 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ all -> 0x01c3 }
            X.163 r0 = r0.A0C     // Catch:{ all -> 0x01c3 }
            java.util.HashMap r4 = r0.A0C()     // Catch:{ all -> 0x01c3 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x01c3 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ all -> 0x01c3 }
            X.1Eu r0 = r0.A0D     // Catch:{ all -> 0x01c3 }
            r0.A01(r4)     // Catch:{ all -> 0x01c3 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x01c3 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ all -> 0x01c3 }
            X.1LV r0 = r0.A03     // Catch:{ all -> 0x01c3 }
            r0.A07()     // Catch:{ all -> 0x01c3 }
            X.AnonymousClass14C.A00(r1)     // Catch:{ all -> 0x01c3 }
        L_0x00e0:
            java.lang.Object r0 = r6.get()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.11e r0 = r0.A0T     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r0.A08(r2)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.Set r0 = r4.entrySet()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
        L_0x00f3:
            boolean r0 = r7.hasNext()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            if (r0 == 0) goto L_0x0126
            java.lang.Object r4 = r7.next()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.concurrent.ConcurrentHashMap r2 = r15.A04     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.Object r1 = r4.getKey()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.3Qp r0 = (X.C65073Qp) r0     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r2.put(r1, r0)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.3Qp r0 = (X.C65073Qp) r0     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            boolean r0 = r0.A0j     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            if (r0 == 0) goto L_0x00f3
            java.util.HashSet r1 = r15.A01     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.Object r0 = r4.getKey()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.11F r0 = (X.AnonymousClass11F) r0     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r1.add(r0)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            goto L_0x00f3
        L_0x0126:
            java.util.concurrent.ConcurrentHashMap r0 = r15.A04     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.Set r0 = r0.keySet()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r8.<init>(r0)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.Object r0 = r6.get()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.1JC r11 = r0.A05     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.1A6 r13 = r11.A04     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.12q r12 = r13.A02     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            A00(r12)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r10.<init>()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r9.<init>()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.1A7 r4 = r13.A01     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            monitor-enter(r4)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.Iterator r14 = r8.iterator()     // Catch:{ all -> 0x01c0 }
        L_0x0151:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0187
            java.lang.Object r2 = r14.next()     // Catch:{ all -> 0x01c0 }
            X.11F r2 = (X.AnonymousClass11F) r2     // Catch:{ all -> 0x01c0 }
            boolean r0 = r12.A0M(r2)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0151
            boolean r0 = r2 instanceof X.C28981Uw     // Catch:{ all -> 0x01c0 }
            if (r0 != 0) goto L_0x0151
            long r6 = r12.A08(r2)     // Catch:{ all -> 0x01c0 }
            X.3I6 r1 = new X.3I6     // Catch:{ all -> 0x01c0 }
            r1.<init>(r2, r6)     // Catch:{ all -> 0x01c0 }
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x01c0 }
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass6SZ.A00(r2)     // Catch:{ all -> 0x01c0 }
            int r0 = r12.A06(r0)     // Catch:{ all -> 0x01c0 }
            if (r0 == r5) goto L_0x0151
            java.util.concurrent.ConcurrentHashMap r0 = A00(r12)     // Catch:{ all -> 0x01c0 }
            r0.get(r2)     // Catch:{ all -> 0x01c0 }
            r10.add(r1)     // Catch:{ all -> 0x01c0 }
            goto L_0x0151
        L_0x0187:
            r4.A02(r10)     // Catch:{ all -> 0x01c0 }
            monitor-exit(r4)     // Catch:{ all -> 0x01c0 }
            X.1A7 r1 = r13.A00     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            monitor-enter(r1)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r1.A02(r9)     // Catch:{ all -> 0x01bd }
            monitor-exit(r1)     // Catch:{ all -> 0x01bd }
            X.17Y r4 = r11.A02     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.1Cf r2 = r11.A05     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r1 = 3
            X.1j6 r0 = new X.1j6     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r0.<init>(r2, r1)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r4.Bp3(r0)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r1.<init>()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.String r0 = "msgstore-manager/initialize/chats "
            r1.append(r0)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            int r0 = r8.size()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r1.append(r0)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r15.A00 = r5     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            goto L_0x01e0
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01bd }
            goto L_0x01df
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01c0 }
            goto L_0x01df
        L_0x01c3:
            r1 = move-exception
            java.lang.Object r0 = r6.get()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.11e r0 = r0.A0T     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r0.A08(r2)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            throw r1     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
        L_0x01d0:
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r1.<init>()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            java.lang.String r0 = "msgstore-manager/finish/db is not ready yet"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            X.12r r0 = new X.12r     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
            r0.<init>()     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
        L_0x01df:
            throw r0     // Catch:{ 12r -> 0x01e0, all -> 0x01e5 }
        L_0x01e0:
            r15.A06 = r3     // Catch:{ all -> 0x01e9 }
        L_0x01e2:
            monitor-exit(r15)     // Catch:{ all -> 0x01e9 }
            goto L_0x0008
        L_0x01e5:
            r0 = move-exception
            r15.A06 = r3     // Catch:{ all -> 0x01e9 }
            throw r0     // Catch:{ all -> 0x01e9 }
        L_0x01e9:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01e9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220412q.A00(X.12q):java.util.concurrent.ConcurrentHashMap");
    }

    public int A05(GroupJid groupJid) {
        if (!C20800yB.A01(C21000yV.A02, this.A03, 982)) {
            return 0;
        }
        return A06(groupJid);
    }

    public C65073Qp A09(AnonymousClass11F r6, boolean z) {
        List BDH;
        C65073Qp r3;
        C65073Qp r32;
        if (r6 == null) {
            return null;
        }
        if (z) {
            BDH = Collections.singletonList(r6);
        } else if (!AnonymousClass143.A0I(r6) && (r3 = (C65073Qp) A00(this).get(r6)) != null) {
            return r3;
        } else {
            BDH = this.A02.BDH(r6);
        }
        synchronized (this) {
            ConcurrentHashMap A002 = A00(this);
            Iterator it = BDH.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r32 = null;
                    break;
                }
                r32 = (C65073Qp) A002.get((AnonymousClass11F) it.next());
                if (r32 != null && !r32.A0o) {
                    break;
                }
            }
        }
        return r32;
    }

    public ArrayList A0E() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap A002 = A00(this);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            arrayList.add(A002.get(it.next()));
        }
        return arrayList;
    }

    public boolean A0O(AnonymousClass11F r4) {
        if (!(r4 instanceof GroupJid) || A05((GroupJid) r4) != 3) {
            return false;
        }
        return true;
    }

    public boolean A0P(AnonymousClass11F r4) {
        if (!(r4 instanceof GroupJid) || A06((GroupJid) r4) != 3) {
            return false;
        }
        return true;
    }

    public boolean A0S(AnonymousClass11F r4) {
        AnonymousClass6SZ r0 = GroupJid.Companion;
        if (A05(AnonymousClass6SZ.A00(r4)) == 6) {
            C20810yC r2 = this.A03;
            C21000yV r1 = C21000yV.A02;
            if (!C20800yB.A01(r1, r2, 5021) || !C20800yB.A01(r1, r2, 982)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C220412q(AnonymousClass12J r2, C20810yC r3) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = new ConcurrentHashMap();
    }

    public int A01(AnonymousClass11F r2) {
        C65073Qp r0 = (C65073Qp) A00(this).get(r2);
        if (r0 == null) {
            return 0;
        }
        return r0.A06;
    }

    public int A02(AnonymousClass11F r2) {
        C65073Qp r0 = (C65073Qp) A00(this).get(r2);
        if (r0 == null) {
            return 0;
        }
        return r0.A08;
    }

    public int A03(AnonymousClass11F r2) {
        C65073Qp r0 = (C65073Qp) A00(this).get(r2);
        if (r0 == null) {
            return 0;
        }
        return r0.A0b.expiration;
    }

    public int A06(GroupJid groupJid) {
        C65073Qp r0;
        if (!AnonymousClass143.A0G(groupJid) || (r0 = (C65073Qp) A00(this).get(groupJid)) == null) {
            return 0;
        }
        return r0.A02;
    }

    public long A07(AnonymousClass11F r3) {
        C65073Qp r0 = (C65073Qp) A00(this).get(r3);
        if (r0 == null) {
            return 1;
        }
        return r0.A0P;
    }

    public long A08(AnonymousClass11F r3) {
        C65073Qp r0 = (C65073Qp) A00(this).get(r3);
        if (r0 == null) {
            return 0;
        }
        return r0.A0X;
    }

    public AnonymousClass38C A0A(AnonymousClass11F r9) {
        AnonymousClass38C r2;
        C65073Qp r1 = (C65073Qp) A00(this).get(r9);
        if (r1 == null) {
            return new AnonymousClass38C(0, 0, Long.MIN_VALUE, 0);
        }
        synchronized (r1) {
            r2 = new AnonymousClass38C(r1.A08, r1.A09, r1.A0Q, r1.A0A);
        }
        return r2;
    }

    public C80103un A0B(UserJid userJid) {
        C65073Qp r0 = (C65073Qp) A00(this).get(userJid);
        if (r0 == null) {
            return null;
        }
        return r0.A0b;
    }

    public void A0H() {
        A00(this);
    }

    public boolean A0M(AnonymousClass11F r3) {
        if (!A00(this).containsKey(r3) || A0R(r3)) {
            return false;
        }
        return true;
    }

    public boolean A0N(AnonymousClass11F r3) {
        C65073Qp r0 = (C65073Qp) A00(this).get(r3);
        if (r0 == null || !r0.A0i) {
            return false;
        }
        return true;
    }

    public boolean A0R(AnonymousClass11F r9) {
        C65073Qp r7 = (C65073Qp) A00(this).get(r9);
        if (r7 == null) {
            return true;
        }
        long j = r7.A0O;
        if (j == 0 && r7.A0F == Long.MIN_VALUE) {
            return false;
        }
        long j2 = r7.A0F;
        if (j2 != r7.A0G || j2 < j) {
            return false;
        }
        return true;
    }
}
