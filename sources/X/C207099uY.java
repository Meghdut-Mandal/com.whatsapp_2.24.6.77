package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9uY  reason: invalid class name and case insensitive filesystem */
public class C207099uY implements Parcelable {
    public static final C207099uY A0V = new C207099uY(new C199159en());
    public static final AnonymousClass7c0 CREATOR = C208819yt.A00;
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
    public final C206379tI A0K;
    public final C21709AXg A0L;
    public final C207029uR A0M;
    public final C206739tt A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final List A0T;
    public final byte[] A0U;

    public static C207099uY A00(String str) {
        C199159en r2 = new C199159en();
        r2.A0P = null;
        r2.A0R = str;
        r2.A0I = Long.MAX_VALUE;
        return new C207099uY(r2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C207099uY r7 = (C207099uY) obj;
            if (!(this.A04 == r7.A04 && this.A0D == r7.A0D && this.A0C == r7.A0C && this.A0A == r7.A0A && this.A0I == r7.A0I && this.A09 == r7.A09 && this.A01 == r7.A01 && this.A0E == r7.A0E && this.A02 == r7.A02 && this.A0H == r7.A0H && this.A05 == r7.A05 && this.A0F == r7.A0F && this.A0B == r7.A0B && this.A07 == r7.A07 && this.A08 == r7.A08 && this.A0J == r7.A0J && this.A0G == r7.A0G && Util.A0E(this.A0Q, r7.A0Q) && Util.A0E(this.A0R, r7.A0R) && this.A03 == r7.A03 && Util.A0E(this.A0P, r7.A0P) && Util.A0E(this.A0S, r7.A0S) && Util.A0E(this.A0O, r7.A0O) && Util.A0E(this.A0L, r7.A0L) && Util.A0E(this.A0M, r7.A0M) && Util.A0E(this.A0N, r7.A0N) && Arrays.equals(this.A0U, r7.A0U) && A01(r7) && Util.A0E(this.A0K, r7.A0K))) {
                return false;
            }
        }
        return true;
    }

    public boolean A01(C207099uY r7) {
        List list = this.A0T;
        int size = list.size();
        List list2 = r7.A0T;
        if (size == list2.size()) {
            int i = 0;
            while (i < list.size()) {
                if (Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A092 = ((((((((((((((((((((((((((527 + C36341k9.A09(this.A0Q)) * 31) + C36341k9.A09(this.A0R)) * 31) + this.A0D) * 31) + this.A04) * 31) + this.A0C) * 31) + C36341k9.A09(this.A0O)) * 31) + AnonymousClass000.A0H(this.A0M)) * 31) + C36341k9.A09(this.A0P)) * 31) + C36421kH.A05(this.A0S)) * 31) + this.A0I) * 31) + this.A09) * 31) + this.A05) * 31) + this.A0F) * 31) + this.A03;
        this.A00 = A092;
        return A092;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0Q);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0O);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A09);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0E);
        parcel.writeFloat(this.A02);
        byte[] bArr = this.A0U;
        parcel.writeInt(AnonymousClass000.A1V(bArr) ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0H);
        parcel.writeParcelable(this.A0N, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A0G);
        parcel.writeString(this.A0R);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A06);
        parcel.writeLong(this.A0J);
        List list = this.A0T;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) list.get(i2));
        }
        parcel.writeParcelable(this.A0L, 0);
        parcel.writeParcelable(this.A0M, 0);
        this.A0K.writeToParcel(parcel, 0);
    }

    public C207099uY(C199159en r6) {
        this.A0Q = r6.A0P;
        this.A0R = r6.A0Q;
        this.A0G = r6.A0F;
        this.A0D = r6.A0C;
        this.A0C = r6.A0B;
        this.A04 = r6.A03;
        this.A0O = r6.A0N;
        this.A0M = r6.A0L;
        this.A0P = r6.A0O;
        this.A0S = r6.A0R;
        this.A0A = r6.A09;
        List list = r6.A0S;
        this.A0T = list == null ? Collections.emptyList() : list;
        C21709AXg aXg = r6.A0K;
        this.A0L = aXg;
        this.A0J = r6.A0I;
        this.A0I = r6.A0H;
        this.A09 = r6.A08;
        this.A01 = r6.A00;
        int i = r6.A0D;
        int i2 = 0;
        this.A0E = i == -1 ? 0 : i;
        float f = r6.A01;
        this.A02 = f == -1.0f ? 1.0f : f;
        this.A0U = r6.A0T;
        this.A0H = r6.A0G;
        this.A0N = r6.A0M;
        this.A05 = r6.A04;
        this.A0F = r6.A0E;
        this.A0B = r6.A0A;
        int i3 = r6.A06;
        this.A07 = i3 == -1 ? 0 : i3;
        int i4 = r6.A07;
        this.A08 = i4 != -1 ? i4 : i2;
        this.A03 = r6.A02;
        int i5 = r6.A05;
        if (i5 == 0 && aXg != null) {
            i5 = 1;
        }
        this.A06 = i5;
        this.A0K = r6.A0J;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Format(");
        A0u.append(this.A0Q);
        A0u.append(", ");
        A0u.append(this.A0P);
        A0u.append(", ");
        A0u.append(this.A0S);
        A0u.append(", ");
        A0u.append(this.A0O);
        A0u.append(", ");
        A0u.append(this.A04);
        A0u.append(", ");
        A0u.append(this.A0R);
        A0u.append(", [");
        A0u.append(this.A0I);
        A0u.append(", ");
        A0u.append(this.A09);
        A0u.append(", ");
        A0u.append(this.A01);
        A0u.append("], [");
        A0u.append(this.A05);
        A0u.append(", ");
        A0u.append(this.A0F);
        return AnonymousClass000.A0q("])", A0u);
    }
}
