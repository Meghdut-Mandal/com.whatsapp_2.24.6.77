package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8cV  reason: invalid class name and case insensitive filesystem */
public class C176678cV extends AnonymousClass1CJ {
    public boolean A00 = false;
    public final AnonymousClass9XJ A01;
    public final String A02;

    public C176678cV(C19760wT r9, C19420v0 r10, C20870yI r11, AnonymousClass1CC r12, C20900yL r13, RandomAccessFile randomAccessFile, String str, int i, int i2) {
        super(r9, r12, r13, randomAccessFile, i, i2);
        this.A01 = new AnonymousClass9XJ(r10, r11, r13);
        this.A02 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.SparseArray A00() {
        /*
            r14 = this;
            X.9XJ r0 = r14.A01
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.HashMap r0 = r0.A02
            java.util.Iterator r7 = X.C36371kC.A10(r0)
        L_0x000d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r3 = X.C36351kA.A0u(r7)
            X.9j7 r3 = (X.C201229j7) r3
            r5 = 0
            r2 = 0
        L_0x001b:
            int r0 = r3.A01
            if (r2 >= r0) goto L_0x002c
            java.util.ArrayList r0 = r3.A04
            X.9KA r0 = X.C165607th.A0U(r0, r2)
            int r1 = r0.A01
            r0 = 8
            if (r1 <= r0) goto L_0x00c2
            r5 = 1
        L_0x002c:
            if (r5 == 0) goto L_0x000d
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r11 = 0
        L_0x0034:
            int r0 = r3.A01
            if (r11 >= r0) goto L_0x00a8
            int r0 = r3.A00
            if (r11 != r0) goto L_0x0090
            X.9eP r8 = r3.A02
        L_0x003e:
            int r5 = r8.A02
            r1 = 8
            boolean r0 = X.C90504aG.A1U(r5, r1)
            if (r0 != 0) goto L_0x008d
            if (r5 <= r1) goto L_0x007e
            byte[] r6 = new byte[r5]
            java.io.RandomAccessFile r5 = r8.A05     // Catch:{ EOFException -> 0x006a, IOException -> 0x0073 }
            long r0 = r8.A03     // Catch:{ EOFException -> 0x006a, IOException -> 0x0073 }
            r5.seek(r0)     // Catch:{ EOFException -> 0x006a, IOException -> 0x0073 }
            r1 = 0
            int r0 = r8.A02     // Catch:{ EOFException -> 0x006a, IOException -> 0x0073 }
            r5.readFully(r6, r1, r0)     // Catch:{ EOFException -> 0x006a, IOException -> 0x0073 }
            int r0 = r8.A01     // Catch:{ EOFException -> 0x006a, IOException -> 0x0073 }
            int r0 = r0 * 9
            int r0 = r0 + 56
            int r0 = r0 + 8
            long r0 = (long) r0     // Catch:{ EOFException -> 0x006a, IOException -> 0x0073 }
            r5.seek(r0)     // Catch:{ EOFException -> 0x006a, IOException -> 0x0073 }
            r0 = 1
            r5.writeBoolean(r0)     // Catch:{ EOFException -> 0x006a, IOException -> 0x0073 }
            goto L_0x007f
        L_0x006a:
            X.0yL r1 = r8.A04
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A07 = r0
            goto L_0x007b
        L_0x0073:
            X.0yL r1 = r8.A04
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A0D = r0
        L_0x007b:
            r1.A05()
        L_0x007e:
            r6 = 0
        L_0x007f:
            if (r6 == 0) goto L_0x008d
            r2.put(r11, r6)
            java.util.ArrayList r0 = r3.A04
            X.9KA r1 = X.C165607th.A0U(r0, r11)
            r0 = 1
            r1.A02 = r0
        L_0x008d:
            int r11 = r11 + 1
            goto L_0x0034
        L_0x0090:
            java.io.RandomAccessFile r10 = r3.A07
            java.util.ArrayList r1 = r3.A04
            X.9KA r0 = X.C165607th.A0U(r1, r11)
            int r12 = r0.A01
            X.9KA r0 = X.C165607th.A0U(r1, r11)
            int r13 = r0.A00
            X.0yL r9 = r3.A06
            X.9eP r8 = new X.9eP
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x003e
        L_0x00a8:
            r6 = 0
        L_0x00a9:
            int r0 = r2.size()
            if (r6 >= r0) goto L_0x000d
            int r5 = r2.keyAt(r6)
            java.lang.Object r1 = r2.get(r5)
            int r0 = r3.A05
            int r0 = r0 * 8
            int r0 = r0 + r5
            r4.put(r0, r1)
            int r6 = r6 + 1
            goto L_0x00a9
        L_0x00c2:
            int r2 = r2 + 1
            goto L_0x001b
        L_0x00c6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176678cV.A00():android.util.SparseArray");
    }

    public void A04() {
        AnonymousClass1CT r2 = this.A00;
        ByteBuffer A022 = r2.A04.A02();
        if (A022.limit() != 0) {
            A08(A022, true);
            try {
                r2.A01();
                r2.A02();
            } catch (IOException e) {
                e.toString();
            }
        }
    }

    public void A05(List list) {
        int i;
        AnonymousClass9XJ r7 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int A0A = C36341k9.A0A(it);
            if (A0A < 1000) {
                int i2 = A0A / 8;
                int i3 = A0A % 8;
                Iterator A10 = C36371kC.A10(r7.A02);
                while (true) {
                    if (!A10.hasNext()) {
                        break;
                    }
                    C201229j7 r2 = (C201229j7) C36351kA.A0u(A10);
                    if (i2 == r2.A05) {
                        ArrayList arrayList = r2.A04;
                        C165607th.A0U(arrayList, i3).A01 = 8;
                        C165607th.A0U(arrayList, i3).A02 = false;
                        try {
                            RandomAccessFile randomAccessFile = r2.A07;
                            randomAccessFile.seek((long) ((i3 * 9) + 56));
                            randomAccessFile.writeInt(8);
                            randomAccessFile.skipBytes(4);
                            randomAccessFile.writeBoolean(false);
                            break;
                        } catch (IOException e) {
                            C36321k7.A1W("queuefile/dropsentdata ", AnonymousClass000.A0u(), e);
                        }
                    }
                }
            }
        }
        int i4 = 0;
        do {
            boolean[] zArr = r7.A04;
            if (zArr[i4]) {
                HashMap hashMap = r7.A02;
                Iterator A102 = C36371kC.A10(hashMap);
                while (true) {
                    if (!A102.hasNext()) {
                        break;
                    }
                    Map.Entry A11 = AnonymousClass000.A11(A102);
                    C201229j7 r10 = (C201229j7) A11.getValue();
                    Object key = A11.getKey();
                    if (r10.A05 == i4) {
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i = r10.A01;
                            if (i5 >= i) {
                                break;
                            }
                            if (C165607th.A0U(r10.A04, i5).A01 <= 8) {
                                i6++;
                            }
                            i5++;
                        }
                        if (i6 == i) {
                            try {
                                r10.A07.close();
                            } catch (IOException e2) {
                                C36321k7.A1W("queuefile/flush failed to close file ", AnonymousClass000.A0u(), e2);
                            }
                            zArr[i4] = false;
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append(r7.A01);
                            try {
                                C90524aI.A0S(AnonymousClass000.A0r("wampsid", A0u, i4)).delete();
                            } catch (Exception e3) {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                C36321k7.A1Z(A0u2, C90494aF.A0c(e3, "psuploadqueue/dropSentData failed to delete closed queue file ", A0u2));
                            }
                            hashMap.remove(key);
                        }
                    }
                }
            }
            i4++;
        } while (i4 < 8);
        C36331k8.A0w(C19420v0.A00(r7.A05), "events_ps_phase3_migration_done", true);
        AnonymousClass1CT A012 = A01(1);
        if (this.A00) {
            ByteBuffer A022 = A012.A04.A02();
            if (A022.limit() > 0) {
                A08(A022, false);
            }
            this.A00 = false;
        }
        try {
            A012.A01();
            A012.A02();
        } catch (IOException e4) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            C36321k7.A1Z(A0u3, C90494aF.A0c(e4, "privatestatseventbuffermanager/dropsentdata: ioexception while flushing back buffer", A0u3));
        }
    }

    public boolean A06() {
        if (this.A01.A01()) {
            return A01(1).A05();
        }
        return true;
    }

    public boolean A07() {
        return this.A01.A01();
    }

    public void A02() {
        super.A02();
        this.A01.A00(this.A02);
    }

    public void A03() {
        super.A03();
        this.A01.A00(this.A02);
    }

    public void A08(ByteBuffer byteBuffer, boolean z) {
        StringBuilder sb;
        String str;
        int i;
        boolean A022;
        int limit = byteBuffer.limit();
        AnonymousClass9XJ r6 = this.A01;
        r6.A03 = new byte[10240];
        r6.A00 = 0;
        byteBuffer.position(0);
        byteBuffer.position(8);
        byte[] bArr = new byte[EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH];
        try {
            int position = byteBuffer.position();
            String str2 = null;
            boolean z2 = false;
            int i2 = 0;
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                if (position < limit) {
                    AnonymousClass1CX A03 = AnonymousClass1CW.A03(byteBuffer);
                    int i4 = A03.A01;
                    if (i4 == 0) {
                        if (A03.A00 == 6005) {
                            str2 = (String) A03.A02;
                            int position2 = byteBuffer.position() - position;
                            byteBuffer.position(position);
                            byteBuffer.get(bArr, 0, position2);
                            z2 = r6.A02(str2, bArr, position2);
                        } else {
                            int position3 = byteBuffer.position() - position;
                            byteBuffer.position(position);
                            byteBuffer.get(bArr, 0, position3);
                            Iterator A10 = C36371kC.A10(r6.A02);
                            while (A10.hasNext()) {
                                ((C201229j7) C36351kA.A0u(A10)).A01(bArr, position3);
                            }
                            if (position3 > 2048) {
                                position3 = EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                            }
                            int i5 = r6.A00;
                            if (position3 > 10240 - i5) {
                                Log.e("privatestatsuploadqueue/writetoCommonAttrBuffer too many common attributes");
                                z2 = false;
                            } else {
                                System.arraycopy(bArr, 0, r6.A03, i5, position3);
                                r6.A00 += position3;
                                z2 = true;
                            }
                        }
                        i2 = position;
                    } else {
                        if (i4 == 1) {
                            i = byteBuffer.position();
                            if ((byteBuffer.get(position) & 4) != 0) {
                                int i6 = i - position;
                                byteBuffer.position(position);
                                byteBuffer.get(bArr, 0, i6);
                                A022 = r6.A02(str2, bArr, i6);
                            } else {
                                i3 = position;
                                z3 = true;
                            }
                        } else if (i4 == 2 && (byteBuffer.get(position) & 4) != 0 && z3) {
                            i = byteBuffer.position();
                            int i7 = i - i3;
                            byteBuffer.position(i3);
                            if (i7 <= 2048) {
                                byteBuffer.get(bArr, 0, i7);
                                A022 = r6.A02(str2, bArr, i7);
                            } else {
                                byte[] bArr2 = new byte[i7];
                                byteBuffer.get(bArr2, 0, i7);
                                A022 = r6.A02(str2, bArr2, i7);
                            }
                        }
                        byteBuffer.position(i);
                        i2 = i3;
                        z3 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    position = byteBuffer.position();
                } else if (z2) {
                    r6.A03 = null;
                    r6.A00 = 0;
                    return;
                }
            }
            if (!z) {
                r6.A03 = null;
                r6.A00 = 0;
            } else {
                AnonymousClass1CT A012 = A01(1);
                try {
                    int i8 = r6.A00;
                    if (i8 > 0) {
                        A012.A04(r6.A03, i8);
                        r6.A03 = null;
                        r6.A00 = 0;
                    }
                    int limit2 = byteBuffer.limit() - i2;
                    byteBuffer.position(i2);
                    if (limit2 <= 2048) {
                        byteBuffer.get(bArr, 0, limit2);
                        A012.A04(bArr, limit2);
                    } else {
                        byte[] bArr3 = new byte[limit2];
                        byteBuffer.get(bArr3, 0, limit2);
                        A012.A04(bArr3, limit2);
                    }
                    try {
                        A012.A02();
                        this.A00 = true;
                        return;
                    } catch (IOException e) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        C36321k7.A1Z(A0u, C90494aF.A0c(e, "privatestatseventbuffermanager/splitBuffer: ioexception while flushing back buffer", A0u));
                        return;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C36321k7.A1Z(A0u2, C90494aF.A0c(e2, "privatestatseventbuffermanager/splitBuffer: unexpected runtime exception when writing to back buffer ", A0u2));
                    try {
                        A012.A01();
                        A012.A02();
                    } catch (Exception e3) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        C36321k7.A1Z(A0u3, C90494aF.A0c(e3, "privatestatseventbuffermanager/splitBuffer see exception when clearing the back buffer ", A0u3));
                    }
                }
            }
            this.A00 = false;
        } catch (AnonymousClass1CU e4) {
            th = e4;
            sb = AnonymousClass000.A0u();
            str = "privatestatseventbuffermanager/splitbuffer invalid buf content";
            C36321k7.A1Z(sb, C90494aF.A0c(th, str, sb));
        } catch (Throwable th) {
            th = th;
            sb = AnonymousClass000.A0u();
            str = "privateStatseventbuffermanager/splitbuffer unexpected errors ";
            C36321k7.A1Z(sb, C90494aF.A0c(th, str, sb));
        }
    }
}
