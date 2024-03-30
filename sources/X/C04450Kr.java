package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.0Kr  reason: invalid class name and case insensitive filesystem */
public class C04450Kr extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08320aY();
    public final C04340Kg A00;
    public final AnonymousClass0LT A01;
    public final AnonymousClass0LU A02;
    public final AnonymousClass0LS A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public static C10930fS A00(C12450i4 r1, long j) {
        return (C10930fS) r1.get(new C05020Mx(j));
    }

    public static void A01(String str, JSONObject jSONObject, byte[] bArr) {
        jSONObject.put(str, Base64.encodeToString(bArr, 11));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02d1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02f8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r2 = new java.lang.IllegalArgumentException("failed to parse attestation object", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0301, code lost:
        r2 = new java.lang.IllegalArgumentException("failed to parse COSE key", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x02d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:181:0x02f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x018e */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ad A[Catch:{ JSONException -> 0x0309, JSONException -> 0x0417 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02d1 A[ExcHandler: 0NZ | 0O6 (r1v27 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:75:0x014f] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02f8 A[ExcHandler: 0NZ | 0O6 (r1v19 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:54:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x033e A[SYNTHETIC, Splitter:B:209:0x033e] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0408 A[Catch:{ JSONException -> 0x0309, JSONException -> 0x0417 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:159:0x02d0=Splitter:B:159:0x02d0, B:85:0x018e=Splitter:B:85:0x018e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02() {
        /*
            r24 = this;
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0417 }
            r10.<init>()     // Catch:{ JSONException -> 0x0417 }
            r9 = r24
            byte[] r1 = r9.A07     // Catch:{ JSONException -> 0x0417 }
            if (r1 == 0) goto L_0x0013
            int r0 = r1.length     // Catch:{ JSONException -> 0x0417 }
            if (r0 <= 0) goto L_0x0013
            java.lang.String r0 = "rawId"
            A01(r0, r10, r1)     // Catch:{ JSONException -> 0x0417 }
        L_0x0013:
            java.lang.String r1 = r9.A06     // Catch:{ JSONException -> 0x0417 }
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "authenticatorAttachment"
            r10.put(r0, r1)     // Catch:{ JSONException -> 0x0417 }
        L_0x001c:
            java.lang.String r1 = r9.A05     // Catch:{ JSONException -> 0x0417 }
            if (r1 == 0) goto L_0x0029
            X.0LS r0 = r9.A03     // Catch:{ JSONException -> 0x0417 }
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "type"
            r10.put(r0, r1)     // Catch:{ JSONException -> 0x0417 }
        L_0x0029:
            java.lang.String r1 = r9.A04     // Catch:{ JSONException -> 0x0417 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = "id"
            r10.put(r0, r1)     // Catch:{ JSONException -> 0x0417 }
        L_0x0032:
            java.lang.String r23 = "response"
            X.0LT r3 = r9.A01     // Catch:{ JSONException -> 0x0417 }
            r8 = 0
            if (r3 == 0) goto L_0x0083
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0079 }
            r7.<init>()     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r2 = "clientDataJSON"
            byte[] r1 = r3.A01     // Catch:{ JSONException -> 0x0079 }
            r0 = 0
            if (r1 == 0) goto L_0x004b
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x0079 }
        L_0x004b:
            r7.put(r2, r0)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r2 = "authenticatorData"
            byte[] r1 = r3.A02     // Catch:{ JSONException -> 0x0079 }
            r0 = 0
            if (r1 == 0) goto L_0x005b
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x0079 }
        L_0x005b:
            r7.put(r2, r0)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r2 = "signature"
            byte[] r1 = r3.A03     // Catch:{ JSONException -> 0x0079 }
            r0 = 0
            if (r1 == 0) goto L_0x006b
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x0079 }
        L_0x006b:
            r7.put(r2, r0)     // Catch:{ JSONException -> 0x0079 }
            byte[] r1 = r3.A04     // Catch:{ JSONException -> 0x0079 }
            if (r1 == 0) goto L_0x02b2
            java.lang.String r0 = "userHandle"
            A01(r0, r7, r1)     // Catch:{ JSONException -> 0x0079 }
            goto L_0x02b2
        L_0x0079:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticatorAssertionResponse to JSON object"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x0417 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0417 }
            goto L_0x0407
        L_0x0083:
            X.0LU r6 = r9.A02     // Catch:{ JSONException -> 0x0417 }
            if (r6 == 0) goto L_0x0312
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0309 }
            r7.<init>()     // Catch:{ JSONException -> 0x0309 }
            byte[] r1 = r6.A01     // Catch:{ JSONException -> 0x0309 }
            if (r1 == 0) goto L_0x0095
            java.lang.String r0 = "clientDataJSON"
            A01(r0, r7, r1)     // Catch:{ JSONException -> 0x0309 }
        L_0x0095:
            byte[] r4 = r6.A02     // Catch:{ JSONException -> 0x0309 }
            if (r4 == 0) goto L_0x009e
            java.lang.String r0 = "attestationObject"
            A01(r0, r7, r4)     // Catch:{ JSONException -> 0x0309 }
        L_0x009e:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0309 }
            r5.<init>()     // Catch:{ JSONException -> 0x0309 }
            r3 = 0
        L_0x00a4:
            java.lang.String[] r2 = r6.A03     // Catch:{ JSONException -> 0x0309 }
            int r0 = r2.length     // Catch:{ JSONException -> 0x0309 }
            if (r3 >= r0) goto L_0x00c5
            r1 = r2[r3]     // Catch:{ JSONException -> 0x0309 }
            com.google.android.gms.fido.common.Transport r0 = com.google.android.gms.fido.common.Transport.HYBRID     // Catch:{ JSONException -> 0x0309 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0309 }
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0309 }
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "hybrid"
            r5.put(r3, r0)     // Catch:{ JSONException -> 0x0309 }
            goto L_0x00c2
        L_0x00bd:
            r0 = r2[r3]     // Catch:{ JSONException -> 0x0309 }
            r5.put(r3, r0)     // Catch:{ JSONException -> 0x0309 }
        L_0x00c2:
            int r3 = r3 + 1
            goto L_0x00a4
        L_0x00c5:
            java.lang.String r0 = "transports"
            r7.put(r0, r5)     // Catch:{ JSONException -> 0x0309 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
            int r0 = r4.length     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
            byte[] r1 = java.util.Arrays.copyOf(r4, r0)     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
            r0.<init>(r1)     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
            X.0f9 r1 = new X.0f9     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
            r1.<init>(r0)     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
            X.0fS r0 = X.AnonymousClass0LU.A00(r1, r0)     // Catch:{ all -> 0x02f3 }
            r1.close()     // Catch:{ IOException -> 0x00e3, 0NZ | 0O6 -> 0x02f8 }
        L_0x00e3:
            java.lang.Class<X.0N0> r4 = X.AnonymousClass0N0.class
            X.0fS r0 = X.C10930fS.A00(r0, r4)     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
            X.0N0 r0 = (X.AnonymousClass0N0) r0     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
            X.0Mb r2 = r0.A00     // Catch:{ 0O6 -> 0x02ea }
            java.lang.String r1 = "authData"
            X.0My r0 = new X.0My     // Catch:{ 0O6 -> 0x02ea }
            r0.<init>(r1)     // Catch:{ 0O6 -> 0x02ea }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ 0O6 -> 0x02ea }
            X.0fS r0 = (X.C10930fS) r0     // Catch:{ 0O6 -> 0x02ea }
            if (r0 == 0) goto L_0x02e3
            java.lang.Class<X.0Mw> r12 = X.C05010Mw.class
            X.0fS r0 = X.C10930fS.A00(r0, r12)     // Catch:{ 0O6 -> 0x02ea }
            X.0Mw r0 = (X.C05010Mw) r0     // Catch:{ 0O6 -> 0x02ea }
            X.0fW r0 = r0.A00     // Catch:{ 0O6 -> 0x02ea }
            r22 = r0
            r5 = r22
            X.0Mt r5 = (X.C04980Mt) r5     // Catch:{ JSONException -> 0x0309 }
            byte[] r2 = r5.zza     // Catch:{ JSONException -> 0x0309 }
            int r1 = r5.A06()     // Catch:{ JSONException -> 0x0309 }
            int r0 = r5.A04()     // Catch:{ JSONException -> 0x0309 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2, r1, r0)     // Catch:{ JSONException -> 0x0309 }
            java.nio.ByteBuffer r2 = r0.asReadOnlyBuffer()     // Catch:{ JSONException -> 0x0309 }
            int r0 = r2.position()     // Catch:{ IllegalArgumentException -> 0x02da }
            r13 = 32
            int r0 = r0 + 32
            r2.position(r0)     // Catch:{ IllegalArgumentException -> 0x02da }
            byte r0 = r2.get()     // Catch:{ IllegalArgumentException -> 0x02da }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x02d3
            int r0 = r2.position()     // Catch:{ IllegalArgumentException -> 0x02da }
            int r0 = r0 + 4
            r2.position(r0)     // Catch:{ IllegalArgumentException -> 0x02da }
            int r0 = r2.position()     // Catch:{ IllegalArgumentException -> 0x02da }
            int r0 = r0 + 16
            r2.position(r0)     // Catch:{ IllegalArgumentException -> 0x02da }
            short r1 = r2.getShort()     // Catch:{ IllegalArgumentException -> 0x02da }
            int r0 = r2.position()     // Catch:{ IllegalArgumentException -> 0x02da }
            int r0 = r0 + r1
            r2.position(r0)     // Catch:{ IllegalArgumentException -> 0x02da }
            int r3 = r2.position()     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            int r1 = r22.A04()     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            int r0 = r5.A04()     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            int r2 = X.C10970fW.A00(r3, r1, r0)     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            if (r2 != 0) goto L_0x017a
            X.0fW r5 = X.C10970fW.A00     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
        L_0x0163:
            X.0Mt r5 = (X.C04980Mt) r5     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            byte[] r3 = r5.zza     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            int r2 = r5.A06()     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            int r1 = r5.A04()     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            r0.<init>(r3, r2, r1)     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            X.0f9 r1 = new X.0f9     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            r1.<init>(r0)     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            goto L_0x0187
        L_0x017a:
            byte[] r1 = r5.zza     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            int r0 = r5.A06()     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            int r0 = r0 + r3
            X.0Ms r5 = new X.0Ms     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            r5.<init>(r1, r0, r2)     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            goto L_0x0163
        L_0x0187:
            X.0fS r0 = X.AnonymousClass0LU.A00(r1, r0)     // Catch:{ all -> 0x02cc }
            r1.close()     // Catch:{ IOException -> 0x018e, 0NZ | 0O6 -> 0x02d1 }
        L_0x018e:
            X.0fS r0 = X.C10930fS.A00(r0, r4)     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            X.0N0 r0 = (X.AnonymousClass0N0) r0     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
            X.0Mb r6 = r0.A00     // Catch:{ JSONException -> 0x0309 }
            r0 = 3
            X.0fS r0 = A00(r6, r0)     // Catch:{ JSONException -> 0x0309 }
            r4 = 1
            X.0fS r1 = A00(r6, r4)     // Catch:{ JSONException -> 0x0309 }
            java.lang.String r21 = "COSE key missing required fields"
            if (r0 == 0) goto L_0x02c7
            if (r1 == 0) goto L_0x02c7
            java.lang.Class<X.0Mx> r11 = X.C05020Mx.class
            X.0fS r0 = X.C10930fS.A00(r0, r11)     // Catch:{ 0O6 -> 0x02be }
            X.0Mx r0 = (X.C05020Mx) r0     // Catch:{ 0O6 -> 0x02be }
            long r14 = r0.A00     // Catch:{ 0O6 -> 0x02be }
            X.0fS r0 = X.C10930fS.A00(r1, r11)     // Catch:{ 0O6 -> 0x02be }
            X.0Mx r0 = (X.C05020Mx) r0     // Catch:{ 0O6 -> 0x02be }
            long r2 = r0.A00     // Catch:{ 0O6 -> 0x02be }
            r19 = 2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01c6
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x029c
            r2 = 2
        L_0x01c6:
            r0 = -1
            X.0fS r0 = A00(r6, r0)     // Catch:{ 0O6 -> 0x02be }
            if (r0 == 0) goto L_0x02b4
            X.0fS r0 = X.C10930fS.A00(r0, r11)     // Catch:{ 0O6 -> 0x02be }
            X.0Mx r0 = (X.C05020Mx) r0     // Catch:{ 0O6 -> 0x02be }
            long r0 = r0.A00     // Catch:{ 0O6 -> 0x02be }
            r11 = 2
            java.lang.String r18 = "COSE coordinates are the wrong size"
            r17 = 1
            int r16 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r16 != 0) goto L_0x0247
            int r16 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x0247
            r0 = -2
            X.0fS r2 = A00(r6, r0)     // Catch:{ 0O6 -> 0x02be }
            r0 = -3
            X.0fS r1 = A00(r6, r0)     // Catch:{ 0O6 -> 0x02be }
            if (r2 == 0) goto L_0x02b9
            if (r1 == 0) goto L_0x02b9
            X.0fS r0 = X.C10930fS.A00(r2, r12)     // Catch:{ 0O6 -> 0x02be }
            X.0Mw r0 = (X.C05010Mw) r0     // Catch:{ 0O6 -> 0x02be }
            X.0fW r3 = r0.A00     // Catch:{ 0O6 -> 0x02be }
            X.0fS r0 = X.C10930fS.A00(r1, r12)     // Catch:{ 0O6 -> 0x02be }
            X.0Mw r0 = (X.C05010Mw) r0     // Catch:{ 0O6 -> 0x02be }
            X.0fW r2 = r0.A00     // Catch:{ 0O6 -> 0x02be }
            int r0 = r3.A04()     // Catch:{ 0O6 -> 0x02be }
            if (r0 != r13) goto L_0x0242
            int r0 = r2.A04()     // Catch:{ 0O6 -> 0x02be }
            if (r0 != r13) goto L_0x0242
            java.lang.String r0 = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE"
            byte[] r1 = android.util.Base64.decode(r0, r8)     // Catch:{ 0O6 -> 0x02be }
            r0 = 3
            byte[][] r6 = new byte[r0][]     // Catch:{ 0O6 -> 0x02be }
            r6[r8] = r1     // Catch:{ 0O6 -> 0x02be }
            byte[] r0 = r3.A05()     // Catch:{ 0O6 -> 0x02be }
            r6[r17] = r0     // Catch:{ 0O6 -> 0x02be }
            byte[] r0 = r2.A05()     // Catch:{ 0O6 -> 0x02be }
            r6[r11] = r0     // Catch:{ 0O6 -> 0x02be }
            r2 = 0
            r1 = 0
        L_0x0228:
            r5 = 3
            if (r2 >= r5) goto L_0x0232
            r0 = r6[r2]     // Catch:{ 0O6 -> 0x02be }
            int r0 = r0.length     // Catch:{ 0O6 -> 0x02be }
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L_0x0228
        L_0x0232:
            byte[] r4 = new byte[r1]     // Catch:{ 0O6 -> 0x02be }
            r3 = 0
            r2 = 0
        L_0x0236:
            if (r3 >= r5) goto L_0x029d
            r1 = r6[r3]     // Catch:{ 0O6 -> 0x02be }
            int r0 = r1.length     // Catch:{ 0O6 -> 0x02be }
            java.lang.System.arraycopy(r1, r8, r4, r2, r0)     // Catch:{ 0O6 -> 0x02be }
            int r2 = r2 + r0
            int r3 = r3 + 1
            goto L_0x0236
        L_0x0242:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r18)     // Catch:{ 0O6 -> 0x02be }
            goto L_0x02bd
        L_0x0247:
            int r16 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x029c
            r3 = 6
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x029c
            r0 = -2
            X.0fS r0 = A00(r6, r0)     // Catch:{ 0O6 -> 0x02be }
            if (r0 == 0) goto L_0x0297
            X.0fS r0 = X.C10930fS.A00(r0, r12)     // Catch:{ 0O6 -> 0x02be }
            X.0Mw r0 = (X.C05010Mw) r0     // Catch:{ 0O6 -> 0x02be }
            X.0fW r1 = r0.A00     // Catch:{ 0O6 -> 0x02be }
            int r0 = r1.A04()     // Catch:{ 0O6 -> 0x02be }
            if (r0 != r13) goto L_0x0292
            java.lang.String r0 = "MCowBQYDK2VwAyEA"
            byte[] r0 = android.util.Base64.decode(r0, r8)     // Catch:{ 0O6 -> 0x02be }
            byte[][] r5 = new byte[r11][]     // Catch:{ 0O6 -> 0x02be }
            r5[r8] = r0     // Catch:{ 0O6 -> 0x02be }
            byte[] r0 = r1.A05()     // Catch:{ 0O6 -> 0x02be }
            r5[r17] = r0     // Catch:{ 0O6 -> 0x02be }
            r2 = 0
            r1 = 0
        L_0x0279:
            if (r2 >= r11) goto L_0x0282
            r0 = r5[r2]     // Catch:{ 0O6 -> 0x02be }
            int r0 = r0.length     // Catch:{ 0O6 -> 0x02be }
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L_0x0279
        L_0x0282:
            byte[] r4 = new byte[r1]     // Catch:{ 0O6 -> 0x02be }
            r3 = 0
            r2 = 0
        L_0x0286:
            if (r3 >= r11) goto L_0x029d
            r1 = r5[r3]     // Catch:{ 0O6 -> 0x02be }
            int r0 = r1.length     // Catch:{ 0O6 -> 0x02be }
            java.lang.System.arraycopy(r1, r8, r4, r2, r0)     // Catch:{ 0O6 -> 0x02be }
            int r2 = r2 + r0
            int r3 = r3 + 1
            goto L_0x0286
        L_0x0292:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r18)     // Catch:{ 0O6 -> 0x02be }
            goto L_0x02bd
        L_0x0297:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r21)     // Catch:{ 0O6 -> 0x02be }
            goto L_0x02bd
        L_0x029c:
            r4 = 0
        L_0x029d:
            java.lang.String r1 = "authenticatorData"
            byte[] r0 = r22.A05()     // Catch:{ JSONException -> 0x0309 }
            A01(r1, r7, r0)     // Catch:{ JSONException -> 0x0309 }
            java.lang.String r0 = "publicKeyAlgorithm"
            r7.put(r0, r14)     // Catch:{ JSONException -> 0x0309 }
            if (r4 == 0) goto L_0x02b2
            java.lang.String r0 = "publicKey"
            A01(r0, r7, r4)     // Catch:{ JSONException -> 0x0309 }
        L_0x02b2:
            r8 = 1
            goto L_0x0331
        L_0x02b4:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r21)     // Catch:{ 0O6 -> 0x02be }
            goto L_0x02bd
        L_0x02b9:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r21)     // Catch:{ 0O6 -> 0x02be }
        L_0x02bd:
            throw r0     // Catch:{ 0O6 -> 0x02be }
        L_0x02be:
            r1 = move-exception
            java.lang.String r0 = "COSE key ill-formed"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0309 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0309 }
            goto L_0x0308
        L_0x02c7:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r21)     // Catch:{ JSONException -> 0x0309 }
            throw r0     // Catch:{ JSONException -> 0x0309 }
        L_0x02cc:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x02d0, 0NZ | 0O6 -> 0x02d1 }
        L_0x02d0:
            throw r0     // Catch:{ 0NZ | 0O6 -> 0x02d1 }
        L_0x02d1:
            r1 = move-exception
            goto L_0x0301
        L_0x02d3:
            java.lang.String r0 = "authData does not include credential data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ IllegalArgumentException -> 0x02da }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02da }
        L_0x02da:
            r1 = move-exception
            java.lang.String r0 = "ill-formed authenticator data"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0309 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0309 }
            goto L_0x0308
        L_0x02e3:
            java.lang.String r0 = "attestation object missing authData"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 0O6 -> 0x02ea }
            throw r0     // Catch:{ 0O6 -> 0x02ea }
        L_0x02ea:
            r1 = move-exception
            java.lang.String r0 = "authData value has wrong type"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0309 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0309 }
            goto L_0x0308
        L_0x02f3:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x02f7, 0NZ | 0O6 -> 0x02f8 }
        L_0x02f7:
            throw r0     // Catch:{ 0NZ | 0O6 -> 0x02f8 }
        L_0x02f8:
            r1 = move-exception
            java.lang.String r0 = "failed to parse attestation object"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0309 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0309 }
            goto L_0x0308
        L_0x0301:
            java.lang.String r0 = "failed to parse COSE key"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0309 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0309 }
        L_0x0308:
            throw r2     // Catch:{ JSONException -> 0x0309 }
        L_0x0309:
            r2 = move-exception
            java.lang.String r1 = "Error encoding AuthenticatorAttestationResponse to JSON object"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x0417 }
            r0.<init>(r1, r2)     // Catch:{ JSONException -> 0x0417 }
            throw r0     // Catch:{ JSONException -> 0x0417 }
        L_0x0312:
            X.0LS r2 = r9.A03     // Catch:{ JSONException -> 0x0417 }
            if (r2 == 0) goto L_0x0330
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03ff }
            r7.<init>()     // Catch:{ JSONException -> 0x03ff }
            java.lang.String r1 = "code"
            X.0Nj r0 = r2.A00     // Catch:{ JSONException -> 0x03ff }
            int r0 = r0.zzb     // Catch:{ JSONException -> 0x03ff }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x03ff }
            java.lang.String r1 = r2.A01     // Catch:{ JSONException -> 0x03ff }
            if (r1 == 0) goto L_0x032d
            java.lang.String r0 = "message"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x03ff }
        L_0x032d:
            java.lang.String r23 = "error"
            goto L_0x0331
        L_0x0330:
            r7 = 0
        L_0x0331:
            if (r7 == 0) goto L_0x0338
            r0 = r23
            r10.put(r0, r7)     // Catch:{ JSONException -> 0x0417 }
        L_0x0338:
            X.0Kg r9 = r9.A00     // Catch:{ JSONException -> 0x0417 }
            java.lang.String r7 = "clientExtensionResults"
            if (r9 == 0) goto L_0x0408
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03f6 }
            r8.<init>()     // Catch:{ JSONException -> 0x03f6 }
            X.0KJ r0 = r9.A00     // Catch:{ JSONException -> 0x03f6 }
            if (r0 == 0) goto L_0x0358
            java.lang.String r3 = "credProps"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03ed }
            r2.<init>()     // Catch:{ JSONException -> 0x03ed }
            java.lang.String r1 = "rk"
            boolean r0 = r0.A00     // Catch:{ JSONException -> 0x03ed }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x03ed }
            r8.put(r3, r2)     // Catch:{ JSONException -> 0x03f6 }
        L_0x0358:
            X.0KN r0 = r9.A01     // Catch:{ JSONException -> 0x03f6 }
            if (r0 == 0) goto L_0x039a
            java.lang.String r6 = "uvm"
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x038e }
            r5.<init>()     // Catch:{ JSONException -> 0x038e }
            java.util.List r4 = r0.A00     // Catch:{ JSONException -> 0x038e }
            if (r4 == 0) goto L_0x0397
            r3 = 0
        L_0x0368:
            int r0 = r4.size()     // Catch:{ JSONException -> 0x038e }
            if (r3 >= r0) goto L_0x0397
            java.lang.Object r2 = r4.get(r3)     // Catch:{ JSONException -> 0x038e }
            X.0Ke r2 = (X.C04320Ke) r2     // Catch:{ JSONException -> 0x038e }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x038e }
            r1.<init>()     // Catch:{ JSONException -> 0x038e }
            short r0 = r2.A02     // Catch:{ JSONException -> 0x038e }
            r1.put(r0)     // Catch:{ JSONException -> 0x038e }
            short r0 = r2.A01     // Catch:{ JSONException -> 0x038e }
            r1.put(r0)     // Catch:{ JSONException -> 0x038e }
            short r0 = r2.A02     // Catch:{ JSONException -> 0x038e }
            r1.put(r0)     // Catch:{ JSONException -> 0x038e }
            r5.put(r3, r1)     // Catch:{ JSONException -> 0x038e }
            int r3 = r3 + 1
            goto L_0x0368
        L_0x038e:
            r1 = move-exception
            java.lang.String r0 = "Error encoding UvmEntries to JSON object"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x03f6 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x03f6 }
            goto L_0x03f5
        L_0x0397:
            r8.put(r6, r5)     // Catch:{ JSONException -> 0x03f6 }
        L_0x039a:
            X.0KZ r2 = r9.A02     // Catch:{ JSONException -> 0x03f6 }
            if (r2 == 0) goto L_0x040f
            java.lang.String r6 = "prf"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03e4 }
            r5.<init>()     // Catch:{ JSONException -> 0x03e4 }
            java.lang.String r1 = "enabled"
            boolean r0 = r2.A00     // Catch:{ JSONException -> 0x03e4 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x03e4 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03e4 }
            r4.<init>()     // Catch:{ JSONException -> 0x03e4 }
            byte[] r9 = r2.A01     // Catch:{ JSONException -> 0x03e4 }
            if (r9 == 0) goto L_0x03db
            java.lang.String r2 = "first"
            r1 = 0
            r0 = 31
            byte[] r0 = java.util.Arrays.copyOfRange(r9, r1, r0)     // Catch:{ JSONException -> 0x03e4 }
            r3 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x03e4 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x03e4 }
            int r0 = r9.length     // Catch:{ JSONException -> 0x03e4 }
            r2 = 64
            if (r0 != r2) goto L_0x03db
            java.lang.String r1 = "second"
            r0 = 32
            byte[] r0 = java.util.Arrays.copyOfRange(r9, r0, r2)     // Catch:{ JSONException -> 0x03e4 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x03e4 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x03e4 }
        L_0x03db:
            java.lang.String r0 = "results"
            r5.put(r0, r4)     // Catch:{ JSONException -> 0x03e4 }
            r8.put(r6, r5)     // Catch:{ JSONException -> 0x03f6 }
            goto L_0x040f
        L_0x03e4:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticationExtensionsPrfOutputs to JSON object"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x03f6 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x03f6 }
            goto L_0x03f5
        L_0x03ed:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x03f6 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x03f6 }
        L_0x03f5:
            throw r2     // Catch:{ JSONException -> 0x03f6 }
        L_0x03f6:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticationExtensionsClientOutputs to JSON object"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x0417 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0417 }
            goto L_0x0407
        L_0x03ff:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticatorErrorResponse to JSON object"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x0417 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0417 }
        L_0x0407:
            throw r2     // Catch:{ JSONException -> 0x0417 }
        L_0x0408:
            if (r8 == 0) goto L_0x0412
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0417 }
            r8.<init>()     // Catch:{ JSONException -> 0x0417 }
        L_0x040f:
            r10.put(r7, r8)     // Catch:{ JSONException -> 0x0417 }
        L_0x0412:
            java.lang.String r0 = r10.toString()
            return r0
        L_0x0417:
            r2 = move-exception
            java.lang.String r1 = "Error encoding PublicKeyCredential to JSON object"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04450Kr.A02():java.lang.String");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04450Kr) {
            C04450Kr r4 = (C04450Kr) obj;
            if (!AnonymousClass0QM.A00(this.A04, r4.A04) || !AnonymousClass0QM.A00(this.A05, r4.A05) || !Arrays.equals(this.A07, r4.A07) || !AnonymousClass0QM.A00(this.A02, r4.A02) || !AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A03, r4.A03) || !AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A06, r4.A06)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A04;
        objArr[1] = this.A05;
        objArr[2] = this.A07;
        objArr[3] = this.A01;
        objArr[4] = this.A02;
        objArr[5] = this.A03;
        objArr[6] = this.A00;
        return AnonymousClass000.A0M(this.A06, objArr, 7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r3 == null) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 != null) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        X.AnonymousClass006.A06(r0);
        r1.A04 = r6;
        r1.A05 = r7;
        r1.A07 = r9;
        r1.A02 = r4;
        r1.A01 = r3;
        r1.A03 = r5;
        r1.A00 = r2;
        r1.A06 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r5 != null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C04450Kr(X.C04340Kg r2, X.AnonymousClass0LT r3, X.AnonymousClass0LU r4, X.AnonymousClass0LS r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, byte[] r9) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 1
            if (r4 == 0) goto L_0x001f
            if (r3 != 0) goto L_0x000a
        L_0x0008:
            if (r5 == 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            X.AnonymousClass006.A06(r0)
            r1.A04 = r6
            r1.A05 = r7
            r1.A07 = r9
            r1.A02 = r4
            r1.A01 = r3
            r1.A03 = r5
            r1.A00 = r2
            r1.A06 = r8
            return
        L_0x001f:
            if (r3 != 0) goto L_0x0008
            if (r5 == 0) goto L_0x000a
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04450Kr.<init>(X.0Kg, X.0LT, X.0LU, X.0LS, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A04, 1, false);
        AnonymousClass0Z9.A0C(parcel, this.A05, 2, false);
        AnonymousClass0Z9.A0F(parcel, this.A07, 3, false);
        AnonymousClass0Z9.A0B(parcel, this.A02, 4, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A01, 5, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A03, 6, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A00, 7, i, false);
        AnonymousClass0Z9.A0C(parcel, this.A06, 8, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
