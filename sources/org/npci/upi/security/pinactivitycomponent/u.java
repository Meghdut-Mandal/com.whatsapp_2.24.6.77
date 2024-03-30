package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass63A;
import X.AnonymousClass66Z;
import X.C118175nS;
import X.C90504aG;
import X.C90524aI;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class u {
    public JSONArray A00 = C90524aI.A0u();
    public Context A01;
    public List A02;
    public C118175nS A03;

    public AnonymousClass63A A01(String str, String str2, int i) {
        String str3;
        AnonymousClass66Z r3;
        String str4;
        int i2 = 0;
        while (true) {
            try {
                JSONArray jSONArray = this.A00;
                if (i2 >= jSONArray.length()) {
                    return null;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("sender");
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArray2.length()) {
                            continue;
                            break;
                        } else if (!Pattern.compile(jSONArray2.getString(i3), 2).matcher(str).find()) {
                            i3++;
                        } else if (!Pattern.compile(jSONObject.getString("message"), 2).matcher(str2).find()) {
                            continue;
                        } else {
                            if (i != 0) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("\\d{");
                                A0u.append(i);
                                str3 = AnonymousClass000.A0q("}", A0u);
                            } else {
                                str3 = (String) jSONObject.get("otp");
                            }
                            Matcher matcher = Pattern.compile(str3).matcher(str2);
                            AnonymousClass63A r4 = new AnonymousClass63A();
                            r4.A00 = str2;
                            if (matcher.find() && matcher.groupCount() >= 0) {
                                r4.A01 = matcher.group(0);
                                if (str2.contains("Aadhaar") || str2.contains("AADHAAR")) {
                                    r3 = new AnonymousClass66Z(this.A01);
                                    str4 = "otp_type_aadhaar";
                                } else {
                                    r3 = new AnonymousClass66Z(this.A01);
                                    str4 = "otp_type_bank";
                                }
                                String str5 = r4.A01;
                                SharedPreferences.Editor edit = r3.A01.edit();
                                edit.putString(str4, str5);
                                edit.commit();
                                return r4;
                            }
                        }
                    }
                } catch (JSONException unused) {
                }
                i2++;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public u(Context context) {
        this.A01 = context;
        this.A03 = new C118175nS(context);
        try {
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            InputStream open = context.getAssets().open(AnonymousClass000.A0p("npci/", "npci_otp_rules.json", AnonymousClass000.A0u()));
            byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                A0Q.write(bArr, 0, read);
            }
            A0Q.close();
            open.close();
            byte[] byteArray = A0Q.toByteArray();
            if (byteArray != null) {
                try {
                    this.A00 = new JSONArray(new String(byteArray));
                } catch (Exception unused) {
                }
            }
        } catch (FileNotFoundException e) {
            throw AnonymousClass001.A0B(e);
        } catch (IOException e2) {
            throw AnonymousClass001.A0B(e2);
        } catch (Exception e3) {
            throw AnonymousClass001.A0B(e3);
        }
    }

    public static String A00(String str) {
        String lowerCase = str.toLowerCase();
        try {
            MessageDigest A0s = C90504aG.A0s();
            A0s.update(lowerCase.getBytes(), 0, lowerCase.length());
            String bigInteger = new BigInteger(1, A0s.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = AnonymousClass000.A0p("0", bigInteger, AnonymousClass000.A0u());
            }
            return bigInteger;
        } catch (Exception unused) {
            return null;
        }
    }
}
