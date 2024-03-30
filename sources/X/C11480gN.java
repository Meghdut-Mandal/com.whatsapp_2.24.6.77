package X;

import android.util.Log;

/* renamed from: X.0gN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11480gN implements Runnable {
    public final /* synthetic */ C022209j A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C11480gN(C022209j r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public final void run() {
        String str = this.A01;
        C022209j r2 = this.A00;
        C022009h r0 = C022009h.A01;
        Log.e("FragmentStrictMode", AnonymousClass000.A0p("Policy violation with PENALTY_DEATH in ", str, AnonymousClass000.A0u()), r2);
        throw r2;
    }
}
