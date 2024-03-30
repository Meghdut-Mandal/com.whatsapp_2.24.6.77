package X;

import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.2qd  reason: invalid class name and case insensitive filesystem */
public class C53052qd {
    public C53052qd(C130836Mp r7, AnonymousClass3PT r8) {
        Map map = r8.A03;
        String str = r7.A01;
        AnonymousClass365 r3 = (AnonymousClass365) map.get(str);
        if (r3 != null) {
            Rect rect = r3.A01;
            if (rect.top == Integer.MIN_VALUE || rect.left == Integer.MIN_VALUE || rect.right == Integer.MIN_VALUE || rect.bottom == Integer.MIN_VALUE) {
                throw AnonymousClass001.A09("This viewpoint has not been measured or is a group which will never return a measurement since it's made up of subviews that could be offscreen");
            }
            rect.height();
            rect.width();
            for (Rect rect2 : r3.A02) {
                rect2.height();
                rect2.width();
            }
        }
        map.get(str);
    }
}
