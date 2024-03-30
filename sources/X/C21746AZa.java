package X;

import java.io.IOException;

/* renamed from: X.AZa  reason: case insensitive filesystem */
public class C21746AZa implements C23126B6h {
    public AnonymousClass9WM A00;

    public C21746AZa(AnonymousClass9WM r1) {
        this.A00 = r1;
    }

    public AnonymousClass121 BDb() {
        return new C22674Ase(this.A00.A01());
    }

    public AnonymousClass121 Bve() {
        try {
            return BDb();
        } catch (IOException e) {
            throw AnonymousClass001.A09(e.getMessage());
        }
    }
}
