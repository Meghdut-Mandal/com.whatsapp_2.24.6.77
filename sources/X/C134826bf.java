package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6bf  reason: invalid class name and case insensitive filesystem */
public final class C134826bf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134276am();
    public int A00;
    public ArrayList A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C134526bB A05;
    public final boolean A06;
    public final int A07;

    public C134826bf(C134526bB r2, ArrayList arrayList, int i, int i2, int i3, int i4, boolean z) {
        AnonymousClass00C.A0D(r2, 6);
        this.A03 = i;
        this.A07 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A06 = z;
        this.A05 = r2;
        this.A01 = arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134826bf) {
                C134826bf r5 = (C134826bf) obj;
                if (!(this.A03 == r5.A03 && this.A07 == r5.A07 && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A06 == r5.A06 && AnonymousClass00C.A0J(this.A05, r5.A05) && AnonymousClass00C.A0J(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeStringList(this.A01);
    }

    public int hashCode() {
        return C36351kA.A05(this.A05, C53202qw.A00(((((((this.A03 * 31) + this.A07) * 31) + this.A04) * 31) + this.A02) * 31, this.A06)) + AnonymousClass000.A0H(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RemoteEntityFilter(filterId=");
        A0u.append(this.A03);
        A0u.append(", filterViewIdRes=");
        A0u.append(this.A07);
        A0u.append(", filterNameStringRes=");
        A0u.append(this.A04);
        A0u.append(", filterDrawableRes=");
        A0u.append(this.A02);
        A0u.append(", isInternalOnly=");
        A0u.append(this.A06);
        A0u.append(", nuxListener=");
        A0u.append(this.A05);
        A0u.append(", searchHintList=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
