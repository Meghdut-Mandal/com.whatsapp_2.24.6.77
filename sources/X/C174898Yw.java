package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.Collections;

/* renamed from: X.8Yw  reason: invalid class name and case insensitive filesystem */
public class C174898Yw extends AnonymousClass2IR {
    public AnonymousClass1ND A00;
    public AnonymousClass1HJ A01;
    public AnonymousClass1SR A02;
    public AnonymousClass1HO A03;
    public C26211Jh A04;
    public AnonymousClass1YE A05;
    public C237919w A06;
    public C31031bA A07;
    public AnonymousClass005 A08;
    public boolean A09;
    public final TextEmojiLabel A0A;
    public final TextEmojiLabel A0B;
    public final TextEmojiLabel A0C;
    public final WaImageView A0D;
    public final C34661hR A0E = new C163677qa(this, 1);
    public final AnonymousClass1RJ A0F;
    public final AnonymousClass1RJ A0G;
    public final AnonymousClass1RJ A0H;

    public boolean A25() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    private C20530xi getVoipErrorFragmentBridge() {
        return (C20530xi) ((C20780y9) this.A28.get()).A01(C20530xi.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (((X.AnonymousClass2c9) r9).A00 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupActionButtons(android.content.Context r8, X.AnonymousClass2bJ r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.AnonymousClass2c9
            if (r0 == 0) goto L_0x000c
            r0 = r9
            X.2c9 r0 = (X.AnonymousClass2c9) r0
            X.2bM r1 = r0.A00
            r0 = 1
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r6 = 0
            r5 = 8
            if (r0 == 0) goto L_0x0061
            X.1RJ r2 = r7.A0G
            r2.A03(r6)
            r1 = 33
            X.3YF r0 = new X.3YF
            r0.<init>(r7, r9, r1)
            r2.A05(r0)
            long r0 = r9.A01
            r7.setupJoinCallViewContent(r0)
            X.3Qa r0 = r9.A1J
            X.11F r1 = r0.A00
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x003c
            boolean r0 = r1 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x005b
            X.17X r0 = r7.A1F
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x005b
        L_0x003c:
            long r3 = r9.A01
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
            X.1RJ r2 = r7.A0F
            r2.A03(r6)
            r1 = 40
            X.3Yo r0 = new X.3Yo
            r0.<init>((java.lang.Object) r7, (java.lang.Object) r9, (java.lang.Object) r8, (int) r1)
            r2.A05(r0)
        L_0x0055:
            X.1RJ r0 = r7.A0H
            r0.A03(r5)
            return
        L_0x005b:
            X.1RJ r0 = r7.A0F
            r0.A03(r5)
            goto L_0x0055
        L_0x0061:
            X.1RJ r0 = r7.A0G
            r0.A03(r5)
            X.1RJ r0 = r7.A0F
            r0.A03(r5)
            X.1RJ r2 = r7.A0H
            r2.A03(r6)
            r1 = 34
            X.3YF r0 = new X.3YF
            r0.<init>(r7, r9, r1)
            r2.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174898Yw.setupActionButtons(android.content.Context, X.2bJ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupBubbleIcon(X.AnonymousClass2bJ r4) {
        /*
            r3 = this;
            com.whatsapp.WaImageView r2 = r3.A0D
            boolean r0 = r4 instanceof X.AnonymousClass2c9
            if (r0 == 0) goto L_0x000f
            X.2c9 r4 = (X.AnonymousClass2c9) r4
            X.2bM r1 = r4.A00
            r0 = 2131234406(0x7f080e66, float:1.8084977E38)
            if (r1 == 0) goto L_0x0012
        L_0x000f:
            r0 = 2131234407(0x7f080e67, float:1.8084979E38)
        L_0x0012:
            r2.setImageResource(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174898Yw.setupBubbleIcon(X.2bJ):void");
    }

    private void setupCallTypeView(AnonymousClass2bJ r6) {
        boolean A1S = AnonymousClass000.A1S(r6.A00, 2);
        Context context = getContext();
        int i = R.string.f12nameremoved;
        if (A1S) {
            i = R.string.f12nameremoved;
        }
        String string = context.getString(i);
        int i2 = r6.A00;
        int i3 = R.drawable.ic_action_call;
        if (i2 == 2) {
            i3 = R.drawable.ic_action_videocall;
        }
        Drawable A002 = AnonymousClass00E.A00(getContext(), i3);
        C18740tg.A06(A002);
        TextEmojiLabel textEmojiLabel = this.A0B;
        textEmojiLabel.setText(C165597tg.A0a(AnonymousClass3UF.A08(A002, textEmojiLabel.getCurrentTextColor()), textEmojiLabel, string));
    }

    /* access modifiers changed from: private */
    public void setupJoinCallViewContent(long j) {
        Resources resources;
        int A052;
        TextView A0P = C36391kE.A0P(this.A0G.A01(), R.id.join_call);
        if (A0P != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (j < currentTimeMillis - 86400000) {
                A0P.setVisibility(0);
                A0P.setText(R.string.f12nameremoved);
                resources = getResources();
                A052 = R.color.f6nameremoved;
            } else if (currentTimeMillis < j) {
                A0P.setVisibility(8);
                return;
            } else {
                A0P.setVisibility(0);
                A0P.setText(R.string.f12nameremoved);
                resources = getResources();
                A052 = C36341k9.A05(A0P.getContext());
            }
            C36351kA.A15(resources, A0P, A052);
        }
    }

    public void A16() {
        if (!this.A09) {
            this.A09 = true;
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
            this.A02 = (AnonymousClass1SR) r1.A2t.get();
            this.A01 = (AnonymousClass1HJ) r1.A1O.get();
            this.A06 = (C237919w) r1.A3J.get();
            this.A04 = (C26211Jh) r1.A7X.get();
            this.A03 = (AnonymousClass1HO) r1.A4M.get();
            this.A07 = (C31031bA) r1.A7W.get();
            this.A05 = (AnonymousClass1YE) r1.A4u.get();
            this.A08 = C18840tu.A00(r1.AK3);
            this.A00 = (AnonymousClass1ND) r1.A1N.get();
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A2D();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2D() {
        /*
            r8 = this;
            X.3T1 r5 = r8.A0K
            X.2bJ r5 = (X.AnonymousClass2bJ) r5
            boolean r0 = r5 instanceof X.AnonymousClass5JA
            if (r0 == 0) goto L_0x0012
            r0 = r5
            X.5JA r0 = (X.AnonymousClass5JA) r0
            X.11F r0 = r0.A01
            if (r0 == 0) goto L_0x0012
            r5.A0q(r0)
        L_0x0012:
            long r1 = r5.A01
            long r3 = java.lang.System.currentTimeMillis()
            int r3 = X.AnonymousClass6XI.A00(r3, r1)
            r0 = 1
            if (r3 != r0) goto L_0x007d
            X.0ts r0 = r8.A0E
            java.lang.String r0 = X.C20040wv.A01(r0)
        L_0x0025:
            if (r0 == 0) goto L_0x00ab
            X.0ts r7 = r8.A0E
            r6 = 2131893809(0x7f121e31, float:1.9422405E38)
            java.lang.Object[] r4 = X.C90474aD.A1a(r0)
            r3 = 1
            java.lang.String r0 = X.C20040wv.A04(r7, r1)
            r4[r3] = r0
            java.lang.String r6 = r7.A0D(r6, r4)
        L_0x003b:
            X.0ts r2 = r8.A0E
            long r0 = r5.A01
            java.lang.String r4 = X.AnonymousClass3UM.A00(r2, r0)
            com.whatsapp.TextEmojiLabel r3 = r8.A0A
            java.lang.String r2 = r5.A02
            int r1 = r2.length()
            r0 = 32
            if (r1 <= r0) goto L_0x0059
            int r1 = X.AnonymousClass14B.A00(r2, r0)
            java.lang.String r0 = r5.A02
            java.lang.String r2 = X.C90514aH.A0z(r0, r1)
        L_0x0059:
            r3.setText(r2)
            com.whatsapp.TextEmojiLabel r3 = r8.A0C
            android.content.Context r2 = r8.getContext()
            r1 = 2131893810(0x7f121e32, float:1.9422407E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0M()
            X.C36331k8.A1N(r6, r4, r0)
            X.C36341k9.A0s(r2, r3, r0, r1)
            r8.setupBubbleIcon(r5)
            r8.setupCallTypeView(r5)
            android.content.Context r0 = r8.getContext()
            r8.setupActionButtons(r0, r5)
            return
        L_0x007d:
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = X.AnonymousClass6XI.A00(r3, r1)
            if (r0 != 0) goto L_0x008e
            X.0ts r0 = r8.A0E
            java.lang.String r0 = X.C20040wv.A00(r0)
            goto L_0x0025
        L_0x008e:
            long r3 = java.lang.System.currentTimeMillis()
            int r3 = X.AnonymousClass6XI.A00(r3, r1)
            r0 = -1
            if (r3 != r0) goto L_0x00ab
            X.0ts r4 = r8.A0E
            java.util.Locale r3 = X.C36401kF.A0x(r4)
            r0 = 273(0x111, float:3.83E-43)
            java.lang.String r0 = r4.A0A(r0)
            java.lang.String r0 = X.C20040wv.A0A(r3, r0)
            goto L_0x0025
        L_0x00ab:
            X.0ts r0 = r8.A0E
            java.lang.String r6 = X.C20040wv.A07(r0, r1)
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174898Yw.A2D():void");
    }

    public /* synthetic */ void A2E(Context context, AnonymousClass2bJ r6) {
        C64933Qa r0 = r6.A1J;
        AnonymousClass11F r1 = r0.A00;
        if (r0.A02 || ((r1 instanceof GroupJid) && this.A1F.A0D((GroupJid) r1))) {
            SpannableString spannableString = new SpannableString(context.getString(R.string.f12nameremoved));
            spannableString.setSpan(new ForegroundColorSpan(-65536), 0, spannableString.length(), 0);
            C39001qm A002 = AnonymousClass3LW.A00(context);
            A002.A0q(context.getString(R.string.f12nameremoved));
            A002.A0r(true);
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            A002.A0i(new C163437qC(r6, this, 8), spannableString);
            C36341k9.A11(A002);
        }
    }

    public /* synthetic */ void A2F(AnonymousClass147 r13, AnonymousClass2bJ r14) {
        C19970wo r4 = this.A19;
        Context context = getContext();
        AnonymousClass17Y r1 = this.A0R;
        long j = r14.A1N;
        AnonymousClass1ND r2 = this.A00;
        AnonymousClass1HJ r5 = this.A01;
        C26211Jh r7 = this.A04;
        AnonymousClass3UL.A05(context, r1, r2, getVoipErrorFragmentBridge(), r4, r5, this.A03, r7, r13, 21, j);
    }

    public AnonymousClass2bJ getFMessage() {
        return (AnonymousClass2bJ) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bJ);
        this.A0K = r2;
    }

    public C174898Yw(Context context, C89004Uw r4, AnonymousClass2bJ r5) {
        super(context, r4, r5);
        A16();
        setClickable(true);
        setLongClickable(false);
        this.A0B = C36401kF.A0O(this, R.id.call_type);
        this.A0A = C36401kF.A0O(this, R.id.call_title);
        this.A0C = C36401kF.A0O(this, R.id.scheduled_time);
        this.A0D = C36431kI.A0X(this, R.id.scheduled_call_bubble_icon);
        this.A0G = C36341k9.A0X(this, R.id.action_join_stub);
        this.A0F = C36341k9.A0X(this, R.id.action_cancel_stub);
        this.A0H = C36341k9.A0X(this, R.id.canceled_stub);
        A1Y();
    }

    public void A1Y() {
        A2D();
        super.A1Y();
    }

    public /* synthetic */ void A2G(AnonymousClass2bJ r6) {
        AnonymousClass2bM r1;
        Object A0J;
        Activity A062 = C36361kB.A06(this);
        if ((A062 instanceof C225314u) && (r6 instanceof AnonymousClass2c9) && (r1 = ((AnonymousClass2c9) r6).A00) != null) {
            if (C66013Ui.A0R(this.A0T, r1)) {
                A0J = C36441kJ.A0n(this.A0T);
            } else {
                A0J = r1.A0J();
            }
            Bundle A072 = AnonymousClass001.A07();
            if (A0J != null) {
                A072.putParcelableArrayList("user_jids", C36441kJ.A15(Collections.singletonList(A0J)));
            }
            getVoipErrorFragmentBridge();
            ((C225314u) A062).Btl(VoipErrorDialogFragment.A03(A072, new AnonymousClass3FU(), 32), (String) null);
        }
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

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A07.registerObserver(this.A0E);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A07.unregisterObserver(this.A0E);
    }
}
