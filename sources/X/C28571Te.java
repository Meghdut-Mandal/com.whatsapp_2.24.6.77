package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Te  reason: invalid class name and case insensitive filesystem */
public final class C28571Te extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C28551Tc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28571Te(C28551Tc r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C52582pf[] r3 = {C52582pf.TEXT, C52582pf.PHOTO, C52582pf.VIDEO, C52582pf.URL, C52582pf.GIF};
        AnonymousClass00C.A0D(r3, 0);
        Set A0E = AnonymousClass02R.A0E(r3);
        String A09 = this.this$0.A01.A09(6443);
        AnonymousClass00C.A08(A09);
        List<String> A0L = AnonymousClass099.A0L(A09, new String[]{","}, 0);
        ArrayList<Number> arrayList = new ArrayList<>();
        for (String A0D : A0L) {
            Integer A03 = AnonymousClass097.A03(AnonymousClass099.A0D(A0D).toString());
            if (A03 != null) {
                arrayList.add(A03);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Number intValue : arrayList) {
            int intValue2 = intValue.intValue();
            C52582pf[] values = C52582pf.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C52582pf r1 = values[i];
                if (r1.type == intValue2) {
                    arrayList2.add(r1);
                    break;
                }
                i++;
            }
        }
        return C007103b.A0g(A0E, C007103b.A0f(arrayList2));
    }
}
