package X;

import com.facebook.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* renamed from: X.82U  reason: invalid class name */
public final class AnonymousClass82U extends C208989zH {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = Util.A08;

    public ByteBuffer BEm() {
        int i;
        if (super.BLh() && (i = this.A00) > 0) {
            ByteBuffer A022 = A02(i);
            A022.put(this.A06, 0, this.A00);
            A022.flip();
            this.A00 = 0;
        }
        ByteBuffer byteBuffer = this.A01;
        this.A01 = C23092B4c.A00;
        return byteBuffer;
    }

    public boolean BLh() {
        if (!super.BLh() || this.A00 != 0) {
            return false;
        }
        return true;
    }

    public void Bmg(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int i2 = this.A01;
            int min = Math.min(i, i2);
            this.A04 += (long) (min / this.A00.A00);
            this.A01 = i2 - min;
            byteBuffer.position(position + min);
            if (this.A01 <= 0) {
                int i3 = i - min;
                int length = (this.A00 + i3) - this.A06.length;
                ByteBuffer A022 = A02(length);
                int A032 = C165607th.A03(length, this.A00, 0);
                A022.put(this.A06, 0, A032);
                int A033 = C165607th.A03(length - A032, i3, 0);
                byteBuffer.limit(byteBuffer.position() + A033);
                A022.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - A033;
                int i5 = this.A00 - A032;
                this.A00 = i5;
                byte[] bArr = this.A06;
                System.arraycopy(bArr, A032, bArr, 0, i5);
                byteBuffer.get(this.A06, this.A00, i4);
                this.A00 += i4;
                A022.flip();
            }
        }
    }
}
