package X;

/* renamed from: X.0ls  reason: invalid class name and case insensitive filesystem */
public final class C14590ls extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14590ls(int i) {
        super(1);
        this.$index = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).intValue();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Collection doesn't contain element at index ");
        A0u.append(this.$index);
        throw new IndexOutOfBoundsException(AnonymousClass000.A0t(A0u, '.'));
    }
}
