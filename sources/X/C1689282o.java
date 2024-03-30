package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.82o  reason: invalid class name and case insensitive filesystem */
public final class C1689282o extends C209289zl {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(25);
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1689282o r5 = (C1689282o) obj;
            if (!Util.A0E(this.A00, r5.A00) || !Util.A0E(this.A01, r5.A01) || !Util.A0E(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public C1689282o(String str, String str2) {
        super("COMM");
        this.A01 = "und";
        this.A00 = str;
        this.A02 = str2;
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
        A0u.append(": language=");
        A0u.append(this.A01);
        A0u.append(", description=");
        return AnonymousClass000.A0q(this.A00, A0u);
    }

    public C1689282o(Parcel parcel) {
        super("COMM");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
