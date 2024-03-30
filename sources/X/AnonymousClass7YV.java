package X;

import java.util.Arrays;

/* renamed from: X.7YV  reason: invalid class name */
public final class AnonymousClass7YV extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C009003v $content;
    public final /* synthetic */ C120655rr[] $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YV(C009003v r2, C120655rr[] r3, int i) {
        super(2);
        this.$values = r3;
        this.$content = r2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        C120655rr[] r1 = this.$values;
        AnonymousClass6Fz.A01(A0L, this.$content, (C120655rr[]) Arrays.copyOf(r1, r1.length), AnonymousClass5WD.A00(this.$$changed));
        return AnonymousClass0AJ.A00;
    }
}
