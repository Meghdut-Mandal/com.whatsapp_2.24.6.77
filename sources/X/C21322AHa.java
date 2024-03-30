package X;

import java.util.Map;

/* renamed from: X.AHa  reason: case insensitive filesystem */
public final class C21322AHa implements C159667jj {
    public Class B7I() {
        return AnonymousClass91J.class;
    }

    public /* bridge */ /* synthetic */ Object Bod(Enum enumR, Object obj, Map map) {
        C175728ax r6 = (C175728ax) obj;
        AnonymousClass91J r5 = (AnonymousClass91J) enumR;
        boolean A1a = C36341k9.A1a(r6, r5);
        if (!(r6 instanceof C175698au)) {
            return null;
        }
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            C135086c7 r0 = ((C175698au) r6).A01;
            if (r0 != null) {
                return r0.A00;
            }
            return null;
        } else if (ordinal == A1a) {
            return ((C175698au) r6).A02;
        } else {
            throw C36441kJ.A18();
        }
    }
}
