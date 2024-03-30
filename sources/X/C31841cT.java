package X;

/* renamed from: X.1cT  reason: invalid class name and case insensitive filesystem */
public class C31841cT {
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C206759tv A00(X.C203399nx r10) {
        /*
            r5 = 0
            if (r10 == 0) goto L_0x0064
            java.lang.String r0 = "id"
            X.9nx r4 = r10.A0c(r0)
            java.lang.String r0 = "request_image_url"
            X.9nx r3 = r10.A0c(r0)
            java.lang.String r0 = "original_image_url"
            X.9nx r1 = r10.A0c(r0)
            java.lang.String r0 = "original_dimensions"
            X.9nx r2 = r10.A0c(r0)
            if (r4 == 0) goto L_0x004a
            if (r1 != 0) goto L_0x0021
            if (r3 == 0) goto L_0x004a
        L_0x0021:
            java.lang.String r6 = r4.A0e()
            if (r1 != 0) goto L_0x0034
            r7 = r5
        L_0x0028:
            if (r3 != 0) goto L_0x002f
            r8 = r5
        L_0x002b:
            r1 = 0
            if (r2 == 0) goto L_0x0048
            goto L_0x0039
        L_0x002f:
            java.lang.String r8 = r3.A0e()
            goto L_0x002b
        L_0x0034:
            java.lang.String r7 = r1.A0e()
            goto L_0x0028
        L_0x0039:
            java.lang.String r0 = "width"
            int r9 = r2.A0S(r0, r1)     // Catch:{ 19b -> 0x0050 }
            java.lang.String r0 = "height"
            int r10 = r2.A0S(r0, r1)     // Catch:{ 19b -> 0x0046 }
            goto L_0x0058
        L_0x0046:
            r1 = move-exception
            goto L_0x0052
        L_0x0048:
            r9 = 0
            goto L_0x0057
        L_0x004a:
            java.lang.String r0 = "Connection/Product/image node missing url."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r5
        L_0x0050:
            r1 = move-exception
            r9 = 0
        L_0x0052:
            java.lang.String r0 = "Connection/Product/image dimension node missing"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0057:
            r10 = 0
        L_0x0058:
            if (r6 == 0) goto L_0x0064
            if (r7 != 0) goto L_0x005f
            if (r8 == 0) goto L_0x0064
            r7 = r8
        L_0x005f:
            X.9tv r5 = new X.9tv
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31841cT.A00(X.9nx):X.9tv");
    }
}
