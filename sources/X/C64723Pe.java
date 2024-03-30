package X;

import android.text.SpannableString;
import android.text.TextUtils;
import java.math.BigDecimal;

/* renamed from: X.3Pe  reason: invalid class name and case insensitive filesystem */
public class C64723Pe {
    public final C20690y0 A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass1X4 A02;
    public final C19970wo A03;
    public final C20830yE A04;
    public final AnonymousClass3L6 A05;
    public final AnonymousClass1A1 A06;
    public final C19770wU A07;
    public final C19460v5 A08;
    public final C19730wQ A09;
    public final AnonymousClass9Y1 A0A;
    public final C18820ts A0B;

    public SpannableString A00(C46852bm r8) {
        String str;
        if (r8.A0A == null || TextUtils.isEmpty(r8.A03)) {
            str = r8.A04;
            if (str == null) {
                return null;
            }
        } else {
            C132386Tk r5 = new C132386Tk(r8.A03);
            BigDecimal bigDecimal = r8.A0B;
            BigDecimal bigDecimal2 = r8.A0A;
            C18820ts r2 = this.A0B;
            str = r5.A03(r2, bigDecimal2, true);
            if (!(bigDecimal == null || BigDecimal.ZERO.compareTo(bigDecimal) == 0 || bigDecimal.compareTo(bigDecimal2) >= 0)) {
                return AnonymousClass6W7.A02(str, r5.A03(r2, bigDecimal, true));
            }
        }
        return C36441kJ.A0O(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r5v0 int) = (r29v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
    public void A01(X.C225314u r23, X.C196089Xp r24, X.AnonymousClass11F r25, com.whatsapp.jid.UserJid r26, java.util.List r27, int r28, int r29, long r30) {
        /*
            r22 = this;
            r8 = r27
            if (r27 == 0) goto L_0x0104
            int r0 = r8.size()
            if (r0 == 0) goto L_0x0104
            int r0 = r8.size()
            r5 = r29
            if (r5 >= r0) goto L_0x0104
            r4 = r22
            r6 = r28
            if (r29 != 0) goto L_0x011a
            r0 = 1
            if (r6 == r0) goto L_0x0116
            r0 = 3
            if (r6 != r0) goto L_0x011a
            java.lang.String r7 = "Forward"
        L_0x0020:
            X.3L6 r3 = r4.A05
            r1 = 774779800(0x2e2e3398, float:3.9608844E-11)
            java.lang.String r2 = "send_product_message_tag"
            java.lang.String r0 = "CatalogUtils"
            r3.A00(r1, r2, r0)
            int r0 = r8.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ProductsCount"
            r3.A03(r2, r0, r1)
            java.lang.String r0 = "EntryPoint"
            r3.A03(r2, r0, r7)
            r16 = 1
        L_0x0040:
            r0 = 1
            if (r6 == r0) goto L_0x0112
            r0 = 2
            r9 = 55
            if (r6 == r0) goto L_0x004a
            r9 = 66
        L_0x004a:
            X.0yE r0 = r4.A04
            boolean r0 = r0.A0D()
            r7 = r23
            if (r0 != 0) goto L_0x010f
            r3 = 2131892966(0x7f121ae6, float:1.9420695E38)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            r1 = 2131892965(0x7f121ae5, float:1.9420693E38)
            if (r2 < r0) goto L_0x006a
            r0 = 33
            r1 = 2131892968(0x7f121ae8, float:1.94207E38)
            if (r2 >= r0) goto L_0x006a
            r1 = 2131892967(0x7f121ae7, float:1.9420697E38)
        L_0x006a:
            com.whatsapp.RequestPermissionActivity.A0F(r7, r3, r1, r9)
            r0 = 0
        L_0x006e:
            r2 = 0
            java.lang.String r10 = "send_product_message_tag"
            if (r0 == 0) goto L_0x011e
            java.lang.Object r3 = r8.get(r5)
            X.9up r3 = (X.C207269up) r3
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x011e
            X.0wQ r0 = r4.A09
            r9 = r26
            boolean r0 = r0.A0M(r9)
            if (r0 == 0) goto L_0x00bf
            X.9Y1 r13 = r4.A0A
            java.lang.String r14 = r3.A0F
            r15 = 34
            X.0u5 r12 = r13.A09
            java.lang.String r0 = r13.A02
            if (r0 != 0) goto L_0x0105
            boolean r0 = r12.A00()
            if (r0 == 0) goto L_0x00bf
        L_0x0099:
            X.8cH r11 = new X.8cH
            r11.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r11.A02 = r0
            java.lang.String r0 = r13.A02
            r11.A06 = r0
            r11.A0A = r14
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A0C
            int r0 = r0.get()
            if (r0 == 0) goto L_0x00b8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A03 = r0
        L_0x00b8:
            X.0yW r1 = r13.A07
            int r0 = r12.A00
            r1.Blz(r11, r0)
        L_0x00bf:
            if (r16 == 0) goto L_0x00d2
            X.3L6 r0 = r4.A05
            java.util.Map r0 = r0.A02
            java.lang.Object r1 = r0.get(r10)
            X.0zf r1 = (X.C21700zf) r1
            if (r1 == 0) goto L_0x00d2
            java.lang.String r0 = "image_upload"
            r1.A07(r0)
        L_0x00d2:
            java.util.List r0 = r3.A07
            java.lang.Object r2 = r0.get(r2)
            X.9tv r2 = (X.C206759tv) r2
            X.3dQ r10 = new X.3dQ
            r14 = r24
            r15 = r25
            r20 = r30
            r17 = r8
            r18 = r5
            r19 = r6
            r16 = r9
            r13 = r3
            r12 = r4
            r11 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.3dL r1 = new X.3dL
            r1.<init>(r7, r8, r5)
            X.3dM r0 = new X.3dM
            r0.<init>(r7, r4)
            r5 = 0
            r11 = 3
            r4 = r14
            r6 = r2
            r7 = r1
            r8 = r5
            r9 = r0
            r4.A01(r5, r6, r7, r8, r9, r10, r11)
        L_0x0104:
            return
        L_0x0105:
            int r1 = r0.hashCode()
            int r0 = r12.A00
            int r1 = r1 % r0
            if (r1 != 0) goto L_0x00bf
            goto L_0x0099
        L_0x010f:
            r0 = 1
            goto L_0x006e
        L_0x0112:
            r9 = 44
            goto L_0x004a
        L_0x0116:
            java.lang.String r7 = "Attachment"
            goto L_0x0020
        L_0x011a:
            r16 = 0
            goto L_0x0040
        L_0x011e:
            X.3L6 r0 = r4.A05
            r0.A05(r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64723Pe.A01(X.14u, X.9Xp, X.11F, com.whatsapp.jid.UserJid, java.util.List, int, int, long):void");
    }

    public C64723Pe(C19460v5 r1, C20690y0 r2, AnonymousClass17Y r3, C19730wQ r4, AnonymousClass1X4 r5, AnonymousClass9Y1 r6, C19970wo r7, C20830yE r8, C18820ts r9, AnonymousClass3L6 r10, AnonymousClass1A1 r11, C19770wU r12) {
        this.A03 = r7;
        this.A01 = r3;
        this.A09 = r4;
        this.A07 = r12;
        this.A00 = r2;
        this.A02 = r5;
        this.A05 = r10;
        this.A08 = r1;
        this.A0B = r9;
        this.A06 = r11;
        this.A04 = r8;
        this.A0A = r6;
    }
}
