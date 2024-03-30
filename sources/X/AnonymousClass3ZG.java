package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.3ZG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3ZG implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass17Y A01;
    public final /* synthetic */ AnonymousClass14o A02;

    public /* synthetic */ AnonymousClass3ZG(View view, AnonymousClass17Y r2, AnonymousClass14o r3) {
        this.A02 = r3;
        this.A00 = view;
        this.A01 = r2;
    }

    public final void onDraw() {
        this.A02.A2Q(this.A00, this.A01);
    }
}
