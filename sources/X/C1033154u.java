package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: X.54u  reason: invalid class name and case insensitive filesystem */
public class C1033154u extends C26481Ki {
    public final C18820ts A00;
    public final C24651Dg A01;
    public final C24601Db A02;
    public final C19630wG A03;
    public final AnonymousClass13E A04;
    public final C21080yd A05;

    public synchronized File A02(String str) {
        File A0w = C36441kJ.A0w(C90514aH.A0j(this.A03), str);
        if (!A0w.exists()) {
            return null;
        }
        return A0w;
    }

    public boolean A0B() {
        return true;
    }

    public boolean A0E(String str, Map map, byte[] bArr) {
        return true;
    }

    public boolean A04(File file) {
        if (file == null || file.length() == 0) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ String A05(Object obj) {
        return C36371kC.A0t(this.A02.A03(), "payments_error_map_tag");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj, String str) {
        C36341k9.A0x(C90494aF.A0E(this.A02), "payments_error_map_tag", str);
    }

    public /* bridge */ /* synthetic */ boolean A0C(InputStream inputStream, Object obj, Map map) {
        FileOutputStream A0W;
        File A022 = A02("payments_error_map.json");
        if (A022 != null) {
            AnonymousClass6YY.A0P(A022);
        }
        File A023 = super.A02("");
        if (A023 == null) {
            Log.e("PAY:ErrorMapAssetManager/storeAssets/ Could not prepare resource directory");
            return false;
        }
        try {
            A0W = C90524aI.A0W(C90524aI.A0T(A023.getAbsolutePath(), "payments_error_map.json"));
            AnonymousClass6YY.A0J(inputStream, A0W);
            A0W.close();
            return true;
        } catch (IOException e) {
            Log.e("PAY:ErrorMapAssetManager/store Failed!", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ boolean A0D(Object obj) {
        return !A04(A02("payments_error_map.json"));
    }

    public void A0F() {
        File A022;
        C145206tW r3 = new C145206tW(this);
        C24601Db r1 = this.A02;
        if (C19970wo.A00(r1.A01) - r1.A03().getLong("payments_error_map_last_sync_time_millis", (System.currentTimeMillis() - 604800000) - 1) > 604800000 || A0G()) {
            if (A0G() && (A022 = A02("payments_error_map.json")) != null) {
                AnonymousClass6YY.A0P(A022);
            }
            String BAI = this.A01.BAI();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("https://static.whatsapp.net/payments/error_map?product_type=payments_p2p_fbpay&country=");
            A0u.append(BAI);
            A0u.append("&lg=");
            A0u.append(this.A00.A06());
            A0u.append("&platform=android&app_type=");
            A0u.append("CONSUMER");
            A0u.append("&api_version=");
            super.A03(r3, (Object) null, AnonymousClass000.A0q("1", A0u), (Map) null);
        }
    }

    public boolean A0G() {
        String A0t = C36371kC.A0t(this.A02.A03(), "error_map_key");
        String BAI = this.A01.BAI();
        if (A0t == null) {
            return true;
        }
        String[] split = A0t.split("_");
        if (!split[0].equals(BAI) || !split[1].equals(this.A00.A06()) || !split[2].equals("1")) {
            return true;
        }
        return false;
    }

    public C1033154u(C20050ww r8, C19630wG r9, C18820ts r10, AnonymousClass13E r11, C24651Dg r12, C24601Db r13, C21080yd r14, C19770wU r15) {
        super(r8, r9, r11, r14, r15, C36401kF.A0k());
        this.A03 = r9;
        this.A00 = r10;
        this.A05 = r14;
        this.A04 = r11;
        this.A02 = r13;
        this.A01 = r12;
    }
}
