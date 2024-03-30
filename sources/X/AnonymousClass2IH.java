package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout;
import java.util.Set;

/* renamed from: X.2IH  reason: invalid class name */
public final class AnonymousClass2IH extends C174908Yx implements C88244Ry, C22956Az8 {
    public C33771fu A00;
    public C32821eF A01;
    public C20830yE A02;
    public AnonymousClass1Y4 A03;
    public AnonymousClass1ST A04;
    public AnonymousClass1EZ A05;
    public C202629mK A06;
    public C24631De A07;
    public AnonymousClass1EV A08;
    public AnonymousClass1EU A09;
    public C29931Yo A0A;
    public C202179lC A0B;
    public AnonymousClass1FR A0C;
    public C23981Ap A0D;
    public AnonymousClass336 A0E;
    public C20380xT A0F;
    public final View A0G;
    public final AnonymousClass1RJ A0H;
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M = C012005e.A02(this, R.id.text_and_date);
    public final FrameLayout A0N = C36441kJ.A0T(this, R.id.payment_amount_container);
    public final FrameLayout A0O;
    public final FrameLayout A0P;
    public final LinearLayout A0Q = ((LinearLayout) C012005e.A02(this, R.id.main_layout));
    public final TextEmojiLabel A0R;
    public final TextEmojiLabel A0S = C36401kF.A0O(this, R.id.payment_note);
    public final TextEmojiLabel A0T = C36401kF.A0O(this, R.id.transaction_status);
    public final WaTextView A0U = C36401kF.A0Q(this, R.id.payment_symbol);
    public final ConversationPaymentRowTransactionLayout A0V = ((ConversationPaymentRowTransactionLayout) C012005e.A02(this, R.id.transaction_status_container));
    public final C65633Sw A0W;
    public final AnonymousClass1RJ A0X;
    public final AnonymousClass1RJ A0Y = C36341k9.A0X(this, R.id.payment_unsupported_icon);
    public final AnonymousClass1RJ A0Z;
    public final AnonymousClass1RJ A0a;

    public void A1Y() {
        AnonymousClass2IR.A0d(this, false);
        A2D();
    }

    public int getBubbleAlpha() {
        return 255;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IH(Context context, C89004Uw r21, AnonymousClass3T1 r22) {
        super(context, r21, r22);
        AnonymousClass1RJ r0;
        TextEmojiLabel A0O2 = C36401kF.A0O(this, R.id.message_text);
        this.A0R = A0O2;
        A0O2.A0C();
        C36321k7.A0r(this.A0G, A0O2);
        FrameLayout A0T2 = C36441kJ.A0T(this, R.id.payment_container);
        this.A0O = A0T2;
        FrameLayout A0T3 = C36441kJ.A0T(this, R.id.requested_message_holder);
        this.A0P = A0T3;
        this.A0G = C012005e.A02(this, R.id.payment_shimmer);
        this.A0H = C36341k9.A0X(this, R.id.payment_loading_error);
        this.A0X = C36341k9.A0X(this, R.id.payment_security_strip);
        this.A0I = findViewById(R.id.accept_payment_container);
        View findViewById = findViewById(R.id.send_payment_again_container);
        AnonymousClass1RJ r1 = null;
        if (findViewById != null) {
            r0 = new AnonymousClass1RJ(findViewById);
        } else {
            r0 = null;
        }
        this.A0a = r0;
        this.A0K = findViewById(R.id.retry_withdrawal_container);
        this.A0J = findViewById(R.id.request_actions_container);
        View findViewById2 = findViewById(R.id.review_and_cancel_container);
        this.A0Z = findViewById2 != null ? new AnonymousClass1RJ(findViewById2) : r1;
        A0T2.setForeground(getInnerFrameForegroundDrawable());
        A0T3.setForeground(getInnerFrameForegroundDrawable());
        this.A0L = C012005e.A02(this, R.id.media_container);
        C20810yC r11 = this.A0G;
        AnonymousClass1XY r7 = this.A0U;
        AnonymousClass1X4 r8 = this.A0Z;
        C23981Ap r14 = this.A0D;
        C18820ts r10 = this.A0E;
        this.A0W = new C65633Sw(this, this.A0R, r7, r8, this.A02, r10, r11, this.A03, this.A04, r14, this.A1r, this.A0E, this.A1y, this.A21);
        A2D();
    }

    private void A0B() {
        this.A0N.setVisibility(8);
        View view = this.A0I;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.A0K;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        AnonymousClass1RJ r0 = this.A0a;
        if (r0 != null) {
            r0.A03(8);
        }
        this.A0Q.setOnClickListener((View.OnClickListener) null);
        this.A0T.setVisibility(8);
        this.A0P.setVisibility(8);
        View view3 = this.A0J;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    private boolean A0C() {
        if (this.A0G.A0E(605) || this.A0G.A0E(629)) {
            return true;
        }
        return false;
    }

    private void setPaymentContext(AnonymousClass3T1 r8, TextEmojiLabel textEmojiLabel) {
        Pair pair;
        C202319lY r4;
        Context context;
        int i;
        String A0w;
        Context context2;
        int i2;
        AnonymousClass1FR r1 = this.A0C;
        if (r8.A1J.A00 == null || (r4 = r8.A0M) == null) {
            pair = new Pair("", "");
        } else {
            boolean A0K2 = r4.A0K();
            String str = "";
            C19730wQ r5 = r1.A00;
            if (A0K2) {
                if (!r5.A0M(r4.A0E) || "en".equals(r1.A05.A06())) {
                    str = r1.A0S(r4);
                    context = r1.A04.A00;
                    i = R.string.f12nameremoved;
                    A0w = C36351kA.A0w(context, str, 1, i);
                    pair = C36441kJ.A0Q(str, A0w);
                } else {
                    context2 = r1.A04.A00;
                    i2 = R.string.f12nameremoved;
                }
            } else if (!r5.A0M(r4.A0D) || "en".equals(r1.A05.A06())) {
                str = r1.A0R(r4);
                context = r1.A04.A00;
                i = R.string.f12nameremoved;
                A0w = C36351kA.A0w(context, str, 1, i);
                pair = C36441kJ.A0Q(str, A0w);
            } else {
                context2 = r1.A04.A00;
                i2 = R.string.f12nameremoved;
            }
            A0w = context2.getString(i2);
            pair = C36441kJ.A0Q(str, A0w);
        }
        String str2 = (String) pair.second;
        if (!TextUtils.isEmpty(str2)) {
            String str3 = (String) pair.first;
            SpannableStringBuilder A0P2 = C36441kJ.A0P(str2);
            if (!TextUtils.isEmpty(str3)) {
                getContext();
                C37401mJ r2 = new C37401mJ();
                int length = str2.length();
                A0P2.setSpan(r2, length - str3.length(), length, 0);
                C36431kI.A1M(textEmojiLabel, A0P2);
            } else {
                textEmojiLabel.setText(A0P2);
            }
            textEmojiLabel.setVisibility(0);
            return;
        }
        textEmojiLabel.setVisibility(8);
    }

    private void setRequestPaymentText(C202319lY r5, TextView textView) {
        Pair A0H2 = this.A0C.A0H(r5);
        String str = (String) A0H2.first;
        SpannableStringBuilder A0P2 = C36441kJ.A0P((String) A0H2.second);
        if (!TextUtils.isEmpty(str)) {
            getContext();
            A0P2.setSpan(new C37401mJ(), 0, str.length(), 0);
            C36431kI.A1M(textView, A0P2);
            return;
        }
        textView.setText(A0P2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x018b, code lost:
        if (r13 == 10) goto L_0x018d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x029f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2D() {
        /*
            r30 = this;
            r6 = r30
            X.3T1 r5 = r6.getFMessage()
            com.whatsapp.TextEmojiLabel r11 = r6.A0R
            r11.A0C()
            com.whatsapp.TextEmojiLabel r9 = r6.A0S
            X.0yC r0 = r6.A0G
            X.C36331k8.A1A(r0, r9)
            android.view.ViewGroup r12 = r6.A07
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166025(0x7f070349, float:1.7946284E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r2 = X.C36371kC.A03(r6, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166023(0x7f070347, float:1.794628E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4 = 0
            r12.setPadding(r3, r4, r2, r0)
            android.view.View r7 = r6.A0M
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r7)
            r0.topMargin = r4
            android.view.View r1 = r6.A0L
            r3 = 8
            r1.setVisibility(r3)
            int r13 = r5.A1I
            r8 = 1
            r10 = 2
            r2 = 0
            r0 = 12
            if (r13 != r0) goto L_0x05a7
            android.content.Context r7 = r6.getContext()
            X.1fu r0 = r6.A00
            android.net.Uri r1 = r0.A00()
            r0 = 2131889774(0x7f120e6e, float:1.9414221E38)
            java.lang.String r0 = X.C65373Ru.A00(r7, r1, r0)
        L_0x005b:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r0)
            r6.A1l(r1)
            X.0yb r0 = r6.A0D
            X.C36331k8.A16(r9, r0)
            r9.setText(r1)
            android.graphics.Typeface r0 = r9.getTypeface()
            r9.setTypeface(r0, r10)
        L_0x0075:
            r9.setVisibility(r4)
        L_0x0078:
            com.whatsapp.WaTextView r1 = r6.A0U
            r1.setVisibility(r4)
            X.1RJ r7 = r6.A0Y
            r7.A03(r3)
            com.whatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout r0 = r6.A0V
            r21 = r0
            int r0 = r9.getVisibility()
            r13 = r2
            if (r0 != r3) goto L_0x008e
            r13 = r12
        L_0x008e:
            r0 = r21
            r0.A00 = r13
            android.view.View r0 = r6.A0G
            r29 = r0
            r0.setVisibility(r3)
            X.1RJ r0 = r6.A0H
            r28 = r0
            r0.A03(r3)
            X.9lY r13 = r5.A0M
            X.9nz r0 = X.C203419nz.$redex_init_class
            if (r13 == 0) goto L_0x0128
            int r12 = r13.A03
            r0 = 5
            if (r12 != r0) goto L_0x0128
            r6.A0B()
            r1.setVisibility(r3)
            r7.A03(r4)
            android.content.Context r2 = r6.getContext()
            X.1fu r0 = r6.A00
            android.net.Uri r1 = r0.A00()
            r0 = 2131892182(0x7f1217d6, float:1.9419105E38)
            java.lang.String r0 = X.C65373Ru.A00(r2, r1, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r0)
            r6.A1l(r1)
            X.0yb r0 = r6.A0D
            X.C36331k8.A16(r11, r0)
            r11.setText(r1)
            android.graphics.Typeface r0 = r11.getTypeface()
            r11.setTypeface(r0, r10)
            r11.setVisibility(r4)
        L_0x00e2:
            android.widget.LinearLayout r0 = r6.A0Q
            X.AnonymousClass2IR.A0W(r0, r6)
            boolean r0 = r6.A0C()
            X.1RJ r7 = r6.A0X
            if (r0 == 0) goto L_0x0656
            r7.A03(r4)
            r0 = 2131433742(0x7f0b190e, float:1.8489278E38)
            android.widget.ImageView r3 = X.C36401kF.A0G(r6, r0)
            X.3Qa r0 = r5.A1J
            boolean r2 = r0.A02
            android.content.Context r1 = r6.getContext()
            r0 = 2131101942(0x7f0608f6, float:1.7816308E38)
            if (r2 == 0) goto L_0x0109
            r0 = 2131101943(0x7f0608f7, float:1.781631E38)
        L_0x0109:
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r3.setColorFilter(r0)
            android.view.View r0 = r7.A01()
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            r0 = 1500(0x5dc, float:2.102E-42)
            r1.setEnterFadeDuration(r0)
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.setExitFadeDuration(r0)
            r1.start()
            return
        L_0x0128:
            boolean r0 = X.C203419nz.A06(r13)
            if (r0 == 0) goto L_0x0142
            r6.A0B()
            r11.setVisibility(r4)
            r0 = 2131892467(0x7f1218f3, float:1.9419683E38)
            r11.setText(r0)
            android.graphics.Typeface r0 = r11.getTypeface()
            r11.setTypeface(r0, r10)
            goto L_0x00e2
        L_0x0142:
            X.1EV r0 = r6.A08
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x05a0
            X.1EU r7 = r6.A09
            X.9lY r0 = r5.A0M
            java.lang.String r0 = r0.A0G
            X.9e3 r7 = r7.A03(r0)
            if (r7 == 0) goto L_0x05a0
            X.9lY r0 = r5.A0M
            java.lang.String r0 = r0.A0I
            X.B66 r7 = r7.A01(r0)
            if (r7 == 0) goto L_0x05a1
            X.1EV r0 = r6.A08
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x05a1
            X.B3q r20 = r7.BAJ()
            X.9jA r19 = r7.BE1()
        L_0x0170:
            r6.setPaymentContext(r5, r11)
            X.9lY r12 = r5.A0M
            int r13 = r12.A03
            if (r13 == r8) goto L_0x018d
            if (r13 == r10) goto L_0x018d
            r0 = 100
            if (r13 == r0) goto L_0x018d
            r0 = 200(0xc8, float:2.8E-43)
            if (r13 == r0) goto L_0x018d
            r0 = 20
            if (r13 == r0) goto L_0x018d
            r0 = 10
            r18 = 0
            if (r13 != r0) goto L_0x018f
        L_0x018d:
            r18 = 1
        L_0x018f:
            if (r7 == 0) goto L_0x0592
            int r13 = r7.BIZ(r12)
            r0 = r20
            java.lang.String r10 = r7.BFc(r0, r5)
        L_0x019b:
            X.9lY r0 = r5.A0M
            boolean r0 = X.C203419nz.A06(r0)
            r15 = 0
            if (r0 == 0) goto L_0x01a7
            r15 = 2131892467(0x7f1218f3, float:1.9419683E38)
        L_0x01a7:
            X.9lY r0 = r5.A0M
            if (r7 == 0) goto L_0x058c
            int r17 = r7.BIX(r0)
        L_0x01af:
            if (r18 == 0) goto L_0x0585
            if (r13 == 0) goto L_0x0585
            com.whatsapp.TextEmojiLabel r12 = r6.A0T
            java.lang.String r14 = X.C36381kD.A0t(r6, r13)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0582
            android.content.Context r13 = r6.getContext()
            r0 = 2
            java.lang.Object[] r10 = X.C36431kI.A1a(r14, r10, r0)
            r0 = 2131892482(0x7f121902, float:1.9419714E38)
            java.lang.String r0 = r13.getString(r0, r10)
        L_0x01cf:
            if (r15 == 0) goto L_0x01e9
            android.content.Context r16 = r6.getContext()
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r4] = r0
            java.lang.String r0 = X.C36381kD.A0t(r6, r15)
            r10[r8] = r0
            r13 = 2131892481(0x7f121901, float:1.9419712E38)
            r0 = r16
            java.lang.String r0 = r0.getString(r13, r10)
        L_0x01e9:
            int r13 = r0.indexOf(r14)
            int r15 = X.C36441kJ.A09(r14, r13)
            android.text.SpannableStringBuilder r10 = X.C36441kJ.A0P(r0)
            android.content.res.Resources r14 = r6.getResources()
            r0 = r17
            int r0 = r14.getColor(r0)
            android.text.style.ForegroundColorSpan r14 = new android.text.style.ForegroundColorSpan
            r14.<init>(r0)
            r10.setSpan(r14, r13, r15, r4)
            r6.getContext()
            X.1mJ r14 = new X.1mJ
            r14.<init>()
            r10.setSpan(r14, r13, r15, r4)
            X.C36431kI.A1M(r12, r10)
            r12.setVisibility(r4)
        L_0x0218:
            int r0 = r12.getVisibility()
            if (r0 == 0) goto L_0x057b
            int r0 = r11.getVisibility()
            if (r0 == 0) goto L_0x057b
            r0 = r21
            r0.setVisibility(r3)
        L_0x0229:
            android.widget.FrameLayout r0 = r6.A0N
            r0.setVisibility(r4)
            if (r7 == 0) goto L_0x0569
            X.9P4 r12 = r7.BFK()
            X.0yC r11 = r6.A0G
            X.0ts r10 = r6.A0E
            X.1Yo r0 = r6.A0A
            X.4Ts r10 = r7.BFL(r10, r11, r0, r12)
        L_0x023e:
            r0 = 2131432394(0x7f0b13ca, float:1.8486544E38)
            android.view.ViewStub r0 = X.C36431kI.A0M(r6, r0)
            if (r0 == 0) goto L_0x055d
            X.C53692rj.A00(r0, r10)
        L_0x024a:
            X.9lY r0 = r5.A0M
            r10.B1n(r0)
            X.1EV r0 = r6.A08
            boolean r0 = r0.A04(r4)
            if (r0 == 0) goto L_0x055a
            if (r7 == 0) goto L_0x055a
            X.B34 r13 = r7.BAG()
        L_0x025d:
            X.1EV r0 = r6.A08
            boolean r0 = r0.A04(r4)
            if (r0 == 0) goto L_0x0551
            X.9lY r12 = r5.A0M
            int r11 = r12.A02
            r0 = 102(0x66, float:1.43E-43)
            if (r11 != r0) goto L_0x0551
            android.view.View r11 = r6.A0I
            if (r11 == 0) goto L_0x0551
            if (r13 == 0) goto L_0x0547
            X.8av r0 = r12.A0A
            boolean r0 = r13.Bsv(r0)
            if (r0 == 0) goto L_0x0551
        L_0x027b:
            r0 = 2131427373(0x7f0b002d, float:1.847636E38)
            android.view.View r12 = r6.findViewById(r0)
            int r0 = r9.getVisibility()
            r12.setVisibility(r0)
            r0 = 2131427370(0x7f0b002a, float:1.8476354E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r11, r0)
            X.C33511fU.A03(r0)
            r11.setVisibility(r4)
            r0 = 35
            X.C67113Yo.A00(r11, r6, r7, r5, r0)
        L_0x029b:
            android.view.View r12 = r6.A0K
            if (r12 == 0) goto L_0x02b9
            X.1EV r0 = r6.A08
            boolean r0 = r0.A04(r4)
            if (r0 == 0) goto L_0x0542
            if (r7 == 0) goto L_0x0542
            X.9lY r0 = r5.A0M
            int r11 = r0.A02
            r0 = 110(0x6e, float:1.54E-43)
            if (r11 != r0) goto L_0x0542
            r12.setVisibility(r4)
            r0 = 36
            X.C67113Yo.A00(r12, r6, r7, r5, r0)
        L_0x02b9:
            X.1RJ r12 = r6.A0a
            if (r12 == 0) goto L_0x02f7
            X.1EV r0 = r6.A08
            boolean r0 = r0.A04(r4)
            if (r0 == 0) goto L_0x02f7
            X.1FR r14 = r6.A0C
            X.9lY r13 = r5.A0M
            r11 = r19
            r0 = r20
            boolean r0 = r14.A0f(r13, r11, r0, r4)
            if (r0 == 0) goto L_0x02f7
            android.view.View r13 = r12.A01()
            r0 = 2131433861(0x7f0b1985, float:1.848952E38)
            android.view.View r11 = X.C012005e.A02(r13, r0)
            int r0 = r9.getVisibility()
            r11.setVisibility(r0)
            r0 = 2131433859(0x7f0b1983, float:1.8489516E38)
            android.widget.TextView r11 = X.C36391kE.A0O(r13, r0)
            X.C33511fU.A03(r11)
            r12.A03(r4)
            r0 = 25
            X.AnonymousClass3YF.A00(r11, r6, r5, r0)
        L_0x02f7:
            X.1EV r0 = r6.A08
            boolean r0 = r0.A04(r4)
            if (r0 == 0) goto L_0x0539
            X.1FR r11 = r6.A0C
            X.9lY r0 = r5.A0M
            boolean r0 = r11.A0e(r0)
            if (r0 == 0) goto L_0x0539
            X.1RJ r12 = r6.A0Z
            if (r12 == 0) goto L_0x0539
            X.1EV r0 = r6.A08
            X.0yC r11 = r0.A02
            r0 = 1905(0x771, float:2.67E-42)
            boolean r0 = r11.A0E(r0)
            if (r0 == 0) goto L_0x0539
            X.9l8 r11 = X.C202159l8.A0E
            X.1De r0 = r6.A07
            X.9l8 r0 = r0.A02()
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0539
            android.view.View r13 = r12.A01()
            r0 = 2131433436(0x7f0b17dc, float:1.8488658E38)
            android.view.View r11 = X.C012005e.A02(r13, r0)
            int r0 = r9.getVisibility()
            r11.setVisibility(r0)
            r0 = 2131433434(0x7f0b17da, float:1.8488654E38)
            android.widget.TextView r11 = X.C36391kE.A0O(r13, r0)
            X.C33511fU.A03(r11)
            r12.A03(r4)
            r0 = 37
            X.C67113Yo.A00(r11, r6, r7, r5, r0)
        L_0x034b:
            android.view.View r11 = r6.A0J
            if (r11 == 0) goto L_0x03b2
            X.9lY r0 = r5.A0M
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x0534
            X.0wQ r12 = r6.A0T
            X.9lY r0 = r5.A0M
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r12.A0M(r0)
            if (r0 == 0) goto L_0x0534
            int r0 = r9.getVisibility()
            if (r0 == 0) goto L_0x036a
            r8 = 0
        L_0x036a:
            r0 = 2131433339(0x7f0b177b, float:1.848846E38)
            android.view.View r9 = r6.findViewById(r0)
            int r0 = X.C36351kA.A00(r8)
            r9.setVisibility(r0)
            r0 = 2131428424(0x7f0b0448, float:1.8478492E38)
            android.view.View r12 = r6.findViewById(r0)
            android.content.res.Resources r9 = r6.getResources()
            if (r8 == 0) goto L_0x0528
            r0 = 2131100317(0x7f06029d, float:1.7813012E38)
            X.C36391kE.A1C(r9, r12, r0)
        L_0x038b:
            X.3Qa r9 = r5.A1J
            X.11F r8 = r9.A00
            if (r8 == 0) goto L_0x0395
            X.9lY r0 = r5.A0M
            r0.A0C = r8
        L_0x0395:
            X.9lY r8 = r5.A0M
            java.lang.String r0 = r9.A01
            r8.A0L = r0
            X.9mK r0 = r6.A06
            java.lang.String r26 = "chat"
            r23 = r2
            r27 = 0
            r19 = r0
            r20 = r11
            r21 = r2
            r22 = r8
            r24 = r6
            r25 = r5
            r19.A05(r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x03b2:
            if (r18 == 0) goto L_0x0508
            android.widget.LinearLayout r8 = r6.A0Q
            r0 = 38
            X.C67113Yo.A00(r8, r6, r5, r7, r0)
        L_0x03bb:
            android.content.Context r9 = r6.getContext()
            X.9lY r0 = r5.A0M
            java.lang.CharSequence r11 = X.AnonymousClass1FR.A01(r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x04aa
            r1.setVisibility(r3)
        L_0x03ce:
            X.9lY r0 = r5.A0M
            java.lang.String r0 = r0.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04a4
            X.1EU r0 = r6.A09
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r11 = r0.A05
            X.9lY r0 = r5.A0M
            java.lang.String r9 = r0.A0M
            r0 = -1
            X.9lY r11 = r11.A0L(r9, r2, r0)
            if (r11 == 0) goto L_0x04a4
            int r1 = r11.A02
            r0 = 18
            if (r1 == r0) goto L_0x04a4
            r0 = 2131433375(0x7f0b179f, float:1.8488534E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r6, r0)
            r6.setRequestPaymentText(r11, r0)
            r0 = 2131433379(0x7f0b17a3, float:1.8488542E38)
            X.1RJ r15 = X.C36341k9.A0X(r6, r0)
            android.view.View r13 = r15.A01()
            r0 = 2131433378(0x7f0b17a2, float:1.848854E38)
            android.widget.TextView r14 = X.C36391kE.A0O(r6, r0)
            android.content.Context r12 = r6.getContext()
            X.0ts r9 = r6.A0E
            X.9lY r0 = r5.A0M
            X.16X r1 = r0.A08
            X.16U r0 = r0.A03()
            android.text.SpannableStringBuilder r1 = X.AnonymousClass9Zb.A00(r12, r9, r0, r1)
            boolean r0 = r6.A0C()
            if (r0 == 0) goto L_0x049a
            X.6c9 r12 = r11.A05()
            if (r12 == 0) goto L_0x0490
            r0 = 2131433381(0x7f0b17a5, float:1.8488546E38)
            android.widget.TextView r9 = X.C36391kE.A0O(r13, r0)
            r14.setVisibility(r3)
            r15.A03(r4)
            r9.setText(r1)
            X.1Yo r1 = r6.A0A
            r0 = 2131433380(0x7f0b17a4, float:1.8488544E38)
            android.widget.ImageView r0 = X.C36401kF.A0G(r13, r0)
            r1.A02(r0, r9, r12)
        L_0x0447:
            android.widget.FrameLayout r1 = r6.A0P
            r1.setVisibility(r4)
            r0 = 24
            X.AnonymousClass3YF.A00(r1, r6, r11, r0)
        L_0x0451:
            X.9lY r11 = r5.A0M
            int r1 = r11.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x00e2
            X.9lC r9 = r6.A0B
            java.lang.String r1 = r11.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0485
            java.util.HashSet r0 = r9.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0485
            r0 = r29
            r0.setVisibility(r3)
            r0 = r28
            r0.A03(r4)
        L_0x0475:
            r10.B1n(r2)
            r0 = 2131429239(0x7f0b0777, float:1.8480145E38)
            X.C36341k9.A10(r6, r0, r3)
            r0 = 39
            X.C67113Yo.A00(r8, r6, r5, r7, r0)
            goto L_0x00e2
        L_0x0485:
            r0 = r29
            r0.setVisibility(r4)
            r0 = r28
            r0.A03(r3)
            goto L_0x0475
        L_0x0490:
            r14.setVisibility(r4)
            r14.setText(r1)
            r15.A03(r3)
            goto L_0x0447
        L_0x049a:
            r14.setVisibility(r4)
            r14.setText(r1)
            r15.A03(r3)
            goto L_0x0447
        L_0x04a4:
            android.widget.FrameLayout r0 = r6.A0P
            r0.setVisibility(r3)
            goto L_0x0451
        L_0x04aa:
            android.content.res.Resources r9 = r6.getResources()
            r0 = r17
            X.C36351kA.A15(r9, r1, r0)
            r1.setText(r11)
            android.view.ViewParent r13 = r1.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            X.0Yx r12 = new X.0Yx
            r12.<init>()
            r12.A0B(r13)
            r14 = 4
            r11 = 6
            int r9 = r1.getId()
            if (r18 == 0) goto L_0x04e3
            r0 = 3
            r12.A08(r9, r0, r4, r0)
            int r0 = r1.getId()
            r12.A08(r0, r14, r4, r14)
            int r0 = r1.getId()
            r12.A08(r0, r11, r4, r11)
        L_0x04de:
            r12.A09(r13)
            goto L_0x03ce
        L_0x04e3:
            java.util.HashMap r14 = r12.A00
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r0 = r14.containsKey(r9)
            if (r0 == 0) goto L_0x0500
            java.lang.Object r0 = r14.get(r9)
            X.0UV r0 = (X.AnonymousClass0UV) r0
            r9 = -1
            X.0X0 r0 = r0.A02
            r0.A0B = r9
            r0.A0A = r9
            r0.A09 = r9
            r0.A0J = r9
        L_0x0500:
            int r0 = r1.getId()
            r12.A08(r0, r11, r4, r11)
            goto L_0x04de
        L_0x0508:
            boolean r0 = r6.A0C()
            if (r0 == 0) goto L_0x0521
            X.9lY r0 = r5.A0M
            if (r0 == 0) goto L_0x0521
            X.6c9 r0 = r0.A05()
            if (r0 == 0) goto L_0x0521
            android.widget.LinearLayout r8 = r6.A0Q
            r0 = 26
            X.AnonymousClass3YF.A00(r8, r6, r5, r0)
            goto L_0x03bb
        L_0x0521:
            android.widget.LinearLayout r8 = r6.A0Q
            r8.setOnClickListener(r2)
            goto L_0x03bb
        L_0x0528:
            r0 = 2131233453(0x7f080aad, float:1.8083044E38)
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            r12.setBackground(r0)
            goto L_0x038b
        L_0x0534:
            r11.setVisibility(r3)
            goto L_0x03b2
        L_0x0539:
            X.1RJ r0 = r6.A0Z
            if (r0 == 0) goto L_0x034b
            r0.A03(r3)
            goto L_0x034b
        L_0x0542:
            r12.setVisibility(r3)
            goto L_0x02b9
        L_0x0547:
            X.1EZ r0 = r6.A05
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0551
            goto L_0x027b
        L_0x0551:
            android.view.View r0 = r6.A0I
            if (r0 == 0) goto L_0x029b
            r0.setVisibility(r3)
            goto L_0x029b
        L_0x055a:
            r13 = r2
            goto L_0x025d
        L_0x055d:
            r0 = 2131432393(0x7f0b13c9, float:1.8486542E38)
            android.view.View r0 = r6.findViewById(r0)
            r10.BkP(r0)
            goto L_0x024a
        L_0x0569:
            X.9P4 r13 = new X.9P4
            r13.<init>()
            X.0yC r12 = r6.A0G
            X.0ts r11 = r6.A0E
            X.1Yo r0 = r6.A0A
            X.A9o r10 = new X.A9o
            r10.<init>(r11, r12, r0, r13)
            goto L_0x023e
        L_0x057b:
            r0 = r21
            r0.setVisibility(r4)
            goto L_0x0229
        L_0x0582:
            r0 = r14
            goto L_0x01cf
        L_0x0585:
            com.whatsapp.TextEmojiLabel r12 = r6.A0T
            r12.setVisibility(r3)
            goto L_0x0218
        L_0x058c:
            int r17 = X.AnonymousClass1FR.A00(r0)
            goto L_0x01af
        L_0x0592:
            X.1FR r0 = r6.A0C
            int r13 = r0.A0C(r12)
            X.1FR r0 = r6.A0C
            java.lang.String r10 = r0.A0X(r2, r5)
            goto L_0x019b
        L_0x05a0:
            r7 = r2
        L_0x05a1:
            r20 = r2
            r19 = r2
            goto L_0x0170
        L_0x05a7:
            boolean r0 = X.C203359nq.A0C(r5)
            if (r0 == 0) goto L_0x05c9
            r0 = 11
            X.0xT r1 = r6.A0F
            if (r13 != r0) goto L_0x05c6
            java.lang.String r0 = "26000015"
        L_0x05b5:
            java.lang.String r7 = r1.A05(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131892237(0x7f12180d, float:1.9419217E38)
            java.lang.String r0 = X.C36351kA.A0w(r1, r7, r8, r0)
            goto L_0x005b
        L_0x05c6:
            java.lang.String r0 = "835452491239734"
            goto L_0x05b5
        L_0x05c9:
            X.0yC r13 = r6.A0G
            r0 = 812(0x32c, float:1.138E-42)
            boolean r0 = r13.A0E(r0)
            if (r0 != 0) goto L_0x05dd
            X.0yC r13 = r6.A0G
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = r13.A0E(r0)
            if (r0 == 0) goto L_0x0607
        L_0x05dd:
            boolean r0 = r5 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0607
            r7 = r5
            X.2bx r7 = (X.C46962bx) r7
            r1.setVisibility(r4)
            X.3Sw r1 = r6.A0W
            r1.A05(r2, r7, r4)
            boolean r0 = X.C66013Ui.A0z(r7)
            if (r0 == 0) goto L_0x05f7
            r1.A03()
            goto L_0x0078
        L_0x05f7:
            boolean r0 = X.C66013Ui.A10(r7)
            if (r0 == 0) goto L_0x0602
            r1.A04()
            goto L_0x0078
        L_0x0602:
            r1.A02()
            goto L_0x0078
        L_0x0607:
            java.lang.String r0 = r5.A0b()
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 != 0) goto L_0x061d
            java.lang.String r0 = r5.A0b()
            r6.setMessageText(r0, r9, r5)
            r9.A0C()
            goto L_0x0075
        L_0x061d:
            r9.setVisibility(r3)
            X.9lY r0 = r5.A0M
            boolean r0 = X.C203419nz.A06(r0)
            if (r0 != 0) goto L_0x0078
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167841(0x7f070a61, float:1.7949967E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = X.C36371kC.A03(r6, r0)
            r12.setPadding(r1, r4, r0, r4)
            X.C36331k8.A0x(r12)
            android.view.ViewGroup$MarginLayoutParams r13 = X.AnonymousClass000.A0a(r7)
            int r0 = r12.getMeasuredHeight()
            int r7 = -r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167840(0x7f070a60, float:1.7949965E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r7 = r7 - r0
            r13.topMargin = r7
            goto L_0x0078
        L_0x0656:
            r7.A03(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IH.A2D():void");
    }

    public void BuP() {
        if (this.A0G.A0E(812) || this.A0G.A0E(811)) {
            this.A0W.A0G.A04();
        }
    }

    public int getMainChildMaxWidth() {
        if (this.A0d.BLu(getFMessage())) {
            return 0;
        }
        return C36441kJ.A05(getResources(), R.dimen.f7nameremoved) + (C36441kJ.A05(getResources(), R.dimen.f7nameremoved) * 2);
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(AnonymousClass000.A1V(r2.A0M));
        this.A0K = r2;
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A2D();
        }
    }

    public void BcW() {
        A1Y();
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A0O);
        innerFrameLayouts.add(this.A0P);
        return innerFrameLayouts;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
