package com.google.android.gms.common.api;

public class ApiException extends Exception {
    @Deprecated
    public final Status mStatus;

    public Status getStatus() {
        return this.mStatus;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.A01
            java.lang.String r2 = r4.A04
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = ""
        L_0x0008:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r1.append(r0)
            java.lang.String r0 = ": "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            r3.<init>(r0)
            r3.mStatus = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    public int getStatusCode() {
        return this.mStatus.A01;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.A04;
    }
}
