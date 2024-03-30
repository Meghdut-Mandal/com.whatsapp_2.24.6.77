package X;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.0uo  reason: invalid class name and case insensitive filesystem */
public final class C19360uo {
    public C19390uv A00;
    public Boolean A01;
    public boolean A02;
    public boolean A03;
    public final C19160uT A04;
    public final /* synthetic */ FirebaseInstanceId A05;

    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|6|7|8|9|(6:14|15|(1:17)(4:19|20|(1:28)|29)|18|(3:32|33|(2:35|98))|47)|13|15|(0)(0)|18|(0)|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e6, code lost:
        if (((X.C19410ux) r0.A03.get()).A02.get() == false) goto L_0x00e8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[SYNTHETIC, Splitter:B:19:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[SYNTHETIC, Splitter:B:32:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A00() {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            boolean r0 = r7.A03     // Catch:{ all -> 0x00eb }
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "com.google.firebase.messaging.FirebaseMessaging"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000c }
            goto L_0x0032
        L_0x000c:
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.A05     // Catch:{ all -> 0x00eb }
            X.0u7 r0 = r0.A01     // Catch:{ all -> 0x00eb }
            X.C18960u7.A02(r0)     // Catch:{ all -> 0x00eb }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x00eb }
            r2.<init>(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ all -> 0x00eb }
            r2.setPackage(r0)     // Catch:{ all -> 0x00eb }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x00eb }
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r2, r0)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x0034
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x0034
        L_0x0032:
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r7.A02 = r0     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "firebase_messaging_auto_init_enabled"
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.A05     // Catch:{ all -> 0x00eb }
            X.0u7 r0 = r0.A01     // Catch:{ all -> 0x00eb }
            X.C18960u7.A02(r0)     // Catch:{ all -> 0x00eb }
            android.content.Context r4 = r0.A00     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "com.google.firebase.messaging"
            r3 = 0
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r0, r3)     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "auto_init"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x005c
            boolean r0 = r2.getBoolean(r1, r3)     // Catch:{ all -> 0x00eb }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00eb }
        L_0x0059:
            r7.A01 = r0     // Catch:{ all -> 0x00eb }
            goto L_0x0085
        L_0x005c:
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r2 == 0) goto L_0x0083
            java.lang.String r1 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0083 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r1 == 0) goto L_0x0083
            android.os.Bundle r0 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r0 == 0) goto L_0x0083
            boolean r0 = r0.containsKey(r5)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r0 == 0) goto L_0x0083
            android.os.Bundle r0 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0083 }
            boolean r0 = r0.getBoolean(r5)     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0083 }
            goto L_0x0059
        L_0x0083:
            r0 = 0
            goto L_0x0059
        L_0x0085:
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r7.A02     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00c0
            X.0uv r5 = new X.0uv     // Catch:{ all -> 0x00eb }
            r5.<init>(r7)     // Catch:{ all -> 0x00eb }
            r7.A00 = r5     // Catch:{ all -> 0x00eb }
            X.0uT r4 = r7.A04     // Catch:{ all -> 0x00eb }
            java.lang.Class<X.0uw> r3 = X.C19400uw.class
            java.util.concurrent.Executor r2 = r4.A02     // Catch:{ all -> 0x00eb }
            monitor-enter(r4)     // Catch:{ all -> 0x00eb }
            X.AnonymousClass006.A01(r3)     // Catch:{ all -> 0x00bc }
            X.AnonymousClass006.A01(r5)     // Catch:{ all -> 0x00bc }
            X.AnonymousClass006.A01(r2)     // Catch:{ all -> 0x00bc }
            java.util.Map r1 = r4.A01     // Catch:{ all -> 0x00bc }
            boolean r0 = r1.containsKey(r3)     // Catch:{ all -> 0x00bc }
            if (r0 != 0) goto L_0x00b2
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x00bc }
            r0.<init>()     // Catch:{ all -> 0x00bc }
            r1.put(r3, r0)     // Catch:{ all -> 0x00bc }
        L_0x00b2:
            java.lang.Object r0 = r1.get(r3)     // Catch:{ all -> 0x00bc }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x00bc }
            r0.put(r5, r2)     // Catch:{ all -> 0x00bc }
            goto L_0x00bf
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00bf:
            monitor-exit(r4)     // Catch:{ all -> 0x00eb }
        L_0x00c0:
            r0 = 1
            r7.A03 = r0     // Catch:{ all -> 0x00eb }
        L_0x00c3:
            java.lang.Boolean r0 = r7.A01     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00cc
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x00ed }
            goto L_0x00e9
        L_0x00cc:
            boolean r0 = r7.A02     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00e8
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.A05     // Catch:{ all -> 0x00ed }
            X.0u7 r0 = r0.A01     // Catch:{ all -> 0x00ed }
            X.C18960u7.A02(r0)     // Catch:{ all -> 0x00ed }
            X.0ua r0 = r0.A03     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00ed }
            X.0ux r0 = (X.C19410ux) r0     // Catch:{ all -> 0x00ed }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A02     // Catch:{ all -> 0x00ed }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00ed }
            r1 = 1
            if (r0 != 0) goto L_0x00e9
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            monitor-exit(r6)
            return r1
        L_0x00eb:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19360uo.A00():boolean");
    }

    public C19360uo(C19160uT r1, FirebaseInstanceId firebaseInstanceId) {
        this.A05 = firebaseInstanceId;
        this.A04 = r1;
    }
}
