package X;

import android.bluetooth.BluetoothSocket;
import android.os.Looper;
import com.facebook.wearable.datax.Connection;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9ee  reason: invalid class name and case insensitive filesystem */
public final class C199069ee {
    public C202559mB A00;
    public C195109Sn A01;
    public AnonymousClass00S A02;
    public C006302t A03;
    public final Connection A04;
    public final AnonymousClass887 A05;
    public final AnonymousClass9DE A06;
    public final UUID A07;
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final C006302t A09;
    public final C009003v A0A;
    public final BluetoothSocket A0B;
    public final C202079l0 A0C;
    public final AtomicBoolean A0D = new AtomicBoolean();
    public final C006302t A0E;

    public C199069ee(BluetoothSocket bluetoothSocket, AnonymousClass887 r19, C006302t r20, C006302t r21, C009003v r22) {
        UUID randomUUID;
        BluetoothSocket bluetoothSocket2 = bluetoothSocket;
        AnonymousClass00C.A0D(bluetoothSocket2, 1);
        this.A0B = bluetoothSocket2;
        AnonymousClass887 r2 = r19;
        this.A05 = r2;
        this.A09 = r20;
        this.A0E = r21;
        this.A0A = r22;
        if (r19 != null) {
            randomUUID = r2.A02;
        } else {
            randomUUID = UUID.randomUUID();
        }
        this.A07 = randomUUID;
        String A0l = AnonymousClass000.A0l(randomUUID, "lam:LinkedDevice-", AnonymousClass000.A0u());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 120, timeUnit, new LinkedBlockingDeque(), AnonymousClass77N.A00);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 120, timeUnit, new LinkedBlockingDeque(), AnonymousClass77O.A00);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        C202079l0 r3 = new C202079l0(new C122185uR(threadPoolExecutor, threadPoolExecutor2), A0l);
        r3.A04 = AnonymousClass97B.A00(this, 17);
        r3.A02 = AnonymousClass97B.A00(this, 18);
        r3.A03 = AnonymousClass97B.A00(this, 19);
        this.A0C = r3;
        AnonymousClass951 r1 = Connection.Companion;
        this.A04 = new Connection((C009003v) new C109175Wo(r3, 0));
        this.A06 = new AnonymousClass9DE(this);
    }

    public static final void A00(C199069ee r4, AnonymousClass00S r5) {
        if (r4.A0D.compareAndSet(false, true)) {
            C195109Sn r2 = r4.A01;
            if (r2 != null && r2.A07.compareAndSet(false, true)) {
                r2.A05.unregister();
                AnonymousClass95J.A00(r2.A04);
            }
            C202559mB r0 = r4.A00;
            if (r0 != null) {
                r0.A04();
            }
            AnonymousClass95J.A00(r4.A0B);
            r5.invoke();
            if (!r4.A08.get()) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Device link disconnected ");
                AnonymousClass6YR.A06("lam:LinkedDevice", AnonymousClass000.A0o(r4.A07, A0u));
                AnonymousClass00S r02 = r4.A02;
                if (r02 != null) {
                    r02.invoke();
                }
            }
            r4.A0E.invoke(r4);
        }
    }

    public final void A01() {
        IllegalStateException illegalStateException;
        String str;
        int intValue;
        String str2;
        String str3;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Opening device (");
        BluetoothSocket bluetoothSocket = this.A0B;
        A0u.append(bluetoothSocket.getRemoteDevice());
        A0u.append(") link ");
        UUID uuid = this.A07;
        AnonymousClass6YR.A06("lam:LinkedDevice", AnonymousClass000.A0o(uuid, A0u));
        Connection connection = this.A04;
        connection.reset();
        AnonymousClass887 r4 = this.A05;
        if (r4 != null) {
            AnonymousClass882 r8 = new AnonymousClass882();
            this.A00 = new C202559mB(Looper.getMainLooper(), this.A0C, r8, connection, AnonymousClass97B.A00(this, 14), AnonymousClass97B.A00(this, 15), AnonymousClass97B.A00(this, 16));
        }
        C202079l0 r82 = this.A0C;
        C197739cI A002 = AnonymousClass950.A00(bluetoothSocket);
        Object obj = r82.A08;
        synchronized (obj) {
            if (r82.A00 == null) {
                str = r82.A09;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("attach input ");
                intValue = A002.A02.intValue();
                if (intValue != 0) {
                    str2 = "BtcRfcomm";
                } else {
                    str2 = "BleL2Cap";
                }
                A0u2.append(str2);
                C90474aD.A1N(A0u2, " (transformer=");
                A0u2.append(") rollover(queued=");
                A0u2.append((Object) null);
                A0u2.append(", received=");
                AnonymousClass6YR.A04(str, AnonymousClass000.A0m((Object) null, A0u2));
                InputStream inputStream = A002.A00;
                ReadableByteChannel newChannel = Channels.newChannel(inputStream);
                AnonymousClass00C.A08(newChannel);
                r82.A00 = new AnonymousClass9JX(inputStream, newChannel);
            } else {
                illegalStateException = AnonymousClass001.A09("input already attached");
            }
            throw illegalStateException;
        }
        AtomicBoolean atomicBoolean = r82.A0B;
        if (atomicBoolean.get()) {
            C202079l0.A01(r82);
        }
        synchronized (obj) {
            if (r82.A01 == null) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("attach output ");
                if (intValue != 0) {
                    str3 = "BtcRfcomm";
                } else {
                    str3 = "BleL2Cap";
                }
                A0u3.append(str3);
                A0u3.append(" (transformer=");
                AnonymousClass6YR.A04(str, C36321k7.A0H(A0u3, false));
                OutputStream outputStream = A002.A01;
                WritableByteChannel newChannel2 = Channels.newChannel(outputStream);
                AnonymousClass00C.A08(newChannel2);
                r82.A01 = new AnonymousClass9JY(outputStream, newChannel2);
            } else {
                illegalStateException = AnonymousClass001.A09("output already attached");
                throw illegalStateException;
            }
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            C202079l0.A01(r82);
        }
        r82.A0C.compareAndSet(false, true);
        if (r4 != null) {
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append(AnonymousClass000.A0l(uuid, "Settings up secure link ", AnonymousClass000.A0u()));
            StringBuilder A0y = C165607th.A0y(A0u4);
            A0y.append("  - app key: ");
            byte[] serialize = r4.A00.recoverPublicKey().serialize();
            C22511Ant ant = C22511Ant.A00;
            C165567td.A1T(A0y, A0u4, ant, serialize);
            StringBuilder A0u5 = AnonymousClass000.A0u();
            A0u5.append("  - device key: ");
            C165567td.A1T(A0u5, A0u4, ant, r4.A01.serialize());
            AnonymousClass6YR.A06("lam:LinkedDevice", C36381kD.A0y(A0u4));
            C202559mB r1 = this.A00;
            if (r1 != null) {
                C202559mB.A00(r1, new C22042Afp(r1));
                return;
            }
            return;
        }
        AnonymousClass6YR.A0B("lam:LinkedDevice", "Security is not specified. This behavior will be deprecated soon!", (Throwable) null);
        this.A09.invoke(this);
    }
}
