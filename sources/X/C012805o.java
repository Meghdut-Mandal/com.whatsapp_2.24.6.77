package X;

import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.05o  reason: invalid class name and case insensitive filesystem */
public class C012805o implements Runnable {
    public final /* synthetic */ Toolbar A00;

    public C012805o(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public void run() {
        C09460cP r0;
        ActionMenuView actionMenuView = this.A00.A09;
        if (actionMenuView != null && (r0 = actionMenuView.A04) != null) {
            r0.A03();
        }
    }
}
