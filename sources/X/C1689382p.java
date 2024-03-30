package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.82p  reason: invalid class name and case insensitive filesystem */
public final class C1689382p extends C209289zl {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(26);
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1689382p r5 = (C1689382p) obj;
            if (!Util.A0E(this.A00, r5.A00) || !Util.A0E(this.A01, r5.A01) || !Util.A0E(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public C1689382p(String str, String str2, String str3) {
        super("----");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public int hashCode() {
        int i = 0;
        int A012 = (C165617ti.A01(C165577te.A06(this.A01)) + C165577te.A06(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A012 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append(": domain=");
        A0u.append(this.A01);
        A0u.append(", description=");
        return AnonymousClass000.A0q(this.A00, A0u);
    }

    public C1689382p(Parcel parcel) {
        super("----");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
