package X;

/* renamed from: X.7OT  reason: invalid class name */
public final class AnonymousClass7OT extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass01U $androidxRegistry;
    public final /* synthetic */ String $key;
    public final /* synthetic */ boolean $registered;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OT(AnonymousClass01U r2, String str, boolean z) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = r2;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.$registered) {
            AnonymousClass01U r2 = this.$androidxRegistry;
            String str = this.$key;
            AnonymousClass00C.A0D(str, 0);
            r2.A05.A01(str);
        }
        return AnonymousClass0AJ.A00;
    }
}
