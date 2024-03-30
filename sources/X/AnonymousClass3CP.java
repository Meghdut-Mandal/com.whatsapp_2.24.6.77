package X;

import com.whatsapp.R;

/* renamed from: X.3CP  reason: invalid class name */
public class AnonymousClass3CP {
    public final C20810yC A00;

    public AnonymousClass3CP(C20810yC r1) {
        this.A00 = r1;
    }

    public AnonymousClass36Q A00(AnonymousClass3T1 r5, boolean z) {
        if (!C66013Ui.A0t(r5) || z) {
            AnonymousClass3BG r0 = r5.A0V;
            if ((r0 == null || !r0.A0E || !this.A00.A0E(1307)) && !AnonymousClass000.A1S(r5.A0A & 1073741824, 1073741824)) {
                return null;
            }
            return new AnonymousClass36Q(R.string.f12nameremoved, R.string.f12nameremoved, R.drawable.vec_ic_ad_attribution);
        }
        boolean A0l = C66013Ui.A0l(r5);
        int i = R.string.f12nameremoved;
        int i2 = R.string.f12nameremoved;
        int i3 = R.drawable.ic_forward_message;
        if (A0l) {
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
            i3 = R.drawable.ic_frequently_forwarded;
        }
        return new AnonymousClass36Q(i, i2, i3);
    }
}
