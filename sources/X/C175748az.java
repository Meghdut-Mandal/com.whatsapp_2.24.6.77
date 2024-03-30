package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8az  reason: invalid class name and case insensitive filesystem */
public final class C175748az extends C207249un {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(25);

    public int describeContents() {
        return 0;
    }

    public C175748az(Parcel parcel) {
        A0D(parcel);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ BANK:");
        A0u.append(super.toString());
        return AnonymousClass000.A0q(" ]", A0u);
    }

    public C175748az(C202159l8 r1, int i, int i2, long j, long j2) {
        C18740tg.A06(r1);
        this.A07 = r1;
        this.A05 = j;
        this.A06 = j2;
        this.A00 = i2;
        this.A01 = i;
    }
}
