package X;

import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

/* renamed from: X.Acf  reason: case insensitive filesystem */
public class C21909Acf extends MacSpi {
    public static final Class A01 = AnonymousClass11t.A00("javax.crypto.spec.GCMParameterSpec", C21909Acf.class);
    public B3H A00;

    public C21909Acf(B3H b3h) {
        this.A00 = b3h;
    }

    public int engineGetMacLength() {
        return this.A00.BDk();
    }

    public void engineReset() {
        this.A00.reset();
    }

    public void engineUpdate(byte b) {
        this.A00.BwT(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A00.update(bArr, i, i2);
    }

    public byte[] engineDoFinal() {
        B3H b3h = this.A00;
        byte[] bArr = new byte[b3h.BDk()];
        b3h.B5n(bArr, 0);
        return bArr;
    }

    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        C16590pl aZr;
        if (key != null) {
            if (key instanceof C21744AYy) {
                C21744AYy aYy = (C21744AYy) key;
                C21744AYy.A00(aYy);
                if (aYy.param != null) {
                    C21744AYy.A00(aYy);
                    aZr = aYy.param;
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw C165617ti.A0c("PBE requires PBE parameters to be set.");
                } else if (algorithmParameterSpec != null) {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    C21744AYy.A00(aYy);
                    int i = aYy.type;
                    C21744AYy.A00(aYy);
                    AnonymousClass9g1 A012 = C201779kN.A01(i, aYy.digest);
                    byte[] encoded = aYy.getEncoded();
                    byte[] salt = pBEParameterSpec.getSalt();
                    int iterationCount = pBEParameterSpec.getIterationCount();
                    A012.A01 = encoded;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    C21744AYy.A00(aYy);
                    aZr = A012.A01(aYy.keySize);
                } else {
                    throw AnonymousClass001.A08("Need a PBEParameter spec with a PBE key.");
                }
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                aZr = new AZr(key.getEncoded());
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                C165567td.A1N(algorithmParameterSpec, "inappropriate parameter type: ", A0u);
                throw C165617ti.A0c(A0u.toString());
            }
            C16590pl r4 = aZr;
            if (aZr instanceof C21760AZs) {
                r4 = ((C21760AZs) r4).A00;
            }
            AZr aZr2 = (AZr) r4;
            if (algorithmParameterSpec instanceof C21911Ach) {
                C21911Ach ach = (C21911Ach) algorithmParameterSpec;
                aZr = new AZo(aZr2, ach.getIV(), AnonymousClass124.A02(ach.A01), ach.A00);
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                aZr = new C21760AZs(aZr2, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                byte[] bArr = aZr2.A00;
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                rC2ParameterSpec.getEffectiveKeyBits();
                aZr = new C21760AZs(new C22719AtN(bArr), rC2ParameterSpec.getIV());
            } else if (algorithmParameterSpec == null) {
                aZr = new AZr(key.getEncoded());
            } else {
                Class cls = A01;
                if (cls != null && C165587tf.A1b(cls, algorithmParameterSpec)) {
                    Class cls2 = C200749i9.A02;
                    try {
                        aZr = (AZo) AccessController.doPrivileged(new AXK(algorithmParameterSpec, aZr2));
                    } catch (Exception unused) {
                        throw C165617ti.A0c("Cannot process GCMParameterSpec.");
                    }
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C165567td.A1N(algorithmParameterSpec, "unknown parameter type: ", A0u2);
                    throw C165617ti.A0c(A0u2.toString());
                }
            }
            try {
                this.A00.BKO(aZr);
            } catch (Exception e) {
                throw C165617ti.A0c(C36331k8.A0i("cannot initialize MAC: ", AnonymousClass000.A0u(), e));
            }
        } else {
            throw new InvalidKeyException("key is null");
        }
    }
}
