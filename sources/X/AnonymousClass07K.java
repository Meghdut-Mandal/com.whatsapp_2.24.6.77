package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.07K  reason: invalid class name */
public class AnonymousClass07K implements View.OnClickListener {
    public final AnonymousClass07M A00;
    public final /* synthetic */ AnonymousClass07J A01;

    public AnonymousClass07K(AnonymousClass07J r4) {
        this.A01 = r4;
        this.A00 = new AnonymousClass07M(r4.A09.getContext(), r4.A0B);
    }

    public void onClick(View view) {
        AnonymousClass07J r0 = this.A01;
        Window.Callback callback = r0.A07;
        if (callback != null && r0.A0C) {
            callback.onMenuItemSelected(0, this.A00);
        }
    }
}
