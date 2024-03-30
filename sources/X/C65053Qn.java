package X;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.3Qn  reason: invalid class name and case insensitive filesystem */
public class C65053Qn {
    public AnonymousClass141 A00;
    public boolean A01;
    public final AnonymousClass01L A02;
    public final C225014r A03;
    public final AnonymousClass185 A04;
    public final C220412q A05;
    public final AnonymousClass17X A06;
    public final C20810yC A07;
    public final AnonymousClass1C6 A08;
    public final AnonymousClass005 A09;
    public final Runnable A0A;
    public final AnonymousClass1NC A0B;
    public final C19730wQ A0C;
    public final AnonymousClass1NG A0D;
    public final C33201et A0E;
    public final AnonymousClass1LV A0F;
    public final C19420v0 A0G;
    public final AnonymousClass1YR A0H;
    public final C236419g A0I;
    public final C20500xf A0J;
    public final C19770wU A0K;
    public final Runnable A0L;

    public SpannableStringBuilder A01(String str) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder A0P = C36441kJ.A0P(fromHtml);
        URLSpan[] A1b = C36381kD.A1b(fromHtml);
        if (A1b != null) {
            for (URLSpan uRLSpan : A1b) {
                if ("group-privacy-settings".equals(uRLSpan.getURL())) {
                    int spanStart = A0P.getSpanStart(uRLSpan);
                    int spanEnd = A0P.getSpanEnd(uRLSpan);
                    int spanFlags = A0P.getSpanFlags(uRLSpan);
                    A0P.removeSpan(uRLSpan);
                    A0P.setSpan(new C89244Vu(this.A02, this, 0), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A0P;
    }

    private String A00(int i) {
        AnonymousClass141 r0 = this.A00;
        if (r0 != null) {
            Class<AnonymousClass147> cls = AnonymousClass147.class;
            if (r0.A06(cls) != null) {
                if (i == 0) {
                    return "group_spam_banner_report";
                }
                AnonymousClass141 r02 = this.A00;
                if (r02 == null) {
                    Log.e("Contact is unexpected null");
                    return "left_group_spam_banner_report";
                }
                GroupJid groupJid = (GroupJid) r02.A06(cls);
                if (groupJid == null || !this.A06.A0C(groupJid)) {
                    return "left_group_spam_banner_report";
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3BC A02(int r8, boolean r9) {
        /*
            r7 = this;
            if (r9 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            X.141 r0 = r7.A00
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "Contact is unexpected null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x000d:
            r6 = 0
        L_0x000e:
            java.lang.String r0 = r7.A00(r8)
            boolean r1 = X.AnonymousClass000.A1V(r0)
            r0 = 1
            r5 = 2131890052(0x7f120f84, float:1.9414785E38)
            r4 = 2131890293(0x7f121075, float:1.9415274E38)
            if (r8 != r0) goto L_0x0025
            r5 = 2131890053(0x7f120f85, float:1.9414787E38)
            r4 = 2131890294(0x7f121076, float:1.9415276E38)
        L_0x0025:
            X.3FL r3 = new X.3FL
            r3.<init>()
            r2 = 8
            int r0 = X.C36381kD.A09(r1)
            r3.A0B = r0
            r0 = 0
            r3.A0A = r0
            if (r6 != 0) goto L_0x0039
            r0 = 8
        L_0x0039:
            r3.A04 = r0
            X.0v0 r0 = r7.A0G
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "privacy_groupadd"
            int r0 = X.C36371kC.A01(r1, r0)
            if (r0 != 0) goto L_0x004a
            r2 = 0
        L_0x004a:
            r3.A06 = r2
            r3.A07 = r5
            X.1LV r2 = r7.A0F
            X.141 r1 = r7.A00
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r2.A0H(r0)
            r3.A0D = r0
            r3.A05 = r4
            X.3BC r0 = r3.A00()
            return r0
        L_0x0067:
            com.whatsapp.jid.GroupJid r1 = X.C36421kH.A0P(r0)
            if (r1 == 0) goto L_0x000d
            X.17X r0 = r7.A06
            boolean r6 = r0.A0C(r1)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65053Qn.A02(int, boolean):X.3BC");
    }

    public AnonymousClass3BC A03(AnonymousClass141 r7) {
        AnonymousClass11F A0j;
        String A042;
        if (r7.A0H == null || (A0j = C36351kA.A0j(r7)) == null || (A042 = AnonymousClass3U8.A04(A0j)) == null || A042.isEmpty()) {
            return null;
        }
        AnonymousClass3FL r4 = new AnonymousClass3FL();
        r4.A03 = 0;
        r4.A00 = 0;
        r4.A0C = C36411kG.A0w(this.A02.getResources(), A042, AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
        return r4.A00();
    }

    public AnonymousClass3BC A04(AnonymousClass141 r5) {
        if (!AnonymousClass3M3.A00(r5, this.A0J) || C36341k9.A0E(this.A0G).getBoolean("wac_consent_shown", false)) {
            return null;
        }
        boolean A1Y = C36331k8.A1Y(this.A0D, r5);
        int i = R.string.f12nameremoved;
        if (A1Y) {
            i = R.string.f12nameremoved;
        }
        AnonymousClass3FL r1 = new AnonymousClass3FL();
        r1.A02 = 0;
        r1.A00 = 8;
        r1.A07 = R.string.f12nameremoved;
        r1.A01 = i;
        r1.A0A = 0;
        r1.A09 = R.string.f12nameremoved;
        r1.A08 = R.string.f12nameremoved;
        return r1.A00();
    }

    public void A06() {
        AnonymousClass11F A0G2 = C36331k8.A0G(this.A00);
        if (AnonymousClass3M3.A01(this.A0J, A0G2)) {
            C36331k8.A0w(C19420v0.A00(this.A0G), "wac_consent_shown", true);
        } else {
            AnonymousClass1C6 r2 = this.A08;
            r2.A02(A0G2, C36371kC.A0o(), this.A01);
            r2.A08(A0G2, 1);
            C80283v9.A00(this.A0K, this, A0G2, 42);
        }
        this.A0L.run();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r1.A0E(6185) != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r13) {
        /*
            r12 = this;
            X.141 r0 = r12.A00
            com.whatsapp.jid.UserJid r6 = X.C36351kA.A0k(r0)
            X.0xf r1 = r12.A0J
            X.141 r0 = r12.A00
            boolean r0 = X.AnonymousClass3M3.A00(r0, r1)
            if (r0 == 0) goto L_0x0026
            X.01L r5 = r12.A02
            java.lang.String r7 = "psa_banner_block"
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x001a
            java.lang.String r7 = "triggered_block"
        L_0x001a:
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x001d:
            r11 = r10
            android.content.Intent r0 = X.AnonymousClass190.A0x(r5, r6, r7, r8, r9, r10, r11)
            r5.startActivity(r0)
            return
        L_0x0026:
            X.1NG r4 = r12.A0D
            boolean r0 = r4.A0O(r6)
            java.lang.String r2 = "1_1_spam_banner_block"
            java.lang.String r5 = "1_1_old_spam_banner_block"
            java.lang.String r7 = "biz_spam_banner_block"
            r8 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00a4
            X.1C6 r4 = r12.A08
            boolean r1 = r12.A01
            java.lang.Integer r0 = X.C36371kC.A0n()
            r4.A02(r6, r0, r1)
            X.141 r0 = r12.A00
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x006e
            if (r13 == r3) goto L_0x0059
            X.0yC r1 = r12.A07
            X.AnonymousClass00C.A0D(r1, r8)
            r0 = 6185(0x1829, float:8.667E-42)
            boolean r0 = r1.A0E(r0)
            r9 = 0
            if (r0 == 0) goto L_0x005a
        L_0x0059:
            r9 = 1
        L_0x005a:
            X.0yC r0 = r12.A07
            X.AnonymousClass00C.A0D(r0, r8)
            boolean r0 = X.C36421kH.A1Z(r0)
            r10 = r0 ^ 1
            X.01L r5 = r12.A02
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x001d
            java.lang.String r7 = "triggered_block"
            goto L_0x001d
        L_0x006e:
            if (r13 == r3) goto L_0x0071
            r2 = r5
        L_0x0071:
            X.1et r1 = r12.A0E
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x0079
            java.lang.String r2 = "triggered_block"
        L_0x0079:
            X.3F5 r2 = r1.B3t(r6, r2)
            X.0yC r1 = r2.A06
            boolean r0 = X.C36421kH.A1Z(r1)
            if (r0 != 0) goto L_0x0087
            r2.A02 = r3
        L_0x0087:
            r2.A04 = r3
            r2.A05 = r8
            r2.A01(r3, r3)
            if (r13 != r3) goto L_0x009a
            r0 = 6185(0x1829, float:8.667E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x009a
            r2.A03 = r3
        L_0x009a:
            com.whatsapp.blockui.BlockConfirmationDialogFragment r1 = X.AnonymousClass3F5.A00(r2)
            X.14r r0 = r12.A03
            r0.Btm(r1)
            return
        L_0x00a4:
            X.141 r0 = r12.A00
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00b5
            r2 = r7
        L_0x00ad:
            X.01L r1 = r12.A02
            X.141 r0 = r12.A00
            r4.A0G(r1, r0, r2, r8)
            return
        L_0x00b5:
            if (r13 == r3) goto L_0x00ad
            r2 = r5
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65053Qn.A07(int):void");
    }

    public void A08(int i) {
        AnonymousClass147 A022 = C65533Sl.A02(C36381kD.A0e(this.A00, AnonymousClass11F.class));
        this.A03.Bu2(0, R.string.f12nameremoved);
        C19770wU r1 = this.A0K;
        AnonymousClass01L r5 = this.A02;
        AnonymousClass1YR r7 = this.A0H;
        r1.Box(new C49422j5(new C67533a4(this, A022, i), r5, this.A0F, r7, Collections.singleton(A022)), new Object[0]);
    }

    public void A09(int i) {
        String str;
        AnonymousClass11F A0G2 = C36331k8.A0G(this.A00);
        if (A0G2 instanceof AnonymousClass147) {
            str = A00(i);
            C18740tg.A06(str);
        } else {
            str = "1_1_spam_banner_report";
        }
        AnonymousClass1C6 r2 = this.A08;
        r2.A02(A0G2, C36361kB.A0j(), this.A01);
        r2.A08(A0G2, -2);
        this.A0I.A07().A0A(new C79503tp(this, A0G2, str));
    }

    public C65053Qn(AnonymousClass01L r2, AnonymousClass1NC r3, C225014r r4, C19730wQ r5, AnonymousClass1NG r6, C33201et r7, AnonymousClass1LV r8, AnonymousClass185 r9, C19420v0 r10, C220412q r11, AnonymousClass17X r12, AnonymousClass1YR r13, C236419g r14, C20810yC r15, C20500xf r16, AnonymousClass1C6 r17, C19770wU r18, AnonymousClass005 r19, Runnable runnable, Runnable runnable2) {
        this.A07 = r15;
        this.A0C = r5;
        this.A0K = r18;
        this.A0B = r3;
        this.A05 = r11;
        this.A02 = r2;
        this.A08 = r17;
        this.A0J = r16;
        this.A0D = r6;
        this.A0H = r13;
        this.A04 = r9;
        this.A0G = r10;
        this.A0F = r8;
        this.A0I = r14;
        this.A06 = r12;
        this.A0E = r7;
        this.A03 = r4;
        this.A0A = runnable;
        this.A0L = runnable2;
        this.A09 = r19;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r1 == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r2 != false) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3BC A05(X.AnonymousClass141 r10, int r11, boolean r12) {
        /*
            r9 = this;
            com.whatsapp.jid.UserJid r1 = X.C36391kE.A0i(r10)
            if (r1 == 0) goto L_0x00aa
            boolean r0 = r10.A0C()
            if (r0 == 0) goto L_0x00aa
            X.185 r0 = r9.A04
            boolean r8 = r0.A04(r1)
        L_0x0012:
            boolean r7 = X.C36431kI.A1W(r10)
            X.1NG r0 = r9.A0D
            boolean r1 = X.C36331k8.A1Y(r0, r10)
            X.0yC r6 = r9.A07
            boolean r0 = X.C36421kH.A1Z(r6)
            r5 = 1
            r3 = 0
            if (r12 == 0) goto L_0x00ad
            if (r8 != 0) goto L_0x00a7
            if (r0 != 0) goto L_0x00a7
            r4 = 2131895166(0x7f12237e, float:1.9425157E38)
            if (r1 != 0) goto L_0x007d
        L_0x002f:
            r4 = 2131886885(0x7f120325, float:1.9408361E38)
            if (r8 == 0) goto L_0x007d
            r6 = 2131887261(0x7f12049d, float:1.9409124E38)
        L_0x0037:
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x003e
            r6 = 2131895086(0x7f12232e, float:1.9424995E38)
        L_0x003e:
            if (r11 == 0) goto L_0x0041
            r5 = 0
        L_0x0041:
            X.0wQ r0 = r9.A0C
            boolean r2 = r0.A0L()
            X.3FL r1 = new X.3FL
            r1.<init>()
            int r0 = X.C36381kD.A09(r5)
            r1.A0B = r0
            if (r8 != 0) goto L_0x005a
            if (r7 != 0) goto L_0x005a
            r0 = 8
            if (r2 == 0) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            r1.A0A = r0
            r1.A02 = r3
            if (r8 != 0) goto L_0x007a
            if (r7 != 0) goto L_0x007a
            if (r2 != 0) goto L_0x007a
        L_0x0065:
            r1.A00 = r3
            r1.A07 = r6
            r1.A01 = r4
            r0 = 2131887154(0x7f120432, float:1.9408907E38)
            r1.A09 = r0
            r0 = 2131891674(0x7f1215da, float:1.9418075E38)
            r1.A08 = r0
            X.3BC r0 = r1.A00()
            return r0
        L_0x007a:
            r3 = 8
            goto L_0x0065
        L_0x007d:
            int r2 = r10.A08
            r1 = 5263(0x148f, float:7.375E-42)
            if (r2 == r5) goto L_0x009a
            r0 = 2
            if (r2 == r0) goto L_0x009a
            r0 = 3
            if (r2 == r0) goto L_0x0096
            boolean r0 = r6.A0E(r1)
            r6 = 2131894054(0x7f121f26, float:1.9422902E38)
            if (r0 == 0) goto L_0x0037
            r6 = 2131889632(0x7f120de0, float:1.9413933E38)
            goto L_0x0037
        L_0x0096:
            r6 = 2131894055(0x7f121f27, float:1.9422904E38)
            goto L_0x0037
        L_0x009a:
            boolean r0 = r6.A0E(r1)
            r6 = 2131894056(0x7f121f28, float:1.9422906E38)
            if (r0 == 0) goto L_0x0037
            r6 = 2131889633(0x7f120de1, float:1.9413935E38)
            goto L_0x0037
        L_0x00a7:
            if (r1 != 0) goto L_0x00ad
            goto L_0x002f
        L_0x00aa:
            r8 = 0
            goto L_0x0012
        L_0x00ad:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65053Qn.A05(X.141, int, boolean):X.3BC");
    }
}
