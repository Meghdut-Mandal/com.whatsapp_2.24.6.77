package X;

import java.util.ArrayList;

/* renamed from: X.84F  reason: invalid class name */
public final class AnonymousClass84F extends AnonymousClass9UN {
    public final ArrayList A00 = C36441kJ.A14(16);

    public static void A00(AnonymousClass84F r1, Object obj) {
        if (r1.A02) {
            r1.A00.add(obj);
            return;
        }
        throw AnonymousClass001.A09("Expected object to be mutable");
    }

    public void A04(AnonymousClass9UN r2) {
        if (this.A02) {
            r2.A02();
            A00(this, r2);
            r2.A02();
            r2.A00 = this;
            return;
        }
        throw AnonymousClass001.A09("Expected object to be mutable");
    }
}
