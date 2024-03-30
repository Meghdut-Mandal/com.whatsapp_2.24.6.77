package X;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.0c4  reason: invalid class name and case insensitive filesystem */
public class C09250c4 implements AbsListView.OnScrollListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0YZ A02;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C09250c4(View view, View view2, AnonymousClass0YZ r3) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0YZ.A01(absListView, this.A01, this.A00);
    }
}
