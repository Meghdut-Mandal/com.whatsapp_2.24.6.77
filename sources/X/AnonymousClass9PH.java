package X;

/* renamed from: X.9PH  reason: invalid class name */
public class AnonymousClass9PH {
    public AnonymousClass97W A00;

    public AnonymousClass9PH(AnonymousClass97W r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C197889cX A00(android.os.Bundle r9) {
        /*
            r8 = this;
            java.util.Objects.requireNonNull(r9)
            java.lang.String r0 = "error_code"
            r3 = 1
            int r7 = r9.getInt(r0, r3)
            java.lang.String r1 = "exception"
            android.os.Parcelable r0 = r9.getParcelable(r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r6 = 0
            if (r0 == 0) goto L_0x0027
            java.io.Serializable r2 = r0.getSerializable(r1)     // Catch:{ all -> 0x002a }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0020
            java.lang.Integer r1 = X.C023109s.A00     // Catch:{ all -> 0x0024 }
            goto L_0x0022
        L_0x0020:
            java.lang.Integer r1 = X.C023109s.A0G     // Catch:{ all -> 0x0024 }
        L_0x0022:
            r6 = r2
            goto L_0x0030
        L_0x0024:
            r0 = move-exception
            r6 = r2
            goto L_0x002b
        L_0x0027:
            java.lang.Integer r1 = X.C023109s.A0G
            goto L_0x0030
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            X.C165607th.A1N(r0)
            java.lang.Integer r1 = X.C023109s.A0C
        L_0x0030:
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 != r0) goto L_0x0039
            java.lang.String r0 = "serialization_result"
            r9.getBoolean(r0, r3)
        L_0x0039:
            java.lang.String r0 = "stringified_exception"
            java.lang.String r5 = r9.getString(r0)
            java.lang.String r0 = "exception_hierarchies"
            java.util.ArrayList r0 = r9.getStringArrayList(r0)
            X.8Hc r4 = X.C23931Ak.builder()
            if (r0 == 0) goto L_0x0075
            X.8Hc r3 = X.C23931Ak.builder()
            java.util.Iterator r2 = r0.iterator()
        L_0x0053:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            java.lang.String r0 = "--"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0071
            X.1Ak r0 = r3.build()
            r4.add((java.lang.Object) r0)
            X.8Hc r3 = X.C23931Ak.builder()
            goto L_0x0053
        L_0x0071:
            r3.add((java.lang.Object) r1)
            goto L_0x0053
        L_0x0075:
            X.1Ak r1 = r4.build()
            X.9cX r0 = new X.9cX
            r0.<init>(r1, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9PH.A00(android.os.Bundle):X.9cX");
    }
}
