package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Hz  reason: invalid class name */
public abstract class AnonymousClass0Hz extends AnonymousClass0CZ implements C15830o3 {
    public boolean A00 = false;
    public boolean A01 = false;
    public AnonymousClass0U6 A02;
    public final C000700i A03 = new C000700i();
    public final C000700i A04 = new C000700i();
    public final C000700i A05 = new C000700i();
    public final AnonymousClass01z A06;
    public final AnonymousClass01M A07;

    private Long A00(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            C000700i r1 = this.A04;
            if (i2 >= r1.A00()) {
                return l;
            }
            if (AnonymousClass000.A0I(r1.A04(i2)) == i) {
                if (l == null) {
                    l = Long.valueOf(r1.A02(i2));
                } else {
                    throw AnonymousClass001.A09("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i2++;
        }
    }

    public long A0E(int i) {
        return (long) i;
    }

    public abstract AnonymousClass02E A0L(int i);

    private void A01(long j) {
        ViewParent parent;
        C000700i r4 = this.A03;
        AnonymousClass02E r3 = (AnonymousClass02E) r4.A05(j);
        if (r3 != null) {
            View view = r3.A0F;
            if (!(view == null || (parent = view.getParent()) == null)) {
                ((ViewGroup) parent).removeAllViews();
            }
            if (!A0O(j)) {
                this.A05.A08(j);
            }
            if (r3.A12()) {
                AnonymousClass01z r2 = this.A06;
                if (r2.A0r()) {
                    this.A00 = true;
                    return;
                }
                if (A0O(j)) {
                    this.A05.A0A(j, r2.A0K(r3));
                }
                AnonymousClass09Y r0 = new AnonymousClass09Y(r2);
                r0.A08(r3);
                r0.A03();
            }
            r4.A08(j);
        }
    }

    public /* bridge */ /* synthetic */ void A0F(AnonymousClass0D3 r1) {
        A0N((AnonymousClass0IF) r1);
        A0M();
    }

    public void A0H(RecyclerView recyclerView) {
        if (this.A02 == null) {
            AnonymousClass0U6 r3 = new AnonymousClass0U6(this);
            this.A02 = r3;
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                ViewPager2 viewPager2 = (ViewPager2) parent;
                r3.A03 = viewPager2;
                C18240sq r1 = new C18240sq(r3, 0);
                r3.A02 = r1;
                viewPager2.A05.A00.add(r1);
                AnonymousClass0I0 r12 = new AnonymousClass0I0(r3);
                r3.A01 = r12;
                AnonymousClass0Hz r0 = r3.A05;
                r0.BnA(r12);
                FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(r3);
                r3.A00 = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
                r0.A07.A04(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3);
                return;
            }
            throw AnonymousClass000.A0f(parent, "Expected ViewPager2 instance. Got: ", AnonymousClass000.A0u());
        }
        throw new IllegalArgumentException();
    }

    public void A0I(RecyclerView recyclerView) {
        AnonymousClass0U6 r3 = this.A02;
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            ((ViewPager2) parent).A05.A00.remove(r3.A02);
            AnonymousClass0Hz r2 = r3.A05;
            r2.A01.unregisterObserver(r3.A01);
            r2.A07.A05(r3.A00);
            r3.A03 = null;
            this.A02 = null;
            return;
        }
        throw AnonymousClass000.A0f(parent, "Expected ViewPager2 instance. Got: ", AnonymousClass000.A0u());
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r4) {
        Long A002 = A00(r4.A0H.getId());
        if (A002 != null) {
            long longValue = A002.longValue();
            A01(longValue);
            this.A04.A08(longValue);
        }
    }

    public void A0M() {
        C000700i r5;
        AnonymousClass02E r0;
        View view;
        if (this.A00 && !this.A06.A0r()) {
            C000000a r4 = new C000000a(0);
            int i = 0;
            while (true) {
                r5 = this.A03;
                if (i >= r5.A00()) {
                    break;
                }
                long A022 = r5.A02(i);
                if (!A0O(A022)) {
                    r4.add(Long.valueOf(A022));
                    this.A04.A08(A022);
                }
                i++;
            }
            if (!this.A01) {
                this.A00 = false;
                for (int i2 = 0; i2 < r5.A00(); i2++) {
                    long A023 = r5.A02(i2);
                    if (this.A04.A01(A023) < 0 && ((r0 = (AnonymousClass02E) r5.A05(A023)) == null || (view = r0.A0F) == null || view.getParent() == null)) {
                        r4.add(Long.valueOf(A023));
                    }
                }
            }
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                A01(((Number) it.next()).longValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(X.AnonymousClass0IF r8) {
        /*
            r7 = this;
            X.00i r2 = r7.A03
            long r0 = r8.A07
            java.lang.Object r4 = r2.A05(r0)
            X.02E r4 = (X.AnonymousClass02E) r4
            java.lang.String r2 = "Design assumption violated."
            if (r4 == 0) goto L_0x009f
            android.view.View r5 = r8.A0H
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            android.view.View r1 = r4.A0F
            boolean r0 = r4.A12()
            if (r0 != 0) goto L_0x0021
            if (r1 == 0) goto L_0x0048
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)
            throw r0
        L_0x0021:
            if (r1 != 0) goto L_0x0038
            X.01z r0 = r7.A06
            X.0Hd r3 = new X.0Hd
            r3.<init>(r5, r4, r7)
            r2 = 0
            X.025 r0 = r0.A0S
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A00
            X.05O r0 = new X.05O
            r0.<init>(r3, r2)
            r1.add(r0)
            return
        L_0x0038:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x0048
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == r5) goto L_0x008f
        L_0x0044:
            A02(r1, r5)
            return
        L_0x0048:
            boolean r0 = r4.A12()
            if (r0 != 0) goto L_0x0044
            X.01z r6 = r7.A06
            boolean r0 = r6.A0r()
            if (r0 != 0) goto L_0x0090
            X.0Hd r2 = new X.0Hd
            r2.<init>(r5, r4, r7)
            r5 = 0
            X.025 r0 = r6.A0S
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A00
            X.05O r0 = new X.05O
            r0.<init>(r2, r5)
            r1.add(r0)
            X.09Y r3 = new X.09Y
            r3.<init>(r6)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "f"
            r2.append(r0)
            long r0 = r8.A07
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.A0D(r4, r0)
            X.01P r0 = X.AnonymousClass01P.STARTED
            r3.A0C(r4, r0)
            r3.A03()
            X.0U6 r0 = r7.A02
            r0.A00(r5)
        L_0x008f:
            return
        L_0x0090:
            boolean r0 = r6.A0E
            if (r0 != 0) goto L_0x008f
            X.01M r1 = r7.A07
            androidx.viewpager2.adapter.FragmentStateAdapter$2 r0 = new androidx.viewpager2.adapter.FragmentStateAdapter$2
            r0.<init>(r7, r8)
            r1.A04(r0)
            return
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Hz.A0N(X.0IF):void");
    }

    public boolean A0O(long j) {
        if (j < 0 || j >= ((long) A0J())) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        AnonymousClass0IF r82 = (AnonymousClass0IF) r8;
        long j = r82.A07;
        FrameLayout frameLayout = (FrameLayout) r82.A0H;
        int id = frameLayout.getId();
        Long A002 = A00(id);
        if (A002 != null) {
            long longValue = A002.longValue();
            if (longValue != j) {
                A01(longValue);
                this.A04.A08(longValue);
            }
        }
        this.A04.A0A(j, Integer.valueOf(id));
        long j2 = (long) i;
        C000700i r5 = this.A03;
        if (r5.A01(j2) < 0) {
            AnonymousClass02E A0L = A0L(i);
            A0L.A0x((C08740bF) this.A05.A05(j2));
            r5.A0A(j2, A0L);
        }
        if (C011304x.A02(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new C09080bn(frameLayout, this, r82));
            } else {
                throw AnonymousClass001.A09("Design assumption violated.");
            }
        }
        A0M();
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        List list = AnonymousClass0D3.A0I;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(AnonymousClass04F.A00());
        frameLayout.setSaveEnabled(false);
        return new AnonymousClass0IF(frameLayout);
    }

    public AnonymousClass0Hz(AnonymousClass01z r2, AnonymousClass01M r3) {
        this.A06 = r2;
        this.A07 = r3;
        super.A0B(true);
    }

    public static void A02(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw AnonymousClass001.A09("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public /* bridge */ /* synthetic */ boolean A0G(AnonymousClass0D3 r2) {
        return true;
    }
}
