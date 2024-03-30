package X;

/* renamed from: X.5BN  reason: invalid class name */
public class AnonymousClass5BN extends AnonymousClass5V2 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5BN(java.lang.String r3, java.lang.Exception r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L_0x0009
            r1 = 2
        L_0x0005:
            r2.<init>(r4, r3, r1)
            return
        L_0x0009:
            boolean r0 = r4 instanceof java.net.SocketTimeoutException
            r1 = 19
            if (r0 == 0) goto L_0x0005
            r1 = 3
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5BN.<init>(java.lang.String, java.lang.Exception):void");
    }

    public String toString() {
        return C36331k8.A0i("ConnectionFailureException: ", AnonymousClass000.A0u(), this);
    }

    public AnonymousClass5BN() {
        super((Exception) null, "no internet connection", 25);
    }
}
