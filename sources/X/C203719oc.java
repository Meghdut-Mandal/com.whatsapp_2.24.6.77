package X;

import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9oc  reason: invalid class name and case insensitive filesystem */
public abstract class C203719oc {
    public static final AnonymousClass1AL[] A00 = new AnonymousClass1AL[0];

    public static C203399nx A02(DeviceJid deviceJid, DeviceJid deviceJid2, String str, String str2, String str3) {
        C203399nx[] r4 = new C203399nx[1];
        AnonymousClass1AL[] r1 = new AnonymousClass1AL[2];
        boolean A1Y = C36371kC.A1Y("call-id", str2, r1);
        C90504aG.A1E(deviceJid2, "call-creator", r1, 1);
        C203399nx.A0H(str3, r1, r4, A1Y ? 1 : 0);
        AnonymousClass1AL[] r12 = new AnonymousClass1AL[2];
        C90504aG.A1E(deviceJid, "to", r12, A1Y);
        C36331k8.A1R(str, r12, 1);
        return C203399nx.A05("receipt", r12, r4);
    }

    public static C203399nx A03(DeviceJid deviceJid, DeviceJid deviceJid2, String str, String str2, String str3, byte[] bArr, byte b) {
        int i = 2;
        if (bArr == null) {
            i = 1;
        }
        C203399nx[] r2 = new C203399nx[i];
        int i2 = 3;
        AnonymousClass1AL[] r7 = new AnonymousClass1AL[3];
        boolean A1Y = C36371kC.A1Y("call-id", str2, r7);
        C90504aG.A1E(deviceJid2, "call-creator", r7, 1);
        C36341k9.A1L("count", String.valueOf(b), r7, 2);
        C203399nx.A0H("enc_rekey", r7, r2, A1Y ? 1 : 0);
        if (bArr != null) {
            C203399nx.A0G("registration", bArr, (AnonymousClass1AL[]) null, r2, 1);
        }
        if (str3 == null) {
            i2 = 2;
        }
        AnonymousClass1AL[] r1 = new AnonymousClass1AL[i2];
        C90504aG.A1E(deviceJid, "to", r1, A1Y);
        C36331k8.A1R(str, r1, 1);
        if (str3 != null) {
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3, r1, 2);
        }
        return C203399nx.A05("receipt", r1, r2);
    }

    public static C203399nx[] A07(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        C203399nx[] r4 = new C203399nx[length];
        for (int i = 0; i < length; i++) {
            AnonymousClass1AL[] r1 = new AnonymousClass1AL[1];
            C36331k8.A1R(strArr[i], r1, 0);
            C203399nx.A0H("item", r1, r4, i);
        }
        return new C203399nx[]{C203399nx.A05("list", (AnonymousClass1AL[]) null, r4)};
    }

    public static C203399nx A00(AnonymousClass11F r9, AnonymousClass11F r10, Integer num, String str, String str2, String str3, String str4) {
        boolean z = r10 instanceof C177538dx;
        AnonymousClass11F r7 = r9;
        if (z) {
            r7 = r10;
        }
        C18740tg.A06(r7);
        if (!z) {
            r9 = r10;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3, A0I);
        if (num != null) {
            C36381kD.A1M("reason", String.valueOf(num), A0I);
        }
        if (str2 != null) {
            C36381kD.A1M("sub-type", str2, A0I);
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        AnonymousClass1AL[] r8 = A00;
        C203399nx A04 = C203399nx.A04("error", (AnonymousClass1AL[]) A0I.toArray(r8));
        ArrayList A0I3 = AnonymousClass001.A0I();
        C165577te.A16(r7, "to", A0I3);
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A0I3);
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "error", A0I3);
        if (r9 != null) {
            C165577te.A16(r9, "participant", A0I3);
        }
        AnonymousClass1AL[] r3 = (AnonymousClass1AL[]) A0I3.toArray(r8);
        A0I2.add(A04);
        if (str4 != null) {
            AnonymousClass1AL[] A0k = C165617ti.A0k();
            C36341k9.A1L("reason", str4, A0k, 0);
            C203399nx.A0E("biz", A0I2, A0k);
        }
        return C203399nx.A05("receipt", r3, C165577te.A1b(A0I2, 0));
    }

    public static C203399nx A01(AnonymousClass11F r4, DeviceJid deviceJid, UserJid userJid, C64933Qa r7, String str, String[] strArr, int i) {
        Pair A06 = C203359nq.A06(deviceJid, r7.A00, r4);
        C203399nx[] A07 = A07(strArr);
        String str2 = r7.A01;
        Jid jid = (Jid) A06.second;
        ArrayList A0I = AnonymousClass001.A0I();
        C165577te.A16((Jid) A06.first, "to", A0I);
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2, A0I);
        if (str != null) {
            C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, A0I);
        }
        if (jid != null) {
            C165577te.A16(jid, "participant", A0I);
        }
        if (userJid != null) {
            C165577te.A16(userJid, "recipient", A0I);
        }
        if (i == 2) {
            C36381kD.A1M("privacy_token", "false", A0I);
        }
        return C203399nx.A05("receipt", (AnonymousClass1AL[]) A0I.toArray(A00), A07);
    }

    public static C203399nx A04(C194079Oa r19) {
        C194079Oa r6 = r19;
        Jid jid = r6.A05;
        String str = r6.A0B;
        Jid jid2 = r6.A06;
        UserJid userJid = r6.A07;
        int i = r6.A01;
        long j = r6.A04;
        byte[] bArr = r6.A0E;
        byte[] bArr2 = r6.A0D;
        byte b = r6.A00;
        C121865tq r1 = r6.A09;
        C121865tq r14 = r6.A08;
        byte[] bArr3 = r6.A0C;
        String str2 = r6.A0A;
        int i2 = r6.A02;
        Jid jid3 = jid2;
        if (!(jid2 instanceof C177538dx)) {
            jid3 = jid;
            jid = jid2;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        C165577te.A16(jid3, "to", A0I);
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A0I);
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "retry", A0I);
        if (jid != null) {
            C165577te.A16(jid, "participant", A0I);
        }
        if (userJid != null) {
            C165577te.A16(userJid, "recipient", A0I);
        }
        if (str2 != null) {
            C36381kD.A1M("category", str2, A0I);
        }
        AnonymousClass1AL[] r3 = A00;
        AnonymousClass1AL[] r5 = (AnonymousClass1AL[]) A0I.toArray(r3);
        ArrayList A0I2 = AnonymousClass001.A0I();
        ArrayList A0I3 = AnonymousClass001.A0I();
        C36381kD.A1M("v", "1", A0I3);
        C36381kD.A1M("count", String.valueOf(i), A0I3);
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A0I3);
        C36381kD.A1M("t", String.valueOf(C36391kE.A0B(j)), A0I3);
        C165587tf.A1N("error", A0I3, i2);
        C203399nx.A0E("retry", A0I2, (AnonymousClass1AL[]) A0I3.toArray(r3));
        C203399nx.A0D("registration", A0I2, bArr, (AnonymousClass1AL[]) null);
        if (!(bArr2 == null || r1 == null || r14 == null)) {
            C203399nx[] r32 = new C203399nx[3];
            C203399nx.A0G(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r1.A01, (AnonymousClass1AL[]) null, r32, 0);
            r32[1] = new C203399nx("value", r1.A00, (AnonymousClass1AL[]) null);
            r32[2] = new C203399nx(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, r1.A02, (AnonymousClass1AL[]) null);
            C203399nx A05 = C203399nx.A05("skey", (AnonymousClass1AL[]) null, r32);
            C203399nx[] r12 = new C203399nx[2];
            C203399nx.A0G(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14.A01, (AnonymousClass1AL[]) null, r12, 0);
            C203399nx.A0G("value", r14.A00, (AnonymousClass1AL[]) null, r12, 1);
            C203399nx A052 = C203399nx.A05("key", (AnonymousClass1AL[]) null, r12);
            ArrayList A0I4 = AnonymousClass001.A0I();
            C203399nx.A0D("identity", A0I4, bArr2, (AnonymousClass1AL[]) null);
            C203399nx.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0I4, new byte[]{b}, (AnonymousClass1AL[]) null);
            A0I4.add(A052);
            A0I4.add(A05);
            if (bArr3 != null) {
                C203399nx.A0D("device-identity", A0I4, bArr3, (AnonymousClass1AL[]) null);
            }
            C203399nx.A0F("keys", A0I2, (AnonymousClass1AL[]) null, C165577te.A1b(A0I4, 0));
        }
        return C203399nx.A05("receipt", r5, C165577te.A1b(A0I2, 0));
    }

    public static C203399nx A05(AnonymousClass3T1 r8, int i) {
        String str;
        UserJid userJid;
        boolean z = r8.A1Y;
        if (z) {
            str = "sender";
        } else if (r8 instanceof C22992Azi) {
            str = ((C22992Azi) r8).BE6();
        } else {
            str = null;
        }
        C64933Qa r5 = r8.A1J;
        AnonymousClass11F A0J = r8.A0J();
        if (z) {
            AnonymousClass11F r1 = r5.A00;
            if (!(r1 instanceof AnonymousClass144)) {
                userJid = C36401kF.A0b(r1);
                return A01(A0J, r8.A1T, userJid, r5, str, (String[]) null, i);
            }
        }
        userJid = null;
        return A01(A0J, r8.A1T, userJid, r5, str, (String[]) null, i);
    }

    public static C203399nx A06(C203399nx r7, C207209uj r8) {
        String str;
        Jid jid = r8.A02;
        String str2 = r8.A05;
        if (!"receipt".equals(str2) || !"delivery".equals(r8.A08)) {
            str = r8.A08;
        } else {
            str = null;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        String str3 = r8.A07;
        if (str3 != null) {
            C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, A0I);
        } else {
            C18740tg.A0D(false, "received stanza with null id");
        }
        if (jid != null) {
            C165577te.A16(jid, "to", A0I);
        } else {
            ConditionVariable conditionVariable = C18740tg.A00;
        }
        if (str2 != null) {
            C36381kD.A1M("class", str2, A0I);
        } else {
            C18740tg.A0D(false, "received stanza with null class");
        }
        if (str != null) {
            C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, A0I);
        }
        Jid jid2 = r8.A01;
        if (jid2 != null) {
            C165577te.A16(jid2, "participant", A0I);
        }
        UserJid userJid = r8.A03;
        if (userJid != null) {
            C165577te.A16(userJid, "recipient", A0I);
        }
        String str4 = r8.A06;
        if (!TextUtils.isEmpty(str4) && !"0".equals(str4)) {
            C36381kD.A1M("edit", str4, A0I);
        }
        List list = r8.A09;
        if (list != null) {
            A0I.addAll(list);
        }
        return C203399nx.A05("ack", C165577te.A1a(A0I, 0), r7 == null ? null : new C203399nx[]{r7});
    }
}
