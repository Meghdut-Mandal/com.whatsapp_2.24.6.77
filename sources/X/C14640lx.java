package X;

/* renamed from: X.0lx  reason: invalid class name and case insensitive filesystem */
public final class C14640lx extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CharSequence $this_splitToSequence;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14640lx(CharSequence charSequence) {
        super(1);
        this.$this_splitToSequence = charSequence;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C11020fb r4 = (C11020fb) obj;
        AnonymousClass00C.A0D(r4, 0);
        CharSequence charSequence = this.$this_splitToSequence;
        AnonymousClass00C.A0D(charSequence, 0);
        return charSequence.subSequence(r4.A00, r4.A01 + 1).toString();
    }
}
