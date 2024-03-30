package X;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.1fz  reason: invalid class name and case insensitive filesystem */
public class C33821fz implements C33681fl {
    public View A00;
    public String A01;
    public final C24801Dv A02;
    public final C33571fa A03;
    public final C19420v0 A04;
    public final C20810yC A05;
    public final C21010yW A06;
    public final AnonymousClass004 A07;

    public void BK9() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bt0() {
        long j;
        AnonymousClass3KG r0 = (AnonymousClass3KG) this.A07.get();
        if (r0 == null) {
            return false;
        }
        long j2 = r0.A03;
        long j3 = r0.A02;
        C19420v0 r8 = this.A04;
        if (j2 > 5000000000L) {
            j = 500000000;
        } else {
            j = (long) (((float) (j2 * ((long) ((int) ((((float) 500000000) * 100.0f) / 5.0E9f))))) / 100.0f);
        }
        boolean z = false;
        if (j3 <= j) {
            z = true;
        }
        AnonymousClass005 r2 = r8.A00;
        if (((SharedPreferences) r2.get()).getBoolean("storage_usage_banner_dismissed", false)) {
            if (!z) {
                C19420v0.A00(r8).putBoolean("storage_usage_banner_dismissed", false).apply();
                return false;
            }
        } else if (!z) {
            return false;
        }
        if (!((SharedPreferences) r2.get()).getBoolean("storage_usage_banner_dismissed", false)) {
            return true;
        }
        return false;
    }

    public void BwS() {
        if (this.A01 == null) {
            this.A01 = C55582ur.A00(this.A06, 3);
        }
        if (this.A00 == null) {
            boolean A002 = AnonymousClass1MI.A00(this.A05);
            C33571fa r4 = this.A03;
            LayoutInflater from = LayoutInflater.from(r4.getContext());
            if (A002) {
                WDSBanner wDSBanner = (WDSBanner) from.inflate(R.layout.f9nameremoved, r4, false);
                wDSBanner.setOnClickListener(new C35161iF((Object) this, 20));
                wDSBanner.setOnDismissListener((AnonymousClass00S) new C44032Kw(this, 1));
                if (!C222013h.A05) {
                    wDSBanner.A07();
                }
                this.A00 = wDSBanner;
            } else {
                View inflate = from.inflate(R.layout.f9nameremoved, r4, false);
                this.A00 = inflate;
                inflate.setOnClickListener(new C35161iF((Object) this, 21));
                C012005e.A02(this.A00, R.id.storage_usage_full_close_container).setOnClickListener(new C35161iF((Object) this, 22));
                View view = this.A00;
                view.setBackgroundResource(C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            }
            r4.addView(this.A00);
        }
        View view2 = this.A00;
        C18740tg.A04(view2);
        view2.setVisibility(0);
    }

    public C33821fz(C24801Dv r1, C33571fa r2, C19420v0 r3, C20810yC r4, C21010yW r5, AnonymousClass004 r6) {
        this.A05 = r4;
        this.A06 = r5;
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A07 = r6;
    }
}
