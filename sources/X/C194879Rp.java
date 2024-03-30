package X;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.9Rp  reason: invalid class name and case insensitive filesystem */
public class C194879Rp {
    public final C23091B4b A00;
    public final C198579do A01;
    public final Collection A02;
    public final Set A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C194879Rp r5 = (C194879Rp) obj;
            if (!(this.A00.getClass() == r5.A00.getClass() && this.A01.getClass() == r5.A01.getClass() && Objects.equals(this.A03, r5.A03))) {
                return false;
            }
        }
        return true;
    }

    public C194879Rp(C23091B4b b4b, C198579do r3, Collection collection, EnumSet enumSet) {
        C201749kK.A03(r3, "mappingProvider can not be null");
        C201749kK.A03(enumSet, "setOptions can not be null");
        C201749kK.A03(collection, "evaluationListeners can not be null");
        this.A00 = b4b;
        this.A01 = r3;
        this.A03 = Collections.unmodifiableSet(enumSet);
        this.A02 = Collections.unmodifiableCollection(collection);
    }
}
