package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.67Y  reason: invalid class name */
public final class AnonymousClass67Y {
    public int A00;
    public long A01;
    public String A02;
    public String A03;
    public byte[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            AnonymousClass67Y r7 = (AnonymousClass67Y) obj;
            if (this.A01 != r7.A01 || this.A00 != r7.A00 || !TextUtils.equals(this.A03, r7.A03) || !Arrays.equals(this.A04, r7.A04) || !TextUtils.equals(this.A02, r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass67Y(String str, String str2, byte[] bArr, int i, long j) {
        this.A03 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A01 = j;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        AnonymousClass00C.A08(copyOf);
        this.A04 = copyOf;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = this.A03;
        return Objects.hash(A0L);
    }
}
