package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.A7n  reason: case insensitive filesystem */
public class C21076A7n implements C17700rt {
    public final C194879Rp A00;
    public final Object A01;

    public static C200759iB A00(String str, C22902AyE[] ayEArr) {
        ReentrantLock reentrantLock;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C197459bk.A01;
        A8N a8n = (A8N) AnonymousClass99X.A00;
        Map map = a8n.A01;
        C200759iB r2 = (C200759iB) map.get(str);
        if (r2 != null) {
            A8N.A00(a8n, str);
        } else if (str.length() != 0) {
            r2 = new C200759iB(str, ayEArr);
            if (map.put(str, r2) != null) {
                A8N.A00(a8n, str);
            } else {
                reentrantLock = a8n.A02;
                reentrantLock.lock();
                try {
                    a8n.A00.addFirst(str);
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (map.size() > 400) {
                reentrantLock = a8n.A02;
                reentrantLock.lock();
                String str2 = (String) a8n.A00.removeLast();
                reentrantLock.unlock();
                map.remove(str2);
                return r2;
            }
        } else {
            throw AnonymousClass001.A08("json can not be null or empty");
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r6.A07() != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        if (r7 != false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Bmq(java.lang.String r12, X.C22902AyE... r13) {
        /*
            r11 = this;
            java.lang.String r1 = "path can not be null or empty"
            if (r12 == 0) goto L_0x00e3
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00e3
            X.9iB r4 = A00(r12, r13)
            java.lang.String r0 = "path can not be null"
            X.C201749kK.A03(r4, r0)
            java.lang.Object r10 = r11.A01
            X.9Rp r5 = r11.A00
            X.8yz r9 = X.C188068yz.AS_PATH_LIST
            java.util.Set r1 = r5.A03
            boolean r8 = r1.contains(r9)
            X.8yz r3 = X.C188068yz.ALWAYS_RETURN_LIST
            boolean r7 = r1.contains(r3)
            X.8yz r0 = X.C188068yz.SUPPRESS_EXCEPTIONS
            boolean r2 = r1.contains(r0)
            X.9Tr r1 = r4.A00
            X.8TP r6 = r1.A00
            X.9Ya r0 = r6.A01
            boolean r0 = r0 instanceof X.AnonymousClass8TO
            r4 = 0
            if (r0 == 0) goto L_0x0073
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0051
            X.9gK r1 = r1.A00(r5, r10, r10)
            if (r2 == 0) goto L_0x00db
            java.util.ArrayList r0 = r1.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00db
        L_0x004a:
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x0085
        L_0x0050:
            return r4
        L_0x0051:
            if (r2 != 0) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Options "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " are not allowed when using path functions!"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.Ab9 r1 = new X.Ab9
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0073:
            X.9gK r3 = r1.A00(r5, r10, r10)
            if (r8 == 0) goto L_0x0090
            if (r2 == 0) goto L_0x009f
            java.util.ArrayList r0 = r3.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009f
        L_0x0085:
            X.B4b r0 = r5.A00
            X.A8O r0 = (X.A8O) r0
            X.9YQ r0 = r0.A00
            java.lang.Object r4 = r0.A01()
            return r4
        L_0x0090:
            if (r2 == 0) goto L_0x00bf
            java.util.ArrayList r0 = r3.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00bf
            if (r7 == 0) goto L_0x004a
            goto L_0x0085
        L_0x009f:
            int r0 = r3.A00
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No results for path: "
            r1.append(r0)
            X.9Tr r0 = r3.A02
            X.C36351kA.A1K(r0, r1)
            java.lang.String r0 = r1.toString()
            X.8Sr r1 = new X.8Sr
            r1.<init>(r0)
            throw r1
        L_0x00bf:
            r2 = 0
            java.lang.Object r4 = r3.A00()
            if (r7 == 0) goto L_0x0050
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x0050
            X.B4b r1 = r5.A00
            r0 = r1
            X.A8O r0 = (X.A8O) r0
            X.9YQ r0 = r0.A00
            java.lang.Object r0 = r0.A01()
            r1.BqC(r0, r2, r4)
            return r0
        L_0x00db:
            java.lang.Object r4 = r1.A00()
            return r4
        L_0x00e0:
            java.lang.Object r4 = r3.A03
            return r4
        L_0x00e3:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21076A7n.Bmq(java.lang.String, X.AyE[]):java.lang.Object");
    }

    public C21076A7n(C194879Rp r2, Object obj) {
        C201749kK.A03(obj, "json can not be null");
        C201749kK.A03(r2, "configuration can not be null");
        this.A00 = r2;
        this.A01 = obj;
    }
}
