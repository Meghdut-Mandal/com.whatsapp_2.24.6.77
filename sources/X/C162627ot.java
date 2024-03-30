package X;

import com.whatsapp.R;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.7ot  reason: invalid class name and case insensitive filesystem */
public class C162627ot extends AnonymousClass0NP {
    public Object A00;
    public final int A01;

    public C162627ot(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj, int i) {
        int i2 = this.A01;
        Object obj2 = this.A00;
        if (i2 != 0) {
            C35011i0 r1 = (C35011i0) obj2;
            C132686Uv.A01((C33541fX) null, (C132686Uv) C36411kG.A0v(r1.A0A), "status_fragment", R.string.f12nameremoved, 0, false);
            ((AnonymousClass1UZ) r1.A0G.get()).A05("SEE_CROSSPOST_ERROR", "Error code: -1, error subcode: null");
            return;
        }
        ((SearchFragment) obj2).A06 = null;
    }
}
