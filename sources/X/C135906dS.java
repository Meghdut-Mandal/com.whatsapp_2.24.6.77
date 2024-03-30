package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.6dS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135906dS implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass07B A01;
    public final /* synthetic */ C179128jE A02;

    public /* synthetic */ C135906dS(View view, AnonymousClass07B r2, C179128jE r3) {
        this.A02 = r3;
        this.A00 = view;
        this.A01 = r2;
    }

    public final void onScrollChanged() {
        C179128jE r3 = this.A02;
        View view = this.A00;
        AnonymousClass07B r1 = this.A01;
        if (view.canScrollVertically(-1)) {
            AnonymousClass1RH.A00(r3);
        } else {
            r1.A0F(0.0f);
        }
    }
}
