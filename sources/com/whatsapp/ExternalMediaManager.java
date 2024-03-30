package com.whatsapp;

import X.AnonymousClass0DY;
import X.C18700tb;
import X.C18800tq;
import X.C19770wU;
import X.C24341Cb;
import X.C29301Wc;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36341k9;
import X.C36431kI;
import X.C36441kJ;
import X.C39171rR;
import X.C64353Nq;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ExternalMediaManager extends C39171rR implements C18700tb {
    public C29301Wc A00;
    public C24341Cb A01;
    public C64353Nq A02;
    public C19770wU A03;
    public boolean A04;
    public final Object A05;
    public volatile C31091bG A06;

    public class ExternalMediaStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if ("android.intent.action.MEDIA_BAD_REMOVAL".equals(intent.getAction()) || "android.intent.action.MEDIA_EJECT".equals(intent.getAction()) || "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction()) || "android.intent.action.MEDIA_REMOVED".equals(intent.getAction()) || "android.intent.action.MEDIA_SHARED".equals(intent.getAction()) || "android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                Class<ExternalMediaManager> cls = ExternalMediaManager.class;
                AnonymousClass0DY.A00(context, intent.setClass(context, cls), cls, 5);
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C31091bG(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public void onCreate() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            this.A03 = C36341k9.A0Z(r1);
            this.A00 = (C29301Wc) r1.A0b.get();
            this.A01 = C36431kI.A0a(r1);
            this.A02 = (C64353Nq) r1.A00.A2f.get();
        }
        super.onCreate();
    }

    public ExternalMediaManager(int i) {
        this.A05 = C36441kJ.A11();
        this.A04 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r4 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "mounted_ro"
            boolean r1 = r4.equals(r0)
            X.1Cb r0 = r5.A01
            X.005 r0 = r0.A00
            if (r1 != 0) goto L_0x005d
            java.lang.Object r1 = r0.get()
            X.36X r1 = (X.AnonymousClass36X) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0037
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "media-state-manager/external/unavailable "
            r1.append(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C36321k7.A1a(r1, r0)
        L_0x0037:
            X.1Wc r0 = r5.A00
            X.0xD r0 = X.C29301Wc.A00(r0)
            X.1ei r0 = r0.A01
            r0.A0A(r4)
            return
        L_0x0043:
            X.1Cb r0 = r5.A01
            X.005 r0 = r0.A00
            java.lang.Object r2 = r0.get()
            X.36X r2 = (X.AnonymousClass36X) r2
            boolean r0 = r2.A00
            r1 = 0
            if (r0 != 0) goto L_0x0056
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0037
        L_0x0056:
            r2.A00 = r1
            r2.A01 = r1
            java.lang.String r0 = "media-state-manager/external/available"
            goto L_0x0073
        L_0x005d:
            java.lang.Object r2 = r0.get()
            X.36X r2 = (X.AnonymousClass36X) r2
            boolean r0 = r2.A00
            r1 = 0
            if (r0 != 0) goto L_0x006c
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0037
        L_0x006c:
            r2.A00 = r1
            r0 = 1
            r2.A01 = r0
            java.lang.String r0 = "media-state-manager/read-only"
        L_0x0073:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Nq r2 = r5.A02
            X.1Cb r3 = r2.A02
            X.005 r1 = r3.A00
            java.lang.Object r0 = r1.get()
            X.36X r0 = (X.AnonymousClass36X) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0037
            java.lang.Object r0 = r1.get()
            X.36X r0 = (X.AnonymousClass36X) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0098
            X.0y0 r0 = r2.A00
            r0.A0d()
            X.C64353Nq.A00(r2)
        L_0x0098:
            X.005 r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.6sV r0 = (X.C144596sV) r0
            r0.A01()
            X.17Y r2 = r2.A01
            java.util.Objects.requireNonNull(r3)
            r1 = 15
            X.74t r0 = new X.74t
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Bp3(r0)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ExternalMediaManager.A0A(android.content.Intent):void");
    }

    public ExternalMediaManager() {
        this(0);
    }
}
