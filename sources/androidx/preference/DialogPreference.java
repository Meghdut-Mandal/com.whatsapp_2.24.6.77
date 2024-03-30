package androidx.preference;

import X.AnonymousClass0Yh;
import X.AnonymousClass9BI;
import X.C165577te;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.whatsapp.R;

public abstract class DialogPreference extends Preference {
    public int A00;
    public Drawable A01;
    public CharSequence A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AnonymousClass0Yh.A00(context, R.attr.f4nameremoved, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9BI.A02, i, i2);
        String A0j = C165577te.A0j(obtainStyledAttributes, 9, 0);
        this.A03 = A0j;
        if (A0j == null) {
            this.A03 = this.A0F;
        }
        this.A02 = C165577te.A0j(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.A01 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.A05 = C165577te.A0j(obtainStyledAttributes, 11, 3);
        this.A04 = C165577te.A0j(obtainStyledAttributes, 10, 4);
        this.A00 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
