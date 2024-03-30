package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9u8  reason: invalid class name and case insensitive filesystem */
public class C206869u8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(31);
    public final String A00;
    public final List A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }

    public C206869u8(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public C206869u8(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.A00 = readString;
        ArrayList A0I = AnonymousClass001.A0I();
        this.A01 = A0I;
        parcel.readStringList(A0I);
    }
}
