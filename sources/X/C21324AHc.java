package X;

import java.util.Map;

/* renamed from: X.AHc  reason: case insensitive filesystem */
public final class C21324AHc implements C159667jj {
    public final C20830yE A00;
    public final C201529jn A01;

    public C21324AHc(C20830yE r2, C201529jn r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public Class B7I() {
        return AnonymousClass5UN.class;
    }

    public /* bridge */ /* synthetic */ Object Bod(Enum enumR, Object obj, Map map) {
        AnonymousClass5UN r4 = (AnonymousClass5UN) enumR;
        AnonymousClass00C.A0D(r4, 1);
        if (r4.ordinal() != 4 || !this.A00.A0F()) {
            return null;
        }
        int A02 = this.A01.A02();
        if (A02 == 0) {
            return "INSTALLED";
        }
        if (A02 != 1) {
            return "INCORRECT_SIM_SELECTED";
        }
        return "NOT_INSTALLED";
    }
}
