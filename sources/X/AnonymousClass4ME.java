package X;

import com.whatsapp.picker.search.StickerSearchTabFragment;

/* renamed from: X.4ME  reason: invalid class name */
public final class AnonymousClass4ME extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $stickerCategoryTab;
    public final /* synthetic */ StickerSearchTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4ME(StickerSearchTabFragment stickerSearchTabFragment, int i) {
        super(1);
        this.this$0 = stickerSearchTabFragment;
        this.$stickerCategoryTab = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        StickerSearchTabFragment stickerSearchTabFragment = this.this$0;
        C96064mj r2 = stickerSearchTabFragment.A03;
        if (r2 != null) {
            r2.A0L(StickerSearchTabFragment.A00(stickerSearchTabFragment).A1l(this.$stickerCategoryTab));
            r2.A06();
        }
        return AnonymousClass0AJ.A00;
    }
}
