package X;

import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.62X  reason: invalid class name */
public final class AnonymousClass62X {
    public final PackageManager A00;
    public final C20760y7 A01;
    public final AnonymousClass8Hi A02;

    public AnonymousClass62X(PackageManager packageManager, AnonymousClass8Hi r3, Set set) {
        this.A00 = packageManager;
        this.A01 = C20760y7.copyOf((Collection) set);
        this.A02 = AnonymousClass8Hi.copyOf(r3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r2 = r8.getAuthority()
            if (r2 == 0) goto L_0x011b
            android.content.pm.PackageManager r4 = r7.A00
            if (r4 == 0) goto L_0x010b
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r0 = 0
            if (r3 < r1) goto L_0x0013
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0013:
            android.content.pm.ProviderInfo r0 = r4.resolveContentProvider(r2, r0)
            if (r0 == 0) goto L_0x010b
            java.lang.String r6 = r0.packageName
            if (r6 == 0) goto L_0x00fb
            r0 = 64
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x00e3 }
            if (r0 == 0) goto L_0x00e3
            android.content.pm.Signature[] r1 = r0.signatures
            if (r1 == 0) goto L_0x00e3
            int r0 = r1.length
            if (r0 == 0) goto L_0x00e3
            X.0y7 r4 = X.C20760y7.copyOf((java.lang.Object[]) r1)
            if (r4 == 0) goto L_0x00e3
            X.8Hi r0 = r7.A02
            X.0y7 r3 = r0.get(r6)
            X.14x r2 = r4.iterator()
        L_0x003c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r1 = r2.next()
            X.0y7 r0 = r7.A01
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0054
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x003c
        L_0x0054:
            return
        L_0x0055:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Untrusted provider package "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r0 = " ["
            r5.append(r0)
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r4.iterator()
        L_0x006e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r4.next()
            android.content.pm.Signature r0 = (android.content.pm.Signature) r0
            byte[] r3 = r0.toByteArray()
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            r1 = 0
            int r0 = r3.length     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            r2.update(r3, r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            byte[] r0 = r2.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            java.lang.String r0 = X.C90504aG.A0o(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            r6.add(r0)
            goto L_0x006e
        L_0x0095:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x009b:
            java.lang.String r4 = ", "
            java.util.Objects.requireNonNull(r4)
            java.util.Iterator r3 = r6.iterator()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.util.Objects.requireNonNull(r2)     // Catch:{ IOException -> 0x00dd }
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00dd }
            if (r0 == 0) goto L_0x00d0
        L_0x00b1:
            java.lang.Object r1 = r3.next()     // Catch:{ IOException -> 0x00dd }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IOException -> 0x00dd }
            boolean r0 = r1 instanceof java.lang.CharSequence     // Catch:{ IOException -> 0x00dd }
            if (r0 == 0) goto L_0x00cb
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ IOException -> 0x00dd }
        L_0x00be:
            r2.append(r1)     // Catch:{ IOException -> 0x00dd }
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00dd }
            if (r0 == 0) goto L_0x00d0
            r2.append(r4)     // Catch:{ IOException -> 0x00dd }
            goto L_0x00b1
        L_0x00cb:
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00dd }
            goto L_0x00be
        L_0x00d0:
            X.C36351kA.A1K(r2, r5)
            java.lang.String r1 = X.C90474aD.A0g(r5)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x00e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No signature for package "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " resolving authority "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00fb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No package name for authority "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x010b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No provider for authority "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x011b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No authority in URI "
            java.lang.String r1 = X.AnonymousClass000.A0l(r8, r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass62X.A00(android.net.Uri):void");
    }
}
