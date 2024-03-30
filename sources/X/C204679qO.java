package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.9qO  reason: invalid class name and case insensitive filesystem */
public final class C204679qO implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        Status status = null;
        AnonymousClass8CD r2 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) AnonymousClass0ZA.A06(parcel, Status.CREATOR, readInt);
            } else if (c != 2) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r2 = (AnonymousClass8CD) AnonymousClass0ZA.A06(parcel, AnonymousClass8CD.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170218Ck(status, r2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170218Ck[i];
    }
}
