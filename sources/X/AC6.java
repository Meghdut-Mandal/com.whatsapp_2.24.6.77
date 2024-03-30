package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public final class AC6 implements C22939Ayp, C22943Ayt {
    public final C198209d5 A00;
    public final C20810yC A01;
    public final C20520xh A02;

    public AnonymousClass3T1 BdD(AnonymousClass9YL r21) {
        AnonymousClass3T1 r5;
        C195759Vv r3;
        long j;
        C198209d5 r4;
        AnonymousClass8SW r2;
        AnonymousClass3T1 A022;
        AnonymousClass11F A0L;
        AnonymousClass8SX r32;
        Object A0t;
        AnonymousClass9YL r22 = r21;
        if (!r22.A03) {
            boolean A1Z = C36401kF.A1Z(this.A01);
            AnonymousClass8SX r33 = r22.A0A;
            int i = r33.bitField1_;
            if (AnonymousClass000.A1P(33554432 & i)) {
                if (A1Z) {
                    r22.A03 = true;
                    C198209d5 r52 = this.A00;
                    C64933Qa r8 = r22.A0C;
                    AnonymousClass11F r14 = r22.A07;
                    UserJid userJid = r22.A08;
                    C172968Pw r10 = r33.encCommentMessage_;
                    if (r10 == null && (r10 = C172968Pw.DEFAULT_INSTANCE) == null) {
                        r5 = null;
                    } else {
                        AnonymousClass8SW r42 = r10.targetMessageKey_;
                        if (r42 == null && (r42 = AnonymousClass8SW.DEFAULT_INSTANCE) == null) {
                            Log.e("CommentProtobufHelper/Missing target message key");
                            throw C165567td.A0J(0);
                        }
                        C201449jc r34 = r52.A05;
                        C195759Vv A023 = r34.A02(r14, r42, r8);
                        UserJid A0b = C36401kF.A0b(r14);
                        if (r8.A02) {
                            A0b = r52.A00.A09();
                        } else if (!AnonymousClass143.A0I(A0b)) {
                            if (!(A0b instanceof PhoneUserJid)) {
                                A0b = null;
                            } else {
                                throw C165567td.A0J(0);
                            }
                        }
                        C26191Jf r6 = r52.A06;
                        C64933Qa r9 = A023.A01;
                        C64933Qa A012 = r6.A01(r9);
                        AnonymousClass1A1 r62 = (AnonymousClass1A1) r52.A07.get();
                        if (r62 != null) {
                            AnonymousClass3T1 A03 = r62.A03(A012);
                            if (A03 == null) {
                                Log.i("CommentProtobufHelper/parseEncCommentMessage/parent message not found.");
                                r5 = new AnonymousClass2bV(r8, r22.A04);
                                r5.A0u(new AnonymousClass2bB(new C195759Vv(userJid, r9), -1));
                                r5.A0q(r14);
                            } else {
                                if (A03.A1J.A02) {
                                    A0L = C36441kJ.A0n(r52.A00);
                                } else {
                                    A0L = A03.A0L();
                                }
                                if (r52.A03.A0E(6770)) {
                                    try {
                                        r32 = AnonymousClass8SX.A0i(r34.A04(new AnonymousClass9XK(r10.encIv_, r10.encPayload_, r14, A0b, r42, r8, "Enc Comment", r52.A04.A00(A03))));
                                    } catch (AnonymousClass186 unused) {
                                        Log.e("CommentProtobufHelper/parseEncCommentMessage/could not get E2E.Message from the decrypted bytes");
                                        throw C165567td.A0J(0);
                                    }
                                } else {
                                    C193379Lf r13 = r52.A02;
                                    C195759Vv r82 = new C195759Vv(A0L, r9);
                                    long j2 = A03.A1N;
                                    AnonymousClass11F r11 = r82.A00;
                                    byte[] A013 = r13.A01.A01(j2);
                                    C22557Aom aom = new C22557Aom(r13, r10, r82);
                                    if (A013 == null || A013.length != 32) {
                                        Log.e("CommentMessageEncryptionManagerinvalid message secret");
                                        C28541Tb A0J = C165567td.A0J(66);
                                        AnonymousClass00C.A0D(A0J, 0);
                                        A0t = C90524aI.A0t(A0J);
                                    } else if (A0b == null) {
                                        Log.e("CommentMessageEncryptionManagersenderLid is null");
                                        C28541Tb A0J2 = C165567td.A0J(0);
                                        AnonymousClass00C.A0D(A0J2, 0);
                                        A0t = C90524aI.A0t(A0J2);
                                    } else if (r11 == null) {
                                        Log.e("CommentMessageEncryptionManager/targetSenderUserJid is null");
                                        C28541Tb A0J3 = C165567td.A0J(0);
                                        AnonymousClass00C.A0D(A0J3, 0);
                                        A0t = C90524aI.A0t(A0J3);
                                    } else {
                                        int i2 = r10.bitField0_;
                                        boolean z = false;
                                        if ((i2 & 4) != 0) {
                                            z = true;
                                            if ((i2 & 2) != 0) {
                                                A0t = ((AnonymousClass0AK) aom.BKt(r11, A0b, A013)).value;
                                            }
                                        }
                                        StringBuilder A0u = AnonymousClass000.A0u();
                                        A0u.append("CommentMessageEncryptionManager/one of the enc params is null, encPayload = ");
                                        A0u.append(AnonymousClass000.A1P(i2 & 2));
                                        Log.e(C36371kC.A0z(", encIv = ", A0u, z));
                                        C28541Tb A0J4 = C165567td.A0J(0);
                                        AnonymousClass00C.A0D(A0J4, 0);
                                        A0t = C90524aI.A0t(A0J4);
                                    }
                                    if (A0t instanceof AnonymousClass03N) {
                                        Throwable A002 = AnonymousClass0AK.A00(A0t);
                                        if (A002 == null) {
                                            A002 = AnonymousClass001.A09("Unable to decrypt message but reason unknown.");
                                        }
                                        throw A002;
                                    }
                                    AnonymousClass0AN.A00(A0t);
                                    AnonymousClass011 A19 = C36441kJ.A19(true, A0t);
                                    if (AnonymousClass000.A1X(A19.first)) {
                                        r32 = (AnonymousClass8SX) A19.second;
                                        if (r32 == null) {
                                            Log.e("CommentProtobufHelper/Decrypted message missing");
                                            throw C165567td.A0J(0);
                                        }
                                    } else {
                                        Log.e("CommentProtobufHelper/parseEncCommentMessage/Failed to decrypt the message");
                                        throw C165567td.A0J(0);
                                    }
                                }
                                AnonymousClass9YL A014 = r22.A01(r32);
                                C20520xh r35 = (C20520xh) r52.A08.get();
                                if (r35 != null) {
                                    r5 = r35.A00(A014);
                                    r5.A0u(new AnonymousClass2bB(new C195759Vv(A0L, A012), A03.A1N));
                                    r5.A13 = true;
                                } else {
                                    Log.e("CommentProtobufHelper/Missing fMessageProtobufSubsystem");
                                    throw C165567td.A0J(26);
                                }
                            }
                        } else {
                            Log.e("CommentProtobufHelper/Missing coreMessageStore");
                            throw C165567td.A0J(26);
                        }
                    }
                    r22.A03 = false;
                } else {
                    r5 = r22.A02(81);
                    r4 = this.A00;
                    C172968Pw r23 = r33.encCommentMessage_;
                    if (r23 == null) {
                        r23 = C172968Pw.DEFAULT_INSTANCE;
                    }
                    if ((r23.bitField0_ & 1) != 0) {
                        r2 = r23.targetMessageKey_;
                        if (r2 == null && (r2 = AnonymousClass8SW.DEFAULT_INSTANCE) == null) {
                            Log.e("CommentProtobufHelper/Missing target message key");
                            throw C165567td.A0J(0);
                        }
                        r3 = new C195759Vv(C36421kH.A0N(r2.participant_), r4.A06.A01(C30681ab.A01(r2)));
                        j = -1;
                        r5.A0u(new AnonymousClass2bB(r3, j));
                        return r5;
                    }
                }
            } else if ((i & 1073741824) != 0) {
                if (r22.A0N) {
                    if (A1Z) {
                        C172738Oz r0 = r33.commentMessage_;
                        if (r0 == null) {
                            r0 = C172738Oz.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8SX r02 = r0.message_;
                        if (r02 == null) {
                            r02 = AnonymousClass8SX.DEFAULT_INSTANCE;
                        }
                        AnonymousClass00C.A08(r02);
                        AnonymousClass9YL A015 = r22.A01(r02);
                        A015.A03 = true;
                        A022 = this.A02.A00(A015);
                        A015.A03 = false;
                    } else {
                        A022 = r22.A02(81);
                    }
                    r4 = this.A00;
                    C172738Oz r24 = r33.commentMessage_;
                    if (r24 == null) {
                        r24 = C172738Oz.DEFAULT_INSTANCE;
                    }
                    if ((r24.bitField0_ & 2) != 0) {
                        r2 = r24.targetMessageKey_;
                        if (r2 == null && (r2 = AnonymousClass8SW.DEFAULT_INSTANCE) == null) {
                            Log.e("CommentProtobufHelper/Missing target message key");
                            throw C165567td.A0J(0);
                        }
                        r3 = new C195759Vv(C36421kH.A0N(r2.participant_), r4.A06.A01(C30681ab.A01(r2)));
                        j = -1;
                        r5.A0u(new AnonymousClass2bB(r3, j));
                        return r5;
                    }
                } else {
                    throw C165567td.A0J(0);
                }
            } else if (AnonymousClass97T.A00(r22) == AnonymousClass91G.REVOKE) {
                r22.A03 = true;
                r5 = this.A02.A00(r22);
                r22.A03 = false;
                if (r5 instanceof AnonymousClass2bO) {
                    C198209d5 r43 = this.A00;
                    String str = r22.A0E;
                    UserJid userJid2 = r22.A08;
                    if (!(str == null || userJid2 == null)) {
                        C64933Qa A016 = r43.A06.A01(C165617ti.A0R(r5.A1J.A00, str, r43.A00.A0M(userJid2)));
                        AnonymousClass1A1 r03 = (AnonymousClass1A1) r43.A07.get();
                        if (r03 != null) {
                            AnonymousClass3T1 A032 = r03.A03(A016);
                            if (A032 == null) {
                                Log.w("CommentProtobufHelper/received a comment revoke, but we cant find a parent message/skipping adding comment info");
                                return r5;
                            }
                            r3 = C195759Vv.A00(A032);
                            j = A032.A1N;
                            r5.A0u(new AnonymousClass2bB(r3, j));
                            return r5;
                        }
                        Log.e("CommentProtobufHelper/Missing coreMessageStore");
                        throw C165567td.A0J(26);
                    }
                }
            }
            return r5;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x035c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C187838yc BdE(X.C196159Xy r29, X.AnonymousClass3T1 r30) {
        /*
            r28 = this;
            r14 = 0
            r12 = r29
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x03dc
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r11 = r30
            boolean r0 = r11.A1T(r0)
            if (r0 == 0) goto L_0x03dc
            boolean r0 = r11 instanceof X.AnonymousClass2bO
            if (r0 != 0) goto L_0x03dc
            X.3Kx r0 = r11.A0P()
            if (r0 == 0) goto L_0x03d7
            X.9Vv r13 = r0.A01()
            if (r13 == 0) goto L_0x03d7
            X.8NL r10 = X.C170918Hz.A0D()
            X.AnonymousClass00C.A0B(r10)
            r9 = 0
            X.8N8 r6 = r12.A01
            boolean r0 = r12.A06
            r16 = r0
            boolean r8 = r12.A05
            boolean r15 = r12.A04
            X.3un r7 = r12.A02
            byte[] r5 = r12.A0B
            boolean r4 = r12.A08
            boolean r3 = r12.A03
            boolean r1 = r12.A07
            boolean r0 = r12.A0A
            X.AnonymousClass00C.A0D(r10, r14)
            r26 = 1
            X.9Xy r2 = new X.9Xy
            r20 = r16
            r21 = r8
            r22 = r15
            r23 = r4
            r24 = r3
            r25 = r1
            r27 = r0
            r18 = r7
            r19 = r5
            r17 = r6
            r16 = r10
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r28
            X.0xh r0 = r5.A02
            r0.A02(r2, r11)
            if (r8 == 0) goto L_0x00d2
            X.8Oz r0 = X.C172738Oz.DEFAULT_INSTANCE
            X.8NN r4 = r0.A0p()
            X.8Hz r0 = r4.A00
            X.8Oz r0 = (X.C172738Oz) r0
            X.8SW r0 = r0.targetMessageKey_
            if (r0 != 0) goto L_0x0079
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0079:
            X.8NG r2 = X.C170918Hz.A0Q(r0)
            X.3Qa r1 = r13.A01
            X.11F r0 = r13.A00
            X.C183338qd.A02(r0, r2, r1, r14)
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8Oz r1 = (X.C172738Oz) r1
            X.8SW r0 = X.AnonymousClass8NN.A0G(r2)
            r1.targetMessageKey_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.8Ri r3 = r10.A0U()
            X.0yC r0 = r5.A01
            X.C203359nq.A0A(r0, r10)
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8Oz r1 = (X.C172738Oz) r1
            X.8SX r0 = X.AnonymousClass8NN.A0D(r10)
            r0.getClass()
            r1.message_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.8NL r0 = r12.A00
            X.8SX r2 = X.AnonymousClass8NN.A0E(r0)
            X.8Hz r0 = r4.A0R()
            X.8Oz r0 = (X.C172738Oz) r0
            r0.getClass()
            r2.commentMessage_ = r0
            int r1 = r2.bitField1_
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r0
            r2.bitField1_ = r1
            r6.A0T(r3)
        L_0x00cf:
            X.8yc r0 = X.C187838yc.STOP_AND_RETURN_RESULT
            return r0
        L_0x00d2:
            X.9d5 r7 = r5.A00
            boolean r0 = X.C198209d5.A00(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            if (r0 == 0) goto L_0x03d1
            X.1Yl r14 = r7.A01
            com.whatsapp.comments.MessageCommentsManager r14 = (com.whatsapp.comments.MessageCommentsManager) r14
            X.3Kx r0 = r11.A0P()
            if (r0 == 0) goto L_0x0126
            java.lang.Long r5 = r0.A04()
            if (r5 == 0) goto L_0x03c6
            long r0 = r5.longValue()
            r15 = 0
            int r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x03c6
            X.1A1 r4 = r14.A03
            X.3T1 r13 = X.C36421kH.A0R(r4, r0)
            r10 = 71
            if (r13 == 0) goto L_0x03b3
            X.1Jf r5 = r14.A02
            X.3Qa r4 = r13.A1J
            X.AnonymousClass00C.A07(r4)
            X.3Qa r8 = r5.A02(r4)
            if (r8 == 0) goto L_0x03a4
            boolean r4 = r4.A02
            if (r4 == 0) goto L_0x037b
            X.0wQ r4 = r14.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.C36441kJ.A0n(r4)
        L_0x0119:
            X.9Vv r5 = new X.9Vv
            r5.<init>(r4, r8)
            X.2bB r4 = new X.2bB
            r4.<init>(r5, r0)
            r11.A0u(r4)
        L_0x0126:
            X.8NL r4 = r12.A00
            X.0yC r5 = r7.A03
            r0 = 6770(0x1a72, float:9.487E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 == 0) goto L_0x01f6
            X.3Kx r0 = r11.A0P()
            if (r0 == 0) goto L_0x0392
            X.9Vv r8 = r0.A01()
            if (r8 == 0) goto L_0x0387
            X.0wQ r0 = r7.A00
            X.13w r10 = r0.A08()
            if (r10 == 0) goto L_0x0381
            X.005 r0 = r7.A07
            java.lang.Object r1 = r0.get()
            X.1A1 r1 = (X.AnonymousClass1A1) r1
            X.1Jf r0 = r7.A06
            X.3Qa r3 = r8.A01
            X.3Qa r0 = r0.A01(r3)
            X.3T1 r1 = r1.A03(r0)
            X.1Fh r0 = r7.A04
            boolean r14 = r0.A00(r1)
            X.8NL r8 = r2.A00
            X.C203359nq.A0A(r5, r8)
            byte[] r13 = X.AnonymousClass8NN.A0N(r8)
            java.lang.String r12 = "Enc Comment"
            X.9Wx r1 = new X.9Wx
            r11 = r3
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            X.9jc r0 = r7.A05
            X.0fI r9 = r0.A03(r1)
            X.8Hz r0 = r4.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.8Pw r0 = r0.encCommentMessage_
            if (r0 != 0) goto L_0x0182
            X.8Pw r0 = X.C172968Pw.DEFAULT_INSTANCE
        L_0x0182:
            X.8NN r7 = r0.A0q()
            java.lang.Object r3 = r9.first
            X.AUx r3 = (X.C21674AUx) r3
            X.8Hz r1 = X.C90524aI.A0H(r7)
            X.8Pw r1 = (X.C172968Pw) r1
            int r0 = X.C172968Pw.ENC_IV_FIELD_NUMBER
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.encIv_ = r3
            java.lang.Object r3 = r9.second
            X.AUx r3 = (X.C21674AUx) r3
            X.8Hz r1 = X.C90524aI.A0H(r7)
            X.8Pw r1 = (X.C172968Pw) r1
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.encPayload_ = r3
            java.lang.Object r0 = r9.third
            X.8SW r0 = (X.AnonymousClass8SW) r0
            X.8Hz r1 = X.C90524aI.A0H(r7)
            X.8Pw r1 = (X.C172968Pw) r1
            r0.getClass()
            r1.targetMessageKey_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.8Hz r0 = r7.A0R()
            X.8Pw r0 = (X.C172968Pw) r0
            X.8SX r3 = X.AnonymousClass8NN.A0F(r4, r0)
            r3.encCommentMessage_ = r0
            int r1 = r3.bitField1_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r3.bitField1_ = r1
            X.0yV r1 = X.C21000yV.A01
            r0 = 7772(0x1e5c, float:1.0891E-41)
            boolean r0 = X.C20800yB.A01(r1, r5, r0)
            if (r0 != 0) goto L_0x01eb
            X.8Ri r0 = r8.A0U()
        L_0x01e8:
            r4.A0j(r0)
        L_0x01eb:
            X.8N8 r0 = r2.A01
            X.8Hz r0 = r0.A0R()
            r6.A0T(r0)
            goto L_0x00cf
        L_0x01f6:
            X.9Lf r14 = r7.A02
            X.3Kx r0 = r11.A0P()
            if (r0 != 0) goto L_0x0217
            java.lang.String r0 = "CommentMessageEncryptionManager/encryptAndSetComment/message CommentMessageInfo is null"
        L_0x0200:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8SX r2 = X.AnonymousClass8NN.A0E(r4)
            r2.encCommentMessage_ = r9
            int r1 = r2.bitField1_
            r0 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            r1 = r1 & r0
            r2.bitField1_ = r1
            X.1Fu r0 = new X.1Fu
            r0.<init>(r3, r9)
            throw r0
        L_0x0217:
            X.9Vv r10 = r0.A01()
            if (r10 != 0) goto L_0x0220
            java.lang.String r0 = "CommentMessageEncryptionManager/encryptAndSetComment/parentMessageKey is null"
            goto L_0x0200
        L_0x0220:
            java.lang.Long r1 = r0.A04()
            if (r1 == 0) goto L_0x0377
            long r11 = r1.longValue()
            r7 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0377
            X.0yC r8 = r14.A02
            X.8NL r7 = r2.A00
            X.C203359nq.A0A(r8, r7)
            X.8Hz r15 = r7.A0R()
            X.3Qa r5 = r10.A01
            X.AnonymousClass00C.A07(r5)
            long r0 = r1.longValue()
            X.1Je r11 = r14.A01
            byte[] r13 = r11.A01(r0)
            if (r13 == 0) goto L_0x0262
            int r11 = r13.length
            r0 = 32
            if (r11 == r0) goto L_0x0275
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CommentMessageEncryptionManager/encryptComment/invalid message secret length "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " for parent message key: messageKey.id"
            X.C36321k7.A1Z(r1, r0)
        L_0x0262:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CommentMessageEncryptionManager/encryptComment/message secret is null for parent message key: "
            r1.append(r0)
            java.lang.String r0 = r5.A01
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            X.03N r13 = X.AnonymousClass00C.A02(r0)
        L_0x0275:
            boolean r0 = r13 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x0317
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r13)
            if (r0 != 0) goto L_0x0285
            java.lang.String r0 = "CommentMessageEncryptionManager/failed to encrypt message. Reason unknown."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
        L_0x0285:
            X.03N r11 = X.C90524aI.A0t(r0)
        L_0x0289:
            boolean r0 = r11 instanceof X.AnonymousClass03N
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x035c
            X.8Hz r0 = r4.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.8Pw r0 = r0.encCommentMessage_
            if (r0 != 0) goto L_0x0299
            X.8Pw r0 = X.C172968Pw.DEFAULT_INSTANCE
        L_0x0299:
            X.8NN r9 = r0.A0q()
            X.AnonymousClass0AN.A00(r11)
            r12 = r11
            X.9IR r12 = (X.AnonymousClass9IR) r12
            X.AUx r3 = r12.A00
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.8Pw r1 = (X.C172968Pw) r1
            int r0 = X.C172968Pw.ENC_IV_FIELD_NUMBER
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.encIv_ = r3
            X.AnonymousClass0AN.A00(r11)
            X.AUx r3 = r12.A01
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.8Pw r1 = (X.C172968Pw) r1
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.encPayload_ = r3
            X.8Hz r0 = r9.A00
            X.8Pw r0 = (X.C172968Pw) r0
            X.8SW r0 = r0.targetMessageKey_
            if (r0 != 0) goto L_0x02d8
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x02d8:
            X.8NG r3 = X.C170918Hz.A0Q(r0)
            X.11F r1 = r10.A00
            r0 = 0
            X.C183338qd.A02(r1, r3, r5, r0)
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.8Pw r1 = (X.C172968Pw) r1
            X.8SW r0 = X.AnonymousClass8NN.A0G(r3)
            r1.targetMessageKey_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.8Hz r0 = r9.A0R()
            X.8Pw r0 = (X.C172968Pw) r0
            X.8SX r3 = X.AnonymousClass8NN.A0F(r4, r0)
            r3.encCommentMessage_ = r0
            int r1 = r3.bitField1_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r3.bitField1_ = r1
            X.0yV r1 = X.C21000yV.A01
            r0 = 7772(0x1e5c, float:1.0891E-41)
            boolean r0 = X.C20800yB.A01(r1, r8, r0)
            if (r0 != 0) goto L_0x01eb
            X.8Ri r0 = r7.A0U()
            goto L_0x01e8
        L_0x0317:
            X.0wQ r0 = r14.A00
            X.13w r12 = r0.A08()
            java.lang.String r0 = "CommentMessageEncryptionManager/senderUserLid is NULL"
            java.util.Objects.requireNonNull(r12, r0)
            X.11F r11 = r10.A00
            boolean r0 = r11 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x039d
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.AnonymousClass00C.A0E(r11, r0)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            X.00b r1 = r14.A03
            java.lang.String r0 = r5.A01
            X.AnonymousClass00C.A07(r0)
            X.AnonymousClass0AN.A00(r13)
            byte[] r13 = (byte[]) r13
            byte[] r20 = r15.A0o()
            java.lang.String r17 = "Enc Comment"
            r15 = r1
            r16 = r0
            r18 = r13
            r19 = r9
            r13 = r11
            r14 = r12
            X.9IR r11 = X.AnonymousClass9Zd.A00(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r11 != 0) goto L_0x0289
            java.lang.String r0 = "Encryption using iJniBridge failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            X.03N r11 = X.AnonymousClass00C.A02(r0)
            goto L_0x0289
        L_0x035c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CommentMessageEncryptionManager/"
            r1.append(r0)
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r11)
            if (r0 == 0) goto L_0x0375
            java.lang.String r0 = r0.getMessage()
        L_0x036f:
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x0200
        L_0x0375:
            r0 = 0
            goto L_0x036f
        L_0x0377:
            java.lang.String r0 = "CommentMessageEncryptionManager/encryptAndSetComment/parentMessageRowId is invalid"
            goto L_0x0200
        L_0x037b:
            com.whatsapp.jid.UserJid r4 = r13.A0L()
            goto L_0x0119
        L_0x0381:
            X.1Fu r0 = new X.1Fu
            r0.<init>(r3, r9)
            throw r0
        L_0x0387:
            java.lang.String r0 = "CommentProtobufHelper//isCommentInfoValid/parentMessageKey is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Fu r0 = new X.1Fu
            r0.<init>(r3, r9)
            throw r0
        L_0x0392:
            java.lang.String r0 = "CommentProtobufHelper//isCommentInfoValid/message CommentMessageInfo is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Fu r0 = new X.1Fu
            r0.<init>(r3, r9)
            throw r0
        L_0x039d:
            java.lang.String r0 = "CommentMessageEncryptionManager/target key sender JID is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x03a4:
            java.lang.String r0 = "MessageCommentsManager/populateAdjustedParentMessageKeyForComment/something went wrong while finding the referential key"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            X.1Fu r0 = new X.1Fu
            r0.<init>(r1, r9)
            throw r0
        L_0x03b3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageCommentsManager/populateAdjustedParentMessageKeyForComment/parent message not found for the row id = "
            X.C36321k7.A1J(r5, r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            X.1Fu r0 = new X.1Fu
            r0.<init>(r1, r9)
            throw r0
        L_0x03c6:
            java.lang.String r0 = "MessageCommentsManager/populateAdjustedParentMessageKeyForComment/invalid parent row id"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Fu r0 = new X.1Fu
            r0.<init>(r3, r9)
            throw r0
        L_0x03d1:
            X.1Fu r0 = new X.1Fu
            r0.<init>(r3, r9)
            throw r0
        L_0x03d7:
            X.1Fu r0 = X.C165567td.A0K(r14)
            throw r0
        L_0x03dc:
            X.8yc r0 = X.C187838yc.CONTINUE_SERIALIZATION
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AC6.BdE(X.9Xy, X.3T1):X.8yc");
    }

    public AC6(C198209d5 r1, C20810yC r2, C20520xh r3) {
        C36321k7.A0y(r2, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
