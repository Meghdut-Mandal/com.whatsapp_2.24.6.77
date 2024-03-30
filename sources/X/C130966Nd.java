package X;

/* renamed from: X.6Nd  reason: invalid class name and case insensitive filesystem */
public abstract class C130966Nd {
    public static final String A00 = AnonymousClass6VD.A01("WorkerFactory");

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c A[SYNTHETIC, Splitter:B:21:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C128916Ec A00(android.content.Context r9, androidx.work.WorkerParameters r10, java.lang.String r11) {
        /*
            r8 = this;
            r6 = r8
            boolean r0 = r8 instanceof X.C97434pb
            if (r0 == 0) goto L_0x0069
            X.4pb r6 = (X.C97434pb) r6
            r7 = 0
            X.AnonymousClass00C.A0D(r9, r7)
            X.7i6 r5 = r6.A01
            r0 = r5
            X.71g r0 = (X.C1494471g) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.A03
            java.lang.Object r0 = r1.get(r11)
            if (r0 != 0) goto L_0x001c
            java.lang.Long r0 = X.C36411kG.A0t()
        L_0x001c:
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Long r0 = X.C90464aC.A0S(r0)
            r1.put(r11, r0)
            java.lang.Class r1 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0057 }
            java.lang.Class<X.6Ec> r0 = X.C128916Ec.class
            java.lang.Class r4 = r1.asSubclass(r0)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0069
            r3 = 2
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x005f }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r1[r7] = r0     // Catch:{ all -> 0x005f }
            java.lang.Class<androidx.work.WorkerParameters> r0 = androidx.work.WorkerParameters.class
            r2 = 1
            r1[r2] = r0     // Catch:{ all -> 0x005f }
            java.lang.reflect.Constructor r1 = r4.getDeclaredConstructor(r1)     // Catch:{ all -> 0x005f }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x005f }
            r0[r7] = r9     // Catch:{ all -> 0x005f }
            r0[r2] = r10     // Catch:{ all -> 0x005f }
            java.lang.Object r1 = r1.newInstance(r0)     // Catch:{ all -> 0x005f }
            X.6Ec r1 = (X.C128916Ec) r1     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0069
            X.0wo r0 = r6.A00
            com.whatsapp.workmanager.ObservableWorkerFactory$LogExceptionsWorker r4 = new com.whatsapp.workmanager.ObservableWorkerFactory$LogExceptionsWorker
            r4.<init>(r1, r5, r0, r10)
            goto L_0x006a
        L_0x0057:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ObservableWorkerFactory/Invalid class: "
            goto L_0x0066
        L_0x005f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ObservableWorkerFactory/Could not instantiate "
        L_0x0066:
            X.C90464aC.A1L(r0, r11, r1, r2)
        L_0x0069:
            r4 = 0
        L_0x006a:
            if (r4 != 0) goto L_0x00a6
            java.lang.Class r1 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0099 }
            java.lang.Class<X.6Ec> r0 = X.C128916Ec.class
            java.lang.Class r6 = r1.asSubclass(r0)     // Catch:{ all -> 0x0099 }
            if (r6 == 0) goto L_0x00dc
            r5 = 2
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x00c9 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r3 = 0
            r1[r3] = r0     // Catch:{ all -> 0x00c9 }
            java.lang.Class<androidx.work.WorkerParameters> r0 = androidx.work.WorkerParameters.class
            r2 = 1
            r1[r2] = r0     // Catch:{ all -> 0x00c9 }
            java.lang.reflect.Constructor r1 = r6.getDeclaredConstructor(r1)     // Catch:{ all -> 0x00c9 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c9 }
            r0[r3] = r9     // Catch:{ all -> 0x00c9 }
            r0[r2] = r10     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x00c9 }
            X.6Ec r0 = (X.C128916Ec) r0     // Catch:{ all -> 0x00c9 }
            r4 = r0
            if (r0 == 0) goto L_0x00dc
            goto L_0x00a6
        L_0x0099:
            r3 = move-exception
            X.AnonymousClass6VD.A00()
            java.lang.String r2 = A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid class: "
            goto L_0x00d5
        L_0x00a6:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00dc
            java.lang.String r2 = X.AnonymousClass000.A0k(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WorkerFactory ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") returned an instance of a ListenableWorker ("
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        L_0x00c9:
            r3 = move-exception
            X.AnonymousClass6VD.A00()
            java.lang.String r2 = A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Could not instantiate "
        L_0x00d5:
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r11, r1)
            android.util.Log.e(r2, r0, r3)
        L_0x00dc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130966Nd.A00(android.content.Context, androidx.work.WorkerParameters, java.lang.String):X.6Ec");
    }
}
