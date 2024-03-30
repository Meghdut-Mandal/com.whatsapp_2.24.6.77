package X;

import android.os.SystemClock;
import android.view.View;

/* renamed from: X.6cq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135526cq implements View.OnClickListener {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C19760wT A02;
    public final /* synthetic */ C10800fF A03;

    public /* synthetic */ C135526cq(View.OnClickListener onClickListener, View view, C19760wT r3, C10800fF r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = onClickListener;
        this.A01 = view;
    }

    public final void onClick(View view) {
        C10800fF r11 = this.A03;
        View.OnClickListener onClickListener = this.A00;
        View view2 = this.A01;
        AnonymousClass00C.A0D(r11, 1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - r11.element > 1000) {
            r11.element = elapsedRealtime;
            onClickListener.onClick(view2);
        }
    }
}
