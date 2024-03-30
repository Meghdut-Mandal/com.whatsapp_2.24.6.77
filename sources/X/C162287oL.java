package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.calling.callgrid.view.FocusViewContainer;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.7oL  reason: invalid class name and case insensitive filesystem */
public class C162287oL extends AnimatorListenerAdapter {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C162287oL(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public void onAnimationCancel(Animator animator) {
        if (1 - this.A02 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        super.onAnimationCancel(animator);
        this.A01 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        r0.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r9 != 5) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r10.A01 == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = 8;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x006e;
                case 2: goto L_0x0028;
                case 3: goto L_0x0049;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r0 = (com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r0
            android.view.View r1 = r0.A01
            boolean r2 = r10.A01
            r0 = 0
            if (r2 != 0) goto L_0x0012
        L_0x0010:
            r0 = 8
        L_0x0012:
            r1.setVisibility(r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r1 = r10.A00
            X.4fU r1 = (X.C93044fU) r1
            boolean r0 = r10.A01
            if (r0 != 0) goto L_0x0022
            r0 = 0
            X.C93044fU.A07(r1, r0)
        L_0x0022:
            r1.requestLayout()
            java.lang.Runnable r0 = r1.A04
            goto L_0x0043
        L_0x0028:
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            super.onAnimationEnd(r11)
            boolean r0 = r10.A01
            if (r0 != 0) goto L_0x003a
            java.lang.Object r0 = r10.A00
            X.4fT r0 = (X.C93034fT) r0
            r0.setVisibilityInternal(false)
        L_0x003a:
            java.lang.Object r0 = r10.A00
            X.4fT r0 = (X.C93034fT) r0
            r0.requestLayout()
            java.lang.Runnable r0 = r0.A04
        L_0x0043:
            if (r0 == 0) goto L_0x0015
            r0.run()
            return
        L_0x0049:
            super.onAnimationEnd(r11)
            java.lang.Object r6 = r10.A00
            X.6Fh r6 = (X.C129126Fh) r6
            android.animation.AnimatorSet r0 = r6.A03
            if (r0 == 0) goto L_0x0015
            java.util.ArrayList r0 = r0.getChildAnimations()
            java.util.Iterator r1 = r0.iterator()
        L_0x005c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r1.next()
            android.animation.Animator r0 = (android.animation.Animator) r0
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.removeAllUpdateListeners()
            goto L_0x005c
        L_0x006e:
            super.onAnimationEnd(r11)
            java.lang.Object r1 = r10.A00
            com.whatsapp.calling.callgrid.view.FocusViewContainer r1 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r1
            r0 = 0
            r1.A0A = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            boolean r0 = r10.A01
            if (r0 != 0) goto L_0x0015
            goto L_0x0010
        L_0x0082:
            android.animation.AnimatorSet r0 = r6.A03
            r0.removeAllListeners()
            boolean r5 = r10.A01
            r4 = 0
            if (r5 == 0) goto L_0x00ff
            android.animation.AnimatorSet r0 = r6.A00(r4)
        L_0x0090:
            r6.A03 = r0
            if (r5 == 0) goto L_0x0115
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r7 = r6.A0I
            X.6VT r0 = r6.A0G
            X.00s r0 = r0.A06
            int r9 = X.C36341k9.A07(r0)
            r0 = 1
            java.lang.String r8 = "textTool"
            java.lang.String r2 = "shapeTool"
            r3 = 4
            if (r9 == r0) goto L_0x00e6
            r0 = 2
            java.lang.String r1 = "penTool"
            if (r9 == r0) goto L_0x00d1
            r0 = 3
            if (r9 == r0) goto L_0x00bc
            r0 = 5
            if (r9 == r0) goto L_0x00d1
        L_0x00b1:
            android.widget.ImageView r0 = r7.A04
            java.lang.String r2 = "cropTool"
            if (r0 != 0) goto L_0x0101
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x00bc:
            android.widget.ImageView r0 = r7.A07
            if (r0 != 0) goto L_0x00c5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00c5:
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r7.A08
            if (r0 != 0) goto L_0x00fb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x00d1:
            android.widget.ImageView r0 = r7.A07
            if (r0 != 0) goto L_0x00da
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00da:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r7.A0D
            if (r0 != 0) goto L_0x00fb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x00e6:
            android.widget.ImageView r0 = r7.A08
            if (r0 != 0) goto L_0x00ef
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x00ef:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r7.A0D
            if (r0 != 0) goto L_0x00fb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x00fb:
            r0.setVisibility(r3)
            goto L_0x00b1
        L_0x00ff:
            r0 = 0
            goto L_0x0090
        L_0x0101:
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0115
            android.widget.ImageView r0 = r7.A04
            if (r0 != 0) goto L_0x0112
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0112:
            r0.setVisibility(r3)
        L_0x0115:
            r6.A08 = r5
            r6.A07 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162287oL.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        if (4 - this.A02 != 0) {
            super.onAnimationStart(animator);
        } else {
            ((UserNoticeBottomSheetDialogFragment) this.A00).A01.setVisibility(0);
        }
    }

    public C162287oL(FocusViewContainer focusViewContainer) {
        this.A02 = 1;
        this.A00 = focusViewContainer;
    }
}
