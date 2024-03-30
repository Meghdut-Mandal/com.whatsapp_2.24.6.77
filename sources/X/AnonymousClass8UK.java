package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8UK  reason: invalid class name */
public class AnonymousClass8UK extends C21186ABu implements C22994Azk {
    public final C19730wQ A00;
    public final C220412q A01;
    public final AnonymousClass17X A02;
    public final C20810yC A03;
    public final C25181Fh A04;
    public final C201449jc A05;
    public final AnonymousClass005 A06;
    public final C000100b A07;

    public AnonymousClass3T1 A02(AnonymousClass9YL r25) {
        UserJid A0L;
        AnonymousClass9YL r8 = r25;
        AnonymousClass8SX r5 = r8.A0A;
        if ((r5.bitField1_ & 128) == 0) {
            return null;
        }
        C173098Qj r3 = r5.pollUpdateMessage_;
        if (r3 == null) {
            r3 = C173098Qj.DEFAULT_INSTANCE;
        }
        boolean A1P = AnonymousClass000.A1P(r3.bitField0_ & 2);
        Integer A0U = C36421kH.A0U();
        if (A1P) {
            AnonymousClass8PC r0 = r3.vote_;
            AnonymousClass8PC r2 = r0;
            if (r0 == null) {
                r0 = AnonymousClass8PC.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) != 0) {
                if (r2 == null) {
                    r2 = AnonymousClass8PC.DEFAULT_INSTANCE;
                }
                if ((r2.bitField0_ & 1) != 0) {
                    AnonymousClass8SW r02 = r3.pollCreationMessageKey_;
                    if (r02 == null) {
                        r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
                    }
                    if (C21186ABu.A01(r02)) {
                        C20810yC r7 = this.A03;
                        if (AnonymousClass6HF.A01(r7) || r7.A0E(1541)) {
                            C173098Qj r6 = r5.pollUpdateMessage_;
                            if (r6 == null) {
                                r6 = C173098Qj.DEFAULT_INSTANCE;
                            }
                            C64933Qa r10 = r8.A0C;
                            C180858mX r22 = new C180858mX(r10, r8.A04);
                            AnonymousClass11F r9 = r8.A07;
                            C201449jc r82 = this.A05;
                            AnonymousClass8SW r03 = r6.pollCreationMessageKey_;
                            if (r03 == null) {
                                r03 = AnonymousClass8SW.DEFAULT_INSTANCE;
                            }
                            r22.A04 = r82.A02(r9, r03, r10);
                            if (C20800yB.A01(C21000yV.A01, r7, 6772)) {
                                C173098Qj r62 = r5.pollUpdateMessage_;
                                if (r62 == null && (r62 = C173098Qj.DEFAULT_INSTANCE) == null) {
                                    Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - pollUpdateMessage is null for a poll vote message");
                                    throw C165617ti.A0S(A0U, "poll_update_is_missing");
                                }
                                AnonymousClass8SW r72 = r62.pollCreationMessageKey_;
                                if (r72 == null) {
                                    r72 = AnonymousClass8SW.DEFAULT_INSTANCE;
                                }
                                if ((r62.bitField0_ & 8) != 0) {
                                    r22.A00 = r62.senderTimestampMs_;
                                    AnonymousClass8PC r13 = r62.vote_;
                                    if (r13 == null && (r13 = AnonymousClass8PC.DEFAULT_INSTANCE) == null) {
                                        Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - pollEncValue is null for a poll vote message");
                                        throw C165617ti.A0S(A0U, "poll_update_is_missing_pollEncValue");
                                    }
                                    AnonymousClass3T1 A032 = ((AnonymousClass1A1) this.A06.get()).A03(r22.A1Z());
                                    if (A032 == null) {
                                        r22.A02 = r5.A0o();
                                        return r22;
                                    } else if (A032 instanceof AnonymousClass2bS) {
                                        AnonymousClass2bS r63 = (AnonymousClass2bS) A032;
                                        C64933Qa r32 = r22.A1J;
                                        if (r32.A02) {
                                            C19730wQ r52 = this.A00;
                                            C220412q r4 = this.A01;
                                            AnonymousClass11F r33 = r32.A00;
                                            A0L = C200459hR.A00(r52, r4, r33, this.A02.A0B(r33));
                                        } else if (r9 != null) {
                                            A0L = (UserJid) r9;
                                        } else {
                                            A0L = r22.A0L();
                                        }
                                        C21674AUx aUx = r13.encIv_;
                                        C21674AUx aUx2 = r13.encPayload_;
                                        AnonymousClass11F r18 = r9;
                                        UserJid userJid = A0L;
                                        C21674AUx aUx3 = aUx;
                                        try {
                                            C191949Fc A012 = C200459hR.A01((AnonymousClass8NX) C170918Hz.A08(AnonymousClass8NX.DEFAULT_INSTANCE, r82.A04(new AnonymousClass9XK(aUx3, aUx2, r18, userJid, r72, r10, "Poll Vote", this.A04.A00(A032)))), r63.A05, r63.A01);
                                            if (A012 != null) {
                                                List list = A012.A00;
                                                List list2 = r22.A06;
                                                list2.clear();
                                                list2.addAll(list);
                                                return r22;
                                            }
                                            Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - poll vote payload is null");
                                            throw C165567td.A0J(0);
                                        } catch (AnonymousClass186 e) {
                                            Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - failed to parse payload into protobuf", e);
                                            throw new C28541Tb(A0U);
                                        }
                                    } else {
                                        Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - parent message is not a poll message");
                                        throw C165617ti.A0S(0, "parent message is not poll message");
                                    }
                                } else {
                                    throw C165617ti.A0S(A0U, "poll_update_missing_sender_timestamp");
                                }
                            } else {
                                C18740tg.A06(r6);
                                int i = r6.bitField0_;
                                if ((i & 1) == 0) {
                                    throw C165617ti.A0S(A0U, "poll_update_missing_poll_message_key");
                                } else if ((i & 8) != 0) {
                                    r22.A00 = r6.senderTimestampMs_;
                                    if ((i & 2) != 0) {
                                        AnonymousClass8PC r53 = r6.vote_;
                                        if (r53 == null) {
                                            r53 = AnonymousClass8PC.DEFAULT_INSTANCE;
                                        }
                                        if ((r53.bitField0_ & 2) != 0) {
                                            byte[] A062 = r53.encIv_.A06();
                                            if (A062.length == 12) {
                                                r22.A03 = A062;
                                                if ((r53.bitField0_ & 1) != 0) {
                                                    r22.A04 = r53.encPayload_.A06();
                                                    return r22;
                                                }
                                                throw C165617ti.A0S(A0U, "poll_update_missing_vote_enc_payload");
                                            }
                                            throw C165617ti.A0S(A0U, "poll_update_invalid_vote_enc_iv");
                                        }
                                        throw C165617ti.A0S(A0U, "poll_update_missing_vote_enc_iv");
                                    }
                                    throw C165617ti.A0S(A0U, "poll_update_missing_update");
                                } else {
                                    throw C165617ti.A0S(A0U, "poll_update_missing_sender_timestamp");
                                }
                            }
                        } else {
                            C64933Qa r1 = r8.A0C;
                            long j = r8.A04;
                            AnonymousClass2bK r73 = new AnonymousClass2bK(r1, r8.A0B.A0o(), 2, r8.A01, j);
                            r73.A00 = 67;
                            return r73;
                        }
                    } else {
                        throw C165617ti.A0S(A0U, "Invalid parent key.");
                    }
                } else {
                    throw C165617ti.A0S(A0U, "Vote enc payload is missing.");
                }
            } else {
                throw C165617ti.A0S(A0U, "Vote enc IV is missing.");
            }
        } else {
            throw C165617ti.A0S(A0U, "Vote is missing.");
        }
    }

    public void B24(C196159Xy r19, AnonymousClass3T1 r20) {
        AnonymousClass11F r10;
        UserJid userJid;
        UserJid A0L;
        C21674AUx aUx;
        AnonymousClass3T1 r5 = r20;
        if (r5 instanceof C180858mX) {
            C180858mX r52 = (C180858mX) r5;
            C196159Xy r8 = r19;
            AnonymousClass8NL r2 = r8.A00;
            C173098Qj r0 = ((AnonymousClass8SX) r2.A00).pollUpdateMessage_;
            if (r0 == null) {
                r0 = C173098Qj.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            long j = r52.A00;
            C173098Qj r6 = (C173098Qj) C90524aI.A0H(A0q);
            int i = C173098Qj.METADATA_FIELD_NUMBER;
            r6.bitField0_ |= 8;
            r6.senderTimestampMs_ = j;
            AnonymousClass8PC r02 = r6.vote_;
            if (r02 == null) {
                r02 = AnonymousClass8PC.DEFAULT_INSTANCE;
            }
            C172168Mu r03 = (C172168Mu) r02.A0q();
            if (C20800yB.A01(C21000yV.A01, this.A03, 6772)) {
                C172178Mv r9 = (C172178Mv) AnonymousClass8NX.DEFAULT_INSTANCE.A0p();
                Iterator it = r52.A01.iterator();
                while (it.hasNext()) {
                    r9.A0U(C165607th.A0O(Base64.decode(AnonymousClass001.A0C(it), 2)));
                }
                C10830fI A032 = this.A05.A03(new C195949Wx(C200459hR.A00(this.A00, this.A01, r52.A1Z().A00, r8.A07), r52.A1Z(), "Poll Vote", AnonymousClass8NN.A0N(r9), this.A04.A00(((AnonymousClass1A1) this.A06.get()).A03(r52.A1Z()))));
                r03.A0U((C21674AUx) A032.first);
                C21674AUx aUx2 = (C21674AUx) A032.second;
                AnonymousClass8PC r4 = (AnonymousClass8PC) C90524aI.A0H(r03);
                int i2 = AnonymousClass8PC.ENC_IV_FIELD_NUMBER;
                aUx2.getClass();
                r4.bitField0_ |= 1;
                r4.encPayload_ = aUx2;
                AnonymousClass8SW r3 = (AnonymousClass8SW) A032.third;
                C173098Qj r42 = (C173098Qj) C90524aI.A0H(A0q);
                r3.getClass();
                r42.pollCreationMessageKey_ = r3;
                r42.bitField0_ |= 1;
            } else {
                AnonymousClass8SW r43 = ((C173098Qj) A0q.A00).pollCreationMessageKey_;
                if (r43 == null) {
                    r43 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                AnonymousClass8NG A0Q = C170918Hz.A0Q(r43);
                C64933Qa A1Z = r52.A1Z();
                C195759Vv r44 = r52.A04;
                if (r44 == null) {
                    r10 = null;
                } else {
                    r10 = r44.A00;
                }
                C18740tg.A06(A1Z);
                C183338qd.A02(r10, A0Q, A1Z, false);
                C173098Qj r62 = (C173098Qj) C90524aI.A0H(A0q);
                r62.pollCreationMessageKey_ = AnonymousClass8NN.A0G(A0Q);
                r62.bitField0_ |= 1;
                byte[] bArr = r52.A03;
                if (bArr == null || r52.A04 == null) {
                    List list = r52.A01;
                    C18740tg.A06(list);
                    byte[] bArr2 = r52.A05;
                    C18740tg.A06(bArr2);
                    C000100b r12 = this.A07;
                    String str = A1Z.A01;
                    if (A1Z.A02) {
                        boolean z = r8.A07;
                        C19730wQ r45 = this.A00;
                        if (z) {
                            userJid = r45.A09();
                        } else {
                            userJid = C36441kJ.A0n(r45);
                            C18740tg.A06(userJid);
                        }
                    } else {
                        userJid = C36401kF.A0b(r10);
                        C18740tg.A06(userJid);
                    }
                    if (r52.A1J.A02) {
                        A0L = C200459hR.A00(this.A00, this.A01, A1Z.A00, r8.A07);
                    } else {
                        A0L = r52.A0L();
                        C18740tg.A06(A0L);
                    }
                    C172178Mv r53 = (C172178Mv) AnonymousClass8NX.DEFAULT_INSTANCE.A0p();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        r53.A0U(C165607th.A0O(Base64.decode(AnonymousClass001.A0C(it2), 2)));
                    }
                    StringBuilder A0v = AnonymousClass000.A0v(str);
                    A0v.append(0);
                    AnonymousClass9IR A002 = AnonymousClass9Zd.A00(userJid, A0L, r12, str, "Poll Vote", bArr2, AnonymousClass000.A0q(A0L.getRawString(), A0v).getBytes(C19430v1.A0D), AnonymousClass8NN.A0N(r53));
                    if (A002 == null) {
                        Log.e("MessageAddOnPollVoteUtils/encryptPollVotePayload encryptionResult is null");
                        return;
                    } else {
                        r03.A0U(A002.A00);
                        aUx = A002.A01;
                    }
                } else {
                    r03.A0U(C21674AUx.A01(bArr, 0, bArr.length));
                    byte[] bArr3 = r52.A04;
                    aUx = C21674AUx.A01(bArr3, 0, bArr3.length);
                }
                AnonymousClass8PC r46 = (AnonymousClass8PC) C90524aI.A0H(r03);
                int i3 = AnonymousClass8PC.ENC_IV_FIELD_NUMBER;
                aUx.getClass();
                r46.bitField0_ |= 1;
                r46.encPayload_ = aUx;
            }
            C173098Qj r32 = (C173098Qj) C90524aI.A0H(A0q);
            AnonymousClass8PC r04 = (AnonymousClass8PC) r03.A0R();
            r04.getClass();
            r32.vote_ = r04;
            r32.bitField0_ |= 2;
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r2);
            C173098Qj r05 = (C173098Qj) A0q.A0R();
            r05.getClass();
            A0E.pollUpdateMessage_ = r05;
            A0E.bitField1_ |= 128;
            return;
        }
        throw AnonymousClass001.A08("FMessagePollVoteProtobuf/not supported message");
    }

    public AnonymousClass8UK(C19730wQ r1, C220412q r2, AnonymousClass17X r3, C20810yC r4, C25181Fh r5, C201449jc r6, C000100b r7, AnonymousClass005 r8) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A07 = r7;
        this.A06 = r8;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
    }

    public ArrayList BHq(AnonymousClass3T1 r5) {
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1AL[] A0k = C165617ti.A0k();
        C36381kD.A1N("polltype", "vote", A0k);
        C203399nx.A0E("meta", A0I, A0k);
        return A0I;
    }
}
