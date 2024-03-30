package X;

import android.view.ViewGroup;

/* renamed from: X.0fw  reason: invalid class name and case insensitive filesystem */
public class C11230fw implements Runnable {
    public final /* synthetic */ AnonymousClass02E A00;

    public C11230fw(AnonymousClass02E r1) {
        this.A00 = r1;
    }

    public void run() {
        ViewGroup viewGroup;
        AnonymousClass02E r2 = this.A00;
        C023009r r1 = r2.A0H;
        if (r1 != null) {
            r1.A0E = false;
        }
        if (r2.A0F != null && (viewGroup = r2.A0G) != null && r2.A0M != null) {
            AnonymousClass0BU A002 = AnonymousClass0BU.A00(viewGroup);
            A002.A06();
            A002.A04();
        }
    }
}
