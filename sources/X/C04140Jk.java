package X;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0Jk  reason: invalid class name and case insensitive filesystem */
public final class C04140Jk extends C04150Jl {
    public final AnonymousClass0UL A00;

    public C04140Jk(AnonymousClass0UL r2, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource, 4);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A02(AnonymousClass0WT r1, boolean z) {
    }

    public final boolean A05(C10350e6 r3) {
        return AnonymousClass000.A1V(r3.A08.get(this.A00));
    }

    public final C04520Ky[] A06(C10350e6 r3) {
        r3.A08.get(this.A00);
        return null;
    }

    public final void A07(C10350e6 r5) {
        C06230Su r3 = (C06230Su) r5.A08.remove(this.A00);
        if (r3 != null) {
            C06070Se r0 = r3.A01;
            r0.A01.A03.B04(r5.A04, this.A00);
            C06200Sr r1 = r3.A00.A01;
            r1.A02 = null;
            r1.A01 = null;
            return;
        }
        this.A00.trySetResult(false);
    }
}
