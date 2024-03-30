package org.spongycastle.jcajce.provider.symmetric;

import X.AZr;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11u;
import X.AnonymousClass121;
import X.AnonymousClass12B;
import X.AnonymousClass91O;
import X.AnonymousClass9g1;
import X.B4P;
import X.B4S;
import X.C201779kN;
import X.C21743AYx;
import X.C21744AYy;
import X.C21861Abl;
import X.C21910Acg;
import X.C219311y;
import X.C22625Arr;
import X.C22632Ary;
import X.C22656AsM;
import X.C36381kD;
import X.C90464aC;
import X.C90494aF;
import X.C90524aI;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class PBEPBKDF2 {
    public static final Map A00;

    public class Mappings extends AnonymousClass11u {
        public static final String A00 = PBEPBKDF2.class.getName();
    }

    public class AlgParams extends C21861Abl {
        public C22625Arr A00;

        public byte[] engineGetEncoded(String str) {
            if (C21861Abl.A00(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                C22632Ary ary = C22625Arr.A04;
                this.A00 = new C22625Arr(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
        }

        public String engineToString() {
            return "PBKDF2 Parameters";
        }

        public byte[] engineGetEncoded() {
            try {
                return this.A00.A09("DER");
            } catch (IOException e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                throw C90464aC.A0U(C90494aF.A0c(e, "Oooops! ", A0u), A0u);
            }
        }

        public void engineInit(byte[] bArr, String str) {
            if (C21861Abl.A00(str)) {
                engineInit(bArr);
                return;
            }
            throw C90524aI.A0X("Unknown parameters format in PBKDF2 parameters object");
        }

        public void engineInit(byte[] bArr) {
            C22625Arr arr;
            AnonymousClass121 A002 = AnonymousClass121.A00(bArr);
            C22632Ary ary = C22625Arr.A04;
            if (A002 != null) {
                arr = new C22625Arr(C22656AsM.A04(A002));
            } else {
                arr = null;
            }
            this.A00 = arr;
        }
    }

    public class BasePBKDF2 extends C21910Acg {
        public int A00;
        public int A01;

        public BasePBKDF2(int i, int i2) {
            super("PBKDF2", C219311y.A0G);
            this.A01 = i;
            this.A00 = i2;
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            AnonymousClass91O r1;
            KeySpec keySpec2 = keySpec;
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec2;
                if (pBEKeySpec.getSalt() == null) {
                    char[] password = pBEKeySpec.getPassword();
                    if (this.A01 == 1) {
                        r1 = AnonymousClass91O.A00;
                    } else {
                        r1 = AnonymousClass91O.A01;
                    }
                    return new C21743AYx(r1, password);
                } else if (pBEKeySpec.getIterationCount() <= 0) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("positive iteration count required: ");
                    throw new InvalidKeySpecException(C36381kD.A10(A0u, pBEKeySpec.getIterationCount()));
                } else if (pBEKeySpec.getKeyLength() <= 0) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("positive key length required: ");
                    throw new InvalidKeySpecException(C36381kD.A10(A0u2, pBEKeySpec.getKeyLength()));
                } else if (pBEKeySpec.getPassword().length != 0) {
                    int i = this.A00;
                    int keyLength = pBEKeySpec.getKeyLength();
                    int i2 = this.A01;
                    AnonymousClass9g1 A012 = C201779kN.A01(i2, i);
                    byte[] A02 = C201779kN.A02(pBEKeySpec, i2);
                    byte[] salt = pBEKeySpec.getSalt();
                    int iterationCount = pBEKeySpec.getIterationCount();
                    A012.A01 = A02;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    AZr A013 = A012.A01(keyLength);
                    for (int i3 = 0; i3 != A02.length; i3++) {
                        A02[i3] = 0;
                    }
                    return new C21744AYy(this.A00, pBEKeySpec, this.A01, A013, i2, i, keyLength, -1);
                } else {
                    throw AnonymousClass001.A08("password empty");
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }
    }

    public class PBKDF2with8BIT extends BasePBKDF2 {
        public PBKDF2with8BIT() {
            super(1, 1);
        }
    }

    public class PBKDF2withGOST3411 extends BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super(5, 6);
        }
    }

    public class PBKDF2withSHA224 extends BasePBKDF2 {
        public PBKDF2withSHA224() {
            super(5, 7);
        }
    }

    public class PBKDF2withSHA256 extends BasePBKDF2 {
        public PBKDF2withSHA256() {
            super(5, 4);
        }
    }

    public class PBKDF2withSHA384 extends BasePBKDF2 {
        public PBKDF2withSHA384() {
            super(5, 8);
        }
    }

    public class PBKDF2withSHA3_224 extends BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super(5, 10);
        }
    }

    public class PBKDF2withSHA3_256 extends BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super(5, 11);
        }
    }

    public class PBKDF2withSHA3_384 extends BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super(5, 12);
        }
    }

    public class PBKDF2withSHA3_512 extends BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super(5, 13);
        }
    }

    public class PBKDF2withSHA512 extends BasePBKDF2 {
        public PBKDF2withSHA512() {
            super(5, 9);
        }
    }

    public class PBKDF2withSM3 extends BasePBKDF2 {
        public PBKDF2withSM3() {
            super(5, 14);
        }
    }

    public class PBKDF2withUTF8 extends BasePBKDF2 {
        public PBKDF2withUTF8() {
            super(5, 1);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A00 = hashMap;
        hashMap.put(B4P.A0J, 6);
        hashMap.put(C219311y.A1E, 1);
        hashMap.put(C219311y.A1G, 4);
        hashMap.put(C219311y.A1F, 7);
        hashMap.put(C219311y.A1H, 8);
        hashMap.put(C219311y.A1I, 9);
        hashMap.put(AnonymousClass12B.A0g, 11);
        hashMap.put(AnonymousClass12B.A0f, 10);
        hashMap.put(AnonymousClass12B.A0h, 12);
        hashMap.put(AnonymousClass12B.A0i, 13);
        hashMap.put(B4S.A00, 14);
    }
}
