package X;

import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.1MC  reason: invalid class name */
public class AnonymousClass1MC {
    public final int A00;
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final MappedByteBuffer A03;
    public final Charset A04;

    public synchronized String A02(int i) {
        String str;
        int i2 = this.A02.get(i);
        if (i2 == 0) {
            str = null;
        } else {
            MappedByteBuffer mappedByteBuffer = this.A03;
            mappedByteBuffer.position(i2);
            int position = mappedByteBuffer.position();
            int A012 = A01(this, position);
            int A002 = A00(this, position + 4);
            byte[] bArr = new byte[A002];
            mappedByteBuffer.position(this.A00 + A012);
            mappedByteBuffer.get(bArr, 0, A002);
            str = new String(bArr, this.A04);
        }
        return str;
    }

    public static int A00(AnonymousClass1MC r2, int i) {
        MappedByteBuffer mappedByteBuffer = r2.A03;
        return ((mappedByteBuffer.get(i + 1) & 255) << 8) | (mappedByteBuffer.get(i) & 255);
    }

    public static int A01(AnonymousClass1MC r2, int i) {
        MappedByteBuffer mappedByteBuffer = r2.A03;
        return ((mappedByteBuffer.get(i + 3) & 255) << 24) | (mappedByteBuffer.get(i) & 255) | ((mappedByteBuffer.get(i + 1) & 255) << 8) | ((mappedByteBuffer.get(i + 2) & 255) << 16);
    }

    public AnonymousClass1MC(MappedByteBuffer mappedByteBuffer, List list) {
        int i;
        this.A03 = mappedByteBuffer;
        int A002 = A00(this, 0);
        int A012 = A01(this, 2);
        byte b = mappedByteBuffer.get(6);
        Charset[] charsetArr = AnonymousClass1MD.A00;
        if (b >= 2 && AnonymousClass13Z.A00.get() != null) {
            Log.e("MMappedStringPack: unrecognized encoding");
        }
        this.A04 = charsetArr[b];
        this.A00 = A01(this, 7);
        if (!list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            int i2 = 11;
            int i3 = 0;
            for (int i4 = 0; i4 < A002; i4++) {
                MappedByteBuffer mappedByteBuffer2 = this.A03;
                mappedByteBuffer2.position(i2);
                int position = mappedByteBuffer2.position();
                int i5 = 5;
                if (mappedByteBuffer2.get(position + 2) == 0) {
                    i5 = 2;
                } else if (mappedByteBuffer2.get(position + 5) != 0) {
                    i5 = 7;
                }
                byte[] bArr = new byte[i5];
                mappedByteBuffer2.get(bArr, 0, i5);
                int indexOf = list.indexOf(new String(bArr, 0, i5, AnonymousClass1MD.A02));
                if (indexOf != -1) {
                    i3++;
                    iArr[indexOf] = i2;
                    if (i3 >= list.size()) {
                        break;
                    }
                }
                i2 += 11;
            }
            for (int i6 = 0; i6 < size; i6++) {
                int i7 = iArr[i6];
                if (i7 != 0) {
                    this.A03.position(i7 + 7);
                    int A013 = A01(this, this.A03.position()) + A012;
                    int A003 = A00(this, A013);
                    int i8 = A013 + 2;
                    int A004 = A00(this, i8);
                    int i9 = i8 + 2;
                    for (int i10 = 0; i10 < A003; i10++) {
                        int i11 = i + 2;
                        this.A02.append(A00(this, i), i11);
                        i9 = i11 + 6;
                    }
                    for (int i12 = 0; i12 < A004; i12++) {
                        int i13 = i + 2;
                        this.A01.append(A00(this, i), i13);
                        i = i13 + 1;
                        for (int i14 = 0; i14 < this.A03.get(i13); i14++) {
                            i += 7;
                        }
                    }
                }
            }
        } else if (AnonymousClass13Z.A00.get() != null) {
            Log.e("MMappedStringPack: parentLocales is empty");
        }
    }
}
