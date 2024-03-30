package X;

import android.os.SystemClock;
import android.view.View;

/* renamed from: X.3YI  reason: invalid class name */
public final class AnonymousClass3YI implements View.OnClickListener {
    public long A00;
    public final View.OnClickListener A01;
    public final C19970wo A02;

    public AnonymousClass3YI(View.OnClickListener onClickListener, C19970wo r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A02 = r3;
        this.A01 = onClickListener;
    }

    public void onClick(View view) {
        AnonymousClass00C.A0D(view, 0);
        if (SystemClock.elapsedRealtime() - this.A00 >= 1000) {
            this.A00 = SystemClock.elapsedRealtime();
            this.A01.onClick(view);
        }
    }
}
