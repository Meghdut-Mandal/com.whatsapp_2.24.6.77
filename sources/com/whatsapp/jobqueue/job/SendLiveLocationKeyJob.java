package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass143;
import X.AnonymousClass187;
import X.AnonymousClass189;
import X.AnonymousClass18I;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass1P5;
import X.AnonymousClass1PA;
import X.AnonymousClass1XT;
import X.AnonymousClass5q1;
import X.AnonymousClass630;
import X.AnonymousClass6EU;
import X.AnonymousClass6R2;
import X.AnonymousClass79X;
import X.AnonymousClass7i8;
import X.AnonymousClass8N4;
import X.AnonymousClass8NN;
import X.AnonymousClass8PE;
import X.AnonymousClass8SX;
import X.AnonymousClass9Q7;
import X.AnonymousClass9YT;
import X.C110545aq;
import X.C125305zh;
import X.C132906Vt;
import X.C133256Xm;
import X.C163737qg;
import X.C163757qi;
import X.C177518dv;
import X.C18740tg;
import X.C18800tq;
import X.C19730wQ;
import X.C19970wo;
import X.C203399nx;
import X.C207209uj;
import X.C21674AUx;
import X.C223113u;
import X.C232417s;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.whispersystems.jobqueue.Job;

public final class SendLiveLocationKeyJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1XT A00;
    public transient AnonymousClass189 A01;
    public transient C19730wQ A02;
    public transient AnonymousClass187 A03;
    public transient AnonymousClass1P5 A04;
    public transient AnonymousClass1PA A05;
    public final ArrayList rawJids;
    public final Integer retryCount;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(com.whatsapp.jid.DeviceJid r3, byte[] r4, int r5) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            if (r4 == 0) goto L_0x0011
            int r0 = r4.length
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0011:
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r3)
            r1.A02(r0)
            if (r4 == 0) goto L_0x0023
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r3, r4)
            r1.A02(r0)
        L_0x0023:
            java.lang.String r0 = "SendLiveLocationKeyJob"
            r1.A00 = r0
            X.AnonymousClass673.A00(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            if (r5 < 0) goto L_0x0049
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r2.rawJids = r1
            com.whatsapp.jid.UserJid r0 = r3.userJid
            java.lang.String r0 = r0.getRawString()
            r1.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.retryCount = r0
            return
        L_0x0049:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "retryCount cannot be negative"
            r1.append(r0)
            java.lang.String r0 = A01(r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(com.whatsapp.jid.DeviceJid, byte[], int):void");
    }

    public static AnonymousClass8SX A00(Jid jid, SendLiveLocationKeyJob sendLiveLocationKeyJob) {
        AnonymousClass6EU r2 = new AnonymousClass6EU(C133256Xm.A02(sendLiveLocationKeyJob.A04.A0L()), jid.getRawString());
        AnonymousClass189 r1 = sendLiveLocationKeyJob.A01;
        AnonymousClass79X A012 = AnonymousClass18I.A01(r1.A0K, r2);
        A012.lock();
        try {
            AnonymousClass5q1 r12 = new AnonymousClass5q1(new AnonymousClass9Q7(r1.A00.A02.A01).A00(AnonymousClass6R2.A02(r2)).A03, 0);
            A012.close();
            AnonymousClass8NN A0p = AnonymousClass8SX.DEFAULT_INSTANCE.A0p();
            AnonymousClass8PE r0 = ((AnonymousClass8SX) A0p.A00).fastRatchetKeySenderKeyDistributionMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8PE.DEFAULT_INSTANCE;
            }
            AnonymousClass8N4 r3 = (AnonymousClass8N4) r0.A0q();
            r3.A0V(jid.getRawString());
            byte[] bArr = r12.A01;
            C18740tg.A06(bArr);
            r3.A0U(C21674AUx.A01(bArr, 0, bArr.length));
            AnonymousClass8SX r13 = (AnonymousClass8SX) C90524aI.A0H(A0p);
            AnonymousClass8PE r02 = (AnonymousClass8PE) r3.A0R();
            r02.getClass();
            r13.fastRatchetKeySenderKeyDistributionMessage_ = r02;
            r13.bitField0_ |= 16384;
            return (AnonymousClass8SX) A0p.A0R();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0B() {
        ArrayList arrayList;
        AnonymousClass8SX r0;
        AnonymousClass630 r3;
        DeviceJid deviceJid;
        Integer num = this.retryCount;
        int i = 0;
        AnonymousClass1P5 r10 = this.A04;
        if (num != null) {
            UserJid A0l = C36431kI.A0l((String) this.rawJids.get(0));
            int intValue = this.retryCount.intValue();
            synchronized (r10.A0R) {
                if (!r10.A0g(A0l, intValue)) {
                    List emptyList = Collections.emptyList();
                    arrayList = emptyList;
                } else {
                    List singletonList = Collections.singletonList(A0l);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("LocationSharingManager/markParticipantsAsNeedSenderKey; jids.size");
                    C36321k7.A1Y(A0u, singletonList.size());
                    ArrayList A0I = AnonymousClass001.A0I();
                    AnonymousClass1P5.A06(r10);
                    Iterator it = singletonList.iterator();
                    while (it.hasNext()) {
                        UserJid A0o = C36441kJ.A0o(it);
                        if (!r10.A07.A0M(A0o)) {
                            HashSet hashSet = r10.A0S;
                            if (hashSet.contains(A0o)) {
                                hashSet.remove(A0o);
                                A0I.add(A0o);
                            }
                        }
                    }
                    r10.A0K.A09(A0I, false);
                    C232417s r02 = r10.A09;
                    r02.A00.A01(new C125305zh());
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("LocationSharingManager/markSendingLocationKeyRetry/marking; remote_resource=");
                    A0u2.append(A0l);
                    C36321k7.A1T("; retryCount=", A0u2, intValue);
                    r10.A0W.put(A0l, C90514aH.A0P(Long.valueOf(C19970wo.A00(r10.A0D)), intValue));
                    C36421kH.A1M(A0l, r10.A0Y, 1);
                    List singletonList2 = Collections.singletonList(A0l);
                    arrayList = singletonList2;
                }
            }
        } else {
            ArrayList A06 = AnonymousClass143.A06(UserJid.class, this.rawJids);
            synchronized (r10.A0R) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                ArrayList A0M = r10.A0M();
                Iterator it2 = A06.iterator();
                while (it2.hasNext()) {
                    UserJid A0o2 = C36441kJ.A0o(it2);
                    Map map = r10.A0Y;
                    Integer num2 = (Integer) map.get(A0o2);
                    if (A0M.contains(A0o2) && (num2 == null || num2.intValue() != 1)) {
                        A0I2.add(A0o2);
                        C36421kH.A1M(A0o2, map, 1);
                    }
                }
                arrayList = A0I2;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        StringBuilder A0u3 = AnonymousClass000.A0u();
        if (isEmpty) {
            A0u3.append("skip send live location key job; no one to send");
            C36321k7.A1a(A0u3, A01(this));
            return;
        }
        A0u3.append("run send live location key job");
        C36321k7.A1a(A0u3, A01(this));
        try {
            C177518dv r8 = C177518dv.A00;
            if (this.A01.A0X()) {
                r0 = A00(r8, this);
            } else {
                r0 = (AnonymousClass8SX) C90504aG.A0i(this.A03, new C163757qi(this, r8, 7));
            }
            HashMap A0J = AnonymousClass001.A0J();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                UserJid A0o3 = C36441kJ.A0o(it3);
                if (this.A01.A0X()) {
                    C223113u r32 = DeviceJid.Companion;
                    if (A0o3 != null) {
                        deviceJid = A0o3.getPrimaryDevice();
                    } else {
                        deviceJid = null;
                    }
                    r3 = C110545aq.A01(C133256Xm.A02(deviceJid), this.A01, r0.A0o());
                } else {
                    r3 = (AnonymousClass630) C90504aG.A0i(this.A03, new C163737qg(this, r0, A0o3, 1));
                }
                A0J.put(A0o3, r3);
            }
            AnonymousClass1PA r33 = this.A05;
            Integer num3 = this.retryCount;
            if (num3 != null) {
                i = num3.intValue();
            }
            AnonymousClass19A r7 = r33.A01;
            String A0A = r7.A0A();
            AnonymousClass9YT r03 = new AnonymousClass9YT();
            r03.A05 = "notification";
            r03.A08 = "location";
            r03.A02 = r8;
            r03.A07 = A0A;
            C207209uj A012 = r03.A01();
            AnonymousClass1AL[] r5 = new AnonymousClass1AL[3];
            boolean A1Y = C36371kC.A1Y(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0A, r5);
            r5[1] = new AnonymousClass1AL((Jid) r8, "to");
            C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location", r5);
            C203399nx[] r102 = new C203399nx[A0J.size()];
            Iterator A10 = C36371kC.A10(A0J);
            int i2 = 0;
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                AnonymousClass1AL[] r34 = new AnonymousClass1AL[1];
                C90504aG.A1E((Jid) A11.getKey(), "jid", r34, A1Y ? 1 : 0);
                r102[i2] = new C203399nx(C132906Vt.A00((AnonymousClass630) A11.getValue(), i), "to", r34);
                i2++;
            }
            r7.A07(new C203399nx(new C203399nx("participants", (AnonymousClass1AL[]) null, r102), "notification", r5), A012, 123).get();
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("sent location key distribution notifications");
            C36321k7.A1a(A0u4, A01(this));
            AnonymousClass1P5 r72 = this.A04;
            StringBuilder A0u5 = AnonymousClass000.A0u();
            A0u5.append("LocationSharingManager/markSentLocationKey; jids.size=");
            C36321k7.A1Y(A0u5, arrayList.size());
            ArrayList A0I3 = AnonymousClass001.A0I();
            synchronized (r72.A0R) {
                AnonymousClass1P5.A06(r72);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    UserJid A0o4 = C36441kJ.A0o(it4);
                    if (!r72.A07.A0M(A0o4)) {
                        HashSet hashSet2 = r72.A0S;
                        if (!hashSet2.contains(A0o4)) {
                            Map map2 = r72.A0Y;
                            Integer num4 = (Integer) map2.get(A0o4);
                            if (num4 != null && num4.intValue() == 1) {
                                hashSet2.add(A0o4);
                                A0I3.add(A0o4);
                                map2.remove(A0o4);
                            }
                        }
                    }
                }
                r72.A0K.A09(A0I3, true);
                if (r72.A0d()) {
                    r72.A0T();
                }
            }
            C232417s r04 = r72.A09;
            r04.A00.A01(new C125305zh());
        } catch (Exception e) {
            AnonymousClass1P5 r4 = this.A04;
            synchronized (r4.A0R) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    r4.A0Y.remove(C36441kJ.A0o(it5));
                }
                throw e;
            }
        }
    }

    public static String A01(SendLiveLocationKeyJob sendLiveLocationKeyJob) {
        StringBuilder A0k = C90464aC.A0k(sendLiveLocationKeyJob);
        A0k.append("; jids.size()=");
        A0k.append(sendLiveLocationKeyJob.rawJids.size());
        A0k.append("; retryCount=");
        return AnonymousClass000.A0o(sendLiveLocationKeyJob.retryCount, A0k);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ArrayList arrayList = this.rawJids;
        if (arrayList == null || arrayList.isEmpty()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("jids must not be empty");
            throw C90464aC.A0N(A01(this), A0u);
        }
        Integer num = this.retryCount;
        if (num != null && num.intValue() < 0) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("retryCount cannot be negative");
            throw C90464aC.A0N(A01(this), A0u2);
        }
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A02 = C36351kA.A0N(A0I);
        this.A03 = (AnonymousClass187) A0I.A7n.get();
        this.A01 = A0I.AzT();
        this.A05 = (AnonymousClass1PA) A0I.A4X.get();
        this.A00 = (AnonymousClass1XT) A0I.A6b.get();
        this.A04 = C36411kG.A0l(A0I);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(java.util.List r5) {
        /*
            r4 = this;
            X.673 r3 = new X.673
            r3.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r2)
            if (r1 == 0) goto L_0x0009
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r1 = r1.getPrimaryDevice()
            X.C18740tg.A06(r1)
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r3.A02(r0)
            goto L_0x0009
        L_0x0027:
            java.lang.String r0 = "SendLiveLocationKeyJob"
            r3.A00 = r0
            X.AnonymousClass673.A00(r3)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A01()
            r4.<init>(r0)
            java.lang.String r0 = ""
            X.C18740tg.A09(r0, r5)
            java.util.ArrayList r0 = X.AnonymousClass143.A07(r5)
            r4.rawJids = r0
            r0 = 0
            r4.retryCount = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(java.util.List):void");
    }
}
