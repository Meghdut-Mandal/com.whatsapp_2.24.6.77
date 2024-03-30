package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;

public class AAE implements C22934Ayk {
    public final C23084B3s A00;
    public final AnonymousClass1DT A01;
    public final C22934Ayk A02;
    public final C29611Xh A03;
    public final AnonymousClass176 A04;
    public final C25301Ft A05;
    public final C20810yC A06;
    public final AnonymousClass1VN A07;
    public final C30571aQ A08;
    public final C30121Zh A09;
    public final AnonymousClass1DL A0A;
    public final AnonymousClass1A1 A0B;
    public final Integer A0C;

    private void A00(int i) {
        C23084B3s b3s = this.A00;
        b3s.BoV();
        this.A0A.A0E(b3s, "invalid-message-secret-message", (String) null);
        this.A01.A0T(b3s, this.A0C, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(X.C21337AHp r17, byte[] r18, int r19) {
        /*
            r16 = this;
            r4 = r17
            X.9X8 r3 = r4.A0A
            X.11F r6 = r3.A00
            if (r6 == 0) goto L_0x00a4
            X.3Qa r5 = X.C21337AHp.A00(r4)
            X.11F r0 = r5.A00
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00a4
            com.whatsapp.jid.Jid r0 = r4.A19
            X.11F r2 = X.AnonymousClass143.A00(r0)
            X.11F r0 = X.AnonymousClass143.A00(r6)
            if (r0 == 0) goto L_0x001f
            r2 = r0
        L_0x001f:
            r1 = 0
            java.lang.String r0 = r5.A01
            X.3Qa r7 = X.C165617ti.A0R(r2, r0, r1)
        L_0x0026:
            com.whatsapp.jid.UserJid r5 = r4.BHK()
            X.C18740tg.A06(r3)
            com.whatsapp.jid.Jid r0 = r4.A19
            X.11F r2 = X.AnonymousClass143.A00(r0)
            X.11F r0 = X.AnonymousClass143.A00(r6)
            if (r0 == 0) goto L_0x003a
            r2 = r0
        L_0x003a:
            java.lang.String r1 = r3.A04
            r0 = 0
            X.3Qa r8 = X.C165617ti.A0R(r2, r1, r0)
            X.C18740tg.A06(r3)
            com.whatsapp.jid.UserJid r6 = r3.A01
            long r14 = r4.A18
            java.lang.String r2 = r3.A03
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 == 0) goto L_0x006d
            r11 = 0
        L_0x0051:
            r12 = 2
            r9 = 0
            X.9XS r4 = new X.9XS
            r10 = r18
            r13 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r16
            X.1Ft r0 = r0.A05
            int r1 = r0.A01(r4)
            r0 = 4
            if (r1 == r0) goto L_0x006c
            java.lang.String r0 = "DecryptionCallbackMessageSecret//handlePlaintext/storeOrphanMessage/Failed to store orphan message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006c:
            return
        L_0x006d:
            X.8Nx r0 = X.C172458Nx.DEFAULT_INSTANCE
            X.8NN r3 = X.C170918Hz.A01(r0)
            X.8Hz r1 = r3.A00
            X.8Nx r1 = (X.C172458Nx) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.editTargetId_ = r2
            X.8QE r0 = X.AnonymousClass8QE.DEFAULT_INSTANCE
            X.8NN r2 = r0.A0p()
            X.8Hz r0 = r3.A0R()
            X.8Nx r0 = (X.C172458Nx) r0
            X.8Hz r1 = X.C90524aI.A0H(r2)
            X.8QE r1 = (X.AnonymousClass8QE) r1
            r0.getClass()
            r1.botMessageInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            byte[] r11 = X.AnonymousClass8NN.A0N(r2)
            goto L_0x0051
        L_0x00a4:
            X.3Qa r7 = X.C21337AHp.A00(r4)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAE.A01(X.AHp, byte[], int):void");
    }

    public AnonymousClass2bK A02(C64933Qa r4, C21337AHp aHp, byte[] bArr) {
        AnonymousClass2bK A012 = C183348qe.A01(this.A06, r4, aHp, bArr, 2);
        A012.A00 = 1000;
        if (aHp.A0A.A00 != null) {
            AnonymousClass11F r1 = C21337AHp.A00(aHp).A00;
            if (r1 instanceof UserJid) {
                A012.A0q(r1);
            }
        }
        return A012;
    }

    public AAE(AnonymousClass1DT r1, C22934Ayk ayk, C29611Xh r3, AnonymousClass176 r4, C25301Ft r5, C20810yC r6, AnonymousClass1VN r7, C30571aQ r8, C30121Zh r9, AnonymousClass1DL r10, C23084B3s b3s, AnonymousClass1A1 r12, Integer num) {
        this.A06 = r6;
        this.A0A = r10;
        this.A07 = r7;
        this.A01 = r1;
        this.A0B = r12;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A08 = r8;
        this.A09 = r9;
        this.A0C = num;
        this.A00 = b3s;
        this.A02 = ayk;
    }

    public void BJg(byte[] bArr) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DecryptionCallbackMessageSecret/handlePlaintext message=");
        C23084B3s b3s = this.A00;
        C36321k7.A1N(b3s, A0u);
        byte[] bArr2 = bArr;
        if (bArr == null) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            C36351kA.A1L(C165607th.A0g(b3s, "DecryptionCallbackMessageSecret/invalid plaintext; message.key=", A0u2), A0u2);
            A00(0);
        } else if (b3s instanceof C21337AHp) {
            try {
                C21337AHp aHp = (C21337AHp) b3s;
                if (!"text".equals(aHp.A0w)) {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    C36331k8.A1P(C165607th.A0g(b3s, "DecryptionCallbackMessageSecret/Invalid Message Type; message.key=", A0u3), A0u3);
                } else {
                    AnonymousClass9X8 r10 = aHp.A0A;
                    if (r10 == null) {
                        StringBuilder A0u4 = AnonymousClass000.A0u();
                        C36331k8.A1P(C165607th.A0g(b3s, "DecryptionCallbackMessageSecret/Missing Bot Metadata; message.key=", A0u4), A0u4);
                    } else {
                        C30121Zh r11 = this.A09;
                        Jid jid = aHp.A19;
                        AnonymousClass3T1 A002 = r11.A00(r10, AnonymousClass143.A00(jid));
                        if (A002 == null) {
                            A01(aHp, bArr2, 1);
                        }
                        String str = aHp.A1C;
                        AnonymousClass9X8 r12 = r10;
                        byte[] A032 = r11.A03(r12, AnonymousClass143.A00(jid), aHp.BHK(), A002, str, aHp.A0A.A03, bArr2);
                        if (A032 != null) {
                            this.A0A.A0E(b3s, aHp.A0w, (String) null);
                            AnonymousClass9X8 r2 = aHp.A0A;
                            if (r2.A00 != null) {
                                C64933Qa A003 = C21337AHp.A00(aHp);
                                if (A003.A00 instanceof UserJid) {
                                    C64933Qa A012 = r11.A01(r2, AnonymousClass143.A00(jid), A003);
                                    aHp.A0Q = A012;
                                    aHp.A0R = A012;
                                    aHp.A0E = jid;
                                }
                            }
                            if ("first".equals(aHp.A0A.A02)) {
                                AnonymousClass176 r1 = this.A04;
                                C64933Qa A004 = C21337AHp.A00(aHp);
                                ConcurrentHashMap concurrentHashMap = r1.A03;
                                if (!concurrentHashMap.contains(A004)) {
                                    concurrentHashMap.put(C21337AHp.A00(aHp), true);
                                }
                            }
                            this.A02.BJg(A032);
                            return;
                        }
                        C20810yC r102 = this.A06;
                        if (r102.A0E(4165)) {
                            AnonymousClass9X8 r14 = aHp.A0A;
                            String str2 = r14.A02;
                            if ("first".equals(str2) || "full".equals(str2)) {
                                C30571aQ.A00(this.A08, A02(r11.A01(r14, AnonymousClass143.A00(jid), C21337AHp.A00(aHp)), aHp, (byte[]) null), aHp);
                            } else if ((A002 instanceof AnonymousClass2bK) || (A002 instanceof AnonymousClass2bG)) {
                                A01(aHp, bArr2, 2);
                            }
                        }
                        if (r102.A0E(4165)) {
                            A00(51);
                            StringBuilder A0u5 = AnonymousClass000.A0u();
                            C36331k8.A1P(C165607th.A0g(b3s, "DecryptionCallbackMessageSecret/Decryption failed; message.key=", A0u5), A0u5);
                            return;
                        }
                        AnonymousClass9X8 r103 = aHp.A0A;
                        String str3 = r103.A02;
                        if ("inner".equals(str3)) {
                            Log.i("DecryptionCallbackMessageSecret/handlePlaintext/dropping inner message");
                        } else if (str3 == null || "full".equals(str3)) {
                            C30571aQ.A00(this.A08, A02(r11.A01(r103, AnonymousClass143.A00(jid), C21337AHp.A00(aHp)), aHp, bArr2), aHp);
                        } else if ("first".equals(str3)) {
                            C64933Qa A013 = r11.A01(r103, AnonymousClass143.A00(jid), C21337AHp.A00(aHp));
                            AnonymousClass3T1 A033 = this.A0B.A03(A013);
                            if (A033 == null) {
                                C30571aQ.A00(this.A08, A02(A013, aHp, bArr2), aHp);
                            } else {
                                StringBuilder A0u6 = AnonymousClass000.A0u();
                                A0u6.append("DecryptionCallbackMessageSecret/handlePlaintext/dropping first message as last message already stored: ");
                                C36321k7.A1N(A033.A1J, A0u6);
                            }
                        } else if ("last".equals(str3)) {
                            C18740tg.A06(r103);
                            AnonymousClass11F A005 = AnonymousClass143.A00(jid);
                            AnonymousClass11F A006 = AnonymousClass143.A00(r103.A00);
                            if (A006 != null) {
                                A005 = A006;
                            }
                            String str4 = r103.A03;
                            C18740tg.A06(str4);
                            C64933Qa A0R = C165617ti.A0R(A005, str4, false);
                            AnonymousClass3T1 A034 = this.A0B.A03(A0R);
                            if (A034 instanceof AnonymousClass2bO) {
                                StringBuilder A0u7 = AnonymousClass000.A0u();
                                A0u7.append("DecryptionCallbackMessageSecret/handlePlaintext/dropping last message as first message was revoked: ");
                                C36321k7.A1N(A034.A1J, A0u7);
                            } else {
                                AnonymousClass2bK A022 = A02(A0R, aHp, bArr2);
                                if (A034 != null) {
                                    A022.A1N = A034.A1N;
                                    A022.A0o(1);
                                    this.A03.A01(A022);
                                } else {
                                    C30571aQ.A00(this.A08, A022, aHp);
                                }
                            }
                        } else {
                            Log.e("DecryptionCallbackMessageSecret/handlePlaintext/Invalid message");
                            this.A01.A0T(b3s, this.A0C, 34);
                        }
                        this.A0A.A0E(b3s, aHp.A0w, (String) null);
                        return;
                    }
                }
                A00(0);
            } catch (Exception e) {
                StringBuilder A0u8 = AnonymousClass000.A0u();
                Log.e(AnonymousClass000.A0o(C165607th.A0g(b3s, "DecryptionCallbackMessageSecret/Error processing e2e message secret; message.key=", A0u8), A0u8), e);
                A00(34);
            }
        }
    }
}
