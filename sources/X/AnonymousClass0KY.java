package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0KY  reason: invalid class name */
public final class AnonymousClass0KY extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08490ap();
    public final byte[] A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0KY) {
            AnonymousClass0KY r4 = (AnonymousClass0KY) obj;
            if (!Arrays.equals(this.A00, r4.A00) || !Arrays.equals(this.A01, r4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0KY(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A00;
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0F(parcel, this.A00, 1, false);
        AnonymousClass0Z9.A0F(parcel, this.A01, 2, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
