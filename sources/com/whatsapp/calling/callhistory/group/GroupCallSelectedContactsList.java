package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass13J;
import X.C18820ts;
import X.C36351kA;
import X.C36391kE;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.contact.picker.SelectedContactsList;

public class GroupCallSelectedContactsList extends SelectedContactsList {
    public WaImageButton A00;
    public WaImageButton A01;
    public C18820ts A02;
    public AnonymousClass13J A03;
    public boolean A04;

    public GroupCallSelectedContactsList(Context context) {
        super(context, (AttributeSet) null);
        A01();
    }

    public void A03(Animator animator) {
        setUpSelectedButtonAnimatorSet(animator, this.A02);
        this.A02.start();
    }

    private void setUpSelectedButtonAnimatorSet(Animator animator, AnimatorSet animatorSet) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int i = this.A00;
        int i2 = dimensionPixelSize + i;
        int i3 = -1;
        int i4 = 1;
        if (C36351kA.A1Y(this.A02)) {
            i4 = -1;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A00, "translationX", new float[]{(float) (i2 * i4)});
        C36391kE.A13(ofFloat.setDuration(240));
        ofFloat.setStartDelay(50);
        int i5 = dimensionPixelSize2 + i;
        if (!C36351kA.A1Y(this.A02)) {
            i3 = 1;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A01, "translationX", new float[]{(float) (i5 * i3)});
        C36391kE.A13(ofFloat2.setDuration(240));
        AnimatorSet.Builder play = animatorSet.play(ofFloat);
        if (animator == null) {
            play.with(ofFloat2);
        } else {
            play.with(ofFloat2).after(animator);
        }
    }

    public int getSelectedContactsLayout() {
        return R.layout.f9nameremoved;
    }

    public int getSelectedContactsListLeftPadding() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public GroupCallSelectedContactsList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public GroupCallSelectedContactsList(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public GroupCallSelectedContactsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
