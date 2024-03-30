package com.whatsapp.service;

import X.AnonymousClass12P;
import X.AnonymousClass16J;
import X.AnonymousClass191;
import X.AnonymousClass1YR;
import X.C18700tb;
import X.C18800tq;
import X.C19770wU;
import X.C20720y3;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36341k9;
import X.C36361kB;
import X.C36441kJ;
import X.C81163wZ;
import X.C90394a5;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import com.whatsapp.util.Log;

public class UnsentMessagesNetworkAvailableJob extends JobService implements C18700tb {
    public JobParameters A00;
    public AnonymousClass16J A01;
    public AnonymousClass12P A02;
    public AnonymousClass1YR A03;
    public C20720y3 A04;
    public C19770wU A05;
    public boolean A06;
    public final Handler A07;
    public final AnonymousClass191 A08;
    public final Object A09;
    public final Runnable A0A;
    public volatile C31091bG A0B;

    public final Object generatedComponent() {
        if (this.A0B == null) {
            synchronized (this.A09) {
                if (this.A0B == null) {
                    this.A0B = new C31091bG(this);
                }
            }
        }
        return this.A0B.generatedComponent();
    }

    public void onCreate() {
        Log.i("UnsentMessagesNetworkAvailableJob/onCreate");
        if (!this.A06) {
            this.A06 = true;
            C18800tq r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            this.A05 = C36341k9.A0Z(r1);
            this.A04 = (C20720y3) r1.A6u.get();
            this.A01 = C36361kB.A0Z(r1);
            this.A03 = (AnonymousClass1YR) r1.A8e.get();
            this.A02 = (AnonymousClass12P) r1.A5G.get();
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("UnsentMessagesNetworkAvailableJob/onDestroy");
        super.onDestroy();
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.A00 == null) {
            return true;
        }
        this.A01.unregisterObserver(this.A08);
        this.A07.removeCallbacks(this.A0A);
        this.A00 = null;
        return true;
    }

    public UnsentMessagesNetworkAvailableJob(int i) {
        this.A09 = C36441kJ.A11();
        this.A06 = false;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getJobId() != 6 || this.A00 != null) {
            return false;
        }
        this.A00 = jobParameters;
        C81163wZ.A00(this.A05, this, 15);
        return true;
    }

    public UnsentMessagesNetworkAvailableJob() {
        this(0);
        this.A07 = new Handler();
        this.A08 = C90394a5.A00(this, 28);
        this.A0A = new C81163wZ((Object) this, 14);
    }
}
