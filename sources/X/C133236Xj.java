package X;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Xj  reason: invalid class name and case insensitive filesystem */
public class C133236Xj {
    public static final int A0J = 10;
    public static final int A0K = 5000;
    public static final long A0L = 64092211200L;
    public static final String A0M = "xpm-messages-exporter-";
    public long A00;
    public int A01;
    public long A02;
    public final C19970wo A03;
    public final C19700wN A04;
    public final C25731Hl A05;
    public final C25751Hn A06;
    public final AnonymousClass17Z A07;
    public final C19420v0 A08;
    public final C220412q A09;
    public final AnonymousClass12P A0A;
    public final AnonymousClass17T A0B;
    public final C20810yC A0C;
    public final AnonymousClass1HI A0D;
    public final AnonymousClass5FY A0E;
    public final AnonymousClass6F6 A0F;
    public final AnonymousClass1XW A0G;
    public final AnonymousClass1CR A0H;
    public final AnonymousClass1CQ A0I;

    public static void A05(C124255xq r8, OutputStream outputStream) {
        try {
            JSONObject A1B = C36441kJ.A1B();
            JSONObject A1B2 = C36441kJ.A1B();
            A1B2.put("creation_date", r8.A00);
            A1B2.put("os", r8.A05);
            A1B2.put("os_version", r8.A06);
            A1B2.put("app_name", r8.A02);
            A1B2.put("app_version", r8.A03);
            A1B2.put("format_version", r8.A04);
            A1B.put("header", A1B2);
            if (r8.A01 != null) {
                JSONObject A1B3 = C36441kJ.A1B();
                A1B.put("messages", A1B3);
                A1B3.put("filename", r8.A01.A00);
                A1B3.put("format", r8.A01.A01);
                JSONArray A0u = C90524aI.A0u();
                A1B3.put("chunks", A0u);
                List<C119845qY> list = r8.A01.A02;
                if (list != null) {
                    for (C119845qY r2 : list) {
                        JSONObject A1B4 = C36441kJ.A1B();
                        A1B4.put("chunk_number", r2.A00);
                        A1B4.put("messages_count", r2.A01);
                        A0u.put(A1B4);
                    }
                }
            }
            outputStream.write(A1B.toString(4).getBytes(DefaultCrypto.UTF_8));
        } catch (IOException | JSONException e) {
            Log.e("Failed to write header information.", e);
            throw e;
        }
    }

    /* renamed from: A07 */
    public Cursor A0E(int i, long j, long j2, long j3) {
        String[] strArr = new String[4];
        C36341k9.A1W(strArr, j);
        strArr[1] = String.valueOf(j2);
        strArr[2] = String.valueOf(j3);
        strArr[3] = String.valueOf(i);
        AnonymousClass1M0 A042 = this.A0A.get();
        try {
            Cursor A092 = A042.A02.A09(AnonymousClass2xD.A0I, "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL", strArr);
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r7 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a5, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        r3 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ce A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0A(java.io.File r15) {
        /*
            r14 = this;
            r5 = 0
            if (r15 == 0) goto L_0x00eb
            boolean r0 = r15.exists()
            if (r0 == 0) goto L_0x00eb
            r8 = 1
            java.lang.String r6 = r15.getCanonicalPath()     // Catch:{ IOException -> 0x00cf }
            int r10 = A01(r6)
            r4 = 0
            java.lang.String r7 = ""
            r9 = 0
        L_0x0016:
            r0 = 10
            if (r9 >= r0) goto L_0x00a2
            X.6F6 r0 = r14.A0F     // Catch:{ IOException -> 0x009f }
            X.1M0 r3 = X.C1270466s.A00(r0)     // Catch:{ IOException -> 0x009f }
            X.14e r11 = r3.A02     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f.local_path = ?"
            java.lang.String[] r1 = new java.lang.String[r8]     // Catch:{ all -> 0x0095 }
            r1[r4] = r6     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_BY_LOCAL_PATH_SINGLE"
            android.database.Cursor r2 = r11.A09(r2, r0, r1)     // Catch:{ all -> 0x0095 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x0036
            r0 = 0
            goto L_0x003a
        L_0x0036:
            X.5xH r0 = X.AnonymousClass6MK.A00(r2)     // Catch:{ all -> 0x0089 }
        L_0x003a:
            r2.close()     // Catch:{ all -> 0x0095 }
            r3.close()     // Catch:{ IOException -> 0x009f }
            if (r0 == 0) goto L_0x0043
            goto L_0x0086
        L_0x0043:
            int r0 = r10 % 100
            long r2 = (long) r0     // Catch:{ IOException -> 0x009f }
            int r0 = r10 / 100
            int r0 = r0 % 100
            long r0 = (long) r0     // Catch:{ IOException -> 0x009f }
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ IOException -> 0x009f }
            java.lang.String r12 = "Media/%d/%d/%d-%s"
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x009f }
            X.AnonymousClass000.A1M(r11, r4, r2)     // Catch:{ IOException -> 0x009f }
            X.AnonymousClass000.A1M(r11, r8, r0)     // Catch:{ IOException -> 0x009f }
            r0 = 2
            X.AnonymousClass000.A1L(r11, r10, r0)     // Catch:{ IOException -> 0x009f }
            r1 = 3
            java.lang.String r0 = r15.getName()     // Catch:{ IOException -> 0x009f }
            r11[r1] = r0     // Catch:{ IOException -> 0x009f }
            java.lang.String r7 = java.lang.String.format(r13, r12, r11)     // Catch:{ IOException -> 0x009f }
            X.6F6 r0 = r14.A0F     // Catch:{ IOException -> 0x009f }
            long r11 = r0.A02(r15, r7, r4)     // Catch:{ IOException -> 0x009f }
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r6)     // Catch:{ IOException -> 0x009f }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x009f }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException -> 0x009f }
            int r10 = A01(r0)     // Catch:{ IOException -> 0x009f }
            int r9 = r9 + 1
            goto L_0x0016
        L_0x0086:
            java.lang.String r7 = r0.A04     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00a3
        L_0x0089:
            r1 = move-exception
            if (r2 == 0) goto L_0x0094
            r2.close()     // Catch:{ all -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0095 }
        L_0x0094:
            throw r1     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x009a }
            goto L_0x009e
        L_0x009a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x009f }
        L_0x009e:
            throw r1     // Catch:{ IOException -> 0x009f }
        L_0x009f:
            r9 = move-exception
            r3 = 0
            goto L_0x00a7
        L_0x00a2:
            r8 = 0
        L_0x00a3:
            r3 = r8
            goto L_0x00bb
        L_0x00a5:
            r9 = move-exception
            r3 = 1
        L_0x00a7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessagesExporter/exportMediaFile/IOException during file registration. Local path: "
            X.C90464aC.A1L(r0, r6, r1, r9)
            X.0wN r2 = r14.A04
            java.lang.String r1 = r9.getMessage()
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/IOException"
            r2.A0E(r0, r1, r8)
        L_0x00bb:
            if (r3 != 0) goto L_0x00ce
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessagesExporter/exportMediaFile/File is not registered. Local path: "
            X.C36321k7.A1P(r0, r6, r1)
            X.0wN r1 = r14.A04
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/registerFile"
            r1.A0E(r0, r5, r4)
            return r5
        L_0x00ce:
            return r7
        L_0x00cf:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessagesExporter/exportMediaFile/Failed to get canonical file path: "
            r1.append(r0)
            java.lang.String r0 = r15.getName()
            X.C36321k7.A1Z(r1, r0)
            X.0wN r2 = r14.A04
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/getCanonicalPath"
            r2.A0E(r0, r1, r8)
        L_0x00eb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133236Xj.A0A(java.io.File):java.lang.String");
    }

    public static /* synthetic */ int A00(Pair pair, Pair pair2) {
        return -((Long) pair.second).compareTo((Long) pair2.second);
    }

    public static C99954uE A02(int i) {
        if (i == 0) {
            return null;
        }
        AnonymousClass8NN A0p = C99954uE.DEFAULT_INSTANCE.A0p();
        if ((i & 1) > 0) {
            C99954uE r2 = (C99954uE) C90524aI.A0H(A0p);
            r2.bitField0_ |= 1;
            r2.downloadImages_ = true;
        }
        if ((i & 2) > 0) {
            C99954uE r22 = (C99954uE) C90524aI.A0H(A0p);
            r22.bitField0_ |= 2;
            r22.downloadAudio_ = true;
        }
        if ((i & 4) > 0) {
            C99954uE r23 = (C99954uE) C90524aI.A0H(A0p);
            r23.bitField0_ |= 4;
            r23.downloadVideo_ = true;
        }
        if ((i & 8) > 0) {
            C99954uE r24 = (C99954uE) C90524aI.A0H(A0p);
            r24.bitField0_ |= 8;
            r24.downloadDocuments_ = true;
        }
        return (C99954uE) A0p.A0R();
    }

    public static C99844u3 A03(AnonymousClass6OQ r4) {
        AnonymousClass8NN A0p = C99844u3.DEFAULT_INSTANCE.A0p();
        String obj = r4.A04.A00.toString();
        C99844u3 r1 = (C99844u3) C90524aI.A0H(A0p);
        obj.getClass();
        r1.bitField0_ |= 1;
        r1.fbid_ = obj;
        String str = (String) r4.A05.A00;
        C99844u3 r12 = (C99844u3) C90524aI.A0H(A0p);
        str.getClass();
        r12.bitField0_ |= 2;
        r12.password_ = str;
        return (C99844u3) A0p.A0R();
    }

    public static C100014uK A04(AnonymousClass3LI r4) {
        AnonymousClass8NN A0p = C100014uK.DEFAULT_INSTANCE.A0p();
        if (r4.A08() != null) {
            String A082 = r4.A08();
            C100014uK r1 = (C100014uK) C90524aI.A0H(A0p);
            A082.getClass();
            r1.bitField0_ |= 1;
            r1.messageVibrate_ = A082;
        }
        if (r4.A06() != null) {
            String A062 = r4.A06();
            C100014uK r12 = (C100014uK) C90524aI.A0H(A0p);
            A062.getClass();
            r12.bitField0_ |= 2;
            r12.messagePopup_ = A062;
        }
        if (r4.A05() != null) {
            String A052 = r4.A05();
            C100014uK r13 = (C100014uK) C90524aI.A0H(A0p);
            A052.getClass();
            r13.bitField0_ |= 4;
            r13.messageLight_ = A052;
        }
        boolean A0C2 = r4.A0C();
        C100014uK r14 = (C100014uK) C90524aI.A0H(A0p);
        r14.bitField0_ |= 8;
        r14.lowPriorityNotifications_ = A0C2;
        boolean z = r4.A02().A0H;
        C100014uK r15 = (C100014uK) C90524aI.A0H(A0p);
        r15.bitField0_ |= 16;
        r15.reactionsMuted_ = z;
        if (r4.A04() != null) {
            String A042 = r4.A04();
            C100014uK r16 = (C100014uK) C90524aI.A0H(A0p);
            A042.getClass();
            r16.bitField0_ |= 32;
            r16.callVibrate_ = A042;
        }
        return (C100014uK) A0p.A0R();
    }

    private boolean A06(AnonymousClass11F r3) {
        return AnonymousClass000.A1W(this.A09.A09(r3, false));
    }

    public C99784tx A08(Cursor cursor, CancellationSignal cancellationSignal, Map map) {
        AnonymousClass63Y r1 = new AnonymousClass63Y(AnonymousClass5SH.FOR_CHAT_TRANSFER);
        r1.A03 = true;
        r1.A02 = true;
        r1.A00 = 0;
        AnonymousClass6CO A002 = r1.A00();
        LinkedHashMap A022 = this.A0D.A02(cursor, A002, new C146086v0(this), AnonymousClass001.A0I(), 0);
        if (A022.size() == 0) {
            return null;
        }
        C99784tx r5 = (C99784tx) C100064uP.DEFAULT_INSTANCE.A0p();
        r5.A0Y(AnonymousClass5UH.FULL);
        Iterator A0y = AnonymousClass000.A0y(A022);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            cancellationSignal.throwIfCanceled();
            AnonymousClass11F r3 = (AnonymousClass11F) A11.getKey();
            C99764tv r2 = (C99764tv) A11.getValue();
            if (!A06(C36421kH.A0N(((C100104uT) r2.A00).id_))) {
                if (r3 instanceof AnonymousClass144) {
                    this.A0D.A03((AnonymousClass144) r3, r2);
                }
                A0I(r3, r2, map);
                r5.A0W(r2);
            }
        }
        return r5;
    }

    public C99624th A09(AnonymousClass11F r6, boolean z) {
        String str;
        int i;
        AnonymousClass37Q BJC = this.A0I.BJC(r6, z);
        C99624th r3 = null;
        if (BJC != null && BJC.A01.equals("USER_PROVIDED") && (str = BJC.A02) != null && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                str = parse.getPath();
            }
            String A0A2 = A0A(C90524aI.A0S(str));
            if (A0A2 != null) {
                r3 = (C99624th) C99874u6.DEFAULT_INSTANCE.A0p();
                C99874u6 r1 = (C99874u6) C90524aI.A0H(r3);
                r1.bitField0_ |= 1;
                r1.filename_ = A0A2;
                Integer num = BJC.A00;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 100;
                }
                C99874u6 r12 = (C99874u6) C90524aI.A0H(r3);
                r12.bitField0_ |= 2;
                r12.opacity_ = i;
            }
        }
        return r3;
    }

    public void A0D() {
        C124255xq r2 = new C124255xq();
        r2.A00 = System.currentTimeMillis();
        r2.A05 = "android";
        r2.A06 = String.valueOf(Build.VERSION.SDK_INT);
        r2.A02 = "consumer";
        Objects.requireNonNull("2.24.6.77");
        r2.A03 = "2.24.6.77";
        r2.A04 = "1.0";
    }

    public void A0G(CancellationSignal cancellationSignal, C157427cw r19, File file) {
        C224214g r0 = new C224214g(false);
        r0.A03();
        this.A01 = 0;
        this.A0E.A01(0);
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        Objects.requireNonNull("2.24.6.77");
        try {
            FileOutputStream A0W = C90524aI.A0W(file);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(A0W);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry("messages.bin"));
                    file.getParentFile();
                    List A0B2 = A0B(cancellationSignal, r19, zipOutputStream);
                    zipOutputStream.closeEntry();
                    C121755tf r6 = new C121755tf();
                    r6.A00 = "messages.bin";
                    r6.A01 = "protobuf";
                    r6.A02 = A0B2;
                    zipOutputStream.putNextEntry(new ZipEntry("header.json"));
                    JSONObject A1B = C36441kJ.A1B();
                    JSONObject A1B2 = C36441kJ.A1B();
                    A1B2.put("creation_date", currentTimeMillis);
                    A1B2.put("os", "android");
                    A1B2.put("os_version", valueOf);
                    A1B2.put("app_name", "consumer");
                    A1B2.put("app_version", "2.24.6.77");
                    A1B2.put("format_version", "1.0");
                    JSONObject A0x = C90484aE.A0x(A1B2, "header", A1B);
                    A1B.put("messages", A0x);
                    A0x.put("filename", r6.A00);
                    A0x.put("format", r6.A01);
                    JSONArray A0u = C90524aI.A0u();
                    A0x.put("chunks", A0u);
                    List<C119845qY> list = r6.A02;
                    if (list != null) {
                        for (C119845qY r62 : list) {
                            JSONObject A1B3 = C36441kJ.A1B();
                            A1B3.put("chunk_number", r62.A00);
                            A1B3.put("messages_count", r62.A01);
                            A0u.put(A1B3);
                        }
                    }
                    zipOutputStream.write(A1B.toString(4).getBytes(DefaultCrypto.UTF_8));
                    zipOutputStream.closeEntry();
                    zipOutputStream.close();
                    A0W.close();
                    long A002 = r0.A00();
                    Locale locale = Locale.US;
                    Object[] A1Q = C36441kJ.A1Q();
                    AnonymousClass000.A1M(A1Q, 0, TimeUnit.MILLISECONDS.toHours(A002));
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    AnonymousClass000.A1M(A1Q, 1, timeUnit.toMinutes(A002) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(A002)));
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    AnonymousClass000.A1M(A1Q, 2, timeUnit2.toSeconds(A002) - TimeUnit.MINUTES.toSeconds(timeUnit2.toMinutes(A002)));
                    C36321k7.A1Q("exportMessages - messages exporting is completed, consumed time: ", String.format(locale, "%02d:%02d:%02d", A1Q), AnonymousClass000.A0u());
                } catch (IOException | JSONException e) {
                    Log.e("Failed to write header information.", e);
                    throw e;
                } catch (Throwable th) {
                    zipOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                A0W.close();
                throw th2;
            }
        } catch (JSONException e2) {
            this.A0E.A00(1);
            Log.e("Failed to write metadata; data export is not completed.");
            file.delete();
            throw new IOException("Failed to write metadata; data export is not completed.", e2);
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    public void A0H(CancellationSignal cancellationSignal, File file) {
        A0G(cancellationSignal, new C146876wJ(this), file);
    }

    public void A0J(C99744tt r4) {
        C100084uR A0S;
        int i;
        if (this.A0C.A0E(7279)) {
            C99754tu r1 = (C99754tu) C99834u2.DEFAULT_INSTANCE.A0p();
            r1.A0V(this.A05.A03());
            r1.A0U(this.A06.A00());
            C99834u2 r12 = (C99834u2) r1.A0R();
            A0S = C90504aG.A0S(r4);
            int i2 = C100084uR.AUTO_DOWNLOAD_CELLULAR_FIELD_NUMBER;
            r12.getClass();
            A0S.chatLockSettings_ = r12;
            i = A0S.bitField0_ | 262144;
        } else {
            A0S = C90504aG.A0S(r4);
            int i3 = C100084uR.AUTO_DOWNLOAD_CELLULAR_FIELD_NUMBER;
            A0S.chatLockSettings_ = null;
            i = A0S.bitField0_ & -262145;
        }
        A0S.bitField0_ = i;
    }

    public void A0K(C99784tx r6) {
        AnonymousClass5UF A002;
        C99744tt r4 = (C99744tt) C100084uR.DEFAULT_INSTANCE.A0p();
        C99624th A092 = A09((AnonymousClass11F) null, false);
        if (A092 != null) {
            C100084uR A0S = C90504aG.A0S(r4);
            C99874u6 r0 = (C99874u6) A092.A0R();
            r0.getClass();
            A0S.lightThemeWallpaper_ = r0;
            A0S.bitField0_ |= 1;
        }
        C99624th A093 = A09((AnonymousClass11F) null, true);
        if (A093 != null) {
            C100084uR A0S2 = C90504aG.A0S(r4);
            C99874u6 r02 = (C99874u6) A093.A0R();
            r02.getClass();
            A0S2.darkThemeWallpaper_ = r02;
            A0S2.bitField0_ |= 4;
        }
        int i = this.A0H.A0R().A03;
        if (i == 0) {
            A002 = AnonymousClass5UF.DEFAULT;
        } else {
            A002 = AnonymousClass5UF.A00(i);
        }
        C100084uR A0S3 = C90504aG.A0S(r4);
        A0S3.mediaVisibility_ = A002.value;
        A0S3.bitField0_ |= 2;
        C99954uE A022 = A02(C36341k9.A0E(this.A08).getInt("autodownload_wifi_mask", 15));
        if (A022 != null) {
            C100084uR A0S4 = C90504aG.A0S(r4);
            A0S4.autoDownloadWiFi_ = A022;
            A0S4.bitField0_ |= 8;
        }
        C99954uE A023 = A02(this.A08.A05());
        if (A023 != null) {
            C100084uR A0S5 = C90504aG.A0S(r4);
            A0S5.autoDownloadCellular_ = A023;
            A0S5.bitField0_ |= 16;
        }
        C99954uE A024 = A02(C36371kC.A01(C36341k9.A0E(this.A08), "autodownload_roaming_mask"));
        if (A024 != null) {
            C100084uR A0S6 = C90504aG.A0S(r4);
            A0S6.autoDownloadRoaming_ = A024;
            A0S6.bitField0_ |= 32;
        }
        this.A0H.A0R();
        boolean z = !this.A0H.A0R().A0C();
        C100084uR A0S7 = C90504aG.A0S(r4);
        A0S7.bitField0_ |= 64;
        A0S7.showIndividualNotificationsPreview_ = z;
        C100014uK A042 = A04(this.A0H.A0R());
        C100084uR A0S8 = C90504aG.A0S(r4);
        A042.getClass();
        A0S8.individualNotificationSettings_ = A042;
        A0S8.bitField0_ |= 65536;
        this.A0H.A0Q();
        boolean z2 = !this.A0H.A0Q().A0C();
        C100084uR A0S9 = C90504aG.A0S(r4);
        A0S9.bitField0_ |= 128;
        A0S9.showGroupNotificationsPreview_ = z2;
        C100014uK A043 = A04(this.A0H.A0Q());
        C100084uR A0S10 = C90504aG.A0S(r4);
        A043.getClass();
        A0S10.groupNotificationSettings_ = A043;
        A0S10.bitField0_ |= C132986Wc.A0F;
        AnonymousClass6OQ A003 = this.A0G.A00();
        if (!(A003 == null || A003.A04.A00 == null || A003.A05.A00 == null)) {
            C99844u3 A032 = A03(A003);
            C100084uR A0S11 = C90504aG.A0S(r4);
            A032.getClass();
            A0S11.avatarUserSettings_ = A032;
            A0S11.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        int A004 = AnonymousClass6R8.A00(C36341k9.A0E(this.A08).getString("interface_font_size", "0"), 0);
        C100084uR A0S12 = C90504aG.A0S(r4);
        A0S12.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        A0S12.fontSize_ = A004;
        boolean A2C = this.A08.A2C();
        C100084uR A0S13 = C90504aG.A0S(r4);
        A0S13.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        A0S13.securityNotifications_ = A2C;
        boolean A2G = this.A08.A2G();
        C100084uR A0S14 = C90504aG.A0S(r4);
        A0S14.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
        A0S14.autoUnarchiveChats_ = A2G;
        int A012 = C36371kC.A01(C36341k9.A0E(this.A08), "video_quality");
        C100084uR A0S15 = C90504aG.A0S(r4);
        A0S15.bitField0_ |= 16384;
        A0S15.videoQualityMode_ = A012;
        int A0J2 = this.A08.A0J();
        C100084uR A0S16 = C90504aG.A0S(r4);
        A0S16.bitField0_ |= 32768;
        A0S16.photoQualityMode_ = A0J2;
        A0J(r4);
        C100064uP r2 = (C100064uP) C90524aI.A0H(r6);
        C100084uR r1 = (C100084uR) r4.A0R();
        int i2 = C100064uP.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r1.getClass();
        r2.globalSettings_ = r1;
        r2.bitField0_ |= 8;
    }

    public boolean A0L(AnonymousClass3T1 r7) {
        C65013Qj r1;
        String A0A2;
        long j = this.A02 + 1;
        this.A02 = j;
        int i = (int) ((((double) j) * 100.0d) / ((double) this.A00));
        if (this.A01 != i) {
            this.A01 = i;
            this.A0E.A01(i);
        }
        if (r7 instanceof AnonymousClass2bU) {
            AnonymousClass11F r12 = r7.A1J.A00;
            if (!(r12 instanceof C177528dw) && !AnonymousClass143.A0K(r12) && (r1 = ((AnonymousClass2bU) r7).A01) != null && (A0A2 = A0A(r1.A0I)) != null) {
                r1.A0I = C90524aI.A0S(A0A2);
                return true;
            }
        }
        return false;
    }

    public C133236Xj(C19970wo r2, C20810yC r3, C19700wN r4, C220412q r5, AnonymousClass17T r6, AnonymousClass1HI r7, AnonymousClass1CR r8, AnonymousClass12P r9, C19420v0 r10, AnonymousClass6F6 r11, AnonymousClass1CQ r12, C25731Hl r13, AnonymousClass5FY r14, AnonymousClass1XW r15, C25751Hn r16, AnonymousClass17Z r17) {
        this.A03 = r2;
        this.A0C = r3;
        this.A04 = r4;
        this.A09 = r5;
        this.A0B = r6;
        this.A0D = r7;
        this.A0H = r8;
        this.A08 = r10;
        this.A0A = r9;
        this.A0F = r11;
        this.A0I = r12;
        this.A05 = r13;
        this.A0E = r14;
        this.A0G = r15;
        this.A06 = r16;
        this.A07 = r17;
    }

    public static int A01(String str) {
        return str.hashCode() & Integer.MAX_VALUE;
    }

    public List A0B(CancellationSignal cancellationSignal, C157427cw r16, OutputStream outputStream) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        long j = 1;
        long A012 = this.A0B.A01() + 1;
        this.A00 = (long) this.A0B.A00(1, A012);
        this.A02 = 0;
        Map A0C2 = A0C();
        int i = 0;
        while (j < A012) {
            cancellationSignal.throwIfCanceled();
            C119845qY r3 = new C119845qY();
            Cursor A072 = ((C146876wJ) r16).A00.A0E(5000, j, A012, System.currentTimeMillis());
            if (A072 == null) {
                break;
            }
            try {
                r3.A01 = (long) A072.getCount();
                if (A072.moveToLast()) {
                    j = C36351kA.A07(A072, "_id");
                    A072.moveToFirst();
                    A072.move(-1);
                    C99784tx A082 = A08(A072, cancellationSignal, A0C2);
                    if (A082 != null) {
                        A082.A0U(i);
                        if (i == 0) {
                            A0K(A082);
                        }
                        ((C100064uP) A082.A0R()).A0m(outputStream);
                        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
                        r3.A00 = i;
                        A0I2.add(r3);
                        i++;
                        A072.close();
                    }
                }
                A072.close();
                return A0I2;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        return A0I2;
    }

    public Map A0C() {
        long j;
        HashMap A0J2 = AnonymousClass001.A0J();
        Set<Jid> A0X = this.A0H.A0X();
        if (A0X.size() != 0) {
            ArrayList A14 = C36441kJ.A14(A0X.size());
            for (Jid jid : A0X) {
                AnonymousClass3LI A0d = C36361kB.A0d(jid, this.A0H);
                if (A0d.A0I) {
                    j = A0d.A06;
                } else {
                    j = 0;
                }
                C36361kB.A1O(jid, Long.valueOf(j), A14);
            }
            Collections.sort(A14, AnonymousClass769.A00);
            int i = 0;
            while (i < A14.size()) {
                i++;
                C36341k9.A1K(((Pair) A14.get(i)).first, A0J2, i);
            }
        }
        return A0J2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r2 != 0) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b A[PHI: r0 
      PHI: (r0v6 X.4th) = (r0v5 X.4th), (r0v9 X.4th) binds: [B:14:0x0063, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.AnonymousClass11F r8, X.C99764tv r9, java.util.Map r10) {
        /*
            r7 = this;
            java.lang.Number r0 = X.C90524aI.A0b(r8, r10)
            if (r0 == 0) goto L_0x001b
            int r3 = r0.intValue()
            X.8Hz r2 = X.C90524aI.A0H(r9)
            X.4uT r2 = (X.C100104uT) r2
            int r0 = X.C100104uT.ARCHIVED_FIELD_NUMBER
            int r1 = r2.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.pinned_ = r3
        L_0x001b:
            X.1CR r0 = r7.A0H
            X.3LI r6 = X.C36361kB.A0d(r8, r0)
            long r2 = r6.A00()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x008c
            long r2 = X.C36391kE.A0B(r2)
        L_0x002f:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
        L_0x0033:
            X.8Hz r4 = X.C90524aI.A0H(r9)
            X.4uT r4 = (X.C100104uT) r4
            int r0 = X.C100104uT.ARCHIVED_FIELD_NUMBER
            int r1 = r4.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.muteEndTime_ = r2
        L_0x0044:
            int r1 = r6.A03
            r3 = 1
            if (r1 != r3) goto L_0x0086
            X.5UF r1 = X.AnonymousClass5UF.OFF
        L_0x004b:
            X.8Hz r2 = X.C90524aI.A0H(r9)
            X.4uT r2 = (X.C100104uT) r2
            int r0 = X.C100104uT.ARCHIVED_FIELD_NUMBER
            int r0 = r1.value
            r2.mediaVisibility_ = r0
            int r1 = r2.bitField0_
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x005e:
            r0 = 0
            X.4th r0 = r7.A09(r8, r0)
            if (r0 != 0) goto L_0x006b
            X.4th r0 = r7.A09(r8, r3)
            if (r0 == 0) goto L_0x0085
        L_0x006b:
            X.8Hz r2 = X.C90524aI.A0H(r9)
            X.4uT r2 = (X.C100104uT) r2
            X.8Hz r1 = r0.A0R()
            X.4u6 r1 = (X.C99874u6) r1
            int r0 = X.C100104uT.ARCHIVED_FIELD_NUMBER
            r1.getClass()
            r2.wallpaper_ = r1
            int r1 = r2.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x0085:
            return
        L_0x0086:
            r0 = 2
            if (r1 != r0) goto L_0x005e
            X.5UF r1 = X.AnonymousClass5UF.ON
            goto L_0x004b
        L_0x008c:
            if (r0 >= 0) goto L_0x002f
            r2 = 64092211200(0xeec318800, double:3.166575972E-313)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133236Xj.A0I(X.11F, X.4tv, java.util.Map):void");
    }

    public void A0F(long j) {
        this.A00 = j;
    }
}
