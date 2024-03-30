package X;

import android.os.BadParcelableException;
import android.os.Parcel;

/* renamed from: X.0Yk  reason: invalid class name and case insensitive filesystem */
public final class C07580Yk {
    public static final ClassLoader A00 = C07580Yk.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(AnonymousClass000.A0r("Parcel data not fully consumed, unread size: ", AnonymousClass000.A0u(), dataAvail));
        }
    }
}
