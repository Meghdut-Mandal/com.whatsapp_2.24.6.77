package X;

import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.Ace  reason: case insensitive filesystem */
public abstract class C21908Ace extends KeyGeneratorSpi {
    public int A00;
    public String A01;
    public C195349Tx A02;
    public boolean A03 = true;

    public C21908Ace(String str, C195349Tx r3, int i) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = r3;
    }

    public SecretKey engineGenerateKey() {
        if (this.A03) {
            this.A02.A00(new C192709Ig(this.A00, C201939kk.A00()));
            this.A03 = false;
        }
        return new SecretKeySpec(this.A02.A01(), this.A01);
    }

    public void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = C201939kk.A00();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        this.A02.A00(new C192709Ig(i, secureRandom));
        this.A03 = false;
    }

    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.A02.A00(new C192709Ig(this.A00, secureRandom));
            this.A03 = false;
        }
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw C165617ti.A0c("Not Implemented");
    }
}
