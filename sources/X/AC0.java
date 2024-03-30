package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.TextData;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;

public class AC0 implements C22938Ayo, C22942Ays, C17740rx {
    public final C202029kv A00;
    public final AnonymousClass1DU A01;
    public final C198209d5 A02;
    public final ABE A03;
    public final AnonymousClass9KT A04;
    public final C198889eM A05;
    public final AnonymousClass005 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a7, code lost:
        if ((r4 & 128) == 0) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass1DU r7, X.AnonymousClass8SD r8, X.AnonymousClass2bV r9) {
        /*
            java.lang.String r6 = r8.text_
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.AnonymousClass14B.A0C(r6, r2)
            r9.A16(r0)
            java.lang.String r5 = r8.matchedText_
            r4 = 1
            java.util.ArrayList r3 = r7.A05(r5, r4)
            r1 = 0
            if (r3 == 0) goto L_0x016b
            int r0 = r3.size()
            if (r0 != r4) goto L_0x016b
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x016b
        L_0x0027:
            r1 = 2
            if (r4 == 0) goto L_0x0099
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L_0x0099
            int r0 = r8.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r8.title_
            java.lang.String r0 = X.AnonymousClass14B.A0C(r0, r2)
            r9.A05 = r0
        L_0x003e:
            int r0 = r8.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r8.description_
            java.lang.String r0 = X.AnonymousClass14B.A0C(r0, r2)
            r9.A04 = r0
        L_0x004c:
            int r4 = r8.bitField0_
            r0 = r4 & 4
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = r8.canonicalUrl_
            r9.A06 = r0
        L_0x0056:
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0070
            int r2 = r8.previewType_
            if (r2 == 0) goto L_0x0167
            r0 = 1
            if (r2 == r0) goto L_0x0163
            r0 = 4
            if (r2 == r0) goto L_0x015f
            r0 = 5
            if (r2 != r0) goto L_0x0167
            X.90q r3 = X.C1887690q.IMAGE
        L_0x0069:
            X.90q r0 = X.C1887690q.VIDEO
            if (r3 != r0) goto L_0x0150
            r2 = 1
        L_0x006e:
            r9.A01 = r2
        L_0x0070:
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x007d
            X.AUx r0 = r8.jpegThumbnail_
            byte[] r0 = r0.A06()
            r9.A1b(r0)
        L_0x007d:
            int r2 = r8.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0099
            int r2 = r8.inviteLinkGroupTypeV2_
            if (r2 == 0) goto L_0x014c
            r0 = 1
            if (r2 == r0) goto L_0x0148
            if (r2 == r1) goto L_0x0144
            r0 = 3
            if (r2 != r0) goto L_0x014c
            X.90p r3 = X.C1887590p.DEFAULT_SUB
        L_0x0092:
            X.90p r0 = X.C1887590p.PARENT
            if (r3 != r0) goto L_0x0134
            r2 = 1
        L_0x0097:
            r9.A00 = r2
        L_0x0099:
            int r4 = r8.bitField0_
            r0 = r4 & 64
            r3 = 1
            if (r0 != 0) goto L_0x00a9
            r3 = 0
            r0 = r4 & 32
            if (r0 != 0) goto L_0x00a9
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00d1
        L_0x00a9:
            com.whatsapp.TextData r2 = new com.whatsapp.TextData
            r2.<init>()
            if (r3 == 0) goto L_0x00b4
            int r0 = r8.backgroundArgb_
            r2.backgroundColor = r0
        L_0x00b4:
            r0 = r4 & 32
            if (r0 == 0) goto L_0x00bc
            int r0 = r8.textArgb_
            r2.textColor = r0
        L_0x00bc:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ce
            int r0 = r8.font_
            X.91E r0 = X.AnonymousClass91E.A00(r0)
            if (r0 != 0) goto L_0x00ca
            X.91E r0 = X.AnonymousClass91E.SANS_SERIF
        L_0x00ca:
            int r0 = r0.value
            r2.fontStyle = r0
        L_0x00ce:
            r9.A1Z(r2)
        L_0x00d1:
            r0 = r4 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0133
            r0 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0133
            X.3L1 r5 = new X.3L1
            r5.<init>()
            java.lang.String r0 = r8.thumbnailDirectPath_
            r5.A04 = r0
            X.AUx r0 = r8.thumbnailSha256_
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            r5.A08 = r0
            int r0 = r8.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0100
            X.AUx r0 = r8.thumbnailEncSha256_
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            r5.A05 = r0
        L_0x0100:
            int r1 = r8.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0110
            X.AUx r0 = r8.mediaKey_
            byte[] r0 = r0.A06()
            r5.A0A = r0
        L_0x0110:
            int r4 = r8.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x011e
            long r2 = r8.mediaKeyTimestamp_
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r5.A02 = r2
        L_0x011e:
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0127
            int r0 = r8.thumbnailWidth_
            r5.A01 = r0
        L_0x0127:
            r0 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0130
            int r0 = r8.thumbnailHeight_
            r5.A00 = r0
        L_0x0130:
            r9.A12(r5)
        L_0x0133:
            return
        L_0x0134:
            X.90p r0 = X.C1887590p.SUB
            if (r3 != r0) goto L_0x013c
            r9.A00 = r1
            goto L_0x0099
        L_0x013c:
            X.90p r0 = X.C1887590p.DEFAULT_SUB
            r2 = 0
            if (r3 != r0) goto L_0x0097
            r2 = 3
            goto L_0x0097
        L_0x0144:
            X.90p r3 = X.C1887590p.SUB
            goto L_0x0092
        L_0x0148:
            X.90p r3 = X.C1887590p.PARENT
            goto L_0x0092
        L_0x014c:
            X.90p r3 = X.C1887590p.DEFAULT
            goto L_0x0092
        L_0x0150:
            X.90q r0 = X.C1887690q.IMAGE
            if (r3 != r0) goto L_0x0157
            r2 = 5
            goto L_0x006e
        L_0x0157:
            X.90q r0 = X.C1887690q.PLACEHOLDER
            r2 = 0
            if (r3 != r0) goto L_0x006e
            r2 = 4
            goto L_0x006e
        L_0x015f:
            X.90q r3 = X.C1887690q.PLACEHOLDER
            goto L_0x0069
        L_0x0163:
            X.90q r3 = X.C1887690q.VIDEO
            goto L_0x0069
        L_0x0167:
            X.90q r3 = X.C1887690q.NONE
            goto L_0x0069
        L_0x016b:
            r4 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AC0.A01(X.1DU, X.8SD, X.2bV):void");
    }

    public void B24(C196159Xy r11, AnonymousClass3T1 r12) {
        String str;
        if (r12 instanceof AnonymousClass2bV) {
            AnonymousClass2bV r122 = (AnonymousClass2bV) r12;
            boolean A1T = r122.A1T(C132986Wc.A0F);
            C202319lY r3 = r122.A0M;
            if (A1T) {
                if (r3 != null || C202359le.A04(r122)) {
                    C18740tg.A0D(false, "FMessageTextSerializer/buildE2eMessage cant edit payment or buttons message");
                }
                this.A03.A00(new C23149B7j(this, 5), r11, r122);
            } else if (r3 != null) {
                this.A05.A01(r3, r11, new C23200B9i(this, 0), r122);
            } else if (C202359le.A04(r122)) {
                AnonymousClass8NL r32 = r11.A00;
                C80103un r6 = r11.A02;
                byte[] bArr = r11.A0B;
                boolean z = r11.A04;
                C173308Re r0 = ((AnonymousClass8SX) r32.A00).buttonsMessage_;
                if (r0 == null) {
                    r0 = C173308Re.DEFAULT_INSTANCE;
                }
                AnonymousClass8N3 r4 = (AnonymousClass8N3) r0.A0q();
                if (!TextUtils.isEmpty(r122.A0b())) {
                    r4.A0U(AnonymousClass91C.TEXT);
                    String A0b = r122.A0b();
                    C173308Re A062 = AnonymousClass8NN.A06(r4);
                    A0b.getClass();
                    A062.headerCase_ = 1;
                    A062.header_ = A0b;
                } else {
                    r4.A0U(AnonymousClass91C.EMPTY);
                }
                C202359le.A03(r4, C61583Cq.A00(r122));
                if (C202029kv.A02(r6, r122, bArr)) {
                    AnonymousClass8SG A032 = this.A00.A03(r6, r122, bArr, z);
                    C173308Re A063 = AnonymousClass8NN.A06(r4);
                    A032.getClass();
                    A063.contextInfo_ = A032;
                    A063.bitField0_ |= 128;
                }
                r32.A0W((C173308Re) r4.A0R());
            } else if (!TextUtils.isEmpty(r122.A05) || !TextUtils.isEmpty(r122.A04) || r122.A02 != null || r122.A1T(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) || r122.A1T(67108864) || C202029kv.A02(r11.A02, r122, r11.A0B)) {
                AnonymousClass8NL r42 = r11.A00;
                AnonymousClass8SD r02 = ((AnonymousClass8SX) r42.A00).extendedTextMessage_;
                if (r02 == null) {
                    r02 = AnonymousClass8SD.DEFAULT_INSTANCE;
                }
                C172138Mr r1 = (C172138Mr) r02.A0q();
                A00(this, r1, r122);
                C196159Xy.A01(r11, this, r1, r122);
                if (r122.A1T(67108864)) {
                    AnonymousClass9KT r8 = this.A04;
                    boolean A1V = C36371kC.A1V(r1);
                    AnonymousClass3JM A0a = r122.A0a();
                    if (A0a != null) {
                        long j = A0a.A00;
                        if (j >= 0) {
                            AnonymousClass3T1 A0R = C36421kH.A0R((AnonymousClass1A1) r8.A02.get(), j);
                            if (A0R != null) {
                                C26191Jf r5 = r8.A01;
                                C64933Qa r03 = A0R.A1J;
                                AnonymousClass00C.A07(r03);
                                if (r5.A02(r03) != null) {
                                    r122.A14(new AnonymousClass3JM(A0a.A01, (C195759Vv) null, j));
                                } else {
                                    Log.e("fillParentMessageAssociation/populateAdjustedParentMessageKeyForParentAssociation/something went wrong while finding the referential key");
                                    throw C165567td.A0K(71);
                                }
                            } else {
                                C36341k9.A1M("fillParentMessageAssociation/populateAdjustedParentMessageKeyForParentAssociation/parent message not found for the row id = ", AnonymousClass000.A0u(), j);
                                throw C165567td.A0K(71);
                            }
                        } else {
                            Log.e("fillParentMessageAssociation/populateAdjustedParentMessageKeyForParentAssociation/invalid parent row id");
                            throw C165567td.A0K(A1V);
                        }
                    }
                    AnonymousClass3JM A0a2 = r122.A0a();
                    if (A0a2 == null) {
                        str = "ParentAssociationProtobufHelper/buildExtendedTextMessageWithParentKey/message parentAssociationInfo is null";
                    } else {
                        long j2 = A0a2.A00;
                        if (j2 <= 0) {
                            str = "ParentAssociationProtobufHelper/buildExtendedTextMessageWithParentKey/parentMessageRowId is invalid";
                        } else {
                            AnonymousClass1A1 r04 = (AnonymousClass1A1) r8.A02.get();
                            if (r04 != null) {
                                AnonymousClass3T1 A0R2 = C36421kH.A0R(r04, j2);
                                if (A0R2 == null) {
                                    str = "ParentAssociationProtobufHelperbuildExtendedTextMessageWithParentKey/parent message not found.";
                                } else if (A0a2.A01 == C52132ow.A02) {
                                    AnonymousClass8P1 r05 = ((AnonymousClass8SX) r42.A00).extendedTextMessageWithParentKey_;
                                    if (r05 == null) {
                                        r05 = AnonymousClass8P1.DEFAULT_INSTANCE;
                                    }
                                    AnonymousClass8NN A0q = r05.A0q();
                                    AnonymousClass8P1 r2 = (AnonymousClass8P1) C90524aI.A0H(A0q);
                                    AnonymousClass8SD r13 = (AnonymousClass8SD) r1.A0R();
                                    int i = AnonymousClass8P1.EXTENDED_TEXT_MESSAGE_FIELD_NUMBER;
                                    r13.getClass();
                                    r2.extendedTextMessage_ = r13;
                                    r2.bitField0_ |= 2;
                                    AnonymousClass8SW r06 = ((AnonymousClass8P1) A0q.A00).key_;
                                    if (r06 == null) {
                                        r06 = AnonymousClass8SW.DEFAULT_INSTANCE;
                                    }
                                    AnonymousClass8NG A0Q = C170918Hz.A0Q(r06);
                                    C183338qd.A02(A0R2.A0L(), A0Q, A0R2.A1J, A1V);
                                    AnonymousClass8P1 r14 = (AnonymousClass8P1) C90524aI.A0H(A0q);
                                    r14.key_ = AnonymousClass8NN.A0G(A0Q);
                                    r14.bitField0_ |= 1;
                                    AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r42);
                                    AnonymousClass8P1 r07 = (AnonymousClass8P1) A0q.A0R();
                                    r07.getClass();
                                    A0E.extendedTextMessageWithParentKey_ = r07;
                                    A0E.bitField2_ |= 1;
                                    return;
                                } else {
                                    str = "ParentAssociationProtobufHelperbuildExtendedTextMessageWithParentKey/parent association type not supported";
                                }
                            } else {
                                Log.e("ParentAssociationProtobufHelperMissing coreMessageStore");
                                throw C165567td.A0J(26);
                            }
                        }
                    }
                    Log.e(str);
                    throw C165567td.A0K(A1V ? 1 : 0);
                } else if (!((AnonymousClass1HX) this.A06.get()).A00.A00() || !r122.A1E()) {
                    r42.A0Y(r1);
                } else {
                    C172328Nk r08 = ((AnonymousClass8SX) r42.A00).botInvokeMessage_;
                    if (r08 == null) {
                        r08 = C172328Nk.DEFAULT_INSTANCE;
                    }
                    AnonymousClass8NC r33 = (AnonymousClass8NC) r08.A0q();
                    AnonymousClass8NN A0q2 = C170918Hz.A0P(r33).A0q();
                    AnonymousClass8SD r09 = (AnonymousClass8SD) r1.A0R();
                    AnonymousClass8SX A0F = AnonymousClass8NN.A0F(A0q2, r09);
                    A0F.extendedTextMessage_ = r09;
                    A0F.bitField0_ |= 32;
                    C172328Nk A002 = AnonymousClass8NC.A00(A0q2, r33);
                    AnonymousClass8SX A0F2 = AnonymousClass8NN.A0F(r42, A002);
                    A0F2.botInvokeMessage_ = A002;
                    A0F2.bitField1_ |= 4194304;
                }
            } else {
                r11.A00.A0k(r122.A0b());
            }
        } else {
            throw AnonymousClass001.A08("FMessageTextProtobuf/buildE2EMessage wrong message passed");
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r24) {
        String str;
        int i;
        C202319lY r2;
        C199449fK r6;
        int i2;
        AnonymousClass9YL r7 = r24;
        AnonymousClass8SX r22 = r7.A0A;
        int i3 = r22.bitField0_;
        if ((i3 & 1) != 0) {
            C64933Qa r1 = r7.A0C;
            long j = r7.A04;
            String str2 = r22.conversation_;
            AnonymousClass2bV r0 = new AnonymousClass2bV(r1, j);
            r0.A16(AnonymousClass14B.A0C(str2, 65536));
            return r0;
        }
        if (AnonymousClass000.A1P(i3 & 32)) {
            AnonymousClass8SD r23 = r22.extendedTextMessage_;
            AnonymousClass8SD r8 = r23;
            if (r23 == null) {
                r23 = AnonymousClass8SD.DEFAULT_INSTANCE;
            }
            if ((r23.bitField0_ & 8388608) == 0 || !r23.viewOnce_) {
                C64933Qa r12 = r7.A0C;
                long j2 = r7.A04;
                if (r8 == null) {
                    r8 = AnonymousClass8SD.DEFAULT_INSTANCE;
                }
                AnonymousClass8SX r3 = r7.A0B;
                String str3 = r7.A0F;
                AnonymousClass2bV r02 = new AnonymousClass2bV(r12, j2);
                A01(this.A01, r8, r02);
                r02.A1A(r3.A0u());
                r02.A03 = str3;
                return r02;
            }
        } else if ((r22.bitField2_ & 1) != 0) {
            return r7.A02(87);
        } else {
            if ((32768 & i3) != 0) {
                C198889eM r5 = this.A05;
                AnonymousClass8QB r62 = r22.sendPaymentMessage_;
                if (r62 == null) {
                    r62 = AnonymousClass8QB.DEFAULT_INSTANCE;
                }
                if ((r62.bitField0_ & 1) != 0) {
                    AnonymousClass8SX r03 = r62.noteMessage_;
                    if (r03 == null) {
                        r03 = AnonymousClass8SX.DEFAULT_INSTANCE;
                    }
                    AnonymousClass3T1 A002 = C198889eM.A00(r7, r5, r03);
                    C202319lY r4 = A002.A0M;
                    if (r4 == null) {
                        if (r7.A0O) {
                            A002.A0t = "UNSET";
                            return A002;
                        }
                        r4 = C203419nz.A00(A002.A0I);
                        A002.A0M = r4;
                    }
                    int i4 = r62.bitField0_;
                    if ((i4 & 2) != 0) {
                        AnonymousClass8SW r13 = r62.requestMessageKey_;
                        if (r13 == null) {
                            r13 = AnonymousClass8SW.DEFAULT_INSTANCE;
                        }
                        String str4 = r13.id_;
                        r4.A0M = str4;
                        C202319lY r14 = r7.A06;
                        if (r14 != null) {
                            r14.A0M = str4;
                        }
                    }
                    if ((i4 & 4) == 0) {
                        return A002;
                    }
                    C100044uN r32 = r62.background_;
                    if (r32 == null) {
                        r32 = C100044uN.DEFAULT_INSTANCE;
                    }
                    C135106c9 A003 = C135106c9.A00(r32, r5.A02.A0E(1084));
                    A002.A0M.A0C(A003);
                    C202319lY r15 = r7.A06;
                    if (r15 == null) {
                        return A002;
                    }
                    r15.A0C(A003);
                    return A002;
                }
            } else if ((i3 & C132986Wc.A0F) != 0) {
                C198889eM r52 = this.A05;
                C173268Ra r25 = r22.requestPaymentMessage_;
                if (r25 == null) {
                    r25 = C173268Ra.DEFAULT_INSTANCE;
                }
                C202319lY r16 = r7.A06;
                if ((r25.bitField0_ & 1) != 0) {
                    AnonymousClass8SX r04 = r25.noteMessage_;
                    if (r04 == null) {
                        r04 = AnonymousClass8SX.DEFAULT_INSTANCE;
                    }
                    AnonymousClass3T1 A004 = C198889eM.A00(r7, r52, r04);
                    AnonymousClass16T r63 = r52.A01;
                    AnonymousClass16U A012 = r63.A01(r25.currencyCodeIso4217_);
                    UserJid A0l = C36431kI.A0l(r25.requestFrom_);
                    AnonymousClass16X r10 = new AnonymousClass16X(new BigDecimal(r25.amount1000_).scaleByPowerOfTen(-3), ((AnonymousClass16V) A012).A01);
                    if (r16 != null) {
                        str = r16.A0G;
                    } else {
                        C202159l8 r33 = C202159l8.A0E;
                        str = "UNSET";
                    }
                    AnonymousClass11F r34 = A004.A1J.A00;
                    boolean A0G = AnonymousClass143.A0G(r34);
                    if (A0G) {
                        r34 = r7.A07;
                    }
                    UserJid A005 = C222813r.A00(r34);
                    if (r16 != null) {
                        i = r16.A01;
                    } else {
                        i = 0;
                    }
                    if (A005 != null) {
                        if (r16 == null || r16.A03 != 5) {
                            C19730wQ r35 = r52.A00;
                            if (!A0G) {
                                A0l = (UserJid) C36381kD.A0T(r35).A0H;
                            } else if (!r35.A0M(A0l)) {
                                String str5 = r25.currencyCodeIso4217_;
                                long j3 = A004.A0I;
                                C203419nz r36 = C203419nz.$redex_init_class;
                                A004.A0M = C203419nz.A01(A012, r10, A0l, A005, str5, (String) null, str, 30, 0, AnonymousClass9ZS.A00(str), i, 0, j3);
                                A004.A0t = "UNSET";
                            }
                            C18740tg.A06(A0l);
                            String str6 = r25.currencyCodeIso4217_;
                            long j4 = A004.A0I;
                            C203419nz r37 = C203419nz.$redex_init_class;
                            C202319lY A013 = C203419nz.A01(A012, r10, A0l, A005, str6, (String) null, str, 20, 12, AnonymousClass9ZS.A00(str), i, 0, j4);
                            A004.A0M = A013;
                            if (r16 != null && r16.A03 == 20) {
                                A013.A0K = r16.A0K;
                                A013.A0A = r16.A0A;
                                C207119ua r72 = null;
                                int i5 = r25.bitField0_;
                                if ((i5 & 32) != 0) {
                                    AnonymousClass8QC r73 = r25.amount_;
                                    if (r73 == null) {
                                        r73 = AnonymousClass8QC.DEFAULT_INSTANCE;
                                    }
                                    A012 = r63.A01(r73.currencyCode_);
                                    r6 = new C199449fK();
                                    r6.A01 = r73.value_;
                                    i2 = r73.offset_;
                                } else if ((i5 & 4) != 0) {
                                    r6 = new C199449fK();
                                    r6.A01 = r25.amount1000_;
                                    i2 = 1000;
                                } else {
                                    Log.e("PAY: MessageUtils/buildFMessage paymentMoney is NULL.");
                                    A004.A0M.A0A.A01 = r72;
                                }
                                r6.A00 = i2;
                                r6.A02 = A012;
                                r72 = r6.A01();
                                A004.A0M.A0A.A01 = r72;
                            }
                        } else {
                            if (!A0G) {
                                A0l = (UserJid) C36381kD.A0T(r52.A00).A0H;
                            }
                            C18740tg.A06(A0l);
                            String str7 = r25.currencyCodeIso4217_;
                            long j5 = A004.A0I;
                            String str8 = r16.A0G;
                            int i6 = r16.A04;
                            byte[] bArr = r16.A0R;
                            C202319lY A014 = C203419nz.A01(A012, r10, A0l, A005, str7, (String) null, str8, 5, 0, i6, r16.A01, 0, j5);
                            A014.A0R = bArr;
                            A004.A0M = A014;
                        }
                    }
                    if ((r25.bitField0_ & 64) != 0) {
                        C100044uN r42 = r25.background_;
                        if (r42 == null) {
                            r42 = C100044uN.DEFAULT_INSTANCE;
                        }
                        C135106c9 A006 = C135106c9.A00(r42, r52.A02.A0E(1084));
                        if (r16 != null) {
                            r16.A0C(A006);
                        }
                        C202319lY r26 = A004.A0M;
                        if (r26 != null) {
                            r26.A0C(A006);
                        }
                    }
                    if (r16 == null || (r2 = A004.A0M) == null) {
                        return A004;
                    }
                    r16.A0B(r2);
                    return A004;
                }
            }
            return new AnonymousClass2bV(r7.A0C, r7.A04);
        }
        return null;
    }

    public AC0(C198209d5 r1, ABE abe, C202029kv r3, AnonymousClass1DU r4, AnonymousClass9KT r5, C198889eM r6, AnonymousClass005 r7) {
        this.A01 = r4;
        this.A06 = r7;
        this.A03 = abe;
        this.A02 = r1;
        this.A00 = r3;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static void A00(AC0 ac0, C172138Mr r9, AnonymousClass2bV r10) {
        String str;
        C1887590p r0;
        C1887690q r02;
        String str2;
        String A0b = r10.A0b();
        AnonymousClass8SD A08 = AnonymousClass8NN.A08(r9);
        int i = AnonymousClass8SD.BACKGROUND_ARGB_FIELD_NUMBER;
        A0b.getClass();
        A08.bitField0_ |= 1;
        A08.text_ = A0b;
        ArrayList A052 = ac0.A01.A05(r10.A0b(), true);
        if (A052 != null) {
            str = (String) C36441kJ.A12(A052);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass8SD A082 = AnonymousClass8NN.A08(r9);
            str.getClass();
            A082.bitField0_ |= 2;
            A082.matchedText_ = str;
        }
        if (!TextUtils.isEmpty(r10.A05)) {
            String str3 = r10.A05;
            AnonymousClass8SD A083 = AnonymousClass8NN.A08(r9);
            str3.getClass();
            A083.bitField0_ |= 16;
            A083.title_ = str3;
        }
        if (!TextUtils.isEmpty(r10.A04)) {
            String str4 = r10.A04;
            AnonymousClass8SD A084 = AnonymousClass8NN.A08(r9);
            str4.getClass();
            A084.bitField0_ |= 8;
            A084.description_ = str4;
        }
        if (!TextUtils.isEmpty(r10.A06)) {
            String str5 = r10.A06;
            AnonymousClass8SD A085 = AnonymousClass8NN.A08(r9);
            str5.getClass();
            A085.bitField0_ |= 4;
            A085.canonicalUrl_ = str5;
        }
        int i2 = r10.A00;
        if (i2 == 1) {
            r0 = C1887590p.PARENT;
        } else if (i2 == 2) {
            r0 = C1887590p.SUB;
        } else if (i2 == 3) {
            r0 = C1887590p.DEFAULT_SUB;
        } else {
            r0 = C1887590p.DEFAULT;
        }
        AnonymousClass8SD A086 = AnonymousClass8NN.A08(r9);
        A086.inviteLinkGroupTypeV2_ = r0.value;
        A086.bitField0_ |= 4194304;
        AnonymousClass3L1 r6 = r10.A0a;
        if (!(r6 == null || (str2 = r6.A04) == null || r6.A08 == null)) {
            AnonymousClass8SD A087 = AnonymousClass8NN.A08(r9);
            A087.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            A087.thumbnailDirectPath_ = str2;
            AnonymousClass8I5 A022 = AnonymousClass8NN.A02(r9, r6.A08);
            AnonymousClass8SD r1 = (AnonymousClass8SD) r9.A00;
            r1.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            r1.thumbnailSha256_ = A022;
            byte[] bArr = r6.A0A;
            if (bArr != null) {
                AnonymousClass8I5 A032 = AnonymousClass8NN.A03(r9, bArr);
                AnonymousClass8SD r2 = (AnonymousClass8SD) r9.A00;
                r2.bitField0_ |= 32768;
                r2.mediaKey_ = A032;
            }
            String str6 = r6.A05;
            if (str6 != null) {
                AnonymousClass8I5 A023 = AnonymousClass8NN.A02(r9, str6);
                AnonymousClass8SD r12 = (AnonymousClass8SD) r9.A00;
                r12.bitField0_ |= 16384;
                r12.thumbnailEncSha256_ = A023;
            }
            long j = r6.A02;
            if (j > 0) {
                long A0B = C36391kE.A0B(j);
                AnonymousClass8SD A088 = AnonymousClass8NN.A08(r9);
                A088.bitField0_ |= 65536;
                A088.mediaKeyTimestamp_ = A0B;
            }
            int i3 = r6.A00;
            if (i3 > 0) {
                AnonymousClass8SD A089 = AnonymousClass8NN.A08(r9);
                A089.bitField0_ |= C132986Wc.A0F;
                A089.thumbnailHeight_ = i3;
            }
            int i4 = r6.A01;
            if (i4 > 0) {
                AnonymousClass8SD A0810 = AnonymousClass8NN.A08(r9);
                A0810.bitField0_ |= 262144;
                A0810.thumbnailWidth_ = i4;
            }
        }
        if (r10.A01 == 1) {
            r02 = C1887690q.VIDEO;
        } else {
            r02 = C1887690q.NONE;
        }
        AnonymousClass8SD A0811 = AnonymousClass8NN.A08(r9);
        A0811.previewType_ = r02.value;
        A0811.bitField0_ |= 256;
        byte[] bArr2 = r10.A07;
        TextData textData = r10.A02;
        if (textData != null) {
            int i5 = textData.backgroundColor;
            AnonymousClass8SD A0812 = AnonymousClass8NN.A08(r9);
            A0812.bitField0_ |= 64;
            A0812.backgroundArgb_ = i5;
            int i6 = textData.textColor;
            AnonymousClass8SD A0813 = AnonymousClass8NN.A08(r9);
            A0813.bitField0_ |= 32;
            A0813.textArgb_ = i6;
            AnonymousClass91E A002 = AnonymousClass91E.A00(textData.fontStyle);
            AnonymousClass8SD A0814 = AnonymousClass8NN.A08(r9);
            A0814.font_ = A002.value;
            A0814.bitField0_ |= 128;
            bArr2 = textData.thumbnail;
        }
        if (bArr2 != null) {
            AnonymousClass8I5 A0O = C90474aD.A0O(r9, bArr2);
            AnonymousClass8SD r13 = (AnonymousClass8SD) r9.A00;
            r13.bitField0_ |= 512;
            r13.jpegThumbnail_ = A0O;
        }
    }
}
