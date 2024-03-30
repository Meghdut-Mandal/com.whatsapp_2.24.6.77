package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3hU  reason: invalid class name and case insensitive filesystem */
public class C71883hU implements AnonymousClass191 {
    public final C87824Qh A00;
    public final AnonymousClass147 A01;

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
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

    private boolean A00(AnonymousClass3T1 r3) {
        if (!(r3 instanceof AnonymousClass2bQ) || !r3.A1J.A02) {
            return false;
        }
        return this.A01.equals(((AnonymousClass2bQ) r3).A02);
    }

    public void Bas(AnonymousClass3T1 r5, int i) {
        AnonymousClass147 r3 = this.A01;
        C64933Qa r1 = r5.A1J;
        AnonymousClass11F r2 = r1.A00;
        if ((r3.equals(r2) && !r1.A02 && r5.A1I == 5) || A00(r5) || (r3.equals(r2) && r5.A1I == 92)) {
            this.A00.Bjx();
        }
    }

    public void Bau(AnonymousClass3T1 r4, int i) {
        AnonymousClass147 r2 = this.A01;
        AnonymousClass11F r1 = r4.A1J.A00;
        if ((r2.equals(r1) && C66013Ui.A0J(r4.A1I) && i == 3) || A00(r4) || i == 30 || (r2.equals(r1) && r4.A1I == 92)) {
            this.A00.Bjx();
        }
    }

    public void Bax(AnonymousClass3T1 r3, AnonymousClass3T1 r4) {
        if (C64933Qa.A05(r4, this.A01) && r4.A1I == 92) {
            this.A00.Bjx();
        }
    }

    public void Bb8(AnonymousClass11F r4, Collection collection, boolean z) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (C64933Qa.A05(C36391kE.A0l(it), this.A01)) {
                }
            }
            return;
        } else if (r4 == null || this.A01.equals(r4)) {
            this.A00.Bjx();
        } else {
            return;
        }
        this.A00.Bjx();
    }

    public C71883hU(C87824Qh r1, AnonymousClass147 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bb6(Collection collection, Map map) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (C64933Qa.A05(A0l, this.A01)) {
                int i = A0l.A1I;
                if (C66013Ui.A0J(i) || A0l.A15 || i == 92) {
                    this.A00.Bjx();
                    return;
                }
            }
            if (A00(A0l)) {
                this.A00.Bjx();
            }
        }
    }
}
