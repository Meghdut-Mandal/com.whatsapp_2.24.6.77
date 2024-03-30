package X;

import java.util.Collection;

/* renamed from: X.7pQ  reason: invalid class name and case insensitive filesystem */
public class C162957pQ extends C132446Tt {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C162957pQ(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A02 = str;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00I r5 = (AnonymousClass00I) obj;
        if (r5 == null) {
            ((AnonymousClass67Z) this.A01).A00((String) null, (Collection) null, true);
        } else {
            ((AnonymousClass67Z) this.A01).A00((String) r5.A00, (Collection) r5.A01, false);
        }
    }
}
