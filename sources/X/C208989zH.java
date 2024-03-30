package X;

import com.facebook.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* renamed from: X.9zH  reason: invalid class name and case insensitive filesystem */
public abstract class C208989zH implements C23092B4c {
    public C199879gA A00;
    public ByteBuffer A01;
    public C199879gA A02;
    public C199879gA A03;
    public ByteBuffer A04;
    public boolean A05;
    public C199879gA A06;

    public final void Bmf() {
        this.A05 = true;
        if (this instanceof AnonymousClass82U) {
            AnonymousClass82U r4 = (AnonymousClass82U) this;
            if (r4.A05) {
                int i = r4.A00;
                if (i > 0) {
                    r4.A04 += (long) (i / r4.A00.A00);
                }
                r4.A00 = 0;
            }
        } else if (this instanceof AnonymousClass82W) {
            AnonymousClass82W r42 = (AnonymousClass82W) this;
            int i2 = r42.A01;
            if (i2 > 0) {
                AnonymousClass82W.A00(r42, r42.A07, i2);
            }
            if (!r42.A06) {
                r42.A04 += (long) (r42.A02 / r42.A00);
            }
        }
    }

    public final ByteBuffer A02(int i) {
        if (this.A04.capacity() < i) {
            this.A04 = C90474aD.A0l(i);
        } else {
            this.A04.clear();
        }
        ByteBuffer byteBuffer = this.A04;
        this.A01 = byteBuffer;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 != 0) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C199879gA B3O(X.C199879gA r8) {
        /*
            r7 = this;
            r7.A02 = r8
            r2 = r7
            boolean r0 = r7 instanceof X.AnonymousClass82U
            if (r0 == 0) goto L_0x0024
            X.82U r2 = (X.AnonymousClass82U) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00be
            r0 = 1
            r2.A05 = r0
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0019
            int r0 = r2.A02
        L_0x0017:
            if (r0 == 0) goto L_0x00ba
        L_0x0019:
            r7.A03 = r8
            boolean r0 = r7.BL7()
            if (r0 != 0) goto L_0x0023
            X.9gA r8 = X.C199879gA.A04
        L_0x0023:
            return r8
        L_0x0024:
            boolean r0 = r7 instanceof X.AnonymousClass82S
            if (r0 != 0) goto L_0x0019
            boolean r0 = r7 instanceof X.AnonymousClass82R
            if (r0 == 0) goto L_0x003d
            X.82R r2 = (X.AnonymousClass82R) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00ba
            int r1 = r8.A02
            r0 = 2
            if (r1 == r0) goto L_0x0019
            X.91S r0 = new X.91S
            r0.<init>(r8)
            throw r0
        L_0x003d:
            boolean r0 = r7 instanceof X.AnonymousClass82W
            if (r0 == 0) goto L_0x004b
            X.82W r2 = (X.AnonymousClass82W) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00c4
            boolean r0 = r2.A05
            goto L_0x0017
        L_0x004b:
            boolean r0 = r7 instanceof X.AnonymousClass82Q
            if (r0 == 0) goto L_0x006f
            int r1 = r8.A02
            r2 = 2
            r0 = 3
            if (r1 == r0) goto L_0x0065
            if (r1 == r2) goto L_0x00ba
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x0065
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x0065
            X.91S r0 = new X.91S
            r0.<init>(r8)
            throw r0
        L_0x0065:
            int r1 = r8.A03
            int r0 = r8.A01
            X.9gA r8 = new X.9gA
            r8.<init>(r1, r0, r2)
            goto L_0x0019
        L_0x006f:
            boolean r0 = r7 instanceof X.AnonymousClass82V
            if (r0 == 0) goto L_0x008e
            int r1 = r8.A02
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x0083
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x0083
            X.91S r0 = new X.91S
            r0.<init>(r8)
            throw r0
        L_0x0083:
            int r2 = r8.A03
            int r1 = r8.A01
            r0 = 4
            X.9gA r8 = new X.9gA
            r8.<init>(r2, r1, r0)
            goto L_0x0019
        L_0x008e:
            X.82T r2 = (X.AnonymousClass82T) r2
            int[] r6 = r2.A01
            if (r6 == 0) goto L_0x00ba
            int r0 = r8.A02
            r5 = 2
            if (r0 != r5) goto L_0x00d0
            int r4 = r8.A01
            int r3 = r6.length
            boolean r2 = X.C36381kD.A1U(r4, r3)
            r1 = 0
        L_0x00a1:
            if (r1 >= r3) goto L_0x00af
            r0 = r6[r1]
            if (r0 >= r4) goto L_0x00ca
            boolean r0 = X.C36381kD.A1U(r0, r1)
            r2 = r2 | r0
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00af:
            if (r2 == 0) goto L_0x00ba
            int r0 = r8.A03
            X.9gA r8 = new X.9gA
            r8.<init>(r0, r3, r5)
            goto L_0x0019
        L_0x00ba:
            X.9gA r8 = X.C199879gA.A04
            goto L_0x0019
        L_0x00be:
            X.91S r0 = new X.91S
            r0.<init>(r8)
            throw r0
        L_0x00c4:
            X.91S r0 = new X.91S
            r0.<init>(r8)
            throw r0
        L_0x00ca:
            X.91S r0 = new X.91S
            r0.<init>(r8)
            throw r0
        L_0x00d0:
            X.91S r0 = new X.91S
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208989zH.B3O(X.9gA):X.9gA");
    }

    public ByteBuffer BEm() {
        ByteBuffer byteBuffer = this.A01;
        this.A01 = C23092B4c.A00;
        return byteBuffer;
    }

    public boolean BL7() {
        if (this instanceof AnonymousClass82R) {
            return ((AnonymousClass82R) this).A00;
        }
        if (this instanceof AnonymousClass82W) {
            return ((AnonymousClass82W) this).A05;
        }
        return C36371kC.A1W(this.A03, C199879gA.A04);
    }

    public boolean BLh() {
        if (!this.A05 || this.A01 != C23092B4c.A00) {
            return false;
        }
        return true;
    }

    public final void flush() {
        this.A01 = C23092B4c.A00;
        this.A05 = false;
        this.A00 = this.A02;
        this.A06 = this.A03;
        if (this instanceof AnonymousClass82U) {
            AnonymousClass82U r4 = (AnonymousClass82U) this;
            if (r4.A05) {
                r4.A05 = false;
                int i = r4.A02;
                int i2 = r4.A00.A00;
                r4.A06 = new byte[(i * i2)];
                r4.A01 = r4.A03 * i2;
            } else {
                r4.A01 = 0;
            }
            r4.A00 = 0;
        } else if (this instanceof AnonymousClass82W) {
            AnonymousClass82W r42 = (AnonymousClass82W) this;
            if (r42.A05) {
                C199879gA r2 = r42.A00;
                int i3 = r2.A00;
                r42.A00 = i3;
                long j = (long) r2.A03;
                int A0E = ((int) C165597tg.A0E(150000, j)) * i3;
                if (r42.A07.length != A0E) {
                    r42.A07 = new byte[A0E];
                }
                int A0E2 = ((int) C165597tg.A0E(20000, j)) * i3;
                r42.A02 = A0E2;
                if (r42.A08.length != A0E2) {
                    r42.A08 = new byte[A0E2];
                }
            }
            r42.A03 = 0;
            r42.A04 = 0;
            r42.A01 = 0;
            r42.A06 = false;
        } else if (this instanceof AnonymousClass82T) {
            AnonymousClass82T r43 = (AnonymousClass82T) this;
            r43.A00 = r43.A01;
        }
    }

    public C208989zH() {
        ByteBuffer byteBuffer = C23092B4c.A00;
        this.A04 = byteBuffer;
        this.A01 = byteBuffer;
        C199879gA r0 = C199879gA.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A06 = r0;
    }

    public final void reset() {
        flush();
        this.A04 = C23092B4c.A00;
        C199879gA r0 = C199879gA.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A06 = r0;
        if (this instanceof AnonymousClass82U) {
            ((AnonymousClass82U) this).A06 = Util.A08;
        } else if (this instanceof AnonymousClass82R) {
            ((AnonymousClass82R) this).A00 = false;
        } else if (this instanceof AnonymousClass82W) {
            AnonymousClass82W r1 = (AnonymousClass82W) this;
            r1.A05 = false;
            r1.A02 = 0;
            byte[] bArr = Util.A08;
            r1.A07 = bArr;
            r1.A08 = bArr;
        } else if (this instanceof AnonymousClass82T) {
            AnonymousClass82T r12 = (AnonymousClass82T) this;
            r12.A00 = null;
            r12.A01 = null;
        }
    }
}
