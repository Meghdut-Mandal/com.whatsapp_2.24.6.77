package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3Ef  reason: invalid class name and case insensitive filesystem */
public class C61973Ef {
    public final Rect A00 = AnonymousClass001.A06();
    public final C80203v1 A01;
    public final WeakReference A02;
    public final List A03 = new LinkedList();
    public final Rect A04 = AnonymousClass001.A06();
    public final List A05 = AnonymousClass001.A0I();

    public C61973Ef(View view, C80203v1 r3) {
        this.A02 = AnonymousClass001.A0F(view);
        this.A01 = r3;
    }

    public void A00(List list) {
        list.clear();
        List list2 = this.A03;
        list2.clear();
        View A0Y = AnonymousClass000.A0Y(this.A02);
        if (A0Y != null) {
            Rect rect = this.A00;
            if (A0Y.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                list2.add(rect);
                Iterator it = this.A01.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0A("getClipRect");
                } else {
                    list.addAll(list2);
                }
            }
        }
    }
}
