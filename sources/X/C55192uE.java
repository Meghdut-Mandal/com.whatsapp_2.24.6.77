package X;

import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.2uE  reason: invalid class name and case insensitive filesystem */
public abstract class C55192uE {
    public static final int A00(String str) {
        int i;
        boolean z;
        if (str != null) {
            String A1D = C36431kI.A1D(Locale.ROOT, str);
            switch (A1D.hashCode()) {
                case -2139208497:
                    z = A1D.equals("misleading");
                    i = R.string.f12nameremoved;
                    break;
                case -1771213723:
                    z = A1D.equals("gambling");
                    i = R.string.f12nameremoved;
                    break;
                case -1560609346:
                    z = A1D.equals("digital_services_products");
                    i = R.string.f12nameremoved;
                    break;
                case -1338910485:
                    z = A1D.equals("dating");
                    i = R.string.f12nameremoved;
                    break;
                case -1152426539:
                    z = A1D.equals("tobacco");
                    i = R.string.f12nameremoved;
                    break;
                case -919668978:
                    z = A1D.equals("alcohol");
                    i = R.string.f12nameremoved;
                    break;
                case -856935945:
                    z = A1D.equals("animals");
                    i = R.string.f12nameremoved;
                    break;
                case -850113115:
                    z = A1D.equals("body_parts_fluids");
                    i = R.string.f12nameremoved;
                    break;
                case -596951334:
                    z = A1D.equals("supplements");
                    i = R.string.f12nameremoved;
                    break;
                case -371061680:
                    z = A1D.equals("illegal_products_services");
                    i = R.string.f12nameremoved;
                    break;
                case 3536713:
                    z = A1D.equals("spam");
                    i = R.string.f12nameremoved;
                    break;
                case 92676538:
                    z = A1D.equals("adult");
                    i = R.string.f12nameremoved;
                    break;
                case 306174265:
                    z = A1D.equals("violation_drugs");
                    i = R.string.f12nameremoved;
                    break;
                case 329032921:
                    z = A1D.equals("unauthorized_media");
                    i = R.string.f12nameremoved;
                    break;
                case 908259181:
                    z = A1D.equals("healthcare");
                    i = R.string.f12nameremoved;
                    break;
                case 1155840218:
                    z = A1D.equals("real_fake_currency");
                    i = R.string.f12nameremoved;
                    break;
                case 1223328215:
                    z = A1D.equals("weapons");
                    i = R.string.f12nameremoved;
                    break;
                case 1659800405:
                    z = A1D.equals("violent_content");
                    i = R.string.f12nameremoved;
                    break;
                case 1945443043:
                    z = A1D.equals("third_party_infringement");
                    i = R.string.f12nameremoved;
                    break;
            }
            if (!z) {
                return R.string.f12nameremoved;
            }
            return i;
        }
        return R.string.f12nameremoved;
    }
}
