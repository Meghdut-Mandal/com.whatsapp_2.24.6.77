package X;

import com.whatsapp.search.SearchViewModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.1jt  reason: invalid class name and case insensitive filesystem */
public class C36181jt implements AnonymousClass191 {
    public Object A00;
    public final int A01;

    public C36181jt(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bas(AnonymousClass3T1 r5, int i) {
        if (this.A01 == 0) {
            AnonymousClass11F r3 = r5.A1J.A00;
            AnonymousClass1QH r2 = (AnonymousClass1QH) this.A00;
            Map map = r2.A05.A02;
            if (map.get(r3) == null && map.get((Object) null) == null) {
                if (AnonymousClass3TD.A00(r2.A02, r2.A04, r3) > 0) {
                    r2.A01();
                }
            }
        }
    }

    public /* synthetic */ void Bau(AnonymousClass3T1 r2, int i) {
        if (2 - this.A01 == 0 && (r2 instanceof C46812bi)) {
            ((SearchViewModel) this.A00).A0a.A0D(r2);
        }
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        if (2 - this.A01 != 0) {
            C54122sR.A00(this, collection, i);
            return;
        }
        for (Object next : collection) {
            if (next instanceof C46812bi) {
                ((SearchViewModel) this.A00).A0a.A0D(next);
            }
        }
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r4) {
        if (1 - this.A01 == 0) {
            AnonymousClass1S6 r2 = (AnonymousClass1S6) this.A00;
            boolean z = false;
            if (r2.A0G.A02 == 0) {
                z = true;
            }
            r2.A03(z);
        }
    }

    public /* synthetic */ void Bb6(Collection collection, Map map) {
        if (1 - this.A01 == 0) {
            AnonymousClass1S6 r3 = (AnonymousClass1S6) this.A00;
            AnonymousClass08S r2 = r3.A04;
            C28211Rt r1 = (C28211Rt) r2.A04();
            if (r1 != null) {
                r1.A04.removeAll(collection);
                r1.A02.removeAll(collection);
                r1.A03.removeAll(collection);
                r1.A01.removeAll(collection);
                r2.A0C(r1);
                r3.A06.A0C(r3.A0H);
            }
        }
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r6, Collection collection, boolean z) {
        List list;
        switch (this.A01) {
            case 0:
                return;
            case 1:
                AnonymousClass08S r4 = ((AnonymousClass1S6) this.A00).A04;
                C28211Rt r3 = (C28211Rt) r4.A04();
                if (r3 != null && collection != null) {
                    if (z) {
                        r3.A04.removeAll(collection);
                        list = r3.A03;
                    } else {
                        r3.A03.removeAll(collection);
                        list = r3.A04;
                    }
                    TreeSet treeSet = new TreeSet(C1906299r.A00);
                    treeSet.addAll(list);
                    treeSet.addAll(collection);
                    list.clear();
                    list.addAll(treeSet);
                    r4.A0C(r3);
                    return;
                }
                return;
            default:
                ((SearchViewModel) this.A00).A0e.A0D(collection);
                return;
        }
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }
}
