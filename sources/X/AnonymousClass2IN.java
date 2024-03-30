package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.conversation.congratulations.CongratulationsImpl;

/* renamed from: X.2IN  reason: invalid class name */
public class AnonymousClass2IN extends AnonymousClass8YZ {
    public AnonymousClass30M A00;
    public C53792rt A01;
    public int A02;
    public ViewGroup A03;
    public TextView A04;
    public C19460v5 A05;
    public TextEmojiLabel A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public TextEmojiLabel A09;
    public TextAndDateLayout A0A;
    public AnonymousClass36M A0B;
    public AnonymousClass3TU A0C;
    public C62163Fa A0D;
    public C24381Cf A0E;
    public AnonymousClass1DW A0F;
    public C20510xg A0G;
    public AnonymousClass1EM A0H;
    public C88974Ut A0I;

    public void A2D() {
        Number number;
        this.A02 = 0;
        AnonymousClass2bV r3 = (AnonymousClass2bV) this.A0K;
        String messageText = getMessageText();
        A20(r3);
        A1z(r3);
        A0G(r3);
        TextEmojiLabel textEmojiLabel = this.A06;
        setMessageText(messageText, textEmojiLabel, r3);
        textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        textEmojiLabel.clearAnimation();
        if (AnonymousClass3TC.A03(messageText) && (number = (Number) C56362wA.A00.get(AnonymousClass3TC.A00(messageText))) != null) {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(number.intValue(), 0, 0, 0);
            C36391kE.A1K(textEmojiLabel);
            A0F(textEmojiLabel);
        }
        String str = C65243Rh.A00(this.A0G, this.A1U, r3).A02;
        if (str != null) {
            this.A0F.A0H(str);
            this.A0F.A0G(str);
            AnonymousClass36M r0 = this.A0B;
            AnonymousClass00C.A0D(r3, 0);
            r0.A00.A0E(3544);
            this.A0B.A00.A0E(3545);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        if (r3.A04 == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r6.A0E(1961) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011a, code lost:
        if (r15 != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r11.A0D.A00(r0) != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b7, code lost:
        if (r1 == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cd, code lost:
        if (r17 != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0G(X.AnonymousClass2bV r21) {
        /*
            r20 = this;
            r11 = r20
            boolean r2 = r11.A0H()
            r1 = 2131435344(0x7f0b1f50, float:1.8492528E38)
            r0 = r21
            if (r2 == 0) goto L_0x01d1
            android.view.ViewGroup r2 = X.C36411kG.A0O(r11, r1)
            r1 = 0
            r2.setVisibility(r1)
            X.3BG r1 = r0.A0V
            if (r1 == 0) goto L_0x0023
            X.3Fa r1 = r11.A0D
            boolean r1 = r1.A00(r0)
            r17 = 0
            if (r1 == 0) goto L_0x0025
        L_0x0023:
            r17 = 1
        L_0x0025:
            X.3Fa r1 = r11.A0D
            boolean r18 = r1.A01(r0)
            X.3TU r1 = r11.A0C
            if (r1 != 0) goto L_0x0071
            android.content.Context r8 = r11.getContext()
            X.4Ux r12 = r11.A0d
            X.1e2 r9 = r11.A0S
            X.1EM r15 = r11.A0H
            X.1e6 r13 = r11.A1H
            X.1SV r4 = r11.A1y
            X.39u r10 = r11.A1S()
            X.0v5 r3 = r11.A05
            boolean r1 = r3.A05()
            if (r1 == 0) goto L_0x004c
            r3.A02()
        L_0x004c:
            X.0yC r14 = r11.A0G
            X.3TU r7 = new X.3TU
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r11.A0C = r7
            int r3 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            r7.A00 = r3
            r7.A01 = r1
            X.3TU r1 = r11.A0C
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r1.A0A
            X.C36401kF.A18(r1, r2)
            X.3TU r1 = r11.A0C
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r1.A0A
            X.AnonymousClass2IR.A0W(r1, r11)
        L_0x0071:
            X.0yC r2 = r11.A0G
            X.1DU r1 = r11.A1U
            X.3Rh r3 = X.C65243Rh.A00(r2, r1, r0)
            X.4Ut r5 = r11.A0I
            boolean r1 = r5 instanceof X.C1491570b
            if (r1 == 0) goto L_0x0085
            boolean r1 = r3.A04
            r16 = 1
            if (r1 != 0) goto L_0x0087
        L_0x0085:
            r16 = 0
        L_0x0087:
            r2 = 72
            if (r16 == 0) goto L_0x008d
            r11.A02 = r2
        L_0x008d:
            r7 = 1
            if (r16 == 0) goto L_0x00a8
            java.lang.String r1 = r0.A0b()
            X.0yC r6 = r11.A0G
            int r4 = X.C63883Lu.A00(r1)
            r1 = 90
            if (r4 >= r1) goto L_0x00a8
            r1 = 1961(0x7a9, float:2.748E-42)
            boolean r1 = r6.A0E(r1)
            r19 = 1
            if (r1 != 0) goto L_0x00aa
        L_0x00a8:
            r19 = 0
        L_0x00aa:
            X.1SV r1 = r11.A1y
            boolean r1 = X.C63783Lk.A01(r0, r1, r7)
            if (r1 == 0) goto L_0x00d2
            X.3L1 r6 = r0.A0a
            if (r6 == 0) goto L_0x01c5
            android.content.Context r1 = r11.getContext()
            int r1 = X.AnonymousClass3R4.A00(r1)
            if (r19 == 0) goto L_0x01be
            X.2KX r4 = new X.2KX
            r4.<init>(r1)
        L_0x00c5:
            int r2 = r6.A01
            int r1 = r6.A00
            r4.A07(r2, r1)
            int r2 = r4.A03()
        L_0x00d0:
            r11.A02 = r2
        L_0x00d2:
            X.3TU r12 = r11.A0C
            r14 = r5
            r15 = r3
            r13 = r0
            r12.A04(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r6 = r3.A03
            boolean r10 = X.C63933Lz.A01(r6)
            X.1DW r2 = r11.A0F
            java.lang.String r1 = r3.A02
            boolean r9 = r2.A0G(r1)
            X.1DW r4 = r11.A0F
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r8 = 0
            if (r1 != 0) goto L_0x00fe
            android.net.Uri r1 = android.net.Uri.parse(r6)
            r2 = 13
            int r1 = r4.A0C(r1)
            if (r2 != r1) goto L_0x00fe
            r8 = 1
        L_0x00fe:
            X.1DW r1 = r11.A0F
            boolean r7 = r1.A0F(r6)
            X.1DW r1 = r11.A0F
            X.1Di r2 = r1.A03
            android.net.Uri r1 = android.net.Uri.parse(r6)
            boolean r15 = r2.A09(r1)
            r5 = 0
            if (r10 != 0) goto L_0x011c
            if (r9 != 0) goto L_0x011c
            if (r8 != 0) goto L_0x011c
            if (r7 != 0) goto L_0x011c
            r4 = 0
            if (r15 == 0) goto L_0x0135
        L_0x011c:
            r4 = 1
            if (r10 == 0) goto L_0x0162
            X.1EM r2 = r11.A0H
            int r1 = r0.A00
            boolean r2 = r2.A03(r1)
            X.3Qa r1 = r0.A1J
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x0159
            r5 = 2131895685(0x7f122585, float:1.942621E38)
            if (r2 == 0) goto L_0x0135
            r5 = 2131895748(0x7f1225c4, float:1.9426338E38)
        L_0x0135:
            android.view.ViewGroup r2 = r11.A03
            r14 = 13
            X.755 r1 = new X.755
            r10 = r1
            r12 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            r11.A1p(r2, r1, r5, r4)
        L_0x0143:
            boolean r0 = X.C37541mm.A07(r11)
            if (r0 == 0) goto L_0x0158
            android.view.ViewGroup r0 = r11.A03
            r11.setViewToMatchParent(r0)
            com.whatsapp.components.TextAndDateLayout r0 = r11.A0A
            r11.setViewToMatchParent(r0)
            com.whatsapp.components.TextAndDateLayout r1 = r11.A0A
            r0 = 1
            r1.A03 = r0
        L_0x0158:
            return
        L_0x0159:
            r5 = 2131890621(0x7f1211bd, float:1.9415939E38)
            if (r2 == 0) goto L_0x0135
            r5 = 2131890625(0x7f1211c1, float:1.9415947E38)
            goto L_0x0135
        L_0x0162:
            if (r9 == 0) goto L_0x0168
            r5 = 2131895669(0x7f122575, float:1.9426178E38)
            goto L_0x0135
        L_0x0168:
            if (r8 == 0) goto L_0x016e
            r5 = 2131895751(0x7f1225c7, float:1.9426344E38)
            goto L_0x0135
        L_0x016e:
            if (r7 == 0) goto L_0x0174
            r5 = 2131887335(0x7f1204e7, float:1.9409274E38)
            goto L_0x0135
        L_0x0174:
            if (r15 == 0) goto L_0x0135
            X.1DW r1 = r11.A0F
            X.1Di r5 = r1.A03
            android.net.Uri r2 = android.net.Uri.parse(r6)
            java.lang.String r1 = "create"
            boolean r1 = X.C24671Di.A03(r2, r5, r1)
            if (r1 == 0) goto L_0x018a
            r5 = 2131896454(0x7f122886, float:1.942777E38)
            goto L_0x0135
        L_0x018a:
            X.1DW r1 = r11.A0F
            X.1Di r5 = r1.A03
            android.net.Uri r2 = android.net.Uri.parse(r6)
            java.lang.String r1 = "directory"
            boolean r1 = X.C24671Di.A03(r2, r5, r1)
            if (r1 == 0) goto L_0x019e
            r5 = 2131889601(0x7f120dc1, float:1.941387E38)
            goto L_0x0135
        L_0x019e:
            X.1DW r1 = r11.A0F
            X.1Di r2 = r1.A03
            android.net.Uri r1 = android.net.Uri.parse(r6)
            java.lang.Long r1 = r2.A05(r1)
            if (r1 == 0) goto L_0x01b9
            X.0yC r2 = r11.A0G
            r1 = 5188(0x1444, float:7.27E-42)
            boolean r1 = r2.A0E(r1)
            r5 = 2131895753(0x7f1225c9, float:1.9426348E38)
            if (r1 != 0) goto L_0x0135
        L_0x01b9:
            r5 = 2131895696(0x7f122590, float:1.9426232E38)
            goto L_0x0135
        L_0x01be:
            X.2KY r4 = new X.2KY
            r4.<init>(r1)
            goto L_0x00c5
        L_0x01c5:
            X.3BG r1 = r0.A0V
            if (r1 == 0) goto L_0x00d2
            byte[] r1 = r1.A0F
            if (r1 == 0) goto L_0x00d2
            if (r17 == 0) goto L_0x00d2
            goto L_0x00d0
        L_0x01d1:
            android.view.ViewGroup r4 = X.C36411kG.A0P(r11, r1)
            X.3TU r1 = r11.A0C
            r3 = 0
            if (r1 == 0) goto L_0x01e1
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r1.A0A
            r4.removeView(r1)
            r11.A0C = r3
        L_0x01e1:
            android.view.View r1 = r11.A06
            if (r1 == 0) goto L_0x01f9
            boolean r1 = X.AnonymousClass2IR.A0e(r11, r0)
            if (r1 == 0) goto L_0x02c7
            int r2 = r0.A1I
            r1 = 1
            if (r2 == 0) goto L_0x01f9
            if (r2 == r1) goto L_0x01f9
            r1 = 9
            if (r2 == r1) goto L_0x01f9
            r1 = 3
            if (r2 != r1) goto L_0x02c7
        L_0x01f9:
            r1 = 8
            r4.setVisibility(r1)
            X.0yC r2 = r11.A0G
            r1 = 2446(0x98e, float:3.428E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x0143
            r1 = 2131433109(0x7f0b1695, float:1.8487994E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36401kF.A0P(r11, r1)
            r11.A09 = r1
            r1 = 2131433095(0x7f0b1687, float:1.8487966E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r11, r1)
            r11.A04 = r1
            r1 = 2131433106(0x7f0b1692, float:1.8487988E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36401kF.A0P(r11, r1)
            r11.A08 = r1
            r1 = 2131433107(0x7f0b1693, float:1.848799E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36401kF.A0P(r11, r1)
            r11.A07 = r1
            if (r21 == 0) goto L_0x0143
            X.3T1 r3 = r0.A0S()
            if (r3 == 0) goto L_0x0143
            boolean r1 = r3 instanceof X.AnonymousClass2c5
            if (r1 == 0) goto L_0x0143
            X.2c5 r3 = (X.AnonymousClass2c5) r3
            X.3Qa r1 = r3.A1J
            X.11F r2 = r1.A00
            X.3Qa r1 = r0.A1J
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x0143
            boolean r1 = X.AnonymousClass143.A0G(r2)
            if (r1 == 0) goto L_0x0143
            java.lang.String r2 = r3.A01
            X.3Sl r1 = X.AnonymousClass147.A01
            X.147 r1 = r1.A06(r2)
            if (r1 == 0) goto L_0x0143
            X.3T1 r1 = r0.A0S()
            X.3Qa r1 = r1.A1J
            X.11F r1 = r1.A00
            X.147 r3 = X.C65533Sl.A03(r1)
            com.whatsapp.TextEmojiLabel r2 = r11.A09
            if (r2 == 0) goto L_0x0293
            android.widget.TextView r1 = r11.A04
            if (r1 == 0) goto L_0x0293
            com.whatsapp.TextEmojiLabel r1 = r11.A08
            if (r1 == 0) goto L_0x0293
            com.whatsapp.TextEmojiLabel r1 = r11.A07
            if (r1 == 0) goto L_0x0293
            X.12q r1 = r11.A0F
            java.lang.String r1 = r1.A0D(r3)
            r2.setText(r1)
            android.widget.TextView r1 = r11.A04
            r2 = 8
            r1.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r1 = r11.A08
            r1.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r2 = r11.A07
            r1 = 0
            r2.setVisibility(r1)
            com.whatsapp.TextEmojiLabel r2 = r11.A07
            r1 = 2131886526(0x7f1201be, float:1.9407633E38)
            r2.setText(r1)
        L_0x0293:
            android.view.View r1 = r11.A06
            if (r1 != 0) goto L_0x02ac
            android.view.ViewGroup r5 = r11.A03
            if (r5 == 0) goto L_0x02ac
            android.view.LayoutInflater r4 = X.C36351kA.A0C(r11)
            r2 = 2131623985(0x7f0e0031, float:1.8875137E38)
            r1 = 0
            android.view.View r1 = X.C36361kB.A0E(r4, r1, r2)
            r11.A06 = r1
            X.C36401kF.A18(r1, r5)
        L_0x02ac:
            android.widget.TextView r4 = r11.getActionButtonView()
            if (r4 == 0) goto L_0x0143
            android.view.View r2 = r11.A06
            if (r2 == 0) goto L_0x0143
            r1 = 0
            r2.setVisibility(r1)
            r1 = 2131886524(0x7f1201bc, float:1.940763E38)
            r4.setText(r1)
            r1 = 15
            X.C48932iI.A00(r4, r0, r11, r3, r1)
            goto L_0x0143
        L_0x02c7:
            android.view.ViewGroup r2 = r11.A03
            android.view.View r1 = r11.A06
            r2.removeView(r1)
            r11.A06 = r3
            goto L_0x01f9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IN.A0G(X.2bV):void");
    }

    private boolean A0H() {
        C20810yC r5 = this.A0G;
        C19730wQ r1 = this.A0T;
        C220412q r3 = this.A0F;
        AnonymousClass1DU r0 = this.A1U;
        AnonymousClass1C6 r8 = this.A1u;
        AnonymousClass16D r2 = this.A0l;
        C20350xQ r6 = this.A1Q;
        AnonymousClass1A5 r4 = this.A1C;
        AnonymousClass3T1 r7 = this.A0K;
        if ((TextUtils.isEmpty(C65243Rh.A00(r5, r0, r7).A03) || !C65853Ts.A06(r1, r2, r3, r4, r5, r6, r7, r8)) && this.A0K.A0V == null) {
            return false;
        }
        return true;
    }

    private TextView getActionButtonView() {
        View view = this.A06;
        if (view == null) {
            return null;
        }
        return C36391kE.A0P(view, R.id.action_btn);
    }

    private String getMessageText() {
        String A0b = this.A0K.A0b();
        if (A0b == null) {
            return "";
        }
        return A0b;
    }

    public boolean A1F() {
        if (!this.A0d.BtS()) {
            return false;
        }
        if (A0H() || !((AnonymousClass1GQ) this.A2B.get()).A00.A0E(7389)) {
            return true;
        }
        return false;
    }

    public boolean A1O() {
        if (this.A0V.A09(C21100yf.A0q)) {
            AnonymousClass3T1 r2 = this.A0K;
            if (!C64933Qa.A04(r2) && C66013Ui.A0l(r2)) {
                boolean z = this.A0O;
                if (!C66013Ui.A0t(r2) || z) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void A1b() {
        C37541mm.A02(this.A06);
    }

    public void A22(AnonymousClass3T1 r5, boolean z) {
        boolean A1W = C36371kC.A1W(r5, this.A0K);
        super.A22(r5, z);
        if (z || A1W) {
            A2D();
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A06;
        if (textEmojiLabel.getAnimation() == null) {
            String messageText = getMessageText();
            if (AnonymousClass3TC.A03(messageText) && C56362wA.A00.get(AnonymousClass3TC.A00(messageText)) != null) {
                A0F(textEmojiLabel);
            }
        }
        AnonymousClass3T1 r1 = this.A0K;
        if (r1.A0a != null && this.A0d.BLu(r1)) {
            A0G((AnonymousClass2bV) this.A0K);
        }
    }

    public AnonymousClass2bV getFMessage() {
        return (AnonymousClass2bV) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r4) {
        C18740tg.A0F(r4 instanceof AnonymousClass2bV, AnonymousClass000.A0l(r4, "Expected a message of type FMessageText but instead found ", AnonymousClass000.A0u()));
        this.A0K = r4;
    }

    public AnonymousClass2IN(Context context, C89004Uw r5, AnonymousClass2bV r6) {
        super(context, r5, r6);
        if (r5 != null) {
            r5.BAB(CongratulationsImpl.class);
        }
        C88974Ut A012 = C65853Ts.A01(context);
        this.A03 = C36411kG.A0O(this, R.id.main_layout);
        TextEmojiLabel A0O = C36401kF.A0O(this, R.id.message_text);
        this.A06 = A0O;
        C36331k8.A1A(this.A0G, A0O);
        this.A06.setAutoLinkMask(0);
        this.A06.setLinksClickable(false);
        this.A06.setFocusable(false);
        this.A06.setClickable(false);
        this.A06.setLongClickable(false);
        this.A0A = (TextAndDateLayout) C012005e.A02(this, R.id.conversation_text_row);
        this.A0I = A012;
        A2D();
    }

    public static void A0F(View view) {
        ScaleAnimation A0M = C36391kE.A0M(0.85f, 0.8f);
        A0M.setInterpolator(new DecelerateInterpolator());
        A0M.setDuration(500);
        A0M.setRepeatMode(2);
        A0M.setRepeatCount(-1);
        A0M.setFillBefore(true);
        A0M.setFillAfter(true);
        view.startAnimation(A0M);
    }

    private void setViewToMatchParent(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public boolean A1E() {
        return C37541mm.A08(this);
    }

    public boolean A1K() {
        if (!A0H() || !this.A0d.BtQ()) {
            return false;
        }
        return true;
    }

    public void A1Y() {
        A2D();
        AnonymousClass2IR.A0d(this, false);
    }

    public void A1g(int i) {
        View view;
        int paddingLeft;
        int dimensionPixelOffset;
        int paddingRight;
        View view2;
        super.A1g(i);
        if (this.A0K.A0S() == null && !A0H()) {
            if (A29(this.A1O, this.A0K, i, this.A0O)) {
                view = this.A06;
                paddingLeft = view.getPaddingLeft();
                dimensionPixelOffset = 0;
                paddingRight = view.getPaddingRight();
                view2 = view;
            } else {
                view = this.A0A;
                paddingLeft = view.getPaddingLeft();
                dimensionPixelOffset = C36341k9.A0F(this).getDimensionPixelOffset(R.dimen.f7nameremoved);
                paddingRight = this.A0A.getPaddingRight();
                view2 = this.A0A;
            }
            C36421kH.A0y(view2, view, paddingLeft, dimensionPixelOffset, paddingRight);
        }
    }

    public void A1v(AnonymousClass3T1 r2) {
        super.A1v(r2);
        A1w(r2);
        if (this.A0A == null) {
            this.A0A = (TextAndDateLayout) C012005e.A02(this, R.id.conversation_text_row);
        }
    }

    public void A2E(AnonymousClass2bV r1) {
        setFMessage(r1);
        A2D();
        A1w(r1);
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getMainChildMaxWidth() {
        if (C37541mm.A07(this) || this.A02 == 0) {
            return 0;
        }
        return AnonymousClass3R4.A01(getContext(), this.A02);
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public float getTextFontSize() {
        float textFontSize = super.getTextFontSize();
        int A002 = AnonymousClass3TB.A00(getMessageText());
        if (A002 > 0) {
            float max = (((Math.max(textFontSize, Math.min(textFontSize, (C36361kB.A0B(this).density * textFontSize) / C36361kB.A0B(this).scaledDensity) * 1.5f) - textFontSize) * ((float) (4 - A002))) / 3.0f) + textFontSize;
            if (max != -1.0f) {
                return max;
            }
        }
        return textFontSize;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
