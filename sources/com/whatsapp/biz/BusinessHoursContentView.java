package com.whatsapp.biz;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36351kA;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public class BusinessHoursContentView extends FrameLayout implements C18700tb {
    public static final int[] A04 = {R.id.business_hours_day_layout_0, R.id.business_hours_day_layout_1, R.id.business_hours_day_layout_2, R.id.business_hours_day_layout_3, R.id.business_hours_day_layout_4, R.id.business_hours_day_layout_5, R.id.business_hours_day_layout_6};
    public AnonymousClass1QZ A00;
    public List A01;
    public List A02;
    public boolean A03;

    public void setFullView(boolean z) {
        for (int i = 0; i < this.A02.size(); i++) {
            if (i != 0) {
                ((View) this.A02.get(i)).setVisibility(C36351kA.A00(z ? 1 : 0));
            }
        }
    }

    public void setup(List list) {
        for (int i = 0; i < list.size(); i++) {
            ((TextView) C36421kH.A0Y(this.A01, i)).setText((CharSequence) C36421kH.A0Y(list, i));
            ((TextView) ((Pair) this.A01.get(i)).second).setText((CharSequence) ((Pair) list.get(i)).second);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r5 = new android.text.style.ForegroundColorSpan(X.AnonymousClass00F.A00(getContext(), com.whatsapp.R.color.f6nameremoved));
        r0 = getContext().getString(com.whatsapp.R.string.f12nameremoved);
        r4 = X.C36441kJ.A0O(r0);
        r4.setSpan(r5, 0, r0.length(), 33);
        ((android.widget.TextView) X.C36421kH.A0Y(r9.A01, r2)).setText(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setupWithOpenNow(java.util.List r10, long r11, X.AnonymousClass3XK r13) {
        /*
            r9 = this;
            r3 = 0
            r2 = 0
        L_0x0002:
            int r0 = r10.size()
            if (r2 >= r0) goto L_0x00cf
            if (r2 != 0) goto L_0x00a1
            r6 = 1
            X.AnonymousClass00C.A0D(r13, r6)
            java.lang.String r1 = r13.A01
            boolean r0 = X.AnonymousClass14B.A0F(r1)
            if (r0 == 0) goto L_0x009b
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
        L_0x001a:
            java.util.Calendar r1 = java.util.Calendar.getInstance(r0)
            r1.setTimeInMillis(r11)
            r0 = 7
            int r5 = r1.get(r0)
            r0 = 11
            int r0 = r1.get(r0)
            int r4 = r0 * 60
            r0 = 12
            int r0 = r1.get(r0)
            int r4 = r4 + r0
            java.util.List r0 = r13.A02
            java.util.Iterator r8 = r0.iterator()
        L_0x003b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r7 = r8.next()
            X.3XO r7 = (X.AnonymousClass3XO) r7
            if (r7 == 0) goto L_0x003b
            int r0 = r7.A00
            if (r0 != r5) goto L_0x003b
            int r1 = r7.A01
            if (r1 == 0) goto L_0x0057
            if (r1 == r6) goto L_0x0067
            r0 = 2
            if (r1 == r0) goto L_0x0067
            goto L_0x003b
        L_0x0057:
            java.lang.Integer r0 = r7.A03
            int r0 = X.C36411kG.A06(r0)
            if (r4 < r0) goto L_0x003b
            java.lang.Integer r0 = r7.A02
            int r0 = X.C36411kG.A06(r0)
            if (r4 > r0) goto L_0x003b
        L_0x0067:
            android.content.Context r1 = r9.getContext()
            r0 = 2131099948(0x7f06012c, float:1.7812264E38)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            r5.<init>(r0)
            android.content.Context r1 = r9.getContext()
            r0 = 2131887253(0x7f120495, float:1.9409108E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableString r4 = X.C36441kJ.A0O(r0)
            int r1 = r0.length()
            r0 = 33
            r4.setSpan(r5, r3, r1, r0)
            java.util.List r0 = r9.A01
            java.lang.Object r0 = X.C36421kH.A0Y(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r4)
            goto L_0x00b2
        L_0x009b:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r1)
            goto L_0x001a
        L_0x00a1:
            java.util.List r0 = r9.A01
            java.lang.Object r1 = X.C36421kH.A0Y(r0, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = X.C36421kH.A0Y(r10, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x00b2:
            java.util.List r0 = r9.A01
            java.lang.Object r0 = r0.get(r2)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.second
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = r10.get(r2)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            int r2 = r2 + 1
            goto L_0x0002
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.BusinessHoursContentView.setupWithOpenNow(java.util.List, long, X.3XK):void");
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public BusinessHoursContentView(Context context) {
        super(context);
        A01();
        A00();
    }

    private void A00() {
        View A0J = C36411kG.A0J(C36351kA.A0C(this), this, R.layout.f9nameremoved);
        int[] iArr = A04;
        this.A02 = C36441kJ.A14(7);
        this.A01 = C36441kJ.A14(7);
        int i = 0;
        do {
            View findViewById = A0J.findViewById(iArr[i]);
            View findViewById2 = findViewById.findViewById(R.id.business_hours_day_layout_title);
            View findViewById3 = findViewById.findViewById(R.id.business_hours_day_layout_description);
            this.A02.add(findViewById);
            this.A01.add(C36441kJ.A0Q(findViewById2, findViewById3));
            i++;
        } while (i < 7);
    }

    public int getLayout() {
        return R.layout.f9nameremoved;
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        A00();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00();
    }
}
