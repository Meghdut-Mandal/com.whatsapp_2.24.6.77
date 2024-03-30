package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.8Ck  reason: invalid class name and case insensitive filesystem */
public final class C170218Ck extends C10440eF implements C16780q5 {
    public static final Parcelable.Creator CREATOR = new C204679qO();
    public final Status A00;
    public final AnonymousClass8CD A01;

    public Status BHx() {
        return this.A00;
    }

    public C170218Ck(Status status, AnonymousClass8CD r2) {
        this.A00 = status;
        this.A01 = r2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A00, 1, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A01, 2, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
