package X;

/* renamed from: X.0mD  reason: invalid class name and case insensitive filesystem */
public final class C14800mD extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C005102h[] $elements;
    public final /* synthetic */ C10790fE $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14800mD(C10790fE r2, C005102h[] r3) {
        super(2);
        this.$elements = r3;
        this.$index = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj2, 1);
        C005102h[] r3 = this.$elements;
        C10790fE r2 = this.$index;
        int i = r2.element;
        r2.element = i + 1;
        r3[i] = obj2;
        return AnonymousClass0AJ.A00;
    }
}
