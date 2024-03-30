package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.19B  reason: invalid class name */
public final class AnonymousClass19B implements C20420xX {
    public final C20810yC A00;
    public final AnonymousClass19C A01;
    public final CountDownLatch A02 = new CountDownLatch(1);
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;
    public final AnonymousClass00T A05;
    public final C005002g A06 = new C005002g();
    public final C005002g A07 = new C005002g();
    public final C19700wN A08;
    public final AtomicBoolean A09 = new AtomicBoolean(false);

    public AnonymousClass19B(C19700wN r4, C20810yC r5, AnonymousClass19C r6, C19770wU r7) {
        AnonymousClass00C.A0D(r7, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r6, 4);
        this.A00 = r5;
        this.A08 = r4;
        this.A01 = r6;
        this.A04 = new AnonymousClass00U(new AnonymousClass19E(r7));
        this.A03 = new AnonymousClass00U(new AnonymousClass19F(this));
        this.A05 = new AnonymousClass00U(new AnonymousClass19G(this));
    }

    public final void A08(AnonymousClass9WB r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (!((Boolean) this.A03.getValue()).booleanValue()) {
            synchronized (this) {
                A00(r4, this);
            }
            return;
        }
        ((C19930wk) this.A04.getValue()).execute(new C35741jB(this, r4, 9));
    }

    public /* synthetic */ void BYl() {
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYp() {
    }

    public static final Long A00(AnonymousClass9WB r4, AnonymousClass19B r5) {
        C005002g r3 = r5.A06;
        int indexOf = r3.indexOf(r4);
        Long l = null;
        if (indexOf >= 0) {
            int i = indexOf + 1;
            for (int i2 = 0; i2 < i; i2++) {
                r3.A0N();
            }
            C005002g r1 = r5.A07;
            AnonymousClass9WB r0 = (AnonymousClass9WB) r1.A0M();
            if (r0 != null) {
                l = r0.A02;
            }
            r1.size();
            r1.clear();
            r3.size();
        }
        return l;
    }

    private final void A01() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            A06();
            if (!this.A02.await(60, TimeUnit.SECONDS)) {
                this.A08.A0E("failed_to_load_pre_acks", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, false);
            }
        }
    }

    public static final void A02(AnonymousClass19B r3, long j) {
        C18740tg.A0C(((Boolean) r3.A03.getValue()).booleanValue());
        ((C19930wk) r3.A04.getValue()).A03(new C35711j8(r3, 36), j);
    }

    public final void A06() {
        if (((Boolean) this.A03.getValue()).booleanValue() && !this.A09.getAndSet(true)) {
            Log.i("PreacksQueue/startLoadingAsync");
            ((C19930wk) this.A04.getValue()).execute(new C35711j8(this, 35));
            StringBuilder sb = new StringBuilder();
            sb.append("PreacksQueue/startLoadingAsync starting a periodic writer writerDelayMs=");
            AnonymousClass00T r2 = this.A05;
            sb.append(((Number) r2.getValue()).longValue());
            Log.i(sb.toString());
            A02(this, ((Number) r2.getValue()).longValue());
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A07() {
        /*
            r16 = this;
            r3 = r16
            monitor-enter(r3)
            X.02g r4 = r3.A06     // Catch:{ all -> 0x010d }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x010b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x010d }
            r5.<init>(r4)     // Catch:{ all -> 0x010d }
            monitor-exit(r3)
            X.19C r2 = r3.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
            r1.<init>()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = "PreacksStore/insertMany size="
            r1.append(r0)     // Catch:{ Exception -> 0x00ab }
            int r0 = r5.size()     // Catch:{ Exception -> 0x00ab }
            r1.append(r0)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00ab }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00ab }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ab }
            r10.<init>()     // Catch:{ Exception -> 0x00ab }
            r0 = 64
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00ab }
            r12.<init>(r0)     // Catch:{ Exception -> 0x00ab }
            X.AnonymousClass19C.A00(r2)     // Catch:{ Exception -> 0x00ab }
            X.005 r0 = r2.A04     // Catch:{ Exception -> 0x00ab }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00ab }
            X.16q r0 = (X.C229616q) r0     // Catch:{ Exception -> 0x00ab }
            X.1M0 r8 = r0.A04()     // Catch:{ Exception -> 0x00ab }
            X.71s r9 = r8.B1k()     // Catch:{ all -> 0x00a4 }
            java.util.Iterator r15 = r5.iterator()     // Catch:{ all -> 0x009d }
        L_0x004e:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x009d }
            X.9WB r1 = (X.AnonymousClass9WB) r1     // Catch:{ all -> 0x009d }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x009d }
            r14.<init>()     // Catch:{ all -> 0x009d }
            r12.reset()     // Catch:{ all -> 0x009d }
            X.9nx r11 = r1.A01     // Catch:{ all -> 0x009d }
            X.C203299nk.A01(r11, r12)     // Catch:{ all -> 0x009d }
            r12.toByteArray()     // Catch:{ all -> 0x009d }
            byte[] r6 = r12.toByteArray()     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "ptn"
            r14.put(r0, r6)     // Catch:{ all -> 0x009d }
            X.14e r13 = r8.A02     // Catch:{ all -> 0x009d }
            java.lang.String r7 = "preacks"
            r6 = 3
            java.lang.String r0 = "PreacksStore/INSERT_MANY"
            long r13 = r13.A08(r7, r0, r14, r6)     // Catch:{ all -> 0x009d }
            r6 = 0
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x004e
            long r0 = r1.A00     // Catch:{ all -> 0x009d }
            java.lang.Long r7 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x009d }
            X.9WB r6 = new X.9WB     // Catch:{ all -> 0x009d }
            r6.<init>(r11, r7, r0)     // Catch:{ all -> 0x009d }
            r10.add(r6)     // Catch:{ all -> 0x009d }
            goto L_0x004e
        L_0x0093:
            r9.A00()     // Catch:{ all -> 0x009d }
            r9.close()     // Catch:{ all -> 0x00a4 }
            r8.close()     // Catch:{ Exception -> 0x00ab }
            goto L_0x00e7
        L_0x009d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009f }
        L_0x009f:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ Exception -> 0x00ab }
            throw r0     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PreacksStore/insertManyCatchingErrors failed to persist "
            r1.append(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r0 = " pre-acks"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A08(r0, r6)
            X.0wN r2 = r2.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "count="
            r1.append(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "failed_to_persist_pre_acks"
            r2.A0D(r0, r1, r6)
            X.09w r10 = X.C023409w.A00
        L_0x00e7:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x010c
            r10.size()
            monitor-enter(r3)
            X.02g r0 = r3.A07     // Catch:{ all -> 0x010d }
            r0.addAll(r10)     // Catch:{ all -> 0x010d }
            int r1 = r4.size()     // Catch:{ all -> 0x010d }
            int r0 = r5.size()     // Catch:{ all -> 0x010d }
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x010d }
            r0 = 0
        L_0x0103:
            if (r0 >= r1) goto L_0x010b
            r4.A0N()     // Catch:{ all -> 0x010d }
            int r0 = r0 + 1
            goto L_0x0103
        L_0x010b:
            monitor-exit(r3)
        L_0x010c:
            return
        L_0x010d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19B.A07():void");
    }

    public void BYn() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            ((C19930wk) this.A04.getValue()).execute(new C35711j8(this, 33));
        }
    }

    public void BYo() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            ((C19930wk) this.A04.getValue()).execute(new C35711j8(this, 34));
        }
    }

    public final int A03() {
        int size;
        A01();
        synchronized (this) {
            size = this.A07.size() + this.A06.size();
        }
        return size;
    }

    public final AnonymousClass9WB A04() {
        AnonymousClass9WB r0;
        A01();
        synchronized (this) {
            r0 = (AnonymousClass9WB) this.A06.A0M();
            if (r0 == null) {
                r0 = (AnonymousClass9WB) this.A07.A0M();
            }
        }
        return r0;
    }

    public final ArrayList A05() {
        ArrayList arrayList;
        A01();
        synchronized (this) {
            arrayList = new ArrayList(this.A07);
            arrayList.addAll(this.A06);
        }
        return arrayList;
    }

    public final boolean A09() {
        boolean z;
        A01();
        synchronized (this) {
            z = true;
            if (!(!this.A07.isEmpty()) && !(!this.A06.isEmpty())) {
                z = false;
            }
        }
        return z;
    }
}
