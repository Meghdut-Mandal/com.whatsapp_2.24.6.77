package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.1Ng  reason: invalid class name and case insensitive filesystem */
public final class C27191Ng implements C236119d {
    public final AnonymousClass19A A00;
    public final C27181Nf A01;
    public final C19970wo A02;

    public C27191Ng(C27181Nf r2, C19970wo r3, AnonymousClass19A r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r2;
    }

    public void BVN(String str) {
    }

    public void BWw(C203399nx r8, String str) {
        long j;
        TimeUnit timeUnit;
        long j2;
        AnonymousClass00C.A0D(r8, 1);
        int A002 = AnonymousClass3ME.A00(r8);
        C27181Nf r5 = this.A01;
        if (A002 == 404) {
            r5.A01(-1);
            return;
        }
        int i = C27181Nf.A00(r5).getInt("biz_block_reasons_api_back_off_days", 0);
        if (i == 0) {
            r5.A01(1);
            j = C19970wo.A00(this.A02);
            timeUnit = TimeUnit.DAYS;
            j2 = 1;
        } else if (1 <= i && i < 16) {
            r5.A01(i * 2);
            j = C27181Nf.A00(r5).getLong("biz_block_reasons_api_cooling_timestamp", 0);
            timeUnit = TimeUnit.DAYS;
            j2 = (long) i;
        } else {
            return;
        }
        C27181Nf.A00(r5).edit().putLong("biz_block_reasons_api_cooling_timestamp", j + timeUnit.toMillis(j2)).apply();
    }

    public void BiM(C203399nx r12, String str) {
        String A0e;
        AnonymousClass00C.A0D(r12, 1);
        C203399nx A0c = r12.A0c("mobile_config");
        if (A0c != null) {
            C203399nx A0c2 = A0c.A0c("list");
            if (!(A0c2 == null || A0c2.A02 == null || !"biz_block_reasons".equals(A0c2.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null)))) {
                int A002 = AnonymousClass6R8.A00(A0c2.A0i("v", (String) null), 0);
                String A0i = A0c2.A0i("language", (String) null);
                if (A002 > 0 && A0i != null) {
                    List<C203399nx> A0j = A0c2.A0j("item");
                    AnonymousClass00C.A08(A0j);
                    ArrayList arrayList = new ArrayList();
                    for (C203399nx r1 : A0j) {
                        String A0i2 = r1.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                        if (!(A0i2 == null || (A0e = r1.A0e()) == null)) {
                            arrayList.add(new AnonymousClass011(A0i2, A0e));
                        }
                    }
                    Map A09 = C000400e.A09(arrayList);
                    if (!A09.isEmpty()) {
                        String A0i3 = A0c2.A0i("country", (String) null);
                        C27181Nf r5 = this.A01;
                        C27181Nf.A00(r5).edit().putInt("biz_block_reasons_version", A002).apply();
                        C27181Nf.A00(r5).edit().putString("biz_block_reasons_language", A0i).apply();
                        C27181Nf.A00(r5).edit().putString("biz_block_reasons_country", A0i3).apply();
                        C27181Nf.A00(r5).edit().putString("biz_block_reasons", new JSONObject(A09).toString()).apply();
                    }
                }
            }
            C27181Nf r0 = this.A01;
            r0.A01(0);
            C27181Nf.A00(r0).edit().putLong("biz_block_reasons_api_cooling_timestamp", 0).apply();
        }
    }
}
