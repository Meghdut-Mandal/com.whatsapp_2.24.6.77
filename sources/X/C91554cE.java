package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl;
import org.npci.upi.security.pinactivitycomponent.GetCredential;
import org.npci.upi.security.pinactivitycomponent.w;
import org.npci.upi.security.services.CLRemoteService;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.4cE  reason: invalid class name and case insensitive filesystem */
public class C91554cE extends Binder implements CLRemoteService {
    public Context A00;
    public final /* synthetic */ CLRemoteServiceImpl A01;

    public C91554cE() {
        attachInterface(this, "org.npci.upi.security.services.CLRemoteService");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C91554cE(Context context, CLRemoteServiceImpl cLRemoteServiceImpl) {
        this();
        this.A01 = cLRemoteServiceImpl;
        this.A00 = context;
    }

    public IBinder asBinder() {
        return this;
    }

    public void B71(String str) {
        String A0n;
        GetCredential getCredential = GetCredential.A0L;
        if (getCredential != null) {
            w wVar = (w) getCredential.A07;
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                if (!A1C.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) || !A1C.has("data") || A1C.getJSONObject("data").getInt("status") != -1) {
                    ((C88984Uu) wVar.A04.get(wVar.A07)).Azm(wVar.A0n(R.string.f12nameremoved));
                    return;
                }
                if (A1C.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("TRIGGERED_OTP_RESPONSE")) {
                    wVar.A04.get(wVar.A07);
                    A0n = wVar.A0n(R.string.f12nameremoved);
                } else if (A1C.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("TRIGGERED_AADHAAR_OTP_RESPONSE")) {
                    wVar.A04.get(wVar.A07);
                    A0n = wVar.A0n(R.string.f12nameremoved);
                } else {
                    return;
                }
                wVar.A1Z(A0n);
            } catch (Exception unused) {
            }
        }
    }

    public String B9V(String str, String str2) {
        String str3;
        String str4;
        PublicKey publicKey;
        byte[] bArr;
        C93164g0 r5 = this.A01.A00;
        String str5 = "";
        String format = new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()));
        try {
            StringBuilder A0h = C90524aI.A0h(r8 * 2);
            for (byte b : C90464aC.A0n().getEncoded()) {
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass000.A1L(A0L, b & 255, 0);
                A0h.append(String.format("%02x", A0L));
            }
            str3 = A0h.toString();
        } catch (Exception unused) {
            str3 = null;
        }
        try {
            r5.A01 = str3;
            try {
                StringBuilder A0h2 = C90524aI.A0h(r8 * 2);
                for (byte b2 : C90464aC.A0n().getEncoded()) {
                    Object[] A0L2 = AnonymousClass001.A0L();
                    AnonymousClass000.A1L(A0L2, b2 & 255, 0);
                    A0h2.append(String.format("%02x", A0L2));
                }
                str4 = A0h2.toString();
            } catch (Exception unused2) {
                str4 = null;
            }
        } catch (Exception unused3) {
            str4 = str5;
        }
        try {
            new C133166Xa();
            if (str.equalsIgnoreCase("initial")) {
                AnonymousClass66Z r6 = r5.A03;
                SharedPreferences.Editor edit = r6.A01.edit();
                edit.clear();
                edit.commit();
                if (r6.A00().size() <= 0) {
                    r6.A01(new C130306Ko(str4, r5.A01, format));
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                AnonymousClass000.A1D(r5.A01, "|", str4, A0u);
                A0u.append("|");
                A0u.append(str2);
                str5 = A0u.toString();
                Certificate certificate = C113455fZ.A00;
                if (certificate != null) {
                    publicKey = certificate.getPublicKey();
                } else {
                    publicKey = null;
                }
                try {
                    bArr = C90484aE.A1b(publicKey, str5.getBytes());
                } catch (Exception unused4) {
                    bArr = null;
                }
                str5 = Base64.encodeToString(bArr, 2);
            } else {
                AnonymousClass66Z r62 = r5.A03;
                String str6 = ((C130306Ko) C36441kJ.A12(r62.A00())).A02;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                AnonymousClass000.A1D(r5.A01, "|", str4, A0u2);
                A0u2.append("|");
                A0u2.append(str2);
                String obj = A0u2.toString();
                byte[] A1Z = C90484aE.A1Z("AES/GCM/NoPadding", new SecureRandom());
                String encodeToString = Base64.encodeToString(A1Z, 2);
                int length = str6.length() / 2;
                byte[] bArr2 = new byte[length];
                for (int i = 0; i < length; i++) {
                    C90504aG.A1L(str6, bArr2, i);
                }
                String encodeToString2 = Base64.encodeToString(C133166Xa.A04(obj.getBytes(), bArr2, A1Z), 2);
                StringBuilder A0u3 = AnonymousClass000.A0u();
                AnonymousClass000.A1D(encodeToString2, "|", encodeToString, A0u3);
                str5 = A0u3.toString();
                SharedPreferences.Editor edit2 = r62.A01.edit();
                edit2.clear();
                edit2.commit();
                r62.A01(new C130306Ko(str4, r5.A01, format));
            }
        } catch (Exception unused5) {
        }
        return AnonymousClass000.A0p("2.3-v1.8|", str5, AnonymousClass000.A0u());
    }

    public void BAS(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver) {
        Context context = this.A00;
        SharedPreferences.Editor edit = new C118175nS(context).A00.edit();
        edit.putString("org.npci.upi.language.pref", str8);
        edit.commit();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("keyCode", str);
        A07.putString("keyXmlPayload", str2);
        A07.putString("controls", str3);
        A07.putString("configuration", str4);
        A07.putString("salt", str5);
        A07.putString("payInfo", str6);
        A07.putString("trust", str7);
        A07.putString("languagePref", str8);
        C124765yl.A0B = new C166147vB(cLResultReceiver);
        Intent A0H = C36441kJ.A0H(context, GetCredential.class);
        A0H.setFlags(268435456);
        A0H.putExtras(A07);
        context.startActivity(A0H);
    }

    public boolean BnC(String str, String str2, String str3, String str4, String str5) {
        try {
            String str6 = ((C130306Ko) this.A01.A00.A03.A00().get(0)).A01;
            int length = str6.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                C90504aG.A1L(str6, bArr, i);
            }
            String encodeToString = Base64.encodeToString(C133166Xa.A05(Base64.decode(str4, 0), bArr, Base64.decode(str5, 2)), 0);
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass000.A1D(str, "|", str2, A0u);
            String A0p = AnonymousClass000.A0p("|", str3, A0u);
            byte[] decode = Base64.decode(str5, 2);
            MessageDigest A0s = C90504aG.A0s();
            A0s.update(decode);
            if (!Base64.encodeToString(A0s.digest(A0p.getBytes(DefaultCrypto.UTF_8)), 0).equalsIgnoreCase(encodeToString)) {
                return false;
            }
            return true;
        } catch (Exception | NoSuchAlgorithmException e) {
            e.getLocalizedMessage();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:40|41|42|43|44|45|46|(2:48|(1:50))) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:12|13|14|15|16|17|18|19|(3:21|22|(2:24|25)(4:26|(4:29|(2:31|81)(1:82)|32|27)|80|33))) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00c6, code lost:
        r1.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02d7, code lost:
        if (r3.A01("ServerRiskParams").equals("") == false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02d9, code lost:
        r2 = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0103 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x01ed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r24, android.os.Parcel r25, android.os.Parcel r26, int r27) {
        /*
            r23 = this;
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            r0 = 1
            java.lang.String r3 = "org.npci.upi.security.services.CLRemoteService"
            r4 = r24
            r1 = r26
            if (r4 == r2) goto L_0x0307
            r13 = r23
            r2 = r25
            switch(r24) {
                case 1: goto L_0x0180;
                case 2: goto L_0x02e5;
                case 3: goto L_0x02dd;
                case 4: goto L_0x0293;
                case 5: goto L_0x0196;
                case 6: goto L_0x020f;
                case 7: goto L_0x01af;
                case 8: goto L_0x00ca;
                case 9: goto L_0x0098;
                case 10: goto L_0x008d;
                case 11: goto L_0x001a;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = r27
            boolean r0 = super.onTransact(r4, r2, r1, r0)
            return r0
        L_0x001a:
            r2.enforceInterface(r3)
            java.lang.String r12 = r2.readString()
            java.lang.String r11 = r2.readString()
            java.lang.String r10 = r2.readString()
            java.lang.String r9 = r2.readString()
            java.lang.String r8 = r2.readString()
            java.lang.String r7 = r2.readString()
            java.lang.String r6 = r2.readString()
            java.lang.String r5 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            org.npci.upi.security.services.CLResultReceiver r3 = X.C166017ut.A01(r2)
            android.os.Bundle r4 = X.AnonymousClass001.A07()
            java.lang.String r2 = "keyCode"
            r4.putString(r2, r12)
            java.lang.String r2 = "keyXmlPayload"
            r4.putString(r2, r11)
            java.lang.String r2 = "controls"
            r4.putString(r2, r10)
            java.lang.String r2 = "configuration"
            r4.putString(r2, r9)
            java.lang.String r2 = "salt"
            r4.putString(r2, r8)
            java.lang.String r2 = "payInfo"
            r4.putString(r2, r7)
            java.lang.String r2 = "trust"
            r4.putString(r2, r6)
            java.lang.String r2 = "languagePref"
            r4.putString(r2, r5)
            X.7vB r2 = new X.7vB
            r2.<init>(r3)
            X.C124765yl.A0B = r2
            android.content.Context r3 = r13.A00
            java.lang.Class<org.npci.upi.security.pinactivitycomponent.GetCredential> r2 = org.npci.upi.security.pinactivitycomponent.GetCredential.class
            android.content.Intent r2 = X.C36441kJ.A0H(r3, r2)
            r2.putExtras(r4)
            r1.writeNoException()
            r1.writeInt(r0)
            r2.writeToParcel(r1, r0)
            return r0
        L_0x008d:
            r2.enforceInterface(r3)
            java.lang.String r2 = r2.readString()
            r13.B71(r2)
            goto L_0x00c6
        L_0x0098:
            r2.enforceInterface(r3)
            java.lang.String r14 = r2.readString()
            java.lang.String r15 = r2.readString()
            java.lang.String r16 = r2.readString()
            java.lang.String r17 = r2.readString()
            java.lang.String r18 = r2.readString()
            java.lang.String r19 = r2.readString()
            java.lang.String r20 = r2.readString()
            java.lang.String r21 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            org.npci.upi.security.services.CLResultReceiver r22 = X.C166017ut.A01(r2)
            r13.BAS(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x00c6:
            r1.writeNoException()
            return r0
        L_0x00ca:
            r2.enforceInterface(r3)
            java.lang.String r7 = r2.readString()
            java.lang.String r5 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.4g0 r4 = r2.A00
            java.lang.String r6 = ""
            java.lang.String r2 = X.C90464aC.A0e(r5, r7, r3)
            byte[] r2 = X.C133166Xa.A03(r2)
            r5 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r2, r5)
            android.content.Context r2 = r4.A00     // Catch:{ Exception -> 0x018f }
            X.6PJ r3 = X.AnonymousClass6PJ.A00(r2, r3)     // Catch:{ Exception -> 0x018f }
            r4.A04 = r3     // Catch:{ Exception -> 0x018f }
            java.lang.String r2 = "ServerRiskParams"
            java.lang.String r3 = r3.A01(r2)     // Catch:{ Exception -> 0x018f }
            org.json.JSONObject r2 = X.C36441kJ.A1C(r3)     // Catch:{ Exception -> 0x0103 }
            java.lang.Boolean r2 = X.AnonymousClass6HT.A00(r2)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0107
        L_0x0103:
            java.lang.Boolean r2 = X.C36381kD.A0j()     // Catch:{ Exception -> 0x018f }
        L_0x0107:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x018f }
            if (r2 == 0) goto L_0x018f
            org.json.JSONObject r3 = X.C36441kJ.A1C(r3)     // Catch:{ Exception -> 0x018f }
            java.lang.String r2 = "riskRules"
            byte[] r2 = X.C90514aH.A1b(r2, r3, r5)     // Catch:{ Exception -> 0x018f }
            org.json.JSONObject r3 = X.C90504aG.A0x(r2)     // Catch:{ Exception -> 0x018f }
            java.lang.String r2 = "BAL"
            java.lang.String r10 = r3.optString(r2, r6)     // Catch:{ Exception -> 0x018f }
            X.6PJ r3 = r4.A04     // Catch:{ Exception -> 0x018f }
            java.lang.String r2 = "PendingTxn"
            java.lang.String r3 = r3.A01(r2)     // Catch:{ Exception -> 0x018f }
            boolean r2 = r3.equals(r6)     // Catch:{ Exception -> 0x018f }
            java.lang.String r5 = "%.2f"
            r4 = 0
            if (r2 == 0) goto L_0x0140
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x018f }
            float r2 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x018f }
            X.AnonymousClass000.A1I(r3, r2, r4)     // Catch:{ Exception -> 0x018f }
            java.lang.String r6 = java.lang.String.format(r5, r3)     // Catch:{ Exception -> 0x018f }
            goto L_0x018f
        L_0x0140:
            r9 = 0
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x018f }
            r8.<init>(r3)     // Catch:{ Exception -> 0x018f }
            r7 = 0
        L_0x0147:
            int r2 = r8.length()     // Catch:{ Exception -> 0x018f }
            if (r7 >= r2) goto L_0x0171
            org.json.JSONObject r3 = r8.getJSONObject(r7)     // Catch:{ Exception -> 0x018f }
            java.lang.String r2 = "isCredit"
            java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x018f }
            java.lang.String r2 = "false"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x018f }
            if (r2 == 0) goto L_0x016e
            org.json.JSONObject r3 = r8.getJSONObject(r7)     // Catch:{ Exception -> 0x018f }
            java.lang.String r2 = "txnAmount"
            java.lang.String r2 = r3.getString(r2)     // Catch:{ Exception -> 0x018f }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ Exception -> 0x018f }
            float r9 = r9 + r2
        L_0x016e:
            int r7 = r7 + 1
            goto L_0x0147
        L_0x0171:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x018f }
            float r2 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x018f }
            float r2 = r2 - r9
            X.AnonymousClass000.A1I(r3, r2, r4)     // Catch:{ Exception -> 0x018f }
            java.lang.String r6 = java.lang.String.format(r5, r3)     // Catch:{ Exception -> 0x018f }
            goto L_0x018f
        L_0x0180:
            r2.enforceInterface(r3)
            java.lang.String r3 = r2.readString()
            java.lang.String r2 = r2.readString()
            java.lang.String r6 = r13.B9V(r3, r2)
        L_0x018f:
            r1.writeNoException()
            r1.writeString(r6)
            return r0
        L_0x0196:
            r2.enforceInterface(r3)
            java.lang.String r5 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.4g0 r2 = r2.A00
            boolean r2 = r2.A2E(r5, r4, r3)
            goto L_0x0300
        L_0x01af:
            r2.enforceInterface(r3)
            java.lang.String r6 = r2.readString()
            java.lang.String r5 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r8 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.4g0 r7 = r2.A00
            java.lang.String r2 = X.C90464aC.A0e(r5, r6, r4)
            byte[] r2 = X.C133166Xa.A03(r2)
            java.lang.String r3 = X.C36441kJ.A13(r2)
            android.content.Context r2 = r7.A00     // Catch:{ Exception -> 0x02db }
            X.6PJ r3 = X.AnonymousClass6PJ.A00(r2, r3)     // Catch:{ Exception -> 0x02db }
            r7.A04 = r3     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = "AES"
            java.lang.String r2 = r3.A01(r2)     // Catch:{ Exception -> 0x02db }
            java.lang.String r3 = X.C133166Xa.A01(r8, r2)     // Catch:{ Exception -> 0x02db }
            org.json.JSONObject r2 = X.C36441kJ.A1C(r3)     // Catch:{ Exception -> 0x01ed }
            java.lang.Boolean r2 = X.AnonymousClass6HT.A00(r2)     // Catch:{ Exception -> 0x01ed }
            goto L_0x01f1
        L_0x01ed:
            java.lang.Boolean r2 = X.C36381kD.A0j()     // Catch:{ Exception -> 0x02db }
        L_0x01f1:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x02db }
            if (r2 == 0) goto L_0x02db
            X.C93164g0.A01(r3, r7)     // Catch:{ Exception -> 0x02db }
            org.json.JSONObject r3 = r7.A02     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = "ACSTATUS"
            java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = "DA"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x02db }
            if (r2 == 0) goto L_0x02d9
            r7.A2E(r6, r5, r4)     // Catch:{ Exception -> 0x02db }
            goto L_0x02d9
        L_0x020f:
            r2.enforceInterface(r3)
            java.lang.String r6 = r2.readString()
            java.lang.String r5 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.4g0 r8 = r2.A00
            X.6MM r2 = new X.6MM
            r2.<init>()
            boolean r2 = r2.A01(r3)     // Catch:{ Exception -> 0x02db }
            if (r2 == 0) goto L_0x02db
            X.7b0 r2 = new X.7b0     // Catch:{ Exception -> 0x02db }
            r2.<init>(r3)     // Catch:{ Exception -> 0x02db }
            java.util.List r7 = X.C156817b0.A01     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = X.C90464aC.A0e(r5, r6, r4)     // Catch:{ Exception -> 0x02db }
            byte[] r2 = X.C133166Xa.A03(r2)     // Catch:{ Exception -> 0x02db }
            java.lang.String r3 = X.C36441kJ.A13(r2)     // Catch:{ Exception -> 0x02db }
            android.content.Context r2 = r8.A00     // Catch:{ Exception -> 0x02db }
            X.6PJ r3 = X.AnonymousClass6PJ.A00(r2, r3)     // Catch:{ Exception -> 0x02db }
            r8.A04 = r3     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = "AES"
            java.lang.String r6 = r3.A01(r2)     // Catch:{ Exception -> 0x02db }
            int r2 = r7.size()     // Catch:{ Exception -> 0x02db }
            if (r2 == 0) goto L_0x02db
            r5 = 0
        L_0x0259:
            int r2 = r7.size()     // Catch:{ Exception -> 0x02db }
            if (r5 >= r2) goto L_0x02d9
            java.lang.Object r4 = r7.get(r5)     // Catch:{ Exception -> 0x02db }
            X.5rh r4 = (X.C120555rh) r4     // Catch:{ Exception -> 0x02db }
            java.lang.String r3 = r4.A00     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = "STATE"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x02db }
            if (r2 == 0) goto L_0x0279
            java.lang.String r2 = r4.A01     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = X.C133166Xa.A01(r2, r6)     // Catch:{ Exception -> 0x02db }
            X.C93164g0.A01(r2, r8)     // Catch:{ Exception -> 0x02db }
            goto L_0x0290
        L_0x0279:
            java.lang.String r3 = r4.A00     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = "DEVICE-CERT"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x02db }
            if (r2 == 0) goto L_0x0290
            java.lang.String r2 = r4.A01     // Catch:{ Exception -> 0x02db }
            java.lang.String r4 = X.C133166Xa.A01(r2, r6)     // Catch:{ Exception -> 0x02db }
            X.6PJ r3 = r8.A04     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = "DeviceCertificate"
            r3.A03(r4, r2)     // Catch:{ Exception -> 0x02db }
        L_0x0290:
            int r5 = r5 + 1
            goto L_0x0259
        L_0x0293:
            r2.enforceInterface(r3)
            java.lang.String r6 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.4g0 r5 = r2.A00
            java.lang.String r2 = X.C90464aC.A0e(r4, r6, r3)
            byte[] r2 = X.C133166Xa.A03(r2)     // Catch:{ Exception -> 0x02db }
            java.lang.String r4 = X.C36441kJ.A13(r2)     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = "AndroidKeyStore"
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r2)     // Catch:{ Exception -> 0x02db }
            r2 = 0
            r3.load(r2)     // Catch:{ Exception -> 0x02db }
            java.security.cert.Certificate r2 = r3.getCertificate(r4)     // Catch:{ Exception -> 0x02db }
            r2.getPublicKey()     // Catch:{ Exception -> 0x02db }
            android.content.Context r2 = r5.A00     // Catch:{ Exception -> 0x02db }
            X.6PJ r3 = X.AnonymousClass6PJ.A00(r2, r4)     // Catch:{ Exception -> 0x02db }
            r5.A04 = r3     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = "ServerRiskParams"
            java.lang.String r3 = r3.A01(r2)     // Catch:{ Exception -> 0x02db }
            java.lang.String r2 = ""
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x02db }
            if (r2 != 0) goto L_0x02db
        L_0x02d9:
            r2 = 1
            goto L_0x0300
        L_0x02db:
            r2 = 0
            goto L_0x0300
        L_0x02dd:
            r2.enforceInterface(r3)
            boolean r2 = X.C93164g0.A07()
            goto L_0x0300
        L_0x02e5:
            r2.enforceInterface(r3)
            java.lang.String r14 = r2.readString()
            java.lang.String r15 = r2.readString()
            java.lang.String r16 = r2.readString()
            java.lang.String r17 = r2.readString()
            java.lang.String r18 = r2.readString()
            boolean r2 = r13.BnC(r14, r15, r16, r17, r18)
        L_0x0300:
            r1.writeNoException()
            r1.writeInt(r2)
            return r0
        L_0x0307:
            r1.writeString(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91554cE.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
