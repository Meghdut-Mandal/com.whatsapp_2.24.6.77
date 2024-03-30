package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.0xH  reason: invalid class name and case insensitive filesystem */
public class C20260xH extends C19580wB implements AnonymousClass00M {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03;
    public C119545pz A04;
    public AnonymousClass34P A05;
    public DeviceJid A06;
    public UserJid A07;
    public C173028Qc A08;
    public Runnable A09;
    public Runnable A0A;
    public Runnable A0B;
    public Runnable A0C;
    public Runnable A0D;
    public String A0E;
    public byte[] A0F;
    public byte[] A0G;
    public final Handler A0H = new Handler(Looper.getMainLooper());
    public final AnonymousClass130 A0I;
    public final C19730wQ A0J;
    public final AnonymousClass1WQ A0K;
    public final AnonymousClass1RU A0L;
    public final C25901Ic A0M;
    public final AnonymousClass2ZE A0N;
    public final AnonymousClass1VR A0O;
    public final C221913g A0P;
    public final C27661Pe A0Q;
    public final C1256260q A0R;
    public final C19990wq A0S;
    public final C19980wp A0T;
    public final C21060yb A0U;
    public final C19970wo A0V;
    public final C19630wG A0W;
    public final C19420v0 A0X;
    public final AnonymousClass189 A0Y;
    public final AnonymousClass187 A0Z;
    public final C220612s A0a;
    public final C236419g A0b;
    public final AnonymousClass1AC A0c;
    public final C21520zN A0d;
    public final C20810yC A0e;
    public final C25781Hq A0f;
    public final AnonymousClass1C4 A0g;
    public final AnonymousClass1O8 A0h;
    public final AnonymousClass13I A0i;
    public final AnonymousClass1E9 A0j;
    public final C19770wU A0k;
    public final AnonymousClass005 A0l;
    public final AnonymousClass005 A0m;
    public final AnonymousClass005 A0n;
    public final List A0o = new ArrayList();
    public final AtomicReference A0p = new AtomicReference((Object) null);
    public final AnonymousClass1G9 A0q;
    public final C21100yf A0r;
    public final AnonymousClass196 A0s;
    public final C21010yW A0t;
    public final AnonymousClass19A A0u;

    public C20260xH(AnonymousClass130 r4, AnonymousClass1G9 r5, C19730wQ r6, C21100yf r7, AnonymousClass1WQ r8, AnonymousClass1RU r9, C25901Ic r10, AnonymousClass2ZE r11, AnonymousClass196 r12, AnonymousClass1VR r13, C221913g r14, C27661Pe r15, C19990wq r16, C19980wp r17, C21060yb r18, C19970wo r19, C19630wG r20, C19420v0 r21, AnonymousClass189 r22, AnonymousClass187 r23, C220612s r24, C236419g r25, AnonymousClass1AC r26, C21520zN r27, C20810yC r28, C25781Hq r29, C21010yW r30, AnonymousClass19A r31, AnonymousClass1C4 r32, AnonymousClass1O8 r33, AnonymousClass13I r34, AnonymousClass1E9 r35, C19770wU r36, AnonymousClass005 r37, AnonymousClass005 r38, AnonymousClass005 r39, AnonymousClass004 r40) {
        super(new C18910u1((Object) null, r40));
        this.A0V = r19;
        this.A0e = r28;
        this.A0J = r6;
        this.A0W = r20;
        this.A0k = r36;
        this.A0t = r30;
        this.A0g = r32;
        this.A0r = r7;
        this.A0s = r12;
        this.A0I = r4;
        this.A0i = r34;
        this.A0K = r8;
        AnonymousClass19A r1 = r31;
        this.A0u = r1;
        this.A0n = r37;
        this.A0Z = r23;
        this.A0U = r18;
        this.A0L = r9;
        this.A0d = r27;
        this.A0Y = r22;
        this.A0l = r39;
        this.A0h = r33;
        this.A0c = r26;
        this.A0j = r35;
        this.A0X = r21;
        this.A0S = r16;
        this.A0b = r25;
        this.A0M = r10;
        this.A0N = r11;
        this.A0O = r13;
        this.A0a = r24;
        this.A0Q = r15;
        this.A0m = r38;
        this.A0T = r17;
        this.A0P = r14;
        this.A0f = r29;
        this.A0q = r5;
        this.A0R = new C1256260q(r1);
    }

    public static synchronized void A02(C20260xH r2) {
        synchronized (r2) {
            Runnable runnable = r2.A0A;
            if (runnable != null) {
                r2.A0k.Bnx(runnable);
            }
            r2.A01 = 0;
            r2.A04 = null;
            r2.A0E = null;
            r2.A0p.set((Object) null);
            r2.A0G = null;
        }
    }

    public synchronized void A04() {
        Log.i("companion/registration/cancelling link code registration");
        ((C20720y3) this.A0n.get()).A0G(false, 16);
        A02(this);
        this.A0P.A01(0);
    }

    public synchronized void A05() {
        C221913g r1 = this.A0P;
        if (r1.A02()) {
            r1.A01(0);
            A01(this);
            Runnable runnable = this.A0D;
            if (runnable != null) {
                this.A0k.Bnx(runnable);
            }
            Runnable runnable2 = this.A0C;
            if (runnable2 != null) {
                this.A0k.Bnx(runnable2);
            }
            Runnable runnable3 = this.A09;
            if (runnable3 != null) {
                this.A0k.Bnx(runnable3);
            }
            ((C20720y3) this.A0n.get()).A0G(false, 16);
            this.A06 = null;
            this.A0F = null;
            this.A02 = -1;
            this.A00 = -1;
            this.A03 = 0;
            this.A07 = null;
            this.A04 = null;
            this.A0E = null;
            this.A0p.set((Object) null);
            this.A0G = null;
            for (AnonymousClass3LD A022 : getObservers()) {
                A022.A02();
            }
        }
    }

    public synchronized void A08(UserJid userJid, boolean z) {
        Log.i("companion/registration/link-code/start");
        int i = 10;
        if (z) {
            i = 14;
        }
        this.A0P.A01(i);
        this.A07 = userJid;
        A00(this);
    }

    public synchronized void A09(String str, boolean z, boolean z2) {
        String str2;
        this.A0t.Bph(true);
        AnonymousClass1RU r4 = this.A0L;
        Log.i("AccountSwitcher/updateLoggedOutCompanionAccountSharedPrefs");
        C19730wQ r3 = r4.A05;
        r3.A0G();
        if (r3.A0E != null) {
            C19420v0 r1 = r4.A09;
            r3.A0G();
            AnonymousClass142 r0 = r3.A0E;
            if (r0 != null) {
                C19420v0.A00(r1).putString("account_switching_logged_out_phone_number", AnonymousClass3U8.A03(r0)).apply();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            Log.e("AccountSwitcher/updateLoggedOutCompanionAccountSharedPrefs/meContact is null");
        }
        if (r3.A08() != null) {
            C19420v0 r12 = r4.A09;
            C223313w A082 = r3.A08();
            if (A082 != null) {
                str2 = A082.getRawString();
            } else {
                str2 = null;
            }
            C19420v0.A00(r12).putString("account_switching_logged_out_lid", str2).apply();
        } else {
            Log.e("AccountSwitcher/updateLoggedOutCompanionAccountSharedPrefs/myLid is null");
        }
        if (z) {
            C79593ty r5 = new C79593ty();
            r5.A0A(new C79493to(this, str, z2));
            C53762rq r13 = new C53762rq(r5, this, 1);
            this.A0M.registerObserver(r13);
            r5.A0A(new C76183oS(r13, this, 1));
            AnonymousClass196 r2 = this.A0s;
            C18740tg.A0C(r2.A06.A0L());
            AnonymousClass8YD r14 = (AnonymousClass8YD) r2.A0T.A00("sentinel");
            if (r14 != null) {
                C18740tg.A0C(r14.A00.A0L());
                r2.A0M(AnonymousClass8YD.A00(r14, false));
                r2.A0G();
            }
            this.A0k.BpM(new C35671j4(r5, 36), "CompanionRegistrationManager/deregister", TimeUnit.SECONDS.toMillis((long) this.A0r.A04(C21100yf.A1Z)));
        } else {
            this.A0H.post(new C35231iM(1, (Object) this, z2));
        }
    }

    public static void A00(C20260xH r5) {
        C121865tq r0;
        AnonymousClass34P r1;
        int intValue;
        try {
            AnonymousClass189 r4 = r5.A0Y;
            if (r4.A0X()) {
                r0 = r4.A0G();
            } else {
                AnonymousClass187 r2 = r5.A0Z;
                Objects.requireNonNull(r4);
                r0 = (C121865tq) r2.A00.submit(new C163717qe(r4, 0)).get();
            }
            if (r4.A0X()) {
                r1 = r4.A00.A04();
            } else {
                AnonymousClass187 r3 = r5.A0Z;
                Objects.requireNonNull(r4);
                r1 = (AnonymousClass34P) r3.A00.submit(new AnonymousClass4YJ(r4, 1)).get();
            }
            r5.A05 = r1;
            if (r4.A0X()) {
                intValue = r4.A07.A03();
            } else {
                AnonymousClass187 r32 = r5.A0Z;
                Objects.requireNonNull(r4);
                intValue = ((Number) r32.A00.submit(new C163717qe(r4, 1)).get()).intValue();
            }
            ((C20720y3) r5.A0n.get()).A0E(new AnonymousClass1VM(r0, r5.A05.A01.A00.A01, C203239na.A02(intValue)));
            ((C195079Sk) r5.A0m.get()).A00();
            ((C195009Sc) r5.A0l.get()).A00();
        } catch (InterruptedException | ExecutionException unused) {
            Log.e("companion/registration/failed to load keys for sending");
            r5.A05();
        }
    }

    public static void A01(C20260xH r4) {
        Runnable runnable = r4.A0B;
        if (runnable != null) {
            r4.A0k.Bnx(runnable);
        }
        Runnable runnable2 = r4.A0A;
        if (runnable2 != null) {
            r4.A0k.Bnx(runnable2);
        }
        List<Runnable> list = r4.A0o;
        for (Runnable Bnx : list) {
            r4.A0k.Bnx(Bnx);
        }
        list.clear();
    }

    public static synchronized void A03(C20260xH r25, boolean z) {
        String str;
        String str2;
        C20260xH r0 = r25;
        synchronized (r0) {
            Log.i("companion/registration/companion-hello/start");
            C221913g r3 = r0.A0P;
            int A002 = r3.A00();
            if (A002 == 10 || A002 == 14) {
                r3.A01(11);
                byte[] bArr = new byte[5];
                AnonymousClass136.A00().nextBytes(bArr);
                byte[] bArr2 = new byte[32];
                AnonymousClass136.A00().nextBytes(bArr2);
                byte[] bArr3 = new byte[16];
                AnonymousClass136.A00().nextBytes(bArr3);
                List list = C56182vs.A00;
                long j = 0;
                int i = 32;
                int i2 = 0;
                int i3 = 0;
                do {
                    j |= ((long) (bArr[i3] & 255)) << i;
                    i -= 8;
                    i3++;
                } while (i3 < 5);
                String str3 = "";
                do {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C56182vs.A00.get((int) (31 & j)));
                    sb.append(str3);
                    str3 = sb.toString();
                    j >>= 5;
                    i2++;
                } while (i2 < 8);
                if (str3 != null) {
                    r0.A0E = str3;
                    r0.A04 = C133256Xm.A00();
                    SecretKey A082 = C18750th.A08("PBKDF2WithHmacSHA256", bArr2, r0.A0E.toCharArray(), C132986Wc.A0F, 256);
                    try {
                        byte[] bArr4 = r0.A04.A01.A01;
                        Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
                        instance.init(1, A082, new IvParameterSpec(bArr3));
                        byte[] A052 = C203239na.A05(bArr2, bArr3, instance.doFinal(bArr4));
                        C27661Pe r6 = r0.A0Q;
                        r6.A00();
                        String A022 = r0.A0W.A02(R.string.f12nameremoved, Build.VERSION.RELEASE);
                        C1256260q r252 = r0.A0R;
                        UserJid userJid = r0.A07;
                        byte[] bArr5 = r0.A0I.A0E().A02.A01;
                        int ordinal = r6.A00().ordinal();
                        if (ordinal == 0) {
                            str = "e";
                        } else if (ordinal != 2) {
                            str = "d";
                        } else {
                            str = "f";
                        }
                        boolean z2 = false;
                        if (!z) {
                            z2 = true;
                        }
                        AnonymousClass413 r12 = new AnonymousClass413(r0, 6);
                        AnonymousClass413 r11 = new AnonymousClass413(r0, 5);
                        Log.i("companion/registration/send-link-code-companion-reg-companion-hello");
                        AnonymousClass19A r24 = r252.A00;
                        String A092 = r24.A09();
                        if (z2) {
                            str2 = "true";
                        } else {
                            str2 = "false";
                        }
                        ArrayList arrayList = C50652lG.A00;
                        C177588e2 r13 = C177588e2.A00;
                        byte[] bArr6 = new byte[0];
                        AnonymousClass6QB r10 = new AnonymousClass6QB("link_code_pairing_nonce");
                        C203539oF.A0I(bArr6, -9007199254740991L, 9007199254740991L);
                        r10.A01 = bArr6;
                        C203399nx A032 = r10.A03();
                        AnonymousClass6QB r4 = new AnonymousClass6QB("iq");
                        r4.A04(new AnonymousClass1AL("xmlns", "md"));
                        r4.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
                        r4.A04(new AnonymousClass1AL((Jid) r13, "to"));
                        if (C203539oF.A0P(A092, 0, 9007199254740991L, false)) {
                            r4.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092));
                        }
                        AnonymousClass6QB r32 = new AnonymousClass6QB("link_code_companion_reg");
                        r32.A04(new AnonymousClass1AL("stage", "companion_hello"));
                        if (C203539oF.A0N(userJid, "link_code_companion_reg->jid")) {
                            r32.A04(new AnonymousClass1AL((Jid) userJid, "jid"));
                        }
                        r32.A08(str2, "should_show_push_notification", C50652lG.A00);
                        r32.A05(A032);
                        AnonymousClass6QB r102 = new AnonymousClass6QB("link_code_pairing_wrapped_companion_ephemeral_pub");
                        C203539oF.A0I(A052, -9007199254740991L, 9007199254740991L);
                        r102.A01 = A052;
                        r32.A05(r102.A03());
                        AnonymousClass6QB r9 = new AnonymousClass6QB("companion_server_auth_key_pub");
                        C203539oF.A0I(bArr5, -9007199254740991L, 9007199254740991L);
                        r9.A01 = bArr5;
                        r32.A05(r9.A03());
                        AnonymousClass6QB r2 = new AnonymousClass6QB("companion_platform_id");
                        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
                            r2.A07(str);
                        }
                        r32.A05(r2.A03());
                        AnonymousClass6QB r22 = new AnonymousClass6QB("companion_platform_display");
                        if (C203539oF.A0P(A022, 0, 9007199254740991L, false)) {
                            r22.A07(A022);
                        }
                        r32.A05(r22.A03());
                        r4.A05(r32.A03());
                        r24.A0K(new C147716xf(r252, r12, r11), r4.A03(), A092, 364, 0);
                        String str4 = r0.A0E;
                        for (AnonymousClass3LD A042 : r0.getObservers()) {
                            A042.A04(str4);
                        }
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
                        Log.e("companion/registration/companion-hello/failed to encrypt companion ADV public key");
                    }
                } else {
                    Log.e("companion/registration/companion-hello/convert to base32 string failed");
                    r0.A05();
                }
            } else {
                Log.e("companion/registration/companion-hello/invalid state");
            }
        }
    }

    public /* bridge */ /* synthetic */ void A06(AnonymousClass3LD r1) {
        super.registerObserver(r1);
    }

    public /* bridge */ /* synthetic */ void A07(AnonymousClass3LD r1) {
        super.unregisterObserver(r1);
    }
}
