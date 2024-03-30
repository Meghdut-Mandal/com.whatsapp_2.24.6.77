package X;

import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6YS  reason: invalid class name */
public class AnonymousClass6YS implements C157987fc {
    public Object A00;
    public final int A01;

    public AnonymousClass6YS(VariantsCarouselFragment variantsCarouselFragment, int i) {
        this.A01 = i;
        this.A00 = variantsCarouselFragment;
    }

    public final void BKz(C134606bJ r21, C134746bX r22, int i) {
        int i2;
        String str;
        AnonymousClass011 r1;
        C128526Cp r8;
        C134606bJ r0;
        int i3 = this.A01;
        C134746bX r82 = r22;
        AnonymousClass00C.A0D(r82, 2);
        VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = ((VariantsCarouselFragment) this.A00).A03;
        if (i3 != 0) {
            if (variantsCarouselFragmentViewModel == null) {
                throw C36331k8.A0a();
            }
            i2 = 1;
        } else if (variantsCarouselFragmentViewModel == null) {
            throw C36331k8.A0a();
        } else {
            i2 = 0;
        }
        int i4 = i;
        C134606bJ A012 = C129376Gr.A01(r82, i4);
        Map map = r82.A02;
        C134656bO A002 = C129376Gr.A00(A012, r21, map);
        if (A002 != null) {
            str = A002.A00;
        } else {
            str = null;
        }
        if (str == null) {
            r1 = (AnonymousClass011) r82.A03.get(A012);
            if (r1 != null) {
                r0 = (C134606bJ) r1.first;
            } else {
                r0 = null;
            }
            C134656bO A003 = C129376Gr.A00(A012, r0, map);
            if (A003 != null) {
                str = A003.A00;
                if (A003.A02 || !variantsCarouselFragmentViewModel.A07.A0E(4982)) {
                    C36341k9.A17(variantsCarouselFragmentViewModel.A08, 2);
                }
            } else {
                C36341k9.A17(variantsCarouselFragmentViewModel.A08, 1);
                return;
            }
        } else {
            r1 = null;
        }
        C1274068e r6 = (C1274068e) variantsCarouselFragmentViewModel.A04.A04();
        if (r6 != null) {
            List list = r6.A00;
            C128526Cp r02 = (C128526Cp) C007103b.A0P(list, i2 ^ 1);
            Object obj = null;
            if (r02 != null) {
                r8 = new C128526Cp(A012, r02.A02, r02.A03, i4, r02.A04);
            } else {
                r8 = null;
            }
            Object A0P = C007103b.A0P(list, i2);
            if (r1 == null) {
                obj = A0P;
            } else {
                C128526Cp r03 = (C128526Cp) A0P;
                if (r03 != null) {
                    obj = new C128526Cp((C134606bJ) r1.first, r03.A02, r03.A03, C90474aD.A08(r1), r03.A04);
                }
            }
            ArrayList A0I = AnonymousClass001.A0I();
            if (r8 != null) {
                A0I.add(r8);
            }
            if (obj != null) {
                A0I.add(obj);
            }
            if (i2 == 0) {
                Collections.reverse(A0I);
            }
            variantsCarouselFragmentViewModel.A05.A0C(new C1274068e(A0I));
        }
        C006302t r04 = variantsCarouselFragmentViewModel.A01;
        if (r04 != null) {
            r04.invoke(str);
        }
        if (r1 == null) {
            variantsCarouselFragmentViewModel.A08.A0C((Object) null);
        }
    }
}
