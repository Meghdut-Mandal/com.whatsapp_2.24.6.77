package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9u0  reason: invalid class name and case insensitive filesystem */
public final class C206809u0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(5);
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final long A0J;
    public final AXf A0K;
    public final C206449tQ A0L;
    public final C206749tu A0M;
    public final Class A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final List A0U;
    public final byte[] A0V;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C206809u0 r7 = (C206809u0) obj;
            int i2 = this.A00;
            if ((i2 == 0 || (i = r7.A00) == 0 || i2 == i) && this.A0G == r7.A0G && this.A0D == r7.A0D && this.A04 == r7.A04 && this.A0C == r7.A0C && this.A0A == r7.A0A && this.A0J == r7.A0J && this.A0I == r7.A0I && this.A09 == r7.A09 && this.A0E == r7.A0E && this.A0H == r7.A0H && this.A06 == r7.A06 && this.A0F == r7.A0F && this.A0B == r7.A0B && this.A07 == r7.A07 && this.A08 == r7.A08 && this.A03 == r7.A03 && Float.compare(this.A01, r7.A01) == 0 && Float.compare(this.A02, r7.A02) == 0 && C197059b4.A00(this.A0N, r7.A0N) && C197059b4.A00(this.A0Q, r7.A0Q) && C197059b4.A00(this.A0R, r7.A0R) && C197059b4.A00(this.A0O, r7.A0O) && C197059b4.A00(this.A0P, r7.A0P) && C197059b4.A00(this.A0T, r7.A0T) && C197059b4.A00(this.A0S, r7.A0S) && Arrays.equals(this.A0V, r7.A0V) && C197059b4.A00(this.A0L, r7.A0L) && C197059b4.A00(this.A0M, r7.A0M) && C197059b4.A00(this.A0K, r7.A0K)) {
                List list = this.A0U;
                int size = list.size();
                List list2 = r7.A0U;
                if (size == list2.size()) {
                    int i3 = 0;
                    while (i3 < list.size()) {
                        if (Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                            i3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A022 = ((((((((((((((C90474aD.A02((C90474aD.A02((((((((((((((((((((((((((((((527 + C36341k9.A09(this.A0Q)) * 31) + C165577te.A06(this.A0R)) * 31) + C36341k9.A09(this.A0S)) * 31) + this.A0G) * 31) + this.A0D) * 31) + this.A04) * 31) + this.A0C) * 31) + C36341k9.A09(this.A0O)) * 31) + AnonymousClass000.A0H(this.A0L)) * 31) + C36341k9.A09(this.A0P)) * 31) + C36341k9.A09(this.A0T)) * 31) + this.A0A) * 31) + ((int) this.A0J)) * 31) + this.A0I) * 31) + this.A09) * 31, this.A01) + this.A0E) * 31, this.A02) + this.A0H) * 31) + this.A06) * 31) + this.A0F) * 31) + this.A0B) * 31) + this.A07) * 31) + this.A08) * 31) + this.A03) * 31) + C36411kG.A09(this.A0N);
        this.A00 = A022;
        return A022;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0S);
        parcel.writeInt(this.A0G);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A0C);
        parcel.writeString(this.A0O);
        int i2 = 0;
        parcel.writeParcelable(this.A0L, 0);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0T);
        parcel.writeInt(this.A0A);
        List list = this.A0U;
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) list.get(i3));
        }
        parcel.writeParcelable(this.A0K, 0);
        parcel.writeLong(this.A0J);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A09);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0E);
        parcel.writeFloat(this.A02);
        byte[] bArr = this.A0V;
        if (bArr != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0H);
        parcel.writeParcelable(this.A0M, i);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A03);
    }

    public C206809u0(Parcel parcel) {
        byte[] bArr;
        this.A0Q = parcel.readString();
        this.A0R = parcel.readString();
        this.A0S = parcel.readString();
        this.A0G = parcel.readInt();
        this.A0D = parcel.readInt();
        int readInt = parcel.readInt();
        this.A04 = readInt;
        int readInt2 = parcel.readInt();
        this.A0C = readInt2;
        this.A05 = readInt2 != -1 ? readInt2 : readInt;
        this.A0O = parcel.readString();
        this.A0L = (C206449tQ) C36411kG.A0H(parcel, C206449tQ.class);
        this.A0P = parcel.readString();
        this.A0T = parcel.readString();
        this.A0A = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.A0U = C36441kJ.A14(readInt3);
        for (int i = 0; i < readInt3; i++) {
            List list = this.A0U;
            byte[] createByteArray = parcel.createByteArray();
            Objects.requireNonNull(createByteArray);
            list.add(createByteArray);
        }
        AXf aXf = (AXf) C36411kG.A0H(parcel, AXf.class);
        this.A0K = aXf;
        this.A0J = parcel.readLong();
        this.A0I = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0E = parcel.readInt();
        this.A02 = parcel.readFloat();
        Class cls = null;
        if (AnonymousClass000.A1P(parcel.readInt())) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.A0V = bArr;
        this.A0H = parcel.readInt();
        this.A0M = (C206749tu) C36411kG.A0H(parcel, C206749tu.class);
        this.A06 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0N = aXf != null ? A34.class : cls;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Format(");
        A0u.append(this.A0Q);
        A0u.append(", ");
        A0u.append(this.A0R);
        A0u.append(", ");
        A0u.append(this.A0P);
        A0u.append(", ");
        A0u.append(this.A0T);
        A0u.append(", ");
        A0u.append(this.A0O);
        A0u.append(", ");
        A0u.append(this.A05);
        A0u.append(", ");
        A0u.append(this.A0S);
        A0u.append(", [");
        A0u.append(this.A0I);
        A0u.append(", ");
        A0u.append(this.A09);
        A0u.append(", ");
        A0u.append(this.A01);
        A0u.append("], [");
        A0u.append(this.A06);
        A0u.append(", ");
        A0u.append(this.A0F);
        return AnonymousClass000.A0q("])", A0u);
    }
}
