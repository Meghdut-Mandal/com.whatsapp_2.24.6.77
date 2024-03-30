package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9n1  reason: invalid class name and case insensitive filesystem */
public class C202969n1 {
    public final C19730wQ A00;
    public final AnonymousClass1FN A01;
    public final AnonymousClass1DW A02;
    public final C20810yC A03;
    public final AnonymousClass1A1 A04;
    public final C000100b A05;
    public final AnonymousClass1XZ A06;
    public final AnonymousClass1FE A07;
    public final AnonymousClass1OD A08;
    public final C26191Jf A09;
    public final AnonymousClass005 A0A;

    public static AnonymousClass8SX A00(C20810yC r6, AnonymousClass8SX r7, String str, String str2) {
        C173348Ri r4;
        AnonymousClass8NN A0p = C172958Pv.DEFAULT_INSTANCE.A0p();
        if (r7 != null) {
            r4 = r7.messageContextInfo_;
            if (r4 == null) {
                r4 = C173348Ri.DEFAULT_INSTANCE;
            }
            AnonymousClass8NL r0 = (AnonymousClass8NL) r7.A0q();
            C203359nq.A0A(r6, r0);
            C172958Pv r1 = (C172958Pv) C90524aI.A0H(A0p);
            AnonymousClass8SX A0D = AnonymousClass8NN.A0D(r0);
            A0D.getClass();
            r1.message_ = A0D;
            r1.bitField0_ |= 2;
        } else {
            r4 = null;
        }
        if (str != null) {
            C172958Pv r12 = (C172958Pv) C90524aI.A0H(A0p);
            r12.bitField0_ |= 1;
            r12.destinationJid_ = str;
        }
        if (str2 != null) {
            C172958Pv r13 = (C172958Pv) C90524aI.A0H(A0p);
            r13.bitField0_ |= 4;
            r13.phash_ = str2;
        }
        AnonymousClass8NL A0D2 = C170918Hz.A0D();
        AnonymousClass8SX A0E = AnonymousClass8NN.A0E(A0D2);
        C172958Pv r02 = (C172958Pv) A0p.A0R();
        r02.getClass();
        A0E.deviceSentMessage_ = r02;
        A0E.bitField0_ |= 33554432;
        if (r4 != null) {
            A0D2.A0j(r4);
        }
        return AnonymousClass8NN.A0D(A0D2);
    }

    public static AnonymousClass8SX A02(AnonymousClass8SX r5, int i) {
        AnonymousClass8NN A0p = AnonymousClass8SX.DEFAULT_INSTANCE.A0p();
        A0p.A0T(r5);
        AnonymousClass8NL r4 = (AnonymousClass8NL) A0p;
        AnonymousClass8N8 r3 = (AnonymousClass8N8) r4.A0U().A0q();
        byte[] bArr = new byte[i];
        AnonymousClass136.A00().nextBytes(bArr);
        AnonymousClass8I5 A012 = C21674AUx.A01(bArr, 0, i);
        C173348Ri r1 = (C173348Ri) C90524aI.A0H(r3);
        int i2 = C173348Ri.BOT_MESSAGE_SECRET_FIELD_NUMBER;
        r1.bitField0_ |= 8;
        r1.paddingBytes_ = A012;
        AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r4);
        C173348Ri r0 = (C173348Ri) r3.A0R();
        r0.getClass();
        A0E.messageContextInfo_ = r0;
        A0E.bitField0_ |= 67108864;
        return AnonymousClass8NN.A0D(r4);
    }

    public static AnonymousClass8SX A03(AnonymousClass8SX r3, AnonymousClass3T1 r4) {
        if (r4 == null || r4.A0L() == null || !r3.A0y()) {
            return r3;
        }
        AnonymousClass8SQ r0 = r3.protocolMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8SQ.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return r3;
        }
        AnonymousClass8NL r32 = (AnonymousClass8NL) r3.A0q();
        AnonymousClass8SQ r02 = ((AnonymousClass8SX) r32.A00).protocolMessage_;
        if (r02 == null) {
            r02 = AnonymousClass8SQ.DEFAULT_INSTANCE;
        }
        AnonymousClass8NN A0q = r02.A0q();
        AnonymousClass8SQ r03 = ((AnonymousClass8SX) r32.A00).protocolMessage_;
        if (r03 == null) {
            r03 = AnonymousClass8SQ.DEFAULT_INSTANCE;
        }
        AnonymousClass8SW r04 = r03.key_;
        if (r04 == null) {
            r04 = AnonymousClass8SW.DEFAULT_INSTANCE;
        }
        AnonymousClass8NG A0Q = C170918Hz.A0Q(r04);
        A0Q.A0Y(false);
        A0Q.A0W(r4.A0L().getRawString());
        AnonymousClass8SW r05 = (AnonymousClass8SW) A0Q.A0R();
        AnonymousClass8SQ A0A2 = AnonymousClass8NN.A0A(A0q);
        r05.getClass();
        A0A2.key_ = r05;
        A0A2.bitField0_ |= 1;
        r32.A0d((AnonymousClass8SQ) A0q.A0R());
        return AnonymousClass8NN.A0D(r32);
    }

    private String A04(C64933Qa r7) {
        AnonymousClass3T1 A032;
        DeviceJid A002;
        UserJid userJid;
        C26191Jf r5 = this.A09;
        C64933Qa A012 = r5.A01(r7);
        AnonymousClass1A1 r4 = this.A04;
        AnonymousClass3T1 A033 = r4.A03(A012);
        AnonymousClass1XZ r2 = this.A06;
        AnonymousClass00C.A0D(A033, 0);
        C63483Kf A003 = r2.A00(A033.A1N);
        if (A003 != null && (userJid = A003.A00) != null) {
            return userJid.getRawString();
        }
        AnonymousClass3T1 A0S = A033.A0S();
        if (!(A0S == null || (A032 = r4.A03(r5.A01(A0S.A1J))) == null || (A002 = this.A07.A00(A032)) == null)) {
            UserJid userJid2 = A002.userJid;
            if (!this.A00.A0M(userJid2)) {
                return AnonymousClass143.A03(userJid2);
            }
        }
        return null;
    }

    public static boolean A05(AnonymousClass3T1 r1) {
        if (r1 == null || C197029b1.A00(r1.A1J.A00) || !C197029b1.A00(r1.A0L())) {
            return false;
        }
        return true;
    }

    public AnonymousClass8SX A07(DeviceJid deviceJid, AnonymousClass8SX r9, AnonymousClass3T1 r10, C64933Qa r11, String str) {
        String str2;
        AnonymousClass3JL r0;
        AnonymousClass11F r1;
        String str3;
        C19730wQ r5 = this.A00;
        if (r5.A0M(deviceJid.userJid)) {
            if (r11.A00 instanceof C177538dx) {
                HashSet A002 = this.A01.A00(r11);
                HashSet A16 = C36441kJ.A16();
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    C165587tf.A15(r5, (DeviceJid) it.next(), A16);
                }
                str3 = AnonymousClass6UD.A03(A16);
            } else {
                str3 = null;
            }
            AnonymousClass8SX A003 = A00(this.A03, r9, str, str3);
            if (!A05(r10) || r10 == null || !AnonymousClass000.A1P(A003.bitField0_ & 33554432)) {
                return A003;
            }
            C172958Pv r02 = A003.deviceSentMessage_;
            if (r02 == null) {
                r02 = C172958Pv.DEFAULT_INSTANCE;
            }
            if ((r02.bitField0_ & 2) == 0) {
                return A003;
            }
            AnonymousClass8NN A0q = A003.A0q();
            C172958Pv r03 = A003.deviceSentMessage_;
            if (r03 == null) {
                r03 = C172958Pv.DEFAULT_INSTANCE;
            }
            AnonymousClass8SX r04 = r03.message_;
            if (r04 == null) {
                r04 = AnonymousClass8SX.DEFAULT_INSTANCE;
            }
            AnonymousClass8SX A032 = A03(r04, r10);
            C172958Pv r05 = A003.deviceSentMessage_;
            if (r05 == null) {
                r05 = C172958Pv.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q2 = r05.A0q();
            C172958Pv r12 = (C172958Pv) C90524aI.A0H(A0q2);
            A032.getClass();
            r12.message_ = A032;
            r12.bitField0_ |= 2;
            C172958Pv r06 = (C172958Pv) A0q2.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(A0q, r06);
            A0F.deviceSentMessage_ = r06;
            A0F.bitField0_ |= 33554432;
            return AnonymousClass8NN.A0D(A0q);
        } else if (!r9.A0u() || !C197029b1.A00(deviceJid.userJid)) {
            AnonymousClass11F r13 = r11.A00;
            if (C197029b1.A00(r13)) {
                return A06(r13, r9, r10);
            }
            if (C197029b1.A00(deviceJid.userJid)) {
                return A06(deviceJid.userJid, r9, r10);
            }
            if (A05(r10)) {
                return A03(r9, r10);
            }
            return r9;
        } else {
            AnonymousClass8NL r3 = (AnonymousClass8NL) r9.A0q();
            AnonymousClass8SX r14 = (AnonymousClass8SX) r3.A00;
            if (r14.A0u()) {
                C172328Nk r07 = r14.botInvokeMessage_;
                if (r07 == null) {
                    r07 = C172328Nk.DEFAULT_INSTANCE;
                }
                if ((r07.bitField0_ & 1) != 0) {
                    if (!r14.A0x()) {
                        str2 = "E2eMessageBuilder/createMessageForBot/E2E.Message doesn't have MessageContextInfo";
                    } else if ((r3.A0U().bitField0_ & 4) != 0) {
                        AnonymousClass8N8 r2 = (AnonymousClass8N8) r3.A0U().A0q();
                        C000100b r15 = this.A05;
                        C192009Fi WCMMessageSecretAPICreateWithSerialized = r15.WCMMessageSecretAPICreateWithSerialized(((C173348Ri) r2.A00).messageSecret_.A06());
                        if (WCMMessageSecretAPICreateWithSerialized == null) {
                            str2 = "E2eMessageBuilder/createMessageForBot/MessageSecret is null";
                        } else {
                            C192019Fj WcmBotMessageSecretAPICreateWithMessageSecret = r15.WcmBotMessageSecretAPICreateWithMessageSecret(WCMMessageSecretAPICreateWithSerialized);
                            if (WcmBotMessageSecretAPICreateWithMessageSecret == null) {
                                str2 = "E2eMessageBuilder/createMessageForBot/BotMessageSecret is null";
                            } else {
                                JniBridge.getInstance();
                                AnonymousClass8I5 A033 = AnonymousClass8NN.A03(r2, (byte[]) JniBridge.jvidispatchOIO(0, (long) 85, WcmBotMessageSecretAPICreateWithMessageSecret.A00));
                                C173348Ri r16 = (C173348Ri) r2.A00;
                                r16.bitField0_ |= 32;
                                r16.botMessageSecret_ = A033;
                                C173348Ri r17 = (C173348Ri) C90524aI.A0H(r2);
                                r17.bitField0_ &= -5;
                                r17.messageSecret_ = C173348Ri.DEFAULT_INSTANCE.messageSecret_;
                                UserJid userJid = deviceJid.userJid;
                                if (r10 == null) {
                                    r0 = null;
                                } else {
                                    r0 = (AnonymousClass3JL) r10.A1K.A00;
                                }
                                A09(userJid, r2, r0);
                                A0A(r2, r10);
                                r3.A0j((C173348Ri) r2.A0R());
                                C172328Nk r08 = ((AnonymousClass8SX) r3.A00).botInvokeMessage_;
                                if (r08 == null) {
                                    r08 = C172328Nk.DEFAULT_INSTANCE;
                                }
                                AnonymousClass8SX r09 = r08.message_;
                                if (r09 == null) {
                                    r09 = AnonymousClass8SX.DEFAULT_INSTANCE;
                                }
                                AnonymousClass8SD r4 = r09.extendedTextMessage_;
                                if (!((r4 == null && (r4 = AnonymousClass8SD.DEFAULT_INSTANCE) == null) || (r4.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0)) {
                                    AnonymousClass8SG r010 = r4.contextInfo_;
                                    AnonymousClass8SG r18 = r010;
                                    if (r010 == null) {
                                        r010 = AnonymousClass8SG.DEFAULT_INSTANCE;
                                    }
                                    if ((r010.bitField0_ & 4) != 0) {
                                        if (r18 == null) {
                                            r18 = AnonymousClass8SG.DEFAULT_INSTANCE;
                                        }
                                        AnonymousClass8NN A0q3 = r18.A0q();
                                        try {
                                            AnonymousClass8SG r19 = (AnonymousClass8SG) A0q3.A00;
                                            if ((r19.bitField0_ & 2) != 0) {
                                                String str4 = r19.participant_;
                                                C222713q r011 = AnonymousClass11F.A00;
                                                r1 = C222713q.A01(str4);
                                            } else {
                                                String str5 = r19.remoteJid_;
                                                C222713q r012 = AnonymousClass11F.A00;
                                                r1 = C222713q.A01(str5);
                                            }
                                            if (!r5.A0M(r1) && !C197029b1.A00(r1)) {
                                                AnonymousClass8SG A042 = AnonymousClass8NN.A04(A0q3);
                                                A042.bitField0_ &= -2;
                                                A042.stanzaId_ = AnonymousClass8SG.DEFAULT_INSTANCE.stanzaId_;
                                                AnonymousClass8SG A043 = AnonymousClass8NN.A04(A0q3);
                                                A043.bitField0_ &= -9;
                                                A043.remoteJid_ = AnonymousClass8SG.DEFAULT_INSTANCE.remoteJid_;
                                                AnonymousClass8SG A044 = AnonymousClass8NN.A04(A0q3);
                                                A044.bitField0_ &= -3;
                                                A044.participant_ = AnonymousClass8SG.DEFAULT_INSTANCE.participant_;
                                                AnonymousClass8SG A045 = AnonymousClass8NN.A04(A0q3);
                                                A045.quotedMessage_ = null;
                                                A045.bitField0_ &= -5;
                                                C172138Mr r110 = (C172138Mr) r4.A0q();
                                                r110.A0U((AnonymousClass8SG) A0q3.A0R());
                                                C172328Nk r013 = ((AnonymousClass8SX) r3.A00).botInvokeMessage_;
                                                if (r013 == null) {
                                                    r013 = C172328Nk.DEFAULT_INSTANCE;
                                                }
                                                AnonymousClass8SX r014 = r013.message_;
                                                if (r014 == null) {
                                                    r014 = AnonymousClass8SX.DEFAULT_INSTANCE;
                                                }
                                                AnonymousClass8NN A0q4 = r014.A0q();
                                                AnonymousClass8SD r015 = (AnonymousClass8SD) r110.A0R();
                                                AnonymousClass8SX A0F2 = AnonymousClass8NN.A0F(A0q4, r015);
                                                A0F2.extendedTextMessage_ = r015;
                                                A0F2.bitField0_ |= 32;
                                                C172328Nk r016 = ((AnonymousClass8SX) r3.A00).botInvokeMessage_;
                                                if (r016 == null) {
                                                    r016 = C172328Nk.DEFAULT_INSTANCE;
                                                }
                                                C172328Nk A004 = AnonymousClass8NC.A00(A0q4, (AnonymousClass8NC) r016.A0q());
                                                AnonymousClass8SX A0F3 = AnonymousClass8NN.A0F(r3, A004);
                                                A0F3.botInvokeMessage_ = A004;
                                                A0F3.bitField1_ |= 4194304;
                                            }
                                        } catch (C19740wR e) {
                                            Log.e("E2eMessageBuilder/excludeQuoteAttributesForBotInvokeMessage/Invalid jid", e);
                                        }
                                    }
                                }
                                return AnonymousClass8NN.A0D(r3);
                            }
                        }
                    } else {
                        str2 = "E2eMessageBuilder/createMessageForBot/E2E.Message doesn't have MessageSecret";
                    }
                    Log.e(str2);
                    return r9;
                }
            }
            str2 = "E2eMessageBuilder/createMessageForBot/E2E.Message doesn't have BotInvokeMessage";
            Log.e(str2);
            return r9;
        }
    }

    public AnonymousClass8SX A08(UserJid userJid, AnonymousClass8SX r4) {
        C193829Na A072 = this.A08.A07(userJid);
        if (A072 == null) {
            return r4;
        }
        AnonymousClass8NN A0p = AnonymousClass8SX.DEFAULT_INSTANCE.A0p();
        A0p.A0T(r4);
        AnonymousClass8NL r0 = (AnonymousClass8NL) A0p;
        C183348qe.A03(A072, r0);
        return AnonymousClass8NN.A0D(r0);
    }

    public void A09(UserJid userJid, AnonymousClass8N8 r7, AnonymousClass3JL r8) {
        String str;
        AnonymousClass00C.A0D(userJid, 0);
        AnonymousClass6E1 A002 = ((AnonymousClass6BB) ((AnonymousClass1HX) this.A0A.get()).A04.get()).A00(userJid);
        if (A002 != null) {
            str = A002.A08;
        } else {
            str = null;
        }
        if (!AnonymousClass14B.A0F(str)) {
            AnonymousClass8R9 r1 = ((C173348Ri) r7.A00).botMetadata_;
            if (r1 == null) {
                r1 = AnonymousClass8R9.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0p = AnonymousClass8R9.DEFAULT_INSTANCE.A0p();
            A0p.A0T(r1);
            AnonymousClass8R9 r12 = (AnonymousClass8R9) C90524aI.A0H(A0p);
            str.getClass();
            r12.bitField0_ |= 2;
            r12.personaId_ = str;
            if (r8 != null) {
                AnonymousClass8NN A0p2 = C172658Or.DEFAULT_INSTANCE.A0p();
                Integer num = r8.A01;
                if (num != null) {
                    int intValue = num.intValue();
                    C172658Or r13 = (C172658Or) C90524aI.A0H(A0p2);
                    r13.bitField0_ |= 1;
                    r13.selectedPromptIndex_ = intValue;
                }
                C172658Or r0 = (C172658Or) A0p2.A0R();
                AnonymousClass8R9 r14 = (AnonymousClass8R9) C90524aI.A0H(A0p);
                r0.getClass();
                r14.suggestedPromptMetadata_ = r0;
                r14.bitField0_ |= 8;
            }
            AnonymousClass8R9 r02 = (AnonymousClass8R9) A0p.A0R();
            C173348Ri r15 = (C173348Ri) C90524aI.A0H(r7);
            r02.getClass();
            r15.botMetadata_ = r02;
            r15.bitField0_ |= 64;
        }
    }

    public void A0A(AnonymousClass8N8 r5, AnonymousClass3T1 r6) {
        AnonymousClass8NN A0p;
        if (r6 != null) {
            String str = null;
            if (r6 instanceof AnonymousClass2c8) {
                this.A0A.get();
                List list = r6.A0w;
                AnonymousClass11F r2 = null;
                if (list != null && list.size() == 1 && !C197029b1.A00(((C80163ux) list.get(0)).A00)) {
                    r2 = ((C80163ux) list.get(0)).A00;
                }
                str = AnonymousClass143.A03(r2);
            }
            AnonymousClass3T1 A0S = r6.A0S();
            if (A0S != null) {
                str = A04(A0S.A1J);
            }
            if (r6 instanceof C180828mU) {
                C64933Qa r0 = ((C180828mU) r6).A03;
                if (r0 != null) {
                    str = A04(r0);
                } else {
                    return;
                }
            }
            if (!AnonymousClass14B.A0F(str)) {
                C173348Ri r1 = (C173348Ri) r5.A00;
                if ((r1.bitField0_ & 64) != 0) {
                    AnonymousClass8R9 r02 = r1.botMetadata_;
                    if (r02 == null) {
                        r02 = AnonymousClass8R9.DEFAULT_INSTANCE;
                    }
                    A0p = r02.A0q();
                } else {
                    A0p = AnonymousClass8R9.DEFAULT_INSTANCE.A0p();
                }
                AnonymousClass8R9 r12 = (AnonymousClass8R9) C90524aI.A0H(A0p);
                int i = AnonymousClass8R9.AVATAR_METADATA_FIELD_NUMBER;
                str.getClass();
                r12.bitField0_ |= 16;
                r12.invokerJid_ = str;
                AnonymousClass8R9 r03 = (AnonymousClass8R9) A0p.A0R();
                C173348Ri r13 = (C173348Ri) C90524aI.A0H(r5);
                r03.getClass();
                r13.botMetadata_ = r03;
                r13.bitField0_ |= 64;
            }
        }
    }

    public C202969n1(C19730wQ r1, AnonymousClass1XZ r2, AnonymousClass1FE r3, AnonymousClass1FN r4, AnonymousClass1OD r5, AnonymousClass1DW r6, C20810yC r7, C26191Jf r8, AnonymousClass1A1 r9, C000100b r10, AnonymousClass005 r11) {
        this.A03 = r7;
        this.A00 = r1;
        this.A05 = r10;
        this.A0A = r11;
        this.A04 = r9;
        this.A09 = r8;
        this.A06 = r2;
        this.A07 = r3;
        this.A02 = r6;
        this.A08 = r5;
        this.A01 = r4;
    }

    public static AnonymousClass8SX A01(C20800yB r1, UserJid userJid, C202969n1 r3, AnonymousClass8SX r4) {
        AnonymousClass8SX A082 = r3.A08(userJid, r4);
        int A072 = r1.A07(1723);
        if (A072 != -1) {
            return A02(A082, A072);
        }
        return A082;
    }

    public AnonymousClass8SX A06(AnonymousClass11F r8, AnonymousClass8SX r9, AnonymousClass3T1 r10) {
        AnonymousClass3JL r0;
        String str;
        C64933Qa r02;
        UserJid A0b = C36401kF.A0b(r8);
        if (A0b == null) {
            return r9;
        }
        AnonymousClass8NL r3 = (AnonymousClass8NL) r9.A0q();
        C173348Ri A0U = r3.A0U();
        AnonymousClass8NN A0p = C173348Ri.DEFAULT_INSTANCE.A0p();
        A0p.A0T(A0U);
        AnonymousClass8N8 r1 = (AnonymousClass8N8) A0p;
        if (r10 == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass3JL) r10.A1K.A00;
        }
        A09(A0b, r1, r0);
        A0A(r1, r10);
        r3.A0j((C173348Ri) r1.A0R());
        if (r9.A0y()) {
            AnonymousClass8SQ r03 = r9.protocolMessage_;
            AnonymousClass8SQ r12 = r03;
            if (r03 == null) {
                r03 = AnonymousClass8SQ.DEFAULT_INSTANCE;
            }
            if ((r03.bitField0_ & 16384) != 0) {
                if (r12 == null) {
                    r12 = AnonymousClass8SQ.DEFAULT_INSTANCE;
                }
                AnonymousClass8RB r04 = r12.botFeedbackMessage_;
                if (r04 == null) {
                    r04 = AnonymousClass8RB.DEFAULT_INSTANCE;
                }
                AnonymousClass8NN A0q = r04.A0q();
                AnonymousClass8RB r13 = (AnonymousClass8RB) A0q.A00;
                if ((r13.bitField0_ & 1) != 0) {
                    AnonymousClass8SW r6 = r13.messageKey_;
                    if (r6 == null) {
                        r6 = AnonymousClass8SW.DEFAULT_INSTANCE;
                    }
                    AnonymousClass3T1 A032 = this.A04.A03(C165617ti.A0R(C36421kH.A0N(r6.remoteJid_), r6.id_, r6.fromMe_));
                    if (A032 == null) {
                        str = "E2eMessageBuilder/appendProtocolMessageForBotFeedbackMessage/botResponseMessage is null";
                    } else {
                        AnonymousClass8SW r05 = ((AnonymousClass8RB) A0q.A00).messageKey_;
                        if (r05 == null) {
                            r05 = AnonymousClass8SW.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8NG A0Q = C170918Hz.A0Q(r05);
                        if (A032.A01 != 1 || A032.A0X() == null) {
                            r02 = A032.A1J;
                        } else {
                            r02 = A032.A0X().A02;
                        }
                        A0Q.A0V(r02.A01);
                        A0Q.A0U();
                        AnonymousClass8SW r06 = (AnonymousClass8SW) A0Q.A0R();
                        AnonymousClass8RB r14 = (AnonymousClass8RB) C90524aI.A0H(A0q);
                        r06.getClass();
                        r14.messageKey_ = r06;
                        r14.bitField0_ |= 1;
                        AnonymousClass8SQ r07 = r9.protocolMessage_;
                        if (r07 == null) {
                            r07 = AnonymousClass8SQ.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8NN A0q2 = r07.A0q();
                        AnonymousClass8RB r08 = (AnonymousClass8RB) A0q.A0R();
                        AnonymousClass8SQ A0A2 = AnonymousClass8NN.A0A(A0q2);
                        r08.getClass();
                        A0A2.botFeedbackMessage_ = r08;
                        A0A2.bitField0_ |= 16384;
                        r3.A0d((AnonymousClass8SQ) A0q2.A0R());
                    }
                } else {
                    str = "E2eMessageBuilder/appendProtocolMessageForBotFeedbackMessage/botFeedbackMessage doesn't have MessageKey";
                }
                Log.w(str);
            }
        }
        if (r9.A0y()) {
            AnonymousClass8SQ r09 = r9.protocolMessage_;
            AnonymousClass8SQ r2 = r09;
            AnonymousClass8SQ r15 = r09;
            if (r09 == null) {
                r09 = AnonymousClass8SQ.DEFAULT_INSTANCE;
            }
            if ((r09.bitField0_ & 1) != 0) {
                AnonymousClass8SQ r010 = r2;
                if (r2 == null) {
                    r010 = AnonymousClass8SQ.DEFAULT_INSTANCE;
                }
                if ((r010.bitField0_ & 2) != 0) {
                    if (r2 == null) {
                        r15 = AnonymousClass8SQ.DEFAULT_INSTANCE;
                    }
                    if (C170918Hz.A0K(r15) == AnonymousClass91G.REVOKE) {
                        if (r2 == null) {
                            r2 = AnonymousClass8SQ.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8SW r011 = r2.key_;
                        if (r011 == null) {
                            r011 = AnonymousClass8SW.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8NG A0Q2 = C170918Hz.A0Q(r011);
                        A0Q2.A0U();
                        AnonymousClass8SQ r012 = r9.protocolMessage_;
                        if (r012 == null) {
                            r012 = AnonymousClass8SQ.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8NN A0q3 = r012.A0q();
                        AnonymousClass8SW r013 = (AnonymousClass8SW) A0Q2.A0R();
                        AnonymousClass8SQ A0A3 = AnonymousClass8NN.A0A(A0q3);
                        r013.getClass();
                        A0A3.key_ = r013;
                        A0A3.bitField0_ |= 1;
                        r3.A0d((AnonymousClass8SQ) A0q3.A0R());
                    }
                }
            }
        }
        return AnonymousClass8NN.A0D(r3);
    }
}
