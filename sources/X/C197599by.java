package X;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9by  reason: invalid class name and case insensitive filesystem */
public class C197599by {
    public final Map A00;
    public final Map A01;

    public C197599by(Parcel parcel) {
        HashMap A0J = AnonymousClass001.A0J();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A0J.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        this.A01 = A0J;
        HashMap A0J2 = AnonymousClass001.A0J();
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            A0J2.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        this.A00 = A0J2;
    }

    public C197599by() {
        this.A01 = AnonymousClass001.A0J();
        this.A00 = AnonymousClass001.A0J();
    }
}
