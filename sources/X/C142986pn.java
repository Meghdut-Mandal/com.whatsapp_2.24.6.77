package X;

import android.app.Activity;
import com.whatsapp.R;

/* renamed from: X.6pn  reason: invalid class name and case insensitive filesystem */
public class C142986pn implements AnonymousClass7fZ {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C202279lS A01;
    public final /* synthetic */ AnonymousClass6VK A02;

    public C142986pn(Activity activity, C202279lS r2, AnonymousClass6VK r3) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = r2;
    }

    public void Bdc(AnonymousClass9N9 r5, boolean z) {
        C225014r r3 = (C225014r) this.A00;
        r3.Bnv();
        r3.BO9(C90524aI.A0w(), R.string.f12nameremoved, R.string.f12nameremoved);
        this.A01.A0O.remove(this);
    }
}
