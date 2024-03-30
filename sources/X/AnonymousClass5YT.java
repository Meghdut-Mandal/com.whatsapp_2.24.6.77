package X;

import android.view.View;

/* renamed from: X.5YT  reason: invalid class name */
public abstract class AnonymousClass5YT {
    public static final long A00(int i, int i2) {
        AnonymousClass6F0 r0;
        int i3;
        AnonymousClass6F0 r02;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            r0 = C98234r6.A00;
        } else if (mode == 1073741824) {
            r0 = C98214r4.A00;
        } else {
            throw AnonymousClass001.A09("Unknown width spec mode.");
        }
        int i4 = r0.A01.A01;
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        int A02 = C15040mb.A02(size, 0, i4);
        int i6 = Integer.MAX_VALUE;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = A02;
            A02 = 0;
        } else if (mode2 == 0) {
            A02 = 0;
            i3 = Integer.MAX_VALUE;
        } else if (mode2 == 1073741824) {
            i3 = A02;
        } else {
            throw AnonymousClass001.A09("Unknown width spec mode.");
        }
        int mode3 = View.MeasureSpec.getMode(i2);
        if (mode3 == Integer.MIN_VALUE || mode3 == 0) {
            r02 = C98234r6.A00;
        } else if (mode3 == 1073741824) {
            r02 = C98214r4.A00;
        } else {
            throw AnonymousClass001.A09("Unknown width spec mode.");
        }
        int i7 = r02.A01.A01;
        int mode4 = View.MeasureSpec.getMode(i2);
        int A022 = C15040mb.A02(View.MeasureSpec.getSize(i2), 0, i7);
        if (mode4 == Integer.MIN_VALUE) {
            i6 = A022;
        } else if (mode4 != 0) {
            if (mode4 == 1073741824) {
                i6 = A022;
                i5 = A022;
            } else {
                throw AnonymousClass001.A09("Unknown height spec mode.");
            }
        }
        return AnonymousClass6M5.A00.A00(A02, i3, i5, i6);
    }
}
