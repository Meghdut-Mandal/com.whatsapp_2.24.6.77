package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: X.9uJ  reason: invalid class name and case insensitive filesystem */
public class C206959uJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(10);
    public String A00;
    public final int A01;
    public final C206979uM A02;
    public final C206979uM A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public int describeContents() {
        return 0;
    }

    public String A00() {
        String str = this.A05;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = this.A06;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A00);
    }

    public C206959uJ(Parcel parcel) {
        this.A06 = C90514aH.A0u(parcel);
        this.A05 = parcel.readString();
        this.A04 = C90514aH.A0u(parcel);
        Class<C206979uM> cls = C206979uM.class;
        Parcelable A0H = C36411kG.A0H(parcel, cls);
        C18740tg.A06(A0H);
        this.A02 = (C206979uM) A0H;
        this.A03 = (C206979uM) C36411kG.A0H(parcel, cls);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readString();
    }

    public C206959uJ(C206979uM r1, C206979uM r2, String str, String str2, String str3, String str4, int i) {
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = str4;
    }
}
