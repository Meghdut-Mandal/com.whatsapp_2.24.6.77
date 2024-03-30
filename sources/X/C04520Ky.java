package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.0Ky  reason: invalid class name and case insensitive filesystem */
public class C04520Ky extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08220aO();
    @Deprecated
    public final int A00;
    public final long A01;
    public final String A02;

    public C04520Ky(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public C04520Ky(String str, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = -1;
    }

    public static C04520Ky A00(String str, long j) {
        return new C04520Ky(str, j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C04520Ky) {
            C04520Ky r9 = (C04520Ky) obj;
            String str = this.A02;
            String str2 = r9.A02;
            if (str == null ? str2 == null : str.equals(str2)) {
                long j = this.A01;
                if (j == -1) {
                    j = (long) this.A00;
                }
                long j2 = r9.A01;
                if (j2 == -1) {
                    j2 = (long) r9.A00;
                }
                if (j == j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        AnonymousClass0UM r5 = new AnonymousClass0UM(this);
        r5.A00(this.A02, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        long j = this.A01;
        if (j == -1) {
            j = (long) this.A00;
        }
        r5.A00(Long.valueOf(j), "version");
        return r5.toString();
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A02;
        long j = this.A01;
        if (j == -1) {
            j = (long) this.A00;
        }
        return AnonymousClass000.A0L(Long.valueOf(j), A0M);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A02, 1, false);
        int i2 = this.A00;
        AnonymousClass0Z9.A08(parcel, 2, i2);
        long j = this.A01;
        if (j == -1) {
            j = (long) i2;
        }
        AnonymousClass0Z9.A09(parcel, 3, j);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
