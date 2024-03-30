package X;

import java.util.Arrays;

/* renamed from: X.3QO  reason: invalid class name */
public class AnonymousClass3QO {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3QO(X.C52772q9 r12, int r13, long r14, long r16, long r18, long r20) {
        /*
            r11 = this;
            r2 = 0
            int r1 = r12.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x001c
            if (r1 == r2) goto L_0x000f
            java.lang.String r0 = "unsupported ADVEncryptionType"
            X.C18740tg.A0D(r2, r0)
        L_0x000f:
            r0 = r11
            r1 = r13
            r3 = r14
            r5 = r16
            r7 = r18
            r9 = r20
            r0.<init>((int) r1, (int) r2, (long) r3, (long) r5, (long) r7, (long) r9)
            return
        L_0x001c:
            r2 = 1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QO.<init>(X.2q9, int, long, long, long, long):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof AnonymousClass3QO)) {
                return false;
            }
            AnonymousClass3QO r7 = (AnonymousClass3QO) obj;
            if (!(this.A01 == r7.A01 && this.A05 == r7.A05 && this.A02 == r7.A02 && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        AnonymousClass000.A1J(objArr, this.A01);
        C36421kH.A1P(objArr, this.A05);
        C36361kB.A1W(objArr, this.A02);
        objArr[3] = Long.valueOf(this.A04);
        objArr[4] = Long.valueOf(this.A03);
        C36371kC.A1S(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserDeviceInfo{rawId=");
        A0u.append(this.A01);
        A0u.append(", timestampInSec=");
        A0u.append(this.A05);
        A0u.append(", expectedTimestampInSec=");
        A0u.append(this.A02);
        A0u.append(", expectedTimestampLastDeviceJobTsInMilliSec=");
        A0u.append(this.A04);
        A0u.append(", expectedTimestampUpdateTsInMilliSec=");
        A0u.append(this.A03);
        A0u.append(", accountEncryptionType=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }

    public AnonymousClass3QO(int i, int i2, long j, long j2, long j3, long j4) {
        this.A01 = i;
        this.A05 = j;
        this.A02 = j2;
        this.A04 = j3;
        this.A03 = j4;
        this.A00 = i2;
    }
}
