package X;

/* renamed from: X.7Yz  reason: invalid class name and case insensitive filesystem */
public final class C156187Yz extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $hasPermission;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ AnonymousClass00S $onOpenPermissionClick;
    public final /* synthetic */ AnonymousClass00S $onShareLinkClick;
    public final /* synthetic */ boolean $shouldHideShareLink;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156187Yz(C161267mT r2, AnonymousClass00S r3, AnonymousClass00S r4, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$hasPermission = z;
        this.$onShareLinkClick = r3;
        this.$onOpenPermissionClick = r4;
        this.$modifier = r2;
        this.$shouldHideShareLink = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        boolean z = this.$hasPermission;
        AnonymousClass00S r3 = this.$onShareLinkClick;
        AnonymousClass00S r4 = this.$onOpenPermissionClick;
        C110425ae.A00(A0L, this.$modifier, r3, r4, AnonymousClass5WD.A00(this.$$changed), this.$$default, z, this.$shouldHideShareLink);
        return AnonymousClass0AJ.A00;
    }
}
