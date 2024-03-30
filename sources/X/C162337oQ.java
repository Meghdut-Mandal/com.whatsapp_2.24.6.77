package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.ClearableEditText;
import com.whatsapp.R;
import com.whatsapp.calling.CallDetailsLayout;
import com.whatsapp.calling.callgrid.view.FocusViewContainer;
import com.whatsapp.calling.callgrid.view.PipViewContainer;
import com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.7oQ  reason: invalid class name and case insensitive filesystem */
public class C162337oQ extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public C162337oQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new C162337oQ(obj, i));
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A01) {
            case 1:
                AnonymousClass7eH r0 = ((C92764ea) this.A00).A06;
                if (r0 != null) {
                    r0.Bgb();
                    return;
                }
                return;
            case 2:
                AnonymousClass7eG r02 = ((C92764ea) this.A00).A05;
                if (r02 != null) {
                    r02.BVw();
                    return;
                }
                return;
            case 4:
                C90684aY.A01((C90684aY) this.A00);
                return;
            case 11:
            case 12:
                super.onAnimationCancel(animator);
                CallDetailsLayout callDetailsLayout = (CallDetailsLayout) this.A00;
                callDetailsLayout.A00 = 0;
                callDetailsLayout.clearAnimation();
                return;
            case 13:
                super.onAnimationCancel(animator);
                FocusViewContainer.A00((FocusViewContainer) ((C163657qY) this.A00).A00);
                return;
            case 14:
                Log.i("PipViewContainer/animatePiPView onAnimationCancel");
                PipViewContainer pipViewContainer = (PipViewContainer) this.A00;
                PipViewContainer.A02(pipViewContainer);
                PipViewContainer.A04(pipViewContainer, false);
                return;
            case 26:
                View view = ((PaymentAmountInputField) this.A00).A04;
                if (view != null) {
                    view.setTranslationX(0.0f);
                    return;
                }
                return;
            case 32:
                ((C92354df) this.A00).A0c = false;
                return;
            case 34:
                super.onAnimationCancel(animator);
                ((VoipActivityV2) this.A00).A0c.A00();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c6, code lost:
        r1.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0266, code lost:
        r0 = 0.0f;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0267, code lost:
        r1.setAlpha(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0274, code lost:
        X.C36391kE.A1K(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0277, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x00d1;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00b9;
                case 3: goto L_0x02a3;
                case 4: goto L_0x029b;
                case 5: goto L_0x0005;
                case 6: goto L_0x0290;
                case 7: goto L_0x0280;
                case 8: goto L_0x0278;
                case 9: goto L_0x026b;
                case 10: goto L_0x0251;
                case 11: goto L_0x023c;
                case 12: goto L_0x01fa;
                case 13: goto L_0x01eb;
                case 14: goto L_0x01da;
                case 15: goto L_0x0005;
                case 16: goto L_0x01c9;
                case 17: goto L_0x01bf;
                case 18: goto L_0x01b0;
                case 19: goto L_0x019c;
                case 20: goto L_0x0005;
                case 21: goto L_0x0180;
                case 22: goto L_0x016f;
                case 23: goto L_0x0160;
                case 24: goto L_0x0150;
                case 25: goto L_0x007c;
                case 26: goto L_0x006f;
                case 27: goto L_0x0141;
                case 28: goto L_0x0065;
                case 29: goto L_0x0132;
                case 30: goto L_0x0119;
                case 31: goto L_0x0009;
                case 32: goto L_0x0111;
                case 33: goto L_0x0100;
                case 34: goto L_0x00f3;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r6)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r2 = r5.A00
            X.5ND r2 = (X.AnonymousClass5ND) r2
            android.view.View r1 = r2.A0C
            if (r1 == 0) goto L_0x0008
            r0 = 0
            r2.A0L = r0
            int r0 = r1.getMeasuredWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            r1.setPivotX(r0)
            android.view.View r1 = r2.A0C
            int r0 = r1.getMeasuredHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            r1.setPivotY(r0)
            X.7dC r0 = r2.A0J
            if (r0 == 0) goto L_0x0008
            X.70a r0 = (X.C1491470a) r0
            X.70b r4 = r0.A00
            X.0yC r1 = r4.A0Q
            r0 = 1052(0x41c, float:1.474E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0008
            android.graphics.Rect r3 = X.AnonymousClass001.A06()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            android.widget.FrameLayout r0 = r4.A05
            r0.getGlobalVisibleRect(r3, r1)
            int r2 = r1.x
            int r0 = r3.left
            int r2 = r2 - r0
            int r1 = r1.y
            int r0 = r3.top
            int r1 = r1 - r0
            r3.offset(r2, r1)
            android.graphics.Rect r0 = r4.A0L
            r0.set(r3)
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x02b0
            r0 = 0
            r4.B76(r0)
            return
        L_0x0065:
            java.lang.Object r0 = r5.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0008
            r0.run()
            return
        L_0x006f:
            java.lang.Object r0 = r5.A00
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = (com.whatsapp.payments.ui.widget.PaymentAmountInputField) r0
            android.view.View r1 = r0.A04
            if (r1 == 0) goto L_0x0008
            r0 = 0
            r1.setTranslationX(r0)
            return
        L_0x007c:
            java.lang.Object r0 = r5.A00
            X.6Fh r0 = (X.C129126Fh) r0
            X.6wC r3 = r0.A06
            X.6Fh r0 = r3.A0V
            X.6VT r2 = r0.A0G
            X.00s r0 = r2.A06
            int r1 = X.C36341k9.A07(r0)
            r0 = 1
            if (r1 != r0) goto L_0x00a1
            X.4aZ r0 = r3.A04
            if (r0 == 0) goto L_0x00a1
            X.01I r0 = r3.A0B
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x00a1
            X.4aZ r0 = r3.A04
        L_0x009d:
            r0.show()
            return
        L_0x00a1:
            X.00s r0 = r2.A06
            int r1 = X.C36341k9.A07(r0)
            r0 = 3
            if (r1 != r0) goto L_0x0008
            X.1kU r0 = r3.A05
            if (r0 == 0) goto L_0x0008
            X.01I r0 = r3.A0B
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0008
            X.1kU r0 = r3.A05
            goto L_0x009d
        L_0x00b9:
            java.lang.Object r0 = r5.A00
            X.4ea r0 = (X.C92764ea) r0
            X.7eG r0 = r0.A05
            if (r0 == 0) goto L_0x0008
            r0.BVw()
            return
        L_0x00c5:
            java.lang.Object r0 = r5.A00
            X.4ea r0 = (X.C92764ea) r0
            X.7eH r0 = r0.A06
            if (r0 == 0) goto L_0x0008
            r0.Bgb()
            return
        L_0x00d1:
            java.lang.Object r1 = r5.A00
            X.4ec r1 = (X.C92774ec) r1
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x0008
            android.view.animation.Interpolator r0 = X.C92774ec.A06
            android.animation.ObjectAnimator r0 = r1.A03
            if (r6 != r0) goto L_0x00eb
            android.animation.ObjectAnimator r0 = r1.A02
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r0.isStarted()
            if (r0 != 0) goto L_0x0008
        L_0x00eb:
            android.view.View r0 = X.C36411kG.A0L(r1)
            X.C92774ec.A01(r0, r1)
            return
        L_0x00f3:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.64k r0 = r0.A0c
            r0.A00()
            return
        L_0x0100:
            java.lang.Object r1 = r5.A00
            X.4df r1 = (X.C92354df) r1
            r0 = 4
            r1.setVisibility(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            X.C92354df.A00(r1)
            return
        L_0x0111:
            java.lang.Object r1 = r5.A00
            X.4df r1 = (X.C92354df) r1
            r0 = 0
            r1.A0c = r0
            return
        L_0x0119:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            X.688 r2 = (X.AnonymousClass688) r2
            com.whatsapp.text.FinalBackspaceAwareEntry r1 = r2.A07
            java.lang.String r0 = r2.A09
            r1.setHint(r0)
            android.widget.TextView r1 = r2.A05
            X.C36391kE.A1K(r1)
            goto L_0x0266
        L_0x0132:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.688 r0 = (X.AnonymousClass688) r0
            android.widget.TextView r0 = r0.A06
            goto L_0x0274
        L_0x0141:
            java.lang.Object r0 = r5.A00
            X.6QH r0 = (X.AnonymousClass6QH) r0
            android.view.View r1 = r0.A0H
            r0 = 8
            r1.setVisibility(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0267
        L_0x0150:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.6Fh r0 = (X.C129126Fh) r0
            android.animation.ValueAnimator r0 = r0.A0E
            r0.removeAllUpdateListeners()
            r0.removeAllListeners()
            return
        L_0x0160:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.66R r0 = (X.AnonymousClass66R) r0
            r0.A01()
            return
        L_0x016f:
            java.lang.Object r2 = r5.A00
            X.6SU r2 = (X.AnonymousClass6SU) r2
            android.view.View r1 = r2.A04
            r0 = 1
            r1.setClickable(r0)
            r1 = 0
            android.view.View r0 = r2.A06
            r0.setVisibility(r1)
            return
        L_0x0180:
            java.lang.Object r3 = r5.A00
            X.6SU r3 = (X.AnonymousClass6SU) r3
            android.view.View r1 = r3.A04
            r0 = 4
            r1.setVisibility(r0)
            com.whatsapp.ClearableEditText r2 = r3.A0A
            r0 = 0
            r2.setVisibility(r0)
            android.widget.ImageView r1 = r3.A07
            r0 = 2131232784(0x7f080810, float:1.8081687E38)
            r1.setImageResource(r0)
            r2.requestFocus()
            return
        L_0x019c:
            java.lang.Object r3 = r5.A00
            com.whatsapp.components.AnimatingArrowsLayout r3 = (com.whatsapp.components.AnimatingArrowsLayout) r3
            android.animation.AnimatorSet r2 = r3.A03
            java.util.Objects.requireNonNull(r2)
            r1 = 23
            X.3v2 r0 = new X.3v2
            r0.<init>(r2, r1)
            r3.post(r0)
            return
        L_0x01b0:
            java.lang.Object r2 = r5.A00
            X.6F9 r2 = (X.AnonymousClass6F9) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A0A
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.camera.CameraBottomSheetBehavior r1 = r2.A0B
            r0 = 0
            goto L_0x01c6
        L_0x01bf:
            java.lang.Object r0 = r5.A00
            X.6F9 r0 = (X.AnonymousClass6F9) r0
            com.whatsapp.camera.CameraBottomSheetBehavior r1 = r0.A0B
            r0 = 1
        L_0x01c6:
            r1.A00 = r0
            return
        L_0x01c9:
            super.onAnimationEnd(r6)
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setTranslationY(r0)
            return
        L_0x01da:
            java.lang.String r0 = "PipViewContainer/animatePiPView onAnimationEnd"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r5.A00
            com.whatsapp.calling.callgrid.view.PipViewContainer r1 = (com.whatsapp.calling.callgrid.view.PipViewContainer) r1
            com.whatsapp.calling.callgrid.view.PipViewContainer.A02(r1)
            r0 = 0
            com.whatsapp.calling.callgrid.view.PipViewContainer.A04(r1, r0)
            return
        L_0x01eb:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.7qY r0 = (X.C163657qY) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.calling.callgrid.view.FocusViewContainer r0 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r0
            com.whatsapp.calling.callgrid.view.FocusViewContainer.A00(r0)
            return
        L_0x01fa:
            super.onAnimationCancel(r6)
            java.lang.Object r4 = r5.A00
            com.whatsapp.calling.CallDetailsLayout r4 = (com.whatsapp.calling.CallDetailsLayout) r4
            r0 = 2
            r4.A00 = r0
            r3 = 8
            X.07n r2 = new X.07n
            r2.<init>()
            r0 = 400(0x190, double:1.976E-321)
            r2.A06(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r2.A07(r0)
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C018607y.A02(r0, r2)
            com.whatsapp.components.button.ThumbnailButton r0 = r4.A07
            r0.setVisibility(r3)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166913(0x7f0706c1, float:1.7948085E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.whatsapp.calling.CallDetailsLayout.A00(r4, r0)
            r4.clearAnimation()
            return
        L_0x023c:
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            com.whatsapp.calling.CallDetailsLayout r2 = (com.whatsapp.calling.CallDetailsLayout) r2
            r0 = 2
            r2.A00 = r0
            com.whatsapp.components.button.ThumbnailButton r1 = r2.A07
            r0 = 8
            r1.setVisibility(r0)
            r2.clearAnimation()
            return
        L_0x0251:
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            X.5Jw r2 = (X.C106485Jw) r2
            androidx.appcompat.widget.SearchView r1 = r2.A06
            java.lang.String r0 = X.C106485Jw.A0H
            r1.setQueryHint(r0)
            android.widget.TextView r0 = r2.A04
            X.C36391kE.A1K(r0)
            android.widget.TextView r1 = r2.A04
        L_0x0266:
            r0 = 0
        L_0x0267:
            r1.setAlpha(r0)
            return
        L_0x026b:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.5Jw r0 = (X.C106485Jw) r0
            android.widget.TextView r0 = r0.A05
        L_0x0274:
            X.C36391kE.A1K(r0)
            return
        L_0x0278:
            java.lang.Object r1 = r5.A00
            com.google.android.material.transformation.ExpandableTransformationBehavior r1 = (com.google.android.material.transformation.ExpandableTransformationBehavior) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x0280:
            java.lang.Object r2 = r5.A00
            X.4tC r2 = (X.C99384tC) r2
            X.4fP r1 = r2.A02
            r0 = 0
            r1.A09(r0)
            android.animation.ValueAnimator r0 = r2.A01
            r0.start()
            return
        L_0x0290:
            java.lang.Object r0 = r5.A00
            X.6Fq r0 = (X.C129176Fq) r0
            X.4fP r1 = r0.A02
            r0 = 0
            r1.A0A(r0)
            return
        L_0x029b:
            java.lang.Object r0 = r5.A00
            X.4aY r0 = (X.C90684aY) r0
            X.C90684aY.A01(r0)
            return
        L_0x02a3:
            java.lang.Object r1 = r5.A00
            X.4aK r1 = (X.C90544aK) r1
            X.7Rj r0 = new X.7Rj
            r0.<init>(r1)
            X.C90544aK.A00(r1, r0)
            return
        L_0x02b0:
            r4.B6h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162337oQ.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.A01) {
            case 14:
                Log.i("PipViewContainer/animatePiPView onAnimationRepeat");
                return;
            case 15:
                super.onAnimationRepeat(animator);
                C1028252b r1 = (C1028252b) this.A00;
                if (!r1.A05.A0E) {
                    C1028252b.A00(r1);
                    return;
                }
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        TextView textView;
        String str;
        C28201Rs r1;
        Object obj;
        switch (this.A01) {
            case 5:
                ((C129176Fq) this.A00).A02.A0A(true);
                return;
            case 9:
                super.onAnimationStart(animator);
                C106485Jw r2 = (C106485Jw) this.A00;
                r2.A05.setAlpha(1.0f);
                r2.A05.setText(C106485Jw.A0F);
                r2.A06.setQueryHint("");
                return;
            case 10:
                super.onAnimationStart(animator);
                textView = ((C106485Jw) this.A00).A04;
                str = C106485Jw.A0H;
                break;
            case 14:
                Log.i("PipViewContainer/animatePiPView onAnimationStart");
                PipViewContainer.A04((PipViewContainer) this.A00, true);
                return;
            case 16:
                super.onAnimationStart(animator);
                InCallBannerViewModel inCallBannerViewModel = ((VoipInCallNotifBanner) this.A00).A04;
                if (inCallBannerViewModel != null) {
                    C36341k9.A18(inCallBannerViewModel.A0D, false);
                    C1512478u r22 = inCallBannerViewModel.A03;
                    if (r22.size() <= 1) {
                        r22.clear();
                        r1 = inCallBannerViewModel.A0C;
                        obj = null;
                    } else {
                        r22.remove(0);
                        r1 = inCallBannerViewModel.A0C;
                        obj = r22.get(0);
                    }
                    r1.A0D(obj);
                    return;
                }
                return;
            case 17:
                ((AnonymousClass6F9) this.A00).A0A.setVisibility(0);
                return;
            case 20:
                ((RoundCornerProgressBar) this.A00).A06 = false;
                return;
            case 21:
                AnonymousClass6SU r23 = (AnonymousClass6SU) this.A00;
                r23.A04.setClickable(false);
                r23.A06.setVisibility(4);
                return;
            case 22:
                AnonymousClass6SU r3 = (AnonymousClass6SU) this.A00;
                ClearableEditText clearableEditText = r3.A0A;
                clearableEditText.clearFocus();
                r3.A07.setImageResource(R.drawable.ic_shape_picker_search);
                r3.A04.setVisibility(0);
                clearableEditText.setVisibility(4);
                return;
            case 23:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                AnonymousClass66R r12 = (AnonymousClass66R) this.A00;
                r12.A01 = true;
                r12.A00 = -1.0f;
                return;
            case 29:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                AnonymousClass688 r24 = (AnonymousClass688) this.A00;
                TextView textView2 = r24.A06;
                textView2.setAlpha(1.0f);
                textView2.setText(r24.A08);
                r24.A07.setHint("");
                return;
            case 30:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                AnonymousClass688 r0 = (AnonymousClass688) this.A00;
                textView = r0.A05;
                str = r0.A09;
                break;
            case 32:
                ((C92354df) this.A00).A0c = true;
                return;
            case 33:
                super.onAnimationStart(animator);
                ((C92354df) this.A00).A0d = false;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
        textView.setText(str);
    }
}
