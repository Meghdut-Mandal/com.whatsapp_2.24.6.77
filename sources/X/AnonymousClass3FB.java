package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3FB  reason: invalid class name */
public final class AnonymousClass3FB {
    public View A00;
    public View A01;
    public final Context A02;
    public final ViewGroup A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass4B7(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(new AnonymousClass4B8(this));
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass4B9(this));
    public final AnonymousClass00T A07 = C36431kI.A1I(new AnonymousClass4BA(this));
    public final AnonymousClass00T A08 = C36431kI.A1I(new AnonymousClass4BB(this));
    public final AnonymousClass00T A09 = C36431kI.A1I(new AnonymousClass4BC(this));

    public final void A00(C96174mu r3) {
        View view = this.A01;
        if (view != null && view.getVisibility() == 0) {
            C36401kF.A0F(this.A09).setVisibility(8);
            C36401kF.A0F(this.A06).setVisibility(0);
            AnonymousClass00T r1 = this.A05;
            if (((RecyclerView) r1.getValue()).A0G == null) {
                ((RecyclerView) r1.getValue()).setAdapter(r3);
            }
        }
    }

    public AnonymousClass3FB(Context context, ViewGroup viewGroup) {
        C36321k7.A0x(viewGroup, context);
        this.A03 = viewGroup;
        this.A02 = context;
    }
}
