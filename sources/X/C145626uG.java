package X;

/* renamed from: X.6uG  reason: invalid class name and case insensitive filesystem */
public class C145626uG implements C158257gd {
    public final C158257gd A00;
    public final C158257gd A01;

    public boolean BLd(C1261562t r4) {
        C158257gd r1 = this.A01;
        C18740tg.A06(r1);
        return this.A00.BLd(r4) && r1.BLd(r4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C145626uG)) {
            return false;
        }
        C145626uG r4 = (C145626uG) obj;
        if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public C145626uG(C158257gd r1, C158257gd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, 0);
        A1Q[1] = this.A00;
        return C90484aE.A0D(this.A01, A1Q);
    }
}
