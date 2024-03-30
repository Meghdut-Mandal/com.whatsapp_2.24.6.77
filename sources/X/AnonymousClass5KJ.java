package X;

/* renamed from: X.5KJ  reason: invalid class name */
public class AnonymousClass5KJ extends C1495371p {
    public final AnonymousClass6FI A00;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r2 == X.C023109s.A0C) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IInterface A00() {
        /*
            r14 = this;
            X.6FI r6 = r14.A00
            r12 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r4 = "GoogleMigrateClient"
            if (r6 != r6) goto L_0x0285
            monitor-enter(r6)
            X.6ZI r0 = r6.A01     // Catch:{ all -> 0x0282 }
            r8 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0029
            android.content.Context r5 = r6.A03     // Catch:{ all -> 0x0282 }
            X.0wN r3 = r6.A04     // Catch:{ all -> 0x0282 }
            X.5mt r2 = new X.5mt     // Catch:{ all -> 0x0282 }
            r2.<init>(r6)     // Catch:{ all -> 0x0282 }
            X.5mu r1 = new X.5mu     // Catch:{ all -> 0x0282 }
            r1.<init>(r6)     // Catch:{ all -> 0x0282 }
            X.6ZI r0 = new X.6ZI     // Catch:{ all -> 0x0282 }
            r0.<init>(r5, r3, r2, r1)     // Catch:{ all -> 0x0282 }
            r6.A01 = r0     // Catch:{ all -> 0x0282 }
        L_0x0024:
            X.6ZI r9 = r6.A01     // Catch:{ all -> 0x0282 }
            if (r8 == 0) goto L_0x0113
            goto L_0x0067
        L_0x0029:
            java.lang.Object r3 = r0.A05     // Catch:{ all -> 0x0282 }
            monitor-enter(r3)     // Catch:{ all -> 0x0282 }
            java.lang.Integer r2 = r0.A01     // Catch:{ all -> 0x01b6 }
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x01b6 }
            if (r2 == r0) goto L_0x0037
            java.lang.Integer r1 = X.C023109s.A0C     // Catch:{ all -> 0x01b6 }
            r0 = 0
            if (r2 != r1) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x01b6 }
            if (r0 != 0) goto L_0x0065
            X.6ZI r0 = r6.A01     // Catch:{ all -> 0x0282 }
            r0.A01(r7)     // Catch:{ all -> 0x0282 }
            android.content.Context r5 = r6.A03     // Catch:{ all -> 0x0282 }
            X.0wN r3 = r6.A04     // Catch:{ all -> 0x0282 }
            X.5mt r2 = new X.5mt     // Catch:{ all -> 0x0282 }
            r2.<init>(r6)     // Catch:{ all -> 0x0282 }
            X.5mu r1 = new X.5mu     // Catch:{ all -> 0x0282 }
            r1.<init>(r6)     // Catch:{ all -> 0x0282 }
            X.6ZI r0 = new X.6ZI     // Catch:{ all -> 0x0282 }
            r0.<init>(r5, r3, r2, r1)     // Catch:{ all -> 0x0282 }
            r6.A01 = r0     // Catch:{ all -> 0x0282 }
            java.lang.String r2 = "svc-client-inconsistent-connection"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "name="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x0282 }
            r3.A0E(r2, r0, r7)     // Catch:{ all -> 0x0282 }
            goto L_0x0024
        L_0x0065:
            r8 = 0
            goto L_0x0024
        L_0x0067:
            java.lang.String r1 = r6.A02     // Catch:{ all -> 0x0109 }
            if (r1 != 0) goto L_0x0083
            java.lang.String r1 = "com.google.android.apps.restore"
            boolean r0 = r6.A05(r1)     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x0081
            java.lang.String r1 = "com.google.android.apps.pixelmigrate"
            boolean r0 = r6.A05(r1)     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x0081
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ all -> 0x0109 }
            r0.<init>()     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0081:
            r6.A02 = r1     // Catch:{ all -> 0x0109 }
        L_0x0083:
            android.content.Intent r10 = X.C36431kI.A0D()     // Catch:{ NameNotFoundException -> 0x010b }
            r10.setPackage(r1)     // Catch:{ NameNotFoundException -> 0x010b }
            java.lang.String r0 = "com.google.android.apps.pixelmigrate.IOS_APP_DATA_READER_SERVICE"
            r10.setAction(r0)     // Catch:{ NameNotFoundException -> 0x010b }
            r5 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "svc-connection/start-connect; service="
            java.lang.String r3 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x0282 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", intent="
            X.C36321k7.A1K(r10, r0, r1)     // Catch:{ all -> 0x0282 }
            java.lang.Object r2 = r9.A05     // Catch:{ all -> 0x0282 }
            monitor-enter(r2)     // Catch:{ all -> 0x0282 }
            java.lang.Integer r8 = r9.A01     // Catch:{ all -> 0x0105 }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x0105 }
            if (r8 != r0) goto L_0x00dc
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x0105 }
            r9.A01 = r0     // Catch:{ all -> 0x0105 }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0v(r3)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = " -> state="
            r8.append(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "CONNECTING"
            X.C36321k7.A1a(r8, r0)     // Catch:{ all -> 0x0105 }
            monitor-exit(r2)     // Catch:{ all -> 0x0105 }
            android.content.Context r8 = r9.A03     // Catch:{ all -> 0x0282 }
            boolean r0 = r8.bindService(r10, r9, r5)     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x0113
            monitor-enter(r2)     // Catch:{ all -> 0x0282 }
            java.lang.Integer r0 = X.C023109s.A0G     // Catch:{ all -> 0x00d8 }
            r9.A01 = r0     // Catch:{ all -> 0x00d8 }
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r3, r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "CLOSED"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d8 }
            goto L_0x01b9
        L_0x00d8:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d8 }
            goto L_0x0202
        L_0x00dc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = ", cannot start from state="
            r1.append(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = X.C111585cW.A00(r8)     // Catch:{ all -> 0x0105 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x0105 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "Cannot start connection from state: "
            r1.append(r0)     // Catch:{ all -> 0x0105 }
            java.lang.Integer r0 = r9.A01     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = X.C111585cW.A00(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0105 }
            X.5VG r0 = new X.5VG     // Catch:{ all -> 0x0105 }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0105 }
            throw r0     // Catch:{ all -> 0x0105 }
        L_0x0105:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0105 }
            goto L_0x0202
        L_0x0109:
            r0 = move-exception
            throw r0     // Catch:{ NameNotFoundException -> 0x010b }
        L_0x010b:
            r0 = move-exception
            X.5VG r1 = new X.5VG     // Catch:{ all -> 0x0282 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0282 }
            goto L_0x0202
        L_0x0113:
            monitor-exit(r6)     // Catch:{ all -> 0x0282 }
            boolean r0 = X.C224714l.A02()
            r1 = r0 ^ 1
            java.lang.String r0 = "Cannot be called from main thread, will deadlock."
            X.C18740tg.A0F(r1, r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r7 = "svc-connection/await-binder; service="
            java.lang.String r8 = X.AnonymousClass000.A0p(r7, r4, r0)
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 + r12
            java.lang.Object r2 = r9.A05
            monitor-enter(r2)
        L_0x0131:
            java.lang.Integer r3 = r9.A01     // Catch:{ all -> 0x01b3 }
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ all -> 0x01b3 }
            if (r3 != r0) goto L_0x013d
            android.os.IInterface r0 = r9.A00     // Catch:{ all -> 0x01b3 }
            if (r0 == 0) goto L_0x0152
            monitor-exit(r2)     // Catch:{ all -> 0x01b3 }
            goto L_0x0151
        L_0x013d:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x01b3 }
            if (r3 != r0) goto L_0x0163
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01b3 }
            long r0 = r10 - r5
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x018c
            r2.wait(r0)     // Catch:{ all -> 0x01b3 }
            goto L_0x0131
        L_0x0151:
            return r0
        L_0x0152:
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r7, r4)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = ", null binder"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "Unexpected failure. Connected with null binder."
            X.5VG r1 = new X.5VG     // Catch:{ all -> 0x01b3 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b2
        L_0x0163:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = ", not in CONNECTING state; state="
            r1.append(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = X.C111585cW.A00(r3)     // Catch:{ all -> 0x01b3 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x01b3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "Cannot wait for binder from state: "
            r1.append(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.Integer r0 = r9.A01     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = X.C111585cW.A00(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x01b3 }
            X.5VG r1 = new X.5VG     // Catch:{ all -> 0x01b3 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b2
        L_0x018c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = ", timed out when in state="
            r1.append(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "CONNECTING"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x01b3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "Timed out. Connection state: "
            r1.append(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.Integer r0 = r9.A01     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = X.C111585cW.A00(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x01b3 }
            X.5VG r1 = new X.5VG     // Catch:{ all -> 0x01b3 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x01b3 }
        L_0x01b2:
            throw r1     // Catch:{ all -> 0x01b3 }
        L_0x01b3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01b3 }
            throw r0
        L_0x01b6:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b6 }
            goto L_0x0202
        L_0x01b9:
            android.content.ComponentName r9 = r10.getComponent()     // Catch:{ all -> 0x0282 }
            if (r9 != 0) goto L_0x022c
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ all -> 0x0282 }
            java.util.List r2 = r0.queryIntentServices(r10, r7)     // Catch:{ all -> 0x0282 }
            int r0 = r2.size()     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x0203
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "No services found for "
            r1.append(r0)     // Catch:{ all -> 0x0282 }
            r1.append(r10)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ". Did you update AndroidManifest/queries to enable package visibility for target service?"
            r1.append(r0)     // Catch:{ all -> 0x0282 }
        L_0x01de:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0282 }
        L_0x01e2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", failed to bind; "
            X.C36321k7.A1R(r0, r2, r1)     // Catch:{ all -> 0x0282 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "Failed to bind to "
            r1.append(r0)     // Catch:{ all -> 0x0282 }
            r1.append(r4)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ all -> 0x0282 }
            X.5VG r1 = new X.5VG     // Catch:{ all -> 0x0282 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0282 }
        L_0x0202:
            throw r1     // Catch:{ all -> 0x0282 }
        L_0x0203:
            int r0 = r2.size()     // Catch:{ all -> 0x0282 }
            if (r0 <= r5) goto L_0x021b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "Multiple services ("
            X.C36371kC.A1R(r0, r1, r2)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ") found for "
            r1.append(r0)     // Catch:{ all -> 0x0282 }
            r1.append(r10)     // Catch:{ all -> 0x0282 }
            goto L_0x01de
        L_0x021b:
            java.lang.Object r0 = r2.get(r7)     // Catch:{ all -> 0x0282 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ all -> 0x0282 }
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch:{ all -> 0x0282 }
            java.lang.String r1 = r0.packageName     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x0282 }
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ all -> 0x0282 }
            r9.<init>(r1, r0)     // Catch:{ all -> 0x0282 }
        L_0x022c:
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch:{ all -> 0x0282 }
            java.lang.String r8 = r9.getPackageName()     // Catch:{ all -> 0x0282 }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x026b }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x026b }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x026b }
            if (r0 != 0) goto L_0x024b
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x026b }
            java.lang.String r1 = "Package %s is disabled."
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ NameNotFoundException -> 0x026b }
            r0[r7] = r8     // Catch:{ NameNotFoundException -> 0x026b }
            java.lang.String r2 = java.lang.String.format(r2, r1, r0)     // Catch:{ NameNotFoundException -> 0x026b }
            goto L_0x01e2
        L_0x024b:
            android.content.pm.ServiceInfo r0 = r1.getServiceInfo(r9, r7)     // Catch:{ NameNotFoundException -> 0x0274 }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0274 }
            if (r0 != 0) goto L_0x0260
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x0274 }
            java.lang.String r1 = "Service %s is disabled."
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ NameNotFoundException -> 0x0274 }
            r0[r7] = r9     // Catch:{ NameNotFoundException -> 0x0274 }
            java.lang.String r2 = java.lang.String.format(r2, r1, r0)     // Catch:{ NameNotFoundException -> 0x0274 }
            goto L_0x01e2
        L_0x0260:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0282 }
            java.lang.Object[] r1 = X.C36411kG.A1b(r8)     // Catch:{ all -> 0x0282 }
            r1[r5] = r9     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "Package %s is present and enabled; service %s is present and enabled."
            goto L_0x027c
        L_0x026b:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0282 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0282 }
            r1[r7] = r8     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "Package %s is not present."
            goto L_0x027c
        L_0x0274:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0282 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0282 }
            r1[r7] = r9     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "Service %s is not present."
        L_0x027c:
            java.lang.String r2 = java.lang.String.format(r2, r0, r1)     // Catch:{ all -> 0x0282 }
            goto L_0x01e2
        L_0x0282:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0282 }
            throw r0
        L_0x0285:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "A session from a different client has been provided. Client: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5KJ.A00():android.os.IInterface");
    }

    public AnonymousClass5KJ(AnonymousClass6FI r1) {
        super(r1);
        this.A00 = r1;
    }
}
