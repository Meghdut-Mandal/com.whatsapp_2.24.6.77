package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0BV  reason: invalid class name */
public class AnonymousClass0BV extends AnonymousClass0BU {
    public void A07(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!A03(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        A07(childAt, arrayList);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void A01(AnonymousClass008 r1, Collection collection) {
        Iterator it = r1.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C011004s.A03((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    public static boolean A03(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public void A08(View view, Map map) {
        String A03 = C011004s.A03(view);
        if (A03 != null) {
            map.put(A03, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    A08(childAt, map);
                }
            }
        }
    }

    public AnonymousClass0BV(ViewGroup viewGroup) {
        super(viewGroup);
    }
}
