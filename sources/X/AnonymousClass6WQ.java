package X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

/* renamed from: X.6WQ  reason: invalid class name */
public class AnonymousClass6WQ {
    public HashMap A00 = AnonymousClass001.A0J();
    public float A01;
    public Activity A02;
    public KeyguardManager A03;
    public Context A04;
    public Boolean A05 = C36381kD.A0j();
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public JSONObject A0A;
    public JSONObject A0B;
    public JSONObject A0C;
    public AnonymousClass6PJ A0D;
    public String A0E = null;
    public JSONArray A0F;
    public JSONObject A0G;
    public AnonymousClass684 A0H;
    public C133166Xa A0I;

    private String A01(String str, String str2, int i) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            Signature instance2 = Signature.getInstance("SHA512withRSA/PSS");
            instance2.initSign((PrivateKey) instance.getKey(str2, (char[]) null));
            instance2.update(str.getBytes("UTF8"));
            return C36441kJ.A13(instance2.sign());
        } catch (UserNotAuthenticatedException unused) {
            KeyguardManager keyguardManager = (KeyguardManager) this.A04.getSystemService("keyguard");
            this.A03 = keyguardManager;
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent((CharSequence) null, (CharSequence) null);
            if (createConfirmDeviceCredentialIntent != null) {
                this.A02.startActivityForResult(createConfirmDeviceCredentialIntent, i);
            }
            return null;
        }
    }

    public void A04() {
        String A002 = A00(1);
        if (A002 != null) {
            A02();
            if (this.A05.booleanValue()) {
                String encodeToString = Base64.encodeToString(this.A0C.toString().getBytes(DefaultCrypto.UTF_8), 2);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(this.A08);
                String A0p = AnonymousClass000.A0p("|", encodeToString, A0u);
                JSONObject A1B = C36441kJ.A1B();
                A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, A01(A0p, this.A09, 1));
                A1B.put("dynamicData", A0p);
                this.A0E = Base64.encodeToString(C90484aE.A0l(this.A07, "deviceCert", A1B).getBytes("UTF8"), 2);
            }
            A03("false");
            A06(C90474aD.A1b(A002));
        }
    }

    public void A06(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            JSONArray jSONArray = this.A0F;
            String optString = ((JSONObject) jSONArray.get(i)).optString("subtype", "");
            String optString2 = ((JSONObject) jSONArray.get(i)).optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
            Boolean bool = Boolean.TRUE;
            if (optString.equals("MPIN")) {
                bool = Boolean.FALSE;
            }
            JSONObject jSONObject = this.A0A;
            JSONObject A1C = C36441kJ.A1C(C90484aE.A0l(strArr[i], "credential", jSONObject));
            JSONObject A1B = C36441kJ.A1B();
            JSONArray A0u = C90524aI.A0u();
            JSONArray jSONArray2 = jSONObject.getJSONArray("credType");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                A1C.put("txnId", jSONObject.getJSONArray("txnId").get(i2));
                A1C.put("credType", jSONObject.getJSONArray("credType").get(i2));
                AnonymousClass684 r0 = ((GetCredential) this.A04).A0D.A0E;
                this.A0H = r0;
                A0u.put(r0.A02.A00(A1C));
                AnonymousClass72D A002 = this.A0H.A01().A00(bool, A0u.getString(i2), optString2, optString, A1C);
                if (this.A05.booleanValue()) {
                    A002.data.oda = this.A0E;
                }
                String string = jSONArray2.getString(i2);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                C112065dI.A00(A002, A0u2);
                C90504aG.A1J(A0u2, string, A1B);
            }
            this.A00.put(optString, A1B.toString());
        }
        Boolean A0j = C36381kD.A0j();
        JSONObject jSONObject2 = this.A0G;
        if (jSONObject2 != null) {
            A0j = Boolean.valueOf(Boolean.parseBoolean(jSONObject2.optString("getDeviceDetails", "false")));
        }
        if (A0j.booleanValue()) {
            this.A00.put("det", this.A0H.A01().A01(new AnonymousClass6MN(this.A04).A01(), this.A0A));
        }
        Bundle A072 = AnonymousClass001.A07();
        A072.putSerializable("credBlocks", this.A00);
        C124765yl.A0B.send(1, A072);
        ((Activity) this.A04).finish();
    }

    private String A00(int i) {
        JSONObject jSONObject = this.A0A;
        String string = jSONObject.getString("txnAmount");
        String string2 = jSONObject.getString("txnTimestamp");
        String string3 = jSONObject.getString("payerLiteAccNumber");
        String string4 = jSONObject.getString("payeeAddr");
        String string5 = jSONObject.getString("appId");
        String string6 = jSONObject.getString("mobileNumber");
        String string7 = jSONObject.getString("deviceId");
        String A012 = this.A0D.A01("AES");
        byte[] bytes = C90484aE.A0l(C36441kJ.A13(this.A0B.toString().getBytes(DefaultCrypto.UTF_8)), "clientRiskRules", C36441kJ.A1C(this.A0C.toString())).getBytes();
        byte[] decode = Base64.decode(A012, 2);
        byte[] A1Z = C90484aE.A1Z("AES/GCM/NoPadding", new SecureRandom());
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, new SecretKeySpec(decode, "AES"), new GCMParameterSpec(128, A1Z));
        byte[] doFinal = instance.doFinal(bytes);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(Base64.encodeToString(doFinal, 2));
        A0u.append("|");
        String A0q = AnonymousClass000.A0q(Base64.encodeToString(A1Z, 2), A0u);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C36321k7.A1O("1.0|", string, "|", (String) jSONObject.getJSONArray("txnId").get(0), A0u2);
        A0u2.append("|");
        A0u2.append(string2);
        A0u2.append("|");
        AnonymousClass000.A1D(string3, "|", string4, A0u2);
        A0u2.append("|");
        AnonymousClass000.A1D(string5, "|", string6, A0u2);
        String A0p = AnonymousClass000.A0p("|", string7, A0u2);
        this.A08 = A0p;
        String A013 = A01(Base64.encodeToString(C90464aC.A0e(A0p, "|", A0q).getBytes(DefaultCrypto.UTF_8), 2), this.A09, i);
        if (A013 == null) {
            return A013;
        }
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("riskParams", A0q);
        return Base64.encodeToString(C90484aE.A0l(A013, PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, A1B).getBytes(DefaultCrypto.UTF_8), 2);
    }

    private void A02() {
        boolean booleanValue = this.A05.booleanValue();
        JSONObject jSONObject = this.A0B;
        String valueOf = String.valueOf(Integer.parseInt(jSONObject.getString("ATC")) + 1);
        if (booleanValue) {
            jSONObject.put("ATC", valueOf);
            JSONObject jSONObject2 = this.A0B;
            jSONObject2.put("OTC", String.valueOf(Integer.parseInt(jSONObject2.getString("OTC")) + 1));
            JSONObject jSONObject3 = this.A0B;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1I(objArr, Float.parseFloat(jSONObject3.getString("COTA")) + this.A01, 0);
            jSONObject3.put("COTA", String.format("%.2f", objArr));
        } else {
            jSONObject.put("ATC", valueOf);
        }
        this.A0D.A03(this.A0B.toString(), "ClientRiskRules");
    }

    public void A05(String str) {
        try {
            this.A06 = str;
            String A002 = A00(0);
            if (A002 != null) {
                A02();
                A03("true");
                String[] A1S = C36441kJ.A1S();
                C36331k8.A1N(str, A002, A1S);
                A06(A1S);
            }
        } catch (Exception unused) {
            ((GetCredential) this.A04).A2E("TECHNICAL_ERROR");
        }
    }

    public boolean A07(Integer num) {
        Boolean bool;
        boolean A1Q;
        boolean equals;
        JSONObject jSONObject = this.A0G;
        if (jSONObject != null) {
            this.A05 = Boolean.valueOf(Boolean.parseBoolean(jSONObject.optString("isAuthOffline", "false")));
        }
        JSONObject jSONObject2 = this.A0A;
        String A13 = C36441kJ.A13(C133166Xa.A03(C90464aC.A0e(jSONObject2.getString("deviceId"), jSONObject2.getString("mobileNumber"), jSONObject2.getString("accountRef"))));
        this.A09 = A13;
        AnonymousClass6PJ A002 = AnonymousClass6PJ.A00(this.A04, A13);
        this.A0D = A002;
        if (A002.A01("PendingTxn").equals("")) {
            this.A0B = C36441kJ.A1C(this.A0D.A01("ClientRiskRules"));
            this.A0C = C36441kJ.A1C(this.A0D.A01("ServerRiskParams"));
            try {
                String A012 = this.A0D.A01("DeviceCertificate");
                this.A07 = A012;
                try {
                    ByteArrayInputStream A0P = C90524aI.A0P(A012.getBytes());
                    try {
                        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(A0P);
                        A0P.close();
                        x509Certificate.checkValidity();
                        if (!num.equals(C113775g6.A01)) {
                            try {
                                bool = AnonymousClass6HT.A00(this.A0C);
                            } catch (Exception unused) {
                                bool = C36381kD.A0j();
                            }
                            if (bool.booleanValue()) {
                                JSONObject A0x = C90504aG.A0x(Base64.decode(this.A0C.getString("riskRules"), 2));
                                this.A01 = Float.parseFloat(jSONObject2.getString("txnAmount"));
                                float parseFloat = Float.parseFloat(A0x.getString("LTL"));
                                float parseFloat2 = Float.parseFloat(A0x.getString("BAL"));
                                String string = A0x.getString("ACSTATUS");
                                if (this.A05.booleanValue()) {
                                    boolean parseBoolean = Boolean.parseBoolean(A0x.getString("EOT"));
                                    float parseFloat3 = Float.parseFloat(A0x.getString("OTL"));
                                    int parseInt = Integer.parseInt(this.A0B.getString("OTC"));
                                    int parseInt2 = Integer.parseInt(A0x.getString("MOTC"));
                                    float parseFloat4 = Float.parseFloat(this.A0B.getString("COTA"));
                                    float parseFloat5 = Float.parseFloat(A0x.getString("COTAL"));
                                    float f = this.A01;
                                    A1Q = C90484aE.A1Q(((parseFloat4 + f) > parseFloat5 ? 1 : ((parseFloat4 + f) == parseFloat5 ? 0 : -1))) & C90484aE.A1Q((f > parseFloat ? 1 : (f == parseFloat ? 0 : -1))) & C90484aE.A1Q((f > parseFloat2 ? 1 : (f == parseFloat2 ? 0 : -1))) & C90484aE.A1Q((f > parseFloat3 ? 1 : (f == parseFloat3 ? 0 : -1))) & AnonymousClass000.A1T(parseInt, parseInt2) & parseBoolean;
                                    equals = string.equals("A");
                                } else {
                                    float f2 = this.A01;
                                    boolean A1Q2 = C90484aE.A1Q((f2 > parseFloat ? 1 : (f2 == parseFloat ? 0 : -1))) & C90484aE.A1Q((f2 > parseFloat2 ? 1 : (f2 == parseFloat2 ? 0 : -1)));
                                    boolean equals2 = string.equals("A");
                                    if (!A1Q2 || !equals2) {
                                        A1Q = AnonymousClass000.A1Q((f2 > parseFloat2 ? 1 : (f2 == parseFloat2 ? 0 : -1))) & equals2;
                                        equals = jSONObject2.getString("payerAddr").equals(jSONObject2.getString("payeeAddr"));
                                    }
                                }
                                if (A1Q && equals) {
                                    return true;
                                }
                            }
                            throw AnonymousClass001.A08("Lite validation Failed");
                        }
                        return true;
                    } catch (Throwable th) {
                        th = th;
                        A0P.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Exception unused2) {
                throw new CertificateException("Device Certificate Expired");
            }
        } else {
            throw AnonymousClass001.A09("Pending transaction for Sync");
        }
    }

    public AnonymousClass6WQ(Context context, JSONArray jSONArray, JSONObject jSONObject, JSONObject jSONObject2) {
        this.A04 = context;
        this.A0A = jSONObject;
        this.A0F = jSONArray;
        this.A0G = jSONObject2;
        this.A02 = (Activity) context;
        this.A0I = new C133166Xa();
    }

    private void A03(String str) {
        JSONArray jSONArray;
        JSONObject A1B = C36441kJ.A1B();
        JSONObject jSONObject = this.A0A;
        A1B.put("txnId", jSONObject.getJSONArray("txnId").get(0));
        A1B.put("txnAmount", jSONObject.getString("txnAmount"));
        A1B.put("isCredit", str);
        try {
            jSONArray = new JSONArray(this.A0D.A01("PendingTxn"));
        } catch (Exception unused) {
            jSONArray = C90524aI.A0u();
        }
        jSONArray.put(A1B);
        this.A0D.A03(jSONArray.toString(), "PendingTxn");
    }
}
