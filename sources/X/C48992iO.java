package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2iO  reason: invalid class name and case insensitive filesystem */
public abstract class C48992iO extends C132446Tt {
    public final AnonymousClass171 A00;
    public final C18820ts A01;
    public final WeakReference A02;
    public final Set A03 = C36441kJ.A16();

    public C48992iO(AnonymousClass171 r4, AnonymousClass27v r5, C18820ts r6, List list) {
        super(r5, true);
        this.A02 = AnonymousClass001.A0F(r5);
        this.A00 = r4;
        this.A01 = r6;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A03.add(C36411kG.A0h(C36391kE.A0f(it)));
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        AnonymousClass27v r0 = (AnonymousClass27v) this.A02.get();
        if (r0 != null) {
            r0.A45(list);
        }
    }
}
