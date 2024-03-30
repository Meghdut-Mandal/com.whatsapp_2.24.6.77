package X;

import java.util.concurrent.Callable;

/* renamed from: X.AYj  reason: case insensitive filesystem */
public final /* synthetic */ class C21732AYj implements Callable {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ AnonymousClass6EZ A01;
    public final /* synthetic */ AnonymousClass189 A02;
    public final /* synthetic */ C121865tq A03;
    public final /* synthetic */ C121865tq A04;
    public final /* synthetic */ byte[] A05;
    public final /* synthetic */ byte[] A06;

    public /* synthetic */ C21732AYj(AnonymousClass6EZ r1, AnonymousClass189 r2, C121865tq r3, C121865tq r4, byte[] bArr, byte[] bArr2, byte b) {
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = bArr;
        this.A00 = b;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = bArr2;
    }

    public final Object call() {
        return Integer.valueOf(this.A02.A05(this.A01, this.A03, this.A04, this.A05, this.A06, this.A00));
    }
}
