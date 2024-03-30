package com.google.android.gms.common.api.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass0MK;
import X.AnonymousClass0SQ;
import X.AnonymousClass0XK;
import X.C06290Ta;
import X.C13250jZ;
import X.C16770q4;
import X.C16780q5;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult extends C06290Ta {
    public static final ThreadLocal A0C = new C13250jZ();
    public C16780q5 A00;
    public boolean A01;
    public boolean A02 = false;
    public Status A03;
    public boolean A04;
    public final Object A05 = new Object();
    public final WeakReference A06;
    public final CountDownLatch A07 = new CountDownLatch(1);
    public final AtomicReference A08 = new AtomicReference();
    public final ArrayList A09 = AnonymousClass001.A0I();
    public final AnonymousClass0MK A0A;
    public volatile boolean A0B;

    public abstract C16780q5 A03(Status status);

    public static final C16780q5 A00(BasePendingResult basePendingResult) {
        C16780q5 r2;
        synchronized (basePendingResult.A05) {
            AnonymousClass006.A08(!basePendingResult.A0B, "Result has already been consumed.");
            AnonymousClass006.A08(basePendingResult.A08(), "Result is not ready.");
            r2 = basePendingResult.A00;
            basePendingResult.A00 = null;
            basePendingResult.A0B = true;
        }
        AnonymousClass0SQ r0 = (AnonymousClass0SQ) basePendingResult.A08.getAndSet((Object) null);
        if (r0 != null) {
            r0.A00.A01.remove(basePendingResult);
        }
        AnonymousClass006.A01(r2);
        return r2;
    }

    private final void A01(C16780q5 r6) {
        this.A00 = r6;
        this.A03 = r6.BHx();
        this.A07.countDown();
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C16770q4) arrayList.get(i)).BU0(this.A03);
        }
        arrayList.clear();
    }

    public final void A02(C16770q4 r3) {
        synchronized (this.A05) {
            if (A08()) {
                r3.BU0(this.A03);
            } else {
                this.A09.add(r3);
            }
        }
    }

    public void A04() {
        synchronized (this.A05) {
            if (!this.A01 && !this.A0B) {
                this.A01 = true;
                A01(A03(Status.A05));
            }
        }
    }

    public final void A05() {
        boolean z = true;
        if (!this.A02 && !AnonymousClass000.A1X(A0C.get())) {
            z = false;
        }
        this.A02 = z;
    }

    public final void A06(C16780q5 r4) {
        synchronized (this.A05) {
            if (!this.A04 && !this.A01) {
                A08();
                AnonymousClass006.A08(!A08(), "Results have already been set");
                AnonymousClass006.A08(!this.A0B, "Result has already been consumed");
                A01(r4);
            }
        }
    }

    @Deprecated
    public final void A07(Status status) {
        synchronized (this.A05) {
            if (!A08()) {
                A06(A03(status));
                this.A04 = true;
            }
        }
    }

    public final boolean A08() {
        return AnonymousClass000.A1Q((this.A07.getCount() > 0 ? 1 : (this.A07.getCount() == 0 ? 0 : -1)));
    }

    public BasePendingResult(AnonymousClass0XK r3) {
        Looper mainLooper;
        if (r3 != null) {
            mainLooper = r3.A03();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A0A = new AnonymousClass0MK(mainLooper);
        this.A06 = AnonymousClass001.A0F(r3);
    }
}
