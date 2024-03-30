package X;

import android.util.LruCache;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.1Kl  reason: invalid class name and case insensitive filesystem */
public final class C26511Kl implements AnonymousClass12L, AnonymousClass12M {
    public final LruCache A00 = new C26541Ko();
    public final C26521Km A01;
    public final C19770wU A02;
    public final Queue A03 = new LinkedList();
    public final AnonymousClass00T A04 = new AnonymousClass00U(new C26531Kn(this));
    public final C220112n A05;
    public volatile boolean A06;
    public volatile boolean A07;

    public C26511Kl(C26521Km r3, C220112n r4, C19770wU r5) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A02 = r5;
        this.A01 = r3;
        this.A05 = r4;
    }

    public synchronized String BHv() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("FcsConfigInMemoryCache: ");
        sb.append(this.A00.size());
        return sb.toString();
    }

    public synchronized void Bjh(AnonymousClass5SK r2, boolean z) {
        this.A00.evictAll();
    }

    public static final void A00(C26511Kl r3, AnonymousClass00S r4) {
        if (r3.A07) {
            r3.A03.add(new C35731jA((Object) r4, 6));
            return;
        }
        r3.A07 = true;
        r3.A03.add(new C35731jA((Object) r4, 5));
        C220112n r1 = r3.A05;
        r1.A01.registerObserver(r3);
        C21400zB r2 = r1.A00;
        synchronized (r2) {
            r2.A00.add(new WeakReference(r3));
        }
        ((C19930wk) r3.A04.getValue()).execute(new C35731jA((Object) r3, 4));
    }
}
