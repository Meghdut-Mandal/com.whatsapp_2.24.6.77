package X;

import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import com.facebook.wearable.datax.Service;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9Sn  reason: invalid class name and case insensitive filesystem */
public final class C195109Sn {
    public final Hash A00;
    public final Hash A01;
    public final PrivateKey A02;
    public final PublicKey A03;
    public final LocalChannel A04;
    public final Service A05;
    public final AtomicBoolean A06 = new AtomicBoolean();
    public final AtomicBoolean A07 = new AtomicBoolean();
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final AnonymousClass00S A09;
    public final C006302t A0A;
    public final Connection A0B;

    public C195109Sn(Hash hash, Hash hash2, PrivateKey privateKey, PublicKey publicKey, Connection connection, AnonymousClass00S r10, C006302t r11) {
        C36321k7.A0y(connection, publicKey);
        AnonymousClass00C.A0D(r11, 7);
        this.A0B = connection;
        this.A02 = privateKey;
        this.A03 = publicKey;
        this.A00 = hash;
        this.A01 = hash2;
        this.A09 = r10;
        this.A0A = r11;
        LocalChannel localChannel = new LocalChannel(connection, 30);
        localChannel.onError = AnonymousClass97B.A00(this, 22);
        this.A04 = localChannel;
        Service service = new Service(30);
        service.onReceived = new C1898895z(this, 5);
        connection.register(service);
        this.A05 = service;
    }
}
