package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import com.facebook.wearable.datax.Service;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9mB  reason: invalid class name and case insensitive filesystem */
public final class C202559mB {
    public int A00;
    public CipherBuilder A01;
    public LocalChannel A02;
    public final Handler A03;
    public final AnonymousClass9UM A04 = new AnonymousClass9UM();
    public final C202079l0 A05;
    public final AnonymousClass88G A06;
    public final AnonymousClass88K A07;
    public final AnonymousClass882 A08;
    public final Connection A09;
    public final Object A0A;
    public final Object A0B;
    public final Runnable A0C;
    public final Runnable A0D;
    public final AtomicBoolean A0E;
    public final C006302t A0F;
    public final C006302t A0G;
    public final C006302t A0H;
    public final Looper A0I;
    public final Service A0J;

    public C202559mB(Looper looper, C202079l0 r15, AnonymousClass882 r16, Connection connection, C006302t r18, C006302t r19, C006302t r20) {
        AnonymousClass00C.A0D(r15, 3);
        this.A08 = r16;
        Connection connection2 = connection;
        this.A09 = connection2;
        this.A05 = r15;
        this.A0F = r18;
        this.A0H = r19;
        this.A0G = r20;
        this.A0I = looper;
        Service service = new Service(5);
        service.onReceived = new C1898895z(this, 0);
        service.onConnected = C22505Ann.A00;
        service.onDisconnected = C22506Ano.A00;
        AnonymousClass6YR.A06("LinkSetup", "Registering service.");
        connection2.register(service);
        this.A0J = service;
        this.A02 = A03();
        this.A07 = new AnonymousClass88K((C1891492l) null, (C22885Axg) null, (C22885Axg) null, (AnonymousClass90V) null, (AnonymousClass90V) null, (UUID) null, (UUID) null, (C05250Oz) null, 127);
        Handler handler = null;
        this.A06 = new AnonymousClass88G((Hash) null, (Hash) null);
        this.A0A = C36441kJ.A11();
        this.A0B = C36441kJ.A11();
        this.A0E = new AtomicBoolean(false);
        this.A03 = looper != null ? new Handler(looper) : handler;
        this.A0C = new C1497572q(this, 25);
        this.A0D = new C1497572q(this, 26);
    }

    public static final void A01(C202559mB r5, C006302t r6) {
        Hash hash;
        AnonymousClass88G r4 = r5.A06;
        synchronized (r4) {
            r6.invoke(r4);
            AnonymousClass6YR.A06("LinkSetup", "Encrypting links completed");
            C006302t r3 = r5.A0F;
            Hash hash2 = r4.A01;
            if (!(hash2 == null || (hash = r4.A00) == null)) {
                r3.invoke(new AnonymousClass885(hash2, hash));
                Handler handler = r5.A03;
                if (handler != null) {
                    handler.removeCallbacks(r5.A0C);
                }
                r5.A04.A01(new AnonymousClass9PM("Encrypting links successful!"));
            }
        }
    }

    public static final void A02(C202559mB r12, C006302t r13) {
        UUID uuid;
        AnonymousClass90V r9;
        AnonymousClass90V r2;
        AnonymousClass88K r3 = r12.A07;
        synchronized (r3) {
            r13.invoke(r3);
            AnonymousClass6YR.A06("LinkSetup", AnonymousClass000.A0l(r3, "Checking end link success: ", AnonymousClass000.A0u()));
            UUID uuid2 = r3.A05;
            if (!(uuid2 == null || (uuid = r3.A04) == null || (r9 = r3.A02) == null || (r2 = r3.A03) == null)) {
                C22885Axg axg = r3.A01;
                if (axg == null) {
                    axg = new C21008A2w();
                }
                C22885Axg axg2 = r3.A00;
                if (axg2 == null) {
                    axg2 = new C21008A2w();
                }
                Handler handler = r12.A03;
                if (handler != null) {
                    handler.removeCallbacks(r12.A0D);
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("----------------------------");
                A0u.append(10);
                StringBuilder A0l = C165587tf.A0l(AnonymousClass000.A0l(r2, "Tx target state: ", C165587tf.A0l(AnonymousClass000.A0l(r9, "Rx target state: ", C165587tf.A0l(AnonymousClass000.A0l(uuid2, "TxId: ", C165587tf.A0l(AnonymousClass000.A0l(uuid, "RxId: ", C165587tf.A0l("Link setup finished...", A0u)), A0u)), A0u)), A0u)), A0u);
                A0l.append("Contains RX transform: ");
                boolean z = true;
                A0l.append(AnonymousClass000.A1V(r3.A00));
                C36351kA.A1K(A0l, A0u);
                StringBuilder A0y = C165607th.A0y(A0u);
                A0y.append("Contains TX transform: ");
                if (r3.A01 == null) {
                    z = false;
                }
                A0y.append(z);
                C36351kA.A1K(A0y, A0u);
                String A0t = AnonymousClass000.A0t(A0u, 10);
                AnonymousClass00C.A08(A0t);
                AnonymousClass6YR.A06("LinkSetup", A0t);
                r12.A04.A01(new AnonymousClass9PM("End link setup successful!"));
                r12.A0H.invoke(new AnonymousClass889(axg, axg2, r9, uuid2, uuid));
            }
        }
    }

    public final LocalChannel A03() {
        LocalChannel localChannel = new LocalChannel(this.A09, 5);
        localChannel.onReceived = AnonymousClass97B.A00(this, 0);
        localChannel.onError = new C22307AkV(this);
        localChannel.onClosed = C22262AjP.A00;
        return localChannel;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|(1:7)|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0A
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0E     // Catch:{ all -> 0x0040 }
            boolean r0 = X.C90504aG.A1Z(r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            r1 = 0
            r3.A01 = r1     // Catch:{ all -> 0x0040 }
            X.88G r0 = r3.A06     // Catch:{ all -> 0x0040 }
            r0.A01 = r1     // Catch:{ all -> 0x0040 }
            r0.A00 = r1     // Catch:{ all -> 0x0040 }
            X.88K r0 = r3.A07     // Catch:{ all -> 0x0040 }
            r0.A04 = r1     // Catch:{ all -> 0x0040 }
            r0.A02 = r1     // Catch:{ all -> 0x0040 }
            r0.A05 = r1     // Catch:{ all -> 0x0040 }
            r0.A03 = r1     // Catch:{ all -> 0x0040 }
            r0.A01 = r1     // Catch:{ all -> 0x0040 }
            r0.A02 = r1     // Catch:{ all -> 0x0040 }
            android.os.Handler r1 = r3.A03     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0030
            java.lang.Runnable r0 = r3.A0C     // Catch:{ all -> 0x0040 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0040 }
            java.lang.Runnable r0 = r3.A0D     // Catch:{ all -> 0x0040 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0040 }
        L_0x0030:
            com.facebook.wearable.datax.LocalChannel r1 = r3.A02     // Catch:{ all -> 0x0040 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x0040 }
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            com.facebook.wearable.datax.Service r0 = r3.A0J     // Catch:{ all -> 0x0040 }
            r0.unregister()     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r2)
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202559mB.A04():void");
    }

    public static final void A00(C202559mB r2, AnonymousClass00S r3) {
        Object obj;
        try {
            obj = r3.invoke();
        } catch (Throwable th) {
            obj = C90524aI.A0t(th);
        }
        Throwable A002 = AnonymousClass0AK.A00(obj);
        if (A002 != null) {
            r2.A0G.invoke(A002);
            r2.A04();
        }
    }
}
