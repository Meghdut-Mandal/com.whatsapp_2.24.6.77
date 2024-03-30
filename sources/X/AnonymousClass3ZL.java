package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.3ZL  reason: invalid class name */
public final class AnonymousClass3ZL implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public final AnonymousClass17Y A01;
    public final WeakReference A02;
    public final WeakReference A03;

    public AnonymousClass3ZL(View view, AnonymousClass17Y r3, Runnable runnable) {
        AnonymousClass00C.A0D(runnable, 3);
        this.A01 = r3;
        this.A03 = AnonymousClass001.A0F(view);
        this.A02 = AnonymousClass001.A0F(runnable);
    }

    public void onGlobalLayout() {
        int width;
        View A0Y = AnonymousClass000.A0Y(this.A03);
        if (A0Y != null && (width = A0Y.getWidth()) != 0 && width != this.A00) {
            this.A00 = width;
            Runnable runnable = (Runnable) this.A02.get();
            if (runnable != null) {
                AnonymousClass17Y r0 = this.A01;
                r0.A0G(runnable);
                r0.A0H(runnable);
            }
        }
    }
}
