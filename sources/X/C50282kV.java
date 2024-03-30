package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.2kV  reason: invalid class name and case insensitive filesystem */
public class C50282kV extends C132446Tt {
    public ProgressDialog A00;
    public final Bundle A01;
    public final AnonymousClass3DY A02;
    public final C21100yf A03;
    public final C20050ww A04;
    public final C18820ts A05;
    public final C207249un A06;
    public final C202319lY A07;
    public final AnonymousClass13E A08;
    public final C24631De A09;
    public final C24611Dc A0A = C24611Dc.A00("PaymentSupportTask", "payment-settings", "COMMON");
    public final String A0B;
    public final WeakReference A0C;

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0175 A[Catch:{ all -> 0x01c2, all -> 0x01c7, all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0185 A[Catch:{ all -> 0x01c2, all -> 0x01c7, all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b9 A[Catch:{ all -> 0x01c2, all -> 0x01c7, all -> 0x01cc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.ref.WeakReference r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            r16 = 0
            if (r0 == 0) goto L_0x01e8
            org.json.JSONObject r5 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = "android"
            java.lang.String r7 = "platform"
            r5.put(r7, r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            X.1De r2 = r1.A09     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            X.9l8 r0 = r2.A02()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            if (r0 == 0) goto L_0x00cf
            X.9l8 r0 = r2.A02()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r2 = r0.A03     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
        L_0x0025:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "country"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
        L_0x0030:
            X.0ts r0 = r1.A05     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = r0.A06()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r2 = "lang"
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r3 = r1.A0B     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = "context"
            r5.put(r0, r3)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r3 = "version"
            java.lang.String r0 = "v2"
            r5.put(r3, r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            org.json.JSONObject r6 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            X.9lY r8 = r1.A07     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            if (r8 == 0) goto L_0x0096
            java.lang.String r0 = r8.A0J     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            if (r0 != 0) goto L_0x0060
            java.lang.String r4 = r8.A0J     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = "error_code"
            r6.put(r0, r4)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
        L_0x0060:
            int r0 = r8.A03     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r4 = X.C203419nz.A02(r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = "type"
            r6.put(r0, r4)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            int r4 = r8.A03     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            int r0 = r8.A02     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r4 = X.C203419nz.A03(r4, r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "transaction_status"
            r6.put(r0, r4)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
        L_0x007e:
            X.9un r4 = r1.A06     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            if (r4 == 0) goto L_0x0091
            java.lang.String r0 = r4.A0B     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            if (r0 != 0) goto L_0x0091
            java.lang.String r4 = r4.A0B     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = "bank_name"
            r6.put(r0, r4)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
        L_0x0091:
            java.lang.String r0 = "transaction_info"
            r5.put(r0, r6)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
        L_0x0096:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            r4.<init>()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = "https"
            r4.scheme(r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = "faq.whatsapp.com"
            r4.authority(r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = "inappsupport"
            r4.appendPath(r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r0 = "payments"
            r4.appendPath(r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            X.13E r11 = r1.A08     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            android.net.Uri r0 = r4.build()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r13 = r0.toString()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.String r14 = r5.toString()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            java.lang.Integer r12 = X.C36401kF.A0k()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            r5 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r15 = r16
            X.6v1 r4 = X.AnonymousClass13E.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            goto L_0x00d2
        L_0x00cf:
            r2 = 0
            goto L_0x0025
        L_0x00d2:
            X.0ww r8 = r1.A04     // Catch:{ all -> 0x01cc }
            r0 = 20
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01cc }
            X.5RE r6 = r4.B8D(r8, r15, r6)     // Catch:{ all -> 0x01cc }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x01cc }
            r0.<init>(r6)     // Catch:{ all -> 0x01cc }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x01cc }
            r6.<init>(r0)     // Catch:{ all -> 0x01cc }
            r11 = 2048(0x800, float:2.87E-42)
            char[] r10 = new char[r11]     // Catch:{ all -> 0x01c2 }
            int r9 = r6.read(r10, r5, r11)     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01c2 }
        L_0x00f4:
            r0 = -1
            if (r9 == r0) goto L_0x00ff
            r8.append(r10, r5, r9)     // Catch:{ all -> 0x01c2 }
            int r9 = r6.read(r10, r5, r11)     // Catch:{ all -> 0x01c2 }
            goto L_0x00f4
        L_0x00ff:
            java.lang.String r10 = r8.toString()     // Catch:{ all -> 0x01c2 }
            X.1Dc r8 = r1.A0A     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "result="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r10, r5)     // Catch:{ all -> 0x01c2 }
            r8.A07(r0)     // Catch:{ all -> 0x01c2 }
            r9 = 0
            if (r10 != 0) goto L_0x0118
            r0 = r15
            goto L_0x01bb
        L_0x0118:
            org.json.JSONObject r10 = X.C36441kJ.A1C(r10)     // Catch:{ all -> 0x01c2 }
            boolean r0 = r10.has(r3)     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x016a
            int r12 = r10.getInt(r3)     // Catch:{ all -> 0x01c2 }
        L_0x0126:
            java.lang.String r3 = "payment_faqs"
            boolean r0 = r10.has(r3)     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x016c
            org.json.JSONArray r15 = r10.getJSONArray(r3)     // Catch:{ all -> 0x01c2 }
            int r0 = r15.length()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x016c
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01c2 }
            r14 = 0
        L_0x013d:
            int r0 = r15.length()     // Catch:{ all -> 0x01c2 }
            if (r14 >= r0) goto L_0x016d
            org.json.JSONObject r3 = r15.getJSONObject(r14)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "title"
            java.lang.String r13 = r3.getString(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "description"
            java.lang.String r11 = r3.getString(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "url"
            java.lang.String r8 = r3.getString(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "id"
            java.lang.String r3 = r3.getString(r0)     // Catch:{ all -> 0x01c2 }
            X.3XR r0 = new X.3XR     // Catch:{ all -> 0x01c2 }
            r0.<init>(r13, r11, r8, r3)     // Catch:{ all -> 0x01c2 }
            r5.add(r0)     // Catch:{ all -> 0x01c2 }
            int r14 = r14 + 1
            goto L_0x013d
        L_0x016a:
            r12 = 1
            goto L_0x0126
        L_0x016c:
            r5 = r9
        L_0x016d:
            java.lang.String r3 = "topics"
            boolean r0 = r10.has(r3)     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x01b9
            org.json.JSONArray r0 = r10.getJSONArray(r3)     // Catch:{ all -> 0x01c2 }
            java.util.ArrayList r3 = r1.A00(r0, r12)     // Catch:{ all -> 0x01c2 }
        L_0x017d:
            java.lang.String r8 = "mapped_faq"
            boolean r0 = r10.has(r8)     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x01b3
            org.json.JSONObject r8 = r10.getJSONObject(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "title"
            java.lang.String r10 = r8.optString(r0)     // Catch:{ all -> 0x01c2 }
            r8.optString(r7)     // Catch:{ all -> 0x01c2 }
            r8.optString(r2)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "url"
            java.lang.String r11 = r8.optString(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "id"
            java.lang.String r12 = r8.optString(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "description"
            java.lang.String r13 = r8.optString(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = "open_flow"
            r0 = 1
            boolean r14 = r8.optBoolean(r2, r0)     // Catch:{ all -> 0x01c2 }
            X.39N r9 = new X.39N     // Catch:{ all -> 0x01c2 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01c2 }
        L_0x01b3:
            X.37B r0 = new X.37B     // Catch:{ all -> 0x01c2 }
            r0.<init>(r9, r5, r3)     // Catch:{ all -> 0x01c2 }
            goto L_0x01bb
        L_0x01b9:
            r3 = r9
            goto L_0x017d
        L_0x01bb:
            r6.close()     // Catch:{ all -> 0x01cc }
            r4.close()     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
            return r0
        L_0x01c2:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x01c7 }
            goto L_0x01cb
        L_0x01c7:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x01cc }
        L_0x01cb:
            throw r2     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x01d1 }
            goto L_0x01d5
        L_0x01d1:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
        L_0x01d5:
            throw r2     // Catch:{ JSONException -> 0x01d8, IOException -> 0x01d6 }
        L_0x01d6:
            r3 = move-exception
            goto L_0x01d9
        L_0x01d8:
            r3 = move-exception
        L_0x01d9:
            X.1Dc r2 = r1.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "error e="
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r3)
            r2.A0A(r0, r3)
        L_0x01e8:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50282kV.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        Context A0G = C36441kJ.A0G(this.A0C);
        if (A0G != null) {
            if (this.A00 == null) {
                ProgressDialog progressDialog = new ProgressDialog(A0G);
                this.A00 = progressDialog;
                AnonymousClass4XV.A00(progressDialog, this, 15);
                this.A00.setCanceledOnTouchOutside(false);
            }
            if (!this.A00.isShowing()) {
                C36391kE.A17(this.A00, A0G, R.string.f12nameremoved);
                this.A00.setIndeterminate(true);
                this.A00.show();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r20) {
        /*
            r19 = this;
            r9 = r20
            X.37B r9 = (X.AnonymousClass37B) r9
            r2 = r19
            java.lang.ref.WeakReference r0 = r2.A0C
            X.14u r10 = X.C36411kG.A0W(r0)
            if (r10 == 0) goto L_0x0066
            if (r9 == 0) goto L_0x00be
            X.39N r4 = r9.A00
            r5 = 48
            if (r4 == 0) goto L_0x0067
            android.os.Bundle r8 = r2.A01
            r1 = 3
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.type"
            r8.putInt(r0, r1)
            java.lang.String r7 = r4.A02
            java.lang.String r3 = r4.A00
            java.lang.String r0 = r4.A03
            java.lang.String r6 = r4.A01
            boolean r4 = r4.A04
            java.lang.String r1 = r2.A0B
            android.content.Intent r3 = X.C36381kD.A0E(r10, r7, r3, r0)
            java.lang.String r0 = "article_id"
            r3.putExtra(r0, r6)
            java.lang.String r0 = "show_contact_support_button"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "contact_us_context"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "describe_problem_fields"
            r3.putExtra(r0, r8)
            if (r4 == 0) goto L_0x004b
            java.util.ArrayList r1 = r9.A02
            java.lang.String r0 = "payments_support_topics"
            r3.putParcelableArrayListExtra(r0, r1)
        L_0x004b:
            r10.BuO(r3, r5)
            r1 = 2130772051(0x7f010053, float:1.714721E38)
            r0 = 2130772053(0x7f010055, float:1.7147214E38)
            r10.overridePendingTransition(r1, r0)
        L_0x0057:
            android.app.ProgressDialog r0 = r2.A00
            if (r0 == 0) goto L_0x0066
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0066
            android.app.ProgressDialog r0 = r2.A00
            r0.cancel()
        L_0x0066:
            return
        L_0x0067:
            java.util.ArrayList r8 = r9.A01
            if (r8 == 0) goto L_0x00ab
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00ab
            java.lang.String r7 = r2.A0B
            android.os.Bundle r6 = r2.A01
            java.util.ArrayList r4 = r9.A02
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.from"
            r3.putExtra(r0, r7)
            int r1 = r8.size()
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.count"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "describe_problem_bundle"
            r3.putExtra(r0, r6)
            java.lang.String r0 = "payments_support_faqs"
            r3.putExtra(r0, r8)
            java.lang.String r0 = "payments_support_topics"
            r3.putExtra(r0, r4)
            java.lang.String r1 = "com.whatsapp.support.faq.SearchFAQ.usePaymentsFlow"
            r0 = 1
            r3.putExtra(r1, r0)
        L_0x00a7:
            r10.BuO(r3, r5)
            goto L_0x0057
        L_0x00ab:
            java.util.ArrayList r4 = r9.A02
            if (r4 == 0) goto L_0x00be
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00be
            android.os.Bundle r3 = r2.A01
            r1 = 1
            r0 = 3
            android.content.Intent r3 = X.AnonymousClass190.A0T(r10, r3, r4, r1, r0)
            goto L_0x00a7
        L_0x00be:
            X.0yf r1 = r2.A03
            X.0yi r0 = X.C21100yf.A0d
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = 2131892374(0x7f121896, float:1.9419494E38)
            r10.BO5(r0)
            goto L_0x0057
        L_0x00cf:
            X.3DY r9 = r2.A02
            r18 = 0
            java.lang.String r14 = r2.A0B
            r12 = 0
            java.lang.Integer r13 = X.C36371kC.A0n()
            android.os.Bundle r11 = r2.A01
            r16 = r12
            r17 = r12
            r15 = r12
            android.content.Intent r1 = r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.putExtras(r11)
            r0 = 48
            r10.BuO(r1, r0)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50282kV.A0C(java.lang.Object):void");
    }

    public C50282kV(Bundle bundle, C225314u r5, AnonymousClass3DY r6, C21100yf r7, C20050ww r8, C18820ts r9, C207249un r10, C202319lY r11, AnonymousClass13E r12, C24631De r13, String str) {
        this.A0C = AnonymousClass001.A0F(r5);
        this.A04 = r8;
        this.A03 = r7;
        this.A02 = r6;
        this.A05 = r9;
        this.A08 = r12;
        this.A09 = r13;
        this.A0B = str;
        this.A06 = r10;
        this.A07 = r11;
        this.A01 = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r2.getBoolean("children_skippable") == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r15 == 2) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList A00(org.json.JSONArray r14, int r15) {
        /*
            r13 = this;
            int r0 = r14.length()
            r10 = 0
            if (r0 != 0) goto L_0x0008
            return r10
        L_0x0008:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r3 = 0
        L_0x000d:
            int r0 = r14.length()
            if (r3 >= r0) goto L_0x00a4
            org.json.JSONObject r2 = r14.getJSONObject(r3)
            java.lang.String r0 = "id"
            java.lang.String r7 = r2.getString(r0)
            java.lang.String r0 = "title"
            java.lang.String r8 = r2.getString(r0)
            java.lang.String r1 = "children"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x00a2
            org.json.JSONArray r0 = r2.getJSONArray(r1)
            java.util.ArrayList r11 = r13.A00(r0, r15)
        L_0x0033:
            java.lang.String r1 = "children_skippable"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r2.getBoolean(r1)
            r12 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r12 = 0
        L_0x0043:
            r5 = 2
            if (r15 != r5) goto L_0x008b
            java.lang.String r1 = "description"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r9 = r2.getString(r1)
        L_0x0052:
            java.lang.String r1 = "chat_support"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x008f
            org.json.JSONObject r6 = r2.getJSONObject(r1)
            java.lang.String r0 = "auth_required"
            boolean r5 = r6.getBoolean(r0)
            java.lang.String r1 = "required_data"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x0091
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            org.json.JSONArray r6 = r6.getJSONArray(r1)
            r1 = 0
        L_0x0075:
            int r0 = r6.length()
            if (r1 >= r0) goto L_0x0085
            java.lang.String r0 = r6.getString(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0085:
            X.9uA r6 = new X.9uA
            r6.<init>(r2, r5)
            goto L_0x0096
        L_0x008b:
            r9 = r10
            if (r15 != r5) goto L_0x008f
            goto L_0x0052
        L_0x008f:
            r6 = r10
            goto L_0x0096
        L_0x0091:
            X.9uA r6 = new X.9uA
            r6.<init>(r10, r5)
        L_0x0096:
            X.3Xc r5 = new X.3Xc
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.add(r5)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x00a2:
            r11 = r10
            goto L_0x0033
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50282kV.A00(org.json.JSONArray, int):java.util.ArrayList");
    }
}
