package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2kG  reason: invalid class name and case insensitive filesystem */
public class C50132kG extends C132446Tt {
    public long A00;
    public ProgressDialog A01;
    public C33761ft A02;
    public String A03;
    public String A04;
    public final C20050ww A05;
    public final C226515g A06 = new AnonymousClass3MK(this, 3);
    public final C24341Cb A07;
    public final C19420v0 A08;
    public final C18820ts A09;
    public final C20060wx A0A;
    public final AnonymousClass3XH A0B;
    public final AnonymousClass4TG A0C;
    public final AnonymousClass147 A0D;
    public final C31211bS A0E;
    public final AnonymousClass1M4 A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final WeakReference A0J;
    public final List A0K;
    public final Uri[] A0L;
    public final AnonymousClass1CF A0M;
    public final AnonymousClass3FE A0N;
    public final C20380xT A0O;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        BufferedOutputStream bufferedOutputStream;
        BufferedReader bufferedReader;
        JSONArray jSONArray;
        int length;
        Context A0G2 = C36441kJ.A0G(this.A0J);
        if (A0G2 != null) {
            C20060wx r3 = this.A0A;
            long A022 = r3.A02();
            this.A04 = Environment.getExternalStorageState();
            if (this.A07.A03(this.A06)) {
                this.A00 = r3.A01();
            }
            Pair A002 = this.A02.A00();
            C31211bS r9 = this.A0E;
            String str2 = this.A0G;
            String str3 = this.A0I;
            long j = this.A00;
            String str4 = this.A04;
            List list = this.A0K;
            C61063Ak r27 = null;
            String A052 = r9.A05(A0G2, A002, this.A0D, str2, str3, (String) null, str4, list, C54612tE.A00(this.A0B), (JSONObject) null, j, A022, true, true, true);
            this.A03 = A052;
            C36321k7.A1Q("searchSupportTask/doInBackground/debugInfo: ", A052, AnonymousClass000.A0u());
            try {
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https");
                builder.authority("faq.whatsapp.com");
                builder.appendPath("client_search.php");
                builder.appendQueryParameter("platform", "android");
                C18820ts r6 = this.A09;
                builder.appendQueryParameter("lg", r6.A06());
                builder.appendQueryParameter("lc", r6.A05());
                if (this.A0F.A04()) {
                    str = "1";
                } else {
                    str = "0";
                }
                builder.appendQueryParameter("eea", str);
                String str5 = this.A0H;
                builder.appendQueryParameter("query", str5);
                builder.appendQueryParameter("manufacturer", Build.MANUFACTURER);
                builder.appendQueryParameter("os_version", Build.VERSION.RELEASE);
                builder.appendQueryParameter("ccode", this.A08.A0f());
                Objects.requireNonNull("2.24.6.77");
                builder.appendQueryParameter("app_version", "2.24.6.77");
                builder.appendQueryParameter((String) A002.first, (String) A002.second);
                URLConnection openConnection = new URL(builder.toString()).openConnection();
                openConnection.setConnectTimeout(30000);
                openConnection.setReadTimeout(30000);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setDoOutput(true);
                String A0l = C36361kB.A0l();
                httpsURLConnection.setRequestProperty("Content-Type", AnonymousClass000.A0p("multipart/form-data; boundary=", A0l, AnonymousClass000.A0u()));
                C20050ww r7 = this.A05;
                try {
                    bufferedOutputStream = new BufferedOutputStream(C132776Vf.A01(r7, (Integer) null, 20, httpsURLConnection));
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("--");
                    A0u.append(A0l);
                    bufferedOutputStream.write(AnonymousClass000.A0q("\r\n", A0u).getBytes());
                    bufferedOutputStream.write("Content-Disposition: form-data; name=\"debug_info\"\r\n\r\n".getBytes());
                    bufferedOutputStream.write(this.A03.getBytes());
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("\r\n--");
                    A0u2.append(A0l);
                    bufferedOutputStream.write(AnonymousClass000.A0q("--\r\n", A0u2).getBytes());
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    AnonymousClass5RE A003 = C132776Vf.A00(r7, (Integer) null, 20, httpsURLConnection);
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(A003));
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            A0u3.append(readLine);
                        }
                        String obj = A0u3.toString();
                        if (!TextUtils.isEmpty(obj) && (length = jSONArray.length()) != 0) {
                            ArrayList A14 = C36441kJ.A14(length);
                            ArrayList A142 = C36441kJ.A14(length);
                            ArrayList A143 = C36441kJ.A14(length);
                            ArrayList A144 = C36441kJ.A14(length);
                            for (int i = 0; i < length; i++) {
                                JSONObject optJSONObject = (jSONArray = new JSONArray(obj)).optJSONObject(i);
                                A14.add(optJSONObject.getString("title"));
                                A142.add(optJSONObject.getString("description"));
                                A143.add(optJSONObject.getString("url"));
                                A144.add(optJSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                            }
                            ArrayList A0I2 = AnonymousClass001.A0I();
                            for (Uri uri : this.A0L) {
                                if (uri != null) {
                                    A0I2.add(uri);
                                }
                            }
                            r27 = new C61063Ak(str5, this.A03, A14, A142, A143, A144, A0I2, list, length);
                        }
                        bufferedReader.close();
                        A003.close();
                        return r27;
                    } catch (Throwable th) {
                        A003.close();
                        throw th;
                    }
                } catch (IOException | JSONException e) {
                    e = e;
                    Log.e(AnonymousClass000.A0l(e, "searchSupportTask/doInBackground/error: ", AnonymousClass000.A0u()), e);
                    return null;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } catch (IOException | JSONException e2) {
                e = e2;
                Log.e(AnonymousClass000.A0l(e, "searchSupportTask/doInBackground/error: ", AnonymousClass000.A0u()), e);
                return null;
            }
        }
        return null;
        throw th;
        throw th;
    }

    public void A0A() {
        Context A0G2 = C36441kJ.A0G(this.A0J);
        if (A0G2 != null) {
            if (this.A01 == null) {
                ProgressDialog progressDialog = new ProgressDialog(A0G2);
                this.A01 = progressDialog;
                AnonymousClass4XV.A00(progressDialog, this, 12);
                this.A01.setCancelable(false);
            }
            if (!this.A01.isShowing()) {
                ProgressDialog progressDialog2 = this.A01;
                boolean A002 = this.A0M.A00();
                int i = R.string.f12nameremoved;
                if (A002) {
                    i = R.string.f12nameremoved;
                }
                C36391kE.A17(progressDialog2, A0G2, i);
                this.A01.setIndeterminate(true);
                this.A01.show();
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C61063Ak r4 = (C61063Ak) obj;
        if (this.A0J.get() != null) {
            if (r4 != null) {
                try {
                    int i = r4.A00;
                    C36321k7.A1T("searchSupportTask/onPostExecute/result/count: ", AnonymousClass000.A0u(), i);
                    if (i > 0) {
                        AnonymousClass4TG r0 = this.A0C;
                        if (r0 != null) {
                            r0.Bfz(r4);
                        }
                        ProgressDialog progressDialog = this.A01;
                        if (progressDialog != null && progressDialog.isShowing()) {
                            this.A01.cancel();
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    Log.e(AnonymousClass000.A0l(e, "searchSupportTask/onPostExecute/error: ", AnonymousClass000.A0u()), e);
                }
            }
            AnonymousClass4TG r02 = this.A0C;
            if (r02 != null) {
                r02.BWQ();
            }
            ProgressDialog progressDialog2 = this.A01;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.A01.cancel();
            }
        }
    }

    public C50132kG(C225314u r3, C20050ww r4, C24341Cb r5, C19420v0 r6, C18820ts r7, C20060wx r8, AnonymousClass3XH r9, AnonymousClass1CF r10, C33761ft r11, AnonymousClass4TG r12, AnonymousClass147 r13, AnonymousClass3FE r14, C20380xT r15, C31211bS r16, AnonymousClass1M4 r17, String str, String str2, String str3, List list, Uri[] uriArr) {
        this.A0J = AnonymousClass001.A0F(r3);
        this.A05 = r4;
        this.A0F = r17;
        this.A0A = r8;
        this.A0O = r15;
        this.A09 = r7;
        this.A0E = r16;
        this.A07 = r5;
        this.A0M = r10;
        this.A08 = r6;
        this.A0N = r14;
        this.A0C = r12;
        this.A0G = str;
        this.A0I = str2;
        this.A0K = list;
        this.A0H = str3;
        this.A0L = uriArr;
        this.A0B = r9;
        this.A0D = r13;
        this.A02 = r11;
    }
}
