package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.whatsapp.WaTextView;

/* renamed from: X.1fV  reason: invalid class name and case insensitive filesystem */
public abstract class C33521fV {
    public static void A02(View view) {
        C012005e.A0V(view, new C35971jY(view, 1));
    }

    public static void A03(View view, int i) {
        C012005e.A0V(view, new C95144k7(new C118915ow[]{new C118915ow(16, i)}));
    }

    public static void A04(View view, int i) {
        C012005e.A0V(view, new C95144k7(new C118915ow[]{new C118915ow(1, i)}));
    }

    public static void A05(View view, int i) {
        C012005e.A0V(view, new C95144k7(new C118915ow[]{new C118915ow(32, i)}));
    }

    public static void A06(View view, String str) {
        C012005e.A0V(view, new C95144k7(new C118915ow[]{new C101054ws(str)}));
    }

    public static void A01(View view) {
        C012005e.A0V(view, new C011705b());
    }

    public static void A07(View view, boolean z) {
        C012005e.A0V(view, new C39221rX(z));
    }

    public static void A08(WaTextView waTextView, C21060yb r2, C20810yC r3) {
        waTextView.setMovementMethod(new C34021gK(r3));
        C012005e.A0V(waTextView, new C34011gJ(waTextView, r2));
    }

    public static void A00(Context context, C21060yb r4, CharSequence charSequence) {
        AccessibilityManager A0M = r4.A0M();
        if (A0M != null && A0M.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName("android.widget.Button");
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            A0M.sendAccessibilityEvent(obtain);
        }
    }
}
