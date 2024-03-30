package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;

/* renamed from: X.6Fq  reason: invalid class name and case insensitive filesystem */
public abstract class C129176Fq {
    public final Context A00;
    public final CheckableImageButton A01;
    public final C93014fP A02;
    public final TextInputLayout A03;

    public void A09(CharSequence charSequence, int i, int i2, int i3) {
    }

    public int A02() {
        if (!(this instanceof C99384tC) && !(this instanceof C99374tB)) {
            return 0;
        }
        return R.string.f12nameremoved;
    }

    public int A03() {
        if (this instanceof C99384tC) {
            return R.drawable.mtrl_dropdown_arrow;
        }
        if (this instanceof C99374tB) {
            return R.drawable.mtrl_ic_cancel;
        }
        return 0;
    }

    public View.OnClickListener A04() {
        if (this instanceof C99384tC) {
            return ((C99384tC) this).A0B;
        }
        if (this instanceof C99374tB) {
            return ((C99374tB) this).A07;
        }
        return null;
    }

    public View.OnFocusChangeListener A05() {
        if (this instanceof C99384tC) {
            return ((C99384tC) this).A0C;
        }
        if (this instanceof C99374tB) {
            return ((C99374tB) this).A08;
        }
        return null;
    }

    public void A06() {
        if (this instanceof C99384tC) {
            C99384tC r5 = (C99384tC) this;
            int i = r5.A08;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            TimeInterpolator timeInterpolator = r5.A0A;
            ofFloat.setInterpolator(timeInterpolator);
            ofFloat.setDuration((long) i);
            C111565cU.A00(ofFloat, r5, 7);
            r5.A01 = ofFloat;
            int i2 = r5.A09;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat2.setInterpolator(timeInterpolator);
            ofFloat2.setDuration((long) i2);
            C111565cU.A00(ofFloat2, r5, 7);
            r5.A02 = ofFloat2;
            C162337oQ.A00(ofFloat2, r5, 7);
            r5.A03 = (AccessibilityManager) r5.A00.getSystemService("accessibility");
        } else if (this instanceof C99364tA) {
            C93014fP r0 = this.A02;
            r0.A06 = null;
            CheckableImageButton checkableImageButton = r0.A0G;
            checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
            C132756Vd.A03((View.OnLongClickListener) null, checkableImageButton);
        } else if (this instanceof C99374tB) {
            C99374tB r9 = (C99374tB) this;
            float[] A0v = C90524aI.A0v();
            // fill-array-data instruction
            A0v[0] = 1061997773;
            A0v[1] = 1065353216;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(A0v);
            ofFloat3.setInterpolator(r9.A06);
            ofFloat3.setDuration((long) r9.A04);
            C111565cU.A00(ofFloat3, r9, 6);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            TimeInterpolator timeInterpolator2 = r9.A05;
            ofFloat4.setInterpolator(timeInterpolator2);
            long j = (long) r9.A03;
            ofFloat4.setDuration(j);
            C111565cU.A00(ofFloat4, r9, 5);
            AnimatorSet A0C = C36441kJ.A0C();
            r9.A00 = A0C;
            Animator[] animatorArr = new Animator[2];
            C36331k8.A1N(ofFloat3, ofFloat4, animatorArr);
            A0C.playTogether(animatorArr);
            C162337oQ.A00(r9.A00, r9, 5);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat5.setInterpolator(timeInterpolator2);
            ofFloat5.setDuration(j);
            C111565cU.A00(ofFloat5, r9, 5);
            r9.A01 = ofFloat5;
            C162337oQ.A00(ofFloat5, r9, 6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r3 = (X.C99374tB) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C99384tC
            if (r0 == 0) goto L_0x0015
            r2 = r4
            X.4tC r2 = (X.C99384tC) r2
            android.widget.AutoCompleteTextView r0 = r2.A04
            if (r0 == 0) goto L_0x0014
            r1 = 0
            r0.setOnTouchListener(r1)
            android.widget.AutoCompleteTextView r0 = r2.A04
            r0.setOnDismissListener(r1)
        L_0x0014:
            return
        L_0x0015:
            boolean r0 = r4 instanceof X.C99374tB
            if (r0 == 0) goto L_0x0014
            r3 = r4
            X.4tB r3 = (X.C99374tB) r3
            android.widget.EditText r2 = r3.A02
            if (r2 == 0) goto L_0x0014
            r1 = 32
            X.72q r0 = new X.72q
            r0.<init>(r3, r1)
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129176Fq.A07():void");
    }

    public void A08(EditText editText) {
        if (this instanceof C99384tC) {
            C99384tC r3 = (C99384tC) this;
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                r3.A04 = autoCompleteTextView;
                AnonymousClass6UI.A00(autoCompleteTextView, r3, 0);
                r3.A04.setOnDismissListener(new C136056dh(r3));
                r3.A04.setThreshold(0);
                TextInputLayout textInputLayout = r3.A03;
                textInputLayout.setErrorIconDrawable((Drawable) null);
                if (editText.getInputType() == 0 && r3.A03.isTouchExplorationEnabled()) {
                    C011504z.A06(r3.A01, 2);
                }
                textInputLayout.setEndIconVisible(true);
                return;
            }
            throw C90514aH.A0s("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        } else if (this instanceof C99374tB) {
            C99374tB r0 = (C99374tB) this;
            r0.A02 = editText;
            r0.A03.setEndIconVisible(C99374tB.A01(r0));
        }
    }

    public boolean A0A() {
        if (this instanceof C99384tC) {
            return true;
        }
        return false;
    }

    public boolean A0B() {
        if (this instanceof C99384tC) {
            return ((C99384tC) this).A07;
        }
        return false;
    }

    public C129176Fq(C93014fP r2) {
        this.A03 = r2.A0J;
        this.A02 = r2;
        this.A00 = r2.getContext();
        this.A01 = r2.A0G;
    }
}
