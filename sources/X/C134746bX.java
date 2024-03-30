package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6bX  reason: invalid class name and case insensitive filesystem */
public final class C134746bX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134006aL();
    public final String A00;
    public final List A01;
    public final Map A02;
    public final Map A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134746bX) {
                C134746bX r5 = (C134746bX) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0o = C90474aD.A0o(parcel, this.A01);
        while (A0o.hasNext()) {
            parcel.writeParcelable((Parcelable) A0o.next(), i);
        }
        Map map = this.A02;
        parcel.writeInt(map.size());
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            parcel.writeSerializable((Serializable) A11.getKey());
            ((C134656bO) A11.getValue()).writeToParcel(parcel, i);
        }
        Map map2 = this.A03;
        parcel.writeInt(map2.size());
        Iterator A0y2 = AnonymousClass000.A0y(map2);
        while (A0y2.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(A0y2);
            ((C134606bJ) A112.getKey()).writeToParcel(parcel, i);
            parcel.writeSerializable((Serializable) A112.getValue());
        }
    }

    public int hashCode() {
        return C36401kF.A02(this.A03, C36351kA.A05(this.A02, C36351kA.A05(this.A01, C36421kH.A04(this.A00))));
    }

    public C134746bX(String str, List list, Map map, Map map2) {
        C36321k7.A0x(str, list);
        this.A00 = str;
        this.A01 = list;
        this.A02 = map;
        this.A03 = map2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VariantsDisplayData(name=");
        A0u.append(this.A00);
        A0u.append(", displayItems=");
        A0u.append(this.A01);
        A0u.append(", combinations=");
        A0u.append(this.A02);
        A0u.append(", firstExistingCombination=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
