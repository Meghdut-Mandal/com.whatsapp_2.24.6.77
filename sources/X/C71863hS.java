package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3hS  reason: invalid class name and case insensitive filesystem */
public class C71863hS implements AnonymousClass191 {
    public boolean A00;
    public final /* synthetic */ C47562f8 A01;

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bas(AnonymousClass3T1 r1, int i) {
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

    public C71863hS(C47562f8 r1) {
        this.A01 = r1;
    }

    public void Bau(AnonymousClass3T1 r4, int i) {
        if (r4 != null) {
            C64933Qa r2 = r4.A1J;
            C47562f8 r1 = this.A01;
            if (r2.equals(r1.A05.A1J) && !r2.A02) {
                AnonymousClass17Y r22 = r1.A0C;
                r22.A02.post(new C81333wq(this, i, 36, r4));
            }
        }
    }

    public void Bb6(Collection collection, Map map) {
        C65013Qj r0;
        C47562f8 r5 = this.A01;
        AnonymousClass3T1 r4 = r5.A05;
        AnonymousClass3BK A0E = r5.A0E();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (AnonymousClass3T1.A0B(A0l, r4)) {
                A0E.A02.setVisibility(8);
                r4.A1P = true;
                if ((A0l instanceof AnonymousClass2bU) && (r0 = ((AnonymousClass2bU) A0l).A01) != null && !r0.A0V) {
                    r5.A0H();
                    return;
                }
                return;
            }
        }
    }
}
