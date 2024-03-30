package X;

import android.content.ContentValues;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl;
import com.whatsapp.infra.graphql.generated.mex.calls.XWA2UserUpdateVersions;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.workmanager.ObservableWorkerFactory$LogExceptionsWorker;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: X.735  reason: invalid class name */
public class AnonymousClass735 implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass735(Object obj, Object obj2, int i, long j) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
    }

    public final void run() {
        int i;
        C203399nx r0;
        C203399nx A0m;
        C236119d r15;
        C27621Oz r6;
        boolean z;
        boolean z2;
        switch (this.A03) {
            case 0:
                AnonymousClass1X4 r5 = (AnonymousClass1X4) this.A01;
                long j = this.A00;
                AnonymousClass3T1 r2 = (AnonymousClass3T1) this.A02;
                r5.A14.A00(r2, C36421kH.A0R(r5.A1H, j));
                r5.A0T(r2);
                r5.A0X.A0h(r2);
                return;
            case 1:
                long j2 = this.A00;
                AnonymousClass6YM r02 = ((C91654cO) this.A01).A01;
                AnonymousClass6YM.A09(r02, (CallInfo) this.A02, j2);
                r02.A0d.sendEmptyMessageDelayed(0, 1000);
                return;
            case 2:
                ((VoiceServiceEventCallback) this.A01).m13lambda$setScheduledCallJoinTimeDiffMs$6$comwhatsappcallingserviceVoiceServiceEventCallback(this.A00, (AnonymousClass3KV) this.A02);
                return;
            case 3:
                AnonymousClass3T1 r8 = (AnonymousClass3T1) this.A02;
                long j3 = this.A00;
                AnonymousClass1JN r7 = ((AnonymousClass3EP) this.A01).A02;
                if (r8 != null && C54782tX.A00(r8)) {
                    ConcurrentHashMap concurrentHashMap = r7.A01.A02;
                    C64933Qa r52 = r8.A1J;
                    Number A10 = C36441kJ.A10(r52, concurrentHashMap);
                    if (A10 == null || j3 > A10.longValue()) {
                        AnonymousClass00C.A07(r52);
                        Long valueOf = Long.valueOf(j3);
                        concurrentHashMap.put(r52, valueOf);
                        AnonymousClass1JN.A01(r7, r8, (Integer) null, valueOf, 0, 0, 0);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Drawable drawable = (Drawable) this.A02;
                long j4 = this.A00;
                C39691tK r3 = ((C74193lD) this.A01).A03.A08;
                if (r3 != null) {
                    if (drawable != null) {
                        i = 0;
                    } else {
                        drawable = null;
                        i = 2;
                        if (!AnonymousClass000.A1P((j4 > -1 ? 1 : (j4 == -1 ? 0 : -1)))) {
                            i = 1;
                        }
                    }
                    r3.A0S(drawable, i);
                    return;
                }
                return;
            case 5:
                Jid jid = (Jid) this.A02;
                long j5 = this.A00;
                AnonymousClass1M0 A04 = ((AnonymousClass39J) this.A01).A01.A01.A04();
                try {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("chat_jid", jid.getRawString());
                    C36341k9.A0p(contentValues, "timestamp", j5);
                    A04.A02.A06("dismissed_chat", "INSERT_DISMISSED_CHAT", contentValues);
                    A04.close();
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            case 6:
                C193909Nj r72 = (C193909Nj) this.A01;
                UserJid userJid = (UserJid) this.A02;
                long j6 = this.A00;
                AnonymousClass19A r14 = r72.A04;
                String A09 = r14.A09();
                String A002 = r72.A03.A00("UpdateUserStatus");
                if (!TextUtils.isEmpty(A002)) {
                    C27621Oz r82 = r72.A02;
                    AnonymousClass00C.A0D(userJid, 0);
                    if (userJid instanceof PhoneUserJid) {
                        C20810yC r9 = r82.A01;
                        if (r9.A0E(2249) && (r9.A07(2250) & 1) == 1) {
                            String str = A002;
                            XWA2UserUpdateVersions xWA2UserUpdateVersions = new XWA2UserUpdateVersions();
                            xWA2UserUpdateVersions.A07("user_id", userJid.user);
                            C23931Ak of = C23931Ak.of(xWA2UserUpdateVersions);
                            C23931Ak of2 = C23931Ak.of("STATUS");
                            UpdateUserStatusQueryImpl$Builder updateUserStatusQueryImpl$Builder = new UpdateUserStatusQueryImpl$Builder();
                            AnonymousClass9VA r92 = updateUserStatusQueryImpl$Builder.A00;
                            if (of != null) {
                                r92.A00.A08("users", of);
                                z = true;
                            } else {
                                z = false;
                            }
                            updateUserStatusQueryImpl$Builder.A02 = z;
                            if (of2 != null) {
                                r92.A00.A08("updates", of2);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            updateUserStatusQueryImpl$Builder.A01 = z2;
                            C20740y5.A06(updateUserStatusQueryImpl$Builder.A02);
                            C20740y5.A06(updateUserStatusQueryImpl$Builder.A01);
                            C1691584f r22 = new AnonymousClass9JF(r92, UpdateUserStatusResponseImpl.class, "UpdateUserStatus").A00.A00;
                            TreeMap treeMap = new TreeMap();
                            GraphQlCallInput.A01(r22.A00, r22, treeMap);
                            JSONObject jSONObject = new JSONObject(treeMap);
                            JSONObject A1B = C36441kJ.A1B();
                            if (A002 == null) {
                                str = "";
                            }
                            A1B.put("queryId", str);
                            A1B.put("variables", jSONObject);
                            C186018vH r03 = new C186018vH((C185648uZ) null, A09, A002, C36381kD.A0y(A1B));
                            A0m = r03.A00;
                            r15 = new C180918md(userJid, r72, r03);
                            r6 = r72.A02;
                            C165087sr r23 = new C165087sr(r15, 4);
                            AnonymousClass00C.A0D(userJid, 0);
                            if ((userJid instanceof PhoneUserJid) && r6.A01.A0E(2249)) {
                                r23.invoke(r6.A00);
                            }
                            r14.A0K(r15, A0m, A09, 41, 0);
                            return;
                        }
                    }
                }
                ArrayList A0I = AnonymousClass001.A0I();
                long A0B = C36391kE.A0B(j6);
                if (A0B == 0) {
                    AnonymousClass1AL[] r1 = new AnonymousClass1AL[1];
                    C90504aG.A1E(userJid, "jid", r1, 0);
                    r0 = new C203399nx(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r1);
                } else {
                    AnonymousClass1AL[] r24 = new AnonymousClass1AL[2];
                    C90504aG.A1E(userJid, "jid", r24, 0);
                    C36341k9.A1L("t", Long.toString(A0B), r24, 1);
                    r0 = new C203399nx(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r24);
                }
                A0I.add(r0);
                C203399nx r32 = new C203399nx("status", (AnonymousClass1AL[]) null, (C203399nx[]) A0I.toArray(new C203399nx[0]));
                AnonymousClass1AL[] r25 = new AnonymousClass1AL[4];
                C36331k8.A1R(A09, r25, 0);
                C36341k9.A1L("xmlns", "status", r25, 1);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r25, 2);
                C36341k9.A1V(r25, 3);
                A0m = C36391kE.A0m(r32, r25);
                r15 = new C180908mc(userJid, r72);
                r6 = r72.A02;
                C165087sr r232 = new C165087sr(r15, 4);
                AnonymousClass00C.A0D(userJid, 0);
                r232.invoke(r6.A00);
                r14.A0K(r15, A0m, A09, 41, 0);
                return;
            case 7:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                long j7 = this.A00;
                C19970wo r62 = voipActivityV2.A07;
                AnonymousClass17Y r33 = voipActivityV2.A05;
                AnonymousClass1ND r4 = voipActivityV2.A0j;
                AnonymousClass1HJ r73 = voipActivityV2.A1F;
                C26211Jh r93 = voipActivityV2.A1I;
                AnonymousClass1HO r83 = voipActivityV2.A1H;
                AnonymousClass3UL.A05(voipActivityV2, r33, r4, (C20530xi) ((C20780y9) voipActivityV2.A1f.get()).A01(C20530xi.class), r62, r73, r83, r93, (GroupJid) this.A02, 1, j7);
                return;
            default:
                Future future = (Future) this.A01;
                ObservableWorkerFactory$LogExceptionsWorker observableWorkerFactory$LogExceptionsWorker = (ObservableWorkerFactory$LogExceptionsWorker) this.A02;
                long j8 = this.A00;
                AnonymousClass00C.A0D(future, 0);
                try {
                    future.get();
                } catch (Throwable th2) {
                    long A0J = C90514aH.A0J(j8);
                    AnonymousClass7i6 r12 = observableWorkerFactory$LogExceptionsWorker.A01;
                    String A0k = AnonymousClass000.A0k(observableWorkerFactory$LogExceptionsWorker.A00);
                    AnonymousClass00C.A08(A0k);
                    r12.Bkl(A0k, A0J);
                    throw th2;
                }
                long A0J2 = C90514aH.A0J(j8);
                AnonymousClass7i6 r13 = observableWorkerFactory$LogExceptionsWorker.A01;
                String A0k2 = AnonymousClass000.A0k(observableWorkerFactory$LogExceptionsWorker.A00);
                AnonymousClass00C.A08(A0k2);
                r13.Bkl(A0k2, A0J2);
                return;
        }
    }
}
