package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.soloader.SoLoader;

/* renamed from: X.9k7  reason: invalid class name and case insensitive filesystem */
public abstract class C201689k7 {
    public C207229ul A00;
    public String A01;
    public boolean A02;
    public int A03;
    public MultiBufferLogger A04;
    public volatile boolean A05;

    public abstract void disable();

    public abstract void enable();

    public abstract int getSupportedProviders();

    public abstract int getTracingProviders();

    public void onTraceEnded(C207229ul r1, A2W a2w) {
    }

    public void onTraceStarted(C207229ul r1, A2W a2w) {
    }

    public final MultiBufferLogger A01() {
        if (!this.A05) {
            synchronized (this) {
                if (!this.A05) {
                    this.A04 = new MultiBufferLogger();
                    this.A05 = true;
                }
            }
        }
        return this.A04;
    }

    /* JADX INFO: finally extract failed */
    public final void A02() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    MultiBufferLogger A012 = A01();
                    try {
                        int writeStandardEntry = A012.writeStandardEntry(6, 21, 0, 0, 0, 0, 0);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("ensureSoLibLoaded: ");
                        String str = this.A01;
                        A012.writeBytesEntry(0, 83, writeStandardEntry, AnonymousClass000.A0q(str, A0u));
                        SoLoader.A06(str);
                        this.A02 = true;
                        A012.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                    } catch (Throwable th) {
                        A012.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                        throw th;
                    }
                }
            }
        }
    }

    public final void A03(C207229ul r3, A2W a2w) {
        if (this.A03 != 0 && (r3.A02 & getSupportedProviders()) != 0) {
            A02();
            onTraceEnded(r3, a2w);
            A00(this, r3);
            A01().removeBuffer(r3.A09);
        }
    }

    public C201689k7(String str) {
        this.A01 = str;
        this.A02 = AnonymousClass000.A1W(str);
    }

    public static void A00(C201689k7 r3, C207229ul r4) {
        int supportedProviders = r3.getSupportedProviders() & TraceEvents.sProviders;
        int i = r3.A03;
        if (i != 0) {
            int i2 = i & TraceEvents.sProviders;
            int i3 = r3.A03;
            if (i2 == i3) {
                return;
            }
            if (i3 != 0) {
                r3.disable();
                r3.A00 = null;
            }
        }
        if (supportedProviders != 0) {
            r3.A00 = r4;
            r3.enable();
        }
        r3.A03 = supportedProviders;
    }
}
