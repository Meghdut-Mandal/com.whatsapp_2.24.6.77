package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0Ki  reason: invalid class name and case insensitive filesystem */
public final class C04360Ki extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08560aw();
    public final long A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public final int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(this.A00);
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        return AnonymousClass000.A0M(this.A03, objArr, 3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C04360Ki) {
            C04360Ki r7 = (C04360Ki) obj;
            if (this.A00 != r7.A00 || !Arrays.equals(this.A01, r7.A01) || !Arrays.equals(this.A02, r7.A02) || !Arrays.equals(this.A03, r7.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C04360Ki(byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        this.A00 = j;
        AnonymousClass006.A01(bArr);
        this.A01 = bArr;
        AnonymousClass006.A01(bArr2);
        this.A02 = bArr2;
        AnonymousClass006.A01(bArr3);
        this.A03 = bArr3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A09(parcel, 1, this.A00);
        AnonymousClass0Z9.A0F(parcel, this.A01, 2, false);
        AnonymousClass0Z9.A0F(parcel, this.A02, 3, false);
        AnonymousClass0Z9.A0F(parcel, this.A03, 4, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
