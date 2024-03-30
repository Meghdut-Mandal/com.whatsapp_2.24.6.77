package X;

import android.util.SparseIntArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.9Np  reason: invalid class name and case insensitive filesystem */
public class C193969Np {
    public final C22781Avs A00;
    public final C197879cW A01;
    public final C197879cW A02;
    public final B41 A03;
    public final C197879cW A04;
    public final C197879cW A05;
    public final B41 A06;
    public final B41 A07;

    public C193969Np() {
        int i;
        C20964A0x a0x;
        int i2;
        int i3;
        C196489Zw.A00();
        SparseIntArray sparseIntArray = C1904498l.A00;
        int A0A = (int) C165597tg.A0A();
        if (A0A > 16777216) {
            i = (A0A / 4) * 3;
        } else {
            i = A0A / 2;
        }
        this.A01 = new C197879cW(C1904498l.A00, 0, i, -1);
        this.A03 = C20968A1b.A00();
        int i4 = C1904598m.A00;
        int i5 = i4 * 4194304;
        int i6 = C132986Wc.A0F;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        do {
            sparseIntArray2.put(i6, i4);
            i6 *= 2;
        } while (i6 <= 4194304);
        this.A02 = new C197879cW(sparseIntArray2, 4194304, i5, i4);
        synchronized (C20964A0x.class) {
            a0x = C20964A0x.A00;
            if (a0x == null) {
                a0x = new C20964A0x();
                C20964A0x.A00 = a0x;
            }
        }
        this.A00 = a0x;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 5);
        sparseIntArray3.put(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, 5);
        sparseIntArray3.put(ZipDecompressor.UNZIP_BUFFER_SIZE, 5);
        sparseIntArray3.put(DefaultCrypto.BUFFER_SIZE, 5);
        sparseIntArray3.put(16384, 5);
        sparseIntArray3.put(32768, 5);
        sparseIntArray3.put(65536, 5);
        sparseIntArray3.put(C132986Wc.A0F, 5);
        sparseIntArray3.put(262144, 2);
        sparseIntArray3.put(524288, 2);
        sparseIntArray3.put(1048576, 2);
        int A0A2 = (int) C165597tg.A0A();
        if (A0A2 < 16777216) {
            i2 = 3145728;
        } else {
            i2 = 12582912;
            if (A0A2 < 33554432) {
                i2 = 6291456;
            }
        }
        int A0A3 = (int) C165597tg.A0A();
        if (A0A3 < 16777216) {
            i3 = A0A3 / 2;
        } else {
            i3 = (A0A3 / 4) * 3;
        }
        this.A04 = new C197879cW(sparseIntArray3, i2, i3, -1);
        this.A06 = C20968A1b.A00();
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        sparseIntArray4.put(16384, 5);
        this.A05 = new C197879cW(sparseIntArray4, 81920, 1048576, -1);
        this.A07 = C20968A1b.A00();
        C196489Zw.A00();
    }
}
