package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9uA  reason: invalid class name and case insensitive filesystem */
public class C206889uA implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(40);
    public final ArrayList A00;
    public final boolean A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeStringList(this.A00);
    }

    public C206889uA(ArrayList arrayList, boolean z) {
        this.A01 = z;
        this.A00 = arrayList;
    }

    public C206889uA(Parcel parcel) {
        this.A01 = C165567td.A1Y(parcel);
        this.A00 = parcel.createStringArrayList();
    }
}
