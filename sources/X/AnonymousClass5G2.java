package X;

import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.5G2  reason: invalid class name */
public final class AnonymousClass5G2 extends AnonymousClass6F2 {
    public final AnonymousClass9Y1 A00;
    public final Map A01;
    public final AnonymousClass17Y A02;
    public final C19600wD A03;
    public final C19630wG A04;

    public static final void A00(C159627jf r3, AnonymousClass5G2 r4, Map map, boolean z) {
        AnonymousClass17Y r1;
        int i;
        C19630wG r12 = r4.A04;
        String A0v = C36371kC.A0v(r12, R.string.f12nameremoved);
        if (!r4.A03.A09()) {
            A0v = C36371kC.A0v(r12, R.string.f12nameremoved);
        }
        if (!z) {
            C52122ov r13 = C52122ov.A02;
            if (!(map.get(r13.key) instanceof C128176Bf)) {
                map = C36391kE.A11(r13.key, C128176Bf.A00(A0v));
            }
            r1 = r4.A02;
            i = 29;
        } else {
            r1 = r4.A02;
            i = 28;
        }
        C1498172w.A00(r1, r3, map, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5G2(AnonymousClass17Y r2, AnonymousClass9Y1 r3, C19600wD r4, C19630wG r5, C105705Fs r6, Map map) {
        super(r6);
        C36321k7.A1B(r2, r5, r4, r6, map);
        AnonymousClass00C.A0D(r3, 6);
        this.A02 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = map;
        this.A00 = r3;
    }
}
