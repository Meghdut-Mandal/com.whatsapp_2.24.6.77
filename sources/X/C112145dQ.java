package X;

import android.os.Build;
import androidx.compose.ui.layout.LayoutElement;

/* renamed from: X.5dQ  reason: invalid class name and case insensitive filesystem */
public abstract class C112145dQ {
    public static final C161267mT A00;

    static {
        int i = Build.VERSION.SDK_INT;
        C161267mT r0 = C161267mT.A00;
        if (i >= 31) {
            r0 = AnonymousClass5WL.A00(new LayoutElement(C156637aI.A00), new LayoutElement(C156647aJ.A00));
        }
        A00 = r0;
    }
}
