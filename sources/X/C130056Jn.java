package X;

import java.security.MessageDigest;

/* renamed from: X.6Jn  reason: invalid class name and case insensitive filesystem */
public final class C130056Jn {
    public final C232317r A00;
    public final C588631i A01;

    public C130056Jn(C232317r r1, C588631i r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final String A00(AnonymousClass3T1 r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C64933Qa r1 = r3.A1J;
        A0u.append(r1.A01);
        A0u.append(r1.A02);
        byte[] digest = MessageDigest.getInstance("MD5").digest(C36351kA.A1b(AnonymousClass000.A0o(r1.A00, A0u)));
        AnonymousClass00C.A0B(digest);
        return AnonymousClass02R.A0A(C155717Xd.A00, digest);
    }
}
