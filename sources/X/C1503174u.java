package X;

import android.content.ContentProviderOperation;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.74u  reason: invalid class name and case insensitive filesystem */
public class C1503174u implements Runnable {
    public final C131586Pq A00;
    public final /* synthetic */ C27381Nz A01;

    public C1503174u(C27381Nz r1, C131586Pq r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static long A00(AnonymousClass1O6 r3, String str) {
        return AnonymousClass1O6.A00(r3).getLong(str, -1);
    }

    public static ContentProviderOperation.Builder A01(ContentProviderOperation.Builder builder, Jid jid, Object obj) {
        return builder.withValue("data1", jid.getRawString()).withValue("data2", obj);
    }

    public static ContentProviderOperation.Builder A02(Uri uri, Object obj, Object obj2) {
        return ContentProviderOperation.newInsert(uri).withYieldAllowed(true).withValue("raw_contact_id", obj).withValue("mimetype", obj2);
    }

    private void A04(C131626Pu r7) {
        boolean isEmpty;
        C131586Pq r5 = this.A00;
        List<C106765Lg> list = r5.A03;
        synchronized (list) {
            ArrayList A0I = AnonymousClass001.A0I();
            for (C106765Lg r1 : list) {
                if (!r1.A00) {
                    A0I.add(r1);
                    r1.BVO(r7);
                }
            }
            list.removeAll(A0I);
            isEmpty = list.isEmpty();
        }
        if (!isEmpty) {
            r5.A01 = false;
            C27381Nz.A02(this.A01, r5);
        }
    }

    private void A05(C131626Pu r4) {
        List<C106765Lg> list = this.A00.A03;
        synchronized (list) {
            for (C106765Lg BVO : list) {
                BVO.BVO(r4);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r81 = this;
            r80 = r81
            r0 = r80
            X.1Nz r3 = r0.A01
            X.6Pq r2 = r0.A00
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0021
            X.19J r0 = r3.A05
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "ContactSyncRequestExecutor/onStartRun exiting early for non-urgent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Pu r1 = X.C131626Pu.A05
            r0 = r80
            r0.A05(r1)
            return
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0V
            r28 = r0
            monitor-enter(r28)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x17bf }
            java.lang.String r0 = "ContactSyncRequestExecutor/onStart "
            X.C36321k7.A1K(r2, r0, r1)     // Catch:{ all -> 0x17bf }
            r1 = 1
            r0 = r28
            r0.set(r1)     // Catch:{ all -> 0x17bf }
            X.1Om r0 = r3.A0H     // Catch:{ all -> 0x17bf }
            r23 = r0
            monitor-enter(r23)     // Catch:{ all -> 0x17bf }
            java.util.Set r0 = r0.A02     // Catch:{ all -> 0x17bc }
            r0.remove(r2)     // Catch:{ all -> 0x17bc }
            r0 = r23
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x17bc }
            r0.remove(r2)     // Catch:{ all -> 0x17bc }
            X.C27511Om.A00(r23)     // Catch:{ all -> 0x17bc }
            monitor-exit(r23)     // Catch:{ all -> 0x17bf }
            monitor-enter(r23)     // Catch:{ all -> 0x17bf }
            r0 = r23
            r0.A00 = r2     // Catch:{ all -> 0x17bc }
            X.C27511Om.A00(r23)     // Catch:{ all -> 0x17bc }
            monitor-exit(r23)     // Catch:{ all -> 0x17bf }
            monitor-exit(r28)     // Catch:{ all -> 0x17bf }
            X.17Y r0 = r3.A03
            r79 = r0
            X.005 r0 = r3.A0S
            java.lang.Object r4 = r0.get()
            java.util.Objects.requireNonNull(r4)
            r0 = 49
            X.1j4 r1 = new X.1j4
            r1.<init>(r4, r0)
            r0 = r79
            r0.A0H(r1)
            boolean r0 = r2.A0B
            r18 = r0
            boolean r0 = r2.A0H
            r17 = r0
            boolean r0 = r2.A0I
            r21 = r0
            boolean r7 = r2.A0G
            boolean r0 = r2.A0A
            r25 = r0
            boolean r0 = r2.A0C
            r19 = r0
            boolean r8 = r2.A0F
            boolean r0 = r2.A0D
            r24 = r0
            boolean r0 = r2.A0E
            r26 = r0
            boolean r0 = r2.A09
            r20 = r0
            boolean r0 = r2.A0K
            r27 = r0
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x00a5
            X.0yC r1 = r3.A0O
            r0 = 4921(0x1339, float:6.896E-42)
            boolean r0 = r1.A0E(r0)
            r53 = 1
            if (r0 != 0) goto L_0x00a7
        L_0x00a5:
            r53 = 0
        L_0x00a7:
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x00cb
            X.0wQ r0 = r3.A04
            r0.A0G()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x00bc
            X.12U r0 = r3.A0Q
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00cb
        L_0x00bc:
            java.lang.String r0 = "ContactSyncRequestExecutor/registration not complete"
        L_0x00be:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00c1:
            X.6Pu r4 = X.C131626Pu.A03
        L_0x00c3:
            r0 = r80
            r0.A05(r4)
        L_0x00c8:
            monitor-enter(r28)
            goto L_0x1728
        L_0x00cb:
            X.0wD r0 = r3.A09
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "ContactSyncRequestExecutor/no-network"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Pu r4 = X.C131626Pu.A04
            r0 = r80
            r0.A04(r4)
            goto L_0x00c8
        L_0x00e0:
            X.0wo r0 = r3.A0K
            long r0 = X.C19970wo.A00(r0)
            X.1O6 r4 = r3.A0C
            r78 = r4
            android.content.SharedPreferences r9 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r6 = "global_backoff_time"
            r4 = -1
            long r10 = r9.getLong(r6, r4)
            java.lang.String r9 = "ms"
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x011a
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "ContactSyncRequestExecutor/global backoff for another "
            r7.append(r2)
            r2 = r78
            long r4 = A00(r2, r6)
            long r4 = r4 - r0
            r7.append(r4)
            r7.append(r9)
        L_0x0112:
            java.lang.String r0 = r7.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00c1
        L_0x011a:
            X.5Tu r6 = r2.A02
            X.5TH r5 = r6.mode
            X.5TH r32 = X.AnonymousClass5TH.FULL
            r4 = r32
            if (r5 != r4) goto L_0x034e
            if (r18 == 0) goto L_0x014e
            android.content.SharedPreferences r11 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r10 = "contact_sync_backoff"
            r4 = -1
            long r11 = r11.getLong(r10, r4)
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x014e
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncRequestExecutor/contact backoff for another "
            r11.append(r4)
            r4 = r78
            long r4 = A00(r4, r10)
            long r4 = r4 - r0
            r11.append(r4)
            X.C36321k7.A1a(r11, r9)
            r18 = 0
        L_0x014e:
            if (r17 == 0) goto L_0x0178
            android.content.SharedPreferences r11 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r10 = "sidelist_sync_backoff"
            r4 = -1
            long r11 = r11.getLong(r10, r4)
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0178
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncRequestExecutor/sidelist backoff for another "
            r11.append(r4)
            r4 = r78
            long r4 = A00(r4, r10)
            long r4 = r4 - r0
            r11.append(r4)
            X.C36321k7.A1a(r11, r9)
            r17 = 0
        L_0x0178:
            if (r21 == 0) goto L_0x01a2
            android.content.SharedPreferences r10 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r11 = "status_sync_backoff"
            r4 = -1
            long r12 = r10.getLong(r11, r4)
            int r4 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a2
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncRequestExecutor/status backoff for another "
            r10.append(r4)
            r4 = r78
            long r4 = A00(r4, r11)
            long r4 = r4 - r0
            r10.append(r4)
            X.C36321k7.A1a(r10, r9)
            r21 = 0
        L_0x01a2:
            if (r53 == 0) goto L_0x01cc
            android.content.SharedPreferences r11 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r10 = "text_status_sync_backoff"
            r4 = -1
            long r11 = r11.getLong(r10, r4)
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x01cc
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncRequestExecutor/text status backoff for another "
            r11.append(r4)
            r4 = r78
            long r4 = A00(r4, r10)
            long r4 = r4 - r0
            r11.append(r4)
            X.C36321k7.A1a(r11, r9)
            r53 = 0
        L_0x01cc:
            if (r7 == 0) goto L_0x01f4
            android.content.SharedPreferences r7 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r10 = "picture_sync_backoff"
            r4 = -1
            long r11 = r7.getLong(r10, r4)
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x033c
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncRequestExecutor/picture backoff for another "
            r7.append(r4)
            r4 = r78
            long r4 = A00(r4, r10)
            long r4 = r4 - r0
            r7.append(r4)
            X.C36321k7.A1a(r7, r9)
        L_0x01f4:
            r45 = 0
        L_0x01f6:
            if (r25 == 0) goto L_0x0220
            android.content.SharedPreferences r7 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r10 = "business_sync_backoff"
            r4 = -1
            long r11 = r7.getLong(r10, r4)
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0220
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncRequestExecutor/business backoff for another "
            r7.append(r4)
            r4 = r78
            long r4 = A00(r4, r10)
            long r4 = r4 - r0
            r7.append(r4)
            X.C36321k7.A1a(r7, r9)
            r25 = 0
        L_0x0220:
            if (r19 == 0) goto L_0x0254
            android.content.SharedPreferences r4 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r5 = "devices_sync_backoff"
            long r10 = X.C36371kC.A08(r4, r5)
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0254
            X.5Tc r7 = r6.context
            X.5Tc r4 = X.C108335Tc.MESSAGE
            if (r7 == r4) goto L_0x0254
            X.5Tc r4 = X.C108335Tc.VOIP
            if (r7 == r4) goto L_0x0254
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncRequestExecutor/devices backoff for another "
            r7.append(r4)
            android.content.SharedPreferences r4 = X.AnonymousClass1O6.A00(r78)
            long r4 = X.C36371kC.A08(r4, r5)
            long r4 = r4 - r0
            r7.append(r4)
            X.C36321k7.A1a(r7, r9)
            r19 = 0
        L_0x0254:
            if (r8 == 0) goto L_0x027c
            android.content.SharedPreferences r7 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r8 = "payment_sync_backoff"
            r4 = -1
            long r10 = r7.getLong(r8, r4)
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0330
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncRequestExecutor/payment backoff for another "
            r7.append(r4)
            r4 = r78
            long r4 = A00(r4, r8)
            long r4 = r4 - r0
            r7.append(r4)
            X.C36321k7.A1a(r7, r9)
        L_0x027c:
            r48 = 0
        L_0x027e:
            if (r24 == 0) goto L_0x02a8
            android.content.SharedPreferences r7 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r8 = "disappearing_mode_sync_backoff"
            r4 = -1
            long r10 = r7.getLong(r8, r4)
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x02a8
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncRequestExecutor/disappearing_mode backoff for another "
            r7.append(r4)
            r4 = r78
            long r4 = A00(r4, r8)
            long r4 = r4 - r0
            r7.append(r4)
            X.C36321k7.A1a(r7, r9)
            r24 = 0
        L_0x02a8:
            android.content.SharedPreferences r5 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r4 = "lid_sync_backoff"
            r7 = -1
            long r4 = r5.getLong(r4, r7)
            if (r26 == 0) goto L_0x02cc
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x02cc
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()
            java.lang.String r10 = "ContactSyncRequestExecutor/lid backoff for another "
            r11.append(r10)
            long r4 = r4 - r0
            r11.append(r4)
            X.C36321k7.A1a(r11, r9)
            r26 = 0
        L_0x02cc:
            X.0yC r4 = r3.A0O
            r77 = r4
            r5 = 5290(0x14aa, float:7.413E-42)
            boolean r4 = r4.A0E(r5)
            r27 = r27 & r4
            X.0v5 r4 = r3.A01
            boolean r5 = r4.A05()
            if (r5 == 0) goto L_0x02ef
            java.lang.Object r4 = r4.A02()
            X.1HX r4 = (X.AnonymousClass1HX) r4
            X.1Hg r4 = r4.A00
            boolean r5 = r4.A00()
            r4 = 1
            if (r5 != 0) goto L_0x02f0
        L_0x02ef:
            r4 = 0
        L_0x02f0:
            r20 = r20 & r4
            android.content.SharedPreferences r5 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r4 = "bot_sync_backoff"
            long r4 = r5.getLong(r4, r7)
            if (r20 == 0) goto L_0x0314
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0314
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r7 = "ContactSyncRequestExecutor/bot backoff for another "
            r8.append(r7)
            long r4 = r4 - r0
            r8.append(r4)
            X.C36321k7.A1a(r8, r9)
            r20 = 0
        L_0x0314:
            if (r18 != 0) goto L_0x0371
            if (r17 != 0) goto L_0x0371
            if (r45 != 0) goto L_0x0371
            if (r21 != 0) goto L_0x0371
            if (r25 != 0) goto L_0x0371
            if (r19 != 0) goto L_0x0371
            if (r48 != 0) goto L_0x0371
            if (r24 != 0) goto L_0x0371
            if (r26 != 0) goto L_0x0371
            if (r20 != 0) goto L_0x0371
            if (r27 != 0) goto L_0x0371
            if (r53 != 0) goto L_0x0371
            java.lang.String r0 = "ContactSyncRequestExecutor/no syncing protocol should be requested at this moment due to error backoff"
            goto L_0x00be
        L_0x0330:
            X.1EV r4 = r3.A0P
            boolean r4 = r4.A0D()
            r48 = 1
            if (r4 != 0) goto L_0x027e
            goto L_0x027c
        L_0x033c:
            X.5Tu r4 = X.C108515Tu.A0I
            if (r6 == r4) goto L_0x034a
            X.5Tu r4 = X.C108515Tu.A06
            if (r6 == r4) goto L_0x034a
            X.5Tu r4 = X.C108515Tu.A07
            if (r6 == r4) goto L_0x034a
            if (r20 == 0) goto L_0x01f4
        L_0x034a:
            r45 = 1
            goto L_0x01f6
        L_0x034e:
            X.5TH r4 = X.AnonymousClass5TH.DELTA
            if (r5 != r4) goto L_0x0178
            android.content.SharedPreferences r5 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r4 = "delta_sync_backoff"
            long r4 = X.C36371kC.A08(r5, r4)
            long r4 = r4 - r0
            r11 = 0
            int r10 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0178
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ContactSyncRequestExecutor/delta sync backoff time="
            r7.append(r0)
            r7.append(r4)
            goto L_0x0112
        L_0x0371:
            X.1Ok r4 = r3.A0D
            r76 = r4
            X.58o r7 = new X.58o
            r7.<init>()
            java.lang.String r4 = r6.toString()
            r7.A0I = r4
            boolean r4 = r2.A01
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7.A02 = r4
            boolean r4 = r2.A06
            r29 = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r29)
            r7.A01 = r4
            int r4 = r2.A00
            java.lang.Long r4 = X.C36441kJ.A0y(r4)
            r7.A0E = r4
            boolean r4 = r2.A03()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7.A03 = r4
            r4 = r76
            java.util.HashMap r8 = r4.A02
            X.0wo r4 = r4.A00
            long r4 = X.C19970wo.A00(r4)
            X.C36421kH.A1K(r7, r8, r4)
            X.0wx r4 = r3.A0N
            r75 = r4
            long r30 = r75.A02()
            X.6PA r34 = new X.6PA
            r34.<init>()
            X.6PB r4 = new X.6PB
            r4.<init>()
            X.5SE r8 = r6.scope
            X.5SE r40 = X.AnonymousClass5SE.PHONEBOOK
            r5 = r40
            if (r8 == r5) goto L_0x03d1
            X.5SE r5 = X.AnonymousClass5SE.PHONEBOOK_AND_SIDELIST
            r22 = 0
            if (r8 != r5) goto L_0x03d3
        L_0x03d1:
            r22 = 1
        L_0x03d3:
            X.5SE r39 = X.AnonymousClass5SE.SIDELIST
            r5 = r39
            if (r8 == r5) goto L_0x03df
            X.5SE r5 = X.AnonymousClass5SE.PHONEBOOK_AND_SIDELIST
            r33 = 0
            if (r8 != r5) goto L_0x03e1
        L_0x03df:
            r33 = 1
        L_0x03e1:
            if (r22 == 0) goto L_0x0620
            X.1O0 r4 = r3.A0E
            X.6PA r34 = r4.A00()
            X.1O4 r4 = r3.A0F
            X.6PB r4 = r4.A00()
            X.16D r13 = r3.A0A
            X.0yb r9 = r3.A0J
            X.0yE r8 = r3.A0M
            java.lang.String r5 = "android.permission.READ_CONTACTS"
            int r5 = r8.A02(r5)
            if (r5 == 0) goto L_0x053c
            java.lang.String r5 = "system-contacts-query/all/permission_denied"
            com.whatsapp.util.Log.i((java.lang.String) r5)
            java.util.Map r5 = java.util.Collections.emptyMap()
            if (r5 != 0) goto L_0x0586
        L_0x0408:
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.Map r8 = java.util.Collections.emptyMap()
            X.5pw r16 = new X.5pw
            r5 = r16
            r5.<init>(r9, r8)
        L_0x0417:
            r5 = r16
            java.util.Map r5 = r5.A01
            int r8 = r5.size()
            r5 = r16
            java.util.List r5 = r5.A00
            int r5 = X.C90524aI.A04(r5, r8)
            java.lang.Long r5 = X.C36441kJ.A0y(r5)
            r7.A06 = r5
        L_0x042d:
            r41 = 0
        L_0x042f:
            boolean r5 = r2.A07
            if (r5 == 0) goto L_0x0469
            X.5TH r8 = r6.mode
            X.5TH r5 = X.AnonymousClass5TH.DELTA
            if (r8 != r5) goto L_0x0469
            X.5Tc r8 = r6.context
            X.5Tc r5 = X.C108335Tc.CONTACT_DISCOVERY
            if (r8 == r5) goto L_0x0469
            if (r33 == 0) goto L_0x0539
            if (r17 == 0) goto L_0x0539
            X.16D r8 = r3.A0A
            X.1A6 r5 = r3.A0I
            java.util.HashSet r5 = r5.A0C()
            java.util.ArrayList r41 = r8.A0J(r5)
            int r8 = r41.size()
        L_0x0453:
            if (r16 == 0) goto L_0x04f2
            r5 = r16
            java.util.List r5 = r5.A00
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0469
            r5 = r16
            java.util.Map r5 = r5.A01
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x04f2
        L_0x0469:
            X.5SE r5 = r6.scope
            X.5SE r38 = X.AnonymousClass5SE.MULTI_PROTOCOLS_QUERY
            r4 = r38
            if (r5 != r4) goto L_0x047d
            java.util.Set r4 = r2.A05
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x1710
            java.util.ArrayList r41 = X.C27381Nz.A01(r3, r4)
        L_0x047d:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ContactSyncManager/fullSync: mode="
            r5.append(r4)
            X.5TH r4 = r6.mode
            java.lang.String r4 = r4.modeString
            r5.append(r4)
            java.lang.String r4 = "; context="
            r5.append(r4)
            X.5Tc r4 = r6.context
            java.lang.String r4 = r4.contextString
            r5.append(r4)
            java.lang.String r4 = "; isContact="
            r5.append(r4)
            r4 = r18
            r5.append(r4)
            java.lang.String r4 = "; isSidelist="
            r5.append(r4)
            r4 = r17
            r5.append(r4)
            java.lang.String r4 = "; retry="
            r5.append(r4)
            int r4 = r2.A00
            r5.append(r4)
            java.lang.String r4 = "; urgent="
            r5.append(r4)
            boolean r4 = r2.A01
            X.C36331k8.A1S(r5, r4)
            X.5TH r8 = r6.mode
            r4 = r32
            if (r8 != r4) goto L_0x04c9
            if (r18 != 0) goto L_0x04d9
        L_0x04c9:
            X.5Tc r5 = r6.context
            X.5Tc r4 = X.C108335Tc.NOTIFICATION
            if (r5 != r4) goto L_0x04d1
            if (r22 != 0) goto L_0x04d9
        L_0x04d1:
            X.5TH r4 = X.AnonymousClass5TH.DELTA
            if (r8 != r4) goto L_0x0676
            if (r22 == 0) goto L_0x0676
            if (r33 == 0) goto L_0x0676
        L_0x04d9:
            X.16D r4 = r3.A0A
            X.16p r11 = r4.A05
            r4 = 1
            X.14g r10 = new X.14g
            r10.<init>((boolean) r4)
            r10.A03()
            java.util.ArrayList r37 = X.AnonymousClass001.A0I()
            X.16r r4 = r11.A00
            X.1M0 r9 = r4.get()
            goto L_0x0645
        L_0x04f2:
            if (r8 != 0) goto L_0x0469
            r5 = r34
            X.00T r5 = r5.A02
            boolean r5 = X.C36331k8.A1b(r5)
            if (r5 == 0) goto L_0x0469
            java.util.List r5 = r4.A00
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0469
            java.util.List r4 = r4.A01
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0469
            java.lang.String r0 = "ContactSyncRequestExecutor/no_phonebook_or_sidelist_change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Pu r4 = X.C131626Pu.A08
            r0 = r80
            r0.A05(r4)
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r7.A04 = r0
            r7.A00 = r0
            r0 = r76
            X.C27491Ok.A00(r0, r7)
            X.0yW r2 = r0.A01
            X.0u5 r0 = r7.samplingRate
            int r0 = r0.A00
            int r1 = r0 * 10
            X.0u5 r0 = new X.0u5
            r0.<init>(r1, r1)
            r2.Blx(r7, r0)
            goto L_0x00c8
        L_0x0539:
            r8 = 0
            goto L_0x0453
        L_0x053c:
            X.0ya r54 = r9.A0O()
            r58 = 0
            if (r54 != 0) goto L_0x054b
            java.lang.String r5 = "system-contacts-query/all cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r5)
            goto L_0x0408
        L_0x054b:
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            java.lang.String r9 = "_id"
            java.lang.String r8 = "version"
            java.lang.String[] r56 = new java.lang.String[]{r9, r8}
            android.net.Uri r55 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ Exception -> 0x0618 }
            java.lang.String r57 = X.C65583Sq.A01()     // Catch:{ Exception -> 0x0618 }
            r59 = r58
            android.database.Cursor r10 = r54.A03(r55, r56, r57, r58, r59)     // Catch:{ Exception -> 0x0618 }
            if (r10 == 0) goto L_0x0605
            int r11 = r10.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x060c }
            int r12 = r10.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x060c }
        L_0x056d:
            boolean r8 = r10.moveToNext()     // Catch:{ all -> 0x060c }
            if (r8 == 0) goto L_0x0583
            long r14 = r10.getLong(r11)     // Catch:{ all -> 0x060c }
            int r9 = r10.getInt(r12)     // Catch:{ all -> 0x060c }
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x060c }
            X.C36341k9.A1K(r8, r5, r9)     // Catch:{ all -> 0x060c }
            goto L_0x056d
        L_0x0583:
            r10.close()     // Catch:{ Exception -> 0x0618 }
        L_0x0586:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r8 = "system-contacts-query/all/"
            r9.append(r8)
            int r8 = r5.size()
            X.C36321k7.A1Y(r9, r8)
            X.16p r8 = r13.A05
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            X.16r r8 = r8.A00
            X.1M0 r15 = r8.get()
            java.lang.String r10 = "SELECT id, version FROM system_contacts_version_table"
            r9 = 0
            java.lang.String r8 = "CONTACT_SYSTEM_VERSIONS"
            android.database.Cursor r11 = X.C229416o.A03(r15, r10, r8, r9)     // Catch:{ all -> 0x17b2 }
            java.lang.String r8 = "id"
            int r14 = r11.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x17a6 }
            java.lang.String r8 = "version"
            int r13 = r11.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x17a6 }
        L_0x05b7:
            boolean r8 = r11.moveToNext()     // Catch:{ all -> 0x17a6 }
            if (r8 == 0) goto L_0x05e6
            int r8 = r11.getInt(r14)     // Catch:{ all -> 0x17a6 }
            long r8 = (long) r8     // Catch:{ all -> 0x17a6 }
            int r10 = r11.getInt(r13)     // Catch:{ all -> 0x17a6 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x17a6 }
            java.lang.Long r9 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x17a6 }
            boolean r8 = r5.containsKey(r9)     // Catch:{ all -> 0x17a6 }
            if (r8 != 0) goto L_0x05d8
            r12.add(r9)     // Catch:{ all -> 0x17a6 }
            goto L_0x05b7
        L_0x05d8:
            java.lang.Object r8 = r5.get(r9)     // Catch:{ all -> 0x17a6 }
            boolean r8 = r10.equals(r8)     // Catch:{ all -> 0x17a6 }
            if (r8 == 0) goto L_0x05b7
            r5.remove(r9)     // Catch:{ all -> 0x17a6 }
            goto L_0x05b7
        L_0x05e6:
            r11.close()     // Catch:{ all -> 0x17b2 }
            r15.close()
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r8 = "system-contacts-query/updated/"
            r9.append(r8)
            int r8 = r5.size()
            X.C36321k7.A1Y(r9, r8)
            X.5pw r16 = new X.5pw
            r8 = r16
            r8.<init>(r12, r5)
            goto L_0x0417
        L_0x0605:
            java.lang.String r5 = "system-contacts-query/contact cursor was null"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x060c }
            goto L_0x0408
        L_0x060c:
            r5 = move-exception
            if (r10 == 0) goto L_0x0617
            r10.close()     // Catch:{ all -> 0x0613 }
            goto L_0x0617
        L_0x0613:
            r8 = move-exception
            r5.addSuppressed(r8)     // Catch:{ Exception -> 0x0618 }
        L_0x0617:
            throw r5     // Catch:{ Exception -> 0x0618 }
        L_0x0618:
            r8 = move-exception
            java.lang.String r5 = "system-contacts-query/contact exception"
            com.whatsapp.util.Log.e(r5, r8)
            goto L_0x0408
        L_0x0620:
            if (r33 == 0) goto L_0x0641
            if (r17 == 0) goto L_0x0641
            java.util.Set r5 = r2.A05
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L_0x0634
            java.util.ArrayList r41 = X.C27381Nz.A01(r3, r5)
        L_0x0630:
            r16 = 0
            goto L_0x042f
        L_0x0634:
            X.16D r8 = r3.A0A
            X.1A6 r5 = r3.A0I
            java.util.HashSet r5 = r5.A0C()
            java.util.ArrayList r41 = r8.A0J(r5)
            goto L_0x0630
        L_0x0641:
            r16 = 0
            goto L_0x042d
        L_0x0645:
            java.lang.String r8 = X.AnonymousClass2x7.A00     // Catch:{ all -> 0x175d }
            r5 = 0
            java.lang.String r4 = "GET_ALL_DB_CONTACTS_FOR_SYNC"
            android.database.Cursor r12 = X.C229416o.A03(r9, r8, r4, r5)     // Catch:{ all -> 0x175d }
            int r8 = r12.getCount()     // Catch:{ all -> 0x1751 }
        L_0x0652:
            boolean r4 = r12.moveToNext()     // Catch:{ IllegalStateException -> 0x0668 }
            if (r4 == 0) goto L_0x0672
            X.141 r5 = X.C53712rl.A00(r12)     // Catch:{ IllegalStateException -> 0x0668 }
            boolean r4 = r11.A0Z(r5)     // Catch:{ IllegalStateException -> 0x0668 }
            if (r4 == 0) goto L_0x0652
            r4 = r37
            r4.add(r5)     // Catch:{ IllegalStateException -> 0x0668 }
            goto L_0x0652
        L_0x0668:
            r11 = move-exception
            java.lang.String r5 = "contactmanagerdb/getAllDBContactsForSync/"
            int r4 = r37.size()     // Catch:{ all -> 0x1751 }
            X.C229516p.A0L(r11, r5, r8, r4)     // Catch:{ all -> 0x1751 }
        L_0x0672:
            r12.close()     // Catch:{ all -> 0x175d }
            goto L_0x0679
        L_0x0676:
            r37 = 0
            goto L_0x0682
        L_0x0679:
            r9.close()
            r37.size()
            r10.A00()
        L_0x0682:
            X.5TH r5 = r6.mode
            r4 = r32
            if (r5 != r4) goto L_0x06d8
            X.16D r4 = r3.A0A
            java.util.ArrayList r59 = r4.A0H()
        L_0x068e:
            X.5Tc r5 = r6.context
            X.5Tc r36 = X.C108335Tc.NOTIFICATION
            r4 = r36
            if (r5 != r4) goto L_0x06d5
            if (r33 == 0) goto L_0x06d5
            X.0wQ r4 = r3.A04
            boolean r4 = r4.A0L()
            if (r4 == 0) goto L_0x06c7
            X.16D r5 = r3.A0A
            X.1A6 r4 = r3.A0I
            java.util.HashSet r4 = r4.A0C()
            java.util.ArrayList r60 = r5.A0J(r4)
        L_0x06ac:
            X.1O1 r5 = r3.A0B
            X.1KL r4 = r3.A08
            int r42 = r4.A00()
            java.util.List r4 = r2.A04
            r43 = r4
            X.1KK r4 = r3.A07
            java.util.HashMap r9 = r4.A0A()
            X.1EU r4 = r5.A0H
            X.AnonymousClass1EU.A00(r4)
            X.1Eb r12 = r4.A08
            r10 = 0
            goto L_0x06db
        L_0x06c7:
            X.16D r4 = r3.A0A
            X.16p r5 = r4.A05
            r4 = 1
            java.util.ArrayList r4 = X.C229516p.A07(r5, r4)
            java.util.ArrayList r60 = X.C36441kJ.A15(r4)
            goto L_0x06ac
        L_0x06d5:
            r60 = 0
            goto L_0x06ac
        L_0x06d8:
            r59 = 0
            goto L_0x068e
        L_0x06db:
            X.6Pu r4 = X.C131626Pu.A03     // Catch:{ all -> 0x177e }
            r74 = r4
            java.util.Map r8 = r5.A0K     // Catch:{ all -> 0x177e }
            r73 = r8
            r8.putAll(r9)     // Catch:{ all -> 0x177e }
            java.util.Map r8 = r5.A0M     // Catch:{ all -> 0x177e }
            r72 = r8
            X.185 r8 = r5.A06     // Catch:{ all -> 0x177e }
            X.16p r8 = r8.A01     // Catch:{ all -> 0x177e }
            java.util.HashMap r11 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x177e }
            X.16r r8 = r8.A00     // Catch:{ all -> 0x177e }
            X.1M0 r35 = r8.get()     // Catch:{ all -> 0x177e }
            java.lang.String r13 = "SELECT jid, serial FROM wa_vnames"
            java.lang.String r9 = "CONTACT_VNAMES"
            r8 = r35
            android.database.Cursor r8 = X.C229416o.A03(r8, r13, r9, r10)     // Catch:{ all -> 0x1774 }
            java.lang.String r9 = "jid"
            int r15 = r8.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x1768 }
            java.lang.String r9 = "serial"
            int r14 = r8.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x1768 }
        L_0x070e:
            boolean r9 = r8.moveToNext()     // Catch:{ all -> 0x1768 }
            if (r9 == 0) goto L_0x072a
            java.lang.String r9 = r8.getString(r15)     // Catch:{ all -> 0x1768 }
            com.whatsapp.jid.UserJid r9 = X.C36431kI.A0l(r9)     // Catch:{ all -> 0x1768 }
            if (r9 == 0) goto L_0x070e
            long r33 = r8.getLong(r14)     // Catch:{ all -> 0x1768 }
            java.lang.String r13 = java.lang.String.valueOf(r33)     // Catch:{ all -> 0x1768 }
            r11.put(r9, r13)     // Catch:{ all -> 0x1768 }
            goto L_0x070e
        L_0x072a:
            r8.close()     // Catch:{ all -> 0x1774 }
            r35.close()     // Catch:{ all -> 0x177e }
            r8 = r72
            r8.putAll(r11)     // Catch:{ all -> 0x177e }
            if (r20 == 0) goto L_0x078f
            X.0v5 r9 = r5.A03     // Catch:{ all -> 0x177e }
            boolean r8 = r9.A05()     // Catch:{ all -> 0x177e }
            if (r8 == 0) goto L_0x078f
            java.lang.Object r8 = r9.A02()     // Catch:{ all -> 0x177e }
            X.1HX r8 = (X.AnonymousClass1HX) r8     // Catch:{ all -> 0x177e }
            X.1Hg r8 = r8.A00     // Catch:{ all -> 0x177e }
            boolean r8 = r8.A00()     // Catch:{ all -> 0x177e }
            if (r8 == 0) goto L_0x078f
            java.util.Map r13 = r5.A0J     // Catch:{ all -> 0x177e }
            java.lang.Object r8 = r9.A02()     // Catch:{ all -> 0x177e }
            X.1HX r8 = (X.AnonymousClass1HX) r8     // Catch:{ all -> 0x177e }
            X.1Hh r8 = r8.A01     // Catch:{ all -> 0x177e }
            com.whatsapp.bonsai.sync.discovery.DiscoveryBots r8 = r8.A00()     // Catch:{ all -> 0x177e }
            java.util.List r9 = X.C110115a9.A00(r8)     // Catch:{ all -> 0x177e }
            int r8 = r9.size()     // Catch:{ all -> 0x177e }
            X.0i5 r11 = new X.0i5     // Catch:{ all -> 0x177e }
            r11.<init>(r8)     // Catch:{ all -> 0x177e }
            java.util.Iterator r15 = r9.iterator()     // Catch:{ all -> 0x177e }
        L_0x076c:
            boolean r8 = r15.hasNext()     // Catch:{ all -> 0x177e }
            if (r8 == 0) goto L_0x0788
            java.lang.Object r8 = r15.next()     // Catch:{ all -> 0x177e }
            X.69j r8 = (X.C1277169j) r8     // Catch:{ all -> 0x177e }
            java.lang.String r9 = r8.A01     // Catch:{ all -> 0x177e }
            if (r9 == 0) goto L_0x076c
            int r14 = r9.length()     // Catch:{ all -> 0x177e }
            if (r14 == 0) goto L_0x076c
            com.whatsapp.jid.UserJid r8 = r8.A00     // Catch:{ all -> 0x177e }
            r11.put(r8, r9)     // Catch:{ all -> 0x177e }
            goto L_0x076c
        L_0x0788:
            X.0i5 r8 = X.C000300d.A04(r11)     // Catch:{ all -> 0x177e }
            r13.putAll(r8)     // Catch:{ all -> 0x177e }
        L_0x078f:
            if (r48 == 0) goto L_0x07c3
            X.1EV r8 = r5.A0G     // Catch:{ all -> 0x177e }
            boolean r8 = r8.A0D()     // Catch:{ all -> 0x177e }
            if (r8 == 0) goto L_0x07c3
            X.1EV r8 = r12.A03     // Catch:{ all -> 0x177e }
            boolean r8 = r8.A0D()     // Catch:{ all -> 0x177e }
            if (r8 == 0) goto L_0x07c3
            X.16S r8 = r12.A02     // Catch:{ all -> 0x177e }
            java.util.HashMap r9 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x177e }
            java.util.ArrayList r8 = r8.A0B()     // Catch:{ all -> 0x177e }
            java.util.Iterator r13 = r8.iterator()     // Catch:{ all -> 0x177e }
        L_0x07af:
            boolean r8 = r13.hasNext()     // Catch:{ all -> 0x177e }
            if (r8 == 0) goto L_0x07c1
            java.lang.Object r8 = r13.next()     // Catch:{ all -> 0x177e }
            X.8ax r8 = (X.C175728ax) r8     // Catch:{ all -> 0x177e }
            com.whatsapp.jid.UserJid r11 = r8.A04     // Catch:{ all -> 0x177e }
            r9.put(r11, r8)     // Catch:{ all -> 0x177e }
            goto L_0x07af
        L_0x07c1:
            r12.A01 = r9     // Catch:{ all -> 0x177e }
        L_0x07c3:
            X.5SE r9 = r6.scope     // Catch:{ all -> 0x177e }
            r8 = r40
            if (r9 == r8) goto L_0x07ce
            X.5SE r8 = X.AnonymousClass5SE.PHONEBOOK_AND_SIDELIST     // Catch:{ all -> 0x177e }
            r15 = 0
            if (r9 != r8) goto L_0x07cf
        L_0x07ce:
            r15 = 1
        L_0x07cf:
            r8 = r39
            if (r9 == r8) goto L_0x07d8
            X.5SE r8 = X.AnonymousClass5SE.PHONEBOOK_AND_SIDELIST     // Catch:{ all -> 0x177e }
            r14 = 0
            if (r9 != r8) goto L_0x07d9
        L_0x07d8:
            r14 = 1
        L_0x07d9:
            r8 = r38
            if (r9 != r8) goto L_0x0802
            X.9vX r4 = new X.9vX     // Catch:{ all -> 0x1780 }
            r37 = r4
            r38 = r5
            r39 = r6
            r40 = r7
            r43 = r18
            r44 = r21
            r46 = r25
            r47 = r19
            r49 = r24
            r50 = r26
            r51 = r20
            r52 = r27
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x1780 }
            java.lang.String r8 = "sync/syncQueryMultiProtocols/no result"
            X.6Pu r4 = X.AnonymousClass1O1.A00(r4, r8)     // Catch:{ all -> 0x1780 }
            goto L_0x0979
        L_0x0802:
            X.5TH r11 = r6.mode     // Catch:{ all -> 0x1780 }
            r8 = r32
            boolean r8 = X.C36361kB.A1a(r11, r8)
            r62 = 1
            r9 = 0
            if (r8 == 0) goto L_0x0895
            if (r15 == 0) goto L_0x0814
            if (r14 == 0) goto L_0x0814
            r9 = 1
        L_0x0814:
            X.C18740tg.A0C(r9)     // Catch:{ all -> 0x1780 }
            if (r18 != 0) goto L_0x082d
            if (r17 != 0) goto L_0x082d
            if (r21 != 0) goto L_0x082d
            if (r25 != 0) goto L_0x082d
            if (r45 != 0) goto L_0x082d
            if (r19 != 0) goto L_0x082d
            if (r48 != 0) goto L_0x082d
            if (r24 != 0) goto L_0x082d
            if (r26 != 0) goto L_0x082d
            if (r53 != 0) goto L_0x082d
            r62 = 0
        L_0x082d:
            X.C18740tg.A0C(r62)     // Catch:{ all -> 0x1780 }
            if (r18 == 0) goto L_0x0865
            X.C18740tg.A06(r37)     // Catch:{ all -> 0x1780 }
            X.C18740tg.A06(r59)     // Catch:{ all -> 0x1780 }
            X.9vY r4 = new X.9vY     // Catch:{ all -> 0x1780 }
            r54 = r4
            r55 = r5
            r56 = r6
            r57 = r7
            r58 = r37
            r60 = r42
            r61 = r17
            r62 = r21
            r63 = r45
            r64 = r25
            r65 = r19
            r66 = r48
            r67 = r24
            r68 = r26
            r69 = r27
            r70 = r53
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ all -> 0x1780 }
            java.lang.String r8 = "sync/sync_all"
            X.6Pu r4 = X.AnonymousClass1O1.A00(r4, r8)     // Catch:{ all -> 0x1780 }
            goto L_0x0979
        L_0x0865:
            X.C18740tg.A06(r59)     // Catch:{ all -> 0x1780 }
            X.9vW r4 = new X.9vW     // Catch:{ all -> 0x1780 }
            r33 = r4
            r34 = r5
            r35 = r6
            r36 = r7
            r37 = r59
            r38 = r42
            r39 = r17
            r40 = r21
            r41 = r45
            r42 = r25
            r43 = r19
            r44 = r48
            r45 = r24
            r46 = r26
            r47 = r27
            r48 = r53
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x1780 }
            java.lang.String r8 = "sync/sync_all_non_contact"
            X.6Pu r4 = X.AnonymousClass1O1.A00(r4, r8)     // Catch:{ all -> 0x1780 }
            goto L_0x0979
        L_0x0895:
            X.5Tc r13 = r6.context     // Catch:{ all -> 0x1780 }
            r8 = r36
            if (r13 != r8) goto L_0x0921
            boolean r8 = r43.isEmpty()     // Catch:{ all -> 0x1780 }
            if (r8 != 0) goto L_0x090b
            if (r15 == 0) goto L_0x08dc
            if (r14 == 0) goto L_0x08a7
            r62 = 0
        L_0x08a7:
            X.C18740tg.A0C(r62)     // Catch:{ all -> 0x1780 }
            X.C18740tg.A06(r37)     // Catch:{ all -> 0x1780 }
            X.B9K r4 = new X.B9K     // Catch:{ all -> 0x1780 }
            r61 = 0
            r54 = r4
            r55 = r5
            r56 = r6
            r57 = r7
            r58 = r43
            r59 = r37
            r60 = r42
            r62 = r21
            r63 = r45
            r64 = r25
            r65 = r19
            r66 = r48
            r67 = r24
            r68 = r26
            r69 = r27
            r70 = r53
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ all -> 0x1780 }
            java.lang.String r8 = "sync/sync_notification_contact"
            X.6Pu r4 = X.AnonymousClass1O1.A00(r4, r8)     // Catch:{ all -> 0x1780 }
            goto L_0x0979
        L_0x08dc:
            if (r14 == 0) goto L_0x0979
            X.C18740tg.A06(r60)     // Catch:{ all -> 0x1780 }
            X.B9K r4 = new X.B9K     // Catch:{ all -> 0x1780 }
            r55 = r4
            r56 = r5
            r57 = r6
            r58 = r7
            r59 = r43
            r61 = r42
            r63 = r21
            r64 = r45
            r65 = r25
            r66 = r19
            r67 = r48
            r68 = r24
            r69 = r26
            r70 = r27
            r71 = r53
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)     // Catch:{ all -> 0x1780 }
            java.lang.String r8 = "sync/sync_notification_sidelist"
            X.6Pu r4 = X.AnonymousClass1O1.A00(r4, r8)     // Catch:{ all -> 0x1780 }
            goto L_0x0979
        L_0x090b:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1780 }
            java.lang.String r8 = "empty jid hash: "
            r11.append(r8)     // Catch:{ all -> 0x1780 }
            int r8 = r6.code     // Catch:{ all -> 0x1780 }
            X.C36351kA.A1R(r11, r8)     // Catch:{ all -> 0x1780 }
            X.0wN r11 = r5.A04     // Catch:{ all -> 0x1780 }
            java.lang.String r8 = "sync/sync_notification_no_jidhash/error"
            r11.A0E(r8, r10, r9)     // Catch:{ all -> 0x1766 }
            goto L_0x0979
        L_0x0921:
            X.5TH r8 = X.AnonymousClass5TH.DELTA     // Catch:{ all -> 0x1766 }
            if (r11 != r8) goto L_0x0979
            if (r15 == 0) goto L_0x094a
            if (r14 == 0) goto L_0x0964
            X.C18740tg.A06(r37)     // Catch:{ all -> 0x1766 }
            X.9vV r4 = new X.9vV     // Catch:{ all -> 0x1766 }
            r43 = r4
            r44 = r5
            r45 = r6
            r46 = r7
            r47 = r41
            r48 = r37
            r49 = r42
            r50 = r26
            r51 = r27
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ all -> 0x1766 }
            java.lang.String r8 = "contactsynchelper/syncDelta"
            X.6Pu r4 = X.AnonymousClass1O1.A00(r4, r8)     // Catch:{ all -> 0x1766 }
            goto L_0x0979
        L_0x094a:
            if (r14 == 0) goto L_0x0964
            X.9vU r4 = new X.9vU     // Catch:{ all -> 0x1766 }
            r37 = r4
            r38 = r5
            r39 = r6
            r40 = r7
            r43 = r26
            r44 = r27
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x1766 }
            java.lang.String r8 = "sync/syncSidelist"
            X.6Pu r4 = X.AnonymousClass1O1.A00(r4, r8)     // Catch:{ all -> 0x1766 }
            goto L_0x0979
        L_0x0964:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1766 }
            java.lang.String r8 = "wrong sync type and query scope: "
            r11.append(r8)     // Catch:{ all -> 0x1766 }
            int r8 = r6.code     // Catch:{ all -> 0x1766 }
            X.C36351kA.A1R(r11, r8)     // Catch:{ all -> 0x1766 }
            X.0wN r11 = r5.A04     // Catch:{ all -> 0x1766 }
            java.lang.String r8 = "sync/sync_delta/error"
            r11.A0E(r8, r10, r9)     // Catch:{ all -> 0x1766 }
        L_0x0979:
            java.util.Map r8 = r5.A0N
            r8.clear()
            java.util.Map r8 = r5.A0L
            r8.clear()
            r73.clear()
            r72.clear()
            java.util.Map r8 = r5.A0J
            r8.clear()
            r5.A00 = r10
            r5.A01 = r10
            java.util.Map r5 = r12.A01
            if (r5 == 0) goto L_0x0999
            r5.clear()
        L_0x0999:
            X.0wG r5 = r3.A0L
            android.content.Context r8 = r5.A00
            boolean r5 = r4.A00()
            if (r5 == 0) goto L_0x1572
            java.lang.String r2 = "ContactSyncRequestExecutor/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            boolean r2 = r4.A01()
            if (r2 == 0) goto L_0x09b5
            java.lang.Runnable r5 = r3.A0T
            r2 = r79
            r2.A0H(r5)
        L_0x09b5:
            r2 = r80
            r2.A05(r4)
            if (r29 == 0) goto L_0x0a2e
            X.1Ol r14 = r3.A06
            monitor-enter(r14)
            X.0wQ r2 = r14.A00     // Catch:{ all -> 0x1763 }
            boolean r2 = r2.A0L()     // Catch:{ all -> 0x1763 }
            r15 = 1
            if (r2 != 0) goto L_0x0a24
            X.16m r2 = r14.A01     // Catch:{ all -> 0x1763 }
            boolean r2 = r2.A00()     // Catch:{ all -> 0x1763 }
            if (r2 != 0) goto L_0x09d6
            java.lang.String r2 = "androidcontactssync/clearsyncdata/permission_denied"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x1763 }
            goto L_0x0a24
        L_0x09d6:
            X.0yb r2 = r14.A02     // Catch:{ all -> 0x1763 }
            X.0ya r13 = r2.A0O()     // Catch:{ all -> 0x1763 }
            android.net.Uri r2 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x1763 }
            android.net.Uri$Builder r9 = r2.buildUpon()     // Catch:{ all -> 0x1763 }
            java.lang.String r5 = "account_name"
            r12 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r2 = r8.getString(r12)     // Catch:{ all -> 0x1763 }
            android.net.Uri$Builder r5 = r9.appendQueryParameter(r5, r2)     // Catch:{ all -> 0x1763 }
            java.lang.String r2 = "account_type"
            java.lang.String r11 = "com.whatsapp"
            android.net.Uri$Builder r9 = r5.appendQueryParameter(r2, r11)     // Catch:{ all -> 0x1763 }
            java.lang.String r5 = "caller_is_syncadapter"
            java.lang.String r2 = "true"
            android.net.Uri r10 = X.C90484aE.A0M(r9, r5, r2)     // Catch:{ all -> 0x1763 }
            r9 = 0
            java.lang.String r5 = "account_name = ? AND account_type = ?"
            java.lang.String[] r2 = X.C36441kJ.A1S()     // Catch:{ SecurityException -> 0x0a0f, IllegalArgumentException -> 0x0a26 }
            X.C36421kH.A0k(r8, r12, r9, r2)     // Catch:{ SecurityException -> 0x0a0f, IllegalArgumentException -> 0x0a26 }
            r2[r15] = r11     // Catch:{ SecurityException -> 0x0a0f, IllegalArgumentException -> 0x0a26 }
            r13.A01(r10, r5, r2)     // Catch:{ SecurityException -> 0x0a0f, IllegalArgumentException -> 0x0a26 }
            goto L_0x0a24
        L_0x0a0f:
            r9 = move-exception
            java.lang.String r2 = r9.getMessage()     // Catch:{ all -> 0x1763 }
            if (r2 == 0) goto L_0x1762
            java.lang.String r5 = r9.getMessage()     // Catch:{ all -> 0x1763 }
            java.lang.String r2 = "User 0 tying to get authenticator types for "
            boolean r2 = r5.startsWith(r2)     // Catch:{ all -> 0x1763 }
            if (r2 == 0) goto L_0x1762
            monitor-exit(r14)
            goto L_0x0a27
        L_0x0a24:
            monitor-exit(r14)
            goto L_0x0a2e
        L_0x0a26:
            monitor-exit(r14)
        L_0x0a27:
            r5 = r80
            r2 = r74
            r5.A05(r2)
        L_0x0a2e:
            X.5TH r5 = r6.mode
            r2 = r32
            if (r5 != r2) goto L_0x0a70
            if (r18 == 0) goto L_0x0a43
            android.content.SharedPreferences r2 = X.AnonymousClass1O6.A00(r78)
            android.content.SharedPreferences$Editor r5 = r2.edit()
            java.lang.String r2 = "last_contact_full_sync"
            X.C36341k9.A0w(r5, r2, r0)
        L_0x0a43:
            if (r17 == 0) goto L_0x0a52
            android.content.SharedPreferences r2 = X.AnonymousClass1O6.A00(r78)
            android.content.SharedPreferences$Editor r5 = r2.edit()
            java.lang.String r2 = "last_sidelist_full_sync"
            X.C36341k9.A0w(r5, r2, r0)
        L_0x0a52:
            if (r21 == 0) goto L_0x0a61
            android.content.SharedPreferences r2 = X.AnonymousClass1O6.A00(r78)
            android.content.SharedPreferences$Editor r5 = r2.edit()
            java.lang.String r2 = "last_status_full_sync"
            X.C36341k9.A0w(r5, r2, r0)
        L_0x0a61:
            if (r53 == 0) goto L_0x0a70
            android.content.SharedPreferences r2 = X.AnonymousClass1O6.A00(r78)
            android.content.SharedPreferences$Editor r5 = r2.edit()
            java.lang.String r2 = "last_text_status_full_sync"
            X.C36341k9.A0w(r5, r2, r0)
        L_0x0a70:
            if (r22 == 0) goto L_0x15d8
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x15d8
            X.1Ol r0 = r3.A06     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            r18 = r0
            r0 = r16
            java.util.Map r0 = r0.A01     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            java.util.Set r33 = r0.keySet()     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            X.16D r0 = r3.A0A     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            r56 = r0
            X.16p r1 = r0.A05     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            r0 = 1
            X.14g r9 = new X.14g     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            r9.<init>((boolean) r0)     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            r9.A03()     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            java.util.ArrayList r32 = X.AnonymousClass001.A0I()     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            X.16r r0 = r1.A00     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            X.1M0 r6 = r0.get()     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            java.lang.String r2 = "SELECT wa_contacts._id, wa_contacts.jid, is_whatsapp_user, number, raw_contact_id, display_name, phone_type, phone_label FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE is_whatsapp_user = 1"
            r1 = 0
            java.lang.String r0 = "GET_ALL_WA_CONTACTS"
            android.database.Cursor r5 = X.C229416o.A03(r6, r2, r0, r1)     // Catch:{ all -> 0x1545 }
        L_0x0aa5:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x1539 }
            if (r0 == 0) goto L_0x0af5
            r2 = 1
            java.lang.String r1 = r5.getString(r2)     // Catch:{ all -> 0x1539 }
            X.13o r0 = com.whatsapp.jid.Jid.Companion     // Catch:{ all -> 0x1539 }
            com.whatsapp.jid.Jid r1 = r0.A02(r1)     // Catch:{ all -> 0x1539 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x1539 }
            if (r0 == 0) goto L_0x0aa5
            com.whatsapp.jid.UserJid r35 = X.C36401kF.A0b(r1)     // Catch:{ all -> 0x1539 }
            r0 = 2
            int r1 = r5.getInt(r0)     // Catch:{ all -> 0x1539 }
            r0 = 0
            boolean r42 = X.AnonymousClass000.A1S(r1, r2)
            r1 = 3
            java.lang.String r36 = r5.getString(r1)     // Catch:{ all -> 0x1539 }
            r1 = 4
            long r40 = r5.getLong(r1)     // Catch:{ all -> 0x1539 }
            r1 = 5
            java.lang.String r37 = r5.getString(r1)     // Catch:{ all -> 0x1539 }
            r1 = 6
            int r39 = r5.getInt(r1)     // Catch:{ all -> 0x1539 }
            r1 = 7
            java.lang.String r38 = r5.getString(r1)     // Catch:{ all -> 0x1539 }
            X.141 r2 = new X.141     // Catch:{ all -> 0x1539 }
            r34 = r2
            r34.<init>(r35, r36, r37, r38, r39, r40, r42)     // Catch:{ all -> 0x1539 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x1539 }
            r2.A0L(r0)     // Catch:{ all -> 0x1539 }
            r0 = r32
            r0.add(r2)     // Catch:{ all -> 0x1539 }
            goto L_0x0aa5
        L_0x0af5:
            r5.close()     // Catch:{ all -> 0x1545 }
            r6.close()     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            r32.size()     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            r9.A00()     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            monitor-enter(r18)     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            r0 = r18
            X.0wQ r0 = r0.A00     // Catch:{ all -> 0x1536 }
            boolean r0 = r0.A0L()     // Catch:{ all -> 0x1536 }
            if (r0 == 0) goto L_0x0b17
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to companion mode"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x1536 }
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x1536 }
            goto L_0x151a
        L_0x0b17:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x1536 }
            r0 = r18
            android.accounts.Account r17 = r0.A03(r8)     // Catch:{ all -> 0x1536 }
            X.0wg r0 = r0.A05     // Catch:{ all -> 0x1536 }
            r55 = r0
            java.lang.String r38 = X.C19430v1.A0A     // Catch:{ all -> 0x1536 }
            r1 = r0
            r0 = r38
            android.content.SharedPreferences r0 = r1.A00(r0)     // Catch:{ all -> 0x1536 }
            java.lang.String r39 = "perform_sync_manager_version"
            r1 = r39
            int r13 = X.C36371kC.A01(r0, r1)     // Catch:{ all -> 0x1536 }
            r0 = 3
            if (r13 >= r0) goto L_0x0ce9
            if (r17 != 0) goto L_0x0b3c
            goto L_0x0cde
        L_0x0b3c:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x1536 }
            r0 = r18
            X.0yb r0 = r0.A02     // Catch:{ all -> 0x1536 }
            X.0ya r5 = r0.A0O()     // Catch:{ all -> 0x1536 }
            boolean r0 = r32.isEmpty()     // Catch:{ all -> 0x1536 }
            r1 = 1
            if (r0 != 0) goto L_0x0cf6
            java.util.HashMap r12 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x1536 }
            java.util.Iterator r9 = r32.iterator()     // Catch:{ all -> 0x1536 }
        L_0x0b57:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x1536 }
            if (r0 == 0) goto L_0x0b6b
            X.141 r2 = X.C36391kE.A0f(r9)     // Catch:{ all -> 0x1536 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r2.A06(r0)     // Catch:{ all -> 0x1536 }
            r12.put(r0, r2)     // Catch:{ all -> 0x1536 }
            goto L_0x0b57
        L_0x0b6b:
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x1536 }
            android.net.Uri$Builder r9 = r0.buildUpon()     // Catch:{ all -> 0x1536 }
            r0 = r17
            java.lang.String r2 = r0.name     // Catch:{ all -> 0x1536 }
            java.lang.String r0 = "account_name"
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r0, r2)     // Catch:{ all -> 0x1536 }
            r0 = r17
            java.lang.String r2 = r0.type     // Catch:{ all -> 0x1536 }
            java.lang.String r0 = "account_type"
            android.net.Uri$Builder r0 = r9.appendQueryParameter(r0, r2)     // Catch:{ all -> 0x1536 }
            java.lang.String r9 = "caller_is_syncadapter"
            java.lang.String r2 = "true"
            android.net.Uri r41 = X.C90484aE.A0M(r0, r9, r2)     // Catch:{ all -> 0x1536 }
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x1536 }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ all -> 0x1536 }
            android.net.Uri r27 = X.C90484aE.A0M(r0, r9, r2)     // Catch:{ all -> 0x1536 }
            r11 = 100
            r0 = 2
            java.lang.String r2 = "androidcontactssync/onVersionUpgrade/error"
            java.lang.String r10 = "sync1"
            java.lang.String r9 = "_id"
            if (r13 == 0) goto L_0x0bb5
            if (r13 == r1) goto L_0x0bb5
            if (r13 != r0) goto L_0x0baa
            r26 = 2
            goto L_0x0c53
        L_0x0baa:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1536 }
            java.lang.String r0 = "unexpected old version during AndroidContactsSyncHelper upgrade, version="
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r13)     // Catch:{ all -> 0x1536 }
            throw r0     // Catch:{ all -> 0x1536 }
        L_0x0bb5:
            java.lang.String r0 = "deleted"
            java.lang.String[] r42 = new java.lang.String[]{r9, r10, r0}     // Catch:{ all -> 0x1536 }
            r43 = 0
            r26 = 2
            r45 = r43
            r40 = r5
            r44 = r43
            android.database.Cursor r13 = r40.A03(r41, r42, r43, r44, r45)     // Catch:{ all -> 0x1536 }
            if (r13 == 0) goto L_0x0c45
            int r25 = r13.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0cc2 }
            int r24 = r13.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0cc2 }
            int r15 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cc2 }
        L_0x0bd7:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0cc2 }
            if (r0 == 0) goto L_0x0c42
            int r0 = r6.size()     // Catch:{ all -> 0x0cc2 }
            if (r0 < r11) goto L_0x0beb
            boolean r0 = X.C27501Ol.A02(r5, r2, r6)     // Catch:{ all -> 0x0cc2 }
            if (r0 != 0) goto L_0x0beb
            goto L_0x0cbe
        L_0x0beb:
            r0 = r25
            long r21 = r13.getLong(r0)     // Catch:{ all -> 0x0cc2 }
            r0 = r24
            java.lang.String r0 = r13.getString(r0)     // Catch:{ all -> 0x0cc2 }
            com.whatsapp.jid.UserJid r14 = X.C36431kI.A0l(r0)     // Catch:{ all -> 0x0cc2 }
            boolean r0 = r13.isNull(r15)     // Catch:{ all -> 0x0cc2 }
            if (r0 == 0) goto L_0x0c02
            goto L_0x0c07
        L_0x0c02:
            int r1 = r13.getInt(r15)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0c08
        L_0x0c07:
            r1 = 0
        L_0x0c08:
            if (r14 == 0) goto L_0x0c3f
            boolean r0 = r12.containsKey(r14)     // Catch:{ all -> 0x0cc2 }
            if (r0 == 0) goto L_0x0c3f
            if (r1 != 0) goto L_0x0c3f
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newUpdate(r41)     // Catch:{ all -> 0x0cc2 }
            r0 = 1
            android.content.ContentProviderOperation$Builder r20 = r1.withYieldAllowed(r0)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r19 = "_id = ?"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0cc2 }
            r0 = r21
            X.C36341k9.A1W(r11, r0)     // Catch:{ all -> 0x0cc2 }
            r1 = r20
            r0 = r19
            android.content.ContentProviderOperation$Builder r1 = r1.withSelection(r0, r11)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r0 = "sync2"
            java.lang.Object r11 = r12.get(r14)     // Catch:{ all -> 0x0cc2 }
            X.141 r11 = (X.AnonymousClass141) r11     // Catch:{ all -> 0x0cc2 }
            long r19 = r11.A0I()     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r11 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0cc2 }
            A03(r1, r11, r0, r6)     // Catch:{ all -> 0x0cc2 }
        L_0x0c3f:
            r11 = 100
            goto L_0x0bd7
        L_0x0c42:
            r13.close()     // Catch:{ all -> 0x1536 }
        L_0x0c45:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x0c53
            boolean r0 = X.C27501Ol.A02(r5, r2, r6)     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x0c53
            goto L_0x0ce3
        L_0x0c53:
            java.lang.String[] r42 = new java.lang.String[]{r9, r10}     // Catch:{ all -> 0x1536 }
            r43 = 0
            r45 = r43
            r40 = r5
            r44 = r43
            android.database.Cursor r13 = r40.A03(r41, r42, r43, r44, r45)     // Catch:{ all -> 0x1536 }
            if (r13 == 0) goto L_0x0cd1
            int r14 = r13.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0cc2 }
            int r15 = r13.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0cc2 }
        L_0x0c6d:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0cc2 }
            if (r0 == 0) goto L_0x0cce
            int r0 = r6.size()     // Catch:{ all -> 0x0cc2 }
            if (r0 < r11) goto L_0x0c80
            boolean r0 = X.C27501Ol.A02(r5, r2, r6)     // Catch:{ all -> 0x0cc2 }
            if (r0 != 0) goto L_0x0c80
            goto L_0x0cbe
        L_0x0c80:
            long r0 = r13.getLong(r14)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r9 = r13.getString(r15)     // Catch:{ all -> 0x0cc2 }
            com.whatsapp.jid.UserJid r9 = X.C36431kI.A0l(r9)     // Catch:{ all -> 0x0cc2 }
            if (r9 == 0) goto L_0x0c6d
            android.content.ContentProviderOperation$Builder r10 = android.content.ContentProviderOperation.newDelete(r27)     // Catch:{ all -> 0x0cc2 }
            r9 = 1
            android.content.ContentProviderOperation$Builder r12 = r10.withYieldAllowed(r9)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = "raw_contact_id = ? AND mimetype in (?,?,?,?,?)"
            r9 = 5
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x0cc2 }
            X.C36341k9.A1W(r9, r0)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r1 = "vnd.android.cursor.item/name"
            r0 = 1
            r9[r0] = r1     // Catch:{ all -> 0x0cc2 }
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r9[r26] = r0     // Catch:{ all -> 0x0cc2 }
            r1 = 3
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r9[r1] = r0     // Catch:{ all -> 0x0cc2 }
            r1 = 4
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r9[r1] = r0     // Catch:{ all -> 0x0cc2 }
            android.content.ContentProviderOperation$Builder r0 = r12.withSelection(r10, r9)     // Catch:{ all -> 0x0cc2 }
            android.content.ContentProviderOperation r0 = r0.build()     // Catch:{ all -> 0x0cc2 }
            r6.add(r0)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0c6d
        L_0x0cbe:
            r13.close()     // Catch:{ all -> 0x1536 }
            goto L_0x0ce3
        L_0x0cc2:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0cc8 }
            goto L_0x0e0a
        L_0x0cc8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1536 }
            goto L_0x0e0a
        L_0x0cce:
            r13.close()     // Catch:{ all -> 0x1536 }
        L_0x0cd1:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x0cf6
            boolean r0 = X.C27501Ol.A02(r5, r2, r6)     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x0cf6
            goto L_0x0ce3
        L_0x0cde:
            java.lang.String r0 = "androidcontactssync/skipping onVersionUpgrade"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x1536 }
        L_0x0ce3:
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x1536 }
            goto L_0x151a
        L_0x0ce9:
            if (r17 != 0) goto L_0x0cf6
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to null account"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x1536 }
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x1536 }
            goto L_0x151a
        L_0x0cf6:
            r0 = r18
            X.16m r0 = r0.A01     // Catch:{ all -> 0x1536 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x0d06
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x1536 }
            goto L_0x151a
        L_0x0d06:
            boolean r0 = r32.isEmpty()     // Catch:{ all -> 0x1536 }
            if (r0 == 0) goto L_0x0d12
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x1536 }
            goto L_0x151a
        L_0x0d12:
            java.util.HashMap r9 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x1536 }
            java.util.Iterator r2 = r32.iterator()     // Catch:{ all -> 0x1536 }
        L_0x0d1a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x1536 }
            if (r0 == 0) goto L_0x0d2c
            X.141 r1 = X.C36391kE.A0f(r2)     // Catch:{ all -> 0x1536 }
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0l(r1)     // Catch:{ all -> 0x1536 }
            r9.put(r0, r1)     // Catch:{ all -> 0x1536 }
            goto L_0x0d1a
        L_0x0d2c:
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x1536 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ all -> 0x1536 }
            java.lang.String r37 = "account_name"
            r0 = r17
            java.lang.String r1 = r0.name     // Catch:{ all -> 0x1536 }
            r0 = r37
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)     // Catch:{ all -> 0x1536 }
            java.lang.String r36 = "account_type"
            r0 = r17
            java.lang.String r1 = r0.type     // Catch:{ all -> 0x1536 }
            r0 = r36
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)     // Catch:{ all -> 0x1536 }
            java.lang.String r35 = "caller_is_syncadapter"
            java.lang.String r34 = "true"
            r1 = r35
            r0 = r34
            android.net.Uri r24 = X.C90484aE.A0M(r2, r1, r0)     // Catch:{ all -> 0x1536 }
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x1536 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ all -> 0x1536 }
            r0 = r34
            android.net.Uri r20 = X.C90484aE.A0M(r2, r1, r0)     // Catch:{ all -> 0x1536 }
            java.util.HashSet r29 = X.C36441kJ.A16()     // Catch:{ all -> 0x1536 }
            java.util.HashMap r21 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x1536 }
            r32.size()     // Catch:{ all -> 0x1536 }
            r0 = r18
            X.0yb r0 = r0.A02     // Catch:{ all -> 0x1536 }
            r54 = r0
            X.0ya r22 = r54.A0O()     // Catch:{ all -> 0x1536 }
            java.lang.String r2 = "_id"
            java.lang.String r27 = "sync1"
            java.lang.String r1 = "deleted"
            java.lang.String r0 = "display_name"
            r5 = r27
            java.lang.String[] r12 = new java.lang.String[]{r2, r5, r1, r0}     // Catch:{ all -> 0x1536 }
            r13 = 0
            r15 = r13
            r10 = r22
            r11 = r24
            r14 = r13
            android.database.Cursor r15 = r10.A03(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x1536 }
            if (r15 == 0) goto L_0x0e0e
            int r14 = r15.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0e01 }
            int r13 = r15.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0e01 }
            int r12 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0e01 }
            int r11 = r15.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0e01 }
        L_0x0da2:
            boolean r0 = r15.moveToNext()     // Catch:{ all -> 0x0e01 }
            if (r0 == 0) goto L_0x0e0b
            long r0 = r15.getLong(r14)     // Catch:{ all -> 0x0e01 }
            java.lang.String r2 = r15.getString(r13)     // Catch:{ all -> 0x0e01 }
            com.whatsapp.jid.UserJid r6 = X.C36431kI.A0l(r2)     // Catch:{ all -> 0x0e01 }
            boolean r2 = r15.isNull(r12)     // Catch:{ all -> 0x0e01 }
            if (r2 == 0) goto L_0x0dbc
            r10 = 0
            goto L_0x0dc0
        L_0x0dbc:
            int r10 = r15.getInt(r12)     // Catch:{ all -> 0x0e01 }
        L_0x0dc0:
            java.lang.String r5 = r15.getString(r11)     // Catch:{ all -> 0x0e01 }
            X.62b r2 = new X.62b     // Catch:{ all -> 0x0e01 }
            r2.<init>(r6, r5, r0)     // Catch:{ all -> 0x0e01 }
            if (r10 == 0) goto L_0x0dec
            java.lang.String r10 = "raw_contact_id=?"
            java.lang.String[] r6 = X.C36441kJ.A1R()     // Catch:{ Exception -> 0x0ddc }
            X.C36341k9.A1W(r6, r0)     // Catch:{ Exception -> 0x0ddc }
            r5 = r20
            r2 = r22
            r2.A01(r5, r10, r6)     // Catch:{ Exception -> 0x0ddc }
            goto L_0x0de2
        L_0x0ddc:
            r5 = move-exception
            java.lang.String r2 = "androidcontactssync/delete error"
            com.whatsapp.util.Log.w(r2, r5)     // Catch:{ all -> 0x0e01 }
        L_0x0de2:
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0e01 }
            r0 = r29
            r0.add(r1)     // Catch:{ all -> 0x0e01 }
            goto L_0x0da2
        L_0x0dec:
            r0 = r21
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x0e01 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0e01 }
            if (r1 != 0) goto L_0x0dfd
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0e01 }
            r0.put(r6, r1)     // Catch:{ all -> 0x0e01 }
        L_0x0dfd:
            r1.add(r2)     // Catch:{ all -> 0x0e01 }
            goto L_0x0da2
        L_0x0e01:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0e06 }
            goto L_0x0e0a
        L_0x0e06:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1536 }
        L_0x0e0a:
            throw r1     // Catch:{ all -> 0x1536 }
        L_0x0e0b:
            r15.close()     // Catch:{ all -> 0x1536 }
        L_0x0e0e:
            java.util.HashSet r12 = X.C36441kJ.A16()     // Catch:{ all -> 0x1536 }
            java.util.Iterator r19 = X.C36371kC.A10(r21)     // Catch:{ all -> 0x1536 }
        L_0x0e16:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x1536 }
            if (r0 == 0) goto L_0x0e91
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r19)     // Catch:{ all -> 0x1536 }
            java.lang.Object r11 = r2.getKey()     // Catch:{ all -> 0x1536 }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x1536 }
            java.lang.Object r1 = r9.get(r11)     // Catch:{ all -> 0x1536 }
            X.141 r1 = (X.AnonymousClass141) r1     // Catch:{ all -> 0x1536 }
            if (r1 == 0) goto L_0x0e47
            X.3IL r0 = r1.A0F     // Catch:{ all -> 0x1536 }
            if (r0 == 0) goto L_0x0e47
            boolean r0 = r1.A0z     // Catch:{ all -> 0x1536 }
            if (r0 == 0) goto L_0x0e47
            boolean r0 = r1.A0G()     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x0e47
            X.11F r1 = r1.A0H     // Catch:{ all -> 0x1536 }
            boolean r0 = r1 instanceof X.C177618e5     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x0e47
            boolean r0 = r1 instanceof X.C177628e6     // Catch:{ all -> 0x1536 }
            r15 = 1
            if (r0 == 0) goto L_0x0e48
        L_0x0e47:
            r15 = 0
        L_0x0e48:
            java.lang.Object r10 = r2.getValue()     // Catch:{ all -> 0x1536 }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ all -> 0x1536 }
            int r0 = r10.size()     // Catch:{ all -> 0x1536 }
            int r6 = r0 + -1
            if (r15 == 0) goto L_0x0e58
            int r6 = r0 + -2
        L_0x0e58:
            r5 = 0
        L_0x0e59:
            if (r5 > r6) goto L_0x0e8b
            java.lang.Object r14 = r10.get(r5)     // Catch:{ all -> 0x1536 }
            X.62b r14 = (X.C1259762b) r14     // Catch:{ all -> 0x1536 }
            long r0 = r14.A02     // Catch:{ all -> 0x1536 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x1536 }
            r0 = r29
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x0e88
            java.lang.String r13 = "_id = ?"
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ Exception -> 0x0e82 }
            long r0 = r14.A02     // Catch:{ Exception -> 0x0e82 }
            X.C36341k9.A1W(r2, r0)     // Catch:{ Exception -> 0x0e82 }
            r1 = r22
            r0 = r24
            r1.A01(r0, r13, r2)     // Catch:{ Exception -> 0x0e82 }
            goto L_0x0e88
        L_0x0e82:
            r1 = move-exception
            java.lang.String r0 = "androidcontactssync/delete error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x1536 }
        L_0x0e88:
            int r5 = r5 + 1
            goto L_0x0e59
        L_0x0e8b:
            if (r15 != 0) goto L_0x0e16
            r12.add(r11)     // Catch:{ all -> 0x1536 }
            goto L_0x0e16
        L_0x0e91:
            java.util.Set r0 = r21.keySet()     // Catch:{ all -> 0x1536 }
            r0.removeAll(r12)     // Catch:{ all -> 0x1536 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x1536 }
            java.util.ArrayList r26 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x1536 }
            java.util.HashSet r44 = X.C36441kJ.A16()     // Catch:{ all -> 0x1536 }
            java.util.HashSet r43 = X.C36441kJ.A16()     // Catch:{ all -> 0x1536 }
            java.util.HashSet r42 = X.C36441kJ.A16()     // Catch:{ all -> 0x1536 }
            java.util.HashSet r41 = X.C36441kJ.A16()     // Catch:{ all -> 0x1536 }
            java.util.HashSet r40 = X.C36441kJ.A16()     // Catch:{ all -> 0x1536 }
            java.lang.String r25 = "mimetype"
            java.lang.String r0 = "raw_contact_id"
            java.util.HashMap r45 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x1536 }
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x1536 }
            android.net.Uri$Builder r6 = r2.buildUpon()     // Catch:{ all -> 0x1536 }
            r2 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r5 = r8.getString(r2)     // Catch:{ all -> 0x1536 }
            r2 = r37
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r2, r5)     // Catch:{ all -> 0x1536 }
            java.lang.String r47 = "com.whatsapp"
            r5 = r36
            r2 = r47
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r5, r2)     // Catch:{ all -> 0x1536 }
            r5 = r35
            r2 = r34
            android.net.Uri r49 = X.C90484aE.A0M(r6, r5, r2)     // Catch:{ all -> 0x1536 }
            X.0ya r48 = r54.A0O()     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            r2 = r25
            java.lang.String[] r50 = new java.lang.String[]{r0, r2}     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            java.lang.String r51 = "mimetype in (?,?,?,?,?)"
            r2 = 5
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            r2 = 0
            java.lang.String r11 = "vnd.android.cursor.item/name"
            r10[r2] = r11     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            r2 = 1
            java.lang.String r9 = "vnd.android.cursor.item/phone_v2"
            r10[r2] = r9     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            r2 = 2
            java.lang.String r6 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r10[r2] = r6     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            r2 = 3
            java.lang.String r5 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r10[r2] = r5     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            r12 = 4
            java.lang.String r2 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r10[r12] = r2     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            r53 = 0
            r52 = r10
            android.database.Cursor r15 = r48.A03(r49, r50, r51, r52, r53)     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            if (r15 != 0) goto L_0x0f1a
            java.lang.String r2 = "androidcontactssync/failed/null hasDataUriCursorRow cursor"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0f90 }
            goto L_0x0fb5
        L_0x0f1a:
            int r46 = r15.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0f90 }
            r10 = r25
            int r19 = r15.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0f90 }
        L_0x0f24:
            boolean r10 = r15.moveToNext()     // Catch:{ all -> 0x0f90 }
            if (r10 == 0) goto L_0x0f8c
            r10 = r46
            java.lang.Long r14 = X.C36361kB.A0k(r15, r10)     // Catch:{ all -> 0x0f90 }
            r10 = r19
            java.lang.String r13 = r15.getString(r10)     // Catch:{ all -> 0x0f90 }
            r10 = r45
            boolean r10 = r10.containsKey(r14)     // Catch:{ all -> 0x0f90 }
            if (r10 != 0) goto L_0x0f47
            java.util.HashSet r12 = X.C36441kJ.A16()     // Catch:{ all -> 0x0f90 }
            r10 = r45
            r10.put(r14, r12)     // Catch:{ all -> 0x0f90 }
        L_0x0f47:
            r10 = r45
            java.lang.Object r10 = r10.get(r14)     // Catch:{ all -> 0x0f90 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x0f90 }
            boolean r12 = r13.equals(r11)     // Catch:{ all -> 0x0f90 }
            if (r12 == 0) goto L_0x0f57
            r12 = 0
            goto L_0x0f76
        L_0x0f57:
            boolean r12 = r13.equals(r9)     // Catch:{ all -> 0x0f90 }
            if (r12 == 0) goto L_0x0f5f
            r12 = 1
            goto L_0x0f76
        L_0x0f5f:
            boolean r12 = r13.equals(r6)     // Catch:{ all -> 0x0f90 }
            if (r12 == 0) goto L_0x0f67
            r12 = 2
            goto L_0x0f76
        L_0x0f67:
            boolean r12 = r13.equals(r5)     // Catch:{ all -> 0x0f90 }
            if (r12 == 0) goto L_0x0f6f
            r12 = 3
            goto L_0x0f76
        L_0x0f6f:
            boolean r12 = r13.equals(r2)     // Catch:{ all -> 0x0f90 }
            if (r12 == 0) goto L_0x0f7e
            r12 = 4
        L_0x0f76:
            java.lang.Byte r12 = java.lang.Byte.valueOf(r12)     // Catch:{ all -> 0x0f90 }
            r10.add(r12)     // Catch:{ all -> 0x0f90 }
            goto L_0x0f24
        L_0x0f7e:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0f90 }
            java.lang.String r2 = "no code found for "
            r5.append(r2)     // Catch:{ all -> 0x0f90 }
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0g(r13, r5)     // Catch:{ all -> 0x0f90 }
            throw r2     // Catch:{ all -> 0x0f90 }
        L_0x0f8c:
            r15.close()     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
            goto L_0x0fb5
        L_0x0f90:
            r2 = move-exception
            if (r15 == 0) goto L_0x0f9b
            r15.close()     // Catch:{ all -> 0x0f97 }
            goto L_0x0f9b
        L_0x0f97:
            r5 = move-exception
            r2.addSuppressed(r5)     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
        L_0x0f9b:
            throw r2     // Catch:{ Exception -> 0x0faf, OutOfMemoryError -> 0x0f9c }
        L_0x0f9c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1536 }
            java.lang.String r0 = "androidcontactssync/too-many-rows/size/"
            r1.append(r0)     // Catch:{ all -> 0x1536 }
            int r0 = r45.size()     // Catch:{ all -> 0x1536 }
            X.C36351kA.A1R(r1, r0)     // Catch:{ all -> 0x1536 }
            goto L_0x104c
        L_0x0faf:
            r5 = move-exception
            java.lang.String r2 = "androidcontactssync/failed/null hasDataUriCursorRow error"
            com.whatsapp.util.Log.e(r2, r5)     // Catch:{ all -> 0x1536 }
        L_0x0fb5:
            java.lang.String r2 = "data3"
            java.lang.String r19 = "data2"
            java.util.HashMap r9 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x1536 }
            android.net.Uri r5 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x1536 }
            android.net.Uri$Builder r10 = r5.buildUpon()     // Catch:{ all -> 0x1536 }
            r5 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r6 = r8.getString(r5)     // Catch:{ all -> 0x1536 }
            r5 = r37
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r5, r6)     // Catch:{ all -> 0x1536 }
            r6 = r36
            r5 = r47
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r6, r5)     // Catch:{ all -> 0x1536 }
            r6 = r35
            r5 = r34
            android.net.Uri r11 = X.C90484aE.A0M(r10, r6, r5)     // Catch:{ all -> 0x1536 }
            X.0ya r10 = r54.A0O()     // Catch:{ Exception -> 0x104d, OutOfMemoryError -> 0x103b }
            r5 = r19
            java.lang.String[] r12 = new java.lang.String[]{r0, r5, r2}     // Catch:{ Exception -> 0x104d, OutOfMemoryError -> 0x103b }
            java.lang.String r13 = "mimetype = ?"
            java.lang.String r5 = "vnd.android.cursor.item/phone_v2"
            java.lang.String[] r14 = new java.lang.String[]{r5}     // Catch:{ Exception -> 0x104d, OutOfMemoryError -> 0x103b }
            r15 = 0
            android.database.Cursor r14 = r10.A03(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x104d, OutOfMemoryError -> 0x103b }
            if (r14 != 0) goto L_0x0fff
            java.lang.String r5 = "androidcontactssync/failed/null hasDataUriCursorRow cursor"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x102f }
            goto L_0x1056
        L_0x0fff:
            int r13 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x102f }
            r5 = r19
            int r12 = r14.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x102f }
            int r11 = r14.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x102f }
        L_0x100d:
            boolean r5 = r14.moveToNext()     // Catch:{ all -> 0x102f }
            if (r5 == 0) goto L_0x102b
            java.lang.Long r10 = X.C36361kB.A0k(r14, r13)     // Catch:{ all -> 0x102f }
            int r5 = r14.getInt(r12)     // Catch:{ all -> 0x102f }
            java.lang.String r6 = r14.getString(r11)     // Catch:{ all -> 0x102f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x102f }
            android.util.Pair r5 = android.util.Pair.create(r5, r6)     // Catch:{ all -> 0x102f }
            r9.put(r10, r5)     // Catch:{ all -> 0x102f }
            goto L_0x100d
        L_0x102b:
            r14.close()     // Catch:{ Exception -> 0x104d, OutOfMemoryError -> 0x103b }
            goto L_0x1053
        L_0x102f:
            r6 = move-exception
            if (r14 == 0) goto L_0x103a
            r14.close()     // Catch:{ all -> 0x1036 }
            goto L_0x103a
        L_0x1036:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch:{ Exception -> 0x104d, OutOfMemoryError -> 0x103b }
        L_0x103a:
            throw r6     // Catch:{ Exception -> 0x104d, OutOfMemoryError -> 0x103b }
        L_0x103b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1536 }
            java.lang.String r0 = "androidcontactssync/hasCustomLabel/too-many-rows/size/"
            r1.append(r0)     // Catch:{ all -> 0x1536 }
            int r0 = r9.size()     // Catch:{ all -> 0x1536 }
            X.C36351kA.A1R(r1, r0)     // Catch:{ all -> 0x1536 }
        L_0x104c:
            throw r2     // Catch:{ all -> 0x1536 }
        L_0x104d:
            r6 = move-exception
            java.lang.String r5 = "androidcontactssync/hasCustomLabel/failed/null hasDataUriCursorRow error"
            com.whatsapp.util.Log.e(r5, r6)     // Catch:{ all -> 0x1536 }
        L_0x1053:
            r9.size()     // Catch:{ all -> 0x1536 }
        L_0x1056:
            r5 = 2131896208(0x7f122790, float:1.942727E38)
            java.lang.String r47 = r8.getString(r5)     // Catch:{ all -> 0x1536 }
            java.util.Iterator r46 = r32.iterator()     // Catch:{ all -> 0x1536 }
        L_0x1061:
            boolean r5 = r46.hasNext()     // Catch:{ all -> 0x1536 }
            if (r5 == 0) goto L_0x1309
            X.141 r10 = X.C36391kE.A0f(r46)     // Catch:{ all -> 0x1536 }
            int r6 = r1.size()     // Catch:{ all -> 0x1536 }
            r5 = 100
            if (r6 < r5) goto L_0x107a
            java.lang.String r6 = "error adding/updating contact data MIMETYPE labels"
            r5 = r22
            X.C27501Ol.A02(r5, r6, r1)     // Catch:{ all -> 0x1536 }
        L_0x107a:
            com.whatsapp.jid.UserJid r12 = X.C36351kA.A0l(r10)     // Catch:{ all -> 0x1536 }
            X.C18740tg.A06(r12)     // Catch:{ all -> 0x1536 }
            X.3IL r5 = r10.A0F     // Catch:{ all -> 0x1536 }
            if (r5 == 0) goto L_0x10a7
            boolean r5 = r10.A0z     // Catch:{ all -> 0x1536 }
            if (r5 == 0) goto L_0x10a7
            boolean r5 = r10.A0G()     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x10a7
            X.11F r6 = r10.A0H     // Catch:{ all -> 0x1536 }
            boolean r5 = r6 instanceof X.C177618e5     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x10a7
            boolean r5 = r6 instanceof X.C177628e6     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x10a7
            r5 = r21
            boolean r5 = r5.containsKey(r12)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x10e5
            r5 = r26
            r5.add(r10)     // Catch:{ all -> 0x1536 }
            goto L_0x1061
        L_0x10a7:
            r5 = r21
            boolean r5 = r5.containsKey(r12)     // Catch:{ all -> 0x1536 }
            if (r5 == 0) goto L_0x10e5
            r5 = r21
            java.lang.Object r5 = r5.get(r12)     // Catch:{ all -> 0x1536 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x1536 }
            java.util.Iterator r13 = r5.iterator()     // Catch:{ all -> 0x1536 }
        L_0x10bb:
            boolean r5 = r13.hasNext()     // Catch:{ all -> 0x1536 }
            if (r5 == 0) goto L_0x1061
            java.lang.Object r5 = r13.next()     // Catch:{ all -> 0x1536 }
            X.62b r5 = (X.C1259762b) r5     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r10 = android.content.ContentProviderOperation.newDelete(r24)     // Catch:{ all -> 0x1536 }
            r6 = 1
            android.content.ContentProviderOperation$Builder r12 = r10.withYieldAllowed(r6)     // Catch:{ all -> 0x1536 }
            java.lang.String r11 = "_id=?"
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch:{ all -> 0x1536 }
            long r5 = r5.A02     // Catch:{ all -> 0x1536 }
            X.C36341k9.A1W(r10, r5)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r5 = r12.withSelection(r11, r10)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation r5 = r5.build()     // Catch:{ all -> 0x1536 }
            r1.add(r5)     // Catch:{ all -> 0x1536 }
            goto L_0x10bb
        L_0x10e5:
            r5 = r21
            boolean r5 = r5.containsKey(r12)     // Catch:{ all -> 0x1536 }
            if (r5 == 0) goto L_0x1061
            r5 = r21
            java.util.List r6 = X.C90524aI.A0n(r12, r5)     // Catch:{ all -> 0x1536 }
            int r5 = r6.size()     // Catch:{ all -> 0x1536 }
            r11 = 1
            int r5 = r5 - r11
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x1536 }
            X.62b r5 = (X.C1259762b) r5     // Catch:{ all -> 0x1536 }
            long r5 = r5.A02     // Catch:{ all -> 0x1536 }
            r48 = r5
            java.lang.Long r14 = java.lang.Long.valueOf(r48)     // Catch:{ all -> 0x1536 }
            r5 = r45
            java.lang.Object r13 = r5.get(r14)     // Catch:{ all -> 0x1536 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x1536 }
            if (r13 == 0) goto L_0x11dc
            java.lang.String r11 = "vnd.android.cursor.item/name"
            r5 = 0
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch:{ all -> 0x1536 }
            boolean r5 = r13.contains(r5)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x11f1
            r5 = r44
            boolean r5 = r5.contains(r14)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x113a
            r5 = r20
            android.content.ContentProviderOperation$Builder r11 = A02(r5, r14, r11)     // Catch:{ all -> 0x1536 }
            java.lang.String r6 = "data1"
            java.lang.String r5 = r10.A0J()     // Catch:{ all -> 0x1536 }
            A03(r11, r5, r6, r1)     // Catch:{ all -> 0x1536 }
            r5 = r44
            r5.add(r14)     // Catch:{ all -> 0x1536 }
        L_0x113a:
            r5 = r18
            X.0ts r11 = r5.A04     // Catch:{ all -> 0x1536 }
            java.lang.String r6 = r12.user     // Catch:{ all -> 0x1536 }
            X.9oI r5 = X.C203559oI.A00()     // Catch:{ all -> 0x1536 }
            java.lang.String r5 = X.AnonymousClass3U8.A01(r5, r6)     // Catch:{ all -> 0x1536 }
            java.lang.String r6 = r11.A0H(r5)     // Catch:{ all -> 0x1536 }
            java.lang.String r11 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r5 = 2
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch:{ all -> 0x1536 }
            boolean r5 = r13.contains(r5)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x117c
            r5 = r43
            boolean r5 = r5.contains(r14)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x117c
            r5 = r20
            android.content.ContentProviderOperation$Builder r11 = A02(r5, r14, r11)     // Catch:{ all -> 0x1536 }
            r5 = r47
            android.content.ContentProviderOperation$Builder r11 = A01(r11, r12, r5)     // Catch:{ all -> 0x1536 }
            r5 = 2131886336(0x7f120100, float:1.9407248E38)
            java.lang.String r5 = X.C36321k7.A0A(r8, r6, r5)     // Catch:{ all -> 0x1536 }
            A03(r11, r5, r2, r1)     // Catch:{ all -> 0x1536 }
            r5 = r43
            r5.add(r14)     // Catch:{ all -> 0x1536 }
        L_0x117c:
            java.lang.String r11 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r5 = 3
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch:{ all -> 0x1536 }
            boolean r5 = r13.contains(r5)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x11ac
            r5 = r42
            boolean r5 = r5.contains(r14)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x11ac
            r5 = r20
            android.content.ContentProviderOperation$Builder r11 = A02(r5, r14, r11)     // Catch:{ all -> 0x1536 }
            r5 = r47
            android.content.ContentProviderOperation$Builder r11 = A01(r11, r12, r5)     // Catch:{ all -> 0x1536 }
            r5 = 2131886338(0x7f120102, float:1.9407252E38)
            java.lang.String r5 = X.C36321k7.A0A(r8, r6, r5)     // Catch:{ all -> 0x1536 }
            A03(r11, r5, r2, r1)     // Catch:{ all -> 0x1536 }
            r5 = r42
            r5.add(r14)     // Catch:{ all -> 0x1536 }
        L_0x11ac:
            java.lang.String r11 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r5 = 4
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch:{ all -> 0x1536 }
            boolean r5 = r13.contains(r5)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x11dc
            r5 = r41
            boolean r5 = r5.contains(r14)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x11dc
            r5 = r20
            android.content.ContentProviderOperation$Builder r11 = A02(r5, r14, r11)     // Catch:{ all -> 0x1536 }
            r5 = r47
            android.content.ContentProviderOperation$Builder r11 = A01(r11, r12, r5)     // Catch:{ all -> 0x1536 }
            r5 = 2131886337(0x7f120101, float:1.940725E38)
            java.lang.String r5 = X.C36321k7.A0A(r8, r6, r5)     // Catch:{ all -> 0x1536 }
            A03(r11, r5, r2, r1)     // Catch:{ all -> 0x1536 }
            r5 = r41
            r5.add(r14)     // Catch:{ all -> 0x1536 }
        L_0x11dc:
            X.3IL r5 = r10.A0F     // Catch:{ all -> 0x1536 }
            if (r5 == 0) goto L_0x11ef
            java.lang.String r11 = r5.A01     // Catch:{ all -> 0x1536 }
        L_0x11e2:
            boolean r5 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x1061
            boolean r5 = r9.containsKey(r14)     // Catch:{ all -> 0x1536 }
            if (r5 == 0) goto L_0x1061
            goto L_0x1223
        L_0x11ef:
            r11 = 0
            goto L_0x11e2
        L_0x11f1:
            X.3IL r5 = r10.A0F     // Catch:{ all -> 0x1536 }
            long r5 = r5.A00     // Catch:{ all -> 0x1536 }
            java.lang.Long r6 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x1536 }
            r5 = r33
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x1536 }
            if (r5 == 0) goto L_0x113a
            android.content.ContentProviderOperation$Builder r32 = android.content.ContentProviderOperation.newUpdate(r20)     // Catch:{ all -> 0x1536 }
            java.lang.String r15 = "raw_contact_id=? AND mimetype=?"
            java.lang.String[] r6 = X.C36441kJ.A1S()     // Catch:{ all -> 0x1536 }
            java.lang.String r5 = java.lang.String.valueOf(r48)     // Catch:{ all -> 0x1536 }
            X.C36331k8.A1N(r5, r11, r6)     // Catch:{ all -> 0x1536 }
            r5 = r32
            android.content.ContentProviderOperation$Builder r11 = r5.withSelection(r15, r6)     // Catch:{ all -> 0x1536 }
            java.lang.String r6 = "data1"
            java.lang.String r5 = r10.A0J()     // Catch:{ all -> 0x1536 }
            A03(r11, r5, r6, r1)     // Catch:{ all -> 0x1536 }
            goto L_0x113a
        L_0x1223:
            if (r13 == 0) goto L_0x1232
            r5 = 0
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch:{ all -> 0x1536 }
            boolean r5 = r13.contains(r5)     // Catch:{ all -> 0x1536 }
            r32 = 1
            if (r5 != 0) goto L_0x1234
        L_0x1232:
            r32 = 0
        L_0x1234:
            java.lang.Object r5 = r9.get(r14)     // Catch:{ all -> 0x1536 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x1536 }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x1536 }
            int r13 = X.C90514aH.A0H(r5)     // Catch:{ all -> 0x1536 }
            java.lang.Object r5 = r9.get(r14)     // Catch:{ all -> 0x1536 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x1536 }
            java.lang.Object r6 = r5.second     // Catch:{ all -> 0x1536 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x1536 }
            java.lang.Integer r5 = r10.A0L     // Catch:{ all -> 0x1536 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x126f
            java.lang.String r5 = r10.A0V     // Catch:{ all -> 0x1536 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x1267
            java.lang.String r12 = r10.A0V     // Catch:{ all -> 0x1536 }
        L_0x125c:
            java.lang.Integer r5 = r10.A0L     // Catch:{ all -> 0x1536 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x1536 }
            boolean r15 = X.AnonymousClass000.A1S(r5, r13)
            goto L_0x1271
        L_0x1267:
            r5 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r12 = r8.getString(r5)     // Catch:{ all -> 0x1536 }
            goto L_0x125c
        L_0x126f:
            r12 = 0
            goto L_0x125c
        L_0x1271:
            if (r12 == 0) goto L_0x1279
            boolean r13 = r12.equals(r6)     // Catch:{ all -> 0x1536 }
            if (r13 != 0) goto L_0x1285
        L_0x1279:
            if (r6 == 0) goto L_0x1281
            boolean r13 = r6.equals(r12)     // Catch:{ all -> 0x1536 }
            if (r13 != 0) goto L_0x1285
        L_0x1281:
            if (r12 != 0) goto L_0x128f
            if (r6 != 0) goto L_0x128f
        L_0x1285:
            r6 = 1
        L_0x1286:
            if (r15 == 0) goto L_0x128c
            if (r5 != 0) goto L_0x1061
            if (r6 != 0) goto L_0x1061
        L_0x128c:
            if (r32 != 0) goto L_0x12d5
            goto L_0x1291
        L_0x128f:
            r6 = 0
            goto L_0x1286
        L_0x1291:
            r5 = r40
            boolean r5 = r5.contains(r14)     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x1061
            android.content.ContentProviderOperation$Builder r6 = android.content.ContentProviderOperation.newInsert(r20)     // Catch:{ all -> 0x1536 }
            r5 = 1
            android.content.ContentProviderOperation$Builder r5 = r6.withYieldAllowed(r5)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r13 = r5.withValue(r0, r14)     // Catch:{ all -> 0x1536 }
            java.lang.String r6 = "vnd.android.cursor.item/phone_v2"
            r5 = r25
            android.content.ContentProviderOperation$Builder r6 = r13.withValue(r5, r6)     // Catch:{ all -> 0x1536 }
            java.lang.String r5 = "data1"
            android.content.ContentProviderOperation$Builder r11 = r6.withValue(r5, r11)     // Catch:{ all -> 0x1536 }
            java.lang.Integer r6 = r10.A0L     // Catch:{ all -> 0x1536 }
            r5 = r19
            android.content.ContentProviderOperation$Builder r5 = r11.withValue(r5, r6)     // Catch:{ all -> 0x1536 }
            java.lang.Integer r6 = r10.A0L     // Catch:{ all -> 0x1536 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x1536 }
            if (r6 != 0) goto L_0x12c7
            r5.withValue(r2, r12)     // Catch:{ all -> 0x1536 }
        L_0x12c7:
            android.content.ContentProviderOperation r5 = r5.build()     // Catch:{ all -> 0x1536 }
            r1.add(r5)     // Catch:{ all -> 0x1536 }
            r5 = r40
            r5.add(r14)     // Catch:{ all -> 0x1536 }
            goto L_0x1061
        L_0x12d5:
            android.content.ContentProviderOperation$Builder r11 = android.content.ContentProviderOperation.newUpdate(r20)     // Catch:{ all -> 0x1536 }
            java.lang.Integer r6 = r10.A0L     // Catch:{ all -> 0x1536 }
            r5 = r19
            android.content.ContentProviderOperation$Builder r14 = r11.withValue(r5, r6)     // Catch:{ all -> 0x1536 }
            java.lang.String r13 = "raw_contact_id=? AND mimetype=?"
            java.lang.String[] r11 = X.C36441kJ.A1S()     // Catch:{ all -> 0x1536 }
            r5 = r48
            X.C36341k9.A1W(r11, r5)     // Catch:{ all -> 0x1536 }
            java.lang.String r6 = "vnd.android.cursor.item/phone_v2"
            r5 = 1
            r11[r5] = r6     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r5 = r14.withSelection(r13, r11)     // Catch:{ all -> 0x1536 }
            java.lang.Integer r6 = r10.A0L     // Catch:{ all -> 0x1536 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x1536 }
            if (r6 != 0) goto L_0x1300
            r5.withValue(r2, r12)     // Catch:{ all -> 0x1536 }
        L_0x1300:
            android.content.ContentProviderOperation r5 = r5.build()     // Catch:{ all -> 0x1536 }
            r1.add(r5)     // Catch:{ all -> 0x1536 }
            goto L_0x1061
        L_0x1309:
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x1536 }
            if (r5 != 0) goto L_0x1316
            java.lang.String r5 = "error adding/updating contact data MIMETYPE labels"
            r6 = r22
            X.C27501Ol.A02(r6, r5, r1)     // Catch:{ all -> 0x1536 }
        L_0x1316:
            r1 = r18
            X.0v0 r9 = r1.A03     // Catch:{ all -> 0x1536 }
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r9)     // Catch:{ all -> 0x1536 }
            java.lang.String r6 = "current_data_action_string_version"
            int r1 = X.C36371kC.A01(r1, r6)     // Catch:{ all -> 0x1536 }
            r5 = 4
            if (r1 == r5) goto L_0x1331
            r10 = r17
            r1 = r18
            X.C27501Ol.A01(r10, r8, r1)     // Catch:{ all -> 0x1536 }
            X.C36321k7.A0q(r9, r6, r5)     // Catch:{ all -> 0x1536 }
        L_0x1331:
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x1536 }
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x1536 }
            X.0ya r42 = r54.A0O()     // Catch:{ all -> 0x1536 }
            java.util.Iterator r41 = r26.iterator()     // Catch:{ all -> 0x1536 }
        L_0x1341:
            boolean r1 = r41.hasNext()     // Catch:{ all -> 0x1536 }
            java.lang.String r9 = "error while writing to android contacts provider"
            if (r1 == 0) goto L_0x14a6
            X.141 r6 = X.C36391kE.A0f(r41)     // Catch:{ all -> 0x1536 }
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r12 = r6.A06(r1)     // Catch:{ all -> 0x1536 }
            X.C18740tg.A06(r12)     // Catch:{ all -> 0x1536 }
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12     // Catch:{ all -> 0x1536 }
            int r5 = r13.size()     // Catch:{ all -> 0x1536 }
            r1 = 100
            if (r5 < r1) goto L_0x1365
            r1 = r42
            X.C27501Ol.A02(r1, r9, r13)     // Catch:{ all -> 0x1536 }
        L_0x1365:
            java.lang.String r1 = r12.user     // Catch:{ all -> 0x1536 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1536 }
            if (r1 == 0) goto L_0x1371
            r14.add(r6)     // Catch:{ all -> 0x1536 }
            goto L_0x1341
        L_0x1371:
            X.3IL r1 = r6.A0F     // Catch:{ all -> 0x1536 }
            if (r1 == 0) goto L_0x145e
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x1536 }
            r40 = r1
        L_0x1379:
            java.lang.String r15 = r6.A0J()     // Catch:{ all -> 0x1536 }
            long r32 = r6.A0I()     // Catch:{ all -> 0x1536 }
            java.lang.Integer r1 = r6.A0L     // Catch:{ all -> 0x1536 }
            r24 = r1
            java.lang.String r1 = r6.A0V     // Catch:{ all -> 0x1536 }
            r22 = r1
            android.net.Uri r1 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x1536 }
            android.net.Uri$Builder r6 = r1.buildUpon()     // Catch:{ all -> 0x1536 }
            r5 = r35
            r1 = r34
            android.net.Uri r21 = X.C90484aE.A0M(r6, r5, r1)     // Catch:{ all -> 0x1536 }
            int r11 = r13.size()     // Catch:{ all -> 0x1536 }
            java.lang.String r5 = r12.user     // Catch:{ all -> 0x1536 }
            X.9oI r1 = X.C203559oI.A00()     // Catch:{ all -> 0x1536 }
            java.lang.String r10 = X.AnonymousClass3U8.A01(r1, r5)     // Catch:{ all -> 0x1536 }
            r1 = 2131896208(0x7f122790, float:1.942727E38)
            java.lang.String r9 = r8.getString(r1)     // Catch:{ all -> 0x1536 }
            android.net.Uri r1 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r6 = android.content.ContentProviderOperation.newInsert(r1)     // Catch:{ all -> 0x1536 }
            r1 = r17
            java.lang.String r5 = r1.name     // Catch:{ all -> 0x1536 }
            r1 = r37
            android.content.ContentProviderOperation$Builder r6 = r6.withValue(r1, r5)     // Catch:{ all -> 0x1536 }
            r1 = r17
            java.lang.String r5 = r1.type     // Catch:{ all -> 0x1536 }
            r1 = r36
            android.content.ContentProviderOperation$Builder r6 = r6.withValue(r1, r5)     // Catch:{ all -> 0x1536 }
            java.lang.String r5 = r12.getRawString()     // Catch:{ all -> 0x1536 }
            r1 = r27
            android.content.ContentProviderOperation$Builder r6 = r6.withValue(r1, r5)     // Catch:{ all -> 0x1536 }
            java.lang.Long r5 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x1536 }
            java.lang.String r1 = "sync2"
            android.content.ContentProviderOperation$Builder r5 = r6.withValue(r1, r5)     // Catch:{ all -> 0x1536 }
            r1 = 1
            android.content.ContentProviderOperation$Builder r1 = r5.withYieldAllowed(r1)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x1536 }
            r13.add(r1)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r21)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r6 = r1.withValueBackReference(r0, r11)     // Catch:{ all -> 0x1536 }
            java.lang.String r5 = "vnd.android.cursor.item/name"
            r1 = r25
            android.content.ContentProviderOperation$Builder r6 = r6.withValue(r1, r5)     // Catch:{ all -> 0x1536 }
            java.lang.String r20 = "data1"
            r5 = r20
            A03(r6, r15, r5, r13)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r21)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r6 = r1.withValueBackReference(r0, r11)     // Catch:{ all -> 0x1536 }
            java.lang.String r5 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r1 = r25
            android.content.ContentProviderOperation$Builder r1 = r6.withValue(r1, r5)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r15 = A01(r1, r12, r9)     // Catch:{ all -> 0x1536 }
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x1536 }
            r6 = 0
            r1 = 2131886336(0x7f120100, float:1.9407248E38)
            java.lang.String r5 = X.C36391kE.A0v(r8, r10, r5, r6, r1)     // Catch:{ all -> 0x1536 }
            A03(r15, r5, r2, r13)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r21)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r5 = r1.withValueBackReference(r0, r11)     // Catch:{ all -> 0x1536 }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r15 = r25
            android.content.ContentProviderOperation$Builder r1 = r5.withValue(r15, r1)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r15 = A01(r1, r12, r9)     // Catch:{ all -> 0x1536 }
            r5 = 2131886338(0x7f120102, float:1.9407252E38)
            r1 = 1
            java.lang.String r5 = X.C36351kA.A0w(r8, r10, r1, r5)     // Catch:{ all -> 0x1536 }
            A03(r15, r5, r2, r13)     // Catch:{ all -> 0x1536 }
            java.lang.String r5 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r21)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r1 = r1.withValueBackReference(r0, r11)     // Catch:{ all -> 0x1536 }
            r15 = r25
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r15, r5)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r9 = A01(r1, r12, r9)     // Catch:{ all -> 0x1536 }
            r5 = 2131886337(0x7f120101, float:1.940725E38)
            r1 = 1
            java.lang.String r1 = X.C36351kA.A0w(r8, r10, r1, r5)     // Catch:{ all -> 0x1536 }
            A03(r9, r1, r2, r13)     // Catch:{ all -> 0x1536 }
            goto L_0x1462
        L_0x145e:
            r40 = 0
            goto L_0x1379
        L_0x1462:
            if (r40 == 0) goto L_0x1341
            java.lang.String r5 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r21)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r9 = r1.withValueBackReference(r0, r11)     // Catch:{ all -> 0x1536 }
            android.content.ContentProviderOperation$Builder r9 = r9.withValue(r15, r5)     // Catch:{ all -> 0x1536 }
            r5 = r20
            r1 = r40
            android.content.ContentProviderOperation$Builder r9 = r9.withValue(r5, r1)     // Catch:{ all -> 0x1536 }
            if (r24 == 0) goto L_0x1480
            int r6 = r24.intValue()     // Catch:{ all -> 0x1536 }
        L_0x1480:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1536 }
            r1 = r19
            r9.withValue(r1, r5)     // Catch:{ all -> 0x1536 }
            if (r6 != 0) goto L_0x149d
            boolean r1 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x1536 }
            if (r1 == 0) goto L_0x1498
            r1 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r22 = r8.getString(r1)     // Catch:{ all -> 0x1536 }
        L_0x1498:
            r1 = r22
            r9.withValue(r2, r1)     // Catch:{ all -> 0x1536 }
        L_0x149d:
            android.content.ContentProviderOperation r1 = r9.build()     // Catch:{ all -> 0x1536 }
            r13.add(r1)     // Catch:{ all -> 0x1536 }
            goto L_0x1341
        L_0x14a6:
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x14b1
            r0 = r42
            X.C27501Ol.A02(r0, r9, r13)     // Catch:{ all -> 0x1536 }
        L_0x14b1:
            r1 = r55
            r0 = r38
            android.content.SharedPreferences$Editor r2 = X.C36381kD.A0G(r1, r0)     // Catch:{ all -> 0x1536 }
            r1 = 3
            r0 = r39
            android.content.SharedPreferences$Editor r0 = r2.putInt(r0, r1)     // Catch:{ all -> 0x1536 }
            r0.commit()     // Catch:{ all -> 0x1536 }
            r26.size()     // Catch:{ all -> 0x1536 }
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x1536 }
            boolean r0 = r29.isEmpty()     // Catch:{ all -> 0x1536 }
            if (r0 != 0) goto L_0x151a
            r29.size()     // Catch:{ all -> 0x1536 }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x1536 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ all -> 0x1536 }
            r0 = r17
            java.lang.String r1 = r0.name     // Catch:{ all -> 0x1536 }
            r0 = r37
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)     // Catch:{ all -> 0x1536 }
            r1 = r17
            java.lang.String r1 = r1.type     // Catch:{ all -> 0x1536 }
            r2 = r36
            android.net.Uri$Builder r2 = r0.appendQueryParameter(r2, r1)     // Catch:{ all -> 0x1536 }
            r1 = r35
            r0 = r34
            android.net.Uri r2 = X.C90484aE.A0M(r2, r1, r0)     // Catch:{ all -> 0x1536 }
            java.util.Iterator r6 = r29.iterator()     // Catch:{ all -> 0x1536 }
        L_0x14f8:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x1536 }
            if (r0 == 0) goto L_0x151a
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x1536 }
            r29.size()     // Catch:{ Exception -> 0x1513 }
            X.0ya r5 = r54.A0O()     // Catch:{ Exception -> 0x1513 }
            java.lang.String r1 = "_id = ?"
            java.lang.String[] r0 = X.C90474aD.A1b(r0)     // Catch:{ Exception -> 0x1513 }
            r5.A01(r2, r1, r0)     // Catch:{ Exception -> 0x1513 }
            goto L_0x14f8
        L_0x1513:
            r1 = move-exception
            java.lang.String r0 = "androidcontactssync/error deleting raw contacts with deleted=1"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x1536 }
            goto L_0x14f8
        L_0x151a:
            monitor-exit(r18)     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            boolean r0 = r14.isEmpty()     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            if (r0 != 0) goto L_0x15da
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            java.lang.String r0 = "androidcontactssync/invalid contacts found during android contacts sync; removing "
            X.C36371kC.A1R(r0, r1, r14)     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            java.lang.String r0 = " contacts"
            X.C36341k9.A1O(r1, r0)     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            r0 = r56
            r0.A0m(r14)     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            goto L_0x15da
        L_0x1536:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
            throw r0     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
        L_0x1539:
            r1 = move-exception
            if (r5 == 0) goto L_0x1544
            r5.close()     // Catch:{ all -> 0x1540 }
            goto L_0x1544
        L_0x1540:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1545 }
        L_0x1544:
            throw r1     // Catch:{ all -> 0x1545 }
        L_0x1545:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x154a }
            goto L_0x154e
        L_0x154a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
        L_0x154e:
            throw r1     // Catch:{ SecurityException -> 0x156e, NullPointerException -> 0x156a, RuntimeException -> 0x154f }
        L_0x154f:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto L_0x1566
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x15bf
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof android.os.DeadSystemException
            if (r0 == 0) goto L_0x15bf
        L_0x1566:
            X.6Pu r4 = X.C131626Pu.A02
            goto L_0x00c8
        L_0x156a:
            r6 = move-exception
            java.lang.String r2 = "SyncTask/sync/npe"
            goto L_0x15c1
        L_0x156e:
            r6 = move-exception
            java.lang.String r2 = "SyncTask/sync/securityException"
            goto L_0x15c1
        L_0x1572:
            java.lang.String r0 = "ContactSyncRequestExecutor/failure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            r1 = 1390(0x56e, float:1.948E-42)
            r0 = r77
            int r1 = r0.A07(r1)
            int r0 = r2.A00
            if (r0 > r1) goto L_0x1709
            int r1 = r4.A00
            r0 = 6
            if (r1 == r0) goto L_0x1709
            r0 = r80
            r0.A04(r4)
        L_0x1593:
            java.lang.Long r0 = r7.A09
            if (r0 != 0) goto L_0x15ac
            int r1 = r4.A00
            r0 = 3
            if (r1 == 0) goto L_0x15a6
            r0 = 4
            if (r1 == r0) goto L_0x15a6
            r0 = 5
            if (r1 == r0) goto L_0x15a6
            r0 = 6
            if (r1 == r0) goto L_0x15a6
            r0 = -1
        L_0x15a6:
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r7.A09 = r0
        L_0x15ac:
            r1 = 0
        L_0x15ad:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.A04 = r0
            r0 = r76
            X.C27491Ok.A00(r0, r7)
            X.0yW r0 = r0.A01
            r0.Bly(r7)
            goto L_0x1657
        L_0x15bf:
            java.lang.String r2 = "SyncTask/sync/RuntimeException"
        L_0x15c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ContactSyncRequestExecutor/"
            X.C90464aC.A1L(r0, r2, r1, r6)
            X.0wN r5 = r3.A02
            java.lang.String r2 = X.C36321k7.A0D(r0, r2)
            java.lang.String r1 = r6.getMessage()
            r0 = 1
            r5.A0E(r2, r1, r0)
        L_0x15d8:
            if (r16 == 0) goto L_0x162b
        L_0x15da:
            r0 = r16
            java.util.List r2 = r0.A00
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x15ee
            r0 = r16
            java.util.Map r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x162b
        L_0x15ee:
            X.16D r0 = r3.A0A
            X.16p r5 = r0.A05
            r0 = r16
            java.util.Map r1 = r0.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x167d
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x167d
        L_0x1602:
            android.content.SharedPreferences r0 = X.AnonymousClass1O6.A00(r78)
            java.lang.String r5 = "contact_version"
            int r2 = X.C36371kC.A01(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contact-sync-prefs/getversion="
            X.C36321k7.A1T(r0, r1, r2)
            int r2 = r2 + 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contact-sync-prefs/setversion="
            X.C36321k7.A1T(r0, r1, r2)
            android.content.SharedPreferences r0 = X.AnonymousClass1O6.A00(r78)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C36341k9.A0v(r0, r5, r2)
        L_0x162b:
            java.lang.Long r0 = r7.A0F
            if (r0 == 0) goto L_0x163a
            long r5 = r0.longValue()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto L_0x15ad
        L_0x163a:
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r7.A04 = r0
            r7.A00 = r0
            r0 = r76
            X.C27491Ok.A00(r0, r7)
            X.0yW r2 = r0.A01
            X.0u5 r0 = r7.samplingRate
            int r0 = r0.A00
            int r1 = r0 * 10
            X.0u5 r0 = new X.0u5
            r0.<init>(r1, r1)
            r2.Blx(r7, r0)
        L_0x1657:
            long r5 = r75.A02()
            long r7 = r30 - r5
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ContactSyncAdapter/excessive internal storage used before: "
            r2.append(r0)
            r0 = r30
            r2.append(r0)
            java.lang.String r0 = " now"
            java.lang.String r0 = X.C36381kD.A0z(r0, r2, r5)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00c8
        L_0x167d:
            X.16r r0 = r5.A00     // Catch:{ RuntimeException -> 0x1701 }
            X.1M0 r6 = r0.A04()     // Catch:{ RuntimeException -> 0x1701 }
            X.71s r11 = r6.B1k()     // Catch:{ all -> 0x16f7 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x16ed }
            java.lang.String r9 = "system_contacts_version_table"
            if (r0 != 0) goto L_0x16bb
            android.content.ContentValues r8 = X.C36441kJ.A0E()     // Catch:{ all -> 0x16ed }
            java.util.Iterator r10 = X.AnonymousClass000.A0y(r1)     // Catch:{ all -> 0x16ed }
        L_0x1697:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x16ed }
            if (r0 == 0) goto L_0x16bb
            java.util.Map$Entry r5 = X.AnonymousClass000.A11(r10)     // Catch:{ all -> 0x16ed }
            java.lang.String r1 = "id"
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x16ed }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x16ed }
            r8.put(r1, r0)     // Catch:{ all -> 0x16ed }
            java.lang.String r1 = "version"
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x16ed }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x16ed }
            r8.put(r1, r0)     // Catch:{ all -> 0x16ed }
            X.C229416o.A05(r8, r6, r9)     // Catch:{ all -> 0x16ed }
            goto L_0x1697
        L_0x16bb:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x16ed }
            if (r0 != 0) goto L_0x16e2
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x16ed }
        L_0x16c5:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x16ed }
            if (r0 == 0) goto L_0x16e2
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x16ed }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x16ed }
            java.lang.String r5 = "id = ?"
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x16ed }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x16ed }
            r2[r1] = r0     // Catch:{ all -> 0x16ed }
            X.C229416o.A02(r6, r9, r5, r2)     // Catch:{ all -> 0x16ed }
            goto L_0x16c5
        L_0x16e2:
            r11.A00()     // Catch:{ all -> 0x16ed }
            r11.close()     // Catch:{ all -> 0x16f7 }
            r6.close()     // Catch:{ RuntimeException -> 0x1701 }
            goto L_0x1602
        L_0x16ed:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x16f2 }
            goto L_0x16f6
        L_0x16f2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x16f7 }
        L_0x16f6:
            throw r1     // Catch:{ all -> 0x16f7 }
        L_0x16f7:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x16fc }
            goto L_0x1700
        L_0x16fc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ RuntimeException -> 0x1701 }
        L_0x1700:
            throw r1     // Catch:{ RuntimeException -> 0x1701 }
        L_0x1701:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/system-version; apply-failed"
            X.C18740tg.A08(r0, r1)
            goto L_0x1602
        L_0x1709:
            r0 = r80
            r0.A05(r4)
            goto L_0x1593
        L_0x1710:
            if (r19 == 0) goto L_0x171b
            java.lang.String r0 = "ContactSyncRequestExecutor/No device to sync separately."
        L_0x1714:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.6Pu r4 = X.C131626Pu.A08
            goto L_0x00c3
        L_0x171b:
            if (r48 == 0) goto L_0x1720
            java.lang.String r0 = "ContactSyncRequestExecutor/No payment to sync separately."
            goto L_0x1714
        L_0x1720:
            if (r45 == 0) goto L_0x1725
            java.lang.String r0 = "ContactSyncRequestExecutor/No picture to sync separately."
            goto L_0x1714
        L_0x1725:
            java.lang.String r0 = "ContactSyncRequestExecutor/No contact to sync separately."
            goto L_0x1714
        L_0x1728:
            java.lang.String r0 = "ContactSyncRequestExecutor/onStop."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x174e }
            r1 = 0
            monitor-enter(r23)     // Catch:{ all -> 0x174e }
            r0 = r23
            r0.A00 = r1     // Catch:{ all -> 0x174b }
            X.C27511Om.A00(r23)     // Catch:{ all -> 0x174b }
            monitor-exit(r23)     // Catch:{ all -> 0x174e }
            r1 = 0
            r0 = r28
            r0.set(r1)     // Catch:{ all -> 0x174e }
            monitor-exit(r28)     // Catch:{ all -> 0x174e }
            r0 = 8
            X.1j5 r1 = new X.1j5
            r1.<init>(r3, r4, r0)
            r0 = r79
            r0.A0H(r1)
            return
        L_0x174b:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x174e }
            throw r0     // Catch:{ all -> 0x174e }
        L_0x174e:
            r0 = move-exception
            monitor-exit(r28)     // Catch:{ all -> 0x174e }
            throw r0
        L_0x1751:
            r1 = move-exception
            if (r12 == 0) goto L_0x175c
            r12.close()     // Catch:{ all -> 0x1758 }
            goto L_0x175c
        L_0x1758:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x175d }
        L_0x175c:
            throw r1     // Catch:{ all -> 0x175d }
        L_0x175d:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x17b7 }
            throw r1
        L_0x1762:
            throw r9     // Catch:{ all -> 0x1763 }
        L_0x1763:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x1766:
            r1 = move-exception
            goto L_0x1781
        L_0x1768:
            r1 = move-exception
            if (r8 == 0) goto L_0x1773
            r8.close()     // Catch:{ all -> 0x176f }
            goto L_0x1773
        L_0x176f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1774 }
        L_0x1773:
            throw r1     // Catch:{ all -> 0x1774 }
        L_0x1774:
            r1 = move-exception
            r35.close()     // Catch:{ all -> 0x1779 }
            goto L_0x177d
        L_0x1779:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x177e }
        L_0x177d:
            throw r1     // Catch:{ all -> 0x177e }
        L_0x177e:
            r1 = move-exception
            goto L_0x1781
        L_0x1780:
            r1 = move-exception
        L_0x1781:
            java.util.Map r0 = r5.A0N
            r0.clear()
            java.util.Map r0 = r5.A0L
            r0.clear()
            java.util.Map r0 = r5.A0K
            r0.clear()
            java.util.Map r0 = r5.A0M
            r0.clear()
            java.util.Map r0 = r5.A0J
            r0.clear()
            r5.A00 = r10
            r5.A01 = r10
            java.util.Map r0 = r12.A01
            if (r0 == 0) goto L_0x17a5
            r0.clear()
        L_0x17a5:
            throw r1
        L_0x17a6:
            r1 = move-exception
            if (r11 == 0) goto L_0x17b1
            r11.close()     // Catch:{ all -> 0x17ad }
            goto L_0x17b1
        L_0x17ad:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x17b2 }
        L_0x17b1:
            throw r1     // Catch:{ all -> 0x17b2 }
        L_0x17b2:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x17b7 }
            throw r1
        L_0x17b7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x17bc:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x17bf }
            throw r0     // Catch:{ all -> 0x17bf }
        L_0x17bf:
            r0 = move-exception
            monitor-exit(r28)     // Catch:{ all -> 0x17bf }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503174u.run():void");
    }

    public static void A03(ContentProviderOperation.Builder builder, Object obj, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(builder.withValue(str, obj).build());
    }
}
