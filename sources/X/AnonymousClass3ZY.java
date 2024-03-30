package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.3ZY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3ZY implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass07B A01;
    public final /* synthetic */ C224914p A02;

    public /* synthetic */ AnonymousClass3ZY(View view, AnonymousClass07B r2, C224914p r3) {
        this.A00 = view;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onScrollChanged() {
        float f;
        View view = this.A00;
        AnonymousClass07B r2 = this.A01;
        C224914p r1 = this.A02;
        if (view.canScrollVertically(-1)) {
            f = AnonymousClass1RH.A00(r1);
        } else {
            f = 0.0f;
        }
        r2.A0F(f);
    }
}
