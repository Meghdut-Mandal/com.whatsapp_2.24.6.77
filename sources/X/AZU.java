package X;

import java.io.IOException;

public class AZU implements C219411z, B0J {
    public AnonymousClass9WM A00;

    public AZU(AnonymousClass9WM r1) {
        this.A00 = r1;
    }

    public AnonymousClass121 BDb() {
        try {
            return new C22587ArF(this.A00.A01());
        } catch (IllegalArgumentException e) {
            throw new C187348xh(e.getMessage(), e);
        }
    }

    public AnonymousClass121 Bve() {
        try {
            return BDb();
        } catch (IOException e) {
            throw new AnonymousClass92R("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new AnonymousClass92R("unable to get DER object", e2);
        }
    }
}
