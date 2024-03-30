package X;

import java.util.Collection;

/* renamed from: X.1bM  reason: invalid class name and case insensitive filesystem */
public final class C31151bM implements AnonymousClass004 {
    public final C18800tq A00;
    public final int A01;
    public final C31141bL A02;

    public C31151bM(C31141bL r1, C18800tq r2, int i) {
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = i;
    }

    public Object get() {
        int i = this.A01;
        if (i == 0) {
            return C20760y7.copyOf((Collection) this.A00.A00.AEB());
        }
        if (i == 1) {
            return new C115975jk(this);
        }
        if (i == 2) {
            return new C115985jl(this);
        }
        if (i == 3) {
            return new C115995jm(this);
        }
        if (i == 4) {
            return new AnonymousClass3DK((C20810yC) this.A00.A02.get(), (C20670xw) this.A00.AXI.get());
        }
        throw new AssertionError(this.A01);
    }
}
