package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.0VX  reason: invalid class name */
public abstract class AnonymousClass0VX {
    public static void A00(View view, AnonymousClass08H r3) {
        Rect A06 = AnonymousClass001.A06();
        view.getDrawingRect(A06);
        r3.setBounds(A06);
        r3.A07(view, (FrameLayout) null);
        WeakReference weakReference = r3.A06;
        if (weakReference == null || weakReference.get() == null) {
            view.getOverlay().add(r3);
        } else {
            ((FrameLayout) weakReference.get()).setForeground(r3);
        }
    }

    public static void A01(View view, AnonymousClass08H r3) {
        if (r3 != null) {
            WeakReference weakReference = r3.A06;
            if (weakReference == null || weakReference.get() == null) {
                view.getOverlay().remove(r3);
            } else {
                ((FrameLayout) weakReference.get()).setForeground((Drawable) null);
            }
        }
    }
}
