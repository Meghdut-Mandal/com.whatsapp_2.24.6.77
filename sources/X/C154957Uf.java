package X;

import java.util.List;

/* renamed from: X.7Uf  reason: invalid class name and case insensitive filesystem */
public final class C154957Uf extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C1271967i $bloksContext;
    public final /* synthetic */ C140456lc $component;
    public final /* synthetic */ C118625oT $resolveContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154957Uf(C118625oT r2, C1271967i r3, C140456lc r4) {
        super(1);
        this.$bloksContext = r3;
        this.$component = r4;
        this.$resolveContext = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C114865hx r9 = (C114865hx) obj;
        AnonymousClass00C.A0D(r9, 0);
        AnonymousClass0AJ r6 = AnonymousClass0AJ.A00;
        AnonymousClass7YL r2 = new AnonymousClass7YL(this.$bloksContext, this.$component);
        C114845hv r0 = new C114845hv();
        List list = r9.A00;
        list.add(new C1257261a(new C140756m7(r0, r9, r2), new Object[]{r6}));
        list.add(new C1257261a(new C140766m8(new C114845hv(), r9, new C156597aE(this.$resolveContext, this.$bloksContext, this.$component)), new Object[]{C36441kJ.A11()}));
        return r6;
    }
}
