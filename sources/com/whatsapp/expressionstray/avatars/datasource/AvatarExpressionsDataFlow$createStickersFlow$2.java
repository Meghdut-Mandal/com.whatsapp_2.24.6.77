package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C05560Qe;
import X.C130616Lt;
import X.C164567s1;
import X.C36321k7;
import X.C36411kG;
import X.C36431kI;
import X.C90484aE;
import X.C90494aF;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$createStickersFlow$2", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$createStickersFlow$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130616Lt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$createStickersFlow$2(C130616Lt r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarExpressionsDataFlow$createStickersFlow$2 avatarExpressionsDataFlow$createStickersFlow$2 = new AvatarExpressionsDataFlow$createStickersFlow$2(this.this$0, r4);
        avatarExpressionsDataFlow$createStickersFlow$2.L$0 = obj;
        return avatarExpressionsDataFlow$createStickersFlow$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            Iterable iterable = (Iterable) this.L$0;
            if (this.this$0.A02.A0E(6970)) {
                Map A00 = C05560Qe.A00(new C164567s1(iterable, 1));
                LinkedHashMap A1G = C36431kI.A1G();
                Iterator A0y = AnonymousClass000.A0y(A00);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    if (C90484aE.A0G(A11) > 1) {
                        C36411kG.A1T(A1G, A11);
                    }
                }
                if (!A1G.isEmpty()) {
                    C130616Lt r6 = this.this$0;
                    Iterator A0y2 = AnonymousClass000.A0y(A1G);
                    while (A0y2.hasNext()) {
                        Map.Entry A112 = AnonymousClass000.A11(A0y2);
                        String A0f = C90494aF.A0f(A112);
                        int A0G = C90484aE.A0G(A112);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Duplicate item ID detected: ");
                        A0u.append(A0f);
                        C90494aF.A1K(A0u, A0G);
                        C36321k7.A1Z(A0u, " x)");
                        r6.A03.A02(2, "duplicate_ui_item_id", AnonymousClass000.A0p("Duplicated ID: ", A0f, AnonymousClass000.A0u()));
                    }
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsDataFlow$createStickersFlow$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
