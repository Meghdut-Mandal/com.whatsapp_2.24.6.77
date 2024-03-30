package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.8Bl  reason: invalid class name and case insensitive filesystem */
public final class C169968Bl extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205139rA();
    public final int A00;
    public final List A01;

    public C169968Bl(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A0E(parcel, this.A01, 3, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
