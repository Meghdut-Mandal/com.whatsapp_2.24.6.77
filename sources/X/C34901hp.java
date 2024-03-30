package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1hp  reason: invalid class name and case insensitive filesystem */
public final class C34901hp {
    public final AnonymousClass1X4 A00;
    public final WfalManager A01;
    public final C34911hq A02;
    public final C35011i0 A03;
    public final C28781Ua A04;
    public final Map A05;

    public C34901hp(AnonymousClass1X4 r2, WfalManager wfalManager, C34911hq r4, C35011i0 r5, C28781Ua r6) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(wfalManager, 4);
        AnonymousClass00C.A0D(r5, 5);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = wfalManager;
        this.A03 = r5;
        this.A05 = linkedHashMap;
    }

    public static final boolean A02(AnonymousClass3T1 r2) {
        if ((r2 instanceof AnonymousClass2bV) || (r2 instanceof C181788o2) || (r2 instanceof C46882bp) || (r2 instanceof C181798o3)) {
            return true;
        }
        return r2 instanceof C46812bi;
    }

    public void A03() {
        if (this.A04.A00()) {
            ((C145046tG) this.A03.A0D.get()).A00 = false;
        }
    }

    public void A04() {
        if (this.A04.A00()) {
            ((C145046tG) this.A03.A0D.get()).A00 = true;
        }
    }

    public void A05(Context context, AnonymousClass3T1 r6) {
        AnonymousClass3XT r1;
        Map map = this.A05;
        String str = r6.A1J.A01;
        if (!map.containsKey(str)) {
            if (A02(r6)) {
                AnonymousClass00C.A07(str);
                map.put(str, r6);
            }
            if (AnonymousClass6Y4.A07(r6) && (r6 instanceof AnonymousClass2bV) && (r1 = r6.A0c.A01) != null) {
                if ((r1.A03 || r1.A04) && this.A04.A00()) {
                    C35011i0 r3 = this.A03;
                    r3.A03.Boy(new C35661j3(r6, context, r3, 22));
                }
            }
        }
    }

    public static final void A00(Context context, View.OnClickListener onClickListener, AnonymousClass0NP r6, AnonymousClass15K r7, C34901hp r8) {
        AnonymousClass3ZU BHi = r7.BHi(R.string.f12nameremoved, 3500, true);
        if (r6 != null) {
            BHi.A01.A0V(r6);
        }
        BHi.A04(new C35141iD(r6, onClickListener, BHi, 3), R.string.f12nameremoved);
        int A002 = AnonymousClass00F.A00(context, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
        AnonymousClass0Eq r1 = BHi.A01.A0J;
        AnonymousClass00C.A08(r1);
        View A022 = C012005e.A02(r1, R.id.snackbar_action);
        AnonymousClass00C.A08(A022);
        ((TextView) A022).setTextColor(A002);
        BHi.A02();
        r8.A05.clear();
    }

    public static final void A01(AnonymousClass15K r4, C34901hp r5, Set set) {
        set.size();
        r4.BHi(R.string.f12nameremoved, 2000, false).A02();
        AnonymousClass1X4 r52 = r5.A00;
        if (r52.A1C.A00()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 r3 = (AnonymousClass3T1) it.next();
                if (!C66013Ui.A0n(r3)) {
                    C64933Qa r1 = r3.A1J;
                    if (r1.A02 && (r1.A00 instanceof C177528dw)) {
                        C29761Xw.A02(r3, r52.A1D.A0A, (Long) null, (String) null, 20);
                    }
                }
            }
        }
        r52.A0d(set, true);
    }

    public void A06(Context context, AnonymousClass3T1 r13, AnonymousClass15K r14) {
        if (A02(r13)) {
            Map map = this.A05;
            String str = r13.A1J.A01;
            if (map.containsKey(str)) {
                AnonymousClass00C.A07(str);
                map.put(str, r13);
                Collection<AnonymousClass3T1> values = map.values();
                if (values == null || !values.isEmpty()) {
                    for (AnonymousClass3T1 r0 : values) {
                        if (r0.A0H <= 0) {
                            return;
                        }
                    }
                }
                Collection values2 = map.values();
                AnonymousClass00C.A0D(values2, 0);
                Iterator it = values2.iterator();
                while (true) {
                    Context context2 = context;
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass3XT r02 = ((AnonymousClass3T1) it.next()).A0c.A01;
                    if (r02 != null && r02.A03) {
                        if (this.A04.A00()) {
                            C122805vS r7 = new C122805vS(context, r14, this, new HashSet(map.values()));
                            Collection values3 = map.values();
                            AnonymousClass00C.A0D(values3, 0);
                            ArrayList arrayList = new ArrayList();
                            for (Object next : values3) {
                                AnonymousClass3XT r03 = ((AnonymousClass3T1) next).A0c.A01;
                                if (r03 != null && r03.A03) {
                                    arrayList.add(next);
                                }
                            }
                            C35011i0 r8 = this.A03;
                            AnonymousClass1UZ r3 = (AnonymousClass1UZ) r8.A0G.get();
                            r3.A06("auto_xpost_status_share_view", "INIT_CROSSPOST", 927599499);
                            r3.A02(Boolean.valueOf(AnonymousClass00C.A0J(((AnonymousClass1UM) r8.A0C.get()).A01(C35011i0.A0K), true)), "is_auto_crosspost");
                            r8.A03.Boy(new C35561it(context2, r7, r8, 1, arrayList));
                            map.clear();
                            return;
                        }
                    }
                }
                AnonymousClass6R9.A02(map.values());
                A00(context, new C35141iD(this, new HashSet(map.values()), r14, 4), (AnonymousClass0NP) null, r14, this);
            }
        }
    }

    public void A07(AnonymousClass3T1 r4) {
        if (A02(r4)) {
            String str = r4.A1J.A01;
            AnonymousClass00C.A07(str);
            this.A05.remove(str);
            AnonymousClass3XT r1 = r4.A0c.A01;
            if (r1 != null) {
                if (AnonymousClass6R9.A01(r4)) {
                    List singletonList = Collections.singletonList(r4);
                    AnonymousClass00C.A08(singletonList);
                    AnonymousClass6R9.A02(singletonList);
                }
                if (AnonymousClass6Y4.A07(r4) && r1.A03 && this.A04.A00()) {
                    ((C145046tG) this.A03.A0D.get()).A06.put(str, r4);
                }
            }
        }
    }
}
