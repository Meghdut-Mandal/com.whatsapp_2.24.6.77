package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;

/* renamed from: X.0aP  reason: invalid class name and case insensitive filesystem */
public final class C08230aP implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Transport.A00(parcel.readString());
        } catch (C05180Nx e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Transport[i];
    }
}
