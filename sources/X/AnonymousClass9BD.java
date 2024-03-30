package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.9BD  reason: invalid class name */
public abstract class AnonymousClass9BD {
    public static final Charset A00 = Charset.forName("ISO-8859-1");
    public static final Charset A01 = Charset.forName("US-ASCII");
    public static final C200279h2 A02;
    public static final ByteBuffer A03;
    public static final Charset A04 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A03 = ByteBuffer.wrap(bArr);
        A02 = C200279h2.A07(bArr, 0, 0);
    }
}
