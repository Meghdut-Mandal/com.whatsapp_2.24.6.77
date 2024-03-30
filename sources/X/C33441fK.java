package X;

import android.content.res.Resources;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.1fK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C33441fK implements C009604b {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ C235718z A01;
    public final /* synthetic */ AnonymousClass00S A02;

    public /* synthetic */ C33441fK(Resources resources, C235718z r2, AnonymousClass00S r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = resources;
    }

    public final void BQj(Object obj) {
        AnonymousClass00S r4 = this.A02;
        Resources resources = this.A00;
        if (((C009804d) obj).A00 == -1) {
            C235718z.A01(resources, (View) r4.invoke(), R.string.f12nameremoved);
        }
    }
}
