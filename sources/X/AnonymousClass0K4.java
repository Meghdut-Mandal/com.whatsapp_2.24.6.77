package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.0K4  reason: invalid class name */
public class AnonymousClass0K4 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08060a8();
    public List A00;
    public final int A01;

    public AnonymousClass0K4(int i, List list) {
        this.A01 = i;
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A01);
        AnonymousClass0Z9.A0E(parcel, this.A00, 2, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
