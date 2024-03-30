package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.style.ImageSpan;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.6lv  reason: invalid class name and case insensitive filesystem */
public class C140646lv implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        RCTextView rCTextView = (RCTextView) obj;
        if (obj3 != null) {
            C124375y5 r9 = (C124375y5) obj3;
            AnonymousClass72Q r1 = r9.A03;
            ColorStateList colorStateList = r1.A0T;
            rCTextView.A07 = r9.A04;
            rCTextView.A06 = r9.A02;
            rCTextView.A00 = r9.A00;
            rCTextView.A01 = r9.A01;
            rCTextView.A02 = r1.A0M;
            rCTextView.A03 = r1.A0N;
            rCTextView.A08 = r9.A05;
            int i = r1.A0R;
            if (i != 0) {
                rCTextView.A05 = null;
                rCTextView.A04 = i;
            } else {
                rCTextView.A05 = colorStateList;
                rCTextView.A04 = colorStateList.getDefaultColor();
                Layout layout = rCTextView.A06;
                if (layout != null) {
                    layout.getPaint().setColor(rCTextView.A05.getColorForState(rCTextView.getDrawableState(), rCTextView.A04));
                }
            }
            RCTextView.A02(rCTextView, 0, 0);
            ImageSpan[] imageSpanArr = r9.A07;
            if (imageSpanArr != null) {
                rCTextView.A0B = imageSpanArr;
                int length = imageSpanArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Drawable drawable = rCTextView.A0B[i2].getDrawable();
                    drawable.setCallback(rCTextView);
                    drawable.setVisible(true, false);
                }
            }
            rCTextView.A0A = r9.A06;
            String str = r9.A03.A0a;
            if (str != null) {
                rCTextView.setContentDescription(str);
            }
            rCTextView.invalidate();
            return null;
        }
        throw C90514aH.A0s("Missing text layout context!");
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RCTextView rCTextView = (RCTextView) obj;
        rCTextView.A07 = null;
        rCTextView.A06 = null;
        rCTextView.A00 = 0.0f;
        rCTextView.A01 = 0.0f;
        rCTextView.A02 = 0;
        rCTextView.A03 = 0;
        rCTextView.A05 = null;
        rCTextView.A04 = 0;
        ImageSpan[] imageSpanArr = rCTextView.A0B;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = rCTextView.A0B[i].getDrawable();
                drawable.setCallback((Drawable.Callback) null);
                drawable.setVisible(false, false);
            }
            rCTextView.A0B = null;
        }
        rCTextView.A0A = null;
        rCTextView.setContentDescription("");
        C95234kH r0 = rCTextView.A0H;
        if (r0 != null) {
            r0.A0o();
        }
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
