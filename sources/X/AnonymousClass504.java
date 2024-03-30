package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.504  reason: invalid class name */
public class AnonymousClass504 extends C142266ob {
    public final AnonymousClass6KK A00;

    public AnonymousClass504(AnonymousClass6KK r8) {
        super("wa.action.phoenix.FcsReturnResult", "wa.action.phoenix.FcsReturnResultV2", "wa.action.phoenix.FdsIq", "wa.action.phoenix.FdsIqV2", "wa.action.phoenix.statemachine.GoBack", "wa.action.phoenix.statemachine.GoBackV2", "wa.action.phoenix.FcsReturnResumableData");
        this.A00 = r8;
    }

    public static String A00(C100674vP r1) {
        Object obj = r1.A00.A02.A00().get(R.id.bloks_data_module_namespace_manager);
        Objects.requireNonNull(obj);
        return ((C120335rL) obj).A00;
    }

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r13, C115215iW r14, C124125xd r15) {
        AnonymousClass9XM r0;
        C203619oP r02;
        C203619oP r03;
        C164197rQ r1;
        C164197rQ r12;
        C164197rQ r16;
        C162097o1 r17;
        AnonymousClass01I r4;
        C100674vP r152 = (C100674vP) r15;
        String str = r14.A00;
        short s = -1;
        switch (str.hashCode()) {
            case -1883695124:
                s = C90504aG.A0y("wa.action.phoenix.FcsReturnResultV2", str);
                break;
            case -579883706:
                s = C90514aH.A1B("wa.action.phoenix.FdsIqV2", str);
                break;
            case -574422768:
                s = C90514aH.A1C("wa.action.phoenix.statemachine.GoBackV2", str);
                break;
            case -266954039:
                if (str.equals("wa.action.phoenix.FcsReturnResumableData")) {
                    s = 3;
                    break;
                }
                break;
            case 775692624:
                if (str.equals("wa.action.phoenix.FcsReturnResult")) {
                    s = 4;
                    break;
                }
                break;
        }
        switch (s) {
            case 0:
            case 4:
                List list = r13.A00;
                Map A0k = C90494aF.A0k(list, 0);
                C160377ku A0H = C90464aC.A0H(list, 1);
                C160377ku A0H2 = C90464aC.A0H(list, 2);
                C160377ku A0H3 = C90464aC.A0H(list, 3);
                HashMap A0J = AnonymousClass001.A0J();
                if (A0H != null) {
                    r1 = C164197rQ.A00(A0H, 26);
                } else {
                    r1 = null;
                }
                A0J.put("onStartLoading", r1);
                if (A0H2 != null) {
                    r12 = C164197rQ.A00(A0H2, 26);
                } else {
                    r12 = null;
                }
                A0J.put("onLoadingCompletion", r12);
                if (A0H3 != null) {
                    r16 = C164197rQ.A00(A0H3, 26);
                } else {
                    r16 = null;
                }
                A0J.put("onLoadingFailure", r16);
                AnonymousClass6KK r5 = this.A00;
                Activity A01 = C142326oh.A01(r152);
                C164207rR r2 = new C164207rR(r152, 1);
                String A002 = A00(r152);
                AnonymousClass00C.A0D(A01, 0);
                C203639oR A003 = r5.A00.A00(A002);
                if (A003 != null) {
                    if ((A01 instanceof AnonymousClass01L) && (r4 = (AnonymousClass01I) A01) != null) {
                        AnonymousClass01z supportFragmentManager = r4.getSupportFragmentManager();
                        AnonymousClass00C.A08(supportFragmentManager);
                        BkFcsPreloadingScreenFragment A004 = AnonymousClass6KK.A00(supportFragmentManager, r5);
                        if (A004 != null) {
                            A004.A07 = A0J;
                            A004.A00 = r2;
                        }
                    }
                    if (A0k != null) {
                        C203619oP r22 = A003.A00;
                        C194679Qr r18 = null;
                        if (r22 != null) {
                            r18 = r22.A05;
                        }
                        if (r18 instanceof AnonymousClass8h2) {
                            String str2 = ((AnonymousClass8h2) r18).A03;
                            if (!(r22 == null || (r17 = (C162097o1) r22.A0A(str2)) == null || !(r17 instanceof C162087o0))) {
                                r17.B7N(A0k);
                                return null;
                            }
                        }
                        Log.e("WaBkPhoenixInterpreterExtImpl: current resource is not a Bloks resource");
                        return null;
                    }
                }
                break;
            case 1:
                List list2 = r13.A00;
                String A0s = C36401kF.A0s(list2, 0);
                String A0i = C90474aD.A0i(list2);
                String A0j = C90474aD.A0j(list2);
                Map A0k2 = C90494aF.A0k(list2, 3);
                AnonymousClass6KK r11 = this.A00;
                String A005 = A00(r152);
                C1260162f r42 = new C1260162f(r152, r13, this);
                C36331k8.A1I(A0s, A0i);
                AnonymousClass6EW r9 = null;
                try {
                    C107885Rg valueOf = C107885Rg.valueOf(A0i);
                    C203639oR A006 = r11.A00.A00(A005);
                    if (A006 != null) {
                        C203619oP r04 = A006.A00;
                        if (r04 != null) {
                            r9 = r11.A02.A02(r04.A0N);
                            r9.A02(new C149126zy(false));
                        }
                        A006.A0A(new C147326x2(r42, A006, r9, A0s), valueOf, new C128166Be(A0s, A0j, A0k2), A0s);
                        return null;
                    }
                    r42.A00(C201759kL.A01((Integer) null, (String) null, (String) null, (Map) null));
                    return null;
                } catch (IllegalArgumentException unused) {
                    r42.A00(C201759kL.A01((Integer) null, (String) null, (String) null, (Map) null));
                    return null;
                }
            case 2:
                String A02 = AnonymousClass6MO.A02(r13, 0);
                AnonymousClass6KK r05 = this.A00;
                C203639oR A007 = r05.A00.A00(A00(r152));
                if (!(A007 == null || (r03 = A007.A00) == null)) {
                    r03.A0J.A02(new AnonymousClass707(A02, (String) null, false));
                    return null;
                }
            case 3:
                List list3 = r13.A00;
                Map A0k3 = C90494aF.A0k(list3, 0);
                String A0s2 = C36401kF.A0s(list3, 1);
                AnonymousClass6KK r23 = this.A00;
                String A008 = A00(r152);
                AnonymousClass00C.A0D(A0s2, 1);
                if (A0k3 == null) {
                    A0k3 = null;
                }
                C203639oR A009 = r23.A00.A00(A008);
                if (A009 == null || (r02 = A009.A00) == null) {
                    Map map = r23.A01.A00;
                    Iterator A10 = AnonymousClass000.A10(map);
                    if (A10.hasNext()) {
                        Object next = A10.next();
                        while (A10.hasNext()) {
                            String A0C = AnonymousClass001.A0C(A10);
                            next = (String) next;
                            AnonymousClass9XM r19 = (AnonymousClass9XM) map.get(next);
                            AnonymousClass9XM r06 = (AnonymousClass9XM) map.get(A0C);
                            if (!(r19 == null || r06 == null || r19.A00 > r06.A00)) {
                                next = A0C;
                            }
                        }
                        r0 = (AnonymousClass9XM) map.get(next);
                    } else {
                        throw AnonymousClass001.A0E("Empty collection can't be reduced.");
                    }
                } else {
                    r0 = r02.A06;
                }
                if (r0 != null) {
                    r0.A02(A0s2, A0k3);
                    return null;
                }
                break;
        }
        return null;
    }
}
