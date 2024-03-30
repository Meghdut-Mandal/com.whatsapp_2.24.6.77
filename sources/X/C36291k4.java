package X;

import com.whatsapp.R;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.Arrays;

/* renamed from: X.1k4  reason: invalid class name and case insensitive filesystem */
public class C36291k4 implements C226515g {
    public Object A00;
    public final int A01;

    public C36291k4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C36291k4 r5) {
        C225014r r1;
        if (r5.A01 != 0) {
            Object[] objArr = new Object[0];
            AnonymousClass01I A0h = ((UpdatesFragment) r5.A00).A0h();
            if ((A0h instanceof C225014r) && (r1 = (C225014r) A0h) != null) {
                r1.BO9(Arrays.copyOf(objArr, 0), R.string.f12nameremoved, R.string.f12nameremoved);
                return;
            }
            return;
        }
        ((C225314u) r5.A00).BO9(new Object[0], R.string.f12nameremoved, R.string.f12nameremoved);
    }

    public final void A01() {
        Integer valueOf;
        int i;
        C225014r r1;
        UpdatesFragment updatesFragment = (UpdatesFragment) this.A00;
        AnonymousClass005 r0 = updatesFragment.A0u;
        if (r0 != null) {
            r0.get();
            if (C20060wx.A00()) {
                valueOf = Integer.valueOf(R.string.f12nameremoved);
                i = R.string.f12nameremoved;
            } else {
                valueOf = Integer.valueOf(R.string.f12nameremoved);
                i = R.string.f12nameremoved;
            }
            Integer valueOf2 = Integer.valueOf(i);
            int intValue = valueOf.intValue();
            int intValue2 = valueOf2.intValue();
            Object[] objArr = new Object[0];
            AnonymousClass01I A0h = updatesFragment.A0h();
            if ((A0h instanceof C225014r) && (r1 = (C225014r) A0h) != null) {
                r1.BO9(Arrays.copyOf(objArr, 0), intValue, intValue2);
                return;
            }
            return;
        }
        AnonymousClass00C.A0G("storageUtilsLazy");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void Be9(String str) {
        if (this.A01 != 0) {
            A01();
            return;
        }
        C225314u r3 = (C225314u) this.A00;
        boolean A002 = C20060wx.A00();
        int i = R.string.f12nameremoved;
        if (A002) {
            i = R.string.f12nameremoved;
        }
        boolean A003 = C20060wx.A00();
        int i2 = R.string.f12nameremoved;
        if (A003) {
            i2 = R.string.f12nameremoved;
        }
        r3.BO9(new Object[0], i, i2);
    }

    public void Bjm(String str) {
        if (this.A01 != 0) {
            A01();
            return;
        }
        C225314u r3 = (C225314u) this.A00;
        boolean A002 = C20060wx.A00();
        int i = R.string.f12nameremoved;
        if (A002) {
            i = R.string.f12nameremoved;
        }
        boolean A003 = C20060wx.A00();
        int i2 = R.string.f12nameremoved;
        if (A003) {
            i2 = R.string.f12nameremoved;
        }
        r3.BO9(new Object[0], i, i2);
    }

    public void BeA() {
        A00(this);
    }

    public void Bjn() {
        A00(this);
    }
}
