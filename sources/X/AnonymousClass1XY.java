package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ConditionVariable;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1XY  reason: invalid class name */
public class AnonymousClass1XY {
    public final C20690y0 A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass1X4 A02;
    public final C19630wG A03;
    public final C18820ts A04;
    public final AnonymousClass1H2 A05;
    public final C20810yC A06;
    public final C25121Fb A07;
    public final AnonymousClass1D5 A08;
    public final C25491Gn A09;
    public final AnonymousClass1Y4 A0A;
    public final AnonymousClass1YL A0B;
    public final C19890wg A0C;
    public final AnonymousClass1HA A0D;
    public final AnonymousClass1YP A0E;
    public final C19770wU A0F;
    public final AnonymousClass1YI A0G;
    public final AnonymousClass185 A0H;
    public final C21060yb A0I;
    public final C19760wT A0J;
    public final C20310xM A0K;
    public final AnonymousClass16J A0L;
    public final C21010yW A0M;
    public final AnonymousClass190 A0N;
    public final C25561Gu A0O;
    public final AnonymousClass1GX A0P;
    public final AnonymousClass005 A0Q;

    public void A05(AnonymousClass2bU r4) {
        C65013Qj r1 = r4.A01;
        if (!r4.A1h() || !(r1 == null || r1.A0I == null)) {
            A06(r4, true, true);
        } else {
            ((C20280xJ) this.A0Q.get()).A01(r4);
        }
        this.A0L.A05(r4, -1);
    }

    public boolean A08(AnonymousClass4UL r17, AnonymousClass3XT r18, AnonymousClass6VQ r19, AnonymousClass3T1 r20, File file, String str, List list, int i, int i2, boolean z) {
        byte[] bArr;
        Log.i("sendmedia/sendmediafile - send video");
        C65013Qj r5 = new C65013Qj();
        File file2 = file;
        r5.A0I = file2;
        if (file == null) {
            return false;
        }
        AnonymousClass6VQ r4 = r19;
        if (r19 == null) {
            bArr = C25541Gs.A04(file2);
        } else {
            Bitmap A012 = C25541Gs.A01(file2);
            if (A012 == null || (!A012.isMutable() && (A012 = A012.copy(Bitmap.Config.ARGB_8888, true)) == null)) {
                bArr = null;
            } else {
                r4.A05(A012, 0, false, false);
                bArr = C25541Gs.A03(A012, 100);
            }
            String str2 = r4.A03;
            if (str2 == null) {
                String A0K2 = AnonymousClass1GW.A0K();
                r5.A0K = A0K2;
                if (!r4.A08(AnonymousClass1GW.A0H(this.A00, A0K2))) {
                    return false;
                }
            } else {
                r5.A0K = str2;
            }
        }
        this.A01.Bp3(new C80893w8(r5, r17, this, r18, r20, str, list, bArr, i, i2, z));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(X.AnonymousClass3XT r26, X.AnonymousClass3T1 r27, X.C25471Gl r28, java.io.File r29, java.lang.String r30, java.util.List r31, int r32, boolean r33, boolean r34, boolean r35) {
        /*
            r25 = this;
            r13 = 0
            r8 = r29
            if (r29 == 0) goto L_0x006d
            r2 = r25
            X.0yC r4 = r2.A06
            X.0ts r7 = r2.A04
            X.17Y r1 = r2.A01
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "MediaFileUtils/checkMediaFileSize src:"
            r3.append(r0)
            java.lang.String r0 = r8.getAbsolutePath()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 3660(0xe4c, float:5.129E-42)
            X.0yV r3 = X.C21000yV.A02
            int r6 = X.C20800yB.A00(r3, r4, r0)
            X.1Gl r0 = X.C25471Gl.A0A
            r5 = r28
            if (r5 != r0) goto L_0x006f
            r0 = 542(0x21e, float:7.6E-43)
        L_0x0035:
            int r6 = X.C20800yB.A00(r3, r4, r0)
        L_0x0039:
            long r11 = r8.length()
            long r3 = (long) r6
            r9 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r3 * r9
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0093
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "MediaFileUtils/checkMediaFileSize/too large:"
            r4.append(r0)
            long r2 = r8.length()
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r12 = 1
            X.1iT r0 = new X.1iT
            r13 = r33
            r8 = r0
            r9 = r7
            r10 = r1
            r11 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r1.A0H(r0)
        L_0x006d:
            r0 = 0
            return r0
        L_0x006f:
            X.1Gl r0 = X.C25471Gl.A0i
            if (r5 != r0) goto L_0x0076
            r0 = 3185(0xc71, float:4.463E-42)
            goto L_0x0035
        L_0x0076:
            X.1Gl r0 = X.C25471Gl.A0X
            if (r5 != r0) goto L_0x007d
            r0 = 4155(0x103b, float:5.822E-42)
            goto L_0x0035
        L_0x007d:
            X.1Gl r0 = X.C25471Gl.A05
            if (r5 == r0) goto L_0x0090
            X.1Gl r0 = X.C25471Gl.A0Q
            if (r5 == r0) goto L_0x0090
            X.1Gl r0 = X.C25471Gl.A04
            if (r5 == r0) goto L_0x008d
            X.1Gl r0 = X.C25471Gl.A0S
            if (r5 != r0) goto L_0x0039
        L_0x008d:
            r0 = 3656(0xe48, float:5.123E-42)
            goto L_0x0035
        L_0x0090:
            r0 = 3657(0xe49, float:5.125E-42)
            goto L_0x0035
        L_0x0093:
            java.lang.String r0 = "SendMedia/sendMediaFile"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r34 != 0) goto L_0x00e3
            r3 = r8
        L_0x009b:
            X.3Qj r14 = new X.3Qj
            r14.<init>()
            r14.A0I = r3
            r7 = 0
            boolean r0 = X.AnonymousClass6Y1.A09(r5)
            if (r0 == 0) goto L_0x00b4
            byte[] r7 = X.C25541Gs.A04(r3)
            if (r7 != 0) goto L_0x00b4
            java.lang.String r0 = "SendMedia/sendMediaFile no video thumbnail generated"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00b4:
            X.1D5 r12 = r2.A08
            int r0 = r5.A00
            r22 = 0
            r20 = r13
            r23 = 0
            r15 = r26
            r16 = r27
            r17 = r30
            r18 = r31
            r24 = r35
            r19 = r13
            r21 = r0
            X.3SC r3 = r12.A04(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r32
            r3.A00 = r0
            r9 = 1
            X.1ia r0 = new X.1ia
            r4 = r0
            r5 = r2
            r6 = r3
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r1.A0H(r0)
            r0 = 1
            return r0
        L_0x00e3:
            X.0y0 r4 = r2.A00
            X.0wg r3 = r2.A0C
            r0 = 0
            java.io.File r3 = X.AnonymousClass1GW.A0F(r4, r3, r5, r8, r0)
            java.lang.String r0 = "SendMedia/sendMediaFile - sending hidden file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A0e(r8, r3)
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XY.A09(X.3XT, X.3T1, X.1Gl, java.io.File, java.lang.String, java.util.List, int, boolean, boolean, boolean):boolean");
    }

    public AnonymousClass33E A02(Uri uri, AnonymousClass3XT r28, AnonymousClass4R0 r29, AnonymousClass3T1 r30, Integer num, String str, List list, List list2, List list3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Uri uri2 = uri;
        Bitmap A0e = this.A0P.A0e(uri2, 100, 100);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A0e.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        A0e.recycle();
        AnonymousClass1D5 r5 = this.A08;
        C65013Qj r7 = new C65013Qj();
        int i4 = 1;
        if (z3) {
            i4 = 42;
        }
        AnonymousClass3T1 r9 = r30;
        AnonymousClass3XT r8 = r28;
        String str2 = str;
        List list4 = list;
        List list5 = list2;
        List list6 = list3;
        int i5 = i;
        AnonymousClass3SC A042 = r5.A04(uri2, r7, r8, r9, str2, list4, list5, list6, i4, i5, i2, z);
        A042.A00 = i3;
        boolean z6 = z4;
        AnonymousClass4R0 r17 = r29;
        boolean z7 = z2;
        Integer num2 = num;
        return AnonymousClass1X4.A03(this.A02, r17, (AnonymousClass2bU) null, A042, num2, (Integer) null, byteArray, z7, z6, z5);
    }

    public void A03(Context context, C225014r r17, AnonymousClass4UL r18, AnonymousClass3XT r19, String str, List list, List list2, int i, int i2, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        Context context2 = context;
        C225014r r3 = r17;
        AnonymousClass4UL r4 = r18;
        AnonymousClass3XT r6 = r19;
        String str2 = str;
        List list3 = list;
        List list4 = list2;
        int i3 = i;
        int i4 = i2;
        boolean z3 = z;
        boolean z4 = z2;
        if (C20800yB.A01(C21000yV.A02, this.A06, 8017)) {
            this.A0F.Boy(new C35581iv(context2, r3, r4, this, r6, str2, hashMap, list4, list3, i3, i4, z3, z4));
        } else {
            A00(context2, r3, r4, this, r6, str2, hashMap, list3, list4, i3, i4, z3, z4);
        }
    }

    public void A04(Uri uri, C225014r r25, AnonymousClass3T1 r26, File file, String str, List list, List list2, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendmedia/send-document jids: ");
        List list3 = list;
        sb.append(Arrays.deepToString(list3.toArray()));
        Log.i(sb.toString());
        C19770wU r1 = this.A0F;
        C20810yC r11 = this.A06;
        AnonymousClass17Y r6 = this.A01;
        C19630wG r9 = this.A03;
        C20690y0 r5 = this.A00;
        C21010yW r12 = this.A0M;
        Uri uri2 = uri;
        C225014r r4 = r25;
        r1.Box(new C50122kF(uri2, r4, r5, r6, this.A02, this.A0I, r9, this.A04, r11, r12, this.A08, r26, this.A0O, this.A0P, file, str, list3, list2, i, z), new Void[0]);
    }

    public void A06(AnonymousClass2bU r3, boolean z, boolean z2) {
        C65013Qj r1;
        if (r3 != null && (r1 = r3.A01) != null) {
            if (z && !r1.A0Q) {
                r1.A0Q = true;
                this.A0K.A0n(r3, -1);
            }
            A07(new AnonymousClass3SC(Collections.singletonList(r3)), z, z2);
        }
    }

    public void A07(AnonymousClass3SC r12, boolean z, boolean z2) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        AnonymousClass3SC r7 = r12;
        CopyOnWriteArrayList copyOnWriteArrayList = r12.A02;
        Iterator it = C007103b.A0Y(copyOnWriteArrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass3T1 r2 = (AnonymousClass3T1) it.next();
            AnonymousClass1Y4 r1 = this.A0A;
            if ((r2 instanceof AnonymousClass2bU) && r1.A04(AnonymousClass1Y4.A00(r1, (AnonymousClass2bU) r2)) != null) {
                arrayList.add(r2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append("sendmedia/retrymediaupload/already-uploading ");
            C64933Qa r13 = ((AnonymousClass3T1) it2.next()).A1J;
            sb.append(r13);
            Log.i(sb.toString());
            r12.A03(r13);
        }
        synchronized (r7) {
            z3 = false;
            if (copyOnWriteArrayList.size() == 0) {
                z3 = true;
            }
        }
        if (z3) {
            Log.i("sendmedia/retrymediaupload/nothing-to-upload");
        } else {
            this.A0F.Boy(new C35311iU(this, r7, 0, z, z2));
        }
    }

    private void A01(C225014r r13, AnonymousClass4UL r14, ArrayList arrayList, List list) {
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            A04(uri, r13, (AnonymousClass3T1) null, (File) null, (String) null, list, (List) null, size, false);
            r14.Bk1(uri);
        }
    }

    public AnonymousClass1XY(C20690y0 r2, AnonymousClass17Y r3, AnonymousClass1X4 r4, AnonymousClass185 r5, C21060yb r6, C19760wT r7, C19630wG r8, C18820ts r9, C20310xM r10, AnonymousClass16J r11, AnonymousClass1H2 r12, C20810yC r13, C21010yW r14, C25121Fb r15, AnonymousClass190 r16, AnonymousClass1D5 r17, C25491Gn r18, AnonymousClass1Y4 r19, AnonymousClass1YL r20, C19890wg r21, AnonymousClass1HA r22, AnonymousClass1YP r23, C25561Gu r24, AnonymousClass1GX r25, C19770wU r26, AnonymousClass1YI r27, AnonymousClass005 r28) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A06 = r13;
        this.A01 = r3;
        this.A03 = r8;
        this.A0F = r26;
        this.A00 = r2;
        this.A0M = r14;
        this.A05 = r12;
        this.A02 = r4;
        this.A0G = r27;
        this.A08 = r17;
        this.A0B = r20;
        this.A0O = r24;
        this.A0P = r25;
        this.A0I = r6;
        this.A04 = r9;
        this.A0K = r10;
        this.A0L = r11;
        this.A09 = r18;
        this.A0Q = r28;
        this.A0H = r5;
        this.A0D = r22;
        this.A07 = r15;
        this.A0A = r19;
        this.A0C = r21;
        this.A0E = r23;
        this.A0J = r7;
        this.A0N = r16;
    }

    public static void A00(Context context, C225014r r36, AnonymousClass4UL r37, AnonymousClass1XY r38, AnonymousClass3XT r39, String str, HashMap hashMap, List list, List list2, int i, int i2, boolean z, boolean z2) {
        C225014r r7;
        AnonymousClass4UL r3;
        AnonymousClass1XY r11;
        AnonymousClass3XT r13;
        String str2;
        List<AnonymousClass11F> list3;
        Uri uri;
        int A002;
        AnonymousClass17Y r5;
        int i3;
        Context context2 = context;
        StringBuilder sb = new StringBuilder();
        sb.append("sendmedia/sendmedia/size=");
        sb.append(list2.size());
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list2.size();
        Iterator it = list2.iterator();
        while (true) {
            r7 = r36;
            r3 = r37;
            r11 = r38;
            r13 = r39;
            str2 = str;
            list3 = list;
            if (!it.hasNext()) {
                break;
            }
            uri = (Uri) it.next();
            Number number = (Number) hashMap.get(uri);
            if (number != null) {
                A002 = number.intValue();
            } else {
                A002 = r11.A09.A00(uri);
            }
            if (A002 != 0) {
                int i4 = i;
                if (A002 != 1) {
                    boolean z3 = z;
                    if (A002 != 2) {
                        if (A002 != 3) {
                            if (A002 == 4) {
                                r11.A0F.Boy(new C35321iV(r11, uri, list3, 3));
                            } else if (A002 != 9) {
                                if (A002 != 13) {
                                    if (!(A002 == 23 || A002 == 37)) {
                                        if (A002 != 82) {
                                        }
                                    }
                                } else if (z2) {
                                    r11.A0P.A0j(uri, r7, new AnonymousClass4Z6(context2, uri, r7, r3, r11, r13, str2, list3, size, 1, z3));
                                }
                            }
                        } else if (z2) {
                            r11.A0P.A0j(uri, r7, new C79243tP(context2, uri, r7, r3, r11, r13, str2, list3, i4, size));
                        }
                        arrayList.add(uri);
                    }
                    r11.A0P.A0j(uri, r7, new AnonymousClass4Z6(context2, uri, r7, r3, r11, r13, str2, list3, size, 0, z3));
                }
                if (z2) {
                    if (uri != null) {
                        try {
                            String str3 = str2;
                            List list4 = list3;
                            r11.A02(uri, r13, (AnonymousClass4R0) null, (AnonymousClass3T1) null, (Integer) null, str3, list4, r11.A0B.A00(uri.getQueryParameter("mentions")), (List) null, i4, 0, size, false, false, false, false, false);
                        } catch (IOException e) {
                            Log.e("sendmedia/sendimages/share-failed/ ", e);
                            if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                                r11.A01.A06(R.string.f12nameremoved, 0);
                            } else {
                                r5 = r11.A01;
                                i3 = R.string.f12nameremoved;
                            }
                        } catch (AnonymousClass1X5 e2) {
                            Log.e("sendmedia/sendimages/share-failed/ ", e2);
                            r5 = r11.A01;
                            i3 = R.string.f12nameremoved;
                        } catch (OutOfMemoryError e3) {
                            Log.e("sendmedia/sendimages/share-failed/ ", e3);
                            r5 = r11.A01;
                            i3 = R.string.f12nameremoved;
                        } catch (SecurityException e4) {
                            Log.e("sendmedia/sendimages/share-failed/ ", e4);
                            r5 = r11.A01;
                            i3 = R.string.f12nameremoved;
                        }
                    }
                    r3.Bk1(uri);
                } else {
                    arrayList.add(uri);
                }
            }
            if (AnonymousClass143.A0N(list3)) {
                Log.e("sendmedia/senddocument/error: Trying to share a document to status");
                r11.A01.A06(R.string.f12nameremoved, 0);
            } else {
                arrayList2.add(uri);
            }
        }
        if (!arrayList.isEmpty()) {
            r11.A01(r7, r3, arrayList2, list3);
            AnonymousClass3FR r4 = new AnonymousClass3FR(context2);
            r4.A0H = arrayList;
            r4.A0F = str2;
            r4.A0G = AnonymousClass143.A07(list3);
            r4.A02 = 5;
            r4.A0N = true;
            if (list3.size() > 1) {
                r4.A0R = true;
            }
            if (AnonymousClass143.A0N(list3) && r39 != null) {
                r4.A0A = r13;
            }
            r4.A04 = i2;
            context2.startActivity(r4.A01());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r3.Bk0((Uri) it2.next());
            }
            return;
        } else if (!arrayList2.isEmpty()) {
            AnonymousClass185 r10 = r11.A0H;
            int size2 = arrayList2.size();
            AnonymousClass00C.A0D(r10, 0);
            AnonymousClass00C.A0D(list3, 2);
            for (AnonymousClass11F A042 : list3) {
                if (!C25571Gv.A04(r10, A042, size2)) {
                    r11.A01(r7, r3, arrayList2, list3);
                    return;
                }
            }
            Uri uri2 = (Uri) arrayList2.get(0);
            Intent putExtra = new Intent().setClassName(context2.getPackageName(), "com.whatsapp.documentpicker.DocumentPreviewActivity").putExtra("jids", AnonymousClass143.A07(list3)).putExtra("uri", uri2).putExtra("send", true ^ r3.B2N());
            if (context2 instanceof Activity) {
                ((Activity) context2).startActivityForResult(putExtra, 36);
            }
            r3.Bk0(uri2);
            return;
        } else if (list3.size() > 1) {
            context2.startActivity(AnonymousClass190.A03(context2));
            return;
        } else {
            return;
        }
        r5.A04(i3, 0);
        r3.Bk1(uri);
    }
}
