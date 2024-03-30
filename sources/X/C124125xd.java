package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.5xd  reason: invalid class name and case insensitive filesystem */
public abstract class C124125xd {
    public AnonymousClass5YN A00;
    public AnonymousClass6IB A01;
    public AnonymousClass7fJ A02;
    public final C157187by A03;
    public final AnonymousClass5Z5 A04;
    public final C142236oY A05 = new C142236oY();
    public final List A06;

    public C124125xd(C157187by r2, AnonymousClass5YN r3, AnonymousClass6IB r4, AnonymousClass5Z5 r5, AnonymousClass7fJ r6, List list) {
        if (r6 instanceof C142276oc) {
            this.A02 = r6;
        } else {
            this.A02 = new C142276oc(r6);
        }
        this.A00 = r3;
        if (list == null) {
            this.A06 = Collections.emptyList();
        } else {
            this.A06 = list;
        }
        this.A03 = r2;
        this.A01 = r4;
        this.A04 = r5;
    }
}
