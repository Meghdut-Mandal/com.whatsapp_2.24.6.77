package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.82n  reason: invalid class name and case insensitive filesystem */
public final class C1689182n extends C209289zl {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(27);
    public final String A00;
    public final String A01;

    public C1689182n(String str, String str2) {
        super(str);
        this.A00 = null;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1689182n r5 = (C1689182n) obj;
            if (!this.A00.equals(r5.A00) || !Util.A0E(this.A00, r5.A00) || !Util.A0E(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A012 = (C165617ti.A01(this.A00.hashCode()) + C165577te.A06(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A012 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append(": description=");
        A0u.append(this.A00);
        A0u.append(": value=");
        return AnonymousClass000.A0q(this.A01, A0u);
    }

    public C1689182n(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
