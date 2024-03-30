package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.1dR  reason: invalid class name and case insensitive filesystem */
public final class C32371dR implements AnonymousClass191 {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C32331dN A01;
    public final C32341dO A02;
    public final LinkedHashMap A03 = new LinkedHashMap();
    public final Executor A04;

    public C32371dR(C32331dN r3, C32341dO r4, C19770wU r5) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r4, 3);
        this.A04 = new C19930wk(r5, false);
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1.A0V == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.AnonymousClass3T1 r7, int r8) {
        /*
            r6 = this;
            r3 = 1
            r5 = 0
            if (r8 != r3) goto L_0x0005
            r5 = 1
        L_0x0005:
            boolean r4 = r7 instanceof X.AnonymousClass2bU
            if (r4 == 0) goto L_0x001d
            r0 = r7
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.3Qj r1 = r0.A01
            if (r1 == 0) goto L_0x001d
            boolean r0 = r1.A0U
            if (r0 == 0) goto L_0x001d
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x001d
            boolean r0 = r1.A0V
            r2 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            X.3Qa r1 = r7.A1J
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0030
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0030
            if (r4 == 0) goto L_0x0031
            if (r5 == 0) goto L_0x0030
            if (r2 != 0) goto L_0x0031
        L_0x0030:
            return
        L_0x0031:
            boolean r0 = r7 instanceof X.AnonymousClass2bO
            if (r0 == 0) goto L_0x003c
            r0 = r7
            X.2bO r0 = (X.AnonymousClass2bO) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0030
        L_0x003c:
            java.util.concurrent.Executor r1 = r6.A04
            X.1jE r0 = new X.1jE
            r0.<init>(r6, r7, r3)
            r1.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32371dR.A00(X.3T1, int):void");
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public void Bas(AnonymousClass3T1 r2, int i) {
        AnonymousClass00C.A0D(r2, 0);
        A00(r2, i);
    }

    public void Bau(AnonymousClass3T1 r2, int i) {
        AnonymousClass00C.A0D(r2, 0);
        if (r2 instanceof AnonymousClass2bU) {
            A00(r2, i);
        }
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bb6(Collection collection, Map map) {
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public static final void A01(C32371dR r2) {
        C32331dN r0 = r2.A01;
        C23931Ak A022 = r2.A02();
        Iterable<C88144Ro> observers = r0.getObservers();
        AnonymousClass00C.A08(observers);
        for (C88144Ro BbW : observers) {
            BbW.BbW(A022);
        }
    }

    public final C23931Ak A02() {
        Collection values = this.A03.values();
        AnonymousClass00C.A08(values);
        C23931Ak copyOf = C23931Ak.copyOf(values);
        AnonymousClass00C.A08(copyOf);
        return copyOf;
    }

    public final void A03() {
        this.A00.post(new C35731jA((Object) this, 39));
    }
}
