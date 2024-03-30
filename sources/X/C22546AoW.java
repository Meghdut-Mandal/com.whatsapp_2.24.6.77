package X;

import java.util.Set;

/* renamed from: X.AoW  reason: case insensitive filesystem */
public final class C22546AoW extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ Set $splitPairFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22546AoW(Set set) {
        super(2);
        this.$splitPairFilters = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r3.A01(r9.getComponentName(), r4.A01) == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            android.app.Activity r8 = (android.app.Activity) r8
            android.app.Activity r9 = (android.app.Activity) r9
            X.C36321k7.A0w(r8, r9)
            java.util.Set r1 = r7.$splitPairFilters
            boolean r0 = r1 instanceof java.util.Collection
            r6 = 0
            if (r0 == 0) goto L_0x0019
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0019
        L_0x0014:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L_0x0019:
            java.util.Iterator r5 = r1.iterator()
        L_0x001d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r4 = r5.next()
            X.9VJ r4 = (X.AnonymousClass9VJ) r4
            X.6Sb r3 = X.C132086Sb.A00
            android.content.ComponentName r0 = r8.getComponentName()
            android.content.ComponentName r2 = r4.A00
            boolean r0 = r3.A01(r0, r2)
            if (r0 == 0) goto L_0x0044
            android.content.ComponentName r1 = r9.getComponentName()
            android.content.ComponentName r0 = r4.A01
            boolean r0 = r3.A01(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            android.content.Intent r0 = r9.getIntent()
            if (r0 == 0) goto L_0x006b
            if (r1 == 0) goto L_0x001d
            android.content.Intent r1 = r9.getIntent()
            X.AnonymousClass00C.A08(r1)
            android.content.ComponentName r0 = r8.getComponentName()
            boolean r0 = r3.A01(r0, r2)
            if (r0 == 0) goto L_0x001d
            android.content.ComponentName r1 = r1.getComponent()
            android.content.ComponentName r0 = r4.A01
            boolean r0 = r3.A01(r1, r0)
            if (r0 != 0) goto L_0x006d
            goto L_0x001d
        L_0x006b:
            if (r1 == 0) goto L_0x001d
        L_0x006d:
            r6 = 1
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22546AoW.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
