package X;

import com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment;

/* renamed from: X.4GJ  reason: invalid class name */
public final class AnonymousClass4GJ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass01I $fragmentActivity;
    public final /* synthetic */ AnonymousClass3GM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4GJ(AnonymousClass01I r2, AnonymousClass3GM r3) {
        super(0);
        this.$fragmentActivity = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryPartialPermissionBottomSheetFragment galleryPartialPermissionBottomSheetFragment = new GalleryPartialPermissionBottomSheetFragment();
        AnonymousClass3GM r2 = this.this$0;
        AnonymousClass01I r1 = this.$fragmentActivity;
        galleryPartialPermissionBottomSheetFragment.A00 = new AnonymousClass4GH(r1, r2);
        galleryPartialPermissionBottomSheetFragment.A01 = new AnonymousClass4GI(r1, r2);
        C65443Sb.A01(galleryPartialPermissionBottomSheetFragment, r1.getSupportFragmentManager());
        return AnonymousClass0AJ.A00;
    }
}
