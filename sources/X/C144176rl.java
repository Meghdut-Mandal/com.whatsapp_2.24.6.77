package X;

/* renamed from: X.6rl  reason: invalid class name and case insensitive filesystem */
public class C144176rl implements C159407jJ {
    public final C1269866m A00;
    public final AnonymousClass3KV A01;
    public final AnonymousClass141 A02;

    public int BD8() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C144176rl)) {
            return false;
        }
        C144176rl r4 = (C144176rl) obj;
        if (!this.A02.equals(r4.A02) || !this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public C144176rl(C1269866m r1, AnonymousClass3KV r2, AnonymousClass141 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A02;
        A1Q[1] = this.A01;
        return C90484aE.A0D(this.A00, A1Q);
    }
}
