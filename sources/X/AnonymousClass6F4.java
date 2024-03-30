package X;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.6F4  reason: invalid class name */
public abstract class AnonymousClass6F4 {
    public final C21690ze A00;
    public final C19970wo A01;
    public final Map A02;

    public final void A03(int i, String str, String str2) {
        int i2;
        AnonymousClass00C.A0D(str2, 2);
        C21690ze r1 = this.A00;
        if (this instanceof C101254xF) {
            i2 = 22413317;
        } else {
            i2 = 22413316;
        }
        r1.markerAnnotate(i2, i, str, str2);
    }

    public final void A02(int i, String str) {
        int i2;
        C21690ze r1 = this.A00;
        if (this instanceof C101254xF) {
            i2 = 22413317;
        } else {
            i2 = 22413316;
        }
        r1.markerPoint(i2, i, str);
    }

    public final void A04(int i, short s) {
        int i2;
        C21690ze r1 = this.A00;
        if (this instanceof C101254xF) {
            i2 = 22413317;
        } else {
            i2 = 22413316;
        }
        r1.markerEnd(i2, i, s);
    }

    public final void A05(AnonymousClass6SG r4, int i) {
        String str = r4.A01;
        AnonymousClass00C.A08(str);
        A03(i, "delivery_session_id", str);
        String str2 = r4.A00;
        AnonymousClass00C.A08(str2);
        A03(i, "effect_session_id", str2);
        A03(i, "event_timestamp_ms", String.valueOf(SystemClock.uptimeMillis()));
        C123145w1 r2 = (C123145w1) this.A02.get(str);
        if (r2 != null) {
            A03(i, "session", r2.A03);
            String str3 = r4.A04;
            AnonymousClass00C.A08(str3);
            A03(i, "product_session_id", str3);
            A03(i, "product_name", r4.A03);
            String str4 = r2.A00;
            if (str4.length() > 0) {
                A03(i, "effect_id", str4);
                A03(i, "effect_instance_id", r2.A01);
                A03(i, "effect_name", r2.A02);
                A03(i, "effect_type", r2.A04);
            }
        }
    }

    public AnonymousClass6F4(C19970wo r1, C21690ze r2, Map map) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = map;
    }
}
