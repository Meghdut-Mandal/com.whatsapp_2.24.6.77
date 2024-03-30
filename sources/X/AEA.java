package X;

import android.content.Intent;
import com.whatsapp.R;
import java.util.Objects;

public class AEA implements C23083B3q {
    public final C18820ts A00;
    public final C20810yC A01;
    public final C202269lR A02;
    public final AE0 A03;
    public final AnonymousClass6PS A04;

    public static boolean A02(C179128jE r3, String str, int i, boolean z) {
        C179128jE r1 = r3;
        Objects.requireNonNull(r3);
        AnonymousClass9F0 r2 = new AnonymousClass9F0(r3);
        Objects.requireNonNull(r3);
        return A01(r1, r2, new C81123wV((Object) r1, 48), str, i, z);
    }

    public String BAL(int i) {
        return null;
    }

    public int BAM(C207109uZ r2, AnonymousClass39O r3, int i) {
        return -1;
    }

    public String BAN(int i) {
        return null;
    }

    public int BBe(AnonymousClass9YX r2, int i) {
        return A03((AnonymousClass9YX) null, i).A00;
    }

    public String BGm(int i) {
        return null;
    }

    public boolean BM8(int i) {
        return false;
    }

    public boolean BM9(int i) {
        return false;
    }

    public boolean BMA(int i) {
        return false;
    }

    public boolean BMC(int i) {
        return false;
    }

    public boolean BMK(int i) {
        return false;
    }

    public boolean BML(int i) {
        return false;
    }

    public boolean BMM(int i) {
        return false;
    }

    public boolean BMQ(int i) {
        return false;
    }

    public boolean BMR(int i) {
        return false;
    }

    public boolean BMf(int i) {
        return false;
    }

    public boolean BMg(int i) {
        return false;
    }

    public boolean BMr(int i) {
        return false;
    }

    public boolean BNT(int i) {
        return i == 11455 || i == 11502;
    }

    public boolean BNY(int i) {
        return false;
    }

    public int BPX() {
        return 100000;
    }

    public int BPY() {
        return 10;
    }

    public static int A00(AnonymousClass9YX r3, int i) {
        int i2;
        int i3;
        if (i <= 0 && r3 != null) {
            synchronized (r3) {
                i2 = r3.A01;
            }
            synchronized (r3) {
                i3 = r3.A02;
            }
            int i4 = r3.A00;
            if (i2 > 0) {
                return i2;
            }
            if (i3 > 0) {
                return i3;
            }
            if (i4 > 0) {
                return i4;
            }
        }
        return i;
    }

    public static boolean A01(C225314u r5, AnonymousClass9F0 r6, Runnable runnable, String str, int i, boolean z) {
        Intent A0D;
        if (i == 404) {
            if (z) {
                StringBuilder A0v = AnonymousClass000.A0v("PAY: ");
                A0v.append(r5);
                A0v.append(" op: ");
                A0v.append(str);
                A0v.append(" payment account error: ");
                A0v.append(i);
                C36321k7.A1Z(A0v, "; restartPaymentsAccountSetupAndFinish");
                if (runnable != null) {
                    runnable.run();
                }
                A0D = C36431kI.A0D();
                A0D.setClassName(r5.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
            }
            return false;
        } else if (i == 440) {
            StringBuilder A0v2 = AnonymousClass000.A0v("PAY: ");
            A0v2.append(r5);
            A0v2.append(" op: ");
            A0v2.append(str);
            C36321k7.A1Z(A0v2, " tos not accepted; showTosAndFinish");
            A0D = C36431kI.A0D();
            A0D.setClassName(r5.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity");
            A0D.putExtra("extra_show_updated_tos", false);
            if (r6 != null) {
                r6.A00.A42(A0D);
            }
            if (runnable != null) {
                runnable.run();
            }
            r5.A33(A0D, true);
            return true;
        } else if (i != 442) {
            if (i == 443) {
                StringBuilder A0v3 = AnonymousClass000.A0v("PAY: ");
                A0v3.append(r5);
                A0v3.append(" op: ");
                A0v3.append(str);
                C36321k7.A1Z(A0v3, " payment unsupported for client version");
                if (runnable != null) {
                    runnable.run();
                }
                A0D = C36431kI.A0D();
                A0D.setClassName(r5.getPackageName(), "com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity");
                A0D.addFlags(335544320);
            }
            return false;
        } else {
            StringBuilder A0v4 = AnonymousClass000.A0v("PAY: ");
            A0v4.append(r5);
            A0v4.append(" op: ");
            A0v4.append(str);
            C36321k7.A1Z(A0v4, " tos v2 not accepted; showTosAndFinish");
            Intent A0D2 = C36431kI.A0D();
            A0D2.setClassName(r5.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity");
            A0D2.putExtra("extra_show_updated_tos", true);
            if (r6 != null) {
                r6.A00.A42(A0D2);
            }
            r5.startActivityForResult(A0D2, 1000);
            return true;
        }
        if (r6 != null) {
            r6.A00.A42(A0D);
        }
        r5.A33(A0D, true);
        return true;
    }

    public String BBd(String str, int i) {
        String A012 = this.A04.A01(i);
        if (A012 != null) {
            return A012;
        }
        return str;
    }

    public void BJf(String str) {
        if (str.equals(String.valueOf(11456)) || str.equals(String.valueOf(11471))) {
            C36321k7.A1Q("PAY: IndiaUpiErrorHelper/handlePaymentTransactionError handle:", str, AnonymousClass000.A0u());
            this.A03.A0G();
            C202269lR r2 = this.A02;
            r2.A04.A07.add("done");
            r2.A09();
        }
    }

    public boolean BLX(int i) {
        return AnonymousClass000.A1S(i, 11510);
    }

    public boolean BLa(int i) {
        return AnonymousClass000.A1S(i, 10756);
    }

    public boolean BM5(int i) {
        return AnonymousClass000.A1S(i, 11482);
    }

    public boolean BM6(int i) {
        return AnonymousClass000.A1S(i, 11459);
    }

    public boolean BM7(int i) {
        return AnonymousClass000.A1S(i, 11504);
    }

    public boolean BMB(int i) {
        return AnonymousClass000.A1S(i, 11503);
    }

    public boolean BMP(int i) {
        return AnonymousClass000.A1S(i, 11468);
    }

    public AEA(C18820ts r1, C20810yC r2, C202269lR r3, AE0 ae0, AnonymousClass6PS r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = ae0;
    }

    public C199729fr A03(AnonymousClass9YX r6, int i) {
        String str;
        int i2;
        Object obj;
        int A002 = A00(r6, i);
        if (this.A01.A0E(698)) {
            str = this.A04.A03(String.valueOf(A002));
        } else {
            str = null;
        }
        if (A002 == 443) {
            i2 = R.string.f12nameremoved;
        } else {
            if (!(A002 == 6 || A002 == 7)) {
                if (A002 == 405) {
                    i2 = R.string.f12nameremoved;
                } else if (A002 == 406) {
                    i2 = R.string.f12nameremoved;
                } else if (A002 == 409) {
                    i2 = R.string.f12nameremoved;
                } else if (A002 != 410) {
                    if (A002 != 21137 && A002 != 21138) {
                        switch (A002) {
                            case -2:
                                break;
                            case 400:
                            case 500:
                            case 4002:
                            case 11500:
                            case 2826004:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 403:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 426:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 460:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 503:
                            case 10702:
                            case 11474:
                            case 11484:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 10780:
                            case 11497:
                            case 11537:
                            case 11540:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 17009:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 21157:
                            case 21164:
                                i2 = R.string.f12nameremoved;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    } else {
                        i2 = R.string.f12nameremoved;
                    }
                } else {
                    i2 = R.string.f12nameremoved;
                }
            }
            i2 = R.string.f12nameremoved;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: getErrorString errorCode: ");
        A0u.append(A002);
        A0u.append(" states last error: ");
        if (r6 != null) {
            obj = Integer.valueOf(r6.A00);
        } else {
            obj = "null";
        }
        A0u.append(obj);
        C36321k7.A1T(" resId returned: ", A0u, i2);
        return new C199729fr(i2, str);
    }

    public String BAO(int i) {
        if (i != 2826003) {
            return null;
        }
        C18820ts r6 = this.A00;
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L, 5, 0);
        return r6.A0L(A0L, R.plurals.f10nameremoved, 5);
    }

    public boolean BtV(int i) {
        if (BNT(i) || i == 11503 || i == 11504 || i == 11482 || i == 11468 || i == 10756) {
            return false;
        }
        return true;
    }
}
