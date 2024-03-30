package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.LinkedHashSet;

/* renamed from: X.6SI  reason: invalid class name */
public final class AnonymousClass6SI {
    public BusinessDirectoryContextualSearchViewModel A00;
    public final C119235pU A01;
    public final C130886Mu A02;
    public final C130196Kc A03;
    public final C121365t1 A04;
    public final C122315ue A05;

    public static final void A00(C119215pS r28, C1260462i r29, AnonymousClass6QG r30, AnonymousClass6SI r31, C128536Cq r32, C132406Tm r33, String str, String str2, String str3, String str4, int i, boolean z) {
        AnonymousClass6SI r0 = r31;
        C122315ue r7 = r0.A05;
        C132406Tm r10 = r33;
        String str5 = str;
        AnonymousClass7VP r14 = new AnonymousClass7VP(r0, r32, r10, str5, z);
        LinkedHashSet A17 = C36441kJ.A17();
        C10810fG r4 = new C10810fG();
        C1265664n r02 = new C1265664n();
        String str6 = str2;
        r02.A02 = str6;
        String str7 = str3;
        r02.A03 = str7;
        r4.element = r02.A00();
        int i2 = i;
        AnonymousClass7VQ r20 = new AnonymousClass7VQ(r7, A17, r14, r4, i2);
        if (r33 != null) {
            r10.A06("text_search_local_business_request_start");
        }
        C158177fv r142 = r7.A00;
        C1265464l r2 = r7.A02.A00;
        boolean z2 = !z;
        int i3 = 3;
        if (z) {
            i3 = 2;
        }
        AnonymousClass6QG r11 = r30;
        C1265464l r19 = r2;
        C145876uf r18 = new C145876uf(r11, r7, r10, r20);
        AnonymousClass6QG r17 = r11;
        r142.B4B(r28, r29, r17, r18, r19, (C132406Tm) null, str5, str6, str7, str4, i3, true, z2).A0B();
        if (i == 0 || i2 == 2) {
            AnonymousClass7V8 r8 = new AnonymousClass7V8(r7, A17, r14, r4);
            if (r33 != null) {
                r10.A06("text_search_api_business_request_start");
            }
            r7.A03.B48(new C165367tJ(r10, r8, 0), r2, (C132406Tm) null, str5).A0B();
        }
    }

    public AnonymousClass6SI(C121365t1 r1, C122315ue r2, C119235pU r3, C130886Mu r4, C130196Kc r5) {
        C36321k7.A1B(r3, r2, r4, r5, r1);
        this.A01 = r3;
        this.A05 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r1;
    }
}
