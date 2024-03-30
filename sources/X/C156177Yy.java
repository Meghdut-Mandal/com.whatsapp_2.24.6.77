package X;

import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;

/* renamed from: X.7Yy  reason: invalid class name and case insensitive filesystem */
public final class C156177Yy extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C006302t $onContactClick;
    public final /* synthetic */ AnonymousClass00S $onOpenPermissionClick;
    public final /* synthetic */ AnonymousClass00S $onRenderedCallback;
    public final /* synthetic */ AnonymousClass00S $onShareLinkClick;
    public final /* synthetic */ AnonymousClass1JI $scrollPerfLoggerManager;
    public final /* synthetic */ boolean $shouldHideShareLink;
    public final /* synthetic */ InviteNonWhatsAppContactPickerViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156177Yy(InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel, AnonymousClass1JI r3, AnonymousClass00S r4, AnonymousClass00S r5, AnonymousClass00S r6, C006302t r7, boolean z) {
        super(2);
        this.$viewModel = inviteNonWhatsAppContactPickerViewModel;
        this.$onContactClick = r7;
        this.$onShareLinkClick = r4;
        this.$onOpenPermissionClick = r5;
        this.$scrollPerfLoggerManager = r3;
        this.$onRenderedCallback = r6;
        this.$shouldHideShareLink = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r13 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r13.BHg()) {
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.$viewModel;
            C006302t r10 = this.$onContactClick;
            C110395ab.A00(r13, AnonymousClass5WH.A00(r13, new C156167Yx(inviteNonWhatsAppContactPickerViewModel, this.$scrollPerfLoggerManager, this.$onShareLinkClick, this.$onOpenPermissionClick, this.$onRenderedCallback, r10, this.$shouldHideShareLink), 1344391860), 48, 1, false);
        } else {
            r13.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
