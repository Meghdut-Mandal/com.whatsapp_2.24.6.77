package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3EA  reason: invalid class name */
public final class AnonymousClass3EA {
    public final C18820ts A00;
    public final C20810yC A01;
    public final AnonymousClass1TF A02;
    public final AnonymousClass1M4 A03;

    public final Integer A00(AnonymousClass3T1 r5) {
        List<AnonymousClass3P8> list;
        int i;
        AnonymousClass00C.A0D(r5, 0);
        if (!(r5 instanceof AnonymousClass2cW) || (list = ((AnonymousClass2cW) r5).A00.A06) == null) {
            return null;
        }
        for (AnonymousClass3P8 r2 : list) {
            AnonymousClass1TF r1 = this.A02;
            AnonymousClass00C.A0B(r2);
            if (r1.A07(r2)) {
                i = R.string.f12nameremoved;
            } else if (r1.A09(r2)) {
                i = R.string.f12nameremoved;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public AnonymousClass3EA(C18820ts r1, C20810yC r2, AnonymousClass1TF r3, AnonymousClass1M4 r4) {
        C36321k7.A18(r2, r1, r4, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
