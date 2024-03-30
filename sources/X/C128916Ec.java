package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.work.CoroutineWorker;
import androidx.work.CoroutineWorker$startWork$1;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.whatsapp.backup.google.workers.GoogleBackupWorker;
import com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker;
import com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker;
import com.whatsapp.messaging.xmpp.XmppProcessingAndLogoutWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResetOnServerWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResultSendWorker;
import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.util.Log;
import com.whatsapp.wds.metrics.logging.network.HierarchyUploadScheduler$HierarchyUploadWorker;
import com.whatsapp.workmanager.ObservableWorkerFactory$LogExceptionsWorker;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Ec  reason: invalid class name and case insensitive filesystem */
public abstract class C128916Ec {
    public Context A00;
    public WorkerParameters A01;
    public boolean A02;
    public volatile boolean A03;

    public C17880sD A06() {
        int i;
        Object obj = this;
        if (this instanceof ObservableWorkerFactory$LogExceptionsWorker) {
            ObservableWorkerFactory$LogExceptionsWorker observableWorkerFactory$LogExceptionsWorker = (ObservableWorkerFactory$LogExceptionsWorker) obj;
            C17880sD A06 = observableWorkerFactory$LogExceptionsWorker.A00.A06();
            A06.B0P(new AnonymousClass735(A06, observableWorkerFactory$LogExceptionsWorker, 8, SystemClock.elapsedRealtime()), AnonymousClass776.A00);
            return A06;
        }
        if (this instanceof HierarchyUploadScheduler$HierarchyUploadWorker) {
            obj = ((HierarchyUploadScheduler$HierarchyUploadWorker) obj).A00;
            i = 5;
        } else if (this instanceof RestoreChatConnectionWorker) {
            RestoreChatConnectionWorker restoreChatConnectionWorker = (RestoreChatConnectionWorker) obj;
            AnonymousClass19J r2 = restoreChatConnectionWorker.A03;
            if (r2.A04 == 2) {
                Log.i("RestoreChatConnectionWorker/doWork nothing to do");
                C97484pl r22 = restoreChatConnectionWorker.A01;
                r22.A06(C97344ox.A00());
                return r22;
            }
            AnonymousClass5WV r3 = new AnonymousClass5WV(restoreChatConnectionWorker, 4);
            r2.registerObserver(r3);
            C97484pl r23 = restoreChatConnectionWorker.A01;
            C80313vC r1 = new C80313vC(restoreChatConnectionWorker, r3, 46);
            Executor executor = restoreChatConnectionWorker.A02.A04;
            r23.B0P(r1, executor);
            C81163wZ r4 = new C81163wZ((Object) restoreChatConnectionWorker, 12);
            restoreChatConnectionWorker.A00.postDelayed(r4, AnonymousClass6X5.A0L);
            r23.B0P(new C80313vC(restoreChatConnectionWorker, r4, 47), executor);
            restoreChatConnectionWorker.A05.A0F((String) null, (String) null, 0, false, true, false, false, false, restoreChatConnectionWorker.A04.A0A());
            return r23;
        } else if (this instanceof UserNoticeStageUpdateWorker) {
            i = 4;
        } else if (this instanceof DisclosureResultSendWorker) {
            i = 3;
        } else if (this instanceof DisclosureResetOnServerWorker) {
            i = 2;
        } else if (this instanceof DisclosureMetadataGetWorker) {
            i = 1;
        } else if (this instanceof DisclosureGetStageByIdsWorker) {
            i = 0;
        } else if (this instanceof XmppProcessingAndLogoutWorker) {
            XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker = (XmppProcessingAndLogoutWorker) obj;
            C90524aI.A0C(xmppProcessingAndLogoutWorker.A0D).post(new C1497272n(xmppProcessingAndLogoutWorker, 13));
            C99424tL r0 = xmppProcessingAndLogoutWorker.A03;
            AnonymousClass00C.A07(r0);
            return r0;
        } else if (this instanceof HistorySyncCompanionWorker) {
            HistorySyncCompanionWorker historySyncCompanionWorker = (HistorySyncCompanionWorker) obj;
            Log.i("HistorySyncCompanionWorker/ startWork");
            historySyncCompanionWorker.A02.Boy(new C80213v2(historySyncCompanionWorker, 5));
            return historySyncCompanionWorker.A00;
        } else if (this instanceof ConstraintTrackingWorker) {
            ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) obj;
            constraintTrackingWorker.A01.A07.execute(new AnonymousClass759((Object) constraintTrackingWorker, 21));
            C97484pl r02 = constraintTrackingWorker.A02;
            AnonymousClass00C.A07(r02);
            return r02;
        } else if (this instanceof Worker) {
            Worker worker = (Worker) obj;
            worker.A00 = new C97484pl();
            worker.A01.A07.execute(new AnonymousClass759((Object) worker, 16));
            return worker.A00;
        } else {
            CoroutineWorker coroutineWorker = (CoroutineWorker) obj;
            C36331k8.A1T(new CoroutineWorker$startWork$1(coroutineWorker, (C023509x) null), C009403z.A02(C008803t.A02(coroutineWorker.A01, coroutineWorker.A02)));
            return coroutineWorker.A00;
        }
        return AnonymousClass0PE.A00(new C112095dL(obj, i));
    }

    public final C97484pl A04(C128076At r9) {
        WorkerParameters workerParameters = this.A01;
        C157087bo r3 = workerParameters.A02;
        Context context = this.A00;
        UUID uuid = workerParameters.A06;
        C138766if r32 = (C138766if) r3;
        C97484pl r6 = new C97484pl();
        r32.A02.B74(new AnonymousClass753(uuid, r32, r9, context, r6, 0));
        return r6;
    }

    public C17880sD A05() {
        C97484pl r1 = new C97484pl();
        r1.A07(AnonymousClass001.A09("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return r1;
    }

    public void A07() {
        C97484pl r1;
        boolean z;
        boolean z2;
        AtomicBoolean atomicBoolean;
        if (this instanceof ObservableWorkerFactory$LogExceptionsWorker) {
            ((ObservableWorkerFactory$LogExceptionsWorker) this).A00.A07();
            return;
        }
        if (this instanceof RestoreChatConnectionWorker) {
            r1 = ((RestoreChatConnectionWorker) this).A01;
            z = true;
        } else if (this instanceof XmppProcessingAndLogoutWorker) {
            XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker = (XmppProcessingAndLogoutWorker) this;
            Log.i("XmppProcessingAndLogoutWorker/onStopped");
            AnonymousClass00T r2 = xmppProcessingAndLogoutWorker.A0D;
            Handler A0C = C90524aI.A0C(r2);
            Log.i("XmppProcessingAndLogoutWorker/cancel logout");
            A0C.removeMessages(2);
            C90524aI.A0C(r2).removeMessages(1);
            C90524aI.A0C(r2).post(new C1497272n(xmppProcessingAndLogoutWorker, 12));
            return;
        } else {
            if (this instanceof GoogleEncryptedReUploadWorker) {
                Log.i("google-encrypted-re-upload-worker/onStopped");
                z2 = false;
                atomicBoolean = ((GoogleEncryptedReUploadWorker) this).A08.A0R;
            } else if (this instanceof GoogleBackupWorker) {
                GoogleBackupWorker googleBackupWorker = (GoogleBackupWorker) this;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("google-backup-worker/onStopped, attempt: ");
                C36321k7.A1Y(A0u, googleBackupWorker.A01.A00);
                googleBackupWorker.A0A.A06();
                z2 = false;
                atomicBoolean = googleBackupWorker.A06.A0Q;
            } else if (this instanceof ConstraintTrackingWorker) {
                C128916Ec r12 = ((ConstraintTrackingWorker) this).A00;
                if (r12 != null && !r12.A03) {
                    r12.A03 = true;
                    r12.A07();
                    return;
                }
                return;
            } else if (this instanceof CoroutineWorker) {
                r1 = ((CoroutineWorker) this).A00;
                z = false;
            } else {
                return;
            }
            atomicBoolean.getAndSet(z2);
            return;
        }
        r1.cancel(z);
    }

    public C128916Ec(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw AnonymousClass001.A08("Application Context is null");
        } else if (workerParameters != null) {
            this.A00 = context;
            this.A01 = workerParameters;
        } else {
            throw AnonymousClass001.A08("WorkerParameters is null");
        }
    }
}
