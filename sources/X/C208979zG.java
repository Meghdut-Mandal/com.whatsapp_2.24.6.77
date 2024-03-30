package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;

/* renamed from: X.9zG  reason: invalid class name and case insensitive filesystem */
public final class C208979zG implements C23092B4c {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public long A02;
    public long A03;
    public C199879gA A04;
    public C199879gA A05;
    public C202889mq A06;
    public boolean A07;
    public C199879gA A08;
    public C199879gA A09;
    public ByteBuffer A0A;
    public ByteBuffer A0B;
    public ShortBuffer A0C;
    public boolean A0D;

    public C199879gA B3O(C199879gA r5) {
        if (r5.A02 == 2) {
            int i = r5.A03;
            this.A08 = r5;
            C199879gA r1 = new C199879gA(i, r5.A01, 2);
            this.A09 = r1;
            this.A07 = true;
            return r1;
        }
        throw new AnonymousClass91S(r5);
    }

    public ByteBuffer BEm() {
        int i;
        C202889mq r7 = this.A06;
        if (r7 != null && (i = r7.A05 * r7.A0G * 2) > 0) {
            if (this.A0A.capacity() < i) {
                ByteBuffer A0l = C90474aD.A0l(i);
                this.A0A = A0l;
                this.A0C = A0l.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            ShortBuffer shortBuffer = this.A0C;
            int remaining = shortBuffer.remaining();
            int i2 = r7.A0G;
            int min = Math.min(remaining / i2, r7.A05);
            shortBuffer.put(r7.A0B, 0, i2 * min);
            int i3 = r7.A05 - min;
            r7.A05 = i3;
            short[] sArr = r7.A0B;
            System.arraycopy(sArr, min * i2, sArr, 0, i3 * i2);
            this.A03 += (long) i;
            this.A0A.limit(i);
            this.A0B = this.A0A;
        }
        ByteBuffer byteBuffer = this.A0B;
        this.A0B = C23092B4c.A00;
        return byteBuffer;
    }

    public boolean BL7() {
        int i = this.A09.A03;
        if (i == -1) {
            return false;
        }
        if (C90494aF.A01(this.A01, 1.0f) >= 1.0E-4f || C90494aF.A01(this.A00, 1.0f) >= 1.0E-4f || i != this.A08.A03) {
            return true;
        }
        return false;
    }

    public boolean BLh() {
        if (!this.A0D) {
            return false;
        }
        C202889mq r0 = this.A06;
        if (r0 == null || r0.A05 * r0.A0G * 2 == 0) {
            return true;
        }
        return false;
    }

    public void Bmf() {
        C202889mq r7 = this.A06;
        if (r7 != null) {
            int i = r7.A00;
            float f = r7.A0F;
            float f2 = r7.A0D;
            int i2 = r7.A05 + ((int) ((((((float) i) / (f / f2)) + ((float) r7.A06)) / (r7.A0E * f2)) + 0.5f));
            short[] sArr = r7.A0A;
            int i3 = r7.A0J * 2;
            short[] A042 = C202889mq.A04(r7, sArr, i, i3 + i);
            r7.A0A = A042;
            int i4 = 0;
            while (true) {
                int i5 = r7.A0G;
                if (i4 >= i3 * i5) {
                    break;
                }
                A042[(i5 * i) + i4] = 0;
                i4++;
            }
            r7.A00 += i3;
            C202889mq.A01(r7);
            if (r7.A05 > i2) {
                r7.A05 = i2;
            }
            r7.A00 = 0;
            r7.A09 = 0;
            r7.A06 = 0;
        }
        this.A0D = true;
    }

    public void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        C199879gA r0 = C199879gA.A04;
        this.A08 = r0;
        this.A09 = r0;
        this.A04 = r0;
        this.A05 = r0;
        ByteBuffer byteBuffer = C23092B4c.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
        this.A07 = false;
        this.A06 = null;
        this.A02 = 0;
        this.A03 = 0;
        this.A0D = false;
    }

    public C208979zG() {
        C199879gA r0 = C199879gA.A04;
        this.A08 = r0;
        this.A09 = r0;
        this.A04 = r0;
        this.A05 = r0;
        ByteBuffer byteBuffer = C23092B4c.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
    }

    public void Bmg(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C202889mq r5 = this.A06;
            Objects.requireNonNull(r5);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A02 += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = r5.A0G;
            int i2 = remaining2 / i;
            short[] A042 = C202889mq.A04(r5, r5.A0A, r5.A00, i2);
            r5.A0A = A042;
            asShortBuffer.get(A042, r5.A00 * i, ((i * i2) * 2) / 2);
            r5.A00 += i2;
            C202889mq.A01(r5);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void flush() {
        if (BL7()) {
            C199879gA r2 = this.A08;
            this.A04 = r2;
            C199879gA r1 = this.A09;
            this.A05 = r1;
            if (this.A07) {
                this.A06 = new C202889mq(this.A01, this.A00, r2.A03, r2.A01, r1.A03);
            } else {
                C202889mq r12 = this.A06;
                if (r12 != null) {
                    r12.A00 = 0;
                    r12.A05 = 0;
                    r12.A06 = 0;
                    r12.A04 = 0;
                    r12.A03 = 0;
                    r12.A09 = 0;
                    r12.A08 = 0;
                    r12.A07 = 0;
                    r12.A02 = 0;
                    r12.A01 = 0;
                }
            }
        }
        this.A0B = C23092B4c.A00;
        this.A02 = 0;
        this.A03 = 0;
        this.A0D = false;
    }
}
