package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.0IO  reason: invalid class name */
public class AnonymousClass0IO extends AnonymousClass054 {
    public static final String[] A00 = {"android:clipBounds:clip"};

    public Animator A04(ViewGroup viewGroup, AnonymousClass0X9 r12, AnonymousClass0X9 r13) {
        ObjectAnimator objectAnimator = null;
        if (!(r12 == null || r13 == null)) {
            Map map = r12.A02;
            if (map.containsKey("android:clipBounds:clip")) {
                Map map2 = r13.A02;
                if (map2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) map.get("android:clipBounds:clip");
                    Object obj = map2.get("android:clipBounds:clip");
                    boolean A1W = AnonymousClass000.A1W(obj);
                    if (!(rect == null && obj == null)) {
                        if (rect == null) {
                            rect = (Rect) map.get("android:clipBounds:bounds");
                        } else if (obj == null) {
                            obj = map2.get("android:clipBounds:bounds");
                        }
                        if (!rect.equals(obj)) {
                            View view = r13.A00;
                            AnonymousClass0VN.A01(view, rect);
                            AnonymousClass0ZH r2 = new AnonymousClass0ZH(AnonymousClass001.A06());
                            objectAnimator = ObjectAnimator.ofObject(view, AnonymousClass0W5.A00, r2, new Rect[]{rect, obj});
                            if (A1W) {
                                objectAnimator.addListener(new AnonymousClass0DG(view, this));
                                return objectAnimator;
                            }
                        }
                    }
                }
            }
        }
        return objectAnimator;
    }

    public static void A01(AnonymousClass0X9 r4) {
        View view = r4.A00;
        if (view.getVisibility() != 8) {
            Rect A002 = AnonymousClass0VN.A00(view);
            Map map = r4.A02;
            map.put("android:clipBounds:clip", A002);
            if (A002 == null) {
                map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public void A0S(AnonymousClass0X9 r1) {
        A01(r1);
    }

    public void A0T(AnonymousClass0X9 r1) {
        A01(r1);
    }

    public String[] A0W() {
        return A00;
    }
}
