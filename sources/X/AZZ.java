package X;

import java.io.IOException;

public class AZZ implements C23126B6h {
    public AnonymousClass9WM A00;

    public AZZ(AnonymousClass9WM r1) {
        this.A00 = r1;
    }

    public AnonymousClass121 BDb() {
        return new C22673Asd(this.A00.A01());
    }

    public AnonymousClass121 Bve() {
        try {
            return BDb();
        } catch (IOException e) {
            throw AnonymousClass001.A09(e.getMessage());
        }
    }
}
