package X;

import java.io.IOException;

public class AZW implements C219411z, B0J {
    public int A00;
    public AnonymousClass9WM A01;
    public boolean A02;

    public AZW(AnonymousClass9WM r1, int i, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = r1;
    }

    public AnonymousClass121 BDb() {
        return this.A01.A02(this.A00, this.A02);
    }

    public AnonymousClass121 Bve() {
        try {
            return BDb();
        } catch (IOException e) {
            throw new AnonymousClass92R(e.getMessage());
        }
    }
}
