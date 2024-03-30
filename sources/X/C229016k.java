package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* renamed from: X.16k  reason: invalid class name and case insensitive filesystem */
public class C229016k extends ContextWrapper {
    public LayoutInflater A00;
    public final C228816i A01;
    public final C18770tn A02;
    public final C18820ts A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C229016k(android.content.Context r3, X.C228816i r4, X.C18820ts r5) {
        /*
            r2 = this;
            boolean r0 = X.C18820ts.A0B
            if (r0 != 0) goto L_0x0026
            if (r3 == 0) goto L_0x0026
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r1 = r0.locale
            java.util.Locale r0 = r5.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0026
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            java.util.Locale r0 = r5.A04
            r1.setLocale(r0)
            android.content.Context r3 = r3.createConfigurationContext(r1)
        L_0x0026:
            r2.<init>(r3)
            r2.A03 = r5
            r2.A01 = r4
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources r0 = r0.getResources()
            boolean r1 = r0 instanceof X.C18770tn
            android.content.Context r0 = r2.getBaseContext()
            if (r1 == 0) goto L_0x0046
            android.content.res.Resources r0 = r0.getResources()
            X.0tn r0 = (X.C18770tn) r0
        L_0x0043:
            r2.A02 = r0
            return
        L_0x0046:
            X.0tn r0 = X.C18770tn.A02(r0, r5)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229016k.<init>(android.content.Context, X.16i, X.0ts):void");
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A00;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        C229116l r2 = new C229116l(this, LayoutInflater.from(getBaseContext()), ((C228916j) this.A01).A00);
        this.A00 = r2;
        return r2;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return new C229016k(super.createConfigurationContext(configuration), this.A01, this.A03);
    }

    public Resources getResources() {
        return this.A02;
    }

    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        C18860tw.A02(intent);
        super.sendBroadcast(intent, str, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle);
    }

    public void startActivity(Intent intent) {
        C18860tw.A03(intent);
        super.startActivity(intent);
    }

    public void sendBroadcast(Intent intent, String str) {
        C18860tw.A02(intent);
        super.sendBroadcast(intent, str);
    }

    public void sendOrderedBroadcast(Intent intent, String str) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str);
    }

    public void sendBroadcast(Intent intent) {
        C18860tw.A02(intent);
        super.sendBroadcast(intent);
    }

    public void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, i, str2, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, int i, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, String str3, Bundle bundle, Bundle bundle2) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, i, str, str2, broadcastReceiver, handler, str3, bundle, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle, broadcastReceiver, handler, i, str2, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str3, Bundle bundle) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str, str2, broadcastReceiver, handler, i, str3, bundle);
    }
}
