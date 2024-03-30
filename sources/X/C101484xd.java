package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.4xd  reason: invalid class name and case insensitive filesystem */
public abstract class C101484xd extends AnonymousClass6QE {
    public AnonymousClass6FN A00;
    public final C24431Ck A01;
    public final AnonymousClass1CY A02;
    public final C24391Cg A03;
    public final C19730wQ A04;

    public C101484xd(C19730wQ r7, C132716Uy r8, C24431Ck r9, C24341Cb r10, AnonymousClass1CY r11, C20840yF r12, C24391Cg r13, AnonymousClass1CS r14, File file) {
        super(r8, r10, r12, r14, file);
        this.A04 = r7;
        this.A02 = r11;
        this.A01 = r9;
        this.A03 = r13;
    }

    public AnonymousClass6FN A0A(InputStream inputStream, boolean z) {
        byte[] bArr;
        AnonymousClass5U9 r1;
        StringBuilder A0u;
        String str;
        byte[] bArr2;
        C100094uS r11;
        AnonymousClass5U9 r12;
        byte[] bArr3;
        String str2;
        InputStream inputStream2 = inputStream;
        if (this instanceof C101474xc) {
            C101474xc r2 = (C101474xc) this;
            boolean z2 = r2 instanceof C101454xa;
            C99934uC r0 = C99934uC.DEFAULT_INSTANCE;
            if (z2) {
                C99934uC r4 = (C99934uC) C170918Hz.A06(r0, inputStream2);
                int i = r4.keyType_;
                if (i == 0 || i != 1) {
                    r12 = AnonymousClass5U9.WA_PROVIDED;
                } else {
                    r12 = AnonymousClass5U9.HSM_CONTROLLED;
                }
                C100094uS r122 = null;
                if (r12 == AnonymousClass5U9.HSM_CONTROLLED) {
                    C99794ty r02 = r4.hsmControlledKeyData_;
                    if (r02 == null) {
                        r02 = C99794ty.DEFAULT_INSTANCE;
                    }
                    byte[] A06 = r02.encryptionIv_.A06();
                    if (A06.length == 0) {
                        str2 = "backup-file-crypt15/read-prefix/failed to read prefix";
                    } else {
                        byte[] A032 = r2.A01.A01.A03();
                        if (A032 != null) {
                            bArr3 = AnonymousClass6R0.A00(A032, C24431Ck.A08, 32);
                        } else {
                            bArr3 = null;
                        }
                        Arrays.toString(bArr3);
                        if (!z || bArr3 != null) {
                            if ((r4.bitField0_ & 8) != 0 && (r122 = r4.backupMetadata_) == null) {
                                r122 = C100094uS.DEFAULT_INSTANCE;
                            }
                            return new C102114yo(r122, bArr3, A06);
                        }
                        str2 = "backup-file-crypt15/read-prefix/no key found";
                    }
                    Log.e(str2);
                }
                return null;
            }
            C99934uC r3 = (C99934uC) C170918Hz.A06(r0, inputStream2);
            int i2 = r3.keyType_;
            if (i2 == 0 || i2 != 1) {
                r1 = AnonymousClass5U9.WA_PROVIDED;
            } else {
                r1 = AnonymousClass5U9.HSM_CONTROLLED;
            }
            byte[] bArr4 = null;
            if (r1 != AnonymousClass5U9.WA_PROVIDED || (r3.bitField0_ & 2) == 0) {
                A0u = AnonymousClass000.A0u();
                str = "msgstore/restore/failed to read cipher from the file ";
            } else {
                C99974uG r13 = r3.waProvidedKeyData_;
                if (r13 == null) {
                    r13 = C99974uG.DEFAULT_INSTANCE;
                }
                C1264263x r6 = new C1264263x(r13.keyVersion_, r13.backupCipherHeader_.A06(), r13.serverSalt_.A06(), r13.googleIdSalt_.A06(), r13.encryptionIv_.A06());
                C1261262q r14 = (C1261262q) r2.A02.A00.A00.get(new AnonymousClass66K(r6.A00, r6.A04));
                if (z) {
                    if (r14 == null) {
                        A0u = AnonymousClass000.A0u();
                        str = "msgstore/restore/cipher result is null for ";
                    }
                    bArr2 = r14.A02;
                } else {
                    if (r14 == null) {
                        bArr2 = null;
                    }
                    bArr2 = r14.A02;
                }
                Arrays.toString(bArr2);
                if ((r3.bitField0_ & 8) != 0) {
                    r11 = r3.backupMetadata_;
                    if (r11 == null) {
                        r11 = C100094uS.DEFAULT_INSTANCE;
                    }
                } else {
                    r11 = null;
                }
                if (r14 != null) {
                    bArr4 = r14.A01;
                }
                return new C102124yp(r6, r11, bArr4, bArr2, r6.A01);
            }
            A0u.append(str);
            C36331k8.A1P(r2.A0C(), A0u);
            return null;
        }
        C1264263x A033 = AnonymousClass6YO.A03(inputStream2);
        C1261262q r03 = (C1261262q) this.A02.A00.A00.get(new AnonymousClass66K(A033.A00, A033.A04));
        byte[] bArr5 = null;
        if (z) {
            if (r03 == null) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("msgstore/restore/cipher result is null for ");
                C36331k8.A1P(A0C(), A0u2);
                return null;
            }
            bArr = r03.A02;
        } else {
            if (r03 == null) {
                bArr = null;
            }
            bArr = r03.A02;
        }
        Arrays.toString(bArr);
        if (r03 != null) {
            bArr5 = r03.A01;
        }
        return new C102134yq(A033, bArr5, bArr, A033.A01);
    }

    public static C131406Ox A01(C101484xd r7) {
        int i;
        C131406Ox r0;
        File file = r7.A03;
        long length = file.length();
        boolean z = r7 instanceof C101474xc;
        if (z) {
            i = 16;
        } else if (((C101464xb) r7) instanceof C101444xZ) {
            i = 0;
        } else {
            i = 20;
        }
        long j = length - ((long) i);
        FileInputStream A0U = C90524aI.A0U(file);
        if (j >= 0) {
            try {
                AnonymousClass14X.A03(A0U, j);
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        if (z) {
            byte[] bArr = new byte[16];
            if (A0U.read(bArr) == 16) {
                r0 = new C131406Ox(bArr, (byte[]) null);
            } else {
                Log.e("backup/cannot read footer, footer is null");
                r0 = null;
            }
        } else {
            if (!(((C101464xb) r7) instanceof C101444xZ)) {
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[4];
                int read = A0U.read(bArr2);
                int read2 = A0U.read(bArr3);
                if (read == 16 && read2 == 4) {
                    r0 = new C131406Ox(bArr2, bArr3);
                } else {
                    Log.e("Backup/BackupFileCrypt12/footer is null");
                }
            }
            r0 = null;
        }
        A0U.close();
        return r0;
    }

    public AnonymousClass5RB A0B() {
        int i;
        File file = this.A03;
        BufferedInputStream A0U = C90474aD.A0U(file);
        long length = file.length();
        if (this instanceof C101474xc) {
            i = 16;
        } else if (((C101464xb) this) instanceof C101444xZ) {
            i = 0;
        } else {
            i = 20;
        }
        long j = length - ((long) i);
        Locale locale = Locale.ENGLISH;
        Object[] A0M = AnonymousClass001.A0M();
        C90474aD.A1S(A0M, j);
        AnonymousClass000.A1K(A0M, i);
        String.format(locale, "BackupFile/get-input-stream size-without-footer:%d footer-size:%d", A0M);
        return new AnonymousClass5RB(A0U, j);
    }

    public AnonymousClass5U6 A0C() {
        if (!(this instanceof C101474xc)) {
            return AnonymousClass5U6.CRYPT12;
        }
        if (((C101474xc) this) instanceof C101454xa) {
            return AnonymousClass5U6.CRYPT15;
        }
        return AnonymousClass5U6.CRYPT14;
    }

    public final String A0D() {
        String str;
        C19730wQ r2 = this.A04;
        r2.A0G();
        if (r2.A00 == null) {
            str = "backup/BackupFileCrypt12/getUserJid MeManager.me is null";
        } else {
            PhoneUserJid A0n = C36441kJ.A0n(r2);
            if (A0n != null) {
                return A0n.user;
            }
            str = "backup/BackupFileCrypt12/getUserJid MeManager.getMyJidObject() is null";
        }
        Log.e(str);
        return null;
    }
}
