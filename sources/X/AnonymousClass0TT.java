package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0TT  reason: invalid class name */
public final class AnonymousClass0TT {
    public Integer A00;
    public final C10090dg A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Set A05;
    public final Set A06;

    public AnonymousClass0TT(C10090dg r4, String str, String str2, Map map, Set set) {
        Set unmodifiableSet;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.A05 = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.A04 = map;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r4 == null ? C10090dg.A00 : r4;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator A0z = AnonymousClass000.A0z(map);
        if (A0z.hasNext()) {
            A0z.next();
            throw AnonymousClass001.A0A("zaa");
        } else {
            this.A06 = Collections.unmodifiableSet(hashSet);
        }
    }
}
