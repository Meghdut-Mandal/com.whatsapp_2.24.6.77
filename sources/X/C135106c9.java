package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.6c9  reason: invalid class name and case insensitive filesystem */
public class C135106c9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(22);
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public byte[] A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final long A0E;
    public final String A0F;
    public final String A0G;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C135106c9 r7 = (C135106c9) obj;
            if (!this.A0F.equals(r7.A0F) || this.A0E != r7.A0E || this.A0D != r7.A0D || this.A09 != r7.A09 || !this.A0G.equals(r7.A0G) || this.A0A != r7.A0A || this.A0C != r7.A0C || this.A0B != r7.A0B || !C1901797e.A00(this.A05, r7.A05) || !C1901797e.A00(this.A01, r7.A01) || !C1901797e.A00(this.A06, r7.A06) || !Arrays.equals(this.A08, r7.A08) || this.A00 != r7.A00 || !C1901797e.A00(this.A04, r7.A04) || !C1901797e.A00(this.A03, r7.A03) || !C1901797e.A00(this.A02, r7.A02) || this.A07 != r7.A07) {
                return false;
            }
        }
        return true;
    }

    public static C135106c9 A00(C100044uN r20, boolean z) {
        C100044uN r5 = r20;
        String str = r5.id_;
        long j = r5.fileLength_;
        int i = r5.width_;
        int i2 = r5.height_;
        C135106c9 r8 = new C135106c9(str, r5.mimetype_, (String) null, (String) null, (String) null, i, i2, r5.placeholderArgb_, r5.textArgb_, r5.subtextArgb_, j);
        if (z) {
            C99994uI r7 = r5.mediaData_;
            if (r7 == null) {
                r7 = C99994uI.DEFAULT_INSTANCE;
            }
            if ((r7.bitField0_ & 1) != 0) {
                byte[] A062 = r7.mediaKey_.A06();
                long j2 = r7.mediaKeyTimestamp_;
                String encodeToString = Base64.encodeToString(r7.fileSha256_.A06(), 2);
                String encodeToString2 = Base64.encodeToString(r7.fileEncSha256_.A06(), 2);
                String str2 = r7.directPath_;
                r8.A08 = A062;
                r8.A00 = j2;
                r8.A04 = encodeToString;
                r8.A03 = encodeToString2;
                r8.A02 = str2;
                r8.A07 = true;
            }
        }
        return r8;
    }

    public C100044uN A01() {
        C99994uI r3;
        if (!this.A07 || this.A08 == null) {
            r3 = null;
        } else {
            AnonymousClass8NN A0p = C99994uI.DEFAULT_INSTANCE.A0p();
            AnonymousClass8I5 A0O = C90474aD.A0O(A0p, this.A08);
            C99994uI r1 = (C99994uI) A0p.A00;
            r1.bitField0_ |= 1;
            r1.mediaKey_ = A0O;
            long j = this.A00;
            C99994uI r12 = (C99994uI) C90524aI.A0H(A0p);
            r12.bitField0_ |= 2;
            r12.mediaKeyTimestamp_ = j;
            String str = this.A02;
            C99994uI r13 = (C99994uI) C90524aI.A0H(A0p);
            str.getClass();
            r13.bitField0_ |= 16;
            r13.directPath_ = str;
            AnonymousClass8I5 A0O2 = C90474aD.A0O(A0p, Base64.decode(this.A04, 2));
            C99994uI r14 = (C99994uI) A0p.A00;
            r14.bitField0_ |= 4;
            r14.fileSha256_ = A0O2;
            AnonymousClass8I5 A0O3 = C90474aD.A0O(A0p, Base64.decode(this.A03, 2));
            C99994uI r15 = (C99994uI) A0p.A00;
            r15.bitField0_ |= 8;
            r15.fileEncSha256_ = A0O3;
            r3 = (C99994uI) A0p.A0R();
        }
        AnonymousClass8NN A0p2 = C100044uN.DEFAULT_INSTANCE.A0p();
        String str2 = this.A0F;
        C100044uN r16 = (C100044uN) C90524aI.A0H(A0p2);
        str2.getClass();
        r16.bitField0_ |= 1;
        r16.id_ = str2;
        long j2 = this.A0E;
        C100044uN r17 = (C100044uN) C90524aI.A0H(A0p2);
        r17.bitField0_ |= 2;
        r17.fileLength_ = j2;
        int i = this.A0D;
        C100044uN r18 = (C100044uN) C90524aI.A0H(A0p2);
        r18.bitField0_ |= 4;
        r18.width_ = i;
        int i2 = this.A09;
        C100044uN r19 = (C100044uN) C90524aI.A0H(A0p2);
        r19.bitField0_ |= 8;
        r19.height_ = i2;
        String str3 = this.A0G;
        C100044uN r110 = (C100044uN) C90524aI.A0H(A0p2);
        str3.getClass();
        r110.bitField0_ |= 16;
        r110.mimetype_ = str3;
        int i3 = this.A0A;
        C100044uN r111 = (C100044uN) C90524aI.A0H(A0p2);
        r111.bitField0_ |= 32;
        r111.placeholderArgb_ = i3;
        int i4 = this.A0C;
        C100044uN r112 = (C100044uN) C90524aI.A0H(A0p2);
        r112.bitField0_ |= 64;
        r112.textArgb_ = i4;
        int i5 = this.A0B;
        C100044uN r113 = (C100044uN) C90524aI.A0H(A0p2);
        r113.bitField0_ |= 128;
        r113.subtextArgb_ = i5;
        if (r3 != null) {
            C100044uN r114 = (C100044uN) C90524aI.A0H(A0p2);
            r114.mediaData_ = r3;
            r114.bitField0_ |= 256;
        }
        return (C100044uN) A0p2.A0R();
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        objArr[0] = this.A0F;
        C36421kH.A1P(objArr, this.A0E);
        C36331k8.A1V(objArr, this.A0D);
        C36341k9.A1T(objArr, this.A09);
        objArr[4] = this.A0G;
        C36371kC.A1S(objArr, this.A0A);
        C36381kD.A1T(objArr, this.A0C);
        C36361kB.A1V(objArr, this.A0B);
        objArr[8] = this.A05;
        objArr[9] = this.A01;
        objArr[10] = this.A06;
        objArr[11] = this.A08;
        objArr[12] = Long.valueOf(this.A00);
        objArr[13] = this.A04;
        objArr[14] = this.A03;
        return AnonymousClass000.A0M(this.A02, objArr, 15);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0F);
        parcel.writeLong(this.A0E);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0B);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        byte[] bArr = this.A08;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.A08);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public C135106c9(Parcel parcel) {
        this.A0F = C90514aH.A0u(parcel);
        this.A0E = parcel.readLong();
        this.A0D = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0G = C90514aH.A0u(parcel);
        this.A0A = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A06 = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.A08 = bArr;
            parcel.readByteArray(bArr);
        }
        this.A00 = parcel.readLong();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A07 = AnonymousClass000.A1O(parcel.readInt());
    }

    public File A02(File file) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A0F);
        return C90464aC.A0K(file, ".webp", A0u);
    }

    public String toString() {
        return "PaymentBackgroundMetadata{}";
    }

    public C135106c9(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, long j) {
        this.A0F = str;
        this.A0E = j;
        this.A0D = i;
        this.A09 = i2;
        this.A0G = str2;
        this.A0A = i3;
        this.A0C = i4;
        this.A0B = i5;
        this.A05 = str3;
        this.A01 = str4;
        this.A06 = str5;
    }
}
