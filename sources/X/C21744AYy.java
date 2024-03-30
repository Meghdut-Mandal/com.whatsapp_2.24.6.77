package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;

/* renamed from: X.AYy  reason: case insensitive filesystem */
public class C21744AYy implements PBEKey, Destroyable {
    public String algorithm;
    public int digest;
    public final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);
    public final int iterationCount;
    public int ivSize;
    public int keySize;
    public AnonymousClass122 oid;
    public final C16590pl param;
    public final char[] password;
    public final byte[] salt;
    public boolean tryWrong = false;
    public int type;

    public C21744AYy(String str, PBEKeySpec pBEKeySpec, AnonymousClass122 r5, C16590pl r6, int i, int i2, int i3, int i4) {
        this.algorithm = str;
        this.oid = r5;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = r6;
    }

    public String getAlgorithm() {
        A00(this);
        return this.algorithm;
    }

    public String getFormat() {
        return "RAW";
    }

    public int getIterationCount() {
        A00(this);
        return this.iterationCount;
    }

    public byte[] getSalt() {
        A00(this);
        return AnonymousClass124.A02(this.salt);
    }

    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public void destroy() {
        if (!this.hasBeenDestroyed.getAndSet(true)) {
            char[] cArr = this.password;
            if (cArr != null) {
                Arrays.fill(cArr, 0);
            }
            byte[] bArr = this.salt;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
        }
    }

    public static void A00(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw AnonymousClass001.A09("key has been destroyed");
        }
    }

    public byte[] getEncoded() {
        int length;
        A00(this);
        C16590pl r1 = this.param;
        if (r1 != null) {
            if (r1 instanceof C21760AZs) {
                r1 = ((C21760AZs) r1).A00;
            }
            return ((AZr) r1).A00;
        }
        int i = this.type;
        if (i == 2) {
            char[] cArr = this.password;
            int i2 = 0;
            if (cArr == null || (length = cArr.length) <= 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[((length + 1) * 2)];
            do {
                char c = cArr[i2];
                C165607th.A15(c >>> 8, bArr, i2 * 2, c);
                i2++;
            } while (i2 != length);
            return bArr;
        }
        char[] cArr2 = this.password;
        if (i != 5) {
            if (cArr2 == null) {
                return new byte[0];
            }
            int length2 = cArr2.length;
            byte[] bArr2 = new byte[length2];
            for (int i3 = 0; i3 != length2; i3 = C165617ti.A07(bArr2, cArr2[i3], i3)) {
            }
            return bArr2;
        } else if (cArr2 != null) {
            return AnonymousClass11q.A04(cArr2);
        } else {
            return new byte[0];
        }
    }

    public char[] getPassword() {
        A00(this);
        char[] cArr = this.password;
        if (cArr != null) {
            return AnonymousClass124.A03(cArr);
        }
        throw AnonymousClass001.A09("no password available");
    }
}
