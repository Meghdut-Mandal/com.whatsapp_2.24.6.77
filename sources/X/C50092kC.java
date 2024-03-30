package X;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.2kC  reason: invalid class name and case insensitive filesystem */
public class C50092kC extends C132446Tt {
    public long A00;
    public String A01;
    public final Pair A02;
    public final C226515g A03 = new AnonymousClass3MK(this, 9);
    public final C24341Cb A04;
    public final C20060wx A05;
    public final AnonymousClass3XH A06;
    public final AnonymousClass147 A07;
    public final AnonymousClass39X A08;
    public final C31211bS A09;
    public final AnonymousClass3PY A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        Pair A0Q;
        C225314u r3 = this.A08.A00;
        if (r3.isFinishing()) {
            return null;
        }
        if (!this.A0E) {
            return new C597935h((File) null, (String) null);
        }
        C20060wx r2 = this.A05;
        long A022 = r2.A02();
        this.A01 = Environment.getExternalStorageState();
        if (this.A04.A03(this.A03)) {
            this.A00 = r2.A01();
        }
        AnonymousClass3PY r6 = this.A0A;
        String str2 = this.A0B;
        String str3 = this.A0C;
        long j = this.A00;
        String str4 = this.A01;
        Pair pair = this.A02;
        List list = this.A0D;
        AnonymousClass147 r7 = this.A07;
        synchronized (r6) {
            C31211bS r5 = r6.A01;
            r5.A07();
            String str5 = str2;
            AnonymousClass147 r17 = r7;
            Pair pair2 = pair;
            C225314u r15 = r3;
            C31211bS r14 = r5;
            String A052 = r14.A05(r15, pair2, r17, str5, str3, (String) null, str4, list, (List) null, (JSONObject) null, j, A022, true, false, false);
            Log.i(A052);
            File A002 = C31211bS.A00(r3, A052);
            File A003 = AnonymousClass3PY.A00(r6, A002, 3);
            if (A003 == null || A003.length() > 5242880) {
                A003 = r5.A04(A002, 3, false, false, r6.A02());
                str = r5.A06((String) null);
            } else {
                str = null;
            }
            A0Q = C36441kJ.A0Q(A003, str);
        }
        C31211bS r62 = this.A09;
        long j2 = this.A00;
        String str6 = this.A01;
        return new C597935h((File) A0Q.first, r62.A05(r3, pair, r7, str2, str3, (String) A0Q.second, str6, list, C54612tE.A00(this.A06), (JSONObject) null, j2, A022, false, false, false));
    }

    public void A0A() {
        AnonymousClass39X r0 = this.A08;
        if (r0 != null) {
            C225314u r1 = r0.A00;
            if (!r1.isFinishing()) {
                r1.Bu1(R.string.f12nameremoved);
            }
        }
        C31211bS r3 = this.A09;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("contactsupporttask");
        C36321k7.A1Z(A0u, ": PRIVACY SETTINGS BEGIN");
        for (AnonymousClass4UH BOw : (Set) r3.A0B.get()) {
            BOw.BOw("contactsupporttask");
        }
        C36321k7.A1Z(AnonymousClass000.A0v("contactsupporttask"), ": PRIVACY SETTINGS END");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean z;
        String str;
        String str2;
        Uri A012;
        C597935h r2 = (C597935h) obj;
        AnonymousClass39X r0 = this.A08;
        if (r0 != null && r2 != null) {
            File file = r2.A00;
            String str3 = r2.A01;
            C225314u r13 = r0.A00;
            AnonymousClass3FE r3 = r0.A01;
            C61913Dz r12 = r3.A02;
            String str4 = r0.A02;
            ArrayList arrayList = r0.A04;
            String str5 = r0.A03;
            String string = r13.getString(R.string.f12nameremoved);
            StringBuilder A0u = AnonymousClass000.A0u();
            if (str4 != null) {
                A0u.append(str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                A0u.append(str3);
            } else {
                A0u.append("\n");
            }
            StringBuilder sb = new StringBuilder(A0u.toString());
            if (arrayList == null || arrayList.isEmpty()) {
                z = false;
                str = "android.intent.action.SEND";
            } else {
                z = true;
                str = "android.intent.action.SEND_MULTIPLE";
            }
            Intent A0I = C36441kJ.A0I(str);
            if (file == null) {
                A0I.setType("plain/text");
                sb.append("No log file to attach.\n");
            } else {
                if (z) {
                    str2 = "*/*";
                } else {
                    str2 = "application/zip";
                }
                A0I.setType(str2);
                A0I.setFlags(1);
                if (r12.A01.A02()) {
                    A012 = MediaProvider.A04("support", "logs");
                } else {
                    A012 = AnonymousClass6YY.A01(r13, file);
                }
                if (z) {
                    arrayList.add(A012);
                } else {
                    A0I.putExtra("android.intent.extra.STREAM", A012);
                }
            }
            String[] strArr = new String[1];
            if (str5 == null) {
                str5 = "android@support.whatsapp.com";
            }
            strArr[0] = str5;
            A0I.putExtra("android.intent.extra.EMAIL", strArr);
            A0I.putExtra("android.intent.extra.SUBJECT", string);
            A0I.putExtra("android.intent.extra.TEXT", sb.toString());
            if (r12.A00.A0E(1664)) {
                A0I.putExtra("android.intent.extra.CC", new String[]{"bugs@whatsapp.com"});
            }
            if (z) {
                A0I.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                ArrayList A15 = C36441kJ.A15(arrayList);
                ClipData clipData = new ClipData(string, new String[]{"application/zip", "image/*"}, new ClipData.Item((Uri) A15.get(0)));
                A15.remove(0);
                Iterator it = A15.iterator();
                while (it.hasNext()) {
                    clipData.addItem(new ClipData.Item((Uri) it.next()));
                }
                A0I.setClipData(clipData);
                A0I.setFlags(1);
            }
            boolean A002 = r12.A00(r13, A0I, r13, r13.getString(R.string.f12nameremoved), true);
            r13.Bnv();
            if (r13 instanceof AnonymousClass4S7) {
                ((AnonymousClass4S7) r13).Beo(A002);
            }
            r3.A00 = null;
        }
    }

    public C50092kC(Pair pair, C24341Cb r4, C20060wx r5, AnonymousClass3XH r6, AnonymousClass147 r7, AnonymousClass39X r8, C31211bS r9, AnonymousClass3PY r10, String str, String str2, List list, boolean z) {
        this.A05 = r5;
        this.A09 = r9;
        this.A04 = r4;
        this.A0A = r10;
        this.A08 = r8;
        this.A0B = str;
        this.A0C = str2;
        this.A02 = pair;
        this.A0D = list;
        this.A0E = z;
        this.A06 = r6;
        this.A07 = r7;
    }
}
