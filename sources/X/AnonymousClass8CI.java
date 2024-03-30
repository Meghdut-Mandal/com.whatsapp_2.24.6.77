package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.8CI  reason: invalid class name */
public final class AnonymousClass8CI extends C10440eF {
    public static final AnonymousClass8CI A02 = new AnonymousClass8CI(1, 3);
    public static final AnonymousClass8CI A03 = new AnonymousClass8CI(1, 1);
    public static final AnonymousClass8CI A04 = new AnonymousClass8CI(1, 2);
    public static final Parcelable.Creator CREATOR = new C204799qa();
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8CI) {
                AnonymousClass8CI r5 = (AnonymousClass8CI) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] A1Q = C36441kJ.A1Q();
        if (A02.equals(this)) {
            str = "P2P_CLUSTER";
        } else if (A04.equals(this)) {
            str = "P2P_STAR";
        } else if (A03.equals(this)) {
            str = "P2P_POINT_TO_POINT";
        } else {
            str = "UNKNOWN";
        }
        A1Q[0] = str;
        AnonymousClass000.A1L(A1Q, this.A00, 1);
        AnonymousClass000.A1L(A1Q, this.A01, 2);
        return String.format(locale, "Strategy(%s){connectionType=%d, topology=%d}", A1Q);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 3, i2);
        AnonymousClass0Z9.A08(parcel, 4, this.A01);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CI(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A00);
        AnonymousClass000.A1K(A0M, this.A01);
        return Arrays.hashCode(A0M);
    }
}
