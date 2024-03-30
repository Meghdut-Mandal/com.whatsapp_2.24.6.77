package X;

import java.io.IOException;

/* renamed from: X.AZb  reason: case insensitive filesystem */
public class C21747AZb implements C23127B6i {
    public AnonymousClass9WM A00;

    public C21747AZb(AnonymousClass9WM r1) {
        this.A00 = r1;
    }

    public AnonymousClass121 BDb() {
        return new C22676Asg(this.A00.A01());
    }

    public AnonymousClass121 Bve() {
        try {
            return BDb();
        } catch (IOException e) {
            throw new AnonymousClass92R(e.getMessage(), e);
        }
    }
}
