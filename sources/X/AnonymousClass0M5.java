package X;

import java.util.Objects;

/* renamed from: X.0M5  reason: invalid class name */
public class AnonymousClass0M5 extends AnonymousClass0M6 {
    public final byte[] zza;

    public int A02() {
        return this.zza.length;
    }

    public final boolean equals(Object obj) {
        int A02;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if ((obj instanceof C10960fV) && (A02 = A02()) == ((C10960fV) obj).A02()) {
            if (A02 == 0) {
                return true;
            }
            if (!(obj instanceof AnonymousClass0M5)) {
                return obj.equals(this);
            }
            AnonymousClass0M5 r9 = (AnonymousClass0M5) obj;
            int i2 = this.zzc;
            int i3 = r9.zzc;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                int A022 = r9.A02();
                if (A02 > A022) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Length too large: ");
                    A0u.append(A02);
                    A0u.append(A02);
                    throw AnonymousClass000.A0b(A0u);
                } else if (A02 <= A022) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = r9.zza;
                    int i4 = 0;
                    while (i < A02) {
                        if (bArr[i] != bArr2[i4]) {
                            return false;
                        }
                        i++;
                        i4++;
                    }
                    return true;
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Ran off end of other: 0, ");
                    A0u2.append(A02);
                    throw AnonymousClass000.A0d(", ", A0u2, A022);
                }
            }
        }
        return false;
    }

    public byte A01(int i) {
        return this.zza[i];
    }

    public AnonymousClass0M5(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }
}
