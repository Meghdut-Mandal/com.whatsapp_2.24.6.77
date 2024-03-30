package X;

import com.whatsapp.calling.favorite.FavoritePicker;

/* renamed from: X.48p  reason: invalid class name and case insensitive filesystem */
public final class C832348p extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C832348p(FavoritePicker favoritePicker) {
        super(0);
        this.this$0 = favoritePicker;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(this.this$0.onSearchRequested());
    }
}
