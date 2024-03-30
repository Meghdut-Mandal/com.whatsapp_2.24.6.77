package X;

import android.text.TextUtils;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Eo  reason: invalid class name and case insensitive filesystem */
public class C129006Eo {
    public Long A00;
    public boolean A01;
    public final C19970wo A02;
    public final AnonymousClass5DR A03;
    public final C20810yC A04;
    public final AnonymousClass1QW A05;
    public final AtomicBoolean A06 = C36431kI.A1H();
    public final C20830yE A07;

    public static Integer A00(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        return businessDirectoryContextualSearchViewModel.A0O.A03();
    }

    public AnonymousClass6QG A01() {
        try {
            AnonymousClass5DR r3 = this.A03;
            String string = r3.A03.A00().getString("current_search_location", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return AnonymousClass6QG.A01(AnonymousClass6RZ.A00(r3.A00, r3.A02, string));
        } catch (Exception e) {
            Log.e("SearchLocationRepository/readSearchLocation: Failed to fetch the search location", e);
            return null;
        }
    }

    public boolean A04() {
        if (this.A05.A07()) {
            return this.A07.A05();
        }
        AnonymousClass5DR r1 = this.A03;
        return r1.A03.A00().getBoolean("location_access_granted", r1.A00.A07());
    }

    public C129006Eo(AnonymousClass5DR r2, C19970wo r3, C20830yE r4, C20810yC r5, AnonymousClass1QW r6) {
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r4;
        this.A05 = r6;
        this.A03 = r2;
    }

    public AnonymousClass6QG A02() {
        AnonymousClass6QG A012 = A01();
        if (A012 == null) {
            return null;
        }
        if ("device".equals(A012.A08) && (this.A01 || !this.A05.A07())) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.A00;
            if (l == null || 86400000 < currentTimeMillis - l.longValue()) {
                return null;
            }
        }
        return A012;
    }

    public Integer A03() {
        int i;
        AnonymousClass6QG A012 = A01();
        if (A012 != null) {
            i = A012.A02();
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }
}
