package X;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9bx  reason: invalid class name and case insensitive filesystem */
public class C197589bx {
    public long A00;
    public final Map A01;

    public C197589bx(Parcel parcel) {
        this.A00 = parcel.readLong();
        HashMap A0J = AnonymousClass001.A0J();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A0J.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        this.A01 = A0J;
    }

    public C197589bx() {
        this.A00 = 0;
        this.A01 = AnonymousClass001.A0J();
    }
}
