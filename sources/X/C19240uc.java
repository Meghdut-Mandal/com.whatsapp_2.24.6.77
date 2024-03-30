package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0uc  reason: invalid class name and case insensitive filesystem */
public final class C19240uc extends C19110uO {
    public final C19110uO A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public C19240uc(C19110uO r10, C19020uF r11) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C19090uM r3 : r11.A03) {
            boolean z = r3.A00 == 2;
            Class cls = r3.A01;
            if (z) {
                hashSet3.add(cls);
            } else {
                hashSet.add(cls);
            }
        }
        Set set = r11.A05;
        if (!set.isEmpty()) {
            hashSet.add(C19150uS.class);
        }
        this.A01 = Collections.unmodifiableSet(hashSet);
        this.A02 = Collections.unmodifiableSet(hashSet2);
        this.A04 = Collections.unmodifiableSet(hashSet3);
        this.A05 = Collections.unmodifiableSet(hashSet4);
        this.A03 = set;
        this.A00 = r10;
    }
}
