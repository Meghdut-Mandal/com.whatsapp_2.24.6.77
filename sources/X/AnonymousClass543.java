package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.543  reason: invalid class name */
public final class AnonymousClass543 extends C134986bw {
    public static final Parcelable.Creator CREATOR = new C163937r0(18);
    public Integer A00;
    public final String A01;

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeInt(C90484aE.A0B(this.A00));
    }

    public AnonymousClass543(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        AnonymousClass00C.A0B(readString);
        this.A01 = readString;
        this.A00 = Integer.valueOf(parcel.readInt());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass543(Integer num, String str, String str2, String str3) {
        super(str, str2);
        AnonymousClass00C.A0D(str3, 3);
        this.A01 = str3;
        this.A00 = num;
    }
}
