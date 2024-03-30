package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog;

/* renamed from: X.4Hn  reason: invalid class name and case insensitive filesystem */
public final class C85554Hn extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ LayoutInflater $inflater;
    public final /* synthetic */ StatusArchiveSettingsBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85554Hn(LayoutInflater layoutInflater, ViewGroup viewGroup, StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog) {
        super(0);
        this.this$0 = statusArchiveSettingsBottomSheetDialog;
        this.$inflater = layoutInflater;
        this.$container = viewGroup;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog = this.this$0;
        C58332zh r2 = statusArchiveSettingsBottomSheetDialog.A00;
        if (r2 != null) {
            statusArchiveSettingsBottomSheetDialog.A02 = new C61183Aw(this.$inflater, this.$container, C36341k9.A0T(r2.A00.A02), new C53082qk(statusArchiveSettingsBottomSheetDialog.A03.getValue(), 14), new C53082qk(this.this$0, 15));
            C61183Aw r0 = this.this$0.A02;
            if (r0 != null) {
                return r0.A00;
            }
            throw AnonymousClass001.A09("StatusArchiveSettingsViewComponent may be accessed only from onCreateView - onDestroyView");
        }
        throw C36331k8.A0d("statusArchiveSettingsViewComponentFactory");
    }
}
