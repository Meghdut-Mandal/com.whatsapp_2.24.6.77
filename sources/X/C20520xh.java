package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0xh  reason: invalid class name and case insensitive filesystem */
public class C20520xh implements AnonymousClass00M {
    public final C19700wN A00;
    public final C20810yC A01;
    public final C25121Fb A02;
    public final AnonymousClass17B A03;
    public final C25331Fw A04;
    public final C25351Fy A05;
    public final C25341Fx A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass00T A08 = new AnonymousClass00U(new AnonymousClass1G2(this));
    public final AnonymousClass00T A09 = new AnonymousClass00U(new AnonymousClass1G1(this));
    public final C19460v5 A0A;
    public final C25361Fz A0B;
    public final C25321Fv A0C;

    public C20520xh(C19460v5 r3, C19700wN r4, C20810yC r5, C25121Fb r6, AnonymousClass17B r7, C25361Fz r8, C25331Fw r9, C25351Fy r10, C25341Fx r11, C25321Fv r12, AnonymousClass005 r13) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r12, 4);
        AnonymousClass00C.A0D(r13, 6);
        AnonymousClass00C.A0D(r6, 9);
        AnonymousClass00C.A0D(r3, 10);
        AnonymousClass00C.A0D(r8, 11);
        this.A01 = r5;
        this.A00 = r4;
        this.A03 = r7;
        this.A0C = r12;
        this.A04 = r9;
        this.A07 = r13;
        this.A06 = r11;
        this.A05 = r10;
        this.A02 = r6;
        this.A0A = r3;
        this.A0B = r8;
    }

    public final List A01(AnonymousClass3T1 r7) {
        C195759Vv r1;
        AnonymousClass11F r5;
        AnonymousClass00C.A0D(r7, 0);
        int i = r7.A1I;
        if (((AnonymousClass4VB) ((AnonymousClass9XG) this.A0B.A01.getValue()).A00(i)).BNO(r7)) {
            C63663Kx A0P = r7.A0P();
            if (A0P != null) {
                r1 = A0P.A01();
                if (r1 != null) {
                    r5 = r1.A00;
                }
                r5 = null;
            } else {
                r1 = null;
                r5 = null;
            }
            if (!r7.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) || r1 == null || r5 == null) {
                return null;
            }
            String str = r1.A01.A01;
            AnonymousClass00C.A07(str);
            List singletonList = Collections.singletonList(new C203399nx("meta", new AnonymousClass1AL[]{new AnonymousClass1AL("thread_msg_id", str), new AnonymousClass1AL((Jid) r5, "thread_msg_sender_jid")}));
            AnonymousClass00C.A08(singletonList);
            return singletonList;
        }
        C17740rx r12 = (C17740rx) ((AnonymousClass9XG) this.A09.getValue()).A00(i);
        if (!(r12 instanceof C22994Azk)) {
            return null;
        }
        return ((C22994Azk) r12).BHq(r7);
    }

    public void A02(C196159Xy r11, AnonymousClass3T1 r12) {
        C187838yc r2;
        AnonymousClass6TA r0;
        Integer num;
        C52672pz r02;
        C52682q0 r03;
        AnonymousClass00C.A0D(r12, 0);
        Set A022 = AnonymousClass02N.A02(C25111Fa.SKIP_ADDONS);
        if (r11.A04) {
            A022.add(C25111Fa.SKIP_THUMBNAILS);
        }
        AnonymousClass00C.A0D(A022, 0);
        this.A02.A00(new AnonymousClass3IP(A022, false), r12);
        C25331Fw r6 = this.A04;
        Object obj = r6.A03.get();
        AnonymousClass00C.A08(obj);
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                r2 = C187838yc.CONTINUE_SERIALIZATION;
                break;
            }
            C22943Ayt ayt = (C22943Ayt) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append("ProtobufProcessorManager: proto-out, pre-processing with ");
            Class<?> cls = ayt.getClass();
            sb.append(new C019308f(cls).BHa());
            sb.toString();
            C25331Fw.A00(r6);
            C187838yc BdE = ayt.BdE(r11, r12);
            r2 = C187838yc.STOP_AND_RETURN_RESULT;
            if (BdE == r2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ProtobufProcessorManager: proto-out, pre-processing stopped on ");
                sb2.append(new C019308f(cls).BHa());
                sb2.toString();
                C25331Fw.A00(r6);
                break;
            }
        }
        if (r2 != C187838yc.STOP_AND_RETURN_RESULT) {
            AnonymousClass00T r1 = this.A09;
            int i = r12.A1I;
            C17740rx r22 = (C17740rx) ((AnonymousClass9XG) r1.getValue()).A00(i);
            C16300ow A002 = ((AnonymousClass9XG) r1.getValue()).A00(i);
            if ((A002 instanceof B6F) || !(A002 instanceof C22942Ays)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("message does not support serialization, key=");
                sb3.append(r12.A1J);
                sb3.append(", message_type=");
                sb3.append(i);
                String obj2 = sb3.toString();
                C18740tg.A0D(false, obj2);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("FMessageProtobufSubsystem/buildProtobufMessage; ");
                sb4.append(obj2);
                Log.w(sb4.toString());
                this.A00.A0E("fmessage-protobuf-serialization-not-supported", String.valueOf(i), false);
            } else {
                AnonymousClass00C.A0E(r22, "null cannot be cast to non-null type com.whatsapp.fmessage.protobuf.serialization.FMessageProtobufSerializer");
                try {
                    ((C22942Ays) r22).B24(r11, r12);
                } catch (C25311Fu e) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("FMessageProtobufSubsystem/buildProtobufMessage; invalid message ");
                    sb5.append(r12.A1J);
                    Log.e(sb5.toString(), e);
                    if (r11.A03) {
                        throw e;
                    }
                }
                C25341Fx r5 = this.A06;
                r5.A02(r11, r12);
                C20810yC r4 = r5.A00;
                AnonymousClass3KQ A0N = r12.A0N();
                if (A0N != null) {
                    AnonymousClass8NL r3 = r11.A00;
                    AnonymousClass8R9 r04 = r3.A0U().botMetadata_;
                    if (r04 == null) {
                        r04 = AnonymousClass8R9.DEFAULT_INSTANCE;
                    }
                    C173388Rm r13 = r04.pluginMetadata_;
                    if (r13 == null) {
                        r13 = C173388Rm.DEFAULT_INSTANCE;
                    }
                    AnonymousClass8NN A0p = C173388Rm.DEFAULT_INSTANCE.A0p();
                    A0p.A0T(r13);
                    C52222p5 r05 = A0N.A01;
                    if (r05 != null) {
                        int ordinal = r05.ordinal();
                        if (ordinal == 0) {
                            r03 = C52682q0.BING;
                        } else if (ordinal == 1) {
                            r03 = C52682q0.GOOGLE;
                        } else {
                            throw new C13180jS();
                        }
                        A0p.A0S();
                        C173388Rm r14 = (C173388Rm) A0p.A00;
                        r14.provider_ = r03.value;
                        r14.bitField0_ |= 1;
                    }
                    C52212p4 r06 = A0N.A00;
                    if (r06 != null) {
                        int ordinal2 = r06.ordinal();
                        if (ordinal2 == 0) {
                            r02 = C52672pz.REELS;
                        } else if (ordinal2 == 1) {
                            r02 = C52672pz.SEARCH;
                        } else {
                            throw new C13180jS();
                        }
                        A0p.A0S();
                        C173388Rm r15 = (C173388Rm) A0p.A00;
                        r15.pluginType_ = r02.value;
                        r15.bitField0_ |= 2;
                    }
                    String str = A0N.A06;
                    if (str != null) {
                        A0p.A0S();
                        C173388Rm r16 = (C173388Rm) A0p.A00;
                        r16.bitField0_ |= 4;
                        r16.thumbnailCdnUrl_ = str;
                    }
                    String str2 = A0N.A03;
                    if (str2 != null) {
                        A0p.A0S();
                        C173388Rm r17 = (C173388Rm) A0p.A00;
                        r17.bitField0_ |= 8;
                        r17.profilePhotoCdnUrl_ = str2;
                    }
                    String str3 = A0N.A04;
                    if (str3 != null) {
                        A0p.A0S();
                        C173388Rm r18 = (C173388Rm) A0p.A00;
                        r18.bitField0_ |= 16;
                        r18.searchProviderUrl_ = str3;
                    }
                    Integer num2 = A0N.A02;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        A0p.A0S();
                        C173388Rm r19 = (C173388Rm) A0p.A00;
                        r19.bitField0_ |= 32;
                        r19.referenceIndex_ = intValue;
                    }
                    A0p.A0R();
                    AnonymousClass8R9 r110 = r3.A0U().botMetadata_;
                    if (r110 == null) {
                        r110 = AnonymousClass8R9.DEFAULT_INSTANCE;
                    }
                    AnonymousClass8NN A0p2 = AnonymousClass8R9.DEFAULT_INSTANCE.A0p();
                    A0p2.A0T(r110);
                    A0p2.A0S();
                    AnonymousClass8R9 r111 = (AnonymousClass8R9) A0p2.A00;
                    C173388Rm r07 = (C173388Rm) A0p.A0R();
                    r07.getClass();
                    r111.pluginMetadata_ = r07;
                    r111.bitField0_ |= 4;
                    AnonymousClass8N8 r08 = r11.A01;
                    r08.A0S();
                    C173348Ri r112 = (C173348Ri) r08.A00;
                    AnonymousClass8R9 r09 = (AnonymousClass8R9) A0p2.A0R();
                    r09.getClass();
                    r112.botMetadata_ = r09;
                    r112.bitField0_ |= 64;
                    if (!C20800yB.A01(C21000yV.A01, r4, 7772)) {
                        C173348Ri A0U = r3.A0U();
                        AnonymousClass8NN A0p3 = C173348Ri.DEFAULT_INSTANCE.A0p();
                        A0p3.A0T(A0U);
                        A0p3.A0S();
                        C173348Ri r113 = (C173348Ri) A0p3.A00;
                        AnonymousClass8R9 r010 = (AnonymousClass8R9) A0p2.A0R();
                        r010.getClass();
                        r113.botMetadata_ = r010;
                        r113.bitField0_ |= 64;
                        r3.A0j((C173348Ri) A0p3.A0R());
                    }
                }
                if (!C66013Ui.A0i(r12)) {
                    C25341Fx.A00(r4, r11, (AnonymousClass8NL) r11.A00.clone(), r12);
                }
                r5.A01(r11, r12);
                Object obj3 = r6.A02.get();
                AnonymousClass00C.A08(obj3);
                for (AnonymousClass37D r42 : (Iterable) obj3) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("ProtobufProcessorManager: proto-out, post-processing with ");
                    sb6.append(new C019308f(r42.getClass()).BHa());
                    sb6.toString();
                    C25331Fw.A00(r6);
                    if (r11.A08) {
                        AnonymousClass9WK r011 = r12.A0Z;
                        if (!(r011 == null || (num = r011.A00) == null)) {
                            C202029kv.A01(r42.A01, r11, num.intValue());
                        }
                    } else if (r12.A1I()) {
                        AnonymousClass9R4 r32 = (AnonymousClass9R4) r42.A02.get();
                        if (C20800yB.A01(C21000yV.A02, r32.A00, 5717) && (r0 = (AnonymousClass6TA) r32.A01.get()) != null && r0.A02(r12)) {
                            C202029kv.A01(r42.A01, r11, 0);
                        }
                    }
                }
            }
        }
        C173348Ri r33 = (C173348Ri) r11.A01.A0R();
        if (r33.A0k((C23073B3d) null) > 0) {
            if (C20800yB.A01(C21000yV.A01, this.A01, 7772)) {
                r11.A00.A0j(r33);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02bb, code lost:
        r5 = X.C222813r.A00(r12.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c1, code lost:
        if (r5 != null) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c3, code lost:
        r1.A00.A00(X.C188648zz.A0L, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ca, code lost:
        if (r6 == null) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02cd, code lost:
        if (r6 == null) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02cf, code lost:
        if (r15 == null) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d1, code lost:
        r4 = r15.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d4, code lost:
        if (r4 != 64) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02d6, code lost:
        r3 = 0;
        r2 = new java.util.ArrayList(32);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02df, code lost:
        r2.add(java.lang.Byte.valueOf(r15[r3]));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ec, code lost:
        if (r1 == 32) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02ee, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f0, code lost:
        if (r3 >= r4) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02f3, code lost:
        r15 = X.C007103b.A0l(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02fb, code lost:
        if (r6.A02(r13) == false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02fd, code lost:
        if (r15 == null) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0300, code lost:
        if (r15.length == 0) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0302, code lost:
        if (r7 != null) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0305, code lost:
        X.AnonymousClass6TA.A01(r5, r5, r13, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0309, code lost:
        r6.A00.A00(X.C188648zz.A0K, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0310, code lost:
        r14 = r6.A03(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0314, code lost:
        r13.A0y(new X.AnonymousClass9WK(r8, r17, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0331, code lost:
        throw new X.C28541Tb(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013f, code lost:
        r2 = r4.A07;
        r0 = X.AnonymousClass9ZT.A01(((X.C20330xO) r2.get()).A00, r3.A0A);
        r12 = r3.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0157, code lost:
        if ((r0.bitField1_ & com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE) == 0) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0159, code lost:
        r0 = 74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015c, code lost:
        r3 = r12.A0A;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0164, code lost:
        if ((r3.bitField1_ & X.C132986Wc.A0F) == 0) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0166, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0168, code lost:
        if (r0 == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016a, code lost:
        r13 = r12.A02(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0174, code lost:
        if (r3.A0u() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0176, code lost:
        r0 = 80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0178, code lost:
        r13 = r12.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017e, code lost:
        r1 = ((java.util.List) r4.A08.getValue()).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018e, code lost:
        if (r1.hasNext() == false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0190, code lost:
        r3 = (X.C22938Ayo) ((X.AnonymousClass011) r1.next()).second;
        r13 = r3.BlH(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x019e, code lost:
        if (r13 == null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a0, code lost:
        new X.C019308f(r13.getClass()).BHa();
        new X.C019308f(r3.getClass()).BHa();
        r1 = ((java.util.Set) r4.A05.A00.get()).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ca, code lost:
        if (r1.hasNext() == false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01cc, code lost:
        ((X.C22940Ayq) r1.next()).BxG(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d6, code lost:
        ((X.C20330xO) r2.get()).A00(r12, r13);
        r2.get();
        X.AnonymousClass3MF.A00(r13);
        r0 = r18.A00.get();
        X.AnonymousClass00C.A08(r0);
        r16 = ((java.lang.Iterable) r0).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01fa, code lost:
        if (r16.hasNext() == false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01fc, code lost:
        r1 = (X.AnonymousClass37D) r16.next();
        r3 = new java.lang.StringBuilder();
        r3.append("ProtobufProcessorManager: proto-in, post-processing with ");
        r3.append(new X.C019308f(r1.getClass()).BHa());
        r3.toString();
        X.C25331Fw.A00(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x022a, code lost:
        if (X.C20800yB.A01(r11, r1.A01, 5718) == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x022c, code lost:
        r2 = r12.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x022e, code lost:
        if (r2 == null) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0230, code lost:
        r17 = r2.A00;
        r14 = null;
        r15 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0238, code lost:
        if (r15 == null) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x023d, code lost:
        if (r15.length != 64) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x023f, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0243, code lost:
        r5 = r15.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0246, code lost:
        if (r5 != 64) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0248, code lost:
        r3 = new java.util.ArrayList(32);
        r2 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0251, code lost:
        r3.add(java.lang.Byte.valueOf(r15[r2]));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x025c, code lost:
        if (r2 < r5) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x025e, code lost:
        r7 = X.C007103b.A0l(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0263, code lost:
        r2 = r12.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0269, code lost:
        if (r2.A0x() == false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x026b, code lost:
        r0 = r2.messageContextInfo_;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026e, code lost:
        if (r0 != null) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0270, code lost:
        r0 = X.C173348Ri.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0276, code lost:
        if ((r0.bitField0_ & 128) == 0) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0278, code lost:
        if (r2 != null) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x027a, code lost:
        r2 = X.C173348Ri.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x027c, code lost:
        r8 = java.lang.Integer.valueOf(r2.reportingTokenVersion_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0283, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0284, code lost:
        if (r15 == null) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0287, code lost:
        r7 = r13.A1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0289, code lost:
        r3 = (X.AnonymousClass9R4) r1.A02.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0291, code lost:
        if (r8 == null) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0293, code lost:
        r2 = r8.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x029e, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02a0, code lost:
        if (X.C20800yB.A01(r11, r3.A00, 5718) == false) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a2, code lost:
        if (r2 != 0) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a5, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a7, code lost:
        r6 = (X.AnonymousClass6TA) r3.A01.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02af, code lost:
        r0 = com.whatsapp.jid.UserJid.Companion;
        r5 = X.C222813r.A00(r12.A0C.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b9, code lost:
        if (r5 != null) goto L_0x02cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3T1 A00(X.AnonymousClass9YL r20) {
        /*
            r19 = this;
            r4 = r19
            X.0yC r1 = r4.A01
            r0 = 3692(0xe6c, float:5.174E-42)
            X.0yV r11 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r11, r1, r0)
            r3 = r20
            if (r0 == 0) goto L_0x00ba
            X.00T r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0021:
            boolean r0 = r2.hasNext()
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.second
            X.Ayo r0 = (X.C22938Ayo) r0
            X.3T1 r0 = r0.BlH(r3)
            if (r0 == 0) goto L_0x0021
            r6.add(r1)
            goto L_0x0021
        L_0x003e:
            int r0 = r6.size()
            if (r0 <= r1) goto L_0x00ba
            java.lang.Object r8 = X.C007103b.A0L(r6)
            X.011 r8 = (X.AnonymousClass011) r8
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0053:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r2 = r6.next()
            r0 = r2
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.second
            java.lang.Class r1 = r0.getClass()
            java.lang.Object r0 = r8.second
            java.lang.Class r0 = r0.getClass()
            if (r1 == r0) goto L_0x0053
            r5.add(r2)
            goto L_0x0053
        L_0x0072:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r8.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x008a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r2 = r5.next()
            X.011 r2 = (X.AnonymousClass011) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            goto L_0x008a
        L_0x00b3:
            X.0wN r1 = r4.A00
            java.lang.String r0 = "fmessage-protobuf-deserialization-non-unique"
            r1.A0E(r0, r6, r7)
        L_0x00ba:
            X.1Fv r10 = r4.A0C
            X.0yC r1 = r10.A01
            r0 = 1531(0x5fb, float:2.145E-42)
            int r0 = X.C20800yB.A00(r11, r1, r0)
            if (r0 != 0) goto L_0x00c8
            r9 = 0
            goto L_0x00dc
        L_0x00c8:
            X.0wU r6 = r10.A02
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r0
            long r0 = r2.toMillis(r0)
            X.1il r5 = new X.1il
            r5.<init>(r10)
            java.lang.String r2 = "SlowMethodWatcher/start"
            X.1jE r9 = r6.BpM(r5, r2, r0)
        L_0x00dc:
            X.1Fw r0 = r4.A04     // Catch:{ all -> 0x0332 }
            r18 = r0
            X.005 r0 = r0.A01     // Catch:{ all -> 0x0332 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0332 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0332 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0332 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0332 }
        L_0x00ef:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x013f
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0332 }
            X.Ayp r5 = (X.C22939Ayp) r5     // Catch:{ all -> 0x0332 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0332 }
            r1.<init>()     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = "ProtobufProcessorManager: proto-in, pre-processing with "
            r1.append(r0)     // Catch:{ all -> 0x0332 }
            java.lang.Class r2 = r5.getClass()     // Catch:{ all -> 0x0332 }
            X.08f r0 = new X.08f     // Catch:{ all -> 0x0332 }
            r0.<init>(r2)     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r0.BHa()     // Catch:{ all -> 0x0332 }
            r1.append(r0)     // Catch:{ all -> 0x0332 }
            r1.toString()     // Catch:{ all -> 0x0332 }
            X.C25331Fw.A00(r18)     // Catch:{ all -> 0x0332 }
            X.3T1 r13 = r5.BdD(r3)     // Catch:{ all -> 0x0332 }
            if (r13 == 0) goto L_0x00ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0332 }
            r1.<init>()     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = "ProtobufProcessorManager: proto-in, pre-processing stopped on "
            r1.append(r0)     // Catch:{ all -> 0x0332 }
            X.08f r0 = new X.08f     // Catch:{ all -> 0x0332 }
            r0.<init>(r2)     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r0.BHa()     // Catch:{ all -> 0x0332 }
            r1.append(r0)     // Catch:{ all -> 0x0332 }
            r1.toString()     // Catch:{ all -> 0x0332 }
            X.C25331Fw.A00(r18)     // Catch:{ all -> 0x0332 }
            goto L_0x0320
        L_0x013f:
            X.005 r2 = r4.A07     // Catch:{ all -> 0x0332 }
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0332 }
            X.0xO r0 = (X.C20330xO) r0     // Catch:{ all -> 0x0332 }
            X.8SX r1 = r3.A0A     // Catch:{ all -> 0x0332 }
            X.0yC r0 = r0.A00     // Catch:{ all -> 0x0332 }
            X.8SX r0 = X.AnonymousClass9ZT.A01(r0, r1)     // Catch:{ all -> 0x0332 }
            X.9YL r12 = r3.A01(r0)     // Catch:{ all -> 0x0332 }
            int r0 = r0.bitField1_     // Catch:{ all -> 0x0332 }
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x015c
            r0 = 74
            goto L_0x0178
        L_0x015c:
            X.8SX r3 = r12.A0A     // Catch:{ all -> 0x0332 }
            int r1 = r3.bitField1_     // Catch:{ all -> 0x0332 }
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            r0 = 0
            if (r1 == 0) goto L_0x0167
            r0 = 1
        L_0x0167:
            r5 = 0
            if (r0 == 0) goto L_0x0170
            X.2bK r13 = r12.A02(r5)     // Catch:{ all -> 0x0332 }
            goto L_0x0320
        L_0x0170:
            boolean r0 = r3.A0u()     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x017e
            r0 = 80
        L_0x0178:
            X.2bK r13 = r12.A02(r0)     // Catch:{ all -> 0x0332 }
            goto L_0x0320
        L_0x017e:
            X.00T r0 = r4.A08     // Catch:{ all -> 0x0332 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0332 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0332 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0332 }
        L_0x018a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x0328
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0332 }
            X.011 r0 = (X.AnonymousClass011) r0     // Catch:{ all -> 0x0332 }
            java.lang.Object r3 = r0.second     // Catch:{ all -> 0x0332 }
            X.Ayo r3 = (X.C22938Ayo) r3     // Catch:{ all -> 0x0332 }
            X.3T1 r13 = r3.BlH(r12)     // Catch:{ all -> 0x0332 }
            if (r13 == 0) goto L_0x018a
            java.lang.Class r1 = r13.getClass()     // Catch:{ all -> 0x0332 }
            X.08f r0 = new X.08f     // Catch:{ all -> 0x0332 }
            r0.<init>(r1)     // Catch:{ all -> 0x0332 }
            r0.BHa()     // Catch:{ all -> 0x0332 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0332 }
            X.08f r0 = new X.08f     // Catch:{ all -> 0x0332 }
            r0.<init>(r1)     // Catch:{ all -> 0x0332 }
            r0.BHa()     // Catch:{ all -> 0x0332 }
            X.1Fy r0 = r4.A05     // Catch:{ all -> 0x0332 }
            X.005 r0 = r0.A00     // Catch:{ all -> 0x0332 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0332 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0332 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0332 }
        L_0x01c6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x01d6
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0332 }
            X.Ayq r0 = (X.C22940Ayq) r0     // Catch:{ all -> 0x0332 }
            r0.BxG(r12, r13)     // Catch:{ all -> 0x0332 }
            goto L_0x01c6
        L_0x01d6:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0332 }
            X.0xO r0 = (X.C20330xO) r0     // Catch:{ all -> 0x0332 }
            r0.A00(r12, r13)     // Catch:{ all -> 0x0332 }
            r2.get()     // Catch:{ all -> 0x0332 }
            X.AnonymousClass3MF.A00(r13)     // Catch:{ all -> 0x0332 }
            r0 = r18
            X.005 r0 = r0.A00     // Catch:{ all -> 0x0332 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0332 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0332 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0332 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0332 }
        L_0x01f6:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x0320
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x0332 }
            X.37D r1 = (X.AnonymousClass37D) r1     // Catch:{ all -> 0x0332 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0332 }
            r3.<init>()     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = "ProtobufProcessorManager: proto-in, post-processing with "
            r3.append(r0)     // Catch:{ all -> 0x0332 }
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x0332 }
            X.08f r0 = new X.08f     // Catch:{ all -> 0x0332 }
            r0.<init>(r2)     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r0.BHa()     // Catch:{ all -> 0x0332 }
            r3.append(r0)     // Catch:{ all -> 0x0332 }
            r3.toString()     // Catch:{ all -> 0x0332 }
            X.C25331Fw.A00(r18)     // Catch:{ all -> 0x0332 }
            X.0yC r0 = r1.A01     // Catch:{ all -> 0x0332 }
            r4 = 5718(0x1656, float:8.013E-42)
            boolean r0 = X.C20800yB.A01(r11, r0, r4)     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x01f6
            X.9VY r2 = r12.A05     // Catch:{ all -> 0x0332 }
            if (r2 == 0) goto L_0x01f6
            byte[] r0 = r2.A00     // Catch:{ all -> 0x0332 }
            r17 = r0
            r14 = 0
            byte[] r15 = r2.A01     // Catch:{ all -> 0x0332 }
            r3 = 0
            if (r15 == 0) goto L_0x0263
            int r2 = r15.length     // Catch:{ all -> 0x0332 }
            r0 = 64
            if (r2 != r0) goto L_0x0263
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0332 }
        L_0x0243:
            int r5 = r15.length     // Catch:{ all -> 0x0332 }
            r0 = 64
            if (r5 != r0) goto L_0x0287
            r0 = 32
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0332 }
            r3.<init>(r0)     // Catch:{ all -> 0x0332 }
            r2 = 32
        L_0x0251:
            byte r0 = r15[r2]     // Catch:{ all -> 0x0332 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0332 }
            r3.add(r0)     // Catch:{ all -> 0x0332 }
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x0251
            byte[] r7 = X.C007103b.A0l(r3)     // Catch:{ all -> 0x0332 }
            goto L_0x0289
        L_0x0263:
            X.8SX r2 = r12.A0B     // Catch:{ all -> 0x0332 }
            boolean r0 = r2.A0x()     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x0283
            X.8Ri r0 = r2.messageContextInfo_     // Catch:{ all -> 0x0332 }
            r2 = r0
            if (r0 != 0) goto L_0x0272
            X.8Ri r0 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ all -> 0x0332 }
        L_0x0272:
            int r0 = r0.bitField0_     // Catch:{ all -> 0x0332 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0283
            if (r2 != 0) goto L_0x027c
            X.8Ri r2 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ all -> 0x0332 }
        L_0x027c:
            int r0 = r2.reportingTokenVersion_     // Catch:{ all -> 0x0332 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0332 }
            goto L_0x0284
        L_0x0283:
            r8 = 0
        L_0x0284:
            if (r15 == 0) goto L_0x0287
            goto L_0x0243
        L_0x0287:
            byte[] r7 = r13.A1b     // Catch:{ all -> 0x0332 }
        L_0x0289:
            X.005 r0 = r1.A02     // Catch:{ all -> 0x0332 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0332 }
            X.9R4 r3 = (X.AnonymousClass9R4) r3     // Catch:{ all -> 0x0332 }
            if (r8 == 0) goto L_0x029e
            int r2 = r8.intValue()     // Catch:{ all -> 0x0332 }
        L_0x0297:
            X.0yC r0 = r3.A00     // Catch:{ all -> 0x0332 }
            boolean r0 = X.C20800yB.A01(r11, r0, r4)     // Catch:{ all -> 0x0332 }
            goto L_0x02a0
        L_0x029e:
            r2 = -1
            goto L_0x0297
        L_0x02a0:
            if (r0 == 0) goto L_0x02a5
            if (r2 != 0) goto L_0x02a5
            goto L_0x02a7
        L_0x02a5:
            r6 = 0
            goto L_0x02af
        L_0x02a7:
            X.005 r0 = r3.A01     // Catch:{ all -> 0x0332 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x0332 }
            X.6TA r6 = (X.AnonymousClass6TA) r6     // Catch:{ all -> 0x0332 }
        L_0x02af:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0332 }
            X.3Qa r0 = r12.A0C     // Catch:{ all -> 0x0332 }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x0332 }
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r0)     // Catch:{ all -> 0x0332 }
            if (r5 != 0) goto L_0x02cd
            X.11F r0 = r12.A07     // Catch:{ all -> 0x0332 }
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r0)     // Catch:{ all -> 0x0332 }
            if (r5 != 0) goto L_0x02cd
            X.1Jb r1 = r1.A00     // Catch:{ all -> 0x0332 }
            X.8zz r0 = X.C188648zz.A0L     // Catch:{ all -> 0x0332 }
            r1.A00(r0, r14)     // Catch:{ all -> 0x0332 }
            if (r6 == 0) goto L_0x0314
            goto L_0x0310
        L_0x02cd:
            if (r6 == 0) goto L_0x0314
            if (r15 == 0) goto L_0x02f7
            int r4 = r15.length     // Catch:{ all -> 0x0332 }
            r0 = 64
            if (r4 != r0) goto L_0x02f7
            r3 = 0
            r0 = 32
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0332 }
            r2.<init>(r0)     // Catch:{ all -> 0x0332 }
            r1 = 0
        L_0x02df:
            byte r0 = r15[r3]     // Catch:{ all -> 0x0332 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0332 }
            r2.add(r0)     // Catch:{ all -> 0x0332 }
            int r1 = r1 + 1
            r0 = 32
            if (r1 == r0) goto L_0x02f3
            int r3 = r3 + 1
            if (r3 >= r4) goto L_0x02f3
            goto L_0x02df
        L_0x02f3:
            byte[] r15 = X.C007103b.A0l(r2)     // Catch:{ all -> 0x0332 }
        L_0x02f7:
            boolean r0 = r6.A02(r13)     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x0310
            if (r15 == 0) goto L_0x0310
            int r0 = r15.length     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x0310
            if (r7 != 0) goto L_0x0305
            goto L_0x0309
        L_0x0305:
            X.AnonymousClass6TA.A01(r5, r5, r13, r6, r7)     // Catch:{ all -> 0x0332 }
            goto L_0x0310
        L_0x0309:
            X.1Jb r1 = r6.A00     // Catch:{ all -> 0x0332 }
            X.8zz r0 = X.C188648zz.A0K     // Catch:{ all -> 0x0332 }
            r1.A00(r0, r14)     // Catch:{ all -> 0x0332 }
        L_0x0310:
            byte[] r14 = r6.A03(r13)     // Catch:{ all -> 0x0332 }
        L_0x0314:
            X.9WK r1 = new X.9WK     // Catch:{ all -> 0x0332 }
            r0 = r17
            r1.<init>(r8, r0, r14)     // Catch:{ all -> 0x0332 }
            r13.A0y(r1)     // Catch:{ all -> 0x0332 }
            goto L_0x01f6
        L_0x0320:
            if (r9 == 0) goto L_0x0327
            X.0wU r0 = r10.A02
            r0.Bnx(r9)
        L_0x0327:
            return r13
        L_0x0328:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0332 }
            X.1Tb r0 = new X.1Tb     // Catch:{ all -> 0x0332 }
            r0.<init>(r1)     // Catch:{ all -> 0x0332 }
            throw r0     // Catch:{ all -> 0x0332 }
        L_0x0332:
            r1 = move-exception
            if (r9 == 0) goto L_0x033a
            X.0wU r0 = r10.A02
            r0.Bnx(r9)
        L_0x033a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20520xh.A00(X.9YL):X.3T1");
    }
}
