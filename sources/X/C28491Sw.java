package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Sw  reason: invalid class name and case insensitive filesystem */
public final class C28491Sw {
    public final C19700wN A00;
    public final C20810yC A01;
    public final C28471Su A02;
    public final AnonymousClass00T A03 = new AnonymousClass00U(new C28521Sz(this));
    public final AnonymousClass00T A04 = new AnonymousClass00U(new C28511Sy(this));
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final C19630wG A07;
    public final AnonymousClass005 A08;

    public C28491Sw(C19700wN r3, C19630wG r4, C20810yC r5, AnonymousClass17B r6, C28471Su r7, AnonymousClass005 r8, AnonymousClass005 r9) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r9, 7);
        this.A01 = r5;
        this.A07 = r4;
        this.A00 = r3;
        this.A02 = r7;
        this.A08 = r9;
        this.A06 = new AnonymousClass00U(new C28501Sx(r6));
        this.A05 = new AnonymousClass00U(new AnonymousClass1T0(r8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02a9, code lost:
        if (r2 == 1) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03fa, code lost:
        if (r8 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0475, code lost:
        if (r8.isEmpty() == false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AH9 A00(X.C28491Sw r22, X.AnonymousClass3T1 r23) {
        /*
            r1 = r22
            r6 = r23
            X.005 r0 = r1.A08
            java.lang.Object r5 = r0.get()
            X.0xp r5 = (X.C20600xp) r5
            X.0wG r0 = r1.A07
            android.content.Context r4 = r0.A00
            int r3 = r6.A1I
            if (r3 == 0) goto L_0x0023
            r0 = 7
            if (r3 == r0) goto L_0x0023
            boolean r0 = r6 instanceof X.AnonymousClass2cT
            if (r0 != 0) goto L_0x0023
            boolean r13 = r6 instanceof X.C46962bx
            if (r13 == 0) goto L_0x00a6
            X.9lY r0 = r6.A0M
            if (r0 == 0) goto L_0x00a6
        L_0x0023:
            boolean r0 = r6 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x003a
            X.1T1 r1 = r5.A04
            X.2bI r6 = (X.AnonymousClass2bI) r6
            r0 = 0
            java.lang.String r1 = r1.A0O(r6, r0)
        L_0x0030:
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = ""
        L_0x0034:
            X.AH9 r0 = new X.AH9
            r0.<init>(r1)
            return r0
        L_0x003a:
            X.9lY r0 = r6.A0M
            if (r0 == 0) goto L_0x005a
            int r1 = r0.A03
            r0 = 5
            if (r1 == r0) goto L_0x004e
            X.1FR r0 = r5.A0D
            java.lang.String r0 = r0.A0Z(r6)
        L_0x0049:
            java.lang.CharSequence r1 = X.AnonymousClass14B.A02(r0)
            goto L_0x0030
        L_0x004e:
            X.0wG r0 = r5.A08
            android.content.Context r1 = r0.A00
            r0 = 2131891692(0x7f1215ec, float:1.9418111E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0049
        L_0x005a:
            boolean r0 = X.C202359le.A04(r6)
            if (r0 == 0) goto L_0x0095
            java.lang.String r2 = X.C202359le.A00(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x006c
            java.lang.String r2 = ""
        L_0x006c:
            java.lang.String r0 = r6.A0b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r6.A0b()
            r1.append(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L_0x008e:
            X.1Su r0 = r5.A0F
            java.lang.CharSequence r0 = r0.A00(r2)
            goto L_0x0049
        L_0x0095:
            java.lang.String r2 = r6.A0b()
            X.1Sj r1 = r5.A0C
            X.1Su r0 = r5.A0F
            java.lang.CharSequence r0 = r0.A00(r2)
            java.lang.CharSequence r0 = r1.A01(r4, r6, r0)
            goto L_0x0049
        L_0x00a6:
            X.0wG r2 = r5.A08
            android.content.Context r15 = r2.A00
            X.1AW r0 = r5.A0G
            java.lang.String r8 = X.C20600xp.A05(r15, r6, r0)
            boolean r0 = r6 instanceof X.C46892bq
            java.lang.String r9 = "①"
            if (r0 == 0) goto L_0x00e1
            r0 = 2131895720(0x7f1225a8, float:1.942628E38)
        L_0x00b9:
            java.lang.String r1 = r15.getString(r0)
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r8, r9, r1)
        L_0x00c3:
            X.1Su r0 = r5.A0F
            java.lang.CharSequence r0 = r0.A00(r8)
            java.lang.CharSequence r1 = X.AnonymousClass14B.A02(r0)
        L_0x00cd:
            r0 = 27
            if (r3 != r0) goto L_0x00d9
            X.0yb r2 = r5.A07
            X.0wg r0 = r5.A0E
            java.lang.CharSequence r1 = X.AnonymousClass6YV.A08(r2, r0, r1)
        L_0x00d9:
            X.1Sj r0 = r5.A0C
            java.lang.CharSequence r1 = r0.A01(r4, r6, r1)
            goto L_0x0030
        L_0x00e1:
            boolean r0 = r6 instanceof X.C47012ca
            if (r0 == 0) goto L_0x00e9
            r0 = 2131895739(0x7f1225bb, float:1.942632E38)
            goto L_0x00b9
        L_0x00e9:
            boolean r0 = r6 instanceof X.AnonymousClass2cX
            if (r0 == 0) goto L_0x00f1
            r0 = 2131888489(0x7f120969, float:1.9411615E38)
            goto L_0x00b9
        L_0x00f1:
            boolean r0 = r6 instanceof X.C46802bh
            if (r0 == 0) goto L_0x00f9
            r0 = 2131895697(0x7f122591, float:1.9426234E38)
            goto L_0x00b9
        L_0x00f9:
            boolean r0 = r6 instanceof X.C88854Uh
            if (r0 == 0) goto L_0x0107
            r1 = r6
            X.4Uh r1 = (X.C88854Uh) r1
            X.0ts r0 = r5.A09
            java.lang.String r8 = r1.BEX(r0)
            goto L_0x00c3
        L_0x0107:
            boolean r0 = r6 instanceof X.C46852bm
            java.lang.String r9 = "🛒"
            if (r0 == 0) goto L_0x0111
            r0 = 2131888486(0x7f120966, float:1.9411609E38)
            goto L_0x00b9
        L_0x0111:
            boolean r0 = r6 instanceof X.C46952bw
            if (r0 == 0) goto L_0x012e
            X.0yC r2 = r5.A0B
            r1 = r6
            X.2bw r1 = (X.C46952bw) r1
            X.0ts r0 = r5.A09
            java.lang.String r2 = X.C20600xp.A04(r15, r0, r2, r1)
            r0 = 2131888473(0x7f120959, float:1.9411582E38)
            java.lang.String r1 = r15.getString(r0)
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r2, r9, r1)
            goto L_0x00c3
        L_0x012e:
            boolean r0 = r6 instanceof X.C46882bp
            if (r0 == 0) goto L_0x0142
            r0 = 2131888481(0x7f120961, float:1.9411599E38)
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r1 = "📷"
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r8, r1, r2)
            goto L_0x00c3
        L_0x0142:
            boolean r0 = r6 instanceof X.C46812bi
            java.lang.String r9 = ")"
            java.lang.String r10 = " ("
            r7 = 1
            if (r0 == 0) goto L_0x0196
            r12 = r6
            X.2bU r12 = (X.AnonymousClass2bU) r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = r12.A09
            if (r0 != r7) goto L_0x0193
            java.lang.String r0 = "🎤"
        L_0x0159:
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r0 = 2131895697(0x7f122591, float:1.9426234E38)
            java.lang.String r0 = r15.getString(r0)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
        L_0x016f:
            int r0 = r12.A0B
            if (r0 == 0) goto L_0x00c3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r7.append(r10)
            X.0ts r2 = r5.A09
            int r0 = r12.A0B
            long r0 = (long) r0
            java.lang.String r0 = X.AnonymousClass3UY.A07(r2, r0)
            r7.append(r0)
            r7.append(r9)
            java.lang.String r8 = r7.toString()
            goto L_0x00c3
        L_0x0193:
            java.lang.String r0 = "🎵"
            goto L_0x0159
        L_0x0196:
            boolean r0 = r6 instanceof X.C181788o2
            if (r0 == 0) goto L_0x01ab
            r0 = 2131888477(0x7f12095d, float:1.941159E38)
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r1 = "👾"
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r8, r1, r2)
            goto L_0x00c3
        L_0x01ab:
            boolean r0 = r6 instanceof X.C181798o3
            java.lang.String r11 = "🎥"
            if (r0 == 0) goto L_0x01c2
            r12 = r6
            X.2bU r12 = (X.AnonymousClass2bU) r12
            r0 = 2131888491(0x7f12096b, float:1.9411619E38)
            java.lang.String r1 = r15.getString(r0)
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r8, r11, r1)
            goto L_0x016f
        L_0x01c2:
            boolean r0 = r6 instanceof X.AnonymousClass2cY
            java.lang.String r1 = ""
            r14 = 0
            if (r0 == 0) goto L_0x01ff
            r0 = r6
            X.2bU r0 = (X.AnonymousClass2bU) r0
            r8 = 0
            r2 = 2131888487(0x7f120967, float:1.941161E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r12 = r0.A0B
            if (r12 <= 0) goto L_0x01f1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            X.0ts r10 = r5.A09
            int r0 = r0.A0B
            long r0 = (long) r0
            java.lang.String r0 = X.AnonymousClass3UY.A07(r10, r0)
            r12.append(r0)
            r12.append(r9)
            java.lang.String r1 = r12.toString()
        L_0x01f1:
            r7[r14] = r1
            java.lang.String r1 = r15.getString(r2, r7)
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r8, r11, r1)
            goto L_0x00c3
        L_0x01ff:
            boolean r0 = r6 instanceof X.C46972by
            r12 = 128(0x80, float:1.794E-43)
            java.lang.String r11 = "👤 "
            if (r0 == 0) goto L_0x022f
            r2 = r6
            X.2by r2 = (X.C46972by) r2
            boolean r0 = X.C131806Qs.A02(r2)
            if (r0 == 0) goto L_0x02bc
            java.lang.String r1 = r2.A1b()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02a3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r0 = X.AnonymousClass14B.A0C(r1, r12)
        L_0x0226:
            r2.append(r0)
            java.lang.String r8 = r2.toString()
            goto L_0x00c3
        L_0x022f:
            if (r13 == 0) goto L_0x024b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "💟 "
            r1.append(r0)
            r0 = 2131888488(0x7f120968, float:1.9411613E38)
            java.lang.String r0 = r15.getString(r0)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            goto L_0x00c3
        L_0x024b:
            boolean r0 = r6 instanceof X.AnonymousClass2bQ
            if (r0 == 0) goto L_0x0269
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "👥 "
            r1.append(r0)
            r0 = 2131888478(0x7f12095e, float:1.9411592E38)
            java.lang.String r0 = r15.getString(r0)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            goto L_0x00c3
        L_0x0269:
            boolean r0 = r6 instanceof X.AnonymousClass2bW
            if (r0 == 0) goto L_0x0285
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r0 = r6
            X.2bW r0 = (X.AnonymousClass2bW) r0
            java.lang.String r0 = X.C55732v6.A00(r2, r0)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            goto L_0x00c3
        L_0x0285:
            boolean r0 = r6 instanceof X.AnonymousClass2bX
            if (r0 == 0) goto L_0x0333
            r1 = r6
            X.2bX r1 = (X.AnonymousClass2bX) r1
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02ab
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass14B.A0C(r0, r12)
            goto L_0x0226
        L_0x02a3:
            X.3Qj r0 = r2.A01
            if (r0 == 0) goto L_0x030f
            int r2 = r0.A01
            if (r2 != r7) goto L_0x0310
        L_0x02ab:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r0 = 2131888474(0x7f12095a, float:1.9411584E38)
            java.lang.String r0 = r15.getString(r0)
            goto L_0x0226
        L_0x02bc:
            java.lang.String r0 = r2.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r7 = "📄"
            if (r0 != 0) goto L_0x02d7
            java.lang.String r2 = r2.A01
            r0 = 2131888476(0x7f12095c, float:1.9411588E38)
            java.lang.String r1 = r15.getString(r0)
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r2, r7, r1)
            goto L_0x00c3
        L_0x02d7:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x02e1
            java.lang.String r8 = r2.A1b()
        L_0x02e1:
            r0 = 2131888476(0x7f12095c, float:1.9411588E38)
            java.lang.String r1 = r15.getString(r0)
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r8, r7, r1)
            int r0 = r2.A00
            if (r0 == 0) goto L_0x00c3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r10)
            X.0ts r0 = r5.A09
            java.lang.String r0 = X.C25561Gu.A01(r0, r2)
            r1.append(r0)
            r1.append(r9)
            java.lang.String r8 = r1.toString()
            goto L_0x00c3
        L_0x030f:
            r2 = 0
        L_0x0310:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            X.0ts r9 = r5.A09
            r8 = 2131755212(0x7f1000cc, float:1.9141297E38)
            long r0 = (long) r2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r14] = r2
            java.lang.String r0 = r9.A0L(r7, r8, r0)
            r10.append(r0)
            java.lang.String r8 = r10.toString()
            goto L_0x00c3
        L_0x0333:
            boolean r0 = r6 instanceof X.C46912bs
            java.lang.String r9 = "📌"
            if (r0 == 0) goto L_0x0349
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0344
            r0 = r6
            X.2bs r0 = (X.C46912bs) r0
            java.lang.String r8 = r0.A01
        L_0x0344:
            r0 = 2131888483(0x7f120963, float:1.9411603E38)
            goto L_0x00b9
        L_0x0349:
            boolean r0 = r6 instanceof X.C46902br
            if (r0 == 0) goto L_0x0352
            r0 = 2131888482(0x7f120962, float:1.94116E38)
            goto L_0x00b9
        L_0x0352:
            boolean r0 = r6 instanceof X.AnonymousClass5J5
            if (r0 == 0) goto L_0x0377
            r0 = r6
            X.5J5 r0 = (X.AnonymousClass5J5) r0
            int r1 = r0.A1X()
            if (r1 == 0) goto L_0x0373
            r2 = 2131888492(0x7f12096c, float:1.941162E38)
            if (r1 == r7) goto L_0x036d
            r0 = 2
            r2 = 2131888480(0x7f120960, float:1.9411597E38)
            if (r1 == r0) goto L_0x036d
            r2 = 2131888479(0x7f12095f, float:1.9411594E38)
        L_0x036d:
            java.lang.String r8 = r15.getString(r2)
            goto L_0x00c3
        L_0x0373:
            r2 = 2131888494(0x7f12096e, float:1.9411625E38)
            goto L_0x036d
        L_0x0377:
            boolean r0 = X.C203359nq.A0C(r6)
            r9 = 5
            if (r0 == 0) goto L_0x038b
            X.9lY r0 = r6.A0M
            if (r0 != 0) goto L_0x039c
            r0 = 2131888475(0x7f12095b, float:1.9411586E38)
            java.lang.String r8 = r15.getString(r0)
            goto L_0x00c3
        L_0x038b:
            boolean r0 = r6 instanceof X.AnonymousClass2bK
            if (r0 == 0) goto L_0x03a7
            X.9lY r0 = r6.A0M
            if (r0 != 0) goto L_0x039c
            r0 = 2131891691(0x7f1215eb, float:1.941811E38)
            java.lang.String r8 = r15.getString(r0)
            goto L_0x00c3
        L_0x039c:
            int r0 = r0.A03
            r2 = 2131891692(0x7f1215ec, float:1.9418111E38)
            if (r0 == r9) goto L_0x036d
            r2 = 2131892146(0x7f1217b2, float:1.9419032E38)
            goto L_0x036d
        L_0x03a7:
            boolean r0 = r6 instanceof X.AnonymousClass2bO
            if (r0 == 0) goto L_0x03c7
            X.3Qa r2 = r6.A1J
            X.11F r0 = r2.A00
            boolean r1 = r0 instanceof X.C28981Uw
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x03be
            r2 = 2131893744(0x7f121df0, float:1.9422273E38)
            if (r1 == 0) goto L_0x036d
            r2 = 2131893745(0x7f121df1, float:1.9422275E38)
            goto L_0x036d
        L_0x03be:
            r2 = 2131893742(0x7f121dee, float:1.942227E38)
            if (r1 == 0) goto L_0x036d
            r2 = 2131893743(0x7f121def, float:1.9422271E38)
            goto L_0x036d
        L_0x03c7:
            boolean r0 = r6 instanceof X.C180978mj
            if (r0 == 0) goto L_0x03d8
            X.3Qa r0 = r6.A1J
            boolean r0 = r0.A02
            r2 = 2131892225(0x7f121801, float:1.9419192E38)
            if (r0 == 0) goto L_0x036d
            r2 = 2131892258(0x7f121822, float:1.941926E38)
            goto L_0x036d
        L_0x03d8:
            boolean r0 = r6 instanceof X.C180968mi
            if (r0 == 0) goto L_0x03e9
            X.3Qa r0 = r6.A1J
            boolean r0 = r0.A02
            r2 = 2131892256(0x7f121820, float:1.9419255E38)
            if (r0 == 0) goto L_0x036d
            r2 = 2131892257(0x7f121821, float:1.9419257E38)
            goto L_0x036d
        L_0x03e9:
            boolean r0 = r6 instanceof X.AnonymousClass2bR
            if (r0 == 0) goto L_0x03f6
            r0 = 2131892558(0x7f12194e, float:1.9419868E38)
            java.lang.String r8 = r15.getString(r0)
            goto L_0x00c3
        L_0x03f6:
            boolean r0 = r6 instanceof X.AnonymousClass2bZ
            if (r0 == 0) goto L_0x03fe
            if (r8 != 0) goto L_0x00c3
            goto L_0x00cd
        L_0x03fe:
            boolean r0 = r6 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x0411
            r0 = r6
            X.2bS r0 = (X.AnonymousClass2bS) r0
            java.lang.String r2 = r0.A03
            java.lang.String r1 = "📊"
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r8, r1, r2)
            goto L_0x00c3
        L_0x0411:
            boolean r0 = r6 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x0424
            r0 = r6
            X.2bT r0 = (X.AnonymousClass2bT) r0
            java.lang.String r2 = r0.A05
            java.lang.String r1 = "🗓"
            X.1Sv r0 = X.C28471Su.A02
            java.lang.String r8 = r0.A00(r8, r1, r2)
            goto L_0x00c3
        L_0x0424:
            boolean r0 = r6 instanceof X.AnonymousClass2bE
            if (r0 == 0) goto L_0x0431
            r0 = 2131893115(0x7f121b7b, float:1.9420997E38)
            java.lang.String r8 = r2.A01(r0)
            goto L_0x00c3
        L_0x0431:
            boolean r0 = r6 instanceof X.AnonymousClass2bN
            if (r0 == 0) goto L_0x043e
            r0 = 2131893130(0x7f121b8a, float:1.9421028E38)
            java.lang.String r8 = r2.A01(r0)
            goto L_0x00c3
        L_0x043e:
            boolean r0 = r6 instanceof X.AnonymousClass2bJ
            if (r0 == 0) goto L_0x0469
            X.16D r10 = r5.A05
            X.171 r9 = r5.A06
            X.0ts r8 = r5.A09
            X.3Qa r2 = r6.A1J
            boolean r7 = r2.A02
            r0 = r6
            X.2bJ r0 = (X.AnonymousClass2bJ) r0
            long r0 = r0.A01
            X.11F r2 = r2.A00
            com.whatsapp.jid.UserJid r20 = r6.A0L()
            r17 = r9
            r18 = r8
            r19 = r2
            r21 = r0
            r23 = r7
            r16 = r10
            java.lang.String r8 = X.AnonymousClass3UL.A02(r15, r16, r17, r18, r19, r20, r21, r23)
            goto L_0x00c3
        L_0x0469:
            boolean r0 = r6 instanceof X.AnonymousClass2cV
            if (r0 == 0) goto L_0x0479
            java.lang.String r8 = r6.A0m
            if (r8 == 0) goto L_0x00cd
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00c3
            goto L_0x00cd
        L_0x0479:
            boolean r0 = r6 instanceof X.AnonymousClass2bP
            if (r0 == 0) goto L_0x0497
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "📡 "
            r1.append(r0)
            r0 = 2131891322(0x7f12147a, float:1.941736E38)
            java.lang.String r0 = r15.getString(r0)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            goto L_0x00c3
        L_0x0497:
            r0 = 2131888490(0x7f12096a, float:1.9411617E38)
            java.lang.String r8 = r15.getString(r0)
            X.0wN r2 = r5.A01
            java.lang.String r1 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "fmessage-notification-message-type-not-supported"
            r2.A0E(r0, r1, r7)
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28491Sw.A00(X.1Sw, X.3T1):X.AH9");
    }

    public static final C16340p0 A01(C28491Sw r5, AnonymousClass3T1 r6) {
        Object obj;
        Object obj2;
        C19630wG r1;
        int i;
        String A012;
        ArrayList arrayList = new ArrayList();
        for (Object next : (Set) r5.A05.getValue()) {
            if (next instanceof AnonymousClass358) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AnonymousClass03U.A06(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass358 r2 = (AnonymousClass358) it.next();
            C202319lY r0 = r6.A0M;
            if (r0 != null) {
                int i2 = r0.A03;
                if (i2 == 5) {
                    r1 = r2.A00;
                    i = R.string.f12nameremoved;
                    A012 = r1.A01(i);
                } else if (i2 != 1000) {
                    A012 = r2.A01.A0Z(r6);
                } else {
                    r1 = r2.A00;
                    i = R.string.f12nameremoved;
                    A012 = r1.A01(i);
                }
                CharSequence A022 = AnonymousClass14B.A02(A012);
                if (A022 != null) {
                    obj2 = new AH9(A022);
                    arrayList2.add(obj2);
                }
            }
            obj2 = AHA.A00;
            arrayList2.add(obj2);
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(obj instanceof AHA)) {
                break;
            }
        }
        C16340p0 r22 = (C16340p0) obj;
        B6A b6a = (B6A) ((AnonymousClass9XG) r5.A06.getValue()).A00(r6.A1I);
        if (r22 == null) {
            r22 = b6a.BGA(r6);
        }
        if (!(r22 instanceof AH9)) {
            return r22;
        }
        CharSequence A023 = AnonymousClass14B.A02(r5.A02.A00(((AH9) r22).A00));
        if (A023 == null) {
            A023 = "";
        }
        return new AH9(A023);
    }

    public static final Set A02(String str, boolean z) {
        if (!z) {
            return C004702c.A00;
        }
        List<String> A0L = AnonymousClass099.A0L(new C10880fN("[\\[|\\]]").A00(str, ""), new String[]{","}, 0);
        if (!A0L.contains("all")) {
            if (!(A0L instanceof Collection) || !A0L.isEmpty()) {
                for (String length : A0L) {
                    if (length.length() != 0) {
                        C52112ou[] values = C52112ou.values();
                        ArrayList arrayList = new ArrayList();
                        for (C52112ou r1 : values) {
                            if (A0L.contains(r1.surfaceName)) {
                                arrayList.add(r1);
                            }
                        }
                        return C007103b.A0f(arrayList);
                    }
                }
            }
        }
        return AnonymousClass02R.A0E(C52112ou.values());
    }
}
