package X;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.Acd  reason: case insensitive filesystem */
public abstract class C21907Acd extends CipherSpi {
    public AlgorithmParameters A00;
    public C23069B2y A01;
    public C187108xF A02;
    public Class[] A03;
    public int A04;
    public boolean A05;
    public byte[] A06;
    public final C22844Awt A07 = A01(this);

    public static C21786AaJ A01(C21907Acd acd) {
        acd.A03 = new Class[]{AXP.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        acd.A00 = null;
        acd.A01 = null;
        acd.A02 = null;
        return new C21786AaJ();
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return AnonymousClass124.A02(this.A06);
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    public int engineGetOutputSize(int i) {
        return -1;
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new C21862Abm(e.getMessage(), e);
        }
    }

    public byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                C23069B2y b2y = this.A01;
                return b2y == null ? engineDoFinal(encoded, 0, encoded.length) : b2y.BxW(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }

    public static C21749AZd A00() {
        return new C21749AZd(new C21752AZg());
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        Throwable th;
        byte[] bArr2;
        C187108xF r0 = this.A02;
        if (r0 != null) {
            if (bArr != null) {
                r0.write(bArr, i, i2);
            }
            try {
                if (this.A05) {
                    C23069B2y b2y = this.A01;
                    C187108xF r02 = this.A02;
                    bArr2 = b2y.BxW(r02.A01(), 0, r02.size());
                } else {
                    try {
                        C23069B2y b2y2 = this.A01;
                        C187108xF r03 = this.A02;
                        bArr2 = b2y2.BwP(r03.A01(), 0, r03.size());
                    } catch (C22696At0 e) {
                        th = new BadPaddingException(e.getMessage());
                        throw th;
                    }
                }
                this.A02.A00();
                return bArr2;
            } catch (Exception e2) {
                th = new IllegalBlockSizeException(e2.getMessage());
            } catch (Throwable th2) {
                this.A02.A00();
                throw th2;
            }
        } else {
            throw AnonymousClass001.A09("not supported in a wrapping mode");
        }
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.A00 == null && this.A06 != null) {
            String B8R = this.A01.B8R();
            int indexOf = B8R.indexOf(47);
            if (indexOf >= 0) {
                B8R = C90514aH.A0z(B8R, indexOf);
            }
            try {
                C22724AuR.A02(B8R, this).init(new IvParameterSpec(this.A06));
            } catch (Exception e) {
                throw C90514aH.A0s(e.toString());
            }
        }
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r10 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r7, java.security.Key r8, java.security.spec.AlgorithmParameterSpec r9, java.security.SecureRandom r10) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C21744AYy
            if (r0 == 0) goto L_0x0066
            X.AYy r8 = (X.C21744AYy) r8
            boolean r0 = r9 instanceof javax.crypto.spec.PBEParameterSpec
            if (r0 == 0) goto L_0x0059
            X.B2y r0 = r6.A01
            java.lang.String r0 = r0.B8R()
            X.0pl r3 = X.C201779kN.A00(r0, r9, r8)
        L_0x0014:
            boolean r0 = r9 instanceof javax.crypto.spec.IvParameterSpec
            if (r0 == 0) goto L_0x0026
            javax.crypto.spec.IvParameterSpec r9 = (javax.crypto.spec.IvParameterSpec) r9
            byte[] r1 = r9.getIV()
            r6.A06 = r1
            X.AZs r0 = new X.AZs
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0026:
            boolean r0 = r3 instanceof X.AZr
            r5 = 3
            r4 = 1
            if (r0 == 0) goto L_0x0056
            int r0 = r6.A04
            if (r0 == 0) goto L_0x0056
            if (r7 == r5) goto L_0x0034
            if (r7 != r4) goto L_0x0056
        L_0x0034:
            byte[] r0 = new byte[r0]
            r6.A06 = r0
            r10.nextBytes(r0)
            byte[] r1 = r6.A06
            X.AZs r0 = new X.AZs
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0043:
            X.AZn r0 = new X.AZn
            r0.<init>(r10, r3)
            r3 = r0
        L_0x0049:
            if (r7 == r4) goto L_0x008f
            r0 = 2
            r2 = 0
            if (r7 == r0) goto L_0x0078
            r1 = 0
            if (r7 == r5) goto L_0x009c
            r0 = 4
            if (r7 != r0) goto L_0x0070
            goto L_0x0085
        L_0x0056:
            if (r10 == 0) goto L_0x0049
            goto L_0x0043
        L_0x0059:
            X.C21744AYy.A00(r8)
            X.0pl r0 = r8.param
            if (r0 == 0) goto L_0x00b1
            X.C21744AYy.A00(r8)
            X.0pl r3 = r8.param
            goto L_0x0014
        L_0x0066:
            byte[] r0 = r8.getEncoded()
            X.AZr r3 = new X.AZr
            r3.<init>(r0)
            goto L_0x0014
        L_0x0070:
            java.lang.String r1 = "Unknown mode parameter passed to init."
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ Exception -> 0x00a6 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00a6 }
            throw r0     // Catch:{ Exception -> 0x00a6 }
        L_0x0078:
            X.B2y r0 = r6.A01     // Catch:{ Exception -> 0x00a6 }
            r0.BKQ(r3, r2)     // Catch:{ Exception -> 0x00a6 }
            X.8xF r0 = new X.8xF     // Catch:{ Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ Exception -> 0x00a6 }
            r6.A02 = r0     // Catch:{ Exception -> 0x00a6 }
            goto L_0x008c
        L_0x0085:
            X.B2y r0 = r6.A01     // Catch:{ Exception -> 0x00a6 }
            r0.BKQ(r3, r2)     // Catch:{ Exception -> 0x00a6 }
            r6.A02 = r1     // Catch:{ Exception -> 0x00a6 }
        L_0x008c:
            r6.A05 = r2     // Catch:{ Exception -> 0x00a6 }
            return
        L_0x008f:
            X.B2y r0 = r6.A01     // Catch:{ Exception -> 0x00a6 }
            r0.BKQ(r3, r4)     // Catch:{ Exception -> 0x00a6 }
            X.8xF r0 = new X.8xF     // Catch:{ Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ Exception -> 0x00a6 }
            r6.A02 = r0     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00a3
        L_0x009c:
            X.B2y r0 = r6.A01     // Catch:{ Exception -> 0x00a6 }
            r0.BKQ(r3, r4)     // Catch:{ Exception -> 0x00a6 }
            r6.A02 = r1     // Catch:{ Exception -> 0x00a6 }
        L_0x00a3:
            r6.A05 = r4     // Catch:{ Exception -> 0x00a6 }
            return
        L_0x00a6:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            X.Abm r0 = new X.Abm
            r0.<init>(r1, r2)
            throw r0
        L_0x00b1:
            java.lang.String r0 = "PBE requires PBE parameters to be set."
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21907Acd.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    public Key engineUnwrap(byte[] bArr, String str, int i) {
        byte[] bArr2;
        C22598ArQ arQ;
        try {
            C23069B2y b2y = this.A01;
            if (b2y == null) {
                bArr2 = engineDoFinal(bArr, 0, bArr.length);
            } else {
                bArr2 = b2y.BwP(bArr, 0, bArr.length);
            }
            if (i == 3) {
                return new SecretKeySpec(bArr2, str);
            }
            if (!str.equals("") || i != 2) {
                try {
                    KeyFactory instance = KeyFactory.getInstance(str, ((C21786AaJ) this.A07).A00);
                    if (i == 1) {
                        return instance.generatePublic(new X509EncodedKeySpec(bArr2));
                    }
                    if (i == 2) {
                        return instance.generatePrivate(new PKCS8EncodedKeySpec(bArr2));
                    }
                    throw new InvalidKeyException(C90464aC.A0h(i, "Unknown key type ").toString());
                } catch (NoSuchProviderException e) {
                    throw new InvalidKeyException(C36331k8.A0i("Unknown key type ", AnonymousClass000.A0u(), e));
                } catch (InvalidKeySpecException e2) {
                    throw new InvalidKeyException(C36331k8.A0i("Unknown key type ", AnonymousClass000.A0u(), e2));
                }
            } else {
                try {
                    if (bArr2 instanceof C22598ArQ) {
                        arQ = (C22598ArQ) bArr2;
                    } else {
                        arQ = new C22598ArQ(C22656AsM.A04(bArr2));
                    }
                    Map map = AnonymousClass11n.A00;
                    AnonymousClass122 r2 = arQ.A00.A01;
                    Map map2 = AnonymousClass11n.A00;
                    synchronized (map2) {
                        try {
                            map2.get(r2);
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("algorithm ");
                    A0u.append(r2);
                    th = new InvalidKeyException(AnonymousClass000.A0q(" not supported", A0u));
                    throw th;
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
        } catch (C22696At0 e3) {
            throw new InvalidKeyException(e3.getMessage());
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        C187108xF r0 = this.A02;
        if (r0 != null) {
            r0.write(bArr, i, i2);
            return null;
        }
        throw AnonymousClass001.A09("not supported in a wrapping mode");
    }

    public C21907Acd(C23069B2y b2y, int i) {
        this.A01 = b2y;
        this.A04 = i;
    }

    public void engineSetMode(String str) {
        throw new NoSuchAlgorithmException(AnonymousClass000.A0p("can't support mode ", str, AnonymousClass000.A0u()));
    }

    public void engineSetPadding(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Padding ");
        A0u.append(str);
        throw new NoSuchPaddingException(AnonymousClass000.A0q(" unknown.", A0u));
    }

    public C21907Acd() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r4, java.security.Key r5, java.security.AlgorithmParameters r6, java.security.SecureRandom r7) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x001d
            java.lang.Class[] r2 = r3.A03
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
            r3.A00 = r6
            r3.engineInit((int) r4, (java.security.Key) r5, (java.security.spec.AlgorithmParameterSpec) r0, (java.security.SecureRandom) r7)
            return
        L_0x0027:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "can't handle parameter "
            X.C165567td.A1M(r6, r0, r1)
            java.lang.String r0 = r1.toString()
            java.security.InvalidAlgorithmParameterException r0 = X.C165617ti.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21907Acd.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        C187108xF r0 = this.A02;
        if (r0 != null) {
            r0.write(bArr, i, i2);
            return 0;
        }
        throw AnonymousClass001.A09("not supported in a wrapping mode");
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        Throwable th;
        byte[] bArr3;
        C187108xF r0 = this.A02;
        if (r0 != null) {
            r0.write(bArr, i, i2);
            try {
                if (this.A05) {
                    C23069B2y b2y = this.A01;
                    C187108xF r02 = this.A02;
                    bArr3 = b2y.BxW(r02.A01(), 0, r02.size());
                } else {
                    try {
                        C23069B2y b2y2 = this.A01;
                        C187108xF r03 = this.A02;
                        bArr3 = b2y2.BwP(r03.A01(), 0, r03.size());
                    } catch (C22696At0 e) {
                        th = new BadPaddingException(e.getMessage());
                        throw th;
                    }
                }
                int length = bArr3.length;
                if (length + i3 <= bArr2.length) {
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    this.A02.A00();
                    return length;
                }
                throw new ShortBufferException("output buffer too short for input.");
            } catch (Exception e2) {
                th = new IllegalBlockSizeException(e2.getMessage());
            } catch (Throwable th2) {
                this.A02.A00();
                throw th2;
            }
        } else {
            throw AnonymousClass001.A09("not supported in a wrapping mode");
        }
    }
}
