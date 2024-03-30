package X;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.jcajce.provider.symmetric.AES;

/* renamed from: X.AuR  reason: case insensitive filesystem */
public class C22724AuR extends C21907Acd {
    public static final Class A0F = AnonymousClass11t.A00("javax.crypto.spec.GCMParameterSpec", C22724AuR.class);
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public PBEParameterSpec A04;
    public B35 A05;
    public C21760AZs A06;
    public B3W A07;
    public boolean A08;
    public Class[] A09;
    public int A0A;
    public int A0B;
    public AZo A0C;
    public AES.ECB.AnonymousClass1 A0D;
    public boolean A0E;

    public C22724AuR(B35 b35, int i) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = b35;
        this.A08 = true;
        this.A07 = new C21785AaI(b35);
        this.A00 = 16;
    }

    public static void A04(C22724AuR auR) {
        auR.A08 = true;
        auR.A04 = null;
        auR.A03 = null;
        auR.A02 = null;
    }

    public static boolean A06(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "OCB".equals(str);
    }

    public int engineGetBlockSize() {
        B35 b35 = this.A05;
        if (b35 == null) {
            return -1;
        }
        return b35.B8o();
    }

    public int engineGetOutputSize(int i) {
        return this.A07.BEq(i);
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        B3W b3w = this.A07;
        int i3 = i2;
        int BIi = b3w.BIi(i2);
        byte[] bArr2 = bArr;
        int i4 = i;
        if (BIi > 0) {
            byte[] bArr3 = new byte[BIi];
            int BmN = b3w.BmN(bArr2, i4, i3, bArr3, 0);
            if (BmN == 0) {
                return null;
            }
            if (BmN == BIi) {
                return bArr3;
            }
            byte[] bArr4 = new byte[BmN];
            System.arraycopy(bArr3, 0, bArr4, 0, BmN);
            return bArr4;
        }
        b3w.BmN(bArr, i, i2, (byte[]) null, 0);
        return null;
    }

    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.A07.BwX(bArr, i, i2);
    }

    public static AlgorithmParameters A02(String str, C21907Acd acd) {
        AlgorithmParameters instance = AlgorithmParameters.getInstance(str, ((C21786AaJ) acd.A07).A00);
        acd.A00 = instance;
        return instance;
    }

    public static C16590pl A03(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, int i, int i2, int i3, int i4) {
        C16590pl A022;
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw C165617ti.A0c("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        AnonymousClass9g1 A012 = C201779kN.A01(i, i2);
        byte[] salt = pBEParameterSpec.getSalt();
        int iterationCount = pBEParameterSpec.getIterationCount();
        A012.A01 = bArr;
        A012.A02 = salt;
        A012.A00 = iterationCount;
        if (i4 != 0) {
            A022 = A012.A03(i3, i4);
        } else {
            A022 = A012.A02(i3);
        }
        if (str.startsWith("DES")) {
            if (A022 instanceof C21760AZs) {
                C22718AtM.A00(((AZr) ((C21760AZs) A022).A00).A00);
            } else {
                C22718AtM.A00(((AZr) A022).A00);
                return A022;
            }
        }
        return A022;
    }

    public static void A05(C22724AuR auR, Class[] clsArr) {
        clsArr[1] = RC5ParameterSpec.class;
        clsArr[2] = A0F;
        clsArr[3] = AXO.class;
        clsArr[4] = IvParameterSpec.class;
        clsArr[5] = PBEParameterSpec.class;
        auR.A09 = clsArr;
        auR.A01 = -1;
        auR.A00 = 0;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        int BEq = this.A07.BEq(i2);
        byte[] bArr2 = new byte[BEq];
        if (i2 != 0) {
            i3 = this.A07.BmN(bArr, i, i4, bArr2, 0);
        } else {
            i3 = 0;
        }
        try {
            int B5n = i3 + this.A07.B5n(bArr2, i3);
            if (B5n == BEq) {
                return bArr2;
            }
            if (B5n <= BEq) {
                byte[] bArr3 = new byte[B5n];
                System.arraycopy(bArr2, 0, bArr3, 0, B5n);
                return bArr3;
            }
            throw new IllegalBlockSizeException("internal buffer overflow");
        } catch (C22702At6 e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public byte[] engineGetIV() {
        AZo aZo = this.A0C;
        if (aZo != null) {
            return AnonymousClass124.A02(aZo.A03);
        }
        C21760AZs aZs = this.A06;
        if (aZs != null) {
            return aZs.A01;
        }
        return null;
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.A00 == null) {
            if (this.A04 != null) {
                try {
                    A02(this.A03, this).init(this.A04);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.A0C != null) {
                if (this.A05 == null) {
                    try {
                        A02(C219311y.A0r.A01, this).init(new C22644AsA(AnonymousClass124.A02(this.A0C.A03)).A08());
                    } catch (Exception e) {
                        throw C90514aH.A0s(e.toString());
                    }
                } else {
                    try {
                        A02("GCM", this).init(new C22623Arp(AnonymousClass124.A02(this.A0C.A03), this.A0C.A00 / 8).A08());
                    } catch (Exception e2) {
                        throw C90514aH.A0s(e2.toString());
                    }
                }
            } else if (this.A06 != null) {
                String B8R = this.A07.BIf().B8R();
                int indexOf = B8R.indexOf(47);
                if (indexOf >= 0) {
                    B8R = C90514aH.A0z(B8R, indexOf);
                }
                try {
                    A02(B8R, this).init(new IvParameterSpec(this.A06.A01));
                } catch (Exception e3) {
                    throw C90514aH.A0s(e3.toString());
                }
            }
        }
        return this.A00;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x038a A[Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:? A[Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r18, java.security.Key r19, java.security.spec.AlgorithmParameterSpec r20, java.security.SecureRandom r21) {
        /*
            r17 = this;
            r1 = r20
            r4 = 0
            r0 = r17
            r0.A04 = r4
            r0.A03 = r4
            r0.A00 = r4
            r0.A0C = r4
            r2 = r19
            boolean r3 = r2 instanceof javax.crypto.SecretKey
            if (r3 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Key for algorithm "
            r1.append(r0)
            if (r19 == 0) goto L_0x0022
            java.lang.String r4 = r2.getAlgorithm()
        L_0x0022:
            r1.append(r4)
            java.lang.String r0 = " not suitable for symmetric enryption."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0031:
            java.lang.String r4 = "RC5-64"
            if (r20 != 0) goto L_0x004a
            X.B35 r3 = r0.A05
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r3.B8R()
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x004a
            java.lang.String r0 = "RC5 requires an RC5ParametersSpec to be passed in."
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x004a:
            int r9 = r0.A01
            r5 = 4
            java.lang.String r10 = "Algorithm requires a PBE key"
            r13 = 2
            r3 = 1
            if (r9 == r13) goto L_0x0114
            boolean r6 = r2 instanceof X.C21744AYy
            if (r6 == 0) goto L_0x00e4
            r7 = r2
            X.AYy r7 = (X.C21744AYy) r7
            X.C21744AYy.A00(r7)
            X.122 r6 = r7.oid
            if (r6 == 0) goto L_0x00df
            X.C21744AYy.A00(r7)
            X.122 r6 = r7.oid
            java.lang.String r6 = r6.A01
        L_0x0068:
            r0.A03 = r6
            X.C21744AYy.A00(r7)
            X.0pl r6 = r7.param
            if (r6 == 0) goto L_0x00c7
            X.C21744AYy.A00(r7)
            X.0pl r8 = r7.param
            boolean r6 = r8 instanceof X.C21760AZs
            if (r6 == 0) goto L_0x00b3
            r6 = r8
            X.AZs r6 = (X.C21760AZs) r6
            X.0pl r7 = r6.A00
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x0091
            r6 = r1
            javax.crypto.spec.IvParameterSpec r6 = (javax.crypto.spec.IvParameterSpec) r6
            byte[] r6 = r6.getIV()
            X.AZs r8 = new X.AZs
            r8.<init>(r7, r6)
            r0.A06 = r8
        L_0x0091:
            boolean r6 = r8 instanceof X.C21760AZs
            if (r6 == 0) goto L_0x009a
            r6 = r8
            X.AZs r6 = (X.C21760AZs) r6
            r0.A06 = r6
        L_0x009a:
            boolean r6 = r1 instanceof X.C21911Ach
            if (r6 == 0) goto L_0x0180
            java.lang.String r2 = r0.A02
            boolean r2 = A06(r2)
            if (r2 != 0) goto L_0x02b9
            X.B3W r2 = r0.A07
            boolean r2 = r2 instanceof X.C21784AaH
            if (r2 != 0) goto L_0x02b9
            java.lang.String r0 = "AEADParameterSpec can only be used with AEAD modes."
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x00b3:
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x0091
            r6 = r1
            javax.crypto.spec.IvParameterSpec r6 = (javax.crypto.spec.IvParameterSpec) r6
            byte[] r7 = r6.getIV()
            X.AZs r6 = new X.AZs
            r6.<init>(r8, r7)
            r0.A06 = r6
            r8 = r6
            goto L_0x0091
        L_0x00c7:
            boolean r6 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r6 == 0) goto L_0x03c0
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A04 = r6
            X.B3W r6 = r0.A07
            X.B35 r6 = r6.BIf()
            java.lang.String r6 = r6.B8R()
            X.0pl r8 = X.C201779kN.A00(r6, r1, r7)
            goto L_0x0091
        L_0x00df:
            java.lang.String r6 = r7.getAlgorithm()
            goto L_0x0068
        L_0x00e4:
            boolean r6 = r2 instanceof javax.crypto.interfaces.PBEKey
            if (r6 == 0) goto L_0x0106
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A04 = r6
            byte[] r8 = r2.getEncoded()
            int r10 = r0.A0A
            int r11 = r0.A0B
            int r6 = r0.A00
            int r12 = r6 * 8
            javax.crypto.spec.PBEParameterSpec r7 = r0.A04
            X.B3W r6 = r0.A07
            java.lang.String r6 = r6.B8R()
            X.0pl r8 = A03(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0091
        L_0x0106:
            if (r9 == 0) goto L_0x03c7
            if (r9 == r3) goto L_0x03c7
            byte[] r6 = r2.getEncoded()
            X.AZr r8 = new X.AZr
            r8.<init>(r6)
            goto L_0x009a
        L_0x0114:
            r9 = r2
            javax.crypto.SecretKey r9 = (javax.crypto.SecretKey) r9     // Catch:{ Exception -> 0x03d4 }
            boolean r6 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r6 == 0) goto L_0x0120
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A04 = r6
        L_0x0120:
            boolean r11 = r9 instanceof javax.crypto.interfaces.PBEKey
            if (r11 == 0) goto L_0x0140
            javax.crypto.spec.PBEParameterSpec r6 = r0.A04
            if (r6 != 0) goto L_0x0140
            r7 = r9
            javax.crypto.interfaces.PBEKey r7 = (javax.crypto.interfaces.PBEKey) r7
            byte[] r6 = r7.getSalt()
            if (r6 == 0) goto L_0x03cd
            byte[] r8 = r7.getSalt()
            int r7 = r7.getIterationCount()
            javax.crypto.spec.PBEParameterSpec r6 = new javax.crypto.spec.PBEParameterSpec
            r6.<init>(r8, r7)
            r0.A04 = r6
        L_0x0140:
            javax.crypto.spec.PBEParameterSpec r6 = r0.A04
            if (r6 != 0) goto L_0x014c
            if (r11 != 0) goto L_0x014c
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r10)
            throw r0
        L_0x014c:
            boolean r6 = r2 instanceof X.C21744AYy
            if (r6 == 0) goto L_0x0166
            r6 = r2
            X.AYy r6 = (X.C21744AYy) r6
            X.C21744AYy.A00(r6)
            X.0pl r8 = r6.param
            boolean r6 = r8 instanceof X.C21760AZs
            if (r6 != 0) goto L_0x0091
            if (r8 == 0) goto L_0x0166
            java.lang.String r1 = "Algorithm requires a PBE key suitable for PKCS12"
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0166:
            byte[] r12 = r9.getEncoded()
            int r14 = r0.A0A
            int r15 = r0.A0B
            int r6 = r0.A00
            int r16 = r6 * 8
            javax.crypto.spec.PBEParameterSpec r11 = r0.A04
            X.B3W r6 = r0.A07
            java.lang.String r10 = r6.B8R()
            X.0pl r8 = A03(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0091
        L_0x0180:
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x01c7
            int r2 = r0.A00
            if (r2 == 0) goto L_0x01b4
            javax.crypto.spec.IvParameterSpec r1 = (javax.crypto.spec.IvParameterSpec) r1
            byte[] r2 = r1.getIV()
            int r2 = r2.length
            int r4 = r0.A00
            if (r2 == r4) goto L_0x02ef
            X.B3W r2 = r0.A07
            boolean r2 = r2 instanceof X.C21784AaH
            if (r2 != 0) goto L_0x02ef
            boolean r2 = r0.A08
            if (r2 == 0) goto L_0x02ef
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "IV must be "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " bytes long."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x01b4:
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x0303
            java.lang.String r1 = "ECB"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0303
            java.lang.String r0 = "ECB mode does not use an IV"
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x01c7:
            boolean r6 = r1 instanceof javax.crypto.spec.RC2ParameterSpec
            if (r6 == 0) goto L_0x01f1
            javax.crypto.spec.RC2ParameterSpec r1 = (javax.crypto.spec.RC2ParameterSpec) r1
            byte[] r2 = r2.getEncoded()
            r1.getEffectiveKeyBits()
            X.AtN r8 = new X.AtN
            r8.<init>(r2)
            byte[] r2 = r1.getIV()
            if (r2 == 0) goto L_0x0303
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0303
            byte[] r2 = r1.getIV()
        L_0x01e7:
            X.AZs r1 = new X.AZs
            r1.<init>(r8, r2)
            r0.A06 = r1
            r8 = r1
            goto L_0x0303
        L_0x01f1:
            boolean r6 = r1 instanceof javax.crypto.spec.RC5ParameterSpec
            if (r6 == 0) goto L_0x0282
            javax.crypto.spec.RC5ParameterSpec r1 = (javax.crypto.spec.RC5ParameterSpec) r1
            byte[] r2 = r2.getEncoded()
            r1.getRounds()
            X.AZm r8 = new X.AZm
            r8.<init>(r2)
            X.B35 r7 = r0.A05
            java.lang.String r6 = r7.B8R()
            java.lang.String r2 = "RC5"
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L_0x027b
            java.lang.String r6 = r7.B8R()
            java.lang.String r2 = "RC5-32"
            boolean r2 = r6.equals(r2)
            java.lang.String r6 = "."
            if (r2 == 0) goto L_0x0240
            int r4 = r1.getWordSize()
            r2 = 32
            if (r4 == r2) goto L_0x026b
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RC5 already set up for a word size of 32 not "
            r2.append(r0)
            int r0 = r1.getWordSize()
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r6, r2)
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x0240:
            java.lang.String r2 = r7.B8R()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x026b
            int r4 = r1.getWordSize()
            r2 = 64
            if (r4 == r2) goto L_0x026b
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RC5 already set up for a word size of 64 not "
            r2.append(r0)
            int r0 = r1.getWordSize()
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r6, r2)
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x026b:
            byte[] r2 = r1.getIV()
            if (r2 == 0) goto L_0x0303
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0303
            byte[] r2 = r1.getIV()
            goto L_0x01e7
        L_0x027b:
            java.lang.String r0 = "RC5 parameters passed to a cipher that is not RC5."
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x0282:
            java.lang.Class r2 = A0F
            if (r2 == 0) goto L_0x02e2
            boolean r2 = r2.isInstance(r1)
            if (r2 == 0) goto L_0x02e2
            java.lang.String r2 = r0.A02
            boolean r2 = A06(r2)
            if (r2 != 0) goto L_0x02a1
            X.B3W r2 = r0.A07
            boolean r2 = r2 instanceof X.C21784AaH
            if (r2 != 0) goto L_0x02a1
            java.lang.String r0 = "GCMParameterSpec can only be used with AEAD modes."
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x02a1:
            boolean r2 = r8 instanceof X.C21760AZs
            if (r2 == 0) goto L_0x02a9
            X.AZs r8 = (X.C21760AZs) r8
            X.0pl r8 = r8.A00
        L_0x02a9:
            X.AZr r8 = (X.AZr) r8
            java.lang.Class r2 = X.C200749i9.A02
            X.AXK r2 = new X.AXK     // Catch:{ Exception -> 0x02db }
            r2.<init>(r1, r8)     // Catch:{ Exception -> 0x02db }
            java.lang.Object r8 = java.security.AccessController.doPrivileged(r2)     // Catch:{ Exception -> 0x02db }
            X.AZo r8 = (X.AZo) r8     // Catch:{ Exception -> 0x02db }
            goto L_0x02d6
        L_0x02b9:
            X.Ach r1 = (X.C21911Ach) r1
            boolean r2 = r8 instanceof X.C21760AZs
            if (r2 == 0) goto L_0x02d9
            X.AZs r8 = (X.C21760AZs) r8
            X.0pl r6 = r8.A00
        L_0x02c3:
            X.AZr r6 = (X.AZr) r6
            int r4 = r1.A00
            byte[] r2 = r1.getIV()
            byte[] r1 = r1.A01
            byte[] r1 = X.AnonymousClass124.A02(r1)
            X.AZo r8 = new X.AZo
            r8.<init>(r6, r2, r1, r4)
        L_0x02d6:
            r0.A0C = r8
            goto L_0x0303
        L_0x02d9:
            r6 = r8
            goto L_0x02c3
        L_0x02db:
            java.lang.String r0 = "Cannot process GCMParameterSpec."
            java.security.InvalidAlgorithmParameterException r1 = X.C165617ti.A0c(r0)
            throw r1
        L_0x02e2:
            if (r20 == 0) goto L_0x0303
            boolean r1 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r1 != 0) goto L_0x0303
            java.lang.String r0 = "unknown parameter type."
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x02ef:
            boolean r2 = r8 instanceof X.C21760AZs
            if (r2 == 0) goto L_0x02f7
            X.AZs r8 = (X.C21760AZs) r8
            X.0pl r8 = r8.A00
        L_0x02f7:
            byte[] r2 = r1.getIV()
            X.AZs r1 = new X.AZs
            r1.<init>(r8, r2)
            r8 = r1
            r0.A06 = r1
        L_0x0303:
            int r1 = r0.A00
            r6 = 3
            r4 = r18
            r7 = r21
            if (r1 == 0) goto L_0x0348
            boolean r1 = r8 instanceof X.C21760AZs
            if (r1 != 0) goto L_0x0348
            boolean r1 = r8 instanceof X.AZo
            if (r1 != 0) goto L_0x0348
            if (r21 != 0) goto L_0x0337
            java.security.SecureRandom r9 = X.C201939kk.A00()
        L_0x031a:
            if (r4 == r3) goto L_0x0339
            if (r4 == r6) goto L_0x0339
            X.B3W r1 = r0.A07
            X.B35 r1 = r1.BIf()
            java.lang.String r2 = r1.B8R()
            java.lang.String r1 = "PGPCFB"
            int r1 = r2.indexOf(r1)
            if (r1 >= 0) goto L_0x0348
            java.lang.String r0 = "no IV set when one expected"
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x0337:
            r9 = r7
            goto L_0x031a
        L_0x0339:
            int r1 = r0.A00
            byte[] r2 = new byte[r1]
            r9.nextBytes(r2)
            X.AZs r1 = new X.AZs
            r1.<init>(r8, r2)
            r0.A06 = r1
            r8 = r1
        L_0x0348:
            if (r21 == 0) goto L_0x0354
            boolean r1 = r0.A0E
            if (r1 == 0) goto L_0x0354
            X.AZn r1 = new X.AZn
            r1.<init>(r7, r8)
            r8 = r1
        L_0x0354:
            if (r4 == r3) goto L_0x0374
            if (r4 == r13) goto L_0x037a
            if (r4 == r6) goto L_0x0374
            if (r4 == r5) goto L_0x037a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            java.lang.String r0 = "unknown opmode "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            r1.append(r4)     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            java.lang.String r0 = " passed"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
        L_0x0374:
            X.B3W r1 = r0.A07     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            r1.BKQ(r8, r3)     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            goto L_0x0380
        L_0x037a:
            X.B3W r2 = r0.A07     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            r1 = 0
            r2.BKQ(r8, r1)     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
        L_0x0380:
            X.B3W r2 = r0.A07     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            boolean r1 = r2 instanceof X.C21784AaH     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            if (r1 == 0) goto L_0x03a9
            X.AZo r1 = r0.A0C     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            if (r1 != 0) goto L_0x03a9
            X.AaH r2 = (X.C21784AaH) r2     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            java.lang.reflect.Constructor r1 = X.C21784AaH.A01     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            X.B3Q r2 = r2.A00     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            X.AZs r1 = r0.A06     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            X.0pl r5 = r1.A00     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            X.AZr r5 = (X.AZr) r5     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            byte[] r1 = r2.BDj()     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            int r1 = r1.length     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            int r4 = r1 * 8
            X.AZs r1 = r0.A06     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            byte[] r3 = r1.A01     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            r2 = 0
            X.AZo r1 = new X.AZo     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            r1.<init>(r5, r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
            r0.A0C = r1     // Catch:{ IllegalArgumentException -> 0x03b5, Exception -> 0x03aa }
        L_0x03a9:
            return
        L_0x03aa:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            X.Abm r2 = new X.Abm
            r2.<init>(r0, r1)
            throw r2
        L_0x03b5:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            r2.<init>(r0, r1)
            throw r2
        L_0x03c0:
            java.lang.String r0 = "PBE requires PBE parameters to be set."
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x03c7:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r10)
            throw r0
        L_0x03cd:
            java.lang.String r0 = "PBEKey requires parameters to specify salt"
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        L_0x03d4:
            java.lang.String r0 = "PKCS12 requires a SecretKey/PBEKey"
            java.security.InvalidKeyException r1 = new java.security.InvalidKeyException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22724AuR.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    public void engineSetMode(String str) {
        B3Q aa7;
        B3W aaH;
        C200149gj asx;
        B35 atB;
        C21785AaI aaI;
        B35 aZe;
        B35 aZf;
        B35 b35 = this.A05;
        if (b35 != null) {
            String A012 = AnonymousClass11q.A01(str);
            this.A02 = A012;
            if (A012.equals("ECB")) {
                this.A00 = 0;
                aZe = b35;
            } else if (A012.equals("CBC")) {
                this.A00 = b35.B8o();
                aZe = new C21749AZd(b35);
            } else {
                if (A012.startsWith("OFB")) {
                    int B8o = b35.B8o();
                    this.A00 = B8o;
                    if (A012.length() != 3) {
                        aZf = new C22704At8(b35, Integer.parseInt(A012.substring(3)));
                    } else {
                        aZe = new C22704At8(b35, B8o * 8);
                    }
                } else if (A012.startsWith("CFB")) {
                    int B8o2 = b35.B8o();
                    this.A00 = B8o2;
                    if (A012.length() != 3) {
                        aZf = new C22705At9(b35, Integer.parseInt(A012.substring(3)));
                    } else {
                        aZe = new C22705At9(b35, B8o2 * 8);
                    }
                } else if (A012.startsWith("PGPCFB")) {
                    boolean equals = A012.equals("PGPCFBWITHIV");
                    if (equals || A012.length() == 6) {
                        this.A00 = b35.B8o();
                        aZf = new C21751AZf(b35, equals);
                    } else {
                        throw new NoSuchAlgorithmException(AnonymousClass000.A0p("no mode support for ", A012, AnonymousClass000.A0u()));
                    }
                } else if (A012.equals("OPENPGPCFB")) {
                    this.A00 = 0;
                    aZe = new C21750AZe(b35);
                } else {
                    if (A012.equals("SIC")) {
                        int B8o3 = b35.B8o();
                        this.A00 = B8o3;
                        if (B8o3 >= 16) {
                            this.A08 = false;
                            atB = new C22708AtC(b35);
                        } else {
                            throw AnonymousClass001.A08("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                        }
                    } else if (A012.equals("CTR")) {
                        this.A00 = b35.B8o();
                        this.A08 = false;
                        aaI = new C21785AaI(new C200149gj(new C22708AtC(b35)));
                        this.A07 = aaI;
                        return;
                    } else if (A012.equals("GOFB")) {
                        this.A00 = b35.B8o();
                        atB = new C22706AtA(b35);
                    } else if (A012.equals("GCFB")) {
                        this.A00 = b35.B8o();
                        atB = new C22707AtB(b35);
                    } else if (A012.equals("CTS")) {
                        this.A00 = b35.B8o();
                        asx = new C22693Asx(new C21749AZd(b35));
                        aaH = new C21785AaI(asx);
                        this.A07 = aaH;
                        return;
                    } else {
                        if (A012.equals("CCM")) {
                            this.A00 = 12;
                            Constructor constructor = C21784AaH.A01;
                            aa7 = new C21771Aa4(b35);
                        } else if (A012.equals("OCB")) {
                            if (this.A0D != null) {
                                this.A00 = 15;
                                Constructor constructor2 = C21784AaH.A01;
                                aa7 = new C21772Aa5(b35, new C21752AZg());
                            } else {
                                throw new NoSuchAlgorithmException(C36321k7.A0D("can't support mode ", str));
                            }
                        } else if (A012.equals("EAX")) {
                            this.A00 = b35.B8o();
                            Constructor constructor3 = C21784AaH.A01;
                            aa7 = new C21773Aa6(b35);
                        } else if (A012.equals("GCM")) {
                            this.A00 = b35.B8o();
                            Constructor constructor4 = C21784AaH.A01;
                            aa7 = new C21774Aa7(b35);
                        } else {
                            throw new NoSuchAlgorithmException(C36321k7.A0D("can't support mode ", str));
                        }
                        aaH = new C21784AaH(aa7);
                        this.A07 = aaH;
                        return;
                    }
                    asx = new C200149gj(atB);
                    aaH = new C21785AaI(asx);
                    this.A07 = aaH;
                    return;
                }
                aaI = new C21785AaI(aZf);
                this.A07 = aaI;
                return;
            }
            aaH = new C21785AaI(aZe);
            this.A07 = aaH;
            return;
        }
        throw new NoSuchAlgorithmException("no mode supported for this algorithm");
    }

    public void engineSetPadding(String str) {
        C200149gj asx;
        C21785AaI aaI;
        B35 BIf;
        C23060B2g aaC;
        if (this.A05 != null) {
            String A012 = AnonymousClass11q.A01(str);
            if (A012.equals("NOPADDING")) {
                B3W b3w = this.A07;
                if (b3w.BxX()) {
                    asx = new C200149gj(b3w.BIf());
                } else {
                    return;
                }
            } else if (A012.equals("WITHCTS") || A012.equals("CTSPADDING") || A012.equals("CS3PADDING")) {
                asx = new C22693Asx(this.A07.BIf());
            } else {
                this.A0E = true;
                if (A06(this.A02)) {
                    throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
                } else if (A012.equals("PKCS5PADDING") || A012.equals("PKCS7PADDING")) {
                    aaI = new C21785AaI(this.A07.BIf());
                    this.A07 = aaI;
                    return;
                } else {
                    if (A012.equals("ZEROBYTEPADDING")) {
                        BIf = this.A07.BIf();
                        aaC = new C21778AaB();
                    } else if (A012.equals("ISO10126PADDING") || A012.equals("ISO10126-2PADDING")) {
                        BIf = this.A07.BIf();
                        aaC = new C21779AaC();
                    } else if (A012.equals("X9.23PADDING") || A012.equals("X923PADDING")) {
                        BIf = this.A07.BIf();
                        aaC = new C21780AaD();
                    } else if (A012.equals("ISO7816-4PADDING") || A012.equals("ISO9797-1PADDING")) {
                        BIf = this.A07.BIf();
                        aaC = new C21775Aa8();
                    } else if (A012.equals("TBCPADDING")) {
                        BIf = this.A07.BIf();
                        aaC = new C21777AaA();
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Padding ");
                        A0u.append(str);
                        throw new NoSuchPaddingException(AnonymousClass000.A0q(" unknown.", A0u));
                    }
                    aaI = new C21785AaI(BIf, aaC);
                    this.A07 = aaI;
                    return;
                }
            }
            aaI = new C21785AaI(asx);
            this.A07 = aaI;
            return;
        }
        throw new NoSuchPaddingException("no padding supported for this algorithm");
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        B3W b3w = this.A07;
        int i4 = i2;
        int i5 = i3;
        byte[] bArr3 = bArr2;
        if (b3w.BIi(i2) + i3 <= bArr2.length) {
            try {
                return b3w.BmN(bArr, i, i4, bArr3, i5);
            } catch (C22702At6 e) {
                throw AnonymousClass001.A09(e.toString());
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            C165597tg.A1K(byteBuffer);
        } else if (remaining <= 512) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            Arrays.fill(bArr, (byte) 0);
        } else {
            byte[] bArr2 = new byte[512];
            do {
                int min = Math.min(512, remaining);
                byteBuffer.get(bArr2, 0, min);
                engineUpdateAAD(bArr2, 0, min);
                remaining -= min;
            } while (remaining > 0);
            Arrays.fill(bArr2, (byte) 0);
        }
    }

    public C22724AuR(C23130B6l b6l, int i, boolean z) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        this.A05 = b6l.BIf();
        this.A08 = false;
        this.A00 = 12;
        this.A07 = new C21784AaH(b6l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r4, java.security.Key r5, java.security.AlgorithmParameters r6, java.security.SecureRandom r7) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x001d
            java.lang.Class[] r2 = r3.A09
            java.lang.Class<java.security.spec.AlgorithmParameterSpec> r0 = java.security.spec.AlgorithmParameterSpec.class
            java.security.spec.AlgorithmParameterSpec r0 = r6.getParameterSpec(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x001f
        L_0x000b:
            r1 = 0
        L_0x000c:
            int r0 = r2.length
            if (r1 == r0) goto L_0x0027
            r0 = r2[r1]
            if (r0 == 0) goto L_0x001a
            r0 = r2[r1]     // Catch:{ Exception -> 0x001a }
            java.security.spec.AlgorithmParameterSpec r0 = r6.getParameterSpec(r0)     // Catch:{ Exception -> 0x001a }
            goto L_0x001f
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001d:
            r0 = 0
            goto L_0x0021
        L_0x001f:
            if (r0 == 0) goto L_0x0027
        L_0x0021:
            r3.engineInit((int) r4, (java.security.Key) r5, (java.security.spec.AlgorithmParameterSpec) r0, (java.security.SecureRandom) r7)
            r3.A00 = r6
            return
        L_0x0027:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "can't handle parameter "
            X.C165567td.A1M(r6, r0, r1)
            java.lang.String r0 = r1.toString()
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22724AuR.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5 = i3;
        int i6 = i2;
        byte[] bArr3 = bArr2;
        if (this.A07.BEq(i2) + i3 <= bArr2.length) {
            if (i2 != 0) {
                try {
                    i4 = this.A07.BmN(bArr, i, i6, bArr3, i5);
                } catch (C22697At1 e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                } catch (C22702At6 e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            } else {
                i4 = 0;
            }
            return i4 + this.A07.B5n(bArr2, i3 + i4);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    public C22724AuR(B35 b35, int i, int i2) {
        this.A09 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, A0F, AXO.class, IvParameterSpec.class, PBEParameterSpec.class};
        A04(this);
        this.A05 = b35;
        this.A01 = 2;
        this.A0A = i;
        this.A0B = i2;
        this.A00 = 16;
        this.A07 = new C21785AaI(b35);
    }

    public C22724AuR(B35 b35) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        this.A05 = b35;
        this.A07 = new C21785AaI(b35);
    }

    public C22724AuR(AES.ECB.AnonymousClass1 r4) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        this.A05 = new C21752AZg();
        this.A0D = r4;
        this.A07 = new C21785AaI((B35) new C21752AZg());
    }

    public C22724AuR(C23130B6l b6l) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        B35 BIf = b6l.BIf();
        this.A05 = BIf;
        this.A00 = BIf.B8o();
        this.A07 = new C21784AaH(b6l);
    }

    public C22724AuR(C200149gj r5) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        this.A05 = r5.A01;
        this.A07 = new C21785AaI(r5);
        this.A08 = true;
        this.A00 = 16;
    }
}
