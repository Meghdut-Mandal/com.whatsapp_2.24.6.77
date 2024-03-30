package X;

/* renamed from: X.4JH  reason: invalid class name */
public final class AnonymousClass4JH extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C38291oB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JH(C38291oB r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass3HB r0 = this.this$0.A01;
        if (r0 == null) {
            throw C36331k8.A0d("mediaCardUpdateHelper");
        }
        r0.A0A.setMediaInfo(str);
        return AnonymousClass0AJ.A00;
    }
}
