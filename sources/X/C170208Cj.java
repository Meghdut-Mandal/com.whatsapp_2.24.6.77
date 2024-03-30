package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.8Cj  reason: invalid class name and case insensitive filesystem */
public final class C170208Cj extends C10440eF implements C16780q5 {
    public static final C170208Cj A01 = new C170208Cj(Status.A09);
    public static final Parcelable.Creator CREATOR = new C204549qB();
    public final Status A00;

    public final Status BHx() {
        return this.A00;
    }

    public C170208Cj(Status status) {
        this.A00 = status;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A00, 1, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
