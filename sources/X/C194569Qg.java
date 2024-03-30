package X;

import java.net.InetAddress;

/* renamed from: X.9Qg  reason: invalid class name and case insensitive filesystem */
public final class C194569Qg {
    public final long A00;
    public final InetAddress A01;

    public C194569Qg(InetAddress inetAddress, long j) {
        this.A01 = inetAddress;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InetAddressWithExpiry{address=");
        A0u.append(this.A01);
        A0u.append(", expireTimeMillis=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }
}
