package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.AnonymousClass144;
import X.AnonymousClass171;
import X.C009003v;
import X.C023509x;
import X.C62463Gg;
import android.text.TextUtils;
import com.whatsapp.TextEmojiLabel;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePicker$updateGroupSubtitleWithMembers$1", f = "FavoritePicker.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePicker$updateGroupSubtitleWithMembers$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $contact;
    public final /* synthetic */ C62463Gg $viewHolder;
    public int label;
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePicker$updateGroupSubtitleWithMembers$1(FavoritePicker favoritePicker, C62463Gg r3, AnonymousClass141 r4, C023509x r5) {
        super(2, r5);
        this.this$0 = favoritePicker;
        this.$contact = r4;
        this.$viewHolder = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new FavoritePicker$updateGroupSubtitleWithMembers$1(this.this$0, this.$viewHolder, this.$contact, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            FavoritePickerViewModel favoritePickerViewModel = (FavoritePickerViewModel) this.this$0.A04.getValue();
            AnonymousClass141 r1 = this.$contact;
            AnonymousClass171 r3 = this.this$0.A0B;
            AnonymousClass00C.A08(r3);
            this.label = 1;
            AnonymousClass144 r2 = (AnonymousClass144) r1.A06(AnonymousClass144.class);
            obj = null;
            if (r2 != null) {
                String str = (String) r3.A08.get(r2);
                if (str == null) {
                    obj = AnonymousClass0A2.A00(this, favoritePickerViewModel.A0B, new FavoritePickerViewModel$getGroupSubTitle$2$1(r3, r2, (C023509x) null));
                    if (obj == r5) {
                        return r5;
                    }
                } else {
                    obj = str;
                }
                if (obj == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        String str2 = (String) obj;
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextEmojiLabel textEmojiLabel = this.$viewHolder.A02;
        if (!isEmpty) {
            textEmojiLabel.setVisibility(0);
            this.$viewHolder.A02.A0J(str2, (List) null, 0, false);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePicker$updateGroupSubtitleWithMembers$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
