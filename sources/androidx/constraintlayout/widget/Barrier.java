package androidx.constraintlayout.widget;

import X.AnonymousClass0BM;
import X.AnonymousClass0GH;
import X.C33961gD;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Barrier extends AnonymousClass0BM {
    public int A00;
    public AnonymousClass0GH A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r2 == 6) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r2 == 6) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C02500Aq r4, boolean r5) {
        /*
            r3 = this;
            int r2 = r3.A00
            r1 = 6
            r0 = 5
            if (r5 == 0) goto L_0x0014
            if (r2 == r0) goto L_0x0018
            if (r2 != r1) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            boolean r0 = r4 instanceof X.AnonymousClass0GH
            if (r0 == 0) goto L_0x0013
            X.0GH r4 = (X.AnonymousClass0GH) r4
            r4.A00 = r2
        L_0x0013:
            return
        L_0x0014:
            if (r2 == r0) goto L_0x000a
            if (r2 != r1) goto L_0x000b
        L_0x0018:
            r2 = 1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.A07(X.0Aq, boolean):void");
    }

    public int getMargin() {
        return this.A01.A01;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.A01.A02 = z;
    }

    public void setMargin(int i) {
        this.A01.A01 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        this.A01 = new AnonymousClass0GH();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C33961gD.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.A00 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 14) {
                    this.A01.A02 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.A01.A01 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.A01 = this.A01;
        A04();
    }

    public void setDpMargin(int i) {
        this.A01.A01 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setType(int i) {
        this.A00 = i;
    }

    public int getType() {
        return this.A00;
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }
}
