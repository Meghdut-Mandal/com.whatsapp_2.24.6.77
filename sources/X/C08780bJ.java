package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0bJ  reason: invalid class name and case insensitive filesystem */
public final class C08780bJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18440tA(8);
    public int A00;
    public String A01 = null;
    public ArrayList A02;
    public ArrayList A03;
    public ArrayList A04 = AnonymousClass001.A0I();
    public ArrayList A05 = AnonymousClass001.A0I();
    public ArrayList A06;
    public C08790bK[] A07;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeTypedArray(this.A07, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A04);
        parcel.writeTypedList(this.A05);
        parcel.writeTypedList(this.A06);
    }

    public C08780bJ(Parcel parcel) {
        this.A02 = parcel.createStringArrayList();
        this.A03 = parcel.createStringArrayList();
        this.A07 = (C08790bK[]) parcel.createTypedArray(C08790bK.CREATOR);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A04 = parcel.createStringArrayList();
        this.A05 = parcel.createTypedArrayList(C08710bC.CREATOR);
        this.A06 = parcel.createTypedArrayList(C08750bG.CREATOR);
    }

    public C08780bJ() {
    }
}
