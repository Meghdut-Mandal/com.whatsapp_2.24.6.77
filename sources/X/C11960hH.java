package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0hH  reason: invalid class name and case insensitive filesystem */
public class C11960hH implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0BV A02;
    public final /* synthetic */ AnonymousClass0YI A03;

    public C11960hH(Rect rect, View view, AnonymousClass0BV r3, AnonymousClass0YI r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = view;
        this.A00 = rect;
    }

    public void run() {
        AnonymousClass0YI.A01(this.A01, this.A00);
    }
}
