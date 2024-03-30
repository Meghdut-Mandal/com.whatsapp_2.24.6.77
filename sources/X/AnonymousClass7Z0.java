package X;

import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;

/* renamed from: X.7Z0  reason: invalid class name */
public final class AnonymousClass7Z0 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C006302t $onContactClick;
    public final /* synthetic */ AnonymousClass00S $onOpenPermissionClick;
    public final /* synthetic */ AnonymousClass00S $onRenderedCallback;
    public final /* synthetic */ AnonymousClass00S $onShareLinkClick;
    public final /* synthetic */ AnonymousClass1JI $scrollPerfLoggerManager;
    public final /* synthetic */ boolean $shouldHideShareLink;
    public final /* synthetic */ InviteNonWhatsAppContactPickerViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Z0(InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel, AnonymousClass1JI r3, AnonymousClass00S r4, AnonymousClass00S r5, AnonymousClass00S r6, C006302t r7, int i, boolean z) {
        super(2);
        this.$viewModel = inviteNonWhatsAppContactPickerViewModel;
        this.$onContactClick = r7;
        this.$onShareLinkClick = r4;
        this.$onOpenPermissionClick = r5;
        this.$scrollPerfLoggerManager = r3;
        this.$onRenderedCallback = r6;
        this.$shouldHideShareLink = z;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.$viewModel;
        C006302t r7 = this.$onContactClick;
        AnonymousClass00S r4 = this.$onShareLinkClick;
        AnonymousClass00S r5 = this.$onOpenPermissionClick;
        C110415ad.A00(A0L, inviteNonWhatsAppContactPickerViewModel, this.$scrollPerfLoggerManager, r4, r5, this.$onRenderedCallback, r7, AnonymousClass5WD.A00(this.$$changed), this.$shouldHideShareLink);
        return AnonymousClass0AJ.A00;
    }
}
