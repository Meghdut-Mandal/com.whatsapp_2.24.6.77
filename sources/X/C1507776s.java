package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.76s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1507776s implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass6WM A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C1507776s(AnonymousClass6WM r1, DeviceJid deviceJid, String str, int i, int i2) {
        this.A02 = r1;
        this.A03 = deviceJid;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object call() {
        return AnonymousClass6WM.A01(this.A02, this.A03, this.A04, this.A00, this.A01);
    }
}
