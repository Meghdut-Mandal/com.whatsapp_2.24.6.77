package com.whatsapp.backup.google.workers;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass6YN;
import X.C009003v;
import X.C023509x;
import X.C101714yA;
import X.C101774yG;
import X.C101784yH;
import X.C101884yR;
import X.C101894yS;
import X.C133226Xi;
import X.C19730wQ;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C90474aD;
import X.C97334ow;
import X.C97344ox;
import android.net.TrafficStats;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.google.workers.BackupGpbSignalWorker$doWork$2", f = "BackupGpbSignalWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BackupGpbSignalWorker$doWork$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ BackupGpbSignalWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackupGpbSignalWorker$doWork$2(BackupGpbSignalWorker backupGpbSignalWorker, C023509x r3) {
        super(2, r3);
        this.this$0 = backupGpbSignalWorker;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new BackupGpbSignalWorker$doWork$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BackupGpbSignalWorker$doWork$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Throwable th;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (C36371kC.A1U(C36411kG.A0E(this.this$0.A01.A01), "send_gpb_signal")) {
                BackupGpbSignalWorker backupGpbSignalWorker = this.this$0;
                if (!AnonymousClass6YN.A0A(backupGpbSignalWorker.A01, backupGpbSignalWorker.A04)) {
                    String A0c = this.this$0.A03.A0c();
                    if (A0c != null) {
                        C19730wQ r0 = this.this$0.A00;
                        r0.A0G();
                        Me me = r0.A00;
                        if (!(me == null || (str = me.jabber_id) == null)) {
                            C133226Xi A01 = this.this$0.A02.A01(A0c, "backup");
                            if (!AnonymousClass6YN.A0C(new C101714yA(), A01, 14)) {
                                return C97334ow.A00();
                            }
                            Log.i("GoogleBackupApi/notify-gpb-enabled/");
                            if (!A01.A0D()) {
                                TrafficStats.setThreadStatsTag(13);
                                HttpsURLConnection httpsURLConnection = null;
                                try {
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("clients/wa/backups/");
                                    A0u.append(str);
                                    httpsURLConnection = A01.A09("POST", AnonymousClass000.A0q(":notifyAxolotlAnnouncement", A0u), (String) null, (Map) null, false);
                                    int responseCode = httpsURLConnection.getResponseCode();
                                    if (responseCode != 200) {
                                        if (responseCode == 403) {
                                            th = new C101784yH();
                                        } else if (responseCode == 400) {
                                            StringBuilder A0v = AnonymousClass000.A0v("GoogleBackupApi/notify-gpb-enabled/failed ");
                                            A0v.append(httpsURLConnection.getResponseCode());
                                            A0v.append(" : ");
                                            C36321k7.A1Z(A0v, C90474aD.A0h(httpsURLConnection));
                                            th = new C101774yG(C36381kD.A10(AnonymousClass000.A0v("Unhandled response code for notify-gpb-enabled: "), httpsURLConnection.getResponseCode()));
                                        } else if (responseCode != 401) {
                                            StringBuilder A0v2 = AnonymousClass000.A0v("GoogleBackupApi/notify-gpb-enabled/failed ");
                                            A0v2.append(httpsURLConnection.getResponseCode());
                                            A0v2.append(" : ");
                                            C36321k7.A1Z(A0v2, C90474aD.A0h(httpsURLConnection));
                                            th = new C101774yG(C36381kD.A10(AnonymousClass000.A0v("Unhandled response code for notify-gpb-enabled: "), httpsURLConnection.getResponseCode()));
                                        } else {
                                            th = new C101884yR();
                                        }
                                        throw th;
                                    }
                                    httpsURLConnection.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                } catch (IOException e) {
                                    throw new C101894yS(e);
                                } catch (Throwable th2) {
                                    if (httpsURLConnection != null) {
                                        httpsURLConnection.disconnect();
                                    }
                                    TrafficStats.clearThreadStatsTag();
                                    throw th2;
                                }
                            } else {
                                Log.i("GoogleBackupApi/notify-gpb-enabled/api disabled");
                                throw new C101784yH();
                            }
                        }
                    }
                }
                C36341k9.A0u(C36351kA.A0A(this.this$0.A01.A01), "send_gpb_signal");
            }
            return C97344ox.A00();
        }
        throw AnonymousClass000.A0e();
    }
}
