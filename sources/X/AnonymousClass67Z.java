package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.67Z  reason: invalid class name */
public abstract class AnonymousClass67Z {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final ArrayList A03 = AnonymousClass001.A0I();
    public final List A04 = AnonymousClass001.A0I();

    public final void A00(String str, Collection collection, boolean z) {
        C18740tg.A01();
        this.A01 = z;
        if (collection != null) {
            this.A04.addAll(collection);
        }
        this.A00 = str;
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((C158277gf) it.next()).BfP(this);
        }
        this.A02 = false;
    }
}
