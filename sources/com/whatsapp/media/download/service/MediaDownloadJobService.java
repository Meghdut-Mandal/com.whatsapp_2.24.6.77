package com.whatsapp.media.download.service;

import X.AVn;
import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass190;
import X.AnonymousClass1ST;
import X.AnonymousClass6YC;
import X.C005502l;
import X.C023509x;
import X.C1503074t;
import X.C164997si;
import X.C19630wG;
import X.C19650wI;
import X.C19770wU;
import X.C19930wk;
import X.C19970wo;
import X.C25711Hj;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C80293vA;
import X.C90764am;
import android.app.Notification;
import android.app.job.JobParameters;
import java.util.ArrayList;

public final class MediaDownloadJobService extends C90764am {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public C19970wo A02;
    public C19630wG A03;
    public AnonymousClass190 A04;
    public AnonymousClass1ST A05;
    public C19650wI A06;
    public C19930wk A07;
    public C19770wU A08;
    public C25711Hj A09;
    public C005502l A0A;
    public AnonymousClass040 A0B;
    public boolean A0C;

    public static final /* synthetic */ void A01(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService) {
        mediaDownloadJobService.A09 = new C164997si(jobParameters, mediaDownloadJobService, 5);
        C19770wU r0 = mediaDownloadJobService.A08;
        if (r0 != null) {
            C19930wk A0r = C36411kG.A0r(r0);
            mediaDownloadJobService.A07 = A0r;
            AnonymousClass1ST r02 = mediaDownloadJobService.A05;
            if (r02 != null) {
                C25711Hj r1 = mediaDownloadJobService.A09;
                if (r1 == null) {
                    throw C36331k8.A0d("largeMediaDownloadingObservable");
                }
                r02.A07.A03(r1, A0r);
                return;
            }
            throw C36331k8.A0d("mediaDownloadManager");
        }
        throw C36321k7.A08();
    }

    public static /* synthetic */ void A04(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService, ArrayList arrayList) {
        JobParameters jobParameters2 = jobParameters;
        ArrayList arrayList2 = arrayList;
        int A042 = C36361kB.A04(jobParameters, arrayList, 1);
        MediaDownloadJobService mediaDownloadJobService2 = mediaDownloadJobService;
        if (C36411kG.A1a(arrayList2)) {
            String A072 = AnonymousClass6YC.A07(mediaDownloadJobService, arrayList2);
            AnonymousClass16D r1 = mediaDownloadJobService.A00;
            if (r1 != null) {
                AnonymousClass171 r0 = mediaDownloadJobService.A01;
                if (r0 != null) {
                    String A062 = AnonymousClass6YC.A06(mediaDownloadJobService, r1, r0, arrayList2);
                    C19650wI r02 = mediaDownloadJobService2.A06;
                    if (r02 != null) {
                        r02.Bp3(new AVn(mediaDownloadJobService2, jobParameters2, arrayList2, A072, A062, A042));
                        return;
                    }
                    throw C36331k8.A0d("mainThreadHandler");
                }
                throw C36331k8.A0d("waContactNames");
            }
            throw C36331k8.A0d("contactManager");
        }
        C19770wU r12 = mediaDownloadJobService.A08;
        if (r12 != null) {
            C1503074t.A00(r12, mediaDownloadJobService, 23);
            mediaDownloadJobService.jobFinished(jobParameters, false);
            return;
        }
        throw C36321k7.A08();
    }

    public static /* synthetic */ void A06(MediaDownloadJobService mediaDownloadJobService) {
        mediaDownloadJobService.A0C = false;
        C25711Hj r1 = mediaDownloadJobService.A09;
        if (r1 != null) {
            AnonymousClass1ST r0 = mediaDownloadJobService.A05;
            if (r0 != null) {
                r0.A07.A02(r1);
                return;
            }
            throw C36331k8.A0d("mediaDownloadManager");
        }
    }

    public static /* synthetic */ void A03(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService, String str, String str2, ArrayList arrayList) {
        if (str != null) {
            mediaDownloadJobService.A05(jobParameters, str, str2, arrayList);
        }
    }

    /* access modifiers changed from: private */
    public final void A05(JobParameters jobParameters, String str, String str2, ArrayList arrayList) {
        AnonymousClass16D r1 = this.A00;
        if (r1 == null) {
            throw C36331k8.A0d("contactManager");
        } else if (this.A02 != null) {
            Notification A032 = AnonymousClass6YC.A03(this, r1, str, str2, arrayList);
            AnonymousClass00C.A08(A032);
            setNotification(jobParameters, 240677004, A032, 1);
        } else {
            throw C36331k8.A0d("time");
        }
    }

    public final C19630wG A07() {
        C19630wG r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waContext");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        C19770wU r1 = this.A08;
        if (r1 != null) {
            C80293vA.A00(r1, jobParameters, this, 41);
            return true;
        }
        throw C36321k7.A08();
    }

    public static /* synthetic */ void A00(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("media-download-job-service/onStopJob:; p0: ");
        A0u.append(jobParameters);
        A0u.append(" largeMediaDownloadsInProgress=");
        C36331k8.A1S(A0u, mediaDownloadJobService.A0C);
        mediaDownloadJobService.A0C = false;
        C25711Hj r1 = mediaDownloadJobService.A09;
        if (r1 != null) {
            AnonymousClass1ST r0 = mediaDownloadJobService.A05;
            if (r0 != null) {
                r0.A07.A02(r1);
                return;
            }
            throw C36331k8.A0d("mediaDownloadManager");
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("media-download-job-service/onStartJob:; p0: ");
        A0u.append(jobParameters);
        A0u.append(" largeMediaDownloadsInProgress=");
        C36331k8.A1S(A0u, this.A0C);
        this.A0C = true;
        if (jobParameters != null) {
            AnonymousClass040 r3 = this.A0B;
            if (r3 != null) {
                C005502l r2 = this.A0A;
                if (r2 != null) {
                    C36381kD.A1R(r2, new MediaDownloadJobService$onStartJob$1$1(jobParameters, this, (C023509x) null), r3);
                } else {
                    throw C36331k8.A0d("ioDispatcher");
                }
            } else {
                throw C36331k8.A0d("applicationScope");
            }
        }
        return true;
    }
}
