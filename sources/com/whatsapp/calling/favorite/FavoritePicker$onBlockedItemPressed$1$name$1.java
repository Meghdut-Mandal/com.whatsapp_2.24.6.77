package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePicker$onBlockedItemPressed$1$name$1", f = "FavoritePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePicker$onBlockedItemPressed$1$name$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $contact;
    public int label;
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePicker$onBlockedItemPressed$1$name$1(FavoritePicker favoritePicker, AnonymousClass141 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = favoritePicker;
        this.$contact = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FavoritePicker$onBlockedItemPressed$1$name$1(this.this$0, this.$contact, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return this.this$0.A0B.A0H(this.$contact);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePicker$onBlockedItemPressed$1$name$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
