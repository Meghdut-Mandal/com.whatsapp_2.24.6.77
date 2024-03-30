package X;

/* renamed from: X.7Oo  reason: invalid class name and case insensitive filesystem */
public final class C153497Oo extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $finalKey;
    public final /* synthetic */ C137036fU $holder;
    public final /* synthetic */ Object[] $inputs;
    public final /* synthetic */ C160267kj $registry;
    public final /* synthetic */ AnonymousClass7bL $saver;
    public final /* synthetic */ Object $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153497Oo(C137036fU r2, C160267kj r3, AnonymousClass7bL r4, Object obj, String str, Object[] objArr) {
        super(0);
        this.$holder = r2;
        this.$saver = r4;
        this.$registry = r3;
        this.$finalKey = str;
        this.$value = obj;
        this.$inputs = objArr;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        C137036fU r7 = this.$holder;
        AnonymousClass7bL r6 = this.$saver;
        C160267kj r1 = this.$registry;
        String str = this.$finalKey;
        Object obj = this.$value;
        Object[] objArr = this.$inputs;
        boolean z2 = true;
        if (r7.A01 != r1) {
            r7.A01 = r1;
            z = true;
        } else {
            z = false;
        }
        if (!AnonymousClass00C.A0J(r7.A04, str)) {
            r7.A04 = str;
        } else {
            z2 = z;
        }
        r7.A02 = r6;
        r7.A03 = obj;
        r7.A05 = objArr;
        C157607do r0 = r7.A00;
        if (r0 != null && z2) {
            r0.BwK();
            r7.A00 = null;
            C137036fU.A00(r7);
        }
        return AnonymousClass0AJ.A00;
    }
}
