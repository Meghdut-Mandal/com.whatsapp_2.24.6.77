package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* renamed from: X.0Vi  reason: invalid class name and case insensitive filesystem */
public abstract class C06850Vi {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static boolean A00(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C05350Pj.A00(paint, str);
        }
        int length = str.length();
        if (length != 1 || !Character.isWhitespace(str.charAt(0))) {
            float measureText = paint.measureText("󟿽");
            float measureText2 = paint.measureText("m");
            float measureText3 = paint.measureText(str);
            float f = 0.0f;
            if (measureText3 != 0.0f) {
                if (str.codePointCount(0, length) > 1) {
                    if (measureText3 <= measureText2 * 2.0f) {
                        int i = 0;
                        while (i < length) {
                            int charCount = Character.charCount(str.codePointAt(i)) + i;
                            f += paint.measureText(str, i, charCount);
                            i = charCount;
                        }
                        if (measureText3 >= f) {
                            return false;
                        }
                    }
                }
                if (measureText3 == measureText) {
                    ThreadLocal threadLocal = A00;
                    AnonymousClass00I r3 = (AnonymousClass00I) threadLocal.get();
                    if (r3 == null) {
                        r3 = new AnonymousClass00I(AnonymousClass001.A06(), AnonymousClass001.A06());
                        threadLocal.set(r3);
                    } else {
                        ((Rect) r3.A00).setEmpty();
                        ((Rect) r3.A01).setEmpty();
                    }
                    Rect rect = (Rect) r3.A00;
                    paint.getTextBounds("󟿽", 0, 2, rect);
                    Object obj = r3.A01;
                    paint.getTextBounds(str, 0, length, (Rect) obj);
                    return !rect.equals(obj);
                }
            }
            return false;
        }
        return true;
    }
}
