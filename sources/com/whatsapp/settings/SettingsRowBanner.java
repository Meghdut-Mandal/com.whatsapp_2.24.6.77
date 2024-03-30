package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass14B;
import X.AnonymousClass3UF;
import X.C012005e;
import X.C18820ts;
import X.C224514j;
import X.C36361kB;
import X.C36401kF;
import X.C36431kI;
import X.C39141rJ;
import X.C56712wl;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.Locale;

public class SettingsRowBanner extends C39141rJ {
    public C18820ts A00;
    public final WaImageView A01;
    public final View A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public SettingsRowBanner(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setDescription(Context context, String str) {
        if (str == null) {
            this.A03.setVisibility(8);
            return;
        }
        WaTextView waTextView = this.A03;
        waTextView.setVisibility(0);
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = AnonymousClass14B.A03(context, C224514j.A00(waTextView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        C36361kB.A1P(String.format(Locale.US, str, AnonymousClass14B.A0I(A0L)), waTextView);
    }

    public void setIcon(int i) {
        this.A01.setImageResource(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        C012005e.A02(this.A02, R.id.banner_container).setOnClickListener(onClickListener);
    }

    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        C012005e.A02(this.A02, R.id.close).setOnClickListener(onClickListener);
    }

    public void setTitle(String str) {
        WaTextView waTextView = this.A04;
        if (str == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        waTextView.setText(str);
    }

    public SettingsRowBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        this.A02 = inflate;
        this.A01 = C36431kI.A0X(inflate, R.id.banner_image);
        this.A04 = C36401kF.A0Q(inflate, R.id.banner_title);
        this.A03 = C36401kF.A0Q(inflate, R.id.banner_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56712wl.A00);
        try {
            if (obtainStyledAttributes.hasValue(1)) {
                setIcon(obtainStyledAttributes.getResourceId(1, -1));
            }
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                AnonymousClass3UF.A0E(this.A01, color);
            }
            setTitle(this.A00.A0F(obtainStyledAttributes, 3));
            setDescription(context, this.A00.A0F(obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
