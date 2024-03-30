package X;

import android.view.View;

/* renamed from: X.5ZK  reason: invalid class name */
public abstract class AnonymousClass5ZK {
    public static int A00(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size < i) {
            return size;
        }
        return i;
    }
}
