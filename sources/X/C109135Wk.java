package X;

import android.view.KeyEvent;

/* renamed from: X.5Wk  reason: invalid class name and case insensitive filesystem */
public abstract class C109135Wk {
    public static final long A00(int i) {
        return (((long) i) << 32) | (((long) 0) & 4294967295L);
    }

    public static long A01(KeyEvent keyEvent) {
        return A00(keyEvent.getKeyCode());
    }
}
