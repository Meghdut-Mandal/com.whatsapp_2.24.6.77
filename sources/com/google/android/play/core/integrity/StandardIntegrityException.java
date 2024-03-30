package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;

public class StandardIntegrityException extends ApiException {
    public final Throwable a;

    public final synchronized Throwable getCause() {
        return this.a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StandardIntegrityException(int r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            X.AnonymousClass000.A1J(r2, r5)
            java.lang.String r1 = com.google.android.play.core.integrity.model.b.a(r5)
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "Standard Integrity API error (%d): %s."
            java.lang.String r1 = java.lang.String.format(r3, r0, r2)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r5, r1)
            r4.<init>(r0)
            if (r5 == 0) goto L_0x0023
            r4.a = r6
            return
        L_0x0023:
            java.lang.String r0 = "ErrorCode should not be 0."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.StandardIntegrityException.<init>(int, java.lang.Throwable):void");
    }

    public int getErrorCode() {
        return this.mStatus.A01;
    }
}
