package X;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1bS  reason: invalid class name and case insensitive filesystem */
public class C31211bS {
    public C19460v5 A00;
    public final AnonymousClass1VX A01;
    public final C20690y0 A02;
    public final C19730wQ A03;
    public final C29301Wc A04;
    public final AnonymousClass179 A05;
    public final C21060yb A06;
    public final C19630wG A07;
    public final C19420v0 A08;
    public final C236419g A09;
    public final C31161bN A0A;
    public final AnonymousClass005 A0B;
    public final C19460v5 A0C;
    public final AnonymousClass130 A0D;
    public final AnonymousClass1N4 A0E;
    public final C19700wN A0F;
    public final AnonymousClass19J A0G;
    public final AnonymousClass1RU A0H;
    public final AnonymousClass18U A0I;
    public final WfalManager A0J;
    public final C27631Pa A0K;
    public final AnonymousClass1Pd A0L;
    public final C27661Pe A0M;
    public final C19600wD A0N;
    public final AnonymousClass185 A0O;
    public final C20830yE A0P;
    public final AnonymousClass12P A0Q;
    public final C219612i A0R;
    public final AnonymousClass13S A0S;
    public final C20810yC A0T;
    public final C25781Hq A0U;
    public final C20840yF A0V;
    public final AnonymousClass1GE A0W;
    public final C236919l A0X;
    public final AnonymousClass1EV A0Y;
    public final AnonymousClass13I A0Z;
    public final C31201bR A0a;
    public final AnonymousClass1CR A0b;
    public final AnonymousClass16P A0c;
    public final C20020wt A0d;
    public final AnonymousClass1UM A0e;
    public final C28781Ua A0f;

    public String A06(String str) {
        ArrayList latestLogs = Log.getLatestLogs(1);
        if (latestLogs.size() < 1) {
            Log.e("debug-builder/upload-logs no logs found to be uploaded.");
        } else {
            Pair A022 = AnonymousClass6YY.A02(this.A0V, (File) latestLogs.get(0), 8388608, 41943040);
            boolean booleanValue = ((Boolean) A022.first).booleanValue();
            File file = (File) A022.second;
            if (file != null) {
                String A012 = A01(this, file, str, false);
                if (booleanValue) {
                    file.delete();
                }
                return A012;
            }
        }
        return null;
    }

    public static String A01(C31211bS r16, File file, String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        ConditionVariable conditionVariable = new ConditionVariable();
        C31211bS r1 = r16;
        C75303n0 r13 = new C75303n0(conditionVariable, r1, stringBuffer);
        try {
            File file2 = file;
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                AnonymousClass6VO A002 = r1.A0W.A00(r13, "https://crashlogs.whatsapp.net/wa_clb_data", (String) null, 6, false);
                A002.A07("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
                int i = 2;
                if (z) {
                    i = 1;
                }
                try {
                    A002.A0C.add(new C123825x9(fileInputStream, "file", file2.getName(), i, 0, file2.length()));
                    A002.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "support");
                    C19700wN r5 = r1.A0F;
                    A002.A07("from_jid", r5.A0A());
                    A002.A07("forced", "true");
                    A002.A07("android_hprof_extras", r5.A0B((String) null));
                    String str2 = str;
                    if (str != null) {
                        A002.A07("ticket_id", str2);
                    }
                    A002.A04((C1265864p) null);
                    fileInputStream.close();
                    conditionVariable.block(100000);
                    if (stringBuffer.length() == 0) {
                        return null;
                    }
                    return stringBuffer.toString();
                } catch (Throwable th) {
                    th = th;
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream.close();
                throw th;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("debug-builder/uploadLogsInternal/error-uploading-logs exception:");
            sb.append(e);
            Log.e(sb.toString());
            return null;
        }
    }

    public static void A02(Object obj, Object obj2, String str) {
        if (obj2 instanceof JSONObject) {
            try {
                ((JSONObject) obj2).put(str, obj);
            } catch (JSONException e) {
                Log.e("debug-builder/json/error ", e);
            }
        } else if (obj2 instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) obj2;
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static boolean A03(File file) {
        if (!new File(file, ".nomedia").exists()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("debug-builder/unexpected .nomedia in ");
        sb.append(file.getName());
        Log.w(sb.toString());
        return true;
    }

    public File A04(File file, int i, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        File file2;
        BufferedInputStream bufferedInputStream;
        if (z) {
            arrayList = Log.getLatestLogs(i);
        } else {
            arrayList = new ArrayList();
        }
        if (file != null) {
            arrayList.add(file);
        }
        if (z2) {
            File[] A012 = AnonymousClass11c.A01(this.A07);
            if (A012.length > 0) {
                Collections.addAll(arrayList, A012);
            } else {
                Log.w("debug-builder/getZippedInfoFiles no ANR traces to send");
            }
        }
        if (arrayList.size() != 0) {
            if (z3) {
                file2 = this.A02.A0W("logs");
            } else {
                file2 = this.A05.A07("logs.zip");
            }
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                try {
                    byte[] bArr = new byte[16384];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file3 = (File) it.next();
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file3), 16384);
                            zipOutputStream.putNextEntry(new ZipEntry(file3.getName()));
                            while (true) {
                                int read = bufferedInputStream.read(bArr, 0, 16384);
                                if (read == -1) {
                                    break;
                                }
                                zipOutputStream.write(bArr, 0, read);
                            }
                            bufferedInputStream.close();
                        } catch (IOException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("debug-builder/cant zip file ");
                            sb.append(file3.getName());
                            Log.e(sb.toString(), e);
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                    zipOutputStream.close();
                    return file2;
                } catch (Throwable th2) {
                    zipOutputStream.close();
                    throw th2;
                }
            } catch (IOException e2) {
                Log.e("debug-builder/zip ", e2);
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        }
        return null;
        throw th;
    }

    public void A07() {
        Log.e("app-state: APP STATE DEBUG INFO BEGIN");
        for (AnonymousClass4UH BOc : (Set) this.A0B.get()) {
            BOc.BOc("app-state");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder sb = new StringBuilder();
            sb.append("app-state/auth-keystore-result:");
            sb.append(this.A0D.A0D().A00);
            Log.i(sb.toString());
        }
        AnonymousClass13S r1 = this.A0S;
        AnonymousClass12P r5 = r1.A05;
        r5.A06();
        if (r5.A08) {
            AnonymousClass1M0 A042 = r5.get();
            try {
                C225614x it = r1.A06.A00().values().iterator();
                while (it.hasNext()) {
                    C227415p r2 = (C227415p) it.next();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("app-state");
                    sb2.append("/db-migration-status/");
                    sb2.append(r2.A05);
                    sb2.append(":");
                    sb2.append(r2.A01());
                    Log.i(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("app-state");
                sb3.append("/db-migration-status-overall: true");
                Log.i(sb3.toString());
                r5.A06();
                if (r5.A02.A00 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("app-state");
                    sb4.append("/");
                    sb4.append("message_view");
                    sb4.append(":");
                    C224114e r4 = A042.A02;
                    C18740tg.A06(r4);
                    sb4.append(C224614k.A00(r4, "view", "message_view"));
                    Log.i(sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("app-state");
                    sb5.append("/");
                    sb5.append("available_message_view");
                    sb5.append(":");
                    C18740tg.A06(r4);
                    sb5.append(C224614k.A00(r4, "view", "available_message_view"));
                    Log.i(sb5.toString());
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("app-state");
                    sb6.append("/");
                    sb6.append("deleted_messages_view");
                    sb6.append(":");
                    C18740tg.A06(r4);
                    sb6.append(C224614k.A00(r4, "view", "deleted_messages_view"));
                    Log.i(sb6.toString());
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("app-state");
                    sb7.append("/");
                    sb7.append("deleted_messages_ids_view");
                    sb7.append(":");
                    C18740tg.A06(r4);
                    sb7.append(C224614k.A00(r4, "view", "deleted_messages_ids_view"));
                    Log.i(sb7.toString());
                }
                A042.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("app-state");
            sb8.append("/db-migration-status-not-ready");
            Log.i(sb8.toString());
        }
        Log.e("app-state: APP STATE DEBUG INFO END");
    }

    public C31211bS(C19460v5 r2, C19460v5 r3, AnonymousClass130 r4, AnonymousClass1VX r5, AnonymousClass1N4 r6, C19700wN r7, C20690y0 r8, C19730wQ r9, AnonymousClass19J r10, AnonymousClass1RU r11, AnonymousClass18U r12, C29301Wc r13, WfalManager wfalManager, C27631Pa r15, AnonymousClass1Pd r16, C27661Pe r17, C19600wD r18, AnonymousClass185 r19, AnonymousClass179 r20, C21060yb r21, C19630wG r22, C20830yE r23, C19420v0 r24, AnonymousClass12P r25, C219612i r26, C236419g r27, AnonymousClass13S r28, C20810yC r29, C25781Hq r30, C20840yF r31, AnonymousClass1GE r32, C236919l r33, AnonymousClass1EV r34, AnonymousClass13I r35, C31201bR r36, AnonymousClass1CR r37, AnonymousClass16P r38, C31161bN r39, C20020wt r40, AnonymousClass1UM r41, C28781Ua r42, AnonymousClass005 r43) {
        this.A07 = r22;
        this.A0T = r29;
        this.A0F = r7;
        this.A03 = r9;
        this.A0d = r40;
        this.A02 = r8;
        this.A05 = r20;
        this.A0A = r39;
        this.A0D = r4;
        this.A0Z = r35;
        this.A04 = r13;
        this.A0f = r42;
        this.A0I = r12;
        this.A06 = r21;
        this.A0H = r11;
        this.A0e = r41;
        this.A0E = r6;
        this.A0G = r10;
        this.A0b = r37;
        this.A0X = r33;
        this.A0R = r26;
        this.A01 = r5;
        this.A0Q = r25;
        this.A0O = r19;
        this.A0P = r23;
        this.A08 = r24;
        this.A0B = r43;
        this.A0L = r16;
        this.A0Y = r34;
        this.A0a = r36;
        this.A0K = r15;
        this.A09 = r27;
        this.A0W = r32;
        this.A0S = r28;
        this.A0N = r18;
        this.A0C = r2;
        this.A0M = r17;
        this.A0V = r31;
        this.A0c = r38;
        this.A0J = wfalManager;
        this.A0U = r30;
        this.A00 = r3;
    }

    public static File A00(Context context, String str) {
        FileOutputStream fileOutputStream;
        File file = new File(context.getFilesDir(), "debuginfo.json");
        if (!file.exists() || file.delete()) {
            try {
                fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(str.getBytes());
                fileOutputStream.close();
                return file;
            } catch (IOException e) {
                Log.e("debug-builder/infofile/skip", e);
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Log.e("debug-builder/infofile/error");
            return null;
        }
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(125:0|1|2|(1:4)|(1:6)(3:7|(1:9)|(1:11)(2:12|(1:14)(1:15)))|16|(1:18)(2:23|24)|19|(2:21|(2:25|(1:27)(1:28))(2:29|(1:31)))|32|33|34|(5:38|(2:40|477)(1:476)|475|36|35)|41|42|43|44|(4:47|(1:480)(2:49|(2:51|481)(2:52|(2:54|483)(1:482)))|478|45)|479|(1:56)|57|(1:59)|60|(1:62)|63|(2:66|64)|484|67|(2:70|68)|485|(5:72|(1:74)(1:89)|75|(2:77|(1:81))|82)|83|(2:85|(2:87|88))|90|(4:92|(3:94|(2:97|95)|486)|98|(3:100|(3:102|(2:105|103)|487)|106))(1:107)|108|(1:110)|111|(5:112|113|(1:115)|116|(1:118))|123|124|125|126|127|(1:129)|130|(1:132)|133|(1:135)(1:139)|136|(2:138|140)|(1:142)|143|(1:145)(1:146)|147|(1:149)|150|151|(7:153|154|(1:156)(1:158)|157|(1:160)|161|(7:163|(1:165)(2:167|(9:169|(1:171)|488|172|(1:174)|489|(4:176|(3:178|(2:180|493)(2:181|492)|182)|491|183)|490|184))|166|185|186|187|(8:190|191|(1:193)(1:195)|194|(2:197|(1:208)(2:203|(1:207)))|209|(1:211)(1:212)|213)))|214|(2:216|232)(3:217|(5:219|(1:221)|222|(6:224|(1:226)|227|(1:229)|230|495)(1:496)|231)|494)|233|(1:235)|236|(1:238)|239|(1:241)|242|(1:244)|245|(1:249)|250|(16:252|(1:254)|255|(1:257)|258|(1:260)|261|(1:263)|264|(1:266)|267|(1:269)|271|272|(1:274)(1:276)|275)|277|(1:279)|280|281|(2:283|(2:285|(3:287|288|289))(1:290))(1:291)|292|(2:294|295)|296|(2:298|(3:302|(2:305|303)|497))|306|(2:308|(2:310|313)(1:311))(1:312)|(1:315)(1:316)|317|(1:319)|320|(1:322)|324|325|(1:327)(2:329|(1:331)(1:332))|328|(7:334|(1:336)(2:343|(1:345)(1:346))|337|(1:339)|340|(2:342|(2:348|350))(1:349)|351)|352|(1:(2:355|(2:357|361)(1:358))(1:359))(1:360)|362|(1:(2:365|(2:367|371)(1:368))(1:369))(1:370)|372|(3:376|(1:378)(1:395)|379)|380|(2:388|(21:392|(1:394)|397|(2:400|398)|498|401|(1:403)|(4:405|(2:408|406)|499|409)|410|(1:414)|415|(1:421)|422|(2:423|(2:425|(1:500)(2:501|429))(2:502|430))|431|(1:433)|(4:435|(1:437)(2:442|(1:447)(1:446))|438|(1:440))|441|(1:449)|471|472))|396|397|(1:398)|498|401|(0)|(0)|410|412|414|415|417|421|422|(3:423|(0)(0)|500)|431|(0)|(0)|441|(0)|471|472|(1:(1:457))) */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05e7, code lost:
        if (r1 != 2) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06e5, code lost:
        if (r8 == false) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x09dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x09e2, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x09e3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09ea, code lost:
        X.C18740tg.A0A(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x09f2, code lost:
        com.whatsapp.util.Log.e("exception during email composition", r1);
        r5.A0F.A0E("Exception building debug info", r1.getMessage(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a02, code lost:
        return "";
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:126:0x0321, B:459:0x09d9] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x0321 */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0327 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0332 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0346 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0361 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0362 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0368 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0373 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0375 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x037f A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0397 A[SYNTHETIC, Splitter:B:153:0x0397] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04cf A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04d0 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0553 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0562 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x057e A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x058f A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05b1 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x05fb A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0639 A[Catch:{ all -> 0x09dd, Exception -> 0x09e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0643 A[SYNTHETIC, Splitter:B:294:0x0643] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0654 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0688 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0699 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x069f A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06b5 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06d3 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x06e0 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0710 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x072b A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0742 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x07d4 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07e0 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07f2 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x07fe A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0829 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x088c A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x088d A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08a7 A[Catch:{ Exception -> 0x09e5 }, LOOP:12: B:398:0x08a1->B:400:0x08a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x08bf A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x08d2 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x093e A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0968 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x097b A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x09c0 A[Catch:{ Exception -> 0x09e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x09ea  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x09f2  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0958 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A05(android.content.Context r36, android.util.Pair r37, X.AnonymousClass147 r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.List r43, java.util.List r44, org.json.JSONObject r45, long r46, long r48, boolean r50, boolean r51, boolean r52) {
        /*
            r35 = this;
            java.lang.String r26 = "%s:%s"
            java.lang.String r16 = ""
            java.lang.StringBuilder r17 = new java.lang.StringBuilder
            r17.<init>()
            r5 = r35
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss.SSSZ"
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x09e2 }
            java.text.SimpleDateFormat r19 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x09e2 }
            r0 = r19
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x09e2 }
            X.0v0 r0 = r5.A08     // Catch:{ Exception -> 0x09e2 }
            r32 = r0
            java.lang.String r9 = r32.A0f()     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r8 = r32.A0h()     // Catch:{ Exception -> 0x09e2 }
            X.19J r2 = r5.A0G     // Catch:{ Exception -> 0x09e2 }
            int r1 = r2.A04     // Catch:{ Exception -> 0x09e2 }
            r7 = 2
            r0 = 0
            if (r1 != r7) goto L_0x002b
            r0 = 1
        L_0x002b:
            if (r0 == 0) goto L_0x0030
            java.lang.String r3 = "UP"
            goto L_0x0046
        L_0x0030:
            int r1 = r2.A04     // Catch:{ Exception -> 0x09e2 }
            r0 = 1
            if (r1 == r0) goto L_0x0036
            r0 = 0
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            java.lang.String r3 = "SC/XC"
            goto L_0x0046
        L_0x003b:
            X.13I r0 = r5.A0Z     // Catch:{ Exception -> 0x09e2 }
            boolean r0 = r0.A00     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x0044
            java.lang.String r3 = "PW"
            goto L_0x0046
        L_0x0044:
            java.lang.String r3 = "DN"
        L_0x0046:
            java.lang.String r18 = ")"
            java.lang.String r15 = " ("
            java.lang.String r2 = "Not Calculated"
            r10 = -1
            r0 = r48
            int r4 = (r48 > r10 ? 1 : (r48 == r10 ? 0 : -1))
            r34 = r36
            if (r4 != 0) goto L_0x0066
            r12 = r2
        L_0x0057:
            r0 = r46
            int r4 = (r46 > r10 ? 1 : (r46 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x00cf
            r10 = -2
            int r2 = (r46 > r10 ? 1 : (r46 == r10 ? 0 : -1))
            r4 = r42
            if (r2 != 0) goto L_0x0095
            goto L_0x0088
        L_0x0066:
            java.lang.String r4 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r6.<init>()     // Catch:{ Exception -> 0x09e2 }
            r6.append(r4)     // Catch:{ Exception -> 0x09e2 }
            r6.append(r15)     // Catch:{ Exception -> 0x09e2 }
            r4 = r34
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r4, r0)     // Catch:{ Exception -> 0x09e2 }
            r6.append(r0)     // Catch:{ Exception -> 0x09e2 }
            r0 = r18
            r6.append(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r12 = r6.toString()     // Catch:{ Exception -> 0x09e2 }
            goto L_0x0057
        L_0x0088:
            java.lang.String r0 = "removed"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r2 = "Not present"
            goto L_0x00cf
        L_0x0093:
            r2 = r4
            goto L_0x00cf
        L_0x0095:
            java.lang.String r2 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r6.<init>()     // Catch:{ Exception -> 0x09e2 }
            r6.append(r2)     // Catch:{ Exception -> 0x09e2 }
            r6.append(r15)     // Catch:{ Exception -> 0x09e2 }
            r2 = r34
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r2, r0)     // Catch:{ Exception -> 0x09e2 }
            r6.append(r0)     // Catch:{ Exception -> 0x09e2 }
            r0 = r18
            r6.append(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x00cf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r0.<init>()     // Catch:{ Exception -> 0x09e2 }
            r0.append(r2)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = " (read-only)"
            r0.append(r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x09e2 }
        L_0x00cf:
            X.185 r0 = r5.A0O     // Catch:{ Exception -> 0x09e2 }
            X.16p r0 = r0.A01     // Catch:{ Exception -> 0x09e2 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x09e2 }
            r10.<init>()     // Catch:{ Exception -> 0x09e2 }
            X.16r r0 = r0.A00     // Catch:{ Exception -> 0x09e2 }
            X.1M0 r6 = r0.get()     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r4 = X.C56732wn.A00     // Catch:{ all -> 0x09d8 }
            r1 = 0
            java.lang.String r0 = "CONTACT_VNAMES"
            android.database.Cursor r4 = X.C229416o.A03(r6, r4, r0, r1)     // Catch:{ all -> 0x09d8 }
        L_0x00e7:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x09cc }
            if (r0 == 0) goto L_0x00f7
            X.3L0 r0 = X.C53732rn.A00(r4)     // Catch:{ all -> 0x09cc }
            if (r0 == 0) goto L_0x00e7
            r10.add(r0)     // Catch:{ all -> 0x09cc }
            goto L_0x00e7
        L_0x00f7:
            r4.close()     // Catch:{ all -> 0x09d8 }
            r6.close()     // Catch:{ Exception -> 0x09e2 }
            java.util.Iterator r4 = r10.iterator()     // Catch:{ Exception -> 0x09e2 }
            r14 = 0
            r13 = 0
        L_0x0103:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x0125
            java.lang.Object r1 = r4.next()     // Catch:{ Exception -> 0x09e2 }
            X.3L0 r1 = (X.AnonymousClass3L0) r1     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = r1.A07     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r1.A02()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x011c
            int r14 = r14 + 1
            goto L_0x0103
        L_0x011c:
            boolean r0 = r1.A01()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x0103
            int r13 = r13 + 1
            goto L_0x0103
        L_0x0125:
            if (r50 != 0) goto L_0x0133
            java.lang.String r1 = "\n\n\n\n"
            r0 = r17
            r0.append(r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "--Support Info--\n"
            r0.append(r1)     // Catch:{ Exception -> 0x09e2 }
        L_0x0133:
            org.json.JSONObject r20 = new org.json.JSONObject     // Catch:{ Exception -> 0x09e2 }
            r20.<init>()     // Catch:{ Exception -> 0x09e2 }
            r6 = r17
            if (r50 == 0) goto L_0x013e
            r6 = r20
        L_0x013e:
            r1 = r45
            if (r45 == 0) goto L_0x0147
            java.lang.String r0 = "Calling debug info"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x0147:
            X.37W r4 = new X.37W     // Catch:{ Exception -> 0x09e2 }
            r1 = r51
            r0 = r34
            r4.<init>(r0, r1)     // Catch:{ Exception -> 0x09e2 }
            X.005 r0 = r5.A0B     // Catch:{ Exception -> 0x09e2 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x09e2 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x09e2 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x09e2 }
        L_0x015c:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x016c
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x09e2 }
            X.4UH r0 = (X.AnonymousClass4UH) r0     // Catch:{ Exception -> 0x09e2 }
            r0.BOg(r4)     // Catch:{ Exception -> 0x09e2 }
            goto L_0x015c
        L_0x016c:
            java.util.Map r0 = r4.A01     // Catch:{ Exception -> 0x09e2 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x09e2 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x09e2 }
        L_0x0176:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x0190
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x09e2 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x09e2 }
            java.lang.Object r4 = r0.getKey()     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x09e2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r4)     // Catch:{ Exception -> 0x09e2 }
            goto L_0x0176
        L_0x0190:
            if (r51 != 0) goto L_0x01ed
            java.lang.String r11 = "Debug info"
            X.0wQ r10 = r5.A03     // Catch:{ Exception -> 0x09e2 }
            r10.A0G()     // Catch:{ Exception -> 0x09e2 }
            com.whatsapp.jid.PhoneUserJid r4 = r10.A03     // Catch:{ Exception -> 0x09e2 }
            if (r4 == 0) goto L_0x0266
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r1.<init>()     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "+"
            r1.append(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = r4.user     // Catch:{ Exception -> 0x09e2 }
            r1.append(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x09e2 }
        L_0x01b0:
            X.1VX r0 = r5.A01     // Catch:{ Exception -> 0x09e2 }
            boolean r0 = r0.A02()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x01ea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r1.<init>()     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "chnum "
            r1.append(r0)     // Catch:{ Exception -> 0x09e2 }
            r1.append(r4)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x09e2 }
            com.whatsapp.Me r0 = r10.A05()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x01ea
            java.lang.String r1 = r0.jabber_id     // Catch:{ Exception -> 0x09e2 }
            if (r1 == 0) goto L_0x01ea
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r0.<init>()     // Catch:{ Exception -> 0x09e2 }
            r0.append(r4)     // Catch:{ Exception -> 0x09e2 }
            r0.append(r15)     // Catch:{ Exception -> 0x09e2 }
            r0.append(r1)     // Catch:{ Exception -> 0x09e2 }
            r1 = r18
            r0.append(r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r4 = r0.toString()     // Catch:{ Exception -> 0x09e2 }
        L_0x01ea:
            A02(r4, r6, r11)     // Catch:{ Exception -> 0x09e2 }
        L_0x01ed:
            java.lang.String r1 = "MDEnabled"
            X.19l r0 = r5.A0X     // Catch:{ Exception -> 0x09e2 }
            X.0v0 r0 = r0.A01     // Catch:{ Exception -> 0x09e2 }
            boolean r0 = r0.A2H()     // Catch:{ Exception -> 0x09e2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "HasMdCompanion"
            X.19g r0 = r5.A09     // Catch:{ Exception -> 0x09e2 }
            r31 = r0
            java.util.ArrayList r0 = r31.A09()     // Catch:{ Exception -> 0x09e2 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x09e2 }
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "Context"
            r33 = r39
            r0 = r33
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "useragent"
            X.0wt r0 = r5.A0d     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = r0.A02()     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "Socket Conn"
            A02(r3, r6, r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "Free Space Built-In"
            A02(r12, r6, r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "Free Space Removable"
            A02(r2, r6, r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "Smb count"
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "Ent count"
            java.lang.String r0 = java.lang.Integer.toString(r13)     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            X.0v5 r1 = r5.A0C     // Catch:{ Exception -> 0x09e2 }
            boolean r0 = r1.A05()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x026a
            X.12P r0 = r5.A0Q     // Catch:{ Exception -> 0x09e2 }
            r0.A06()     // Catch:{ Exception -> 0x09e2 }
            boolean r0 = r0.A08     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x026a
            r1.A02()     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "getAwayState"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x09e2 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x09e2 }
            throw r0     // Catch:{ Exception -> 0x09e2 }
        L_0x0266:
            java.lang.String r4 = "unregistered"
            goto L_0x01b0
        L_0x026a:
            X.0yb r0 = r5.A06     // Catch:{ Exception -> 0x09e2 }
            r30 = r0
            android.net.ConnectivityManager r27 = r30.A0E()     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r3 = "Connection"
            X.0wD r0 = r5.A0N     // Catch:{ Exception -> 0x09e2 }
            r29 = r0
            X.1M8 r10 = r29.A04()     // Catch:{ Exception -> 0x09e2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r4.<init>()     // Catch:{ Exception -> 0x09e2 }
            if (r10 == 0) goto L_0x02c6
            java.lang.String r2 = r10.A02     // Catch:{ Exception -> 0x09e2 }
            if (r2 == 0) goto L_0x029d
            r1 = 0
        L_0x0288:
            int r0 = r2.length()     // Catch:{ Exception -> 0x09e2 }
            if (r1 >= r0) goto L_0x029d
            char r0 = r2.charAt(r1)     // Catch:{ Exception -> 0x09e2 }
            r4.append(r0)     // Catch:{ Exception -> 0x09e2 }
            r0 = 46
            r4.append(r0)     // Catch:{ Exception -> 0x09e2 }
            int r1 = r1 + 1
            goto L_0x0288
        L_0x029d:
            java.lang.String r2 = r10.A01     // Catch:{ Exception -> 0x09e2 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x09e2 }
            if (r0 != 0) goto L_0x02cb
            r4.append(r15)     // Catch:{ Exception -> 0x09e2 }
            if (r2 == 0) goto L_0x02c0
            r1 = 0
        L_0x02ab:
            int r0 = r2.length()     // Catch:{ Exception -> 0x09e2 }
            if (r1 >= r0) goto L_0x02c0
            char r0 = r2.charAt(r1)     // Catch:{ Exception -> 0x09e2 }
            r4.append(r0)     // Catch:{ Exception -> 0x09e2 }
            r0 = 46
            r4.append(r0)     // Catch:{ Exception -> 0x09e2 }
            int r1 = r1 + 1
            goto L_0x02ab
        L_0x02c0:
            r0 = 41
            r4.append(r0)     // Catch:{ Exception -> 0x09e2 }
            goto L_0x02cb
        L_0x02c6:
            java.lang.String r0 = "NONE"
            r4.append(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x02cb:
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r3)     // Catch:{ Exception -> 0x09e2 }
            r1 = r40
            if (r40 == 0) goto L_0x02db
            java.lang.String r0 = "Server"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x02db:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r3.<init>()     // Catch:{ Exception -> 0x09e2 }
            X.1bN r2 = r5.A0A     // Catch:{ Exception -> 0x0312 }
            r1 = 0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0312 }
            X.1bO r4 = r2.A01(r0, r1)     // Catch:{ Exception -> 0x0312 }
            java.util.Set r2 = r4.A00     // Catch:{ Exception -> 0x0312 }
            r1 = 32
            if (r2 == 0) goto L_0x02fe
            java.lang.String r0 = "TK-NP-"
            r3.append(r0)     // Catch:{ Exception -> 0x0312 }
            int r0 = r2.size()     // Catch:{ Exception -> 0x0312 }
            r3.append(r0)     // Catch:{ Exception -> 0x0312 }
            r3.append(r1)     // Catch:{ Exception -> 0x0312 }
        L_0x02fe:
            java.util.Set r2 = r4.A01     // Catch:{ Exception -> 0x0312 }
            if (r2 == 0) goto L_0x0317
            java.lang.String r0 = "TK-NS-"
            r3.append(r0)     // Catch:{ Exception -> 0x0312 }
            int r0 = r2.size()     // Catch:{ Exception -> 0x0312 }
            r3.append(r0)     // Catch:{ Exception -> 0x0312 }
            r3.append(r1)     // Catch:{ Exception -> 0x0312 }
            goto L_0x0317
        L_0x0312:
            java.lang.String r0 = "TK-FG-0 "
            r3.append(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x0317:
            java.lang.String r0 = "org.acra.ACRA"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0321 }
            java.lang.String r0 = "NW-WAP-1 "
            r3.append(r0)     // Catch:{ ClassNotFoundException -> 0x0321 }
        L_0x0321:
            boolean r0 = X.C18750th.A0F(r30)     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x032c
            java.lang.String r0 = "DC-RTED "
            r3.append(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x032c:
            boolean r0 = X.C18750th.A0B()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x0337
            java.lang.String r0 = "DC-BACRM "
            r3.append(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x0337:
            java.lang.String r0 = "FE-GDE "
            r3.append(r0)     // Catch:{ Exception -> 0x09e2 }
            X.0wG r2 = r5.A07     // Catch:{ Exception -> 0x09e2 }
            android.content.Context r1 = r2.A00     // Catch:{ Exception -> 0x09e2 }
            boolean r0 = X.C34191gb.A08(r1)     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x0362
            java.lang.String r0 = "FE-GDC "
            r3.append(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "debug-builder/generate-diagnostics/gdrive-capable"
        L_0x034d:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "FE-VIDC "
            r3.append(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "debug-builder/generate-diagnostics/video-call-capable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x09e2 }
            int r1 = X.C34201gc.A00(r1)     // Catch:{ Exception -> 0x09e2 }
            r0 = 0
            if (r1 != 0) goto L_0x0366
            goto L_0x0365
        L_0x0362:
            java.lang.String r0 = "debug-builder/generate-diagnostics/gdrive-not-capable"
            goto L_0x034d
        L_0x0365:
            r0 = 1
        L_0x0366:
            if (r0 == 0) goto L_0x036d
            java.lang.String r0 = "FE-SMSRTV "
            r3.append(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x036d:
            int r0 = r3.length()     // Catch:{ Exception -> 0x09e2 }
            if (r0 != 0) goto L_0x0375
            r1 = 0
            goto L_0x0379
        L_0x0375:
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x09e2 }
        L_0x0379:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x09e2 }
            if (r0 != 0) goto L_0x0384
            java.lang.String r0 = "Diagnostic Codes"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x0384:
            android.telephony.TelephonyManager r25 = r30.A0K()     // Catch:{ Exception -> 0x09e2 }
            X.0wQ r0 = r5.A03     // Catch:{ Exception -> 0x09e2 }
            r28 = r0
            r28.A0G()     // Catch:{ Exception -> 0x09e2 }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r24 = "unknown"
            r21 = r24
            if (r0 != 0) goto L_0x04c3
            X.0yE r1 = r5.A0P     // Catch:{ Exception -> 0x09e2 }
            r0 = r30
            java.lang.String r2 = X.AnonymousClass3SI.A01(r0, r2, r1)     // Catch:{ Exception -> 0x09e2 }
            if (r25 == 0) goto L_0x03b9
            int r0 = r25.getSimState()     // Catch:{ Exception -> 0x09e2 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x03a9:
            java.lang.String r3 = "Sim"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r1.<init>()     // Catch:{ Exception -> 0x09e2 }
            r1.append(r2)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ Exception -> 0x09e2 }
            goto L_0x03bb
        L_0x03b9:
            r4 = 0
            goto L_0x03a9
        L_0x03bb:
            if (r4 != 0) goto L_0x03bf
            r4 = r16
        L_0x03bf:
            r1.append(r4)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r3)     // Catch:{ Exception -> 0x09e2 }
            if (r2 == 0) goto L_0x04c3
            java.lang.String r1 = "\\D"
            r0 = r16
            java.lang.String r10 = r2.replaceAll(r1, r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r23 = "L Distance"
            int r11 = r10.length()     // Catch:{ Exception -> 0x09e2 }
            if (r11 != 0) goto L_0x03e9
            int r11 = r8.length()     // Catch:{ Exception -> 0x09e2 }
        L_0x03df:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x09e2 }
            r0 = r23
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
            goto L_0x0456
        L_0x03e9:
            int r4 = r8.length()     // Catch:{ Exception -> 0x09e2 }
            if (r4 == 0) goto L_0x03df
            r3 = 1
            int r2 = r4 + 1
            int r0 = r11 + 1
            int[] r1 = new int[r7]     // Catch:{ Exception -> 0x09e2 }
            r1[r3] = r0     // Catch:{ Exception -> 0x09e2 }
            r12 = 0
            r1[r12] = r2     // Catch:{ Exception -> 0x09e2 }
            java.lang.Class<int> r0 = int.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch:{ Exception -> 0x09e2 }
            int[][] r2 = (int[][]) r2     // Catch:{ Exception -> 0x09e2 }
            r0 = 0
        L_0x0404:
            if (r0 > r4) goto L_0x040d
            r1 = r2[r0]     // Catch:{ Exception -> 0x09e2 }
            r1[r12] = r0     // Catch:{ Exception -> 0x09e2 }
            int r0 = r0 + 1
            goto L_0x0404
        L_0x040d:
            r0 = 0
        L_0x040e:
            if (r0 > r11) goto L_0x0417
            r1 = r2[r12]     // Catch:{ Exception -> 0x09e2 }
            r1[r0] = r0     // Catch:{ Exception -> 0x09e2 }
            int r0 = r0 + 1
            goto L_0x040e
        L_0x0417:
            if (r3 > r11) goto L_0x0451
            r1 = 1
        L_0x041a:
            if (r1 > r4) goto L_0x044e
            int r12 = r1 + -1
            char r14 = r8.charAt(r12)     // Catch:{ Exception -> 0x09e2 }
            int r0 = r3 + -1
            char r13 = r10.charAt(r0)     // Catch:{ Exception -> 0x09e2 }
            r22 = r2[r1]     // Catch:{ Exception -> 0x09e2 }
            if (r14 != r13) goto L_0x0433
            r12 = r2[r12]     // Catch:{ Exception -> 0x09e2 }
            r0 = r12[r0]     // Catch:{ Exception -> 0x09e2 }
            r22[r3] = r0     // Catch:{ Exception -> 0x09e2 }
            goto L_0x044b
        L_0x0433:
            r14 = r2[r12]     // Catch:{ Exception -> 0x09e2 }
            r12 = r14[r0]     // Catch:{ Exception -> 0x09e2 }
            int r13 = r12 + 1
            r12 = r14[r3]     // Catch:{ Exception -> 0x09e2 }
            int r12 = r12 + 1
            r0 = r22[r0]     // Catch:{ Exception -> 0x09e2 }
            int r0 = r0 + 1
            int r0 = java.lang.Math.min(r12, r0)     // Catch:{ Exception -> 0x09e2 }
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ Exception -> 0x09e2 }
            r22[r3] = r0     // Catch:{ Exception -> 0x09e2 }
        L_0x044b:
            int r1 = r1 + 1
            goto L_0x041a
        L_0x044e:
            int r3 = r3 + 1
            goto L_0x0417
        L_0x0451:
            r0 = r2[r4]     // Catch:{ Exception -> 0x09e2 }
            r11 = r0[r11]     // Catch:{ Exception -> 0x09e2 }
            goto L_0x03df
        L_0x0456:
            r4 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x09e5 }
            int r2 = X.C65983Uf.A00(r8, r10)     // Catch:{ Exception -> 0x09e5 }
            if (r2 == 0) goto L_0x0463
            if (r2 != r4) goto L_0x04c3
        L_0x0463:
            X.1N4 r3 = r5.A0E     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = X.C65983Uf.A0B(r3, r8, r9, r10)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "Mistyped"
            if (r0 != 0) goto L_0x0473
            java.lang.String r0 = "false"
        L_0x046f:
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            goto L_0x0476
        L_0x0473:
            java.lang.String r0 = "true"
            goto L_0x046f
        L_0x0476:
            if (r2 != 0) goto L_0x04b5
            java.lang.String r2 = X.AnonymousClass3U2.A02(r3, r9, r10)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = X.AnonymousClass3U2.A02(r3, r9, r8)     // Catch:{ Exception -> 0x09e2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r0.<init>()     // Catch:{ Exception -> 0x09e2 }
            r0.append(r9)     // Catch:{ Exception -> 0x09e2 }
            r0.append(r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x09e2 }
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x09e2 }
            if (r1 != 0) goto L_0x04b0
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x09e2 }
            if (r0 != 0) goto L_0x04b0
            boolean r0 = X.AnonymousClass3U2.A05(r10, r8, r2, r9)     // Catch:{ Exception -> 0x09e2 }
            if (r0 != 0) goto L_0x04b0
            boolean r0 = r8.endsWith(r2)     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x04b5
            int r1 = X.AnonymousClass3U2.A00(r3, r9, r2)     // Catch:{ Exception -> 0x09e2 }
            r0 = 5
            if (r1 != r0) goto L_0x04b5
            r11 = 0
            goto L_0x04b5
        L_0x04b0:
            r0 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x04b5:
            java.lang.String r1 = "Mistyped Last6"
            if (r11 != 0) goto L_0x04bc
            r0 = r24
            goto L_0x04c0
        L_0x04bc:
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x09e2 }
        L_0x04c0:
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
        L_0x04c3:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r11.<init>()     // Catch:{ Exception -> 0x09e2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e2 }
            r10.<init>()     // Catch:{ Exception -> 0x09e2 }
            if (r27 != 0) goto L_0x04d0
            goto L_0x0536
        L_0x04d0:
            android.net.Network[] r9 = r27.getAllNetworks()     // Catch:{ Exception -> 0x09e2 }
            int r8 = r9.length     // Catch:{ Exception -> 0x09e2 }
            r4 = 0
            r14 = 0
        L_0x04d7:
            if (r4 >= r8) goto L_0x053b
            r3 = r9[r4]     // Catch:{ Exception -> 0x09e2 }
            if (r14 == 0) goto L_0x04e5
            r0 = 59
            r11.append(r0)     // Catch:{ Exception -> 0x09e2 }
            r10.append(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x04e5:
            r0 = r27
            android.net.NetworkCapabilities r2 = r0.getNetworkCapabilities(r3)     // Catch:{ Exception -> 0x09e2 }
            if (r2 == 0) goto L_0x0531
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x09e2 }
            r13 = 0
            r1[r13] = r0     // Catch:{ Exception -> 0x09e2 }
            r0 = 11
            boolean r12 = r2.hasCapability(r0)     // Catch:{ Exception -> 0x09e2 }
            r0 = 0
            if (r12 != 0) goto L_0x0500
            r0 = 1
        L_0x0500:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x09e2 }
            r12 = 1
            r1[r12] = r0     // Catch:{ Exception -> 0x09e2 }
            r0 = r26
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x09e2 }
            r11.append(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x09e2 }
            r0[r13] = r1     // Catch:{ Exception -> 0x09e2 }
            r1 = 13
            boolean r2 = r2.hasCapability(r1)     // Catch:{ Exception -> 0x09e2 }
            r1 = 0
            if (r2 != 0) goto L_0x0522
            r1 = 1
        L_0x0522:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x09e2 }
            r0[r12] = r1     // Catch:{ Exception -> 0x09e2 }
            r1 = r26
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x09e2 }
            r10.append(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x0531:
            int r14 = r14 + 1
            int r4 = r4 + 1
            goto L_0x04d7
        L_0x0536:
            java.lang.String r0 = "debug-builder/get-debug-info cm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x053b:
            java.lang.String r0 = "Network metered"
            java.lang.String r1 = r11.toString()     // Catch:{ Exception -> 0x09e2 }
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "Network restricted"
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            X.3K7 r0 = r29.A05()     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x055e
            java.lang.String r1 = "Data roaming"
            boolean r0 = r0.A04     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
        L_0x055e:
            java.lang.String r1 = "Tel roaming"
            if (r25 == 0) goto L_0x056a
            boolean r0 = r25.isNetworkRoaming()     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r24 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x056a:
            r0 = r24
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            X.1Pa r3 = r5.A0K     // Catch:{ Exception -> 0x09e2 }
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r3)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "previous_call_tslog_call_id"
            r2 = 0
            java.lang.String r1 = r1.getString(r0, r2)     // Catch:{ Exception -> 0x09e2 }
            if (r1 == 0) goto L_0x0583
            java.lang.String r0 = "Last CR ID"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x0583:
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r3)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "previous_relay_call_uuid"
            java.lang.String r1 = r1.getString(r0, r2)     // Catch:{ Exception -> 0x09e2 }
            if (r1 == 0) goto L_0x0594
            java.lang.String r0 = "Last Relay Call UUID"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x0594:
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r3)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = "previous_self_participant_uuid"
            java.lang.String r1 = r1.getString(r0, r2)     // Catch:{ Exception -> 0x09e2 }
            if (r1 == 0) goto L_0x05ab
            int r0 = r1.length()     // Catch:{ Exception -> 0x09e2 }
            if (r0 <= 0) goto L_0x05ab
            java.lang.String r0 = "Last Call Self Participant UUID"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x05ab:
            X.1Hq r0 = r5.A0U     // Catch:{ Exception -> 0x09e2 }
            com.whatsapp.fieldstats.events.WamCall r2 = r0.A01     // Catch:{ Exception -> 0x09e2 }
            if (r2 == 0) goto L_0x05f7
            java.lang.Integer r1 = r2.callSide     // Catch:{ Exception -> 0x09e2 }
            if (r1 == 0) goto L_0x05ba
            java.lang.String r0 = "voip call side"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x05ba:
            java.lang.Integer r1 = r2.callResult     // Catch:{ Exception -> 0x09e2 }
            if (r1 == 0) goto L_0x05c3
            java.lang.String r0 = "voip call result"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x05c3:
            java.lang.Integer r1 = r2.callSetupErrorType     // Catch:{ Exception -> 0x09e2 }
            if (r1 == 0) goto L_0x05cc
            java.lang.String r0 = "voip call setup error"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x05cc:
            java.lang.Integer r1 = r2.callTermReason     // Catch:{ Exception -> 0x09e2 }
            if (r1 == 0) goto L_0x05d5
            java.lang.String r0 = "voip call terminate reason"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x05d5:
            java.lang.String r1 = r2.callTestBucket     // Catch:{ Exception -> 0x09e2 }
            if (r1 == 0) goto L_0x05de
            java.lang.String r0 = "voip call test bucket"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x05de:
            java.lang.Integer r0 = r2.callRelayBindStatus     // Catch:{ Exception -> 0x09e2 }
            if (r0 == 0) goto L_0x05e9
            int r1 = r0.intValue()     // Catch:{ Exception -> 0x09e2 }
            r0 = 1
            if (r1 == r7) goto L_0x05ea
        L_0x05e9:
            r0 = 0
        L_0x05ea:
            java.lang.String r1 = "voip bind to any relay"
            if (r0 == 0) goto L_0x05f4
            java.lang.String r0 = "Yes"
        L_0x05f0:
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            goto L_0x05f7
        L_0x05f4:
            java.lang.String r0 = "No"
            goto L_0x05f0
        L_0x05f7:
            r1 = r41
            if (r41 == 0) goto L_0x0600
            java.lang.String r0 = "ref"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x0600:
            java.lang.String r1 = "ABprops hash state"
            X.1bR r2 = r5.A0a     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r0 = r2.A00()     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "Serverprops hash state"
            java.lang.String r0 = r2.A01()     // Catch:{ Exception -> 0x09e2 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            X.0yC r3 = r5.A0T     // Catch:{ Exception -> 0x09e2 }
            r0 = 422(0x1a6, float:5.91E-43)
            X.0yV r2 = X.C21000yV.A02     // Catch:{ Exception -> 0x09e2 }
            boolean r0 = X.C20800yB.A01(r2, r3, r0)     // Catch:{ Exception -> 0x09e2 }
            int r4 = X.C146526vk.A02(r0)     // Catch:{ Exception -> 0x09e2 }
            java.lang.String r1 = "Video transcode"
            r7 = 1
            if (r4 == r7) goto L_0x0639
            r0 = 2
            if (r4 == r0) goto L_0x0633
            r0 = 3
            if (r4 != r0) goto L_0x063e
            java.lang.String r0 = "no encoders"
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            goto L_0x063e
        L_0x0633:
            java.lang.String r0 = "unsupported device"
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
            goto L_0x063e
        L_0x0639:
            java.lang.String r0 = "supported"
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e2 }
        L_0x063e:
            r4 = 1
            r0 = r37
            if (r37 == 0) goto L_0x064c
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x09e5 }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
        L_0x064c:
            X.1EV r0 = r5.A0Y     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r0.A03()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x067f
            java.lang.String r1 = "Payments"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
            if (r43 == 0) goto L_0x067f
            boolean r0 = X.C1906499t.A00(r33)     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x067f
            java.util.Iterator r7 = r43.iterator()     // Catch:{ Exception -> 0x09e5 }
        L_0x0669:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x067f
            java.lang.Object r0 = r7.next()     // Catch:{ Exception -> 0x09e5 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x09e5 }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x09e5 }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x0669
        L_0x067f:
            X.12P r0 = r5.A0Q     // Catch:{ Exception -> 0x09e5 }
            r0.A06()     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r0.A08     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x0699
            X.12i r1 = r5.A0R     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r0 = "cross_platform_migration_completed"
            r7 = 0
            java.lang.String r0 = r1.A01(r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x0694
            goto L_0x069c
        L_0x0694:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x069d
        L_0x0699:
            r7 = 0
            r0 = 0
            goto L_0x069d
        L_0x069c:
            r0 = 0
        L_0x069d:
            if (r0 == 0) goto L_0x06b5
            X.12i r9 = r5.A0R     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r8 = "cross_platform_migration_completed_timestamp"
            r0 = 0
            long r0 = r9.A00(r8, r0)     // Catch:{ Exception -> 0x09e5 }
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x09e5 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x09e5 }
            r0 = r19
            java.lang.String r1 = r0.format(r8)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x06b7
        L_0x06b5:
            java.lang.String r1 = "no"
        L_0x06b7:
            java.lang.String r0 = "XPMigrated"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e5 }
            r0 = r32
            X.005 r0 = r0.A00     // Catch:{ Exception -> 0x09e5 }
            java.lang.Object r8 = r0.get()     // Catch:{ Exception -> 0x09e5 }
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = "last_datacenter"
            r0 = 0
            java.lang.String r1 = r8.getString(r1, r0)     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x06d8
            java.lang.String r0 = "Datacenter"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e5 }
        L_0x06d8:
            java.lang.String r1 = "Screen reader"
            android.view.accessibility.AccessibilityManager r0 = r30.A0M()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x06e7
            boolean r8 = r0.isTouchExplorationEnabled()     // Catch:{ Exception -> 0x09e5 }
            r0 = 1
            if (r8 != 0) goto L_0x06e8
        L_0x06e7:
            r0 = 0
        L_0x06e8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = "Fingerprint eligible"
            X.18U r0 = r5.A0I     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r0.A05()     // Catch:{ Exception -> 0x09e5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
            X.1Wc r0 = r5.A04     // Catch:{ Exception -> 0x09e5 }
            X.0xD r0 = X.C29301Wc.A00(r0)     // Catch:{ Exception -> 0x09e5 }
            X.1Q9 r0 = r0.A09     // Catch:{ Exception -> 0x09e5 }
            long r0 = r0.A0E()     // Catch:{ Exception -> 0x09e5 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x072b
            java.lang.String r1 = "never"
        L_0x0712:
            java.lang.String r0 = "Last local backup time"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r8 = r32.A0c()     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x09e5 }
            r9 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r0 = "Google account added"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x0740
        L_0x072b:
            r9 = -1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0734
            r1 = r21
            goto L_0x0712
        L_0x0734:
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x09e5 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x09e5 }
            r0 = r19
            java.lang.String r1 = r0.format(r8)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x0712
        L_0x0740:
            if (r9 == 0) goto L_0x07c8
            r0 = r32
            long r0 = r0.A0T(r8)     // Catch:{ Exception -> 0x09e5 }
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0797
            java.lang.String r1 = "never"
        L_0x0750:
            java.lang.String r0 = "Last successful Google storage backup time"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e5 }
            r0 = r32
            long r0 = r0.A0U(r8)     // Catch:{ Exception -> 0x09e5 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0783
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e5 }
            r9.<init>()     // Catch:{ Exception -> 0x09e5 }
            r9.append(r0)     // Catch:{ Exception -> 0x09e5 }
            r9.append(r15)     // Catch:{ Exception -> 0x09e5 }
            r8 = r34
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r8, r0)     // Catch:{ Exception -> 0x09e5 }
            r9.append(r0)     // Catch:{ Exception -> 0x09e5 }
            r0 = r18
            r9.append(r0)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = r9.toString()     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r0 = "Size of Google storage backup"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e5 }
        L_0x0783:
            int r0 = r32.A0C()     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = X.C34191gb.A03(r0)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r0 = "Backup to Google storage frequency"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e5 }
            int r0 = r32.A0D()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x07af
            goto L_0x07ac
        L_0x0797:
            r10 = -1
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x07a0
            r1 = r21
            goto L_0x0750
        L_0x07a0:
            java.util.Date r9 = new java.util.Date     // Catch:{ Exception -> 0x09e5 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x09e5 }
            r0 = r19
            java.lang.String r1 = r0.format(r9)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x0750
        L_0x07ac:
            if (r0 != r4) goto L_0x07b4
            goto L_0x07b2
        L_0x07af:
            java.lang.String r21 = "wifi only"
            goto L_0x07b4
        L_0x07b2:
            java.lang.String r21 = "wifi or cellular"
        L_0x07b4:
            java.lang.String r1 = "Backed up over"
            r0 = r21
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r32.A2E()     // Catch:{ Exception -> 0x09e5 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r0 = "Videos included in backup"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e5 }
        L_0x07c8:
            java.lang.String r8 = "Groups media visibility"
            X.1CR r1 = r5.A0b     // Catch:{ Exception -> 0x09e5 }
            X.3LI r0 = r1.A0Q()     // Catch:{ Exception -> 0x09e5 }
            int r9 = r0.A03     // Catch:{ Exception -> 0x09e5 }
            if (r9 == 0) goto L_0x07e0
            if (r9 == r4) goto L_0x07dd
            r0 = 2
            if (r9 == r0) goto L_0x07da
            goto L_0x07e3
        L_0x07da:
            java.lang.String r0 = "on"
            goto L_0x07e5
        L_0x07dd:
            java.lang.String r0 = "off"
            goto L_0x07e5
        L_0x07e0:
            java.lang.String r0 = "default"
            goto L_0x07e5
        L_0x07e3:
            java.lang.String r0 = "<unknown>"
        L_0x07e5:
            A02(r0, r6, r8)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r8 = "Individual media visibility"
            X.3LI r0 = r1.A0R()     // Catch:{ Exception -> 0x09e5 }
            int r1 = r0.A03     // Catch:{ Exception -> 0x09e5 }
            if (r1 == 0) goto L_0x07fe
            if (r1 == r4) goto L_0x07fb
            r0 = 2
            if (r1 == r0) goto L_0x07f8
            goto L_0x0801
        L_0x07f8:
            java.lang.String r0 = "on"
            goto L_0x0803
        L_0x07fb:
            java.lang.String r0 = "off"
            goto L_0x0803
        L_0x07fe:
            java.lang.String r0 = "default"
            goto L_0x0803
        L_0x0801:
            java.lang.String r0 = "<unknown>"
        L_0x0803:
            A02(r0, r6, r8)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r8 = "In scoped mode"
            X.179 r1 = r5.A05     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r1.A0A()     // Catch:{ Exception -> 0x09e5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r8)     // Catch:{ Exception -> 0x09e5 }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x09e5 }
            r0 = 30
            if (r8 < r0) goto L_0x0830
            boolean r0 = r1.A0A()     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x0830
            java.io.File r0 = r1.A05()     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r8 = "scoped root"
            if (r0 == 0) goto L_0x088d
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x09e5 }
        L_0x082d:
            A02(r0, r6, r8)     // Catch:{ Exception -> 0x09e5 }
        L_0x0830:
            java.lang.String r8 = "Has unexpected .nomedia"
            X.0y0 r9 = r5.A02     // Catch:{ Exception -> 0x09e5 }
            X.3BP r0 = r9.A08()     // Catch:{ Exception -> 0x09e5 }
            java.io.File r0 = r0.A01     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = A03(r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x0890
            X.3BP r0 = r9.A08()     // Catch:{ Exception -> 0x09e5 }
            java.io.File r0 = r0.A00     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = A03(r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x0890
            X.3BP r0 = r9.A08()     // Catch:{ Exception -> 0x09e5 }
            java.io.File r0 = r0.A0N     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = A03(r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x0890
            X.3BP r0 = r9.A08()     // Catch:{ Exception -> 0x09e5 }
            java.io.File r0 = r0.A05     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = A03(r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x0890
            X.3BP r0 = r9.A08()     // Catch:{ Exception -> 0x09e5 }
            java.io.File r0 = r0.A02     // Catch:{ Exception -> 0x09e5 }
            X.C20690y0.A07(r0, r7)     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = A03(r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x0890
            java.io.File r0 = r9.A0H()     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = A03(r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x0890
            X.005 r0 = r1.A01     // Catch:{ Exception -> 0x09e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x09e5 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x09e5 }
            boolean r1 = A03(r0)     // Catch:{ Exception -> 0x09e5 }
            r0 = 0
            if (r1 == 0) goto L_0x0891
            goto L_0x0890
        L_0x088d:
            java.lang.String r0 = "null"
            goto L_0x082d
        L_0x0890:
            r0 = 1
        L_0x0891:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r8)     // Catch:{ Exception -> 0x09e5 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x09e5 }
            r0.<init>()     // Catch:{ Exception -> 0x09e5 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ Exception -> 0x09e5 }
        L_0x08a1:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x08b7
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x09e5 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x09e5 }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x09e5 }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x08a1
        L_0x08b7:
            X.1Ua r0 = r5.A0f     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r0.A00()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x08d0
            java.lang.String r1 = "crossposting enabled"
            X.1UM r8 = r5.A0e     // Catch:{ Exception -> 0x09e5 }
            X.1US r0 = X.AnonymousClass1US.DEBUG_INFO_BUILDER     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r8.A06(r0)     // Catch:{ Exception -> 0x09e5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
        L_0x08d0:
            if (r44 == 0) goto L_0x08fa
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x09e5 }
            r8.<init>()     // Catch:{ Exception -> 0x09e5 }
            java.util.Iterator r9 = r44.iterator()     // Catch:{ Exception -> 0x09e5 }
        L_0x08db:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x08f1
            java.lang.Object r0 = r9.next()     // Catch:{ Exception -> 0x09e5 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x09e5 }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x09e5 }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x09e5 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x08db
        L_0x08f1:
            java.lang.String r1 = "User context"
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
        L_0x08fa:
            r8 = r38
            if (r38 == 0) goto L_0x090d
            r0 = 2057(0x809, float:2.882E-42)
            boolean r0 = X.C20800yB.A01(r2, r3, r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x090d
            java.lang.String r1 = "entity id"
            java.lang.String r0 = r8.user     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
        L_0x090d:
            java.lang.String r1 = "Is Companion"
            X.1Pd r0 = r5.A0L     // Catch:{ Exception -> 0x09e5 }
            int r8 = r0.A00()     // Catch:{ Exception -> 0x09e5 }
            r0 = 2
            if (r8 != r0) goto L_0x0920
            X.1Pe r0 = r5.A0M     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r0.A01()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x0926
        L_0x0920:
            boolean r0 = r28.A0L()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x0927
        L_0x0926:
            r7 = 1
        L_0x0927:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r7 = "Has Wear OS Companion"
            java.util.ArrayList r0 = r31.A09()     // Catch:{ Exception -> 0x09e5 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ Exception -> 0x09e5 }
        L_0x0938:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x0958
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x09e5 }
            X.3SB r0 = (X.AnonymousClass3SB) r0     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = r0.A09     // Catch:{ Exception -> 0x09e5 }
            if (r1 == 0) goto L_0x0938
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ Exception -> 0x09e5 }
            java.lang.String r0 = "wear os"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x0938
            r0 = 1
            goto L_0x0959
        L_0x0958:
            r0 = 0
        L_0x0959:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r7)     // Catch:{ Exception -> 0x09e5 }
            X.1RU r7 = r5.A0H     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r7.A0B()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x0979
            java.lang.String r1 = "Number of Accounts"
            X.0v0 r0 = r7.A09     // Catch:{ Exception -> 0x09e5 }
            int r0 = r0.A0I()     // Catch:{ Exception -> 0x09e5 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
        L_0x0979:
            if (r52 == 0) goto L_0x0990
            r0 = 7752(0x1e48, float:1.0863E-41)
            boolean r0 = X.C20800yB.A01(r2, r3, r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x09a0
            java.lang.String r1 = "saga_v1_test"
        L_0x0985:
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x09e5 }
            if (r0 != 0) goto L_0x0990
            java.lang.String r0 = "sagaKey"
            A02(r1, r6, r0)     // Catch:{ Exception -> 0x09e5 }
        L_0x0990:
            java.lang.String r1 = "saga_copy"
            r0 = 7044(0x1b84, float:9.871E-42)
            boolean r0 = X.C20800yB.A01(r2, r3, r0)     // Catch:{ Exception -> 0x09e5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x09e5 }
            A02(r0, r6, r1)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x09be
        L_0x09a0:
            X.0v5 r1 = r5.A00     // Catch:{ Exception -> 0x09e5 }
            boolean r0 = r1.A05()     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x09bb
            java.lang.Object r0 = r1.A02()     // Catch:{ Exception -> 0x09e5 }
            X.1GB r0 = (X.AnonymousClass1GB) r0     // Catch:{ Exception -> 0x09e5 }
            X.0yC r1 = r0.A00     // Catch:{ Exception -> 0x09e5 }
            r0 = 5626(0x15fa, float:7.884E-42)
            boolean r0 = X.C20800yB.A01(r2, r1, r0)     // Catch:{ Exception -> 0x09e5 }
            if (r0 == 0) goto L_0x09bb
            java.lang.String r1 = "saga"
            goto L_0x0985
        L_0x09bb:
            r1 = r16
            goto L_0x0985
        L_0x09be:
            if (r50 == 0) goto L_0x09ed
            r0 = r20
            java.lang.String r1 = r0.toString(r4)     // Catch:{ Exception -> 0x09e5 }
            r0 = r17
            r0.append(r1)     // Catch:{ Exception -> 0x09e5 }
            goto L_0x09ed
        L_0x09cc:
            r1 = move-exception
            if (r4 == 0) goto L_0x09d7
            r4.close()     // Catch:{ all -> 0x09d3 }
            goto L_0x09d7
        L_0x09d3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09d8 }
        L_0x09d7:
            throw r1     // Catch:{ all -> 0x09d8 }
        L_0x09d8:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x09dd }
            goto L_0x09e1
        L_0x09dd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x09e2 }
        L_0x09e1:
            throw r1     // Catch:{ Exception -> 0x09e2 }
        L_0x09e2:
            r1 = move-exception
            r4 = 1
            goto L_0x09e6
        L_0x09e5:
            r1 = move-exception
        L_0x09e6:
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteException
            if (r0 == 0) goto L_0x09f2
            X.C18740tg.A0A(r1)
        L_0x09ed:
            java.lang.String r0 = r17.toString()
            return r0
        L_0x09f2:
            java.lang.String r0 = "exception during email composition"
            com.whatsapp.util.Log.e(r0, r1)
            X.0wN r2 = r5.A0F
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "Exception building debug info"
            r2.A0E(r0, r1, r4)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31211bS.A05(android.content.Context, android.util.Pair, X.147, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, org.json.JSONObject, long, long, boolean, boolean, boolean):java.lang.String");
    }
}
