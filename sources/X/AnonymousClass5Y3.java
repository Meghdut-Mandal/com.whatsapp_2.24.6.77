package X;

import android.graphics.Rect;

/* renamed from: X.5Y3  reason: invalid class name */
public abstract class AnonymousClass5Y3 {
    public static final Rect[] A00(int i, int i2, int i3, boolean z) {
        Rect[] rectArr = new Rect[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            rectArr[i5] = AnonymousClass001.A06();
        }
        if (i2 != 0) {
            double d = ((double) i2) / ((double) i3);
            while (i4 < i3) {
                int A00 = C14960mT.A00(((double) i4) * d);
                int i6 = i4 + 1;
                int A002 = i2 - C14960mT.A00(((double) i6) * d);
                Rect rect = rectArr[i4];
                if (i != 1) {
                    rect.top = A00;
                    rect.bottom = A002;
                } else if (!z) {
                    rect.left = A00;
                    rect.right = A002;
                } else {
                    rect.left = A002;
                    rect.right = A00;
                }
                i4 = i6;
            }
        }
        return rectArr;
    }
}
