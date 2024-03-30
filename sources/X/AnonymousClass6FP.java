package X;

import android.os.Build;
import android.util.Log;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6FP  reason: invalid class name */
public abstract class AnonymousClass6FP {
    public AnonymousClass6QA A00;
    public UUID A01;
    public boolean A02;
    public final Set A03;

    public AnonymousClass6FP(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        AnonymousClass00C.A08(randomUUID);
        this.A01 = randomUUID;
        String A0y = C36381kD.A0y(randomUUID);
        String name = cls.getName();
        AnonymousClass00C.A08(name);
        Integer num = C023109s.A00;
        AnonymousClass6X2 r4 = AnonymousClass6X2.A01;
        AnonymousClass00C.A09(r4);
        this.A00 = new AnonymousClass6QA(C132316Tb.A08, r4, r4, num, num, num, A0y, name, (String) null, 0, 0, 0, 0, 0, 0, AnonymousClass6X5.A0L, 0, 0, -1, false);
        this.A03 = AnonymousClass02N.A02(name);
    }

    public abstract C120745s0 A01();

    public final void A05(Integer num, TimeUnit timeUnit, long j) {
        this.A02 = true;
        AnonymousClass6QA r2 = this.A00;
        r2.A0C = num;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            AnonymousClass6VD.A00();
            Log.w(AnonymousClass6QA.A0L, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            AnonymousClass6VD.A00();
            Log.w(AnonymousClass6QA.A0L, "Backoff delay duration less than minimum value");
        }
        r2.A02 = C15040mb.A04(millis, 10000, 18000000);
    }

    public final void A06(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A03.add(str);
    }

    public final C120745s0 A00() {
        boolean z;
        C120745s0 A012 = A01();
        C132316Tb r2 = this.A00.A09;
        int i = Build.VERSION.SDK_INT;
        if ((i < 24 || !C90514aH.A1a(r2.A03)) && !r2.A04 && !r2.A05 && (i < 23 || !r2.A00())) {
            z = false;
        } else {
            z = true;
        }
        AnonymousClass6QA r1 = this.A00;
        if (r1.A0H) {
            if (!(!z)) {
                throw AnonymousClass001.A08("Expedited jobs only support network and storage constraints");
            } else if (r1.A04 > 0) {
                throw AnonymousClass001.A08("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        AnonymousClass00C.A08(randomUUID);
        this.A01 = randomUUID;
        String A0y = C36381kD.A0y(randomUUID);
        AnonymousClass6QA r9 = this.A00;
        String str = r9.A0G;
        Integer num = r9.A0E;
        String str2 = r9.A0F;
        AnonymousClass6X2 r7 = new AnonymousClass6X2(r9.A0A);
        AnonymousClass6X2 r6 = new AnonymousClass6X2(r9.A0B);
        long j = r9.A04;
        long j2 = r9.A05;
        long j3 = r9.A03;
        C132316Tb r0 = r9.A09;
        boolean z2 = r0.A05;
        boolean z3 = r0.A06;
        Integer num2 = r0.A02;
        boolean z4 = r0.A04;
        boolean z5 = r0.A07;
        C132316Tb r25 = new C132316Tb(num2, r0.A03, r0.A01, r0.A00, z2, z3, z4, z5);
        int i2 = r9.A01;
        Integer num3 = r9.A0C;
        long j4 = r9.A02;
        long j5 = r9.A06;
        long j6 = r9.A07;
        long j7 = r9.A08;
        boolean z6 = r9.A0H;
        this.A00 = new AnonymousClass6QA(r25, r7, r6, num, num3, r9.A0D, A0y, str, str2, i2, r9.A00, 0, j, j2, j3, j4, j5, j6, j7, z6);
        return A012;
    }

    public void A02(long j, TimeUnit timeUnit) {
        this.A00.A04 = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.A00.A04) {
            throw AnonymousClass001.A08("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void A03(C132316Tb r2) {
        this.A00.A09 = r2;
    }

    public void A04(Integer num) {
        AnonymousClass6QA r1 = this.A00;
        r1.A0H = true;
        r1.A0D = num;
    }
}
