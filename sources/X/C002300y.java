package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.00y  reason: invalid class name and case insensitive filesystem */
public abstract class C002300y {
    public static int A00 = -100;
    public static final C000000a A01 = new C000000a(0);
    public static final Object A02 = new Object();

    public static void A00(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (A00 != i) {
            A00 = i;
            synchronized (A02) {
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    C002300y r1 = (C002300y) ((WeakReference) it.next()).get();
                    if (r1 != null) {
                        AnonymousClass02U.A0C((AnonymousClass02U) r1, true);
                    }
                }
            }
        }
    }

    public abstract Context A0E(Context context);

    public abstract View A0F(View view, String str, Context context, AttributeSet attributeSet);

    public abstract AnonymousClass0V9 A0G(C021809f r1);

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K();

    public abstract void A0L(int i);

    public abstract void A0M(Configuration configuration);

    public abstract void A0N(Bundle bundle);

    public abstract void A0O(View view);

    public abstract void A0P(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0Q(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0R(Toolbar toolbar);

    public abstract void A0S(CharSequence charSequence);

    public abstract boolean A0T(int i);

    public static void A01(C002300y r3) {
        synchronized (A02) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                C002300y r0 = (C002300y) ((WeakReference) it.next()).get();
                if (r0 == r3 || r0 == null) {
                    it.remove();
                }
            }
        }
    }
}
