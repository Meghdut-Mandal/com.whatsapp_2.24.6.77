package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.List;

/* renamed from: X.4r3  reason: invalid class name and case insensitive filesystem */
public class C98204r3 extends C132456Tu implements C161287mV {
    public static final C160347kr A0F = new C140556lm();
    public static final C160347kr A0G = new C140626lt();
    public static final C160347kr A0H = new C140516li();
    public static final C160347kr A0I = new C140536lk();
    public static final C160347kr A0J = new C140606lr();
    public static final C160347kr A0K = new C140596lq();
    public static final C160347kr A0L = new C140616ls();
    public static final C160347kr A0M = new C140566ln();
    public static final C160347kr A0N = new C140546ll();
    public static final C160347kr A0O = new C140636lu();
    public static final C160347kr A0P = new C140526lj();
    public static final C160347kr A0Q = new C140576lo();
    public static final C160347kr A0R = new C140586lp();
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public Rect A04;
    public C02800By A05;
    public AnonymousClass0I9 A06;
    public C114875hy A07;
    public List A08;
    public List A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public final long A0C;
    public final C1267765m A0D;
    public final C95984mb A0E;

    public C98204r3(C1267765m r6, C95984mb r7, long j) {
        super(C023109s.A01);
        this.A0C = j;
        this.A0E = r7;
        this.A0D = r6;
        C1257261a[] r3 = {new C1257261a(A0M, this), new C1257261a(A0F, this), new C1257261a(A0Q, this), new C1257261a(A0R, this), new C1257261a(A0K, this), new C1257261a(A0J, this), new C1257261a(A0L, this), new C1257261a(A0G, this), new C1257261a(A0O, this), new C1257261a(A0H, this), new C1257261a(A0P, this), new C1257261a(A0I, this), new C1257261a(A0N, this)};
        int i = 0;
        do {
            A0E(r3[i]);
            i++;
        } while (i < 13);
    }

    public void A0F(AnonymousClass0UE r2) {
        List list = this.A09;
        if (list == null) {
            list = C36441kJ.A14(4);
            this.A09 = list;
        }
        list.add(r2);
    }

    public /* bridge */ /* synthetic */ Object B4O(Context context) {
        return new C97064oL(context);
    }

    public /* synthetic */ Class BG1() {
        return getClass();
    }
}
