package X;

import android.util.Log;
import android.view.ViewGroup;

/* renamed from: X.0gB  reason: invalid class name and case insensitive filesystem */
public class C11360gB implements Runnable {
    public final /* synthetic */ AnonymousClass6YL A00;

    public C11360gB(AnonymousClass6YL r1) {
        this.A00 = r1;
    }

    public void run() {
        int A03;
        AnonymousClass6YL r5 = this.A00;
        AnonymousClass0Eq r4 = r5.A0J;
        if (r4 != null && r5.A0G != null && (A03 = (AnonymousClass6YL.A03(r5) - AnonymousClass6YL.A04(r5)) + ((int) r4.getTranslationY())) < r5.A02) {
            ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w("BaseTransientBottomBar", "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += r5.A02 - A03;
            r4.requestLayout();
        }
    }
}
