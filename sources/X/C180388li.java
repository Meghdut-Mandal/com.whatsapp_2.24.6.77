package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8li  reason: invalid class name and case insensitive filesystem */
public class C180388li extends C166477vx implements C159647jh {
    public int A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public AnonymousClass17Y A0A;
    public TextEmojiLabel A0B;
    public TextEmojiLabel A0C;
    public TextEmojiLabel A0D;
    public TextEmojiLabel A0E;
    public WaImageView A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public AnonymousClass1Pp A0I;
    public AnonymousClass16D A0J;
    public AnonymousClass1RY A0K;
    public C27731Pn A0L;
    public C20310xM A0M;
    public AnonymousClass1VZ A0N;
    public C202319lY A0O;
    public C20810yC A0P;
    public C28371Sj A0Q;
    public C202629mK A0R;
    public C22956Az8 A0S;
    public AnonymousClass1EV A0T;
    public AnonymousClass1EU A0U;
    public C202179lC A0V;
    public AnonymousClass1FR A0W;
    public C19770wU A0X;
    public String A0Y;

    private int getStatusLabel() {
        return this.A0W.A0C(this.A0O);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != 200) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        if (r1 != 2) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0128  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B1s(X.C202319lY r6) {
        /*
            r5 = this;
            r5.A0O = r6
            android.content.Context r0 = r5.getContext()
            X.3CG r3 = new X.3CG
            r3.<init>(r0)
            X.9lY r2 = r5.A0O
            int r1 = r2.A03
            r0 = 1
            if (r1 == r0) goto L_0x00c7
            r0 = 2
            if (r1 == r0) goto L_0x00f3
            r0 = 9
            if (r1 == r0) goto L_0x0095
            r0 = 10
            if (r1 == r0) goto L_0x00f3
            r0 = 20
            if (r1 == r0) goto L_0x00c7
            r0 = 100
            if (r1 == r0) goto L_0x00c7
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00f3
        L_0x0029:
            X.1Pp r4 = r5.A0I
            android.widget.ImageView r2 = r5.A05
        L_0x002d:
            r3 = 2131231033(0x7f080139, float:1.8078136E38)
        L_0x0030:
            r4.A06(r2, r3)
        L_0x0033:
            java.lang.String r0 = r5.getTransactionTitle()
            r2.setContentDescription(r0)
            r0 = 0
            r2.setOnClickListener(r0)
            boolean r0 = r6.A0M()
            if (r0 != 0) goto L_0x0128
            android.view.View r0 = r5.A01
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A07
            r0.setVisibility(r1)
            android.widget.LinearLayout r1 = r5.A08
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.TextEmojiLabel r1 = r5.A0E
            java.lang.String r0 = r5.getTransactionTitle()
            r1.setText(r0)
            com.whatsapp.WaTextView r3 = r5.A0G
            android.content.Context r1 = r5.getContext()
            r0 = 2131892704(0x7f1219e0, float:1.9420164E38)
            java.lang.String r2 = r1.getString(r0)
            X.AWx r1 = X.C21703AWx.A00
            java.lang.String r0 = "update-whatsapp"
            android.text.SpannableStringBuilder r0 = X.AnonymousClass3LN.A01(r1, r2, r0)
            r3.setText(r0)
            android.content.Context r1 = r5.getContext()
            android.content.Context r0 = r5.getContext()
            int r0 = X.C36341k9.A05(r0)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r3.setLinkTextColor(r0)
            r1 = 49
            X.9v0 r0 = new X.9v0
            r0.<init>(r5, r1)
            r5.setOnClickListener(r0)
            return
        L_0x0095:
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x00c0
            X.1EU r1 = r5.A0U
            java.lang.String r0 = "P2M_LITE"
            X.AF8 r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x00c0
        L_0x00a4:
            X.9Yc r0 = r0.BFZ()
            if (r0 == 0) goto L_0x0029
            X.1Pp r4 = r5.A0I
            android.widget.ImageView r2 = r5.A05
            X.9lY r0 = r5.A0O
            int r1 = r0.A01
            r0 = 1
            r3 = 2131232402(0x7f080692, float:1.8080912E38)
            if (r1 == r0) goto L_0x0030
            r0 = 2
            r3 = 2131232401(0x7f080691, float:1.808091E38)
            if (r1 == r0) goto L_0x0030
            goto L_0x002d
        L_0x00c0:
            X.1EU r0 = r5.A0U
            X.B66 r0 = r0.A05()
            goto L_0x00a4
        L_0x00c7:
            com.whatsapp.jid.UserJid r1 = r2.A0D
            if (r1 == 0) goto L_0x0029
            X.16D r0 = r5.A0J
            X.141 r1 = r0.A0D(r1)
            X.1RY r0 = r5.A0K
            android.widget.ImageView r2 = r5.A05
            r0.A08(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 2131897109(0x7f122b15, float:1.9429098E38)
            java.lang.String r0 = r3.A02(r0)
            r1.append(r0)
            X.9lY r0 = r5.A0O
            com.whatsapp.jid.UserJid r0 = r0.A0D
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            X.C011004s.A08(r2, r0)
            r1 = 1
            goto L_0x011e
        L_0x00f3:
            com.whatsapp.jid.UserJid r1 = r2.A0E
            if (r1 == 0) goto L_0x0029
            X.16D r0 = r5.A0J
            X.141 r1 = r0.A0D(r1)
            X.1RY r0 = r5.A0K
            android.widget.ImageView r2 = r5.A05
            r0.A08(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 2131897109(0x7f122b15, float:1.9429098E38)
            java.lang.String r0 = r3.A02(r0)
            r1.append(r0)
            X.9lY r0 = r5.A0O
            com.whatsapp.jid.UserJid r0 = r0.A0E
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            X.C011004s.A08(r2, r0)
            r1 = 2
        L_0x011e:
            X.3Y5 r0 = new X.3Y5
            r0.<init>(r5, r1)
            r2.setOnClickListener(r0)
            goto L_0x0033
        L_0x0128:
            X.0wU r1 = r5.A0X
            r0 = 26
            X.C36391kE.A1S(r1, r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180388li.B1s(X.9lY):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A01(X.C202319lY r12, X.AnonymousClass3T1 r13) {
        /*
            r11 = this;
            android.view.View r0 = r11.A01
            r4 = 0
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r11.A07
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r11.A08
            r3 = 8
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r1 = r11.A0D
            java.lang.String r0 = r11.getTransactionTitle()
            r1.setText(r0)
            X.8av r2 = r12.A0A
            if (r2 == 0) goto L_0x00e9
            boolean r0 = r2 instanceof X.C175928bI
            if (r0 == 0) goto L_0x00e9
            r0 = r2
            X.8bI r0 = (X.C175928bI) r0
            X.6c7 r0 = r0.A07
            if (r0 == 0) goto L_0x00e9
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 != 0) goto L_0x00e9
            com.whatsapp.TextEmojiLabel r1 = r11.A0C
            boolean r0 = r2 instanceof X.C175928bI
            if (r0 == 0) goto L_0x00e6
            X.8bI r2 = (X.C175928bI) r2
            X.6c7 r0 = r2.A07
        L_0x003a:
            java.lang.Object r0 = r0.A00
            X.C18740tg.A06(r0)
            X.C165607th.A1A(r1, r0)
            android.widget.ImageView r0 = r11.A04
            if (r0 == 0) goto L_0x0049
            r0.setVisibility(r3)
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.setVisibility(r4)
        L_0x004e:
            int r1 = r12.A01
            r0 = 4
            if (r1 != r0) goto L_0x00de
            X.1EU r1 = r11.A0U
            java.lang.String r0 = "P2M_LITE"
            X.AF8 r10 = r1.A04(r0)
            if (r10 == 0) goto L_0x00de
        L_0x005d:
            X.9Tc r5 = r10.BAj()
            android.widget.FrameLayout r6 = r11.A03
            r6.removeAllViews()
            if (r5 == 0) goto L_0x00f4
            android.content.Context r8 = r11.getContext()
            X.8av r9 = r12.A0A
            r1 = r5
            X.8fs r1 = (X.C178398fs) r1
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            boolean r0 = r9 instanceof X.C175928bI
            r2 = 0
            if (r0 == 0) goto L_0x00b8
            X.8bI r9 = (X.C175928bI) r9
            java.lang.String r0 = r9.A0V
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009c
            X.0yf r1 = r1.A00
            X.0yi r0 = X.C21100yf.A0k
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x009c
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131625815(0x7f0e0757, float:1.8878849E38)
            android.view.View r0 = r1.inflate(r0, r2)
            r7.add(r0)
        L_0x009c:
            X.9jw r0 = r9.A0G
            if (r0 == 0) goto L_0x00b8
            X.9je r0 = r0.A0C
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00b8
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131625241(0x7f0e0519, float:1.8877684E38)
            android.view.View r0 = r1.inflate(r0, r2)
            r7.add(r0)
        L_0x00b8:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00f4
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r8)
            X.C36321k7.A0N(r2)
            r0 = 1
            r2.setOrientation(r0)
            java.util.Iterator r1 = r7.iterator()
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r2.addView(r0)
            goto L_0x00ce
        L_0x00de:
            X.1EU r0 = r11.A0U
            X.B66 r10 = r0.A05()
            goto L_0x005d
        L_0x00e6:
            r0 = 0
            goto L_0x003a
        L_0x00e9:
            r11.setupTransactionMessage(r13)
            goto L_0x004e
        L_0x00ee:
            r6.addView(r2)
            r6.setVisibility(r4)
        L_0x00f4:
            if (r13 == 0) goto L_0x0265
            X.3Qa r0 = r13.A1J
            if (r0 == 0) goto L_0x0265
            X.1FR r7 = r11.A0W
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x0262
            X.9lY r6 = r13.A0M
            if (r6 == 0) goto L_0x0262
        L_0x0104:
            boolean r0 = r6.A0K()
            X.0wQ r1 = r7.A00
            if (r0 == 0) goto L_0x022f
            com.whatsapp.jid.UserJid r0 = r6.A0E
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x022a
            int r1 = r6.A03
            r0 = 40
            if (r1 != r0) goto L_0x0128
            int r1 = r6.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0225
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0225
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x0225
        L_0x0128:
            r1 = 2131892526(0x7f12192e, float:1.9419803E38)
        L_0x012b:
            android.widget.ImageView r6 = r11.A06
            r6.setVisibility(r3)
            if (r1 == 0) goto L_0x021d
            com.whatsapp.WaTextView r0 = r11.A0H
            r0.setText(r1)
            r0.setVisibility(r4)
            X.1EV r0 = r11.A0T
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x014a
            X.1EV r0 = r11.A0T
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0178
        L_0x014a:
            int r1 = r12.A03
            r0 = 100
            if (r1 == r0) goto L_0x0211
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0211
            r2 = 2131232703(0x7f0807bf, float:1.8081523E38)
            android.content.res.Resources r1 = X.C36341k9.A0F(r11)
            r0 = 2131167892(0x7f070a94, float:1.795007E38)
        L_0x015e:
            int r1 = X.C36441kJ.A05(r1, r0)
            r6.setVisibility(r4)
            android.content.Context r0 = r11.getContext()
            X.C36391kE.A18(r0, r6, r2)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.width = r1
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.height = r1
        L_0x0178:
            r11.setupRowButtons(r13, r5)
            com.whatsapp.TextEmojiLabel r6 = r11.A0B
            java.lang.CharSequence r0 = r11.getAmountText()
            r6.setText(r0)
            X.9P4 r0 = r10.BFK()
            boolean r0 = r0.A00(r12)
            if (r0 == 0) goto L_0x01de
            X.AnonymousClass97F.A00(r6)
        L_0x0191:
            int r1 = r11.getStatusColor()
            int r0 = r11.getStatusLabel()
            android.widget.TextView r5 = r11.A09
            if (r0 == 0) goto L_0x01da
            r5.setText(r0)
            r5.setTextColor(r1)
            r5.setVisibility(r4)
        L_0x01a6:
            int r1 = r12.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x01c9
            r6.setVisibility(r3)
            X.9lC r2 = r11.A0V
            java.lang.String r1 = r12.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01d3
            r1 = 0
        L_0x01ba:
            android.view.View r0 = r11.A02
            if (r1 == 0) goto L_0x01ca
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r0 = r11.A0F
            r0.setVisibility(r4)
        L_0x01c6:
            r5.setVisibility(r3)
        L_0x01c9:
            return
        L_0x01ca:
            r0.setVisibility(r4)
            com.whatsapp.WaImageView r0 = r11.A0F
            r0.setVisibility(r3)
            goto L_0x01c6
        L_0x01d3:
            java.util.HashSet r0 = r2.A00
            boolean r1 = r0.contains(r1)
            goto L_0x01ba
        L_0x01da:
            r5.setVisibility(r3)
            goto L_0x01a6
        L_0x01de:
            int r0 = r6.getPaintFlags()
            r0 = r0 & -17
            r6.setPaintFlags(r0)
            boolean r0 = r12.A0J()
            if (r0 != 0) goto L_0x01fe
            boolean r0 = X.C202319lY.A02(r12)
            if (r0 != 0) goto L_0x01fe
            android.content.Context r5 = r11.getContext()
            r0 = 2131101945(0x7f0608f9, float:1.7816314E38)
        L_0x01fa:
            X.C36331k8.A0r(r5, r6, r0)
            goto L_0x0191
        L_0x01fe:
            android.content.Context r5 = r11.getContext()
            android.content.Context r2 = r11.getContext()
            r1 = 2130970628(0x7f040804, float:1.7549971E38)
            r0 = 2131102241(0x7f060a21, float:1.7816914E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            goto L_0x01fa
        L_0x0211:
            r2 = 2131231287(0x7f080237, float:1.807865E38)
            android.content.res.Resources r1 = X.C36341k9.A0F(r11)
            r0 = 2131167891(0x7f070a93, float:1.7950068E38)
            goto L_0x015e
        L_0x021d:
            com.whatsapp.WaTextView r1 = r11.A0H
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x0178
        L_0x0225:
            r1 = 2131892260(0x7f121824, float:1.9419263E38)
            goto L_0x012b
        L_0x022a:
            r1 = 2131892259(0x7f121823, float:1.9419261E38)
            goto L_0x012b
        L_0x022f:
            com.whatsapp.jid.UserJid r0 = r6.A0D
            boolean r2 = r1.A0M(r0)
            X.1EV r1 = r7.A08
            boolean r0 = r1.A0E()
            if (r0 != 0) goto L_0x024d
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x024d
            r1 = 2131892261(0x7f121825, float:1.9419265E38)
            if (r2 == 0) goto L_0x012b
            r1 = 2131892636(0x7f12199c, float:1.9420026E38)
            goto L_0x012b
        L_0x024d:
            int r1 = r6.A03
            r0 = 100
            if (r1 != r0) goto L_0x0258
            r1 = 2131892633(0x7f121999, float:1.942002E38)
            goto L_0x012b
        L_0x0258:
            r1 = 2131892635(0x7f12199b, float:1.9420024E38)
            if (r2 == 0) goto L_0x012b
            r1 = 2131892634(0x7f12199a, float:1.9420022E38)
            goto L_0x012b
        L_0x0262:
            r1 = 0
            goto L_0x012b
        L_0x0265:
            X.1FR r7 = r11.A0W
            X.9lY r6 = r11.A0O
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180388li.A01(X.9lY, X.3T1):void");
    }

    public void BnW() {
        C202319lY r1 = this.A0O;
        if (r1 != null && this.A0S != null) {
            B1s(r1);
        }
    }

    public CharSequence getAmountText() {
        String A0P2;
        Context context;
        int i;
        C207079uW A0B2;
        int i2;
        C207119ua r1;
        Context context2;
        int i3;
        C202319lY r2 = this.A0O;
        C175708av r0 = r2.A0A;
        if (r0 == null || (A0B2 = r0.A0B()) == null || (i2 = A0B2.A01) <= 1 || (r1 = A0B2.A02) == null) {
            A0P2 = this.A0W.A0P(r2);
            if (!this.A0O.A0K()) {
                int i4 = this.A0O.A03;
                if (i4 == 1 || i4 == 100) {
                    context = getContext();
                    i = R.string.f12nameremoved;
                } else if (i4 == 2 || i4 == 200) {
                    context = getContext();
                    i = R.string.f12nameremoved;
                }
                A0P2 = C36351kA.A0w(context, A0P2, 1, i);
            }
        } else {
            AnonymousClass1FR r02 = this.A0W;
            C18740tg.A06(r1);
            A0P2 = r1.A01.B7d(r02.A05, r1.A02);
            if (!this.A0O.A0K()) {
                int i5 = this.A0O.A03;
                if (i5 == 1 || i5 == 100) {
                    context2 = getContext();
                    i3 = R.string.f12nameremoved;
                } else if (i5 == 2 || i5 == 200) {
                    context2 = getContext();
                    i3 = R.string.f12nameremoved;
                }
                Object[] objArr = new Object[2];
                C36431kI.A1O(objArr, i2, 0);
                A0P2 = C36391kE.A0v(context2, A0P2, objArr, 1, i3);
            }
        }
        synchronized (this.A0O) {
        }
        getContext();
        return A0P2;
    }

    public String getTransactionTitle() {
        return this.A0W.A0W(this.A0O, false);
    }

    public void setupTransactionMessage(AnonymousClass3T1 r8) {
        ImageView imageView;
        TextEmojiLabel textEmojiLabel;
        int i;
        if ((r8 instanceof AnonymousClass2bV) && !TextUtils.isEmpty(r8.A0b())) {
            SpannableStringBuilder A0P2 = C36441kJ.A0P(r8.A0b());
            this.A0Q.A04(getContext(), A0P2, r8.A1J.A00, r8.A0w, true);
            textEmojiLabel = this.A0C;
            textEmojiLabel.A0I(A0P2);
            imageView = this.A04;
            i = 8;
        } else if ((this.A0P.A0E(812) || this.A0P.A0E(811)) && (r8 instanceof C46962bx)) {
            imageView = this.A04;
            if (imageView != null) {
                imageView.setImageDrawable(C165587tf.A0D(getContext(), R.drawable.msg_status_sticker));
            }
            textEmojiLabel = this.A0C;
            textEmojiLabel.setText(R.string.f12nameremoved);
            i = 0;
        } else {
            ImageView imageView2 = this.A04;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            TextEmojiLabel textEmojiLabel2 = this.A0C;
            if (textEmojiLabel2 != null) {
                textEmojiLabel2.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        textEmojiLabel.setVisibility(0);
    }

    public C180388li(Context context, C22956Az8 az8, int i) {
        this(context);
        String str;
        this.A0S = az8;
        if (i == 2) {
            str = "payment_home";
        } else if (i == 3) {
            str = "payment_transaction_history";
        } else if (i != 4) {
            str = "unknown";
        } else {
            str = "mandate_payment_screen";
        }
        this.A0Y = str;
        this.A00 = i;
    }

    public C22956Az8 getCallback() {
        return this.A0S;
    }

    public int getLayoutResourceId() {
        return R.layout.f9nameremoved;
    }

    public int getStatusColor() {
        return AnonymousClass00F.A00(getContext(), AnonymousClass1FR.A00(this.A0O));
    }

    public void setupRowButtons(AnonymousClass3T1 r15, AnonymousClass9Tc r16) {
        Button button = (Button) C012005e.A02(this, R.id.accept_payment_button);
        C202629mK r5 = this.A0R;
        View view = this.A01;
        C22956Az8 az8 = this.A0S;
        C202319lY r8 = this.A0O;
        String str = this.A0Y;
        view.setVisibility(8);
        if (r8.A0I()) {
            UserJid userJid = r8.A0D;
            View A022 = C012005e.A02(view, R.id.request_decline_button);
            View A023 = C012005e.A02(view, R.id.request_pay_button);
            if (userJid != null && !C202629mK.A02(r8, r5) && !r8.A0P) {
                A022.setVisibility(8);
                A023.setVisibility(8);
            }
            view.setVisibility(8);
        } else if (r8.A02 == 102) {
            C202629mK.A00(view, button, r8, r5);
        } else {
            r5.A05(view, (Button) null, r8, r16, az8, r15, str, false);
        }
    }

    public void setCallback(C22956Az8 az8) {
        this.A0S = az8;
    }

    public void setLoggingScreenName(String str) {
        this.A0Y = str;
    }

    public C180388li(Context context) {
        super(context);
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        setOrientation(1);
        C011504z.A04(AnonymousClass00E.A00(getContext(), R.drawable.selector_orange_gradient), this);
        this.A05 = C36391kE.A0N(this, R.id.transaction_icon);
        this.A0D = C36401kF.A0P(this, R.id.transaction_receiver);
        this.A04 = C36391kE.A0N(this, R.id.message_type_indicator);
        this.A0C = C36401kF.A0P(this, R.id.transaction_note);
        this.A0B = C36401kF.A0P(this, R.id.transaction_amount);
        this.A09 = C36391kE.A0P(this, R.id.transaction_status);
        this.A02 = findViewById(R.id.transaction_shimmer);
        this.A06 = C36391kE.A0N(this, R.id.type_icon);
        this.A0H = C36411kG.A0Z(this, R.id.requested_from_note);
        this.A01 = findViewById(R.id.action_buttons_container);
        this.A07 = C36441kJ.A0U(this, R.id.transaction_row_details);
        this.A0F = (WaImageView) findViewById(R.id.transaction_loading_error);
        this.A03 = (FrameLayout) findViewById(R.id.custom_country_view_container);
        this.A08 = C36441kJ.A0U(this, R.id.transaction_row_not_supported);
        this.A0E = C36401kF.A0P(this, R.id.transaction_receiver_not_supported);
        this.A0G = C36411kG.A0Z(this, R.id.transaction_not_supported_description);
        this.A0K = this.A0L.A04(getContext(), "peer-payment-transaction-row");
        this.A0C.setTextDirection(5);
        C90504aG.A11(getContext(), this.A0F, R.color.f6nameremoved);
        setOnClickListener(new AnonymousClass3Y5(this, 0));
    }
}
