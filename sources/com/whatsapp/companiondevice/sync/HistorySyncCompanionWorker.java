package com.whatsapp.companiondevice.sync;

import X.AnonymousClass000;
import X.AnonymousClass36I;
import X.AnonymousClass6WD;
import X.AnonymousClass6YY;
import X.C07700Yy;
import X.C122435uq;
import X.C128076At;
import X.C128916Ec;
import X.C130576Lp;
import X.C163997r6;
import X.C17880sD;
import X.C18740tg;
import X.C18800tq;
import X.C19550w8;
import X.C19770wU;
import X.C19970wo;
import X.C25471Gl;
import X.C25711Hj;
import X.C29961Yr;
import X.C30591aS;
import X.C30601aT;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C90524aI;
import X.C97344ox;
import X.C99424tL;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class HistorySyncCompanionWorker extends C128916Ec {
    public final C99424tL A00 = new C99424tL();
    public final C30591aS A01;
    public final C19770wU A02;
    public final AnonymousClass6WD A03;
    public final C30601aT A04;

    /* JADX INFO: finally extract failed */
    public static void A00(HistorySyncCompanionWorker historySyncCompanionWorker) {
        long j;
        byte[] bArr;
        InflaterInputStream inflaterInputStream;
        HistorySyncCompanionWorker historySyncCompanionWorker2 = historySyncCompanionWorker;
        C130576Lp A012 = historySyncCompanionWorker2.A04.A01();
        Object obj = historySyncCompanionWorker2.A01.A01.A00.get("loggableStanzaId");
        if (obj instanceof Long) {
            j = C36431kI.A09(obj);
        } else {
            j = 0;
        }
        if (A012 == null) {
            historySyncCompanionWorker2.A00.A04(C97344ox.A00());
            return;
        }
        AnonymousClass36I r12 = new AnonymousClass36I(historySyncCompanionWorker2, A012, j);
        AnonymousClass6WD r14 = historySyncCompanionWorker2.A03;
        byte[] bArr2 = A012.A09;
        if (bArr2 != null) {
            int i = A012.A01;
            long j2 = A012.A03;
            int i2 = A012.A00;
            Inflater inflater = new Inflater(false);
            try {
                inflaterInputStream = new InflaterInputStream(C90524aI.A0P(bArr2), inflater);
                ByteArrayOutputStream A0Q = C90524aI.A0Q();
                AnonymousClass6YY.A0J(inflaterInputStream, A0Q);
                bArr = A0Q.toByteArray();
                inflaterInputStream.close();
                inflater.end();
            } catch (IOException e) {
                try {
                    C36321k7.A1J(e, "HistorySyncUtils/inflateData fails e=", AnonymousClass000.A0u());
                    inflater.end();
                    Log.e("HistorySyncUtils/inflateData error no result");
                    bArr = new byte[0];
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            C122435uq r13 = new C122435uq();
            r13.A02 = j2;
            r13.A01 = C19970wo.A00(r14.A07);
            r13.A03 = (long) bArr.length;
            AnonymousClass6WD.A00(r12, r13, r14, (File) null, bArr, i, i2);
            return;
        }
        String str = A012.A05;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass6WD.A01(r12, r14, A012, C90524aI.A0S(str));
            return;
        }
        C29961Yr r4 = r14.A0O;
        C25471Gl r6 = C25471Gl.A0N;
        String str2 = A012.A07;
        C18740tg.A06(str2);
        String str3 = A012.A06;
        C18740tg.A06(str3);
        String str4 = A012.A04;
        C18740tg.A06(str4);
        byte[] bArr3 = A012.A0A;
        C18740tg.A06(bArr3);
        r4.A0A(new C163997r6(r14, A012, r12, 1), r6, (C25711Hj) null, (C25711Hj) null, (String) null, str2, str3, (String) null, str4, (String) null, bArr3, 4, 21, 11, 0, A012.A02);
        return;
        throw th;
    }

    public C17880sD A05() {
        Context context = this.A00;
        String string = context.getString(R.string.f12nameremoved);
        C07700Yy A0F = C36421kH.A0F(context);
        A0F.A0E(string);
        A0F.A0G(string);
        A0F.A09 = -1;
        C36361kB.A1A(A0F);
        C99424tL r4 = new C99424tL();
        r4.A04(new C128076At(240677041, A0F.A05(), C19550w8.A06() ? 1 : 0));
        return r4;
    }

    public HistorySyncCompanionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A02 = C36341k9.A0Z(A0P);
        this.A01 = (C30591aS) A0P.A7F.get();
        this.A03 = (AnonymousClass6WD) A0P.AfI.A00.A22.get();
        this.A04 = (C30601aT) A0P.A3y.get();
    }
}
