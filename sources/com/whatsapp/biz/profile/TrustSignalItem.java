package com.whatsapp.biz.profile;

import X.AnonymousClass000;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass2x6;
import X.C134766bZ;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.text.NumberFormat;

public class TrustSignalItem extends LinearLayout {
    public int A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaTextView A03;
    public WaTextView A04;

    public TrustSignalItem(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setAccountInfo(String str) {
        this.A03.setText(str);
    }

    private void setAccountName(String str) {
        if (this.A00 == 1) {
            str = AnonymousClass000.A0p("@", str, AnonymousClass000.A0u());
        }
        this.A04.setText(str);
    }

    private void setEditable(boolean z) {
        WaImageView waImageView;
        int i;
        WaTextView waTextView = this.A04;
        Context context = getContext();
        Context context2 = getContext();
        if (z) {
            C36331k8.A0r(context, waTextView, C36391kE.A04(context2));
            waImageView = this.A01;
            i = 0;
        } else {
            C36331k8.A0r(context, waTextView, C36381kD.A02(context2));
            waImageView = this.A01;
            i = 8;
        }
        waImageView.setVisibility(i);
    }

    private void setIcon(Drawable drawable) {
        this.A02.setImageDrawable(drawable);
    }

    public String getAccountName() {
        return C36371kC.A0u(this.A04);
    }

    public void setUpFromAccount(C134766bZ r6) {
        String string;
        int i;
        if (r6 == null) {
            i = 8;
        } else {
            setAccountName(r6.A01);
            int i2 = r6.A00;
            if (i2 > 0) {
                int i3 = this.A00;
                int i4 = R.plurals.f10nameremoved;
                if (i3 == 0) {
                    i4 = R.plurals.f10nameremoved;
                }
                string = C36341k9.A0F(this).getQuantityString(i4, i2, AnonymousClass000.A1b(NumberFormat.getIntegerInstance().format((long) i2)));
            } else {
                Resources resources = getResources();
                int i5 = this.A00;
                int i6 = R.string.f12nameremoved;
                if (i5 == 0) {
                    i6 = R.string.f12nameremoved;
                }
                string = resources.getString(i6);
            }
            setAccountInfo(string);
            i = 0;
        }
        setVisibility(i);
    }

    public int getAccountType() {
        return this.A00;
    }

    public TrustSignalItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        setClickable(true);
        setFocusable(true);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A02 = C36431kI.A0X(this, R.id.linked_account_icon);
        this.A04 = C36401kF.A0Q(this, R.id.linked_account_name);
        this.A03 = C36401kF.A0Q(this, R.id.linked_account_info);
        this.A01 = C36431kI.A0X(this, R.id.linked_account_edit_button);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2x6.A09);
        try {
            int integer = obtainStyledAttributes.getInteger(0, 0);
            this.A00 = integer;
            if (integer == 0) {
                setIcon(AnonymousClass00E.A00(getContext(), R.drawable.ic_settings_fb));
                this.A02.setColorFilter(AnonymousClass00F.A00(getContext(), R.color.f6nameremoved));
            } else if (integer == 1) {
                setIcon(AnonymousClass00E.A00(getContext(), R.drawable.ic_business_instagram));
            }
            setEditable(obtainStyledAttributes.getBoolean(2, false));
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                this.A01.setColorFilter(C36381kD.A05(this, resourceId));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public TrustSignalItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
