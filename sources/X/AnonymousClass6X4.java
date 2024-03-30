package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6X4  reason: invalid class name */
public final class AnonymousClass6X4 {
    public static final AnonymousClass00T A0E = C001400p.A00(C000800j.NONE, AnonymousClass7QG.A00);
    public final C19730wQ A00;
    public final C27631Pa A01;
    public final AnonymousClass1HQ A02;
    public final C19630wG A03;
    public final C20310xM A04;
    public final AnonymousClass17X A05;
    public final C20810yC A06;
    public final C198119cw A07;
    public final AnonymousClass1A1 A08;
    public final AnonymousClass13J A09;
    public final AnonymousClass00T A0A = C001400p.A00(C000800j.NONE, new C152517Ku(this));
    public final C18820ts A0B;
    public final AnonymousClass1HJ A0C;
    public final C19770wU A0D;

    public AnonymousClass6X4(C19730wQ r3, C27631Pa r4, AnonymousClass1HQ r5, C19630wG r6, C18820ts r7, AnonymousClass1HJ r8, C20310xM r9, AnonymousClass17X r10, C20810yC r11, C198119cw r12, AnonymousClass1A1 r13, AnonymousClass13J r14, C19770wU r15) {
        AnonymousClass00C.A0D(r11, 1);
        C36321k7.A17(r13, r8, r9, 3);
        C36321k7.A1C(r10, r3, r5, r14, r4);
        C36321k7.A15(r6, r15, r7);
        this.A06 = r11;
        this.A07 = r12;
        this.A08 = r13;
        this.A0C = r8;
        this.A04 = r9;
        this.A05 = r10;
        this.A00 = r3;
        this.A02 = r5;
        this.A09 = r14;
        this.A01 = r4;
        this.A03 = r6;
        this.A0D = r15;
        this.A0B = r7;
    }

    public static final int A00(C106265Iz r3) {
        C107265Nh r1;
        AnonymousClass00C.A0D(r3, 0);
        if (!r3.A1b() || (r1 = (C107265Nh) r3.A01.A00) == null) {
            return 0;
        }
        if (r3.A1e()) {
            return R.drawable.vec_anim_voice_chat;
        }
        if (r1.A0K) {
            return R.drawable.vec_anim_video_call;
        }
        return R.drawable.vec_anim_voice_call;
    }

    private final void A02(AnonymousClass5SD r9, AnonymousClass11F r10, C107265Nh r11, Boolean bool) {
        Boolean bool2 = bool;
        this.A0D.Bp1(new AnonymousClass753(bool2, this, r10, r11, r9, 8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (A03(r3, r2) != false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A04(X.C106265Iz r4) {
        /*
            r3 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.3Kh r0 = r4.A01
            java.lang.Object r2 = r0.A00
            X.5Nh r2 = (X.C107265Nh) r2
            if (r2 != 0) goto L_0x0010
            r1 = 2131887428(0x7f120544, float:1.9409463E38)
        L_0x000f:
            return r1
        L_0x0010:
            boolean r0 = r4.A1Y()
            if (r0 == 0) goto L_0x001a
            r1 = 2131887423(0x7f12053f, float:1.9409453E38)
            return r1
        L_0x001a:
            boolean r0 = r4.A1X()
            if (r0 == 0) goto L_0x0039
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00af
            boolean r0 = r4.A1a()
            if (r0 == 0) goto L_0x00af
            boolean r0 = A03(r3, r2)
            r1 = 2131887422(0x7f12053e, float:1.940945E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887431(0x7f120547, float:1.9409469E38)
            return r1
        L_0x0039:
            boolean r0 = r4.A1Z()
            if (r0 == 0) goto L_0x0076
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0061
            boolean r0 = r4.A1a()
            if (r0 == 0) goto L_0x0061
            boolean r1 = A03(r3, r2)
            boolean r0 = r4.A1e()
            if (r1 == 0) goto L_0x005b
            if (r0 == 0) goto L_0x008e
            r1 = 2131887434(0x7f12054a, float:1.9409475E38)
            return r1
        L_0x005b:
            if (r0 == 0) goto L_0x0099
            r1 = 2131887424(0x7f120540, float:1.9409455E38)
            return r1
        L_0x0061:
            boolean r0 = r4.A1e()
            if (r0 == 0) goto L_0x006b
            r1 = 2131887427(0x7f120543, float:1.940946E38)
            return r1
        L_0x006b:
            boolean r0 = r2.A0K
            r1 = 2131887426(0x7f120542, float:1.9409459E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887425(0x7f120541, float:1.9409457E38)
            return r1
        L_0x0076:
            boolean r0 = r4.A1d()
            if (r0 != 0) goto L_0x00a4
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r4.A1a()
            if (r0 == 0) goto L_0x00a4
            boolean r0 = A03(r3, r2)
            if (r0 == 0) goto L_0x0099
        L_0x008e:
            boolean r0 = r2.A0K
            r1 = 2131887433(0x7f120549, float:1.9409473E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887432(0x7f120548, float:1.940947E38)
            return r1
        L_0x0099:
            boolean r0 = r2.A0K
            r1 = 2131887430(0x7f120546, float:1.9409467E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887429(0x7f120545, float:1.9409465E38)
            return r1
        L_0x00a4:
            boolean r0 = r2.A0K
            r1 = 2131887436(0x7f12054c, float:1.940948E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887435(0x7f12054b, float:1.9409477E38)
            return r1
        L_0x00af:
            r1 = 2131887421(0x7f12053d, float:1.9409449E38)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X4.A04(X.5Iz):int");
    }

    public final AnonymousClass3T1 A06(AnonymousClass11F r2) {
        AnonymousClass00C.A0D(r2, 0);
        return (AnonymousClass3T1) this.A0C.A0J.get(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r1 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
        if (r14.A1e() != false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
        if (r14.A1e() != false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A07(android.content.res.Resources r13, X.C106265Iz r14, java.lang.String r15) {
        /*
            r12 = this;
            r7 = 0
            X.AnonymousClass00C.A0D(r14, r7)
            r6 = 1
            X.3Kh r0 = r14.A01
            java.lang.Object r3 = r0.A00
            X.5Nh r3 = (X.C107265Nh) r3
            if (r3 != 0) goto L_0x000f
            r0 = 0
            return r0
        L_0x000f:
            boolean r0 = r14.A1Y()
            if (r0 == 0) goto L_0x001d
            r0 = 2131887407(0x7f12052f, float:1.940942E38)
        L_0x0018:
            java.lang.String r0 = r13.getString(r0)
            return r0
        L_0x001d:
            boolean r0 = r14.A1X()
            r2 = 2
            r5 = 100
            if (r0 == 0) goto L_0x00a3
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.3Qa r4 = r14.A1J
            X.11F r9 = r4.A00
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r9)
            if (r1 != 0) goto L_0x004a
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallingMessageUtil/getAdHocGroupCallLogMessageText: peerjid is null. This is group jid: "
            r8.append(r0)
            boolean r0 = r9 instanceof com.whatsapp.jid.GroupJid
            r8.append(r0)
            java.lang.String r0 = " and callType is "
            r8.append(r0)
            int r0 = r3.A08
            X.C36351kA.A1R(r8, r0)
        L_0x004a:
            boolean r0 = r14.A1d()
            if (r0 != 0) goto L_0x0254
            boolean r0 = r14.A1b()
            if (r0 == 0) goto L_0x01ba
            boolean r4 = r4.A02
            if (r4 == 0) goto L_0x006c
            if (r1 == 0) goto L_0x008a
            int r0 = r3.A08(r1)
            if (r0 != r2) goto L_0x006e
            r1 = 2131887403(0x7f12052b, float:1.9409412E38)
        L_0x0065:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r0 = X.C36411kG.A0w(r13, r15, r0, r7, r1)
            return r0
        L_0x006c:
            if (r1 == 0) goto L_0x008a
        L_0x006e:
            int r0 = r3.A08(r1)
            if (r0 != r5) goto L_0x008a
            r4 = 2131887402(0x7f12052a, float:1.940941E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.util.ArrayList r0 = r3.A0C()
            int r0 = r0.size()
            int r0 = r0 - r6
            X.AnonymousClass000.A1L(r1, r0, r7)
            java.lang.String r0 = X.C36411kG.A0w(r13, r15, r1, r6, r4)
            return r0
        L_0x008a:
            X.0wQ r1 = r12.A00
            int r0 = r3.A07(r1)
            if (r0 != r5) goto L_0x0097
            r5 = 2131887404(0x7f12052c, float:1.9409414E38)
            goto L_0x01c7
        L_0x0097:
            if (r4 != 0) goto L_0x024f
            boolean r0 = r3.A0S(r1)
            if (r0 != 0) goto L_0x024f
            r1 = 2131887401(0x7f120529, float:1.9409408E38)
            goto L_0x0065
        L_0x00a3:
            boolean r1 = r14.A1Z()
            r10 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = r14.A1d()
            if (r1 == 0) goto L_0x01fc
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r14.A1e()
            if (r0 == 0) goto L_0x00bd
            X.3Qa r0 = r14.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00c8
        L_0x00bd:
            boolean r0 = r14.A1e()
            if (r0 == 0) goto L_0x0254
        L_0x00c3:
            r0 = 2131887418(0x7f12053a, float:1.9409443E38)
            goto L_0x0018
        L_0x00c8:
            boolean r0 = r14.A1b()
            if (r0 == 0) goto L_0x0106
            X.0wQ r1 = r12.A00
            int r0 = r3.A07(r1)
            if (r0 != r5) goto L_0x00f4
            r5 = 2131887413(0x7f120535, float:1.9409432E38)
        L_0x00d9:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.util.Iterator r3 = X.C107265Nh.A00(r3)
            r0 = 0
        L_0x00e0:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01d2
            java.lang.Object r1 = r3.next()
            X.5Nf r1 = (X.C107255Nf) r1
            int r2 = r1.A01
            r1 = 5
            if (r2 != r1) goto L_0x00e0
            int r0 = r0 + 1
            goto L_0x00e0
        L_0x00f4:
            int r1 = r3.A07(r1)
            r0 = 5
            if (r1 != r0) goto L_0x0102
            boolean r0 = r14.A1e()
            if (r0 == 0) goto L_0x024f
            goto L_0x00c3
        L_0x0102:
            r5 = 2131887414(0x7f120536, float:1.9409434E38)
            goto L_0x00d9
        L_0x0106:
            X.3Qa r0 = r14.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0130
            boolean r0 = r14.A1a()
            if (r0 == 0) goto L_0x011d
            boolean r0 = r14.A1c()
            if (r0 == 0) goto L_0x011d
            r0 = 2131887415(0x7f120537, float:1.9409436E38)
            goto L_0x0018
        L_0x011d:
            boolean r0 = r3.A0N()
            if (r0 == 0) goto L_0x0189
            X.5Tz r1 = r3.A0B()
            X.5Tz r0 = X.C108555Tz.A04
            if (r1 != r0) goto L_0x0189
            r0 = 2131887412(0x7f120534, float:1.940943E38)
            goto L_0x0018
        L_0x0130:
            X.0wQ r5 = r12.A00
            boolean r0 = r3.A0M()
            boolean r9 = X.AnonymousClass000.A1P(r0)
            java.util.Iterator r8 = X.C107265Nh.A00(r3)
        L_0x013e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0168
            java.lang.Object r4 = r8.next()
            X.5Nf r4 = (X.C107255Nf) r4
            com.whatsapp.jid.UserJid r0 = r4.A00
            boolean r0 = r5.A0M(r0)
            r1 = 5
            if (r0 == 0) goto L_0x015b
            if (r9 == 0) goto L_0x0189
            int r0 = r4.A01
            if (r0 != r1) goto L_0x0189
        L_0x0159:
            r9 = 1
            goto L_0x013e
        L_0x015b:
            if (r9 == 0) goto L_0x0189
            int r0 = r4.A01
            if (r0 == r1) goto L_0x0189
            int r1 = r4.A01
            r0 = 100
            if (r1 == r0) goto L_0x0189
            goto L_0x0159
        L_0x0168:
            if (r9 == 0) goto L_0x0189
            X.0yC r1 = r12.A06
            r0 = 5579(0x15cb, float:7.818E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0184
            r5 = 2131887409(0x7f120531, float:1.9409424E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            X.0ts r2 = r12.A0B
            int r0 = r3.A09
            long r0 = (long) r0
            long r0 = r0 * r10
            java.lang.String r0 = X.AnonymousClass3UY.A06(r2, r0)
            goto L_0x01d6
        L_0x0184:
            r0 = 2131887410(0x7f120532, float:1.9409426E38)
            goto L_0x0018
        L_0x0189:
            X.0yC r1 = r12.A06
            r0 = 5579(0x15cb, float:7.818E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01b0
            r5 = 2131887408(0x7f120530, float:1.9409422E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.0ts r2 = r12.A0B
            int r0 = r3.A09
            long r0 = (long) r0
            long r0 = r0 * r10
            java.lang.String r0 = X.AnonymousClass3UY.A06(r2, r0)
            r4[r7] = r0
            int r0 = r3.A06()
            X.AnonymousClass000.A1L(r4, r0, r6)
            java.lang.String r0 = r13.getString(r5, r4)
            return r0
        L_0x01b0:
            r5 = 2131887411(0x7f120533, float:1.9409428E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            int r0 = r3.A06()
            goto L_0x01d2
        L_0x01ba:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x01db
            int r0 = r3.A06()
            if (r0 != r6) goto L_0x01db
            r5 = 2131887400(0x7f120528, float:1.9409406E38)
        L_0x01c7:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.util.ArrayList r0 = r3.A0C()
            int r0 = r0.size()
            int r0 = r0 - r6
        L_0x01d2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01d6:
            java.lang.String r0 = X.C36411kG.A0w(r13, r0, r4, r7, r5)
            return r0
        L_0x01db:
            boolean r0 = r3.A0O()
            if (r0 != 0) goto L_0x024a
            boolean r0 = r3.A0P()
            if (r0 != 0) goto L_0x0245
            boolean r0 = r3.A0Q()
            if (r0 == 0) goto L_0x01f8
            X.0yC r1 = r12.A06
            r0 = 6307(0x18a3, float:8.838E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01f8
            goto L_0x023b
        L_0x01f8:
            r5 = 2131887399(0x7f120527, float:1.9409404E38)
            goto L_0x01c7
        L_0x01fc:
            if (r0 != 0) goto L_0x0254
            boolean r0 = r14.A1b()
            if (r0 != 0) goto L_0x024f
            int r1 = r3.A07
            r0 = 6
            if (r1 != r0) goto L_0x020e
            r0 = 2131887398(0x7f120526, float:1.9409402E38)
            goto L_0x0018
        L_0x020e:
            boolean r0 = r14.A1a()
            if (r0 == 0) goto L_0x0259
            X.3Qa r0 = r14.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x021f
            r0 = 2131887416(0x7f120538, float:1.9409438E38)
            goto L_0x0018
        L_0x021f:
            boolean r0 = r3.A0O()
            if (r0 != 0) goto L_0x024a
            boolean r0 = r3.A0P()
            if (r0 != 0) goto L_0x0245
            boolean r0 = r3.A0Q()
            if (r0 == 0) goto L_0x0240
            X.0yC r1 = r12.A06
            r0 = 6307(0x18a3, float:8.838E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0240
        L_0x023b:
            r0 = 2131887405(0x7f12052d, float:1.9409416E38)
            goto L_0x0018
        L_0x0240:
            r0 = 2131887369(0x7f120509, float:1.9409343E38)
            goto L_0x0018
        L_0x0245:
            r0 = 2131887406(0x7f12052e, float:1.9409418E38)
            goto L_0x0018
        L_0x024a:
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            goto L_0x0018
        L_0x024f:
            r0 = 2131887417(0x7f120539, float:1.940944E38)
            goto L_0x0018
        L_0x0254:
            r0 = 2131887420(0x7f12053c, float:1.9409447E38)
            goto L_0x0018
        L_0x0259:
            X.0ts r2 = r12.A0B
            int r0 = r3.A09
            long r0 = (long) r0
            long r0 = r0 * r10
            java.lang.String r0 = X.AnonymousClass3UY.A06(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X4.A07(android.content.res.Resources, X.5Iz, java.lang.String):java.lang.String");
    }

    public final void A08(AnonymousClass5SD r4, C107265Nh r5, Set set) {
        AnonymousClass11F r1;
        if (set.size() <= 1 && (!r5.A0M())) {
            int size = set.size();
            C20810yC r12 = this.A06;
            if (size <= 1 && r12.A0E(4800)) {
                r1 = r5.A04.A01;
            } else {
                return;
            }
        } else if (r5.A0D != null) {
            C20810yC r13 = this.A06;
            if (r5.A0D == null || !r13.A0E(4895) || (r1 = r5.A0D) == null || r5.A0G != null) {
                return;
            }
            A02(r4, r1, r5, (Boolean) null);
        } else {
            C20810yC r2 = this.A06;
            if (set.size() >= 2 && r5.A0D == null && r5.A0C == null && r2.A0E(4896)) {
                C135006by r14 = r5.A04;
                if (!r14.A03) {
                    r1 = r14.A01;
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        A02(r4, C36401kF.A0a(it), r5, (Boolean) null);
                    }
                    return;
                }
            } else {
                return;
            }
        }
        AnonymousClass00C.A08(r1);
        A02(r4, r1, r5, (Boolean) null);
    }

    public final void A0A(UserJid userJid, C107265Nh r5) {
        AnonymousClass00C.A0D(userJid, 1);
        if (r5.A0C == null && this.A06.A0E(4896)) {
            A02(AnonymousClass5SD.ADD_ONLY, userJid, r5, true);
        }
    }

    public final void A09(AnonymousClass11F r6, C107265Nh r7) {
        AnonymousClass1HJ r4 = this.A0C;
        C135006by r0 = r7.A04;
        C64933Qa r3 = new C64933Qa(r6, C34681hT.A08(r0.A02), r0.A03);
        C106265Iz r2 = new C106265Iz(r4.A03, r3, r7);
        boolean A0E2 = r4.A0F.A0E(7515);
        AnonymousClass176 r02 = r4.A0B;
        if (A0E2) {
            r02.A0C(r3);
        } else {
            r02.A0B(r2);
        }
        r4.A0J.put(r6, r2);
        r4.A0A.A02.post(new C35681j5(r4, r7, 29));
    }

    public static final SpannableString A01(C19630wG r6, Integer num, int i, int i2) {
        Object[] objArr;
        String A0v = C36371kC.A0v(r6, i2);
        if (num != null) {
            objArr = C36411kG.A1b(A0v);
            objArr[1] = num;
        } else {
            objArr = new Object[]{A0v};
        }
        String A022 = r6.A02(i, objArr);
        AnonymousClass00C.A0B(A022);
        int A0C2 = AnonymousClass099.A0C(A022, A0v, 0, false);
        int length = A0v.length() + A0C2;
        int A002 = AnonymousClass00F.A00(r6.A00, R.color.f6nameremoved);
        SpannableString A0O = C36441kJ.A0O(A022);
        A0O.setSpan(new ForegroundColorSpan(A002), A0C2, length, 33);
        A0O.setSpan(new StyleSpan(1), A0C2, length, 33);
        return A0O;
    }

    public static final boolean A03(AnonymousClass6X4 r1, C107265Nh r2) {
        if (r2.A0P() || r2.A0O()) {
            return true;
        }
        if (!r2.A0Q()) {
            return false;
        }
        C20810yC r12 = r1.A06;
        if (!r12.A0E(6307) || C34681hT.A0I(r12)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C222013h.A07 != false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d9, code lost:
        if (r2 != false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        r0 = com.whatsapp.R.drawable.call_log_bubble_voice_call_incoming;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A05(android.content.Context r6, X.C106265Iz r7, boolean r8) {
        /*
            r5 = this;
            X.C36321k7.A0w(r6, r7)
            X.3Kh r3 = r7.A01
            java.lang.Object r4 = r3.A00
            X.5Nh r4 = (X.C107265Nh) r4
            if (r4 != 0) goto L_0x00a2
            boolean r0 = X.C222013h.A07
            if (r0 == 0) goto L_0x00dd
        L_0x000f:
            r0 = 2131231254(0x7f080216, float:1.8078584E38)
        L_0x0012:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r3.A00
            if (r0 == 0) goto L_0x009e
            boolean r0 = r7.A1d()
            if (r0 != 0) goto L_0x008e
            boolean r0 = r7.A1b()
            if (r0 != 0) goto L_0x008e
            if (r8 == 0) goto L_0x0033
            java.lang.Object r0 = r3.A00
            X.5Nh r0 = (X.C107265Nh) r0
            if (r0 == 0) goto L_0x0092
            int r1 = r0.A07
            r0 = 6
            if (r1 != r0) goto L_0x0092
        L_0x0033:
            java.lang.Object r0 = r3.A00
            X.5Nh r0 = (X.C107265Nh) r0
            if (r0 == 0) goto L_0x0079
            int r1 = r0.A07
            r0 = 6
            if (r1 != r0) goto L_0x0079
        L_0x003e:
            r0 = 2131099971(0x7f060143, float:1.781231E38)
        L_0x0041:
            X.011 r0 = X.C36421kH.A0j(r2, r0)
            int r1 = X.C90484aE.A0H(r0)
            int r0 = X.C90474aD.A08(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.00T r0 = r5.A0A
            java.lang.Object r0 = r0.getValue()
            X.0fI r4 = new X.0fI
            r4.<init>(r2, r1, r0)
            X.00T r3 = A0E
            java.lang.Object r0 = r3.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L_0x00e2
            return r0
        L_0x0079:
            boolean r0 = r7.A1Y()
            if (r0 != 0) goto L_0x003e
            boolean r0 = r7.A1a()
            if (r0 == 0) goto L_0x008c
            X.3Qa r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x008c
            goto L_0x003e
        L_0x008c:
            r0 = 0
            goto L_0x0041
        L_0x008e:
            r0 = 2131099972(0x7f060144, float:1.7812312E38)
            goto L_0x0041
        L_0x0092:
            boolean r0 = r7.A1a()
            if (r0 == 0) goto L_0x009e
            X.3Qa r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0033
        L_0x009e:
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            goto L_0x0041
        L_0x00a2:
            boolean r0 = r7.A1e()
            if (r0 == 0) goto L_0x00ad
            r0 = 2131231259(0x7f08021b, float:1.8078594E38)
            goto L_0x0012
        L_0x00ad:
            boolean r2 = X.C222013h.A07
            X.3Qa r0 = r7.A1J
            boolean r1 = r0.A02
            boolean r0 = r4.A0K
            if (r1 == 0) goto L_0x00cd
            if (r0 == 0) goto L_0x00c3
            r0 = 2131231250(0x7f080212, float:1.8078576E38)
            if (r2 == 0) goto L_0x0012
            r0 = 2131231251(0x7f080213, float:1.8078578E38)
            goto L_0x0012
        L_0x00c3:
            r0 = 2131231256(0x7f080218, float:1.8078588E38)
            if (r2 == 0) goto L_0x0012
            r0 = 2131231257(0x7f080219, float:1.807859E38)
            goto L_0x0012
        L_0x00cd:
            if (r0 == 0) goto L_0x00d9
            r0 = 2131231247(0x7f08020f, float:1.807857E38)
            if (r2 == 0) goto L_0x0012
            r0 = 2131231248(0x7f080210, float:1.8078572E38)
            goto L_0x0012
        L_0x00d9:
            if (r2 == 0) goto L_0x00dd
            goto L_0x000f
        L_0x00dd:
            r0 = 2131231253(0x7f080215, float:1.8078582E38)
            goto L_0x0012
        L_0x00e2:
            java.lang.Object r0 = r4.first
            int r1 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r0 = r4.second
            int r0 = X.AnonymousClass000.A0I(r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3UF.A02(r6, r1, r0)
            X.AnonymousClass00C.A08(r2)
            java.lang.Object r1 = r3.getValue()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r2)
            r1.put(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X4.A05(android.content.Context, X.5Iz, boolean):android.graphics.drawable.Drawable");
    }
}
