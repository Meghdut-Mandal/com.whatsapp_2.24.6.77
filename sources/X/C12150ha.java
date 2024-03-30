package X;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: X.0ha  reason: invalid class name and case insensitive filesystem */
public class C12150ha implements Comparator {
    public final Rect A00 = AnonymousClass001.A06();
    public final Rect A01 = AnonymousClass001.A06();
    public final AnonymousClass0BO A02;
    public final boolean A03;

    public int compare(Object obj, Object obj2) {
        Rect rect = this.A00;
        Rect rect2 = this.A01;
        ((C07650Ys) obj).A02.getBoundsInParent(rect);
        ((C07650Ys) obj2).A02.getBoundsInParent(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i >= i2) {
            if (i <= i2) {
                int i3 = rect.left;
                int i4 = rect2.left;
                if (i3 >= i4) {
                    if (i3 <= i4) {
                        int i5 = rect.bottom;
                        int i6 = rect2.bottom;
                        if (i5 >= i6) {
                            if (i5 <= i6) {
                                int i7 = rect.right;
                                int i8 = rect2.right;
                                if (i7 >= i8) {
                                    if (i7 <= i8) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                    if (this.A03) {
                        return -1;
                    }
                    return 1;
                }
                if (this.A03) {
                    return 1;
                }
            }
            return 1;
        }
        return -1;
    }

    public C12150ha(AnonymousClass0BO r2, boolean z) {
        this.A03 = z;
        this.A02 = r2;
    }
}
