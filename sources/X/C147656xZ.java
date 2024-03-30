package X;

import java.util.Map;

/* renamed from: X.6xZ  reason: invalid class name and case insensitive filesystem */
public final class C147656xZ implements C159667jj {
    public final C18820ts A00;

    public Class B7I() {
        return AnonymousClass5UM.class;
    }

    public /* bridge */ /* synthetic */ Object Bod(Enum enumR, Object obj, Map map) {
        String str;
        int i;
        C207119ua r7 = (C207119ua) obj;
        AnonymousClass5UM r6 = (AnonymousClass5UM) enumR;
        boolean A1a = C36341k9.A1a(r7, r6);
        int ordinal = r6.ordinal();
        if (ordinal != 0) {
            if (ordinal == A1a) {
                i = (int) (r7.A02.A00.doubleValue() * ((double) r7.A00));
            } else if (ordinal == 2) {
                i = r7.A00;
            } else if (ordinal == 3) {
                AnonymousClass16U r1 = r7.A01;
                AnonymousClass16V r12 = (AnonymousClass16V) r1;
                str = AnonymousClass6US.A02(this.A00, r12.A02, r12.A03, r7.A02.A00, false);
            } else if (ordinal == 4) {
                str = r7.A01.B7e(this.A00, r7.A02.A00);
            } else {
                throw C36441kJ.A18();
            }
            return Integer.valueOf(i);
        }
        str = ((AnonymousClass16V) r7.A01).A02;
        AnonymousClass00C.A08(str);
        return str;
    }

    public C147656xZ(C18820ts r1) {
        this.A00 = r1;
    }
}
