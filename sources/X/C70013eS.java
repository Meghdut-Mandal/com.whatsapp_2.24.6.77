package X;

import java.util.List;

/* renamed from: X.3eS  reason: invalid class name and case insensitive filesystem */
public final class C70013eS implements AnonymousClass4V0 {
    public final int A00;
    public final AnonymousClass026 A01;
    public final C18820ts A02;
    public final C34831hi A03 = C36441kJ.A0s(C36381kD.A0j());
    public final Runnable A04;
    public final List A05 = AnonymousClass001.A0I();

    public C70013eS(AnonymousClass026 r2, C18820ts r3, Runnable runnable, int i) {
        AnonymousClass00C.A0D(r3, 1);
        this.A02 = r3;
        this.A00 = i;
        this.A04 = runnable;
        this.A01 = r2;
    }

    public boolean BvY(int i, Object obj) {
        boolean A1X = AnonymousClass000.A1X(C36401kF.A0m(this.A03));
        switch (i) {
            case 4:
                if (A1X) {
                    List list = this.A05;
                    if (!list.isEmpty()) {
                        if (obj == null) {
                            return false;
                        }
                        if (C202859mm.A04(this.A02, ((AnonymousClass3JY) obj).A00.A04, list, true)) {
                            return true;
                        }
                        return false;
                    }
                }
                return true;
            case 19:
                return false;
            default:
                return !A1X;
        }
    }
}
