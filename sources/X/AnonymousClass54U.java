package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.54U  reason: invalid class name */
public class AnonymousClass54U extends AnonymousClass1CP {
    public final C19730wQ A00;
    public final C24341Cb A01;
    public final C19630wG A02;
    public final AnonymousClass1CY A03;
    public final C24391Cg A04;
    public final AnonymousClass1CS A05;
    public final C20830yE A06;
    public final AnonymousClass1CQ A07;

    public String A0J() {
        return "wallpaper-v2";
    }

    public ArrayList A0K(File file) {
        ArrayList A062 = AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT14);
        File A0w = C36441kJ.A0w(file, "wallpapers.backup");
        ArrayList A08 = AnonymousClass6YO.A08(A0w, A062);
        File A0w2 = C36441kJ.A0w(file, "Wallpapers");
        if (A0w2.exists()) {
            A08.add(A0w2);
        }
        AnonymousClass6YO.A0E(A0w, A08);
        return A08;
    }

    public boolean A0N(Context context, File file) {
        AnonymousClass5U6 r12;
        FileChannel channel;
        Log.i("wallpaper/v2/restore");
        try {
            String canonicalPath = C36441kJ.A0w(C90514aH.A0j(this.A02), "Wallpapers").getCanonicalPath();
            HashSet B8Z = this.A07.B8Z();
            HashMap A0J = AnonymousClass001.A0J();
            Iterator it = B8Z.iterator();
            while (it.hasNext()) {
                String path = Uri.parse(AnonymousClass001.A0C(it)).getPath();
                if (path != null) {
                    C18740tg.A06(path);
                    File A0S = C90524aI.A0S(path);
                    if (A0S.getCanonicalPath().startsWith(canonicalPath)) {
                        A0J.put(A0S.getName(), A0S);
                    } else {
                        Log.w("wallpaper/v2/restore wallpaper file outside of the wallpaper directory");
                    }
                }
            }
            if (!A0J.isEmpty()) {
                File file2 = file;
                if (file2.isDirectory()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        for (File file3 : listFiles) {
                            File file4 = (File) A0J.get(file3.getName());
                            if (file4 != null) {
                                File parentFile = file4.getParentFile();
                                if (parentFile != null) {
                                    C90474aD.A15(parentFile);
                                }
                                StringBuilder A0u = AnonymousClass000.A0u();
                                C90474aD.A16(file4, "wallpaper/v2/restore/copy ", A0u);
                                C36421kH.A1N(A0u);
                                C36351kA.A1S(A0u, file3.length());
                                try {
                                    WritableByteChannel newChannel = Channels.newChannel(new FileOutputStream(file4, false));
                                    try {
                                        channel = C90524aI.A0U(file3).getChannel();
                                        AnonymousClass6YY.A0K(channel, newChannel);
                                        if (channel != null) {
                                            channel.close();
                                        }
                                        if (newChannel != null) {
                                            newChannel.close();
                                        }
                                    } catch (Throwable th) {
                                        if (newChannel != null) {
                                            newChannel.close();
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    Log.w("wallpaper/v2/restore/ioerror ", e);
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                    }
                } else {
                    try {
                        int A012 = AnonymousClass6YO.A01(file2.getName(), "wallpapers.backup");
                        if (A012 <= 0 || (r12 = AnonymousClass5U6.A02(A012)) == null) {
                            r12 = AnonymousClass5U6.UNENCRYPTED;
                        }
                        AnonymousClass1CS r13 = this.A05;
                        C109765Za.A00(this.A00, (C132716Uy) null, this.A01, this.A01, this.A03, this.A04, this.A04, r12, r13, file2, (Boolean) null).A09(new C164507rv(A0J, 1));
                        return true;
                    } catch (Exception e2) {
                        Log.w("wallpaper/v2/restore/failed ", e2);
                        return true;
                    }
                }
            }
        } catch (IOException e3) {
            Log.e("wallpaper/v2/restore failed", e3);
        }
        return true;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0101, code lost:
        if (r5 == null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r5.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6PN A0O(X.AnonymousClass5U6 r22) {
        /*
            r21 = this;
            r3 = r21
            X.0yE r1 = r3.A06
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x0026
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "wallpaper/v2/backup/sdcard_unavailable "
            r1.append(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C36321k7.A1a(r1, r0)
            java.lang.String r0 = "wallpaper-v2"
            X.6PN r1 = new X.6PN
            r1.<init>(r0)
            return r1
        L_0x0026:
            r8 = 0
            X.1CQ r0 = r3.A07
            java.util.HashSet r1 = r0.B8Z()
            int r0 = r1.size()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x003b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = X.AnonymousClass001.A0C(r2)
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x003b
            java.io.File r1 = X.C90484aE.A0c(r1)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x003b
            r6.add(r1)
            long r0 = r1.length()
            long r8 = r8 + r0
            goto L_0x003b
        L_0x0062:
            r4 = r22
            java.io.File r7 = r3.A0E(r4)
            X.5U6 r0 = X.AnonymousClass5U6.CRYPT14
            java.util.ArrayList r1 = X.AnonymousClass6YO.A06(r0)
            java.lang.String r0 = "wallpapers.backup"
            java.io.File r2 = X.C36441kJ.A0w(r7, r0)
            java.util.ArrayList r5 = X.AnonymousClass6YO.A08(r2, r1)
            java.lang.String r0 = "Wallpapers"
            java.io.File r1 = X.C36441kJ.A0w(r7, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0087
            r5.add(r1)
        L_0x0087:
            X.AnonymousClass6YO.A0E(r2, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "wallpapers.backup.crypt"
            java.io.File r2 = X.AnonymousClass5U6.A03(r3, r4, r0, r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x0098:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.io.File r1 = X.C90504aG.A0a(r5)
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0098
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0098
            X.AnonymousClass6YY.A0Q(r1)
            goto L_0x0098
        L_0x00b2:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "wallpaper/v2/backup/no_wallpaper_to_backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass6YY.A0P(r2)
            r1 = 0
            return r1
        L_0x00c2:
            X.1CS r1 = r3.A05     // Catch:{ Exception -> 0x0113 }
            X.0wQ r10 = r3.A00     // Catch:{ Exception -> 0x0113 }
            X.1CY r14 = r3.A03     // Catch:{ Exception -> 0x0113 }
            X.1Ck r12 = r3.A01     // Catch:{ Exception -> 0x0113 }
            X.1Cb r13 = r3.A01     // Catch:{ Exception -> 0x0113 }
            X.1Cg r0 = r3.A04     // Catch:{ Exception -> 0x0113 }
            X.0yF r15 = r3.A04     // Catch:{ Exception -> 0x0113 }
            r11 = 0
            r17 = r4
            r18 = r1
            r19 = r2
            r20 = r11
            r16 = r0
            X.6QE r1 = X.C109765Za.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0113 }
            X.0wG r0 = r3.A02     // Catch:{ Exception -> 0x0113 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0113 }
            X.7o7 r5 = r1.A06(r0)     // Catch:{ Exception -> 0x0113 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0107 }
        L_0x00eb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0101
            java.io.File r0 = X.C90504aG.A0a(r1)     // Catch:{ all -> 0x0107 }
            if (r5 != 0) goto L_0x00fd
            java.lang.String r0 = "wallpaper/v2/backup failed to create writer"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0107 }
            goto L_0x0119
        L_0x00fd:
            r5.BxY(r0)     // Catch:{ all -> 0x0107 }
            goto L_0x00eb
        L_0x0101:
            if (r5 == 0) goto L_0x0119
            r5.close()     // Catch:{ Exception -> 0x0113 }
            goto L_0x0119
        L_0x0107:
            r1 = move-exception
            if (r5 == 0) goto L_0x0112
            r5.close()     // Catch:{ all -> 0x010e }
            goto L_0x0112
        L_0x010e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0113 }
        L_0x0112:
            throw r1     // Catch:{ Exception -> 0x0113 }
        L_0x0113:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/backup failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0119:
            long r5 = X.C90514aH.A0K(r3, r4)
            java.lang.String r4 = "wallpaper-v2"
            r7 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            X.6PN r1 = new X.6PN
            r1.<init>(r2, r3, r4, r5, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54U.A0O(X.5U6):X.6PN");
    }

    public AnonymousClass54U(C19730wQ r1, C24341Cb r2, C19630wG r3, C20830yE r4, AnonymousClass1CY r5, C24421Cj r6, AnonymousClass1CQ r7, C24391Cg r8, AnonymousClass1CS r9) {
        super(r6);
        this.A02 = r3;
        this.A05 = r9;
        this.A00 = r1;
        this.A03 = r5;
        this.A01 = r2;
        this.A06 = r4;
        this.A07 = r7;
        this.A04 = r8;
    }

    public void A0H(C1042758y r2, double d) {
        r2.A0S = Double.valueOf(d);
    }

    public void A0L(C1042758y r2, double d) {
        r2.A0T = Double.valueOf(d);
    }

    public void A0M(C1042758y r2, double d) {
        r2.A0R = Double.valueOf(d);
    }
}
