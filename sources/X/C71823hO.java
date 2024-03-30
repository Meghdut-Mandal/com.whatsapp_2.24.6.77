package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3hO  reason: invalid class name and case insensitive filesystem */
public final class C71823hO implements AnonymousClass191 {
    public final C65003Qi A00;

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bas(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Bau(AnonymousClass3T1 r1, int i) {
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

    public void Bb6(Collection collection, Map map) {
        C207219uk r1;
        C207089uX r0;
        AnonymousClass00C.A0D(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if ((A0l instanceof AnonymousClass2bZ) && (r1 = ((AnonymousClass2bZ) A0l).A00) != null && r1.A05() && (r0 = r1.A04) != null) {
                List list = r0.A03;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (AnonymousClass00C.A0J(((C206569tc) it2.next()).A01.A00, "cta_cancel_reminder")) {
                                this.A00.A02(A0l);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
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

    public C71823hO(C65003Qi r1) {
        this.A00 = r1;
    }
}
