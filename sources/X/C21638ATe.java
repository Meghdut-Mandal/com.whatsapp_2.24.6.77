package X;

/* renamed from: X.ATe  reason: case insensitive filesystem */
public final class C21638ATe implements B0B {
    public final B47 A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean B1C(X.C193229Kn r6, X.C16540pP r7, X.C87374On r8) {
        /*
            r5 = this;
            X.B47 r0 = r5.A00
            X.AT7 r0 = (X.AT7) r0
            android.content.Context r0 = r0.A00
            android.content.pm.PackageManager r4 = r0.getPackageManager()
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.facebook.GET_PHONE_ID"
            r1.setAction(r0)
            r0 = 128(0x80, float:1.794E-43)
            java.util.List r0 = r4.queryBroadcastReceivers(r1, r0)
            X.AnonymousClass00C.A08(r0)
            java.lang.String r3 = "com.facebook.katana"
            java.util.Iterator r1 = r0.iterator()
        L_0x0022:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r1.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.taskAffinity
            if (r0 == 0) goto L_0x0022
            boolean r0 = X.AnonymousClass099.A0O(r0, r3, r2)
            if (r0 == 0) goto L_0x0022
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x0045 }
            int r2 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r1 = move-exception
            java.lang.String r0 = "FacebookAppInfoHelper/getFacebookAppInfo/ failed to retrieve version code for FB app"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004b:
            r1 = r2
            r2 = 1
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            X.9Vw r0 = new X.9Vw
            r0.<init>(r2, r1)
            boolean r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21638ATe.B1C(X.9Kn, X.0pP, X.4On):boolean");
    }

    public C21638ATe(B47 b47) {
        this.A00 = b47;
    }
}
