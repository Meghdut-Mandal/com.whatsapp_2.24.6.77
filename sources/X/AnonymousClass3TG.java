package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3TG  reason: invalid class name */
public abstract class AnonymousClass3TG {
    public static ArrayList A00(Context context, Layout layout, float f) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        float f2 = (float) dimensionPixelSize;
        float dimensionPixelSize2 = (float) context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        return A03(A02(layout), f2, f2, dimensionPixelSize2, dimensionPixelSize2, f);
    }

    public static ArrayList A01(Context context, Layout layout, float f) {
        return A03(A02(layout), (float) context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), (float) context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), (float) context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), (float) context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), f);
    }

    public static ArrayList A02(Layout layout) {
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (int i = 0; i < layout.getLineCount(); i++) {
            RectF rectF = new RectF(layout.getLineLeft(i), (float) layout.getLineTop(i), layout.getLineRight(i), (float) layout.getLineBottom(i));
            String charSequence = layout.getText().subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString();
            if (rectF.width() > 0.0f && !TextUtils.isEmpty(charSequence.replace("\n", ""))) {
                A0I2.add(rectF);
            } else if (!A0I2.isEmpty()) {
                A0I.add(A0I2);
                A0I2 = AnonymousClass001.A0I();
            }
        }
        if (!A0I2.isEmpty()) {
            A0I.add(A0I2);
        }
        return A0I;
    }

    public static ArrayList A03(List list, float f, float f2, float f3, float f4, float f5) {
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < list.size(); i++) {
            List list2 = (List) list.get(i);
            Path A0M = C36441kJ.A0M();
            A0I.add(A0M);
            int size = list2.size();
            int i2 = size * 2;
            PointF[] pointFArr = new PointF[i2];
            PointF[] pointFArr2 = new PointF[i2];
            for (int i3 = 0; i3 <= size - 1; i3++) {
                RectF rectF = (RectF) list2.get(i3);
                int i4 = i3 * 2;
                int i5 = i4 + 1;
                pointFArr2[i4] = new PointF(rectF.right + f2, rectF.top - f3);
                pointFArr2[i5] = new PointF(rectF.right + f2, rectF.bottom + f4);
                pointFArr[i4] = new PointF(rectF.left - f, rectF.top - f3);
                pointFArr[i5] = new PointF(rectF.left - f, rectF.bottom + f4);
            }
            for (int i6 = 1; i6 < pointFArr2.length; i6++) {
                PointF pointF = pointFArr2[i6];
                PointF pointF2 = pointFArr2[i6 - 1];
                if (pointF.x > pointF2.x) {
                    pointF2.y = pointF.y;
                } else if (pointF.x < pointF2.x) {
                    pointF.y = pointF2.y;
                }
            }
            for (int i7 = 1; i7 < pointFArr.length; i7++) {
                PointF pointF3 = pointFArr[i7];
                PointF pointF4 = pointFArr[i7 - 1];
                if (pointF3.x > pointF4.x) {
                    pointF3.y = pointF4.y;
                } else if (pointF3.x < pointF4.x) {
                    pointF4.y = pointF3.y;
                }
            }
            float f6 = f5;
            ArrayList A04 = A04(pointFArr2, f6, true);
            ArrayList A042 = A04(pointFArr, f6, false);
            A0M.moveTo(((PointF) A04.get(0)).x, ((PointF) A04.get(0)).y);
            for (int i8 = 1; i8 < A04.size(); i8++) {
                C36361kB.A12(A0M, A04, i8);
            }
            for (int size2 = A042.size() - 1; size2 >= 0; size2--) {
                C36361kB.A12(A0M, A042, size2);
            }
            A0M.close();
        }
        return A0I;
    }

    public static ArrayList A04(PointF[] pointFArr, float f, boolean z) {
        float min;
        ArrayList A0I = AnonymousClass001.A0I();
        Collections.addAll(A0I, pointFArr);
        int i = 0;
        while (i < (A0I.size() / 2) - 1) {
            int i2 = i * 2;
            PointF pointF = (PointF) A0I.get(i2);
            PointF pointF2 = (PointF) A0I.get(i2 + 1);
            PointF pointF3 = (PointF) A0I.get(i2 + 2);
            PointF pointF4 = (PointF) A0I.get(i2 + 3);
            if (Math.abs(pointF2.x - pointF3.x) < f) {
                A0I.remove(pointF2);
                A0I.remove(pointF3);
                float f2 = pointF.x;
                float f3 = pointF4.x;
                if (z) {
                    min = Math.max(f2, f3);
                } else {
                    min = Math.min(f2, f3);
                }
                pointF4.x = min;
                pointF.x = min;
                i--;
            }
            i++;
        }
        return A0I;
    }
}
