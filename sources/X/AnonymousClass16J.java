package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.16J  reason: invalid class name */
public class AnonymousClass16J extends C19590wC {
    public long A00;

    public void A00(AnonymousClass11F r7) {
        for (AnonymousClass191 BZj : getObservers()) {
            this.A00++;
            BZj.BZj(r7);
        }
    }

    public void A01(AnonymousClass11F r7) {
        for (AnonymousClass191 Bb5 : getObservers()) {
            this.A00++;
            Bb5.Bb5(r7);
        }
    }

    public void A02(AnonymousClass11F r7, Collection collection, boolean z) {
        for (AnonymousClass191 Bb8 : getObservers()) {
            this.A00++;
            Bb8.Bb8(r7, collection, z);
        }
    }

    public void A03(AnonymousClass3T1 r7, int i) {
        for (AnonymousClass191 BSA : getObservers()) {
            this.A00++;
            BSA.BSA(r7, i);
        }
    }

    public void A04(AnonymousClass3T1 r7, int i) {
        for (AnonymousClass191 Bas : getObservers()) {
            this.A00++;
            Bas.Bas(r7, i);
        }
    }

    public void A05(AnonymousClass3T1 r7, int i) {
        for (AnonymousClass191 Bau : getObservers()) {
            this.A00++;
            Bau.Bau(r7, i);
        }
    }

    public void A06(AnonymousClass3T1 r7, AnonymousClass3T1 r8) {
        for (AnonymousClass191 Bax : getObservers()) {
            this.A00++;
            Bax.Bax(r7, r8);
        }
    }

    public void A07(Collection collection, int i) {
        collection.size();
        for (AnonymousClass191 Bb4 : getObservers()) {
            this.A00++;
            Bb4.Bb4(collection, i);
        }
    }

    public void A08(Collection collection, Map map) {
        for (AnonymousClass191 Bb6 : getObservers()) {
            this.A00++;
            Bb6.Bb6(collection, map);
        }
    }

    public AnonymousClass16J(AnonymousClass005 r1) {
        super(r1);
    }

    public AnonymousClass16J() {
        super(new C18910u1(Collections.emptySet(), (AnonymousClass004) null));
    }
}
