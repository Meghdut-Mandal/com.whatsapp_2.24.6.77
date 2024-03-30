package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.54v  reason: invalid class name and case insensitive filesystem */
public class C1033254v extends C26481Ki {
    public final C19730wQ A00;
    public final C19420v0 A01;
    public final C18820ts A02;
    public final C24891Ee A03;
    public final C24651Dg A04;
    public final C19770wU A05;

    public /* bridge */ /* synthetic */ boolean A0D(Object obj) {
        return C36421kH.A1a(C36341k9.A0E(this.A01).getString("payment_background_store_etag", (String) null));
    }

    public boolean A0E(String str, Map map, byte[] bArr) {
        return true;
    }

    public /* bridge */ /* synthetic */ String A05(Object obj) {
        return C36371kC.A0t(C36341k9.A0E(this.A01), "payment_background_store_etag");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj, String str) {
        SharedPreferences.Editor putString;
        SharedPreferences.Editor A002 = C19420v0.A00(this.A01);
        if (str == null) {
            putString = A002.remove("payment_background_store_etag");
        } else {
            putString = A002.putString("payment_background_store_etag", str);
        }
        putString.apply();
    }

    public /* bridge */ /* synthetic */ boolean A0C(InputStream inputStream, Object obj, Map map) {
        String str;
        JsonReader A0K;
        C1495671s B1k;
        JsonReader A0K2;
        C119945qi r15 = (C119945qi) obj;
        if (r15 == null || TextUtils.isEmpty(r15.A01)) {
            ArrayList A0I = AnonymousClass001.A0I();
            try {
                A0K = C90474aD.A0K(inputStream);
                A0K.beginArray();
                while (A0K.hasNext()) {
                    C135106c9 A002 = A00(A0K);
                    if (A002 != null) {
                        A0I.add(A002);
                    }
                }
                A0K.endArray();
                A0K.close();
                C24891Ee r8 = this.A03;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/size=");
                C36321k7.A1Y(A0u, A0I.size());
                AnonymousClass1M0 A052 = r8.A00.A05();
                try {
                    B1k = A052.B1k();
                    C224114e r6 = A052.A02;
                    C36321k7.A1T("PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/background order rows deleted: ", AnonymousClass000.A0u(), r6.A03("payment_background_order", (String) null, "payments/UPDATE_BACKGROUNDS_FOR_PICKER/DELETE_ALL_BACKGROUND_ORDERS", (String[]) null));
                    for (int i = 0; i < A0I.size(); i++) {
                        C135106c9 r3 = (C135106c9) A0I.get(i);
                        ContentValues contentValues = new ContentValues(2);
                        contentValues.put("background_id", r3.A0F);
                        C36341k9.A0o(contentValues, "background_order", i);
                        if (r6.A08("payment_background_order", "payments/UPDATE_BACKGROUNDS_FOR_PICKER/INSERT_ORDER", contentValues, 5) == -1) {
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append("PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/insert background order failed for id: ");
                            C36321k7.A1Z(A0u2, r3.A0F);
                        }
                        C24891Ee.A02(A052, r3, r8, "payments/UPDATE_BACKGROUNDS_FOR_PICKER/INSERT_PAYMENT_BACKGROUND");
                    }
                    B1k.A00();
                    B1k.close();
                    A052.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        A052.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException e) {
                e = e;
                str = "PAY: PaymentBackgroundMetadataNetworkClient/handle-network-response/failed";
                Log.e(str, e);
                return false;
            } catch (Throwable th3) {
                th.addSuppressed(th3);
            }
        } else {
            try {
                A0K2 = C90474aD.A0K(inputStream);
                C135106c9 A003 = A00(A0K2);
                A0K2.close();
                if (A003 == null) {
                    return false;
                }
                this.A03.A04(A003);
                return true;
            } catch (IOException e2) {
                e = e2;
                str = "PAY: PaymentBackgroundMetadataNetworkClient/handle-network-response-for-background/failed";
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
        }
        throw th;
        throw th;
        throw th;
    }

    public void A0F(C160427kz r5, String str) {
        String A052;
        String A0q;
        String str2;
        String str3;
        C19730wQ r0 = this.A00;
        r0.A0G();
        Me me = r0.A00;
        if (me != null) {
            A052 = AnonymousClass1M4.A01(me.cc, me.number);
        } else {
            A052 = this.A02.A05();
        }
        C119945qi r3 = new C119945qi(str, A052);
        if (TextUtils.isEmpty("")) {
            A0q = null;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("https://www.");
            A0u.append("");
            A0q = AnonymousClass000.A0q(".facebook.com/cdn/cacheable/whatsapp", A0u);
        }
        if (!TextUtils.isEmpty(A0q)) {
            str2 = AnonymousClass000.A0q("/payments/background", AnonymousClass000.A0v(A0q));
        } else {
            str2 = "https://static.whatsapp.net/payments/background";
        }
        Uri.Builder A0I = C90504aG.A0I(str2);
        String str4 = r3.A01;
        if (!TextUtils.isEmpty(str4)) {
            str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        } else {
            str4 = r3.A00;
            str3 = "country";
        }
        A0I.appendQueryParameter(str3, str4);
        super.A03(r5, r3, A0I.toString(), (Map) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1033254v(X.C19730wQ r8, X.C20050ww r9, X.C19630wG r10, X.C19420v0 r11, X.C18820ts r12, X.C24891Ee r13, X.AnonymousClass13E r14, X.C24651Dg r15, X.C21080yd r16, X.C19770wU r17) {
        /*
            r7 = this;
            java.lang.Integer r6 = X.C36401kF.A0k()
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r14
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A05 = r5
            r7.A00 = r8
            r7.A02 = r12
            r7.A01 = r11
            r7.A03 = r13
            r7.A04 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1033254v.<init>(X.0wQ, X.0ww, X.0wG, X.0v0, X.0ts, X.1Ee, X.13E, X.1Dg, X.0yd, X.0wU):void");
    }

    public static C135106c9 A00(JsonReader jsonReader) {
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -1724546052:
                    if (!nextName.equals("description")) {
                        break;
                    } else {
                        str4 = jsonReader.nextString();
                        break;
                    }
                case -1391167122:
                    if (!nextName.equals("mimetype")) {
                        break;
                    } else {
                        str2 = jsonReader.nextString();
                        break;
                    }
                case -1362486862:
                    if (!nextName.equals("file-size")) {
                        break;
                    } else {
                        j = jsonReader.nextLong();
                        break;
                    }
                case -1221029593:
                    if (!nextName.equals("height")) {
                        break;
                    } else {
                        i2 = jsonReader.nextInt();
                        break;
                    }
                case -718200573:
                    if (!nextName.equals("subtext-color")) {
                        break;
                    } else {
                        i5 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
                case -342731470:
                    if (!nextName.equals("fullsize-url")) {
                        break;
                    } else {
                        str3 = jsonReader.nextString();
                        break;
                    }
                case 3355:
                    if (!nextName.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                        break;
                    } else {
                        str = jsonReader.nextString();
                        break;
                    }
                case 113126854:
                    if (!nextName.equals("width")) {
                        break;
                    } else {
                        i = jsonReader.nextInt();
                        break;
                    }
                case 748171971:
                    if (!nextName.equals("text-color")) {
                        break;
                    } else {
                        i4 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
                case 2018420361:
                    if (!nextName.equals("placeholder-color")) {
                        break;
                    } else {
                        i3 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
            }
        }
        jsonReader.endObject();
        if (str == null || j == 0 || ((long) i) == 0 || ((long) i2) == 0 || str2 == null || str3 == null || i3 == 0 || i4 == 0 || i5 == 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PAY: PaymentBackgroundMetadataNetworkClient/parseMetadata/missing field/id=");
            A0u.append(str);
            A0u.append(", fileSize=");
            A0u.append(j);
            A0u.append(", width=");
            A0u.append(i);
            A0u.append(", height=");
            A0u.append(i2);
            A0u.append(", mimetype=");
            A0u.append(str2);
            A0u.append(", fullsizeUrl=");
            A0u.append(str3);
            A0u.append(", placeholderColor=");
            A0u.append(i3);
            A0u.append(", textColor=");
            A0u.append(i4);
            C36321k7.A1S(", subtextColor=", A0u, i5);
            return null;
        }
        return new C135106c9(str, str2, str3, str4, (String) null, i, i2, i3, i4, i5, j);
    }
}
