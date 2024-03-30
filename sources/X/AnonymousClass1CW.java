package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.1CW  reason: invalid class name */
public abstract class AnonymousClass1CW {
    public int A00 = -1;
    public int A01;
    public final AnonymousClass1E7 A02 = new AnonymousClass1E7();

    public static int A00(AnonymousClass1E7 r4, long j) {
        if (j == 0) {
            return 1;
        }
        if (j == 1) {
            return 2;
        }
        r4.write((byte) ((int) j));
        if (-128 <= j && j <= 127) {
            return 3;
        }
        r4.write((byte) ((int) (j >> 8)));
        if (-32768 <= j && j <= 32767) {
            return 4;
        }
        r4.write((byte) ((int) (j >> 16)));
        r4.write((byte) ((int) (j >> 24)));
        if (-2147483648L <= j && j <= 2147483647L) {
            return 5;
        }
        r4.write((byte) ((int) (j >> 32)));
        r4.write((byte) ((int) (j >> 40)));
        r4.write((byte) ((int) (j >> 48)));
        r4.write((byte) ((int) (j >> 56)));
        return 6;
    }

    public static int A01(AnonymousClass1E7 r3, long j) {
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException("Value is not an unsigned integer");
        }
        r3.write((byte) ((int) j));
        if (j <= 255) {
            return 1;
        }
        r3.write((byte) ((int) (j >> 8)));
        if (j <= 65535) {
            return 2;
        }
        r3.write((byte) ((int) (j >> 16)));
        r3.write((byte) ((int) (j >> 24)));
        return 4;
    }

    public static long A02(ByteBuffer byteBuffer, int i) {
        long j = 0;
        int i2 = 0;
        do {
            j |= (((long) byteBuffer.get()) & 255) << (i2 * 8);
            i2++;
        } while (i2 < i);
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        return new X.AnonymousClass1CX(r1, r9, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1CX A03(java.nio.ByteBuffer r12) {
        /*
            java.lang.String r6 = ", tag: "
            java.lang.String r5 = " at "
            java.lang.String r7 = "%02X "
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ BufferUnderflowException -> 0x011a }
            r12.order(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            int r4 = r12.position()     // Catch:{ BufferUnderflowException -> 0x011a }
            byte r11 = r12.get()     // Catch:{ BufferUnderflowException -> 0x011a }
            r10 = 0
            r8 = 1
            r0 = 3
            r9 = r11 & 3
            if (r9 > r0) goto L_0x00dd
            r0 = r11 & 8
            if (r0 != 0) goto L_0x0023
            long r0 = A02(r12, r8)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0028
        L_0x0023:
            r0 = 2
            long r0 = A02(r12, r0)     // Catch:{ BufferUnderflowException -> 0x011a }
        L_0x0028:
            int r3 = (int) r0     // Catch:{ BufferUnderflowException -> 0x011a }
            int r0 = r11 >> 4
            r2 = r0 & 15
            r0 = 10
            if (r2 > r0) goto L_0x0099
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ BufferUnderflowException -> 0x011a }
            r12.order(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            switch(r2) {
                case 0: goto L_0x0040;
                case 1: goto L_0x003b;
                case 2: goto L_0x0042;
                case 3: goto L_0x0047;
                case 4: goto L_0x0050;
                case 5: goto L_0x0059;
                case 6: goto L_0x0062;
                case 7: goto L_0x006b;
                case 8: goto L_0x0074;
                case 9: goto L_0x007e;
                case 10: goto L_0x0089;
                default: goto L_0x0039;
            }     // Catch:{ BufferUnderflowException -> 0x011a }
        L_0x0039:
            goto L_0x0112
        L_0x003b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0093
        L_0x0040:
            r1 = 0
            goto L_0x0093
        L_0x0042:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0093
        L_0x0047:
            byte r0 = r12.get()     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0093
        L_0x0050:
            short r0 = r12.getShort()     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.Short r1 = java.lang.Short.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0093
        L_0x0059:
            int r0 = r12.getInt()     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0093
        L_0x0062:
            long r0 = r12.getLong()     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0093
        L_0x006b:
            double r0 = r12.getDouble()     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0093
        L_0x0074:
            long r1 = A02(r12, r8)     // Catch:{ BufferUnderflowException -> 0x011a }
            int r0 = (int) r1     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.String r1 = A04(r12, r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0093
        L_0x007e:
            r0 = 2
            long r1 = A02(r12, r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            int r0 = (int) r1     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.String r1 = A04(r12, r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0093
        L_0x0089:
            r0 = 4
            long r1 = A02(r12, r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            int r0 = (int) r1     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.String r1 = A04(r12, r0)     // Catch:{ BufferUnderflowException -> 0x011a }
        L_0x0093:
            X.1CX r0 = new X.1CX     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.<init>(r1, r9, r3)     // Catch:{ BufferUnderflowException -> 0x011a }
            return r0
        L_0x0099:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00b0 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x00b0 }
            java.lang.String r0 = "Invalid value type "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x00b0 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00b0 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00b0 }
        L_0x00b0:
            r3 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r11)     // Catch:{ BufferUnderflowException -> 0x011a }
            r1[r10] = r0     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.String r1 = java.lang.String.format(r2, r7, r1)     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.<init>()     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r3)     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r5)     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r4)     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r6)     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r1)     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.String r0 = r0.toString()     // Catch:{ BufferUnderflowException -> 0x011a }
            X.1CU r1 = new X.1CU     // Catch:{ BufferUnderflowException -> 0x011a }
            r1.<init>(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0119
        L_0x00dd:
            java.lang.String r1 = "Invalid record type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00e5 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00e5 }
        L_0x00e5:
            r3 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r11)     // Catch:{ BufferUnderflowException -> 0x011a }
            r1[r10] = r0     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.String r1 = java.lang.String.format(r2, r7, r1)     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.<init>()     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r3)     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r5)     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r4)     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r6)     // Catch:{ BufferUnderflowException -> 0x011a }
            r0.append(r1)     // Catch:{ BufferUnderflowException -> 0x011a }
            java.lang.String r0 = r0.toString()     // Catch:{ BufferUnderflowException -> 0x011a }
            X.1CU r1 = new X.1CU     // Catch:{ BufferUnderflowException -> 0x011a }
            r1.<init>(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
            goto L_0x0119
        L_0x0112:
            java.lang.String r0 = "Invalid value type"
            java.lang.Error r1 = new java.lang.Error     // Catch:{ BufferUnderflowException -> 0x011a }
            r1.<init>(r0)     // Catch:{ BufferUnderflowException -> 0x011a }
        L_0x0119:
            throw r1     // Catch:{ BufferUnderflowException -> 0x011a }
        L_0x011a:
            java.lang.String r1 = "Incomplete buffer"
            X.1CU r0 = new X.1CU
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CW.A03(java.nio.ByteBuffer):X.1CX");
    }

    public static String A04(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, C19430v1.A0B);
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("UnsupportedEncoding: ");
            sb.append(e);
            throw new AnonymousClass1CU(sb.toString());
        }
    }

    public void A05() {
        this.A02.reset();
        this.A00 = -1;
        this.A01 = 0;
    }

    public final void A06(Object obj, int i, int i2) {
        int i3;
        int i4;
        long longValue;
        AnonymousClass1E7 r3 = this.A02;
        this.A00 = r3.size();
        r3.write(0);
        int A012 = A01(r3, (long) i2);
        if (A012 == 1) {
            i3 = 0;
        } else if (A012 == 2) {
            i3 = 1;
        } else {
            throw new Error("Id too big to fit in 2 bytes");
        }
        if (obj == null) {
            i4 = 0;
        } else {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    longValue = 1;
                } else {
                    longValue = 0;
                }
            } else if (obj instanceof Long) {
                longValue = ((Number) obj).longValue();
            } else if (obj instanceof Number) {
                double doubleValue = ((Number) obj).doubleValue();
                long j = (long) doubleValue;
                if (((double) j) == doubleValue) {
                    i4 = A00(r3, j);
                } else {
                    long doubleToRawLongBits = Double.doubleToRawLongBits(doubleValue);
                    r3.write((byte) ((int) doubleToRawLongBits));
                    r3.write((byte) ((int) (doubleToRawLongBits >> 8)));
                    r3.write((byte) ((int) (doubleToRawLongBits >> 16)));
                    r3.write((byte) ((int) (doubleToRawLongBits >> 24)));
                    r3.write((byte) ((int) (doubleToRawLongBits >> 32)));
                    r3.write((byte) ((int) (doubleToRawLongBits >> 40)));
                    r3.write((byte) ((int) (doubleToRawLongBits >> 48)));
                    r3.write((byte) ((int) (doubleToRawLongBits >> 56)));
                    i4 = 7;
                }
            } else if (obj instanceof String) {
                try {
                    byte[] bytes = ((String) obj).getBytes(C19430v1.A0B);
                    int length = bytes.length;
                    if (length > 1024) {
                        Log.w(String.format(Locale.US, "wam/serialize: string length is limited to %d UTF-8 bytes", new Object[]{Integer.valueOf(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)}));
                    }
                    int min = Math.min(length, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                    int A013 = A01(r3, (long) min);
                    r3.write(bytes, 0, min);
                    i4 = 8;
                    if (A013 != 1) {
                        i4 = 9;
                        if (A013 != 2) {
                            if (A013 == 4) {
                                i4 = 10;
                            } else {
                                throw new Error("Impossible");
                            }
                        }
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new Error(e);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected class Boolean, Number, or String, got ");
                sb.append(obj.getClass().getName());
                throw new IllegalArgumentException(sb.toString());
            }
            i4 = A00(r3, longValue);
        }
        r3.A01()[this.A00] = (byte) (i | (i3 << 3) | (i4 << 4));
        this.A01++;
    }
}
