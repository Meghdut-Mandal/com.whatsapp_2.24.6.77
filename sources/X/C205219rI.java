package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.9rI  reason: invalid class name and case insensitive filesystem */
public final class C205219rI implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        ConnectionConfiguration connectionConfiguration = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                connectionConfiguration = (ConnectionConfiguration) AnonymousClass0ZA.A06(parcel, ConnectionConfiguration.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170038Bs(connectionConfiguration, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170038Bs[i];
    }
}
