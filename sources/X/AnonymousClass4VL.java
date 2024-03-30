package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.reactions.ReactionEmojiTextView;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.4VL  reason: invalid class name */
public class AnonymousClass4VL extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public AnonymousClass4VL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new AnonymousClass4VL(obj, i));
    }

    public static void A01(CircularRevealView circularRevealView) {
        if (!circularRevealView.A0A) {
            circularRevealView.A0A = true;
            circularRevealView.generatedComponent();
        }
        circularRevealView.A02 = 300;
        circularRevealView.A04 = new Paint(1);
        circularRevealView.A05 = new Path();
        circularRevealView.A06 = new RectF();
        circularRevealView.A07 = new C89424Wm(circularRevealView, 0);
        circularRevealView.A03 = new AnonymousClass4VL(circularRevealView, 2);
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A01) {
            case 2:
                ((CircularRevealView) this.A00).A09 = true;
                return;
            case 4:
            case 5:
            case 6:
                AnonymousClass2IS r2 = (AnonymousClass2IS) this.A00;
                if (r2.A03 == 2) {
                    r2.A03 = 0;
                    return;
                }
                return;
            case 18:
                super.onAnimationCancel(animator);
                SolidColorWallpaperPreview solidColorWallpaperPreview = ((AnonymousClass3ZW) ((AnonymousClass4VJ) this.A00).A00).A04;
                solidColorWallpaperPreview.A0A = false;
                solidColorWallpaperPreview.A09.setScrollEnabled(true);
                return;
            case 19:
                super.onAnimationCancel(animator);
                ((SolidColorWallpaperPreview) this.A00).finish();
                return;
            case 20:
                super.onAnimationCancel(animator);
                ((C49932jv) this.A00).A04.setImageDrawable((Drawable) null);
                return;
            case 21:
                animator.removeListener(this);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        r1.height = r0;
        r2.requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0187, code lost:
        r1.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x01fd;
                case 1: goto L_0x01eb;
                case 2: goto L_0x01e3;
                case 3: goto L_0x01d6;
                case 4: goto L_0x0009;
                case 5: goto L_0x0005;
                case 6: goto L_0x0009;
                case 7: goto L_0x01c9;
                case 8: goto L_0x0005;
                case 9: goto L_0x01c0;
                case 10: goto L_0x0005;
                case 11: goto L_0x01b4;
                case 12: goto L_0x0005;
                case 13: goto L_0x01ac;
                case 14: goto L_0x0005;
                case 15: goto L_0x01a2;
                case 16: goto L_0x018c;
                case 17: goto L_0x0179;
                case 18: goto L_0x0162;
                case 19: goto L_0x0157;
                case 20: goto L_0x0149;
                case 21: goto L_0x0135;
                case 22: goto L_0x0129;
                case 23: goto L_0x0116;
                case 24: goto L_0x00ff;
                case 25: goto L_0x00e8;
                case 26: goto L_0x00ff;
                case 27: goto L_0x00d6;
                case 28: goto L_0x0074;
                case 29: goto L_0x0047;
                case 30: goto L_0x003c;
                case 31: goto L_0x002d;
                case 32: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r6)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r2 = r5.A00
            X.2IS r2 = (X.AnonymousClass2IS) r2
            int r1 = r2.A03
            r0 = 2
            if (r1 != r0) goto L_0x0008
            r0 = 0
            r2.A03 = r0
            return
        L_0x0016:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            com.whatsapp.wds.components.search.WDSSearchBar r2 = (com.whatsapp.wds.components.search.WDSSearchBar) r2
            androidx.appcompat.widget.Toolbar r1 = r2.A06
            r0 = 4
            r1.setVisibility(r0)
            com.whatsapp.wds.components.search.WDSSearchView r0 = r2.A07
            r0.requestFocus()
            return
        L_0x002d:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            com.whatsapp.wds.components.search.WDSSearchBar r0 = (com.whatsapp.wds.components.search.WDSSearchBar) r0
            com.whatsapp.wds.components.search.WDSSearchView r1 = r0.A07
            goto L_0x0187
        L_0x003c:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            com.whatsapp.util.FloatingChildLayout r0 = (com.whatsapp.util.FloatingChildLayout) r0
            android.view.View r1 = r0.A08
            goto L_0x0187
        L_0x0047:
            java.lang.Object r2 = r5.A00
            X.1yt r2 = (X.C42481yt) r2
            r1 = 0
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r2.A02 = r1
            boolean r0 = r2.A03
            com.whatsapp.WaImageView r1 = r2.A09
            if (r0 == 0) goto L_0x006a
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
        L_0x005b:
            com.whatsapp.WaTextView r1 = r2.A0A
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0067
            int r0 = r2.A04
        L_0x0063:
            r1.setTextColor(r0)
            return
        L_0x0067:
            int r0 = r2.A05
            goto L_0x0063
        L_0x006a:
            r0 = 0
            r1.setAlpha(r0)
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x005b
        L_0x0074:
            r2 = 0
            X.AnonymousClass00C.A0D(r6, r2)
            super.onAnimationEnd(r6)
            java.lang.Object r4 = r5.A00
            X.3P6 r4 = (X.AnonymousClass3P6) r4
            X.1RJ r1 = r4.A04
            if (r1 != 0) goto L_0x008a
            java.lang.String r0 = "stickersHintView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x008a:
            r0 = 8
            r1.A03(r0)
            android.widget.ImageButton r0 = r4.A02
            java.lang.String r3 = "emojiButton"
            if (r0 != 0) goto L_0x009a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x009a:
            r0.setVisibility(r2)
            android.widget.ImageButton r2 = r4.A02
            if (r2 != 0) goto L_0x00a6
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x00a6:
            android.content.res.Resources r1 = X.C36341k9.A0F(r2)
            r0 = 2131894543(0x7f12210f, float:1.9423894E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131233768(0x7f080be8, float:1.8083683E38)
            r2.setImageResource(r0)
            r2.setContentDescription(r1)
            android.animation.AnimatorSet r1 = r4.A00
            if (r1 != 0) goto L_0x00cd
            android.widget.ImageButton r0 = r4.A02
            if (r0 != 0) goto L_0x00c7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x00c7:
            android.animation.AnimatorSet r1 = X.AnonymousClass3P6.A00(r0)
            r4.A00 = r1
        L_0x00cd:
            android.animation.AnimatorSet r0 = r4.A05
            r0.play(r1)
            r0.start()
            return
        L_0x00d6:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.AnonymousClass3NJ.A01
            goto L_0x00f9
        L_0x00e8:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C65333Rq.A01
        L_0x00f9:
            r1.height = r0
            r2.requestLayout()
            return
        L_0x00ff:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            X.C36421kH.A0t(r1)
            r0 = 8
            r1.setVisibility(r0)
            r1.requestLayout()
            return
        L_0x0116:
            java.lang.Object r0 = r5.A00
            X.3rI r0 = (X.C77933rI) r0
            com.whatsapp.status.StatusesFragment r0 = r0.A02
            X.3P1 r2 = r0.A0u
            X.3KF r1 = r2.A01()
            r0 = 0
            r1.A02 = r0
            X.AnonymousClass3P1.A00(r2)
            return
        L_0x0129:
            java.lang.Object r0 = r5.A00
            X.4Yk r0 = (X.C89924Yk) r0
            java.lang.Object r1 = r0.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x0135:
            java.lang.Object r2 = r5.A00
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            java.util.List r1 = r2.A1G
            java.util.List r0 = r2.A1H
            r1.removeAll(r0)
            X.1nZ r0 = r2.A0o
            r0.notifyDataSetChanged()
            r0 = 0
            r2.A00 = r0
            return
        L_0x0149:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.2jv r0 = (X.C49932jv) r0
            com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview r1 = r0.A04
            r0 = 0
            r1.setImageDrawable(r0)
            return
        L_0x0157:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview r0 = (com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview) r0
            r0.finish()
            return
        L_0x0162:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.4VJ r0 = (X.AnonymousClass4VJ) r0
            java.lang.Object r0 = r0.A00
            X.3ZW r0 = (X.AnonymousClass3ZW) r0
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview r1 = r0.A04
            r0 = 0
            r1.A0A = r0
            com.whatsapp.collections.MarginCorrectedViewPager r1 = r1.A09
            r0 = 1
            r1.setScrollEnabled(r0)
            return
        L_0x0179:
            super.onAnimationEnd(r6)
            java.lang.Object r1 = r5.A00
            X.3LE r1 = (X.AnonymousClass3LE) r1
            androidx.appcompat.widget.SearchView r0 = r1.A00
            r0.A0D()
            android.view.View r1 = r1.A04
        L_0x0187:
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x018c:
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            X.3LE r2 = (X.AnonymousClass3LE) r2
            androidx.appcompat.widget.SearchView r0 = r2.A00
            r0.A0E()
            androidx.appcompat.widget.Toolbar r1 = r2.A06
            r0 = 4
            r1.setVisibility(r0)
            r2.A01()
            return
        L_0x01a2:
            java.lang.Object r0 = r5.A00
            X.2XU r0 = (X.AnonymousClass2XU) r0
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = r0.A06
            r0.A1g()
            return
        L_0x01ac:
            java.lang.Object r0 = r5.A00
            X.2Kk r0 = (X.C43922Kk) r0
            r0.A3k()
            return
        L_0x01b4:
            java.lang.Object r0 = r5.A00
            X.3Np r0 = (X.C64343Np) r0
            com.whatsapp.TextEmojiLabel r1 = r0.A03
            java.lang.CharSequence r0 = r0.A04
            r1.setText(r0)
            return
        L_0x01c0:
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setSelected(r0)
            return
        L_0x01c9:
            java.lang.Object r0 = r5.A00
            X.37w r0 = (X.C604437w) r0
            X.2IN r0 = r0.A03
            android.view.ViewGroup r1 = r0.A07
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x01d6:
            super.onAnimationEnd(r6)
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x01e3:
            java.lang.Object r1 = r5.A00
            com.whatsapp.components.CircularRevealView r1 = (com.whatsapp.components.CircularRevealView) r1
            r0 = 0
            r1.A09 = r0
            return
        L_0x01eb:
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r0 = 0
            r1.setListener(r0)
            return
        L_0x01fd:
            java.lang.Object r0 = r5.A00
            com.whatsapp.RollingCounterView r0 = (com.whatsapp.RollingCounterView) r0
            com.whatsapp.RollingCounterView.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VL.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationRepeat(Animator animator) {
        if (14 - this.A01 != 0) {
            super.onAnimationRepeat(animator);
            return;
        }
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
        identityVerificationActivity.A0J.A00.setVisibility(8);
        identityVerificationActivity.A0J.A01.setVisibility(0);
        identityVerificationActivity.A0J.A01.A04();
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A01) {
            case 0:
                ((View) this.A00).invalidate();
                return;
            case 2:
                ((CircularRevealView) this.A00).A09 = true;
                return;
            case 8:
                C43842Ka r4 = (C43842Ka) this.A00;
                r4.setAlpha(0.0f);
                int childCount = r4.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    r4.A0G[i] = r4.getChildAt(i).getMeasuredWidth();
                }
                for (int i2 = 0; i2 < r4.getChildCount(); i2++) {
                    r4.getChildAt(i2).setVisibility(8);
                }
                return;
            case 10:
                ReactionEmojiTextView reactionEmojiTextView = (ReactionEmojiTextView) this.A00;
                reactionEmojiTextView.setBackgroundScale(0.0f);
                reactionEmojiTextView.setSelected(true);
                return;
            case 12:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                View view = (View) this.A00;
                view.setAlpha(0.0f);
                view.setVisibility(0);
                return;
            case 25:
            case 27:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A00).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
