package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: X.3Sv  reason: invalid class name and case insensitive filesystem */
public class C65623Sv {
    public C63133Iw A00;
    public C76833pW A01;
    public final C19700wN A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass1OH A04;
    public final AnonymousClass3CL A05 = new AnonymousClass3CL(this);
    public final AnonymousClass1OS A06;
    public final C25921Ie A07;
    public final C25931If A08;
    public final AnonymousClass196 A09;
    public final AnonymousClass1AB A0A;
    public final C19970wo A0B;
    public final C236419g A0C;
    public final C88884Uk A0D;
    public final C31581c3 A0E;
    public final C19770wU A0F;
    public final C237819v A0G;
    public final C19420v0 A0H;
    public final AnonymousClass19A A0I;

    public static void A00(C65623Sv r1) {
        C76833pW r12 = r1.A01;
        if (r12 != null) {
            r12.A03 = false;
        }
    }

    public static void A01(C65623Sv r17, C608439o r18, C52772q9 r19, long j, boolean z) {
        Throwable th;
        byte[] bArr;
        C65623Sv r13 = r17;
        C19420v0 r0 = r13.A0H;
        int A042 = r0.A04();
        int A032 = r0.A03();
        AnonymousClass1OH r5 = r13.A04;
        C608439o r15 = r18;
        C52772q9 r8 = r15.A01;
        AnonymousClass8NN A0p = AnonymousClass8R5.DEFAULT_INSTANCE.A0p();
        A0p.A0S();
        AnonymousClass8R5 r1 = (AnonymousClass8R5) A0p.A00;
        r1.bitField0_ |= 1;
        r1.rawId_ = A042;
        A0p.A0S();
        AnonymousClass8R5 r12 = (AnonymousClass8R5) A0p.A00;
        r12.bitField0_ |= 4;
        r12.keyIndex_ = A032;
        A0p.A0S();
        AnonymousClass8R5 r14 = (AnonymousClass8R5) A0p.A00;
        r14.bitField0_ |= 2;
        r14.timestamp_ = j;
        C52772q9 r10 = C52772q9.HOSTED;
        A0p.A0S();
        AnonymousClass8R5 r16 = (AnonymousClass8R5) A0p.A00;
        r16.deviceType_ = r8.value;
        r16.bitField0_ |= 16;
        A0p.A0S();
        AnonymousClass8R5 r110 = (AnonymousClass8R5) A0p.A00;
        C52772q9 r142 = r19;
        r110.accountType_ = r142.value;
        r110.bitField0_ |= 8;
        AnonymousClass8R5 r111 = (AnonymousClass8R5) A0p.A0R();
        try {
            AnonymousClass3FZ r02 = r15.A00;
            C18740tg.A06(r02);
            byte[] bArr2 = r02.A00.A01;
            AnonymousClass34P A002 = AnonymousClass1OH.A00(r5);
            C18740tg.A06(A002);
            AnonymousClass66J r11 = A002.A00;
            AnonymousClass3IG r122 = A002.A01.A00;
            byte[] bArr3 = C19430v1.A0F;
            C52772q9 A003 = C52772q9.A00(r111.deviceType_);
            if (A003 == null || A003 != r10) {
                byte[][] bArr4 = new byte[3][];
                AnonymousClass000.A19(bArr3, r111.A0o(), bArr2, bArr4);
                byte[] A052 = C203239na.A05(bArr4);
                C171038Il r82 = (C171038Il) C173028Qc.DEFAULT_INSTANCE.A0p();
                AnonymousClass8I5 A0l = r111.A0l();
                r82.A0S();
                C173028Qc r112 = (C173028Qc) r82.A00;
                r112.bitField0_ |= 1;
                r112.details_ = A0l;
                byte[] bArr5 = r122.A01;
                AnonymousClass8I5 A012 = C21674AUx.A01(bArr5, 0, bArr5.length);
                r82.A0S();
                C173028Qc r113 = (C173028Qc) r82.A00;
                r113.bitField0_ |= 2;
                r113.accountSignatureKey_ = A012;
                byte[] A082 = C133256Xm.A08(r11, A052);
                AnonymousClass8I5 A013 = C21674AUx.A01(A082, 0, A082.length);
                r82.A0S();
                C173028Qc r114 = (C173028Qc) r82.A00;
                r114.bitField0_ |= 4;
                r114.accountSignature_ = A013;
                C173028Qc r83 = (C173028Qc) r82.A0R();
                byte[] bArr6 = r15.A04;
                C18740tg.A06(bArr6);
                if (r142 == r10) {
                    bArr = C203239na.A05(C19430v1.A0G, r83.A0o());
                } else {
                    bArr = r83.A0o();
                }
                try {
                    byte[] A004 = C110525ao.A00(bArr, bArr6);
                    C171048Im r2 = (C171048Im) C172888Po.DEFAULT_INSTANCE.A0p();
                    AnonymousClass8I5 A0l2 = r83.A0l();
                    r2.A0S();
                    C172888Po r115 = (C172888Po) r2.A00;
                    r115.bitField0_ |= 1;
                    r115.details_ = A0l2;
                    AnonymousClass8I5 A014 = C21674AUx.A01(A004, 0, A004.length);
                    r2.A0S();
                    C172888Po r116 = (C172888Po) r2.A00;
                    r116.bitField0_ |= 2;
                    r116.hmac_ = A014;
                    r2.A0S();
                    C172888Po r117 = (C172888Po) r2.A00;
                    r117.accountType_ = r142.value;
                    r117.bitField0_ |= 4;
                    AnonymousClass8RP A022 = r5.A02(r142, A042, A032, j);
                    r13.A03.A0H(new AnonymousClass740(r13, r142, r15, A022, (C172888Po) r2.A0R(), r5.A03(A022), 0, z));
                } catch (Exception e) {
                    th = new RuntimeException("Failed to calculate hmac-sha256", e);
                }
            } else {
                th = AnonymousClass001.A08("doesn't support pairing hosted device with e2ee account");
                throw th;
            }
        } catch (Exception e2) {
            Log.e("CompanionDeviceQrHandler/handleQrCode", e2);
            if ((e2 instanceof ExecutionException) || (e2 instanceof InterruptedException) || (e2 instanceof IllegalArgumentException)) {
                C81093wS.A00(r13.A03, r13, 33);
                return;
            }
            throw new RuntimeException("Failed to generate adv protobufs", e2);
        }
    }

    public static void A02(C65623Sv r11, C608439o r12, C52772q9 r13, AnonymousClass8RP r14, C172888Po r15, C172898Pp r16, boolean z) {
        long j;
        C76833pW r9 = r11.A01;
        if (r9 == null) {
            Log.e("CompanionDeviceQrHandler/No devicePairRequestProtocolHelper created");
            return;
        }
        AnonymousClass19A r8 = r9.A07;
        String A092 = r8.A09();
        r9.A01 = r13;
        r9.A00 = r12;
        r9.A02 = r14;
        r9.A04 = z;
        String str = r12.A03;
        byte[] bArr = r12.A05;
        if (r14 != null) {
            j = r14.timestamp_;
        } else {
            j = -1;
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        A0I2.add(new C203399nx("ref", str, (AnonymousClass1AL[]) null));
        A0I2.add(new C203399nx("pub-key", bArr, (AnonymousClass1AL[]) null));
        if (!(r15 == null || r16 == null)) {
            A0I2.add(new C203399nx("device-identity", r15.A0o(), (AnonymousClass1AL[]) null));
            A0I2.add(new C203399nx("key-index-list", r16.A0o(), new AnonymousClass1AL[]{new AnonymousClass1AL("ts", j)}));
        }
        AnonymousClass1AL[] r4 = new AnonymousClass1AL[4];
        r4[0] = new AnonymousClass1AL((Jid) C177588e2.A00, "to");
        r4[1] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092);
        C36351kA.A1N("xmlns", "md", r4);
        C36361kB.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r4);
        r8.A0E(r9, C36391kE.A0m(new C203399nx("pair-device", new AnonymousClass1AL[0], (C203399nx[]) A0I2.toArray(new C203399nx[0])), r4), A092, 219, 32000);
    }

    public void A04() {
        AnonymousClass3M6 r1 = (AnonymousClass3M6) this.A0D;
        if (r1.A01 != 0) {
            Log.i("QrScannerActivity/onDevicePairingRequested");
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) r1.A00;
            devicePairQrScannerActivity.Bu1(R.string.f12nameremoved);
            Runnable runnable = devicePairQrScannerActivity.A0G;
            if (runnable != null) {
                devicePairQrScannerActivity.A00.removeCallbacks(runnable);
            }
            View view = devicePairQrScannerActivity.A00;
            Runnable runnable2 = devicePairQrScannerActivity.A0G;
            if (runnable2 == null) {
                runnable2 = new C81133wW((Object) devicePairQrScannerActivity, 31);
                devicePairQrScannerActivity.A0G = runnable2;
            }
            view.postDelayed(runnable2, DevicePairQrScannerActivity.A0M);
            devicePairQrScannerActivity.A0F.A00(0);
        } else {
            Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onDevicePairingRequested");
        }
        C19970wo r4 = this.A0B;
        AnonymousClass17Y r2 = this.A03;
        this.A01 = new C76833pW(this.A02, r2, this.A05, r4, this.A0I);
    }

    public void A05(C608439o r6) {
        if (this.A04.A01() == -1) {
            Log.e("CompanionDeviceQrHandler/startPairDevice invalid local ts");
            this.A0D.BZH();
            return;
        }
        A04();
        C80263v7.A00(this.A0F, this, r6, 29);
    }

    public C65623Sv(C19700wN r2, AnonymousClass17Y r3, AnonymousClass1OH r4, C237819v r5, AnonymousClass1OS r6, C25921Ie r7, C25931If r8, AnonymousClass196 r9, AnonymousClass1AB r10, C19970wo r11, C19420v0 r12, C236419g r13, AnonymousClass19A r14, C88884Uk r15, C31581c3 r16, C19770wU r17) {
        this.A0B = r11;
        this.A03 = r3;
        this.A02 = r2;
        this.A0F = r17;
        this.A09 = r9;
        this.A0I = r14;
        this.A0D = r15;
        this.A0A = r10;
        this.A0H = r12;
        this.A0C = r13;
        this.A04 = r4;
        this.A07 = r7;
        this.A08 = r8;
        this.A0G = r5;
        this.A06 = r6;
        this.A0E = r16;
    }

    public void A03() {
        A00(this);
        C236419g r2 = this.A0C;
        synchronized (r2.A0N) {
            r2.A01 = null;
        }
    }
}
