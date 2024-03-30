package X;

import android.net.Uri;
import com.whatsapp.Me;
import com.whatsapp.privacy.protocol.http.DisclosureContentWorker;
import com.whatsapp.privacy.protocol.http.DisclosureIconsWorker;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Dm  reason: invalid class name and case insensitive filesystem */
public class C24711Dm {
    public final C19730wQ A00;
    public final C19630wG A01;
    public final C18820ts A02;
    public final C21570zS A03;

    public void A01(List list, long j, boolean z) {
        String str;
        if (list.isEmpty()) {
            Log.w("DisclosureCmsDownloader/fetchDisclosures no disclosure ids to create uri");
            return;
        }
        C19730wQ r0 = this.A00;
        r0.A0G();
        Me me = r0.A00;
        if (me == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DisclosureCmsDownloader/fetchDisclosures could not create uri for disclosure ids ");
            sb.append(list);
            Log.e(sb.toString());
            return;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("whatsapp.com").appendPath("user-notice").appendPath("v2").appendQueryParameter("ids", A00(list));
        C18820ts r3 = this.A02;
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("lg", r3.A06()).appendQueryParameter("lc", r3.A05()).appendQueryParameter("cc", AnonymousClass1M4.A00(me.cc)).appendQueryParameter("platform", "android");
        if (this.A01.A00.getResources().getDisplayMetrics().densityDpi <= 240) {
            str = "hdpi";
        } else {
            str = "xxhdpi";
        }
        Uri build = appendQueryParameter2.appendQueryParameter("img-size", str).build();
        build.toString();
        if (j < 10000) {
            j = 10000;
        } else if (j > 18000000) {
            j = 18000000;
        }
        AnonymousClass6EH r32 = new AnonymousClass6EH();
        r32.A02("disclosure_ids", C34881hn.A00(list));
        r32.A01("handler", 2);
        r32.A00.put("url", build.toString());
        AnonymousClass6X2 A002 = r32.A00();
        C1271667f r1 = new C1271667f();
        r1.A00 = C023109s.A01;
        C132316Tb A003 = r1.A00();
        C97384pE r2 = new C97384pE(DisclosureContentWorker.class);
        r2.A06("tag.whatsapp.privacy.disclosure.content.fetch");
        Integer num = C023109s.A00;
        r2.A05(num, TimeUnit.MILLISECONDS, j);
        r2.A00.A0A = A002;
        C97384pE r12 = new C97384pE(DisclosureIconsWorker.class);
        r12.A06("tag.whatsapp.privacy.disclosure.icons.fetch");
        r12.A05(num, TimeUnit.MILLISECONDS, j);
        r12.A00.A0A = A002;
        if (z) {
            r2.A04(num);
            r12.A04(num);
        } else {
            r2.A03(A003);
            r12.A03(A003);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("tag.whatsapp.privacy.disclosure.content.fetch.");
        sb2.append(A00(list));
        String obj = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("DisclosureCmsDownloader/fetchDisclosures: worker name: ");
        sb3.append(obj);
        sb3.append("disclosure ids: ");
        sb3.append(list);
        sb3.append(", expedited: ");
        sb3.append(z);
        Log.w(sb3.toString());
        ((AnonymousClass6VR) this.A03.get()).A03((C97404pG) r2.A00(), num, obj).A03((C97404pG) r12.A00()).A02();
    }

    public C24711Dm(C19730wQ r1, C19630wG r2, C18820ts r3, C21570zS r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static String A00(List list) {
        if (list.size() == 0) {
            return "";
        }
        String obj = list.get(0).toString();
        for (int i = 1; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(",");
            sb.append(list.get(i).toString());
            obj = sb.toString();
        }
        return obj;
    }
}
