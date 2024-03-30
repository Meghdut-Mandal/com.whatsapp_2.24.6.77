package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import com.whatsapp.R;

/* renamed from: X.3fR  reason: invalid class name and case insensitive filesystem */
public class C70613fR implements C89014Ux {
    public int A00;
    public Integer A01;
    public final C19630wG A02;
    public final C18820ts A03;
    public final C20810yC A04;
    public final AnonymousClass004 A05;

    public /* synthetic */ int B3N() {
        if (this instanceof AnonymousClass2J6) {
            return ((AnonymousClass2J6) this).A00;
        }
        if ((this instanceof AnonymousClass2J4) || (this instanceof AnonymousClass2J7)) {
            return ((AnonymousClass2J1) this).A00;
        }
        return 0;
    }

    public int B8x() {
        if (this instanceof AnonymousClass2J6) {
            return ((AnonymousClass2J6) this).A00;
        }
        if (this instanceof AnonymousClass2J4) {
            return ((AnonymousClass2J1) this).A00;
        }
        return 0;
    }

    public int B8y(AnonymousClass3T1 r3) {
        if (this instanceof AnonymousClass2J6) {
            return ((AnonymousClass2J6) this).A00;
        }
        if ((this instanceof AnonymousClass2J0) || (this instanceof AnonymousClass2J3)) {
            return 0;
        }
        if (this instanceof AnonymousClass2J4) {
            return ((AnonymousClass2J1) this).A00;
        }
        if ((this instanceof AnonymousClass2J8) || (this instanceof AnonymousClass2J7)) {
            AnonymousClass2J1 r1 = (AnonymousClass2J1) this;
            if (r3 == null || r3.A1J.A02) {
                return r1.A00;
            }
            return r1.A00;
        } else if (!(this instanceof AnonymousClass2Ix)) {
            return this.A00;
        } else {
            return 0;
        }
    }

    public int B8z(Context context) {
        Resources resources;
        int i;
        if (this instanceof AnonymousClass2J6) {
            AnonymousClass00C.A0D(context, 0);
            return C65103Qt.A01(context, 8.0f);
        }
        if (this instanceof AnonymousClass2J2) {
            resources = context.getResources();
            i = R.dimen.f7nameremoved;
        } else {
            AnonymousClass00C.A0D(context, 0);
            resources = context.getResources();
            i = R.dimen.f7nameremoved;
        }
        return resources.getDimensionPixelSize(i);
    }

    public /* synthetic */ int BAA(Context context, int i) {
        if (this instanceof AnonymousClass2J6) {
            AnonymousClass2J6 r3 = (AnonymousClass2J6) this;
            AnonymousClass00C.A0D(context, 0);
            int i2 = AnonymousClass000.A0X(r3.A02.A00).widthPixels;
            int i3 = r3.A00;
            return (i2 - (i3 + i3)) - (r3.BEv(context, i) + r3.BEy(context, i));
        } else if (!(this instanceof AnonymousClass2J4)) {
            return 0;
        } else {
            AnonymousClass2J1 r2 = (AnonymousClass2J1) this;
            AnonymousClass00C.A0D(context, 0);
            int i4 = AnonymousClass000.A0X(r2.A02.A00).widthPixels;
            int i5 = r2.A00;
            return (i4 - (i5 + i5)) - (i + i);
        }
    }

    public Paint BBz() {
        Integer num = this.A01;
        if (num != null) {
            int intValue = num.intValue();
            AnonymousClass004 r1 = this.A05;
            AnonymousClass00C.A0D(r1, 0);
            ((Paint) r1.get()).setColor(intValue);
            this.A01 = null;
        }
        AnonymousClass004 r12 = this.A05;
        AnonymousClass00C.A0D(r12, 0);
        Paint paint = (Paint) r12.get();
        AnonymousClass00C.A08(paint);
        return paint;
    }

    public /* synthetic */ int BCS() {
        if (this instanceof AnonymousClass2J6) {
            return ((AnonymousClass2J6) this).A00;
        }
        if (this instanceof AnonymousClass2J1) {
            return ((AnonymousClass2J1) this).A00;
        }
        return 0;
    }

    public int BEv(Context context, int i) {
        if (this instanceof AnonymousClass2Iy) {
            return context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        if ((this instanceof AnonymousClass2J0) || (this instanceof AnonymousClass2J3)) {
            return 0;
        }
        if (this instanceof AnonymousClass2J4) {
            return i;
        }
        AnonymousClass00C.A0D(context, 0);
        return C65123Qv.A00(context) + i;
    }

    public int BEy(Context context, int i) {
        if (this instanceof AnonymousClass2Iy) {
            return context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        if (this instanceof AnonymousClass2J2) {
            AnonymousClass00C.A0D(context, 0);
            return C36441kJ.A06(context.getResources(), R.dimen.f7nameremoved, C65123Qv.A00(context) + i);
        } else if ((this instanceof AnonymousClass2J0) || (this instanceof AnonymousClass2J3)) {
            return 0;
        } else {
            if (this instanceof AnonymousClass2J4) {
                return i;
            }
            AnonymousClass00C.A0D(context, 0);
            return C65123Qv.A00(context) + i;
        }
    }

    public int BFD(int i) {
        if (this instanceof AnonymousClass2J4) {
            if (i == 0 || i == 1 || i == 2) {
                return R.layout.f9nameremoved;
            }
            if (i == 3) {
                return -1;
            }
            C18740tg.A0D(false, AnonymousClass000.A0r("CAGConversationRowCustomizer/getParticipantHeaderLayoutRes/invalid layout option. Layout option input = ", AnonymousClass000.A0u(), i));
            return R.layout.f9nameremoved;
        } else if (i == 0 || i == 1 || i == 2) {
            return R.layout.f9nameremoved;
        } else {
            if (i == 3) {
                return -1;
            }
            C18740tg.A0D(false, AnonymousClass000.A0r("FlowedConversationRowCustomizer/getParticipantHeaderLayoutRes/invalid layout option. Layout option input = ", AnonymousClass000.A0u(), i));
            return R.layout.f9nameremoved;
        }
    }

    public int BHE(Context context) {
        float max;
        float f;
        if (this instanceof AnonymousClass2J2) {
            AnonymousClass2J2 r1 = (AnonymousClass2J2) this;
            if (r1 instanceof C43602Iw) {
                AnonymousClass00C.A0D(context, 0);
                max = Math.max(1.0f, C36341k9.A00(context));
                f = 34.0f;
            } else if (!(r1 instanceof C43592Iv)) {
                return 0;
            } else {
                max = Math.max(1.0f, C36341k9.A00(context));
                f = 24.0f;
            }
            return (int) (max * f);
        }
        AnonymousClass00C.A0D(context, 0);
        return Math.max(1, (int) (C36341k9.A00(context) / 2.0f));
    }

    public int BHF(Context context) {
        if (this instanceof AnonymousClass2J2) {
            return 0;
        }
        AnonymousClass00C.A0D(context, 0);
        return context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public boolean BLr() {
        if ((this instanceof AnonymousClass2J5) || (this instanceof AnonymousClass2J2) || (this instanceof AnonymousClass2J0)) {
            return false;
        }
        return true;
    }

    public boolean BLu(AnonymousClass3T1 r3) {
        if (this instanceof AnonymousClass2J6) {
            return true;
        }
        if (!(this instanceof AnonymousClass2J1)) {
            return false;
        }
        AnonymousClass2J1 r1 = (AnonymousClass2J1) this;
        if (!(r1 instanceof AnonymousClass2J8) && !(r1 instanceof AnonymousClass2J7)) {
            return true;
        }
        AnonymousClass00C.A0D(r3, 0);
        if (r3.A1J.A02 || (r3 instanceof AnonymousClass2bV)) {
            return false;
        }
        return true;
    }

    public boolean BMl() {
        if ((this instanceof AnonymousClass2Iz) || (this instanceof AnonymousClass2Ix)) {
            return true;
        }
        return false;
    }

    public boolean BNB() {
        if (this instanceof AnonymousClass2J2) {
            return C36401kF.A1X(this.A03);
        }
        return C36351kA.A1Y(this.A03);
    }

    public /* synthetic */ void Br0(int i) {
        if (this instanceof AnonymousClass2J6) {
            ((AnonymousClass2J6) this).A00 = i;
        } else if (this instanceof AnonymousClass2J1) {
            ((AnonymousClass2J1) this).A00 = i;
        }
    }

    public boolean Bsx() {
        if ((this instanceof AnonymousClass2J5) || (this instanceof AnonymousClass2J2)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bsy() {
        if (this instanceof AnonymousClass2J6) {
            return AnonymousClass000.A1S(this.A04.A07(7234), 2);
        }
        return false;
    }

    public /* synthetic */ boolean Bsz() {
        if (this instanceof AnonymousClass2J4) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bt4() {
        if ((this instanceof AnonymousClass2J6) || (this instanceof AnonymousClass2J0) || (this instanceof AnonymousClass2J4) || (this instanceof AnonymousClass2J8)) {
            return true;
        }
        return false;
    }

    public boolean Bt6() {
        if ((this instanceof AnonymousClass2J5) || (this instanceof AnonymousClass2J2)) {
            return true;
        }
        return false;
    }

    public boolean BtA() {
        if (this instanceof AnonymousClass2J2) {
            return C36351kA.A1Y(this.A03);
        }
        return C36401kF.A1X(this.A03);
    }

    public /* synthetic */ boolean BtB() {
        if (this instanceof AnonymousClass2J6) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean BtC() {
        if (this instanceof AnonymousClass2J6) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean BtI() {
        if ((this instanceof AnonymousClass2J6) || (this instanceof AnonymousClass2J4) || (this instanceof AnonymousClass2J7)) {
            return true;
        }
        return false;
    }

    public boolean BtQ() {
        if ((this instanceof AnonymousClass2Iz) || (this instanceof AnonymousClass2J6) || (this instanceof AnonymousClass2J4) || (this instanceof AnonymousClass2J8) || (this instanceof AnonymousClass2J7)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean BtS() {
        if (this instanceof AnonymousClass2J6) {
            return AnonymousClass000.A1P(this.A04.A07(7234));
        }
        return false;
    }

    public boolean BtU() {
        if (this instanceof AnonymousClass2J2) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Btb() {
        if (this instanceof AnonymousClass2J8) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Btw() {
        if (this instanceof AnonymousClass2J4) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Btx() {
        if (this instanceof AnonymousClass2J4) {
            return true;
        }
        return false;
    }

    public boolean Bty() {
        if ((this instanceof AnonymousClass2Iy) || (this instanceof AnonymousClass2J4)) {
            return true;
        }
        return false;
    }

    public void Bwg(Context context, int i) {
        if (this instanceof AnonymousClass2J6) {
            AnonymousClass00C.A0D(context, 0);
            ((AnonymousClass2J6) this).A00 = Math.max((i - C65103Qt.A01(context, 600.0f)) / 2, C65103Qt.A01(context, 0.0f));
        } else if (this instanceof AnonymousClass2J4) {
            AnonymousClass00C.A0D(context, 0);
            ((AnonymousClass2J1) this).A00 = Math.max((i - C65103Qt.A01(context, 480.0f)) / 2, C65103Qt.A01(context, 16.0f));
        }
    }

    public C70613fR(C19630wG r4, C18820ts r5, C20810yC r6) {
        AZ4 az4;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        boolean A0E = r6.A0E(7307);
        C65873Tu r1 = new C65873Tu(this, 3);
        if (A0E) {
            az4 = new AZ4((Object) null, r1);
        } else {
            az4 = new AZ4(r1.get(), (AnonymousClass004) null);
        }
        this.A05 = az4;
    }

    public void Bwf(Context context) {
        this.A01 = Integer.valueOf(C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved));
        this.A00 = C65103Qt.A01(context, 40.0f);
    }
}
