package X;

import java.lang.reflect.Method;

/* renamed from: X.0WC  reason: invalid class name */
public abstract class AnonymousClass0WC {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;
    public static final Method A06;
    public static final Method A07;

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    static {
        /*
            java.lang.String r2 = "add"
            android.os.Process.myUid()
            r4 = 1
            r5 = 0
            r3 = 0
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0015 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0015 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0015 }
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)     // Catch:{ Exception -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            A00 = r0
            r9 = 2
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x002a }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x002a }
            r1[r5] = r0     // Catch:{ Exception -> 0x002a }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r4] = r0     // Catch:{ Exception -> 0x002a }
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)     // Catch:{ Exception -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r0 = r3
        L_0x002b:
            A01 = r0
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "size"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0038 }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0039
        L_0x0038:
            r0 = r3
        L_0x0039:
            A02 = r0
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x004a }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004a }
            r2[r5] = r0     // Catch:{ Exception -> 0x004a }
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r0 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x004a }
            goto L_0x004b
        L_0x004a:
            r0 = r3
        L_0x004b:
            A03 = r0
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x005c }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x005c }
            r2[r5] = r0     // Catch:{ Exception -> 0x005c }
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r0 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x005c }
            goto L_0x005d
        L_0x005c:
            r0 = r3
        L_0x005d:
            A04 = r0
            int r7 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            r0 = 0
            if (r7 < r6) goto L_0x0067
            r0 = 1
        L_0x0067:
            java.lang.String r8 = "WorkSourceUtil"
            if (r0 == 0) goto L_0x007c
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "createWorkChain"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0076 }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x0076 }
            goto L_0x007d
        L_0x0076:
            r1 = move-exception
            java.lang.String r0 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r8, r0, r1)
        L_0x007c:
            r0 = r3
        L_0x007d:
            A05 = r0
            if (r7 < r6) goto L_0x009e
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0098 }
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0098 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0098 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0098 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r4] = r0     // Catch:{ Exception -> 0x0098 }
            java.lang.String r0 = "addNode"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r1)     // Catch:{ Exception -> 0x0098 }
            goto L_0x009f
        L_0x0098:
            r1 = move-exception
            java.lang.String r0 = "Missing WorkChain class"
            android.util.Log.w(r8, r0, r1)
        L_0x009e:
            r0 = r3
        L_0x009f:
            A06 = r0
            if (r7 < r6) goto L_0x00b0
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x00b0 }
            java.lang.reflect.Method r3 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x00b0 }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x00b0 }
        L_0x00b0:
            A07 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WC.<clinit>():void");
    }
}
