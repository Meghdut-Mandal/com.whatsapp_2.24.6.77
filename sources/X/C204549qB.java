package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.9qB  reason: invalid class name and case insensitive filesystem */
public final class C204549qB implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        Status status = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                status = (Status) AnonymousClass0ZA.A06(parcel, Status.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170208Cj(status);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170208Cj[i];
    }
}
