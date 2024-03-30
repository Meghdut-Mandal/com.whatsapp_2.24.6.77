package X;

import java.io.File;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

/* renamed from: X.78r  reason: invalid class name and case insensitive filesystem */
public class C1512178r extends DigestOutputStream {
    public boolean A00 = false;
    public long A01 = 0;
    public final /* synthetic */ C101484xd A02;
    public final /* synthetic */ File A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1512178r(C101484xd r3, File file, OutputStream outputStream, MessageDigest messageDigest) {
        super(outputStream, messageDigest);
        this.A02 = r3;
        this.A03 = file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r8 = this;
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = "BackupFile/get-output-stream/close/already-closed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0009:
            return
        L_0x000a:
            r8.flush()
            java.security.MessageDigest r0 = r8.getMessageDigest()
            byte[] r5 = r0.digest()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupFile/get-output-stream/close/writing-digest "
            r2.append(r0)
            java.lang.String r0 = X.C18750th.A07(r5)
            r2.append(r0)
            java.lang.String r0 = " bytes written = "
            r2.append(r0)
            long r0 = r8.A01
            X.C36351kA.A1S(r2, r0)
            X.4xd r3 = r8.A02
            boolean r0 = r3 instanceof X.C101474xc
            if (r0 == 0) goto L_0x00ac
            r0 = 0
            X.6Ox r7 = new X.6Ox
            r7.<init>(r5, r0)
        L_0x003b:
            byte[] r4 = r7.A01
            r2 = 1
            r1 = 0
            if (r4 != 0) goto L_0x00a2
            byte[][] r6 = new byte[r2][]
            byte[] r0 = r7.A00
            r6[r1] = r0
        L_0x0047:
            int r5 = r6.length
            r4 = 0
            r2 = 0
        L_0x004a:
            r1 = r6[r4]
            java.util.Arrays.toString(r1)
            int r0 = r1.length
            int r2 = r2 + r0
            r8.write(r1)
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupFile/write-backup-footer/size="
            X.C36321k7.A1T(r0, r1, r2)
        L_0x0061:
            super.close()
            r0 = 1
            r8.A00 = r0
            java.io.File r4 = r3.A03
            r4.delete()
            java.io.File r3 = r8.A03
            boolean r0 = r3.renameTo(r4)
            if (r0 != 0) goto L_0x0009
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "File.renameTo failed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = " "
            r2.append(r1)
            boolean r0 = r3.exists()
            r2.append(r0)
            r2.append(r1)
            r2.append(r4)
            r2.append(r1)
            boolean r0 = r4.exists()
            java.lang.String r0 = X.C36421kH.A0d(r2, r0)
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x00a2:
            r0 = 2
            byte[][] r6 = new byte[r0][]
            byte[] r0 = r7.A00
            r6[r1] = r0
            r6[r2] = r4
            goto L_0x0047
        L_0x00ac:
            r1 = r3
            X.4xb r1 = (X.C101464xb) r1
            boolean r0 = r1 instanceof X.C101444xZ
            if (r0 != 0) goto L_0x0061
            java.lang.String r6 = r1.A0D()
            r0 = 4
            byte[] r4 = new byte[r0]
            r0 = 45
            java.util.Arrays.fill(r4, r0)
            if (r6 == 0) goto L_0x00f0
            int r1 = r6.length()
            r2 = 2
            if (r1 >= r2) goto L_0x00e8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupFooter/get-jid-suffix/unexpected-phone-number "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " it has less than "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " digits"
            X.C36321k7.A1Z(r1, r0)
        L_0x00e1:
            X.6Ox r7 = new X.6Ox
            r7.<init>(r5, r4)
            goto L_0x003b
        L_0x00e8:
            byte[] r0 = r6.getBytes()
            int r1 = r1 - r2
            java.lang.System.arraycopy(r0, r1, r4, r2, r2)
        L_0x00f0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupFooter/get-jid-suffix "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " suffix: "
            r1.append(r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            X.C36321k7.A1a(r1, r0)
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1512178r.close():void");
    }

    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        this.A01 += (long) (i2 - i);
    }

    public void write(int i) {
        super.write(i);
        this.A01++;
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
