package X;

public class BAU implements AnonymousClass004 {
    public Object A00;
    public Object A01;
    public final int A02;

    public BAU(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        r2 = r2 - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r3 < 0.0f) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r3 > 1.0f) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        r3 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r2 = r2 * (1.0f - X.C36441kJ.A03(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        return java.lang.Float.valueOf(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x008e;
                case 2: goto L_0x00a3;
                case 3: goto L_0x0072;
                case 4: goto L_0x0023;
                case 5: goto L_0x004a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r8.A01
            X.AZ4 r1 = (X.AZ4) r1
            int r0 = r0.getWidth()
            float r2 = (float) r0
            java.lang.Object r0 = r1.get()
        L_0x0016:
            float r1 = X.C36441kJ.A03(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r2 = r2 * r0
        L_0x001e:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            return r0
        L_0x0023:
            java.lang.Object r2 = r8.A00
            X.8Xi r2 = (X.C174518Xi) r2
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getHeight()
            float r1 = (float) r0
            X.AZ4 r0 = r2.A09
            float r3 = X.AZ4.A00(r0)
            float r3 = r3 / r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0044
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0044
        L_0x0042:
            float r2 = r2 - r3
            goto L_0x001e
        L_0x0044:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006f
        L_0x0048:
            r3 = 0
            goto L_0x0042
        L_0x004a:
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r8.A01
            X.AZ4 r1 = (X.AZ4) r1
            int r0 = r0.getHeight()
            float r4 = (float) r0
            float r3 = X.AZ4.A00(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            float r3 = r3 / r4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0048
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0042
        L_0x006f:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0042
        L_0x0072:
            java.lang.Object r0 = r8.A00
            X.8Xi r0 = (X.C174518Xi) r0
            java.lang.Object r2 = r8.A01
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r1 = r0.A02
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r2.getHeight()
            float r2 = (float) r0
            float r1 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            float r2 = r2 - r1
            goto L_0x001e
        L_0x008e:
            java.lang.Object r1 = r8.A00
            X.8Xi r1 = (X.C174518Xi) r1
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getWidth()
            float r2 = (float) r0
            X.AZ4 r0 = r1.A0D
            java.lang.Object r0 = r0.get()
            goto L_0x0016
        L_0x00a3:
            java.lang.Object r0 = r8.A00
            X.8Xi r0 = (X.C174518Xi) r0
            java.lang.Object r2 = r8.A01
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r1 = r0.A02
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            int r0 = r2.getTop()
            float r0 = (float) r0
            float r1 = r1 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            return r0
        L_0x00c0:
            r7 = r8
            java.lang.Object r0 = r8.A00
            if (r0 != 0) goto L_0x019c
            r1 = 0
            monitor-enter(r7)
            java.lang.Object r0 = r8.A00     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x012e
            java.lang.Object r0 = r8.A01     // Catch:{ all -> 0x0199 }
            X.9j2 r0 = (X.C201189j2) r0     // Catch:{ all -> 0x0199 }
            java.lang.String r1 = "linkedapp_app_identity"
            X.004 r0 = r0.A03     // Catch:{ all -> 0x0199 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0199 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0199 }
            java.io.File r5 = X.C36441kJ.A0w(r0, r1)     // Catch:{ all -> 0x0199 }
            java.io.File r6 = r5.getParentFile()     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "expecting a file which is always under some dir"
            if (r6 == 0) goto L_0x0129
            boolean r0 = r6.exists()     // Catch:{ all -> 0x0199 }
            r4 = 0
            r3 = 1
            java.lang.String r2 = "LightSharedPreferencesFactory"
            if (r0 == 0) goto L_0x0105
            boolean r0 = r6.isDirectory()     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x0102
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0199 }
            r1[r4] = r0     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "Failed to create directory %s. It is an existing *file*."
            X.AnonymousClass6YR.A0G(r2, r0, r1)     // Catch:{ all -> 0x0199 }
        L_0x0102:
            r8.A00 = r5     // Catch:{ all -> 0x0199 }
            goto L_0x0127
        L_0x0105:
            boolean r0 = r6.mkdirs()     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x0102
            boolean r0 = r6.exists()     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x0102
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0199 }
            r1[r4] = r0     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x0199 }
            r1[r3] = r0     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "Failed to create directory %s for %s"
            X.AnonymousClass6YR.A0F(r2, r0, r1)     // Catch:{ all -> 0x0199 }
            goto L_0x0102
        L_0x0127:
            r1 = 1
            goto L_0x012e
        L_0x0129:
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ all -> 0x0199 }
            throw r0     // Catch:{ all -> 0x0199 }
        L_0x012e:
            monitor-exit(r7)     // Catch:{ all -> 0x0199 }
            if (r1 == 0) goto L_0x019c
            java.lang.Object r5 = r8.A01
            X.9j2 r5 = (X.C201189j2) r5
            java.lang.String r4 = "linkedapp_app_identity"
            java.lang.String r2 = X.C113675fv.A00()
            if (r2 == 0) goto L_0x0150
            java.lang.String r1 = ":"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0150
            java.lang.String[] r1 = r2.split(r1)
            r0 = 1
            r3 = r1[r0]
        L_0x014c:
            java.util.Map r2 = r5.A00
            monitor-enter(r2)
            goto L_0x0152
        L_0x0150:
            r3 = 0
            goto L_0x014c
        L_0x0152:
            boolean r0 = r2.containsKey(r4)     // Catch:{ all -> 0x0196 }
            if (r0 != 0) goto L_0x015b
            if (r3 == 0) goto L_0x0194
            goto L_0x015e
        L_0x015b:
            if (r3 == 0) goto L_0x0194
            goto L_0x0178
        L_0x015e:
            java.util.Set r0 = r5.A01     // Catch:{ all -> 0x0196 }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x0178
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x0196 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0196 }
            java.lang.String r1 = r0.getPath()     // Catch:{ all -> 0x0196 }
            X.7uv r0 = new X.7uv     // Catch:{ all -> 0x0196 }
            r0.<init>(r5, r1, r8)     // Catch:{ all -> 0x0196 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0196 }
        L_0x0178:
            java.util.Set r0 = r5.A01     // Catch:{ all -> 0x0196 }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x0194
            java.util.Iterator r1 = X.AnonymousClass000.A0y(r2)     // Catch:{ all -> 0x0196 }
        L_0x0184:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x0194
            java.lang.Object r0 = X.C36351kA.A0u(r1)     // Catch:{ all -> 0x0196 }
            android.os.FileObserver r0 = (android.os.FileObserver) r0     // Catch:{ all -> 0x0196 }
            r0.startWatching()     // Catch:{ all -> 0x0196 }
            goto L_0x0184
        L_0x0194:
            monitor-exit(r2)     // Catch:{ all -> 0x0196 }
            goto L_0x019c
        L_0x0196:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0196 }
            throw r0
        L_0x0199:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0199 }
            throw r0
        L_0x019c:
            java.lang.Object r0 = r8.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAU.get():java.lang.Object");
    }

    public BAU(C201189j2 r2) {
        this.A02 = 0;
        this.A01 = r2;
        this.A00 = null;
    }
}
