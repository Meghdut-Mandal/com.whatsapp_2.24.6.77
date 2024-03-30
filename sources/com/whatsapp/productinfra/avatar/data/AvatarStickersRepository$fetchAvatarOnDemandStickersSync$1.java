package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C24241Br;
import X.C90524aI;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1", f = "AvatarStickersRepository.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Set $stableIds;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C24241Br this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1(C24241Br r2, Set set, C023509x r4, boolean z) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableIds = set;
        this.$defaultPack = z;
    }

    public final C023509x create(Object obj, C023509x r6) {
        AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1 avatarStickersRepository$fetchAvatarOnDemandStickersSync$1 = new AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1(this.this$0, this.$stableIds, r6, this.$defaultPack);
        avatarStickersRepository$fetchAvatarOnDemandStickersSync$1.L$0 = obj;
        return avatarStickersRepository$fetchAvatarOnDemandStickersSync$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.this$0.A00.A01()) {
                C24241Br r5 = this.this$0;
                Set set = this.$stableIds;
                boolean A1P = AnonymousClass000.A1P(this.$defaultPack ? 1 : 0);
                try {
                    this.label = 1;
                    obj = AnonymousClass0A2.A00(this, r5.A09, new AvatarStickersRepository$fetchOnDemandAvatarStickers$2(r5, set, (C023509x) null, A1P));
                    if (obj == r6) {
                        return r6;
                    }
                } catch (Throwable th) {
                    obj2 = C90524aI.A0t(th);
                }
            } else {
                Log.e("AvatarStickersRepository/fetchAvatarOnDemandStickersSync/user has no avatar");
                C24241Br.A01(this.this$0, "fetch_on_demand_avatar_aborted_no_avatar_user", (String) null);
                return null;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        obj2 = (List) obj;
        C24241Br r2 = this.this$0;
        Throwable A00 = AnonymousClass0AK.A00(obj2);
        if (A00 == null) {
            return obj2;
        }
        Log.e("AvatarStickersRepository/fetchAvatarOnDemandStickersSync/", A00);
        C24241Br.A01(r2, "fetch_on_demand_avatar_stickers_failed", A00.getMessage());
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
