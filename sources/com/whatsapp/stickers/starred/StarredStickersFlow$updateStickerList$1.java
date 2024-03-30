package com.whatsapp.stickers.starred;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass5L0;
import X.AnonymousClass6EB;
import X.C009003v;
import X.C023509x;
import X.C05760Qy;
import X.C106715Kz;
import X.C111675cf;
import X.C130566Lo;
import X.C135066c4;
import X.C18000sQ;
import X.C18740tg;
import X.C24001Ar;
import X.C36441kJ;
import X.C90504aG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$updateStickerList$1", f = "StarredStickersFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$updateStickerList$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18000sQ $this_updateStickerList;
    public final /* synthetic */ int $type;
    public int label;
    public final /* synthetic */ C130566Lo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$updateStickerList$1(C130566Lo r2, C023509x r3, C18000sQ r4, int i) {
        super(2, r3);
        this.this$0 = r2;
        this.$type = i;
        this.$this_updateStickerList = r4;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new StarredStickersFlow$updateStickerList$1(this.this$0, r6, this.$this_updateStickerList, this.$type);
    }

    public final Object invokeSuspend(Object obj) {
        C18000sQ r1;
        Object r0;
        String str;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C24001Ar r02 = this.this$0.A03;
            int i = this.$type;
            C18740tg.A00();
            ArrayList A01 = r02.A05.A01(Integer.MAX_VALUE, i);
            int i2 = this.$type;
            C130566Lo r4 = this.this$0;
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                AnonymousClass6EB r2 = (AnonymousClass6EB) it.next();
                if (i2 == 1 || !((str = r2.A00) == null || str.length() == 0)) {
                    AnonymousClass00C.A0B(r2);
                    C135066c4 A00 = C111675cf.A00(r4.A01, r4.A02, r2);
                    if (A00 != null) {
                        A0I.add(A00);
                    }
                }
            }
            if (A0I.isEmpty()) {
                r1 = this.$this_updateStickerList;
                r0 = AnonymousClass5L0.A00;
            } else if (this.$type == 2) {
                HashSet A16 = C36441kJ.A16();
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (Object next : A0I) {
                    C90504aG.A1H(((C135066c4) next).A06, next, A16, A0I2);
                }
                r1 = this.$this_updateStickerList;
                r0 = new C106715Kz(A0I2);
            } else {
                r1 = this.$this_updateStickerList;
                r0 = new C106715Kz(A0I);
            }
            C05760Qy.A00(r0, r1);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StarredStickersFlow$updateStickerList$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
