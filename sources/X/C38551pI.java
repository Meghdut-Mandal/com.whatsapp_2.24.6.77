package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.checkbox.RtlCheckBox;
import java.util.List;

/* renamed from: X.1pI  reason: invalid class name and case insensitive filesystem */
public class C38551pI extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38551pI(Context context, LinearLayout.LayoutParams layoutParams, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list) {
        super(context);
        int intValue;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        setOrientation(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int i = 0;
        setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), dimensionPixelSize, 0);
        ImageView A0G = C36401kF.A0G(this, R.id.image);
        TextView A0O = C36391kE.A0O(this, R.id.title);
        TextView A0O2 = C36391kE.A0O(this, R.id.subtitle);
        if (num != null) {
            A0G.setImageResource(num.intValue());
            A0G.setVisibility(0);
            if (layoutParams != null) {
                A0G.setLayoutParams(layoutParams);
            }
        } else {
            A0G.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str)) {
            A0O.setText(str);
            A0O.setVisibility(0);
        } else {
            A0O.setVisibility(8);
        }
        String str3 = str2;
        if (!TextUtils.isEmpty(str3)) {
            A0O2.setText(str3);
            if (num2 != null) {
                A0O2.setTextColor(num2.intValue());
            }
            A0O2.setVisibility(0);
        } else {
            A0O2.setVisibility(8);
        }
        if (num4 == null) {
            intValue = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        } else {
            intValue = (int) (((float) num4.intValue()) * C36361kB.A0B(this).density);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        while (true) {
            List list2 = list;
            if (i >= list2.size()) {
                break;
            }
            C601036m r4 = (C601036m) list2.get(i);
            int i2 = dimensionPixelSize2;
            if (i == 0) {
                i2 = intValue;
            }
            RtlCheckBox rtlCheckBox = new RtlCheckBox(getContext(), (AttributeSet) null);
            rtlCheckBox.setTextSize(2, 16.0f);
            C36331k8.A0r(getContext(), rtlCheckBox, R.color.f6nameremoved);
            C36411kG.A0O(this, R.id.container).addView(rtlCheckBox);
            AnonymousClass000.A0a(rtlCheckBox).topMargin = i2;
            rtlCheckBox.setText(r4.A01);
            rtlCheckBox.setChecked(r4.A02);
            rtlCheckBox.setOnClickListener(new AnonymousClass3YG(r4, rtlCheckBox, 12));
            i++;
        }
        if (num3 != null) {
            float f = C36361kB.A0B(this).density;
            View view = new View(getContext());
            view.setLayoutParams(new AbsListView.LayoutParams(-1, (int) ((((float) num3.intValue()) * f) + 0.5f)));
            addView(view);
        }
    }
}
