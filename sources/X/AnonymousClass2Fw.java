package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2Fw  reason: invalid class name */
public final class AnonymousClass2Fw extends C49032iS {
    public static final C18950u5 A0Y = new C18950u5(1, 1000, 1000000, true);
    public final C19700wN A00;
    public final C29411Wn A01;
    public final AnonymousClass1NG A02;
    public final AnonymousClass6O7 A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass310 A05;
    public final AnonymousClass1FI A06;
    public final AnonymousClass17X A07;
    public final C26141Ja A08;
    public final C232317r A09;
    public final AnonymousClass1NZ A0A;
    public final C20810yC A0B;
    public final C21010yW A0C;
    public final AnonymousClass11F A0D;
    public final AnonymousClass1EU A0E;
    public final C21430zE A0F;
    public final AnonymousClass1EM A0G;
    public final C230116v A0H;
    public final AnonymousClass005 A0I;
    public final HashSet A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    private final List A00(List list) {
        C224214g r5 = new C224214g(false);
        r5.A03();
        if (this.A0S || this.A0X) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (Object next : list) {
                AnonymousClass3L0 r0 = ((AnonymousClass141) next).A0E;
                if (r0 == null || !r0.A09) {
                    A0I2.add(next);
                }
            }
            r5.A01();
            return A0I2;
        }
        r5.A01();
        return list;
    }

    public static final List A01(List list) {
        C224214g r4 = new C224214g(false);
        r4.A03();
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (Object next : list) {
            C36391kE.A1V(next, A0I2, C36431kI.A1W((AnonymousClass141) next) ? 1 : 0);
        }
        r4.A01();
        return A0I2;
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0185, code lost:
        if (r10 == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0187, code lost:
        if (r7 == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0237, code lost:
        if (X.C36381kD.A1Z(r7, 43) != false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0248, code lost:
        if (X.C36381kD.A1Z(r7, 42) != false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x039e, code lost:
        if (r14.A01.A0E(3751) == false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03aa, code lost:
        if (r14.A01.A0E(3762) != false) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r7 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r8.A0E(5392) == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r8.A07(4833) < 1) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0150, code lost:
        if (r13 < 34) goto L_0x0152;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a A[ADDED_TO_REGION] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r34) {
        /*
            r33 = this;
            r21 = 0
            r1 = r34
            r0 = r21
            X.AnonymousClass00C.A0D(r1, r0)
            r1 = r33
            boolean r0 = r1.A0S
            boolean r4 = r1.A0X
            boolean r5 = r1.A0T
            boolean r2 = r1.A0O
            r19 = r2
            boolean r2 = r1.A0N
            r20 = r2
            boolean r11 = r1.A0R
            X.0yC r8 = r1.A0B
            r2 = 6116(0x17e4, float:8.57E-42)
            boolean r18 = r8.A0E(r2)
            r3 = 148445312(0x8d91880, float:1.3065972E-33)
            if (r18 == 0) goto L_0x002d
            X.0zE r2 = r1.A0F
            r2.markerStart(r3)
        L_0x002d:
            java.lang.String r3 = "loadContactsTask/MainStopwatch"
            X.14g r2 = new X.14g
            r2.<init>((java.lang.String) r3)
            r2.A03()
            X.4c6 r3 = r1.A02
            r22 = r3
            boolean r6 = r22.isCancelled()
            r3 = 1
            if (r6 != 0) goto L_0x0079
            if (r0 != 0) goto L_0x0062
            if (r4 != 0) goto L_0x0062
            boolean r6 = r1.A0V
            if (r6 != 0) goto L_0x0062
            boolean r6 = r1.A0P
            if (r6 != 0) goto L_0x0062
            boolean r6 = r1.A0L
            if (r6 != 0) goto L_0x0062
            boolean r6 = r1.A0Q
            if (r6 != 0) goto L_0x0062
            if (r19 != 0) goto L_0x0062
            if (r11 == 0) goto L_0x026a
            r6 = 4833(0x12e1, float:6.772E-42)
            int r6 = r8.A07(r6)
            if (r6 < r3) goto L_0x026a
        L_0x0062:
            X.14g r13 = new X.14g
            r6 = r21
            r13.<init>((boolean) r6)
            r13.A03()
            if (r11 == 0) goto L_0x0214
            X.6O7 r6 = r1.A03
            if (r6 == 0) goto L_0x0211
            java.util.List r7 = r6.A00
        L_0x0074:
            r13.A01()
            if (r7 != 0) goto L_0x007b
        L_0x0079:
            X.09w r7 = X.C023409w.A00
        L_0x007b:
            java.lang.String r6 = "loadContactsTask/gotFrequentJids"
            r2.A02(r6)
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x0196
            if (r0 != 0) goto L_0x008e
            if (r4 == 0) goto L_0x0098
        L_0x008e:
            r6 = 5392(0x1510, float:7.556E-42)
            boolean r6 = r8.A0E(r6)
            r17 = 1
            if (r6 != 0) goto L_0x009a
        L_0x0098:
            r17 = 0
        L_0x009a:
            if (r11 == 0) goto L_0x00a5
            r6 = 4833(0x12e1, float:6.772E-42)
            int r6 = r8.A07(r6)
            r12 = 5
            if (r6 >= r3) goto L_0x00a6
        L_0x00a5:
            r12 = 3
        L_0x00a6:
            java.util.Iterator r16 = r7.iterator()
            r10 = 0
            r7 = r10
        L_0x00ac:
            boolean r6 = r16.hasNext()
            if (r6 == 0) goto L_0x0185
            X.11F r13 = X.C36401kF.A0a(r16)
            if (r17 == 0) goto L_0x017f
            if (r10 == 0) goto L_0x0190
            if (r7 != 0) goto L_0x0189
        L_0x00bc:
            boolean r6 = r13 instanceof X.C177528dw
            if (r6 != 0) goto L_0x00ac
            X.005 r6 = r1.A0I
            X.18z r6 = X.C36411kG.A0a(r6)
            boolean r6 = r6.A0P(r13)
            if (r6 != 0) goto L_0x00ac
            X.16D r6 = r1.A04
            X.141 r14 = r6.A08(r13)
            if (r14 == 0) goto L_0x00ac
            X.1NG r6 = r1.A02
            boolean r6 = X.C36331k8.A1Y(r6, r14)
            if (r6 != 0) goto L_0x00ac
            boolean r6 = r13 instanceof X.C177638e7
            if (r6 != 0) goto L_0x00ac
            boolean r6 = r13 instanceof X.C28981Uw
            if (r6 != 0) goto L_0x00ac
            boolean r6 = r1.A0K
            if (r6 == 0) goto L_0x00ed
            boolean r6 = r13 instanceof X.C177538dx
            if (r6 == 0) goto L_0x00ed
            goto L_0x00ac
        L_0x00ed:
            if (r0 != 0) goto L_0x00f1
            if (r4 == 0) goto L_0x00f6
        L_0x00f1:
            boolean r6 = r13 instanceof X.C177538dx
            if (r6 == 0) goto L_0x00f6
            goto L_0x00ac
        L_0x00f6:
            boolean r6 = r14.A0G()
            if (r6 == 0) goto L_0x010d
            X.17X r15 = r1.A07
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r6 = X.C36381kD.A0e(r14, r6)
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            boolean r6 = r15.A0C(r6)
            if (r6 != 0) goto L_0x010d
            goto L_0x00ac
        L_0x010d:
            X.11F r6 = r1.A0D
            boolean r6 = X.AnonymousClass00C.A0J(r13, r6)
            if (r6 != 0) goto L_0x00ac
            if (r19 != 0) goto L_0x0123
            X.310 r6 = r1.A05
            X.0yC r13 = r6.A00
            r6 = 6317(0x18ad, float:8.852E-42)
            boolean r6 = r13.A0E(r6)
            if (r6 == 0) goto L_0x012a
        L_0x0123:
            boolean r6 = r14.A0G()
            if (r6 == 0) goto L_0x012a
            goto L_0x00ac
        L_0x012a:
            int r6 = r9.size()
            if (r6 >= r12) goto L_0x017c
            r9.add(r14)
            if (r17 == 0) goto L_0x00ac
            boolean r6 = r14.A0G()
            if (r6 == 0) goto L_0x017a
            X.13q r6 = X.AnonymousClass11F.A00
            X.11F r6 = r14.A0H
            X.144 r13 = X.AnonymousClass6H4.A00(r6)
            if (r13 == 0) goto L_0x017a
            X.17r r6 = r1.A09
            int r13 = r6.A0A(r13)
            r6 = 3
            if (r6 > r13) goto L_0x017a
            r6 = 34
            if (r13 >= r6) goto L_0x017a
        L_0x0152:
            int r6 = r9.size()
            if (r6 < r12) goto L_0x00ac
            if (r14 == r10) goto L_0x00ac
            boolean r6 = r14.A0G()
            if (r6 == 0) goto L_0x00ac
            X.13q r6 = X.AnonymousClass11F.A00
            X.11F r6 = r14.A0H
            X.144 r13 = X.AnonymousClass6H4.A00(r6)
            if (r13 == 0) goto L_0x00ac
            X.17r r6 = r1.A09
            int r13 = r6.A0A(r13)
            r6 = 3
            if (r6 > r13) goto L_0x00ac
            r6 = 34
            if (r13 >= r6) goto L_0x00ac
            r7 = r14
            goto L_0x00ac
        L_0x017a:
            r10 = r14
            goto L_0x0152
        L_0x017c:
            if (r17 == 0) goto L_0x00ac
            goto L_0x0152
        L_0x017f:
            int r6 = r9.size()
            if (r6 < r12) goto L_0x00bc
        L_0x0185:
            if (r10 == 0) goto L_0x0196
            if (r7 == 0) goto L_0x0196
        L_0x0189:
            r9.remove(r10)
            r9.add(r7)
            goto L_0x0196
        L_0x0190:
            int r6 = r9.size()
            if (r6 < r12) goto L_0x00bc
        L_0x0196:
            java.lang.String r6 = "loadContactsTask/gotTopContacts"
            r2.A02(r6)
            java.util.ArrayList r17 = X.AnonymousClass001.A0I()
            if (r20 != 0) goto L_0x01e7
            if (r5 != 0) goto L_0x01e7
            if (r11 != 0) goto L_0x01e7
            if (r19 != 0) goto L_0x01e7
        L_0x01a7:
            java.lang.String r6 = "loadContactsTask/gotRecentlyAcceptedInviteContacts"
            r2.A02(r6)
            X.310 r6 = r1.A05
            X.0yC r13 = r6.A00
            r10 = 6317(0x18ad, float:8.852E-42)
            boolean r6 = r13.A0E(r10)
            if (r6 == 0) goto L_0x02cf
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            boolean r6 = r13.A0E(r10)
            if (r6 == 0) goto L_0x02d1
            java.util.HashMap r12 = X.AnonymousClass001.A0J()
            r6 = 6319(0x18af, float:8.855E-42)
            float r16 = r13.A05(r6)
            java.util.Iterator r14 = r9.iterator()
        L_0x01d0:
            boolean r6 = r14.hasNext()
            r15 = 981668463(0x3a83126f, float:0.001)
            if (r6 == 0) goto L_0x026e
            java.lang.Object r10 = r14.next()
            java.lang.Float r6 = java.lang.Float.valueOf(r16)
            r12.put(r10, r6)
            float r16 = r16 - r15
            goto L_0x01d0
        L_0x01e7:
            X.1NZ r6 = r1.A0A
            java.util.ArrayList r6 = r6.A00()
            java.util.Iterator r10 = r6.iterator()
        L_0x01f1:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x01a7
            X.11F r7 = X.C36401kF.A0a(r10)
            X.16D r6 = r1.A04
            X.141 r7 = r6.A08(r7)
            if (r7 == 0) goto L_0x01f1
            X.1NG r6 = r1.A02
            boolean r6 = X.C36331k8.A1Y(r6, r7)
            if (r6 != 0) goto L_0x01f1
            r6 = r17
            r6.add(r7)
            goto L_0x01f1
        L_0x0211:
            r7 = 0
            goto L_0x0074
        L_0x0214:
            X.1FI r14 = r1.A06
            boolean r6 = r14.A06()
            if (r6 == 0) goto L_0x0221
            X.1Wn r6 = r1.A01
            r6.A03()
        L_0x0221:
            java.util.HashSet r7 = r1.A0J
            java.lang.Integer r6 = X.C36371kC.A0n()
            boolean r6 = r7.contains(r6)
            r15 = 100
            r12 = 1
            if (r6 != 0) goto L_0x0239
            r6 = 43
            boolean r6 = X.C36381kD.A1Z(r7, r6)
            r10 = 1
            if (r6 == 0) goto L_0x023b
        L_0x0239:
            r10 = 100
        L_0x023b:
            boolean r6 = X.C36381kD.A1Z(r7, r3)
            if (r6 != 0) goto L_0x024a
            r6 = 42
            boolean r6 = X.C36381kD.A1Z(r7, r6)
            r9 = 1
            if (r6 == 0) goto L_0x024c
        L_0x024a:
            r9 = 100
        L_0x024c:
            r6 = 13
            boolean r6 = X.C36381kD.A1Z(r7, r6)
            if (r6 != 0) goto L_0x0255
            r15 = 1
        L_0x0255:
            X.3hG r7 = new X.3hG
            r7.<init>(r9, r15, r10)
            if (r0 != 0) goto L_0x025f
            if (r4 != 0) goto L_0x025f
            r12 = 0
        L_0x025f:
            r6 = r21
            java.util.ArrayList r7 = r14.A02(r7, r6, r12)
            r13.A01()
            goto L_0x007b
        L_0x026a:
            if (r5 == 0) goto L_0x0079
            goto L_0x0062
        L_0x026e:
            r6 = 6318(0x18ae, float:8.853E-42)
            float r14 = r13.A05(r6)
            java.util.Iterator r13 = r17.iterator()
        L_0x0278:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x02a1
            java.lang.Object r10 = r13.next()
            boolean r6 = r12.containsKey(r10)
            if (r6 == 0) goto L_0x029c
            java.lang.Number r6 = X.C36441kJ.A10(r10, r12)
            if (r6 == 0) goto L_0x029a
            float r6 = r6.floatValue()
            float r6 = r6 + r14
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
        L_0x0297:
            r12.put(r10, r6)
        L_0x029a:
            float r14 = r14 - r15
            goto L_0x0278
        L_0x029c:
            java.lang.Float r6 = java.lang.Float.valueOf(r14)
            goto L_0x0297
        L_0x02a1:
            java.util.Set r10 = r12.entrySet()
            r6 = r21
            X.AnonymousClass00C.A0D(r10, r6)
            java.util.ArrayList r13 = X.C36441kJ.A15(r10)
            X.4NV r12 = X.AnonymousClass4NV.A00
            r10 = 5
            X.4YZ r6 = new X.4YZ
            r6.<init>(r12, r10)
            X.AnonymousClass03X.A08(r13, r6)
            java.util.Iterator r10 = r13.iterator()
        L_0x02bd:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x02d1
            java.util.Map$Entry r6 = X.AnonymousClass000.A11(r10)
            java.lang.Object r6 = r6.getKey()
            r7.add(r6)
            goto L_0x02bd
        L_0x02cf:
            X.09w r7 = X.C023409w.A00
        L_0x02d1:
            java.lang.String r6 = "loadContactsTask/gotSuggestedContacts"
            r2.A02(r6)
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            boolean r6 = r22.isCancelled()
            if (r6 != 0) goto L_0x02ef
            boolean r6 = r1.A0W
            if (r6 == 0) goto L_0x0327
            X.16D r6 = r1.A04
            X.16p r6 = r6.A05
            java.util.ArrayList r6 = r6.A0P()
            r10.addAll(r6)
        L_0x02ef:
            java.lang.String r6 = "loadContactsTask/gotAllContacts"
            r2.A02(r6)
            r11 = 0
            if (r0 == 0) goto L_0x035c
            r6 = 6011(0x177b, float:8.423E-42)
            boolean r6 = r8.A0E(r6)
            if (r6 == 0) goto L_0x035c
            java.util.HashSet r16 = X.C36441kJ.A16()
            java.util.Iterator r14 = r10.iterator()
        L_0x0307:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x035e
            X.141 r13 = X.C36391kE.A0f(r14)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.11F r12 = X.C36441kJ.A0k(r13, r6)
            if (r12 == 0) goto L_0x0307
            X.1EM r6 = r1.A0G
            boolean r6 = r6.A04(r13, r12)
            if (r6 == 0) goto L_0x0307
            r6 = r16
            r6.add(r12)
            goto L_0x0307
        L_0x0327:
            if (r11 != 0) goto L_0x0347
            if (r20 != 0) goto L_0x0347
            boolean r6 = r1.A0M
            if (r6 != 0) goto L_0x0341
            if (r5 != 0) goto L_0x0341
            if (r19 != 0) goto L_0x0341
            if (r0 != 0) goto L_0x034d
            if (r4 != 0) goto L_0x034d
            boolean r6 = r1.A0K
            if (r6 != 0) goto L_0x034d
            X.16D r6 = r1.A04
            r6.A0n(r10)
            goto L_0x02ef
        L_0x0341:
            X.16D r6 = r1.A04
            r6.A0i(r10)
            goto L_0x02ef
        L_0x0347:
            X.16D r6 = r1.A04
            X.16p r6 = r6.A05
            r13 = 2
            goto L_0x0352
        L_0x034d:
            X.16D r6 = r1.A04
            X.16p r6 = r6.A05
            r13 = 3
        L_0x0352:
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r6
            r12 = r10
            X.C229516p.A0G(r11, r12, r13, r14, r15, r16)
            goto L_0x02ef
        L_0x035c:
            r16 = r11
        L_0x035e:
            java.lang.String r6 = "loadContactsTask/gotReadyOnlyGroupJids"
            r2.A02(r6)
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            boolean r6 = r22.isCancelled()
            if (r6 != 0) goto L_0x037e
            if (r5 == 0) goto L_0x037e
            boolean r6 = r1.A0U
            if (r6 != 0) goto L_0x037e
            X.16D r6 = r1.A04
            X.16p r6 = r6.A05
            java.util.ArrayList r6 = r6.A0P()
            r13.addAll(r6)
        L_0x037e:
            java.lang.String r6 = "loadContactsTask/gotGroupContacts"
            r2.A02(r6)
            if (r0 != 0) goto L_0x04b9
            if (r4 != 0) goto L_0x04b9
            boolean r6 = r1.A0V
            if (r6 != 0) goto L_0x04b9
        L_0x038b:
            X.09w r6 = X.C023409w.A00
        L_0x038d:
            java.lang.String r12 = "loadContactsTask/gotNewsletterContacts"
            r2.A02(r12)
            X.16v r14 = r1.A0H
            if (r5 == 0) goto L_0x03a0
            X.0yC r15 = r14.A01
            r12 = 3751(0xea7, float:5.256E-42)
            boolean r12 = r15.A0E(r12)
            if (r12 != 0) goto L_0x03ac
        L_0x03a0:
            if (r20 == 0) goto L_0x04af
            X.0yC r14 = r14.A01
            r12 = 3762(0xeb2, float:5.272E-42)
            boolean r12 = r14.A0E(r12)
            if (r12 == 0) goto L_0x04af
        L_0x03ac:
            java.lang.String r12 = "loadContactsTask/filterLidContacts"
            r2.A02(r12)
            java.util.List r12 = r1.A00(r10)
            java.util.List r24 = r1.A00(r9)
            java.lang.String r9 = "loadContactsTask/filterBotContacts"
            r2.A02(r9)
            X.3As[] r9 = new X.C61143As[r3]
            X.09w r27 = X.C023409w.A00
            X.6O7 r15 = r1.A03
            X.3As r22 = new X.3As
            r23 = r15
            r25 = r12
            r26 = r13
            r28 = r7
            r29 = r11
            r30 = r17
            r31 = r6
            r32 = r16
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r9[r21] = r22
            r1.A0F(r9)
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            boolean r9 = r1.A0U
            if (r9 != 0) goto L_0x03fb
            if (r20 == 0) goto L_0x0499
            X.16D r3 = r1.A04
            X.16p r3 = r3.A05
            r27 = 2
        L_0x03ee:
            r28 = 1
            r29 = 0
            r30 = 0
            r25 = r3
            r26 = r10
            X.C229516p.A0G(r25, r26, r27, r28, r29, r30)
        L_0x03fb:
            java.util.List r27 = r1.A00(r10)
            java.lang.String r3 = "loadContactsTask/gotDeviceContacts"
            r2.A02(r3)
            if (r9 != 0) goto L_0x048c
            r29 = 0
        L_0x0408:
            java.lang.String r3 = "loadContactsTask/gotPaymentsContacts"
            r2.A02(r3)
            long r2 = r2.A01()
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r8 = "contactpicker/LoadContactsTask took "
            r9.append(r8)
            r9.append(r2)
            java.lang.String r8 = " ms to load "
            X.C36371kC.A1R(r8, r9, r12)
            java.lang.String r8 = " contacts"
            X.C36321k7.A1a(r9, r8)
            r9 = 15000(0x3a98, double:7.411E-320)
            int r8 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x043e
            X.0u5 r8 = A0Y
            boolean r8 = r8.A00()
            if (r8 == 0) goto L_0x043e
            X.0wN r10 = r1.A00
            java.lang.String r9 = "contactpicker/LoadContactsTask Contacts loading took too long"
            r8 = r21
            r10.A0E(r9, r11, r8)
        L_0x043e:
            if (r18 == 0) goto L_0x0452
            X.0zE r11 = r1.A0F
            int r10 = r12.size()
            java.lang.String r9 = "contacts_count"
            r8 = 148445312(0x8d91880, float:1.3065972E-33)
            r11.markerAnnotate((int) r8, (java.lang.String) r9, (int) r10)
            r9 = 2
            r11.markerEnd(r8, r9)
        L_0x0452:
            X.135 r8 = new X.135
            r8.<init>()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.A00 = r2
            java.lang.String r2 = "load-contacts-task"
            r8.A02 = r2
            if (r0 == 0) goto L_0x047a
            java.lang.String r0 = "usageForward"
        L_0x0465:
            r8.A01 = r0
            X.0yW r0 = r1.A0C
            r0.Bly(r8)
            X.3As r22 = new X.3As
            r25 = r12
            r26 = r13
            r28 = r7
            r30 = r17
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r22
        L_0x047a:
            if (r5 == 0) goto L_0x047f
            java.lang.String r0 = "usageNewChat"
            goto L_0x0465
        L_0x047f:
            if (r4 == 0) goto L_0x0484
            java.lang.String r0 = "usageShare"
            goto L_0x0465
        L_0x0484:
            if (r19 == 0) goto L_0x0489
            java.lang.String r0 = "usageContactList"
            goto L_0x0465
        L_0x0489:
            java.lang.String r0 = "other"
            goto L_0x0465
        L_0x048c:
            X.1EU r3 = r1.A0E
            X.AnonymousClass1EU.A00(r3)
            X.16S r3 = r3.A06
            java.util.ArrayList r29 = r3.A0B()
            goto L_0x0408
        L_0x0499:
            if (r5 != 0) goto L_0x04a7
            if (r0 != 0) goto L_0x049f
            if (r4 == 0) goto L_0x03fb
        L_0x049f:
            r14 = 6741(0x1a55, float:9.446E-42)
            int r8 = r8.A07(r14)
            if (r8 != r3) goto L_0x03fb
        L_0x04a7:
            X.16D r3 = r1.A04
            X.16p r3 = r3.A05
            r27 = 1
            goto L_0x03ee
        L_0x04af:
            java.util.List r10 = A01(r10)
            java.util.List r9 = A01(r9)
            goto L_0x03ac
        L_0x04b9:
            r6 = 6323(0x18b3, float:8.86E-42)
            boolean r6 = r8.A0E(r6)
            if (r6 == 0) goto L_0x038b
            X.1Ja r6 = r1.A08
            java.util.List r12 = r6.A05()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r15 = r12.iterator()
        L_0x04cf:
            boolean r12 = r15.hasNext()
            if (r12 == 0) goto L_0x038d
            X.11F r14 = X.C36401kF.A0a(r15)
            X.16D r12 = r1.A04
            X.141 r12 = r12.A08(r14)
            if (r12 == 0) goto L_0x04cf
            r6.add(r12)
            goto L_0x04cf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Fw.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Fw(C19700wN r21, C29411Wn r22, AnonymousClass1NG r23, AnonymousClass6O7 r24, AnonymousClass16D r25, AnonymousClass310 r26, ContactPickerFragment contactPickerFragment, AnonymousClass1FI r28, AnonymousClass17X r29, C26141Ja r30, C232317r r31, AnonymousClass1NZ r32, C20810yC r33, C21010yW r34, AnonymousClass11F r35, AnonymousClass1EU r36, C21430zE r37, AnonymousClass1EM r38, C230116v r39, AnonymousClass005 r40, HashSet hashSet, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(contactPickerFragment);
        HashSet hashSet2 = hashSet;
        AnonymousClass00C.A0D(hashSet2, 2);
        C20810yC r15 = r33;
        C19700wN r19 = r21;
        C36361kB.A1M(r15, r19);
        C21010yW r14 = r34;
        AnonymousClass00C.A0D(r14, 20);
        AnonymousClass16D r16 = r25;
        AnonymousClass00C.A0D(r16, 21);
        AnonymousClass1EM r5 = r38;
        AnonymousClass00C.A0D(r5, 22);
        AnonymousClass005 r3 = r40;
        AnonymousClass1EU r7 = r36;
        AnonymousClass1NG r17 = r23;
        AnonymousClass1FI r12 = r28;
        C29411Wn r18 = r22;
        C36331k8.A1K(r7, r17, r18, r3, r12);
        C230116v r4 = r39;
        AnonymousClass00C.A0D(r4, 29);
        C21430zE r6 = r37;
        AnonymousClass00C.A0D(r6, 30);
        AnonymousClass17X r11 = r29;
        C26141Ja r10 = r30;
        C232317r r9 = r31;
        AnonymousClass1NZ r8 = r32;
        AnonymousClass310 r13 = r26;
        C36361kB.A1N(r11, r13, r8, r9, r10);
        this.A0J = hashSet2;
        this.A0D = r35;
        this.A0Q = z;
        this.A0M = z2;
        this.A0X = z3;
        this.A0P = z4;
        this.A0S = z5;
        this.A0W = z6;
        this.A0N = z7;
        this.A0R = z8;
        this.A0T = z9;
        this.A0V = z10;
        this.A0U = z11;
        this.A0O = z12;
        this.A0K = z13;
        this.A0B = r15;
        this.A00 = r19;
        this.A0L = z14;
        this.A0C = r14;
        this.A04 = r16;
        this.A0G = r5;
        this.A0E = r7;
        this.A02 = r17;
        this.A01 = r18;
        this.A0I = r3;
        this.A06 = r12;
        this.A03 = r24;
        this.A0H = r4;
        this.A0F = r6;
        this.A07 = r11;
        this.A05 = r13;
        this.A0A = r8;
        this.A09 = r9;
        this.A08 = r10;
    }
}
