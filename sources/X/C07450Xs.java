package X;

import java.util.Arrays;

/* renamed from: X.0Xs  reason: invalid class name and case insensitive filesystem */
public abstract class C07450Xs {
    public static final AnonymousClass0QW A00;
    public static final AnonymousClass0QW A01;
    public static final AnonymousClass0QW A02 = new AnonymousClass0QW();
    public static final Class A03;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037 A[Catch:{ all -> 0x004e }] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessage"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0007 }
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            A03 = r0
            r4 = 0
            r5 = 0
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x002b
            r2 = 1
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ all -> 0x002b }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x002b }
            r1[r4] = r0     // Catch:{ all -> 0x002b }
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch:{ all -> 0x002b }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x002b }
            X.AnonymousClass000.A1N(r0, r4, r4)     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x002b }
            X.0QW r0 = (X.AnonymousClass0QW) r0     // Catch:{ all -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r0 = r5
        L_0x002c:
            A00 = r0
            r4 = 1
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x004e
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x004e }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x004e }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x004e }
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch:{ all -> 0x004e }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x004e }
            X.AnonymousClass000.A1N(r0, r2, r4)     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x004e }
            X.0QW r0 = (X.AnonymousClass0QW) r0     // Catch:{ all -> 0x004e }
            goto L_0x004f
        L_0x004e:
            r0 = r5
        L_0x004f:
            A01 = r0
            X.0QW r0 = new X.0QW
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07450Xs.<clinit>():void");
    }

    public static void A00(Object obj, Object obj2) {
        AnonymousClass0M8 r9 = (AnonymousClass0M8) obj;
        AnonymousClass0YB r7 = r9.zzc;
        AnonymousClass0YB r8 = ((AnonymousClass0M8) obj2).zzc;
        if (!r8.equals(AnonymousClass0YB.A04)) {
            int i = r7.A00 + r8.A00;
            int[] copyOf = Arrays.copyOf(r7.A02, i);
            System.arraycopy(r8.A02, 0, copyOf, r7.A00, r8.A00);
            Object[] copyOf2 = Arrays.copyOf(r7.A03, i);
            System.arraycopy(r8.A03, 0, copyOf2, r7.A00, r8.A00);
            r7 = new AnonymousClass0YB(i, copyOf, copyOf2, true);
        }
        r9.zzc = r7;
    }
}
