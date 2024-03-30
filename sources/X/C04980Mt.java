package X;

import java.util.Objects;

/* renamed from: X.0Mt  reason: invalid class name and case insensitive filesystem */
public class C04980Mt extends C04990Mu {
    public final byte[] zza;

    public int A04() {
        return this.zza.length;
    }

    public int A06() {
        return 0;
    }

    public final boolean equals(Object obj) {
        int A04;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C10970fW) && (A04 = A04()) == ((C10970fW) obj).A04()) {
            if (A04 == 0) {
                return true;
            }
            if (!(obj instanceof C04980Mt)) {
                return obj.equals(this);
            }
            C04980Mt r9 = (C04980Mt) obj;
            int i = this.zzc;
            int i2 = r9.zzc;
            if (i == 0 || i2 == 0 || i == i2) {
                int A042 = r9.A04();
                if (A04 > A042) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Length too large: ");
                    A0u.append(A04);
                    A0u.append(A04);
                    throw AnonymousClass000.A0b(A0u);
                } else if (A04 <= A042) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = r9.zza;
                    int A06 = A06();
                    int i3 = A04 + A06;
                    int A062 = r9.A06();
                    while (A06 < i3) {
                        if (bArr[A06] != bArr2[A062]) {
                            return false;
                        }
                        A06++;
                        A062++;
                    }
                    return true;
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Ran off end of other: 0, ");
                    A0u2.append(A04);
                    throw AnonymousClass000.A0d(", ", A0u2, A042);
                }
            }
        }
        return false;
    }

    public byte A02(int i) {
        return this.zza[i];
    }

    public byte A03(int i) {
        return this.zza[i];
    }

    public C04980Mt(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }
}
