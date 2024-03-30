package X;

import com.whatsapp.status.viewmodels.StatusesViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3hQ  reason: invalid class name and case insensitive filesystem */
public final class C71843hQ implements AnonymousClass191 {
    public final /* synthetic */ StatusesViewModel A00;

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public void Bb5(AnonymousClass11F r2) {
        AnonymousClass00C.A0D(r2, 0);
        if (r2 instanceof C177528dw) {
            StatusesViewModel.A03(r2, this.A00);
        }
    }

    public void Bb6(Collection collection, Map map) {
        AnonymousClass00C.A0D(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (A0l.A1J.A00 instanceof C177528dw) {
                StatusesViewModel.A03(A0l.A0J(), this.A00);
                return;
            }
        }
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

    public C71843hQ(StatusesViewModel statusesViewModel) {
        this.A00 = statusesViewModel;
    }

    public void BZj(AnonymousClass11F r2) {
        if (r2 instanceof C177528dw) {
            StatusesViewModel.A03(r2, this.A00);
        }
    }

    public void Bas(AnonymousClass3T1 r3, int i) {
        if (C64933Qa.A00(r3) instanceof C177528dw) {
            StatusesViewModel.A03(r3.A0J(), this.A00);
        }
    }

    public void Bau(AnonymousClass3T1 r3, int i) {
        if ((C64933Qa.A00(r3) instanceof C177528dw) && i == 12) {
            StatusesViewModel.A03(r3.A0J(), this.A00);
        }
    }

    public void Bay(AnonymousClass3T1 r3) {
        if (C64933Qa.A00(r3) instanceof C177528dw) {
            StatusesViewModel.A03(r3.A0J(), this.A00);
        }
    }
}
