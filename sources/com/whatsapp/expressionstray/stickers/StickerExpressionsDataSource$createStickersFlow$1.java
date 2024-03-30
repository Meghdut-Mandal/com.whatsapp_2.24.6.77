package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass56L;
import X.AnonymousClass56M;
import X.AnonymousClass5Kc;
import X.AnonymousClass5Kw;
import X.AnonymousClass5L0;
import X.AnonymousClass5L1;
import X.C019708j;
import X.C023409w;
import X.C023509x;
import X.C106535Kb;
import X.C106695Kx;
import X.C106705Ky;
import X.C106715Kz;
import X.C110765bC;
import X.C110775bD;
import X.C111625ca;
import X.C111635cb;
import X.C111645cc;
import X.C36441kJ;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsDataSource$createStickersFlow$1", f = "StickerExpressionsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsDataSource$createStickersFlow$1 extends AnonymousClass0A1 implements C019708j {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public /* synthetic */ Object L$4;
    public int label;

    public StickerExpressionsDataSource$createStickersFlow$1(C023509x r2) {
        super(6, r2);
    }

    public /* bridge */ /* synthetic */ Object BKv(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        StickerExpressionsDataSource$createStickersFlow$1 stickerExpressionsDataSource$createStickersFlow$1 = new StickerExpressionsDataSource$createStickersFlow$1((C023509x) obj6);
        stickerExpressionsDataSource$createStickersFlow$1.L$0 = obj;
        stickerExpressionsDataSource$createStickersFlow$1.L$1 = obj2;
        stickerExpressionsDataSource$createStickersFlow$1.L$2 = obj3;
        stickerExpressionsDataSource$createStickersFlow$1.L$3 = obj4;
        stickerExpressionsDataSource$createStickersFlow$1.L$4 = obj5;
        return stickerExpressionsDataSource$createStickersFlow$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C111625ca r1 = (C111625ca) this.L$0;
            C110765bC r4 = (C110765bC) this.L$1;
            C110775bD r5 = (C110775bD) this.L$2;
            C111635cb r3 = (C111635cb) this.L$3;
            C111645cc r2 = (C111645cc) this.L$4;
            if ((r1 instanceof AnonymousClass5Kc) && (r2 instanceof AnonymousClass5L1) && (r3 instanceof C106705Ky)) {
                return AnonymousClass56M.A00;
            }
            List list3 = null;
            if (r3 instanceof AnonymousClass5Kw) {
                list = ((AnonymousClass5Kw) r3).A00;
            } else if (r3 instanceof C106695Kx) {
                list = C023409w.A00;
            } else if (r3 instanceof C106705Ky) {
                list = null;
            } else {
                throw C36441kJ.A18();
            }
            if (r2 instanceof C106715Kz) {
                list3 = ((C106715Kz) r2).A00;
            } else if (r2 instanceof AnonymousClass5L0) {
                list3 = C023409w.A00;
            } else if (!(r2 instanceof AnonymousClass5L1)) {
                throw C36441kJ.A18();
            }
            if (r1 instanceof C106535Kb) {
                list2 = ((C106535Kb) r1).A00;
            } else {
                list2 = C023409w.A00;
            }
            return new AnonymousClass56L(r4, r5, list, list3, list2);
        }
        throw AnonymousClass000.A0e();
    }
}
