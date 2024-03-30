package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.companiondevice.hosteddevicepairing.HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1OG  reason: invalid class name */
public class AnonymousClass1OG implements AnonymousClass192 {
    public static final long[] A0A = {300000, 3600000, 7200000};
    public final AnonymousClass1OH A00;
    public final C237819v A01;
    public final C19970wo A02;
    public final C19420v0 A03;
    public final C236419g A04;
    public final C20810yC A05;
    public final C19700wN A06;
    public final C19730wQ A07;
    public final AnonymousClass1OS A08;
    public final AnonymousClass19A A09;

    public static void A01(AnonymousClass1OG r13, long j, long j2, boolean z) {
        AnonymousClass1OG r10 = r13;
        AnonymousClass1OH r1 = r13.A00;
        C19420v0 r0 = r1.A01;
        long j3 = j;
        try {
            C172898Pp A032 = r1.A03(r1.A02(C52772q9.E2EE, r0.A04(), r0.A03(), j));
            if (A032 != null) {
                C76723pL r9 = new C76723pL(r10, r10.A09, j3, j2, z);
                AnonymousClass19A r102 = r9.A01;
                String A092 = r102.A09();
                r102.A0E(r9, new C203399nx(new C203399nx("key-index-list", A032.A0o(), new AnonymousClass1AL[]{new AnonymousClass1AL("ts", r9.A00)}), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "md"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set")}), A092, 268, 32000);
                return;
            }
        } catch (Exception e) {
            Log.e("CompanionDeviceAdvUtil/createADVSignedKeyIndexList ", e);
        }
        Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList fail to generate index list");
        r10.A05(-1);
    }

    public void A04() {
        if (this.A01.A00()) {
            A00(this);
            return;
        }
        long A012 = this.A00.A01();
        if (A012 != -1) {
            A01(this, A012, C19970wo.A00(this.A02), false);
            return;
        }
        Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList/fail to generate ts");
        A05(-1);
    }

    public /* synthetic */ void BUx(C63133Iw r1) {
    }

    public /* synthetic */ void BVT(C63133Iw r1) {
    }

    public /* synthetic */ void BVW(C63133Iw r1) {
    }

    public /* synthetic */ void BVX(C20760y7 r1, int i) {
    }

    public /* synthetic */ void BVZ(C63133Iw r1) {
    }

    public /* synthetic */ void BVb(AnonymousClass3SB r1) {
    }

    public static void A00(AnonymousClass1OG r6) {
        AnonymousClass1OS r4 = r6.A08;
        C107995Rt r62 = C107995Rt.UNPAIRING;
        C82133yC r5 = C82133yC.A00;
        synchronized (r4) {
            C007403e r0 = r4.A00;
            if (r0 == null || !r0.BL7()) {
                AnonymousClass1OQ r02 = r4.A02;
                C23931Ak of = C23931Ak.of(r02.A00, r02.A02, r02.A01);
                AnonymousClass00C.A08(of);
                AnonymousClass040 r3 = r4.A03;
                HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1 hostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1 = new HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1(of, r62, (C023509x) null, r5);
                r4.A00 = AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, hostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1, r3);
            }
        }
    }

    public static boolean A02(AnonymousClass1OG r3) {
        if (C20800yB.A00(C21000yV.A02, r3.A05, 477) == 0 || ((!(!r3.A04.A09().isEmpty()) && !r3.A01.A00()) || r3.A07.A0L())) {
            return false;
        }
        return true;
    }

    public void A05(int i) {
        long A002 = C19970wo.A00(this.A02);
        AnonymousClass1OH r4 = this.A00;
        C19420v0 r3 = r4.A01;
        C19420v0.A00(r3).putLong("adv_key_index_list_last_failure_time", A002).apply();
        C19420v0.A00(r3).remove("adv_key_index_list_require_update").apply();
        int i2 = ((SharedPreferences) r3.A00.get()).getInt("adv_key_index_list_update_retry_count", 0) + 1;
        C19420v0.A00(r3).putInt("adv_key_index_list_update_retry_count", i2).apply();
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceKeyIndexListUpdateHandler/onError code=");
        sb.append(i);
        sb.append("; retryCount=");
        sb.append(i2);
        Log.e(sb.toString());
        if (i2 > 5) {
            Log.e("DeviceKeyIndexListUpdateHandler/onError logout all devices");
            this.A06.A0E("adv-key-index-list-update", "key index list update fails for more than 5 times", true);
            r4.A04();
        }
    }

    public AnonymousClass1OG(C19700wN r1, C19730wQ r2, AnonymousClass1OH r3, C237819v r4, AnonymousClass1OS r5, C19970wo r6, C19420v0 r7, C236419g r8, C20810yC r9, AnonymousClass19A r10) {
        this.A02 = r6;
        this.A05 = r9;
        this.A06 = r1;
        this.A07 = r2;
        this.A09 = r10;
        this.A03 = r7;
        this.A08 = r5;
        this.A04 = r8;
        this.A00 = r3;
        this.A01 = r4;
    }

    public void A03() {
        if (A02(this)) {
            AnonymousClass005 r4 = this.A03.A00;
            boolean z = ((SharedPreferences) r4.get()).getBoolean("adv_key_index_list_require_update", false);
            int i = ((SharedPreferences) r4.get()).getInt("adv_key_index_list_update_retry_count", 0);
            if (z || i > 0) {
                Log.i("DeviceKeyIndexListUpdateHandler/onDevicesLoadedOnScreen/updating");
                A04();
            }
        }
    }

    public void BVa(C20760y7 r2) {
        if (!r2.isEmpty() && A02(this)) {
            A04();
        }
    }
}
