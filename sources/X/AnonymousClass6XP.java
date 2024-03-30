package X;

import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.6XP  reason: invalid class name */
public class AnonymousClass6XP {
    public int A00 = 5242880;
    public final C19700wN A01;
    public final C19630wG A02;
    public final C21010yW A03;
    public final C19770wU A04;
    public final C20050ww A05;
    public final C21080yd A06;
    public final C20020wt A07;

    public static void A00(FileOutputStream fileOutputStream, Boolean bool, String str) {
        if (bool != null) {
            try {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(";");
                A0u.append(str);
                C90474aD.A1I(AnonymousClass000.A0l(bool, ":", A0u), fileOutputStream);
            } catch (IOException e) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C36351kA.A1P(str, A0u2, e);
            }
        }
    }

    public static void A01(FileOutputStream fileOutputStream, Double d, String str) {
        if (d != null) {
            try {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(";");
                A0u.append(str);
                A0u.append(":");
                C90474aD.A1I(AnonymousClass000.A0q(String.format(Locale.US, "%.2f", AnonymousClass000.A1b(d)), A0u), fileOutputStream);
            } catch (IOException e) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C36351kA.A1P(str, A0u2, e);
            }
        }
    }

    public static void A02(FileOutputStream fileOutputStream, Integer num, String str) {
        if (num != null) {
            try {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(";");
                A0u.append(str);
                C90474aD.A1I(AnonymousClass000.A0l(num, ":", A0u), fileOutputStream);
            } catch (IOException e) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C36351kA.A1P(str, A0u2, e);
            }
        }
    }

    public static void A03(FileOutputStream fileOutputStream, Long l, String str) {
        if (l != null) {
            try {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(";");
                A0u.append(str);
                C90474aD.A1I(AnonymousClass000.A0l(l, ":", A0u), fileOutputStream);
            } catch (IOException e) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C36351kA.A1P(str, A0u2, e);
            }
        }
    }

    public static void A04(FileOutputStream fileOutputStream, String str, String str2) {
        if (str2 != null) {
            try {
                String replaceAll = str2.replaceAll(":", "_").replaceAll(";", "_");
                StringBuilder A0u = AnonymousClass000.A0u();
                C36321k7.A1O(";", str, ":", replaceAll, A0u);
                C90474aD.A1I(A0u.toString(), fileOutputStream);
            } catch (IOException e) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C36351kA.A1P(str, A0u2, e);
            }
        }
    }

    public static boolean A05(AnonymousClass6XP r19, WamCall wamCall, File file) {
        FileInputStream A0U;
        File file2 = file;
        boolean z = false;
        if (file2.exists()) {
            AnonymousClass6XP r5 = r19;
            C19700wN r1 = r5.A01;
            String A0A = r1.A0A();
            AnonymousClass6VO r9 = new AnonymousClass6VO(r5.A05, new C164827sR(file2, r5, 0), r5.A06, "https://crashlogs.whatsapp.net/wa_clb_data", r5.A07.A02(), (String) null, 16, false, false, false);
            r9.A06("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
            r9.A07("from_jid", A0A);
            r9.A07("tags", "voip_time_series");
            WamCall wamCall2 = wamCall;
            if (wamCall != null) {
                String str = wamCall2.callReplayerId;
                if (str != null && str.length() > 0) {
                    r9.A07("call_id", str);
                }
                Long l = wamCall2.maxConnectedParticipants;
                if (l != null) {
                    r9.A07("additional_metadata[max_participants]", l.toString());
                }
                Long l2 = wamCall2.numConnectedParticipants;
                if (l2 != null) {
                    r9.A07("additional_metadata[num_participants]", l2.toString());
                }
            }
            try {
                A0U = C90524aI.A0U(file2);
                AnonymousClass6VO.A03(r9, file2, A0U, "file");
                int A042 = r9.A04((C1265864p) null);
                if (A042 >= 400) {
                    C36321k7.A1U("app/VoiceService: upload of time series log date failed with response code: ", AnonymousClass000.A0u(), A042);
                    z = false;
                } else {
                    z = true;
                }
                A0U.close();
                if (!file2.delete()) {
                    Log.i("app/VoiceService: dummy time series log could not be deleted");
                    return z;
                }
            } catch (IOException e) {
                try {
                    Log.w("app/VoiceService: could not upload dummy time series log data", e);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append(file2.length());
                    r1.A0E("voip-time-series-upload-fail", AnonymousClass000.A0q(":uploadError:", A0u), true);
                } finally {
                    if (!file2.delete()) {
                        Log.i("app/VoiceService: dummy time series log could not be deleted");
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return z;
        throw th;
    }

    public AnonymousClass6XP(C19700wN r2, C20050ww r3, C19630wG r4, C21010yW r5, C21080yd r6, C20020wt r7, C19770wU r8) {
        this.A01 = r2;
        this.A02 = r4;
        this.A04 = r8;
        this.A07 = r7;
        this.A05 = r3;
        this.A03 = r5;
        this.A06 = r6;
    }
}
