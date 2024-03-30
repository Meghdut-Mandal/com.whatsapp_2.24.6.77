package X;

import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1E5  reason: invalid class name */
public class AnonymousClass1E5 {
    public final C19760wT A00;
    public final AnonymousClass1E8 A01;
    public final AnonymousClass1E6 A02;
    public final C20870yI A03;
    public final C20930yO A04;
    public final AnonymousClass1C9 A05;

    public AnonymousClass1E5(C19760wT r3, C20870yI r4, C20930yO r5, AnonymousClass1C9 r6) {
        AnonymousClass1E6 r1 = new AnonymousClass1E6();
        AnonymousClass1E8 r0 = new AnonymousClass1E8();
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r3;
        this.A02 = r1;
        this.A01 = r0;
    }

    private void A00(int i) {
        C20940yP r0;
        C20950yQ r02;
        Object obj;
        C20930yO r3 = this.A04;
        AnonymousClass1C9 r2 = this.A05;
        int i2 = r2.A03;
        if (i2 == 1 || i2 == 0) {
            r0 = r3.A00;
        } else {
            r0 = r3.A01;
        }
        Map map = r0.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            r02 = C20940yP.A01;
        } else {
            r02 = (C20950yQ) map.get(valueOf);
        }
        AnonymousClass1CT r32 = r2.A04.A00;
        if (r32.A02 == r32.A05.A01) {
            Map map2 = r32.A03.A00;
            if (!map2.containsKey(valueOf)) {
                obj = C20940yP.A01;
            } else {
                obj = map2.get(valueOf);
            }
            AnonymousClass1E8 r4 = this.A01;
            Map map3 = r4.A00;
            if (!map3.containsKey(valueOf) && !r02.equals(obj)) {
                r4.A06(r02.A00, 0, i);
                map3.put(valueOf, r02);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("No attribute value available for rotated buffers");
    }

    public int A01() {
        return this.A02.A02.size() + this.A01.A02.size();
    }

    public void A02(C20890yK r5, int i) {
        AnonymousClass1E6 r3 = this.A02;
        r3.A05();
        r3.A06(Integer.valueOf(i), 1, r5.code);
        r5.serialize(new C29001Uy(this));
        byte[] A012 = r3.A02.A01();
        int i2 = r3.A00;
        A012[i2] = (byte) (A012[i2] | 4);
    }

    public void A03(Integer num) {
        long j;
        Integer num2;
        C20940yP r0;
        this.A01.A05();
        AnonymousClass1C9 r3 = this.A05;
        int i = r3.A03;
        if (i == 2 || i == 3) {
            j = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis()) * 3600;
            if (r3.A06()) {
                C20870yI r7 = this.A03;
                synchronized (r7) {
                    num2 = null;
                    if (num != null) {
                        if (num.intValue() != 0) {
                            HashMap hashMap = r7.A01;
                            if (hashMap == null) {
                                hashMap = r7.A04();
                                r7.A01 = hashMap;
                            }
                            AnonymousClass9MX r8 = (AnonymousClass9MX) hashMap.get(num);
                            if (r8 != null) {
                                long currentTimeMillis = System.currentTimeMillis() / 86400000;
                                if (currentTimeMillis > r8.A01) {
                                    r8.A00 = 0;
                                    r8.A01 = currentTimeMillis;
                                }
                                r8.A00++;
                                r7.A05(r8, num);
                                num2 = Integer.valueOf(r8.A00);
                            }
                        }
                    }
                }
            }
            num2 = null;
        } else {
            j = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            if (r3.A06()) {
                AnonymousClass1CC r2 = r3.A06;
                int i2 = r2.A02 + 1;
                if (i2 <= 0) {
                    r2.A02 = 0;
                    r2.A04 = false;
                }
                if (r2.A04) {
                    r2.A02 = i2;
                    num2 = Integer.valueOf(i2);
                }
            }
            num2 = null;
        }
        C20930yO r22 = this.A04;
        r22.A01(Long.valueOf(j), 47, i);
        r22.A01(num2, 3433, i);
        if (i == 1 || i == 0) {
            r0 = r22.A00;
        } else {
            r0 = r22.A01;
        }
        for (Number intValue : Collections.unmodifiableCollection(r0.A00.keySet())) {
            A00(intValue.intValue());
        }
        AnonymousClass1CT r23 = r3.A04.A00;
        if (r23.A02 == r23.A05.A01) {
            for (Number intValue2 : Collections.unmodifiableCollection(r23.A03.A00.keySet())) {
                A00(intValue2.intValue());
            }
            return;
        }
        throw new UnsupportedOperationException("No attribute codes available for rotated buffers");
    }

    public void A04(byte[] bArr, int i, int i2) {
        AnonymousClass1E6 r4 = this.A02;
        r4.A05();
        r4.A06(Integer.valueOf(i2), 1, i);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (wrap.position() < wrap.limit()) {
            try {
                AnonymousClass1CX A032 = AnonymousClass1CW.A03(wrap);
                r4.A06(A032.A02, 2, A032.A00);
            } catch (AnonymousClass1CU e) {
                Log.e("EventSerialBuffer/putSerializedEvent Error adding serialized event to buffer", e);
            }
        }
        byte[] A012 = r4.A02.A01();
        int i3 = r4.A00;
        A012[i3] = (byte) (A012[i3] | 4);
    }
}
