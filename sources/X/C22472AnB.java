package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AnB  reason: case insensitive filesystem */
public final class C22472AnB extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass777 $callbackFuture;
    public final /* synthetic */ C22727Aug this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22472AnB(C22727Aug aug, AnonymousClass777 r3) {
        super(1);
        this.this$0 = aug;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1902597m r12 = (C1902597m) obj;
        AnonymousClass00C.A0D(r12, 0);
        C22727Aug aug = this.this$0;
        AnonymousClass777 r3 = this.$callbackFuture;
        if (r12 instanceof C187048x9) {
            C199819g4 r6 = (C199819g4) ((C187048x9) r12).A00;
            Map map = r6.A03;
            LinkedHashMap A1G = C36431kI.A1G();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                if (A11.getValue() == "403") {
                    C36411kG.A1T(A1G, A11);
                }
            }
            List A0Y = C007103b.A0Y(A1G.keySet());
            LinkedHashMap A1G2 = C36431kI.A1G();
            Iterator A0y2 = AnonymousClass000.A0y(map);
            while (A0y2.hasNext()) {
                Map.Entry A112 = AnonymousClass000.A11(A0y2);
                if (A112.getValue() != "403") {
                    C36411kG.A1T(A1G2, A112);
                }
            }
            C20350xQ r0 = aug.A01;
            if (r0 != null) {
                r0.A0j(A0Y);
                if (!A1G2.isEmpty()) {
                    C19700wN r8 = aug.A00;
                    if (r8 != null) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Failed: ");
                        A0u.append(A1G2.size());
                        A0u.append(", Errors: [");
                        A0u.append(C007103b.A0Q(", ", "", "", A1G2.values(), C22527Ao9.A00));
                        r8.A0E("FetchGroupsForDirtyBitJob some groups failed to be fetched due to errors", AnonymousClass000.A0t(A0u, ']'), false);
                    } else {
                        throw C36331k8.A0d("crashLogs");
                    }
                }
                C201159iy r4 = aug.A02;
                if (r4 != null) {
                    List<AnonymousClass3QD> list = r6.A02;
                    ArrayList A0J = C36321k7.A0J(list);
                    for (AnonymousClass3QD r02 : list) {
                        C201159iy.A00(r4, r02);
                        A0J.add(r02.A01);
                    }
                    Set A0f = C007103b.A0f(A0J);
                    r4.A01.A0l(A0f);
                    C004702c r1 = C004702c.A00;
                    r3.BVO(new AnonymousClass9W8(A0f, r1, r1));
                } else {
                    throw C36331k8.A0d("groupInfoProcessor");
                }
            } else {
                throw C36331k8.A0d("groupChatManager");
            }
        } else if (r12 instanceof C187038x8) {
            C187038x8 r122 = (C187038x8) r12;
            C22470An9 an9 = new C22470An9(aug, r3);
            if (r122 instanceof C187018x6) {
                an9.invoke(((C187018x6) r122).A00);
            }
            C22471AnA anA = new C22471AnA(aug, r3);
            if (r122 instanceof C187028x7) {
                anA.invoke(((C187028x7) r122).A00);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
