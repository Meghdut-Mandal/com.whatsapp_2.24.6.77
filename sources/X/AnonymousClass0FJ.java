package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* renamed from: X.0FJ  reason: invalid class name */
public class AnonymousClass0FJ extends C06740Uw {
    public final PowerManager A00;
    public final /* synthetic */ AnonymousClass02U A01;

    public int A00() {
        return this.A00.isPowerSaveMode() ? 2 : 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0FJ(Context context, AnonymousClass02U r4) {
        super(r4);
        this.A01 = r4;
        this.A00 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public IntentFilter A01() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    public void A04() {
        AnonymousClass02U.A0C(this.A01, true);
    }
}
