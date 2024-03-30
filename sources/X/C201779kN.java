package X;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: X.9kN  reason: invalid class name and case insensitive filesystem */
public abstract class C201779kN {
    public static AnonymousClass9g1 A01(int i, int i2) {
        B3G atF;
        B3G b3g;
        int i3;
        B3G b3g2;
        if (i == 0 || i == 4) {
            if (i2 == 0) {
                atF = new C22711AtF();
            } else if (i2 == 1) {
                atF = new C22710AtE();
            } else if (i2 == 5) {
                atF = new C21789AaM();
            } else {
                throw AnonymousClass001.A09("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
            }
            return new C22699At3(atF);
        } else if (i == 1 || i == 5) {
            switch (i2) {
                case 0:
                    b3g = new C22711AtF();
                    break;
                case 1:
                    b3g = new C22710AtE();
                    break;
                case 2:
                    b3g = new C22712AtG();
                    break;
                case 3:
                    b3g = new C21792AaP();
                    break;
                case 4:
                    b3g = new C22714AtI();
                    break;
                case 5:
                    b3g = new C21789AaM();
                    break;
                case 6:
                    b3g = new C21791AaO();
                    break;
                case 7:
                    b3g = new C22713AtH();
                    break;
                case 8:
                    b3g = new C22715AtJ();
                    break;
                case 9:
                    b3g = new C22716AtK();
                    break;
                case 10:
                    i3 = 224;
                    break;
                case 11:
                    i3 = 256;
                    break;
                case 12:
                    i3 = 384;
                    break;
                case 13:
                    i3 = 512;
                    break;
                case 14:
                    b3g = new C22709AtD();
                    break;
                default:
                    throw AnonymousClass001.A09("unknown digest scheme for PBE PKCS5S2 encryption.");
            }
            b3g = new C21761AZt(i3);
            return new C22701At5(b3g);
        } else if (i != 2) {
            return new C22698At2();
        } else {
            switch (i2) {
                case 0:
                    b3g2 = new C22711AtF();
                    break;
                case 1:
                    b3g2 = new C22710AtE();
                    break;
                case 2:
                    b3g2 = new C22712AtG();
                    break;
                case 3:
                    b3g2 = new C21792AaP();
                    break;
                case 4:
                    b3g2 = new C22714AtI();
                    break;
                case 5:
                    b3g2 = new C21789AaM();
                    break;
                case 6:
                    b3g2 = new C21791AaO();
                    break;
                case 7:
                    b3g2 = new C22713AtH();
                    break;
                case 8:
                    b3g2 = new C22715AtJ();
                    break;
                case 9:
                    b3g2 = new C22716AtK();
                    break;
                default:
                    throw AnonymousClass001.A09("unknown digest scheme for PBE encryption.");
            }
            return new C22700At4(b3g2);
        }
    }

    public static byte[] A02(PBEKeySpec pBEKeySpec, int i) {
        int length;
        if (i == 2) {
            char[] password = pBEKeySpec.getPassword();
            int i2 = 0;
            if (password == null || (length = password.length) <= 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[((length + 1) * 2)];
            do {
                char c = password[i2];
                C165607th.A15(c >>> 8, bArr, i2 * 2, c);
                i2++;
            } while (i2 != length);
            return bArr;
        } else if (i == 5 || i == 4) {
            char[] password2 = pBEKeySpec.getPassword();
            if (password2 != null) {
                return AnonymousClass11q.A04(password2);
            }
            return new byte[0];
        } else {
            char[] password3 = pBEKeySpec.getPassword();
            if (password3 == null) {
                return new byte[0];
            }
            int length2 = password3.length;
            byte[] bArr2 = new byte[length2];
            for (int i3 = 0; i3 != length2; i3 = C165617ti.A07(bArr2, password3[i3], i3)) {
            }
            return bArr2;
        }
    }

    public static C16590pl A00(String str, AlgorithmParameterSpec algorithmParameterSpec, C21744AYy aYy) {
        C16590pl A02;
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw AnonymousClass001.A08("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        C21744AYy.A00(aYy);
        int i = aYy.type;
        C21744AYy.A00(aYy);
        AnonymousClass9g1 A01 = A01(i, aYy.digest);
        byte[] encoded = aYy.getEncoded();
        if (aYy.tryWrong) {
            encoded = new byte[2];
        }
        byte[] salt = pBEParameterSpec.getSalt();
        int iterationCount = pBEParameterSpec.getIterationCount();
        A01.A01 = encoded;
        A01.A02 = salt;
        A01.A00 = iterationCount;
        C21744AYy.A00(aYy);
        int i2 = aYy.ivSize;
        C21744AYy.A00(aYy);
        if (i2 != 0) {
            int i3 = aYy.keySize;
            C21744AYy.A00(aYy);
            A02 = A01.A03(i3, aYy.ivSize);
        } else {
            A02 = A01.A02(aYy.keySize);
        }
        if (str.startsWith("DES")) {
            if (A02 instanceof C21760AZs) {
                C22718AtM.A00(((AZr) ((C21760AZs) A02).A00).A00);
            } else {
                C22718AtM.A00(((AZr) A02).A00);
                return A02;
            }
        }
        return A02;
    }
}
