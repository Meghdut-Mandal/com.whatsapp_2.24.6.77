package X;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7sR  reason: invalid class name and case insensitive filesystem */
public class C164827sR implements C160437l0 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164827sR(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* synthetic */ void BUJ(String str) {
        if (1 - this.A02 == 0) {
            ((C124945z3) this.A00).A06.A0D.A04(str);
        }
    }

    public /* synthetic */ void BVA(long j) {
        switch (this.A02) {
            case 1:
                ((C124945z3) this.A00).A06.A0K(j);
                return;
            case 3:
                ((File) this.A01).delete();
                return;
            default:
                return;
        }
    }

    public void BWo(String str) {
        StringBuilder sb;
        String str2;
        String substring;
        SharedPreferences.Editor putInt;
        switch (this.A02) {
            case 0:
                if (AnonymousClass14B.A0F(str)) {
                    substring = "";
                } else {
                    substring = str.substring(0, Math.min(str.length(), 500));
                }
                C19700wN r4 = ((AnonymousClass6XP) this.A00).A01;
                StringBuilder A0u = AnonymousClass000.A0u();
                File file = (File) this.A01;
                A0u.append(file.length());
                r4.A0E("voip-time-series-upload-fail", AnonymousClass000.A0p(":uploadServiceError:", substring, A0u), false);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                C90474aD.A16(file, "app/VoipTimeSeriesLogger: failed upload of ", A0u2);
                C90464aC.A19(file, " with size ", A0u2);
                C36321k7.A1R("reason: ", substring, A0u2);
                return;
            case 1:
                sb = AnonymousClass000.A0u();
                str2 = "mediaupload/error = ";
                break;
            case 2:
                sb = AnonymousClass000.A0u();
                str2 = "mediaupload/finalizeupload/error = ";
                break;
            case 3:
                sb = AnonymousClass000.A0u();
                str2 = "ProfiloUpload/Error: ";
                break;
            default:
                C124565yP r42 = (C124565yP) this.A00;
                AnonymousClass005 r2 = r42.A05.A00;
                int A012 = C36371kC.A01(C36341k9.A0E((C19420v0) r2.get()), "qpl_failed_upload_count") + 1;
                SharedPreferences.Editor A002 = C19420v0.A00((C19420v0) r2.get());
                if (A012 == 0) {
                    putInt = A002.remove("qpl_failed_upload_count");
                } else {
                    putInt = A002.putInt("qpl_failed_upload_count", A012);
                }
                putInt.apply();
                if (A012 >= 5) {
                    C21470zI r1 = r42.A04;
                    StringBuilder A0v = AnonymousClass000.A0v(str);
                    C90494aF.A1K(A0v, A012);
                    r1.B6o(C90474aD.A0f(A0v));
                }
                r42.A00 = false;
                ((ConditionVariable) this.A01).open();
                return;
        }
        C36321k7.A1P(str2, str, sb);
    }

    public void Bez(String str, Map map) {
        switch (this.A02) {
            case 0:
                C19700wN r4 = ((AnonymousClass6XP) this.A00).A01;
                File file = (File) this.A01;
                r4.A0E("voip-time-series-upload-success", String.valueOf(file.length()), false);
                StringBuilder A0u = AnonymousClass000.A0u();
                C90474aD.A16(file, "app/VoipTimeSeriesLogger: successful upload of ", A0u);
                A0u.append(" with size ");
                C36351kA.A1S(A0u, file.length());
                return;
            case 1:
                C124945z3 r2 = (C124945z3) this.A00;
                r2.A00 = new C123965xN();
                if (!((C124665yb) this.A01).A08) {
                    try {
                        JSONObject A1C = C36441kJ.A1C(str);
                        r2.A00.A05 = A1C.optString("url");
                        r2.A00.A02 = A1C.optString("handle");
                        r2.A00.A00 = A1C.optString("direct_path");
                        r2.A00.A03 = A1C.optString("meta_hmac");
                        r2.A00.A01 = A1C.optString("fbid");
                        r2.A00.A04 = A1C.optString("ts");
                    } catch (JSONException e) {
                        Log.e("mediaupload/jsonexception", e);
                    }
                }
                r2.A02 = true;
                return;
            case 2:
                String str2 = null;
                try {
                    JSONObject A1C2 = C36441kJ.A1C(str);
                    str2 = A1C2.optString("url");
                    ((C123365wN) this.A01).A02 = A1C2.optString("direct_path");
                } catch (JSONException e2) {
                    Log.e("mediaupload/jsonexception", e2);
                }
                ((C123365wN) this.A01).A03 = str2;
                return;
            case 3:
                return;
            default:
                C124565yP r1 = (C124565yP) this.A00;
                r1.A00 = true;
                C36341k9.A0u(C19420v0.A00((C19420v0) r1.A05.A00.get()), "qpl_failed_upload_count");
                ((ConditionVariable) this.A01).open();
                return;
        }
    }
}
