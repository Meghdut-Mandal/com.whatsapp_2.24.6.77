package X;

import android.content.Context;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class A2W implements C23065B2p {
    public static AtomicReference A09 = new AtomicReference((Object) null);
    public C198929eQ A00;
    public MmapBufferManager A01;
    public C201689k7[] A02;
    public C201689k7[] A03;
    public C196549a2 A04;
    public final A2V A05;
    public final Object A06 = C36441kJ.A11();
    public final Random A07;
    public volatile C192319Gn A08;

    private void A00(C207229ul r6) {
        for (Buffer deallocateBuffer : r6.A0F) {
            if (!this.A01.deallocateBuffer(deallocateBuffer)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Could not release memory for buffer for trace: ");
                Log.e("Profilo/TraceOrchestrator", AnonymousClass000.A0q(r6.A0D, A0u));
            }
        }
    }

    private void A01(C207229ul r19) {
        File file;
        List asList;
        boolean z;
        List asList2;
        AnonymousClass9NU r6;
        ZipOutputStream zipOutputStream;
        C207229ul r5 = r19;
        File file2 = r5.A0A;
        boolean z2 = true;
        if (!file2.isDirectory() || file2.list().length <= 1) {
            z2 = false;
        }
        boolean z3 = false;
        if (z2) {
            file = null;
            if (file2.isDirectory()) {
                File file3 = new File(file2.getParent(), AnonymousClass000.A0p(file2.getName(), ".zip.tmp", AnonymousClass000.A0u()));
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3), 262144);
                    try {
                        zipOutputStream = new ZipOutputStream(bufferedOutputStream);
                        A03(file2, ".", zipOutputStream);
                        zipOutputStream.flush();
                        zipOutputStream.finish();
                        zipOutputStream.close();
                        bufferedOutputStream.close();
                        file = file3;
                    } catch (Throwable th) {
                        bufferedOutputStream.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file3.delete();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss", Locale.US).format(new Date());
            File parentFile = file.getParentFile();
            StringBuilder A0v = AnonymousClass000.A0v(format);
            A0v.append("-");
            File A0K = C90464aC.A0K(parentFile, file.getName(), A0v);
            if (file.renameTo(A0K)) {
                file = A0K;
            }
            try {
                A02(file2);
            } catch (Exception e) {
                Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e);
            }
        } else {
            File[] listFiles = file2.listFiles();
            if (listFiles == null || listFiles.length == 0 || (file = listFiles[0]) == null) {
                return;
            }
        }
        A2V a2v = this.A05;
        if (!a2v.B2Q(r5, file)) {
            Log.d("Profilo/TraceOrchestrator", "Not allowed to upload.");
            return;
        }
        synchronized (this) {
            if ((r5.A03 & 3) != 0) {
                z3 = true;
            }
            C198929eQ r2 = this.A00;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf != -1) {
                name = name.substring(0, lastIndexOf);
            }
            String A0q = AnonymousClass000.A0q(".log", AnonymousClass000.A0v(name));
            if (z3) {
                A0q = AnonymousClass000.A0p("override-", A0q, AnonymousClass000.A0u());
            }
            File file4 = r2.A04;
            if (file4.isDirectory() || file4.mkdirs()) {
                boolean renameTo = file.renameTo(C36441kJ.A0w(file4, A0q));
                AnonymousClass9NU r1 = r2.A02;
                if (renameTo) {
                    r1.A00++;
                } else {
                    r1.A03++;
                }
                File file5 = r2.A06;
                long j = r2.A01;
                FilenameFilter filenameFilter = C198929eQ.A07;
                FilenameFilter filenameFilter2 = C198929eQ.A08;
                FilenameFilter[] filenameFilterArr = {filenameFilter, filenameFilter2};
                if (file4.exists() || file4.isDirectory()) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    int i = 0;
                    do {
                        File[] listFiles2 = file4.listFiles(filenameFilterArr[i]);
                        if (listFiles2 == null) {
                            asList = Collections.EMPTY_LIST;
                        } else {
                            asList = Arrays.asList(listFiles2);
                        }
                        A0I.addAll(asList);
                        i++;
                    } while (i < 2);
                    long A0A = C36441kJ.A0A(j);
                    Iterator it = A0I.iterator();
                    while (it.hasNext()) {
                        File file6 = (File) it.next();
                        if (file6.lastModified() < A0A) {
                            if (file6.renameTo(C36441kJ.A0w(file5, file6.getName()))) {
                                z = true;
                            } else {
                                r2.A02.A03++;
                                if (file6.exists() && !file6.delete()) {
                                    r2.A02.A02++;
                                }
                                z = false;
                            }
                            AnonymousClass9NU r12 = r2.A02;
                            if (z) {
                                r12.A05++;
                            } else {
                                r12.A04++;
                            }
                        }
                    }
                }
                int i2 = r2.A00;
                FilenameFilter[] filenameFilterArr2 = {filenameFilter, filenameFilter2};
                if (file5.exists() || file5.isDirectory()) {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    int i3 = 0;
                    do {
                        File[] listFiles3 = file5.listFiles(filenameFilterArr2[i3]);
                        if (listFiles3 == null) {
                            asList2 = Collections.EMPTY_LIST;
                        } else {
                            asList2 = Arrays.asList(listFiles3);
                        }
                        A0I2.addAll(asList2);
                        i3++;
                    } while (i3 < 2);
                    if (A0I2.size() > i2) {
                        Collections.sort(A0I2, new C23176B8k(r2, 2));
                        for (File delete : A0I2.subList(0, A0I2.size() - i2)) {
                            boolean delete2 = delete.delete();
                            AnonymousClass9NU r13 = r2.A02;
                            if (delete2) {
                                r13.A06++;
                            } else {
                                r13.A04++;
                            }
                        }
                    }
                }
            } else {
                r2.A02.A01++;
            }
            r6 = r2.A02;
            r2.A02 = new AnonymousClass9NU();
        }
        a2v.BjI(r5);
        a2v.BjH(r6.A02 + r6.A03 + r6.A01 + r6.A04, r6.A06, r6.A05, r6.A00);
        return;
        throw th;
    }

    public void BjL(C207229ul r7, int i) {
        String str;
        IllegalStateException th;
        C192319Gn r2;
        try {
            this.A05.BjL(r7, i);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Trace is aborted with code: ");
            switch (i) {
                case 1:
                    str = "unknown";
                    break;
                case 2:
                    str = "controller_init";
                    break;
                case 3:
                    str = "missed_event";
                    break;
                case 4:
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
                    break;
                case 5:
                    str = "new_start";
                    break;
                case 6:
                    str = "condition_not_met";
                    break;
                case 8:
                    str = "writer_exception";
                    break;
                case 9:
                    str = "logout";
                    break;
                default:
                    str = AnonymousClass000.A0r("UNKNOWN REASON ", AnonymousClass000.A0u(), i);
                    break;
            }
            A0u.append(str);
            AnonymousClass000.A1A(A0u, "Profilo/TraceOrchestrator");
            C203119nL r22 = C203119nL.A0A;
            if (r22 != null) {
                r22.A05(r7.A06, i);
                File file = r7.A0A;
                if (file.exists()) {
                    synchronized (this) {
                        try {
                            r2 = this.A08;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                            }
                        }
                    }
                    if (r2 != null && i == 4) {
                        TreeMap treeMap = r2.A00.intParams;
                        int i2 = 0;
                        if (treeMap != null && treeMap.containsKey("system_config.timed_out_upload_sample_rate")) {
                            i2 = treeMap.get("system_config.timed_out_upload_sample_rate");
                        }
                        int A0H = C90514aH.A0H(i2);
                        if (A0H != 0 && this.A07.nextInt(A0H) == 0) {
                            A01(r7);
                        }
                    }
                    A02(file);
                }
                A00(r7);
                return;
            }
            th = AnonymousClass001.A09("No TraceControl when cleaning up aborted trace");
            throw th;
        } catch (Exception e) {
            Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e);
        } catch (Throwable th3) {
            A00(r7);
            throw th3;
        }
    }

    public void BjM(C207229ul r2) {
        try {
            this.A05.BjM(r2);
            if (r2.A0A.exists()) {
                A01(r2);
            }
        } finally {
            A00(r2);
        }
    }

    public void BjN(C207229ul r3, Throwable th) {
        Log.e("Profilo/TraceOrchestrator", "Write exception", th);
        this.A05.BjN(r3, th);
        BjL(r3, 8);
    }

    public void BjO(C207229ul r2) {
        this.A05.BjO(r2);
    }

    public A2W(Context context, C196549a2 r8, File file, C201689k7[] r10) {
        this.A04 = r8;
        this.A08 = null;
        this.A00 = new C198929eQ(context, file);
        this.A07 = new Random();
        this.A05 = new A2V();
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        int i = 0;
        do {
            C201689k7 r1 = r10[i];
            if (r1 instanceof C1693388r) {
                A0I.add(r1);
            } else {
                A0I2.add(r1);
            }
            i++;
        } while (i < 5);
        this.A02 = (C201689k7[]) A0I2.toArray(new C201689k7[A0I2.size()]);
        this.A03 = (C201689k7[]) A0I.toArray(new C201689k7[A0I.size()]);
    }

    public static void A02(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String A0w : list) {
                    File A0w2 = C36441kJ.A0w(file, A0w);
                    if (A0w2.isDirectory()) {
                        A02(A0w2);
                    } else {
                        A0w2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static void A03(File file, String str, ZipOutputStream zipOutputStream) {
        FileInputStream fileInputStream;
        File absoluteFile = C36441kJ.A0w(file, str).getAbsoluteFile();
        URI uri = file.toURI();
        for (String A0w : absoluteFile.list()) {
            File A0w2 = C36441kJ.A0w(absoluteFile, A0w);
            if (A0w2.exists()) {
                String path = uri.relativize(A0w2.toURI()).getPath();
                if (A0w2.isFile()) {
                    try {
                        fileInputStream = new FileInputStream(C36441kJ.A0w(file, path));
                        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                        zipOutputStream.putNextEntry(new ZipEntry(path));
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                    } catch (Throwable th) {
                        zipOutputStream.closeEntry();
                        throw th;
                    }
                } else if (A0w2.isDirectory()) {
                    A03(file, path, zipOutputStream);
                }
            }
        }
        return;
        throw th;
    }
}
