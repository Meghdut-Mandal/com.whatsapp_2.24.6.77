package com.whatsapp.calling.favorite;

import X.AnonymousClass00S;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1", f = "FavoritePickerViewModel.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePickerViewModel$addFavorites$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $contacts;
    public final /* synthetic */ AnonymousClass00S $onFavoritesAdded;
    public int label;
    public final /* synthetic */ FavoritePickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$addFavorites$1(FavoritePickerViewModel favoritePickerViewModel, List list, C023509x r4, AnonymousClass00S r5) {
        super(2, r4);
        this.$contacts = list;
        this.this$0 = favoritePickerViewModel;
        this.$onFavoritesAdded = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new FavoritePickerViewModel$addFavorites$1(this.this$0, this.$contacts, r6, this.$onFavoritesAdded);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.C05600Qi.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00de, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ec, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r4 = r20
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r2) goto L_0x0129
            X.AnonymousClass0AN.A00(r21)
        L_0x000e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0011:
            X.AnonymousClass0AN.A00(r21)
            java.util.List r0 = r4.$contacts
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r0.iterator()
        L_0x001e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002e
            X.11F r0 = X.C36341k9.A0W(r1)
            if (r0 == 0) goto L_0x001e
            r6.add(r0)
            goto L_0x001e
        L_0x002e:
            java.util.ArrayList r5 = X.C36321k7.A0J(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x0036:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0061
            X.11F r8 = X.C36401kF.A0a(r1)
            X.C36361kB.A1I(r8)
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0055
            X.2pE r7 = X.C52312pE.ONE_TO_ONE
        L_0x0049:
            r10 = -1
            r9 = -1
            X.3Jh r6 = new X.3Jh
            r6.<init>(r7, r8, r9, r10)
            r5.add(r6)
            goto L_0x0036
        L_0x0055:
            boolean r0 = X.AnonymousClass143.A0G(r8)
            if (r0 == 0) goto L_0x005e
            X.2pE r7 = X.C52312pE.GROUP
            goto L_0x0049
        L_0x005e:
            X.2pE r7 = X.C52312pE.NONE
            goto L_0x0049
        L_0x0061:
            com.whatsapp.calling.favorite.FavoritePickerViewModel r0 = r4.this$0
            X.1hP r0 = r0.A09
            X.1hQ r8 = r0.A00
            monitor-enter(r8)
            X.12P r0 = r8.A02     // Catch:{ all -> 0x00ed }
            X.1M0 r6 = r0.A05()     // Catch:{ all -> 0x00ed }
            X.71s r7 = r6.B1k()     // Catch:{ all -> 0x00e6 }
            r17 = 0
            X.14e r10 = r6.A02     // Catch:{ all -> 0x00df }
            java.lang.String r9 = "SELECT MAX(sort_order) as max_order FROM favorite"
            java.lang.String r1 = "FavoriteStore/FAVORITE_GET_MAX_ORDER"
            r0 = 0
            android.database.Cursor r11 = r10.A09(r9, r1, r0)     // Catch:{ all -> 0x00df }
            int r0 = r11.getCount()     // Catch:{ all -> 0x00d8 }
            if (r0 <= 0) goto L_0x0094
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "max_order"
            int r17 = X.C36351kA.A03(r11, r0)     // Catch:{ all -> 0x00d8 }
        L_0x0091:
            X.0AJ r9 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x00d8 }
            goto L_0x009a
        L_0x0094:
            java.lang.String r0 = "FavoriteStore/insertFavorite/max order is not available"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d8 }
            goto L_0x0091
        L_0x009a:
            r11.close()     // Catch:{ all -> 0x00df }
            java.util.Iterator r13 = r5.iterator()     // Catch:{ all -> 0x00df }
        L_0x00a1:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x00df }
            X.3Jh r12 = (X.C63243Jh) r12     // Catch:{ all -> 0x00df }
            int r17 = r17 + 1
            long r0 = r12.A01     // Catch:{ all -> 0x00df }
            X.11F r11 = r12.A03     // Catch:{ all -> 0x00df }
            X.2pE r15 = r12.A02     // Catch:{ all -> 0x00df }
            X.3Jh r14 = new X.3Jh     // Catch:{ all -> 0x00df }
            r16 = r11
            r18 = r0
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x00df }
            android.content.ContentValues r12 = X.C34651hQ.A00(r14, r8)     // Catch:{ all -> 0x00df }
            java.lang.String r11 = "favorite"
            r1 = 5
            java.lang.String r0 = "FavoriteStore/FAVORITE_INSERT"
            r10.A08(r11, r0, r12, r1)     // Catch:{ all -> 0x00df }
            goto L_0x00a1
        L_0x00cb:
            r7.A00()     // Catch:{ all -> 0x00df }
            r5.size()     // Catch:{ all -> 0x00df }
            r7.close()     // Catch:{ all -> 0x00e6 }
            r6.close()     // Catch:{ all -> 0x00ed }
            goto L_0x00f3
        L_0x00d8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00df:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x00ed }
            throw r0     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            X.03N r9 = new X.03N     // Catch:{ all -> 0x012e }
            r9.<init>(r0)     // Catch:{ all -> 0x012e }
        L_0x00f3:
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r9)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0113
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x012e }
            java.lang.String r0 = "FavoriteStore/insertFavorite/failed to insert favorite for :"
            X.C36321k7.A1J(r5, r0, r1)     // Catch:{ all -> 0x012e }
            X.0wN r7 = r8.A00     // Catch:{ all -> 0x012e }
            java.lang.String r6 = "FavoriteStore/insertAll"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x012e }
            java.lang.String r0 = "insertAll "
            java.lang.String r0 = X.AnonymousClass000.A0l(r5, r0, r1)     // Catch:{ all -> 0x012e }
            r7.A0E(r6, r0, r2)     // Catch:{ all -> 0x012e }
        L_0x0113:
            monitor-exit(r8)
            com.whatsapp.calling.favorite.FavoritePickerViewModel r0 = r4.this$0
            X.02l r6 = r0.A0C
            X.00S r5 = r4.$onFavoritesAdded
            r1 = 0
            com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1$1 r0 = new com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1$1
            r0.<init>(r1, r5)
            r4.label = r2
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r4, r6, r0)
            if (r0 != r3) goto L_0x000e
            return r3
        L_0x0129:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x012e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$addFavorites$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
