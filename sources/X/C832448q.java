package X;

import com.whatsapp.calling.favorite.FavoritePicker;

/* renamed from: X.48q  reason: invalid class name and case insensitive filesystem */
public final class C832448q extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C832448q(FavoritePicker favoritePicker) {
        super(0);
        this.this$0 = favoritePicker;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C34701hV r0 = this.this$0.A00;
        if (r0 != null) {
            r0.A00();
            this.this$0.A3p();
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("favoriteObservers");
    }
}
