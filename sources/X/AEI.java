package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class AEI implements C22958AzA {
    public final C24601Db A00;

    public static void A00(AnonymousClass16T r7, C203399nx r8, C203399nx r9, ArrayList arrayList, int i) {
        C206279t0 r0;
        int length;
        int i2 = 0;
        if (i == 2) {
            C203399nx[] r6 = r9.A02;
            if (r6 != null) {
                int length2 = r6.length;
                while (i2 < length2) {
                    C203399nx r2 = r6[i2];
                    if (r2 != null) {
                        if ("bank".equals(r2.A00)) {
                            r0 = new C175818b6();
                            r0.A04(r7, r8, 2);
                        } else if ("psp".equals(r2.A00) || "psp-routing".equals(r2.A00)) {
                            r0 = new C175718aw();
                        }
                        r0.A04(r7, r2, 2);
                        arrayList.add(r0);
                    }
                    i2++;
                }
            }
        } else if (i == 4) {
            C203399nx[] r3 = r9.A02;
            if (r3 != null && (length = r3.length) > 0) {
                do {
                    C203399nx r1 = r3[i2];
                    if (r1 != null) {
                        C175818b6 r02 = new C175818b6();
                        r02.A04(r7, r1, 4);
                        arrayList.add(r02);
                    }
                    i2++;
                } while (i2 < length);
            }
        } else if (i != 5) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PAY: IndiaProtoParser got action: ");
            A0u.append(i);
            C36321k7.A1a(A0u, "; nothing to do");
        } else {
            C175718aw r03 = new C175718aw();
            r03.A04(r7, r9, 5);
            arrayList.add(r03);
        }
    }

    public AEI(C24601Db r1) {
        this.A00 = r1;
    }

    public ArrayList BlE(AnonymousClass16T r10, C203399nx r11) {
        int i;
        boolean z;
        C203399nx A03 = C203399nx.A03(r11);
        ArrayList A0I = AnonymousClass001.A0I();
        if (A03 == null) {
            Log.w("PAY: IndiaProtoParser empty account node");
        } else {
            String A0i = A03.A0i("wa-support-phone-number", (String) null);
            if (!TextUtils.isEmpty(A0i)) {
                C36341k9.A0x(C90494aF.A0E(this.A00), "payments_support_phone_number", A0i);
            }
            String A0i2 = A03.A0i("action", (String) null);
            if ("upi-batch".equalsIgnoreCase(A0i2)) {
                i = 1;
            } else if ("upi-get-banks".equalsIgnoreCase(A0i2)) {
                i = 2;
            } else if ("upi-register-vpa".equalsIgnoreCase(A0i2)) {
                i = 4;
            } else if ("upi-list-keys".equalsIgnoreCase(A0i2)) {
                i = 5;
            } else if ("upi-check-mpin".equalsIgnoreCase(A0i2)) {
                i = 6;
            } else if ("pay-precheck".equalsIgnoreCase(A0i2)) {
                i = 8;
            } else {
                boolean equalsIgnoreCase = "upi-get-psp-routing-and-list-keys".equalsIgnoreCase(A0i2);
                i = 0;
                if (equalsIgnoreCase) {
                    i = 10;
                }
            }
            int i2 = 0;
            if (i == 1 || i == 10) {
                C203399nx[] r8 = A03.A02;
                if (r8 != null) {
                    while (i2 < r8.length) {
                        C203399nx r2 = r8[i2];
                        if (r2 != null) {
                            String str = r2.A00;
                            switch (str.hashCode()) {
                                case -384112062:
                                    z = str.equals("psp-config");
                                    break;
                                case 3288564:
                                    if (str.equals("keys")) {
                                        A00(r10, A03, r2, A0I, 5);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 93503927:
                                    z = str.equals("banks");
                                    break;
                            }
                            if (z) {
                                A00(r10, A03, r2, A0I, 2);
                            }
                        }
                        i2++;
                    }
                }
            } else if (i == 2) {
                A00(r10, A03, A03, A0I, 2);
                C203399nx[] r22 = A03.A02;
                if (r22 != null) {
                    while (i2 < r22.length) {
                        C203399nx r1 = r22[i2];
                        if (r1 != null && "psp-config".equals(r1.A00)) {
                            A00(r10, A03, r1, A0I, 2);
                        }
                        i2++;
                    }
                }
            } else {
                A00(r10, A03, A03, A0I, i);
                return A0I;
            }
        }
        return A0I;
    }
}
