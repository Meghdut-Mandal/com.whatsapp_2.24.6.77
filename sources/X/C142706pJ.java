package X;

import android.content.Context;
import android.content.IntentFilter;
import com.whatsapp.util.Log;

/* renamed from: X.6pJ  reason: invalid class name and case insensitive filesystem */
public final class C142706pJ implements C19710wO {
    public final AnonymousClass005 A00;
    public final Context A01;
    public final C90864b0 A02 = new C90864b0(this);

    public C142706pJ(Context context, AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = context;
        this.A00 = r3;
    }

    public String BIB() {
        return "BackgroundRestrictionManager";
    }

    public /* synthetic */ void BRM() {
    }

    public void BRL() {
        if (!C19550w8.A02()) {
            Log.w("BackgroundRestrictionManager; init on unsupported OS version.");
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        C26981Mg.A01(this.A02, this.A01, intentFilter, true);
        for (C144366s4 r3 : (Iterable) C36411kG.A0v(this.A00)) {
            if (r3.A01.A04()) {
                r3.A02.execute(new C1497172m(r3, 42));
            }
        }
    }
}
