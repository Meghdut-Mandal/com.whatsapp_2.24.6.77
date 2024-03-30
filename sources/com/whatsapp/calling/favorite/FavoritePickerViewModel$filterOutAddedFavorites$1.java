package com.whatsapp.calling.favorite;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1", f = "FavoritePickerViewModel.kt", i = {1}, l = {127, 132}, m = "invokeSuspend", n = {"selectedJids"}, s = {"L$0"})
public final class FavoritePickerViewModel$filterOutAddedFavorites$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $alreadyAddedFavorites;
    public final /* synthetic */ List $selectedContacts;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ FavoritePickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$filterOutAddedFavorites$1(FavoritePickerViewModel favoritePickerViewModel, List list, List list2, C023509x r5) {
        super(2, r5);
        this.$selectedContacts = list;
        this.this$0 = favoritePickerViewModel;
        this.$alreadyAddedFavorites = list2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new FavoritePickerViewModel$filterOutAddedFavorites$1(this.this$0, this.$selectedContacts, this.$alreadyAddedFavorites, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[LOOP:1: B:14:0x0052->B:16:0x0058, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r8) goto L_0x0043
            if (r0 != r7) goto L_0x0080
            java.lang.Object r6 = r9.L$1
            com.whatsapp.calling.favorite.FavoritePickerViewModel r6 = (com.whatsapp.calling.favorite.FavoritePickerViewModel) r6
            java.lang.Object r4 = r9.L$0
            java.util.Set r4 = (java.util.Set) r4
            X.AnonymousClass0AN.A00(r10)
        L_0x0017:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r1 = r10.iterator()
        L_0x001d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0079
            X.141 r0 = X.C36391kE.A0f(r1)
            X.C36391kE.A1O(r0, r4)
            goto L_0x001d
        L_0x002b:
            X.AnonymousClass0AN.A00(r10)
            r3 = 5000(0x1388, double:2.4703E-320)
            com.whatsapp.calling.favorite.FavoritePickerViewModel r6 = r9.this$0
            java.util.List r2 = r9.$alreadyAddedFavorites
            r1 = 0
            com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1 r0 = new com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1
            r0.<init>(r6, r2, r1)
            r9.label = r8
            java.lang.Object r10 = X.C07340Xg.A00(r9, r0, r3)
            if (r10 != r5) goto L_0x0046
            return r5
        L_0x0043:
            X.AnonymousClass0AN.A00(r10)
        L_0x0046:
            X.6O7 r10 = (X.AnonymousClass6O7) r10
            java.util.List r0 = r9.$selectedContacts
            java.util.ArrayList r2 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005c
            X.C36361kB.A1S(r2, r1)
            goto L_0x0052
        L_0x005c:
            java.util.Set r4 = X.C007103b.A0f(r2)
            com.whatsapp.calling.favorite.FavoritePickerViewModel r6 = r9.this$0
            java.util.List r3 = r10.A00
            X.16D r2 = r6.A06
            r9.L$0 = r4
            r9.L$1 = r6
            r9.label = r7
            r1 = 0
            com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2 r0 = new com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2
            r0.<init>(r2, r3, r1)
            java.lang.Object r10 = X.C009403z.A00(r9, r0)
            if (r10 != r5) goto L_0x0017
            return r5
        L_0x0079:
            java.util.List r10 = (java.util.List) r10
            r6.A02 = r10
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$filterOutAddedFavorites$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
