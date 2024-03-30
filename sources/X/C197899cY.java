package X;

import java.util.Objects;

/* renamed from: X.9cY  reason: invalid class name and case insensitive filesystem */
public final class C197899cY {
    public int A00;
    public long A01;
    public Object A02;
    public final C200829iJ A03;

    public C197899cY(C200829iJ r1) {
        Objects.requireNonNull(r1);
        this.A03 = r1;
    }

    public C197899cY() {
        C200829iJ r0 = C200829iJ.A02;
        if (r0 == null) {
            synchronized (C200829iJ.class) {
                r0 = C200829iJ.A02;
                if (r0 == null) {
                    r0 = C200829iJ.A01;
                    C200829iJ.A02 = r0;
                }
            }
        }
        this.A03 = r0;
    }
}
