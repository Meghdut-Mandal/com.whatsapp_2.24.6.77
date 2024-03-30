package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: X.0U2  reason: invalid class name */
public class AnonymousClass0U2 {
    public float A00 = 1.0f;
    public float A01 = Float.NaN;
    public int A02 = 0;
    public int A03 = 0;
    public boolean A04 = false;

    public void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C33961gD.A05);
        this.A04 = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.A00 = obtainStyledAttributes.getFloat(index, this.A00);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.A03);
                this.A03 = i2;
                this.A03 = C07690Yx.A03[i2];
            } else if (index == 4) {
                this.A02 = obtainStyledAttributes.getInt(index, this.A02);
            } else if (index == 3) {
                this.A01 = obtainStyledAttributes.getFloat(index, this.A01);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
