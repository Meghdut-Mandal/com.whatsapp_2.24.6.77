package X;

import android.os.Parcel;

/* renamed from: X.8FJ  reason: invalid class name */
public abstract class AnonymousClass8FJ extends C165957uR implements B5D {
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            e(C165957uR.A00(parcel));
            return true;
        } else if (i == 3) {
            c(C165957uR.A00(parcel));
            return true;
        } else if (i == 4) {
            d(C165957uR.A00(parcel));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            b(C165957uR.A00(parcel));
            return true;
        }
    }

    public AnonymousClass8FJ() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }
}
