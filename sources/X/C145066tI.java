package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6tI  reason: invalid class name and case insensitive filesystem */
public final class C145066tI implements AnonymousClass191 {
    public boolean A00 = true;
    public final C19770wU A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final HashMap A05 = AnonymousClass001.A0J();

    public C145066tI(C19770wU r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        AnonymousClass00C.A0D(r2, 1);
        C36321k7.A12(r3, r4, r5);
        this.A01 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public void Bas(AnonymousClass3T1 r2, int i) {
        AnonymousClass00C.A0D(r2, 0);
        if ((r2.A1J.A00 instanceof C177528dw) && AnonymousClass6R9.A01(r2) && AnonymousClass6R9.A02(C36371kC.A11(r2))) {
            this.A04.get();
        }
    }

    public void Bau(AnonymousClass3T1 r6, int i) {
        AnonymousClass00C.A0D(r6, 0);
        if (i == 24 && r6.A0H > 0 && AnonymousClass6R9.A01(r6)) {
            this.A04.get();
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

    public static final ArrayList A00(AnonymousClass3T1 r4) {
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass3XT r2 = r4.A0c.A01;
        if (r2 != null) {
            if (r2.A03) {
                A0I.add(C108475Tq.FACEBOOK);
            }
            if (r2.A04) {
                A0I.add(C108475Tq.INSTAGRAM);
            }
        }
        return A0I;
    }
}
