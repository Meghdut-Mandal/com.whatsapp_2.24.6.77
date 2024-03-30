package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.7Oh  reason: invalid class name and case insensitive filesystem */
public final class C153427Oh extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass01z $fragmentManager;
    public final /* synthetic */ AnonymousClass3XM $funStickerData;
    public final /* synthetic */ int $stickerOrigin;
    public final /* synthetic */ C130686Ma this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153427Oh(AnonymousClass01z r2, C130686Ma r3, AnonymousClass3XM r4, int i) {
        super(0);
        this.this$0 = r3;
        this.$stickerOrigin = i;
        this.$funStickerData = r4;
        this.$fragmentManager = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i = this.$stickerOrigin;
        AnonymousClass3XM r4 = this.$funStickerData;
        AnonymousClass01z r3 = this.$fragmentManager;
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = new SearchFunStickersBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("stickerOrigin", i);
        if (r4 != null) {
            A07.putParcelable("funStickerData", r4);
        }
        searchFunStickersBottomSheet.A17(A07);
        C65443Sb.A04(searchFunStickersBottomSheet, r3, "search_fun_stickers_bottom_sheet");
        return AnonymousClass0AJ.A00;
    }
}
