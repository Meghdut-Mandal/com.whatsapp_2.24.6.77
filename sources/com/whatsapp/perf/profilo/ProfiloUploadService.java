package com.whatsapp.perf.profilo;

import X.AnonymousClass6VO;
import X.AnonymousClass729;
import X.C1265864p;
import X.C164827sR;
import X.C18700tb;
import X.C18800tq;
import X.C18930u3;
import X.C19420v0;
import X.C19600wD;
import X.C19700wN;
import X.C19720wP;
import X.C19770wU;
import X.C20020wt;
import X.C20050ww;
import X.C21080yd;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C39171rR;
import X.C90504aG;
import X.C90524aI;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.io.File;

public class ProfiloUploadService extends C39171rR implements C18700tb {
    public C19700wN A00;
    public C20050ww A01;
    public C19600wD A02;
    public C19420v0 A03;
    public C21080yd A04;
    public C20020wt A05;
    public C19770wU A06;
    public boolean A07;
    public final Object A08;
    public volatile C31091bG A09;

    public void A0A(Intent intent) {
        File[] listFiles;
        int length;
        File A0w = C36441kJ.A0w(getCacheDir(), "profilo/upload");
        if (A0w.exists() && (listFiles = A0w.listFiles(AnonymousClass729.A00)) != null && (length = listFiles.length) != 0) {
            for (int i = 1; i < length; i++) {
                listFiles[i].delete();
                listFiles[i].getPath();
            }
            File file = listFiles[0];
            if (this.A02.A03(true) == 1) {
                try {
                    AnonymousClass6VO r6 = new AnonymousClass6VO(this.A01, new C164827sR(file, this, 3), this.A04, "https://crashlogs.whatsapp.net/wa_profilo_data", this.A05.A02(), (String) null, 7, false, false, false);
                    r6.A06("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
                    r6.A06("from", this.A00.A0A());
                    AnonymousClass6VO.A03(r6, file, C90524aI.A0U(file), "file");
                    C19720wP r0 = (C19720wP) this.A00;
                    r6.A06("agent", C20020wt.A00(r0.A07, r0.A0B, C18930u3.A01()));
                    r6.A06("build_id", String.valueOf(581200649));
                    r6.A06("device_id", this.A03.A0e());
                    r6.A04((C1265864p) null);
                    return;
                } catch (Exception | OutOfMemoryError e) {
                    Log.w("ProfiloUpload/Error Uploading file", e);
                }
            }
            if (file != null) {
                file.delete();
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A09 == null) {
            synchronized (this.A08) {
                if (this.A09 == null) {
                    this.A09 = new C31091bG(this);
                }
            }
        }
        return this.A09.generatedComponent();
    }

    public void onCreate() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            this.A05 = C90504aG.A0X(r1);
            this.A00 = C36391kE.A0V(r1);
            this.A06 = C36341k9.A0Z(r1);
            this.A01 = C36381kD.A0U(r1);
            this.A04 = (C21080yd) r1.A7U.get();
            this.A02 = C36391kE.A0c(r1);
            this.A03 = C36351kA.A0Y(r1);
        }
        super.onCreate();
    }

    public ProfiloUploadService(int i) {
        this.A08 = C36441kJ.A11();
        this.A07 = false;
    }

    public ProfiloUploadService() {
        this(0);
    }
}
