package X;

import android.graphics.BitmapFactory;

/* renamed from: X.3Dj  reason: invalid class name and case insensitive filesystem */
public class C61773Dj {
    public int A00 = 1;
    public BitmapFactory.Options A01;
    public boolean A02;

    public String toString() {
        String str;
        if (this.A00 == 0) {
            str = "Cancel";
        } else {
            str = "Allow";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("thread state = ");
        A0u.append(str);
        A0u.append(", options = ");
        return AnonymousClass000.A0o(this.A01, A0u);
    }
}
