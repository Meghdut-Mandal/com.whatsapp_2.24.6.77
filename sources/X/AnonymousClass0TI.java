package X;

import android.net.Uri;
import java.util.Objects;

/* renamed from: X.0TI  reason: invalid class name */
public class AnonymousClass0TI {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Uri A03;
    public final boolean A04;

    @Deprecated
    public AnonymousClass0TI(Uri uri, int i, int i2, int i3, boolean z) {
        Objects.requireNonNull(uri);
        this.A03 = uri;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = z;
        this.A00 = i3;
    }
}
