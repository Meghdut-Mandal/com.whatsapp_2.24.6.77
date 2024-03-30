package com.whatsapp.migration.android.api;

import X.C19730wQ;
import X.C20810yC;
import X.C21010yW;
import X.C219612i;
import X.C36441kJ;
import android.content.BroadcastReceiver;

public class DeferredRestoreBroadcastReceiver extends BroadcastReceiver {
    public C19730wQ A00;
    public C219612i A01;
    public C20810yC A02;
    public C21010yW A03;
    public final Object A04;
    public volatile boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r1 == 0) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x001a
            java.lang.Object r1 = r5.A04
            monitor-enter(r1)
            boolean r0 = r5.A05     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            X.0tt r0 = X.C56042vd.A00(r6)     // Catch:{ all -> 0x0017 }
            X.C18830tt.APP(r0, r5)     // Catch:{ all -> 0x0017 }
            r0 = 1
            r5.A05 = r0     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            java.lang.String r0 = "DeferredRestoreBroadcastReceiver/on-receive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r7 == 0) goto L_0x003c
            java.lang.String r1 = r7.getAction()
            java.lang.String r0 = "com.google.android.apps.pixelmigrate.IOS_APP_DATA_AVAILABLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003c
            X.0yC r1 = r5.A02
            r0 = 835(0x343, float:1.17E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/did not send data because ab prop is not enabled"
        L_0x0039:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x003c:
            return
        L_0x003d:
            X.2P2 r3 = new X.2P2
            r3.<init>()
            X.0wQ r0 = r5.A00
            r0.A0G()
            com.whatsapp.Me r0 = r0.A00
            r4 = 0
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            X.12i r1 = r5.A01     // Catch:{ RuntimeException -> 0x006e }
            java.lang.String r0 = "cross_platform_migration_completed"
            java.lang.String r0 = r1.A01(r0)     // Catch:{ RuntimeException -> 0x006e }
            if (r0 == 0) goto L_0x0066
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x006e }
            r0 = 1
            if (r1 != 0) goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ RuntimeException -> 0x006e }
            r3.A00 = r0     // Catch:{ RuntimeException -> 0x006e }
            goto L_0x007a
        L_0x006e:
            r1 = move-exception
            java.lang.String r0 = "DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.A00 = r0
        L_0x007a:
            X.0yW r1 = r5.A03
            X.0u5 r0 = new X.0u5
            r0.<init>(r2, r2)
            r1.Bls(r3, r0, r2)
            java.lang.String r0 = "DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/sent wam event"
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.api.DeferredRestoreBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public DeferredRestoreBroadcastReceiver(int i) {
        this.A05 = false;
        this.A04 = C36441kJ.A11();
    }

    public DeferredRestoreBroadcastReceiver() {
        this(0);
    }
}
