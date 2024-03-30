package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;

/* renamed from: X.2IB  reason: invalid class name */
public class AnonymousClass2IB extends AnonymousClass8ZS {
    public AnimatorSet A00;
    public AnimatorSet A01;
    public View A02;
    public View A03;
    public FrameLayout A04 = ((FrameLayout) findViewById(R.id.hd_invisible_touch));
    public TextView A05 = C36391kE.A0P(this, R.id.control_btn);
    public ConstraintLayout A06;
    public TextEmojiLabel A07;
    public WaTextView A08;
    public ConversationRowImage$RowImageView A09 = ((ConversationRowImage$RowImageView) findViewById(R.id.image));
    public AnonymousClass1D1 A0A;
    public AnonymousClass1RJ A0B;
    public AnonymousClass1RJ A0C;
    public AnonymousClass1RJ A0D;
    public AnonymousClass1RJ A0E;
    public AnonymousClass1RJ A0F;
    public AnonymousClass1RJ A0G;
    public boolean A0H;
    public final C160527l9 A0I = new C79343tZ(this);

    public static final ObjectAnimator A0B(Property property, View view, Interpolator interpolator, float f, float f2, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, new float[]{f, f2});
        ofFloat.setInterpolator(interpolator);
        ofFloat.setDuration(j);
        return ofFloat;
    }

    public void A1Y() {
        AnonymousClass2IR.A0d(this, false);
        A0K(false);
    }

    public boolean A2K() {
        return true;
    }

    private void A0C() {
        FrameLayout frameLayout = this.A04;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        AnonymousClass1RJ r0 = this.A0E;
        if (r0 != null) {
            r0.A03(8);
        }
    }

    private void A0D() {
        C36341k9.A0y(this.A04);
        AnonymousClass1RJ r1 = this.A0E;
        if (r1 != null) {
            r1.A03(0);
            C36331k8.A0q(getContext(), this.A09, R.string.f12nameremoved);
        }
    }

    public static void A0E(Bitmap bitmap, AnonymousClass2IB r37) {
        AnonymousClass1RJ r11;
        TransitionDrawable transitionDrawable;
        AnonymousClass2IB r0 = r37;
        FrameLayout frameLayout = r0.A04;
        if (frameLayout != null && frameLayout.getVisibility() != 0 && (r11 = r0.A0E) != null) {
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = r0.A09;
            Resources resources = r0.getResources();
            AnonymousClass00C.A0D(conversationRowImage$RowImageView, 0);
            AnonymousClass00C.A0D(resources, 2);
            Drawable drawable = conversationRowImage$RowImageView.getDrawable();
            Bitmap bitmap2 = bitmap;
            if (drawable == null) {
                transitionDrawable = null;
            } else {
                transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(resources, bitmap2)});
                transitionDrawable.setCrossFadeEnabled(false);
            }
            ConstraintLayout constraintLayout = r0.A06;
            AnonymousClass1RJ r15 = r0.A0C;
            View A012 = r15.A01();
            AnonymousClass1RJ r14 = r0.A0F;
            View A013 = r14.A01();
            AnonymousClass00C.A0D(constraintLayout, 0);
            int A042 = C36361kB.A04(frameLayout, A012, 1);
            AnonymousClass00C.A0D(A013, 3);
            AnimatorSet A0C2 = C36441kJ.A0C();
            Interpolator accelerateInterpolator = new AccelerateInterpolator();
            Animator[] animatorArr = new Animator[3];
            Property property = View.SCALE_X;
            AnonymousClass00C.A09(property);
            Interpolator interpolator = accelerateInterpolator;
            ConstraintLayout constraintLayout2 = constraintLayout;
            animatorArr[0] = A0B(property, constraintLayout2, interpolator, 0.5f, 1.0f, 250);
            Property property2 = View.SCALE_Y;
            AnonymousClass00C.A09(property2);
            animatorArr[1] = A0B(property2, constraintLayout2, interpolator, 0.5f, 1.0f, 250);
            Property property3 = View.ALPHA;
            AnonymousClass00C.A09(property3);
            A0C2.playTogether(C36341k9.A0m(A0B(property3, constraintLayout, accelerateInterpolator, 0.0f, 1.0f, 250), animatorArr, A042));
            FrameLayout frameLayout2 = frameLayout;
            A0C2.addListener(new AnonymousClass4VJ(frameLayout2, A013, A012, constraintLayout, 1));
            r0.A01 = A0C2;
            View view = r0.A02;
            View A014 = r11.A01();
            AnimatorSet animatorSet = r0.A01;
            C18740tg.A06(animatorSet);
            AnonymousClass00C.A0D(view, 0);
            AnonymousClass00C.A0D(A014, 1);
            AnonymousClass00C.A0D(animatorSet, 3);
            AnimatorSet A0C3 = C36441kJ.A0C();
            Interpolator accelerateInterpolator2 = new AccelerateInterpolator();
            Animator[] animatorArr2 = new Animator[6];
            Property property4 = View.SCALE_X;
            AnonymousClass00C.A09(property4);
            View view2 = view;
            Interpolator interpolator2 = accelerateInterpolator2;
            animatorArr2[0] = A0B(property4, view2, interpolator2, 1.0f, 0.2f, 250);
            Property property5 = View.SCALE_Y;
            AnonymousClass00C.A09(property5);
            animatorArr2[1] = A0B(property5, view2, interpolator2, 1.0f, 0.2f, 250);
            Property property6 = View.SCALE_X;
            AnonymousClass00C.A09(property6);
            animatorArr2[2] = A0B(property6, A014, accelerateInterpolator2, 1.0f, 0.5f, 250);
            animatorArr2[3] = A0B(property5, A014, interpolator2, 1.0f, 0.5f, 250);
            Property property7 = property3;
            animatorArr2[4] = A0B(property7, view, interpolator2, 1.0f, 0.0f, 250);
            A0C3.playTogether(C36341k9.A0m(A0B(property7, A014, interpolator2, 1.0f, 0.0f, 250), animatorArr2, 5));
            A0C3.addListener(new AnonymousClass4VG(animatorSet, transitionDrawable, frameLayout2, view, A014, 0));
            r0.A00 = A0C3;
            r0.setImageDrawable(bitmap2, transitionDrawable);
            r0.A00.start();
            r0.A1d();
            C33541fX r1 = r0.A08;
            frameLayout.setOnClickListener(r1);
            r15.A05(r1);
            r14.A05(r1);
            conversationRowImage$RowImageView.setOnClickListener(r0.A0B);
            C36331k8.A0q(r0.getContext(), conversationRowImage$RowImageView, R.string.f12nameremoved);
        }
    }

    public static void A0F(Bitmap bitmap, AnonymousClass2IB r27) {
        TransitionDrawable transitionDrawable;
        AnonymousClass2IB r1 = r27;
        AnonymousClass1RJ r9 = r1.A0E;
        if (r9 != null) {
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = r1.A09;
            Resources resources = r1.getResources();
            AnonymousClass00C.A0D(conversationRowImage$RowImageView, 0);
            AnonymousClass00C.A0D(resources, 2);
            Drawable drawable = conversationRowImage$RowImageView.getDrawable();
            Bitmap bitmap2 = bitmap;
            if (drawable == null) {
                transitionDrawable = null;
            } else {
                transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(resources, bitmap2)});
                transitionDrawable.setCrossFadeEnabled(false);
            }
            ConstraintLayout constraintLayout = r1.A06;
            FrameLayout frameLayout = r1.A04;
            C18740tg.A04(frameLayout);
            View A012 = r1.A0F.A01();
            View A013 = r1.A0C.A01();
            WaTextView waTextView = r1.A08;
            AnonymousClass00C.A0D(constraintLayout, 0);
            int A042 = C36361kB.A04(frameLayout, A012, 1);
            C36331k8.A1G(A013, 3, waTextView);
            AnimatorSet A0C2 = C36441kJ.A0C();
            Interpolator accelerateInterpolator = new AccelerateInterpolator();
            Animator[] animatorArr = new Animator[3];
            Property property = View.SCALE_X;
            AnonymousClass00C.A09(property);
            ConstraintLayout constraintLayout2 = constraintLayout;
            Interpolator interpolator = accelerateInterpolator;
            animatorArr[0] = A0B(property, constraintLayout2, interpolator, 0.5f, 1.0f, 250);
            Property property2 = View.SCALE_Y;
            AnonymousClass00C.A09(property2);
            animatorArr[1] = A0B(property2, constraintLayout2, interpolator, 0.5f, 1.0f, 250);
            Property property3 = View.ALPHA;
            AnonymousClass00C.A09(property3);
            A0C2.playTogether(C36341k9.A0m(A0B(property3, constraintLayout, accelerateInterpolator, 0.0f, 1.0f, 250), animatorArr, A042));
            ConstraintLayout constraintLayout3 = constraintLayout;
            A0C2.addListener(new AnonymousClass4VG(frameLayout, A012, constraintLayout3, A013, waTextView, A042));
            View view = r1.A02;
            View A014 = r9.A01();
            AnonymousClass00C.A0D(view, 0);
            AnonymousClass00C.A0D(A014, 1);
            AnimatorSet A0C3 = C36441kJ.A0C();
            Interpolator accelerateInterpolator2 = new AccelerateInterpolator();
            Animator[] animatorArr2 = new Animator[6];
            Property property4 = View.SCALE_X;
            AnonymousClass00C.A09(property4);
            View view2 = view;
            Interpolator interpolator2 = accelerateInterpolator2;
            animatorArr2[0] = A0B(property4, view2, interpolator2, 1.0f, 0.2f, 250);
            animatorArr2[1] = A0B(property4, A014, accelerateInterpolator2, 1.0f, 0.5f, 250);
            Property property5 = View.SCALE_Y;
            AnonymousClass00C.A09(property5);
            animatorArr2[2] = A0B(property5, view2, interpolator2, 1.0f, 0.2f, 250);
            Interpolator interpolator3 = accelerateInterpolator2;
            animatorArr2[3] = A0B(property5, A014, interpolator3, 1.0f, 0.5f, 250);
            Property property6 = property3;
            animatorArr2[4] = A0B(property6, view, interpolator3, 1.0f, 0.0f, 250);
            A0C3.playTogether(C36341k9.A0m(A0B(property6, A014, interpolator3, 1.0f, 0.0f, 250), animatorArr2, 5));
            A0C3.addListener(new AnonymousClass4VJ(A0C2, transitionDrawable, view, A014, 0));
            r1.setImageDrawable(bitmap2, transitionDrawable);
            A0C3.start();
        }
    }

    private void A0H(AnonymousClass3T1 r9, boolean z, boolean z2) {
        C33541fX r0;
        View view = this.A02;
        view.setVisibility(0);
        A0C();
        AnonymousClass1RJ r4 = this.A0G;
        AnonymousClass1RJ r5 = this.A0B;
        TextView textView = this.A05;
        AnonymousClass2IQ.A0P(view, textView, r4, r5, true, !z);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        C36331k8.A0q(getContext(), conversationRowImage$RowImageView, R.string.f12nameremoved);
        if (r9.A1J.A02) {
            r0 = this.A0B;
        } else {
            r0 = null;
        }
        conversationRowImage$RowImageView.setOnClickListener(r0);
        C33541fX r02 = this.A08;
        textView.setOnClickListener(r02);
        r4.A05(r02);
        if (z2) {
            A0D();
        } else {
            C36421kH.A1F(this.A0E);
        }
    }

    private void A0I(C46882bp r17, boolean z, boolean z2) {
        View view = this.A02;
        view.setVisibility(0);
        A0C();
        AnonymousClass1RJ r6 = this.A0G;
        AnonymousClass1RJ r7 = this.A0B;
        TextView textView = this.A05;
        AnonymousClass2IQ.A0P(view, textView, r6, r7, false, !z);
        if (!C54732tQ.A00(getFMessage())) {
            textView.setText(R.string.f12nameremoved);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
            textView.setOnClickListener(this.A0A);
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
            conversationRowImage$RowImageView.setOnClickListener(this.A0B);
            C36331k8.A0q(getContext(), conversationRowImage$RowImageView, R.string.f12nameremoved);
        } else {
            C46882bp r0 = r17;
            A1r(textView, (Integer) null, Collections.singletonList(r0), r0.A00);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
            C33541fX r02 = this.A09;
            textView.setOnClickListener(r02);
            ConversationRowImage$RowImageView conversationRowImage$RowImageView2 = this.A09;
            conversationRowImage$RowImageView2.setOnClickListener(r02);
            Context context = getContext();
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = textView.getText();
            C36371kC.A14(context, conversationRowImage$RowImageView2, A0L, R.string.f12nameremoved);
            C33521fV.A03(conversationRowImage$RowImageView2, R.string.f12nameremoved);
        }
        if (z2) {
            A0D();
        } else {
            C36421kH.A1F(this.A0E);
        }
    }

    private void A0J(boolean z) {
        View view = this.A02;
        view.setVisibility(8);
        A0C();
        AnonymousClass1RJ r4 = this.A0G;
        AnonymousClass1RJ r5 = this.A0B;
        TextView textView = this.A05;
        AnonymousClass2IQ.A0P(view, textView, r4, r5, false, false);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        C36331k8.A0q(getContext(), conversationRowImage$RowImageView, R.string.f12nameremoved);
        C33541fX r0 = this.A0B;
        textView.setOnClickListener(r0);
        conversationRowImage$RowImageView.setOnClickListener(r0);
        if (z) {
            A0D();
        } else {
            C36421kH.A1F(this.A0E);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0107, code lost:
        if (X.C37541mm.A09(r0) == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r5 <= 500) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0K(boolean r26) {
        /*
            r25 = this;
            r0 = r25
            X.2bp r3 = r0.getFMessage()
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r0.A09
            X.2bU r2 = r0.getFMessage()
            java.lang.String r2 = r2.A02
            if (r2 == 0) goto L_0x0019
            int r5 = r2.length()
            r4 = 500(0x1f4, float:7.0E-43)
            r2 = 0
            if (r5 > r4) goto L_0x001a
        L_0x0019:
            r2 = 1
        L_0x001a:
            r1.setPortraitPreviewEnabled(r2)
            r0.setOverlayType(r3)
            X.3Qj r13 = r3.A01
            r7 = 0
            r2 = 1
            if (r13 != 0) goto L_0x0039
            r1.setImageBitmap(r7)
            r1.A04(r2, r2)
            r1.setOnClickListener(r7)
            android.view.View r2 = r0.A02
            r1 = 4
            r2.setVisibility(r1)
            r0.A0C()
        L_0x0038:
            return
        L_0x0039:
            r6 = r26
            if (r26 == 0) goto L_0x0054
            android.widget.TextView r5 = r0.A05
            java.util.List r4 = java.util.Collections.singletonList(r3)
            r5.setTag(r4)
            r1.setImageBitmap(r7)
            com.whatsapp.WaTextView r5 = r0.A08
            if (r5 == 0) goto L_0x0054
            java.util.List r4 = java.util.Collections.singletonList(r3)
            r5.setTag(r4)
        L_0x0054:
            X.3Qj r4 = new X.3Qj
            r4.<init>(r13)
            r1.setImageData(r4)
            boolean r4 = r0.A0O
            r1.setInAlbum(r4)
            X.4Ux r5 = r0.A0d
            X.2bp r4 = r0.getFMessage()
            boolean r4 = r5.BLu(r4)
            r1.setFullWidth(r4)
            boolean r4 = X.C203369nr.A08(r3)
            r1.A0G = r4
            if (r4 == 0) goto L_0x0090
            android.content.res.Resources r5 = r0.getResources()
            r4 = 2131165665(0x7f0701e1, float:1.7945554E38)
            int r4 = r5.getDimensionPixelSize(r4)
            r1.A06 = r4
            android.content.res.Resources r5 = r0.getResources()
            r4 = 2131165664(0x7f0701e0, float:1.7945551E38)
            int r4 = r5.getDimensionPixelSize(r4)
            r1.A05 = r4
        L_0x0090:
            java.lang.String r4 = X.AnonymousClass3RL.A01(r3)
            X.C011004s.A08(r1, r4)
            X.C37541mm.A04(r0, r3)
            X.C33521fV.A01(r1)
            android.widget.FrameLayout r8 = r0.A04
            if (r8 == 0) goto L_0x030c
            boolean r4 = A0M(r0)
            if (r4 == 0) goto L_0x030c
            X.2bp r4 = r0.getFMessage()
            X.3Qj r4 = r4.A01
            if (r4 != 0) goto L_0x0306
            r5 = 0
        L_0x00b0:
            X.2bU r4 = r0.getFMessage()
            boolean r4 = X.C66013Ui.A0z(r4)
            if (r4 == 0) goto L_0x0171
            if (r5 == 0) goto L_0x016d
            X.1RJ r5 = r0.A0E
            if (r5 == 0) goto L_0x0103
            r2 = 0
            r8.setVisibility(r2)
            android.view.View r4 = r0.A02
            r2 = 8
            r4.setVisibility(r2)
            X.C36411kG.A1L(r5, r2)
            r19 = r26 ^ 1
            androidx.constraintlayout.widget.ConstraintLayout r14 = r0.A06
            X.1RJ r5 = r0.A0F
            X.1RJ r4 = r0.A0C
            X.1RJ r2 = r0.A0D
            android.view.View r15 = r2.A01()
            r20 = 1
            r21 = 1
            r18 = 1
            r16 = r5
            r17 = r4
            X.AnonymousClass2IQ.A0Q(r14, r15, r16, r17, r18, r19, r20, r21)
            android.content.Context r7 = r0.getContext()
            r2 = 2131886352(0x7f120110, float:1.940728E38)
            X.C36331k8.A0q(r7, r1, r2)
            X.1fX r2 = r0.A0B
            r1.setOnClickListener(r2)
            X.1fX r2 = r0.A08
            r8.setOnClickListener(r2)
            r4.A05(r2)
            r5.A05(r2)
        L_0x0103:
            boolean r2 = X.C37541mm.A09(r0)
            if (r2 != 0) goto L_0x010c
        L_0x0109:
            r0.A1d()
        L_0x010c:
            X.AnonymousClass2IR.A0W(r1, r0)
            android.view.View r4 = r0.A03
            com.whatsapp.TextEmojiLabel r2 = r0.A07
            r0.A2G(r4, r2)
            X.3Qa r4 = r3.A1J
            boolean r2 = r4.A02
            r1.setOutgoing(r2)
            r5 = 0
            r1.A0F = r5
            r0.setImageViewDimensions(r3, r13)
            X.1SV r2 = r0.A1y
            X.C18740tg.A06(r2)
            boolean r2 = r0.A0H
            if (r2 != 0) goto L_0x0140
            X.2bp r2 = r0.getFMessage()
            X.3Qj r2 = r2.A01
            if (r2 == 0) goto L_0x0165
            boolean r2 = r2.A03()
            if (r2 == 0) goto L_0x0165
            boolean r2 = A0M(r0)
            if (r2 == 0) goto L_0x0165
        L_0x0140:
            if (r26 != 0) goto L_0x0165
            X.1SV r6 = r0.A1y
            X.7l9 r2 = r0.A0I
            r11 = 0
            r7 = r1
            r8 = r3
            r9 = r2
            r10 = r4
            r6.A0E(r7, r8, r9, r10, r11)
        L_0x014e:
            r0.A0H = r5
            r0.A2I(r3)
            X.0yC r2 = r0.A0G
            r1 = 3419(0xd5b, float:4.791E-42)
            r2.A0E(r1)
            boolean r1 = r0.A0O
            if (r1 != 0) goto L_0x0038
            r0.A20(r3)
            r0.A1z(r3)
            return
        L_0x0165:
            X.1SV r4 = r0.A1y
            X.7l9 r2 = r0.A0I
            r4.A0C(r1, r3, r2)
            goto L_0x014e
        L_0x016d:
            r0.A0H(r3, r6, r2)
            goto L_0x0103
        L_0x0171:
            boolean r4 = X.C37541mm.A09(r0)
            if (r4 == 0) goto L_0x0291
            if (r5 == 0) goto L_0x028c
            X.1RJ r7 = r0.A0E
            if (r7 == 0) goto L_0x0263
            android.view.View r5 = r7.A01()
            X.1RJ r4 = r0.A0F
            android.view.View r15 = r4.A01()
            X.1RJ r4 = r0.A0C
            android.view.View r14 = r4.A01()
            if (r26 != 0) goto L_0x027b
            android.view.View r4 = r7.A01()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x01ad
            android.animation.AnimatorSet r4 = r0.A00
            if (r4 == 0) goto L_0x01a3
            boolean r4 = r4.isStarted()
            if (r4 != 0) goto L_0x01ad
        L_0x01a3:
            android.animation.AnimatorSet r4 = r0.A01
            if (r4 == 0) goto L_0x027b
            boolean r4 = r4.isStarted()
            if (r4 == 0) goto L_0x027b
        L_0x01ad:
            r9 = 0
            X.AnonymousClass00C.A0D(r5, r9)
            android.animation.AnimatorSet r11 = X.C36441kJ.A0C()
            android.view.animation.AccelerateDecelerateInterpolator r7 = new android.view.animation.AccelerateDecelerateInterpolator
            r7.<init>()
            android.view.animation.Interpolator r7 = (android.view.animation.Interpolator) r7
            r4 = 3
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            android.util.Property r16 = android.view.View.SCALE_X
            X.AnonymousClass00C.A09(r16)
            r19 = 1056964608(0x3f000000, float:0.5)
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 200(0xc8, double:9.9E-322)
            r17 = r5
            r18 = r7
            android.animation.ObjectAnimator r10 = A0B(r16, r17, r18, r19, r20, r21)
            r4[r9] = r10
            android.util.Property r16 = android.view.View.SCALE_Y
            X.AnonymousClass00C.A09(r16)
            android.animation.ObjectAnimator r9 = A0B(r16, r17, r18, r19, r20, r21)
            r4[r2] = r9
            android.util.Property r17 = android.view.View.ALPHA
            X.AnonymousClass00C.A09(r17)
            r20 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 200(0xc8, double:9.9E-322)
            r18 = r5
            r19 = r7
            android.animation.ObjectAnimator r9 = A0B(r17, r18, r19, r20, r21, r22)
            r7 = 2
            java.util.List r4 = X.C36341k9.A0m(r9, r4, r7)
            r11.playTogether(r4)
            r4 = 12
            X.AnonymousClass4VL.A00(r11, r5, r4)
            androidx.constraintlayout.widget.ConstraintLayout r12 = r0.A06
            r9 = 0
            X.AnonymousClass00C.A0D(r12, r9)
            r10 = 2
            r4 = 3
            X.C36331k8.A1G(r14, r4, r15)
            android.animation.AnimatorSet r7 = X.C36441kJ.A0C()
            android.view.animation.AccelerateDecelerateInterpolator r5 = new android.view.animation.AccelerateDecelerateInterpolator
            r5.<init>()
            android.view.animation.Interpolator r5 = (android.view.animation.Interpolator) r5
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            android.util.Property r18 = android.view.View.SCALE_X
            X.AnonymousClass00C.A09(r18)
            r22 = 1056964608(0x3f000000, float:0.5)
            r23 = 200(0xc8, double:9.9E-322)
            r19 = r12
            r20 = r5
            android.animation.ObjectAnimator r16 = A0B(r18, r19, r20, r21, r22, r23)
            r4[r9] = r16
            android.util.Property r18 = android.view.View.SCALE_Y
            X.AnonymousClass00C.A09(r18)
            android.animation.ObjectAnimator r9 = A0B(r18, r19, r20, r21, r22, r23)
            r4[r2] = r9
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r22 = 200(0xc8, double:9.9E-322)
            r18 = r12
            r19 = r5
            android.animation.ObjectAnimator r2 = A0B(r17, r18, r19, r20, r21, r22)
            java.util.List r2 = X.C36341k9.A0m(r2, r4, r10)
            r7.playTogether(r2)
            X.4VG r2 = new X.4VG
            r22 = 1
            r19 = r11
            r20 = r14
            r21 = r12
            r16 = r2
            r17 = r8
            r18 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7.addListener(r2)
            r7.start()
        L_0x0263:
            android.content.Context r4 = r0.getContext()
            r2 = 2131886351(0x7f12010f, float:1.9407278E38)
            X.C36331k8.A0q(r4, r1, r2)
            android.view.View r4 = r0.A02
            r2 = 8
            r4.setVisibility(r2)
            X.1fX r2 = r0.A0B
            r1.setOnClickListener(r2)
            goto L_0x0103
        L_0x027b:
            r2 = 8
            r8.setVisibility(r2)
            r2 = 0
            android.content.Context r4 = X.C36431kI.A0A(r5, r0, r2)
            r2 = 2131886351(0x7f12010f, float:1.9407278E38)
            X.C36331k8.A0q(r4, r1, r2)
            goto L_0x0263
        L_0x028c:
            r0.A0J(r2)
            goto L_0x0103
        L_0x0291:
            if (r5 == 0) goto L_0x0301
            com.whatsapp.WaTextView r15 = r0.A08
            java.util.List r17 = java.util.Collections.singletonList(r3)
            long r4 = r3.A00
            r2 = 2131888443(0x7f12093b, float:1.9411521E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
            r14 = r0
            r18 = r4
            r14.A1r(r15, r16, r17, r18)
            android.view.View r5 = r0.A02
            int r2 = r5.getVisibility()
            if (r2 != 0) goto L_0x02d8
            if (r26 != 0) goto L_0x02d8
            r4 = 0
            X.4W6 r2 = new X.4W6
            r2.<init>(r0, r4)
            A0G(r0, r2)
        L_0x02bb:
            r2 = 0
            r15.setVisibility(r2)
            X.1fX r2 = r0.A09
            r15.setOnClickListener(r2)
            r8.setOnClickListener(r2)
            X.1fX r2 = r0.A0B
            r1.setOnClickListener(r2)
            android.content.Context r4 = r0.getContext()
            r2 = 2131886352(0x7f120110, float:1.940728E38)
            X.C36331k8.A0q(r4, r1, r2)
            goto L_0x0103
        L_0x02d8:
            X.C18740tg.A04(r8)
            r2 = 0
            r8.setVisibility(r2)
            r4 = 8
            r5.setVisibility(r4)
            X.1RJ r2 = r0.A0E
            if (r2 == 0) goto L_0x02eb
            X.C36411kG.A1L(r2, r4)
        L_0x02eb:
            r18 = 0
            r19 = r26 ^ 1
            androidx.constraintlayout.widget.ConstraintLayout r14 = r0.A06
            X.1RJ r4 = r0.A0F
            X.1RJ r2 = r0.A0C
            r20 = 1
            r21 = 1
            r16 = r4
            r17 = r2
            X.AnonymousClass2IQ.A0Q(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x02bb
        L_0x0301:
            r0.A0I(r3, r6, r2)
            goto L_0x0103
        L_0x0306:
            boolean r5 = r4.A03()
            goto L_0x00b0
        L_0x030c:
            X.2bU r2 = r0.getFMessage()
            boolean r2 = X.C66013Ui.A0z(r2)
            if (r2 == 0) goto L_0x031f
            boolean r2 = r0.A0L()
            r0.A0H(r3, r6, r2)
            goto L_0x0109
        L_0x031f:
            boolean r4 = X.C37541mm.A09(r0)
            boolean r2 = r0.A0L()
            if (r4 == 0) goto L_0x032e
            r0.A0J(r2)
            goto L_0x0109
        L_0x032e:
            r0.A0I(r3, r6, r2)
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IB.A0K(boolean):void");
    }

    private boolean A0L() {
        C65013Qj r0;
        if (this.A0E == null || (r0 = getFMessage().A01) == null || !this.A0A.A03(new AnonymousClass3IX(r0.A0A, r0.A06), false) || !this.A0A.A02.A0E(2653)) {
            return false;
        }
        return true;
    }

    private void setImageDrawable(Bitmap bitmap, TransitionDrawable transitionDrawable) {
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (transitionDrawable == null) {
            conversationRowImage$RowImageView.setImageBitmap(bitmap);
        } else {
            conversationRowImage$RowImageView.setImageDrawable(transitionDrawable);
        }
    }

    private void setImageViewDimensions(C46882bp r4, C65013Qj r5) {
        ConversationRowImage$RowImageView conversationRowImage$RowImageView;
        ImageView.ScaleType scaleType;
        int i;
        int i2 = r5.A0A;
        if (i2 == 0 || (i = r5.A06) == 0) {
            int i3 = 100;
            int A002 = AnonymousClass1SV.A00(r4, 100);
            if (A002 > 0) {
                conversationRowImage$RowImageView = this.A09;
            } else {
                i3 = C65123Qv.A01(getContext());
                conversationRowImage$RowImageView = this.A09;
                A002 = (i3 * 9) / 16;
            }
            conversationRowImage$RowImageView.A04(i3, A002);
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            conversationRowImage$RowImageView = this.A09;
            conversationRowImage$RowImageView.A04(i2, i);
            if (!this.A0O && !(this instanceof AnonymousClass2IA)) {
                scaleType = ImageView.ScaleType.MATRIX;
            }
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        conversationRowImage$RowImageView.setScaleType(scaleType);
    }

    public boolean A1E() {
        AnonymousClass005 r2 = this.A25;
        return C66013Ui.A0X(this.A0j, getFMessage(), r2);
    }

    public boolean A1F() {
        if (!C66013Ui.A0W(this.A0V, this.A0G, getFMessage(), this.A1o) || !this.A0d.BtS()) {
            return false;
        }
        return true;
    }

    public boolean A1I() {
        return AnonymousClass000.A1P(this.A0O ? 1 : 0);
    }

    public boolean A1K() {
        if (!C66013Ui.A0W(this.A0V, this.A0G, getFMessage(), this.A1o) || !this.A0d.BtQ()) {
            return false;
        }
        return true;
    }

    public void A1Z() {
        A0G(this, this.A0I);
    }

    public void A1b() {
        C37541mm.A02(this.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (A0M(r5) == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1d() {
        /*
            r5 = this;
            android.widget.FrameLayout r4 = r5.A04
            if (r4 == 0) goto L_0x002b
            boolean r0 = A0M(r5)
            if (r0 == 0) goto L_0x002b
            X.2bp r0 = r5.getFMessage()
            X.3Qj r0 = r0.A01
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x002b
            X.1RJ r2 = r5.A0F
        L_0x001a:
            X.2bp r1 = r5.getFMessage()
            X.1Y4 r0 = r5.A04
            X.C18740tg.A06(r0)
            int r0 = X.AnonymousClass3SU.A01(r0, r1, r2)
            r5.A2E(r2, r0)
            return
        L_0x002b:
            X.2bp r3 = r5.getFMessage()
            X.3Qj r1 = r3.A01
            if (r1 == 0) goto L_0x0051
            boolean r0 = r1.A0f
            if (r0 == 0) goto L_0x0051
            boolean r0 = r1.A0d
            if (r0 != 0) goto L_0x0051
            X.1RJ r0 = r5.A0G
            int r0 = r0.A00()
            if (r0 == 0) goto L_0x0051
            r2 = 0
            if (r4 == 0) goto L_0x004d
            boolean r1 = A0M(r5)
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r5.A0H(r3, r2, r0)
        L_0x0051:
            X.1RJ r2 = r5.A0G
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IB.A1d():void");
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        if (!(r2 instanceof AnonymousClass0p5)) {
            boolean A1W = C36371kC.A1W(r2, getFMessage());
            super.A22(r2, z);
            if (z || A1W) {
                A0K(A1W);
            }
        }
    }

    public C46882bp getFMessage() {
        return (C46882bp) ((AnonymousClass2bU) this.A0K);
    }

    public int getMainChildMaxWidth() {
        return C65023Qk.A01(this.A09.A0B);
    }

    public int getReactionsViewVerticalOverlap() {
        Resources resources;
        int i;
        if (this.A0O) {
            resources = getResources();
            i = R.dimen.f7nameremoved;
        } else if (!AnonymousClass2bU.A02(getFMessage())) {
            return super.getReactionsViewVerticalOverlap();
        } else {
            resources = getResources();
            i = R.dimen.f7nameremoved;
        }
        return resources.getDimensionPixelOffset(i);
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C46882bp);
        super.setFMessage(r2);
    }

    public AnonymousClass2IB(Context context, C89004Uw r5, C46882bp r6) {
        super(context, r5, r6);
        View findViewById = findViewById(R.id.hd_icon);
        if (findViewById != null) {
            this.A0E = new AnonymousClass1RJ(findViewById);
        }
        if (this.A04 != null) {
            this.A06 = (ConstraintLayout) C012005e.A02(this, R.id.hd_control_frame);
            AnonymousClass1RJ A0Y = C36341k9.A0Y(this, R.id.hd_control_btn);
            this.A0D = A0Y;
            this.A08 = (WaTextView) A0Y.A01();
            this.A0F = C36341k9.A0Y(this, R.id.hd_progress_bar);
            this.A0C = C36341k9.A0Y(this, R.id.hd_cancel_download);
            this.A0F.A07(new AnonymousClass4ZP((Object) this, 3));
        }
        AnonymousClass1RJ A0Y2 = C36341k9.A0Y(this, R.id.progress_bar);
        this.A0G = A0Y2;
        A0Y2.A07(C79423th.A00);
        this.A0B = C36341k9.A0Y(this, R.id.cancel_download);
        this.A02 = findViewById(R.id.control_frame);
        this.A03 = findViewById(R.id.text_and_date);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.caption);
        this.A07 = A0P;
        if (A0P != null) {
            C36331k8.A1A(this.A0G, A0P);
            this.A07.setAutoLinkMask(0);
            this.A07.setLinksClickable(false);
            this.A07.setFocusable(false);
            this.A07.setClickable(false);
            this.A07.setLongClickable(false);
        }
        A0K(true);
    }

    public static void A0G(AnonymousClass2IB r5, C160527l9 r6) {
        C46882bp fMessage = r5.getFMessage();
        r5.A0H = true;
        AnonymousClass1SV r0 = r5.A1y;
        C18740tg.A06(r0);
        r0.A0E(r5.A09, fMessage, r6, fMessage.A1J, false);
    }

    public static boolean A0M(AnonymousClass2IB r5) {
        C65013Qj r0 = r5.getFMessage().A01;
        if (r0 == null || !r5.A0A.A03(new AnonymousClass3IX(r0.A0A, r0.A06), false)) {
            return false;
        }
        if (C20800yB.A01(C21000yV.A01, r5.A0A.A02, 3116)) {
            return true;
        }
        return false;
    }

    private void setOverlayType(C46882bp r3) {
        Integer num;
        boolean A022 = AnonymousClass2bU.A02(r3);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (!A022) {
            num = C023109s.A00;
        } else if (C64933Qa.A04(r3)) {
            num = C023109s.A0C;
        } else {
            num = C023109s.A01;
        }
        conversationRowImage$RowImageView.A01 = num;
    }

    public int A1R(int i) {
        if (!AnonymousClass2bU.A02(getFMessage()) || (getFMessage() instanceof C46872bo)) {
            return super.A1R(i);
        }
        return 0;
    }

    public void A1f() {
        boolean z;
        super.A1f();
        if (this.A02 == null || C37541mm.A0A(this)) {
            C46882bp fMessage = getFMessage();
            C65013Qj A002 = AnonymousClass2bU.A00(fMessage);
            AnonymousClass00C.A0D(A002, 0);
            boolean A032 = A002.A03();
            C64933Qa r5 = fMessage.A1J;
            boolean z2 = r5.A02;
            if (z2 || A002.A0V || A032) {
                File file = A002.A0I;
                boolean z3 = false;
                if (file != null) {
                    z = C36381kD.A1V(Uri.fromFile(file));
                } else if (!z2 || A002.A0U) {
                    z = false;
                } else {
                    this.A0R.A06(R.string.f12nameremoved, 0);
                    return;
                }
                C37541mm.A03(A002, fMessage, z2);
                if (!z) {
                    Log.w("viewmessage/ no file");
                    AnonymousClass2IQ.A0R(this, r5);
                    return;
                }
                boolean Bt6 = this.A0d.Bt6();
                if (getFMessage().A09 == 14) {
                    z3 = true;
                }
                AnonymousClass3FI r1 = new AnonymousClass3FI(getContext());
                r1.A0A = Bt6;
                AnonymousClass11F r0 = r5.A00;
                C18740tg.A06(r0);
                r1.A05 = r0;
                r1.A06 = r5;
                r1.A09 = AnonymousClass000.A1V(AnonymousClass3SS.A02(this));
                r1.A00 = 33;
                r1.A08 = z3;
                if (z3) {
                    r1.A04 = getTempFMessageMediaInfo();
                }
                if (C203369nr.A08(fMessage)) {
                    r1.A02 = C203369nr.A03(fMessage).intValue();
                }
                Intent A003 = r1.A00();
                Context context = getContext();
                ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
                AnonymousClass3U9.A08(context, A003, conversationRowImage$RowImageView);
                AnonymousClass3CG.A01(getContext(), getContext(), A003, conversationRowImage$RowImageView, fMessage);
            }
        }
    }

    public boolean A26() {
        return AnonymousClass2bU.A02(getFMessage());
    }

    public void dispatchSetPressed(boolean z) {
        boolean isPressed;
        super.dispatchSetPressed(z);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (conversationRowImage$RowImageView != null && conversationRowImage$RowImageView.A0I != (isPressed = isPressed())) {
            conversationRowImage$RowImageView.A0I = isPressed;
            ConversationRowImage$RowImageView.A01(conversationRowImage$RowImageView);
            conversationRowImage$RowImageView.invalidate();
        }
    }

    public int getBroadcastDrawableId() {
        if ((getFMessage() instanceof C46872bo) || !AnonymousClass2bU.A02(getFMessage())) {
            return R.drawable.broadcast_status_icon;
        }
        return R.drawable.broadcast_status_icon_onmedia;
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
}
