package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2IQ  reason: invalid class name */
public abstract class AnonymousClass2IQ extends AnonymousClass8ZJ {
    public C19460v5 A00;
    public AnonymousClass3TU A01;
    public C20830yE A02;
    public C62163Fa A03;
    public AnonymousClass1Y4 A04;
    public AnonymousClass1ST A05;
    public AnonymousClass3P3 A06;
    public AnonymousClass1EM A07;
    public final C33541fX A08 = C48742hy.A00(this, 7);
    public final C33541fX A09 = C48742hy.A00(this, 5);
    public final C33541fX A0A = C48742hy.A00(this, 6);
    public final C33541fX A0B = C48742hy.A00(this, 8);
    public final C88974Ut A0C;

    public static void A0P(View view, View view2, AnonymousClass1RJ r9, AnonymousClass1RJ r10, boolean z, boolean z2) {
        A0Q(view, view2, r9, r10, z, z2, false, false);
    }

    public static void A0S(ConversationRowMediaControlView conversationRowMediaControlView, boolean z, boolean z2) {
        ConversationRowMediaControlView conversationRowMediaControlView2 = conversationRowMediaControlView;
        A0P(conversationRowMediaControlView2, conversationRowMediaControlView2.A00, conversationRowMediaControlView.A05, conversationRowMediaControlView.A04, z, z2);
    }

    public boolean A2K() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f8, code lost:
        if (r21 != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Q(android.view.View r16, android.view.View r17, X.AnonymousClass1RJ r18, X.AnonymousClass1RJ r19, boolean r20, boolean r21, boolean r22, boolean r23) {
        /*
            r7 = r16
            int r6 = r7.getWidth()
            r11 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r15 = 1
            r0 = 8
            r3 = 0
            r9 = r18
            int r1 = r9.A00()
            r5 = r17
            r8 = r19
            if (r20 == 0) goto L_0x00b6
            if (r1 != 0) goto L_0x0021
            int r1 = r8.A00()
            if (r1 == 0) goto L_0x00b1
        L_0x0021:
            r1 = 150(0x96, double:7.4E-322)
            if (r21 == 0) goto L_0x00b2
            r12 = 1056964608(0x3f000000, float:0.5)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1056964608(0x3f000000, float:0.5)
            r16 = 1056964608(0x3f000000, float:0.5)
            r17 = 1
            r18 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r10 = new android.view.animation.ScaleAnimation
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            android.view.animation.AnimationSet r10 = X.C36361kB.A0K(r10, r11, r4)
            r10.setDuration(r1)
            r5.startAnimation(r10)
        L_0x0040:
            r5.setVisibility(r0)
            android.view.View r5 = r9.A01()
            android.view.View r8 = r8.A01()
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r5.setVisibility(r3)
            r8.setVisibility(r3)
            r0 = 0
            r8.setContentDescription(r0)
            r0 = 2131231137(0x7f0801a1, float:1.8078347E38)
            if (r23 == 0) goto L_0x005f
            r0 = 2131232888(0x7f080878, float:1.8081898E38)
        L_0x005f:
            r8.setImageResource(r0)
            if (r21 == 0) goto L_0x00fc
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r4, r11)
            r3 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r3)
            r0.setStartOffset(r1)
            r5.startAnimation(r0)
            r8.startAnimation(r0)
        L_0x0077:
            X.C36331k8.A0x(r7)
            int r4 = r7.getMeasuredWidth()
            android.graphics.drawable.Drawable r1 = r7.getBackground()
            boolean r0 = r1 instanceof X.C36961la
            if (r0 != 0) goto L_0x0090
            X.1la r0 = new X.1la
            r2 = r22
            r0.<init>(r1, r2)
            r7.setBackground(r0)
        L_0x0090:
            android.graphics.drawable.Drawable r3 = r7.getBackground()
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r0 = java.lang.Math.max(r6, r4)
            r1.width = r0
            r0 = 0
            X.4VW r2 = new X.4VW
            r2.<init>(r3, r6, r4, r0)
            r0 = 9
            X.C89214Vr.A00(r2, r7, r3, r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r7.startAnimation(r2)
        L_0x00b1:
            return
        L_0x00b2:
            r5.clearAnimation()
            goto L_0x0040
        L_0x00b6:
            if (r1 != r0) goto L_0x00be
            int r1 = r8.A00()
            if (r1 == r0) goto L_0x00b1
        L_0x00be:
            r5.setVisibility(r3)
            if (r21 == 0) goto L_0x00e4
            r13 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r12 = new android.view.animation.ScaleAnimation
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 1056964608(0x3f000000, float:0.5)
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 1
            r18 = 1056964608(0x3f000000, float:0.5)
            r19 = 1
            r20 = 1056964608(0x3f000000, float:0.5)
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            android.view.animation.AnimationSet r3 = X.C36361kB.A0K(r12, r4, r11)
            r1 = 300(0x12c, double:1.48E-321)
            r3.setDuration(r1)
            r5.startAnimation(r3)
        L_0x00e4:
            android.view.View r1 = r9.A00
            if (r1 == 0) goto L_0x00eb
            r1.clearAnimation()
        L_0x00eb:
            r9.A03(r0)
            android.view.View r1 = r8.A00
            if (r1 == 0) goto L_0x00f5
            r1.clearAnimation()
        L_0x00f5:
            r8.A03(r0)
            if (r21 == 0) goto L_0x0102
            goto L_0x0077
        L_0x00fc:
            r5.clearAnimation()
            r8.clearAnimation()
        L_0x0102:
            r7.clearAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IQ.A0Q(android.view.View, android.view.View, X.1RJ, X.1RJ, boolean, boolean, boolean, boolean):void");
    }

    public void A1f() {
        this.A21.Boy(C80233v4.A00(this, 16));
    }

    public void A2H(View view, TextEmojiLabel textEmojiLabel, String str) {
        TextView textView;
        if (textEmojiLabel != null) {
            AnonymousClass2bU fMessage = getFMessage();
            A1w(fMessage);
            Resources resources = getResources();
            int A022 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
            int secondaryTextColor = getSecondaryTextColor();
            if (!TextUtils.isEmpty(str)) {
                textEmojiLabel.setVisibility(0);
                setMessageText(str, textEmojiLabel, fMessage);
                textView = this.A0G;
                textView.setTextColor(secondaryTextColor);
                this.A07.setPadding(resources.getDimensionPixelSize(R.dimen.f7nameremoved), 0, resources.getDimensionPixelSize(R.dimen.f7nameremoved), resources.getDimensionPixelSize(R.dimen.f7nameremoved));
                AnonymousClass000.A0a(view).topMargin = 0;
            } else {
                textEmojiLabel.setVisibility(8);
                textView = this.A0G;
                textView.setTextColor(A022);
                ViewGroup viewGroup = this.A07;
                viewGroup.setPadding(resources.getDimensionPixelSize(R.dimen.f7nameremoved), 0, resources.getDimensionPixelSize(R.dimen.f7nameremoved), 0);
                C36331k8.A0x(viewGroup);
                if (view != null) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    AnonymousClass000.A0a(view).topMargin = (-viewGroup.getMeasuredHeight()) - dimensionPixelSize;
                }
            }
            AnonymousClass1RJ r0 = this.A20;
            if (r0 != null) {
                C36441kJ.A0V(r0).setTextColor(textView.getTextColors());
            }
            ImageView imageView = this.A2U;
            if (imageView != null) {
                A0O(getContext(), imageView, this, 1);
            }
            ImageView imageView2 = this.A2V;
            if (imageView2 != null) {
                A0O(getContext(), imageView2, this, 2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r15.A04 == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2I(X.AnonymousClass3T1 r21) {
        /*
            r20 = this;
            r13 = r21
            X.3BG r1 = r13.A0V
            r7 = r20
            r0 = 2131435344(0x7f0b1f50, float:1.8492528E38)
            if (r1 == 0) goto L_0x0075
            android.view.ViewGroup r2 = X.C36411kG.A0P(r7, r0)
            if (r2 == 0) goto L_0x0074
            X.0yC r1 = r7.A0G
            X.1DU r0 = r7.A1U
            X.3Rh r15 = X.C65243Rh.A00(r1, r0, r13)
            r0 = 0
            r2.setVisibility(r0)
            X.3TU r0 = r7.A01
            if (r0 != 0) goto L_0x0053
            android.content.Context r4 = r7.getContext()
            X.4Ux r8 = r7.A0d
            X.1e2 r5 = r7.A0S
            X.1EM r11 = r7.A07
            X.1e6 r9 = r7.A1H
            X.1SV r12 = r7.A1y
            X.39u r6 = r7.A1S()
            X.0v5 r1 = r7.A00
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x003e
            r1.A02()
        L_0x003e:
            X.0yC r10 = r7.A0G
            X.3TU r3 = new X.3TU
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r7.A01 = r3
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r3.A0A
            X.C36401kF.A18(r0, r2)
            X.3TU r0 = r7.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0A
            X.AnonymousClass2IR.A0W(r0, r7)
        L_0x0053:
            X.4Ut r14 = r7.A0C
            boolean r0 = r14 instanceof X.C1491570b
            if (r0 == 0) goto L_0x005f
            boolean r0 = r15.A04
            r16 = 1
            if (r0 != 0) goto L_0x0061
        L_0x005f:
            r16 = 0
        L_0x0061:
            X.3TU r12 = r7.A01
            X.3Fa r0 = r7.A03
            boolean r17 = r0.A00(r13)
            X.3Fa r0 = r7.A03
            boolean r18 = r0.A01(r13)
            r19 = 0
            r12.A04(r13, r14, r15, r16, r17, r18, r19)
        L_0x0074:
            return
        L_0x0075:
            android.view.ViewGroup r1 = X.C36411kG.A0P(r7, r0)
            if (r1 == 0) goto L_0x0074
            X.3TU r0 = r7.A01
            if (r0 == 0) goto L_0x0087
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0A
            r1.removeView(r0)
            r0 = 0
            r7.A01 = r0
        L_0x0087:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IQ.A2I(X.3T1):void");
    }

    public AnonymousClass2bU getFMessage() {
        return (AnonymousClass2bU) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bU);
        this.A0K = r2;
    }

    public AnonymousClass2IQ(Context context, C89004Uw r3, AnonymousClass2bU r4) {
        super(context, r3, r4);
        this.A0C = C65853Ts.A01(context);
    }

    public static String A0N(AnonymousClass3T1 r2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("status-transition-");
        return AnonymousClass000.A0o(r2.A1J, A0u);
    }

    public static void A0O(Context context, ImageView imageView, AnonymousClass2IR r5, int i) {
        int i2;
        boolean A26 = r5.A26();
        AnonymousClass00C.A0D(context, 0);
        if (i != 0) {
            i2 = R.drawable.keep;
            if (i != 1) {
                i2 = R.drawable.vec_message_badge_pinned;
            }
        } else {
            i2 = R.drawable.message_star;
        }
        int i3 = R.color.f6nameremoved;
        if (A26) {
            i3 = R.color.f6nameremoved;
        }
        imageView.setImageDrawable(AnonymousClass3UF.A02(context, i2, i3));
    }

    public static void A0R(AnonymousClass2IQ r3, C64933Qa r4) {
        if (r3.A2J()) {
            return;
        }
        if (r3.A0d.Bt6()) {
            C225314u r1 = (C225314u) C18860tw.A01(r3.getContext(), C225314u.class);
            if (r1 != null) {
                r3.A0L.A03(r1);
                return;
            }
            return;
        }
        r3.getContext().startActivity(AnonymousClass190.A0X(r3.getContext(), r4.A00, r4.hashCode()));
    }

    public int A1Q(int i) {
        if (!AnonymousClass2bU.A02(getFMessage()) || !A2K()) {
            return super.A1Q(i);
        }
        if (C36401kF.A1U(AnonymousClass3TJ.A00(i, 13))) {
            return R.drawable.message_got_read_receipt_from_target_onmedia;
        }
        if (C36401kF.A1U(AnonymousClass3TJ.A00(i, 5))) {
            return R.drawable.message_got_receipt_from_target_onmedia;
        }
        if (i == 4) {
            return R.drawable.message_got_receipt_from_server_onmedia;
        }
        return R.drawable.message_unsent_onmedia;
    }

    public void A1o(ViewGroup viewGroup, TextView textView, AnonymousClass3T1 r4) {
        if (!C203369nr.A08(r4)) {
            super.A1o(viewGroup, textView, r4);
        }
    }

    public void A2F() {
        int i;
        AnonymousClass2bU fMessage = getFMessage();
        C80273v8.A00(this.A21, this, fMessage, 49);
        if (AnonymousClass2tU.A00(fMessage)) {
            AnonymousClass3P3 r0 = this.A06;
            C18740tg.A06(r0);
            r0.A01(fMessage);
            return;
        }
        AnonymousClass11F r1 = fMessage.A1J.A00;
        if (AnonymousClass2bU.A00(fMessage).A09 == 1) {
            int i2 = fMessage.A1I;
            AnonymousClass17Y r2 = this.A0R;
            if (i2 == 2) {
                i = R.string.f12nameremoved;
            } else {
                i = R.string.f12nameremoved;
                if (i2 == 9) {
                    i = R.string.f12nameremoved;
                }
            }
            r2.A04(i, 1);
            Log.e("ConversationRowMedia/downloadMedia/cannot download media message with suspicious content");
        } else if (AnonymousClass143.A0G(r1) && this.A1R.A02(r1)) {
            Log.e("ConversationRowMedia/downloadMedia/cannot download media message because group is integrity suspended");
            this.A0R.A04(R.string.f12nameremoved, 1);
        } else if (fMessage.A1h()) {
            this.A0Z.A0G(C36381kD.A0S(getContext()), fMessage, true);
        } else {
            Log.e("ConversationRowMedia/downloadMedia/cannot download media message with no media attached");
            this.A0R.A06(R.string.f12nameremoved, 0);
        }
    }

    public void A2G(View view, TextEmojiLabel textEmojiLabel) {
        A2H(view, textEmojiLabel, getFMessage().A1a());
    }

    public boolean A2J() {
        C65013Qj r1;
        AnonymousClass2bU fMessage = getFMessage();
        AnonymousClass1SV r2 = this.A1y;
        if (fMessage.A1J.A02 || (r1 = fMessage.A01) == null) {
            return false;
        }
        r1.A0c = true;
        r2.A0H(fMessage);
        A1Y();
        return true;
    }

    public ViewGroup getExternalAdContentHolder() {
        return C36411kG.A0P(this, R.id.web_page_preview_holder);
    }

    public AnonymousClass3XQ getTempFMessageMediaInfo() {
        String str;
        AnonymousClass2bU fMessage = getFMessage();
        File A012 = AnonymousClass2bU.A01(fMessage);
        String A1a = fMessage.A1a();
        if (A012 != null) {
            str = A012.toURI().toString();
        } else {
            str = null;
        }
        if (A1a == null || str == null) {
            return null;
        }
        return new AnonymousClass3XQ(fMessage.A0I, A1a, fMessage.A1I, str);
    }
}
