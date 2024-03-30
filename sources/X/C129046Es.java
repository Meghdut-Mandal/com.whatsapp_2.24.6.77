package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.6Es  reason: invalid class name and case insensitive filesystem */
public abstract class C129046Es {
    public int A00;
    public int A01;
    public int A02;
    public C100774ve A03;
    public C160157kY A04;
    public final Context A05;
    public final AnonymousClass0UE A06;
    public final ViewPager A07;
    public final C18820ts A08;
    public final LayoutInflater A09;
    public final AnonymousClass0UE A0A = new C162517oi(this, 13);
    public final AnonymousClass0UE A0B = new C162517oi(this, 14);

    public C129046Es(Context context, ViewGroup viewGroup, AnonymousClass0UE r7, C18820ts r8, int i) {
        C36421kH.A1J(context, 1, r7);
        this.A05 = context;
        this.A08 = r8;
        this.A06 = r7;
        LayoutInflater from = LayoutInflater.from(context);
        AnonymousClass00C.A08(from);
        this.A09 = from;
        this.A01 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A02 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        View findViewById = viewGroup.findViewById(i);
        ViewPager viewPager = (ViewPager) findViewById;
        viewPager.A0K(new C163417qA(this, 1));
        AnonymousClass00C.A08(findViewById);
        this.A07 = viewPager;
    }

    public final int A04() {
        int i;
        ViewPager viewPager;
        int currentItem;
        Integer num;
        C18820ts r8 = this.A08;
        if (C36351kA.A1Y(r8)) {
            viewPager = this.A07;
            currentItem = viewPager.getCurrentItem();
        } else {
            C100774ve r0 = this.A03;
            if (r0 != null) {
                i = r0.A01.length;
            } else {
                i = 0;
            }
            viewPager = this.A07;
            currentItem = (i - 1) - viewPager.getCurrentItem();
        }
        if (currentItem < 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            AnonymousClass000.A1N(objArr, 0, C36351kA.A1Y(r8));
            C100774ve r02 = this.A03;
            if (r02 != null) {
                num = Integer.valueOf(r02.A01.length);
            } else {
                num = null;
            }
            objArr[1] = num;
            AnonymousClass000.A1L(objArr, viewPager.getCurrentItem(), 2);
            Log.i(C90494aF.A0e(locale, "ContentPicker/getCurrentPageIndex < 0, isLtr: %s, pagerAdapter.getCount(): %d, viewPager.getCurrentItem(): %d", Arrays.copyOf(objArr, 3)));
        }
        return currentItem;
    }

    public void A05(int i) {
        C106665Kt r1;
        C106685Kv r12;
        if (this instanceof AnonymousClass5HA) {
            AnonymousClass5HA r13 = (AnonymousClass5HA) this;
            try {
                r13.A08(((AnonymousClass4TT) r13.A05.get(i)).getId());
            } catch (Exception e) {
                Log.e("AvatarStickerPicker/onPageSelected/Error changing selected page", e);
            }
        } else {
            AnonymousClass5H9 r5 = (AnonymousClass5H9) this;
            C147396x9 r6 = (C147396x9) r5.A0D.get(i);
            r6.A04(r5.A05, true);
            C147396x9 r2 = r5.A0C;
            if (!(r2 == null || r2 == r6)) {
                r2.A04((AnonymousClass11F) null, false);
            }
            r5.A0C = r6;
            if (r6 instanceof C106675Ku) {
                AnonymousClass68B r4 = ((C106675Ku) r6).A04;
                r4.A09 = false;
                AnonymousClass1AP r3 = r5.A0Y;
                r3.A0N.Boy(new C35771jE(r3, r4, 3));
            }
            if (!(r6.getId().equals("recents") || (r12 = r5.A0A) == null || r12.A04 == null)) {
                r12.A01();
            }
            if (!r6.getId().equals("starred") && (r1 = r5.A0B) != null && r1.A04 != null) {
                r1.A01();
            }
        }
    }

    public final void A06(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Integer num;
        boolean z2 = true;
        if (C36351kA.A1Y(this.A08)) {
            i3 = i;
        } else {
            C100774ve r0 = this.A03;
            if (r0 != null) {
                i2 = r0.A01.length;
            } else {
                i2 = 0;
            }
            i3 = (i2 - 1) - i;
        }
        if (i3 < 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            C100774ve r1 = this.A03;
            if (r1 != null) {
                num = Integer.valueOf(r1.A01.length);
            } else {
                num = null;
            }
            objArr[0] = num;
            AnonymousClass000.A1L(objArr, i, 1);
            Log.i(C90494aF.A0e(locale, "ContentPicker/selectPageByIndex/absoluteIndex < 0, pagerAdapter.getCount(): %d, index: %d", Arrays.copyOf(objArr, 2)));
        }
        C100774ve r12 = this.A03;
        if (r12 != null) {
            i4 = r12.A01.length;
        } else {
            i4 = 0;
        }
        if (i >= 0 && i < i4 && this.A00 != i3) {
            ViewPager viewPager = this.A07;
            if (z) {
                Boolean bool = C18750th.A01;
            } else {
                z2 = false;
            }
            viewPager.A0J(i3, z2);
        }
    }

    public final void A07(C100774ve r4) {
        this.A03 = r4;
        AnonymousClass0UE r0 = this.A0A;
        AnonymousClass00C.A0D(r0, 0);
        HashSet hashSet = r4.A04;
        hashSet.add(r0);
        AnonymousClass0UE r02 = this.A0B;
        AnonymousClass00C.A0D(r02, 0);
        hashSet.add(r02);
        this.A07.setAdapter(r4);
    }
}
