package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.4ve  reason: invalid class name and case insensitive filesystem */
public class C100774ve extends C42791zU {
    public HashMap A00 = AnonymousClass001.A0J();
    public AnonymousClass4TT[] A01;
    public final HashMap A02 = AnonymousClass001.A0J();
    public final HashMap A03 = AnonymousClass001.A0J();
    public final HashSet A04 = C36441kJ.A16();
    public final C18820ts A05;

    public C100774ve(C18820ts r2, AnonymousClass4TT[] r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A05 = r2;
        this.A01 = r3;
        A01(this, r3);
    }

    public /* bridge */ /* synthetic */ Object A0M(ViewGroup viewGroup, int i) {
        int i2;
        AnonymousClass00C.A0D(viewGroup, 0);
        int A002 = A00(i);
        C18740tg.A06(this.A01[A002]);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            AnonymousClass0UE r1 = (AnonymousClass0UE) it.next();
            RecyclerView recyclerView = ((C147396x9) this.A01[A002]).A04;
            if (recyclerView != null) {
                recyclerView.A0v(r1);
            }
        }
        AnonymousClass4TT r7 = this.A01[A002];
        String id = r7.getId();
        this.A00.put(id, r7);
        C147396x9 r72 = (C147396x9) r7;
        LayoutInflater layoutInflater = r72.A0C;
        if (!(r72 instanceof C106675Ku)) {
            if (!(r72 instanceof C106665Kt)) {
                if (r72 instanceof C106685Kv) {
                    ((C106685Kv) r72).A08.A0L();
                } else if (r72 instanceof C106655Ks) {
                    i2 = R.layout.f9nameremoved;
                }
            }
            i2 = R.layout.f9nameremoved;
        } else if (((C106675Ku) r72) instanceof C106635Kq) {
            i2 = R.layout.f9nameremoved;
        } else {
            i2 = R.layout.f9nameremoved;
        }
        View A0K = C36381kD.A0K(layoutInflater, i2);
        A0K.setBackgroundColor(r72.A09);
        r72.A04 = C90504aG.A0J(A0K, R.id.sticker_grid);
        int i3 = r72.A00;
        if (i3 <= 0) {
            i3 = 1;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i3);
        r72.A03 = gridLayoutManager;
        r72.A04.setLayoutManager(gridLayoutManager);
        r72.A04.A0t(new C96264n3(r72.A0E, r72.A02));
        RecyclerView recyclerView2 = r72.A04;
        C96064mj A003 = r72.A00();
        recyclerView2.suppressLayout(false);
        RecyclerView.A0E(A003, recyclerView2, true, false);
        recyclerView2.A0z(true);
        recyclerView2.requestLayout();
        RecyclerView recyclerView3 = r72.A04;
        recyclerView3.A0v(new C96424nJ(recyclerView3.getResources(), r72.A03, r72.A0D));
        r72.A03(A0K);
        r72.A01();
        A0K.setTag(id);
        viewGroup.addView(A0K, 0);
        C18740tg.A04(A0K);
        return A0K;
    }

    private final int A00(int i) {
        int length;
        C18820ts r1 = this.A05;
        if (C36351kA.A1Y(r1)) {
            length = i;
        } else {
            length = (this.A01.length - 1) - i;
        }
        if (length < 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            AnonymousClass000.A1N(objArr, 0, C36351kA.A1Y(r1));
            AnonymousClass000.A1L(objArr, this.A01.length, 1);
            AnonymousClass000.A1L(objArr, i, 2);
            Log.i(C90494aF.A0e(locale, "ContentPagerAdapter/getAbsolutePosition/absolutePosition < 0, isLtr: %s, pages.length: %d, position: %d", Arrays.copyOf(objArr, 3)));
        }
        return length;
    }

    public static final void A01(C100774ve r5, AnonymousClass4TT[] r6) {
        r5.A01 = r6;
        HashMap hashMap = r5.A03;
        hashMap.clear();
        int length = r6.length;
        for (int i = 0; i < length; i++) {
            C36341k9.A1K(r6[i].getId(), hashMap, r5.A00(i));
        }
    }

    public int A0H() {
        return this.A01.length;
    }

    public /* bridge */ /* synthetic */ int A0L(Object obj) {
        View view = (View) obj;
        AnonymousClass00C.A0D(view, 0);
        Object tag = view.getTag();
        C90494aF.A10(tag);
        Number A10 = C36441kJ.A10(tag, this.A03);
        if (A10 != null) {
            HashMap hashMap = this.A02;
            if (A10.equals(hashMap.get(tag))) {
                return -1;
            }
            hashMap.put(tag, A10);
            return A10.intValue();
        }
        this.A02.remove(tag);
        return -2;
    }

    public /* bridge */ /* synthetic */ void A0N(ViewGroup viewGroup, Object obj, int i) {
        View view = (View) obj;
        C36321k7.A0v(viewGroup, 0, view);
        int A002 = A00(i);
        Object tag = view.getTag();
        C90494aF.A10(tag);
        viewGroup.removeView(view);
        AnonymousClass4TT r3 = (AnonymousClass4TT) this.A00.remove(tag);
        if (r3 != null) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                AnonymousClass0UE r1 = (AnonymousClass0UE) it.next();
                RecyclerView recyclerView = ((C147396x9) r3).A04;
                if (recyclerView != null) {
                    recyclerView.A0w(r1);
                }
            }
            r3.BVR(viewGroup, view, A002);
        }
    }

    public /* bridge */ /* synthetic */ boolean A0P(View view, Object obj) {
        C36321k7.A0w(view, obj);
        return C36361kB.A1a(view, obj);
    }
}
