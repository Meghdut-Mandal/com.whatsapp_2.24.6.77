package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.4bJ  reason: invalid class name and case insensitive filesystem */
public class C91014bJ extends ContentObserver {
    public final /* synthetic */ C146826wE A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91014bJ(C146826wE r2) {
        super((Handler) null);
        this.A00 = r2;
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        this.A00.A0F.A08.post(new C1503074t((Object) this, 48));
    }
}
