package X;

import java.lang.reflect.Constructor;
import javax.crypto.BadPaddingException;

/* renamed from: X.AaH  reason: case insensitive filesystem */
public class C21784AaH implements B3W {
    public static final Constructor A01;
    public B3Q A00;

    public C21784AaH(B3Q b3q) {
        this.A00 = b3q;
    }

    public String B8R() {
        B3Q b3q = this.A00;
        return b3q instanceof C23130B6l ? ((C23130B6l) b3q).BIf().B8R() : b3q.B8R();
    }

    public int BEq(int i) {
        return this.A00.BEq(i);
    }

    public B35 BIf() {
        B3Q b3q = this.A00;
        if (b3q instanceof C23130B6l) {
            return ((C23130B6l) b3q).BIf();
        }
        return null;
    }

    public int BIi(int i) {
        return this.A00.BIi(i);
    }

    public void BKQ(C16590pl r2, boolean z) {
        this.A00.BKQ(r2, z);
    }

    public int BmN(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.A00.BmN(bArr, i, i2, bArr2, i3);
    }

    public void BwX(byte[] bArr, int i, int i2) {
        this.A00.BmL(bArr, i, i2);
    }

    public boolean BxX() {
        return false;
    }

    static {
        Class A002 = AnonymousClass11t.A00("javax.crypto.AEADBadTagException", C22724AuR.class);
        Constructor constructor = null;
        if (A002 != null) {
            try {
                constructor = A002.getConstructor(new Class[]{String.class});
            } catch (Exception unused) {
                constructor = null;
            }
        }
        A01 = constructor;
    }

    public int B5n(byte[] bArr, int i) {
        try {
            return this.A00.B5n(bArr, i);
        } catch (C22696At0 e) {
            Constructor constructor = A01;
            if (constructor != null) {
                BadPaddingException badPaddingException = null;
                try {
                    Object[] objArr = new Object[1];
                    C90514aH.A1U(e, objArr, 0);
                    badPaddingException = (BadPaddingException) constructor.newInstance(objArr);
                } catch (Exception unused) {
                }
                if (badPaddingException != null) {
                    throw badPaddingException;
                }
            }
            throw new BadPaddingException(e.getMessage());
        }
    }
}
