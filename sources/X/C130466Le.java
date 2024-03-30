package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.6Le  reason: invalid class name and case insensitive filesystem */
public final class C130466Le {
    public static final Handler A07 = C36341k9.A0H();
    public final Handler A00;
    public final C159147it A01;
    public final C123105vw A02;
    public final C115135iO A03;
    public final Object A04 = C36441kJ.A11();
    public final List A05;
    public final Executor A06;

    public C130466Le(C159147it r3, C160367kt r4, C115135iO r5, C117975n8 r6) {
        AnonymousClass00C.A0D(r6, 1);
        Handler A0M = C90514aH.A0M(C113045eu.A00);
        C123105vw r0 = new C123105vw(r4, r5, r6);
        this.A01 = r3;
        this.A00 = A0M;
        this.A02 = r0;
        this.A03 = r5;
        this.A06 = new AnonymousClass770(A0M);
        this.A05 = AnonymousClass001.A0I();
    }
}
