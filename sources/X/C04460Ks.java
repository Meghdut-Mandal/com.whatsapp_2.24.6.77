package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Ks  reason: invalid class name and case insensitive filesystem */
public final class C04460Ks extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08130aF();
    public final int A00;
    public final AnonymousClass0LA A01;

    public C04460Ks(AnonymousClass0LA r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A01, 2, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04460Ks(AnonymousClass0LA r2) {
        this.A00 = 1;
        this.A01 = r2;
    }
}
