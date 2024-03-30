package X;

import java.math.BigInteger;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Objects;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.jcajce.provider.symmetric.AES;
import org.spongycastle.jcajce.provider.symmetric.PBEPBKDF2;

/* renamed from: X.Abl  reason: case insensitive filesystem */
public abstract class C21861Abl extends AlgorithmParametersSpi {
    public static boolean A00(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        byte[] bArr;
        int i;
        AnonymousClass120 r0;
        byte[] bArr2;
        byte[] bArr3;
        Objects.requireNonNull(cls, "argument to getParameterSpec must not be null");
        if (this instanceof PBEPBKDF2.AlgParams) {
            PBEPBKDF2.AlgParams algParams = (PBEPBKDF2.AlgParams) this;
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                C22625Arr arr = algParams.A00;
                return new PBEParameterSpec(arr.A02.A00, new BigInteger(arr.A00.A00).intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF2 PBE parameters object.");
        }
        if (this instanceof AES.AlgParamsGCM) {
            AES.AlgParamsGCM algParamsGCM = (AES.AlgParamsGCM) this;
            if (cls == AlgorithmParameterSpec.class || C200749i9.A02 == cls) {
                if (C200749i9.A02 != null) {
                    r0 = algParamsGCM.A00;
                    return C200749i9.A00(r0.Bve());
                }
            } else if (cls != C21911Ach.class) {
                if (cls == IvParameterSpec.class) {
                    bArr3 = algParamsGCM.A00.A01;
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("AlgorithmParameterSpec not recognized: ");
                    throw new InvalidParameterSpecException(AnonymousClass000.A0q(cls.getName(), A0u));
                }
            }
            bArr = AnonymousClass124.A02(algParamsGCM.A00.A01);
            i = algParamsGCM.A00.A00;
            return new C21911Ach(bArr, i * 8);
        } else if (this instanceof AES.AlgParamsCCM) {
            AES.AlgParamsCCM algParamsCCM = (AES.AlgParamsCCM) this;
            if (cls == AlgorithmParameterSpec.class || C200749i9.A02 == cls) {
                if (C200749i9.A02 != null) {
                    r0 = algParamsCCM.A00;
                    return C200749i9.A00(r0.Bve());
                }
            } else if (cls != C21911Ach.class) {
                if (cls == IvParameterSpec.class) {
                    bArr3 = algParamsCCM.A00.A01;
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("AlgorithmParameterSpec not recognized: ");
                    throw new InvalidParameterSpecException(AnonymousClass000.A0q(cls.getName(), A0u2));
                }
            }
            bArr = AnonymousClass124.A02(algParamsCCM.A00.A01);
            i = algParamsCCM.A00.A00;
            return new C21911Ach(bArr, i * 8);
        } else {
            AES.AlgParams algParams2 = (AES.AlgParams) this;
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                bArr2 = algParams2.A00;
                return new IvParameterSpec(bArr2);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }
        bArr2 = AnonymousClass124.A02(bArr3);
        return new IvParameterSpec(bArr2);
    }
}
