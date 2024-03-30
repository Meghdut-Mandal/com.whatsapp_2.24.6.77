package X;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.1Hz  reason: invalid class name and case insensitive filesystem */
public class C25871Hz {
    public HashMap A00;
    public final C20810yC A01;
    public final C19970wo A02;
    public final C21010yW A03;

    public C25871Hz(C19970wo r2, C20810yC r3, C21010yW r4, HashMap hashMap) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A00 = hashMap;
    }

    public static final void A00(C25871Hz r3, int i) {
        if (C20800yB.A01(C21000yV.A02, r3.A01, 2013)) {
            AnonymousClass2NN r2 = new AnonymousClass2NN();
            r2.A00 = Integer.valueOf(i);
            C21010yW r1 = r3.A03;
            r1.Bly(r2);
            r1.Bph(true);
        }
    }

    public final void A01(AnonymousClass11F r4, int i) {
        if (r4 != null) {
            HashMap hashMap = this.A00;
            if (!hashMap.containsKey(r4)) {
                hashMap.put(r4, new HashSet());
            }
            AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(r4);
            if (abstractCollection != null) {
                Integer valueOf = Integer.valueOf(i);
                if (!abstractCollection.contains(valueOf)) {
                    A00(this, i);
                    abstractCollection.add(valueOf);
                }
            }
        }
    }
}
