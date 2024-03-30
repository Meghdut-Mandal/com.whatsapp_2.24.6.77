package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$updateFavoritesOrder$1", f = "FavoriteCallListViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListViewModel$updateFavoritesOrder$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $favorites;
    public int label;
    public final /* synthetic */ FavoriteCallListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListViewModel$updateFavoritesOrder$1(FavoriteCallListViewModel favoriteCallListViewModel, List list, C023509x r4) {
        super(2, r4);
        this.this$0 = favoriteCallListViewModel;
        this.$favorites = list;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FavoriteCallListViewModel$updateFavoritesOrder$1(this.this$0, this.$favorites, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0095, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r14.label
            r5 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r5) goto L_0x00cc
            X.AnonymousClass0AN.A00(r15)
        L_0x000c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x000f:
            X.AnonymousClass0AN.A00(r15)
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel r0 = r14.this$0
            X.1hP r2 = r0.A03
            java.util.List r1 = r14.$favorites
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1hQ r6 = r2.A00
            java.util.ArrayList r7 = X.C36321k7.A0J(r1)
            java.util.Iterator r2 = r1.iterator()
            r11 = 0
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            int r0 = r11 + 1
            if (r11 >= 0) goto L_0x003a
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x003a:
            X.3Jh r1 = (X.C63243Jh) r1
            long r12 = r1.A01
            X.11F r10 = r1.A03
            X.2pE r9 = r1.A02
            X.3Jh r8 = new X.3Jh
            r8.<init>(r9, r10, r11, r12)
            r7.add(r8)
            r11 = r0
            goto L_0x0027
        L_0x004c:
            monitor-enter(r6)
            X.12P r0 = r6.A02     // Catch:{ all -> 0x0096 }
            X.1M0 r3 = r0.A05()     // Catch:{ all -> 0x0096 }
            X.71s r9 = r3.B1k()     // Catch:{ all -> 0x008f }
            X.14e r11 = r3.A02     // Catch:{ all -> 0x0088 }
            java.lang.String r10 = "favorite"
            java.lang.String r1 = "FavoriteStore/FAVORITE_DELETE_ALL_SET_ORDER"
            r0 = 0
            r11.A03(r10, r0, r1, r0)     // Catch:{ all -> 0x0088 }
            java.util.Iterator r8 = r7.iterator()     // Catch:{ all -> 0x0088 }
        L_0x0065:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0088 }
            X.3Jh r0 = (X.C63243Jh) r0     // Catch:{ all -> 0x0088 }
            android.content.ContentValues r2 = X.C34651hQ.A00(r0, r6)     // Catch:{ all -> 0x0088 }
            r1 = 5
            java.lang.String r0 = "FavoriteStore/INSERT_FAVORITE_SET_ORDER"
            r11.A08(r10, r0, r2, r1)     // Catch:{ all -> 0x0088 }
            goto L_0x0065
        L_0x007c:
            r9.A00()     // Catch:{ all -> 0x0088 }
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0088 }
            r9.close()     // Catch:{ all -> 0x008f }
            r3.close()     // Catch:{ all -> 0x0096 }
            goto L_0x009c
        L_0x0088:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.03N r1 = new X.03N     // Catch:{ all -> 0x00d1 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d1 }
        L_0x009c:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)     // Catch:{ all -> 0x00d1 }
            if (r1 == 0) goto L_0x00b8
            java.lang.String r0 = "FavoriteStore/failed to re-arrange"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d1 }
            X.0wN r3 = r6.A00     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "FavoriteStore/setOrder"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "setOrder "
            java.lang.String r0 = X.AnonymousClass000.A0l(r7, r0, r1)     // Catch:{ all -> 0x00d1 }
            r3.A0E(r2, r0, r5)     // Catch:{ all -> 0x00d1 }
        L_0x00b8:
            monitor-exit(r6)
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel r3 = r14.this$0
            X.02l r2 = r3.A09
            r1 = 0
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$updateFavoritesOrder$1$1 r0 = new com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$updateFavoritesOrder$1$1
            r0.<init>(r1)
            r14.label = r5
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r14, r2, r0)
            if (r0 != r4) goto L_0x000c
            return r4
        L_0x00cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$updateFavoritesOrder$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteCallListViewModel$updateFavoritesOrder$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
