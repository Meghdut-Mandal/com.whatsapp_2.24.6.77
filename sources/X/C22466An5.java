package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.An5  reason: case insensitive filesystem */
public final class C22466An5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C206819u1 $productListInfo;
    public final /* synthetic */ C167487y7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22466An5(C167487y7 r2, C206819u1 r3) {
        super(1);
        this.this$0 = r2;
        this.$productListInfo = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        RandomAccess randomAccess;
        C21114A8z a8z = (C21114A8z) obj;
        AnonymousClass00C.A0D(a8z, 0);
        C167487y7 r1 = this.this$0;
        AnonymousClass08S r11 = r1.A02;
        C206819u1 r4 = this.$productListInfo;
        if (a8z.A00 == 0) {
            C193049Jq r12 = r1.A05.A01;
            float f = (float) AnonymousClass000.A0X(r12.A01.A00).heightPixels;
            float f2 = r12.A00;
            if (f < f2) {
                i = 1;
            } else {
                i = (int) Math.ceil((double) (f / f2));
            }
        } else {
            i = 0;
        }
        int A1V = C36371kC.A1V(r4);
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        LinkedHashMap A1G = C36431kI.A1G();
        for (C206579td r0 : r4.A02) {
            String str = r0.A00;
            List<C206509tW> list = r0.A01;
            ArrayList A0I3 = AnonymousClass001.A0I();
            for (C206509tW r02 : list) {
                A0I3.add(r02.A00);
                A1V++;
            }
            A0I.add(str);
            A0I2.add(A0I3);
        }
        List<C207269up> list2 = a8z.A01;
        if (list2 == null) {
            randomAccess = C023409w.A00;
        } else {
            ArrayList A0I4 = AnonymousClass001.A0I();
            for (C207269up r2 : list2) {
                String str2 = r2.A0F;
                if (!A1G.containsKey(str2)) {
                    A1G.put(str2, r2);
                }
            }
            int size = A0I.size();
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList A0I5 = AnonymousClass001.A0I();
                for (Object obj2 : (List) A0I2.get(i2)) {
                    C207269up r13 = (C207269up) A1G.get(obj2);
                    if (r13 != null) {
                        A0I5.add(new A96(r13));
                    }
                }
                if (!A0I5.isEmpty()) {
                    String str3 = (String) A0I.get(i2);
                    if (!(str3 == null || str3.length() == 0)) {
                        A0I4.add(new A95(str3));
                    }
                    A0I4.addAll(A0I5);
                }
            }
            int size2 = A1V - list2.size();
            if (size2 > i) {
                size2 = i;
            }
            for (int i3 = 0; i3 < size2; i3++) {
                A0I4.add(new A94());
            }
            randomAccess = A0I4;
        }
        r11.A0C(randomAccess);
        return AnonymousClass0AJ.A00;
    }
}
