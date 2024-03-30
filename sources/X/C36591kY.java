package X;

import android.app.SharedElementCallback;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1kY  reason: invalid class name and case insensitive filesystem */
public class C36591kY extends SharedElementCallback {
    public final List A00 = AnonymousClass001.A0I();
    public final /* synthetic */ AnonymousClass01L A01;

    public C36591kY(AnonymousClass01L r2) {
        this.A01 = r2;
    }

    public void onMapSharedElements(List list, Map map) {
        super.onMapSharedElements(list, map);
        AnonymousClass01L r7 = this.A01;
        ArrayList A0I = AnonymousClass001.A0I();
        View A0C = C36361kB.A0C(r7);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C2 = AnonymousClass001.A0C(it);
            View view = (View) map.get(A0C2);
            if (view == null) {
                view = AnonymousClass3U9.A06(A0C, A0C2);
                if (view != null) {
                    map.put(A0C2, view);
                }
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (parent != null) {
                    if (parent == A0C) {
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    C011004s.A08(view, (String) null);
                    map.remove(A0C2);
                    AnonymousClass00C.A0D(A0C2, 0);
                    if (AnonymousClass098.A07(A0C2, "thumb-transition-", false)) {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        ViewGroup A0E = C36421kH.A0E(r7, R.id.conversation_layout);
                        if (A0E != null) {
                            View view2 = new View(r7);
                            A0E.addView(view2);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                            layoutParams.addRule(14);
                            layoutParams.topMargin = -height;
                            view2.setLayoutParams(layoutParams);
                            A0I.add(view2);
                            C011004s.A08(view2, A0C2);
                            map.put(A0C2, view2);
                        }
                    }
                }
            }
        }
        this.A00.addAll(A0I);
    }

    public void onSharedElementEnd(List list, List list2, List list3) {
        super.onSharedElementEnd(list, list2, list3);
        this.A01.setExitSharedElementCallback((SharedElementCallback) null);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C011004s.A08(C36431kI.A0K(it), (String) null);
        }
    }

    public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        super.onSharedElementsArrived(list, list2, onSharedElementsReadyListener);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            View A0K = C36431kI.A0K(it);
            ((ViewGroup) A0K.getParent()).removeView(A0K);
        }
    }
}
