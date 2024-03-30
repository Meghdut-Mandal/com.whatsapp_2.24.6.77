package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.54t  reason: invalid class name and case insensitive filesystem */
public final class C1033054t extends C26481Ki {
    public String A00;
    public String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1033054t(C20050ww r9, C19630wG r10, C20810yC r11, AnonymousClass13E r12, C21080yd r13, C19770wU r14) {
        super(r9, r10, r12, r13, r14, 13);
        C36321k7.A1B(r10, r14, r9, r13, r12);
        AnonymousClass00C.A0D(r11, 6);
        int A07 = r11.A07(3427);
        this.A00 = A07;
        this.A01 = A07;
    }

    public boolean A0E(String str, Map map, byte[] bArr) {
        Map map2;
        try {
            URI uri = new URI(this.A01);
            if (uri.getQuery() == null) {
                map2 = C000400e.A0D();
            } else {
                String query = uri.getQuery();
                AnonymousClass00C.A08(query);
                List A0i = C90494aF.A0i(query, "&");
                ArrayList<List> A0I = AnonymousClass001.A0I();
                Iterator it = A0i.iterator();
                while (it.hasNext()) {
                    List A0L = AnonymousClass099.A0L(AnonymousClass001.A0C(it), new String[]{"="}, 2);
                    if (A0L.size() == 2) {
                        if (!(A0L instanceof Collection) || !A0L.isEmpty()) {
                            Iterator it2 = A0L.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (AnonymousClass098.A06(AnonymousClass001.A0C(it2))) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        A0I.add(A0L);
                    }
                }
                int A02 = C000300d.A02(AnonymousClass03U.A06(A0I, 10));
                if (A02 < 16) {
                    A02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A02);
                for (List list : A0I) {
                    linkedHashMap.put(list.get(0), list.get(1));
                }
                map2 = linkedHashMap;
            }
            byte[] decode = Base64.decode(C36431kI.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, map2), 0);
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(C90464aC.A0l(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxj0ym0SqSduZYfRk73qv\nj3WfGfzt76TUqcSDwDURn4Qlw4mMIgmI+WOGASQw8A97Q9SeohkZzL29HPuOPceV\n+pkmBl7LQ+BnyxvifXkohvzITpWFEwkDLlrf4lVSm7mizW8tYq1M+b65TRXFQZPO\nhdowDrdrAwR1K/T+1yppCL1zrE8YOBQf3/gFGrdKRWmGiaq+/5Zf9NKT0b5+FFBu\nP+rKp/t9aMITn9JBOI9OxP6lALyibqgf8Lbe91dT0NZOZKF1Ps5foLBsURVr40v+\nG08E8ovPO7k64OPSW8CUsmlPU0yesEiU99YLMac8oWJAwbjlV/g9SmqmkHLRcq7w\nrwIDAQAB\n", 0)));
            instance.update(bArr);
            return instance.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void A0G(C160427kz r2, String str, String str2) {
        AnonymousClass00C.A0D(str2, 1);
        this.A00 = str2;
        this.A01 = str;
        super.A03(r2, (Object) null, str, (Map) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A0C(java.io.InputStream r17, java.lang.Object r18, java.util.Map r19) {
        /*
            r16 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "commerce_flow_"
            r3.append(r1)
            r2 = r16
            java.lang.String r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)
            java.io.File r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x001a
            X.AnonymousClass6YY.A0P(r0)
        L_0x001a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.io.File r1 = super.A02(r0)
            java.lang.String r0 = X.C1033354w.A0G
            java.io.File r15 = r2.A02(r0)
            r8 = 0
            if (r1 == 0) goto L_0x00d5
            if (r15 == 0) goto L_0x00d5
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00cd }
            r0 = r17
            r5.<init>(r0)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r14 = r1.getCanonicalPath()     // Catch:{ all -> 0x00c6 }
            r7 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r7]     // Catch:{ all -> 0x00c6 }
            r12 = 0
        L_0x0044:
            java.util.zip.ZipEntry r2 = r5.getNextEntry()     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x00c1
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = X.AnonymousClass6YY.A07(r0)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "json"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00b3
            r1 = r14
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00c6 }
            java.io.File r0 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00c6 }
        L_0x0067:
            java.io.File r1 = X.AnonymousClass6YY.A05(r1, r0)     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x00af
            java.io.File r0 = r1.getParentFile()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x0076
            X.C90474aD.A15(r0)     // Catch:{ all -> 0x00c6 }
        L_0x0076:
            r10 = 0
            java.io.FileOutputStream r9 = X.C90524aI.A0W(r1)     // Catch:{ FileNotFoundException -> 0x009e }
        L_0x007c:
            int r1 = r5.read(r6)     // Catch:{ all -> 0x0097 }
            r0 = -1
            if (r1 == r0) goto L_0x0093
            r9.write(r6, r8, r1)     // Catch:{ all -> 0x0097 }
            long r0 = (long) r1     // Catch:{ all -> 0x0097 }
            long r10 = r10 + r0
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 + r10
            r1 = 10485760(0xa00000, double:5.180654E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0093
            goto L_0x007c
        L_0x0093:
            r9.close()     // Catch:{ FileNotFoundException -> 0x009e }
            goto L_0x00a4
        L_0x0097:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ FileNotFoundException -> 0x009e }
            throw r0     // Catch:{ FileNotFoundException -> 0x009e }
        L_0x009e:
            r1 = move-exception
            java.lang.String r0 = "CommerceBloksAssetZipEntrySaver/saveFile"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00c6 }
        L_0x00a4:
            long r12 = r12 + r10
            long r3 = (long) r7     // Catch:{ all -> 0x00c6 }
            long r3 = r3 + r12
            r1 = 15728640(0xf00000, double:7.7709807E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
            goto L_0x00bc
        L_0x00af:
            r2.getName()     // Catch:{ all -> 0x00c6 }
            goto L_0x0044
        L_0x00b3:
            java.lang.String r1 = r15.getCanonicalPath()     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00c6 }
            goto L_0x0067
        L_0x00bc:
            java.lang.String r0 = "CommerceBloksAssetZipEntrySaver/saveInputStream: File being unzipped is too big."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00c6 }
        L_0x00c1:
            r5.close()     // Catch:{ Exception -> 0x00cd }
            r0 = 1
            return r0
        L_0x00c6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ Exception -> 0x00cd }
            throw r0     // Catch:{ Exception -> 0x00cd }
        L_0x00cd:
            r1 = move-exception
            java.lang.String r0 = "CommerceBloksAssetDownloader/unzipBatchBackgrounds"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L_0x00d5:
            java.lang.String r0 = "CommerceBloksAssetDownloader/storeAssets:: Could not prepare resource directory"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1033054t.A0C(java.io.InputStream, java.lang.Object, java.util.Map):boolean");
    }

    public final String A0F(String str) {
        File[] listFiles;
        File A02 = A02(AnonymousClass000.A0p("commerce_flow_", str, AnonymousClass000.A0u()));
        if (A02 == null || (listFiles = A02.listFiles()) == null) {
            return null;
        }
        int i = 0;
        int length = listFiles.length;
        while (i < length) {
            File file = listFiles[i];
            if (AnonymousClass00C.A0J(AnonymousClass6YY.A07(file.getAbsolutePath()), "json")) {
                try {
                    byte[] A002 = AnonymousClass14R.A00(file);
                    AnonymousClass00C.A08(A002);
                    return new String(A002, AnonymousClass0S4.A05);
                } catch (IOException e) {
                    Log.e("CommerceBloksAssetDownloader/readFile/ioerror", e);
                    return null;
                }
            } else {
                i++;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public /* bridge */ /* synthetic */ String A05(Object obj) {
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj, String str) {
    }

    public /* bridge */ /* synthetic */ boolean A0D(Object obj) {
        return false;
    }
}
