package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3UF;
import X.AnonymousClass4P6;
import X.C166257vQ;
import X.C224514j;
import X.C36341k9;
import X.C36361kB;
import X.C36411kG;
import X.C56162vq;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;

public class StarRatingBar extends LinearLayout implements View.OnClickListener {
    public int A00;
    public AnonymousClass4P6 A01;
    public final int A02;
    public final Drawable A03;
    public final Drawable A04;

    public StarRatingBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public void setRating(int i) {
        this.A00 = i;
        A00();
        sendAccessibilityEvent(16384);
        AnonymousClass4P6 r0 = this.A01;
        if (r0 != null) {
            r0.Be7(i, false);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C166257vQ r2 = (C166257vQ) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A00 = r2.A00;
        A00();
    }

    private void A00() {
        Drawable drawable;
        Drawable drawable2;
        if (getChildCount() == 0) {
            int i = 0;
            while (i < this.A02) {
                ImageView A0L = C36361kB.A0L(this);
                A0L.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                i++;
                Integer valueOf = Integer.valueOf(i);
                A0L.setTag(valueOf);
                Resources resources = getResources();
                Object[] A0L2 = AnonymousClass001.A0L();
                A0L2[0] = valueOf;
                A0L.setContentDescription(resources.getQuantityString(R.plurals.f10nameremoved, i, A0L2));
                if (i <= this.A00) {
                    drawable2 = this.A03;
                } else {
                    drawable2 = this.A04;
                }
                A0L.setImageDrawable(drawable2);
                A0L.setOnClickListener(this);
                addView(A0L);
            }
            return;
        }
        int i2 = 0;
        while (i2 < this.A02) {
            ImageView imageView = (ImageView) getChildAt(i2);
            i2++;
            if (i2 <= this.A00) {
                drawable = this.A03;
            } else {
                drawable = this.A04;
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public int getRating() {
        return this.A00;
    }

    public void onClick(View view) {
        int A0I = AnonymousClass000.A0I(view.getTag());
        this.A00 = A0I;
        A00();
        sendAccessibilityEvent(16384);
        AnonymousClass4P6 r0 = this.A01;
        if (r0 != null) {
            r0.Be7(A0I, true);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        A00();
    }

    public Parcelable onSaveInstanceState() {
        C166257vQ r1 = new C166257vQ(super.onSaveInstanceState());
        r1.A00 = this.A00;
        return r1;
    }

    public void sendAccessibilityEvent(int i) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            super.sendAccessibilityEvent(i);
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
            List<CharSequence> text = obtain.getText();
            Resources A0F = C36341k9.A0F(this);
            Object[] A0M = AnonymousClass001.A0M();
            AnonymousClass000.A1L(A0M, this.A00, 0);
            text.add(C36411kG.A0w(A0F, Integer.valueOf(this.A02), A0M, 1, R.string.f12nameremoved));
            obtain.setEnabled(true);
            ((AccessibilityManager) getContext().getSystemService("accessibility")).sendAccessibilityEvent(obtain);
        }
    }

    public void setOnRatingChangeListener(AnonymousClass4P6 r1) {
        this.A01 = r1;
    }

    /* JADX INFO: finally extract failed */
    public StarRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C56162vq.A00, 0, 0);
        try {
            this.A02 = obtainStyledAttributes.getInt(1, 5);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            this.A03 = drawable == null ? AnonymousClass3UF.A02(context, R.drawable.message_rating_star, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved)) : drawable;
            Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
            this.A04 = drawable2 == null ? AnonymousClass3UF.A02(context, R.drawable.message_rating_star_border, R.color.f6nameremoved) : drawable2;
            obtainStyledAttributes.recycle();
            setSaveEnabled(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public StarRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
