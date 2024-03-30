package X;

import java.util.List;

/* renamed from: X.7VB  reason: invalid class name */
public final class AnonymousClass7VB extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C157597dn $contactList$delegate;
    public final /* synthetic */ C006302t $onContactClick;
    public final /* synthetic */ AnonymousClass00S $onShareLinkClick;
    public final /* synthetic */ boolean $shouldHideShareLink;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VB(C157597dn r2, AnonymousClass00S r3, C006302t r4, boolean z) {
        super(1);
        this.$shouldHideShareLink = z;
        this.$onShareLinkClick = r3;
        this.$contactList$delegate = r2;
        this.$onContactClick = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C157517df r6 = (C157517df) obj;
        AnonymousClass00C.A0D(r6, 0);
        if (!this.$shouldHideShareLink) {
            r6.BNl((Object) null, (Object) null, new C1509977p(673766599, new C156567aB(this.$onShareLinkClick), true));
        }
        r6.BNl((Object) null, (Object) null, C113175f7.A00);
        int size = ((List) this.$contactList$delegate.getValue()).size();
        C1509977p r1 = new C1509977p(-1555395915, new C156717aQ(this.$contactList$delegate, this.$onContactClick), true);
        AnonymousClass7WA r0 = AnonymousClass7WA.A00;
        C130786Mk r3 = ((C136786ez) r6).A00;
        C136806f1 r2 = new C136806f1(r0, r1);
        if (size >= 0) {
            if (size != 0) {
                int i = r3.A00;
                C120625ro r12 = new C120625ro(r2, i, size);
                r3.A00 = i + size;
                r3.A02.A0D(r12);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0d("size should be >=0, but was ", AnonymousClass000.A0u(), size);
    }
}
