package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9uP  reason: invalid class name and case insensitive filesystem */
public class C207009uP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(8);
    public String A00;
    public String A01;
    public final C206899uB A02;
    public final C206979uM A03;
    public final C206979uM A04;
    public final C206979uM A05;
    public final C206979uM A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public int describeContents() {
        return 0;
    }

    public int A00() {
        List list = this.A09;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += ((C206959uJ) list.get(i2)).A01;
        }
        return i;
    }

    public String A01() {
        List list = this.A09;
        if (list.isEmpty()) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((C206959uJ) list.get(i)).A04;
        }
        return AnonymousClass14B.A08(", ", strArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeList(this.A09);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A08);
    }

    public C207009uP(Parcel parcel) {
        this.A01 = C90514aH.A0u(parcel);
        ArrayList A0I = AnonymousClass001.A0I();
        this.A09 = A0I;
        parcel.readList(A0I, C206959uJ.class.getClassLoader());
        Class<C206979uM> cls = C206979uM.class;
        Parcelable A0H = C36411kG.A0H(parcel, cls);
        C18740tg.A06(A0H);
        this.A05 = (C206979uM) A0H;
        this.A06 = (C206979uM) C36411kG.A0H(parcel, cls);
        this.A03 = (C206979uM) C36411kG.A0H(parcel, cls);
        this.A04 = (C206979uM) C36411kG.A0H(parcel, cls);
        this.A00 = parcel.readString();
        this.A07 = parcel.readString();
        this.A02 = (C206899uB) C36411kG.A0H(parcel, C206899uB.class);
        this.A08 = parcel.readString();
    }

    public C207009uP(C206899uB r1, C206979uM r2, C206979uM r3, C206979uM r4, C206979uM r5, String str, String str2, String str3, String str4, List list) {
        this.A01 = str;
        this.A09 = list;
        this.A05 = r2;
        this.A06 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = str2;
        this.A02 = r1;
        this.A07 = str3;
        this.A08 = str4;
    }
}
