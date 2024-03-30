package X;

import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: X.A3f  reason: case insensitive filesystem */
public final class C21016A3f implements C22804AwF {
    public static final C23017B0i A01 = new A3X();
    public final C23017B0i A00;

    public C21016A3f() {
        C23017B0i b0i;
        C23017B0i[] b0iArr = new C23017B0i[2];
        b0iArr[0] = A3Z.A00;
        try {
            b0i = (C23017B0i) C165577te.A0d();
        } catch (Exception unused) {
            b0i = A01;
        }
        b0iArr[1] = b0i;
        A3Y a3y = new A3Y(b0iArr);
        Charset charset = C197079b6.A04;
        Objects.requireNonNull(a3y, "messageInfoFactory");
        this.A00 = a3y;
    }
}
