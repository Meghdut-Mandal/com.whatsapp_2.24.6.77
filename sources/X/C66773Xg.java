package X;

import android.text.InputFilter;
import android.text.Spanned;
import java.lang.ref.WeakReference;

/* renamed from: X.3Xg  reason: invalid class name and case insensitive filesystem */
public class C66773Xg implements InputFilter {
    public final WeakReference A00;

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        AnonymousClass6YP r0 = (AnonymousClass6YP) this.A00.get();
        if (r0 == null || r0.A0H == null) {
            return null;
        }
        return "";
    }

    public C66773Xg(AnonymousClass6YP r2) {
        this.A00 = AnonymousClass001.A0F(r2);
    }
}
