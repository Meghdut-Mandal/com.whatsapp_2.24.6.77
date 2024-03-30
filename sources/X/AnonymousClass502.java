package X;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: X.502  reason: invalid class name */
public class AnonymousClass502 extends C142266ob {
    public final C111505cO A00;

    public AnonymousClass502(C111505cO r2) {
        super("bk.action.apt.PleEncrypt");
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r15, C115215iW r16, C124125xd r17) {
        Throwable th;
        if (r16.A00.equals("bk.action.apt.PleEncrypt")) {
            HashMap A0J = AnonymousClass001.A0J();
            List list = r15.A00;
            C140456lc A0K = C90504aG.A0K(list, 0);
            String A0N = C140456lc.A0N(A0K);
            String A0J2 = C140456lc.A0J(A0K);
            Long valueOf = Long.valueOf(A0K.A0U(36, -1));
            Long valueOf2 = Long.valueOf(A0K.A0U(38, -1));
            A0J.put("purpose", A0N);
            A0J.put("publicKey", A0J2);
            A0J.put("serverTimestamp", valueOf);
            A0J.put("validTilTimestamp", valueOf2);
            String A0i = C90474aD.A0i(list);
            C160377ku A01 = AnonymousClass6JJ.A01(list, 2);
            C160377ku A012 = AnonymousClass6JJ.A01(list, 3);
            C164197rQ A002 = C164197rQ.A00(A01, 36);
            try {
                String A0l = C90504aG.A0l("purpose", A0J);
                Objects.requireNonNull(A0l, "purpose must not be null");
                byte[] decode = Base64.decode(C90504aG.A0l("publicKey", A0J), 8);
                Long l = (Long) A0J.get("serverTimestamp");
                Objects.requireNonNull(l, "serverTimestamp must not be null");
                Long l2 = (Long) A0J.get("validTilTimestamp");
                Objects.requireNonNull(l2, "validTilTimestamp must not be null");
                int length = decode.length;
                if (length == 32) {
                    byte[] copyOf = Arrays.copyOf(decode, length);
                    long longValue = l.longValue();
                    if (longValue <= 0) {
                        th = C90464aC.A0P(l, "Invalid value for serverTimestamp: ", AnonymousClass000.A0u());
                    } else if (l2.longValue() > 0) {
                        SecureRandom secureRandom = C113365fQ.A00;
                        byte[] bArr = new byte[24];
                        C113365fQ.A00.nextBytes(bArr);
                        C119545pz A003 = C133256Xm.A00();
                        byte[] A03 = C200419hN.A03(C201929kj.A00(Arrays.copyOf(copyOf, copyOf.length), A003.A00.A01), bArr, A0i.getBytes());
                        byte[] bArr2 = A003.A01.A01;
                        int length2 = bArr2.length + 24 + A03.length;
                        ByteBuffer allocate = ByteBuffer.allocate(A0l.getBytes().length + 5 + 8 + length2 + 16);
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        allocate.put((byte) 4);
                        allocate.putInt(4);
                        allocate.putInt(0);
                        allocate.putInt(A0l.length());
                        allocate.put(A0l.getBytes());
                        allocate.putInt(8);
                        allocate.putLong(longValue);
                        allocate.putInt(length2);
                        allocate.put(bArr2);
                        allocate.put(bArr);
                        allocate.put(A03);
                        if (!allocate.hasRemaining()) {
                            String encodeToString = Base64.encodeToString(allocate.array(), 8);
                            C1273868b.A07(C142326oh.A03(r17), C1273868b.A01(encodeToString), (C160377ku) A002.A00);
                            return null;
                        }
                        th = AnonymousClass001.A09("Ciphertext array not fully written");
                    } else {
                        th = C90464aC.A0P(l2, "Invalid value for validTilTime: ", AnonymousClass000.A0u());
                    }
                } else {
                    th = AnonymousClass000.A0d("Invalid length for serverPublicKey: ", AnonymousClass000.A0u(), length);
                }
                throw th;
            } catch (RuntimeException unused) {
                C100674vP A032 = C142326oh.A03(r17);
                C1273868b A004 = C1273868b.A00();
                A004.A09(0, 0);
                C1273868b.A07(A032, A004, (C160377ku) C164197rQ.A00(A012, 37).A00);
            }
        }
        return null;
    }
}
