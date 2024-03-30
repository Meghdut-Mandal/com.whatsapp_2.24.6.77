package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6c0  reason: invalid class name and case insensitive filesystem */
public class C135026c0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(12);
    public String A00;
    public Map A01;
    public String A02;
    public final C135026c0 A03;
    public final String A04;
    public final String A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C135026c0 r5 = (C135026c0) obj;
            if (!Objects.equals(this.A00, r5.A00) || !Objects.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        String str2 = this.A00;
        this.A02 = str2;
        C135026c0 r0 = this.A03;
        if (r0 == null) {
            return str2;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C36351kA.A1K(r0, A0u);
        A0u.append('/');
        String A0q = AnonymousClass000.A0q(this.A02, A0u);
        this.A02 = A0q;
        return A0q;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A03, i);
    }

    public C135026c0(C135026c0 r3, String str, String str2) {
        Map map;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = AnonymousClass000.A0p(":", str2, AnonymousClass000.A0v(str));
        this.A03 = r3;
        if (r3 != null && (map = r3.A01) != null) {
            this.A01 = new HashMap(map);
        }
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A03;
        A0M[1] = this.A00;
        return Objects.hash(A0M);
    }

    public C135026c0(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = (C135026c0) C36411kG.A0H(parcel, C135026c0.class);
    }
}
