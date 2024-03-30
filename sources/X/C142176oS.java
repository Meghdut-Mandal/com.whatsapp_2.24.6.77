package X;

import com.whatsapp.R;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6oS  reason: invalid class name and case insensitive filesystem */
public class C142176oS implements AnonymousClass7fH {
    public final C120345rM A00;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.util.Map r12) {
        /*
            r8 = this;
            X.5rM r3 = r8.A00
            monitor-enter(r3)
            java.util.Map r1 = r3.A00     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r1.get(r10)     // Catch:{ all -> 0x0086 }
            X.6KL r4 = (X.AnonymousClass6KL) r4     // Catch:{ all -> 0x0086 }
            if (r4 != 0) goto L_0x0018
            X.004 r0 = r3.A01     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0086 }
            X.6KL r4 = (X.AnonymousClass6KL) r4     // Catch:{ all -> 0x0086 }
            r1.put(r10, r4)     // Catch:{ all -> 0x0086 }
        L_0x0018:
            monitor-enter(r4)     // Catch:{ all -> 0x0086 }
            int r1 = r9.intValue()     // Catch:{ all -> 0x0083 }
            r0 = 0
            if (r1 == r0) goto L_0x0066
            java.util.Map r0 = r4.A00     // Catch:{ all -> 0x0083 }
        L_0x0022:
            r0.putAll(r12)     // Catch:{ all -> 0x0083 }
        L_0x0025:
            java.util.HashMap r7 = X.AnonymousClass6KL.A00(r4, r11)     // Catch:{ all -> 0x0083 }
            java.util.Map r6 = r4.A02     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r6.get(r11)     // Catch:{ all -> 0x0083 }
            X.00I r0 = (X.AnonymousClass00I) r0     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0080
            java.lang.Object r5 = r0.A00     // Catch:{ all -> 0x0083 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0083 }
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x0083 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0083 }
            X.5rN r2 = (X.C120355rN) r2     // Catch:{ all -> 0x0083 }
            java.lang.ref.WeakReference r0 = r2.A01     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0083 }
            X.6WZ r1 = (X.AnonymousClass6WZ) r1     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x007d
            X.74d r0 = r2.A00     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x007d
            r0 = 8
            X.74l r2 = new X.74l     // Catch:{ all -> 0x0083 }
            r2.<init>(r1, r7, r5, r0)     // Catch:{ all -> 0x0083 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0083 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0083 }
            if (r1 != r0) goto L_0x0077
            r2.run()     // Catch:{ all -> 0x0083 }
            goto L_0x0080
        L_0x0066:
            java.util.Map r1 = r4.A01     // Catch:{ all -> 0x0083 }
            java.util.Map r0 = X.C90514aH.A15(r11, r1)     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0022
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0083 }
            r0.<init>(r12)     // Catch:{ all -> 0x0083 }
            r1.put(r11, r0)     // Catch:{ all -> 0x0083 }
            goto L_0x0025
        L_0x0077:
            android.os.Handler r0 = X.AnonymousClass6WZ.A0M     // Catch:{ all -> 0x0083 }
            r0.post(r2)     // Catch:{ all -> 0x0083 }
            goto L_0x0080
        L_0x007d:
            r6.remove(r11)     // Catch:{ all -> 0x0083 }
        L_0x0080:
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            monitor-exit(r3)
            return
        L_0x0083:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142176oS.A00(java.lang.Integer, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public C118845op Bsd(C1271967i r8, AnonymousClass6WZ r9, AnonymousClass6IK r10, AnonymousClass6KB r11, C124125xd r12) {
        C118845op r1;
        Map map = r11.A02;
        if (map != null) {
            C120335rL r2 = (C120335rL) r8.A02.A00().get(R.id.bloks_data_module_namespace_manager);
            Objects.requireNonNull(r2);
            if (!"fetch".equals(map.get("mode"))) {
                return new C118845op((Runnable) null, (Object) null);
            }
            C120345rM r5 = this.A00;
            String str = r2.A00;
            String str2 = r2.A01;
            String str3 = r11.A00;
            synchronized (r5) {
                Map map2 = r5.A00;
                AnonymousClass6KL r4 = (AnonymousClass6KL) map2.get(str);
                if (r4 == null) {
                    r4 = (AnonymousClass6KL) r5.A01.get();
                    map2.put(str, r4);
                }
                synchronized (r4) {
                    C120355rN r3 = new C120355rN(r9);
                    r4.A02.put(str2, C36441kJ.A0W(str3, r3));
                    r1 = new C118845op(r3.A00, AnonymousClass6KL.A00(r4, str2));
                }
            }
            return r1;
        }
        throw AnonymousClass001.A09("Manifest entry is null");
    }

    public C142176oS(C120345rM r1) {
        this.A00 = r1;
    }
}
