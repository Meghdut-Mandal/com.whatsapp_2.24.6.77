package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.4rR  reason: invalid class name and case insensitive filesystem */
public class C98444rR extends C98454rS {
    public final AnonymousClass1JW A00;
    public final C122105uJ A01;
    public final C157957ey A02;

    public /* synthetic */ C98444rR(C157957ey r5) {
        AnonymousClass1JW r1;
        AnonymousClass7ev r3 = (AnonymousClass7ev) r5;
        C122105uJ r0 = new C122105uJ(r3);
        this.A02 = r5;
        this.A01 = r0;
        synchronized (AnonymousClass1JW.class) {
            r1 = AnonymousClass1JW.A01;
            if (r1 == null) {
                r1 = new AnonymousClass1JW();
                AnonymousClass1JW.A01 = r1;
            }
        }
        this.A00 = r1;
        A00(r3.B8h());
        C114895i0 r32 = new C114895i0(this);
        HashMap hashMap = r1.A00;
        List A0n = C90524aI.A0n(0, hashMap);
        A0n = A0n == null ? AnonymousClass001.A0I() : A0n;
        A0n.add(r32);
        hashMap.put(0, A0n);
    }
}
