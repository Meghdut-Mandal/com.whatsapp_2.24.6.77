package X;

import android.hardware.camera2.CaptureRequest;

public class A2D implements C22878AxZ {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ AnonymousClass9YE A01;
    public final /* synthetic */ A2F A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ float[] A04;

    public A2D(CaptureRequest.Builder builder, AnonymousClass9YE r2, A2F a2f, float[] fArr, boolean z) {
        this.A01 = r2;
        this.A02 = a2f;
        this.A04 = fArr;
        this.A00 = builder;
        this.A03 = z;
    }

    public void BYF(boolean z) {
        Integer num;
        AnonymousClass9YE r5 = this.A01;
        boolean z2 = r5.A09;
        A2F a2f = this.A02;
        if (z2) {
            r5.A03(a2f);
        } else {
            a2f.A06 = null;
        }
        if (z) {
            num = C023109s.A0G;
        } else {
            num = C023109s.A0R;
        }
        r5.A04(num, this.A04);
        if (!r5.A0E) {
            CaptureRequest.Builder builder = this.A00;
            Number number = (Number) builder.get(CaptureRequest.CONTROL_AE_MODE);
            long j = 4000;
            if (number == null || number.intValue() != 1) {
                if (!this.A03) {
                    j = 2000;
                }
                r5.A02(builder, a2f, j);
                return;
            }
            if (!this.A03) {
                j = 2000;
            }
            synchronized (r5) {
                B8V b8v = new B8V(builder, r5, a2f, 2);
                r5.A00();
                r5.A08 = r5.A0B.A02("monitor_auto_exposure", b8v, j);
            }
        }
    }
}
