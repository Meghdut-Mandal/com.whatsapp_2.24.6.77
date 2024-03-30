package X;

import android.app.ProgressDialog;
import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2jz  reason: invalid class name and case insensitive filesystem */
public class C49972jz extends C132446Tt {
    public ProgressDialog A00;
    public final C20050ww A01;
    public final C62603Gu A02;
    public final AnonymousClass13E A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public C49972jz(C225314u r2, C20050ww r3, C62603Gu r4, AnonymousClass13E r5, String str, String str2) {
        super(r2, true);
        this.A06 = AnonymousClass001.A0F(r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = str;
        this.A04 = str2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        InputStreamReader inputStreamReader;
        try {
            try {
                C146096v1 A002 = AnonymousClass13E.A00(this.A03, 20, this.A05, (String) null, (String) null, (Map) null, false, false, false);
                try {
                    inputStreamReader = new InputStreamReader(A002.B8D(this.A01, (Integer) null, 20));
                    char[] cArr = new char[EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH];
                    int read = inputStreamReader.read(cArr, 0, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    int i = 0;
                    while (read != -1) {
                        i += read;
                        if (i <= 65536) {
                            A0u.append(cArr, 0, read);
                            read = inputStreamReader.read(cArr, 0, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                        } else {
                            throw new IOException("The response from server is too big.");
                        }
                    }
                    JSONObject A1C = C36441kJ.A1C(A0u.toString());
                    String optString = A1C.optString("title");
                    A1C.optString("platform");
                    A1C.optString("lang");
                    AnonymousClass39Y r9 = new AnonymousClass39Y(optString, A1C.optString("url"), A1C.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), A1C.optString("description"), A1C.optBoolean("open_flow", true));
                    inputStreamReader.close();
                    A002.close();
                    return r9;
                } catch (Throwable th) {
                    A002.close();
                    throw th;
                }
                throw th;
            } catch (Exception e) {
                Log.e("http/get-help/httperror", e);
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } catch (Exception e2) {
            Log.e("Could not fetch help response", e2);
            return null;
        }
    }

    public void A0A() {
        Context A0G = C36441kJ.A0G(this.A06);
        if (A0G != null) {
            if (this.A00 == null) {
                ProgressDialog progressDialog = new ProgressDialog(A0G);
                this.A00 = progressDialog;
                AnonymousClass4XV.A00(progressDialog, this, 21);
                this.A00.setCanceledOnTouchOutside(false);
            }
            if (!this.A00.isShowing()) {
                C36391kE.A17(this.A00, A0G, R.string.f12nameremoved);
                this.A00.setIndeterminate(true);
                this.A00.show();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r10) {
        /*
            r9 = this;
            X.39Y r10 = (X.AnonymousClass39Y) r10
            if (r10 == 0) goto L_0x0062
            java.lang.String r8 = r10.A02
            if (r8 == 0) goto L_0x0062
            java.lang.String r7 = r10.A03
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0062
            java.lang.String r6 = r10.A01
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0062
            java.lang.String r1 = r10.A00
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0062
            java.lang.ref.WeakReference r0 = r9.A06
            X.14u r5 = X.C36411kG.A0W(r0)
            if (r5 == 0) goto L_0x0052
            r4 = 0
            boolean r3 = r10.A04
            java.lang.String r2 = r9.A04
            android.content.Intent r1 = X.C36381kD.A0E(r5, r8, r1, r7)
            java.lang.String r0 = "article_id"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "show_contact_support_button"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "contact_us_context"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "describe_problem_fields"
            r1.putExtra(r0, r4)
            r0 = 0
            r5.A33(r1, r0)
            r1 = 2130772051(0x7f010053, float:1.714721E38)
            r0 = 2130772053(0x7f010055, float:1.7147214E38)
            r5.overridePendingTransition(r1, r0)
        L_0x0052:
            android.app.ProgressDialog r0 = r9.A00
            if (r0 == 0) goto L_0x0061
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0061
            android.app.ProgressDialog r0 = r9.A00
            r0.cancel()
        L_0x0061:
            return
        L_0x0062:
            java.lang.ref.WeakReference r0 = r9.A06
            X.14u r2 = X.C36411kG.A0W(r0)
            if (r2 == 0) goto L_0x0052
            X.3Gu r1 = r9.A02
            java.lang.String r0 = r9.A04
            X.C62603Gu.A00(r2, r1, r0)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49972jz.A0C(java.lang.Object):void");
    }
}
