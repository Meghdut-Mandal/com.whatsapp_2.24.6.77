package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.crypto.Cipher;

/* renamed from: X.6QE  reason: invalid class name */
public abstract class AnonymousClass6QE {
    public final C24341Cb A00;
    public final C20840yF A01;
    public final AnonymousClass1CS A02;
    public final File A03;
    public final C132716Uy A04;

    public static void A03(AnonymousClass7fT r8, InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[C132986Wc.A0F];
        long j2 = 0;
        int i = -1;
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
                int i2 = (int) ((100 * j2) / j);
                if (i != i2) {
                    Locale locale = Locale.ENGLISH;
                    Object[] A1Q = C36441kJ.A1Q();
                    AnonymousClass000.A1M(A1Q, 0, j2);
                    AnonymousClass000.A1M(A1Q, 1, j);
                    AnonymousClass000.A1L(A1Q, i2, 2);
                    String.format(locale, "encrypter/encrypt %d/%d (%d%%)", A1Q);
                    if (r8 != null) {
                        r8.B2F(Integer.valueOf(i2));
                    }
                    i = i2;
                }
            } else {
                return;
            }
        }
    }

    public C1257861g A04() {
        int i;
        int i2;
        String str;
        String A002;
        AnonymousClass6FN r1;
        C99934uC r0;
        C99934uC r12;
        if (this instanceof C101434xY) {
            return new C1257861g(1, (String) null);
        }
        C101484xd r4 = (C101484xd) this;
        if (r4 instanceof C101444xZ) {
            i2 = 1;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("EncryptedBackupFile/verifyIntegrity/");
            AnonymousClass5U6 A0C = r4.A0C();
            C36321k7.A1N(A0C, A0u);
            C224214g r11 = new C224214g("BackupFile/getFileDigestWithoutFooter/calculating-actual-digest");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("BackupFile/getFileDigestWithoutFooter/initial digest = ");
            C36321k7.A1a(A0u2, C18750th.A07(instance.digest()));
            File file = r4.A03;
            long length = file.length();
            boolean z = r4 instanceof C101474xc;
            if (z) {
                i = 16;
            } else if (((C101464xb) r4) instanceof C101444xZ) {
                i = 0;
            } else {
                i = 20;
            }
            String A06 = AnonymousClass6YY.A06(file, instance, length - ((long) i));
            r11.A01();
            C36321k7.A1Q("msgstore-integrity-checker/verify-integrity/actual-digest/  ", A06, AnonymousClass000.A0u());
            C131406Ox A012 = C101484xd.A01(r4);
            C24391Cg r5 = r4.A03;
            StringBuilder A0v = AnonymousClass000.A0v("EncryptedBackupFile/verifyIntegrity/");
            A0v.append(A0C);
            C36421kH.A1N(A0v);
            A0v.append(file);
            C90464aC.A19(file, " size=", A0v);
            A0v.append(" modification time = ");
            A0v.append(file.lastModified());
            A0v.append("footer: ");
            A0v.append(A012);
            String A0p = AnonymousClass000.A0p("actualDigest: ", A06, A0v);
            i2 = 2;
            r5.A00(A0p, 2);
            if (A012 != null) {
                if (A06 == null) {
                    byte[] bArr = A012.A01;
                    if (bArr != null) {
                        A002 = Arrays.toString(bArr);
                    } else {
                        A002 = "null";
                    }
                } else {
                    String A0D = r4.A0D();
                    if (!(A0D == null || (r1 = r4.A00) == null)) {
                        if (r1 instanceof C102124yp) {
                            r0 = ((C102124yp) r1).A00;
                        } else if (r1 instanceof C102114yo) {
                            r0 = ((C102114yo) r1).A00;
                        }
                        if (AnonymousClass6YO.A0F(r0, A0D)) {
                            i2 = 4;
                            AnonymousClass6FN r13 = r4.A00;
                            if (r13 instanceof C102124yp) {
                                r12 = ((C102124yp) r13).A00;
                            } else if (r13 instanceof C102114yo) {
                                r12 = ((C102114yo) r13).A00;
                            }
                            if ((r12.bitField0_ & 8) != 0) {
                                C100094uS r02 = r12.backupMetadata_;
                                C100094uS r14 = r02;
                                if (r02 == null) {
                                    r02 = C100094uS.DEFAULT_INSTANCE;
                                }
                                if ((r02.bitField0_ & 4) != 0) {
                                    if (r14 == null) {
                                        r14 = C100094uS.DEFAULT_INSTANCE;
                                    }
                                    A002 = r14.jidSuffix_;
                                }
                            }
                        }
                    }
                    byte[] bArr2 = A012.A01;
                    if (z) {
                        if (bArr2 != null) {
                            A002 = C131406Ox.A00(bArr2);
                        } else {
                            str = null;
                        }
                    } else if (bArr2 == null) {
                        Log.e("BackupFileCrypt12/verifyFooterIntegrity/jidSuffix is null");
                    } else {
                        str = r4.A0D();
                    }
                    return A012.A01(r5, A06, str);
                }
                return new C1257861g(i2, A002);
            }
        }
        A002 = null;
        return new C1257861g(i2, A002);
    }

    public C1257861g A05(C19630wG r25, C158587hk r26, File file, int i, int i2, boolean z) {
        C1257861g r1;
        byte[] bArr;
        IllegalStateException th;
        byte[] bArr2;
        InflaterInputStream inflaterInputStream;
        FileInputStream A0U;
        C158587hk r11 = r26;
        File file2 = file;
        int i3 = i;
        int i4 = i2;
        if (this instanceof C101434xY) {
            AnonymousClass5RK r4 = new AnonymousClass5RK(this.A01.A00, file2);
            try {
                A0U = C90524aI.A0U(this.A03);
                FileChannel channel = A0U.getChannel();
                WritableByteChannel newChannel = Channels.newChannel(r4);
                long j = 0;
                for (long j2 = 0; j2 < channel.size(); j2 += 131072) {
                    j += channel.transferTo(j2, Math.min(131072, channel.size() - j2), newChannel);
                    if (r26 != null && i2 > 0) {
                        r11.Bjw(i3, i4, j, channel.size());
                    }
                }
                r4.flush();
                C1257861g r0 = new C1257861g(1, (String) null);
                A0U.close();
                r4.close();
                return r0;
            } catch (Throwable th2) {
                th = th2;
                try {
                    r4.close();
                    throw th;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                    throw th;
                }
            }
        } else {
            C101484xd r7 = (C101484xd) this;
            AnonymousClass5RK r2 = new AnonymousClass5RK(r7.A01.A00, file2);
            try {
                AnonymousClass5RB A0B = r7.A0B();
                try {
                    AnonymousClass6FN A0A = r7.A0A(A0B, true);
                    r7.A00 = A0A;
                    if (A0A == null) {
                        r1 = new C1257861g(5, (String) null);
                    } else {
                        r1 = r7.A04();
                        if (r1.A00 == 1) {
                            Log.i("BackupFile/restoreSingleFileBackup/file-integrity-check/success");
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("BackupFile/restoreSingleFileBackup/key ");
                            AnonymousClass5U6 A0C = r7.A0C();
                            C36321k7.A1N(A0C, A0u);
                            File file3 = r7.A03;
                            file3.length();
                            AnonymousClass1CS r42 = r7.A02;
                            long length = file3.length();
                            AnonymousClass6FN r8 = r7.A00;
                            boolean z2 = r8 instanceof C102114yo;
                            if (z2) {
                                bArr = ((C102114yo) r8).A02;
                            } else {
                                bArr = ((C102134yq) r8).A03;
                            }
                            if (bArr != null) {
                                if (z2) {
                                    bArr2 = ((C102114yo) r8).A01;
                                } else {
                                    bArr2 = ((C102134yq) r8).A02;
                                }
                                AnonymousClass1CS.A03(r42);
                                AtomicLong atomicLong = new AtomicLong();
                                synchronized (r42) {
                                    int ordinal = A0C.ordinal();
                                    if (ordinal == 1) {
                                        Cipher cipher = r42.A00;
                                        C18740tg.A06(cipher);
                                        inflaterInputStream = AnonymousClass1CS.A00(A0B, atomicLong, cipher, bArr, bArr2);
                                    } else if (ordinal == 3) {
                                        Cipher cipher2 = r42.A01;
                                        C18740tg.A06(cipher2);
                                        inflaterInputStream = AnonymousClass1CS.A00(A0B, atomicLong, cipher2, bArr, bArr2);
                                    } else if (ordinal == 4) {
                                        Cipher cipher3 = r42.A02;
                                        C18740tg.A06(cipher3);
                                        inflaterInputStream = AnonymousClass1CS.A00(A0B, atomicLong, cipher3, bArr, bArr2);
                                    } else {
                                        throw C90464aC.A0P(A0C, "unsupported key selector ", AnonymousClass000.A0u());
                                    }
                                }
                                try {
                                    byte[] bArr3 = new byte[C132986Wc.A0F];
                                    while (true) {
                                        int read = inflaterInputStream.read(bArr3);
                                        if (read < 0) {
                                            break;
                                        }
                                        r2.write(bArr3, 0, read);
                                        if (r26 != null && i2 > 0) {
                                            r11.Bjw(i3, i4, atomicLong.get(), length);
                                        }
                                    }
                                    inflaterInputStream.close();
                                    r2.flush();
                                    if (z) {
                                        AnonymousClass6FN r43 = r7.A00;
                                        if (!(r43 instanceof C102114yo)) {
                                            C102134yq r44 = (C102134yq) r43;
                                            C19630wG r5 = r25;
                                            AnonymousClass00C.A0D(r5, 0);
                                            Context context = r5.A00;
                                            C1264263x r3 = r44.A00;
                                            String str = r3.A00;
                                            byte[] bArr4 = r3.A04;
                                            byte[] bArr5 = r44.A03;
                                            if (bArr5 != null) {
                                                byte[] bArr6 = r44.A01;
                                                if (bArr6 != null) {
                                                    AnonymousClass6YO.A0B(context, str, bArr4, bArr5, bArr6, r3.A02);
                                                    C1259862c A042 = AnonymousClass6YO.A04(context);
                                                    if (A042 != null) {
                                                        A042.toString();
                                                    }
                                                } else {
                                                    throw AnonymousClass001.A08("backup-prefix/get-key/account hash is null");
                                                }
                                            } else {
                                                throw AnonymousClass001.A08("backup-prefix/get-key/key is null");
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                }
                            } else {
                                th = AnonymousClass001.A09("backup-prefix/get-key/key is null");
                                throw th;
                            }
                        }
                    }
                    A0B.close();
                    r2.close();
                    return r1;
                } catch (Throwable th5) {
                    A0B.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                r2.close();
                throw th;
            }
        }
        throw th;
    }

    public C162157o7 A06(Context context) {
        if (this instanceof C101434xY) {
            return new C142786pT((C101434xY) this);
        }
        C101484xd r1 = (C101484xd) this;
        if (r1.A08(context)) {
            return new C142776pS(r1);
        }
        Log.e("EncryptedBackupFile/failed to prepare for backup");
        return null;
    }

    public void A07(AnonymousClass7fT r9, File file) {
        byte[] bArr;
        IllegalStateException th;
        byte[] bArr2;
        DeflaterOutputStream deflaterOutputStream;
        FileInputStream A0U;
        if (this instanceof C101434xY) {
            FileOutputStream A0W = C90524aI.A0W(this.A03);
            try {
                A0U = C90524aI.A0U(file);
                A03(r9, A0U, A0W, file.length());
                A0U.close();
                A0W.close();
                return;
            } catch (Throwable th2) {
                th = th2;
                try {
                    A0W.close();
                    throw th;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                    throw th;
                }
            }
        } else {
            C101484xd r6 = (C101484xd) this;
            C18740tg.A0F(AnonymousClass000.A1V(r6.A00), "prefix has not been initialized");
            File A012 = r6.A00.A00().A01("");
            FileOutputStream A0W2 = C90524aI.A0W(A012);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BackupFile/get-output-stream/initial digest = ");
            C36321k7.A1a(A0u, C18750th.A07(instance.digest()));
            instance.reset();
            C1512178r r2 = new C1512178r(r6, A012, A0W2, instance);
            try {
                FileInputStream A0U2 = C90524aI.A0U(file);
                try {
                    r6.A00.A01(r2);
                    AnonymousClass1CS r5 = r6.A02;
                    AnonymousClass5U6 A0C = r6.A0C();
                    AnonymousClass6FN r4 = r6.A00;
                    boolean z = r4 instanceof C102114yo;
                    if (z) {
                        bArr = ((C102114yo) r4).A02;
                    } else {
                        bArr = ((C102134yq) r4).A03;
                    }
                    if (bArr != null) {
                        if (z) {
                            bArr2 = ((C102114yo) r4).A01;
                        } else {
                            bArr2 = ((C102134yq) r4).A02;
                        }
                        synchronized (r5) {
                            AnonymousClass1CS.A03(r5);
                            int ordinal = A0C.ordinal();
                            if (ordinal == 1) {
                                deflaterOutputStream = A02(r2, r5.A03, bArr, bArr2);
                            } else if (ordinal == 3) {
                                deflaterOutputStream = A02(r2, r5.A04, bArr, bArr2);
                            } else if (ordinal == 4) {
                                deflaterOutputStream = A02(r2, r5.A05, bArr, bArr2);
                            } else {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("Unexpected key selector (");
                                A0u2.append(A0C);
                                throw AnonymousClass000.A0c(")", A0u2);
                            }
                        }
                        try {
                            A03(r9, A0U2, deflaterOutputStream, file.length());
                            deflaterOutputStream.close();
                            A0U2.close();
                            r2.close();
                            return;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                    } else {
                        th = AnonymousClass001.A09("backup-prefix/get-key/key is null");
                        throw th;
                    }
                } catch (Throwable th5) {
                    A0U2.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                r2.close();
                throw th;
            }
        }
        throw th;
    }

    public boolean A08(Context context) {
        AnonymousClass6FN r6;
        byte[] A032;
        byte[] A002;
        if (this instanceof C101434xY) {
            return true;
        }
        C101484xd r5 = (C101484xd) this;
        if (r5 instanceof C101474xc) {
            C101474xc r3 = (C101474xc) r5;
            if (r3 instanceof C101454xa) {
                C24431Ck r1 = r3.A01;
                r6 = null;
                if (!(!r1.A03.A2I() || (A032 = r1.A01.A03()) == null || (A002 = AnonymousClass6R0.A00(A032, C24431Ck.A08, 32)) == null)) {
                    r6 = new C102114yo(r3.A0E(), A002, C18750th.A0H(16));
                }
            } else {
                r6 = null;
                try {
                    C1259862c A042 = AnonymousClass6YO.A04(context);
                    if (A042 == null) {
                        r3.A03.A00("msgstore/backupDatabase/key is null", 3);
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("msgstore/backupDatabase/key v=");
                        C1264263x r7 = A042.A00;
                        C36321k7.A1a(A0u, r7.A00);
                        r6 = new C102124yp(r7, r3.A0E(), A042.A02, A042.A01, r7.A01);
                    }
                } catch (Exception e) {
                    Log.w("msgstore/backupDatabase/key/error", e);
                }
            }
        } else {
            C18740tg.A0C(!r5.A01.A03.A2I());
            r6 = null;
            C1259862c A043 = AnonymousClass6YO.A04(context);
            if (A043 == null) {
                r5.A03.A00("msgstore/backupDatabase/key is null", 3);
            } else {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("msgstore/backupDatabase/createPrefix v=");
                C1264263x r4 = A043.A00;
                C36321k7.A1a(A0u2, r4.A00);
                r6 = new C102134yq(r4, A043.A02, A043.A01, r4.A01);
            }
        }
        r5.A00 = r6;
        return AnonymousClass000.A1V(r6);
    }

    public boolean A09(AnonymousClass4PB r13) {
        byte[] bArr;
        byte[] bArr2;
        ZipInputStream A042;
        AnonymousClass5RK r0;
        ZipInputStream A043;
        AnonymousClass5RK r02;
        if (this instanceof C101434xY) {
            BufferedInputStream A0U = C90474aD.A0U(this.A03);
            try {
                A043 = this.A02.A04(AnonymousClass5U6.UNENCRYPTED, A0U, new AtomicLong(), (byte[]) null, (byte[]) null);
                try {
                    for (ZipEntry nextEntry = A043.getNextEntry(); nextEntry != null; nextEntry = A043.getNextEntry()) {
                        File file = (File) r13.apply(nextEntry.getName());
                        if (file != null) {
                            r02 = new AnonymousClass5RK(this.A01.A00, file);
                            AnonymousClass6YY.A0J(A043, r02);
                            r02.close();
                        }
                        A043.closeEntry();
                    }
                    A043.close();
                    A0U.close();
                    return true;
                } catch (Exception e) {
                    Log.e("unencrypted-backup-file/restore-multi-file-backup/restore failed", e);
                    A043.close();
                    A0U.close();
                    return false;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    A0U.close();
                    throw th;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                    throw th;
                }
            }
        } else {
            C101484xd r5 = (C101484xd) this;
            File file2 = r5.A03;
            FileInputStream A0U2 = C90524aI.A0U(file2);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(A0U2);
                try {
                    AnonymousClass6FN A0A = r5.A0A(bufferedInputStream, true);
                    r5.A00 = A0A;
                    if (A0A == null) {
                        Log.e("EncryptedBackupFile/restore-multi-file-backup/restore/failed to read prefix");
                    } else {
                        file2.length();
                        AtomicLong atomicLong = new AtomicLong();
                        AnonymousClass1CS r6 = r5.A02;
                        AnonymousClass5U6 A0C = r5.A0C();
                        AnonymousClass6FN r3 = r5.A00;
                        boolean z = r3 instanceof C102114yo;
                        if (z) {
                            bArr = ((C102114yo) r3).A02;
                        } else {
                            bArr = ((C102134yq) r3).A03;
                        }
                        if (bArr != null) {
                            if (z) {
                                bArr2 = ((C102114yo) r3).A01;
                            } else {
                                bArr2 = ((C102134yq) r3).A02;
                            }
                            A042 = r6.A04(A0C, bufferedInputStream, atomicLong, bArr, bArr2);
                            try {
                                for (ZipEntry nextEntry2 = A042.getNextEntry(); nextEntry2 != null; nextEntry2 = A042.getNextEntry()) {
                                    File file3 = (File) r13.apply(nextEntry2.getName());
                                    if (file3 != null) {
                                        r0 = new AnonymousClass5RK(r5.A01.A00, file3);
                                        AnonymousClass6YY.A0J(A042, r0);
                                        r0.close();
                                    }
                                    A042.closeEntry();
                                }
                                A042.close();
                                bufferedInputStream.close();
                                A0U2.close();
                                return true;
                            } catch (Exception e2) {
                                Log.e("EncryptedBackupFile/restore-multi-file-backup/restore", e2);
                                A042.close();
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                        } else {
                            throw AnonymousClass001.A09("backup-prefix/get-key/key is null");
                        }
                    }
                    bufferedInputStream.close();
                    A0U2.close();
                    return false;
                } catch (Throwable th5) {
                    bufferedInputStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                A0U2.close();
                throw th;
            }
        }
        throw th;
        throw th;
        throw th;
        throw th;
    }

    public AnonymousClass6QE(C132716Uy r1, C24341Cb r2, C20840yF r3, AnonymousClass1CS r4, File file) {
        this.A03 = file;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r1;
        this.A01 = r3;
    }

    public static DeflaterOutputStream A02(OutputStream outputStream, Cipher cipher, byte[] bArr, byte[] bArr2) {
        C18740tg.A06(cipher);
        return new DeflaterOutputStream(AnonymousClass1CS.A02(outputStream, cipher, bArr, bArr2), new Deflater(1, false));
    }
}
