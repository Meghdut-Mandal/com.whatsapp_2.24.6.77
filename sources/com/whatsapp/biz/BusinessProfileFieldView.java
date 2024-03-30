package com.whatsapp.biz;

import X.AnonymousClass00E;
import X.AnonymousClass1H2;
import X.AnonymousClass1QZ;
import X.AnonymousClass2x6;
import X.AnonymousClass3UG;
import X.C012005e;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C224514j;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import java.util.List;

public class BusinessProfileFieldView extends LinearLayout implements C18700tb {
    public EllipsizedTextEmojiLabel A00;
    public EllipsizedTextEmojiLabel A01;
    public C18820ts A02;
    public AnonymousClass1H2 A03;
    public AnonymousClass1QZ A04;
    public int A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public void A01(AttributeSet attributeSet) {
        Drawable drawable;
        TextUtils.TruncateAt truncateAt = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C36361kB.A09(this).obtainStyledAttributes(attributeSet, AnonymousClass2x6.A02, 0, 0);
            try {
                drawable = obtainStyledAttributes.getDrawable(2);
                this.A05 = obtainStyledAttributes.getInteger(0, 0);
                this.A0A = obtainStyledAttributes.getBoolean(3, false);
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(4);
                this.A06 = colorStateList;
                if (colorStateList == null) {
                    this.A06 = new ColorStateList(new int[][]{new int[0]}, new int[]{C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)});
                }
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(5);
                this.A07 = colorStateList2;
                if (colorStateList2 == null) {
                    this.A07 = this.A06;
                }
                this.A08 = this.A02.A0F(obtainStyledAttributes, 1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            drawable = null;
        }
        View inflate = C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        setIcon(drawable);
        this.A01 = (EllipsizedTextEmojiLabel) C012005e.A02(inflate, R.id.field_textview);
        this.A00 = (EllipsizedTextEmojiLabel) C012005e.A02(inflate, R.id.sub_field_textview);
        this.A01.setSingleLine(this.A0A);
        this.A00.setSingleLine(this.A0A);
        int i = this.A05;
        if (i == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (i == 4) {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        }
        this.A01.setEllipsize(truncateAt);
        this.A00.setEllipsize(truncateAt);
        this.A01.A00 = C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A00.A00 = C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A01.setTextColor(this.A06);
    }

    private void setIcon(Drawable drawable) {
        if (drawable != null) {
            setPadding(C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved), getPaddingTop(), C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved), getPaddingBottom());
        }
    }

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = C36341k9.A0T(A0W);
            this.A03 = C36351kA.A0e(A0W);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public String getText() {
        return C36371kC.A0u(this.A01);
    }

    public void setTextColor(int i) {
        this.A01.setTextColor(i);
        this.A06 = new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }

    public BusinessProfileFieldView(Context context) {
        super(context);
        A00();
        A01((AttributeSet) null);
    }

    public int getLayoutRes() {
        return R.layout.f9nameremoved;
    }

    public TextView getSubTextView() {
        return this.A00;
    }

    public TextView getTextView() {
        return this.A01;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A01.setEnabled(z);
        this.A00.setEnabled(z);
    }

    public void setSubText(CharSequence charSequence) {
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel;
        int i;
        if (TextUtils.isEmpty(charSequence)) {
            C36391kE.A1K(this.A00);
            ellipsizedTextEmojiLabel = this.A00;
            i = 8;
        } else {
            this.A00.A0J(AnonymousClass3UG.A03(getContext(), this.A01.getPaint(), this.A03, charSequence), (List) null, 180, true);
            ellipsizedTextEmojiLabel = this.A00;
            i = 0;
        }
        ellipsizedTextEmojiLabel.setVisibility(i);
    }

    public void setText(CharSequence charSequence, View.OnClickListener onClickListener) {
        int i;
        if (!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(this.A08)) {
            this.A01.setTextColor(this.A06);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.A08;
                this.A01.setTextColor(this.A07);
            }
            EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A01;
            ellipsizedTextEmojiLabel.A01 = onClickListener;
            ellipsizedTextEmojiLabel.setContentDescription(charSequence);
            this.A01.A0J(AnonymousClass3UG.A03(getContext(), this.A01.getPaint(), this.A03, charSequence), (List) null, 180, true);
            i = 0;
        } else {
            C36391kE.A1K(this.A01);
            i = 8;
        }
        setVisibility(i);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void setIcon(int i) {
        setIcon(AnonymousClass00E.A00(getContext(), i));
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01(attributeSet);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        A01(attributeSet);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(attributeSet);
    }
}
