package X;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

/* renamed from: X.Abk  reason: case insensitive filesystem */
public abstract class C21860Abk extends AlgorithmParameterGeneratorSpi {
    public SecureRandom A00;
    public final C22844Awt A01 = new C21786AaJ();

    public void engineInit(int i, SecureRandom secureRandom) {
        this.A00 = secureRandom;
    }
}
