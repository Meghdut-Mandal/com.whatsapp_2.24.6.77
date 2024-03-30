package X;

import android.graphics.BitmapFactory;
import java.util.Map;

/* renamed from: X.AHd  reason: case insensitive filesystem */
public final class C21325AHd implements C159667jj {
    public final C19630wG A00;
    public final C198629dt A01;

    public Class B7I() {
        return AnonymousClass91L.class;
    }

    public /* bridge */ /* synthetic */ Object Bod(Enum enumR, Object obj, Map map) {
        C135086c7 r0;
        C175898bF r9 = (C175898bF) obj;
        AnonymousClass91L r8 = (AnonymousClass91L) enumR;
        C36321k7.A0w(r9, r8);
        if (!(r9 instanceof C175818b6)) {
            return null;
        }
        switch (r8.ordinal()) {
            case 0:
                r0 = ((C175818b6) r9).A02;
                break;
            case 1:
                return ((C175818b6) r9).A09;
            case 2:
                String str = ((C175818b6) r9).A0A;
                if (str == null) {
                    return "UNKNOWN";
                }
                switch (str.hashCode()) {
                    case -1704036199:
                        if (str.equals("SAVINGS")) {
                            return "SAVINGS";
                        }
                        return "UNKNOWN";
                    case -240997565:
                        if (str.equals("OD_SECURED")) {
                            return "OD_SECURED";
                        }
                        return "UNKNOWN";
                    case 358786314:
                        if (str.equals("OD_UNSECURED")) {
                            return "OD_UNSECURED";
                        }
                        return "UNKNOWN";
                    case 1844922713:
                        if (str.equals("CURRENT")) {
                            return "CURRENT";
                        }
                        return "UNKNOWN";
                    case 1996005113:
                        if (!str.equals("CREDIT")) {
                            return "UNKNOWN";
                        }
                        return "CREDIT";
                    default:
                        return "UNKNOWN";
                }
            case 3:
                return ((C175848bA) r9).A03;
            case 4:
                r0 = ((C175818b6) r9).A04;
                break;
            case 5:
                r0 = ((C175818b6) r9).A08;
                break;
            case 6:
                return ((C175818b6) r9).A0E;
            case 7:
                return AnonymousClass6Y8.A0B(BitmapFactory.decodeResource(C36421kH.A0B(this.A00), this.A01.A00(((C175818b6) r9).A09, (String) null).A00));
            case 8:
                r0 = ((C175818b6) r9).A05;
                break;
            default:
                throw C36441kJ.A18();
        }
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public C21325AHd(C19630wG r1, C198629dt r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
