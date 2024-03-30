package X;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: X.77d  reason: invalid class name and case insensitive filesystem */
public final class C1508877d implements HostnameVerifier {
    public final String A00;
    public final HostnameVerifier A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1508877d r4 = (C1508877d) obj;
            if (this.A00.equals(r4.A00)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36421kH.A04(this.A00));
    }

    public boolean verify(String str, SSLSession sSLSession) {
        return this.A01.verify(this.A00, sSLSession);
    }

    public C1508877d(String str, HostnameVerifier hostnameVerifier) {
        this.A00 = str;
        this.A01 = hostnameVerifier;
    }
}
