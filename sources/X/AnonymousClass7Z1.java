package X;

import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;

/* renamed from: X.7Z1  reason: invalid class name */
public final class AnonymousClass7Z1 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ C006302t $onContactClick;
    public final /* synthetic */ AnonymousClass00S $onShareLinkClick;
    public final /* synthetic */ AnonymousClass1JI $scrollPerfLoggerManager;
    public final /* synthetic */ boolean $shouldHideShareLink;
    public final /* synthetic */ InviteNonWhatsAppContactPickerViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Z1(C161267mT r2, InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel, AnonymousClass1JI r4, AnonymousClass00S r5, C006302t r6, int i, int i2, boolean z) {
        super(2);
        this.$viewModel = inviteNonWhatsAppContactPickerViewModel;
        this.$onContactClick = r6;
        this.$onShareLinkClick = r5;
        this.$modifier = r2;
        this.$shouldHideShareLink = z;
        this.$scrollPerfLoggerManager = r4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.$viewModel;
        C006302t r6 = this.$onContactClick;
        AnonymousClass00S r5 = this.$onShareLinkClick;
        C110435af.A00(A0L, this.$modifier, inviteNonWhatsAppContactPickerViewModel, this.$scrollPerfLoggerManager, r5, r6, AnonymousClass5WD.A00(this.$$changed), this.$$default, this.$shouldHideShareLink);
        return AnonymousClass0AJ.A00;
    }
}
