package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Ya  reason: invalid class name and case insensitive filesystem */
public class C07510Ya {
    public static final Object A01 = new Object();
    public static volatile C07510Ya A02;
    public ConcurrentHashMap A00 = new ConcurrentHashMap();

    public boolean A03(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return A01(context, intent, serviceConnection, this, AnonymousClass000.A0k(context), i);
    }

    public static C07510Ya A00() {
        if (A02 == null) {
            synchronized (A01) {
                if (A02 == null) {
                    A02 = new C07510Ya();
                }
            }
        }
        C07510Ya r0 = A02;
        AnonymousClass006.A01(r0);
        return r0;
    }

    public void A02(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof C15940oI)) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public static final boolean A01(Context context, Intent intent, ServiceConnection serviceConnection, C07510Ya r9, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((C02640Bg.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof C15940oI) {
            return context.bindService(intent, serviceConnection, i);
        }
        ConcurrentHashMap concurrentHashMap = r9.A00;
        Object putIfAbsent = concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (!bindService) {
                return false;
            }
            return bindService;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
