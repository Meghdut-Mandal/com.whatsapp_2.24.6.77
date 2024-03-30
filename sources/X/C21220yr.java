package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.util.Log;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0yr  reason: invalid class name and case insensitive filesystem */
public class C21220yr {
    public File A00;
    public final C19630wG A01;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:27:0x006d, B:42:0x00d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.watls13.WtPersistentSession A00(java.io.File r19) {
        /*
            r13 = 0
            if (r19 == 0) goto L_0x00fa
            boolean r0 = r19.exists()
            if (r0 == 0) goto L_0x00fa
            byte[] r1 = X.AnonymousClass14R.A00(r19)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00f4 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00f4 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f4 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = "sni"
            java.lang.String r15 = r6.getString(r0)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = "port"
            int r19 = r6.getInt(r0)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = "cipher"
            java.lang.String r16 = r6.getString(r0)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = "psks"
            org.json.JSONArray r5 = r6.optJSONArray(r0)     // Catch:{ Exception -> 0x00f4 }
            if (r5 == 0) goto L_0x0071
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet     // Catch:{ Exception -> 0x00f4 }
            r10.<init>()     // Catch:{ Exception -> 0x00f4 }
            r4 = 0
            r1 = 0
        L_0x0038:
            int r0 = r5.length()     // Catch:{ Exception -> 0x00f4 }
            if (r1 >= r0) goto L_0x0072
            java.lang.String r0 = r5.getString(r1)     // Catch:{ Exception -> 0x00f4 }
            byte[] r0 = android.util.Base64.decode(r0, r4)     // Catch:{ Exception -> 0x00f4 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x00f4 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00f4 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x006c }
            r2.<init>(r3)     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r2.readObject()     // Catch:{ all -> 0x0062 }
            com.whatsapp.net.tls13.WtCachedPsk r0 = (com.whatsapp.net.tls13.WtCachedPsk) r0     // Catch:{ all -> 0x0062 }
            r2.close()     // Catch:{ all -> 0x006c }
            r3.close()     // Catch:{ Exception -> 0x00f4 }
            r10.add(r0)     // Catch:{ Exception -> 0x00f4 }
            int r1 = r1 + 1
            goto L_0x0038
        L_0x0062:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x006c }
        L_0x006b:
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e9
        L_0x0071:
            r10 = 0
        L_0x0072:
            java.lang.String r0 = "certs"
            org.json.JSONObject r11 = r6.getJSONObject(r0)     // Catch:{ Exception -> 0x00f4 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x00f4 }
            r9.<init>()     // Catch:{ Exception -> 0x00f4 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x00f4 }
            r8.<init>()     // Catch:{ Exception -> 0x00f4 }
            java.util.Iterator r12 = r11.keys()     // Catch:{ Exception -> 0x00f4 }
        L_0x0086:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x00f4 }
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00f4 }
            java.lang.Byte r7 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x00f4 }
            org.json.JSONArray r6 = r11.getJSONArray(r0)     // Catch:{ Exception -> 0x00f4 }
            int r0 = r6.length()     // Catch:{ Exception -> 0x00f4 }
            java.security.cert.Certificate[] r5 = new java.security.cert.Certificate[r0]     // Catch:{ Exception -> 0x00f4 }
            r4 = 0
            r3 = 0
        L_0x00a2:
            int r0 = r6.length()     // Catch:{ Exception -> 0x00f4 }
            if (r3 >= r0) goto L_0x00dc
            org.json.JSONObject r2 = r6.getJSONObject(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = "type"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = "data"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x00f4 }
            byte[] r2 = android.util.Base64.decode(r0, r4)     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ Exception -> 0x00f4 }
            java.security.cert.CertificateFactory r0 = (java.security.cert.CertificateFactory) r0     // Catch:{ Exception -> 0x00f4 }
            if (r0 != 0) goto L_0x00cb
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch:{ Exception -> 0x00f4 }
            r9.put(r1, r0)     // Catch:{ Exception -> 0x00f4 }
        L_0x00cb:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x00f4 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00f4 }
            java.security.cert.Certificate r0 = r0.generateCertificate(r1)     // Catch:{ all -> 0x00e0 }
            r5[r3] = r0     // Catch:{ all -> 0x00e0 }
            r1.close()     // Catch:{ Exception -> 0x00f4 }
            int r3 = r3 + 1
            goto L_0x00a2
        L_0x00dc:
            r8.put(r7, r5)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0086
        L_0x00e0:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ Exception -> 0x00f4 }
        L_0x00e9:
            throw r2     // Catch:{ Exception -> 0x00f4 }
        L_0x00ea:
            com.whatsapp.watls13.WtPersistentSession r14 = new com.whatsapp.watls13.WtPersistentSession     // Catch:{ Exception -> 0x00f4 }
            r18 = r8
            r17 = r10
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00f4 }
            return r14
        L_0x00f4:
            r1 = move-exception
            java.lang.String r0 = "WtPersistentSessionCacheImpl/readSession: unable to deserialize persisted session"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00fa:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21220yr.A00(java.io.File):com.whatsapp.watls13.WtPersistentSession");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A01(X.C21220yr r4) {
        /*
            monitor-enter(r4)
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0049
            X.0wG r0 = r4.A01     // Catch:{ all -> 0x004b }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x004b }
            r3 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            return r3
        L_0x000e:
            java.io.File r2 = r0.getCacheDir()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "watls-sessions"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x004b }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x004b }
            r4.A00 = r0     // Catch:{ all -> 0x004b }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x002d
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x004b }
            boolean r0 = r0.mkdir()     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x002d
            r4.A00 = r3     // Catch:{ all -> 0x004b }
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            return r3
        L_0x002d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r1.<init>()     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "WtPersistentSessionCacheImpl/getCacheDir: using external persistent cache directory "
            r1.append(r0)     // Catch:{ all -> 0x004b }
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x004b }
            r1.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x004b }
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x004b }
        L_0x0049:
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            return r0
        L_0x004b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21220yr.A01(X.0yr):java.io.File");
    }

    public synchronized void A03(byte[] bArr) {
        if (A01(this) != null) {
            File file = new File(A01(this), Base64.encodeToString(bArr, 10));
            if (!file.delete()) {
                StringBuilder sb = new StringBuilder();
                sb.append("WtPersistentSessionCacheImpl/removeSession: Error during remove session ");
                sb.append(file.getAbsolutePath());
                Log.e(sb.toString());
            }
        }
    }

    public synchronized void A02(Object obj, byte[] bArr) {
        RuntimeException runtimeException;
        JSONArray jSONArray;
        ObjectOutputStream objectOutputStream;
        Object obj2 = obj;
        synchronized (this) {
            if (A01(this) != null) {
                File file = new File(A01(this), Base64.encodeToString(bArr, 10));
                try {
                    WtPersistentSession wtPersistentSession = (WtPersistentSession) obj2;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sni", wtPersistentSession.A02);
                    jSONObject.put("port", wtPersistentSession.A00);
                    jSONObject.put("cipher", wtPersistentSession.A01);
                    LinkedHashSet linkedHashSet = wtPersistentSession.A03;
                    if (linkedHashSet != null) {
                        jSONArray = new JSONArray();
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            WtCachedPsk wtCachedPsk = (WtCachedPsk) it.next();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                    objectOutputStream.writeObject(wtCachedPsk);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    objectOutputStream.close();
                                    byteArrayOutputStream.close();
                                    jSONArray.put(Base64.encodeToString(byteArray, 2));
                                } catch (Throwable th) {
                                    byteArrayOutputStream.close();
                                    throw th;
                                }
                            } catch (IOException e) {
                                runtimeException = new RuntimeException(e);
                                throw runtimeException;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    } else {
                        jSONArray = null;
                    }
                    jSONObject.put("psks", jSONArray);
                    Map map = wtPersistentSession.A04;
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        Certificate[] certificateArr = (Certificate[]) entry.getValue();
                        int length = certificateArr.length;
                        int i = 0;
                        while (i < length) {
                            Certificate certificate = certificateArr[i];
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, certificate.getType());
                            try {
                                jSONObject3.put("data", Base64.encodeToString(certificate.getEncoded(), 2));
                                jSONArray2.put(jSONObject3);
                                i++;
                            } catch (CertificateEncodingException e2) {
                                runtimeException = new RuntimeException(e2);
                                throw runtimeException;
                            }
                        }
                        jSONObject2.put(String.valueOf(entry.getKey()), jSONArray2);
                    }
                    jSONObject.put("certs", jSONObject2);
                    AnonymousClass6YY.A0I(file, jSONObject.toString().getBytes());
                } catch (JSONException e3) {
                    throw new RuntimeException(e3);
                } catch (Exception e4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("WtPersistentSessionCacheImpl/putSession: Error during put session ");
                    sb.append(file.getAbsolutePath());
                    sb.append(" : ");
                    sb.append(e4);
                    Log.e(sb.toString());
                }
            }
        }
        return;
        throw th;
    }

    public C21220yr(C19630wG r1) {
        this.A01 = r1;
    }
}
