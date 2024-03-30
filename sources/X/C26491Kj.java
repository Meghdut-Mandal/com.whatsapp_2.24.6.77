package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.extensions.network.phoenix.FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Kj  reason: invalid class name and case insensitive filesystem */
public final class C26491Kj extends C26481Ki {
    public int A00;
    public final C19420v0 A01;
    public final C26561Kq A02;
    public final C26501Kk A03;
    public final C26551Kp A04;
    public final LinkedList A05 = new LinkedList();
    public final C19970wo A06;
    public final AnonymousClass1KW A07;
    public final C20810yC A08;
    public final AnonymousClass040 A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26491Kj(X.C20050ww r14, X.C19970wo r15, X.C19630wG r16, X.AnonymousClass1KW r17, X.C19420v0 r18, X.C26561Kq r19, X.C26501Kk r20, X.C26551Kp r21, X.C20810yC r22, X.AnonymousClass13E r23, X.C21080yd r24, X.C19770wU r25, X.AnonymousClass040 r26) {
        /*
            r13 = this;
            r0 = 1
            r8 = r16
            X.AnonymousClass00C.A0D(r8, r0)
            r0 = 2
            r11 = r25
            X.AnonymousClass00C.A0D(r11, r0)
            r0 = 3
            r10 = r24
            X.AnonymousClass00C.A0D(r10, r0)
            r0 = 4
            r7 = r14
            X.AnonymousClass00C.A0D(r14, r0)
            r0 = 5
            r9 = r23
            X.AnonymousClass00C.A0D(r9, r0)
            r0 = 6
            r3 = r18
            X.AnonymousClass00C.A0D(r3, r0)
            r0 = 7
            r4 = r17
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 10
            r1 = r19
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 11
            X.AnonymousClass00C.A0D(r15, r0)
            r0 = 12
            r2 = r22
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 13
            r5 = r26
            X.AnonymousClass00C.A0D(r5, r0)
            r0 = 14
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A01 = r3
            r13.A07 = r4
            r0 = r20
            r13.A03 = r0
            r0 = r21
            r13.A04 = r0
            r13.A02 = r1
            r13.A06 = r15
            r13.A08 = r2
            r13.A09 = r5
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r13.A05 = r0
            r1 = 3427(0xd63, float:4.802E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            r13.A00 = r0
            r13.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26491Kj.<init>(X.0ww, X.0wo, X.0wG, X.1KW, X.0v0, X.1Kq, X.1Kk, X.1Kp, X.0yC, X.13E, X.0yd, X.0wU, X.040):void");
    }

    public static final boolean A00(String str, String str2, String str3, byte[] bArr) {
        try {
            byte[] decode = Base64.decode(str2, 2);
            byte[] bytes = str3.getBytes(AnonymousClass0S4.A05);
            AnonymousClass00C.A08(bytes);
            int length = bytes.length;
            int length2 = bArr.length;
            byte[] copyOf = Arrays.copyOf(bytes, length + length2);
            System.arraycopy(bArr, 0, copyOf, length, length2);
            AnonymousClass00C.A0B(copyOf);
            C187098xE r2 = new C187098xE();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C202439lp.A00.B56(byteArrayOutputStream, str);
            C21756AZk aZk = new C21756AZk(byteArrayOutputStream.toByteArray());
            r2.reset();
            r2.write(copyOf, 0, copyOf.length);
            return r2.A00(aZk, decode);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception decoding Hex string: ");
            sb.append(e.getMessage());
            throw new AnonymousClass92O(sb.toString(), e);
        } catch (Exception e2) {
            e2.getMessage();
            return false;
        }
    }

    public final void A0F() {
        AnonymousClass6DG r0;
        LinkedList linkedList = this.A05;
        if ((!linkedList.isEmpty()) && !this.A09 && (r0 = (AnonymousClass6DG) linkedList.poll()) != null) {
            A0G(r0.A00, r0.A01, r0.A02, r0.A03, r0.A05, r0.A04);
        }
    }

    public final void A0G(C160427kz r13, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str;
        int hashCode = str.hashCode();
        this.A00 = hashCode;
        C26551Kp r2 = this.A04;
        r2.A08(Integer.valueOf(hashCode), "psl_network_start");
        r2.A04(this.A00, "psl_cache_hit", false);
        String str5 = str2;
        C160427kz r6 = r13;
        boolean z3 = z2;
        if (str2.length() > 0) {
            String str6 = str3;
            boolean z4 = z;
            if (this.A09) {
                this.A05.add(new AnonymousClass6DG(r6, str4, str5, str6, z4, z3));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("PSL_SIGNATURE", str6);
            linkedHashMap.put("EXTENSION_ID", str);
            linkedHashMap.put("IS_DRAFT", Boolean.valueOf(z4));
            A03(new C145246ta(r13, this, str, z3), str, str2, linkedHashMap);
            return;
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("Downloading PSL for flowId[");
        sb.append(str);
        sb.append("] skipped since the pslCdnUrl is empty");
        r2.A0B(i, "1", sb.toString());
        r2.A08(Integer.valueOf(this.A00), "psl_network_end");
        if (z2) {
            r2.A05(hashCode, 3);
        }
        if (r13 != null) {
            r13.BWm(1);
        }
    }

    public final boolean A0H(Map map, byte[] bArr, boolean z) {
        if (!z) {
            return false;
        }
        ((SharedPreferences) this.A07.A00.get()).edit().remove("extensions_asset_verification").apply();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (C20800yB.A01(C21000yV.A02, this.A08, 5764)) {
            AnonymousClass040 r4 = this.A09;
            FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1 flowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1 = new FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1(this, countDownLatch, (C023509x) null);
            AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, flowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1, r4);
        } else {
            C26561Kq r42 = this.A02;
            C117225lu r2 = new C117225lu(countDownLatch);
            if (!r42.A02.compareAndSet(false, true)) {
                r2.A00.countDown();
            }
            r42.A01.Boy(new C35721j9(r42, r2, 0));
        }
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        return A0I(map, bArr, false);
    }

    public final boolean A0I(Map map, byte[] bArr, boolean z) {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        String str2;
        Long l;
        String str3;
        Object obj4 = null;
        Map map2 = map;
        if (map != null) {
            obj = map2.get("PSL_SIGNATURE");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        if (map != null) {
            obj2 = map2.get("EXTENSION_ID");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && (str3 = (String) obj2) != null) {
            str4 = str3;
        }
        C26551Kp r6 = this.A04;
        Integer valueOf = Integer.valueOf(this.A00);
        boolean z2 = z;
        if (z) {
            r6.A08(valueOf, "psl_signature_verify_start");
        } else {
            r6.A08(valueOf, "psl_signature_verify_start_1");
        }
        if (C20800yB.A01(C21000yV.A02, this.A08, 3521)) {
            if (map != null) {
                obj3 = map2.get("IS_DRAFT");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof Boolean) {
                obj4 = obj3;
            }
            if (!AnonymousClass00C.A0J(obj4, true)) {
                byte[] bArr2 = bArr;
                if (bArr == null) {
                    r6.A0B(this.A00, "2", "Payload is null");
                    r6.A03(this.A00, "psl_signature_verify_result", "psl_signature_verify_failed");
                    r6.A08(Integer.valueOf(this.A00), "psl_signature_verify_end");
                    return false;
                }
                AnonymousClass6PF A002 = AnonymousClass6PF.A03.A00(((SharedPreferences) this.A07.A00.get()).getString("extensions_asset_verification", (String) null));
                if (A002 == null) {
                    return A0H(map2, bArr2, z2);
                }
                if (A00(A002.A02, str, str4, bArr2) || ((str2 = A002.A01) != null && (l = A002.A00) != null && l.longValue() > System.currentTimeMillis() && A00(str2, str, str4, bArr2))) {
                    r6.A03(this.A00, "psl_signature_verify_result", "psl_signature_verify_success");
                    r6.A08(Integer.valueOf(this.A00), "psl_signature_verify_end");
                    return true;
                }
                boolean A0H = A0H(map2, bArr2, z2);
                int i = this.A00;
                if (A0H) {
                    r6.A03(i, "psl_signature_verify_result", "psl_signature_verify_success");
                    r6.A08(Integer.valueOf(this.A00), "psl_signature_verify_end");
                } else {
                    r6.A0B(i, "2", "Signature Verification Failed");
                    r6.A03(this.A00, "psl_signature_verify_result", "psl_signature_verify_failed");
                }
                r6.A08(Integer.valueOf(this.A00), "psl_signature_verify_end");
                return A0H;
            }
        }
        r6.A03(this.A00, "psl_signature_verify_result", "psl_signature_verify_skipped");
        r6.A08(Integer.valueOf(this.A00), "psl_signature_verify_end");
        return true;
    }
}
