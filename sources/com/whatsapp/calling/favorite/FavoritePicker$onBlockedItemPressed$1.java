package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C53472rN;
import com.whatsapp.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePicker$onBlockedItemPressed$1", f = "FavoritePicker.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePicker$onBlockedItemPressed$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $contact;
    public int label;
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePicker$onBlockedItemPressed$1(FavoritePicker favoritePicker, AnonymousClass141 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = favoritePicker;
        this.$contact = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FavoritePicker$onBlockedItemPressed$1(this.this$0, this.$contact, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            FavoritePicker favoritePicker = this.this$0;
            C005502l r2 = favoritePicker.A01;
            if (r2 != null) {
                FavoritePicker$onBlockedItemPressed$1$name$1 favoritePicker$onBlockedItemPressed$1$name$1 = new FavoritePicker$onBlockedItemPressed$1$name$1(favoritePicker, this.$contact, (C023509x) null);
                this.label = 1;
                obj = AnonymousClass0A2.A00(this, r2, favoritePicker$onBlockedItemPressed$1$name$1);
                if (obj == r6) {
                    return r6;
                }
            } else {
                throw C36331k8.A0d("ioDispatcher");
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        String A0v = C36391kE.A0v(this.this$0, obj, new Object[1], 0, R.string.f12nameremoved);
        FavoritePicker favoritePicker2 = this.this$0;
        C36421kH.A1A(UnblockDialogFragment.A03(new C53472rN(favoritePicker2, C36381kD.A0e(this.$contact, UserJid.class), favoritePicker2.A06, 0), A0v, R.string.f12nameremoved, false), this.this$0);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePicker$onBlockedItemPressed$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
