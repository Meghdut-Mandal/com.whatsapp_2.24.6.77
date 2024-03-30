package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6VH  reason: invalid class name */
public final class AnonymousClass6VH {
    public ImageButton A00;
    public ImageButton A01;
    public AnonymousClass6E4 A02 = C130366Ku.A00();
    public WaTextView A03;
    public C21060yb A04;
    public C18820ts A05;
    public LayerDrawable A06;
    public final View A07;
    public final C160677lP A08;

    public final void A04(ViewGroup viewGroup) {
        C017507m r3 = new C017507m(3);
        r3.A06(300);
        View view = this.A07;
        r3.A08(view);
        WaTextView waTextView = this.A03;
        r3.A08(waTextView);
        r3.A07(new DecelerateInterpolator());
        C018607y.A02(viewGroup, r3);
        waTextView.setVisibility(8);
        view.setVisibility(0);
    }

    public final void A05(C146646vw r14, boolean z) {
        ImageButton imageButton = this.A00;
        C21060yb r0 = this.A04;
        if (r0 != null) {
            AnonymousClass3T3.A02(imageButton, r0);
            AnonymousClass6E4 r2 = this.A02;
            r2.A04.clear();
            r2.A01(0.0d);
            C90484aE.A16(this.A00);
            AnimatorSet A0C = C36441kJ.A0C();
            if (z) {
                AnimatorSet A0C2 = C36441kJ.A0C();
                CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) this.A08;
                float A012 = C36441kJ.A01(creationModeBottomBar) * 0.2f;
                float f = creationModeBottomBar.A00;
                C18820ts r02 = this.A05;
                if (r02 != null) {
                    boolean A1X = C36401kF.A1X(r02);
                    int i = -1;
                    if (A1X) {
                        i = 1;
                    }
                    float[] A0v = C90524aI.A0v();
                    A0v[0] = imageButton.getTranslationX();
                    A0v[1] = f + (A012 * ((float) i));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
                    C111565cU.A00(ofFloat, this, 38);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageButton, "alpha", new float[]{0.0f});
                    A0C2.play(ofFloat).with(ofFloat2).with(ObjectAnimator.ofFloat(this.A03, "alpha", new float[]{0.0f}));
                    A0C2.setDuration(200);
                    AnimatorSet A0C3 = C36441kJ.A0C();
                    PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                    propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("scaleX", new float[]{0.0f, 1.0f});
                    propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{0.0f, 1.0f});
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageButton, (PropertyValuesHolder[]) C90524aI.A0x(PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f}), propertyValuesHolderArr, 2, 3));
                    AnonymousClass00C.A08(ofPropertyValuesHolder);
                    View view = this.A07;
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) Arrays.copyOf(propertyValuesHolderArr, 3));
                    AnonymousClass00C.A08(ofPropertyValuesHolder2);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageButton, "translationX", new float[]{0.0f, 0.0f});
                    ofFloat3.setDuration(0);
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
                    ofInt.setDuration(0);
                    C111565cU.A00(ofInt, this, 37);
                    A0C3.playTogether(new Animator[]{ofFloat3, ofInt, ofPropertyValuesHolder, ofPropertyValuesHolder2});
                    A0C3.setDuration(200);
                    A0C.playSequentially(new Animator[]{A0C2, A0C3});
                } else {
                    throw C36321k7.A09();
                }
            }
            A0C.addListener(new C162317oO(r14, this, 1));
            A0C.start();
            return;
        }
        throw C36331k8.A0W();
    }

    public static final void A00(AnonymousClass6VH r6, float f) {
        r6.A00.setTranslationX(f);
        WaTextView waTextView = r6.A03;
        waTextView.setTranslationX(f);
        C18820ts r0 = r6.A05;
        if (r0 != null) {
            boolean A1Y = C36351kA.A1Y(r0);
            boolean z = true;
            CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r6.A08;
            float f2 = creationModeBottomBar.A00;
            if (!A1Y ? f <= f2 : f >= f2) {
                z = false;
            }
            int i = 153;
            if (!z) {
                C18820ts r02 = r6.A05;
                if (r02 == null) {
                    throw C36321k7.A09();
                } else if (!C36351kA.A1Y(r02) ? f >= 0.0f : f <= 0.0f) {
                    i = 153 + C14960mT.A01((Math.abs(f) / Math.abs(creationModeBottomBar.A00)) * 102.0f);
                } else {
                    i = 255;
                }
            }
            int argb = Color.argb(i, 255, 255, 255);
            waTextView.setTextColor(argb);
            AnonymousClass088.A01(ColorStateList.valueOf(argb), waTextView);
            return;
        }
        throw C36321k7.A09();
    }

    public static final void A01(AnonymousClass6VH r2, int i) {
        LayerDrawable layerDrawable = r2.A06;
        layerDrawable.getDrawable(1).setAlpha(i);
        r2.A00.setBackground(layerDrawable);
    }

    public final void A02() {
        C21060yb r0 = this.A04;
        if (r0 != null) {
            C55922vP.A00(r0);
            ImageButton imageButton = this.A01;
            imageButton.setVisibility(0);
            imageButton.setEnabled(true);
            AnonymousClass6E4 r3 = this.A02;
            CopyOnWriteArraySet copyOnWriteArraySet = r3.A04;
            copyOnWriteArraySet.clear();
            r3.A01(0.0d);
            copyOnWriteArraySet.add(new AnonymousClass5LN(this));
            return;
        }
        throw C36331k8.A0W();
    }

    public final void A03(int i) {
        AnonymousClass6E4 r2 = this.A02;
        r2.A04.clear();
        r2.A01(0.0d);
        C90484aE.A16(this.A00);
        A01(this, 0);
        ImageButton imageButton = this.A01;
        imageButton.setEnabled(true);
        ImageButton imageButton2 = this.A00;
        imageButton2.setAlpha(1.0f);
        imageButton2.setTranslationX(0.0f);
        AnonymousClass3MU.A00(imageButton2, i, true, true);
        AnonymousClass3MU.A00(imageButton, i, false, true);
    }

    public AnonymousClass6VH(View view, C160677lP r3) {
        this.A07 = view;
        this.A08 = r3;
        this.A00 = r3.getMicButton();
        this.A01 = r3.getSendButton();
        this.A03 = r3.getSlidToCancelLabel();
        this.A06 = r3.getMicButtonBackgroundDrawable();
    }
}
