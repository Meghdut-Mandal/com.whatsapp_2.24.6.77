package X;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1CH  reason: invalid class name */
public class AnonymousClass1CH {
    public boolean A00 = false;
    public final C19730wQ A01;
    public final AnonymousClass19J A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass17X A04;
    public final C20810yC A05;
    public final C230717b A06;
    public final C20510xg A07;
    public final AnonymousClass19A A08;
    public final C19770wU A09;
    public final Set A0A = new HashSet();
    public final Set A0B = new HashSet();
    public final C19420v0 A0C;
    public final C220412q A0D;
    public final C21010yW A0E;

    public static void A00(AnonymousClass1CH r4) {
        if (!r4.A00) {
            r4.A00 = true;
            r4.A0B.addAll(((SharedPreferences) r4.A0C.A00.get()).getStringSet("group_ack_unsent_gjids", new HashSet()));
        }
    }

    public static void A01(AnonymousClass1CH r2) {
        C19420v0 r0 = r2.A0C;
        C19420v0.A00(r0).putStringSet("group_ack_unsent_gjids", r2.A0B).apply();
    }

    public void A02(C595434i r19, GroupJid groupJid, int i) {
        C595434i r5 = r19;
        GroupJid groupJid2 = groupJid;
        int i2 = i;
        if (i > 0) {
            AnonymousClass19J r6 = this.A02;
            if (r6.A04 != 2) {
                r6.registerObserver(new C68893cd(r5, this, groupJid2, i2));
                return;
            }
        } else if (i == 0 && r5.A01 == null) {
            r5.A01 = Boolean.valueOf(this.A01.A0M(this.A03.A0G(groupJid2)));
        }
        AnonymousClass2QI r62 = new AnonymousClass2QI();
        r62.A01 = 1;
        r62.A02 = Integer.valueOf(r5.A00);
        r62.A00 = r5.A01;
        r62.A03 = Long.valueOf((long) i2);
        this.A0E.Bly(r62);
        if (i <= 0 || A03(groupJid2)) {
            AnonymousClass19A r10 = this.A08;
            String A092 = r10.A09();
            String rawString = groupJid2.getRawString();
            C203399nx r12 = new C203399nx(new C203399nx("ack", (AnonymousClass1AL[]) null), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1AL("to", rawString)});
            ConditionVariable conditionVariable = C18740tg.A00;
            AnonymousClass777 r7 = new AnonymousClass777();
            if (!AnonymousClass19A.A04(r10, new BAY(r7, 1), r12, A092, 388, 32000, false)) {
                r7.BVM(new IOException("connection layer not ready yet"));
            }
            try {
                C203399nx r63 = (C203399nx) r7.get();
                if (!"result".equals(r63.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
                    int A002 = AnonymousClass3ME.A00(r63);
                    StringBuilder sb = new StringBuilder();
                    sb.append("AcknowledgeGroupHelper got error ");
                    sb.append(A002);
                    sb.append(" sending IQ for ");
                    sb.append(groupJid2);
                    Log.w(sb.toString());
                    if (A002 >= 400 && A002 < 500) {
                    }
                    if (i2 >= 7) {
                        Set set = this.A0A;
                        synchronized (set) {
                            set.remove(groupJid2.getRawString());
                        }
                        return;
                    }
                    this.A09.BpM(new C35341iX(this, groupJid2, r5, i2, 7), "AcknowledgeGroupHelper.sendIqWithRetries", (long) (2500 << i));
                    return;
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AcknowledgeGroupHelper failed sending IQ for ");
                sb2.append(groupJid2);
                Log.w(sb2.toString(), e);
            }
        }
        Set set2 = this.A0A;
        synchronized (set2) {
            set2.remove(groupJid2.getRawString());
        }
        Set set3 = this.A0B;
        synchronized (set3) {
            A00(this);
            if (set3.remove(groupJid2.getRawString())) {
                A01(this);
            }
        }
    }

    public boolean A03(GroupJid groupJid) {
        int i;
        C65073Qp A092 = this.A0D.A09(groupJid, false);
        if (!this.A04.A0C(groupJid) || A092 == null) {
            return false;
        }
        synchronized (A092) {
            i = A092.A04;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public AnonymousClass1CH(C19730wQ r2, AnonymousClass19J r3, AnonymousClass16D r4, C19420v0 r5, C220412q r6, AnonymousClass17X r7, C20810yC r8, C21010yW r9, C230717b r10, C20510xg r11, AnonymousClass19A r12, C19770wU r13) {
        this.A05 = r8;
        this.A01 = r2;
        this.A09 = r13;
        this.A0D = r6;
        this.A0E = r9;
        this.A08 = r12;
        this.A06 = r10;
        this.A03 = r4;
        this.A02 = r3;
        this.A0C = r5;
        this.A07 = r11;
        this.A04 = r7;
    }
}
