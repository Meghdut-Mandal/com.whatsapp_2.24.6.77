package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3uQ  reason: invalid class name and case insensitive filesystem */
public final class C79873uQ implements B0B {
    public final AnonymousClass1HT A00;

    public C79873uQ(AnonymousClass1HT r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean B1C(C193229Kn r5, C16540pP r6, C87374On r7) {
        ArrayList A03 = this.A00.A03(C223613z.A00);
        if ((A03 instanceof Collection) && A03.isEmpty()) {
            return false;
        }
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (!C66013Ui.A0n(A0l)) {
                AnonymousClass00C.A0B(A0l);
                if (C36401kF.A1U(AnonymousClass3TJ.A00(A0l.A0D, 3))) {
                    return true;
                }
            }
        }
        return false;
    }
}
