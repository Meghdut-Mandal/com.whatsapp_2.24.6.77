package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.66S  reason: invalid class name */
public final class AnonymousClass66S {
    public final AnonymousClass00T A00 = C36431kI.A1I(new C152847Mb(this));
    public final C111185bs A01;

    public AnonymousClass66S(C111185bs r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public final C119885qc A00(C108415Tk r3) {
        C119885qc r0;
        AnonymousClass005 r02 = (AnonymousClass005) C90514aH.A16(this.A00).get(r3);
        if (r02 != null && (r0 = (C119885qc) r02.get()) != null) {
            return r0;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("No attributes found for ");
        throw AnonymousClass000.A0g(r3.id, A0u);
    }

    public final List A01(C51562o1 r7) {
        C51562o1 r0;
        C108415Tk[] values = C108415Tk.values();
        ArrayList A0I = AnonymousClass001.A0I();
        for (C108415Tk r1 : values) {
            AnonymousClass00C.A0D(r1, 0);
            switch (r1.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    r0 = C51562o1.EAGER;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    r0 = C51562o1.ON_DEMAND;
                    break;
                default:
                    throw C36441kJ.A18();
            }
            if (r0 == r7) {
                A0I.add(r1);
            }
        }
        return C007103b.A0Y(A0I);
    }
}
