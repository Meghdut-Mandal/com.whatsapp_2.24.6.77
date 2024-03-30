package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.062  reason: invalid class name */
public abstract class AnonymousClass062 {
    public static PorterDuff.Mode A01(PorterDuff.Mode mode, int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static float A00(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static void A02(View view, C018307u r6) {
        C011004s.A07(view, new C18520tI(r6, new AnonymousClass07w(AnonymousClass04F.A03(view), view.getPaddingTop(), AnonymousClass04F.A02(view), view.getPaddingBottom())));
        if (C011304x.A02(view)) {
            AnonymousClass09G.A00(view);
        } else {
            view.addOnAttachStateChangeListener(new C018507x());
        }
    }
}
