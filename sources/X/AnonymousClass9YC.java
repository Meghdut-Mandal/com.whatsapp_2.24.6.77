package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.LinkedHashSet;

/* renamed from: X.9YC  reason: invalid class name */
public abstract class AnonymousClass9YC {
    public Object A00;
    public final Context A01;
    public final Object A02 = C36441kJ.A11();
    public final LinkedHashSet A03 = C36441kJ.A17();
    public final AnonymousClass7eB A04;

    public void A06() {
        C1683980l r4 = (C1683980l) this;
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str = AnonymousClass98K.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(r4, A0u);
        AnonymousClass6VD.A03(A002, ": registering receiver", str, A0u);
        r4.A01.registerReceiver(r4.A00, r4.A08());
    }

    public void A07() {
        C1683980l r4 = (C1683980l) this;
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str = AnonymousClass98K.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(r4, A0u);
        AnonymousClass6VD.A03(A002, ": unregistering receiver", str, A0u);
        r4.A01.unregisterReceiver(r4.A00);
    }

    public final void A03(C157127bs r4) {
        synchronized (this.A02) {
            LinkedHashSet linkedHashSet = this.A03;
            if (linkedHashSet.remove(r4) && linkedHashSet.isEmpty()) {
                A07();
            }
        }
    }

    public final void A04(Object obj) {
        synchronized (this.A02) {
            Object obj2 = this.A00;
            if (obj2 == null || !obj2.equals(obj)) {
                this.A00 = obj;
                ((C138956iy) this.A04).A02.execute(new AnonymousClass75C((Object) C007103b.A0Y(this.A03), (Object) this, 15));
            }
        }
    }

    public Object A05() {
        String action;
        int hashCode;
        if (this instanceof C1683780j) {
            C1683980l r0 = (C1683980l) this;
            Intent registerReceiver = r0.A01.registerReceiver((BroadcastReceiver) null, r0.A08());
            boolean z = false;
            if (registerReceiver == null || registerReceiver.getAction() == null || ((action = registerReceiver.getAction()) != null && (hashCode = action.hashCode()) != -1181163412 && hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK"))) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (this instanceof C1683880k) {
            return C202789mf.A01(((C1683880k) this).A00);
        } else {
            Intent registerReceiver2 = this.A01.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z2 = false;
            if (registerReceiver2 == null) {
                AnonymousClass6VD.A00();
                Log.e(AnonymousClass98J.A00, "getInitialState - null intent received");
            } else {
                int intExtra = registerReceiver2.getIntExtra("status", -1);
                float intExtra2 = ((float) registerReceiver2.getIntExtra("level", -1)) / ((float) registerReceiver2.getIntExtra("scale", -1));
                if (intExtra == 1 || intExtra2 > 0.15f) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    public AnonymousClass9YC(Context context, AnonymousClass7eB r3) {
        this.A04 = r3;
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        this.A01 = applicationContext;
    }
}
