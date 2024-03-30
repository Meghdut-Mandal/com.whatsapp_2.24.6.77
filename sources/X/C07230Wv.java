package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: X.0Wv  reason: invalid class name and case insensitive filesystem */
public class C07230Wv {
    public static SparseIntArray A07;
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public int A02 = -1;
    public int A03 = 0;
    public int A04 = -1;
    public String A05 = null;
    public boolean A06 = false;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A07 = sparseIntArray;
        sparseIntArray.append(2, 1);
        A07.append(4, 2);
        A07.append(5, 3);
        A07.append(1, 4);
        A07.append(0, 5);
        A07.append(3, 6);
    }

    public void A00(Context context, AttributeSet attributeSet) {
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C33961gD.A04);
        this.A06 = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (A07.get(index)) {
                case 1:
                    this.A01 = obtainStyledAttributes.getFloat(index, this.A01);
                    break;
                case 2:
                    this.A04 = obtainStyledAttributes.getInt(index, this.A04);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        str = obtainStyledAttributes.getString(index);
                    } else {
                        str = AnonymousClass0RC.A00[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    this.A05 = str;
                    break;
                case 4:
                    this.A03 = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.A02 = C07690Yx.A00(obtainStyledAttributes, index, this.A02);
                    break;
                case 6:
                    this.A00 = obtainStyledAttributes.getFloat(index, this.A00);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
