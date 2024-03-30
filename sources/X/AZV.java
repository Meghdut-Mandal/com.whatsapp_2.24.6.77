package X;

import java.io.IOException;

public class AZV implements C219411z, B0J {
    public final int A00;
    public final AnonymousClass9WM A01;

    public AZV(AnonymousClass9WM r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public AnonymousClass121 BDb() {
        return new C22583ArB(this.A01.A01(), this.A00);
    }

    public AnonymousClass121 Bve() {
        try {
            return BDb();
        } catch (IOException e) {
            throw new AnonymousClass92R(e.getMessage(), e);
        }
    }
}
