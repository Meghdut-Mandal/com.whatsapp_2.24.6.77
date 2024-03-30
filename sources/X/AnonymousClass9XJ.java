package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.9XJ  reason: invalid class name */
public class AnonymousClass9XJ {
    public int A00 = 0;
    public String A01;
    public HashMap A02;
    public byte[] A03 = null;
    public boolean[] A04;
    public final C19420v0 A05;
    public final C20900yL A06;
    public final C20870yI A07;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.lang.String r14, byte[] r15, int r16) {
        /*
            r13 = this;
            r4 = 0
            java.util.HashMap r6 = r13.A02
            java.lang.Object r7 = r6.get(r14)
            X.9j7 r7 = (X.C201229j7) r7
            if (r7 != 0) goto L_0x00fc
            r3 = 0
        L_0x000c:
            boolean[] r5 = r13.A04
            boolean r0 = r5[r3]
            if (r0 != 0) goto L_0x00f2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = r13.A01     // Catch:{ Exception -> 0x00d7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = "wampsid"
            r1.append(r0)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception -> 0x00d7 }
            java.io.File r2 = X.C90524aI.A0S(r0)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = "rwd"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00d7 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x00d7 }
            X.9j7 r2 = new X.9j7     // Catch:{ Exception -> 0x00d7 }
            X.0yL r0 = r13.A06     // Catch:{ Exception -> 0x00d7 }
            r2.<init>(r0, r1, r3)     // Catch:{ Exception -> 0x00d7 }
            X.0yI r8 = r13.A07     // Catch:{ Exception -> 0x00d5 }
            android.content.SharedPreferences r1 = X.C20870yI.A01(r8)     // Catch:{ Exception -> 0x00d5 }
            r0 = -1
            int r0 = r1.getInt(r14, r0)     // Catch:{ Exception -> 0x00d5 }
            int r7 = r0 + 1
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r7 <= r0) goto L_0x004d
            r7 = 0
        L_0x004d:
            android.content.SharedPreferences r0 = X.C20870yI.A01(r8)     // Catch:{ Exception -> 0x00d5 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00d5 }
            X.C36341k9.A0v(r0, r14, r7)     // Catch:{ Exception -> 0x00d5 }
            r8 = r14
            int r1 = r14.length()     // Catch:{ Exception -> 0x00d5 }
            r0 = 36
            if (r1 <= r0) goto L_0x0065
            java.lang.String r8 = r14.substring(r4, r0)     // Catch:{ Exception -> 0x00d5 }
        L_0x0065:
            r2.A03 = r8     // Catch:{ Exception -> 0x00d5 }
            r8 = 1
            r2.A01 = r8     // Catch:{ Exception -> 0x00d5 }
            r2.A00 = r4     // Catch:{ Exception -> 0x00d5 }
            java.io.RandomAccessFile r9 = r2.A07     // Catch:{ Exception -> 0x00d5 }
            r0 = 33024(0x8100, double:1.6316E-319)
            r9.setLength(r0)     // Catch:{ Exception -> 0x00d5 }
            byte[] r0 = X.C201229j7.A08     // Catch:{ Exception -> 0x00d5 }
            r9.write(r0)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r2.A03     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ Exception -> 0x00d5 }
            r9.write(r0)     // Catch:{ Exception -> 0x00d5 }
            r9.writeByte(r8)     // Catch:{ Exception -> 0x00d5 }
            r9.writeByte(r4)     // Catch:{ Exception -> 0x00d5 }
            r11 = 8
            r9.writeInt(r11)     // Catch:{ Exception -> 0x00d5 }
            r12 = 32768(0x8000, float:4.5918E-41)
            r9.writeInt(r12)     // Catch:{ Exception -> 0x00d5 }
            r9.writeBoolean(r4)     // Catch:{ Exception -> 0x00d5 }
            r0 = 256(0x100, double:1.265E-321)
            r9.seek(r0)     // Catch:{ Exception -> 0x00d5 }
            byte[] r8 = X.C198919eP.A06     // Catch:{ Exception -> 0x00d5 }
            r0 = r7 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x00d5 }
            r0 = 5
            r8[r0] = r1     // Catch:{ Exception -> 0x00d5 }
            int r0 = r7 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x00d5 }
            r0 = 6
            r8[r0] = r1     // Catch:{ Exception -> 0x00d5 }
            r9.write(r8)     // Catch:{ Exception -> 0x00d5 }
            java.util.ArrayList r1 = r2.A04     // Catch:{ Exception -> 0x00d5 }
            X.9KA r0 = new X.9KA     // Catch:{ Exception -> 0x00d5 }
            r0.<init>(r11, r12, r4)     // Catch:{ Exception -> 0x00d5 }
            r1.add(r0)     // Catch:{ Exception -> 0x00d5 }
            int r10 = r2.A00     // Catch:{ Exception -> 0x00d5 }
            X.0yL r8 = r2.A06     // Catch:{ Exception -> 0x00d5 }
            X.9eP r7 = new X.9eP     // Catch:{ Exception -> 0x00d5 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00d5 }
            r2.A02 = r7     // Catch:{ Exception -> 0x00d5 }
            r0 = 1
            r5[r3] = r0     // Catch:{ Exception -> 0x00d5 }
            int r1 = r13.A00     // Catch:{ Exception -> 0x00d5 }
            if (r1 <= 0) goto L_0x00d1
            byte[] r0 = r13.A03     // Catch:{ Exception -> 0x00d5 }
            r2.A01(r0, r1)     // Catch:{ Exception -> 0x00d5 }
        L_0x00d1:
            r6.put(r14, r2)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00fb
        L_0x00d5:
            r5 = move-exception
            goto L_0x00d9
        L_0x00d7:
            r5 = move-exception
            r2 = r7
        L_0x00d9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "privatestatsuploadqueue/writeToQueueForPsId failed to create new QueueFile "
            java.lang.String r0 = X.C90494aF.A0c(r5, r0, r1)
            X.C36321k7.A1Z(r1, r0)
            X.0yL r1 = r13.A06
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A0H = r0
            r1.A05()
            r7 = r2
        L_0x00f2:
            int r3 = r3 + 1
            r0 = 8
            if (r3 < r0) goto L_0x000c
            if (r7 != 0) goto L_0x00fc
            return r4
        L_0x00fb:
            r7 = r2
        L_0x00fc:
            r0 = r16
            boolean r0 = r7.A01(r15, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XJ.A02(java.lang.String, byte[], int):boolean");
    }

    public void A00(String str) {
        this.A01 = str;
        int i = 0;
        do {
            boolean[] zArr = this.A04;
            zArr[i] = false;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(this.A01);
            A0u.append("wampsid");
            File A0S = C90524aI.A0S(AnonymousClass000.A0q(Integer.toString(i), A0u));
            RandomAccessFile randomAccessFile = null;
            if (A0S.exists()) {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(A0S, "rwd");
                    try {
                        C201229j7 r7 = new C201229j7(this.A06, randomAccessFile2, i);
                        RandomAccessFile randomAccessFile3 = r7.A07;
                        randomAccessFile3.seek(0);
                        byte[] bArr = C201229j7.A08;
                        byte[] bArr2 = new byte[8];
                        randomAccessFile3.read(bArr2);
                        if (Arrays.equals(bArr2, bArr)) {
                            randomAccessFile3.seek((long) 8);
                            byte[] bArr3 = new byte[36];
                            randomAccessFile3.read(bArr3);
                            r7.A03 = new String(bArr3, DefaultCrypto.UTF_8);
                            r7.A01 = randomAccessFile3.read();
                            r7.A00 = randomAccessFile3.read();
                            ArrayList arrayList = r7.A04;
                            arrayList.clear();
                            boolean z = false;
                            for (int i2 = 0; i2 < r7.A01; i2++) {
                                int readInt = randomAccessFile3.readInt();
                                int readInt2 = randomAccessFile3.readInt();
                                boolean readBoolean = randomAccessFile3.readBoolean();
                                if (readBoolean && readInt <= 8) {
                                    Log.e("queuefile/loadFromFile see locked empty mini event buffer");
                                    z = true;
                                    readBoolean = false;
                                }
                                arrayList.add(new AnonymousClass9KA(readInt, readInt2, readBoolean));
                            }
                            int i3 = r7.A00;
                            int i4 = C165607th.A0U(arrayList, i3).A01;
                            int i5 = C165607th.A0U(arrayList, i3).A00;
                            r7.A02 = new C198919eP(r7.A06, randomAccessFile3, i3, i4, i5);
                            if (z) {
                                C201229j7.A00(r7);
                            }
                            this.A02.put(r7.A03, r7);
                            zArr[i] = true;
                        } else {
                            Log.e("privatestatsuploadqueue/initfromqueuefile invalid queue file");
                            try {
                                randomAccessFile2.close();
                                A0S.delete();
                                return;
                            } catch (IOException | SecurityException e) {
                                C36321k7.A1Z(AnonymousClass000.A0v("privatestatsuploadqueue/initfromqueuefile failed to delete the corrupted queue file "), e.toString());
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        randomAccessFile = randomAccessFile2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C36321k7.A1Z(A0u2, C90494aF.A0c(e, "privatestatsuploadqueue/initfromqueuefile failed to load the queue file ", A0u2));
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException | SecurityException e4) {
                            C36321k7.A1Z(AnonymousClass000.A0v("privatestatsuploadqueue/initfromqueuefile failed to delete the corrupted queue file "), e4.toString());
                        }
                    }
                    i++;
                    if (i >= 8) {
                    }
                }
            }
            i++;
        } while (i >= 8);
    }

    public boolean A01() {
        Iterator A10 = C36371kC.A10(this.A02);
        while (A10.hasNext()) {
            C201229j7 r3 = (C201229j7) C36351kA.A0u(A10);
            int i = 0;
            while (true) {
                if (i < r3.A01) {
                    if (C165607th.A0U(r3.A04, i).A01 > 8) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public AnonymousClass9XJ(C19420v0 r5, C20870yI r6, C20900yL r7) {
        this.A06 = r7;
        this.A07 = r6;
        this.A05 = r5;
        this.A02 = AnonymousClass001.A0J();
        boolean[] zArr = new boolean[8];
        this.A04 = zArr;
        int i = 0;
        do {
            zArr[i] = false;
            i++;
        } while (i < 8);
        this.A01 = "";
    }
}
