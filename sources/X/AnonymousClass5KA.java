package X;

import java.util.Set;

/* renamed from: X.5KA  reason: invalid class name */
public abstract class AnonymousClass5KA extends AnonymousClass1U6 {
    public C19700wN A00;
    public C19770wU A01;
    public int A02 = -1;
    public final B6T A03 = AnonymousClass8HO.create();
    public final String A04 = "xpm-msg-exporter-svc";
    public final Set A05 = C36441kJ.A16();

    public static void A00(AnonymousClass5KA r1) {
        synchronized (r1) {
            if (r1.A03.isEmpty() && r1.A05.isEmpty()) {
                r1.stopSelf(r1.A02);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5.A01 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r15, int r16, int r17) {
        /*
            r14 = this;
            r7 = r14
            monitor-enter(r7)
            int r0 = r14.A02     // Catch:{ all -> 0x0116 }
            r12 = r17
            if (r12 <= r0) goto L_0x000a
            r14.A02 = r12     // Catch:{ all -> 0x0116 }
        L_0x000a:
            java.util.Set r3 = r14.A05     // Catch:{ all -> 0x0116 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0116 }
            r3.add(r2)     // Catch:{ all -> 0x0116 }
            monitor-exit(r7)     // Catch:{ all -> 0x0116 }
            r9 = r14
            com.whatsapp.migration.export.service.MessagesExporterService r9 = (com.whatsapp.migration.export.service.MessagesExporterService) r9
            if (r15 != 0) goto L_0x0022
            java.lang.String r0 = "xpm-export-service-onStartCommand()/intent is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x001e:
            r0 = 2
            monitor-enter(r7)
            goto L_0x0105
        L_0x0022:
            java.lang.String r0 = r15.getAction()
            java.lang.String r6 = "ACTION_START_EXPORT"
            boolean r0 = r6.equals(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0053
            X.6WX r5 = r9.A00
            monitor-enter(r5)
            android.os.CancellationSignal r0 = r5.A00     // Catch:{ all -> 0x0110 }
            if (r0 != 0) goto L_0x003b
            java.util.concurrent.CountDownLatch r1 = r5.A01     // Catch:{ all -> 0x0110 }
            r0 = 0
            if (r1 == 0) goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            monitor-exit(r5)
            if (r0 != 0) goto L_0x0047
            X.6WX r0 = r9.A00
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0053
        L_0x0047:
            java.lang.String r0 = "xpm-export-service-onStartCommand()/export in progress"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wN r5 = r9.A00
            java.lang.String r1 = "xpm-export-service-export-duplicated-start"
            java.lang.String r0 = "xpm-export-service-onStartCommand: duplicated call with ACTION_START_EXPORT event - there is another task running export or cancellation"
            goto L_0x0074
        L_0x0053:
            java.lang.String r1 = r15.getAction()
            java.lang.String r0 = "ACTION_CANCEL_EXPORT"
            boolean r0 = r0.equals(r1)
            r5 = 31
            if (r0 == 0) goto L_0x00a9
            X.6WX r0 = r9.A00
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "xpm-export-service-onStartCommand()/cancellation in already in progress"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wN r5 = r9.A00
            java.lang.String r1 = "xpm-export-service-cancel-duplicated-start"
            java.lang.String r0 = "xpm-export-service-onStartCommand: duplicated call with ACTION_CANCEL_EXPORT event - there is another task running cancellation"
        L_0x0074:
            r5.A0E(r1, r0, r4)
            goto L_0x001e
        L_0x0078:
            java.lang.String r0 = "xpm-export-service-onStartCommand()/action_cancel_export"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Sl r0 = r9.A01
            X.0Yy r4 = X.C132156Sl.A00(r0)
            X.0wG r0 = r0.A00
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)
            r0 = 2131889498(0x7f120d5a, float:1.9413661E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A0F(r0)
            android.app.Notification r0 = r4.A05()
            r9.startForeground(r5, r0)
            X.6WX r1 = r9.A00
            java.util.Objects.requireNonNull(r1)
            r0 = 18
            X.72n r10 = new X.72n
            r10.<init>(r1, r0)
            java.lang.String r11 = "cancel-export"
            goto L_0x00da
        L_0x00a9:
            boolean r0 = X.C90514aH.A1W(r15, r6)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "xpm-export-service-onStartCommand()/action_start_export"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Sl r0 = r9.A01
            X.0Yy r4 = X.C132156Sl.A00(r0)
            X.0wG r0 = r0.A00
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)
            r0 = 2131889504(0x7f120d60, float:1.9413673E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A0F(r0)
            android.app.Notification r0 = r4.A05()
            r9.startForeground(r5, r0)
            r0 = 17
            X.74j r10 = new X.74j
            r10.<init>(r9, r15, r0)
            java.lang.String r11 = "export-data"
        L_0x00da:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r9.A04
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "; async task scheduled (foreground), start_id="
            X.C36321k7.A1T(r0, r1, r12)
            X.0wU r0 = r9.A01
            r13 = 8
            X.3vX r8 = new X.3vX
            r8.<init>(r9, r10, r11, r12, r13)
            r0.Bp1(r8)
            monitor-enter(r7)
            X.B6T r0 = r9.A03     // Catch:{ all -> 0x0113 }
            r0.add(r2)     // Catch:{ all -> 0x0113 }
            monitor-exit(r7)     // Catch:{ all -> 0x0113 }
            goto L_0x001e
        L_0x0105:
            r3.remove(r2)     // Catch:{ all -> 0x010d }
            A00(r14)     // Catch:{ all -> 0x010d }
            monitor-exit(r7)     // Catch:{ all -> 0x010d }
            return r0
        L_0x010d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x010d }
            throw r0
        L_0x0110:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0113:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0113 }
            throw r0
        L_0x0116:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0116 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5KA.onStartCommand(android.content.Intent, int, int):int");
    }
}
