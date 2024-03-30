package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.76x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1508276x implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C64933Qa A02;
    public final /* synthetic */ C121865tq A03;
    public final /* synthetic */ C121865tq A04;
    public final /* synthetic */ C207209uj A05;
    public final /* synthetic */ C30491aI A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ byte[] A08;
    public final /* synthetic */ byte[] A09;

    public /* synthetic */ C1508276x(C64933Qa r1, C121865tq r2, C121865tq r3, C207209uj r4, C30491aI r5, byte[] bArr, byte[] bArr2, int i, int i2, boolean z) {
        this.A06 = r5;
        this.A02 = r1;
        this.A08 = bArr;
        this.A00 = i;
        this.A09 = bArr2;
        this.A03 = r2;
        this.A04 = r3;
        this.A07 = z;
        this.A01 = i2;
        this.A05 = r4;
    }

    public final Object call() {
        C30491aI r1 = this.A06;
        C64933Qa r3 = this.A02;
        byte[] bArr = this.A08;
        int i = this.A00;
        byte[] bArr2 = this.A09;
        C121865tq r4 = this.A03;
        C121865tq r5 = this.A04;
        boolean z = this.A07;
        return r1.A00(DeviceJid.of(this.A05.A02), r3, r4, r5, bArr, bArr2, i, this.A01, z);
    }
}
