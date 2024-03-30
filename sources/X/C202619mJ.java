package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.9mJ  reason: invalid class name and case insensitive filesystem */
public class C202619mJ {
    public static final byte[] A07 = {69, 68, 0, 1};
    public final C19970wo A00;
    public final AnonymousClass17Z A01;
    public final AnonymousClass8SR A02;
    public final AnonymousClass1VT A03;
    public final C187128xJ A04;
    public final C193749Ms A05;
    public final C200819iI A06;

    private byte[] A02() {
        return new byte[]{87, 65, (byte) 6, 3};
    }

    private AnonymousClass8QN A00() {
        C200819iI r2 = this.A06;
        byte[] bArr = new byte[3];
        C200819iI.A00(r2, bArr);
        if (!Arrays.equals(C200819iI.A01, bArr)) {
            byte[] bArr2 = new byte[C203239na.A00(bArr)];
            C200819iI.A00(r2, bArr2);
            AnonymousClass8QO r1 = (AnonymousClass8QO) C170918Hz.A08(AnonymousClass8QO.DEFAULT_INSTANCE, bArr2);
            if ((r1.bitField0_ & 2) != 0) {
                AnonymousClass8QN r0 = r1.serverHello_;
                if (r0 == null) {
                    return AnonymousClass8QN.DEFAULT_INSTANCE;
                }
                return r0;
            }
            throw C90524aI.A0X("Handshake message does not contain server hello!");
        }
        throw new AnonymousClass1WM();
    }

    private C193749Ms A01(AnonymousClass8QN r11, AZA aza, AZA aza2, C199889gB r14) {
        AnonymousClass8R6 r5;
        AnonymousClass8R6 r1;
        String str;
        try {
            byte[] A062 = r11.ephemeral_.A06();
            r14.A03.A00(A062);
            AZ8 az8 = new AZ8(A062);
            AZ7 az7 = aza.A01;
            C131336Oq A002 = C131336Oq.A00();
            byte[] bArr = az8.A01;
            byte[] bArr2 = az7.A01;
            r14.A00(A002.A02(bArr, bArr2));
            AZ8 az82 = new AZ8(r14.A01(r11.static_.A06()));
            C131336Oq A003 = C131336Oq.A00();
            byte[] bArr3 = az82.A01;
            r14.A00(A003.A02(bArr3, bArr2));
            try {
                C172638Op r0 = (C172638Op) C170918Hz.A08(C172638Op.DEFAULT_INSTANCE, r14.A01(r11.payload_.A06()));
                if (r0 != null) {
                    C172628Oo r8 = r0.intermediate_;
                    if (r8 == null) {
                        r8 = C172628Oo.DEFAULT_INSTANCE;
                    }
                    C172628Oo r9 = r0.leaf_;
                    if (!((r9 == null && (r9 = C172628Oo.DEFAULT_INSTANCE) == null) || r8 == null)) {
                        try {
                            r5 = (AnonymousClass8R6) C170918Hz.A08(AnonymousClass8R6.DEFAULT_INSTANCE, r9.details_.A06());
                        } catch (AnonymousClass186 e) {
                            Log.e("wa6 certificate details parsing failed", e);
                            r5 = null;
                        }
                        try {
                            r1 = (AnonymousClass8R6) C170918Hz.A08(AnonymousClass8R6.DEFAULT_INSTANCE, r8.details_.A06());
                        } catch (AnonymousClass186 e2) {
                            Log.e("wa6 certificate details parsing failed", e2);
                            r1 = null;
                        }
                        if (!(r5 == null || r1 == null)) {
                            int i = r1.bitField0_;
                            if (!((i & 1) == 0 || (r5.bitField0_ & 2) == 0 || r1.serial_ != r5.issuerSerial_ || (i & 2) == 0 || r1.issuerSerial_ != 0)) {
                                if (!Arrays.equals(r5.key_.A06(), bArr3)) {
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("wa6: noise certificate key does not match proposed server static key; issuer=");
                                    str = C36381kD.A10(A0u, r5.issuerSerial_);
                                } else {
                                    byte[] A063 = r1.key_.A06();
                                    AZ8 az83 = (AZ8) C190839Am.A00.get("WhatsAppLongTerm1");
                                    if (az83 == null) {
                                        str = "wa6: intermediate cert key is missing";
                                    } else {
                                        boolean A012 = C131336Oq.A00().A01(new AZ8(A063).A01, r5.A0o(), r9.signature_.A06());
                                        boolean A013 = C131336Oq.A00().A01(az83.A01, r8.details_.A06(), r8.signature_.A06());
                                        if (!A012 || !A013) {
                                            str = "wa6: invalid signature on noise certificate";
                                        } else {
                                            byte[] A022 = r14.A02(aza2.A02.A01);
                                            r14.A00(C131336Oq.A00().A02(bArr, aza2.A01.A01));
                                            byte[] A023 = r14.A02(this.A02.A0o());
                                            AnonymousClass8NN A0p = AnonymousClass8PW.DEFAULT_INSTANCE.A0p();
                                            AnonymousClass8I5 A0O = C90474aD.A0O(A0p, A022);
                                            AnonymousClass8PW r12 = (AnonymousClass8PW) A0p.A00;
                                            r12.bitField0_ |= 1;
                                            r12.static_ = A0O;
                                            AnonymousClass8I5 A0O2 = C90474aD.A0O(A0p, A023);
                                            AnonymousClass8PW r13 = (AnonymousClass8PW) A0p.A00;
                                            r13.bitField0_ |= 2;
                                            r13.payload_ = A0O2;
                                            AnonymousClass8PW r4 = (AnonymousClass8PW) A0p.A0R();
                                            AnonymousClass8NN A014 = C170918Hz.A01(AnonymousClass8QO.DEFAULT_INSTANCE);
                                            AnonymousClass8QO r15 = (AnonymousClass8QO) A014.A00;
                                            r4.getClass();
                                            r15.clientFinish_ = r4;
                                            r15.bitField0_ |= 4;
                                            this.A04.write(A014.A0R().A0o());
                                            byte[][] A08 = C203239na.A08(new byte[0], r14.A02);
                                            return new C193749Ms(az82, A08[0], A08[1]);
                                        }
                                    }
                                }
                                Log.e(str);
                            }
                        }
                    }
                }
            } catch (AnonymousClass186 e3) {
                Log.e("wa6 noise certificate parsing failed", e3);
            }
            throw new AnonymousClass1WO(this);
        } catch (C29031Vb e4) {
            throw new C187338xg(e4);
        }
    }

    public C192729Ii A03() {
        C193749Ms r2 = this.A05;
        Objects.requireNonNull(r2);
        return new C192729Ii(r2, this.A06);
    }

    public AnonymousClass9R9 A04() {
        C193749Ms r2 = this.A05;
        Objects.requireNonNull(r2);
        return new AnonymousClass9R9(this.A04, r2);
    }

    public AZ8 A05() {
        return this.A05.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01ce, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01d4, code lost:
        throw new X.C187338xg(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01d6, code lost:
        r3 = r0.serverHello;
        r2 = new X.C199889gB(X.C199889gB.A04, A02());
        r2.A03.A00(r4.A02.A01);
        r2 = A01(r3, r4, r5, r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x0070, B:11:0x00cc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C202619mJ(X.C19970wo r14, X.AnonymousClass17Z r15, X.AnonymousClass8SR r16, X.AnonymousClass1VT r17, java.io.InputStream r18, java.io.OutputStream r19, X.AZA r20, X.AZ8 r21) {
        /*
            r13 = this;
            r13.<init>()
            r13.A00 = r14
            r13.A01 = r15
            r0 = r17
            r13.A03 = r0
            X.AZA r4 = X.AZA.A00()
            X.1VT r0 = r13.A03
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "routing_info"
            java.lang.String r2 = X.C36371kC.A0t(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r3 = r19
            if (r0 != 0) goto L_0x004c
            r1 = 3
            byte[] r6 = android.util.Base64.decode(r2, r1)
            if (r6 == 0) goto L_0x004c
            int r5 = r6.length
            if (r5 <= 0) goto L_0x004c
            byte[] r0 = A07
            r3.write(r0)
            byte[] r2 = new byte[r1]
            r1 = 2
            byte r0 = (byte) r5
            r2[r1] = r0
            r1 = 1
            int r0 = r5 >> 8
            byte r0 = (byte) r0
            r2[r1] = r0
            r1 = 0
            int r0 = r5 >> 16
            byte r0 = (byte) r0
            r2[r1] = r0
            r3.write(r2)
            r3.write(r6)
        L_0x004c:
            byte[] r0 = r13.A02()
            r3.write(r0)
            r0 = r16
            X.C18740tg.A06(r0)
            r13.A02 = r0
            X.9iI r0 = new X.9iI
            r1 = r18
            r0.<init>(r1)
            r13.A06 = r0
            X.8xJ r0 = new X.8xJ
            r0.<init>(r3)
            r13.A04 = r0
            r5 = r20
            r3 = r21
            if (r21 != 0) goto L_0x00cc
            byte[] r1 = X.C199889gB.A05     // Catch:{ 91j -> 0x01d5 }
            byte[] r0 = r13.A02()     // Catch:{ 91j -> 0x01d5 }
            X.9gB r6 = new X.9gB     // Catch:{ 91j -> 0x01d5 }
            r6.<init>(r1, r0)     // Catch:{ 91j -> 0x01d5 }
            X.AZ8 r0 = r4.A02     // Catch:{ 91j -> 0x01d5 }
            byte[] r1 = r0.A01     // Catch:{ 91j -> 0x01d5 }
            X.9Q6 r0 = r6.A03     // Catch:{ 91j -> 0x01d5 }
            r0.A00(r1)     // Catch:{ 91j -> 0x01d5 }
            X.8QM r0 = X.AnonymousClass8QM.DEFAULT_INSTANCE     // Catch:{ 91j -> 0x01d5 }
            X.8NN r3 = r0.A0p()     // Catch:{ 91j -> 0x01d5 }
            X.8I5 r2 = X.C90474aD.A0O(r3, r1)     // Catch:{ 91j -> 0x01d5 }
            X.8Hz r1 = r3.A00     // Catch:{ 91j -> 0x01d5 }
            X.8QM r1 = (X.AnonymousClass8QM) r1     // Catch:{ 91j -> 0x01d5 }
            int r0 = r1.bitField0_     // Catch:{ 91j -> 0x01d5 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 91j -> 0x01d5 }
            r1.ephemeral_ = r2     // Catch:{ 91j -> 0x01d5 }
            X.8Hz r3 = r3.A0R()     // Catch:{ 91j -> 0x01d5 }
            X.8QM r3 = (X.AnonymousClass8QM) r3     // Catch:{ 91j -> 0x01d5 }
            X.8QO r0 = X.AnonymousClass8QO.DEFAULT_INSTANCE     // Catch:{ 91j -> 0x01d5 }
            X.8NN r2 = X.C170918Hz.A01(r0)     // Catch:{ 91j -> 0x01d5 }
            X.8Hz r1 = r2.A00     // Catch:{ 91j -> 0x01d5 }
            X.8QO r1 = (X.AnonymousClass8QO) r1     // Catch:{ 91j -> 0x01d5 }
            r3.getClass()     // Catch:{ 91j -> 0x01d5 }
            r1.clientHello_ = r3     // Catch:{ 91j -> 0x01d5 }
            int r0 = r1.bitField0_     // Catch:{ 91j -> 0x01d5 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 91j -> 0x01d5 }
            X.8Hz r0 = r2.A0R()     // Catch:{ 91j -> 0x01d5 }
            X.8xJ r1 = r13.A04     // Catch:{ 91j -> 0x01d5 }
            byte[] r0 = r0.A0o()     // Catch:{ 91j -> 0x01d5 }
            r1.write(r0)     // Catch:{ 91j -> 0x01d5 }
            X.8QN r0 = r13.A00()     // Catch:{ 91j -> 0x01d5 }
            X.9Ms r2 = r13.A01(r0, r4, r5, r6)     // Catch:{ 91j -> 0x01d5 }
            goto L_0x01f0
        L_0x00cc:
            byte[] r1 = X.C199889gB.A06     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r13.A02()     // Catch:{ 1Vb -> 0x01ce }
            X.9gB r2 = new X.9gB     // Catch:{ 1Vb -> 0x01ce }
            r2.<init>(r1, r0)     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r3.A01     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r2.A01(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.AZ8 r6 = new X.AZ8     // Catch:{ 1Vb -> 0x01ce }
            r6.<init>(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.AZ8 r0 = r4.A02     // Catch:{ 1Vb -> 0x01ce }
            byte[] r1 = r0.A01     // Catch:{ 1Vb -> 0x01ce }
            X.9Q6 r9 = r2.A03     // Catch:{ 1Vb -> 0x01ce }
            r9.A00(r1)     // Catch:{ 1Vb -> 0x01ce }
            X.AZ7 r3 = r4.A01     // Catch:{ 1Vb -> 0x01ce }
            X.6Oq r0 = X.C131336Oq.A00()     // Catch:{ 1Vb -> 0x01ce }
            byte[] r10 = r6.A01     // Catch:{ 1Vb -> 0x01ce }
            byte[] r8 = r3.A01     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r0.A02(r10, r8)     // Catch:{ 1Vb -> 0x01ce }
            r2.A00(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.AZ8 r0 = r5.A02     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r0.A01     // Catch:{ 1Vb -> 0x01ce }
            byte[] r12 = r2.A02(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.AZ7 r3 = r5.A01     // Catch:{ 1Vb -> 0x01ce }
            X.6Oq r0 = X.C131336Oq.A00()     // Catch:{ 1Vb -> 0x01ce }
            byte[] r7 = r3.A01     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r0.A02(r10, r7)     // Catch:{ 1Vb -> 0x01ce }
            r2.A00(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.8SR r0 = r13.A02     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r0.A0o()     // Catch:{ 1Vb -> 0x01ce }
            byte[] r11 = r2.A02(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.8QM r0 = X.AnonymousClass8QM.DEFAULT_INSTANCE     // Catch:{ 1Vb -> 0x01ce }
            X.8NN r10 = r0.A0p()     // Catch:{ 1Vb -> 0x01ce }
            X.8I5 r3 = X.C90474aD.A0O(r10, r1)     // Catch:{ 1Vb -> 0x01ce }
            X.8Hz r1 = r10.A00     // Catch:{ 1Vb -> 0x01ce }
            X.8QM r1 = (X.AnonymousClass8QM) r1     // Catch:{ 1Vb -> 0x01ce }
            int r0 = r1.bitField0_     // Catch:{ 1Vb -> 0x01ce }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 1Vb -> 0x01ce }
            r1.ephemeral_ = r3     // Catch:{ 1Vb -> 0x01ce }
            X.8I5 r3 = X.C90474aD.A0O(r10, r12)     // Catch:{ 1Vb -> 0x01ce }
            X.8Hz r1 = r10.A00     // Catch:{ 1Vb -> 0x01ce }
            X.8QM r1 = (X.AnonymousClass8QM) r1     // Catch:{ 1Vb -> 0x01ce }
            int r0 = r1.bitField0_     // Catch:{ 1Vb -> 0x01ce }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ 1Vb -> 0x01ce }
            r1.static_ = r3     // Catch:{ 1Vb -> 0x01ce }
            X.8I5 r3 = X.C90474aD.A0O(r10, r11)     // Catch:{ 1Vb -> 0x01ce }
            X.8Hz r1 = r10.A00     // Catch:{ 1Vb -> 0x01ce }
            X.8QM r1 = (X.AnonymousClass8QM) r1     // Catch:{ 1Vb -> 0x01ce }
            int r0 = r1.bitField0_     // Catch:{ 1Vb -> 0x01ce }
            r0 = r0 | 4
            r1.bitField0_ = r0     // Catch:{ 1Vb -> 0x01ce }
            r1.payload_ = r3     // Catch:{ 1Vb -> 0x01ce }
            X.8Hz r10 = r10.A0R()     // Catch:{ 1Vb -> 0x01ce }
            X.8QM r10 = (X.AnonymousClass8QM) r10     // Catch:{ 1Vb -> 0x01ce }
            X.8QO r0 = X.AnonymousClass8QO.DEFAULT_INSTANCE     // Catch:{ 1Vb -> 0x01ce }
            X.8NN r3 = X.C170918Hz.A01(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.8Hz r1 = r3.A00     // Catch:{ 1Vb -> 0x01ce }
            X.8QO r1 = (X.AnonymousClass8QO) r1     // Catch:{ 1Vb -> 0x01ce }
            r10.getClass()     // Catch:{ 1Vb -> 0x01ce }
            r1.clientHello_ = r10     // Catch:{ 1Vb -> 0x01ce }
            int r0 = r1.bitField0_     // Catch:{ 1Vb -> 0x01ce }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 1Vb -> 0x01ce }
            X.8Hz r0 = r3.A0R()     // Catch:{ 1Vb -> 0x01ce }
            X.8xJ r1 = r13.A04     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r0.A0o()     // Catch:{ 1Vb -> 0x01ce }
            r1.write(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.8QN r3 = r13.A00()     // Catch:{ 1Vb -> 0x01ce }
            int r0 = r3.bitField0_     // Catch:{ 1Vb -> 0x01ce }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x018b
            X.91j r0 = new X.91j     // Catch:{ 1Vb -> 0x01ce }
            r0.<init>(r3)     // Catch:{ 1Vb -> 0x01ce }
            throw r0     // Catch:{ 1Vb -> 0x01ce }
        L_0x018b:
            X.AUx r0 = r3.ephemeral_     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r0.A06()     // Catch:{ 1Vb -> 0x01ce }
            r9.A00(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.AZ8 r1 = new X.AZ8     // Catch:{ 1Vb -> 0x01ce }
            r1.<init>(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.6Oq r0 = X.C131336Oq.A00()     // Catch:{ 1Vb -> 0x01ce }
            byte[] r1 = r1.A01     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r0.A02(r1, r8)     // Catch:{ 1Vb -> 0x01ce }
            r2.A00(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.6Oq r0 = X.C131336Oq.A00()     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r0.A02(r1, r7)     // Catch:{ 1Vb -> 0x01ce }
            r2.A00(r0)     // Catch:{ 1Vb -> 0x01ce }
            X.AUx r0 = r3.payload_     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r0.A06()     // Catch:{ 1Vb -> 0x01ce }
            r2.A01(r0)     // Catch:{ 1Vb -> 0x01ce }
            r3 = 0
            byte[] r1 = new byte[r3]     // Catch:{ 1Vb -> 0x01ce }
            byte[] r0 = r2.A02     // Catch:{ 1Vb -> 0x01ce }
            byte[][] r2 = X.C203239na.A08(r1, r0)     // Catch:{ 1Vb -> 0x01ce }
            r0 = 1
            r1 = r2[r3]     // Catch:{ 1Vb -> 0x01ce }
            r0 = r2[r0]     // Catch:{ 1Vb -> 0x01ce }
            X.9Ms r2 = new X.9Ms     // Catch:{ 1Vb -> 0x01ce }
            r2.<init>(r6, r1, r0)     // Catch:{ 1Vb -> 0x01ce }
            goto L_0x01f0
        L_0x01ce:
            r1 = move-exception
            X.8xg r0 = new X.8xg     // Catch:{ 91j -> 0x01d5 }
            r0.<init>(r1)     // Catch:{ 91j -> 0x01d5 }
            throw r0     // Catch:{ 91j -> 0x01d5 }
        L_0x01d5:
            r0 = move-exception
            X.8QN r3 = r0.serverHello
            byte[] r1 = X.C199889gB.A04
            byte[] r0 = r13.A02()
            X.9gB r2 = new X.9gB
            r2.<init>(r1, r0)
            X.AZ8 r0 = r4.A02
            byte[] r1 = r0.A01
            X.9Q6 r0 = r2.A03
            r0.A00(r1)
            X.9Ms r2 = r13.A01(r3, r4, r5, r2)
        L_0x01f0:
            r13.A05 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202619mJ.<init>(X.0wo, X.17Z, X.8SR, X.1VT, java.io.InputStream, java.io.OutputStream, X.AZA, X.AZ8):void");
    }
}
