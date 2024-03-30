package X;

import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;

/* renamed from: X.9LG  reason: invalid class name */
public final class AnonymousClass9LG {
    public String A00 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
    public final A33 A01;
    public final XAnalyticsAdapterHolder A02;
    public final AnonymousClass9IW A03;

    public AnonymousClass9LG(AnonymousClass9IW r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A03 = r3;
        A33 a33 = new A33(r3);
        this.A01 = a33;
        this.A02 = new XAnalyticsAdapterHolder(a33);
    }
}
