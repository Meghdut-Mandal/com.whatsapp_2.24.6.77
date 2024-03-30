package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;

/* renamed from: X.3dK  reason: invalid class name and case insensitive filesystem */
public final class C69313dK implements C89034Uz {
    public boolean A00;
    public final C002000v A01 = new C002000v(5);
    public final C19700wN A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass1KK A04;
    public final C29461Ws A05;
    public final C202279lS A06;
    public final C20810yC A07;
    public final AnonymousClass2ZO A08;
    public final AnonymousClass2V5 A09;
    public final C64463Ob A0A;
    public final C19770wU A0B;

    public void BoO(C88564Te r5, String str) {
        String group;
        C36331k8.A1I(str, r5);
        try {
            Matcher A002 = C64463Ob.A00(this.A0A, str);
            if (A002.matches() && (group = A002.group(1)) != null) {
                AnonymousClass3XW r0 = (AnonymousClass3XW) this.A01.A04(group);
                if (r0 != null) {
                    r5.BXk(r0);
                    return;
                }
                AnonymousClass2V5 r02 = this.A09;
                r02.A01 = group;
                r02.A00 = "STOREFRONT";
                C36421kH.A1G(this.A0B, this, r5, group, 16);
                return;
            }
        } catch (C52892qL e) {
            Log.e((Throwable) e);
        }
        this.A02.A0E("ShopManager/requestShopMetadataByUrl", AnonymousClass000.A0p("Couldn't find shopId: ", str, AnonymousClass000.A0u()), false);
        r5.BXj(C000400e.A0D());
    }

    public C69313dK(C19700wN r3, AnonymousClass17Y r4, AnonymousClass1KK r5, C29461Ws r6, C202279lS r7, C20810yC r8, AnonymousClass2ZO r9, AnonymousClass2V5 r10, C64463Ob r11, C19770wU r12) {
        C36321k7.A18(r8, r4, r3, r11);
        AnonymousClass00C.A0D(r12, 5);
        C36321k7.A10(r9, r7);
        C36391kE.A1U(r6, r5);
        this.A07 = r8;
        this.A03 = r4;
        this.A02 = r3;
        this.A0A = r11;
        this.A0B = r12;
        this.A08 = r9;
        this.A06 = r7;
        this.A09 = r10;
        this.A05 = r6;
        this.A04 = r5;
    }

    public void A00(C88564Te r5, String str, Map map, boolean z) {
        r5.BXj(map);
        if (map != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                C36351kA.A1K(C36351kA.A0u(A0y), A0u);
                A0u.append(10);
            }
            this.A02.A0E("ShopManager/requestShopMetadata", A0u.toString(), z);
        }
        this.A01.A05(str);
    }
}
