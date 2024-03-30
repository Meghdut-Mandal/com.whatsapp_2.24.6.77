package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.whatsapp.HomeActivity;
import com.whatsapp.collections.observablelistview.ObservableListView;

/* renamed from: X.1fY  reason: invalid class name and case insensitive filesystem */
public abstract class C33551fY {
    public static final void A00(View view, AnonymousClass02E r6) {
        AnonymousClass15M r3;
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass01I A0h = r6.A0h();
        if ((A0h instanceof AnonymousClass15M) && (r3 = (AnonymousClass15M) A0h) != null) {
            HomeActivity homeActivity = (HomeActivity) r3;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(16908290);
            viewGroup.setPadding(0, HomeActivity.A0I(homeActivity), 0, 0);
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
            ObservableListView observableListView = (ObservableListView) view.findViewById(16908298);
            C33561fZ r1 = new C33561fZ(homeActivity, homeActivity);
            C011504z.A06(r1, 2);
            observableListView.addHeaderView(r1, (Object) null, false);
            observableListView.A07 = homeActivity;
        }
    }

    public static final void A01(View view, AnonymousClass02E r6, int i) {
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass01I A0h = r6.A0h();
        if (A0h instanceof AnonymousClass15M) {
            ListView listView = (ListView) view.findViewById(16908298);
            C34031gL r1 = new C34031gL(A0h, i);
            C011504z.A06(r1, 2);
            if (listView != null) {
                listView.addFooterView(r1, (Object) null, false);
            }
        }
    }
}
