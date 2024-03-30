package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Xk  reason: invalid class name and case insensitive filesystem */
public class C133246Xk {
    public static final int A0W = 3;
    public static final int A0X = 30;
    public static final String A0Y = "MessagesImporter/";
    public final C19700wN A00;
    public final C20690y0 A01;
    public final C24041Av A02;
    public final C25731Hl A03;
    public final C25751Hn A04;
    public final C29911Yl A05;
    public final AnonymousClass1DM A06;
    public final AnonymousClass179 A07;
    public final C19970wo A08;
    public final C19420v0 A09;
    public final C220712t A0A;
    public final AnonymousClass163 A0B;
    public final C220412q A0C;
    public final AnonymousClass17S A0D;
    public final C26891Lx A0E;
    public final C232317r A0F;
    public final AnonymousClass1FN A0G;
    public final AnonymousClass1QP A0H;
    public final AnonymousClass17T A0I;
    public final AnonymousClass17U A0J;
    public final C26171Jd A0K;
    public final C20810yC A0L;
    public final C30661aZ A0M;
    public final C132986Wc A0N;
    public final AnonymousClass6JO A0O;
    public final AnonymousClass5FW A0P;
    public final AnonymousClass6T9 A0Q;
    public final AnonymousClass1XW A0R;
    public final AnonymousClass1CR A0S;
    public final AnonymousClass1CQ A0T;
    public final AnonymousClass1A1 A0U;
    public final AnonymousClass005 A0V;

    public static int A00(C99954uE r3) {
        int i = 0;
        if (r3 == null) {
            return 0;
        }
        int i2 = r3.bitField0_;
        if ((i2 & 1) != 0 && r3.downloadImages_) {
            i = 1;
        }
        if ((i2 & 2) != 0 && r3.downloadAudio_) {
            i |= 2;
        }
        if ((i2 & 4) != 0 && r3.downloadVideo_) {
            i |= 4;
        }
        if ((i2 & 8) == 0 || !r3.downloadDocuments_) {
            return i;
        }
        return i | 8;
    }

    public AnonymousClass3T1 A08(C172848Pk r6) {
        if (r6 == null) {
            AnonymousClass6JO.A01(this.A0O, "import/msg/failed");
            Log.e("MessagesImporter/Conversation message is null.");
            return null;
        }
        AnonymousClass8SU r3 = r6.message_;
        if (r3 == null) {
            r3 = AnonymousClass8SU.DEFAULT_INSTANCE;
        }
        try {
            return this.A0M.A02(new C1275768v(AnonymousClass5SH.FOR_CHAT_TRANSFER), r3);
        } catch (Exception e) {
            AnonymousClass6JO.A01(this.A0O, "import/msg/failed");
            A04(r3, "Failed to parse message from WMI.", e);
            return null;
        }
    }

    public void A0C(CancellationSignal cancellationSignal, C65073Qp r9, AnonymousClass7h3 r10, AnonymousClass8SU r11, AnonymousClass3T1 r12, byte[] bArr) {
        A0J(cancellationSignal, r10, r11, r12, bArr);
        if (r12.A1J.A02) {
            A0M(r9, r11, r12);
        }
        if (C66013Ui.A0w(r12, true)) {
            synchronized (r9) {
                r9.A0c = r12;
            }
            long j = r12.A1N;
            synchronized (r9) {
                r9.A0N = j;
            }
            long j2 = r12.A1O;
            synchronized (r9) {
                r9.A0O = j2;
            }
            r9.A0E(r12.A1O);
            r9.A0D(r12.A1N);
            C52152oy r1 = r12.A0L;
            if (r9.A0Z == null) {
                r9.A0Z = r1;
            }
        }
        if (r12.A0I > r9.A03()) {
            r9.A0F(r12.A0I);
        }
    }

    public void A0N(AnonymousClass11F r13, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.A0A.A05((C52152oy) null, r13, new C1497272n(countDownLatch, 16), str, false);
            countDownLatch.await(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("MessagesImporter/Chat creation interrupted.", e);
        }
        if (countDownLatch.getCount() > 0) {
            throw new AnonymousClass5R7(1, AnonymousClass000.A0l(r13, "Failed to create chat for ", AnonymousClass000.A0u()));
        }
    }

    public static InputStream A02(String str, String str2) {
        File A0S2 = C90524aI.A0S(str);
        if (A0S2.exists()) {
            ZipInputStream zipInputStream = new ZipInputStream(C90524aI.A0U(A0S2));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    if (nextEntry.getName().equalsIgnoreCase(str2)) {
                        return zipInputStream;
                    }
                }
                try {
                    zipInputStream.close();
                } catch (IOException unused) {
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                C36321k7.A1O("Failed to find entry '", str2, "' in '", str, A0u);
                throw C90524aI.A0V(AnonymousClass000.A0q("' archive.", A0u));
            } catch (IOException e) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                C36321k7.A1O("MessagesImporter/Failed to read entry '", str2, "' in '", str, A0u2);
                C36351kA.A1Q("' archive.", A0u2, e);
                StringBuilder A0u3 = AnonymousClass000.A0u();
                C36321k7.A1O("MessagesImporter/Failed to read entry '", str2, "' in '", str, A0u3);
                throw new IOException(AnonymousClass000.A0q("' archive.", A0u3), e);
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } else {
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("Unable to locate input data file '");
            A0u4.append(str);
            throw C90524aI.A0V(AnonymousClass000.A0q("'.", A0u4));
        }
    }

    private void A04(AnonymousClass8SU r6, String str, Throwable th) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        AnonymousClass8SW r0 = r6.key_;
        if (r0 == null) {
            r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
        }
        objArr[1] = r0.id_;
        objArr[2] = r6.A0u();
        C36341k9.A1T(objArr, r6.messageStubParameters_.size());
        String format = String.format(locale, "%s; key=%s, stub_type=%s, params=%d", objArr);
        C90464aC.A1L(A0Y, format, AnonymousClass000.A0u(), th);
        if (th != null) {
            this.A00.A0D("xpm-msg-importer-parsing-failed", AnonymousClass000.A0l(th, "; ex=", AnonymousClass000.A0v(format)), th);
        } else {
            this.A00.A0E("xpm-msg-importer-parsing-failed", format, false);
        }
    }

    public C65073Qp A07(CancellationSignal cancellationSignal, AnonymousClass11F r23, AnonymousClass7h3 r24, C100104uT r25, Map map, Map map2, byte[] bArr) {
        int i;
        int i2;
        long j;
        int i3;
        AnonymousClass5UC r0;
        AnonymousClass11F r6 = r23;
        C65073Qp A092 = this.A0C.A09(r6, false);
        Boolean bool = null;
        long j2 = 0;
        int i4 = 0;
        C100104uT r5 = r25;
        if (A092 == null) {
            A0N(r6, r5.name_);
            if (r6 instanceof UserJid) {
                int i5 = r5.bitField0_;
                if (!((262144 & i5) == 0 || (i5 & 524288) == 0)) {
                    this.A06.A04((UserJid) r6, r5.tcToken_.A06(), r5.tcTokenTimestamp_);
                }
                if ((r5.bitField0_ & 33554432) != 0) {
                    this.A06.A0B((UserJid) r6, r5.tcTokenSenderTimestamp_);
                }
            }
            if (r5.messages_.size() > 0) {
                AnonymousClass8SU r02 = ((C172848Pk) r5.messages_.get(0)).message_;
                if (r02 == null) {
                    r02 = AnonymousClass8SU.DEFAULT_INSTANCE;
                }
                j = r02.messageTimestamp_ * 1000;
            } else {
                j = 0;
            }
            A092 = this.A0C.A09(r6, false);
            if (A092 == null) {
                return null;
            }
            this.A0B.A0K(A092.A05(Long.valueOf(j)), A092);
            AnonymousClass11F r17 = r6;
            A0E(cancellationSignal, r17, r24, r5, bArr);
            if (r6 instanceof AnonymousClass144) {
                for (C99914uA r1 : r5.participant_) {
                    UserJid A0l = C36431kI.A0l(r1.userJid_);
                    if (A0l != null) {
                        if ((r1.bitField0_ & 2) != 0) {
                            int i6 = r1.rank_;
                            if (i6 != 0) {
                                if (i6 == 1) {
                                    r0 = AnonymousClass5UC.ADMIN;
                                } else if (i6 == 2) {
                                    r0 = AnonymousClass5UC.SUPERADMIN;
                                }
                                i3 = r0.value;
                            }
                            r0 = AnonymousClass5UC.REGULAR;
                            i3 = r0.value;
                        } else {
                            i3 = 0;
                        }
                        C223113u r03 = DeviceJid.Companion;
                        DeviceJid primaryDevice = A0l.getPrimaryDevice();
                        C18740tg.A06(primaryDevice);
                        this.A0F.A0H(new AnonymousClass6PM(A0l, Collections.singleton(new AnonymousClass6B1(primaryDevice, true, true)), i3, false), (AnonymousClass144) r6);
                    }
                }
            }
        }
        if ((r5.bitField0_ & DefaultCrypto.BUFFER_SIZE) == 0) {
            A092.A0B(0);
        } else if (r5.notSpam_) {
            A092.A0B(1);
        } else {
            A092.A0B(-1);
        }
        synchronized (A092) {
            A092.A00 = 1;
        }
        synchronized (A092) {
            A092.A0B = -1;
        }
        A092.A0F(r5.conversationTimestamp_ * 1000);
        if ((r5.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            String str = r5.name_;
            synchronized (A092) {
                A092.A0h = str;
            }
        }
        int i7 = r5.bitField0_;
        if ((i7 & 16384) != 0) {
            A092.A0i = r5.archived_;
        }
        if ((i7 & 128) != 0) {
            i = r5.ephemeralExpiration_;
        } else {
            i = 0;
        }
        if ((i7 & 256) != 0) {
            j2 = r5.ephemeralSettingTimestamp_;
        }
        if ((i7 & 32768) != 0) {
            AnonymousClass8SK r04 = r5.disappearingMode_;
            AnonymousClass8SK r7 = r04;
            if (r04 == null) {
                r04 = AnonymousClass8SK.DEFAULT_INSTANCE;
            }
            i4 = Math.min(3, Math.max(0, r04.A0u().value));
            AnonymousClass8SK r05 = r7;
            if (r7 == null) {
                r05 = AnonymousClass8SK.DEFAULT_INSTANCE;
            }
            AnonymousClass919 A002 = AnonymousClass919.A00(r05.trigger_);
            if (A002 == null) {
                A002 = AnonymousClass919.UNKNOWN;
            }
            i2 = AnonymousClass9Zc.A00(A002);
            if (r7 == null) {
                r7 = AnonymousClass8SK.DEFAULT_INSTANCE;
            }
            bool = Boolean.valueOf(r7.initiatedByMe_);
        } else {
            i2 = 0;
        }
        C80103un r12 = A092.A0b;
        A092.A0C(Math.max(r12.expiration, i), Math.max(r12.ephemeralSettingTimestamp, j2), i4);
        if (this.A0L.A0E(5309)) {
            A092.A0I(bool, i2);
        }
        map.put(r6, A092);
        map2.put(r6, r5);
        return A092;
    }

    public void A0A() {
        throw C90524aI.A0X("Unsupported build version.");
    }

    public void A0B(CancellationSignal cancellationSignal) {
        A0H(cancellationSignal, new C146886wK(this.A0N));
    }

    public void A0E(CancellationSignal cancellationSignal, AnonymousClass11F r16, AnonymousClass7h3 r17, C100104uT r18, byte[] bArr) {
        C100104uT r2 = r18;
        if ((r2.bitField0_ & 8388608) != 0) {
            AnonymousClass11F r3 = r16;
            if (this.A0T.BJC(r3, true) == null) {
                C99874u6 r5 = r2.wallpaper_;
                if (r5 == null) {
                    r5 = C99874u6.DEFAULT_INSTANCE;
                }
                AnonymousClass7h3 r4 = r17;
                byte[] bArr2 = bArr;
                A0F(cancellationSignal, r3, r4, r5, bArr2, false);
                A0F(cancellationSignal, r3, r4, r5, bArr2, true);
            }
        }
    }

    public void A0F(CancellationSignal cancellationSignal, AnonymousClass11F r12, AnonymousClass7h3 r13, C99874u6 r14, byte[] bArr, boolean z) {
        StringBuilder sb;
        String str;
        int i;
        String str2 = r14.filename_;
        if (!TextUtils.isEmpty(str2)) {
            String A082 = this.A07.A08(C90524aI.A0S(str2));
            try {
                File A092 = A09(A082, 1, true);
                if (!A092.exists()) {
                    try {
                        A0L(cancellationSignal, r13, A092, A082, bArr);
                        AnonymousClass6JO.A01(this.A0O, "import/msg/file/success");
                    } catch (IOException e) {
                        e = e;
                        AnonymousClass6JO.A01(this.A0O, "import/msg/file/failed");
                        sb = AnonymousClass000.A0u();
                        str = "MessagesImporter/cannot import file for wallpaper, file=";
                    }
                }
                if ((r14.bitField0_ & 2) != 0) {
                    i = r14.opacity_;
                } else {
                    i = 100;
                }
                try {
                    this.A0T.BpI(r12, new AnonymousClass37Q(Integer.valueOf(i), "USER_PROVIDED", A092.getCanonicalPath()), z);
                } catch (IOException e2) {
                    e = e2;
                    sb = AnonymousClass000.A0u();
                    str = "MessagesImporter/cannot get path for imported file, file=";
                    C90464aC.A1L(str, A082, sb, e);
                }
            } catch (IOException e3) {
                e = e3;
                sb = AnonymousClass000.A0u();
                str = "MessagesImporter/cannot get corrected media file for wallpaper, file=";
                C90464aC.A1L(str, A082, sb, e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        r17 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(android.os.CancellationSignal r26, X.C121755tf r27, X.AnonymousClass7h3 r28, java.lang.String r29) {
        /*
            r25 = this;
            java.lang.String r16 = "Failed to parse serialized messages file."
            java.lang.String r12 = "MessagesImporter/Failed to parse serialized messages file."
            r13 = r27
            java.util.List r0 = r13.A02
            if (r0 == 0) goto L_0x00e6
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00e6
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r11 = new byte[r0]
            java.util.List r0 = r13.A02
            int r10 = A01(r0)
            java.util.HashMap r9 = X.AnonymousClass001.A0J()
            java.util.HashMap r8 = X.AnonymousClass001.A0J()
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            java.lang.String r0 = r13.A00
            r1 = r29
            java.io.InputStream r6 = A02(r1, r0)
            r5 = 0
            r4 = 0
        L_0x0031:
            java.util.List r0 = r13.A02     // Catch:{ all -> 0x00dc }
            int r0 = r0.size()     // Catch:{ all -> 0x00dc }
            r3 = r25
            if (r4 >= r0) goto L_0x00d2
            java.util.List r0 = r13.A02     // Catch:{ all -> 0x00dc }
            r0.get(r4)     // Catch:{ all -> 0x00dc }
            X.4uP r0 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x00be }
            X.8Hz r2 = X.C170918Hz.A06(r0, r6)     // Catch:{ IOException -> 0x00be }
            X.4uP r2 = (X.C100064uP) r2     // Catch:{ IOException -> 0x00be }
            if (r2 == 0) goto L_0x00ca
            r18 = r26
            r20 = r28
            if (r4 != 0) goto L_0x0057
            r1 = r18
            r0 = r20
            r3.A0I(r1, r0, r2, r11)     // Catch:{ all -> 0x00dc }
        L_0x0057:
            r1 = 0
        L_0x0058:
            X.B6c r0 = r2.conversations_     // Catch:{ all -> 0x00dc }
            int r0 = r0.size()     // Catch:{ all -> 0x00dc }
            if (r1 >= r0) goto L_0x00ba
            X.B6c r0 = r2.conversations_     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00dc }
            X.4uT r0 = (X.C100104uT) r0     // Catch:{ all -> 0x00dc }
            boolean r14 = r3.A0V(r0)     // Catch:{ all -> 0x00dc }
            if (r14 == 0) goto L_0x0088
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00dc }
            java.lang.String r15 = "MessagesImporter/Skipping chat, messages count: "
            r14.append(r15)     // Catch:{ all -> 0x00dc }
            X.B6c r0 = r0.messages_     // Catch:{ all -> 0x00dc }
            int r0 = r0.size()     // Catch:{ all -> 0x00dc }
            X.C36321k7.A1Y(r14, r0)     // Catch:{ all -> 0x00dc }
            X.6JO r14 = r3.A0O     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "import/chat/skipped"
            X.AnonymousClass6JO.A01(r14, r0)     // Catch:{ all -> 0x00dc }
            goto L_0x00b7
        L_0x0088:
            java.lang.String r14 = r0.id_     // Catch:{ all -> 0x00dc }
            X.11F r19 = X.C36421kH.A0N(r14)     // Catch:{ all -> 0x00dc }
            if (r19 == 0) goto L_0x00b7
            r22 = r9
            r23 = r8
            r24 = r11
            r21 = r0
            r17 = r3
            X.3Qp r19 = r17.A07(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00dc }
            if (r19 == 0) goto L_0x00b7
            X.B6c r14 = r0.messages_     // Catch:{ all -> 0x00dc }
            r21 = r14
            r22 = r11
            r17.A0D(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00dc }
            r3.A0Q(r0, r7)     // Catch:{ all -> 0x00dc }
            X.B6c r0 = r0.messages_     // Catch:{ all -> 0x00dc }
            int r5 = X.C90524aI.A04(r0, r5)     // Catch:{ all -> 0x00dc }
            X.5FW r0 = r3.A0P     // Catch:{ all -> 0x00dc }
            r0.A00(r5, r10)     // Catch:{ all -> 0x00dc }
        L_0x00b7:
            int r1 = r1 + 1
            goto L_0x0058
        L_0x00ba:
            int r4 = r4 + 1
            goto L_0x0031
        L_0x00be:
            r2 = move-exception
            com.whatsapp.util.Log.e(r12, r2)     // Catch:{ all -> 0x00dc }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00dc }
            r0 = r16
            r1.<init>(r0, r2)     // Catch:{ all -> 0x00dc }
            goto L_0x00d1
        L_0x00ca:
            com.whatsapp.util.Log.e((java.lang.String) r12)     // Catch:{ all -> 0x00dc }
            java.io.IOException r1 = X.C90524aI.A0X(r16)     // Catch:{ all -> 0x00dc }
        L_0x00d1:
            throw r1     // Catch:{ all -> 0x00dc }
        L_0x00d2:
            r6.close()
            r3.A06(r9, r8)
            r3.A0U(r7)
            return
        L_0x00dc:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00e1 }
            throw r1
        L_0x00e1:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00e6:
            java.lang.String r0 = "MessagesImporter/Messages chunks are not specified."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "Messages chunks are not specified."
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133246Xk.A0G(android.os.CancellationSignal, X.5tf, X.7h3, java.lang.String):void");
    }

    public void A0H(CancellationSignal cancellationSignal, AnonymousClass7h3 r11) {
        String absolutePath = r11.getFile("migration/messages_export.zip").getAbsolutePath();
        try {
            InputStream A022 = A02(absolutePath, "header.json");
            try {
                JSONObject A0x = C90504aG.A0x(AnonymousClass0QO.A00(A022));
                JSONObject jSONObject = A0x.getJSONObject("header");
                C121755tf r2 = null;
                jSONObject.getLong("creation_date");
                jSONObject.getString("os");
                jSONObject.getString("os_version");
                jSONObject.getString("app_name");
                jSONObject.getString("app_version");
                jSONObject.getString("format_version");
                if (A0x.has("messages")) {
                    JSONObject jSONObject2 = A0x.getJSONObject("messages");
                    r2 = new C121755tf();
                    r2.A00 = jSONObject2.getString("filename");
                    r2.A01 = jSONObject2.getString("format");
                    if (jSONObject2.has("chunks")) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("chunks");
                        ArrayList A0I2 = AnonymousClass001.A0I();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                            C119845qY r4 = new C119845qY();
                            r4.A00 = jSONObject3.getInt("chunk_number");
                            r4.A01 = (long) jSONObject3.getInt("messages_count");
                            A0I2.add(r4);
                        }
                        r2.A02 = A0I2;
                    }
                }
                A022.close();
                if (r2 != null && !TextUtils.isEmpty(r2.A00) && "protobuf".equalsIgnoreCase(r2.A01)) {
                    A0G(cancellationSignal, r2, r11, absolutePath);
                }
            } catch (IOException | JSONException e) {
                throw new IOException("Unable to parse JSON header.", e);
            } catch (Throwable th) {
                A022.close();
                throw th;
            }
        } catch (IOException e2) {
            throw new AnonymousClass5R7("Unable to locate header metadata file in messages archive.", e2, 202);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0I(CancellationSignal cancellationSignal, AnonymousClass7h3 r15, C100064uP r16, byte[] bArr) {
        C100064uP r1 = r16;
        if ((r1.bitField0_ & 8) != 0) {
            C100084uR r2 = r1.globalSettings_;
            if (r2 == null) {
                r2 = C100084uR.DEFAULT_INSTANCE;
            }
            CancellationSignal cancellationSignal2 = cancellationSignal;
            AnonymousClass7h3 r9 = r15;
            byte[] bArr2 = bArr;
            if ((r2.bitField0_ & 1) != 0) {
                C99874u6 r10 = r2.lightThemeWallpaper_;
                if (r10 == null) {
                    r10 = C99874u6.DEFAULT_INSTANCE;
                }
                A0F(cancellationSignal2, (AnonymousClass11F) null, r9, r10, bArr2, false);
            }
            if ((r2.bitField0_ & 4) != 0) {
                C99874u6 r102 = r2.darkThemeWallpaper_;
                if (r102 == null) {
                    r102 = C99874u6.DEFAULT_INSTANCE;
                }
                A0F(cancellationSignal2, (AnonymousClass11F) null, r9, r102, bArr2, true);
            }
            if (AnonymousClass000.A1P(r2.bitField0_ & 2)) {
                AnonymousClass5UF A002 = AnonymousClass5UF.A00(r2.mediaVisibility_);
                if (A002 == null) {
                    A002 = AnonymousClass5UF.DEFAULT;
                }
                if (A002 != AnonymousClass5UF.DEFAULT) {
                    AnonymousClass1CR r5 = this.A0S;
                    int i = 1;
                    if (C36361kB.A1a(A002, AnonymousClass5UF.ON)) {
                        i = 2;
                    }
                    AnonymousClass3LI A022 = AnonymousClass1CR.A02(r5, "individual_chat_defaults");
                    if (i != A022.A03) {
                        A022.A03 = i;
                        AnonymousClass1CR.A06(A022, r5);
                    }
                }
            }
            if ((r2.bitField0_ & 8) != 0) {
                C19420v0 r12 = this.A09;
                C99954uE r0 = r2.autoDownloadWiFi_;
                if (r0 == null) {
                    r0 = C99954uE.DEFAULT_INSTANCE;
                }
                C36341k9.A0v(C19420v0.A00(r12), "autodownload_wifi_mask", A00(r0));
            }
            if ((r2.bitField0_ & 16) != 0) {
                C19420v0 r13 = this.A09;
                C99954uE r02 = r2.autoDownloadCellular_;
                if (r02 == null) {
                    r02 = C99954uE.DEFAULT_INSTANCE;
                }
                C36341k9.A0v(C19420v0.A00(r13), "autodownload_cellular_mask", A00(r02));
            }
            if ((r2.bitField0_ & 32) != 0) {
                C19420v0 r14 = this.A09;
                C99954uE r03 = r2.autoDownloadRoaming_;
                if (r03 == null) {
                    r03 = C99954uE.DEFAULT_INSTANCE;
                }
                C36341k9.A0v(C19420v0.A00(r14), "autodownload_roaming_mask", A00(r03));
            }
            if ((r2.bitField0_ & 64) != 0) {
                this.A0S.A0g(!r2.showIndividualNotificationsPreview_);
            }
            if ((r2.bitField0_ & 128) != 0) {
                this.A0S.A0f(true ^ r2.showGroupNotificationsPreview_);
            }
            if ((r2.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                C99844u3 r04 = r2.avatarUserSettings_;
                if (r04 == null) {
                    r04 = C99844u3.DEFAULT_INSTANCE;
                }
                A0P(r04);
            }
            if ((r2.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                C36341k9.A0x(C19420v0.A00(this.A09), "interface_font_size", String.valueOf(r2.fontSize_));
            }
            if ((r2.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                C19420v0 r05 = this.A09;
                C36331k8.A0w(C19420v0.A00(r05), "security_notifications", r2.securityNotifications_);
            }
            if ((r2.bitField0_ & DefaultCrypto.BUFFER_SIZE) != 0) {
                C19420v0 r06 = this.A09;
                C36331k8.A0w(C19420v0.A00(r06), "notify_new_message_for_archived_chats", r2.autoUnarchiveChats_);
            }
            if ((r2.bitField0_ & 16384) != 0) {
                C19420v0 r07 = this.A09;
                C36341k9.A0v(C19420v0.A00(r07), "video_quality", r2.videoQualityMode_);
            }
            if ((r2.bitField0_ & 32768) != 0) {
                C19420v0 r08 = this.A09;
                C36341k9.A0v(C19420v0.A00(r08), "photo_quality", r2.photoQualityMode_);
            }
            if ((r2.bitField0_ & 65536) != 0) {
                C100014uK r09 = r2.individualNotificationSettings_;
                if (r09 == null) {
                    r09 = C100014uK.DEFAULT_INSTANCE;
                }
                A0S(r09);
            }
            if ((r2.bitField0_ & C132986Wc.A0F) != 0) {
                C100014uK r010 = r2.groupNotificationSettings_;
                if (r010 == null) {
                    r010 = C100014uK.DEFAULT_INSTANCE;
                }
                A0R(r010);
            }
            if ((r2.bitField0_ & 262144) != 0) {
                C99834u2 r011 = r2.chatLockSettings_;
                if (r011 == null) {
                    r011 = C99834u2.DEFAULT_INSTANCE;
                }
                A0O(r011);
            }
        }
    }

    public void A0J(CancellationSignal cancellationSignal, AnonymousClass7h3 r6, AnonymousClass8SU r7, AnonymousClass3T1 r8, byte[] bArr) {
        try {
            if (r8.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
                this.A05.Blm(r7, r8);
            }
            r8.A0j(16384);
            if (r8 instanceof AnonymousClass2bU) {
                A0K(cancellationSignal, r6, (AnonymousClass2bU) r8, bArr);
            } else if (r8 instanceof AnonymousClass2bI) {
                A0T((AnonymousClass2bI) r8);
            }
            AnonymousClass3T1 A0S2 = r8.A0S();
            if (A0S2 != null && (A0S2 instanceof AnonymousClass2bU)) {
                A0K(cancellationSignal, r6, (AnonymousClass2bU) A0S2, bArr);
            }
            if (r8.A1G()) {
                this.A0D.A04(r8, r8.A0I);
            }
            this.A0U.A04(r8);
            AnonymousClass6JO.A01(this.A0O, "import/msg/success");
            this.A0K.A0J(r8);
        } catch (Exception e) {
            AnonymousClass6JO.A01(this.A0O, "import/msg/failed");
            Log.e("MessagesImporter/Failed to insert message.", e);
            this.A00.A0D("xpm-msg-importer-insert-failed", AnonymousClass000.A0l(e, "Failed to insert message: ", AnonymousClass000.A0u()), e);
        }
    }

    public void A0K(CancellationSignal cancellationSignal, AnonymousClass7h3 r14, AnonymousClass2bU r15, byte[] bArr) {
        File file;
        boolean z;
        C65013Qj r3 = r15.A01;
        if (r3 != null && (file = r3.A0I) != null) {
            String A082 = this.A07.A08(file);
            File A092 = A09(A082, r15.A1I, r15.A1J.A02);
            if (!A092.exists()) {
                try {
                    A0L(cancellationSignal, r14, A092, A082, bArr);
                    AnonymousClass6JO.A01(this.A0O, "import/msg/file/success");
                } catch (IOException e) {
                    AnonymousClass6JO.A01(this.A0O, "import/msg/file/failed");
                    C90464aC.A1L("MessagesImporter/processMediaMessage; cannot import file for message, file=", A082, AnonymousClass000.A0u(), e);
                    z = true;
                }
            }
            z = false;
            if (!A092.exists() || z) {
                r3.A0I = null;
                r3.A0V = false;
                return;
            }
            this.A02.A06(A092, 1, true);
            r3.A0I = A092;
            r3.A0V = true;
        }
    }

    public void A0M(C65073Qp r31, AnonymousClass8SU r32, AnonymousClass3T1 r33) {
        HashSet hashSet;
        boolean z;
        AnonymousClass1M0 A052;
        for (C100034uM r11 : r32.userReceipt_) {
            AnonymousClass3T1 r10 = r33;
            try {
                AnonymousClass1QP r13 = this.A0H;
                long j = r10.A1N;
                UserJid A0l = C36431kI.A0l(r11.userJid_);
                long j2 = r11.receiptTimestamp_ * 1000;
                long j3 = r11.readTimestamp_ * 1000;
                long j4 = r11.playedTimestamp_ * 1000;
                AnonymousClass3CY A002 = r13.A00(j);
                int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i > 0) {
                    z = A002.A00(A0l, 5, j2);
                } else {
                    z = false;
                }
                int i2 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                if (i2 > 0) {
                    z |= A002.A00(A0l, 13, j3);
                }
                int i3 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                if (i3 > 0) {
                    z |= A002.A00(A0l, 8, j4);
                }
                if (z) {
                    long A072 = r13.A01.A07(A0l);
                    C18740tg.A0F(AnonymousClass000.A1P((A072 > -1 ? 1 : (A072 == -1 ? 0 : -1))), "invalid jid");
                    ContentValues contentValues = new ContentValues(5);
                    contentValues.put("message_row_id", Long.valueOf(j));
                    contentValues.put("receipt_user_jid_row_id", Long.valueOf(A072));
                    if (i > 0) {
                        contentValues.put("receipt_timestamp", Long.valueOf(j2));
                    }
                    if (i2 > 0) {
                        contentValues.put("read_timestamp", Long.valueOf(j3));
                    }
                    if (i3 > 0) {
                        contentValues.put("played_timestamp", Long.valueOf(j4));
                    }
                    A052 = r13.A02.A05();
                    C224114e r7 = A052.A02;
                    String[] A1S = C36441kJ.A1S();
                    C36341k9.A1W(A1S, j);
                    A1S[1] = String.valueOf(A072);
                    if (r7.A01(contentValues, "receipt_user", "message_row_id = ? AND receipt_user_jid_row_id = ?", "insertOrUpdateEntireUserReceiptForMessage/UPDATE_RECEIPT_USER", A1S) <= 0 && r7.A04("receipt_user", "insertOrUpdateEntireUserReceiptForMessage/INSERT_RECEIPT_USER", contentValues) == -1) {
                        Log.e("ReceiptUserStore/insertOrUpdateEntireUserReceiptForMessage/insert failed");
                    }
                    A052.close();
                }
            } catch (SQLiteConstraintException e) {
                Log.e("MessagesImporter/Failed to insert user receipt.", e);
                this.A00.A0D("xpm-failed-receipt-import", e.toString(), e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (r11.readTimestamp_ > 0) {
                long j5 = r10.A1N;
                C65073Qp r2 = r31;
                synchronized (r2) {
                    r2.A0R = j5;
                }
                long j6 = r10.A1O;
                synchronized (r2) {
                    r2.A0S = j6;
                }
            }
            if (r11.pendingDeviceJid_.size() > 0) {
                hashSet = new HashSet(r11.pendingDeviceJid_.size());
                Iterator it = r11.pendingDeviceJid_.iterator();
                while (it.hasNext()) {
                    DeviceJid nullable = DeviceJid.getNullable(AnonymousClass001.A0C(it));
                    if (nullable != null) {
                        hashSet.add(nullable);
                    }
                }
            } else {
                hashSet = C36441kJ.A16();
            }
            if (r11.deliveredDeviceJid_.size() > 0) {
                Iterator it2 = r11.deliveredDeviceJid_.iterator();
                while (it2.hasNext()) {
                    DeviceJid nullable2 = DeviceJid.getNullable(AnonymousClass001.A0C(it2));
                    if (nullable2 != null) {
                        hashSet.remove(nullable2);
                        try {
                            this.A0G.A01(nullable2, r10, r10.A0I);
                        } catch (SQLiteConstraintException e2) {
                            Log.e("MessagesImporter/Failed to insert device receipt.", e2);
                            this.A00.A0D("xpm-failed-receipt-import", e2.toString(), e2);
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                try {
                    this.A0G.A03(r10, hashSet);
                } catch (SQLiteConstraintException e3) {
                    Log.e("MessagesImporter/Failed to insert blank device receipt.", e3);
                    this.A00.A0D("xpm-failed-receipt-import", e3.toString(), e3);
                }
            }
        }
        return;
        throw th;
    }

    public void A0O(C99834u2 r3) {
        if (this.A0L.A0E(7280)) {
            C173158Qp r0 = r3.secretCode_;
            if (r0 == null) {
                r0 = C173158Qp.DEFAULT_INSTANCE;
            }
            if (r0.transformedData_.A02() != 0) {
                this.A03.A01(r3.hideLockedChats_);
                this.A03.A02(true);
                C25751Hn r1 = this.A04;
                C173158Qp r02 = r3.secretCode_;
                if (r02 == null) {
                    r02 = C173158Qp.DEFAULT_INSTANCE;
                }
                r1.A02(r02);
            }
        }
    }

    public void A0P(C99844u3 r7) {
        if (r7 != null) {
            int i = r7.bitField0_;
            if ((i & 1) != 0 && (i & 2) != 0) {
                C135086c7 r5 = new C135086c7(C146356vT.A00(), Long.class, C36431kI.A15(r7.fbid_), "WaFbid");
                C135086c7 r0 = new C135086c7(C146356vT.A00(), String.class, r7.password_, "WaFbPassword");
                AnonymousClass1XW r3 = this.A0R;
                r3.A02(new AnonymousClass6AZ(r5, r0), new C111985dA(r3, 1));
            }
        }
    }

    public void A0Q(C100104uT r10, Map map) {
        int i;
        AnonymousClass11F A0N2 = C36421kH.A0N(r10.id_);
        C18740tg.A06(A0N2);
        if ((r10.bitField0_ & 2097152) != 0 && (i = r10.pinned_) > 0) {
            C90504aG.A1K(A0N2, map, i);
        }
        if ((r10.bitField0_ & 4194304) != 0) {
            long j = r10.muteEndTime_;
            if (j > 0) {
                j *= 1000;
            }
            if (j != 0) {
                this.A0S.A0m(A0N2, j);
            }
        }
        if ((r10.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            AnonymousClass5UF A002 = AnonymousClass5UF.A00(r10.mediaVisibility_);
            if (A002 == null) {
                A002 = AnonymousClass5UF.DEFAULT;
            }
            if (A002 != AnonymousClass5UF.DEFAULT) {
                AnonymousClass1CR r3 = this.A0S;
                int i2 = A002.value;
                AnonymousClass3LI A0d = C36361kB.A0d(A0N2, r3);
                if (i2 != A0d.A03) {
                    A0d.A03 = i2;
                    AnonymousClass1CR.A06(A0d, r3);
                }
            }
        }
    }

    public void A0R(C100014uK r5) {
        if (r5 != null) {
            if ((r5.bitField0_ & 1) != 0) {
                AnonymousClass1CR.A0A(this.A0S, "group_chat_defaults", r5.messageVibrate_);
            }
            if ((r5.bitField0_ & 2) != 0) {
                AnonymousClass1CR.A08(this.A0S, "group_chat_defaults", r5.messagePopup_);
            }
            if ((r5.bitField0_ & 4) != 0) {
                AnonymousClass1CR.A07(this.A0S, "group_chat_defaults", r5.messageLight_);
            }
            if ((r5.bitField0_ & 8) != 0) {
                this.A0S.A0f(r5.lowPriorityNotifications_);
            }
            if ((r5.bitField0_ & 16) != 0) {
                AnonymousClass1CR r3 = this.A0S;
                boolean z = r5.reactionsMuted_;
                AnonymousClass3LI A022 = AnonymousClass1CR.A02(r3, "group_chat_defaults");
                if (z != A022.A0H) {
                    A022.A0H = z;
                    AnonymousClass1CR.A06(A022, r3);
                }
            }
        }
    }

    public void A0S(C100014uK r5) {
        if (r5 != null) {
            if ((r5.bitField0_ & 1) != 0) {
                AnonymousClass1CR.A0A(this.A0S, "individual_chat_defaults", r5.messageVibrate_);
            }
            if ((r5.bitField0_ & 2) != 0) {
                AnonymousClass1CR.A08(this.A0S, "individual_chat_defaults", r5.messagePopup_);
            }
            if ((r5.bitField0_ & 4) != 0) {
                AnonymousClass1CR.A07(this.A0S, "individual_chat_defaults", r5.messageLight_);
            }
            if ((r5.bitField0_ & 8) != 0) {
                this.A0S.A0g(r5.lowPriorityNotifications_);
            }
            if ((r5.bitField0_ & 16) != 0) {
                AnonymousClass1CR r3 = this.A0S;
                boolean z = r5.reactionsMuted_;
                AnonymousClass3LI A022 = AnonymousClass1CR.A02(r3, "individual_chat_defaults");
                if (z != A022.A0H) {
                    A022.A0H = z;
                    AnonymousClass1CR.A06(A022, r3);
                }
            }
            if ((r5.bitField0_ & 32) != 0) {
                AnonymousClass1CR r32 = this.A0S;
                String str = r5.callVibrate_;
                AnonymousClass3LI A023 = AnonymousClass1CR.A02(r32, "individual_chat_defaults");
                if (!TextUtils.equals(str, A023.A0A)) {
                    A023.A0A = str;
                    AnonymousClass1CR.A06(A023, r32);
                }
            }
        }
    }

    public void A0T(AnonymousClass2bI r3) {
        int i = r3.A00;
        if ((i == 11 || i == 167 || i == 9) && TextUtils.isEmpty(r3.A0b())) {
            C220412q r1 = this.A0C;
            AnonymousClass11F r0 = r3.A1J.A00;
            C18740tg.A06(r0);
            r3.A16(r1.A0D(r0));
        }
    }

    public void A0U(TreeMap treeMap) {
        long A002 = C19970wo.A00(this.A08);
        for (Number number : treeMap.descendingKeySet()) {
            int intValue = number.intValue();
            this.A0S.A0U((AnonymousClass11F) C90514aH.A0o(number, treeMap), A002 - ((long) intValue));
        }
    }

    public boolean A0V(C100104uT r5) {
        C23122B6c<C172848Pk> b6c = r5.messages_;
        if (b6c.size() <= 3) {
            for (C172848Pk A082 : b6c) {
                AnonymousClass3T1 A083 = A08(A082);
                if (A083 == null || (A083 instanceof AnonymousClass2bI)) {
                }
            }
            return true;
        }
        return false;
    }

    public C133246Xk(C19970wo r2, C20810yC r3, AnonymousClass163 r4, C19700wN r5, C220412q r6, AnonymousClass17T r7, C20690y0 r8, AnonymousClass17U r9, C220712t r10, AnonymousClass179 r11, C132986Wc r12, AnonymousClass1A1 r13, AnonymousClass1QP r14, AnonymousClass1CR r15, AnonymousClass6JO r16, AnonymousClass6T9 r17, C26171Jd r18, AnonymousClass1DM r19, C19420v0 r20, C30661aZ r21, C232317r r22, AnonymousClass1FN r23, AnonymousClass17S r24, C26891Lx r25, C29911Yl r26, AnonymousClass1CQ r27, AnonymousClass5FW r28, AnonymousClass005 r29, C25731Hl r30, AnonymousClass1XW r31, C25751Hn r32, C24041Av r33) {
        this.A08 = r2;
        this.A0L = r3;
        this.A0B = r4;
        this.A00 = r5;
        this.A0C = r6;
        this.A0I = r7;
        this.A01 = r8;
        this.A0J = r9;
        this.A0A = r10;
        this.A07 = r11;
        this.A0N = r12;
        this.A0U = r13;
        this.A0H = r14;
        this.A0S = r15;
        this.A0O = r16;
        this.A0Q = r17;
        this.A0K = r18;
        this.A06 = r19;
        this.A09 = r20;
        this.A0M = r21;
        this.A0F = r22;
        this.A0G = r23;
        this.A0D = r24;
        this.A0E = r25;
        this.A05 = r26;
        this.A0T = r27;
        this.A0P = r28;
        this.A03 = r30;
        this.A0V = r29;
        this.A0R = r31;
        this.A04 = r32;
        this.A02 = r33;
    }

    public static int A01(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (((long) i) + ((C119845qY) it.next()).A01);
        }
        return i;
    }

    private void A03(CancellationSignal cancellationSignal, File file) {
        FileOutputStream A0W2;
        if (file.exists()) {
            C1275868w r2 = (C1275868w) this.A0V.get();
            try {
                FileInputStream A0U2 = C90524aI.A0U(file);
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(A0U2);
                    try {
                        byte[] bArr = new byte[C132986Wc.A0F];
                        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                            cancellationSignal.throwIfCanceled();
                            A0W2 = C90524aI.A0W(r2.A00(nextEntry.getName()));
                            AnonymousClass6T9.A01(cancellationSignal, zipInputStream, A0W2, bArr);
                            A0W2.close();
                        }
                        zipInputStream.close();
                        A0U2.close();
                        return;
                    } catch (Throwable th) {
                        zipInputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    A0U2.close();
                    throw th2;
                }
            } catch (IOException e) {
                Log.e("MessagesImporter/Failed to unpack files from archive.", e);
                r2.A02();
                throw e;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            C90464aC.A1A(file, "Unable to locate input data file '", A0u);
            throw C90524aI.A0V(AnonymousClass000.A0q("'.", A0u));
        }
        throw th;
    }

    public static void A05(InputStream inputStream) {
        try {
            JSONObject A0x = C90504aG.A0x(AnonymousClass0QO.A00(inputStream));
            JSONObject jSONObject = A0x.getJSONObject("header");
            C124255xq r7 = new C124255xq();
            r7.A00 = jSONObject.getLong("creation_date");
            r7.A05 = jSONObject.getString("os");
            r7.A06 = jSONObject.getString("os_version");
            r7.A02 = jSONObject.getString("app_name");
            r7.A03 = jSONObject.getString("app_version");
            r7.A04 = jSONObject.getString("format_version");
            if (A0x.has("messages")) {
                JSONObject jSONObject2 = A0x.getJSONObject("messages");
                C121755tf r6 = new C121755tf();
                r6.A00 = jSONObject2.getString("filename");
                r6.A01 = jSONObject2.getString("format");
                if (jSONObject2.has("chunks")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("chunks");
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        C119845qY r2 = new C119845qY();
                        r2.A00 = jSONObject3.getInt("chunk_number");
                        r2.A01 = (long) jSONObject3.getInt("messages_count");
                        A0I2.add(r2);
                    }
                    r6.A02 = A0I2;
                }
                r7.A01 = r6;
            }
        } catch (IOException | JSONException e) {
            throw new IOException("Unable to parse JSON header.", e);
        }
    }

    private void A06(Map map, Map map2) {
        int i;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            C65073Qp r7 = (C65073Qp) A11.getValue();
            C100104uT r2 = (C100104uT) map2.get(key);
            if (r2 != null) {
                int i2 = r2.bitField0_;
                if ((131072 & i2) != 0 && r2.markedAsUnread_) {
                    r7.A0H(-1, 0, 0, 0);
                } else if ((i2 & 16) != 0 && (i = r2.unreadCount_) > 0) {
                    long A042 = this.A0J.A04(this.A0I.A04(r7.A06(), i));
                    int A022 = this.A0J.A02(r7.A06(), A042);
                    r7.A0H(this.A0J.A00(r7.A06(), A042) - A022, A022, i, this.A0E.A00(r7.A06(), A042));
                }
                this.A0B.A0K(r7.A05((Long) null), r7);
            }
        }
    }

    public File A09(String str, int i, boolean z) {
        return C36441kJ.A0w(this.A01.A0I(i, 0, C36391kE.A00(z ? 1 : 0)), C90524aI.A0S(str).getName());
    }

    public void A0D(CancellationSignal cancellationSignal, C65073Qp r11, AnonymousClass7h3 r12, List list, byte[] bArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C172848Pk r0 = (C172848Pk) it.next();
            CancellationSignal cancellationSignal2 = cancellationSignal;
            cancellationSignal.throwIfCanceled();
            AnonymousClass3T1 A082 = A08(r0);
            if (A082 != null) {
                AnonymousClass8SU r6 = r0.message_;
                if (r6 == null) {
                    r6 = AnonymousClass8SU.DEFAULT_INSTANCE;
                }
                A0C(cancellationSignal2, r11, r12, r6, A082, bArr);
            }
        }
    }

    public void A0L(CancellationSignal cancellationSignal, AnonymousClass7h3 r4, File file, String str, byte[] bArr) {
        this.A0Q.A03(cancellationSignal, r4.getFile(str), file, bArr);
    }
}
