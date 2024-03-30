package X;

import android.os.Parcel;

/* renamed from: X.8bG  reason: invalid class name and case insensitive filesystem */
public final class C175908bG extends C175708av {
    public static final C205819sG CREATOR = new C205819sG();
    public long A00;
    public String A01;

    public String A05() {
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }
}
