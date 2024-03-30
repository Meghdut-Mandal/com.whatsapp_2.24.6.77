package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.8Cd  reason: invalid class name and case insensitive filesystem */
public final class C170148Cd extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204529q9();
    public C170158Ce A00;
    public byte[] A01;
    public boolean A02;
    public int[] A03;
    public int[] A04;
    public C170188Ch[] A05;
    public String[] A06;
    public byte[][] A07;
    public final AnonymousClass8DQ A08;

    public C170148Cd(C170158Ce r2, byte[] bArr, int[] iArr, int[] iArr2, C170188Ch[] r6, String[] strArr, byte[][] bArr2, boolean z) {
        this.A00 = r2;
        this.A01 = bArr;
        this.A03 = iArr;
        this.A06 = strArr;
        this.A08 = null;
        this.A04 = iArr2;
        this.A07 = bArr2;
        this.A05 = r6;
        this.A02 = z;
    }

    public C170148Cd(AnonymousClass8DQ r3, C170158Ce r4) {
        this.A00 = r4;
        this.A08 = r3;
        this.A03 = null;
        this.A06 = null;
        this.A04 = null;
        this.A07 = null;
        this.A05 = null;
        this.A02 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C170148Cd) {
                C170148Cd r5 = (C170148Cd) obj;
                if (!AnonymousClass0QM.A00(this.A00, r5.A00) || !Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A03, r5.A03) || !Arrays.equals(this.A06, r5.A06) || !AnonymousClass0QM.A00(this.A08, r5.A08) || !Arrays.equals(this.A04, r5.A04) || !Arrays.deepEquals(this.A07, r5.A07) || !Arrays.equals(this.A05, r5.A05) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = this.A00;
        objArr[1] = this.A01;
        objArr[2] = this.A03;
        objArr[3] = this.A06;
        objArr[4] = this.A08;
        objArr[5] = null;
        objArr[6] = null;
        objArr[7] = this.A04;
        objArr[8] = this.A07;
        objArr[9] = this.A05;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A02), objArr, 10);
    }

    public final String toString() {
        String str;
        StringBuilder A0i = C90524aI.A0i("LogEventParcelable[");
        A0i.append(this.A00);
        A0i.append(", LogEventBytes: ");
        byte[] bArr = this.A01;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        A0i.append(str);
        A0i.append(", TestCodes: ");
        A0i.append(Arrays.toString(this.A03));
        A0i.append(", MendelPackages: ");
        C90514aH.A1T(A0i, this.A06);
        A0i.append(", LogEvent: ");
        A0i.append(this.A08);
        A0i.append(", ExtensionProducer: ");
        A0i.append((Object) null);
        A0i.append(", VeProducer: ");
        A0i.append((Object) null);
        A0i.append(", ExperimentIDs: ");
        A0i.append(Arrays.toString(this.A04));
        A0i.append(", ExperimentTokens: ");
        C90514aH.A1T(A0i, this.A07);
        A0i.append(", ExperimentTokensParcelables: ");
        C90514aH.A1T(A0i, this.A05);
        A0i.append(", AddPhenotypeExperimentTokens: ");
        A0i.append(this.A02);
        return C90474aD.A0g(A0i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A00, 2, i, false);
        AnonymousClass0Z9.A0F(parcel, this.A01, 3, false);
        int[] iArr = this.A03;
        if (iArr != null) {
            int A022 = AnonymousClass0Z9.A02(parcel, 4);
            parcel.writeIntArray(iArr);
            AnonymousClass0Z9.A07(parcel, A022);
        }
        AnonymousClass0Z9.A0H(parcel, this.A06, 5);
        int[] iArr2 = this.A04;
        if (iArr2 != null) {
            int A023 = AnonymousClass0Z9.A02(parcel, 6);
            parcel.writeIntArray(iArr2);
            AnonymousClass0Z9.A07(parcel, A023);
        }
        AnonymousClass0Z9.A0I(parcel, this.A07, 7);
        AnonymousClass0Z9.A0A(parcel, 8, this.A02);
        AnonymousClass0Z9.A0G(parcel, this.A05, 9, i);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
