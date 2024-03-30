package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.0LU  reason: invalid class name */
public class AnonymousClass0LU extends AnonymousClass0K0 {
    public static final Parcelable.Creator CREATOR = new C08520as();
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final String[] A03;

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1J(objArr, Arrays.hashCode(this.A00));
        AnonymousClass000.A1K(objArr, Arrays.hashCode(this.A01));
        return AnonymousClass000.A0M(Integer.valueOf(Arrays.hashCode(this.A02)), objArr, 2);
    }

    public static final void A01(long j, byte b) {
        switch (b) {
            case 24:
                if (j < 24) {
                    StringBuilder A0v = AnonymousClass000.A0v("Integer value ");
                    A0v.append(j);
                    throw new AnonymousClass0NY(AnonymousClass000.A0q(" after add info could have been represented in 0 additional bytes, but used 1", A0v));
                }
                return;
            case 25:
                if (j < 256) {
                    StringBuilder A0v2 = AnonymousClass000.A0v("Integer value ");
                    A0v2.append(j);
                    throw new AnonymousClass0NY(AnonymousClass000.A0q(" after add info could have been represented in 0-1 additional bytes, but used 2", A0v2));
                }
                return;
            case 26:
                if (j < 65536) {
                    StringBuilder A0v3 = AnonymousClass000.A0v("Integer value ");
                    A0v3.append(j);
                    throw new AnonymousClass0NY(AnonymousClass000.A0q(" after add info could have been represented in 0-2 additional bytes, but used 4", A0v3));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    StringBuilder A0v4 = AnonymousClass000.A0v("Integer value ");
                    A0v4.append(j);
                    throw new AnonymousClass0NY(AnonymousClass000.A0q(" after add info could have been represented in 0-4 additional bytes, but used 8", A0v4));
                }
                return;
            default:
                return;
        }
    }

    public static void A02(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass001.A0A("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        } else if (obj2 == null) {
            String obj3 = obj.toString();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("null value in entry: ");
            A0u.append(obj3);
            throw AnonymousClass001.A0A(AnonymousClass000.A0q("=null", A0u));
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0LU) {
            AnonymousClass0LU r4 = (AnonymousClass0LU) obj;
            if (!Arrays.equals(this.A00, r4.A00) || !Arrays.equals(this.A01, r4.A01) || !Arrays.equals(this.A02, r4.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0LU(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        AnonymousClass006.A01(bArr);
        this.A00 = bArr;
        AnonymousClass006.A01(bArr2);
        this.A01 = bArr2;
        AnonymousClass006.A01(bArr3);
        this.A02 = bArr3;
        AnonymousClass006.A01(strArr);
        this.A03 = strArr;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C10930fS A00(X.C10740f9 r11, java.io.InputStream r12) {
        /*
            X.0Sh r0 = r11.A05()     // Catch:{ IOException -> 0x0327 }
            if (r0 == 0) goto L_0x031f
            byte r5 = r0.A01     // Catch:{ IOException | RuntimeException -> 0x0318 }
            byte r1 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0 = -128(0xffffffffffffff80, float:NaN)
            r9 = 1000(0x3e8, double:4.94E-321)
            r6 = 0
            if (r1 == r0) goto L_0x02a6
            r0 = -96
            if (r1 == r0) goto L_0x00ff
            r0 = -64
            if (r1 == r0) goto L_0x00f6
            r0 = -32
            if (r1 == r0) goto L_0x00bf
            if (r1 == 0) goto L_0x0066
            r0 = 32
            if (r1 == r0) goto L_0x0066
            r0 = 64
            if (r1 == r0) goto L_0x0047
            r0 = 96
            if (r1 != r0) goto L_0x0304
            X.C10740f9.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            byte[] r1 = X.C10740f9.A04(r11)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r2.<init>(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r0 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            long r0 = (long) r0     // Catch:{ IOException | RuntimeException -> 0x0318 }
            A01(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0My r1 = new X.0My     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            return r1
        L_0x0047:
            X.C10740f9.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            byte[] r3 = X.C10740f9.A04(r11)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r2 = r3.length     // Catch:{ IOException | RuntimeException -> 0x0318 }
            long r0 = (long) r2     // Catch:{ IOException | RuntimeException -> 0x0318 }
            A01(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.C10970fW.A00(r6, r2, r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            byte[] r1 = new byte[r2]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.System.arraycopy(r3, r6, r1, r6, r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Mt r0 = new X.0Mt     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Mw r1 = new X.0Mw     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            return r1
        L_0x0066:
            r11.A05()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Sh r0 = r11.A00     // Catch:{ IOException | RuntimeException -> 0x0318 }
            byte r2 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r4 = 1
            if (r2 != 0) goto L_0x0072
            r1 = 1
            goto L_0x0077
        L_0x0072:
            r0 = 32
            if (r2 != r0) goto L_0x00aa
            r1 = 0
        L_0x0077:
            long r2 = X.C10740f9.A00(r11)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0094
            if (r1 != 0) goto L_0x0084
            long r2 = ~r2     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x0084:
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x008a
            r0 = r2
            goto L_0x008b
        L_0x008a:
            long r0 = ~r2     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x008b:
            A01(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Mx r1 = new X.0Mx     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            return r1
        L_0x0094:
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.AnonymousClass000.A1M(r2, r6, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r0 = "the maximum supported unsigned/negative integer is %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass001.A0E(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x00aa:
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r0 = r2 >> 5
            r0 = r0 & 7
            X.AnonymousClass000.A1L(r1, r0, r6)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r0 = "expected major type 0 or 1 but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x00bf:
            X.C10740f9.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Sh r0 = r11.A00     // Catch:{ IOException | RuntimeException -> 0x0318 }
            byte r1 = r0.A01     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0 = 24
            if (r1 > r0) goto L_0x00ee
            long r0 = X.C10740f9.A00(r11)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r2 = (int) r0     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1 = 20
            r0 = 0
            if (r2 == r1) goto L_0x00e8
            r0 = 21
            if (r2 != r0) goto L_0x00da
            r0 = 1
            goto L_0x00e8
        L_0x00da:
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r0 = "expected FALSE or TRUE"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x00e8:
            X.0Mv r1 = new X.0Mv     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            return r1
        L_0x00ee:
            java.lang.String r0 = "expected simple value"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x00f6:
            java.lang.String r0 = "Tags are currently unsupported"
            X.0NZ r1 = new X.0NZ     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x00ff:
            X.C10740f9.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.C10740f9.A01(r11)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            long r1 = X.C10740f9.A00(r11)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x029f
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x029f
            if (r7 <= 0) goto L_0x0127
            X.0Wl r0 = r11.A01     // Catch:{ IOException | RuntimeException -> 0x0318 }
            long r7 = r1 + r1
            java.util.Deque r3 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r3.push(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x0127:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0297
            A01(r1, r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r7 = (int) r1     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Sg[] r5 = new X.C06090Sg[r7]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r9 = 0
            r8 = 0
        L_0x0133:
            long r3 = (long) r8     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0171
            X.0fS r4 = A00(r11, r12)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            if (r9 == 0) goto L_0x0162
            int r0 = r4.compareTo(r9)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            if (r0 > 0) goto L_0x0162
            java.lang.String r3 = "Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s"
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r0 = r9.toString()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r2[r6] = r0     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0 = 1
            r2[r0] = r1     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r0 = java.lang.String.format(r3, r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0NY r1 = new X.0NY     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x0162:
            X.0fS r3 = A00(r11, r12)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Sg r0 = new X.0Sg     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0.<init>(r4, r3)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r5[r8] = r0     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r8 = r8 + 1
            r9 = r4
            goto L_0x0133
        L_0x0171:
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r3.<init>()     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x0176:
            if (r6 >= r7) goto L_0x0195
            r2 = r5[r6]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0fS r0 = r2.A00     // Catch:{ IOException | RuntimeException -> 0x0318 }
            boolean r0 = r3.containsKey(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            if (r0 != 0) goto L_0x018c
            X.0fS r1 = r2.A00     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0fS r0 = r2.A01     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r3.put(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r6 = r6 + 1
            goto L_0x0176
        L_0x018c:
            java.lang.String r0 = "Attempted to add duplicate key to canonical CBOR Map."
            X.0NY r1 = new X.0NY     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x0195:
            java.util.Comparator r5 = X.C04800Mb.A03     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.util.Comparator r0 = r3.comparator()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r11 = 1
            if (r0 != 0) goto L_0x01a0
            r4 = 1
            goto L_0x01a4
        L_0x01a0:
            boolean r4 = r5.equals(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x01a4:
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.util.Map$Entry[] r2 = X.C12450i4.A01     // Catch:{ IOException | RuntimeException -> 0x0318 }
            boolean r0 = r3 instanceof java.util.Collection     // Catch:{ IOException | RuntimeException -> 0x0318 }
            if (r0 != 0) goto L_0x01c7
            java.util.Iterator r1 = r3.iterator()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x01b9:
            boolean r0 = r1.hasNext()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r0 = r1.next()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r3.add(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x01b9
        L_0x01c7:
            java.lang.Object[] r10 = r3.toArray(r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.util.Map$Entry[] r10 = (java.util.Map.Entry[]) r10     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r7 = r10.length     // Catch:{ IOException | RuntimeException -> 0x0318 }
            if (r7 == 0) goto L_0x0274
            r3 = 0
            r2 = 0
            if (r7 == r11) goto L_0x0257
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            if (r4 != 0) goto L_0x023e
            X.0hZ r0 = new X.0hZ     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0.<init>(r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.util.Arrays.sort(r10, r2, r7, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0 = r10[r2]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0.getClass()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Object r9 = r0.getKey()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r8[r2] = r9     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r6[r2] = r1     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0 = r8[r2]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            A02(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x01f8:
            int r0 = r11 + -1
            r4 = r10[r0]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r4.getClass()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r2 = r10[r11]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r2.getClass()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Object r1 = r2.getKey()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            A02(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r8[r11] = r1     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r6[r11] = r0     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r0 = r5.compare(r9, r1)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            if (r0 == 0) goto L_0x021f
            int r11 = r11 + 1
            r9 = r1
            if (r11 >= r7) goto L_0x0279
            goto L_0x01f8
        L_0x021f:
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r0 = "Multiple entries with same key: "
            r1.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.append(r3)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0c(r2, r1)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x023e:
            r0 = r10[r2]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0.getClass()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            A02(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r8[r2] = r1     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r6[r2] = r0     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r2 = r2 + 1
            if (r2 >= r7) goto L_0x0279
            goto L_0x023e
        L_0x0257:
            r0 = r10[r2]     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0.getClass()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Mc r0 = X.C04810Mc.A03     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0MY r0 = X.AnonymousClass0MZ.A01(r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Mc r2 = new X.0Mc     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r2.<init>(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0MY r1 = X.AnonymousClass0MZ.A01(r1)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x028c
        L_0x0274:
            X.0Mb r0 = X.C04800Mb.A01(r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0291
        L_0x0279:
            X.0Mc r0 = X.C04810Mc.A03     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Mo r0 = X.AnonymousClass0MZ.A00     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0MY r0 = new X.0MY     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0.<init>(r8, r7)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Mc r2 = new X.0Mc     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r2.<init>(r0, r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0MY r1 = new X.0MY     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>(r6, r7)     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x028c:
            X.0Mb r0 = new X.0Mb     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0.<init>(r1, r3, r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x0291:
            X.0N0 r1 = new X.0N0     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            return r1
        L_0x0297:
            java.lang.String r0 = "Parser being asked to read a large CBOR map"
            X.0NZ r1 = new X.0NZ     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x029f:
            java.lang.String r0 = "the maximum supported map length is 4611686018427387903L"
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass001.A0E(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x02a6:
            X.C10740f9.A02(r11, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.C10740f9.A01(r11)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            long r1 = X.C10740f9.A00(r11)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x02ed
            if (r0 <= 0) goto L_0x02c3
            X.0Wl r0 = r11.A01     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.util.Deque r3 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r3.push(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x02c3:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x02e5
            A01(r1, r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r0 = (int) r1     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0fS[] r5 = new X.C10930fS[r0]     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x02cd:
            long r3 = (long) r6     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02db
            X.0fS r0 = A00(r11, r12)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r5[r6] = r0     // Catch:{ IOException | RuntimeException -> 0x0318 }
            int r6 = r6 + 1
            goto L_0x02cd
        L_0x02db:
            X.0MZ r0 = X.AnonymousClass0MZ.A00(r5)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0Mz r1 = new X.0Mz     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            return r1
        L_0x02e5:
            java.lang.String r0 = "Parser being asked to read a large CBOR array"
            X.0NZ r1 = new X.0NZ     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x02ed:
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.AnonymousClass000.A1M(r2, r6, r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r0 = "the maximum supported array length is %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass001.A0E(r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            goto L_0x0317
        L_0x0304:
            int r0 = r1 >> 5
            r2 = r0 & 7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | RuntimeException -> 0x0318 }
            java.lang.String r0 = "Unidentifiable major type: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)     // Catch:{ IOException | RuntimeException -> 0x0318 }
            X.0NZ r1 = new X.0NZ     // Catch:{ IOException | RuntimeException -> 0x0318 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x0317:
            throw r1     // Catch:{ IOException | RuntimeException -> 0x0318 }
        L_0x0318:
            r1 = move-exception
            X.0NZ r0 = new X.0NZ
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x031f:
            java.lang.String r1 = "Parser being asked to parse an empty input stream"
            X.0NZ r0 = new X.0NZ
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0327:
            r1 = move-exception
            X.0NZ r0 = new X.0NZ
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LU.A00(X.0f9, java.io.InputStream):X.0fS");
    }

    public String toString() {
        AnonymousClass0UO r2 = new AnonymousClass0UO(getClass().getSimpleName());
        AnonymousClass0X2 r3 = AnonymousClass0X2.A00;
        byte[] bArr = this.A00;
        r2.A00(r3.A00(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.A01;
        r2.A00(r3.A00(bArr2, bArr2.length), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA);
        byte[] bArr3 = this.A02;
        r2.A00(r3.A00(bArr3, bArr3.length), PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ);
        r2.A00(Arrays.toString(this.A03), PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS);
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0F(parcel, this.A00, 2, false);
        AnonymousClass0Z9.A0F(parcel, this.A01, 3, false);
        AnonymousClass0Z9.A0F(parcel, this.A02, 4, false);
        AnonymousClass0Z9.A0H(parcel, this.A03, 5);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
