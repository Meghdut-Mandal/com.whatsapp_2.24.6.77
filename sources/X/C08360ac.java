package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ac  reason: invalid class name and case insensitive filesystem */
public final class C08360ac implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C05120Nn.A00(parcel.readString());
        } catch (AnonymousClass0O2 e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C05120Nn[i];
    }
}
