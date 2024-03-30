package X;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Yz  reason: invalid class name and case insensitive filesystem */
public class C174928Yz extends AnonymousClass2IR {
    public int A00;
    public C19460v5 A01;
    public C61913Dz A02;
    public C26421Kc A03;
    public AnonymousClass1NV A04;
    public AnonymousClass1Pp A05;
    public AnonymousClass3QX A06;
    public C65383Rv A07;
    public C20430xY A08;
    public C50172kK A09;
    public AnonymousClass3TU A0A;
    public C62163Fa A0B;
    public C21010yW A0C;
    public C223313w A0D;
    public C32811eE A0E;
    public AnonymousClass1EM A0F;
    public C230116v A0G;
    public AnonymousClass1KI A0H;
    public AnonymousClass005 A0I;
    public String A0J;
    public C65643Sx A0K;
    public boolean A0L = false;
    public boolean A0M;
    public AnonymousClass28m A0N;
    public boolean A0O;
    public final ImageView A0P;
    public final LinearLayout A0Q;
    public final TextView A0R;
    public final TextView A0S;
    public final TextView A0T;
    public final TextView A0U;
    public final TextView A0V;
    public final AnonymousClass1RY A0W;
    public final AnonymousClass1RJ A0X;
    public final AnonymousClass1RJ A0Y;
    public final C88974Ut A0Z;
    public final ArrayList A0a = AnonymousClass001.A0I();
    public final ArrayList A0b = AnonymousClass001.A0I();
    public final AnonymousClass2XJ A0c;

    public static boolean A0E(C174928Yz r6, C65643Sx r7) {
        boolean z;
        if (r7 != null) {
            List list = r7.A06;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (r6.A0T.A0M(((C607439e) it.next()).A01)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (list.size() > 0 && !z) {
                    return true;
                }
            }
            List<AnonymousClass3A9> list2 = r7.A03;
            if (list2 != null) {
                for (AnonymousClass3A9 r0 : list2) {
                    if (r0.A01 == ContactsContract.CommonDataKinds.Email.class) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a2, code lost:
        if (r0.A04 == false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B() {
        /*
            r22 = this;
            r9 = r22
            X.3T1 r15 = r9.getFMessage()
            android.widget.TextView r1 = r9.A0V
            X.3Qa r0 = r15.A1J
            r1.setTag(r0)
            X.28m r1 = r9.A0N
            if (r1 == 0) goto L_0x0016
            X.2XJ r0 = r9.A0c
            r0.A07(r1)
        L_0x0016:
            X.2XJ r0 = r9.A0c
            java.lang.Runnable r2 = r0.A02(r15)
            X.28m r2 = (X.AnonymousClass28m) r2
            r9.A0N = r2
            r0 = 3
            X.B9p r1 = new X.B9p
            r1.<init>(r9, r0)
            X.17Y r0 = r9.A0R
            java.util.concurrent.Executor r0 = r0.A04
            r2.A0B(r1, r0)
            android.content.Context r0 = r9.getContext()
            java.lang.String r0 = X.AnonymousClass3RN.A01(r0, r15)
            r9.A0C(r0)
            X.1Pp r2 = r9.A05
            android.widget.ImageView r1 = r9.A0P
            r0 = 2131231033(0x7f080139, float:1.8078136E38)
            r2.A06(r1, r0)
            r0 = 1024(0x400, float:1.435E-42)
            boolean r1 = r15.A1T(r0)
            r0 = 2131435344(0x7f0b1f50, float:1.8492528E38)
            if (r1 == 0) goto L_0x00c1
            android.view.ViewGroup r4 = X.C36411kG.A0P(r9, r0)
            if (r4 == 0) goto L_0x00c0
            X.0yC r1 = r9.A0G
            X.1DU r0 = r9.A1U
            X.3Rh r0 = X.C65243Rh.A00(r1, r0, r15)
            r1 = 0
            r4.setVisibility(r1)
            X.3TU r1 = r9.A0A
            if (r1 != 0) goto L_0x0099
            android.content.Context r6 = r9.getContext()
            X.4Ux r10 = r9.A0d
            X.1e2 r7 = r9.A0S
            X.1EM r13 = r9.A0F
            X.1e6 r11 = r9.A1H
            X.1SV r14 = r9.A1y
            X.39u r8 = r9.A1S()
            X.0v5 r2 = r9.A01
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x0080
            r2.A02()
        L_0x0080:
            X.0yC r12 = r9.A0G
            X.3TU r5 = new X.3TU
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r9.A0A = r5
            com.whatsapp.webpagepreview.WebPagePreviewView r3 = r5.A0A
            r2 = -1
            r1 = -2
            r4.addView(r3, r2, r1)
            X.3TU r1 = r9.A0A
            com.whatsapp.webpagepreview.WebPagePreviewView r2 = r1.A0A
            android.view.View$OnLongClickListener r1 = r9.A2W
            r2.setOnLongClickListener(r1)
        L_0x0099:
            X.4Ut r3 = r9.A0Z
            boolean r1 = r3 instanceof X.C1491570b
            if (r1 == 0) goto L_0x00a4
            boolean r1 = r0.A04
            r2 = 1
            if (r1 != 0) goto L_0x00a5
        L_0x00a4:
            r2 = 0
        L_0x00a5:
            r9.A0M = r2
            X.3TU r14 = r9.A0A
            X.3Fa r1 = r9.A0B
            boolean r19 = r1.A00(r15)
            X.3Fa r1 = r9.A0B
            boolean r20 = r1.A01(r15)
            r21 = 0
            r17 = r0
            r18 = r2
            r16 = r3
            r14.A04(r15, r16, r17, r18, r19, r20, r21)
        L_0x00c0:
            return
        L_0x00c1:
            android.view.ViewGroup r1 = X.C36411kG.A0P(r9, r0)
            if (r1 == 0) goto L_0x00c0
            X.3TU r0 = r9.A0A
            if (r0 == 0) goto L_0x00d3
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0A
            r1.removeView(r0)
            r0 = 0
            r9.A0A = r0
        L_0x00d3:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174928Yz.A0B():void");
    }

    private void A0C(String str) {
        CharSequence A022;
        String A0C2 = AnonymousClass14B.A0C(str, 128);
        Context context = getContext();
        TextView textView = this.A0V;
        TextPaint paint = textView.getPaint();
        AnonymousClass1H2 r1 = this.A1M;
        if (A0C2 == null) {
            A022 = null;
        } else {
            A022 = AnonymousClass3UG.A02(context, paint, new C74233lH(), r1, A0C2);
        }
        C175108Zr.A0t(textView, this, A022);
    }

    private boolean A0D() {
        List list;
        this.A26.get();
        C65643Sx r0 = this.A0K;
        if (r0 == null || (list = r0.A06) == null || list.size() != 1 || list.get(0) == null) {
            return false;
        }
        return C197029b1.A00(((C607439e) list.get(0)).A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r1.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C223313w getLidUserJid() {
        /*
            r3 = this;
            X.3Sx r1 = r3.A0K
            java.util.List r0 = r1.A06
            if (r0 != 0) goto L_0x0014
            X.35z r2 = r1.A09
            X.13w r1 = r2.A00
            if (r1 == 0) goto L_0x0014
            r0 = 1
            r3.A0L = r0
            java.lang.String r0 = r2.A01
            r3.A0J = r0
            return r1
        L_0x0014:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174928Yz.getLidUserJid():X.13w");
    }

    public void A16() {
        if (!this.A0O) {
            this.A0O = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r1 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r1, A0n, this);
            C18830tt r3 = r1.A00;
            C175108Zr.A0y(r1, r3, r3, this);
            C175108Zr.A11(r1, this);
            C175108Zr.A14(r1, this, C165597tg.A0h(r1));
            C175108Zr.A12(r1, this);
            C175108Zr.A10(r1, r3, this, C175108Zr.A0q(r1));
            C175108Zr.A13(r1, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r1, r3, this, C165577te.A0U(r1));
            C175108Zr.A0v(A0k, r1, r3, this, C175108Zr.A0o(r1, this));
            C175108Zr.A0w(A0m, r1, r3, this);
            C175108Zr.A0z(r1, r3, A0n, this, C175108Zr.A0p(r3));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r1, r3, A0n, this);
            this.A02 = (C61913Dz) r3.A75.get();
            this.A05 = C36361kB.A0V(r1);
            this.A06 = (AnonymousClass3QX) r3.ACH.get();
            this.A0E = (C32811eE) r1.A0F.get();
            this.A08 = (C20430xY) r1.A2H.get();
            this.A07 = (C65383Rv) r3.A2M.get();
            this.A0B = (C62163Fa) r3.A5p.get();
            this.A0G = (C230116v) r1.A4P.get();
            this.A03 = (C26421Kc) r1.A1A.get();
            this.A0I = C18840tu.A00(r1.ACI);
            this.A01 = A0k;
            this.A0C = C36351kA.A0g(r1);
            this.A04 = C18800tq.A48(r1);
            this.A0H = (AnonymousClass1KI) r1.A0r.get();
            this.A0F = C36371kC.A0l(r1);
        }
    }

    public boolean A1K() {
        return this.A0d.BtQ();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (A0D() != false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0292  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A2E(X.C607139b r29) {
        /*
            r28 = this;
            r9 = r29
            X.3T1 r2 = r9.A01
            X.3Qa r3 = r2.A1J
            r8 = r28
            android.widget.TextView r10 = r8.A0V
            java.lang.Object r0 = r10.getTag()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02df
            X.3Sx r0 = r9.A04
            r8.A0K = r0
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.A03()
            r8.A0C(r0)
        L_0x0021:
            X.3Sx r0 = r8.A0K
            r15 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0038
            X.3F9 r0 = r0.A0A
            java.lang.String r0 = r0.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0038
            boolean r0 = r8.A0D()
            r14 = 1
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            r14 = 0
        L_0x0039:
            r6 = 8
            if (r14 == 0) goto L_0x00b1
            android.widget.TextView r5 = r8.A0R
            r5.setVisibility(r7)
            r0 = 2131887259(0x7f12049b, float:1.940912E38)
            r5.setText(r0)
            X.3Sx r0 = r8.A0K
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.widget.TextView r1 = r8.A0T
            if (r0 != 0) goto L_0x00b9
            r1.setVisibility(r7)
            X.3Sx r0 = r8.A0K
            java.lang.String r0 = r0.A02
            r1.setText(r0)
        L_0x005e:
            X.3Sx r4 = r8.A0K
            if (r4 == 0) goto L_0x0069
            X.1RY r1 = r8.A0W
            android.widget.ImageView r0 = r8.A0P
            r1.A0C(r0, r4)
        L_0x0069:
            r8.A00 = r7
            java.util.ArrayList r4 = r8.A0a
            r4.clear()
            java.util.ArrayList r12 = r8.A0b
            r12.clear()
            X.3Sx r0 = r8.A0K
            r11 = 0
            if (r0 == 0) goto L_0x00bd
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x00bd
            java.util.Iterator r13 = r0.iterator()
        L_0x0082:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r1 = r13.next()
            X.39e r1 = (X.C607439e) r1
            java.lang.String r0 = r1.A02
            r12.add(r0)
            com.whatsapp.jid.UserJid r1 = r1.A01
            if (r1 == 0) goto L_0x00ad
            X.0wQ r0 = r8.A0T
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x00a3
            r4.add(r11)
            goto L_0x0082
        L_0x00a3:
            r4.add(r1)
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
            goto L_0x0082
        L_0x00ad:
            r4.add(r11)
            goto L_0x0082
        L_0x00b1:
            android.widget.TextView r0 = r8.A0T
            r0.setVisibility(r6)
            android.widget.TextView r1 = r8.A0R
            r5 = r1
        L_0x00b9:
            r1.setVisibility(r6)
            goto L_0x005e
        L_0x00bd:
            X.16v r0 = r8.A0G
            X.0yC r1 = r0.A01
            r0 = 3790(0xece, float:5.311E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00cf
            X.13w r0 = r8.getLidUserJid()
            r8.A0D = r0
        L_0x00cf:
            boolean r12 = r3.A02
            if (r12 != 0) goto L_0x02d2
            X.11F r3 = r3.A00
            boolean r0 = X.AnonymousClass143.A0G(r3)
            X.16D r1 = r8.A0l
            if (r0 == 0) goto L_0x02cb
            X.11F r0 = r2.A0J()
            X.141 r2 = X.C36441kJ.A0i(r1, r0)
            X.1C6 r0 = r8.A1u
            boolean r1 = r0.A06(r3)
            X.0xQ r0 = r8.A1Q
            X.147 r3 = (X.AnonymousClass147) r3
            X.17X r0 = r0.A0U
            boolean r0 = r0.A0H(r3)
            r0 = r0 ^ 1
            r1 = r1 & r0
        L_0x00f8:
            X.3IL r0 = r2.A0F
            if (r0 == 0) goto L_0x00fd
            r15 = 0
        L_0x00fd:
            r15 = r15 & r1
            X.1C6 r1 = r8.A1u
            X.11F r0 = X.C36331k8.A0G(r2)
            boolean r0 = r1.A06(r0)
            r15 = r15 & r0
        L_0x0109:
            r0 = 2131428395(0x7f0b042b, float:1.8478433E38)
            android.view.View r2 = r8.findViewById(r0)
            r0 = 2131428418(0x7f0b0442, float:1.847848E38)
            android.view.View r1 = r8.findViewById(r0)
            if (r15 != 0) goto L_0x02b4
            int r0 = r8.A00
            if (r0 > 0) goto L_0x02a2
            boolean r0 = r8.A0L
            if (r0 != 0) goto L_0x02a2
            X.3Sx r0 = r8.A0K
            boolean r0 = A0E(r8, r0)
            android.widget.TextView r3 = r8.A0U
            if (r0 == 0) goto L_0x029d
            r3.setVisibility(r7)
            r0 = 2131890571(0x7f12118b, float:1.9415838E38)
            r3.setText(r0)
            r0 = 43
            X.C48912iG.A00(r3, r8, r0)
        L_0x0139:
            if (r12 == 0) goto L_0x023e
            if (r14 == 0) goto L_0x0141
            int r0 = r8.A00
            if (r0 > 0) goto L_0x0278
        L_0x0141:
            r1.setVisibility(r6)
            android.widget.TextView r12 = r8.A0S
            r12.setVisibility(r6)
            X.1RJ r0 = r8.A0Y
            r0.A03(r6)
            android.widget.LinearLayout r11 = r8.A0Q
            r0 = 47
            X.C48912iG.A00(r11, r8, r0)
        L_0x0155:
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x0239
            int r0 = r12.getVisibility()
            if (r0 == 0) goto L_0x0239
            r2.setVisibility(r6)
        L_0x0164:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x02c6
            int r0 = r12.getVisibility()
            if (r0 != 0) goto L_0x02c6
            r1.setVisibility(r7)
        L_0x0173:
            java.lang.String r2 = r9.A02
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x022d
            java.lang.Object r0 = r4.get(r7)
            if (r0 == 0) goto L_0x022d
            boolean r0 = r8.A0D()
            if (r0 == 0) goto L_0x022d
            X.005 r0 = r8.A26
            java.lang.Object r15 = r0.get()
            X.005 r0 = r8.A25
            java.lang.Object r1 = r0.get()
            X.1K3 r1 = (X.AnonymousClass1K3) r1
            X.005 r0 = r8.A0I
            java.lang.Object r14 = r0.get()
            java.lang.Object r16 = r4.get(r7)
            android.content.Context r9 = r8.getContext()
            java.lang.Class<X.14u> r0 = X.C225314u.class
            android.app.Activity r18 = X.C18860tw.A01(r9, r0)
            X.0wU r12 = r8.A21
            X.0yW r11 = r8.A0C
            r9 = 45
            X.2iG r0 = new X.2iG
            r0.<init>(r8, r9)
            X.3Yp r13 = new X.3Yp
            r21 = 0
            r19 = r12
            r20 = r11
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = 44
            X.2iG r9 = new X.2iG
            r9.<init>(r8, r0)
            X.3Yp r0 = new X.3Yp
            r27 = 0
            r19 = r0
            r20 = r14
            r21 = r15
            r22 = r16
            r23 = r9
            r24 = r18
            r25 = r12
            r26 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r3.setOnClickListener(r0)
            android.widget.LinearLayout r0 = r8.A0Q
            r0.setOnClickListener(r13)
            r10.setText(r2)
            r5.setVisibility(r7)
            r0 = 2131887022(0x7f1203ae, float:1.940864E38)
            r5.setText(r0)
            r2 = 2131099941(0x7f060125, float:1.781225E38)
            r0 = 1
            r1.B1X(r5, r2, r0)
            X.1RJ r0 = r8.A0X
            android.view.View r0 = X.C36391kE.A0L(r0, r7)
            r0.setOnClickListener(r13)
        L_0x0203:
            X.3Sx r2 = r8.A0K
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x02df
            java.lang.Object r0 = r4.get(r7)
            if (r0 == 0) goto L_0x02df
            X.0yC r0 = r8.A0G
            boolean r0 = X.C55942vR.A00(r0)
            if (r0 == 0) goto L_0x02df
            if (r2 == 0) goto L_0x02df
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "3p_full"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02d5
            X.3F9 r0 = r2.A0A
            java.lang.String r0 = r0.A08
            r8.setupViewIfThirdPartyBotContact(r0)
            return
        L_0x022d:
            X.1RJ r1 = r8.A0X
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x0203
            r1.A03(r6)
            goto L_0x0203
        L_0x0239:
            r2.setVisibility(r7)
            goto L_0x0164
        L_0x023e:
            if (r14 != 0) goto L_0x0278
            X.0wQ r0 = r8.A0T
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x026f
            boolean r0 = r8.A0D()
            if (r0 != 0) goto L_0x026f
            r1.setVisibility(r7)
            android.widget.TextView r12 = r8.A0S
            r12.setVisibility(r7)
            r0 = 2131886386(0x7f120132, float:1.940735E38)
            r12.setText(r0)
            r0 = 42
            X.C48912iG.A00(r12, r8, r0)
        L_0x0261:
            android.widget.LinearLayout r11 = r8.A0Q
            r0 = 47
            X.C48912iG.A00(r11, r8, r0)
        L_0x0268:
            X.1RJ r0 = r8.A0Y
            r0.A03(r6)
            goto L_0x0155
        L_0x026f:
            r1.setVisibility(r6)
            android.widget.TextView r12 = r8.A0S
            r12.setVisibility(r6)
            goto L_0x0261
        L_0x0278:
            r1.setVisibility(r6)
            int r0 = r8.A00
            if (r0 <= 0) goto L_0x0292
            android.widget.TextView r12 = r8.A0S
            r12.setVisibility(r6)
            android.widget.LinearLayout r11 = r8.A0Q
            r0 = 46
            X.C48912iG.A00(r11, r8, r0)
            X.1RJ r0 = r8.A0Y
            r0.A03(r7)
            goto L_0x0155
        L_0x0292:
            android.widget.LinearLayout r0 = r8.A0Q
            r0.setOnClickListener(r11)
            android.widget.TextView r12 = r8.A0S
            r12.setVisibility(r6)
            goto L_0x0268
        L_0x029d:
            r3.setVisibility(r6)
            goto L_0x0139
        L_0x02a2:
            android.widget.TextView r3 = r8.A0U
            r3.setVisibility(r7)
            r0 = 2131894032(0x7f121f10, float:1.9422857E38)
            r3.setText(r0)
            r0 = 44
            X.C48912iG.A00(r3, r8, r0)
            goto L_0x0139
        L_0x02b4:
            android.widget.TextView r3 = r8.A0U
            r3.setVisibility(r6)
            android.widget.TextView r0 = r8.A0S
            r0.setVisibility(r6)
            X.1RJ r0 = r8.A0Y
            r0.A03(r6)
            r2.setVisibility(r6)
        L_0x02c6:
            r1.setVisibility(r6)
            goto L_0x0173
        L_0x02cb:
            X.141 r2 = X.C36441kJ.A0i(r1, r3)
            r1 = 1
            goto L_0x00f8
        L_0x02d2:
            r15 = 0
            goto L_0x0109
        L_0x02d5:
            X.0wU r1 = r8.A21
            X.3v4 r0 = new X.3v4
            r0.<init>(r8, r6)
            r1.Boy(r0)
        L_0x02df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174928Yz.A2E(X.39b):void");
    }

    public int getMainChildMaxWidth() {
        if (this.A0d.BLu(getFMessage())) {
            return 0;
        }
        int A0h = C175108Zr.A0h(this);
        if (this.A0M) {
            return Math.min(A0h, AnonymousClass3R4.A01(getContext(), 72));
        }
        return A0h;
    }

    public void onDetachedFromWindow() {
        C50172kK r1 = this.A09;
        if (r1 != null) {
            r1.A0D(true);
            this.A09 = null;
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.C131806Qs.A02(r3) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.AnonymousClass3T1 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.AnonymousClass2bX
            if (r0 != 0) goto L_0x000b
            boolean r1 = X.C131806Qs.A02(r3)
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C18740tg.A0C(r0)
            r2.A0K = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174928Yz.setFMessage(X.3T1):void");
    }

    public C174928Yz(Context context, AnonymousClass1RY r5, C89004Uw r6, AnonymousClass3T1 r7, AnonymousClass2XJ r8) {
        super(context, r6, r7);
        A16();
        this.A0W = r5;
        this.A0c = r8;
        this.A0V = C36391kE.A0P(this, R.id.vcard_text);
        this.A0R = C36391kE.A0P(this, R.id.account_type);
        this.A0T = C36391kE.A0P(this, R.id.description);
        this.A0P = C36391kE.A0N(this, R.id.picture);
        this.A0U = C36391kE.A0P(this, R.id.msg_contact_btn);
        this.A0S = C36391kE.A0P(this, R.id.action_contact_btn);
        this.A0X = C36341k9.A0X(this, R.id.action_view_ai_container);
        AnonymousClass1RJ A0X2 = C36341k9.A0X(this, R.id.action_view_business_container);
        this.A0Y = A0X2;
        A0X2.A07(new AnonymousClass4ZP((Object) this, 1));
        LinearLayout A0U2 = C36441kJ.A0U(this, R.id.contact_card);
        this.A0Q = A0U2;
        A0U2.setOnLongClickListener(this.A2W);
        this.A0Z = C65853Ts.A01(context);
        A0B();
    }

    private void setupViewIfThirdPartyBotContact(String str) {
        TextView A0P2;
        int color = getResources().getColor(R.color.f6nameremoved);
        C48912iG r5 = new C48912iG(this, 46);
        TextView textView = this.A0U;
        C66953Xy.A00(textView, this, 29);
        textView.setTextColor(color);
        TextView textView2 = this.A0V;
        textView2.setText(str);
        C36351kA.A15(getResources(), textView2, R.color.f6nameremoved);
        TextView textView3 = this.A0R;
        textView3.setVisibility(0);
        textView3.setText(R.string.f12nameremoved);
        AnonymousClass3YF.A00(this.A0Q, this, r5, 14);
        AnonymousClass1RJ r2 = this.A0X;
        AnonymousClass3YF.A00(C36391kE.A0L(r2, 0), this, r5, 15);
        View A012 = r2.A01();
        if (!(A012 == null || (A0P2 = C36391kE.A0P(A012, R.id.action_view_ai_btn)) == null)) {
            A0P2.setTextColor(color);
        }
        this.A0Y.A03(8);
    }

    public boolean A1E() {
        return C175108Zr.A15(this);
    }

    public void A1Y() {
        super.A1Y();
        A0B();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public /* synthetic */ void A2D(AnonymousClass141 r2) {
        setupViewIfThirdPartyBotContact(r2.A0K());
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A0V.getText());
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.A0V.getText());
    }
}
