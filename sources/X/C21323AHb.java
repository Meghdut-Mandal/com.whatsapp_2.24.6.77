package X;

import android.util.Base64;
import java.util.Map;

/* renamed from: X.AHb  reason: case insensitive filesystem */
public final class C21323AHb implements C159667jj {
    public Class B7I() {
        return AnonymousClass91K.class;
    }

    public /* bridge */ /* synthetic */ Object Bod(Enum enumR, Object obj, Map map) {
        C207199ui r0;
        C207009uP r02;
        C207199ui r03;
        C207199ui r04;
        C207199ui r05;
        C207199ui r06;
        C207199ui r07;
        byte[] bArr;
        C207199ui r08;
        AnonymousClass2bZ r7 = (AnonymousClass2bZ) obj;
        AnonymousClass91K r6 = (AnonymousClass91K) enumR;
        C36331k8.A1I(r7, r6);
        switch (r6.ordinal()) {
            case 0:
                C207219uk r09 = r7.A00;
                if (r09 == null || (r04 = r09.A01) == null) {
                    return null;
                }
                return r04.A0F;
            case 1:
                C207219uk r010 = r7.A00;
                if (r010 == null || (r08 = r010.A01) == null) {
                    return null;
                }
                return r08.A05();
            case 2:
                C207219uk r011 = r7.A00;
                if (r011 == null || (r07 = r011.A01) == null || (bArr = r07.A0N) == null) {
                    return null;
                }
                return Base64.encodeToString(bArr, 0);
            case 3:
                C207219uk r012 = r7.A00;
                if (r012 == null || (r06 = r012.A01) == null) {
                    return null;
                }
                return r06.A0G;
            case 4:
                C207219uk r013 = r7.A00;
                if (r013 == null || (r05 = r013.A01) == null) {
                    return null;
                }
                C206979uM r4 = r05.A0B;
                AnonymousClass16U r3 = r05.A08;
                if (r4 == null || r3 == null) {
                    return null;
                }
                C199449fK r2 = new C199449fK();
                r2.A01 = r4.A01;
                r2.A00 = r4.A00;
                r2.A02 = r3;
                return r2.A01();
            case 5:
                C207219uk r014 = r7.A00;
                if (r014 == null || (r0 = r014.A01) == null || (r02 = r0.A09) == null) {
                    return "UNKNOWN";
                }
                switch (C207199ui.A00(r02.A01)) {
                    case 1:
                        return "PENDING";
                    case 2:
                        return "PROCESSING";
                    case 3:
                        return "COMPLETED";
                    case 4:
                        return "CANCELED";
                    case 5:
                        return "PARTIALLY_SHIPPED";
                    case 6:
                        return "SHIPPED";
                    case 7:
                        return "PAYMENT_REQUESTED";
                    case 8:
                        return "PREPARING_TO_SHIP";
                    case 9:
                        return "DELIVERED";
                    default:
                        return "UNKNOWN";
                }
            case 6:
                C207219uk r015 = r7.A00;
                if (r015 == null || (r03 = r015.A01) == null) {
                    return "UNKNOWN";
                }
                int A02 = r03.A02();
                if (A02 == 1) {
                    return "DIGITAL_GOODS";
                }
                if (A02 == 2) {
                    return "PHYSICAL_GOODS";
                }
                return "UNKNOWN";
            default:
                throw C36441kJ.A18();
        }
    }
}
