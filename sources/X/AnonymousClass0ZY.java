package X;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.0ZY  reason: invalid class name */
public final class AnonymousClass0ZY implements Handler.Callback {
    public final /* synthetic */ C07520Yb A00;

    public /* synthetic */ AnonymousClass0ZY(C07520Yb r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap hashMap = this.A00.A02;
            synchronized (hashMap) {
                AnonymousClass0YA r4 = (AnonymousClass0YA) message.obj;
                AnonymousClass0ZV r3 = (AnonymousClass0ZV) hashMap.get(r4);
                if (r3 != null && r3.A05.isEmpty()) {
                    if (r3.A03) {
                        C07520Yb r2 = r3.A06;
                        r2.A04.removeMessages(1, r3.A04);
                        r2.A01.A02(r2.A00, r3);
                        r3.A03 = false;
                        r3.A00 = 2;
                    }
                    hashMap.remove(r4);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            HashMap hashMap2 = this.A00.A02;
            synchronized (hashMap2) {
                AnonymousClass0YA r7 = (AnonymousClass0YA) message.obj;
                AnonymousClass0ZV r5 = (AnonymousClass0ZV) hashMap2.get(r7);
                if (r5 != null && r5.A00 == 3) {
                    String valueOf = String.valueOf(r7);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Timeout waiting for ServiceConnection callback ");
                    A0u.append(valueOf);
                    Log.e("GmsClientSupervisor", A0u.toString(), new Exception());
                    ComponentName componentName = r5.A01;
                    if (componentName == null && (componentName = r7.A00) == null) {
                        String str = r7.A02;
                        AnonymousClass006.A01(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    r5.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
