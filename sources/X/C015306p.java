package X;

import android.os.Build;

/* renamed from: X.06p  reason: invalid class name and case insensitive filesystem */
public interface C015306p {
    @Deprecated
    public static final boolean A00;

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

    void setAutoSizeTextTypeWithDefaults(int i);

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        }
        A00 = z;
    }
}
