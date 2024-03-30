package X;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Bl  reason: invalid class name */
public class AnonymousClass0Bl {
    public Integer A00;
    public Integer A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final AnonymousClass02E A04;
    public final HashSet A05 = new HashSet();
    public final List A06 = new ArrayList();
    public final C022909q A07;

    public AnonymousClass0Bl(C02680Bk r3, C022909q r4, Integer num, Integer num2) {
        AnonymousClass02E r1 = r4.A02;
        this.A00 = num;
        this.A01 = num2;
        this.A04 = r1;
        r3.A05(new C02700Bn(this));
        this.A07 = r4;
    }

    public void A02() {
        if (!this.A03) {
            if (AnonymousClass01z.A0E(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
                Log.v("FragmentManager", sb.toString());
            }
            this.A03 = true;
            for (Runnable run : this.A06) {
                run.run();
            }
        }
        this.A07.A04();
    }

    public void A03() {
        float f;
        Integer num = this.A01;
        if (num == C023109s.A01) {
            C022909q r6 = this.A07;
            AnonymousClass02E r3 = r6.A02;
            View findFocus = r3.A0F.findFocus();
            if (findFocus != null) {
                AnonymousClass02E.A01(r3).A06 = findFocus;
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Saved focused view ");
                    sb.append(findFocus);
                    sb.append(" for Fragment ");
                    sb.append(r3);
                    Log.v("FragmentManager", sb.toString());
                }
            }
            View A0d = this.A04.A0d();
            if (A0d.getParent() == null) {
                r6.A03();
                A0d.setAlpha(0.0f);
            }
            if (A0d.getAlpha() == 0.0f && A0d.getVisibility() == 0) {
                A0d.setVisibility(4);
            }
            C023009r r0 = r3.A0H;
            if (r0 == null) {
                f = 1.0f;
            } else {
                f = r0.A00;
            }
            A0d.setAlpha(f);
        } else if (num == C023109s.A0C) {
            AnonymousClass02E r32 = this.A07.A02;
            View A0d2 = r32.A0d();
            if (AnonymousClass01z.A0E(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Clearing focus ");
                sb2.append(A0d2.findFocus());
                sb2.append(" on view ");
                sb2.append(A0d2);
                sb2.append(" for Fragment ");
                sb2.append(r32);
                Log.v("FragmentManager", sb2.toString());
            }
            A0d2.clearFocus();
        }
    }

    public final void A04() {
        if (!this.A02) {
            this.A02 = true;
            HashSet hashSet = this.A05;
            if (hashSet.isEmpty()) {
                A02();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((C02680Bk) it.next()).A03();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operation ");
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ");
        sb.append("{");
        sb.append("mFinalState = ");
        sb.append(A01(this.A00));
        sb.append("} ");
        sb.append("{");
        sb.append("mLifecycleImpact = ");
        sb.append(A00(this.A01));
        sb.append("} ");
        sb.append("{");
        sb.append("mFragment = ");
        sb.append(this.A04);
        sb.append("}");
        return sb.toString();
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NONE";
            case 1:
                return "ADDING";
            default:
                return "REMOVING";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "REMOVED";
            case 1:
                return "VISIBLE";
            case 2:
                return "GONE";
            default:
                return "INVISIBLE";
        }
    }

    public final void A05(Integer num, Integer num2) {
        Integer num3;
        int intValue = num2.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: For fragment ");
                    sb.append(this.A04);
                    sb.append(" mFinalState = ");
                    sb.append(A01(this.A00));
                    sb.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb.append(A00(this.A01));
                    sb.append(" to REMOVING.");
                    Log.v("FragmentManager", sb.toString());
                }
                this.A00 = C023109s.A00;
                num3 = C023109s.A0C;
            } else if (intValue == 0 && this.A00 != C023109s.A00) {
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.A04);
                    sb2.append(" mFinalState = ");
                    sb2.append(A01(this.A00));
                    sb2.append(" -> ");
                    sb2.append(A01(num));
                    sb2.append(". ");
                    Log.v("FragmentManager", sb2.toString());
                }
                this.A00 = num;
                return;
            } else {
                return;
            }
        } else if (this.A00 == C023109s.A00) {
            if (AnonymousClass01z.A0E(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SpecialEffectsController: For fragment ");
                sb3.append(this.A04);
                sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                sb3.append(A00(this.A01));
                sb3.append(" to ADDING.");
                Log.v("FragmentManager", sb3.toString());
            }
            num3 = C023109s.A01;
            this.A00 = num3;
        } else {
            return;
        }
        this.A01 = num3;
    }
}
