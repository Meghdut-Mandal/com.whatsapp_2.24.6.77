package X;

/* renamed from: X.17K  reason: invalid class name */
public class AnonymousClass17K {
    public final C19700wN A00;
    public final AnonymousClass00T A01;

    public AnonymousClass17K(C19700wN r3, AnonymousClass17H r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r3;
        this.A01 = new AnonymousClass00U(new AnonymousClass17M(r4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2bI A00(X.C64933Qa r9, int r10, long r11) {
        /*
            r8 = this;
            X.00T r4 = r8.A01
            java.lang.Object r2 = r4.getValue()
            X.9Nb r2 = (X.C193839Nb) r2
            monitor-enter(r2)
            r7 = 1
            r6 = 0
            if (r10 < 0) goto L_0x0048
            int r0 = r2.A00     // Catch:{ all -> 0x00d7 }
            if (r10 > r0) goto L_0x0048
            X.0ry[] r5 = r2.A05     // Catch:{ all -> 0x00d7 }
            r1 = r5[r10]     // Catch:{ all -> 0x00d7 }
            if (r1 != 0) goto L_0x0033
            X.9UU r1 = r2.A01     // Catch:{ all -> 0x00d7 }
            X.08d r0 = r2.A04     // Catch:{ all -> 0x00d7 }
            X.004 r3 = r1.A00(r0, r10)     // Catch:{ all -> 0x00d7 }
            if (r3 != 0) goto L_0x0039
            java.lang.Boolean[] r1 = r2.A06     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00d7 }
            r1[r10] = r0     // Catch:{ all -> 0x00d7 }
            X.00T r0 = r2.A03     // Catch:{ all -> 0x00d7 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00d7 }
            X.0ry r1 = (X.C17750ry) r1     // Catch:{ all -> 0x00d7 }
        L_0x0031:
            r5[r10] = r1     // Catch:{ all -> 0x00d7 }
        L_0x0033:
            java.lang.String r0 = "null cannot be cast to non-null type IP of com.whatsapp.fmessage.systemmessage.platform.core.SystemMessageSubsystemApi.getIntegrationPoint$lambda$0"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ all -> 0x00d7 }
            goto L_0x0053
        L_0x0039:
            java.lang.Boolean[] r1 = r2.A06     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00d7 }
            r1[r10] = r0     // Catch:{ all -> 0x00d7 }
            java.lang.Object r1 = r3.get()     // Catch:{ all -> 0x00d7 }
            X.0ry r1 = (X.C17750ry) r1     // Catch:{ all -> 0x00d7 }
            goto L_0x0031
        L_0x0048:
            X.00T r0 = r2.A03     // Catch:{ all -> 0x00d7 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00d7 }
            X.0ry r1 = (X.C17750ry) r1     // Catch:{ all -> 0x00d7 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x00d7 }
        L_0x0053:
            monitor-exit(r2)
            X.B6G r1 = (X.B6G) r1
            X.2bI r0 = r1.B4c(r9, r10, r11)     // Catch:{ 17L -> 0x005b }
            return r0
        L_0x005b:
            r3 = move-exception
            java.lang.String r2 = java.lang.Integer.toString(r10)
            X.AnonymousClass00C.A08(r2)
            java.lang.Object r5 = r4.getValue()
            X.9Nb r5 = (X.C193839Nb) r5
            monitor-enter(r5)
            r6 = 1
            if (r10 < 0) goto L_0x0095
            int r0 = r5.A00     // Catch:{ all -> 0x0092 }
            if (r10 > r0) goto L_0x0095
            java.lang.Boolean[] r4 = r5.A06     // Catch:{ all -> 0x0092 }
            r0 = r4[r10]     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0092 }
            goto L_0x0098
        L_0x007c:
            X.9UU r1 = r5.A01     // Catch:{ all -> 0x0092 }
            X.08d r0 = r5.A04     // Catch:{ all -> 0x0092 }
            X.004 r0 = r1.A00(r0, r10)     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0087
            r6 = 0
        L_0x0087:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0092 }
            r4[r10] = r0     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0092 }
            goto L_0x0098
        L_0x0092:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0095:
            monitor-exit(r5)
            r0 = 0
            goto L_0x0099
        L_0x0098:
            monitor-exit(r5)
        L_0x0099:
            X.0wN r1 = r8.A00
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "system-message-factory-action-not-supported"
            r1.A0D(r0, r2, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SystemMessageFactorySubsystem; cannot create "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " (not supported)"
        L_0x00b1:
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            X.2bI r0 = new X.2bI
            r0.<init>(r9, r10, r11)
            return r0
        L_0x00c2:
            java.lang.String r0 = "system-message-factory-action-not-registered"
            r1.A0D(r0, r2, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SystemMessageFactorySubsystem; cannot crete "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " (not registered)"
            goto L_0x00b1
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17K.A00(X.3Qa, int, long):X.2bI");
    }
}
