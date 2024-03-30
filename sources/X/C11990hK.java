package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.Main;
import com.whatsapp.Me;

/* renamed from: X.0hK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11990hK implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener A01;
    public final /* synthetic */ Main A02;
    public final /* synthetic */ Me A03;

    public /* synthetic */ C11990hK(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener, Main main, Me me) {
        this.A02 = main;
        this.A00 = view;
        this.A01 = onPreDrawListener;
        this.A03 = me;
    }

    public final void run() {
        this.A02.A3r(this.A00, this.A01, this.A03);
    }
}
