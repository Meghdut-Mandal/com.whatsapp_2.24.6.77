package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.9ko  reason: invalid class name and case insensitive filesystem */
public class C201979ko {
    public static final C201979ko A01 = new C201979ko(true);
    public static volatile C201979ko A02;
    public final Map A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|(4:9|10|11|(2:13|16))|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C201979ko A00() {
        /*
            X.9ko r0 = A02
            if (r0 != 0) goto L_0x002d
            java.lang.Class<X.9ko> r5 = X.C201979ko.class
            monitor-enter(r5)
            X.9ko r0 = A02     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0028
            java.lang.String r4 = "getEmptyRegistry"
            java.lang.Class r1 = X.AnonymousClass99Q.A00     // Catch:{ all -> 0x002a }
            r3 = 0
            if (r1 == 0) goto L_0x0024
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0024 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r0)     // Catch:{ Exception -> 0x0024 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch:{ Exception -> 0x0024 }
            X.9ko r0 = (X.C201979ko) r0     // Catch:{ Exception -> 0x0024 }
            if (r0 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            X.9ko r0 = A01     // Catch:{ all -> 0x002a }
        L_0x0026:
            A02 = r0     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x002a }
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201979ko.A00():X.9ko");
    }

    public C201979ko(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    public C201979ko() {
        this.A00 = AnonymousClass001.A0J();
    }
}