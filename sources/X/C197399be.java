package X;

import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: X.9be  reason: invalid class name and case insensitive filesystem */
public final class C197399be {
    public static final C23019B0p A01 = new C21067A7e();
    public final C23019B0p A00;

    public C197399be() {
        C23019B0p b0p;
        C23019B0p[] b0pArr = new C23019B0p[2];
        b0pArr[0] = C21069A7g.A00;
        try {
            b0p = (C23019B0p) C165577te.A0d();
        } catch (Exception unused) {
            b0p = A01;
        }
        b0pArr[1] = b0p;
        C21068A7f a7f = new C21068A7f(b0pArr);
        Charset charset = AnonymousClass9BD.A04;
        Objects.requireNonNull(a7f, "messageInfoFactory");
        this.A00 = a7f;
    }
}
