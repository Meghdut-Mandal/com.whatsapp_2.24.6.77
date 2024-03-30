package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1GV  reason: invalid class name */
public class AnonymousClass1GV {
    public final C19630wG A00;
    public final C20810yC A01;
    public final C21010yW A02;
    public final AnonymousClass1H1 A03;
    public final C25411Gf A04;
    public final C25461Gk A05;
    public final C25451Gj A06;
    public final AnonymousClass1GX A07;

    public static File A00(AnonymousClass1GV r2, File file, String str) {
        long j;
        if (file == null) {
            Log.w("mediaprocessmanager/gettranscodedfile/originalFile is null");
        }
        AnonymousClass1GX r22 = r2.A07;
        if (file != null) {
            j = file.length();
        } else {
            j = -1;
        }
        return r22.A0i(str, j);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.7gp] */
    /* JADX WARNING: type inference failed for: r13v0, types: [X.6va] */
    /* JADX WARNING: type inference failed for: r13v5, types: [X.6vZ] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C124465yE A01(X.C146506vi r21, X.AnonymousClass65P r22) {
        /*
            r20 = this;
            r1 = r20
            X.0yW r4 = r1.A02
            X.0yC r3 = r1.A01
            r10 = r21
            X.3Rg r0 = r10.A0O
            int r2 = r0.A00
            int r0 = r10.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.6Tv r9 = new X.6Tv
            r9.<init>(r3, r4, r0, r2)
            X.5z2 r0 = r10.A0M
            java.lang.String r0 = r0.A0D
            X.58x r6 = r9.A02
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            long r4 = r0.getMostSignificantBits()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r4 = r4 & r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r6.A0N = r2
            X.58v r0 = r9.A01
            r0.A0E = r2
            X.5yE r2 = new X.5yE
            r2.<init>(r9)
            r0 = r22
            X.1Gl r4 = r0.A08
            boolean r3 = r0.A0F
            if (r3 != 0) goto L_0x007f
            java.io.File r3 = r0.A0A
            if (r3 != 0) goto L_0x007f
            X.7gr r12 = r2.A06
            X.5mB r11 = r2.A05
            X.7gs r13 = r2.A07
            java.lang.String r15 = r0.A0E
            X.C18740tg.A06(r15)
            java.io.File r5 = r0.A00()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = ".tmp"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.io.File r14 = A00(r1, r5, r0)
            X.5BT r8 = new X.5BT
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            X.1Gk r0 = r1.A05
            r0.A00(r8, r4)
        L_0x007e:
            return r2
        L_0x007f:
            X.1Gl r3 = X.C25471Gl.A04
            if (r4 == r3) goto L_0x00c6
            X.1Gl r3 = X.C25471Gl.A0S
            if (r4 == r3) goto L_0x00c6
            boolean r3 = X.AnonymousClass6Y1.A08(r4)
            if (r3 == 0) goto L_0x010b
            X.1H1 r5 = r1.A03
            int r7 = r0.A03
            int r6 = r0.A02
            java.lang.String r4 = r0.A0B
            X.0wG r3 = r1.A00
            android.content.Context r12 = r3.A00
            X.6vZ r3 = new X.6vZ
            r14 = r9
            r15 = r10
            r16 = r2
            r17 = r1
            r18 = r0
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            if (r7 <= 0) goto L_0x0104
            if (r6 <= 0) goto L_0x0104
        L_0x00ab:
            X.0y0 r13 = r5.A00
            X.1H2 r15 = r5.A02
            X.0ts r14 = r5.A01
            X.1HA r0 = r5.A03
            X.5BL r11 = new X.5BL
            r17 = r10
            r18 = r0
            r19 = r4
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            X.4R0 r0 = r11.A00
            r5.A04(r0, r11)
            return r2
        L_0x00c6:
            X.1H1 r5 = r1.A03
            int r8 = r0.A03
            int r7 = r0.A02
            java.lang.String r6 = r0.A0B
            X.0wG r3 = r1.A00
            android.content.Context r12 = r3.A00
            X.6va r3 = new X.6va
            r14 = r9
            r15 = r10
            r16 = r2
            r17 = r1
            r18 = r0
            r19 = r4
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            if (r8 <= 0) goto L_0x0101
            if (r7 <= 0) goto L_0x0101
        L_0x00e6:
            X.0y0 r13 = r5.A00
            X.1H2 r15 = r5.A02
            X.0ts r14 = r5.A01
            X.1HA r0 = r5.A03
            X.5BL r11 = new X.5BL
            r17 = r10
            r18 = r0
            r19 = r6
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            X.4R0 r0 = r11.A00
            r5.A04(r0, r11)
            return r2
        L_0x0101:
            if (r6 != 0) goto L_0x00e6
            goto L_0x0106
        L_0x0104:
            if (r4 != 0) goto L_0x00ab
        L_0x0106:
            r0 = 0
            r3.BZz(r0)
            return r2
        L_0x010b:
            boolean r3 = X.AnonymousClass6Y1.A03(r4)
            if (r3 == 0) goto L_0x014a
            X.7gr r12 = r2.A06
            X.5mB r11 = r2.A05
            X.7gs r13 = r2.A07
            java.io.File r14 = r0.A0A
            X.C18740tg.A06(r14)
            boolean r4 = r0.A0M
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = ".aac"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.io.File r15 = A00(r1, r14, r0)
            X.5BU r8 = new X.5BU
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.1Gk r1 = r1.A05
            X.1Gl r0 = X.C25471Gl.A05
        L_0x0146:
            r1.A00(r8, r0)
            return r2
        L_0x014a:
            boolean r3 = X.AnonymousClass6Y1.A05(r4)
            if (r3 == 0) goto L_0x0195
            java.lang.String r4 = r0.A0E
            X.C18740tg.A06(r4)
            X.7gr r12 = r2.A06
            X.5mB r11 = r2.A05
            X.7gs r13 = r2.A07
            java.io.File r6 = r0.A00()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = ".jpg"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.io.File r15 = A00(r1, r6, r3)
            X.63a r14 = r0.A07
            X.C18740tg.A06(r14)
            boolean r3 = r0.A0K
            boolean r0 = r0.A0H
            X.5BV r8 = new X.5BV
            r16 = r4
            r17 = r3
            r18 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1Gk r1 = r1.A05
            X.1Gl r0 = X.C25471Gl.A0D
            goto L_0x0146
        L_0x0195:
            boolean r3 = X.AnonymousClass6Y1.A07(r4)
            if (r3 == 0) goto L_0x01e4
            java.io.File r15 = r0.A0A
            java.lang.String r5 = r0.A0E
            java.lang.String r4 = r0.A0C
            X.3S2 r14 = r0.A09
            java.lang.String r3 = r0.A0D
            X.7gr r12 = r2.A06
            X.5mB r11 = r2.A05
            X.7gs r13 = r2.A07
            java.io.File r6 = r0.A00()
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x01e1
            java.lang.String r8 = ".was"
        L_0x01b5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r7.append(r0)
            r7.append(r8)
            java.lang.String r0 = r7.toString()
            java.io.File r16 = A00(r1, r6, r0)
            X.5BW r8 = new X.5BW
            r17 = r5
            r18 = r4
            r19 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1Gk r1 = r1.A05
            X.1Gl r0 = X.C25471Gl.A0d
            goto L_0x0146
        L_0x01e1:
            java.lang.String r8 = ".webp"
            goto L_0x01b5
        L_0x01e4:
            X.1Gl r3 = X.C25471Gl.A0A
            if (r4 != r3) goto L_0x007e
            java.io.File r5 = r0.A0A
            X.C18740tg.A06(r5)
            X.7gr r4 = r2.A06
            X.7gs r0 = r2.A07
            X.5tU r3 = new X.5tU
            r3.<init>(r4, r0, r5)
            X.1Gj r0 = r1.A06
            r0.A04(r10, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GV.A01(X.6vi, X.65P):X.5yE");
    }

    public void A02(AnonymousClass4R0 r3, C25471Gl r4) {
        AnonymousClass00T r0;
        C25461Gk r1 = this.A05;
        if (C25461Gk.A04.contains(r4)) {
            r0 = r1.A02;
        } else {
            r0 = r1.A03;
        }
        ((AnonymousClass1GM) r0.getValue()).A08(r3);
        this.A03.A08(r3);
        this.A04.A08(r3);
    }

    public AnonymousClass1GV(C19630wG r1, C20810yC r2, C21010yW r3, C25451Gj r4, AnonymousClass1H1 r5, C25411Gf r6, C25461Gk r7, AnonymousClass1GX r8) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A07 = r8;
        this.A04 = r6;
        this.A06 = r4;
        this.A05 = r7;
        this.A03 = r5;
    }
}
