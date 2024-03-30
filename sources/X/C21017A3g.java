package X;

import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: X.A3g  reason: case insensitive filesystem */
public final class C21017A3g implements C22890Axl {
    public final AnonymousClass8D7 A00;

    public final void ByY(B3S b3s, Object obj, int i) {
        AnonymousClass8D7 r2 = this.A00;
        int i2 = i << 3;
        r2.A03(i2 | 3);
        b3s.ByM(r2.A00, obj);
        r2.A03(i2 | 4);
    }

    public C21017A3g(AnonymousClass8D7 r3) {
        Charset charset = C197079b6.A04;
        Objects.requireNonNull(r3, "output");
        this.A00 = r3;
        r3.A00 = this;
    }
}
