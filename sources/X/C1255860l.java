package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.60l  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1255860l {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity A00;

    public /* synthetic */ C1255860l(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        this.A00 = businessDirectorySERPMapViewActivity;
    }

    public final void A00(C144426sA r26, C97674q5 r27) {
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.A00;
        C144426sA r3 = r26;
        C97674q5 r10 = r27;
        if (r3.A09) {
            C144416s9 r2 = r3.A0B.A03;
            if (r2 != null) {
                C95404kp.A03(r3, r10, businessDirectorySERPMapViewActivity.A3i(), C36371kC.A0o());
                AnonymousClass6V2 r32 = businessDirectorySERPMapViewActivity.A05;
                if (r32 != null) {
                    r32.A04(businessDirectorySERPMapViewActivity.A00, (AnonymousClass7gC) null, (C160947lq) null, r2.A0F);
                    return;
                }
                throw C36331k8.A0d("businessProfileSyncUtil");
            }
            return;
        }
        C95404kp A3i = businessDirectorySERPMapViewActivity.A3i();
        A3i.A07 = r3;
        C001700s r4 = A3i.A0G;
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(new AnonymousClass5E9(r3));
        r4.A0C(A0I);
        C134976bv BG3 = r3.BG3();
        double d = (double) 111132;
        C134976bv A002 = C131876Ra.A00(C134976bv.A00(BG3.A00 + (500.0d / d), BG3.A01), 500.0d);
        C134976bv BG32 = r3.BG3();
        double d2 = 500.0d * -1.0d;
        C135076c5 r42 = new C135076c5(C131876Ra.A00(C134976bv.A00(BG32.A00 + (d2 / d), BG32.A01), d2), A002);
        C133196Xe r1 = A3i.A08.A0B;
        C132526Ud r5 = r1.A03;
        C130866Ms A08 = r1.A08(r42, 60);
        HashSet A16 = C36441kJ.A16();
        C132526Ud.A00(r5.A00, r5, A08, A16);
        ArrayList A0J = C36321k7.A0J(A16);
        Iterator it = A16.iterator();
        while (it.hasNext()) {
            A0J.add(((AnonymousClass72U) it.next()).A03);
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (Object next : A0J) {
            C144426sA r43 = (C144426sA) next;
            float f = r43.A06;
            float f2 = r3.A06;
            if (f <= f2 || r43.A05 <= f2) {
                A0I2.add(next);
            }
        }
        Set A0f = C007103b.A0f(A0I2);
        ArrayList A0I3 = AnonymousClass001.A0I();
        A0I3.add(C36361kB.A0q(C13640kC.A04(A3i.A0B, A0f)));
        AnonymousClass6DV r12 = A3i.A06;
        if (r12 != null) {
            r12.A00 = true;
        }
        C144406s8 r0 = r3.A0B;
        LatLng A0F = C90524aI.A0F(r0.A06, r0.A07);
        Double valueOf = Double.valueOf(800.0d);
        Double valueOf2 = Double.valueOf(A0F.A00);
        Double valueOf3 = Double.valueOf(A0F.A01);
        Double A0S = C90494aF.A0S();
        AnonymousClass6QG r11 = new AnonymousClass6QG(valueOf, valueOf2, valueOf3, valueOf2, valueOf3, A0S, (String) null, (String) null, "pin_on_map");
        AnonymousClass6DV r122 = new AnonymousClass6DV(r11, new C165407tN(r3, A3i, A0I3, A0f, 1), A0S, A3i.A09, A0I3, 2);
        A3i.A0M.A00(r122);
        A3i.A06 = r122;
        C95404kp.A03(r3, r10, A3i, (Integer) null);
    }
}
