package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* renamed from: X.9j7  reason: invalid class name and case insensitive filesystem */
public class C201229j7 {
    public static final byte[] A08 = {87, 65, 77, 80, 83, 73, 68, 1};
    public int A00;
    public int A01;
    public C198919eP A02;
    public String A03 = "00000000-0000-0000-0000-000000000000";
    public ArrayList A04 = AnonymousClass001.A0I();
    public final int A05;
    public final C20900yL A06;
    public final RandomAccessFile A07;

    public boolean A01(byte[] bArr, int i) {
        int i2;
        ArrayList arrayList = this.A04;
        int i3 = this.A00;
        if (C165607th.A0U(arrayList, i3).A01 <= 8 && C165607th.A0U(arrayList, i3).A02) {
            Log.e("queuefile/writeBytes in privatestats see locked empty mini event buffer");
            i3 = this.A00;
            C165607th.A0U(arrayList, i3).A02 = false;
        }
        if (!C165607th.A0U(arrayList, i3).A02) {
            int length = bArr.length;
            if (length < i) {
                i = length;
            }
            C198919eP r2 = this.A02;
            if (i <= r2.A00 - r2.A02) {
                C165607th.A0U(arrayList, this.A00).A01 += r2.A00(bArr, i);
                A00(this);
                return true;
            } else if (C165607th.A0U(arrayList, i3).A00 < 65536) {
                try {
                    this.A07.setLength(65792);
                    C165607th.A0U(arrayList, this.A00).A00 = 65536;
                    C198919eP r1 = this.A02;
                    r1.A00 = 65536;
                    if (i <= 65536 - r1.A02) {
                        i2 = r1.A00(bArr, i);
                        C165607th.A0U(arrayList, this.A00).A01 += i2;
                    } else {
                        i2 = 0;
                    }
                    A00(this);
                    if (i2 > 0) {
                        return true;
                    }
                } catch (IOException e) {
                    C36321k7.A1W("queuefile/writeBytes failed to write ", AnonymousClass000.A0u(), e);
                }
            }
        }
        return false;
    }

    public static void A00(C201229j7 r4) {
        try {
            RandomAccessFile randomAccessFile = r4.A07;
            randomAccessFile.seek(54);
            randomAccessFile.writeByte(r4.A01);
            randomAccessFile.writeByte(r4.A00);
            for (int i = 0; i < r4.A01; i++) {
                ArrayList arrayList = r4.A04;
                randomAccessFile.writeInt(C165607th.A0U(arrayList, i).A01);
                randomAccessFile.writeInt(C165607th.A0U(arrayList, i).A00);
                randomAccessFile.writeBoolean(C165607th.A0U(arrayList, i).A02);
            }
        } catch (IOException e) {
            C36321k7.A1W("queuefile/flushMetaToFile failed to write ", AnonymousClass000.A0u(), e);
        }
    }

    public C201229j7(C20900yL r2, RandomAccessFile randomAccessFile, int i) {
        this.A05 = i;
        this.A07 = randomAccessFile;
        this.A06 = r2;
    }
}
