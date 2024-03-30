package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.InputStream;

/* renamed from: X.8xs  reason: invalid class name and case insensitive filesystem */
public final class C187438xs extends InputStream {
    public final /* synthetic */ AZL A00;

    public int read(byte[] bArr, int i, int i2) {
        AnonymousClass00C.A0C(bArr, 0);
        AZL azl = this.A00;
        if (!azl.A00) {
            C1902797o.A00((long) bArr.length, (long) i, (long) i2);
            AU1 au1 = azl.A01;
            if (au1.A00 == 0 && azl.A02.Bmp(au1, (long) DefaultCrypto.BUFFER_SIZE) == -1) {
                return -1;
            }
            return au1.A02(bArr, i, i2);
        }
        throw C90524aI.A0X("closed");
    }

    public C187438xs(AZL azl) {
        this.A00 = azl;
    }

    public int available() {
        AZL azl = this.A00;
        if (!azl.A00) {
            return (int) Math.min(azl.A01.A00, (long) Integer.MAX_VALUE);
        }
        throw C90524aI.A0X("closed");
    }

    public void close() {
        this.A00.close();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        return AnonymousClass000.A0q(".inputStream()", A0u);
    }

    public int read() {
        AZL azl = this.A00;
        if (!azl.A00) {
            AU1 au1 = azl.A01;
            if (au1.A00 == 0 && azl.A02.Bmp(au1, (long) DefaultCrypto.BUFFER_SIZE) == -1) {
                return -1;
            }
            return au1.A00() & 255;
        }
        throw C90524aI.A0X("closed");
    }
}
