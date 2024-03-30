package com.whatsapp.biz.serviceofferings;

import X.AnonymousClass0D2;
import X.C134806bd;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36441kJ;
import X.C40471vb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public class ServiceOfferingsRecyclerView extends RecyclerView {
    public ServiceOfferingsRecyclerView(Context context) {
        super(context, (AttributeSet) null);
    }

    private TextView getServiceOfferingItemView() {
        TextView textView = (TextView) C36351kA.A0C(this).inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        textView.setLayoutParams(new AnonymousClass0D2(-1, -2));
        float applyDimension = TypedValue.applyDimension(1, 24.0f, C36361kB.A0B(this));
        Drawable A0H = C36381kD.A0H(getContext(), R.drawable.ic_check);
        int i = (int) applyDimension;
        A0H.setBounds(0, 0, i, i);
        textView.setCompoundDrawables(A0H, (Drawable) null, (Drawable) null, (Drawable) null);
        return textView;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        String str;
        int i4;
        String str2;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0 && (this.A0G instanceof C40471vb)) {
            Resources A0F = C36341k9.A0F(this);
            int i5 = 0;
            if (this.A0G instanceof C40471vb) {
                Resources A0F2 = C36341k9.A0F(this);
                TextView serviceOfferingItemView = getServiceOfferingItemView();
                C40471vb r3 = (C40471vb) this.A0G;
                int dimensionPixelSize = A0F2.getDimensionPixelSize(R.dimen.f7nameremoved);
                int size = (View.MeasureSpec.getSize(i) / 2) - (dimensionPixelSize / 2);
                i3 = 0;
                while (true) {
                    List list = r3.A00;
                    if (i5 >= list.size()) {
                        break;
                    }
                    if (i5 < list.size()) {
                        str = ((C134806bd) list.get(i5)).A02;
                    } else {
                        str = "";
                    }
                    serviceOfferingItemView.setText(str);
                    C36351kA.A1B(serviceOfferingItemView, size, Integer.MIN_VALUE);
                    int measuredHeight = serviceOfferingItemView.getMeasuredHeight();
                    int i6 = i5 + 1;
                    if (i6 < list.size()) {
                        if (i6 < list.size()) {
                            str2 = ((C134806bd) list.get(i6)).A02;
                        } else {
                            str2 = "";
                        }
                        serviceOfferingItemView.setText(str2);
                        C36351kA.A1B(serviceOfferingItemView, size, Integer.MIN_VALUE);
                        i4 = serviceOfferingItemView.getMeasuredHeight();
                    } else {
                        i4 = 0;
                    }
                    i3 = i3 + Math.max(measuredHeight, i4) + dimensionPixelSize;
                    i5 += 2;
                }
            } else {
                i3 = 0;
            }
            setMeasuredDimension(i, C36441kJ.A06(A0F, R.dimen.f7nameremoved, i3));
        }
    }

    public ServiceOfferingsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ServiceOfferingsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
