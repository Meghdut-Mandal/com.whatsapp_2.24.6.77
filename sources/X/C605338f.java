package X;

import android.os.SystemClock;
import android.view.View;
import java.util.List;

/* renamed from: X.38f  reason: invalid class name and case insensitive filesystem */
public class C605338f {
    public long A00 = SystemClock.elapsedRealtime();
    public boolean A01 = false;
    public final C226715i A02 = new C89964Yo(this, 1);
    public final List A03 = AnonymousClass001.A0I();

    public C605338f(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new C90004Ys(view, this, 3));
    }
}
