package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9mF  reason: invalid class name and case insensitive filesystem */
public class C202579mF {
    public static final Object A04 = C36441kJ.A11();
    public final C235018s A00;
    public final C235018s A01;
    public final C193759Mt A02;
    public final C128046Aq A03;

    public static Cipher A00(SecretKeySpec secretKeySpec, int i, int i2) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr = new byte[16];
            bArr[3] = (byte) i2;
            bArr[2] = (byte) (i2 >> 8);
            bArr[1] = (byte) (i2 >> 16);
            bArr[0] = (byte) (i2 >> 24);
            instance.init(i, secretKeySpec, new IvParameterSpec(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public static byte[] A01(C21806Aag aag, C198809eE r7) {
        LinkedList linkedList = r7.A00;
        Iterator it = linkedList.iterator();
        LinkedList A0l = C90524aI.A0l();
        try {
            C202719mV r0 = new C202719mV(r7.A01);
            byte[] A022 = A02(aag, r0);
            r7.A01 = r0;
            return A022;
        } catch (AnonymousClass18B e) {
            while (true) {
                A0l.add(e);
                if (it.hasNext()) {
                    C202719mV r1 = new C202719mV((C202719mV) it.next());
                    byte[] A023 = A02(aag, r1);
                    it.remove();
                    linkedList.addFirst(r7.A01);
                    r7.A01 = r1;
                    if (linkedList.size() > 40) {
                        linkedList.removeLast();
                    }
                    return A023;
                }
                throw new AnonymousClass18B((List) A0l);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x032b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0331, code lost:
        throw new X.AnonymousClass18B(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x032b A[ExcHandler: BadPaddingException | IllegalBlockSizeException (r1v19 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:80:0x02f6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A02(X.C21806Aag r11, X.C202719mV r12) {
        /*
            X.8S2 r1 = r12.A00
            int r0 = r1.bitField0_
            r0 = r0 & 32
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x0376
            int r4 = r11.A01
            int r2 = r1.sessionVersion_
            if (r2 != 0) goto L_0x0013
            r2 = 2
        L_0x0013:
            if (r4 != r2) goto L_0x035f
            X.AUh r5 = r11.A02
            int r1 = r11.A00
            X.9U0 r0 = X.C202719mV.A00(r5, r12)     // Catch:{ 18E -> 0x0358 }
            if (r0 == 0) goto L_0x0051
            X.9U0 r0 = X.C202719mV.A00(r5, r12)     // Catch:{ 18E -> 0x0358 }
            java.lang.Object r3 = r0.A00     // Catch:{ 18E -> 0x0358 }
            X.8Qw r3 = (X.C173228Qw) r3     // Catch:{ 18E -> 0x0358 }
            if (r3 != 0) goto L_0x002b
            goto L_0x00d5
        L_0x002b:
            X.8S2 r0 = r12.A00     // Catch:{ 18E -> 0x0358 }
            int r0 = r0.sessionVersion_     // Catch:{ 18E -> 0x0358 }
            if (r0 != 0) goto L_0x0032
            r0 = 2
        L_0x0032:
            X.9jC r6 = X.C201249jC.A00(r0)     // Catch:{ 18E -> 0x0358 }
            X.8Pd r0 = r3.chainKey_     // Catch:{ 18E -> 0x0358 }
            if (r0 != 0) goto L_0x003c
            X.8Pd r0 = X.C172778Pd.DEFAULT_INSTANCE     // Catch:{ 18E -> 0x0358 }
        L_0x003c:
            X.AUx r0 = r0.key_     // Catch:{ 18E -> 0x0358 }
            byte[] r2 = r0.A06()     // Catch:{ 18E -> 0x0358 }
            X.8Pd r0 = r3.chainKey_     // Catch:{ 18E -> 0x0358 }
            if (r0 != 0) goto L_0x0048
            X.8Pd r0 = X.C172778Pd.DEFAULT_INSTANCE     // Catch:{ 18E -> 0x0358 }
        L_0x0048:
            int r0 = r0.index_     // Catch:{ 18E -> 0x0358 }
            X.9iu r3 = new X.9iu     // Catch:{ 18E -> 0x0358 }
            r3.<init>(r6, r2, r0)     // Catch:{ 18E -> 0x0358 }
            goto L_0x00d6
        L_0x0051:
            X.8S2 r0 = r12.A00     // Catch:{ 18E -> 0x0358 }
            int r0 = r0.sessionVersion_     // Catch:{ 18E -> 0x0358 }
            if (r0 != 0) goto L_0x0058
            r0 = 2
        L_0x0058:
            X.9jC r2 = X.C201249jC.A00(r0)     // Catch:{ 18E -> 0x0358 }
            X.8S2 r0 = r12.A00     // Catch:{ 18E -> 0x0358 }
            X.AUx r0 = r0.rootKey_     // Catch:{ 18E -> 0x0358 }
            byte[] r0 = r0.A06()     // Catch:{ 18E -> 0x0358 }
            X.9RA r6 = new X.9RA     // Catch:{ 18E -> 0x0358 }
            r6.<init>(r2, r0)     // Catch:{ 18E -> 0x0358 }
            X.8S2 r0 = r12.A00     // Catch:{ 18E -> 0x0352 }
            X.8Qw r0 = r0.senderChain_     // Catch:{ 18E -> 0x0352 }
            if (r0 != 0) goto L_0x0071
            X.8Qw r0 = X.C173228Qw.DEFAULT_INSTANCE     // Catch:{ 18E -> 0x0352 }
        L_0x0071:
            X.AUx r0 = r0.senderRatchetKey_     // Catch:{ 18E -> 0x0352 }
            X.AUh r3 = X.C200529hY.A00(r0)     // Catch:{ 18E -> 0x0352 }
            X.8S2 r0 = r12.A00     // Catch:{ 18E -> 0x0358 }
            X.8Qw r0 = r0.senderChain_     // Catch:{ 18E -> 0x0358 }
            if (r0 != 0) goto L_0x007f
            X.8Qw r0 = X.C173228Qw.DEFAULT_INSTANCE     // Catch:{ 18E -> 0x0358 }
        L_0x007f:
            X.AUx r0 = r0.senderRatchetKeyPrivate_     // Catch:{ 18E -> 0x0358 }
            byte[] r0 = r0.A06()     // Catch:{ 18E -> 0x0358 }
            X.5nT r2 = new X.5nT     // Catch:{ 18E -> 0x0358 }
            r2.<init>(r0)     // Catch:{ 18E -> 0x0358 }
            X.5rl r0 = new X.5rl     // Catch:{ 18E -> 0x0358 }
            r0.<init>(r2, r3)     // Catch:{ 18E -> 0x0358 }
            X.9U0 r2 = r6.A00(r5, r0)     // Catch:{ 18E -> 0x0358 }
            X.5rl r8 = X.C200529hY.A02()     // Catch:{ 18E -> 0x0358 }
            java.lang.Object r0 = r2.A00     // Catch:{ 18E -> 0x0358 }
            X.9RA r0 = (X.AnonymousClass9RA) r0     // Catch:{ 18E -> 0x0358 }
            X.9U0 r9 = r0.A00(r5, r8)     // Catch:{ 18E -> 0x0358 }
            java.lang.Object r0 = r9.A00     // Catch:{ 18E -> 0x0358 }
            X.9RA r0 = (X.AnonymousClass9RA) r0     // Catch:{ 18E -> 0x0358 }
            r12.A0C(r0)     // Catch:{ 18E -> 0x0358 }
            java.lang.Object r3 = r2.A01     // Catch:{ 18E -> 0x0358 }
            X.9iu r3 = (X.C201119iu) r3     // Catch:{ 18E -> 0x0358 }
            r12.A0A(r5, r3)     // Catch:{ 18E -> 0x0358 }
            X.9iu r0 = r12.A04()     // Catch:{ 18E -> 0x0358 }
            int r0 = r0.A00     // Catch:{ 18E -> 0x0358 }
            int r2 = r0 + -1
            r0 = 0
            int r7 = java.lang.Math.max(r2, r0)     // Catch:{ 18E -> 0x0358 }
            X.8NN r6 = X.C170918Hz.A03(r12)     // Catch:{ 18E -> 0x0358 }
            X.8Hz r2 = r6.A00     // Catch:{ 18E -> 0x0358 }
            X.8S2 r2 = (X.AnonymousClass8S2) r2     // Catch:{ 18E -> 0x0358 }
            int r0 = r2.bitField0_     // Catch:{ 18E -> 0x0358 }
            r0 = r0 | 16
            r2.bitField0_ = r0     // Catch:{ 18E -> 0x0358 }
            r2.previousCounter_ = r7     // Catch:{ 18E -> 0x0358 }
            X.AnonymousClass8NN.A0M(r6, r12)     // Catch:{ 18E -> 0x0358 }
            java.lang.Object r0 = r9.A01     // Catch:{ 18E -> 0x0358 }
            X.9iu r0 = (X.C201119iu) r0     // Catch:{ 18E -> 0x0358 }
            r12.A0B(r8, r0)     // Catch:{ 18E -> 0x0358 }
            goto L_0x00d6
        L_0x00d5:
            r3 = 0
        L_0x00d6:
            int r6 = r3.A00
            if (r6 <= r1) goto L_0x01b8
            X.9U0 r0 = X.C202719mV.A00(r5, r12)
            java.lang.Object r0 = r0.A00
            X.8Qw r0 = (X.C173228Qw) r0
            if (r0 == 0) goto L_0x033a
            X.B6c r0 = r0.messageKeys_
            java.util.Iterator r2 = r0.iterator()
        L_0x00ea:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x033a
            java.lang.Object r0 = r2.next()
            X.8Qv r0 = (X.C173218Qv) r0
            int r0 = r0.index_
            if (r0 != r1) goto L_0x00ea
            X.9U0 r6 = X.C202719mV.A00(r5, r12)
            java.lang.Object r8 = r6.A00
            X.8Qw r8 = (X.C173228Qw) r8
            r3 = 0
            if (r8 == 0) goto L_0x018c
            X.B6c r0 = r8.messageKeys_
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>(r0)
            java.util.Iterator r10 = r7.iterator()
        L_0x0110:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r9 = r10.next()
            X.8Qv r9 = (X.C173218Qv) r9
            int r0 = r9.index_
            if (r0 != r1) goto L_0x0110
            X.AUx r0 = r9.cipherKey_
            byte[] r0 = r0.A06()
            javax.crypto.spec.SecretKeySpec r5 = X.C90494aF.A0m(r0)
            X.AUx r0 = r9.macKey_
            byte[] r1 = r0.A06()
            java.lang.String r0 = "HmacSHA256"
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            r2.<init>(r1, r0)
            X.AUx r0 = r9.iv_
            byte[] r0 = r0.A06()
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r0)
            int r0 = r9.index_
            X.9M6 r3 = new X.9M6
            r3.<init>(r1, r5, r2, r0)
            r10.remove()
        L_0x014c:
            X.8NN r5 = r8.A0q()
            X.8Hz r1 = X.C90524aI.A0H(r5)
            X.8Qw r1 = (X.C173228Qw) r1
            X.8I2 r0 = X.AnonymousClass8I2.A02
            r1.messageKeys_ = r0
            X.8Hz r2 = X.C90524aI.A0H(r5)
            X.8Qw r2 = (X.C173228Qw) r2
            X.B6c r1 = r2.messageKeys_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x016f
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.messageKeys_ = r1
        L_0x016f:
            X.C21071A7i.A0O(r7, r1)
            X.8Hz r2 = r5.A0R()
            X.8Qw r2 = (X.C173228Qw) r2
            X.8S2 r0 = r12.A00
            X.8NN r1 = r0.A0q()
            X.8N0 r1 = (X.AnonymousClass8N0) r1
            java.lang.Object r0 = r6.A01
            int r0 = X.AnonymousClass000.A0I(r0)
            r1.A0U(r2, r0)
            X.AnonymousClass8NN.A0M(r1, r12)
        L_0x018c:
            X.9f5 r7 = r12.A03()
            X.9f5 r6 = r12.A02()
            javax.crypto.spec.SecretKeySpec r5 = r3.A03
            byte[] r2 = r11.A04
            int r1 = r2.length
            r0 = 8
            int r1 = r1 - r0
            byte[][] r2 = X.C200539hZ.A01(r2, r1, r0)
            r0 = 0
            r0 = r2[r0]
            byte[] r1 = X.C21806Aag.A00(r5, r7, r6, r0, r4)
            r0 = 1
            r0 = r2[r0]
            boolean r0 = java.security.MessageDigest.isEqual(r1, r0)
            if (r0 == 0) goto L_0x0332
            byte[] r6 = r11.A03
            r0 = 3
            r5 = 2
            if (r4 < r0) goto L_0x030a
            goto L_0x02f6
        L_0x01b8:
            int r2 = r1 - r6
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 <= r0) goto L_0x01c6
            java.lang.String r0 = "Over 2000 messages into the future!"
            X.18B r1 = new X.18B
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x01c6:
            int r6 = r3.A00
            if (r6 >= r1) goto L_0x02a7
            X.9M6 r10 = r3.A01()
            X.9U0 r9 = X.C202719mV.A00(r5, r12)
            java.lang.Object r8 = r9.A00
            X.8Hz r8 = (X.C170918Hz) r8
            X.8Qv r0 = X.C173218Qv.DEFAULT_INSTANCE
            X.8NN r7 = r0.A0p()
            javax.crypto.spec.SecretKeySpec r0 = r10.A02
            byte[] r0 = r0.getEncoded()
            X.8I5 r6 = X.C90474aD.A0O(r7, r0)
            X.8Hz r2 = r7.A00
            X.8Qv r2 = (X.C173218Qv) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.cipherKey_ = r6
            javax.crypto.spec.SecretKeySpec r0 = r10.A03
            byte[] r0 = r0.getEncoded()
            X.8I5 r6 = X.C90474aD.A0O(r7, r0)
            X.8Hz r2 = r7.A00
            X.8Qv r2 = (X.C173218Qv) r2
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.macKey_ = r6
            int r6 = r10.A00
            X.8Hz r2 = X.C90524aI.A0H(r7)
            X.8Qv r2 = (X.C173218Qv) r2
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            r2.index_ = r6
            javax.crypto.spec.IvParameterSpec r0 = r10.A01
            byte[] r0 = r0.getIV()
            X.8I5 r6 = X.C90474aD.A0O(r7, r0)
            X.8Hz r2 = r7.A00
            X.8Qv r2 = (X.C173218Qv) r2
            int r0 = r2.bitField0_
            r0 = r0 | 8
            r2.bitField0_ = r0
            r2.iv_ = r6
            X.8Hz r7 = r7.A0R()
            X.8NN r8 = r8.A0q()
            X.8Hz r6 = X.C90524aI.A0H(r8)
            X.8Qw r6 = (X.C173228Qw) r6
            int r0 = X.C173228Qw.CHAINKEY_FIELD_NUMBER
            r7.getClass()
            X.B6c r2 = r6.messageKeys_
            r0 = r2
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0250
            X.B6c r2 = X.C170918Hz.A0A(r2)
            r6.messageKeys_ = r2
        L_0x0250:
            r2.add(r7)
            X.8Hz r0 = r8.A00
            X.8Qw r0 = (X.C173228Qw) r0
            X.B6c r0 = r0.messageKeys_
            int r2 = r0.size()
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 <= r0) goto L_0x027a
            X.8Hz r7 = X.C90524aI.A0H(r8)
            X.8Qw r7 = (X.C173228Qw) r7
            r6 = 0
            X.B6c r2 = r7.messageKeys_
            r0 = r2
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0277
            X.B6c r2 = X.C170918Hz.A0A(r2)
            r7.messageKeys_ = r2
        L_0x0277:
            r2.remove(r6)
        L_0x027a:
            X.8S2 r0 = r12.A00
            X.8NN r6 = r0.A0q()
            X.8N0 r6 = (X.AnonymousClass8N0) r6
            java.lang.Object r0 = r9.A01
            int r2 = X.AnonymousClass000.A0I(r0)
            X.8Hz r0 = r8.A0R()
            X.8Qw r0 = (X.C173228Qw) r0
            r6.A0U(r0, r2)
            X.AnonymousClass8NN.A0M(r6, r12)
            byte[] r0 = X.C201119iu.A03
            byte[] r6 = X.C201119iu.A00(r3, r0)
            X.9jC r2 = r3.A01
            int r0 = r3.A00
            int r0 = r0 + 1
            X.9iu r3 = new X.9iu
            r3.<init>(r2, r6, r0)
            goto L_0x01c6
        L_0x02a7:
            byte[] r0 = X.C201119iu.A03
            byte[] r2 = X.C201119iu.A00(r3, r0)
            X.9jC r1 = r3.A01
            int r0 = r6 + 1
            X.9iu r7 = new X.9iu
            r7.<init>(r1, r2, r0)
            X.9U0 r6 = X.C202719mV.A00(r5, r12)
            java.lang.Object r5 = r6.A00
            X.8Hz r5 = (X.C170918Hz) r5
            X.8Pd r0 = X.C172778Pd.DEFAULT_INSTANCE
            X.8NN r2 = r0.A0p()
            X.8NA r2 = (X.AnonymousClass8NA) r2
            byte[] r1 = r7.A02
            int r0 = r1.length
            X.8Pd r1 = X.AnonymousClass8NA.A00(r7, r2, r1, r0)
            X.8NN r0 = r5.A0q()
            X.8N1 r0 = (X.AnonymousClass8N1) r0
            r0.A0U(r1)
            X.8Hz r2 = r0.A0R()
            X.8Qw r2 = (X.C173228Qw) r2
            X.8S2 r0 = r12.A00
            X.8NN r1 = r0.A0q()
            X.8N0 r1 = (X.AnonymousClass8N0) r1
            java.lang.Object r0 = r6.A01
            int r0 = X.AnonymousClass000.A0I(r0)
            r1.A0U(r2, r0)
            X.AnonymousClass8NN.A0M(r1, r12)
            X.9M6 r3 = r3.A01()
            goto L_0x018c
        L_0x02f6:
            javax.crypto.spec.SecretKeySpec r2 = r3.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x032b }
            javax.crypto.spec.IvParameterSpec r1 = r3.A01     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x032b }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0304, BadPaddingException | IllegalBlockSizeException -> 0x032b }
            r0.init(r5, r2, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0304, BadPaddingException | IllegalBlockSizeException -> 0x032b }
            goto L_0x0312
        L_0x0304:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x032b }
            throw r0     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x032b }
        L_0x030a:
            javax.crypto.spec.SecretKeySpec r1 = r3.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x032b }
            int r0 = r3.A00     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x032b }
            javax.crypto.Cipher r0 = A00(r1, r5, r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x032b }
        L_0x0312:
            byte[] r3 = r0.doFinal(r6)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x032b }
            X.8NN r2 = X.C170918Hz.A03(r12)
            X.8Hz r1 = r2.A00
            X.8S2 r1 = (X.AnonymousClass8S2) r1
            r0 = 0
            r1.pendingPreKey_ = r0
            int r0 = r1.bitField0_
            r0 = r0 & -129(0xffffffffffffff7f, float:NaN)
            r1.bitField0_ = r0
            X.AnonymousClass8NN.A0M(r2, r12)
            return r3
        L_0x032b:
            r1 = move-exception
            X.18B r0 = new X.18B
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0332:
            java.lang.String r1 = "Bad Mac!"
            X.18B r0 = new X.18B
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x033a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Received message with old counter: "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = " , "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r2, r1)
            X.18C r1 = new X.18C
            r1.<init>(r0)
            throw r1
        L_0x0352:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ 18E -> 0x0358 }
            throw r0     // Catch:{ 18E -> 0x0358 }
        L_0x0358:
            r1 = move-exception
            X.18B r0 = new X.18B
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x035f:
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            X.C36331k8.A1W(r1, r4)
            r0 = 1
            X.AnonymousClass000.A1L(r1, r2, r0)
            java.lang.String r0 = "Message version %d, but session version %d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.18B r0 = new X.18B
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0376:
            java.lang.String r1 = "Uninitialized session!"
            X.18B r0 = new X.18B
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202579mF.A02(X.Aag, X.9mV):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.B23} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.B23} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.Aag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.B23} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0113, code lost:
        throw X.C90524aI.A0Y(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e A[ExcHandler: BadPaddingException | IllegalBlockSizeException (r0v28 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:11:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B23 A03(byte[] r19) {
        /*
            r18 = this;
            r0 = r18
            X.18s r5 = r0.A01
            X.6Aq r4 = r0.A03
            X.9eE r3 = r5.A01(r4)
            X.9mV r2 = r3.A01
            X.9iu r1 = r2.A04()
            X.9M6 r8 = r1.A01()
            X.8S2 r0 = r2.A00     // Catch:{ 18E -> 0x0114 }
            X.8Qw r0 = r0.senderChain_     // Catch:{ 18E -> 0x0114 }
            if (r0 != 0) goto L_0x001c
            X.8Qw r0 = X.C173228Qw.DEFAULT_INSTANCE     // Catch:{ 18E -> 0x0114 }
        L_0x001c:
            X.AUx r0 = r0.senderRatchetKey_     // Catch:{ 18E -> 0x0114 }
            X.AUh r13 = X.C200529hY.A00(r0)     // Catch:{ 18E -> 0x0114 }
            X.8S2 r0 = r2.A00
            int r7 = r0.previousCounter_
            int r15 = r0.sessionVersion_
            if (r15 != 0) goto L_0x002b
            r15 = 2
        L_0x002b:
            r0 = 3
            r10 = 1
            if (r15 < r0) goto L_0x0043
            javax.crypto.spec.SecretKeySpec r9 = r8.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010e }
            javax.crypto.spec.IvParameterSpec r6 = r8.A01     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010e }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x003d, BadPaddingException | IllegalBlockSizeException -> 0x010e }
            r0.init(r10, r9, r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x003d, BadPaddingException | IllegalBlockSizeException -> 0x010e }
            goto L_0x004b
        L_0x003d:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010e }
            throw r0     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010e }
        L_0x0043:
            javax.crypto.spec.SecretKeySpec r6 = r8.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010e }
            int r0 = r8.A00     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010e }
            javax.crypto.Cipher r0 = A00(r6, r10, r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010e }
        L_0x004b:
            r6 = r19
            byte[] r14 = r0.doFinal(r6)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010e }
            X.Aag r9 = new X.Aag
            javax.crypto.spec.SecretKeySpec r10 = r8.A03
            int r0 = r1.A00
            X.9f5 r11 = r2.A02()
            X.9f5 r12 = r2.A03()
            r17 = r7
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            X.8S2 r7 = r2.A00
            int r6 = r7.bitField0_
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00bf
            X.8QU r6 = r7.pendingPreKey_     // Catch:{ 18E -> 0x00a6 }
            r7 = r6
            if (r6 != 0) goto L_0x0075
            X.8QU r6 = X.AnonymousClass8QU.DEFAULT_INSTANCE     // Catch:{ 18E -> 0x00a6 }
        L_0x0075:
            int r6 = r6.bitField0_     // Catch:{ 18E -> 0x00a6 }
            r6 = r6 & 1
            if (r6 == 0) goto L_0x008e
            if (r7 != 0) goto L_0x007f
            X.8QU r7 = X.AnonymousClass8QU.DEFAULT_INSTANCE     // Catch:{ 18E -> 0x00a6 }
        L_0x007f:
            int r6 = r7.preKeyId_     // Catch:{ 18E -> 0x00a6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ 18E -> 0x00a6 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ 18E -> 0x00a6 }
            X.Aux r8 = new X.Aux     // Catch:{ 18E -> 0x00a6 }
            r8.<init>(r6)     // Catch:{ 18E -> 0x00a6 }
            goto L_0x0090
        L_0x008e:
            X.Auy r8 = X.C22734Auy.A00     // Catch:{ 18E -> 0x00a6 }
        L_0x0090:
            X.8S2 r6 = r2.A00     // Catch:{ 18E -> 0x00a6 }
            X.8QU r7 = r6.pendingPreKey_     // Catch:{ 18E -> 0x00a6 }
            r6 = r7
            if (r7 != 0) goto L_0x0099
            X.8QU r7 = X.AnonymousClass8QU.DEFAULT_INSTANCE     // Catch:{ 18E -> 0x00a6 }
        L_0x0099:
            int r7 = r7.signedPreKeyId_     // Catch:{ 18E -> 0x00a6 }
            if (r6 != 0) goto L_0x009f
            X.8QU r6 = X.AnonymousClass8QU.DEFAULT_INSTANCE     // Catch:{ 18E -> 0x00a6 }
        L_0x009f:
            X.AUx r6 = r6.baseKey_     // Catch:{ 18E -> 0x00a6 }
            X.AUh r11 = X.C200529hY.A00(r6)     // Catch:{ 18E -> 0x00a6 }
            goto L_0x00ac
        L_0x00a6:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x00ac:
            X.8S2 r6 = r2.A00
            int r6 = r6.localRegistrationId_
            X.9f5 r10 = r2.A02()
            r12 = r9
            X.Aae r9 = new X.Aae
            r13 = r8
            r14 = r15
            r15 = r6
            r16 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x00bf:
            byte[] r6 = X.C201119iu.A03
            byte[] r6 = X.C201119iu.A00(r1, r6)
            X.9jC r1 = r1.A01
            int r0 = r0 + 1
            X.9iu r7 = new X.9iu
            r7.<init>(r1, r6, r0)
            X.8Pd r0 = X.C172778Pd.DEFAULT_INSTANCE
            X.8NN r6 = r0.A0p()
            X.8NA r6 = (X.AnonymousClass8NA) r6
            byte[] r1 = r7.A02
            int r0 = r1.length
            X.8Pd r1 = X.AnonymousClass8NA.A00(r7, r6, r1, r0)
            X.8S2 r0 = r2.A00
            X.8Qw r0 = r0.senderChain_
            if (r0 != 0) goto L_0x00e5
            X.8Qw r0 = X.C173228Qw.DEFAULT_INSTANCE
        L_0x00e5:
            X.8NN r0 = r0.A0q()
            X.8N1 r0 = (X.AnonymousClass8N1) r0
            r0.A0U(r1)
            X.8Hz r0 = r0.A0R()
            X.8Qw r0 = (X.C173228Qw) r0
            X.8NN r6 = X.C170918Hz.A03(r2)
            X.8Hz r1 = r6.A00
            X.8S2 r1 = (X.AnonymousClass8S2) r1
            r0.getClass()
            r1.senderChain_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            X.AnonymousClass8NN.A0M(r6, r2)
            r5.A03(r4, r3)
            return r9
        L_0x010e:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x0114:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202579mF.A03(byte[]):X.B23");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0213, code lost:
        if (X.AnonymousClass000.A0I(r7.A00()) != 16777215) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A04(X.B0M r22, X.C21804Aae r23) {
        /*
            r21 = this;
            r2 = r21
            X.18s r0 = r2.A01
            r20 = r0
            X.6Aq r0 = r2.A03
            r19 = r0
            r1 = r20
            X.9eE r4 = r1.A01(r0)
            X.9Mt r8 = r2.A02
            r6 = r23
            X.9f5 r5 = r6.A03
            X.18s r3 = r8.A00
            X.6Aq r0 = r8.A04
            r18 = r0
            X.6EZ r1 = X.AnonymousClass6R2.A00(r18)
            X.AUh r0 = r5.A00
            byte[] r0 = r0.A00
            X.C234318l.A01(r1, r0)
            int r9 = r6.A02
            X.AUh r0 = r6.A04
            r17 = r0
            byte[] r10 = r17.A00()
            X.9mV r0 = r4.A01
            X.8S2 r1 = r0.A00
            int r0 = r1.sessionVersion_
            if (r0 != 0) goto L_0x003a
            r0 = 2
        L_0x003a:
            if (r0 != r9) goto L_0x0093
            X.AUx r0 = r1.aliceBaseKey_
            byte[] r0 = r0.A06()
            boolean r0 = java.util.Arrays.equals(r10, r0)
            if (r0 == 0) goto L_0x0093
        L_0x0048:
            java.lang.String r8 = "SessionBuilder"
            java.lang.String r7 = "We've already setup a session for this V3 message, letting bundled message fall through..."
            X.13W r0 = X.AnonymousClass13X.A00
            if (r0 == 0) goto L_0x0061
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SignalProtocolLogger ("
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "): "
            X.C36321k7.A1R(r0, r7, r1)
        L_0x0061:
            X.Auy r7 = X.C22734Auy.A00
        L_0x0063:
            r0 = r18
            r3.A02(r5, r0)
            X.Aag r0 = r6.A05
            byte[] r3 = A01(r0, r4)
            r0 = r22
            r0.BJg(r3)
            r1 = r20
            r0 = r19
            r1.A03(r0, r4)
            boolean r0 = r7 instanceof X.C22733Aux
            if (r0 == 0) goto L_0x0091
            r0 = 1
        L_0x007f:
            if (r0 == 0) goto L_0x0090
            X.18s r2 = r2.A00
            java.lang.Object r0 = r7.A00()
            int r1 = X.AnonymousClass000.A0I(r0)
            X.18o r0 = r2.A03
            r0.A02(r1)
        L_0x0090:
            return r3
        L_0x0091:
            r0 = 0
            goto L_0x007f
        L_0x0093:
            java.util.LinkedList r0 = r4.A00
            java.util.Iterator r7 = r0.iterator()
        L_0x0099:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r7.next()
            X.9mV r0 = (X.C202719mV) r0
            X.8S2 r1 = r0.A00
            int r0 = r1.sessionVersion_
            if (r0 != 0) goto L_0x00ac
            r0 = 2
        L_0x00ac:
            if (r0 != r9) goto L_0x0099
            X.AUx r0 = r1.aliceBaseKey_
            byte[] r0 = r0.A06()
            boolean r0 = java.util.Arrays.equals(r10, r0)
            if (r0 == 0) goto L_0x0099
            goto L_0x0048
        L_0x00bb:
            X.18t r0 = r8.A03
            int r7 = r6.A01
            X.18p r0 = r0.A00
            byte[] r0 = r0.A02(r7)
            if (r0 == 0) goto L_0x0273
            X.6JW r9 = new X.6JW     // Catch:{ IOException -> 0x0255 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0255 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0255 }
            java.lang.String r0 = "axolotl loaded a signed pre key with id "
            X.C36321k7.A1T(r0, r1, r7)     // Catch:{ IOException -> 0x0255 }
            X.4uJ r1 = r9.A00     // Catch:{ 18E -> 0x024f }
            X.AUx r0 = r1.publicKey_     // Catch:{ 18E -> 0x024f }
            X.AUh r9 = X.C200529hY.A00(r0)     // Catch:{ 18E -> 0x024f }
            X.AUx r0 = r1.privateKey_     // Catch:{ 18E -> 0x024f }
            byte[] r1 = r0.A06()     // Catch:{ 18E -> 0x024f }
            X.5nT r0 = new X.5nT     // Catch:{ 18E -> 0x024f }
            r0.<init>(r1)     // Catch:{ 18E -> 0x024f }
            X.5rl r7 = new X.5rl     // Catch:{ 18E -> 0x024f }
            r7.<init>(r0, r9)     // Catch:{ 18E -> 0x024f }
            X.9NO r1 = new X.9NO
            r1.<init>()
            r0 = r17
            r1.A02 = r0
            r1.A00 = r5
            X.9Ij r0 = r3.A00()
            r1.A01 = r0
            r1.A04 = r7
            r1.A03 = r7
            X.AUM r7 = r6.A06
            boolean r0 = r7 instanceof X.C22733Aux
            if (r0 == 0) goto L_0x011f
            r16 = 1
        L_0x010a:
            if (r16 == 0) goto L_0x0131
            X.18s r9 = r8.A01
            java.lang.Object r0 = r7.A00()
            int r8 = X.AnonymousClass000.A0I(r0)
            X.18o r10 = r9.A03
            byte[] r11 = r10.A04(r8)
            if (r11 == 0) goto L_0x0232
            goto L_0x0122
        L_0x011f:
            r16 = 0
            goto L_0x010a
        L_0x0122:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0217 }
            java.lang.String r0 = "axolotl found a pre key with id "
            X.C36321k7.A1T(r0, r9, r8)     // Catch:{ IOException -> 0x0217 }
            X.9dj r0 = new X.9dj     // Catch:{ IOException -> 0x0217 }
            r0.<init>(r11)     // Catch:{ IOException -> 0x0217 }
            goto L_0x0134
        L_0x0131:
            X.Auy r8 = X.C22734Auy.A00
            goto L_0x0140
        L_0x0134:
            X.5rl r0 = r0.A00()
            java.util.Objects.requireNonNull(r0)
            X.Aux r8 = new X.Aux
            r8.<init>(r0)
        L_0x0140:
            r1.A05 = r8
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0149
            r4.A00()
        L_0x0149:
            X.9mV r9 = r4.A01
            X.9Ij r13 = r1.A01
            X.5rl r14 = r1.A04
            X.5rl r10 = r1.A03
            X.AUM r11 = r1.A05
            X.9f5 r15 = r1.A00
            X.AUh r8 = r1.A02
            if (r13 == 0) goto L_0x0248
            if (r14 == 0) goto L_0x0248
            if (r10 == 0) goto L_0x0248
            if (r11 == 0) goto L_0x0248
            if (r15 == 0) goto L_0x0248
            if (r8 == 0) goto L_0x0248
            r9.A05()     // Catch:{ IOException -> 0x0242 }
            r9.A09(r15)     // Catch:{ IOException -> 0x0242 }
            X.9f5 r0 = r13.A00     // Catch:{ IOException -> 0x0242 }
            r9.A08(r0)     // Catch:{ IOException -> 0x0242 }
            java.io.ByteArrayOutputStream r1 = X.C90524aI.A0Q()     // Catch:{ IOException -> 0x0242 }
            r0 = 32
            byte[] r12 = new byte[r0]     // Catch:{ IOException -> 0x0242 }
            r0 = -1
            java.util.Arrays.fill(r12, r0)     // Catch:{ IOException -> 0x0242 }
            r1.write(r12)     // Catch:{ IOException -> 0x0242 }
            X.AUh r0 = r15.A00     // Catch:{ IOException -> 0x0242 }
            X.5nT r12 = r14.A00     // Catch:{ IOException -> 0x0242 }
            byte[] r0 = X.C200529hY.A03(r12, r0)     // Catch:{ IOException -> 0x0242 }
            r1.write(r0)     // Catch:{ IOException -> 0x0242 }
            X.5nT r0 = r13.A01     // Catch:{ IOException -> 0x0242 }
            byte[] r0 = X.C200529hY.A03(r0, r8)     // Catch:{ IOException -> 0x0242 }
            r1.write(r0)     // Catch:{ IOException -> 0x0242 }
            byte[] r0 = X.C200529hY.A03(r12, r8)     // Catch:{ IOException -> 0x0242 }
            r1.write(r0)     // Catch:{ IOException -> 0x0242 }
            boolean r0 = r11 instanceof X.C22733Aux     // Catch:{ IOException -> 0x0242 }
            if (r0 == 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r0 = 0
            goto L_0x01a0
        L_0x019f:
            r0 = 1
        L_0x01a0:
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r0 = r11.A00()     // Catch:{ IOException -> 0x0242 }
            X.5rl r0 = (X.C120595rl) r0     // Catch:{ IOException -> 0x0242 }
            X.5nT r0 = r0.A00     // Catch:{ IOException -> 0x0242 }
            byte[] r0 = X.C200529hY.A03(r0, r8)     // Catch:{ IOException -> 0x0242 }
            r1.write(r0)     // Catch:{ IOException -> 0x0242 }
        L_0x01b1:
            byte[] r8 = r1.toByteArray()     // Catch:{ IOException -> 0x0242 }
            X.Auw r12 = new X.Auw     // Catch:{ IOException -> 0x0242 }
            r12.<init>()     // Catch:{ IOException -> 0x0242 }
            java.lang.String r0 = "WhisperText"
            byte[] r1 = r0.getBytes()     // Catch:{ IOException -> 0x0242 }
            r0 = 64
            byte[] r1 = r12.A02(r8, r1, r0)     // Catch:{ IOException -> 0x0242 }
            r0 = 32
            byte[][] r1 = X.C200539hZ.A01(r1, r0, r0)     // Catch:{ IOException -> 0x0242 }
            r11 = 0
            r0 = r1[r11]     // Catch:{ IOException -> 0x0242 }
            X.9RA r8 = new X.9RA     // Catch:{ IOException -> 0x0242 }
            r8.<init>(r12, r0)     // Catch:{ IOException -> 0x0242 }
            r0 = 1
            r1 = r1[r0]     // Catch:{ IOException -> 0x0242 }
            X.9iu r0 = new X.9iu     // Catch:{ IOException -> 0x0242 }
            r0.<init>(r12, r1, r11)     // Catch:{ IOException -> 0x0242 }
            X.9Ik r1 = new X.9Ik     // Catch:{ IOException -> 0x0242 }
            r1.<init>(r0, r8)     // Catch:{ IOException -> 0x0242 }
            X.9iu r0 = r1.A00     // Catch:{ IOException -> 0x0242 }
            r9.A0B(r10, r0)     // Catch:{ IOException -> 0x0242 }
            X.9RA r0 = r1.A01     // Catch:{ IOException -> 0x0242 }
            r9.A0C(r0)     // Catch:{ IOException -> 0x0242 }
            X.9mV r1 = r4.A01
            X.189 r0 = r3.A06
            int r0 = r0.A04()
            r1.A06(r0)
            X.9mV r1 = r4.A01
            int r0 = r6.A00
            r1.A07(r0)
            X.9mV r1 = r4.A01
            byte[] r0 = r17.A00()
            r1.A0D(r0)
            if (r16 == 0) goto L_0x0061
            java.lang.Object r0 = r7.A00()
            int r1 = X.AnonymousClass000.A0I(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r1 == r0) goto L_0x0061
            goto L_0x0063
        L_0x0217:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "error reading prekey "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; deleting"
            X.C36351kA.A1Q(r0, r1, r2)
            r10.A02(r8)
            X.18F r0 = new X.18F
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0232:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No prekey found with id "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r8)
            X.18F r0 = new X.18F
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0242:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x0248:
            java.lang.String r0 = "Null value!"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x024f:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x0255:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "failed to parse signed pre key record during load for id "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r7)
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "invalid prekey record with id "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r7)
            X.18F r0 = new X.18F
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0273:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "no signed prekey available with id "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r7)
            X.18F r0 = new X.18F
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202579mF.A04(X.B0M, X.Aae):byte[]");
    }

    public byte[] A05(B0M b0m, C21806Aag aag) {
        C235018s r3 = this.A01;
        C128046Aq r2 = this.A03;
        if (r3.A06.A0Z(AnonymousClass6R2.A00(r2))) {
            C198809eE A012 = r3.A01(r2);
            byte[] A013 = A01(aag, A012);
            b0m.BJg(A013);
            r3.A03(r2, A012);
            return A013;
        }
        throw new AnonymousClass18D(AnonymousClass000.A0l(r2, "No session for: ", AnonymousClass000.A0u()));
    }

    public C202579mF(C235018s r7, C235018s r8, C235018s r9, C235118t r10, C128046Aq r11) {
        this.A01 = r7;
        this.A00 = r8;
        this.A03 = r11;
        this.A02 = new C193759Mt(r7, r8, r9, r10, r11);
    }
}
