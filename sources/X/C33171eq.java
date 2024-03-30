package X;

import android.os.Bundle;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1eq  reason: invalid class name and case insensitive filesystem */
public class C33171eq {
    public final C33101ei A00;
    public final C33121ek A01;
    public final C19420v0 A02;
    public final AtomicLong A03 = new AtomicLong(0);
    public final AtomicLong A04 = new AtomicLong(0);
    public final AtomicLong A05 = new AtomicLong(0);
    public final AtomicLong A06 = new AtomicLong(0);
    public final AtomicLong A07 = new AtomicLong(0);

    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putLong("total_bytes_to_be_downloaded", this.A05.get());
        bundle.putLong("total_bytes_downloaded", this.A04.get());
        bundle.putLong("total_bytes_to_be_uploaded", this.A06.get());
        return bundle;
    }

    public void A01(C33151eo r10) {
        C33121ek r4 = this.A01;
        r4.registerObserver(r10);
        C19420v0 r5 = this.A02;
        Executor executor = AnonymousClass6Y6.A00;
        boolean z = true;
        if (r5.A0F() != 1) {
            z = false;
        }
        if (!z) {
            C33101ei r2 = this.A00;
            if (!r2.A0Q.get()) {
                if (r2.A0S.get() || AnonymousClass6Y6.A05(r5)) {
                    if (!r2.A0W.get()) {
                        int i = r2.A02;
                        long j = this.A04.get();
                        long j2 = this.A05.get();
                        if (i == 0) {
                            r10.Bah(j, j2);
                        } else {
                            r10.Bad(j, j2);
                        }
                    } else if (!r2.A07) {
                        r10.Bae(this.A04.get(), this.A05.get());
                    } else if (!r2.A09) {
                        boolean equals = "unmounted".equals(Environment.getExternalStorageState());
                        long j3 = this.A04.get();
                        long j4 = this.A05.get();
                        if (equals) {
                            r10.Bag(j3, j4);
                        } else {
                            r10.Baf(j3, j4);
                        }
                    } else {
                        AtomicLong atomicLong = this.A05;
                        if (atomicLong.get() > 0) {
                            r10.Bak(this.A04.get(), atomicLong.get());
                        } else {
                            r10.Baj();
                        }
                    }
                    r4.A03(r5.A0E(), A00());
                    return;
                }
                if (r5.A0F() == 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-service/observer/registered/error/");
                    sb.append(C34191gb.A02(r5.A0E()));
                    Log.i(sb.toString());
                    return;
                }
                r4.A02(r5.A0E(), A00());
            }
        }
        C33101ei r22 = this.A00;
        if (!r22.A0U.get()) {
            int i2 = r22.A01;
            long j5 = this.A07.get();
            long j6 = this.A06.get();
            if (i2 == 0) {
                r10.BRw(j5, j6);
            } else {
                r10.BRs(j5, j6);
            }
        } else if (!r22.A05) {
            r10.BRt(this.A07.get(), this.A06.get());
        } else if (!r22.A09) {
            boolean equals2 = "unmounted".equals(Environment.getExternalStorageState());
            long j7 = this.A07.get();
            long j8 = this.A06.get();
            if (equals2) {
                r10.BRv(j7, j8);
            } else {
                r10.BRu(j7, j8);
            }
        } else {
            AtomicLong atomicLong2 = this.A06;
            if (atomicLong2.get() > 0) {
                r10.BRz(this.A07.get(), atomicLong2.get());
            } else if (r5.A0F() == 1) {
                r10.BRy();
            } else {
                r10.Bfx();
            }
        }
        r4.A02(r5.A0E(), A00());
    }

    public void A02(C33151eo r2) {
        this.A01.unregisterObserver(r2);
    }

    public C33171eq(C33101ei r4, C33121ek r5, C19420v0 r6) {
        this.A02 = r6;
        this.A00 = r4;
        this.A01 = r5;
    }
}
