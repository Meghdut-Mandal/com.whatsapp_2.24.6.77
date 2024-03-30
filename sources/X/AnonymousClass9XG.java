package X;

import java.util.LinkedHashMap;

/* renamed from: X.9XG  reason: invalid class name */
public final class AnonymousClass9XG {
    public final C198879eL A00;
    public final AnonymousClass00T A01;
    public final C019108d A02;
    public final int A03;
    public final AnonymousClass9UT A04;
    public final C16300ow[] A05;
    public final Boolean[] A06;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r6 > r5.A03) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C16300ow A00(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r4 = 1
            r3 = 0
            if (r6 < 0) goto L_0x000a
            int r1 = r5.A03     // Catch:{ all -> 0x004d }
            r0 = 1
            if (r6 <= r1) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 != 0) goto L_0x001a
            X.00T r0 = r5.A01     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004d }
            X.0ow r0 = (X.C16300ow) r0     // Catch:{ all -> 0x004d }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r0
        L_0x001a:
            X.0ow[] r2 = r5.A05     // Catch:{ all -> 0x004d }
            r1 = r2[r6]     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0039
            X.9UT r1 = r5.A04     // Catch:{ all -> 0x004d }
            X.08d r0 = r5.A02     // Catch:{ all -> 0x004d }
            X.004 r1 = r1.A00(r0, r6)     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x003f
            java.lang.Boolean[] r0 = r5.A06     // Catch:{ all -> 0x004d }
            X.AnonymousClass000.A1N(r0, r6, r3)     // Catch:{ all -> 0x004d }
            X.00T r0 = r5.A01     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x004d }
            X.0ow r1 = (X.C16300ow) r1     // Catch:{ all -> 0x004d }
        L_0x0037:
            r2[r6] = r1     // Catch:{ all -> 0x004d }
        L_0x0039:
            java.lang.String r0 = "null cannot be cast to non-null type IP of com.whatsapp.fmessage.platform.core.FMessageSubsystemApi.getIntegrationPoint$lambda$0"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x003f:
            java.lang.Boolean[] r0 = r5.A06     // Catch:{ all -> 0x004d }
            X.AnonymousClass000.A1N(r0, r6, r4)     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x004d }
            X.0ow r1 = (X.C16300ow) r1     // Catch:{ all -> 0x004d }
            goto L_0x0037
        L_0x004b:
            monitor-exit(r5)
            return r1
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XG.A00(int):X.0ow");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 1
            r1 = 0
            if (r5 < 0) goto L_0x002e
            int r0 = r4.A03     // Catch:{ all -> 0x002b }
            if (r5 > r0) goto L_0x002e
            java.lang.Boolean[] r2 = r4.A06     // Catch:{ all -> 0x002b }
            r0 = r2[r5]     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0014:
            X.9UT r1 = r4.A04     // Catch:{ all -> 0x002b }
            X.08d r0 = r4.A02     // Catch:{ all -> 0x002b }
            X.004 r0 = r1.A00(r0, r5)     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x001f
            r3 = 0
        L_0x001f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x002b }
            r2[r5] = r0     // Catch:{ all -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x002e:
            monitor-exit(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XG.A02(int):boolean");
    }

    public AnonymousClass9XG(AnonymousClass9UT r3, C198879eL r4, C019108d r5) {
        this.A02 = r5;
        this.A04 = r3;
        this.A00 = r4;
        r3.A01();
        AnonymousClass9MY r0 = r3.A00;
        if (r0 == null) {
            throw C36331k8.A0d("metadata");
        }
        int i = r0.A00;
        this.A03 = i;
        int i2 = i + 1;
        this.A05 = new C16300ow[i2];
        this.A06 = new Boolean[i2];
        this.A01 = C36431kI.A1I(new C22161Ahk(this));
    }

    public final LinkedHashMap A01() {
        LinkedHashMap A1G = C36431kI.A1G();
        synchronized (this) {
            int i = 0;
            int i2 = this.A03;
            if (i2 >= 0) {
                while (true) {
                    if (A02(i)) {
                        A1G.put(Integer.valueOf(i), A00(i));
                    }
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return A1G;
    }
}
