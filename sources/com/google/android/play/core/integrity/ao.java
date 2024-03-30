package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.C36371kC;
import android.os.Build;

public final class ao extends IntegrityTokenRequest {
    public final String a;
    public final Long b;
    public final Object c = null;

    public /* synthetic */ ao(String str, Long l, Object obj, an anVar) {
        this.a = str;
        this.b = l;
    }

    public final Long cloudProjectNumber() {
        return this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L_0x002c
            boolean r0 = r5 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            if (r0 == 0) goto L_0x0034
            r2 = r5
            com.google.android.play.core.integrity.IntegrityTokenRequest r2 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r2
            java.lang.String r1 = r4.a
            com.google.android.play.core.integrity.ao r2 = (com.google.android.play.core.integrity.ao) r2
            java.lang.String r0 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.Long r1 = r4.b
            java.lang.Long r0 = r2.b
            if (r1 != 0) goto L_0x002d
            if (r0 != 0) goto L_0x0034
        L_0x001e:
            r1 = 1
        L_0x001f:
            boolean r0 = r5 instanceof com.google.android.play.core.integrity.ao
            if (r0 == 0) goto L_0x0036
            boolean r0 = a()
            if (r0 == 0) goto L_0x0036
            if (r1 != 0) goto L_0x002c
            r3 = 0
        L_0x002c:
            return r3
        L_0x002d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            goto L_0x001e
        L_0x0034:
            r1 = 0
            goto L_0x001f
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final String nonce() {
        return this.a;
    }

    public static boolean a() {
        return C36371kC.A1T(Build.VERSION.SDK_INT, 23);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ AnonymousClass000.A0H(this.b);
        if (a()) {
            return hashCode * 1000003;
        }
        return hashCode;
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IntegrityTokenRequest{nonce=");
        A0u.append(this.a);
        A0u.append(", cloudProjectNumber=");
        String A0o = AnonymousClass000.A0o(this.b, A0u);
        if (a()) {
            A0o = A0o.concat(", network=null");
        }
        return A0o.concat("}");
    }
}
