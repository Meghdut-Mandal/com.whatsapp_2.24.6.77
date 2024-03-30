package X;

import android.util.SparseArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1CJ  reason: invalid class name */
public class AnonymousClass1CJ {
    public AnonymousClass1CT A00;
    public final C20900yL A01;
    public final int A02;
    public final AnonymousClass1CC A03;
    public final long[] A04;
    public final int A05;
    public final RandomAccessFile A06;
    public final C19760wT A07;

    public boolean A07() {
        for (int i = 0; i < this.A02; i++) {
            if (i != this.A03.A01 && !A01(i).A05()) {
                return true;
            }
        }
        return false;
    }

    public SparseArray A00() {
        SparseArray sparseArray;
        StringBuilder sb;
        String str;
        if (!(this instanceof AnonymousClass1GS)) {
            sparseArray = new SparseArray();
            AnonymousClass1CC r3 = this.A03;
            int i = r3.A01;
            while (true) {
                i = (i + 1) % this.A02;
                if (i == r3.A01) {
                    break;
                }
                AnonymousClass1CT A012 = A01(i);
                if (!A012.A05()) {
                    ByteBuffer byteBuffer = A012.A04.A02;
                    sparseArray.put(i, Arrays.copyOf(byteBuffer.array(), byteBuffer.position()));
                }
            }
        } else {
            AnonymousClass1GS r5 = (AnonymousClass1GS) this;
            AnonymousClass1GT r6 = r5.A00;
            r6.A01 = new byte[10240];
            r6.A00 = 0;
            LinkedHashSet linkedHashSet = r6.A03;
            linkedHashSet.clear();
            HashMap hashMap = r6.A02;
            hashMap.clear();
            List list = r5.A01;
            list.clear();
            AnonymousClass1CC r7 = r5.A03;
            int i2 = r7.A01;
            while (true) {
                i2 = (i2 + 1) % r5.A02;
                if (i2 == r7.A01) {
                    break;
                }
                ByteBuffer A022 = r5.A01(i2).A04.A02();
                if (A022.limit() > 0) {
                    int limit = A022.limit();
                    int i3 = 8;
                    A022.position(8);
                    byte[] bArr = new byte[EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH];
                    String str2 = null;
                    boolean z = false;
                    int i4 = 0;
                    while (i3 < limit) {
                        try {
                            AnonymousClass1CX A032 = AnonymousClass1CW.A03(A022);
                            int i5 = A032.A01;
                            if (i5 == 0) {
                                if (A032.A00 == 6005) {
                                    str2 = (String) A032.A02;
                                    int position = A022.position() - i3;
                                    A022.position(i3);
                                    A022.get(bArr, 0, position);
                                    r6.A00(str2, bArr, position);
                                } else {
                                    int position2 = A022.position() - i3;
                                    A022.position(i3);
                                    A022.get(bArr, 0, position2);
                                    for (ByteArrayOutputStream write : hashMap.values()) {
                                        write.write(bArr, 0, position2);
                                    }
                                    if (position2 > 2048) {
                                        position2 = EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                                    }
                                    int i6 = r6.A00;
                                    if (position2 > 10240 - i6) {
                                        Log.e("privatestatsuploadqueue/writetoCommonAttrBuffer too many common attributes");
                                    } else {
                                        System.arraycopy(bArr, 0, r6.A01, i6, position2);
                                        r6.A00 += position2;
                                    }
                                }
                            } else if (i5 == 1) {
                                int position3 = A022.position();
                                if ((A022.get(i3) & 4) != 0) {
                                    int i7 = position3 - i3;
                                    A022.position(i3);
                                    A022.get(bArr, 0, i7);
                                    r6.A00(str2, bArr, i7);
                                    A022.position(position3);
                                    i3 = i4;
                                    z = false;
                                } else {
                                    z = true;
                                }
                                i4 = i3;
                            } else if (i5 == 2 && (A022.get(i3) & 4) != 0 && z) {
                                int position4 = A022.position();
                                int i8 = position4 - i4;
                                A022.position(i4);
                                if (i8 <= 2048) {
                                    A022.get(bArr, 0, i8);
                                    r6.A00(str2, bArr, i8);
                                } else {
                                    byte[] bArr2 = new byte[i8];
                                    A022.get(bArr2, 0, i8);
                                    r6.A00(str2, bArr2, i8);
                                }
                                A022.position(position4);
                                z = false;
                            }
                            i3 = A022.position();
                        } catch (AnonymousClass1CU e) {
                            th = e;
                            sb = new StringBuilder();
                            str = "privatestatseventbuffermanager/splitbuffer invalid buf content";
                            sb.append(str);
                            sb.append(th.toString());
                            Log.e(sb.toString());
                            list.add(Integer.valueOf(i2));
                        } catch (Throwable th) {
                            th = th;
                            sb = new StringBuilder();
                            str = "privateStatseventbuffermanager/splitbuffer unexpected errors ";
                            sb.append(str);
                            sb.append(th.toString());
                            Log.e(sb.toString());
                            list.add(Integer.valueOf(i2));
                        }
                    }
                    list.add(Integer.valueOf(i2));
                }
            }
            sparseArray = new SparseArray();
            Iterator it = linkedHashSet.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) hashMap.get(it.next());
                if (byteArrayOutputStream != null) {
                    sparseArray.put(i9, byteArrayOutputStream.toByteArray());
                }
                i9++;
            }
        }
        return sparseArray;
    }

    public AnonymousClass1CT A01(int i) {
        RandomAccessFile randomAccessFile = this.A06;
        AnonymousClass1CC r5 = this.A03;
        int i2 = this.A05;
        AnonymousClass1CT r3 = new AnonymousClass1CT(this.A07, r5, this.A01, randomAccessFile, i, i2);
        try {
            r3.A03();
            if (i == r5.A01) {
                this.A04[i] = (long) r3.A00();
                return r3;
            }
        } catch (AnonymousClass1CK e) {
            StringBuilder sb = new StringBuilder();
            sb.append("InMemorySingleEventBufferManager/readEventBufferFromDisk: error in reading event buffer");
            sb.append(e.toString());
            Log.e(sb.toString());
        }
        return r3;
    }

    public void A02() {
        AnonymousClass1CC r8 = this.A03;
        AnonymousClass1CD[] r0 = r8.A05;
        int i = r8.A01;
        AnonymousClass1CD r5 = r0[i];
        RandomAccessFile randomAccessFile = this.A06;
        int i2 = this.A05;
        AnonymousClass1CT r6 = new AnonymousClass1CT(this.A07, r8, this.A01, randomAccessFile, i, i2);
        this.A00 = r6;
        try {
            r6.A03();
            this.A04[r8.A01] = (long) this.A00.A00();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            long j = r5.A04;
            if (j > seconds) {
                StringBuilder sb = new StringBuilder();
                sb.append("InMemorySingleEventBufferManager/init event from file: current event buffer timestamp is ");
                sb.append(j - seconds);
                sb.append(" seconds in the future");
                Log.w(sb.toString());
                r5.A04 = seconds;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            AnonymousClass1CT r62 = this.A00;
            int i3 = r62.A02;
            int i4 = r62.A05.A01;
            if (i3 == i4) {
                objArr[0] = Integer.valueOf(r62.A01);
                objArr[1] = Integer.valueOf(r62.A00());
                if (i3 == i4) {
                    objArr[2] = Integer.valueOf(r62.A03.A00.size());
                    objArr[3] = Integer.valueOf(this.A00.A04.A02.position());
                    AnonymousClass1CT r2 = this.A00;
                    objArr[4] = Long.valueOf(r2.A05.A05[r2.A02].A04);
                    Log.i(String.format(locale, "InMemorySingleEventBufferManager/initfromfile: opened existing wam file: record_count = %d, event_count = %d, attribute_count = %d, size = %d, create_ts = %d", objArr));
                    return;
                }
                throw new UnsupportedOperationException("No attribute count available for rotated buffers");
            }
            throw new UnsupportedOperationException("No record count available for rotated buffers");
        } catch (AnonymousClass1CK e) {
            throw new AnonymousClass1CA(e.toString());
        }
    }

    public void A03() {
        RandomAccessFile randomAccessFile = this.A06;
        AnonymousClass1CC r2 = this.A03;
        int i = r2.A01;
        int i2 = this.A05;
        this.A00 = new AnonymousClass1CT(this.A07, r2, this.A01, randomAccessFile, i, i2);
    }

    public void A04() {
        long[] jArr = this.A04;
        AnonymousClass1CC r3 = this.A03;
        int i = r3.A01;
        jArr[i] = (long) this.A00.A00();
        int i2 = (i + 1) % this.A02;
        r3.A01 = i2;
        this.A00 = A01(i2);
    }

    public boolean A06() {
        return A01((this.A03.A01 + 1) % this.A02).A05();
    }

    public AnonymousClass1CJ(C19760wT r2, AnonymousClass1CC r3, C20900yL r4, RandomAccessFile randomAccessFile, int i, int i2) {
        this.A06 = randomAccessFile;
        this.A03 = r3;
        this.A02 = i;
        this.A05 = i2;
        this.A01 = r4;
        this.A04 = new long[i];
        this.A07 = r2;
    }

    public void A05(List list) {
        if (A07()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue != this.A03.A01) {
                    AnonymousClass1CT A012 = A01(intValue);
                    if (!A012.A05()) {
                        A012.A01();
                        this.A04[intValue] = 0;
                        try {
                            A012.A02();
                        } catch (IOException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("InMemorySingleEventBufferManager/dropSentData: error while event buffer flush");
                            sb.append(e.toString());
                            Log.e(sb.toString());
                        }
                    }
                }
            }
            return;
        }
        throw new Error("InMemorySingleEventBufferManager/dropSentData: Tried to drop empty buffer");
    }
}
