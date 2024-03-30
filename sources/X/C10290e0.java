package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0e0  reason: invalid class name and case insensitive filesystem */
public final class C10290e0 implements C17340r8 {
    public final C10340e5 A00;

    public C10290e0(C10340e5 r1) {
        this.A00 = r1;
    }

    public final void Bxy(Bundle bundle) {
    }

    public final void Bxz(AnonymousClass0L0 r1, C06190Sq r2, boolean z) {
    }

    public final void By0(int i) {
    }

    public final boolean By1() {
        return true;
    }

    public final AnonymousClass0JS Bxk(AnonymousClass0JS r2) {
        this.A00.A07.A0D.add(r2);
        return r2;
    }

    public final AnonymousClass0JS Bxn(AnonymousClass0JS r2) {
        throw AnonymousClass001.A09("GoogleApiClient is not connected yet.");
    }

    public final void Bxs() {
        C10340e5 r2 = this.A00;
        Iterator A0z = AnonymousClass000.A0z(r2.A03);
        while (A0z.hasNext()) {
            ((C17590rf) A0z.next()).B5X();
        }
        r2.A07.A01 = Collections.emptySet();
    }

    public final void Bxv() {
        C10340e5 r4 = this.A00;
        Lock lock = r4.A0D;
        lock.lock();
        try {
            AnonymousClass0TT r5 = r4.A09;
            Map map = r4.A0B;
            r4.A0E = new C10300e1(r4.A04, r4.A05, r4.A06, r4, r5, map, lock);
            r4.A0E.Bxs();
            r4.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
