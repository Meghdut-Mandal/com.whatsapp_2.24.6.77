package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilDyiReportActivity;
import com.whatsapp.payments.ui.P2mLiteDyiReportActivity;

/* renamed from: X.8ha  reason: invalid class name and case insensitive filesystem */
public abstract class C178798ha extends C173908Tp {
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public C32691e2 A03;
    public WaImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public C18820ts A08;
    public C20310xM A09;
    public C29221Vu A0A;
    public C24601Db A0B;
    public C29121Vk A0C;
    public C202939my A0D;
    public AnonymousClass1XA A0E;
    public AnonymousClass1EU A0F;
    public C200049gU A0G;
    public C201469jf A0H;
    public AnonymousClass6VG A0I;
    public C200959iX A0J;
    public C196039Xk A0K;
    public C180358ld A0L;
    public C29131Vl A0M;
    public C20380xT A0N;
    public String A0O;
    public String A0P = "";
    public boolean A0Q;
    public TextEmojiLabel A0R;
    public WaTextView A0S;
    public WaTextView A0T;
    public C207949xN A0U;
    public String A0V = "";

    public void A3i(int i, int i2) {
        AnonymousClass0FM A012;
        int i3 = i;
        if (this instanceof P2mLiteDyiReportActivity) {
            A012 = this.A0D.A04(this, (DialogInterface.OnDismissListener) null, (DialogInterface.OnDismissListener) null, i);
            if (A012 == null) {
                return;
            }
        } else {
            BrazilDyiReportActivity brazilDyiReportActivity = (BrazilDyiReportActivity) this;
            if (i == 477) {
                String string = brazilDyiReportActivity.getString(R.string.f12nameremoved);
                String string2 = brazilDyiReportActivity.getString(R.string.f12nameremoved);
                C39001qm A002 = AnonymousClass3LW.A00(brazilDyiReportActivity);
                A002.A0q(string);
                C39001qm.A0A(A002, string2);
                A012 = A002.create();
                A012.setOnDismissListener((DialogInterface.OnDismissListener) null);
            } else {
                A012 = brazilDyiReportActivity.A01.A01(brazilDyiReportActivity, brazilDyiReportActivity.A0D, brazilDyiReportActivity.A02, i3, i2);
            }
        }
        A012.show();
    }

    public void A3j(String str) {
        C180358ld r3 = this.A0L;
        r3.A0V(new AnonymousClass9SB((AnonymousClass155) null, (PinBottomSheetDialogFragment) null, r3, (String) null, -1), (C203399nx) null, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.text.SpannableString} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02af  */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r7 = r27
            r13 = r28
            super.onCreate(r13)
            r0 = 2131624854(0x7f0e0396, float:1.88769E38)
            r7.setContentView((int) r0)
            r0 = 2131100523(0x7f06036b, float:1.781343E38)
            int r12 = X.AnonymousClass00F.A00(r7, r0)
            r0 = 2131432387(0x7f0b13c3, float:1.848653E38)
            android.view.View r0 = r7.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            X.07B r2 = X.C36431kI.A0Q(r7, r0)
            r1 = 1
            if (r2 == 0) goto L_0x0030
            r0 = 2131888945(0x7f120b31, float:1.941254E38)
            r2.A0I(r0)
            r2.A0U(r1)
            X.C165607th.A17(r7, r2, r12)
        L_0x0030:
            android.content.Intent r3 = r7.getIntent()
            if (r3 == 0) goto L_0x005c
            android.os.Bundle r0 = r3.getExtras()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0105
            android.os.Bundle r1 = r3.getExtras()
            java.lang.String r0 = "extra_paymentProvider"
            java.lang.String r0 = r1.getString(r0, r2)
        L_0x0048:
            r7.A0V = r0
            android.os.Bundle r0 = r3.getExtras()
            if (r0 == 0) goto L_0x0101
            android.os.Bundle r1 = r3.getExtras()
            java.lang.String r0 = "extra_paymentAccountType"
            java.lang.String r0 = r1.getString(r0, r2)
        L_0x005a:
            r7.A0O = r0
        L_0x005c:
            r0 = 2131429728(0x7f0b0960, float:1.8481137E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36421kH.A0I(r7, r0)
            r7.A0R = r1
            X.0yC r0 = r7.A0D
            X.C36331k8.A1A(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r7.A0R
            X.0yb r0 = r7.A08
            X.C36331k8.A16(r1, r0)
            X.0xT r0 = r7.A0N
            java.lang.String r3 = "payments"
            java.lang.String r1 = "how-to-request-your-payments-account-information-br"
            r0.A04(r3, r1)
            com.whatsapp.TextEmojiLabel r11 = r7.A0R
            java.lang.String r2 = r7.A0O
            java.lang.String r10 = "business"
            boolean r0 = r2.equals(r10)
            if (r0 != 0) goto L_0x0122
            java.lang.String r0 = "personal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0112
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.P2mLiteDyiReportActivity
            if (r0 == 0) goto L_0x00f6
            X.0yC r1 = r7.A0D
            r0 = 2759(0xac7, float:3.866E-42)
            java.lang.String r2 = X.C36431kI.A19(r1, r0)
        L_0x009a:
            r1 = 2131892510(0x7f12191e, float:1.941977E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            r9 = 0
            java.lang.String r0 = X.C36391kE.A0v(r7, r2, r0, r9, r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r8 = X.C36441kJ.A0P(r0)
            int r1 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r6 = r8.getSpans(r9, r1, r0)
            android.text.style.URLSpan[] r6 = (android.text.style.URLSpan[]) r6
            if (r6 == 0) goto L_0x012e
            int r5 = r6.length
            r4 = 0
        L_0x00be:
            if (r4 >= r5) goto L_0x0108
            r15 = r6[r4]
            int r3 = r8.getSpanStart(r15)
            int r2 = r8.getSpanEnd(r15)
            int r1 = r8.getSpanFlags(r15)
            X.17Y r0 = r7.A05
            r18 = r0
            X.0yb r14 = r7.A08
            X.1e2 r0 = r7.A03
            java.lang.String r20 = r15.getURL()
            X.21s r15 = new X.21s
            r16 = r7
            r17 = r0
            r19 = r14
            r15.<init>(r16, r17, r18, r19, r20)
            r8.setSpan(r15, r3, r2, r1)
            r14 = 2132083562(0x7f15036a, float:1.980727E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r7, r14)
            r8.setSpan(r0, r3, r2, r1)
            int r4 = r4 + 1
            goto L_0x00be
        L_0x00f6:
            X.0xT r0 = r7.A0N
            android.net.Uri r0 = r0.A04(r3, r1)
            java.lang.String r2 = r0.toString()
            goto L_0x009a
        L_0x0101:
            java.lang.String r0 = "personal"
            goto L_0x005a
        L_0x0105:
            r0 = r2
            goto L_0x0048
        L_0x0108:
            if (r9 >= r5) goto L_0x012e
            r0 = r6[r9]
            r8.removeSpan(r0)
            int r9 = r9 + 1
            goto L_0x0108
        L_0x0112:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDyiHeaderText - this payment account type is not supported. Payment account type = "
            X.C36321k7.A1P(r0, r2, r1)
            java.lang.String r0 = "Invalid payment account type"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x0122:
            r0 = 2131892357(0x7f121885, float:1.941946E38)
            java.lang.String r0 = r7.getString(r0)
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r0)
        L_0x012e:
            r11.setText(r8)
            r0 = 2131429729(0x7f0b0961, float:1.8481139E38)
            android.view.View r3 = r7.findViewById(r0)
            com.whatsapp.WaTextView r3 = (com.whatsapp.WaTextView) r3
            r7.A0T = r3
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.P2mLiteDyiReportActivity
            if (r0 != 0) goto L_0x02c0
            java.lang.String r2 = r7.A0O
            boolean r0 = r2.equals(r10)
            if (r0 != 0) goto L_0x02b4
            java.lang.String r0 = "personal"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x02b9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDefaultReportFooterHeaderTextRes - this payment account type is not supported. Payment account type = "
            X.C36321k7.A1P(r0, r2, r1)
            r1 = -1
        L_0x015a:
            r3.setText(r1)
            r0 = 2131429727(0x7f0b095f, float:1.8481135E38)
            android.view.View r1 = r7.findViewById(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r7.A0S = r1
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.BrazilDyiReportActivity
            if (r0 == 0) goto L_0x02af
            r0 = 2131892504(0x7f121918, float:1.9419758E38)
        L_0x016f:
            r1.setText(r0)
            r0 = 2131429726(0x7f0b095e, float:1.8481133E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A07 = r0
            r0 = 2131429723(0x7f0b095b, float:1.8481127E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r7.A04 = r0
            X.AnonymousClass3UF.A0E(r0, r12)
            r0 = 2131429724(0x7f0b095c, float:1.8481129E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A06 = r0
            r0 = 2131430470(0x7f0b0c46, float:1.8482642E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A05 = r0
            r0 = 2131429722(0x7f0b095a, float:1.8481125E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.A02 = r0
            r0 = 2131429725(0x7f0b095d, float:1.848113E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.A01 = r0
            r0 = 2131429462(0x7f0b0856, float:1.8480597E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.A00 = r0
            if (r28 == 0) goto L_0x01cb
            java.lang.String r0 = "random_password"
            java.lang.String r9 = r13.getString(r0)
            r12 = 0
            if (r9 != 0) goto L_0x01e9
        L_0x01cb:
            r12 = 1
            r6 = 20
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            r4 = 0
        L_0x01d3:
            double r2 = java.lang.Math.random()
            r0 = 62
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = (int) r2
            java.lang.String r0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            X.C90514aH.A1R(r0, r5, r1)
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x01d3
            java.lang.String r9 = r5.toString()
        L_0x01e9:
            r7.A0P = r9
            r0 = 1
            r7.A0Q = r0
            X.0wo r15 = r7.A07
            X.17Y r14 = r7.A05
            X.0wU r8 = r7.A04
            X.9jf r6 = r7.A0H
            X.9iX r5 = r7.A0J
            X.1Vl r11 = r7.A0M
            X.1EU r10 = r7.A0F
            X.0xM r4 = r7.A09
            X.1Db r3 = r7.A0B
            X.1Vk r2 = r7.A0C
            X.1XA r0 = r7.A0E
            X.1Vu r1 = r7.A0A
            X.9XR r16 = new X.9XR
            r17 = r7
            r18 = r14
            r19 = r4
            r20 = r1
            r21 = r3
            r22 = r2
            r23 = r0
            r24 = r10
            r25 = r11
            r26 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.9Xk r4 = r7.A0K
            X.9gU r0 = r7.A0G
            java.lang.String r23 = "DYI-REPORT"
            X.9SR r17 = new X.9SR
            r18 = r7
            r19 = r14
            r21 = r2
            r22 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.6VG r3 = r7.A0I
            X.9gU r2 = r7.A0G
            java.lang.String r1 = r7.A0O
            boolean r0 = r7.A0Q
            X.9xN r13 = new X.9xN
            r20 = r3
            r21 = r5
            r22 = r4
            r23 = r8
            r24 = r9
            r25 = r1
            r26 = r0
            r18 = r2
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r7.A0U = r13
            X.04H r1 = X.C165617ti.A0A(r13, r7)
            java.lang.Class<X.8ld> r0 = X.C180358ld.class
            X.04R r0 = r1.A00(r0)
            X.8ld r0 = (X.C180358ld) r0
            r7.A0L = r0
            X.00s r1 = r0.A03
            r0 = 16
            X.BA9.A00(r7, r1, r0)
            X.8ld r0 = r7.A0L
            X.00s r1 = r0.A03
            r0 = 15
            X.BA9.A00(r7, r1, r0)
            X.8ld r0 = r7.A0L
            X.00s r1 = r0.A00
            r0 = 18
            X.BA9.A00(r7, r1, r0)
            X.8ld r0 = r7.A0L
            X.00s r1 = r0.A02
            r0 = 19
            X.BA9.A00(r7, r1, r0)
            X.8ld r0 = r7.A0L
            X.00s r1 = r0.A01
            r0 = 17
            X.BA9.A00(r7, r1, r0)
            X.8ld r0 = r7.A0L
            X.00s r2 = r0.A00
            r1 = 25
            X.3Ug r0 = new X.3Ug
            r0.<init>(r7, r1)
            r2.A08(r7, r0)
            X.8ld r8 = r7.A0L
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x02a9
            if (r12 == 0) goto L_0x02a9
            X.9jf r1 = r8.A06
            java.lang.String r0 = r8.A08
            r1.A04(r0)
        L_0x02a9:
            X.9jf r5 = r8.A06
            java.lang.String r6 = r8.A08
            monitor-enter(r5)
            goto L_0x02c5
        L_0x02af:
            r0 = 2131892508(0x7f12191c, float:1.9419766E38)
            goto L_0x016f
        L_0x02b4:
            r1 = 2131892354(0x7f121882, float:1.9419454E38)
            goto L_0x015a
        L_0x02b9:
            boolean r0 = r7.A0Q
            r1 = 2131892505(0x7f121919, float:1.941976E38)
            if (r0 == 0) goto L_0x015a
        L_0x02c0:
            r1 = 2131892509(0x7f12191d, float:1.9419768E38)
            goto L_0x015a
        L_0x02c5:
            int r2 = r5.A02(r6)     // Catch:{ all -> 0x0389 }
            if (r2 < 0) goto L_0x0358
            r0 = 4
            if (r2 > r0) goto L_0x0358
            r9 = 2
            if (r2 != r0) goto L_0x02ed
            X.0y0 r0 = r5.A02     // Catch:{ all -> 0x0389 }
            java.io.File r0 = r0.A0Q(r6)     // Catch:{ all -> 0x0389 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0389 }
            if (r0 != 0) goto L_0x02fa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = "dyiReportManager/validate-state/report-media-file-missing for account type = "
            X.C36321k7.A1P(r0, r6, r1)     // Catch:{ all -> 0x0389 }
            X.1Db r0 = r5.A08     // Catch:{ all -> 0x0389 }
            r0.A0F(r9, r6)     // Catch:{ all -> 0x0389 }
            goto L_0x036e
        L_0x02ed:
            if (r2 != r9) goto L_0x02f0
            goto L_0x02f4
        L_0x02f0:
            r0 = 3
            if (r2 != r0) goto L_0x02fa
            goto L_0x0312
        L_0x02f4:
            X.9KY r0 = r5.A03(r6)     // Catch:{ all -> 0x0389 }
            if (r0 == 0) goto L_0x0318
        L_0x02fa:
            X.1Db r0 = r5.A08     // Catch:{ all -> 0x0389 }
            android.content.SharedPreferences r1 = r0.A03()     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = "personal"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0389 }
            if (r0 == 0) goto L_0x030f
            java.lang.String r0 = "payment_dyi_report_expiration_timestamp"
        L_0x030a:
            long r3 = X.C36371kC.A08(r1, r0)     // Catch:{ all -> 0x0389 }
            goto L_0x0327
        L_0x030f:
            java.lang.String r0 = "business_payment_dyi_report_expiration_timestamp"
            goto L_0x030a
        L_0x0312:
            X.9KY r0 = r5.A03(r6)     // Catch:{ all -> 0x0389 }
            if (r0 != 0) goto L_0x02fa
        L_0x0318:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = "dyiReportManager/validate-state/report-message-missing for account type = "
            X.C36321k7.A1P(r0, r6, r1)     // Catch:{ all -> 0x0389 }
            X.1Db r0 = r5.A08     // Catch:{ all -> 0x0389 }
            r0.A0J(r6)     // Catch:{ all -> 0x0389 }
            goto L_0x036e
        L_0x0327:
            if (r2 != r9) goto L_0x036e
            X.0wo r9 = r5.A04     // Catch:{ all -> 0x0389 }
            long r1 = X.C19970wo.A00(r9)     // Catch:{ all -> 0x0389 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x036e
            long r1 = X.C19970wo.A00(r9)     // Catch:{ all -> 0x0389 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x036e
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = "dyiReportManager/validate-state/report-too-old for account type = "
            r9.append(r0)     // Catch:{ all -> 0x0389 }
            r9.append(r6)     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = ", current:"
            r9.append(r0)     // Catch:{ all -> 0x0389 }
            r9.append(r1)     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = " expired:"
            X.C36321k7.A1V(r0, r9, r3)     // Catch:{ all -> 0x0389 }
            r5.A04(r6)     // Catch:{ all -> 0x0389 }
            goto L_0x036e
        L_0x0358:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = "dyiReportManager/validate-state/wrong-state for account type = "
            r1.append(r0)     // Catch:{ all -> 0x0389 }
            r1.append(r6)     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = ", state = "
            X.C36321k7.A1S(r0, r1, r2)     // Catch:{ all -> 0x0389 }
            X.1Db r0 = r5.A08     // Catch:{ all -> 0x0389 }
            r0.A0J(r6)     // Catch:{ all -> 0x0389 }
        L_0x036e:
            monitor-exit(r5)
            X.00s r1 = r8.A02
            int r0 = r5.A02(r6)
            X.C36341k9.A17(r1, r0)
            X.00s r1 = r8.A01
            X.9KY r0 = r5.A03(r6)
            r1.A0C(r0)
            android.widget.FrameLayout r1 = r7.A01
            r0 = 46
            X.C48752hz.A00(r1, r7, r0)
            return
        L_0x0389:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178798ha.onCreate(android.os.Bundle):void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.A0P;
        if (str != null) {
            bundle.putString("random_password", str);
        }
    }
}
