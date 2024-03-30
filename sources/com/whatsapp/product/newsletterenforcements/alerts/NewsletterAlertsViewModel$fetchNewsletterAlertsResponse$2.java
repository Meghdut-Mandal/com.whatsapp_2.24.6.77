package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C39771tc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$fetchNewsletterAlertsResponse$2", f = "NewsletterAlertsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAlertsViewModel$fetchNewsletterAlertsResponse$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C39771tc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAlertsViewModel$fetchNewsletterAlertsResponse$2(C39771tc r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new NewsletterAlertsViewModel$fetchNewsletterAlertsResponse$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterAlertsViewModel$fetchNewsletterAlertsResponse$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            if (r0 != 0) goto L_0x00e0
            X.AnonymousClass0AN.A00(r11)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            X.1tc r0 = r10.this$0
            X.12q r1 = r0.A01
            X.1Uw r0 = r0.A03
            X.3Qp r1 = X.C36371kC.A0W(r1, r0)
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0032
            X.1tc r4 = r10.this$0
            X.0yC r2 = r4.A02
            r0 = 6146(0x1802, float:8.612E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x003a
            X.1GQ r0 = r4.A04
            boolean r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x003a
            X.2aj r0 = X.C46662aj.A00
        L_0x002f:
            r3.add(r0)
        L_0x0032:
            X.1tc r0 = r10.this$0
            X.3Ha r2 = r0.A07
            X.1Uw r1 = r0.A03
            monitor-enter(r2)
            goto L_0x00a8
        L_0x003a:
            X.1Zp r0 = r4.A08
            r8 = 0
            r9 = 0
            X.12P r0 = r0.A02     // Catch:{ all -> 0x008f }
            X.1M0 r7 = r0.get()     // Catch:{ all -> 0x008f }
            X.14e r5 = r7.A02     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "SELECT EXISTS ( SELECT 1 FROM newsletter_message_enforcements JOIN available_message_view WHERE newsletter_message_enforcements.message_row_id = available_message_view._id AND available_message_view.chat_row_id = ? AND available_message_view.message_type != 15) AS message_exists"
            r6 = 1
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x0085 }
            java.lang.Long r0 = r1.A07()     // Catch:{ all -> 0x0085 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0085 }
            X.C36351kA.A1V(r2, r8, r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "GET_ENFORCED_MESSAGE_EXISTS_FOR_CHAT"
            android.database.Cursor r8 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x0085 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "message_exists"
            long r4 = X.C36351kA.A07(r8, r0)     // Catch:{ all -> 0x007b }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r6 = 0
        L_0x0070:
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0079 }
            r8.close()     // Catch:{ all -> 0x0083 }
            r7.close()     // Catch:{ all -> 0x008d }
            goto L_0x0096
        L_0x0079:
            r1 = move-exception
            goto L_0x007d
        L_0x007b:
            r1 = move-exception
            r6 = 0
        L_0x007d:
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            goto L_0x0087
        L_0x0085:
            r1 = move-exception
            r6 = 0
        L_0x0087:
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x008d }
            throw r0     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            goto L_0x0091
        L_0x008f:
            r0 = move-exception
            r6 = 0
        L_0x0091:
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0096:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)
            if (r1 == 0) goto L_0x00a6
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed to search channel for enforced messages"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a1:
            if (r9 == 0) goto L_0x0032
            X.2ai r0 = X.AnonymousClass2ai.A00
            goto L_0x002f
        L_0x00a6:
            r9 = r6
            goto L_0x00a1
        L_0x00a8:
            X.3HZ r0 = r2.A00(r1)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00b5
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x00dd }
            java.util.List r1 = X.C007103b.A0Y(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00b7
        L_0x00b5:
            X.09w r1 = X.C023409w.A00     // Catch:{ all -> 0x00dd }
        L_0x00b7:
            monitor-exit(r2)
            r0 = 7
            java.util.List r0 = X.C89834Yb.A00(r1, r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00c1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r2.next()
            X.3HY r0 = (X.AnonymousClass3HY) r0
            java.lang.String r1 = r0.A00
            X.2ah r0 = new X.2ah
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x00c1
        L_0x00d8:
            java.util.List r0 = X.C007103b.A0Y(r3)
            return r0
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$fetchNewsletterAlertsResponse$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
