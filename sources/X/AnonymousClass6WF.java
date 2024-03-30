package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6WF  reason: invalid class name */
public final class AnonymousClass6WF {
    public final AnonymousClass5l6 A00;
    public final C19970wo A01;
    public final AtomicBoolean A02 = C36431kI.A1H();
    public final AtomicLong A03 = new AtomicLong(0);
    public final C19730wQ A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass004 A07;
    public final AnonymousClass004 A08;
    public final AnonymousClass004 A09;

    public final void A04(String str, WeakReference weakReference) {
        String str2;
        AtomicBoolean atomicBoolean = this.A02;
        if (atomicBoolean.get() || C19970wo.A00(this.A01) - this.A03.get() <= 500) {
            str2 = "Avatar Editor is already launching.";
        } else {
            WeakReference weakReference2 = weakReference;
            C225314u A002 = A00(weakReference2);
            if (A002 == null) {
                str2 = "Unable to obtain Activity reference.";
            } else {
                atomicBoolean.set(true);
                C23871Ae r13 = (C23871Ae) this.A08.get();
                AnonymousClass39Q r3 = (AnonymousClass39Q) this.A09.get();
                AnonymousClass1BF r7 = (AnonymousClass1BF) this.A07.get();
                A002.Bu2(0, R.string.f12nameremoved);
                AnonymousClass1HC r14 = (AnonymousClass1HC) this.A06.get();
                int A003 = r14.A00();
                r14.A01(A003, "launch_editor");
                r14.A05(C106055Ie.A00, str, A003);
                C117755mm r4 = new C117755mm();
                String str3 = r13.A01;
                if (str3 == null) {
                    str3 = C36361kB.A0l();
                    r13.A01 = str3;
                }
                AnonymousClass00C.A0B(str3);
                AnonymousClass00C.A0D(str3, 1);
                Map map = r4.A00;
                map.put("logging_session_id", str3);
                map.put("logging_surface", "wa_settings");
                map.put("logging_mechanism", "wa_settings_item");
                StringBuilder A0i = C90524aI.A0i("{\"server_params\":{");
                Iterator A0y = AnonymousClass000.A0y(map);
                int i = 0;
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    String A0f = C90494aF.A0f(A11);
                    String A10 = C90514aH.A10(A11);
                    A0i.append("\"");
                    A0i.append(A0f);
                    AnonymousClass000.A1D("\":\"", A10, "\"", A0i);
                    C90504aG.A1O(A0i, map, i);
                    i++;
                }
                String A0q = AnonymousClass000.A0q("}}", A0i);
                AnonymousClass00C.A08(A0q);
                r14.A01(A003, "editor_params_ready");
                boolean A012 = r7.A01();
                r13.A05((Integer) null, (String) null, 1, A012);
                if (((AnonymousClass1XW) r3.A04.get()).A00() == null) {
                    r14.A01(A003, "create_user");
                    r14.A00 = Integer.valueOf(A003);
                    r3.A01.Bp1(new C80313vC(r3, new C147606xU(this, r13, r14, A0q, weakReference2, A003, A012), 0));
                    return;
                }
                A03(this, r13, r14, A0q, weakReference2, A003, A012);
                return;
            }
        }
        Log.e(str2);
    }

    public static final Exception A01(C111855cx r1) {
        if (r1.equals(C107335Nr.A00)) {
            return AnonymousClass001.A09("Activity no longer active");
        }
        if (r1 instanceof C107315Np) {
            return ((C107315Np) r1).A00.A02;
        }
        if (r1.equals(C107345Ns.A00)) {
            return null;
        }
        if (r1 instanceof C107325Nq) {
            return ((C107325Nq) r1).A00;
        }
        throw C36441kJ.A18();
    }

    public static final void A03(AnonymousClass6WF r15, C23871Ae r16, AnonymousClass1HC r17, String str, WeakReference weakReference, int i, boolean z) {
        WeakReference weakReference2 = weakReference;
        C225314u A002 = A00(weakReference2);
        AnonymousClass6WF r11 = r15;
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            r15.A02.set(false);
            return;
        }
        WeakReference A0F = AnonymousClass001.A0F(A002);
        boolean A0A = AnonymousClass1RC.A0A(A002);
        String A0v = C90514aH.A0v(r15.A04);
        ((C1266064r) r15.A05.get()).A00(new AnonymousClass715(r11, r16, r17, weakReference2, i, z), C113345fO.A00, "com.bloks.www.avatar.editor.cds.launcher.async", A0v, str, A0F, A0A);
    }

    public AnonymousClass6WF(C19730wQ r4, AnonymousClass5l6 r5, C19970wo r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass004 r9, AnonymousClass004 r10, AnonymousClass004 r11) {
        C36321k7.A1B(r6, r4, r5, r9, r7);
        C36321k7.A13(r10, r8, r11);
        this.A01 = r6;
        this.A04 = r4;
        this.A00 = r5;
        this.A08 = r9;
        this.A05 = r7;
        this.A09 = r10;
        this.A06 = r8;
        this.A07 = r11;
    }

    public static final C225314u A00(WeakReference weakReference) {
        C225314u r2 = (C225314u) weakReference.get();
        if (r2 != null) {
            C225314u r3 = null;
            if (!r2.isDestroyed()) {
                r3 = r2;
            }
            if (!r2.isFinishing()) {
                return r3;
            }
        }
        return null;
    }

    public static final void A02(C225314u r3, C111855cx r4) {
        if (A01(r4) instanceof IOException) {
            Log.e("AvatarEditorLauncher/unable to launch editor, network/io exception identified", A01(r4));
            r3.BO9(new Object[0], 0, R.string.f12nameremoved);
        } else {
            r3.BO5(R.string.f12nameremoved);
        }
        Log.e("AvatarEditorLauncher/unable to load avatar", A01(r4));
    }
}
