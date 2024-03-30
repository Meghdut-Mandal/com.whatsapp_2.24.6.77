package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.Calendar;

public class AE9 implements C23083B3q {
    public final C18820ts A00;
    public final AnonymousClass1EV A01;
    public final C23075B3f A02;
    public final C24611Dc A03 = C24611Dc.A00("BrazilPaymentErrorHelper", "payment", "BR");
    public final C19630wG A04;
    public final C20810yC A05;
    public final C192619Hx A06;
    public final C29231Vv A07;
    public final C202939my A08;

    public String BAO(int i) {
        return null;
    }

    public int BBe(AnonymousClass9YX r2, int i) {
        return 0;
    }

    public void BJf(String str) {
    }

    public boolean BLX(int i) {
        return false;
    }

    public boolean BLa(int i) {
        return false;
    }

    public boolean BM6(int i) {
        return false;
    }

    public boolean BM7(int i) {
        return false;
    }

    public boolean BMB(int i) {
        return false;
    }

    public boolean BMP(int i) {
        return false;
    }

    public boolean BNT(int i) {
        return false;
    }

    public int BPX() {
        return 0;
    }

    public int BPY() {
        return 0;
    }

    public AnonymousClass0FM A01(Context context, C20810yC r6, AnonymousClass6PS r7, int i, int i2) {
        String str;
        AnonymousClass0FM A042 = this.A08.A04(context, (DialogInterface.OnDismissListener) null, (DialogInterface.OnDismissListener) null, i);
        if (A042 != null) {
            return A042;
        }
        if (r6.A0E(698)) {
            str = r7.A03(String.valueOf(i));
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            int i3 = R.string.f12nameremoved;
            if (i != -233) {
                i3 = R.string.f12nameremoved;
                if (i != 477) {
                    i3 = R.string.f12nameremoved;
                    if (i != 10229) {
                        i3 = R.string.f12nameremoved;
                        if (i != 10234) {
                            i3 = R.string.f12nameremoved;
                            if (i != 10780) {
                                if (i != 2896002) {
                                    str = context.getString(i2);
                                } else {
                                    C39001qm A002 = AnonymousClass3LW.A00(context);
                                    A002.A0c(R.string.f12nameremoved);
                                    C165587tf.A17(A002);
                                    A002.A0f(new B8F(context, this, 7), R.string.f12nameremoved);
                                    return A002.create();
                                }
                            }
                        }
                    }
                }
            }
            str = context.getString(i3);
        }
        return C202939my.A00(context, C204129pV.A00, str);
    }

    public String BBd(String str, int i) {
        Context context;
        int i2;
        if (i == 14121 || i == 14125) {
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
        } else if (i != 2709017) {
            return str;
        } else {
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
        }
        return context.getString(i2);
    }

    public String BGm(int i) {
        Context context;
        int i2;
        if (i == 1703) {
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
        } else if (i == 10768) {
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
        } else if (i == 10779 || i == 12854 || i == 12907 || i == 20986 || i == 2709018) {
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
        } else if (i == 2826005) {
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
        } else if (i == 10755) {
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
        } else if (i != 10756) {
            return null;
        } else {
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
        }
        return context.getString(i2);
    }

    public boolean BM5(int i) {
        return AnonymousClass000.A1S(i, 2001);
    }

    public boolean BM8(int i) {
        return AnonymousClass000.A1S(i, 10244);
    }

    public boolean BM9(int i) {
        return AnonymousClass000.A1S(i, 10242);
    }

    public boolean BMA(int i) {
        return AnonymousClass000.A1S(i, 10241);
    }

    public boolean BMC(int i) {
        return AnonymousClass000.A1S(i, 10240);
    }

    public boolean BMK(int i) {
        return AnonymousClass000.A1S(i, 12871);
    }

    public boolean BML(int i) {
        return AnonymousClass000.A1S(i, 18510);
    }

    public boolean BMM(int i) {
        return AnonymousClass000.A1S(i, 12894);
    }

    public boolean BMQ(int i) {
        return AnonymousClass000.A1S(i, 12858);
    }

    public boolean BMR(int i) {
        return AnonymousClass000.A1S(i, 21001);
    }

    public boolean BMf(int i) {
        return AnonymousClass000.A1S(i, 20985);
    }

    public boolean BNY(int i) {
        return AnonymousClass000.A1S(i, 21000);
    }

    public AE9(C19630wG r4, C18820ts r5, C20810yC r6, C192619Hx r7, C29231Vv r8, C202939my r9, AnonymousClass1EV r10, C23075B3f b3f) {
        this.A04 = r4;
        this.A05 = r6;
        this.A00 = r5;
        this.A01 = r10;
        this.A02 = b3f;
        this.A06 = r7;
        this.A08 = r9;
        this.A07 = r8;
    }

    public AnonymousClass0FM A00(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2, DialogInterface.OnDismissListener onDismissListener3, String str, int i) {
        Context context2 = context;
        int i2 = i;
        if (i2 == 2896002) {
            C39001qm A002 = AnonymousClass3LW.A00(context2);
            A002.A0c(R.string.f12nameremoved);
            C165587tf.A17(A002);
            A002.A0f(new B8F(context2, this, 7), R.string.f12nameremoved);
            return A002.create();
        }
        DialogInterface.OnDismissListener onDismissListener4 = onDismissListener2;
        DialogInterface.OnDismissListener onDismissListener5 = onDismissListener3;
        String str2 = str;
        switch (i) {
            case 10780:
                return C202939my.A00(context2, onDismissListener4, context2.getString(R.string.f12nameremoved));
            case 2826028:
            case 2826029:
                return C202939my.A00(context2, onDismissListener5, C36321k7.A0A(context2, str2, R.string.f12nameremoved));
            case 2826043:
                C18820ts r4 = this.A00;
                Calendar instance = Calendar.getInstance(C36401kF.A0x(r4));
                instance.set(10, 20);
                instance.set(12, 0);
                String A003 = AnonymousClass3UM.A00(r4, instance.getTimeInMillis());
                Calendar instance2 = Calendar.getInstance(C36401kF.A0x(r4));
                instance2.set(10, 6);
                instance2.set(12, 0);
                String A004 = AnonymousClass3UM.A00(r4, instance2.getTimeInMillis());
                String valueOf = String.valueOf(2826043);
                String string = context2.getString(R.string.f12nameremoved);
                Object[] objArr = new Object[2];
                objArr[0] = A003;
                String A0v = C36391kE.A0v(context2, A004, objArr, 1, R.string.f12nameremoved);
                C23075B3f b3f = this.A02;
                if (b3f != null) {
                    C176658cT B4W = b3f.B4W();
                    B4W.A08 = C36371kC.A0o();
                    B4W.A0b = "error";
                    B4W.A0S = valueOf;
                    B4W.A0T = A0v;
                    if (string != null) {
                        B4W.A0U = string;
                    }
                    C165567td.A16(this.A03, b3f, "PaymentUserActionEvent errorLoggingEvent: ", AnonymousClass000.A0u());
                    b3f.BOl(B4W);
                }
                String string2 = context2.getString(R.string.f12nameremoved);
                Object[] objArr2 = new Object[2];
                objArr2[0] = A003;
                String A0v2 = C36391kE.A0v(context2, A004, objArr2, 1, R.string.f12nameremoved);
                C39001qm A005 = AnonymousClass3LW.A00(context2);
                A005.A0q(string2);
                C39001qm.A0A(A005, A0v2);
                AnonymousClass0FM create = A005.create();
                create.setOnDismissListener(onDismissListener5);
                return create;
            default:
                return this.A08.A06(context2, onDismissListener, onDismissListener4, onDismissListener5, str2, i2);
        }
    }

    public String BAL(int i) {
        Context context;
        int i2;
        if (!AnonymousClass000.A1S(i, 2826013)) {
            return null;
        }
        AnonymousClass1EV r2 = this.A01;
        if (r2.A02.A0E(1587)) {
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
        } else if (!r2.A01()) {
            return null;
        } else {
            boolean A0D = this.A07.A0D();
            context = this.A04.A00;
            i2 = R.string.f12nameremoved;
            if (!A0D) {
                i2 = R.string.f12nameremoved;
            }
        }
        return context.getString(i2);
    }

    public int BAM(C207109uZ r4, AnonymousClass39O r5, int i) {
        if (!AnonymousClass000.A1S(i, 2826013)) {
            return -1;
        }
        AnonymousClass1EV r2 = this.A01;
        if (r2.A02.A0E(1587)) {
            return 20;
        }
        if (!r2.A01()) {
            return -1;
        }
        if (!this.A07.A0D()) {
            return 25;
        }
        C20810yC r1 = r5.A01;
        r1.A0E(1176);
        r1.A0E(1212);
        return -1;
    }

    public String BAN(int i) {
        if (!AnonymousClass000.A1S(i, 2826013)) {
            return null;
        }
        AnonymousClass1EV r1 = this.A01;
        if (r1.A01() || r1.A02.A0E(1587)) {
            return this.A04.A00.getString(R.string.f12nameremoved);
        }
        return null;
    }

    public boolean BMg(int i) {
        return AnonymousClass000.A1S(i, 1353003);
    }

    public boolean BMr(int i) {
        return AnonymousClass000.A1S(i, 2826013);
    }

    public boolean BtV(int i) {
        return true;
    }
}
