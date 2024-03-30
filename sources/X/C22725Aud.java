package X;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;

/* renamed from: X.Aud  reason: case insensitive filesystem */
public abstract class C22725Aud extends C21910Acg {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    public C22725Aud(String str, int i, int i2, int i3, int i4, boolean z) {
        super(str, (AnonymousClass122) null);
        this.A04 = z;
        this.A03 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }

    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        int i;
        int i2;
        int i3;
        C16590pl r7;
        String str;
        AnonymousClass122 r6;
        int i4;
        KeySpec keySpec2 = keySpec;
        if (keySpec instanceof PBEKeySpec) {
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec2;
            if (pBEKeySpec.getSalt() == null) {
                str = this.A00;
                r6 = this.A01;
                i = this.A03;
                i2 = this.A00;
                i3 = this.A02;
                i4 = this.A01;
                r7 = null;
            } else {
                boolean z = this.A04;
                i = this.A03;
                i2 = this.A00;
                i3 = this.A02;
                if (z) {
                    int i5 = this.A01;
                    AnonymousClass9g1 A012 = C201779kN.A01(i, i2);
                    byte[] A022 = C201779kN.A02(pBEKeySpec, i);
                    byte[] salt = pBEKeySpec.getSalt();
                    int iterationCount = pBEKeySpec.getIterationCount();
                    A012.A01 = A022;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    if (i5 != 0) {
                        r7 = A012.A03(i3, i5);
                    } else {
                        r7 = A012.A02(i3);
                    }
                    for (int i6 = 0; i6 != A022.length; i6++) {
                        A022[i6] = 0;
                    }
                } else {
                    AnonymousClass9g1 A013 = C201779kN.A01(i, i2);
                    byte[] A023 = C201779kN.A02(pBEKeySpec, i);
                    byte[] salt2 = pBEKeySpec.getSalt();
                    int iterationCount2 = pBEKeySpec.getIterationCount();
                    A013.A01 = A023;
                    A013.A02 = salt2;
                    A013.A00 = iterationCount2;
                    r7 = A013.A01(i3);
                    for (int i7 = 0; i7 != A023.length; i7++) {
                        A023[i7] = 0;
                    }
                }
                str = this.A00;
                r6 = this.A01;
                i4 = this.A01;
            }
            return new C21744AYy(str, pBEKeySpec, r6, r7, i, i2, i3, i4);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }
}
