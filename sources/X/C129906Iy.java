package X;

/* renamed from: X.6Iy  reason: invalid class name and case insensitive filesystem */
public abstract class C129906Iy {
    public static C109345Xf A00;
    public static final AnonymousClass0GE A01 = new AnonymousClass0GE();
    public static final Object A02 = C36441kJ.A11();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r11 <= 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r21 <= 0) goto L_0x005f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0129 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r22, boolean r23) {
        /*
            if (r23 != 0) goto L_0x0007
            X.5Xf r0 = A00
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r13 = A02
            monitor-enter(r13)
            if (r23 != 0) goto L_0x0012
            X.5Xf r0 = A00     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x0012
            goto L_0x015c
        L_0x0012:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x015e }
            r0 = 28
            r3 = 0
            if (r1 < r0) goto L_0x0143
            r0 = 30
            if (r1 == r0) goto L_0x0143
            java.lang.String r1 = "/data/misc/profiles/ref/"
            r6 = r22
            java.lang.String r0 = r6.getPackageName()     // Catch:{ all -> 0x015e }
            java.io.File r0 = X.C90524aI.A0T(r1, r0)     // Catch:{ all -> 0x015e }
            java.lang.String r7 = "primary.prof"
            java.io.File r0 = X.C36441kJ.A0w(r0, r7)     // Catch:{ all -> 0x015e }
            long r11 = r0.length()     // Catch:{ all -> 0x015e }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x015e }
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0041
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r10 = 1
            if (r0 > 0) goto L_0x0042
        L_0x0041:
            r10 = 0
        L_0x0042:
            java.lang.String r1 = "/data/misc/profiles/cur/0/"
            java.lang.String r0 = r6.getPackageName()     // Catch:{ all -> 0x015e }
            java.io.File r0 = X.C90524aI.A0T(r1, r0)     // Catch:{ all -> 0x015e }
            java.io.File r0 = X.C36441kJ.A0w(r0, r7)     // Catch:{ all -> 0x015e }
            long r21 = r0.length()     // Catch:{ all -> 0x015e }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x005f
            int r0 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            r9 = 1
            if (r0 > 0) goto L_0x0060
        L_0x005f:
            r9 = 0
        L_0x0060:
            android.content.Context r0 = r6.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0136 }
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0136 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0136 }
            r0 = 33
            if (r1 < r0) goto L_0x0075
            android.content.pm.PackageInfo r0 = X.C109335Xe.A00(r6, r4)     // Catch:{ NameNotFoundException -> 0x0136 }
        L_0x0072:
            long r4 = r0.lastUpdateTime     // Catch:{ NameNotFoundException -> 0x0136 }
            goto L_0x007e
        L_0x0075:
            java.lang.String r0 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x0136 }
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x0136 }
            goto L_0x0072
        L_0x007e:
            java.io.File r1 = r6.getFilesDir()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "profileInstalled"
            java.io.File r8 = X.C36441kJ.A0w(r1, r0)     // Catch:{ all -> 0x015e }
            r14 = 0
            boolean r0 = r8.exists()     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x00bb
            java.io.FileInputStream r1 = X.C90524aI.A0U(r8)     // Catch:{ IOException -> 0x0150 }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0150 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0150 }
            int r15 = r0.readInt()     // Catch:{ all -> 0x00b1 }
            int r16 = r0.readInt()     // Catch:{ all -> 0x00b1 }
            long r17 = r0.readLong()     // Catch:{ all -> 0x00b1 }
            long r19 = r0.readLong()     // Catch:{ all -> 0x00b1 }
            X.676 r14 = new X.676     // Catch:{ all -> 0x00b1 }
            r14.<init>(r15, r16, r17, r19)     // Catch:{ all -> 0x00b1 }
            r0.close()     // Catch:{ IOException -> 0x0150 }
            goto L_0x00bb
        L_0x00b1:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0150 }
        L_0x00ba:
            throw r1     // Catch:{ IOException -> 0x0150 }
        L_0x00bb:
            r7 = 2
            if (r14 == 0) goto L_0x00c9
            long r0 = r14.A03     // Catch:{ all -> 0x015e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00c9
            int r0 = r14.A01     // Catch:{ all -> 0x015e }
            if (r0 == r7) goto L_0x00c9
            goto L_0x00d1
        L_0x00c9:
            if (r10 == 0) goto L_0x00cd
            r3 = 1
            goto L_0x00d2
        L_0x00cd:
            if (r9 == 0) goto L_0x00d2
            r3 = 2
            goto L_0x00d2
        L_0x00d1:
            r3 = r0
        L_0x00d2:
            if (r23 == 0) goto L_0x00d9
            if (r9 == 0) goto L_0x00d9
            if (r3 == r2) goto L_0x00d9
            r3 = 2
        L_0x00d9:
            if (r14 == 0) goto L_0x00e8
            int r0 = r14.A01     // Catch:{ all -> 0x015e }
            if (r0 != r7) goto L_0x00e8
            if (r3 != r2) goto L_0x00e8
            long r0 = r14.A02     // Catch:{ all -> 0x015e }
            int r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x00e8
            r3 = 3
        L_0x00e8:
            X.676 r6 = new X.676     // Catch:{ all -> 0x015e }
            r17 = 1
            r16 = r6
            r18 = r3
            r19 = r4
            r16.<init>(r17, r18, r19, r21)     // Catch:{ all -> 0x015e }
            if (r14 == 0) goto L_0x00fd
            boolean r0 = r14.equals(r6)     // Catch:{ all -> 0x015e }
            if (r0 != 0) goto L_0x0129
        L_0x00fd:
            r8.delete()     // Catch:{ IOException -> 0x0129 }
            java.io.FileOutputStream r0 = X.C90524aI.A0W(r8)     // Catch:{ IOException -> 0x0129 }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0129 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0129 }
            r3.writeInt(r2)     // Catch:{ all -> 0x011f }
            int r0 = r6.A01     // Catch:{ all -> 0x011f }
            r3.writeInt(r0)     // Catch:{ all -> 0x011f }
            long r0 = r6.A03     // Catch:{ all -> 0x011f }
            r3.writeLong(r0)     // Catch:{ all -> 0x011f }
            long r0 = r6.A02     // Catch:{ all -> 0x011f }
            r3.writeLong(r0)     // Catch:{ all -> 0x011f }
            r3.close()     // Catch:{ IOException -> 0x0129 }
            goto L_0x0129
        L_0x011f:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0124 }
            goto L_0x0128
        L_0x0124:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0129 }
        L_0x0128:
            throw r1     // Catch:{ IOException -> 0x0129 }
        L_0x0129:
            X.5Xf r1 = new X.5Xf     // Catch:{ all -> 0x015e }
            r1.<init>()     // Catch:{ all -> 0x015e }
            A00 = r1     // Catch:{ all -> 0x015e }
            X.0GE r0 = A01     // Catch:{ all -> 0x015e }
            r0.A06(r1)     // Catch:{ all -> 0x015e }
            goto L_0x015c
        L_0x0136:
            X.5Xf r1 = new X.5Xf     // Catch:{ all -> 0x015e }
            r1.<init>()     // Catch:{ all -> 0x015e }
            A00 = r1     // Catch:{ all -> 0x015e }
            X.0GE r0 = A01     // Catch:{ all -> 0x015e }
            r0.A06(r1)     // Catch:{ all -> 0x015e }
            goto L_0x015c
        L_0x0143:
            X.5Xf r1 = new X.5Xf     // Catch:{ all -> 0x015e }
            r1.<init>()     // Catch:{ all -> 0x015e }
            A00 = r1     // Catch:{ all -> 0x015e }
            X.0GE r0 = A01     // Catch:{ all -> 0x015e }
            r0.A06(r1)     // Catch:{ all -> 0x015e }
            goto L_0x015c
        L_0x0150:
            X.5Xf r1 = new X.5Xf     // Catch:{ all -> 0x015e }
            r1.<init>()     // Catch:{ all -> 0x015e }
            A00 = r1     // Catch:{ all -> 0x015e }
            X.0GE r0 = A01     // Catch:{ all -> 0x015e }
            r0.A06(r1)     // Catch:{ all -> 0x015e }
        L_0x015c:
            monitor-exit(r13)     // Catch:{ all -> 0x015e }
            return
        L_0x015e:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x015e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129906Iy.A00(android.content.Context, boolean):void");
    }
}
