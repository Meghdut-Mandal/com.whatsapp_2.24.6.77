package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.8Cc  reason: invalid class name and case insensitive filesystem */
public final class C170138Cc extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204599qG();
    public ParcelFileDescriptor A00;
    public ParcelFileDescriptor A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Uri A07;
    public C170178Cg A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public byte[] A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C170138Cc) {
                C170138Cc r6 = (C170138Cc) obj;
                if (!AnonymousClass0QM.A00(Long.valueOf(this.A03), Long.valueOf(r6.A03)) || !AnonymousClass0QM.A00(Integer.valueOf(this.A02), Integer.valueOf(r6.A02)) || !Arrays.equals(this.A0D, r6.A0D) || !AnonymousClass0QM.A00(this.A00, r6.A00) || !AnonymousClass0QM.A00(this.A09, r6.A09) || !AnonymousClass0QM.A00(Long.valueOf(this.A04), Long.valueOf(r6.A04)) || !AnonymousClass0QM.A00(this.A01, r6.A01) || !AnonymousClass0QM.A00(this.A07, r6.A07) || !AnonymousClass0QM.A00(Long.valueOf(this.A05), Long.valueOf(r6.A05)) || !AnonymousClass0QM.A00(Boolean.valueOf(this.A0C), Boolean.valueOf(r6.A0C)) || !AnonymousClass0QM.A00(this.A08, r6.A08) || !AnonymousClass0QM.A00(Long.valueOf(this.A06), Long.valueOf(r6.A06)) || !AnonymousClass0QM.A00(this.A0A, r6.A0A) || !AnonymousClass0QM.A00(this.A0B, r6.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[14];
        C90474aD.A1S(objArr, this.A03);
        AnonymousClass000.A1K(objArr, this.A02);
        C36331k8.A1V(objArr, Arrays.hashCode(this.A0D));
        objArr[3] = this.A00;
        objArr[4] = this.A09;
        objArr[5] = Long.valueOf(this.A04);
        objArr[6] = this.A01;
        objArr[7] = this.A07;
        objArr[8] = Long.valueOf(this.A05);
        objArr[9] = Boolean.valueOf(this.A0C);
        objArr[10] = this.A08;
        objArr[11] = Long.valueOf(this.A06);
        objArr[12] = this.A0A;
        return AnonymousClass000.A0M(this.A0B, objArr, 13);
    }

    public C170138Cc(Uri uri, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, C170178Cg r6, String str, String str2, String str3, byte[] bArr, int i, long j, long j2, long j3, long j4, boolean z) {
        this.A03 = j;
        this.A02 = i;
        this.A0D = bArr;
        this.A00 = parcelFileDescriptor;
        this.A09 = str;
        this.A04 = j2;
        this.A01 = parcelFileDescriptor2;
        this.A07 = uri;
        this.A05 = j3;
        this.A0C = z;
        this.A08 = r6;
        this.A06 = j4;
        this.A0A = str2;
        this.A0B = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A09(parcel, 1, this.A03);
        AnonymousClass0Z9.A08(parcel, 2, this.A02);
        AnonymousClass0Z9.A0F(parcel, this.A0D, 3, false);
        AnonymousClass0Z9.A0B(parcel, this.A00, 4, i, false);
        AnonymousClass0Z9.A0C(parcel, this.A09, 5, false);
        AnonymousClass0Z9.A09(parcel, 6, this.A04);
        AnonymousClass0Z9.A0B(parcel, this.A01, 7, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A07, 8, i, false);
        AnonymousClass0Z9.A09(parcel, 9, this.A05);
        AnonymousClass0Z9.A0A(parcel, 10, this.A0C);
        AnonymousClass0Z9.A0B(parcel, this.A08, 11, i, false);
        AnonymousClass0Z9.A09(parcel, 12, this.A06);
        AnonymousClass0Z9.A0C(parcel, this.A0A, 13, false);
        AnonymousClass0Z9.A0C(parcel, this.A0B, 14, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C170138Cc() {
        this.A04 = -1;
        this.A05 = 0;
        this.A0C = false;
        this.A06 = 0;
    }
}
