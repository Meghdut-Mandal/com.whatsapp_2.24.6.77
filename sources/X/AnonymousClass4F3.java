package X;

import com.whatsapp.calling.favorite.FavoritePicker;
import com.whatsapp.calling.favorite.FavoritePickerViewModel;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.4F3  reason: invalid class name */
public final class AnonymousClass4F3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass141 $contact;
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4F3(FavoritePicker favoritePicker, AnonymousClass141 r3) {
        super(0);
        this.this$0 = favoritePicker;
        this.$contact = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        FavoritePickerViewModel favoritePickerViewModel = (FavoritePickerViewModel) this.this$0.A04.getValue();
        AnonymousClass141 r1 = this.$contact;
        AnonymousClass00C.A0D(r1, 0);
        GroupJid groupJid = (GroupJid) r1.A06(GroupJid.class);
        if (groupJid != null) {
            z = !favoritePickerViewModel.A08.A0C(groupJid);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
