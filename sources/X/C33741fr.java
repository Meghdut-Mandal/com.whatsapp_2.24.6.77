package X;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.Iterator;

/* renamed from: X.1fr  reason: invalid class name and case insensitive filesystem */
public class C33741fr implements C33681fl {
    public static int A07 = 1;
    public static int A08 = 2;
    public static int A09 = 3;
    public static int A0A = -1;
    public static int A0B = -1;
    public static boolean A0C;
    public View A00;
    public final C33571fa A01;
    public final C19420v0 A02;
    public final C21010yW A03;
    public final C32901eN A04;
    public final AnonymousClass1A6 A05;
    public final C19970wo A06;

    private View A00() {
        ViewGroup.MarginLayoutParams layoutParams;
        if (this.A00 == null) {
            C33571fa r3 = this.A01;
            LayoutInflater from = LayoutInflater.from(r3.getContext());
            if (A0C) {
                WDSBanner wDSBanner = (WDSBanner) from.inflate(R.layout.f9nameremoved, r3, false);
                if (!C222013h.A05) {
                    int dimensionPixelSize = r3.getContext().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    if (wDSBanner.getLayoutParams() != null) {
                        layoutParams = (ViewGroup.MarginLayoutParams) wDSBanner.getLayoutParams();
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    layoutParams.setMargins(layoutParams.leftMargin, dimensionPixelSize, layoutParams.rightMargin, dimensionPixelSize);
                    wDSBanner.requestLayout();
                }
                wDSBanner.setOnDismissListener((AnonymousClass00S) new C44032Kw(this, 0));
                r3.setBackgroundColor(AnonymousClass00F.A00(r3.getContext(), R.color.f6nameremoved));
                this.A00 = wDSBanner;
            } else {
                View inflate = from.inflate(R.layout.f9nameremoved, r3, false);
                this.A00 = inflate;
                C012005e.A02(inflate, R.id.dismiss_groups_banner_container).setOnClickListener(new C35161iF((Object) this, 12));
                r3.setBackgroundResource(C224514j.A00(r3.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            }
        }
        return this.A00;
    }

    public static void A01(C33741fr r6) {
        r6.A03.Blw(new C44282Mt());
        r6.A01.A01(1, 3);
        C19420v0 r5 = r6.A02;
        C19420v0.A00(r5).putInt("education_banner_count", A08).apply();
        r6.BK9();
        int i = ((SharedPreferences) r5.A00.get()).getInt("create_group_tip_count", 0) + 1;
        C19420v0.A00(r5).putInt("create_group_tip_count", i).putLong("create_group_tip_time", C19970wo.A00(r6.A06)).apply();
    }

    public void BK9() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bt0() {
        C19420v0 r3 = this.A02;
        AnonymousClass005 r8 = r3.A00;
        int i = ((SharedPreferences) r8.get()).getInt("create_group_tip_count", 0);
        long j = ((SharedPreferences) r8.get()).getLong("create_group_tip_time", 0);
        AnonymousClass1A6 r5 = this.A05;
        if ((A0B <= 0 || ((SharedPreferences) r8.get()).getInt("groups_banner_total_day_count", 0) <= A0B) && (A0A <= 0 || ((SharedPreferences) r8.get()).getInt("groups_banner_click_count", 0) < A0A)) {
            C220412q.A00(r5.A02);
            AnonymousClass1A7 r2 = r5.A01;
            synchronized (r2) {
                Iterator it = r2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AnonymousClass143.A0G(((AnonymousClass3I6) it.next()).A01)) {
                            break;
                        }
                    } else if (r5.A02() < A09 || i >= A07 || j + 2592000000L >= C19970wo.A00(this.A06) || !C33571fa.A00(r3)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void BwS() {
        if (this.A00 == null) {
            this.A01.addView(A00());
        }
        C33571fa r2 = this.A01;
        r2.setOnClickListener(new C35161iF((Object) this, 13));
        r2.A01(1, 1);
        C19420v0 r5 = this.A02;
        if (r5.A2V("education_banner_timestamp", 86400000)) {
            AnonymousClass005 r6 = r5.A00;
            C19420v0.A00(r5).putInt("education_banner_count", ((SharedPreferences) r6.get()).getInt("education_banner_count", 0) + 1).apply();
            C19420v0.A00(r5).putInt("groups_banner_total_day_count", ((SharedPreferences) r6.get()).getInt("groups_banner_total_day_count", 0) + 1).apply();
            r5.A1Z("education_banner_timestamp");
        }
        A00().setVisibility(0);
    }

    public C33741fr(C33571fa r3, AnonymousClass1A6 r4, C19970wo r5, C19420v0 r6, C20810yC r7, C21010yW r8, C32901eN r9) {
        this.A06 = r5;
        this.A03 = r8;
        this.A04 = r9;
        this.A01 = r3;
        this.A02 = r6;
        this.A05 = r4;
        C21000yV r1 = C21000yV.A02;
        A07 = C20800yB.A00(r1, r7, 354);
        A08 = C20800yB.A00(r1, r7, 351);
        A09 = C20800yB.A00(r1, r7, 350);
        A0B = C20800yB.A00(r1, r7, 352);
        A0A = C20800yB.A00(r1, r7, 353);
        A0C = AnonymousClass1MI.A00(r7);
    }
}
