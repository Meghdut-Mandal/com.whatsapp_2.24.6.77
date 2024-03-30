package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6tG  reason: invalid class name and case insensitive filesystem */
public final class C145046tG implements AnonymousClass191 {
    public boolean A00 = true;
    public final C19770wU A01;
    public final C28781Ua A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final HashMap A06 = AnonymousClass001.A0J();

    public C145046tG(C19770wU r2, C28781Ua r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6) {
        AnonymousClass00C.A0D(r2, 1);
        C36321k7.A19(r3, r4, r5, r6);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public void Bas(AnonymousClass3T1 r3, int i) {
        AnonymousClass3XT r0;
        AnonymousClass00C.A0D(r3, 0);
        if ((r3.A1J.A00 instanceof C177528dw) && AnonymousClass6Y4.A07(r3) && (r0 = r3.A0c.A01) != null && r0.A03 && this.A02.A00()) {
            C1498272x.A00(this.A01, this, r3, 5);
        }
    }

    public void Bau(AnonymousClass3T1 r6, int i) {
        C19770wU r1;
        int i2;
        AnonymousClass00C.A0D(r6, 0);
        if (i == 24 && r6.A0H > 0 && AnonymousClass6Y4.A07(r6) && this.A02.A00()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("XFamilyCrosspostMessageObserver/checking is auto-share crossposting message ");
            AnonymousClass1UT.A00(C36411kG.A11(A0u, r6.A1N));
            AnonymousClass3XT r0 = r6.A0c.A01;
            if (r0 == null) {
                AnonymousClass1UT.A00("XFamilyCrosspostMessageObserver/handle auto share message in previous app session");
                r1 = this.A01;
                i2 = 7;
            } else if (!r0.A03) {
                return;
            } else {
                if (this.A00 || this.A06.containsKey(r6.A1J.A01)) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("XFamilyCrosspostMessageObserver/handle omitted auto share message. statusFragmentDestroyed: ");
                    AnonymousClass1UT.A00(C36421kH.A0d(A0u2, this.A00));
                    r1 = this.A01;
                    i2 = 6;
                } else {
                    return;
                }
            }
            C1498272x.A00(r1, r6, this, i2);
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
}
