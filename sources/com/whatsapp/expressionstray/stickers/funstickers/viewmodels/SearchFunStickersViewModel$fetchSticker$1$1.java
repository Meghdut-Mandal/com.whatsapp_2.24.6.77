package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass56V;
import X.AnonymousClass56Z;
import X.AnonymousClass5La;
import X.C005502l;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C07710Yz;
import X.C110745bA;
import X.C134936bq;
import X.C135066c4;
import X.C36321k7;
import X.C36441kJ;
import X.C90484aE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$fetchSticker$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C134936bq $model;
    public final /* synthetic */ String $url;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1$1", f = "SearchFunStickersViewModel.kt", i = {1, 2}, l = {292, 299, 301}, m = "invokeSuspend", n = {"sticker", "sticker"}, s = {"L$0", "L$0"})
    /* renamed from: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(str2, r5);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
            if (r1 < r3) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
            if (r0 != r5) goto L_0x0056;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r0 = r9.label
                r4 = 3
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x001e
                if (r0 == r2) goto L_0x001a
                if (r0 == r3) goto L_0x0014
                if (r0 == r4) goto L_0x0014
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            L_0x0014:
                java.lang.Object r5 = r9.L$0
                X.AnonymousClass0AN.A00(r10)
                goto L_0x005f
            L_0x001a:
                X.AnonymousClass0AN.A00(r10)     // Catch:{ CancellationException -> 0x002e }
                goto L_0x0035
            L_0x001e:
                X.AnonymousClass0AN.A00(r10)
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this     // Catch:{ CancellationException -> 0x002e }
                java.lang.String r0 = r2     // Catch:{ CancellationException -> 0x002e }
                r9.label = r2     // Catch:{ CancellationException -> 0x002e }
                java.lang.Object r10 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A04(r1, r0, r9)     // Catch:{ CancellationException -> 0x002e }
                if (r10 != r5) goto L_0x0035
                return r5
            L_0x002e:
                r1 = move-exception
                java.lang.String r0 = "SearchFunStickersViewModel/getSticker/e"
                com.whatsapp.util.Log.e(r0, r1)
                r10 = 0
            L_0x0035:
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                r9.L$0 = r10
                if (r10 == 0) goto L_0x0084
                r9.label = r3
                X.6NT r8 = r0.A0M
                java.lang.Long r0 = r8.A04
                if (r0 == 0) goto L_0x0056
                long r3 = r8.A01
                long r1 = r8.A00
                r6 = 1
                long r1 = r1 + r6
                r8.A00 = r1
                r6 = 2
                int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x0075
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 >= 0) goto L_0x0075
            L_0x0056:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
            L_0x0058:
                if (r0 == r5) goto L_0x005c
                X.0AJ r0 = X.AnonymousClass0AJ.A00
            L_0x005c:
                if (r0 == r5) goto L_0x0074
                r5 = r10
            L_0x005f:
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.6NT r0 = r0.A0M
                X.0yC r1 = r0.A0A
                r0 = 7186(0x1c12, float:1.007E-41)
                boolean r0 = r1.A0E(r0)
                if (r0 != 0) goto L_0x0074
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.6NT r0 = r0.A0M
                X.AnonymousClass6NT.A01(r0)
            L_0x0074:
                return r5
            L_0x0075:
                X.02l r2 = r8.A0C
                r1 = 0
                com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2 r0 = new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2
                r0.<init>(r8, r1)
                java.lang.Object r0 = X.AnonymousClass0A2.A00(r9, r2, r0)
                if (r0 != r5) goto L_0x0056
                goto L_0x0058
            L_0x0084:
                r9.label = r4
                X.6NT r2 = r0.A0M
                r1 = 0
                r0 = 10
                java.lang.Object r0 = r2.A02(r1, r9, r0)
                goto L_0x0058
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$fetchSticker$1$1(SearchFunStickersViewModel searchFunStickersViewModel, C134936bq r3, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = searchFunStickersViewModel;
        this.$url = str;
        this.$model = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new SearchFunStickersViewModel$fetchSticker$1$1(this.this$0, this.$model, this.$url, r6);
    }

    public final Object invokeSuspend(Object obj) {
        List<Object> list;
        Object obj2;
        String str;
        Set set;
        Object obj3 = obj;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            C005502l r3 = searchFunStickersViewModel.A0Q;
            final String str2 = this.$url;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            obj3 = AnonymousClass0A2.A00(this, r3, r0);
            if (obj3 == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C134936bq r02 = this.$model;
        SearchFunStickersViewModel searchFunStickersViewModel2 = this.this$0;
        C135066c4 r8 = (C135066c4) obj3;
        String str3 = r02.A05;
        if (!(r8 == null || str3 == null)) {
            C110745bA r2 = (C110745bA) searchFunStickersViewModel2.A0A.A04();
            if (r2 instanceof AnonymousClass56Z) {
                if (C90484aE.A1T(searchFunStickersViewModel2)) {
                    list = C007103b.A0Y(searchFunStickersViewModel2.A05);
                } else {
                    list = ((AnonymousClass56Z) r2).A01;
                }
                ArrayList A0J = C36321k7.A0J(list);
                for (Object obj4 : list) {
                    if (obj4 instanceof AnonymousClass56V) {
                        AnonymousClass56V r22 = (AnonymousClass56V) obj4;
                        C134936bq r7 = r22.A01;
                        if (str3.equals(r7.A05)) {
                            obj4 = new AnonymousClass56V(r7, r8, r22.A03, r22.A00, r22.A04);
                        }
                    }
                    A0J.add(obj4);
                }
                ArrayList A0I = AnonymousClass001.A0I();
                for (Object next : A0J) {
                    if (next instanceof AnonymousClass56V) {
                        A0I.add(next);
                    }
                }
                Iterator it = A0I.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (AnonymousClass00C.A0J(((AnonymousClass56V) obj2).A01.A05, str3)) {
                        break;
                    }
                }
                AnonymousClass56V r23 = (AnonymousClass56V) obj2;
                if (!(r23 == null || (str = searchFunStickersViewModel2.A03) == null)) {
                    AnonymousClass5La r1 = searchFunStickersViewModel2.A0H;
                    String str4 = r23.A01.A06;
                    if (str4 != null) {
                        r1.A01.put(str4, r23);
                        Map map = r1.A00;
                        Object obj5 = map.get(str);
                        if (!C07710Yz.A05(obj5) || (set = (Set) obj5) == null) {
                            set = C36441kJ.A17();
                        }
                        set.add(str4);
                        map.put(str, set);
                    }
                }
                SearchFunStickersViewModel.A0B(searchFunStickersViewModel2, A0J);
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$fetchSticker$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
