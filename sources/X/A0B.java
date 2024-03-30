package X;

import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

public class A0B implements C22774Avk {
    public static final AnonymousClass9TP A05 = new AnonymousClass9TP(new AnonymousClass9U7(new AnonymousClass9JT()));
    public int A00 = 0;
    public A1D A01;
    public final C201209j4 A02;
    public final AbrContextAwareConfiguration A03;
    public final C1896394p A04;

    public A0B(AbrContextAwareConfiguration abrContextAwareConfiguration, C1896394p r5) {
        C201209j4 r0;
        B40 b40 = B40.A00;
        this.A01 = new A1D(this, b40, this, abrContextAwareConfiguration.abrSetting.shouldCountFirstChunkOnly);
        synchronized (C201209j4.class) {
            r0 = C201209j4.A07;
            if (r0 == null) {
                r0 = new C201209j4(b40);
                C201209j4.A07 = r0;
            }
        }
        this.A02 = r0;
        this.A04 = r5;
        this.A03 = abrContextAwareConfiguration;
    }
}
