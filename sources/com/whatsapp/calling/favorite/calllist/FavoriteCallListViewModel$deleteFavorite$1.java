package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C63243Jh;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1", f = "FavoriteCallListViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListViewModel$deleteFavorite$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C63243Jh $favorite;
    public int label;
    public final /* synthetic */ FavoriteCallListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListViewModel$deleteFavorite$1(FavoriteCallListViewModel favoriteCallListViewModel, C63243Jh r3, C023509x r4) {
        super(2, r4);
        this.this$0 = favoriteCallListViewModel;
        this.$favorite = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FavoriteCallListViewModel$deleteFavorite$1(this.this$0, this.$favorite, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r5 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r5) goto L_0x006f
            X.AnonymousClass0AN.A00(r11)
        L_0x000c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x000f:
            X.AnonymousClass0AN.A00(r11)
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel r0 = r10.this$0
            X.1hP r1 = r0.A03
            X.3Jh r0 = r10.$favorite
            r6 = 0
            X.AnonymousClass00C.A0D(r0, r6)
            X.1hQ r2 = r1.A00
            X.11F r3 = r0.A03
            monitor-enter(r2)
            X.12P r0 = r2.A02     // Catch:{ all -> 0x0048 }
            X.1M0 r9 = r0.A05()     // Catch:{ all -> 0x0048 }
            X.12j r0 = r2.A01     // Catch:{ all -> 0x0041 }
            long r0 = r0.A07(r3)     // Catch:{ all -> 0x0041 }
            java.lang.String r8 = "jid_row_id = ?"
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ all -> 0x0041 }
            X.C36351kA.A1V(r7, r6, r0)     // Catch:{ all -> 0x0041 }
            X.14e r6 = r9.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "favorite"
            java.lang.String r0 = "FavoriteStore/DELETE_FAVORITE_ROW_ID"
            r6.A03(r1, r8, r0, r7)     // Catch:{ all -> 0x0041 }
            r9.close()     // Catch:{ all -> 0x0048 }
            goto L_0x005b
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            X.03N r0 = new X.03N     // Catch:{ all -> 0x0074 }
            r0.<init>(r1)     // Catch:{ all -> 0x0074 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x005b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "FavoriteStore/deleteFavorite failed to delete favorite: "
            X.C36321k7.A1J(r3, r0, r1)     // Catch:{ all -> 0x0074 }
        L_0x005b:
            monitor-exit(r2)
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel r3 = r10.this$0
            X.02l r2 = r3.A09
            r1 = 0
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1$1 r0 = new com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1$1
            r0.<init>(r1)
            r10.label = r5
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r10, r2, r0)
            if (r0 != r4) goto L_0x000c
            return r4
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0074:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteCallListViewModel$deleteFavorite$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
