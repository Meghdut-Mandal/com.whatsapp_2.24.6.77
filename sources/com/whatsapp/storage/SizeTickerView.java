package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass2x6;
import X.AnonymousClass3TF;
import X.C36321k7;
import X.C36361kB;
import X.C36411kG;
import X.C36441kJ;
import X.C36471kM;
import X.C53562rW;
import X.C66153Uw;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public class SizeTickerView extends WaTextView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AnimatorSet A06;
    public boolean A07;

    public SizeTickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void A0D(int i, long j, boolean z) {
        long j2 = j;
        if (z) {
            ArrayList A0I = AnonymousClass001.A0I();
            AnimatorSet animatorSet = this.A06;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.A06 = C36441kJ.A0C();
            long j3 = this.A05;
            if (j3 != j) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 10});
                ofInt.addUpdateListener(new C66153Uw(this, j3, j2));
                A0I.add(ofInt);
            }
            if (this.A02 != i) {
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                Object[] objArr = new Object[2];
                AnonymousClass000.A1L(objArr, this.A02, 0);
                AnonymousClass000.A1L(objArr, i, 1);
                ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
                C53562rW.A00(ofObject, this, 13);
                A0I.add(ofObject);
            }
            this.A06.addListener(new C36471kM(this, i, j));
            this.A06.setInterpolator(new LinearInterpolator());
            this.A06.setDuration((long) this.A01);
            this.A06.setStartDelay((long) this.A00);
            this.A06.playTogether(A0I);
            this.A06.start();
            return;
        }
        AnimatorSet animatorSet2 = this.A06;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.A05 = j;
        this.A02 = i;
        setTextColor(i);
        A06(this);
    }

    public static void A06(SizeTickerView sizeTickerView) {
        CharSequence charSequence;
        CharSequence[] split = AnonymousClass3TF.A02(sizeTickerView.A01, sizeTickerView.A05).split(" ");
        int length = split.length;
        if (length == 0) {
            charSequence = "";
        } else if (length == 1) {
            charSequence = split[0];
        } else {
            SpannableString A0O = C36441kJ.A0O(split[1]);
            A0O.setSpan(new AbsoluteSizeSpan(sizeTickerView.A03), 0, split[1].length(), 18);
            CharSequence[] charSequenceArr = new CharSequence[3];
            charSequenceArr[0] = split[0];
            C36411kG.A1Q(" ", A0O, charSequenceArr, 1);
            charSequence = TextUtils.concat(charSequenceArr);
        }
        sizeTickerView.setText(charSequence);
    }

    public void A09() {
        if (!this.A07) {
            this.A07 = true;
            C36321k7.A0e(C36361kB.A0P(this), this);
        }
    }

    public SizeTickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A09();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2x6.A08);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = 1000;
        this.A00 = 300;
        setTextSize(0, (float) this.A04);
    }

    public SizeTickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
