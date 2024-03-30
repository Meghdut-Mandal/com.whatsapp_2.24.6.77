package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.3FA  reason: invalid class name */
public final class AnonymousClass3FA {
    public C09470cQ A00;
    public AnonymousClass317 A01;
    public AnonymousClass318 A02;
    public C37931nR A03;
    public final Context A04;
    public final View.OnTouchListener A05 = new C53912s6(this, 4);
    public final View A06;
    public final C18820ts A07;
    public final List A08;
    public final AnonymousClass00T A09 = C36431kI.A1I(new AnonymousClass4AQ(this));

    public final void A00(Long l) {
        Long l2;
        C37931nR r1;
        C37931nR r0 = this.A03;
        if (r0 != null) {
            l2 = r0.A00;
        } else {
            l2 = null;
        }
        if (!AnonymousClass00C.A0J(l, l2) && (r1 = this.A03) != null && !AnonymousClass00C.A0J(l, r1.A00)) {
            r1.A00 = l;
            r1.notifyDataSetChanged();
        }
    }

    public AnonymousClass3FA(Context context, View view, C18820ts r5, List list) {
        C36321k7.A0x(r5, context);
        this.A07 = r5;
        this.A04 = context;
        this.A06 = view;
        this.A08 = list;
    }
}
